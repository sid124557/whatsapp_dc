package X;

/* renamed from: X.2kP  reason: invalid class name and case insensitive filesystem */
public final class C51802kP {
    public final C56902sk A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51802kP) {
                C51802kP r5 = (C51802kP) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(C18300x5.A04(this.A00), this.A01);
    }

    public C51802kP(C56902sk r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PartialImageResult(downloadData=");
        A0o.append(this.A00);
        A0o.append(", stopped=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
