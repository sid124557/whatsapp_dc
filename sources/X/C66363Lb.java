package X;

import android.os.Build;

/* renamed from: X.3Lb  reason: invalid class name and case insensitive filesystem */
public class C66363Lb implements AnonymousClass485 {
    public final C54292oU A00;
    public final C56892sj A01;
    public final C72303dV A02;
    public final C51072jE A03;
    public final AnonymousClass1R1 A04;

    public String A00(C95814uZ r4, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        C32501qy r2 = (C32501qy) AnonymousClass1R1.A00(r4, this.A04);
        boolean equalsIgnoreCase = "Silent".equalsIgnoreCase(r2.A07());
        if (z || equalsIgnoreCase) {
            return r2.A0D();
        }
        return r2.A0C();
    }

    public C66363Lb(C54292oU r1, C56892sj r2, C72303dV r3, C51072jE r4, AnonymousClass1R1 r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
