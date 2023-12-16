package X;

/* renamed from: X.5Z7  reason: invalid class name */
public final class AnonymousClass5Z7 {
    public static final C103125Lq A04 = new C103125Lq();
    public final AnonymousClass5IC A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Z7) {
                AnonymousClass5Z7 r5 = (AnonymousClass5Z7) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass000.A07(this.A02) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A03);
    }

    public AnonymousClass5Z7(AnonymousClass5IC r1, CharSequence charSequence, CharSequence charSequence2, Integer num) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = r1;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WDSToolbarViewState(title=");
        A0o.append(this.A02);
        A0o.append(", subtitle=");
        A0o.append(this.A01);
        A0o.append(", iconSet=");
        A0o.append(this.A00);
        A0o.append(", backgroundColor=");
        return C18260x0.A04(this.A03, A0o);
    }

    public AnonymousClass5Z7() {
        this((AnonymousClass5IC) null, (CharSequence) null, (CharSequence) null, (Integer) null);
    }
}
