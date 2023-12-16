package X;

import java.util.Arrays;

/* renamed from: X.2fg  reason: invalid class name and case insensitive filesystem */
public class C48912fg {
    public int A00;
    public String A01 = "";
    public boolean A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C48912fg)) {
            return false;
        }
        C48912fg r4 = (C48912fg) obj;
        if (this.A01.equals(r4.A01) && this.A00 == r4.A00 && this.A02 == r4.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        AnonymousClass000.A1M(A1X, this.A00);
        AnonymousClass001.A1S(A1X, this.A02);
        return Arrays.hashCode(A1X);
    }
}
