package X;

/* renamed from: X.4xH  reason: invalid class name and case insensitive filesystem */
public final class C96934xH extends C1452374s {
    public AnonymousClass3ZH A00;
    public boolean A01 = false;
    public final AnonymousClass1RL A02;

    public C96934xH(AnonymousClass1RL r2, AnonymousClass3ZH r3) {
        this.A02 = r2;
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96934xH) {
                C96934xH r5 = (C96934xH) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A00, C18300x5.A04(this.A02)), this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterDataItem(newsletterInfo=");
        A0o.append(this.A02);
        A0o.append(", contact=");
        A0o.append(this.A00);
        A0o.append(", isLoading=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
