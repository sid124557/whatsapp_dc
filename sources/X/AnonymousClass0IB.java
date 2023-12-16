package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0IB  reason: invalid class name */
public class AnonymousClass0IB {
    public static void A00(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = systemUiVisibility | 1792;
        if (z) {
            i = systemUiVisibility & -1793;
        }
        decorView.setSystemUiVisibility(i);
    }
}
