package X;

/* renamed from: X.2i3  reason: invalid class name and case insensitive filesystem */
public class C50362i3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass3ZC A04;
    public final AnonymousClass3ZC A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C50362i3 r5 = (C50362i3) obj;
            if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A08 == r5.A08 && this.A02 == r5.A02 && this.A00 == r5.A00 && AnonymousClass75J.A00(this.A07, r5.A07) && AnonymousClass75J.A00(this.A06, r5.A06) && AnonymousClass75J.A00(this.A05, r5.A05) && AnonymousClass75J.A00(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        AnonymousClass000.A1L(objArr, this.A03);
        AnonymousClass000.A1M(objArr, this.A01);
        objArr[2] = this.A07;
        objArr[3] = this.A06;
        objArr[4] = this.A05;
        objArr[5] = this.A04;
        objArr[6] = Boolean.valueOf(this.A08);
        C18310x6.A1V(objArr, this.A02);
        return C18310x6.A08(Integer.valueOf(this.A00), objArr, 8);
    }

    public C50362i3(AnonymousClass3ZC r1, AnonymousClass3ZC r2, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r1;
        this.A04 = r2;
        this.A08 = z;
        this.A02 = i3;
        this.A00 = i4;
    }
}
