package X;

import java.util.Arrays;
import java.util.Vector;

/* renamed from: X.8Qd  reason: invalid class name and case insensitive filesystem */
public class C173428Qd implements C188618zD {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Vector A05;
    public C185768uD A06;
    public C185768uD A07;
    public boolean A08;
    public byte[] A09;
    public byte[] A0A = null;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E = new byte[16];
    public byte[] A0F = new byte[16];
    public byte[] A0G = new byte[24];
    public byte[] A0H;
    public byte[] A0I;
    public byte[] A0J;
    public byte[] A0K;
    public byte[] A0L;

    public void BhZ(byte[] bArr, int i, int i2) {
        Vector vector;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A0I;
            int i4 = this.A00;
            AnonymousClass6CA.A0g(bArr, bArr2, i + i3, i4);
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i5 == bArr2.length) {
                long j = this.A03 + 1;
                this.A03 = j;
                int i6 = 0;
                if (j == 0) {
                    i6 = 64;
                } else {
                    while ((1 & j) == 0) {
                        i6++;
                        j >>>= 1;
                    }
                }
                while (true) {
                    int size = this.A05.size();
                    vector = this.A05;
                    if (i6 < size) {
                        break;
                    }
                    vector.addElement(A01((byte[]) vector.lastElement()));
                }
                byte[] bArr3 = this.A0D;
                A00(bArr3, (byte[]) vector.elementAt(i6));
                byte[] bArr4 = this.A0I;
                A00(bArr4, bArr3);
                this.A06.Bha(bArr4, bArr4, 0, 0);
                A00(this.A0H, this.A0I);
                this.A00 = 0;
            }
        }
    }

    public static void A00(byte[] bArr, byte[] bArr2) {
        int i = 15;
        do {
            AnonymousClass6C8.A1J(bArr, bArr2, i);
            i--;
        } while (i >= 0);
    }

    public static byte[] A01(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                byte b = bArr[i] & 255;
                AnonymousClass6C8.A0u(i2, bArr2, b << 1, i);
                i2 = (b >>> 7) & 1;
            } else {
                AnonymousClass6CA.A0e(135 >>> ((1 - i2) << 3), bArr2, bArr2[15], 15);
                return bArr2;
            }
        }
    }

    public int B24(byte[] bArr, int i) {
        byte[] bArr2;
        if (!this.A08) {
            int i2 = this.A02;
            int i3 = this.A01;
            if (i2 >= i3) {
                int i4 = i2 - i3;
                this.A02 = i4;
                bArr2 = new byte[i3];
                System.arraycopy(this.A0L, i4, bArr2, 0, i3);
            } else {
                throw new C177188eD("data too short");
            }
        } else {
            bArr2 = null;
        }
        int i5 = this.A00;
        if (i5 > 0) {
            byte[] bArr3 = this.A0I;
            byte b = Byte.MIN_VALUE;
            while (true) {
                bArr3[i5] = b;
                i5++;
                if (i5 >= 16) {
                    break;
                }
                b = 0;
            }
            byte[] bArr4 = this.A0B;
            byte[] bArr5 = this.A0D;
            A00(bArr5, bArr4);
            A00(bArr3, bArr5);
            this.A06.Bha(bArr3, bArr3, 0, 0);
            A00(this.A0H, this.A0I);
        }
        int i6 = this.A02;
        if (i6 > 0) {
            if (this.A08) {
                byte[] bArr6 = this.A0L;
                byte b2 = Byte.MIN_VALUE;
                while (true) {
                    bArr6[i6] = b2;
                    i6++;
                    if (i6 >= 16) {
                        break;
                    }
                    b2 = 0;
                }
                A00(this.A09, bArr6);
            }
            byte[] bArr7 = this.A0E;
            A00(bArr7, this.A0B);
            byte[] bArr8 = new byte[16];
            this.A06.Bha(bArr7, bArr8, 0, 0);
            byte[] bArr9 = this.A0L;
            A00(bArr9, bArr8);
            int length = bArr.length;
            int i7 = this.A02;
            if (length >= i + i7) {
                System.arraycopy(bArr9, 0, bArr, i, i7);
                if (!this.A08) {
                    byte[] bArr10 = this.A0L;
                    int i8 = this.A02;
                    byte b3 = Byte.MIN_VALUE;
                    while (true) {
                        bArr10[i8] = b3;
                        i8++;
                        if (i8 >= 16) {
                            break;
                        }
                        b3 = 0;
                    }
                    A00(this.A09, bArr10);
                }
            } else {
                throw new C177198eE("Output buffer too short");
            }
        }
        byte[] bArr11 = this.A09;
        byte[] bArr12 = this.A0E;
        A00(bArr11, bArr12);
        A00(bArr11, this.A0C);
        C185768uD r6 = this.A06;
        r6.Bha(bArr11, bArr11, 0, 0);
        byte[] bArr13 = this.A09;
        A00(bArr13, this.A0H);
        int i9 = this.A01;
        byte[] bArr14 = new byte[i9];
        this.A0K = bArr14;
        System.arraycopy(bArr13, 0, bArr14, 0, i9);
        int i10 = this.A02;
        if (this.A08) {
            int length2 = bArr.length;
            int i11 = i + i10;
            int i12 = this.A01;
            if (length2 >= i11 + i12) {
                System.arraycopy(this.A0K, 0, bArr, i11, i12);
                i10 += this.A01;
            } else {
                throw new C177198eE("Output buffer too short");
            }
        } else if (!C161007oo.A01(this.A0K, bArr2)) {
            throw new C177188eD("mac check in OCB failed");
        }
        r6.reset();
        this.A07.reset();
        byte[] bArr15 = this.A0I;
        if (bArr15 != null) {
            Arrays.fill(bArr15, (byte) 0);
        }
        byte[] bArr16 = this.A0L;
        if (bArr16 != null) {
            Arrays.fill(bArr16, (byte) 0);
        }
        this.A00 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        byte[] bArr17 = this.A0D;
        if (bArr17 != null) {
            Arrays.fill(bArr17, (byte) 0);
        }
        byte[] bArr18 = this.A0H;
        if (bArr18 != null) {
            Arrays.fill(bArr18, (byte) 0);
        }
        System.arraycopy(this.A0F, 0, bArr12, 0, 16);
        byte[] bArr19 = this.A09;
        if (bArr19 != null) {
            Arrays.fill(bArr19, (byte) 0);
        }
        byte[] bArr20 = this.A0J;
        if (bArr20 != null) {
            BhZ(bArr20, 0, bArr20.length);
        }
        return i10;
    }

    public byte[] B9G() {
        byte[] bArr = this.A0K;
        if (bArr == null) {
            return new byte[this.A01];
        }
        return C161007oo.A02(bArr);
    }

    public int BAJ(int i) {
        int i2 = i + this.A02;
        boolean z = this.A08;
        int i3 = this.A01;
        if (z) {
            return i2 + i3;
        }
        int i4 = i2;
        int i5 = i2 - i3;
        if (i4 < i3) {
            return 0;
        }
        return i5;
    }

    public C185768uD BE1() {
        return this.A07;
    }

    public int BE4(int i) {
        int i2 = i + this.A02;
        if (!this.A08) {
            int i3 = this.A01;
            int i4 = i2;
            i2 -= i3;
            if (i4 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % 16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BFw(X.C834748n r10, boolean r11) {
        /*
            r9 = this;
            boolean r8 = r9.A08
            r9.A08 = r11
            r2 = 0
            r9.A0K = r2
            boolean r0 = r10 instanceof X.AnonymousClass8QK
            r5 = 16
            if (r0 == 0) goto L_0x00c9
            X.8QK r10 = (X.AnonymousClass8QK) r10
            byte[] r0 = r10.A03
            byte[] r6 = X.C161007oo.A02(r0)
            byte[] r0 = r10.A02
            byte[] r0 = X.C161007oo.A02(r0)
            r9.A0J = r0
            int r3 = r10.A00
            r0 = 64
            if (r3 < r0) goto L_0x012e
            r0 = 128(0x80, float:1.794E-43)
            if (r3 > r0) goto L_0x012e
            int r0 = r3 % 8
            if (r0 != 0) goto L_0x012e
            int r1 = r3 / 8
            r9.A01 = r1
            X.8QN r7 = r10.A01
        L_0x0031:
            byte[] r0 = new byte[r5]
            r9.A0I = r0
            int r0 = r1 + 16
            if (r11 == 0) goto L_0x003b
            r0 = 16
        L_0x003b:
            byte[] r0 = new byte[r0]
            r9.A0L = r0
            r4 = 0
            if (r6 != 0) goto L_0x0044
            byte[] r6 = new byte[r4]
        L_0x0044:
            int r3 = r6.length
            r0 = 15
            if (r3 > r0) goto L_0x0127
            r1 = 1
            if (r7 == 0) goto L_0x00c0
            X.8uD r0 = r9.A06
            r0.BFw(r7, r1)
            X.8uD r0 = r9.A07
            r0.BFw(r7, r11)
            r9.A0A = r2
        L_0x0058:
            byte[] r0 = new byte[r5]
            r9.A0B = r0
            X.8uD r2 = r9.A06
            r2.Bha(r0, r0, r4, r4)
            byte[] r0 = r9.A0B
            byte[] r0 = A01(r0)
            r9.A0C = r0
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r9.A05 = r1
            byte[] r0 = r9.A0C
            byte[] r0 = A01(r0)
            r1.addElement(r0)
            byte[] r1 = new byte[r5]
            int r0 = 16 - r3
            r7 = 0
            java.lang.System.arraycopy(r6, r4, r1, r0, r3)
            int r0 = r9.A01
            int r0 = r0 << 4
            byte r0 = (byte) r0
            r1[r4] = r0
            r8 = 15
            int r3 = 15 - r3
            byte r0 = r1[r3]
            r0 = r0 | 1
            byte r0 = (byte) r0
            r1[r3] = r0
            byte r0 = r1[r8]
            r6 = r0 & 63
            r0 = r0 & 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0
            r1[r8] = r0
            byte[] r0 = r9.A0A
            if (r0 == 0) goto L_0x00a6
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x00db
        L_0x00a6:
            byte[] r3 = new byte[r5]
            r9.A0A = r1
            r2.Bha(r1, r3, r4, r4)
            byte[] r2 = r9.A0G
            java.lang.System.arraycopy(r3, r4, r2, r4, r5)
        L_0x00b2:
            int r1 = r7 + 16
            byte r0 = r3[r7]
            int r7 = r7 + 1
            X.AnonymousClass6C7.A1T(r3, r2, r7, r0, r1)
            r0 = 8
            if (r7 >= r0) goto L_0x00db
            goto L_0x00b2
        L_0x00c0:
            if (r8 == r11) goto L_0x0058
            java.lang.String r0 = "cannot change encrypting state without providing key."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00c9:
            boolean r0 = r10 instanceof X.AnonymousClass8QP
            if (r0 == 0) goto L_0x0139
            X.8QP r10 = (X.AnonymousClass8QP) r10
            byte[] r6 = r10.A01
            r9.A0J = r2
            r9.A01 = r5
            r1 = 16
            X.48n r7 = r10.A00
            goto L_0x0031
        L_0x00db:
            int r8 = r6 % 8
            int r7 = r6 / 8
            if (r8 != 0) goto L_0x010c
            byte[] r0 = r9.A0G
            byte[] r6 = r9.A0F
            java.lang.System.arraycopy(r0, r7, r6, r4, r5)
        L_0x00e8:
            r9.A00 = r4
            r9.A02 = r4
            r0 = 0
            r9.A03 = r0
            r9.A04 = r0
            byte[] r0 = new byte[r5]
            r9.A0D = r0
            byte[] r0 = new byte[r5]
            r9.A0H = r0
            byte[] r0 = r9.A0E
            java.lang.System.arraycopy(r6, r4, r0, r4, r5)
            byte[] r0 = new byte[r5]
            r9.A09 = r0
            byte[] r1 = r9.A0J
            if (r1 == 0) goto L_0x010b
            int r0 = r1.length
            r9.BhZ(r1, r4, r0)
        L_0x010b:
            return
        L_0x010c:
            r3 = 0
        L_0x010d:
            byte[] r1 = r9.A0G
            byte r0 = r1[r7]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 1
            byte r0 = r1[r7]
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte[] r6 = r9.A0F
            int r2 = r2 << r8
            int r0 = 8 - r8
            int r1 = r1 >>> r0
            X.AnonymousClass6C8.A0u(r1, r6, r2, r3)
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x00e8
            goto L_0x010d
        L_0x0127:
            java.lang.String r0 = "IV must be no more than 15 bytes"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid value for MAC size: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r3)
            throw r0
        L_0x0139:
            java.lang.String r0 = "invalid parameters passed to OCB"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173428Qd.BFw(X.48n, boolean):void");
    }

    public int Bhb(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Vector vector;
        byte[] bArr3 = bArr;
        int i4 = i2;
        if (bArr3.length >= i + i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                byte[] bArr4 = this.A0L;
                int i7 = this.A02;
                AnonymousClass6CA.A0g(bArr3, bArr4, i + i6, i7);
                int i8 = i7 + 1;
                this.A02 = i8;
                if (i8 == bArr4.length) {
                    int i9 = i3 + i5;
                    byte[] bArr5 = bArr2;
                    if (bArr5.length >= i9 + 16) {
                        if (this.A08) {
                            A00(this.A09, bArr4);
                            this.A02 = 0;
                        }
                        byte[] bArr6 = this.A0E;
                        long j = this.A04 + 1;
                        this.A04 = j;
                        int i10 = 0;
                        if (j == 0) {
                            i10 = 64;
                        } else {
                            while ((1 & j) == 0) {
                                i10++;
                                j >>>= 1;
                            }
                        }
                        while (true) {
                            int size = this.A05.size();
                            vector = this.A05;
                            if (i10 < size) {
                                break;
                            }
                            vector.addElement(A01((byte[]) vector.lastElement()));
                        }
                        A00(bArr6, (byte[]) vector.elementAt(i10));
                        byte[] bArr7 = this.A0L;
                        A00(bArr7, bArr6);
                        this.A07.Bha(bArr7, bArr7, 0, 0);
                        byte[] bArr8 = this.A0L;
                        A00(bArr8, bArr6);
                        System.arraycopy(bArr8, 0, bArr5, i9, 16);
                        if (!this.A08) {
                            byte[] bArr9 = this.A09;
                            byte[] bArr10 = this.A0L;
                            A00(bArr9, bArr10);
                            System.arraycopy(bArr10, 16, bArr10, 0, this.A01);
                            this.A02 = this.A01;
                        }
                        i5 += 16;
                    } else {
                        throw new C177198eE("Output buffer too short");
                    }
                }
            }
            return i5;
        }
        throw new C177248eJ("Input buffer too short");
    }

    public C173428Qd(C185768uD r3, C185768uD r4) {
        if (r3.B4g() != 16) {
            throw AnonymousClass001.A0c("'hashCipher' must have a block size of 16");
        } else if (r4.B4g() != 16) {
            throw AnonymousClass001.A0c("'mainCipher' must have a block size of 16");
        } else if (r3.B4N().equals(r4.B4N())) {
            this.A06 = r3;
            this.A07 = r4;
        } else {
            throw AnonymousClass001.A0c("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A07);
        return AnonymousClass000.A0X("/OCB", A0o);
    }
}
