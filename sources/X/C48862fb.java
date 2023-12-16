package X;

import java.util.Arrays;

/* renamed from: X.2fb  reason: invalid class name and case insensitive filesystem */
public class C48862fb {
    public final long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C48862fb)) {
            return false;
        }
        C48862fb r7 = (C48862fb) obj;
        return this.A00 == r7.A00 && AnonymousClass75J.A00(this.A02, r7.A02) && AnonymousClass75J.A00(this.A01, r7.A01);
    }

    public C48862fb(long j, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        A1X[1] = this.A02;
        AnonymousClass0x2.A1U(A1X, this.A00);
        return Arrays.hashCode(A1X);
    }
}
