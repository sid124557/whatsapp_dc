package X;

/* renamed from: X.5S6  reason: invalid class name */
public final class AnonymousClass5S6 {
    public final AnonymousClass7HU A00;
    public final C27981fH A01;
    public final boolean A02;

    public AnonymousClass5S6(AnonymousClass7HU r2, C27981fH r3, boolean z) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5S6) {
                AnonymousClass5S6 r5 = (AnonymousClass5S6) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((C18300x5.A04(this.A00) + AnonymousClass000.A07(this.A01)) * 31, this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContactPickerExtraInfo { hasLid: ");
        A0o.append(AnonymousClass000.A1W(this.A01));
        A0o.append(", isBlocked: ");
        A0o.append(this.A02);
        return AnonymousClass000.A0X(" }", A0o);
    }
}
