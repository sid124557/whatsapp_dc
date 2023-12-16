package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: X.0Hh  reason: invalid class name and case insensitive filesystem */
public class C02710Hh {
    public static ColorFilter A00(AnonymousClass0FH r3, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        Object A00 = C02720Hi.A00(r3);
        if (A00 != null) {
            return C02700Hg.A00(A00, i);
        }
        return null;
    }
}
