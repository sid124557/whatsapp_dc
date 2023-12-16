package com.whatsapp.payments.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass32Y;
import X.AnonymousClass3z3;
import X.AnonymousClass9U4;
import X.C162457s7;
import X.C175738Zn;
import X.C18270x1;
import X.C19100yl;
import X.C191159Dc;
import X.C53262mo;
import X.C58422vE;
import X.C627736r;
import X.C628837c;
import X.C80943z4;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.webkit.WebView;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

public class MessageWithLinkWebViewActivity extends C191159Dc {
    public int A00 = 4;
    public UserJid A01;
    public AnonymousClass9U4 A02;
    public C628837c A03;
    public C53262mo A04;
    public String A05 = "link_to_webview";
    public String A06;

    public void A76(int i, Intent intent) {
        if (i == 0) {
            C53262mo r0 = this.A04;
            if (r0 != null) {
                String str = this.A05;
                int i2 = this.A00;
                r0.A00(this.A01, str, this.A06, 1, i2);
            } else {
                throw C18270x1.A0S("messageWithLinkLogging");
            }
        }
        super.A76(i, intent);
    }

    public void A77(WebView webView) {
        C162457s7.A0J(webView, 0);
        if (A7D() && (webView instanceof C19100yl)) {
            ((C19100yl) webView).A07.A02 = true;
        }
        super.A77(webView);
    }

    public void A78(WebView webView, String str) {
        if (A7D()) {
            Looper myLooper = Looper.myLooper();
            UserJid userJid = this.A01;
            C628837c r2 = this.A03;
            if (r2 == null) {
                if (myLooper != null && userJid != null) {
                    C627736r r5 = new C627736r();
                    AnonymousClass9U4 r7 = this.A02;
                    if (r7 != null) {
                        r2 = new C628837c(this, myLooper, r5, userJid, r7);
                        this.A03 = r2;
                    } else {
                        throw C18270x1.A0S("paymentsManager");
                    }
                } else {
                    return;
                }
            }
            C19100yl r1 = this.A03;
            C162457s7.A0K(r1, "null cannot be cast to non-null type com.facebook.secure.securewebview.SecureWebView");
            C162457s7.A0J(r1, 0);
            C628837c.A02(new C80943z4(r1, r2));
        }
    }

    public boolean A7D() {
        return this.A0D.A0Y(C58422vE.A02, 3939);
    }

    public boolean A7B() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C628837c r3;
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && (r3 = this.A03) != null) {
            String str = "FAILURE";
            if (intent == null) {
                r3.A03(str, (JSONObject) null);
                return;
            }
            if (i2 == -1) {
                str = "SUCCESS";
            } else if (i2 == 0) {
                str = "CANCELED";
            }
            C628837c.A02(new AnonymousClass3z3(r3, AnonymousClass0x9.A1G().put("responseData", AnonymousClass0x9.A1G().put("result", str)).put("method", intent.getStringExtra("method")).put("callbackID", intent.getStringExtra("callbackID"))));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("webview_receiver_jid");
        if (stringExtra != null && (!C175738Zn.A0V(stringExtra))) {
            this.A01 = AnonymousClass32Y.A08(stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("message_cta_type");
        if (stringExtra2 == null) {
            stringExtra2 = "link_to_webview";
        }
        this.A05 = stringExtra2;
        int i = 4;
        if (C162457s7.A0P(stringExtra2, "marketing_msg_webview")) {
            i = 0;
        }
        this.A00 = i;
        String stringExtra3 = getIntent().getStringExtra("webview_message_template_id");
        this.A06 = stringExtra3;
        C53262mo r0 = this.A04;
        if (r0 != null) {
            r0.A00(this.A01, this.A05, stringExtra3, 4, this.A00);
            return;
        }
        throw C18270x1.A0S("messageWithLinkLogging");
    }
}
