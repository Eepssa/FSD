const fs = require('fs');

const filePath = 'hello.txt';
let timer = 0;

function printHello() {
    fs.appendFile(filePath, 'Hello\n', (err) => {
        if (err) throw err;
        console.log('Hello printed to file');
    });
}

function stopPrinting() {
    clearInterval(interval);
    console.log('Finished printing');
}

const interval = setInterval(printHello, 2000);


setTimeout(stopPrinting, 120000); 
