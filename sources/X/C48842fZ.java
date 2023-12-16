package X;

import java.util.Objects;

/* renamed from: X.2fZ  reason: invalid class name and case insensitive filesystem */
public final class C48842fZ {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C48842fZ.class)) {
                return false;
            }
            C48842fZ r5 = (C48842fZ) obj;
            if (this.A00 != r5.A00 || this.A01 != r5.A01) {
                return false;
            }
            String str = this.A02;
            int length = str.length();
            String str2 = r5.A02;
            return length == 0 ? str2.length() == 0 : str.equals(str2);
        }
    }

    public C48842fZ(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A00);
        AnonymousClass000.A1M(A1X, this.A01);
        A1X[2] = this.A02;
        return Objects.hash(A1X);
    }
}
