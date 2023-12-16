package X;

/* renamed from: X.7bu  reason: invalid class name and case insensitive filesystem */
public abstract class C153757bu {
    public C153757bu A00 = null;

    public C161907qo A00(String str, C150757Sc r9, int[] iArr, C158877kh[] r11, C158877kh[] r12, int i, boolean z) {
        C176028cL r4 = (C176028cL) this;
        C159077l4 r3 = new C159077l4();
        r3.A02(i >>> 24);
        int length = r11.length;
        r3.A04(length);
        for (int i2 = 0; i2 < length; i2++) {
            r3.A04(r11[i2].A00);
            r3.A04(r12[i2].A00 - r11[i2].A00);
            r3.A04(iArr[i2]);
        }
        if (r9 == null) {
            r3.A02(0);
        } else {
            byte[] bArr = r9.A01;
            int i3 = r9.A00;
            r3.A0A(bArr, i3, (bArr[i3] * 2) + 1);
        }
        C153727bq r5 = r4.A0l;
        C153727bq.A01(str, r3, r5);
        r3.A04(0);
        if (z) {
            C161907qo r1 = new C161907qo(r4.A0F, r3, r5, true);
            r4.A0F = r1;
            return r1;
        }
        C161907qo r13 = new C161907qo(r4.A0E, r3, r5, true);
        r4.A0E = r13;
        return r13;
    }

    public void A01(int i) {
        C176028cL r3 = (C176028cL) this;
        C159077l4 r1 = r3.A0k;
        r3.A02 = r1.A00;
        r1.A02(i);
        C158877kh r2 = r3.A0T;
        if (r2 != null) {
            if (r3.A0d == 3) {
                r2.A02.A0D((C161677qE) null, (C153727bq) null, i, 0);
            } else {
                int i2 = r3.A0B + C176028cL.A0n[i];
                if (i2 > r3.A07) {
                    r3.A07 = i2;
                }
                r3.A0B = i2;
            }
            if (i < 172) {
                return;
            }
            if (i <= 177 || i == 191) {
                r3.A0F();
            }
        }
    }

    public void A02(int i, int i2) {
        int i3;
        C176028cL r4 = (C176028cL) this;
        C159077l4 r1 = r4.A0k;
        r4.A02 = r1.A00;
        if (i > 255 || i2 > 127 || i2 < -128) {
            r1.A02(196);
            r1.A07(132, i);
            r1.A04(i2);
        } else {
            r1.A02(132);
            r1.A06(i, i2);
        }
        C158877kh r2 = r4.A0T;
        if (r2 != null && r4.A0d == 3) {
            r2.A02.A0D((C161677qE) null, (C153727bq) null, 132, i);
        }
        if (r4.A0d != 0 && (i3 = i + 1) > r4.A06) {
            r4.A06 = i3;
        }
    }

    public void A03(int i, int i2) {
        C176028cL r3 = (C176028cL) this;
        C159077l4 r1 = r3.A0k;
        r3.A02 = r1.A00;
        if (i == 17) {
            r1.A07(i, i2);
        } else {
            r1.A06(i, i2);
        }
        C158877kh r2 = r3.A0T;
        if (r2 == null) {
            return;
        }
        if (r3.A0d == 3) {
            r2.A02.A0D((C161677qE) null, (C153727bq) null, i, i2);
        } else if (i != 188) {
            int i3 = r3.A0B + 1;
            if (i3 > r3.A07) {
                r3.A07 = i3;
            }
            r3.A0B = i3;
        }
    }

