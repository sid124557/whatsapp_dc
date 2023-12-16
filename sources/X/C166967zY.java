package X;

import android.view.ViewTreeObserver;

/* renamed from: X.7zY  reason: invalid class name and case insensitive filesystem */
public class C166967zY implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00 = false;
    public final /* synthetic */ C108145cU A01;

    public C166967zY(C108145cU r2) {
        this.A01 = r2;
    }

    public void onGlobalLayout() {
        C108145cU r2 = this.A01;
        boolean A002 = C105895Wv.A00(r2.A0Q);
        if (A002 != this.A00) {
            this.A00 = A002;
            r2.A0O((Float) null, false);
        }
    }
}
