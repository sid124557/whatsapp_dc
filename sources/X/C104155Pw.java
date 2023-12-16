package X;

import java.util.Arrays;

/* renamed from: X.5Pw  reason: invalid class name and case insensitive filesystem */
public class C104155Pw {
    public final int A00;
    public final C624134x A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C104155Pw r5 = (C104155Pw) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public C104155Pw(C624134x r1, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        AnonymousClass000.A1M(A1X, this.A00);
        AnonymousClass001.A1S(A1X, this.A02);
        return Arrays.hashCode(A1X);
    }
}
