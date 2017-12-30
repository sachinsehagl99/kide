var braintree = require("braintree");

var gateway = braintree.connect({
  environment: braintree.Environment.Sandbox,
  merchantId: "2zdmmhdd92hgfxx3",
  publicKey: "jndvrkn32r7jtww5",
  privateKey: "c9f6e1fb74d583631d800f4ce3b4dae1"
});
