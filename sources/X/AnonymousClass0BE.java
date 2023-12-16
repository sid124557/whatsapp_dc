package X;

import android.os.Build;

/* renamed from: X.0BE  reason: invalid class name */
public final class AnonymousClass0BE extends C09060fa {
    public static boolean A00(AnonymousClass0Ph r1) {
        C162457s7.A0J(r1, 0);
        if (!r1.A00 || r1.A01) {
            return true;
        }
        return false;
    }

    public boolean A02(C06250Wv r4) {
        C162457s7.A0J(r4, 0);
        C02380Fy r2 = r4.A0A.A02;
        if (r2 == C02380Fy.UNMETERED) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 30 || r2 != C02380Fy.TEMPORARILY_UNMETERED) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A03(Object obj) {
        return A00((AnonymousClass0Ph) obj);
    }

    public AnonymousClass0BE(AnonymousClass0UM r1) {
        super(r1);
    }
}
