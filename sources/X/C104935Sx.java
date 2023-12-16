package X;

/* renamed from: X.5Sx  reason: invalid class name and case insensitive filesystem */
public final class C104935Sx {
    public final int A00;
    public final int A01;
    public final C95804uY A02;
    public final AnonymousClass21F A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104935Sx) {
                C104935Sx r5 = (C104935Sx) obj;
                if (!(this.A03 == r5.A03 && C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01((((AnonymousClass000.A08(this.A02, C18300x5.A04(this.A03)) + this.A01) * 31) + this.A00) * 31, this.A05), this.A04);
    }

    public C104935Sx(C95804uY r1, AnonymousClass21F r2, int i, int i2, boolean z, boolean z2) {
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterActionError(action=");
        A0o.append(this.A03);
        A0o.append(", jid=");
        A0o.append(this.A02);
        A0o.append(", title=");
        A0o.append(this.A01);
        A0o.append(", message=");
        A0o.append(this.A00);
        A0o.append(", shouldRetry=");
        A0o.append(this.A05);
        A0o.append(", isConnectivityError=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
