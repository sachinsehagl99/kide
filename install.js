var shell = require('shelljs');

console.log("==========Root directory package install==========")
shell.exec('npm install');
console.log("\nDone.\n\n");
console.log("==========WEB directory package install==========");
shell.exec('npm --prefix ./servers/web install ./servers/web');
console.log("\nDone.\n\n");
console.log("==========API directory package install==========");
shell.exec("npm --prefix ./servers/api install ./servers/api");
console.log("\nDone.");
console.log("==========RUN directory package install==========");
shell.exec("npm --prefix ./servers/run install ./servers/run");
console.log("\nDone.");
console.log("==========Building js and css==========");
shell.exec("gulp --cwd servers/web build");
console.log("\nDone.");

