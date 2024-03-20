const cp=require("fs");
cp.copyFile("C:\\Users\\EepssaRout\\Documents\\MongoDB\\Practice.docx", 
"C:\\Users\\EepssaRout\\Documents\\MongoDB\\Copy.docx",(err)=>{
    if(err){
        console.log(err);
    }
}
);

// const myfs=require("fs");
// myfs.readFile("d://file1.txt",function(err,data)
// {
//     if(err)
//     {
//         console.log("--Error---")
//     }
//     else{

//         console.log(data);
//     }
 

// })

// myfs.readFile("d://file1.txt",(err,data)=>
// {
//     if(err)
//     {
//         console.log("--Error---")
//     }
//     else{

//         console.log(data);
//     }
 

// })
// myfs.mkdir("d://node_test//test1",{ recursive: true },(err,path)=>
// {
//    if(err)
//    {
//     console.log("--Error--"+err);
//    }
//    else{
//         console.log(path);

//    }

// })
