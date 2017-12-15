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
        password: 'hapiauthjafdhafdjahyfjkdgsyjasfydukfeyafdheavjdfaejmyfdja', // give any string you think is right password to encrypted
        cookie: 'sid-cuboid', // cookie name to use, usually sid-<appname>
        redirectTo: '/',
        isSecure: false,
        validateFunc: function(session, callback) {
            cache.get(session.sid, function(err, cached) {

                if (err) {
                    return callback(err, false);
                }

                if (!cached) {
                    return callback(null, false);
                }
                console.log(cached);
                return callback(null, true, cached.item.account);
            });
        }
    });
    
}
