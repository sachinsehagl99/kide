var handlebars = require('handlebars');
var Vision = require("vision");
var Inert = require('inert');
var Routes = require('./routes');

exports.register = function(plugin, options, next) {


    var context = {
        config: options.config,
        local: options.config.expose,
    };


    handlebars.registerHelper('json', function(context) {
        return JSON.stringify(context);
    });

    plugin.register([Inert, Vision], function(err) {

        plugin.views({
            engines: {
                html: handlebars
            },
            relativeTo: __dirname,
            path: 'views',
        });

        plugin.bind(context);
        plugin.route(Routes(options));

    });

    return next();
};

exports.register.attributes = {
    pkg: require('./package.json')
};
