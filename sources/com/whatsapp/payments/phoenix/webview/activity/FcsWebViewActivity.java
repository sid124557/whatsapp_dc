package com.whatsapp.payments.phoenix.webview.activity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass2UQ;
import X.AnonymousClass3Aw;
import X.AnonymousClass3Z6;
import X.AnonymousClass4G9;
import X.AnonymousClass9J9;
import X.C159127lA;
import X.C161447pg;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C19100yl;
import X.C197919e5;
import X.C44522Wj;
import X.C48332ej;
import X.C50722if;
import X.C54522or;
import X.C59312wi;
import X.C60482yd;
import X.C624635d;
import X.C72043d5;
import X.C73813g7;
import X.C835048r;
import X.C85734Hk;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Map;

public final class FcsWebViewActivity extends AnonymousClass9J9 {
    public int A00 = -1;
    public Uri A01;
    public C44522Wj A02;
    public C54522or A03;
    public C60482yd A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final void A7D(Map map, boolean z) {
        C159127lA r1;
        AnonymousClass4G9 r0;
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[3];
        AnonymousClass3Z6.A04("resource_output", map, r2);
        AnonymousClass3Z6.A05("status", Boolean.valueOf(z), r2);
        AnonymousClass3Z6.A06("callback_index", Integer.valueOf(this.A00), r2);
        Map A0F = C73813g7.A0F(r2);
        C44522Wj r12 = this.A02;
        if (r12 != null) {
            String str = this.A07;
            if (str == null) {
                throw C18270x1.A0S("fdsManagerId");
            }
            C161447pg A002 = r12.A00(str);
            if (A002 != null && (r1 = A002.A00) != null && (r0 = (AnonymousClass4G9) r1.A00("open_web_view")) != null) {
                r0.B3J(A0F);
                return;
            }
            return;
        }
        throw C18270x1.A0S("fdsManagerRegistry");
    }

    public void A78(WebView webView, String str) {
        C19100yl r1 = this.A03;
        C162457s7.A0K(r1, "null cannot be cast to non-null type com.facebook.secure.securewebview.SecureWebView");
        r1.evaluateJavascript("\n(function () {\n    if (window.WhatsAppBridge) {\n        return;\n    }\n    \n    function sendToWebView(status, data) {\n        let dataJson = JSON.stringify(data);\n        window.WhatsAppBridge_internal.onComplete(__fbAndroidBridgeAuthToken, status, dataJson);\n    }\n\n    function initWhatsAppBridge() {\n        // The interface that the WebView page will call to communicate with the native app.\n        window.WhatsAppBridge = {\n            // Completes a WebView state with success and transitions to the next state,\n            // using outputData as input for the subsequent state.\n            didCompleteWithSuccess: function (outputData) {\n                sendToWebView(true, outputData);\n            },\n            \n            // Completes a WebView with a failure and initiates error handling, using outputData.\n            didCompleteWithFailure: function(outputData) {\n                sendToWebView(false, outputData);\n            },\n        };\n    }\n    \n    if (typeof __fbAndroidBridgeAuthToken !== 'undefined') {\n        initWhatsAppBridge();\n    } else {\n        window.addEventListener(\"__fbAndroidBridgeAuthTokenInjected\", initWhatsAppBridge);\n    }\n})();\n", (ValueCallback) null);
        String str2 = this.A05;
        if (str2 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("javascript:typeof _invokeWithData === 'function' && _invokeWithData(");
            A0o.append(str2);
            this.A03.evaluateJavascript(AnonymousClass000.A0X(");", A0o), (ValueCallback) null);
        }
    }

    public boolean A7C(String str) {
        if (C162457s7.A0P(str, this.A08)) {
            A7D(C72043d5.A00(), true);
        } else if (C162457s7.A0P(str, this.A06)) {
            A7D(C72043d5.A00(), false);
        }
        if (C162457s7.A0P(str, this.A08) || C162457s7.A0P(str, this.A06)) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        C54522or r0 = this.A03;
        if (r0 == null) {
            throw C18270x1.A0S("uiObserver");
        }
        r0.A03(this);
        super.onDestroy();
    }

    public void A75() {
        C159127lA r0;
        super.A75();
        C44522Wj r2 = this.A02;
        if (r2 != null) {
            String str = this.A07;
            if (str == null) {
                throw C18270x1.A0S("fdsManagerId");
            }
            C161447pg A002 = r2.A00(str);
            if (A002 != null && (r0 = A002.A00) != null) {
                r0.A09((String) null);
                return;
            }
            return;
        }
        throw C18270x1.A0S("fdsManagerRegistry");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri A012 = C624635d.A01(getIntent().getStringExtra("webview_url"));
        C162457s7.A0D(A012);
        this.A01 = A012;
        this.A05 = getIntent().getStringExtra("data");
        this.A08 = getIntent().getStringExtra("success_url");
        this.A06 = getIntent().getStringExtra("failure_url");
        String stringExtra = getIntent().getStringExtra("fds_manager_id");
        if (stringExtra != null) {
            this.A07 = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("state_name");
            if (stringExtra2 != null) {
                String stringExtra3 = getIntent().getStringExtra("fds_observer_id");
                if (stringExtra3 != null) {
                    C60482yd r0 = this.A04;
                    if (r0 != null) {
                        C54522or A022 = r0.A02(stringExtra3);
                        this.A03 = A022;
                        A022.A00(new C85734Hk(1, stringExtra2, this), C197919e5.class, this);
                        int intExtra = getIntent().getIntExtra("callback_index", -1);
                        this.A00 = intExtra;
                        if (intExtra != -1) {
                            C19100yl r4 = this.A03;
                            C162457s7.A0K(r4, "null cannot be cast to non-null type com.facebook.secure.securewebview.SecureWebView");
                            AnonymousClass3Aw r6 = new AnonymousClass3Aw(this);
                            C50722if r3 = new C50722if();
                            r3.A02("https");
                            String[] strArr = new String[1];
                            Uri uri = this.A01;
                            if (uri == null) {
                                throw C18270x1.A0S("launchUri");
                            }
                            strArr[0] = uri.getHost();
                            r3.A01(strArr);
                            AnonymousClass2UQ A002 = r3.A00();
                            C162457s7.A0D(A002);
                            C48332ej r2 = new C48332ej();
                            r2.A01.add(new C835048r[]{r6}[0]);
                            r2.A00.add(A002);
                            r4.A01 = r2.A00();
                            r4.getSettings().setJavaScriptEnabled(true);
                            r4.A07.A02 = true;
                            r4.addJavascriptInterface(new C59312wi(r4, this), "WhatsAppBridge_internal");
                            return;
                        }
                        throw AnonymousClass001.A0e("'callback_index' parameter not passed");
                    }
                    throw C18270x1.A0S("uiObserversFactory");
                }
                throw C18300x5.A0X();
            }
            throw AnonymousClass001.A0e("'state_name' parameter not passed");
        }
        throw AnonymousClass001.A0e("'fds_manager_id' parameter not passed");
    }
}
