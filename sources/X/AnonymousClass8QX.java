package X;

/* renamed from: X.8QX  reason: invalid class name */
public class AnonymousClass8QX implements C180088kT {
    public static final byte[] A08 = C162077rB.A03("expand 32-byte k");
    public static final byte[] A09 = C162077rB.A03("expand 16-byte k");
    public static final int[] A0A;
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public boolean A04 = false;
    public byte[] A05 = new byte[64];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];

    public static int A00(int i, int i2, int i3) {
        return i3 ^ Integer.rotateLeft(i + i2, 18);
    }

    public static int A01(int i, int i2, int i3, int i4) {
        return i4 ^ Integer.rotateLeft(i + i2, i3);
    }

    static {
        byte[] A032 = C162077rB.A03("expand 16-byte kexpand 32-byte k");
        int i = 0;
        int[] iArr = new int[8];
        int i2 = 0;
        do {
            C161817qb.A05(A032, iArr, i, i2);
            i += 4;
            i2++;
        } while (i2 < 8);
        A0A = iArr;
    }

    public static void A02(int[] iArr, int[] iArr2) {
        int i = 20;
        int[] iArr3 = iArr;
        if (iArr3.length == 16) {
            int[] iArr4 = iArr2;
            if (iArr4.length == 16) {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                int i6 = iArr[4];
                int i7 = iArr[5];
                int i8 = iArr[6];
                int i9 = iArr[7];
                int i10 = iArr[8];
                int i11 = 9;
                int i12 = iArr[9];
                int i13 = iArr[10];
                int i14 = iArr[11];
                int i15 = iArr[12];
                int i16 = 13;
                int i17 = iArr[13];
                int i18 = iArr[14];
                int i19 = iArr[15];
                do {
                    int rotateLeft = Integer.rotateLeft(i2 + i15, 7) ^ i6;
                    int A012 = A01(rotateLeft, i2, i11, i10);
                    int A013 = A01(A012, rotateLeft, i16, i15);
                    int rotateLeft2 = Integer.rotateLeft(A013 + A012, 18) ^ i2;
                    int i20 = i7;
                    int A014 = A01(i20, i3, 7, i12);
                    int A015 = A01(A014, i20, i11, i17);
                    int A016 = A01(A015, A014, i16, i3);
                    int rotateLeft3 = Integer.rotateLeft(A016 + A015, 18) ^ i7;
                    int i21 = i13;
                    int A017 = A01(i21, i8, 7, i18);
                    int A018 = A01(A017, i21, i11, i4);
                    int rotateLeft4 = i8 ^ Integer.rotateLeft(A018 + A017, 13);
                    int A002 = A00(rotateLeft4, A018, i13);
                    int i22 = i19;
                    int A019 = A01(i22, i14, 7, i5);
                    int A0110 = A01(A019, i22, i11, i9);
                    int rotateLeft5 = i14 ^ Integer.rotateLeft(A0110 + A019, 13);
                    int A003 = A00(rotateLeft5, A0110, i19);
                    i3 = A01(rotateLeft2, A019, 7, A016);
                    i4 = A01(i3, rotateLeft2, i11, A018);
                    i5 = A019 ^ Integer.rotateLeft(i4 + i3, 13);
                    i2 = A00(i5, i4, rotateLeft2);
                    i8 = A01(rotateLeft3, rotateLeft, 7, rotateLeft4);
                    i9 = A01(i8, rotateLeft3, i11, A0110);
                    i6 = Integer.rotateLeft(i9 + i8, 13) ^ rotateLeft;
                    i7 = A00(i6, i9, rotateLeft3);
                    i14 = A01(A002, A014, 7, rotateLeft5);
                    i10 = Integer.rotateLeft(i14 + A002, i11) ^ A012;
                    i16 = 13;
                    i12 = A014 ^ Integer.rotateLeft(i10 + i14, 13);
                    i13 = A00(i12, i10, A002);
                    int i23 = A017;
                    i15 = A01(A003, i23, 7, A013);
                    i17 = A015 ^ Integer.rotateLeft(i15 + A003, 9);
                    i18 = A01(i17, i15, 13, i23);
                    i19 = A00(i18, i17, A003);
                    i -= 2;
                    i11 = 9;
                } while (i > 0);
                AnonymousClass6C8.A0t(0, i2, iArr3, iArr4);
                AnonymousClass6C8.A0t(1, i3, iArr3, iArr4);
                AnonymousClass6C8.A0t(2, i4, iArr3, iArr4);
                AnonymousClass6C8.A0t(3, i5, iArr3, iArr4);
                AnonymousClass6C8.A0t(4, i6, iArr3, iArr4);
                AnonymousClass6C8.A0t(5, i7, iArr3, iArr4);
                AnonymousClass6C8.A0t(6, i8, iArr3, iArr4);
                AnonymousClass6C8.A0t(7, i9, iArr3, iArr4);
                AnonymousClass6C8.A0t(8, i10, iArr3, iArr4);
                AnonymousClass6C8.A0t(9, i12, iArr3, iArr4);
                AnonymousClass6C8.A0t(10, i13, iArr3, iArr4);
                AnonymousClass6C8.A0t(11, i14, iArr3, iArr4);
                AnonymousClass6C8.A0t(12, i15, iArr3, iArr4);
                AnonymousClass6C8.A0t(13, i17, iArr3, iArr4);
                AnonymousClass6C8.A0t(14, i18, iArr3, iArr4);
                AnonymousClass6C8.A0t(15, i19, iArr3, iArr4);
                return;
            }
            throw AnonymousClass6CA.A0N();
        }
        throw AnonymousClass6CA.A0N();
    }

    public void A03(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        if (!this.A04) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("XSalsa20");
            throw AnonymousClass000.A0I(" not initialised", A0o);
        } else if (i + i2 > bArr.length) {
            throw C177248eJ.A01();
        } else if (i3 + i2 <= bArr2.length) {
            int i4 = this.A00 + i2;
            this.A00 = i4;
            if (i4 < i2 && i4 >= 0) {
                int i5 = this.A01 + 1;
                this.A01 = i5;
                if (i5 == 0) {
                    int i6 = this.A02 + 1;
                    this.A02 = i6;
                    if ((i6 & 32) != 0) {
                        throw new C177258eK("2^70 byte limit per IV would be exceeded; Change IV");
                    }
                }
            }
            for (int i7 = 0; i7 < i2; i7++) {
                byte[] bArr3 = this.A05;
                int i8 = this.A03;
                AnonymousClass6C7.A1T(bArr, bArr2, i7 + i, bArr3[i8], i7 + i3);
                int i9 = (i8 + 1) & 63;
                this.A03 = i9;
                if (i9 == 0) {
                    int[] iArr = this.A06;
                    int i10 = iArr[8] + 1;
                    iArr[8] = i10;
                    if (i10 == 0) {
                        AnonymousClass6C8.A1L(iArr, 9);
                    }
                    int[] iArr2 = this.A07;
                    A02(iArr, iArr2);
                    int i11 = 0;
                    for (int A1H : iArr2) {
                        AnonymousClass6C8.A1H(bArr3, A1H, i11);
                        i11 += 4;
                    }
                }
            }
        } else {
            throw C177198eE.A00();
        }
    }
}
