package X;

import java.util.Arrays;

/* renamed from: X.7YA  reason: invalid class name */
public final class AnonymousClass7YA {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7YA)) {
            return false;
        }
        AnonymousClass7YA r4 = (AnonymousClass7YA) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public AnonymousClass7YA(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A01);
        AnonymousClass000.A1M(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append("x");
        return AnonymousClass000.A0h(A0o, this.A00);
    }
}
