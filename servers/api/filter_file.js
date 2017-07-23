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

module.exports.geCodeTemplate = function(str, sessionId) {
  var regex = /([^]*[\/]+[=]+[\sA-Za-z]+[\s=]*[\/]+)|([\/]+[=]+[\/]+[^]*)/g;
  var m;
  var code = [];

  for(var key in codeTemplate){
    var code_obj = codeTemplate[key];
    for(var k in code_obj){
      if(k == "sessionId" && code_obj[k] == sessionId){
        code_obj.code = [];
      }
    }
  }

  while ((m = regex.exec(str)) !== null) {
    code.push(m[0]);
  }

  codeTemplate.push({
    sessionId: sessionId,
    code: code 
  });

  return filterIgnore(code[0] + "\n\n" + code[1]);
}

module.exports.insertToCodeTemplate = function(str, sessionId) {
  var regex = /[\/]+[=]+[^]+[\/]+[=]+[\/]+/g;
  var m, code = "", codeSession = "";

  while ((m = regex.exec(str)) !== null) {
    code = m[0];
  }

  for(var key in codeTemplate){
    var codeObj = codeTemplate[key];

    if(codeObj.sessionId == sessionId){
      codeSession = codeObj.code;
    } 
  } 
  return codeSession[0] + code + codeSession[1];
}
