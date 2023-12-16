package X;

/* renamed from: X.2nz  reason: invalid class name and case insensitive filesystem */
public final class C53982nz {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C53982nz.class)) {
                return false;
            }
            C53982nz r4 = (C53982nz) obj;
            if (!(this.A00 == r4.A00 && this.A02 == r4.A02 && this.A07 == r4.A07 && this.A09 == r4.A09 && this.A0A == r4.A0A && this.A04 == r4.A04 && this.A08 == r4.A08 && this.A03 == r4.A03 && this.A05 == r4.A05 && this.A06 == r4.A06 && this.A01 == r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final C47312d3 A00() {
        C47312d3 r1 = new C47312d3();
        r1.A00 = this.A00;
        r1.A01 = this.A02;
        r1.A06 = this.A07;
        r1.A08 = this.A09;
        r1.A09 = this.A0A;
        r1.A03 = this.A04;
        r1.A07 = this.A08;
        r1.A02 = this.A03;
        r1.A04 = this.A05;
        r1.A05 = this.A06;
        return r1;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1R(objArr, this.A02);
        AnonymousClass001.A1S(objArr, this.A07);
        objArr[3] = Boolean.valueOf(this.A09);
        objArr[4] = Boolean.valueOf(this.A0A);
        objArr[5] = Boolean.valueOf(this.A04);
        objArr[6] = Boolean.valueOf(this.A08);
        objArr[7] = Boolean.valueOf(this.A03);
        objArr[8] = Boolean.valueOf(this.A05);
        objArr[9] = Boolean.valueOf(this.A06);
        return C18310x6.A08(Boolean.valueOf(this.A01), objArr, 10);
    }

    public C53982nz(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A00 = i;
        this.A02 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A04 = z5;
        this.A08 = z6;
        this.A03 = z7;
        this.A05 = z8;
        this.A06 = z9;
        this.A01 = z10;
    }
}
