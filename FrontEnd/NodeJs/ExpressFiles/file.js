const express=require("express");
const upload=require("express-fileupload");
const app=express();

app.use(upload());
app.use(express.urlencoded({
    extended:true
}))

app.post("/submit",(req,res)=>{
    console.log(req.body);
    res.send(req.body.name+" "+req.files.myfile.name);

   
})

app.listen(2000,()=>{
    console.log("Server started");
})