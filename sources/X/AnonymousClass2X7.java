package X;

import android.webkit.JavascriptInterface;

/* renamed from: X.2X7  reason: invalid class name */
public class AnonymousClass2X7 {
    public final /* synthetic */ C34231uR A00;

    public AnonymousClass2X7(C34231uR r1) {
        this.A00 = r1;
    }

    @JavascriptInterface
    public void postPlayerEvent(int i, int i2) {
        if (i2 >= 0 && i2 < 2147483) {
            this.A00.A0D.A0S(new C70273aE(this, i, i2, 8));
        }
    }
}
