package X;

import android.net.Uri;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: X.3z4  reason: invalid class name and case insensitive filesystem */
public final class C80943z4 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C19100yl $webView;
    public final /* synthetic */ C628837c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80943z4(C19100yl r2, C628837c r3) {
        super(0);
        this.this$0 = r3;
        this.$webView = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C628837c r1 = this.this$0;
        C19100yl r0 = this.$webView;
        r1.A01 = r0;
        if (r0 == null) {
            throw C18270x1.A0S("secureWebView");
        }
        r0.getSettings().setJavaScriptEnabled(true);
        C19100yl r2 = this.this$0.A01;
        if (r2 == null) {
            throw C18270x1.A0S("secureWebView");
        }
        r2.evaluateJavascript("\n(function () {\n    if (window.WhatsAppBridge) {\n        return;\n    }\n\n    var responseCallbacks = {};\n    var port;\n    window.addEventListener('message', function (event) {\n        if (event.data == 'init-port') {\n            if (event.ports[0] != null) {\n                port = event.ports[0];\n                port.onmessage = function (event) {\n                    handleMessage(event.data)\n                };\n            }\n        }\n    }, false);\n\n    function invoke(method, data, responseCallback) {\n        dispatchMessage({webview_token: __fbAndroidBridgeAuthToken, method: method, data: data }, responseCallback);\n    }\n\n    function dispatchMessage(message, responseCallback) {\n        if (responseCallback) {\n            var callbackID = Math.random().toString(36)\n            responseCallbacks[callbackID] = responseCallback;\n            message['callbackID'] = callbackID;\n        }\n\n        port.postMessage(JSON.stringify(message))\n    }\n\n    function handleMessage(messageJSON) {\n        var message = JSON.parse(messageJSON);\n        var responseCallback;\n\n        if (message.callbackID) {\n            responseCallback = responseCallbacks[message.callbackID];\n            delete responseCallbacks[message.callbackID];\n\n            if (!responseCallback) {\n                return;\n            }\n            if (!message.responseData) {\n                responseCallback()\n            } else {\n                responseCallback(message.responseData);\n            }\n        }\n    }\n\n    if (typeof __fbAndroidBridgeAuthToken !== 'undefined') {\n            window.WhatsAppBridge = {\n            invoke: invoke,\n        };\n    } else {\n    window.addEventListener(\"__fbAndroidBridgeAuthTokenInjected\", function (){\n         window.WhatsAppBridge = {\n            invoke: invoke,\n        };\n    });\n    }\n })();\n", new AnonymousClass28D(1));
        WebMessagePort[] createWebMessageChannel = this.$webView.createWebMessageChannel();
        C162457s7.A0D(createWebMessageChannel);
        C628837c r12 = this.this$0;
        WebMessagePort webMessagePort = createWebMessageChannel[0];
        C162457s7.A0A(webMessagePort);
        r12.A00 = webMessagePort;
        C628837c r22 = this.this$0;
        WebMessagePort A00 = r22.A00;
        if (A00 == null) {
            throw C18270x1.A0S("sendPort");
        }
        A00.setWebMessageCallback(new C19090yk(r22));
        C19100yl r3 = this.this$0.A01;
        if (r3 == null) {
            throw C18270x1.A0S("secureWebView");
        }
        r3.postWebMessage(new WebMessage("init-port", new WebMessagePort[]{createWebMessageChannel[1]}), Uri.EMPTY);
        return C59022wD.A00;
    }
}
