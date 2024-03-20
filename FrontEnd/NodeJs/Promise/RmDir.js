const { rmdir } = require('node:fs/promises');
const { join } = require('node:path');

async function removeDirectory() {
  const projectFolder = join(__dirname, 'test', 'project');
  const dirDeletion = await rmdir(projectFolder, { recursive: true });

  console.log(dirDeletion);
  return dirDeletion;
}

removeDirectory().catch(console.error);