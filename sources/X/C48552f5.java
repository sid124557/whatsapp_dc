package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.2f5  reason: invalid class name and case insensitive filesystem */
public class C48552f5 {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C48552f5 r5 = (C48552f5) obj;
            if (this.A00 != r5.A00 || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C48552f5(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = list;
        z = z2 ? z | true : z;
        z = z3 ? z | true : z;
        z = z4 ? z | true : z;
        this.A00 = z5 ? z | true : z ? 1 : 0;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        AnonymousClass000.A1M(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
