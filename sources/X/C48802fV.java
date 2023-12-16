package X;

import java.util.Arrays;

/* renamed from: X.2fV  reason: invalid class name and case insensitive filesystem */
public class C48802fV {
    public final C151917Wu A00;
    public final C160417nb A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C48802fV)) {
            return false;
        }
        C48802fV r4 = (C48802fV) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public C48802fV(C151917Wu r1, C160417nb r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        A0M[1] = this.A00;
        return Arrays.deepHashCode(A0M);
    }
}
