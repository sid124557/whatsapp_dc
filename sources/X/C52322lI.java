package X;

/* renamed from: X.2lI  reason: invalid class name and case insensitive filesystem */
public final class C52322lI {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52322lI) {
                C52322lI r5 = (C52322lI) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(((AnonymousClass000.A07(this.A01) * 31) + C18310x6.A07(this.A00)) * 31, this.A02);
    }

    public C52322lI(Integer num, Integer num2, boolean z) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ErrorState(messageResId=");
        A0o.append(this.A01);
        A0o.append(", dialogCode=");
        A0o.append(this.A00);
        A0o.append(", shouldDismiss=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
