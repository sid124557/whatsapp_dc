package X;

import java.util.Arrays;

/* renamed from: X.2xw  reason: invalid class name and case insensitive filesystem */
public class C60062xw {
    public final C95814uZ A00;
    public final C95814uZ A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C60062xw)) {
                C60062xw r5 = (C60062xw) obj;
                if (!AnonymousClass75J.A00(this.A00, r5.A00) || !AnonymousClass75J.A00(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C60062xw(C95814uZ r1, C95814uZ r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A00;
        A1X[1] = this.A01;
        AnonymousClass001.A1S(A1X, this.A02);
        return Arrays.hashCode(A1X);
    }
}
