package X;

import android.os.Build;

/* renamed from: X.0BF  reason: invalid class name */
public final class AnonymousClass0BF extends C09060fa {
    public static final String A00;

    public static boolean A00(AnonymousClass0Ph r4) {
        boolean z;
        C162457s7.A0J(r4, 0);
        if (Build.VERSION.SDK_INT < 26) {
            C06240Wu.A00().A04(A00, "Metered network constraint is not supported before API 26, only checking for connected state.");
            z = r4.A00;
        } else {
            if (r4.A00) {
                z = r4.A01;
            }
            return true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public boolean A02(C06250Wv r3) {
        C162457s7.A0J(r3, 0);
        return AnonymousClass000.A1Y(r3.A0A.A02, C02380Fy.METERED);
    }

    static {
        String A01 = C06240Wu.A01("NetworkMeteredCtrlr");
        C162457s7.A0D(A01);
        A00 = A01;
    }

    public /* bridge */ /* synthetic */ boolean A03(Object obj) {
        return A00((AnonymousClass0Ph) obj);
    }

    public AnonymousClass0BF(AnonymousClass0UM r1) {
        super(r1);
    }
}
