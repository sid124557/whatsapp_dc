package X;

/* renamed from: X.7bO  reason: invalid class name and case insensitive filesystem */
public final class C153477bO {
    public final int A00;
    public final C166217yK A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C153477bO) {
                C153477bO r5 = (C153477bO) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A00;
    }

    public final C166217yK A02() {
        return this.A01;
    }

    public final C166217yK A03() {
        return this.A01;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public C153477bO(C166217yK r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CdsBorderData(color=");
        A0o.append(this.A01);
        A0o.append(", width=");
        return C18260x0.A09(A0o, this.A00);
    }
}
