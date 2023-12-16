package X;

/* renamed from: X.52q  reason: invalid class name and case insensitive filesystem */
public final class C986352q extends C986552s {
    public AnonymousClass3ZH A00;
    public final C624134x A01;
    public final C103685Ny A02;
    public final CharSequence A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C986352q) {
                C986352q r5 = (C986352q) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C986352q(AnonymousClass3ZH r2, C624134x r3, C103685Ny r4, CharSequence charSequence, boolean z) {
        super(r4.A00, r2, r3, charSequence);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = charSequence;
        this.A04 = z;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((((AnonymousClass000.A08(this.A00, C18300x5.A04(this.A02)) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A03)) * 31, this.A04);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MyStatusDataItem(myStatusState=");
        A0o.append(this.A02);
        A0o.append(", contact=");
        A0o.append(this.A00);
        A0o.append(", latestMessage=");
        A0o.append(this.A01);
        A0o.append(", elapsedTimeString=");
        A0o.append(this.A03);
        A0o.append(", isItemVisible=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
