var Hoek = require("hoek");

module.exports = function(plugin, options, next) {
    //app cache to store user information once logged in.

    var cache = plugin.cache({
        expiresIn: 3 * 24 * 60 * 60 * 1000
    });
    plugin.app.cache = cache;

    //Bind the object to the plugin to be accessible in handlers
    plugin.bind({
        cache: plugin.app.cache
    });

    plugin.auth.strategy('facebook', 'bell', options.config.auth.providers.facebook);


    plugin.auth.strategy('session', 'cookie', {
        password: 'hapissajafdhafdjahyfjkdgsyjasfydukfeyafdheavjdfaejmyfdja',
        cookie: 'sid-cuboid',
        redirectTo: false,
        isSecure: true,
	/*validateFunc: function (request, session, callback) {
            cache.get(session.sid, (err, cached) => {

                if (err) {
                    return callback(err, false);
                }

                if (!cached) {
                    return callback(null, false);
                }

                return callback(null, true, cached.account);
            });
        }*/
    });

}
