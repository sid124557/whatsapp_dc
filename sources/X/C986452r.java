package X;

/* renamed from: X.52r  reason: invalid class name and case insensitive filesystem */
public final class C986452r extends C986552s {
    public AnonymousClass3ZH A00;
    public final C623534r A01;
    public final C624134x A02;
    public final CharSequence A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C986452r) {
                C986452r r5 = (C986452r) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || this.A04 != r5.A04 || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01((AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01))) + AnonymousClass000.A07(this.A03)) * 31, this.A04), this.A05);
    }

    public C986452r(C623534r r1, AnonymousClass3ZH r2, C624134x r3, CharSequence charSequence, boolean z, boolean z2) {
        super(r1, r2, r3, charSequence);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = charSequence;
        this.A04 = z;
        this.A05 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContactStatusDataItem(statusInfo=");
        A0o.append(this.A01);
        A0o.append(", contact=");
        A0o.append(this.A00);
        A0o.append(", latestMessage=");
        A0o.append(this.A02);
        A0o.append(", elapsedTimeString=");
        A0o.append(this.A03);
        A0o.append(", isItemVisible=");
        A0o.append(this.A04);
        A0o.append(", isMuted=");
        return C18260x0.A0A(A0o, this.A05);
    }
}
