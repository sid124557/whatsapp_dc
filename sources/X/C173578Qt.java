package X;

/* renamed from: X.8Qt  reason: invalid class name and case insensitive filesystem */
public class C173578Qt implements C184668sK, C188608zC {
    public static final byte[] A06 = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03 = new byte[16];
    public byte[] A04 = new byte[16];
    public byte[] A05 = new byte[48];

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(byte[] r7) {
        /*
            r6 = this;
            r3 = 0
        L_0x0001:
            byte[] r5 = r6.A05
            int r0 = r3 + 16
            X.AnonymousClass6CA.A0g(r7, r5, r3, r0)
            int r2 = r3 + 32
            byte r1 = r7[r3]
            byte r0 = r5[r3]
            X.AnonymousClass6CA.A0e(r1, r5, r0, r2)
            int r3 = r3 + 1
            r0 = 16
            if (r3 < r0) goto L_0x0001
            r4 = 0
            r3 = 0
        L_0x0019:
            r2 = 0
        L_0x001a:
            byte r1 = r5[r2]
            byte[] r0 = A06
            byte r0 = r0[r3]
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            r5[r2] = r0
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r0 = 48
            if (r2 < r0) goto L_0x001a
            int r3 = r3 + r4
            int r3 = r3 % 256
            int r4 = r4 + 1
            r0 = 18
            if (r4 < r0) goto L_0x0019
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173578Qt.A01(byte[]):void");
    }

    public void reset() {
        this.A02 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A05;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.A01 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.A04;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.A00 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.A03;
            if (i3 != bArr3.length) {
                bArr3[i3] = 0;
                i3++;
            } else {
                return;
            }
        }
    }

    public final void A00(C173578Qt r5) {
        byte[] bArr = r5.A05;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        this.A02 = r5.A02;
        byte[] bArr2 = r5.A04;
        System.arraycopy(bArr2, 0, this.A04, 0, bArr2.length);
        this.A01 = r5.A01;
        byte[] bArr3 = r5.A03;
        System.arraycopy(bArr3, 0, this.A03, 0, bArr3.length);
        this.A00 = r5.A00;
    }

    public void A02(byte[] bArr) {
        byte[] bArr2 = this.A03;
        byte b = bArr2[15];
        int i = 0;
        do {
            b = (byte) (A06[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
            i++;
        } while (i < 16);
    }

    public C184668sK Azm() {
        return new C173578Qt(this);
    }

    public int B24(byte[] bArr, int i) {
        byte[] bArr2 = this.A04;
        int length = bArr2.length;
        int i2 = this.A01;
        byte b = (byte) (length - i2);
        while (i2 < length) {
            bArr2[i2] = b;
            i2++;
        }
        A02(bArr2);
        A01(bArr2);
        A01(this.A03);
        System.arraycopy(this.A05, this.A02, bArr, i, 16);
        reset();
        return 16;
    }

    public String B4N() {
        return "MD2";
    }

    public int B51() {
        return 16;
    }

    public int B74() {
        return 16;
    }

    public void Bjv(C184668sK r1) {
        A00((C173578Qt) r1);
    }

    public void BrT(byte b) {
        byte[] bArr = this.A04;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        bArr[i] = b;
        if (i2 == 16) {
            A02(bArr);
            A01(bArr);
            this.A01 = 0;
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.A01 != 0) {
            if (i2 > 0) {
                BrT(bArr[i]);
                i++;
                i2--;
            } else {
                return;
            }
        }
        while (i2 > 16) {
            byte[] bArr2 = this.A04;
            System.arraycopy(bArr, i, bArr2, 0, 16);
            A02(bArr2);
            A01(bArr2);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            BrT(bArr[i]);
            i++;
            i2--;
        }
    }

    public C173578Qt(C173578Qt r3) {
        A00(r3);
    }

    public C173578Qt() {
        reset();
    }
}
