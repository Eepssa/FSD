const fs = require('fs')
const path=require("path")
const { rmdir } = require('node:fs/promises')

fs.readdir(__dirname, (err, files) => { 
    if (err) 
      console.log(err); 
    else { 
      console.log("\nCurrent directory filenames:"); 
      files.forEach(file => {
        if(path.extname(file)==".txt") 
        console.log(file);

    
  })}}) 