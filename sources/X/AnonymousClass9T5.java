package X;

/* renamed from: X.9T5  reason: invalid class name */
public final class AnonymousClass9T5 {
    public final int A00;
    public final C202939mr A01;
    public final AnonymousClass3ZO A02;

    public AnonymousClass9T5(C202939mr r2, AnonymousClass3ZO r3, int i) {
        C162457s7.A0J(r3, 2);
        this.A00 = i;
        this.A02 = r3;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9T5) {
                AnonymousClass9T5 r5 = (AnonymousClass9T5) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AlertBannerConfiguration(count=");
        A0o.append(this.A00);
        A0o.append(", alert=");
        A0o.append(this.A02);
        A0o.append(", onAlertClickListener=");
        return C18260x0.A04(this.A01, A0o);
    }
}
