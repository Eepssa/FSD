const os = require('os');
const fs = require('fs');

const tmpDir = os.tmpdir();
console.log(tmpdir)
// Remove the temporary directory
fs.rm(tmpDir, { recursive: true }, (err) => {
    if (err) {
        console.error('Error removing temporary directory:', err);
    } else {
        console.log('Temporary directory removed successfully:', tmpDir);
    }
});