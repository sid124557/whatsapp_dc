package X;

import java.util.Arrays;

/* renamed from: X.7Vj  reason: invalid class name and case insensitive filesystem */
public final class C151587Vj {
    public final long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C151587Vj) {
            C151587Vj r7 = (C151587Vj) obj;
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C151587Vj(String str, long j) {
        C162177rO.A02(str);
        this.A01 = str;
        this.A00 = j;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        AnonymousClass001.A1Q(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
