const http = require('http');
const fs = require('fs');

const defaultName = 'abc';
const defaultPassword = 'abc123';

const handler =((req, res) => {
    if (req.method === 'GET' && req.url === '/') {
        fs.readFile('login.html', (err, data) => {
            if (err) {
                res.writeHead(404);
                res.end('Error loading login form');
            } else {
                res.writeHead(200, { 'Content-Type': 'text/html' });
                res.end(data);
            }
        });
    }  else if (req.method === 'GET' && req.url === '/dashboard') {
        fs.readFile('dashboard.html', (err, data) => {
            if (err) {
                res.writeHead(404);
                res.end('Error loading login form');
            } else {
                res.writeHead(200, { 'Content-Type': 'text/html' });
                res.end(data);
            }
        });
    }else if (req.method === 'POST' && req.url === '/') {
        let body = '';
        req.on('data', (chunk) => {
            body += chunk.toString();
        });
        req.on('end', () => {
            const formData = new URLSearchParams(body);
            const username = formData.get('username');
            const password = formData.get('password');

            if (username === defaultName && password === defaultPassword) {
                res.writeHead(302, { 'Location': '/dashboard' });
                res.end();
            } else {
                res.writeHead(302, { 'Location': '/' });
                res.end();
            }
        });
    } else {
        res.writeHead(404);
        res.end('Not found');
    }
});


const server= http.createServer(handler);

const port=2700;
const host="localhost";

server.listen(port,host,()=>{
    console.log(`Server started at http://${host}:${port}`);
})


