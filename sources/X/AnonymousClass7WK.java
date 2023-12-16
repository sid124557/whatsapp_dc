package X;

import java.util.Arrays;

/* renamed from: X.7WK  reason: invalid class name */
public class AnonymousClass7WK {
    public int A00;
    public int A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7WK)) {
            return false;
        }
        AnonymousClass7WK r4 = (AnonymousClass7WK) obj;
        if (this.A01 == r4.A01 && this.A02 == r4.A02 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public AnonymousClass7WK(int i, int i2, boolean z) {
        this.A01 = i;
        this.A02 = z;
        this.A00 = i2;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A01);
        AnonymousClass000.A1R(A1X, this.A02);
        AnonymousClass000.A1N(A1X, this.A00);
        return Arrays.hashCode(A1X);
    }
}
