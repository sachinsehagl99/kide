var braintree = require("braintree");

var gateway = braintree.connect({
    environment: braintree.Environment.Sandbox,
    merchantId: "2zdmmhdd92hgfxx3",
    publicKey: "jndvrkn32r7jtww5",
    privateKey: "c9f6e1fb74d583631d800f4ce3b4dae1"
});

function createResultObject(transaction) {
    var result;
    var status = transaction.status;

    if (TRANSACTION_SUCCESS_STATUSES.indexOf(status) !== -1) {
        result = {
            header: 'Sweet Success!',
            icon: 'success',
            message: 'Your test transaction has been successfully processed. See the Braintree API response and try again.'
        };
    } else {
        result = {
            header: 'Transaction Failed',
            icon: 'fail',
            message: 'Your test transaction has a status of ' + status + '. See the Braintree API response and try again.'
        };
    }

    return result;
}

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

    plugin.route({
        method: 'POST',
        path: '/checkouts',
        config: {
            auth: {
                strategy: 'session'

            },
        },

        handler: function(req, res) {
		console.log(req.payload);
            var transactionErrors;
            var amount = 100;

            var nonce = req.payload.payment_method_nonce;
		console.log(nonce);
            gateway.transaction.sale({
                amount: amount,
                paymentMethodNonce: nonce,
                options: {
                    submitForSettlement: true
                }
            }, function(err, result) {
                if (result.success || result.transaction) {
                    res.redirect('checkouts/' + result.transaction.id);
                } else {
                    transactionErrors = result.errors.deepErrors();
                    req.flash('error', {
                        msg: formatErrors(transactionErrors)
                    });
                    res.redirect('checkouts/new');
                }
            });
        }
    });

    plugin.route({
        method: 'GET',
        path: '/checkouts/{id}',
        config: {
            auth: {
                strategy: 'session'

            },
        },
        handler: function(req, res) {
            var result;
            var transactionId = req.params.id;

            gateway.transaction.find(transactionId, function(err, transaction) {
		console.log(transaction);
		res.redirect('/');
            });
        }
    });

}
