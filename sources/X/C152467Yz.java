package X;

/* renamed from: X.7Yz  reason: invalid class name and case insensitive filesystem */
public final class C152467Yz {
    public final int A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152467Yz) {
                C152467Yz r5 = (C152467Yz) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, this.A00 * 31) + AnonymousClass000.A07(this.A01);
    }

    public C152467Yz(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A00 = i;
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BulletItemViewState(icon=");
        A0o.append(this.A00);
        A0o.append(", title=");
        A0o.append(this.A02);
        A0o.append(", subtitle=");
        return C18260x0.A04(this.A01, A0o);
    }
}
