var regex = /([^]*[\/]+[=]+[\sA-Za-z]+[\s=]*[\/]+)|([\/]+[=]+[\/]+[^]*)/g;

var regex2 = /(^[a-zA-Z0-9!%^@_\s.*/-/+<>;,{}()[\]'":=\/*]*)IGNORE|END([a-zA-Z0-9!%^@_\s.*/-/+<>;,{}()[\]'":=\/*]*)/g;

var regex3 = /[\/]+[=]+[^]+[\/]+[=]+[\/]+/g;



var codeTemplate_arr = [];


function filterIgnore(str) {
  var m, result = "";

  if (str.match(/IGNORE/g)) {
    while ((m = regex2.exec(str)) !== null) {
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
  return str;
}

module.exports.geCodeTemplate = function(str) {
  console.log("get ==>", str);
  str = "\n" + str;
  codeTemplate_arr = [];
  while ((m = regex.exec(str)) !== null) {
    codeTemplate_arr.push(m[0]);
  }

  return filterIgnore(codeTemplate_arr[0] + "\n\n" + codeTemplate_arr[1]);
}

module.exports.insertToCodeTemplate = function(str) {
  console.log("--->", str);
  var code = "";

  while ((m = regex3.exec(str)) !== null) {
    code = m[0];
    //console.log(codeTemplate_arr[0] + m[0] + codeTemplate_arr[1]);
  }

  return codeTemplate_arr[0] + code + codeTemplate_arr[1];
}
