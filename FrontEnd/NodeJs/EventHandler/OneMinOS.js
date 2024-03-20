const fs = require('fs');
const os = require('os');
const events = require('events');

const avail = os.totalmem();
const eventEmitter = new events.EventEmitter();

let intervalID = setInterval(() => {
    const free = os.freemem();
    const consume = avail - free;
    const memoryInfo = `Date: ${new Date().toISOString()} - Available memory: ${avail} bytes - Consumed memory: ${consume} bytes\n`;

    fs.appendFile('opt.txt', memoryInfo, (err) => {
        if (err) {
            console.error('Error writing to file:', err);
        } else {
            eventEmitter.emit('memoryWritten', memoryInfo);
        }
    });
}, 30000); 

setTimeout(() => {
    clearInterval(intervalID); 
}, 5 * 60000);

eventEmitter.on('memoryWritten', (memoryInfo) => {
    console.log('Memory information written to file:', memoryInfo);
});
