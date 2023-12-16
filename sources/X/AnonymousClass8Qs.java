package X;

/* renamed from: X.8Qs  reason: invalid class name */
public abstract class AnonymousClass8Qs implements C184668sK, C188608zC {
    public int A00;
    public long A01;
    public final byte[] A02;

    public static int A01(int i, int i2) {
        return ((i >>> 25) | (i << 7)) + i2;
    }

    public static int A02(int i, int i2) {
        return ((i >>> 26) | (i << 6)) + i2;
    }

    public static int A03(int i, int i2, int i3) {
        return ((~i2) & i3) | (i & i2);
    }

    public static int A04(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i2));
    }

    public static int A08(int i, int i2, int i3, int i4) {
        return i4 + (((~i2) & i3) | (i & i2));
    }

    public static int A09(int i, int i2, int i3, int i4) {
        return i4 + ((i ^ i2) ^ i3);
    }

    public static int A0A(int i, int i2, int i3, int i4) {
        return ((i >>> i2) | i3) + i4;
    }

    public static int A0B(int i, int i2, int i3, int i4, int i5) {
        return i4 + ((i & i2) | (i3 & (~i2))) + i5;
    }

    public static int A0C(int i, int i2, int i3, int i4, int i5) {
        return i4 + ((i ^ i2) ^ i3) + i5;
    }

    public static int A0D(int i, int i2, int i3, int i4, int i5) {
        return i4 + ((i2 | (~i)) ^ i3) + i5;
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        int i4 = this.A00;
        int i5 = 0;
        if (i4 != 0) {
            while (true) {
                if (i5 >= max) {
                    i3 = i5;
                    break;
                }
                byte[] bArr2 = this.A02;
                int i6 = i4;
                i4++;
                this.A00 = i4;
                int i7 = i5 + 1;
                AnonymousClass6CA.A0g(bArr, bArr2, i5 + i, i6);
                if (i4 == 4) {
                    A0S(bArr2, 0);
                    this.A00 = 0;
                    i4 = 0;
                    i3 = i7;
                    break;
                }
                i5 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            A0S(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.A02;
            int i9 = i4;
            i4++;
            this.A00 = i4;
            AnonymousClass6CA.A0g(bArr, bArr3, i3 + i, i9);
            i3++;
        }
        this.A01 += (long) max;
    }

    public static int A00(int i) {
        return (i >>> 22) | (i << 10);
    }

    public static int A05(int i, int i2, int i3) {
        int i4 = i + i2;
        return ((i4 >>> 17) | (i4 << 15)) + i3;
    }

    public static int A06(int i, int i2, int i3) {
        int i4 = i + i2;
        return ((i4 >>> 21) | (i4 << 11)) + i3;
    }

    public static int A07(int i, int i2, int i3) {
        int i4 = i + i2;
        return ((i4 >>> 23) | (i4 << 9)) + i3;
    }

    public static void A0E(int[] iArr, int i) {
        int i2 = iArr[i - 2];
        int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
        int i4 = iArr[i - 15];
        iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
    }

    public void A0Q() {
        int i;
        long j = this.A01 << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            BrT(b);
            if (this.A00 == 0) {
                break;
            }
            b = 0;
        }
        if (this instanceof C177318eQ) {
            C177318eQ r5 = (C177318eQ) this;
            int i2 = r5.A00;
            if (i2 > 14) {
                r5.A03[i2] = 0;
                r5.A00 = i2 + 1;
                r5.A0T();
            }
            while (true) {
                i = r5.A00;
                if (i >= 14) {
                    break;
                }
                r5.A03[i] = 0;
                r5.A00 = i + 1;
            }
            int[] iArr = r5.A03;
            int i3 = i + 1;
            iArr[i] = C86664Kz.A06(j);
            r5.A00 = i3 + 1;
            iArr[i3] = (int) j;
        } else if (this instanceof C177368eV) {
            C177368eV r52 = (C177368eV) this;
            if (r52.A08 > 14) {
                r52.A0T();
            }
            int[] iArr2 = r52.A09;
            iArr2[14] = C86664Kz.A06(j);
            iArr2[15] = (int) (j & -1);
        } else if (this instanceof C177358eU) {
            C177358eU r53 = (C177358eU) this;
            if (r53.A08 > 14) {
                r53.A0T();
            }
            int[] iArr3 = r53.A09;
            iArr3[14] = C86664Kz.A06(j);
            iArr3[15] = (int) (j & -1);
        } else if (this instanceof C177338eS) {
            C177338eS r54 = (C177338eS) this;
            if (r54.A05 > 14) {
                r54.A0T();
            }
            int[] iArr4 = r54.A06;
            iArr4[14] = C86664Kz.A06(j);
            iArr4[15] = (int) j;
        } else if (this instanceof C177328eR) {
            C177328eR r55 = (C177328eR) this;
            if (r55.A05 > 14) {
                r55.A0T();
            }
            int[] iArr5 = r55.A06;
            iArr5[14] = (int) (-1 & j);
            iArr5[15] = C86664Kz.A06(j);
        } else {
            C177348eT r56 = (C177348eT) this;
            if (r56.A04 > 14) {
                r56.A0T();
            }
            int[] iArr6 = r56.A05;
            iArr6[14] = (int) (-1 & j);
            iArr6[15] = C86664Kz.A06(j);
        }
        A0T();
    }

    public void A0R(AnonymousClass8Qs r5) {
        byte[] bArr = r5.A02;
        System.arraycopy(bArr, 0, this.A02, 0, bArr.length);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.8eT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.8eR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.8eU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.8eS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.8eV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.8eS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.8eQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.8eT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.8eT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.8eS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.8eS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.8eS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.8eS} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(byte[] r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C177318eQ
            if (r0 == 0) goto L_0x002a
            r3 = r7
            X.8eQ r3 = (X.C177318eQ) r3
            byte r0 = r8[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r0 << 24
            int r1 = r9 + 1
            byte r0 = r8[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 16
            int r0 = r0 << r4
            int r2 = X.AnonymousClass6C7.A0E(r8, r2, r0, r1)
            int[] r1 = r3.A03
            int r0 = r3.A00
            r1[r0] = r2
            int r0 = r0 + 1
            r3.A00 = r0
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r3.A0T()
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r7 instanceof X.C177368eV
            if (r0 == 0) goto L_0x004f
            r3 = r7
            X.8eV r3 = (X.C177368eV) r3
            byte r0 = r8[r9]
            int r2 = r0 << 24
            int r1 = r9 + 1
            byte r0 = r8[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 16
            int r0 = r0 << r4
            int r2 = X.AnonymousClass6C7.A0E(r8, r2, r0, r1)
            int[] r1 = r3.A09
            int r0 = r3.A08
            r1[r0] = r2
            int r0 = r0 + 1
            r3.A08 = r0
        L_0x004c:
            if (r0 != r4) goto L_0x0029
            goto L_0x0026
        L_0x004f:
            boolean r0 = r7 instanceof X.C177358eU
            if (r0 == 0) goto L_0x0072
            r3 = r7
            X.8eU r3 = (X.C177358eU) r3
            byte r0 = r8[r9]
            int r2 = r0 << 24
            int r1 = r9 + 1
            byte r0 = r8[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 16
            int r0 = r0 << r4
            int r2 = X.AnonymousClass6C7.A0E(r8, r2, r0, r1)
            int[] r1 = r3.A09
            int r0 = r3.A08
            r1[r0] = r2
            int r0 = r0 + 1
            r3.A08 = r0
            goto L_0x004c
        L_0x0072:
            boolean r0 = r7 instanceof X.C177338eS
            if (r0 == 0) goto L_0x0095
            r3 = r7
            X.8eS r3 = (X.C177338eS) r3
            byte r0 = r8[r9]
            int r2 = r0 << 24
            int r1 = r9 + 1
            byte r0 = r8[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 16
            int r0 = r0 << r4
            int r2 = X.AnonymousClass6C7.A0E(r8, r2, r0, r1)
            int[] r1 = r3.A06
            int r0 = r3.A05
            r1[r0] = r2
            int r0 = r0 + 1
            r3.A05 = r0
            goto L_0x004c
        L_0x0095:
            boolean r0 = r7 instanceof X.C177328eR
            if (r0 == 0) goto L_0x00c9
            r6 = r7
            X.8eR r6 = (X.C177328eR) r6
            int[] r5 = r6.A06
            int r4 = r6.A05
            int r3 = r4 + 1
            r6.A05 = r3
            byte r0 = r8[r9]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r9 + 1
            int r2 = X.AnonymousClass6C8.A0G(r8, r0, r1)
            int r0 = r9 + 2
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 16
            int r0 = r0 << r1
            r2 = r2 | r0
            int r0 = r9 + 3
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r2
            r5[r4] = r0
            if (r3 != r1) goto L_0x0029
        L_0x00c5:
            r6.A0T()
            return
        L_0x00c9:
            r6 = r7
            X.8eT r6 = (X.C177348eT) r6
            int[] r5 = r6.A05
            int r4 = r6.A04
            int r3 = r4 + 1
            r6.A04 = r3
            byte r0 = r8[r9]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r9 + 1
            int r2 = X.AnonymousClass6C8.A0G(r8, r0, r1)
            int r0 = r9 + 2
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 16
            int r0 = r0 << r1
            r2 = r2 | r0
            int r0 = r9 + 3
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r2
            r5[r4] = r0
            if (r3 != r1) goto L_0x0029
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Qs.A0S(byte[], int):void");
    }

    public void A0T() {
        int[] iArr;
        int[] iArr2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C177318eQ r4 = (C177318eQ) this;
        int i8 = 0;
        do {
            iArr = r4.A02;
            i8 = AnonymousClass6C9.A0J(r4.A03, iArr, i8);
        } while (i8 < 16);
        int i9 = 16;
        do {
            int i10 = iArr[i9 - 3];
            int i11 = (i10 >>> 17) | (i10 << 15);
            int i12 = iArr[i9 - 13];
            int i13 = i11 ^ (iArr[i9 - 16] ^ iArr[i9 - 9]);
            iArr[i9] = (((i13 ^ ((i13 << 15) | (i13 >>> 17))) ^ ((i13 << 23) | (i13 >>> 9))) ^ ((i12 >>> 25) | (i12 << 7))) ^ iArr[i9 - 6];
            i9++;
        } while (i9 < 68);
        int[] iArr3 = r4.A01;
        int i14 = iArr3[0];
        int i15 = i14;
        int i16 = iArr3[1];
        int i17 = iArr3[2];
        int i18 = iArr3[3];
        int i19 = iArr3[4];
        int i20 = iArr3[5];
        int i21 = iArr3[6];
        int i22 = iArr3[7];
        int i23 = 0;
        do {
            int i24 = (i14 << 12) | (i14 >>> 20);
            iArr2 = C177318eQ.A04;
            int i25 = i24 + i19 + iArr2[i23];
            int i26 = (i25 << 7) | (i25 >>> 25);
            int i27 = iArr[i23];
            int i28 = ((i14 ^ i16) ^ i17) + i18 + (i24 ^ i26) + (iArr[i23 + 4] ^ i27);
            i = i21;
            int i29 = ((i19 ^ i20) ^ i21) + i22 + i26 + i27;
            int i30 = (i20 << 19) | (i20 >>> 13);
            i2 = (i29 ^ ((i29 << 9) | (i29 >>> 23))) ^ ((i29 << 17) | (i29 >>> 15));
            i23++;
            i20 = i19;
            i19 = i2;
            i18 = i17;
            i17 = (i16 << 9) | (i16 >>> 23);
            i22 = i21;
            i21 = i30;
            i16 = i14;
            i14 = i28;
        } while (i23 < 16);
        int i31 = 16;
        do {
            int i32 = (i14 << 12) | (i14 >>> 20);
            int i33 = i32 + i2 + iArr2[i31];
            int i34 = (i33 << 7) | (i33 >>> 25);
            int i35 = i34 ^ i32;
            int i36 = iArr[i31];
            i3 = i17;
            i4 = ((i14 & i17) | (i14 & i16) | (i16 & i17)) + i18 + i35 + (i36 ^ iArr[i31 + 4]);
            i5 = i21;
            int A03 = A03(i20, i2, i21) + i + i34 + i36;
            i6 = (i16 >>> 23) | (i16 << 9);
            i7 = (i20 << 19) | (i20 >>> 13);
            i2 = (A03 ^ ((A03 << 9) | (A03 >>> 23))) ^ ((A03 << 17) | (A03 >>> 15));
            i31++;
            i20 = i19;
            i19 = i2;
            i18 = i3;
            i17 = i6;
            i16 = i14;
            i14 = i4;
            i = i21;
            i21 = i7;
        } while (i31 < 64);
        iArr3[0] = i4 ^ i15;
        iArr3[1] = iArr3[1] ^ i16;
        iArr3[2] = iArr3[2] ^ i6;
        iArr3[3] = iArr3[3] ^ i3;
        iArr3[4] = iArr3[4] ^ i2;
        iArr3[5] = iArr3[5] ^ i20;
        iArr3[6] = i7 ^ iArr3[6];
        iArr3[7] = iArr3[7] ^ i5;
        r4.A00 = 0;
    }

    public int B51() {
        return 64;
    }

    public void BrT(byte b) {
        byte[] bArr = this.A02;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            A0S(bArr, 0);
            this.A00 = 0;
        }
        this.A01++;
    }

    public void reset() {
        this.A01 = 0;
        this.A00 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A02;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public AnonymousClass8Qs(AnonymousClass8Qs r2) {
        this.A02 = new byte[4];
        A0R(r2);
    }

    public AnonymousClass8Qs() {
        this.A02 = new byte[4];
        this.A00 = 0;
    }
}
