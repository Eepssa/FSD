const fs = require('fs');
const path = require('path');

const directoryPath = 'C:\\Users'; 
fs.readdir(directoryPath, (err, files) => {
  if (err) {
    console.error('Error reading directory:', err);
    return;
  }

  let largestFile = { name: '', size: 0 };

  files.forEach(file => {
    const filePath = path.join(directoryPath, file);
    const stats = fs.statSync(filePath);
    if (stats.isFile() && stats.size > largestFile.size) {
      largestFile = { name: file, size: stats.size };
    }
  });

  console.log('Largest file:', largestFile.name, 'Size:', largestFile.size, 'bytes');
});
