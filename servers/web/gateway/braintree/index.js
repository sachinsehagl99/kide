var braintree = require("braintree");

var gateway = braintree.connect({
    environment: braintree.Environment.Sandbox,
    merchantId: "2zdmmhdd92hgfxx3",
    publicKey: "jndvrkn32r7jtww5",
    privateKey: "c9f6e1fb74d583631d800f4ce3b4dae1"
});

module.exports = function(plugin, options, next) {
    plugin.route({
        method: 'GET',
        path: '/id/profile',
        config: {
            auth: {
                strategy: 'session'

            },
        },
        handler: function(request, reply) {
            var user = request.auth.credentials.profile.raw;

            gateway.clientToken.generate({}, function(err, response) {
                user.clientToken = response.clientToken;
                reply.view('profile', {
                    user: user
                });
            });
        }
    });
}
