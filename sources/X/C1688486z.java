package X;

import android.util.Log;

/* renamed from: X.86z  reason: invalid class name and case insensitive filesystem */
public final class C1688486z implements C184878sh {
    public final int A00;
    public final int A01;
    public final C161467pi A02;

    public int B7i() {
        return this.A00;
    }

    public int BCQ() {
        return this.A01;
    }

    public int BiO() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A0E();
        }
        return i;
    }

    public C1688486z(C166527yp r6, C126606Op r7) {
        C161467pi r4 = r7.A00;
        this.A02 = r4;
        int A03 = C161467pi.A03(r4, 12);
        if ("audio/raw".equals(r6.A0T)) {
            int A022 = C162387ry.A02(r6.A0B, r6.A06);
            if (A03 == 0 || A03 % A022 != 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Audio sample size mismatch. stsd sample size: ");
                A0o.append(A022);
                Log.w("AtomParsers", AnonymousClass000.A0Y(", stsz sample size: ", A0o, A03));
                A03 = A022;
            }
            this.A00 = A03;
            this.A01 = r4.A0E();
        }
        if (A03 == 0) {
            A03 = -1;
        }
        this.A00 = A03;
        this.A01 = r4.A0E();
    }
}
