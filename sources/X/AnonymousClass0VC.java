package X;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.0VC  reason: invalid class name */
public final class AnonymousClass0VC {
    public static int A00(int i) {
        return AnonymousClass73N.A00(i, 0);
    }

    public static final C186448vK A02(C152987aU r2, C161797qU r3, int i, int i2) {
        int i3;
        C162457s7.A0J(r3, 2);
        DisplayMetrics A0B = AnonymousClass000.A0B(r2.A02());
        C162457s7.A0D(A0B);
        if (View.MeasureSpec.getMode(i2) == 0) {
            i3 = A01(A0B);
        } else {
            i3 = 50;
        }
        return new AnonymousClass84M(r3, A00(i), AnonymousClass73N.A00(i2, i3));
    }

    public static final int A01(DisplayMetrics displayMetrics) {
        return C1222663s.A01(((float) 52) * (((float) displayMetrics.densityDpi) / ((float) 160)));
    }
}
