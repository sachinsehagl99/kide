var paypal = require('paypal-rest-sdk');

paypal.configure({
    'mode': 'sandbox', //sandbox or live
    'client_id': 'Aa_5x_9sSX0vBGcniEa4YtTs9E8uL1gxG-UbXQNVYWy8vXdD5RzlsFtix8ZWN_nPii5k2FUrrmseNzWd',
    'client_secret': 'EKRAu--zLxQzOeHZdmrx1gsqzNilHTI5DCxdSaNXMHDioNaLRMV3P-OiEb3nfjPWreI7hdqWrmzYEnfH'
});

exports.createPayment = function(request, reply) {
    var create_payment_json = {
        "intent": "sale",
        "payer": {
            "payment_method": "paypal"
        },
        "redirect_urls": {
            "return_url": "http://localhost:8080/payment/success",
            "cancel_url": "http://localhost:8080/payment/cancel"
        },
        "transactions": [{
            "item_list": {
                "items": [{
                    "name": "item",
                    "sku": "item",
                    "price": "1.00",
                    "currency": "USD",
                    "quantity": 1
                }]
            },
            "amount": {
                "currency": "USD",
                "total": "1.00"
            },
            "description": "This is the payment description."
        }]
    };


    paypal.payment.create(create_payment_json, function(error, payment) {
        if (error) {
            throw error;
        } else {
            console.log("Create Payment Response");
            console.log(payment);
        }
    });

};
