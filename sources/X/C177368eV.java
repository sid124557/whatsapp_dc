package X;

/* renamed from: X.8eV  reason: invalid class name and case insensitive filesystem */
public class C177368eV extends AnonymousClass8Qs implements C180098kU {
    public static final int[] A0A = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int[] A09 = new int[64];

    public static int A0F(int i, int i2, int i3, int i4) {
        return i4 + (((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)))) + (((i ^ i2) & i3) | (i & i2));
    }

    public static int A0G(int[] iArr, int i, int i2, int i3, int i4) {
        return (((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)))) + (((~i) & i3) ^ (i2 & i)) + iArr[i4];
    }

    public void A0T() {
        int[] iArr;
        int i = 16;
        do {
            iArr = this.A09;
            AnonymousClass8Qs.A0E(iArr, i);
            i++;
        } while (i <= 63);
        int i2 = this.A00;
        int i3 = i2;
        int i4 = this.A01;
        int i5 = i4;
        int i6 = this.A02;
        int i7 = i6;
        int i8 = this.A03;
        int i9 = i8;
        int i10 = this.A04;
        int i11 = i10;
        int i12 = this.A05;
        int i13 = i12;
        int i14 = this.A06;
        int i15 = i14;
        int i16 = this.A07;
        int i17 = i16;
        int i18 = 0;
        int i19 = 0;
        do {
            int i20 = (((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)))) + (((~i10) & i14) ^ (i12 & i10));
            int[] iArr2 = A0A;
            int A0I = AnonymousClass6C9.A0I(iArr, i19, i20 + iArr2[i19], i16);
            int i21 = i8 + A0I;
            int A0F = A0F(i2, i4, i6, A0I);
            int i22 = i19 + 1;
            int A0I2 = AnonymousClass6C9.A0I(iArr, i22, A0G(iArr2, i21, i10, i12, i22), i14);
            int i23 = i6 + A0I2;
            int A0F2 = A0F(A0F, i2, i4, A0I2);
            int i24 = i22 + 1;
            int A0I3 = AnonymousClass6C9.A0I(iArr, i24, A0G(iArr2, i23, i21, i10, i24), i12);
            int i25 = i4 + A0I3;
            int A0F3 = A0F(A0F2, A0F, i2, A0I3);
            int i26 = i24 + 1;
            int A0I4 = AnonymousClass6C9.A0I(iArr, i26, A0G(iArr2, i25, i23, i21, i26), i10);
            int i27 = i2 + A0I4;
            int A0F4 = A0F(A0F3, A0F2, A0F, A0I4);
            int i28 = i26 + 1;
            int A0I5 = AnonymousClass6C9.A0I(iArr, i28, A0G(iArr2, i27, i25, i23, i28), i21);
            i16 = A0F + A0I5;
            i8 = A0F(A0F4, A0F3, A0F2, A0I5);
            int i29 = i28 + 1;
            int A0I6 = AnonymousClass6C9.A0I(iArr, i29, A0G(iArr2, i16, i27, i25, i29), i23);
            i14 = A0F2 + A0I6;
            i6 = A0F(i8, A0F4, A0F3, A0I6);
            int i30 = i29 + 1;
            int A0I7 = AnonymousClass6C9.A0I(iArr, i30, A0G(iArr2, i14, i16, i27, i30), i25);
            i12 = A0F3 + A0I7;
            i4 = A0F(i6, i8, A0F4, A0I7);
            int i31 = i30 + 1;
            int A0I8 = AnonymousClass6C9.A0I(iArr, i31, A0G(iArr2, i12, i14, i16, i31), i27);
            i10 = A0F4 + A0I8;
            i2 = A0F(i4, i6, i8, A0I8);
            i19 = i31 + 1;
            i18++;
        } while (i18 < 8);
        this.A00 = i3 + i2;
        this.A01 = i5 + i4;
        this.A02 = i7 + i6;
        this.A03 = i9 + i8;
        this.A04 = i11 + i10;
        this.A05 = i13 + i12;
        this.A06 = i15 + i14;
        this.A07 = i17 + i16;
        this.A08 = 0;
        int i32 = 0;
        do {
            iArr[i32] = 0;
            i32++;
        } while (i32 < 16);
    }

    public C184668sK Azm() {
        return new C177368eV(this);
    }

    public String B4N() {
        return "SHA-256";
    }

    public int B74() {
        return 32;
    }

    public void Bjv(C184668sK r1) {
        A0U((C177368eV) r1);
    }

    public C177368eV(C177368eV r2) {
        super(r2);
        A0U(r2);
    }

    public final void A0U(C177368eV r5) {
        super.A0R(r5);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        this.A05 = r5.A05;
        this.A06 = r5.A06;
        this.A07 = r5.A07;
        int[] iArr = r5.A09;
        System.arraycopy(iArr, 0, this.A09, 0, iArr.length);
        this.A08 = r5.A08;
    }

    public int B24(byte[] bArr, int i) {
        A0Q();
        C161817qb.A02(bArr, this.A00, i);
        C161817qb.A02(bArr, this.A01, i + 4);
        C161817qb.A02(bArr, this.A02, i + 8);
        C161817qb.A02(bArr, this.A03, i + 12);
        C161817qb.A02(bArr, this.A04, i + 16);
        C161817qb.A02(bArr, this.A05, i + 20);
        C161817qb.A02(bArr, this.A06, i + 24);
        C161817qb.A02(bArr, this.A07, i + 28);
        reset();
        return 32;
    }

    public void reset() {
        super.reset();
        this.A00 = 1779033703;
        this.A01 = -1150833019;
        this.A02 = 1013904242;
        this.A03 = -1521486534;
        this.A04 = 1359893119;
        this.A05 = -1694144372;
        this.A06 = 528734635;
        this.A07 = 1541459225;
        this.A08 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A09;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public C177368eV() {
        reset();
    }
}
