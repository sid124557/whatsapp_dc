package X;

/* renamed from: X.5Qs  reason: invalid class name and case insensitive filesystem */
public class C104375Qs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C150477Qw A06;
    public String A07 = "";
    public String A08 = "";
    public boolean A09;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C104375Qs)) {
            return false;
        }
        C104375Qs r4 = (C104375Qs) obj;
        return this.A00 == r4.A00 && this.A01 == r4.A01 && AnonymousClass75J.A00(this.A06, r4.A06) && AnonymousClass75J.A00(this.A07, r4.A07) && this.A02 == r4.A02 && this.A03 == r4.A03 && this.A04 == r4.A04 && this.A05 == r4.A05 && this.A08.equals(r4.A08) && this.A09 == r4.A09;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1M(objArr, this.A01);
        objArr[2] = this.A06;
        objArr[3] = this.A07;
        C18280x3.A1P(objArr, this.A02);
        C18310x6.A1U(objArr, this.A03);
        C18290x4.A1U(objArr, this.A04);
        C18310x6.A1V(objArr, this.A05);
        objArr[8] = this.A08;
        return C18310x6.A08(Boolean.valueOf(this.A09), objArr, 9);
    }
}
