package X;

import android.os.Build;

/* renamed from: X.76s  reason: invalid class name and case insensitive filesystem */
public final class C1456476s {
    public static final int A00;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        }
        A00 = i;
    }
}
