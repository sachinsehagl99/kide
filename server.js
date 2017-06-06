var Glue = require('glue');
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
  },{
    host: Config.server.api.host,
    port: Config.server.api.port,
    labels: ['api']
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
  },
  {
    plugin: {
      register: './servers/api',
      options: {
        config: Config
      }
    },
    options: {
      select: ['api']
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
