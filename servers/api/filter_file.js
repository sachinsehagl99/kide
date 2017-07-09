var codeTemplate = [];

function filterIgnore(str) {
  var regex = /(^[^]*)IGNORE|END([^]*)/g;
  var m, result = "";

  if (str.match(/IGNORE/g)) {
    while ((m = regex.exec(str)) !== null) {

      m.forEach((match, groupIndex) => {
        if (groupIndex == 0)
          result = result + match;
      });
    }
    result = result.replace("//IGNORE", "");
    return result.replace("END", "");
  }
  return str;
}

module.exports.geCodeTemplate = function(str) {
  var regex = /([^]*[\/]+[=]+[\sA-Za-z]+[\s=]*[\/]+)|([\/]+[=]+[\/]+[^]*)/g;
  var m;

  codeTemplate = [];
  while ((m = regex.exec(str)) !== null) {
    codeTemplate.push(m[0]);
  }
  return filterIgnore(codeTemplate[0] + "\n\n" + codeTemplate[1]);
}

module.exports.insertToCodeTemplate = function(str) {
  var regex = /[\/]+[=]+[^]+[\/]+[=]+[\/]+/g;
  var m, code = "";

  while ((m = regex.exec(str)) !== null) {
    code = m[0];
  }
  return codeTemplate[0] + code + codeTemplate[1];
}
