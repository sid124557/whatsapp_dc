package X;

/* renamed from: X.5SD  reason: invalid class name */
public final class AnonymousClass5SD {
    public String A00 = null;
    public final AnonymousClass59R A01;
    public final boolean A02;

    public AnonymousClass5SD(AnonymousClass59R r3, boolean z) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SD) {
                AnonymousClass5SD r5 = (AnonymousClass5SD) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && C162457s7.A0P(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(C18300x5.A04(this.A01), this.A02) + C18270x1.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterFilterViewItem(type=");
        A0o.append(this.A01);
        A0o.append(", isSelected=");
        A0o.append(this.A02);
        A0o.append(", countryIso=");
        return C18260x0.A07(this.A00, A0o);
    }
}
