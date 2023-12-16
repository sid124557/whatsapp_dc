package X;

/* renamed from: X.5SE  reason: invalid class name */
public final class AnonymousClass5SE {
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass5SE(String str, String str2, String str3) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SE) {
                AnonymousClass5SE r5 = (AnonymousClass5SE) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A01) + C18270x1.A00(this.A02)) * 31) + AnonymousClass0x7.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PixKey(type=");
        A0o.append(this.A01);
        A0o.append(", value=");
        A0o.append(this.A02);
        A0o.append(", name=");
        return C18260x0.A07(this.A00, A0o);
    }
}
