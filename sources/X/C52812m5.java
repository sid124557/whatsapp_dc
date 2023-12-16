package X;

/* renamed from: X.2m5  reason: invalid class name and case insensitive filesystem */
public final class C52812m5 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52812m5) {
                C52812m5 r5 = (C52812m5) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C18270x1.A00(this.A03) * 31) + this.A00) * 31) + this.A01) * 31) + C18310x6.A07(this.A02);
    }

    public C52812m5(Integer num, String str, int i, int i2) {
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Theme(mode=");
        A0o.append(this.A03);
        A0o.append(", background=");
        A0o.append(this.A00);
        A0o.append(", primaryText=");
        A0o.append(this.A01);
        A0o.append(", secondaryText=");
        return C18260x0.A04(this.A02, A0o);
    }
}
