package X;

import android.webkit.JavascriptInterface;
import com.whatsapp.payments.phoenix.webview.activity.FcsWebViewActivity;

/* renamed from: X.2wi  reason: invalid class name and case insensitive filesystem */
public final class C59312wi {
    public final /* synthetic */ C19100yl A00;
    public final /* synthetic */ FcsWebViewActivity A01;

    @JavascriptInterface
    public final void onComplete(String str, boolean z, String str2) {
        C18260x0.A0P(str, str2);
        C19100yl r1 = this.A00;
        r1.post(new C70573ai(r1, this.A01, str, str2, z));
    }

    public C59312wi(C19100yl r1, FcsWebViewActivity fcsWebViewActivity) {
        this.A00 = r1;
        this.A01 = fcsWebViewActivity;
    }
}
