const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const userSchema = new Schema({
  name: {
    type: String,
    required: true
  },
  email: {
    type: String,
    required: true,
    unique: true
  },
  password: {
    type: String,
    required: true
  },
  createdAt: {
    type: Date,
    default: Date.now
  }
});

const conn = mongoose.createConnection('mongodb://localhost:27017/mydbnew');
const User = conn.model('user', userSchema);

const newUser = new User({
    name: 'John Doe',
    email: 'johndoe@user34.com',
    password: 'password12389',
    address:'Odisha'  
  });
 
    newUser.save()
  .then(() => console.log('User created'))
  .catch((err) => console.log(err));