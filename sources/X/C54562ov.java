package X;

/* renamed from: X.2ov  reason: invalid class name and case insensitive filesystem */
public class C54562ov {
    public final int A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C54562ov)) {
            return false;
        }
        C54562ov r4 = (C54562ov) obj;
        return this.A02.equals(r4.A02) && this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A02) + this.A00) * 31) + this.A01;
    }

    public C54562ov(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public String[] A00() {
        String[] A1a = AnonymousClass0x9.A1a();
        A1a[0] = this.A02;
        C18270x1.A1P(A1a, this.A01);
        C18280x3.A1O(A1a, this.A00);
        return A1a;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1P(A0o, this.A02);
        A0o.append(":");
        A0o.append(this.A00);
        A0o.append(":");
        return AnonymousClass000.A0h(A0o, this.A01);
    }
}
