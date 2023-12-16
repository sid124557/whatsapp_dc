package X;

import java.util.Arrays;

/* renamed from: X.5Pv  reason: invalid class name and case insensitive filesystem */
public class C104145Pv {
    public final int A00;
    public final C42242Ni A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C104145Pv r5 = (C104145Pv) obj;
            if (!AnonymousClass75J.A00(this.A01, r5.A01) || !AnonymousClass75J.A00(Boolean.valueOf(this.A02), Boolean.valueOf(r5.A02)) || !AnonymousClass75J.A00(Integer.valueOf(this.A00), Integer.valueOf(r5.A00))) {
                return false;
            }
        }
        return true;
    }

    public C104145Pv(C42242Ni r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        AnonymousClass000.A1R(A1X, this.A02);
        AnonymousClass000.A1N(A1X, this.A00);
        return Arrays.hashCode(A1X);
    }
}
