package X;

/* renamed from: X.5S5  reason: invalid class name */
public final class AnonymousClass5S5 {
    public Integer A00;
    public Integer A01;
    public final AnonymousClass58T A02;

    public AnonymousClass5S5(AnonymousClass58T r2, Integer num, Integer num2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
        this.A00 = num;
        this.A01 = num2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5S5) {
                AnonymousClass5S5 r5 = (AnonymousClass5S5) obj;
                if (this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A02) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AuthResultData(authResult=");
        A0o.append(this.A02);
        A0o.append(", actionEntryPoint=");
        A0o.append(this.A00);
        A0o.append(", authType=");
        return C18260x0.A04(this.A01, A0o);
    }
}
