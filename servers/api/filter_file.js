const regex = /(^[a-zA-Z0-9!%^@_\s.*/-/+<>;,{}()[\]'":=\/*]*)IGNORE|END([a-zA-Z0-9!%^@_\s.*/-/+<>;,{}()[\]'":=\/*]*)/g;

module.exports = function(str) {
  var m, result = "";

  while ((m = regex.exec(str)) !== null) {
    // This is necessary to avoid infinite loops with zero-width matches
    if (m.index === regex.lastIndex) {
      regex.lastIndex++;
    }

    // The result can be accessed through the `m`-variable.
    m.forEach((match, groupIndex) => {
      if (groupIndex == 0)
        result = result + match;
    });

  }
  result = result.replace("//IGNORE", "");
  return result.replace("END", "");
}
