
    window.onload = function () {
	function receiveMessage(e) {
            QUnit.testDone(function (result) {
               event.source.postMessage(result, e.origin);
            });
            QUnit.test( "hello test", function( assert ) {
                assert.ok( 1 == "1", "Passed!" );
            });

         
    }

	window.addEventListener('message', receiveMessage);
}
