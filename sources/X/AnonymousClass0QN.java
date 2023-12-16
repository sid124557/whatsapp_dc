package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0QN  reason: invalid class name */
public abstract class AnonymousClass0QN {
    public abstract void A01(int i);

    public abstract void A02(int i);

    public boolean A05() {
        return false;
    }

    public static void A00(Window window, int i) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public void A03(boolean z) {
    }

    public void A04(boolean z) {
    }
}
