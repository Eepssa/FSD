const express = require('express');
const router = express.Router();
const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/userdetails');
const db = mongoose.connection;

const userSchema = new mongoose.Schema({
  id: {type:Number, required:true},
  name: {type:String, required:true},
  email: {type:String, required:true, unique:true},
  age: {type:Number, required:true}
});

const User = mongoose.model('Users', userSchema);

router.get('/', async (req, res) => {
  try {
    const users = await User.find();
    res.json(users);
  } catch (err) {
    res.status(404).send("Error");
  }
});

router.get('/:id', getUserDetails, (req, res) => {
  res.json(res.user);
});

router.post('/', async (req, res) => {
  const user = new User({
    id: req.body.id,
    name: req.body.name,
    email: req.body.email,
    age: req.body.age
  });

  try {
    const newUser = await user.save();
    res.status(201).json(newUser);
  } catch (err) {
    res.status(404).send("Error");
  }
});

router.put('/:id', getUserDetails, async (req, res) => {
  if (req.body.name != null) {
    res.user.name = req.body.name;
  }
  if (req.body.email != null) {
    res.user.email = req.body.email;
  }
  if (req.body.age != null) {
    res.user.age = req.body.age;
  }
  try {
    const updatedUser = await res.user.save();
    res.json(updatedUser);
  } catch (err) {
    res.status(404).send("Error");
  }
});

router.delete('/:id', getUserDetails, async (req, res) => {
    try {
      await User.deleteOne({ id: res.user.id });
      res.send("User Deleted");
    } catch (err) {
      res.status(500).json({ message: err.message });
    }
  });


async function getUserDetails(req, res, next) {
  let user;
  try {
    user = await User.findOne({ id: req.params.id });
    if (user == null) {
      return res.status(404).send("Error");
    }
  } catch (err) {
    return res.status(404).send("Error");
  }
  res.user = user;
  next();
}

module.exports = router;
