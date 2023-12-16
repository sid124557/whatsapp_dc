package X;

/* renamed from: X.6t8  reason: invalid class name and case insensitive filesystem */
public final class C140086t8 extends AnonymousClass75V {
    public final AnonymousClass7YW A00;
    public final AnonymousClass7YW A01;
    public final AnonymousClass7ZQ A02;
    public final CharSequence A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140086t8) {
                C140086t8 r5 = (C140086t8) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C18300x5.A04(this.A02) + AnonymousClass000.A07(this.A03)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01);
    }

    public C140086t8(AnonymousClass7YW r1, AnonymousClass7YW r2, AnonymousClass7ZQ r3, CharSequence charSequence) {
        this.A02 = r3;
        this.A03 = charSequence;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Card(header=");
        A0o.append(this.A02);
        A0o.append(", footnote=");
        A0o.append(this.A03);
        A0o.append(", primaryButton=");
        A0o.append(this.A00);
        A0o.append(", secondaryButton=");
        return C18260x0.A04(this.A01, A0o);
    }
}
