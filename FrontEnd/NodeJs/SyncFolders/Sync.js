const fs = require('fs');
const path = require('path');

const sourceDir = "C:\\Users\\EepssaRout\\Documents\\FrontEnd\\NodeJs\\SyncFolders\\First"; // Path to the first folder
const destDir = "C:\\Users\\EepssaRout\\Documents\\FrontEnd\\NodeJs\\SyncFolders\\Second"; // Path to the second folder

function syncFolders(sourceDir, destDir) {
    try {
        syncFiles(sourceDir, destDir);
        syncFiles(destDir, sourceDir);
        
        console.log('Folders synchronized successfully!');
    } catch (error) {
        console.error('Error synchronizing folders:', error);
    }
}


function syncFiles(sourceDir, destDir) {
    if (!fs.existsSync(destDir)) {
        fs.mkdirSync(destDir, { recursive: true });
    }

    const files = fs.readdirSync(sourceDir);

    files.forEach(file => {
        const sourceFile = path.join(sourceDir, file);
        const destFile = path.join(destDir, file);

        if (fs.statSync(sourceFile).isFile()) {

            if (fs.existsSync(destFile)) {
                const sourceStats = fs.statSync(sourceFile);
                const destStats = fs.statSync(destFile);

                if (sourceStats.mtimeMs > destStats.mtimeMs) {
                    const sourceContent = fs.readFileSync(sourceFile, 'utf8');
                    fs.writeFileSync(destFile, sourceContent);
                    console.log(`Updated content of file ${file} in ${destDir}.`);
                }
                else if (sourceStats.mtimeMs < destStats.mtimeMs) {
                    const destContent = fs.readFileSync(destFile, 'utf8');
                    fs.writeFileSync(sourceFile, destContent);
                    console.log(`Updated content of file ${file} in ${sourceDir}.`);
                }
            } else {
                fs.copyFileSync(sourceFile, destFile);
                console.log(`Copied file ${file} to ${destDir}.`);
            }
        }
    });
}

syncFolders(sourceDir, destDir);
