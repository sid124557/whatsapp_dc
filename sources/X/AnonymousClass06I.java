package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.06I  reason: invalid class name */
public class AnonymousClass06I extends AnonymousClass06J {
    public void A03(boolean z) {
        if (z) {
            Window window = this.A01;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            AnonymousClass0QN.A00(window, 16);
            return;
        }
        A06(16);
    }

    public AnonymousClass06I(View view, Window window) {
        super(view, window);
    }
}
