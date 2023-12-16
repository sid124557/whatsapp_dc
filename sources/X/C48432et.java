package X;

import java.util.Arrays;

/* renamed from: X.2et  reason: invalid class name and case insensitive filesystem */
public class C48432et {
    public boolean A00;
    public final C166447yh A01;

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C48432et)) {
            C48432et r4 = (C48432et) obj;
            if (this.A00 == r4.A00) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public C48432et(C166447yh r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        AnonymousClass000.A1R(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
