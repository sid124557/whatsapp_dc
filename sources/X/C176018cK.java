package X;

/* renamed from: X.8cK  reason: invalid class name and case insensitive filesystem */
public final class C176018cK extends C161437pf {
    public void A0D(C161677qE r8, C153727bq r9, int i, int i2) {
        int i3;
        int i4;
        super.A0D(r8, r9, i, i2);
        C161437pf r3 = new C161437pf((C158877kh) null);
        int length = this.A05.length;
        int length2 = this.A06.length;
        if (r3.A05 == null) {
            r3.A05 = new int[length];
        }
        for (int i5 = 0; i5 < length; i5++) {
            int[] iArr = this.A07;
            if (iArr == null || i5 >= iArr.length || (i4 = iArr[i5]) == 0) {
                i3 = this.A05[i5];
            } else {
                i3 = A04(i4, length2);
            }
            if (this.A04 != null) {
                i3 = A05(r9, i3);
            }
            C161437pf.A02(r9, r3.A05, i3, i5);
        }
        int length3 = this.A06.length + this.A02;
        if (r3.A06 == null) {
            r3.A06 = new int[(this.A03 + length3)];
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int i7 = this.A06[i6];
            if (this.A04 != null) {
                i7 = A05(r9, i7);
            }
            C161437pf.A02(r9, r3.A06, i7, i6);
        }
        for (int i8 = 0; i8 < this.A03; i8++) {
            int A04 = A04(this.A08[i8], length2);
            if (this.A04 != null) {
                A04 = A05(r9, A04);
            }
            C161437pf.A02(r9, r3.A06, A04, length3 + i8);
        }
        this.A05 = r3.A05;
        this.A06 = r3.A06;
        this.A02 = 0;
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A03 = r3.A03;
        this.A00 = r3.A00;
        this.A04 = r3.A04;
    }

    public C176018cK(C158877kh r1) {
        super(r1);
    }
}
