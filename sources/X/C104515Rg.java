package X;

/* renamed from: X.5Rg  reason: invalid class name and case insensitive filesystem */
public final class C104515Rg {
    public final int A00;
    public final C31981pC A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104515Rg) {
                C104515Rg r5 = (C104515Rg) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public C104515Rg(C31981pC r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaSource(message=");
        A0o.append(this.A01);
        A0o.append(", loopCount=");
        return C18260x0.A09(A0o, this.A00);
    }
}
