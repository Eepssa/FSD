const res=require("os");
const p=res.freemem();
const av=res.totalmem();
const cv=require("./ByteGB");
console.log(cv(p));
console.log(cv(av));

const fullinfo={
    p:p,
    av:av,
    type:res.type()
}

console.log(fullinfo);