    public void A04(int i, int i2) {
        C176028cL r5 = (C176028cL) this;
        int i3 = r5.A0d;
        short s = 1;
        if (i3 == 1) {
            for (AnonymousClass7OB r9 = r5.A0R; r9 != null; r9 = r9.A00) {
                C158877kh r7 = r9.A03;
                C158877kh r4 = r9.A02;
                for (C158877kh r6 = r9.A04; r6 != r4; r6 = r6.A03) {
                    if ((r6.A05 & 16) == 0) {
                        r6.A01 = new AnonymousClass7LW(r6.A01, r7, Integer.MAX_VALUE);
                    } else {
                        AnonymousClass7LW r2 = r6.A01.A00;
                        r2.A00 = new AnonymousClass7LW(r2.A00, r7, Integer.MAX_VALUE);
                    }
                }
            }
            if (r5.A0X) {
                C158877kh r62 = r5.A0U;
                r62.A02(1);
                short s2 = 1;
                do {
                    C158877kh r22 = r62;
                    do {
                        if ((r22.A05 & 16) != 0 && r22.A0A == s) {
                            C158877kh r1 = r22.A01.A00.A02;
                            if (r1.A0A == 0) {
                                s2 = (short) (s2 + 1);
                                r1.A02(s2);
                            }
                        }
                        r22 = r22.A03;
                    } while (r22 != null);
                    s = (short) (s + 1);
                } while (s <= s2);
                do {
                    if ((r62.A05 & 16) != 0) {
                        C158877kh r92 = r62.A01.A00.A02;
                        C158877kh r42 = C158877kh.A0D;
                        r92.A04 = r42;
                        C158877kh r23 = r42;
                        while (r92 != r42) {
                            C158877kh r72 = r92.A04;
                            r92.A04 = r23;
                            if (!((r92.A05 & 64) == 0 || r92.A0A == r62.A0A)) {
                                short s3 = r92.A09;
                                r92.A01 = new AnonymousClass7LW(r92.A01, r62.A01.A02, s3);
                            }
                            AnonymousClass7LW r3 = r92.A01;
                            AnonymousClass7LW r24 = r3;
                            while (r3 != null) {
                                if ((r92.A05 & 16) == 0 || r3 != r24.A00) {
                                    C158877kh r12 = r3.A02;
                                    if (r12.A04 == null) {
                                        r12.A04 = r72;
                                        r72 = r12;
                                    }
                                }
                                r3 = r3.A00;
                            }
                            r23 = r92;
                            r92 = r72;
                        }
                        while (r23 != r42) {
                            C158877kh r13 = r23.A04;
                            r23.A04 = null;
                            r23 = r13;
                        }
                    }
                    r62 = r62.A03;
                } while (r62 != null);
            }
            C158877kh r93 = r5.A0U;
            C158877kh r73 = C158877kh.A0D;
            r93.A04 = r73;
            int i4 = r5.A08;
            while (r93 != r73) {
                C158877kh r14 = r93.A04;
                short s4 = r93.A06;
                int i5 = r93.A08 + s4;
                if (i5 > i4) {
                    i4 = i5;
                }
                AnonymousClass7LW r32 = r93.A01;
                if ((r93.A05 & 16) != 0) {
                    r32 = r32.A00;
                }
                r93 = r14;
                while (r32 != null) {
                    C158877kh r25 = r32.A02;
                    if (r25.A04 == null) {
                        int i6 = r32.A01;
                        int i7 = i6 + s4;
                        if (i6 == Integer.MAX_VALUE) {
                            i7 = 1;
                        }
                        r25.A06 = (short) i7;
                        r25.A04 = r93;
                        r93 = r25;
                    }
                    r32 = r32.A00;
                }
            }
            r5.A08 = i4;
        } else if (i3 == 2) {
            r5.A08 = r5.A07;
        } else {
            r5.A08 = i;
            r5.A06 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r6 == 57) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(int r6, int r7) {
        /*
            r5 = this;
            r2 = r5
            X.8cL r2 = (X.C176028cL) r2
            X.7l4 r3 = r2.A0k
            int r0 = r3.A00
            r2.A02 = r0
            r4 = 169(0xa9, float:2.37E-43)
            r1 = 54
            r0 = 4
            if (r7 >= r0) goto L_0x0074
            if (r6 == r4) goto L_0x0081
            int r0 = r6 + -54
            int r0 = r0 << 2
            int r0 = r0 + 59
            if (r6 >= r1) goto L_0x0020
            int r0 = r6 + -21
            int r0 = r0 << 2
            int r0 = r0 + 26
        L_0x0020:
            int r0 = r0 + r7
            r3.A02(r0)
        L_0x0024:
            X.7kh r3 = r2.A0T
            if (r3 == 0) goto L_0x0033
            int r1 = r2.A0d
            r0 = 3
            if (r1 != r0) goto L_0x0052
            X.7pf r1 = r3.A02
            r0 = 0
            r1.A0D(r0, r0, r6, r7)
        L_0x0033:
            int r0 = r2.A0d
            if (r0 == 0) goto L_0x0051
            r0 = 22
            if (r6 == r0) goto L_0x0049
            r0 = 24
            if (r6 == r0) goto L_0x0049
            r0 = 55
            if (r6 == r0) goto L_0x0049
            r0 = 57
            int r1 = r7 + 1
            if (r6 != r0) goto L_0x004b
        L_0x0049:
            int r1 = r7 + 2
        L_0x004b:
            int r0 = r2.A06
            if (r1 <= r0) goto L_0x0051
            r2.A06 = r1
        L_0x0051:
            return
        L_0x0052:
            if (r6 != r4) goto L_0x0064
            short r0 = r3.A05
            r0 = r0 | 64
            short r0 = (short) r0
            r3.A05 = r0
            int r0 = r2.A0B
            short r0 = (short) r0
            r3.A09 = r0
            r2.A0F()
            goto L_0x0033
        L_0x0064:
            int r1 = r2.A0B
            int[] r0 = X.C176028cL.A0n
            r0 = r0[r6]
            int r1 = r1 + r0
            int r0 = r2.A07
            if (r1 <= r0) goto L_0x0071
            r2.A07 = r1
        L_0x0071:
            r2.A0B = r1
            goto L_0x0033
        L_0x0074:
            r0 = 256(0x100, float:3.59E-43)
            if (r7 < r0) goto L_0x0081
            r0 = 196(0xc4, float:2.75E-43)
            r3.A02(r0)
            r3.A07(r6, r7)
            goto L_0x0024
        L_0x0081:
            r3.A06(r6, r7)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153757bu.A05(int, int):void");
    }

    public void A06(int i, String str) {
        C176028cL r5 = (C176028cL) this;
        C159077l4 r1 = r5.A0k;
        r5.A02 = r1.A00;
        C153727bq r4 = r5.A0l;
        C161677qE A0A = r4.A0A(str, 7);
        r1.A07(i, A0A.A03);
        C158877kh r2 = r5.A0T;
        if (r2 == null) {
            return;
        }
        if (r5.A0d == 3) {
            r2.A02.A0D(A0A, r4, i, r5.A02);
        } else if (i == 187) {
            int i2 = r5.A0B + 1;
            if (i2 > r5.A07) {
                r5.A07 = i2;
            }
            r5.A0B = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.lang.Object r12) {
        /*
            r11 = this;
            r6 = r11
            X.8cL r6 = (X.C176028cL) r6
            X.7l4 r2 = r6.A0k
            int r0 = r2.A00
            r6.A02 = r0
            X.7bq r7 = r6.A0l
            X.7qE r8 = r7.A09(r12)
            int r9 = r8.A03
            int r1 = r8.A04
            r0 = 5
            r10 = 1
            r5 = 0
            if (r1 == r0) goto L_0x002d
            r0 = 6
            if (r1 == r0) goto L_0x002d
            r0 = 17
            if (r1 != r0) goto L_0x0050
            java.lang.String r0 = r8.A08
            char r1 = r0.charAt(r5)
            r0 = 74
            if (r1 == r0) goto L_0x002d
            r0 = 68
            if (r1 != r0) goto L_0x0050
        L_0x002d:
            r4 = 1
        L_0x002e:
            r3 = 18
            r0 = 20
            if (r4 != 0) goto L_0x003a
            r0 = 256(0x100, float:3.59E-43)
            if (r9 < r0) goto L_0x004c
            r0 = 19
        L_0x003a:
            r2.A07(r0, r9)
        L_0x003d:
            X.7kh r2 = r6.A0T
            if (r2 == 0) goto L_0x004b
            int r1 = r6.A0d
            r0 = 3
            if (r1 != r0) goto L_0x0052
            X.7pf r0 = r2.A02
            r0.A0D(r8, r7, r3, r5)
        L_0x004b:
            return
        L_0x004c:
            r2.A06(r3, r9)
            goto L_0x003d
        L_0x0050:
            r4 = 0
            goto L_0x002e
        L_0x0052:
            int r1 = r6.A0B
            if (r4 == 0) goto L_0x0057
            r10 = 2
        L_0x0057:
            int r1 = r1 + r10
            int r0 = r6.A07
            if (r1 <= r0) goto L_0x005e
            r6.A07 = r1
        L_0x005e:
            r6.A0B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153757bu.A07(java.lang.Object):void");
    }

    public void A08(String str, String str2, String str3, int i) {
        int i2;
        C176028cL r7 = (C176028cL) this;
        C159077l4 r1 = r7.A0k;
        r7.A02 = r1.A00;
        C153727bq r4 = r7.A0l;
        C161677qE A0C = r4.A0C(str, str2, str3, 9);
        r1.A07(i, A0C.A03);
        C158877kh r2 = r7.A0T;
        if (r2 != null) {
            int i3 = 0;
            if (r7.A0d == 3) {
                r2.A02.A0D(A0C, r4, i, 0);
                return;
            }
            char charAt = str3.charAt(0);
            int i4 = 1;
            int i5 = -2;
            int i6 = r7.A0B;
            switch (i) {
                case 178:
                    if (charAt == 'D' || charAt == 'J') {
                        i4 = 2;
                    }
                    i2 = i6 + i4;
                    break;
                case 179:
                    if (!(charAt == 'D' || charAt == 'J')) {
                        i5 = -1;
                        break;
                    }
                case 180:
                    if (charAt == 'D' || charAt == 'J') {
                        i3 = 1;
                    }
                    i2 = i6 + i3;
                    break;
                default:
                    if (charAt == 'D' || charAt == 'J') {
                        i5 = -3;
                        break;
                    }
            }
            i2 = i6 + i5;
            if (i2 > r7.A07) {
                r7.A07 = i2;
            }
            r7.A0B = i2;
        }
    }

    public void A09(String str, String str2, String str3, int i, boolean z) {
        C176028cL r3 = (C176028cL) this;
        C159077l4 r2 = r3.A0k;
        r3.A02 = r2.A00;
        C153727bq r4 = r3.A0l;
        int i2 = 10;
        if (z) {
            i2 = 11;
        }
        C161677qE A0C = r4.A0C(str, str2, str3, i2);
        int i3 = A0C.A03;
        if (i == 185) {
            r2.A07(185, i3);
            int i4 = A0C.A00;
            if (i4 == 0) {
                i4 = C162147rL.A00(A0C.A08);
                A0C.A00 = i4;
            }
            r2.A06(i4 >> 2, 0);
        } else {
            r2.A07(i, i3);
        }
        C158877kh r22 = r3.A0T;
        if (r22 == null) {
            return;
        }
        if (r3.A0d == 3) {
            r22.A02.A0D(A0C, r4, i, 0);
            return;
        }
        int i5 = A0C.A00;
        if (i5 == 0) {
            i5 = C162147rL.A00(A0C.A08);
            A0C.A00 = i5;
        }
        int i6 = r3.A0B + ((i5 & 3) - (i5 >> 2));
        if (i == 184) {
            i6++;
        }
        if (i6 > r3.A07) {
            r3.A07 = i6;
        }
        r3.A0B = i6;
    }

    public void A0A(C158877kh r15) {
        int A0D;
        C176028cL r8 = (C176028cL) this;
        boolean z = r8.A0W;
        C159077l4 r0 = r8.A0k;
        byte[] bArr = r0.A01;
        int i = r0.A00;
        short s = (short) (r15.A05 | 4);
        r15.A05 = s;
        r15.A00 = i;
        int[] iArr = r15.A0B;
        boolean z2 = false;
        if (iArr != null) {
            for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
                int i3 = iArr[i2 - 1];
                int i4 = iArr[i2];
                int i5 = i - i3;
                int i6 = 268435455 & i4;
                if ((i4 & -268435456) == 268435456) {
                    if (i5 < -32768 || i5 > 32767) {
                        byte b = bArr[i3] & 255;
                        int i7 = b + 20;
                        if (b < 198) {
                            i7 = b + 49;
                        }
                        bArr[i3] = (byte) i7;
                        z2 = true;
                    }
                    A0D = i6 + 1;
                    AnonymousClass6CA.A0f(bArr, i5, i6);
                } else {
                    int i8 = i6 + 1;
                    int A0D2 = AnonymousClass6CA.A0D(bArr, i5 >>> 24, i6, i8);
                    A0D = AnonymousClass6CA.A0D(bArr, i5 >>> 16, i8, A0D2);
                    AnonymousClass6CA.A0f(bArr, i5, A0D2);
                }
                bArr[A0D] = (byte) i5;
            }
        }
        r8.A0W = z | z2;
        if ((s & 1) == 0) {
            int i9 = r8.A0d;
            if (i9 == 3) {
                C158877kh r02 = r8.A0T;
                if (r02 != null) {
                    r02.A02.A01 = r15;
                    return;
                }
            } else if (i9 == 1) {
                C158877kh r1 = r8.A0T;
                if (r1 != null) {
                    r1.A08 = (short) r8.A07;
                    r8.A0I(r15, r8.A0B);
                }
                r8.A0T = r15;
                r8.A0B = 0;
                r8.A07 = 0;
                C158877kh r03 = r8.A0V;
                if (r03 != null) {
                    r03.A03 = r15;
                }
                r8.A0V = r15;
                return;
            } else if (!(i9 == 2 && r8.A0T == null)) {
                return;
            }
            r8.A0T = r15;
        }
    }

    public void A0B(C158877kh r13, int i) {
        boolean z;
        C176028cL r7 = (C176028cL) this;
        C159077l4 r6 = r7.A0k;
        int i2 = r6.A00;
        r7.A02 = i2;
        int i3 = i;
        if (i >= 200) {
            i3 = i - 33;
        }
        if ((r13.A05 & 4) == 0 || r13.A00 - i2 >= -32768) {
            if (i3 != i) {
                r6.A02(i);
                r13.A01(r6, r6.A00 - 1, true);
            } else {
                r6.A02(i3);
                r13.A01(r6, r6.A00 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                r6.A02(200);
            } else if (i3 == 168) {
                r6.A02(201);
            } else {
                int i4 = ((i3 + 1) ^ 1) - 1;
                if (i3 >= 198) {
                    i4 = i3 ^ 1;
                }
                r6.A02(i4);
                r6.A04(8);
                r6.A02(220);
                r7.A0W = true;
                z = true;
                r13.A01(r6, r6.A00 - 1, true);
            }
            z = false;
            r13.A01(r6, r6.A00 - 1, true);
        }
        C158877kh r62 = r7.A0T;
        if (r62 != null) {
            int i5 = r7.A0d;
            if (i5 == 3) {
                r62.A02.A0D((C161677qE) null, (C153727bq) null, i3, 0);
            } else if (i5 == 2) {
                r7.A0B += C176028cL.A0n[i3];
            } else if (i3 == 168) {
                short s = r13.A05;
                if ((s & 32) == 0) {
                    r13.A05 = (short) (s | 32);
                    r7.A0X = true;
                }
                r62.A05 = (short) (r62.A05 | 16);
                r7.A0I(r13, r7.A0B + 1);
                C158877kh r1 = new C158877kh();
                if (z) {
                    r1.A05 = (short) (r1.A05 | 2);
                }
                r7.A0A(r1);
                return;
            } else {
                int i6 = r7.A0B + C176028cL.A0n[i3];
                r7.A0B = i6;
                r7.A0I(r13, i6);
            }
            if (i3 == 167) {
                r7.A0F();
            }
        }
    }

    public void A0C(C158877kh r8, C158877kh[] r9, int i, int i2) {
        C176028cL r6 = (C176028cL) this;
        C159077l4 r5 = r6.A0k;
        r6.A02 = r5.A00;
        r5.A02(170);
        r5.A0A((byte[]) null, 0, (4 - (r5.A00 % 4)) % 4);
        r8.A01(r5, r6.A02, true);
        r5.A03(i);
        r5.A03(i2);
        for (C158877kh A01 : r9) {
            A01.A01(r5, r6.A02, true);
        }
        r6.A0J(r8, r9);
    }

    public abstract void A0D(Object[] objArr, int i, Object[] objArr2, int i2, int i3);
}
