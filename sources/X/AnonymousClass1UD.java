package X;

/* renamed from: X.1UD  reason: invalid class name */
public final class AnonymousClass1UD extends AnonymousClass26b {
    public final AnonymousClass39D A00;
    public final AnonymousClass39M A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1UD) {
                AnonymousClass1UD r5 = (AnonymousClass1UD) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((AnonymousClass000.A08(this.A00, C18270x1.A00(this.A02) * 31) + C18310x6.A07(this.A01)) * 31, this.A03);
    }

    public AnonymousClass1UD(AnonymousClass39D r1, AnonymousClass39M r2, String str, boolean z) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Complete(contentDescription=");
        A0o.append(this.A02);
        A0o.append(", model=");
        A0o.append(this.A00);
        A0o.append(", sticker=");
        A0o.append(this.A01);
        A0o.append(", isDisabled=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
