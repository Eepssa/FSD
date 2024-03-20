const http=require('http');
const os=require("os");

const free=os.freemem()
const avail=os.totalmem()
const consume=avail-free

const handler=(req,res)=>{

   if(req.method==="GET" && req.url==="/")
   {
    // res.end("Hi There !!!!");
    res.end("<html><body> Hello Friends!!!</body></html>");
   }

   else if (req.method==="GET" && req.url==="/hello")
   {
    // res.end("Hello Friend!!!")
   const data=[{"name":"Eepssa","roll":1},{"name":"Raj","roll":2}]
   res.statusCode=200;
    res.setHeader('Content-Type', 'text/json');
   res.end(JSON.stringify(data));

   }

   else if (req.method==="GET" && req.url==="/os")
   {
    const data=[

        {availMemory:avail,freeMemory:free,consumeMemory:consume}
        
    ];
    res.statusCode=201;  
    res.setHeader('Content-Type', 'text/json');
    res.end(JSON.stringify(data));
   }
   
   else if (req.method === "POST" && req.url === "/save") {
    let rawdata = "";
    req.on("data", (chunk) => {
        rawdata = rawdata + chunk;
    });

    req.on("end", () => {
        receivedData = JSON.parse(rawdata);
        console.log(receivedData);
        res.end("Data received successfully!");
    });
} 

else if (req.method === "GET" && req.url === "/newdata") {
    // Check if data has been received
    if (receivedData) {
        res.setHeader('Content-Type', 'application/json');
        res.end(JSON.stringify(receivedData));
    } else {
        res.end("No data received yet.");
    }
}

}

const port=9002;
const host="localhost";
const server= http.createServer(handler);

server.listen(port,host,()=>{

    console.log("Server Started at-"+port)
})
