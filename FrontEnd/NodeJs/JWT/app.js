const express = require("express");
const app= express();
const jwt = require('jsonwebtoken');

app.get("/download",(req,res)=>{

    res.download("d://db_prop.txt");

})

app.listen("3000",()=>{
    console.log("Server Started");
})

app.get("/login",(req,res)=>
{
    const user={id:2,email:"abc@gmail.com"};
    let token= generateAccessToken(user);
    res.end(token);

});

app.post("/dashboard",authenticateToken,(req,res)=>
{
     
   // console.log(req.user); 
    res.json(req.user);

});

function generateAccessToken(user) {
    const payload = {
      id: user.id,
      email: user.email
    };
    
    const secret = 'mysecretkey';
    const options = { expiresIn: '1h' };
  
    return jwt.sign(payload, secret, options);
  }

  function verifyAccessToken(token) {
    const secret = 'mysecretkey';
  
    try {
      const decoded = jwt.verify(token, secret);
      return { success: true, data: decoded };
    } catch (error) {
      return { success: false, error: error.message };
    }
  }

  function authenticateToken(req, res, next) {
   // const authHeader = req.headers['authorization'];
   const authHeader =req.headers.authorization;
   console.log(authHeader);
    const token = authHeader && authHeader.split(' ')[1];
    
    if (!token) {
      return res.sendStatus(401);
    }
     
    const result = verifyAccessToken(token);
  
    if (!result.success) {
      return res.status(403).json({ error: result.error });
    }
  
    req.user = result.data;
    next();
}