package X;

import android.os.Build;

/* renamed from: X.0BD  reason: invalid class name */
public final class AnonymousClass0BD extends C09060fa {
    public static boolean A00(AnonymousClass0Ph r4) {
        C162457s7.A0J(r4, 0);
        int i = Build.VERSION.SDK_INT;
        boolean z = r4.A00;
        if (i >= 26) {
            if (!z) {
                return true;
            }
            z = r4.A03;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public boolean A02(C06250Wv r3) {
        C162457s7.A0J(r3, 0);
        return AnonymousClass000.A1Y(r3.A0A.A02, C02380Fy.CONNECTED);
    }

    public /* bridge */ /* synthetic */ boolean A03(Object obj) {
        return A00((AnonymousClass0Ph) obj);
    }

    public AnonymousClass0BD(AnonymousClass0UM r1) {
        super(r1);
    }
}
