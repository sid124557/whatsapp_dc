package X;

import java.util.Arrays;

/* renamed from: X.2kT  reason: invalid class name and case insensitive filesystem */
public final class C51842kT {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C51842kT.class != obj.getClass()) {
                return false;
            }
            C51842kT r7 = (C51842kT) obj;
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public C51842kT(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        AnonymousClass001.A1Q(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("{ path = ");
        A0o.append(this.A01);
        AnonymousClass001.A1M(A0o);
        C18300x5.A1O(A0o, "size");
        A0o.append(this.A00);
        return AnonymousClass000.A0X(" } \n", A0o);
    }
}
