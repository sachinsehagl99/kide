var Glue = require('glue');
var Hapi = require('hapi');
var Config = require("./config.json");


var manifest = {
  connections: [{
    host: Config.server.web.host,
    port: Config.server.web.port,
    labels: ['web'],
  }, {
    host: Config.server.run.host,
    port: Config.server.run.port,
    labels: ['run'],
    routes:{
      cors: true  
    }
  }],
  registrations: [{
    plugin: {
      register: './servers/web',
      options: {
        config: Config
      }
    },
    options: {
      select: ['web']
    }
  }, {
    plugin: {
      register: './servers/run',
      options: {
        config: Config
      }
    },
    options: {
      select: ['run']
    }
  }]
};

var options = {
  relativeTo: __dirname,
};

Glue.compose(manifest, options, function(err, server) {
  if (err) {
    throw err;
  }

  server.start(function() {
    console.log('Hapi days!');
  });
});
