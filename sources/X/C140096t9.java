package X;

/* renamed from: X.6t9  reason: invalid class name and case insensitive filesystem */
public final class C140096t9 extends AnonymousClass75V {
    public final AnonymousClass7YW A00;
    public final AnonymousClass7YW A01;
    public final AnonymousClass7ZQ A02;
    public final C141626vs A03;
    public final AnonymousClass75U A04;
    public final CharSequence A05;

    public C140096t9(AnonymousClass7YW r2, AnonymousClass7YW r3, AnonymousClass7ZQ r4, C141626vs r5, AnonymousClass75U r6, CharSequence charSequence) {
        C162457s7.A0J(r5, 2);
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = charSequence;
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140096t9) {
                C140096t9 r5 = (C140096t9) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A03 != r5.A03 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass000.A08(this.A03, C18300x5.A04(this.A02)) + AnonymousClass000.A07(this.A04)) * 31) + AnonymousClass000.A07(this.A05)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContentView(header=");
        A0o.append(this.A02);
        A0o.append(", footnotePosition=");
        A0o.append(this.A03);
        A0o.append(", content=");
        A0o.append(this.A04);
        A0o.append(", footnote=");
        A0o.append(this.A05);
        A0o.append(", primaryButton=");
        A0o.append(this.A00);
        A0o.append(", secondaryButton=");
        return C18260x0.A04(this.A01, A0o);
    }
}
