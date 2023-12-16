package X;

/* renamed from: X.7bx  reason: invalid class name and case insensitive filesystem */
public class C153767bx {
    public final int A00;
    public final int A01;
    @Deprecated
    public final byte[] A02;
    public final byte[] A03;
    public final int[] A04;
    public final int[] A05;
    public final String[] A06;
    public final AnonymousClass7ZU[] A07;

    public final String A0E(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i2 + i;
        byte[] bArr = this.A03;
        int i6 = 0;
        while (i < i5) {
            int i7 = i + 1;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                i3 = i6 + 1;
                i4 = b & Byte.MAX_VALUE;
            } else {
                i3 = i6 + 1;
                if ((b & 224) == 192) {
                    i = i7 + 1;
                    cArr[i6] = (char) (((b & 31) << 6) + (bArr[i7] & 63));
                    i6 = i3;
                } else {
                    int i8 = i7 + 1;
                    i7 = i8 + 1;
                    i4 = ((b & 15) << 12) + ((bArr[i7] & 63) << 6) + (bArr[i8] & 63);
                }
            }
            cArr[i6] = (char) i4;
            i = i7;
            i6 = i3;
        }
        return new String(cArr, 0, i6);
    }

    public final C160407na A0F(String str, C160407na[] r6, int i, int i2) {
        C160407na r1;
        int length = r6.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                r1 = new C160407na(str);
                break;
            }
            r1 = r6[i3];
            if (r1.A02.equals(str)) {
                break;
            }
            i3++;
        }
        C160407na r3 = new C160407na(r1.A02);
        byte[] bArr = new byte[i2];
        r3.A01 = bArr;
        System.arraycopy(this.A03, i, bArr, 0, i2);
        return r3;
    }

    public static int A00(C153767bx r1, int i) {
        return r1.A04(i + 2);
    }

    public static int A01(C153767bx r2, int i) {
        return r2.A03(r2.A05[r2.A04(i + 1)]);
    }

    public final int A02() {
        int i = this.A00;
        byte[] bArr = this.A03;
        int A0F = i + 8 + (AnonymousClass6C8.A0F(bArr, i + 6) * 2);
        int A0F2 = AnonymousClass6C8.A0F(bArr, A0F);
        int i2 = A0F + 2;
        while (true) {
            int i3 = A0F2 - 1;
            if (A0F2 <= 0) {
                break;
            }
            int A0F3 = AnonymousClass6C8.A0F(bArr, i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = A0F3 - 1;
                A0F2 = i3;
                if (A0F3 > 0) {
                    int i5 = i2 + 2;
                    i2 += C18290x4.A07(bArr, bArr[i5], i5) + 6;
                    A0F3 = i4;
                }
            }
        }
        int A0F4 = AnonymousClass6C8.A0F(bArr, i2);
        int i6 = i2 + 2;
        while (true) {
            int i7 = A0F4 - 1;
            if (A0F4 <= 0) {
                return i6 + 2;
            }
            int A0F5 = AnonymousClass6C8.A0F(bArr, i6 + 6);
            i6 += 8;
            while (true) {
                int i8 = A0F5 - 1;
                A0F4 = i7;
                if (A0F5 > 0) {
                    int i9 = i6 + 2;
                    i6 += C18290x4.A07(bArr, bArr[i9], i9) + 6;
                    A0F5 = i8;
                }
            }
        }
    }

    public int A03(int i) {
        byte[] bArr = this.A03;
        return C18290x4.A07(bArr, bArr[i], i);
    }

    public int A04(int i) {
        return AnonymousClass6C8.A0F(this.A03, i);
    }

    public final int A05(String str, C161907qo r13, char[] cArr, int i) {
        C161907qo r1;
        int i2;
        Object obj;
        int i3 = 0;
        if (r13 == null) {
            byte b = this.A03[i] & 255;
            r1 = null;
            if (b == 64) {
                return A06((C161907qo) null, cArr, i + 3, true);
            }
            if (b != 91) {
                int i4 = i + 5;
                if (b != 101) {
                    return i + 3;
                }
                return i4;
            }
            i2 = i + 1;
        } else {
            byte[] bArr = this.A03;
            int i5 = i + 1;
            byte b2 = bArr[i] & 255;
            if (b2 != 64) {
                if (b2 != 70) {
                    if (b2 == 83) {
                        int i6 = this.A05[AnonymousClass6C8.A0F(bArr, i5)];
                        obj = Short.valueOf((short) C18290x4.A07(bArr, bArr[i6], i6));
                    } else if (b2 == 99) {
                        String A0C = A0C(cArr, i5);
                        obj = C162147rL.A03(A0C, 0, A0C.length());
                    } else if (b2 == 101) {
                        String A0C2 = A0C(cArr, i5);
                        String A0C3 = A0C(cArr, i5 + 2);
                        r13.A00++;
                        if (r13.A06) {
                            C153727bq.A01(str, r13.A04, r13.A05);
                        }
                        C159077l4 r2 = r13.A04;
                        C153727bq r12 = r13.A05;
                        r2.A07(101, r12.A02(A0C2));
                        C153727bq.A01(A0C3, r2, r12);
                        return i5 + 4;
                    } else if (b2 == 115) {
                        obj = A0C(cArr, i5);
                    } else if (!(b2 == 73 || b2 == 74)) {
                        if (b2 == 90) {
                            int i7 = this.A05[AnonymousClass6C8.A0F(bArr, i5)];
                            if (C18290x4.A07(bArr, bArr[i7], i7) == 0) {
                                obj = Boolean.FALSE;
                            } else {
                                obj = Boolean.TRUE;
                            }
                        } else if (b2 != 91) {
                            switch (b2) {
                                case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                                    int i8 = this.A05[AnonymousClass6C8.A0F(bArr, i5)];
                                    obj = Byte.valueOf((byte) C18290x4.A07(bArr, bArr[i8], i8));
                                    break;
                                case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                    int i9 = this.A05[AnonymousClass6C8.A0F(bArr, i5)];
                                    obj = Character.valueOf((char) C18290x4.A07(bArr, bArr[i9], i9));
                                    break;
                                case 68:
                                    break;
                                default:
                                    throw AnonymousClass6CA.A0N();
                            }
                        } else {
                            int A0F = AnonymousClass6C8.A0F(bArr, i5);
                            int i10 = i5 + 2;
                            if (A0F == 0) {
                                r1 = r13.A07(str);
                                i2 = i10 - 2;
                            } else {
                                byte b3 = bArr[i10] & 255;
                                if (b3 == 70) {
                                    float[] fArr = new float[A0F];
                                    while (i3 < A0F) {
                                        fArr[i3] = Float.intBitsToFloat(A01(this, i10));
                                        i10 += 3;
                                        i3++;
                                    }
                                    r13.A09(str, fArr);
                                    return i10;
                                } else if (b3 == 83) {
                                    short[] sArr = new short[A0F];
                                    while (i3 < A0F) {
                                        sArr[i3] = (short) A01(this, i10);
                                        i10 += 3;
                                        i3++;
                                    }
                                    r13.A09(str, sArr);
                                    return i10;
                                } else if (b3 == 90) {
                                    boolean[] zArr = new boolean[A0F];
                                    for (int i11 = 0; i11 < A0F; i11++) {
                                        zArr[i11] = AnonymousClass000.A1S(A01(this, i10));
                                        i10 += 3;
                                    }
                                    r13.A09(str, zArr);
                                    return i10;
                                } else if (b3 == 73) {
                                    int[] iArr = new int[A0F];
                                    while (i3 < A0F) {
                                        iArr[i3] = A01(this, i10);
                                        i10 += 3;
                                        i3++;
                                    }
                                    r13.A09(str, iArr);
                                    return i10;
                                } else if (b3 != 74) {
                                    switch (b3) {
                                        case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                                            byte[] bArr2 = new byte[A0F];
                                            while (i3 < A0F) {
                                                bArr2[i3] = (byte) A01(this, i10);
                                                i10 += 3;
                                                i3++;
                                            }
                                            r13.A09(str, bArr2);
                                            return i10;
                                        case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                            char[] cArr2 = new char[A0F];
                                            while (i3 < A0F) {
                                                cArr2[i3] = (char) A01(this, i10);
                                                i10 += 3;
                                                i3++;
                                            }
                                            r13.A09(str, cArr2);
                                            return i10;
                                        case 68:
                                            double[] dArr = new double[A0F];
                                            while (i3 < A0F) {
                                                dArr[i3] = Double.longBitsToDouble(A0A(this.A05[AnonymousClass6C8.A0F(bArr, i10 + 1)]));
                                                i10 += 3;
                                                i3++;
                                            }
                                            r13.A09(str, dArr);
                                            return i10;
                                        default:
                                            return A06(r13.A07(str), cArr, i10 - 2, false);
                                    }
                                } else {
                                    long[] jArr = new long[A0F];
                                    while (i3 < A0F) {
                                        jArr[i3] = A0A(this.A05[AnonymousClass6C8.A0F(bArr, i10 + 1)]);
                                        i10 += 3;
                                        i3++;
                                    }
                                    r13.A09(str, jArr);
                                    return i10;
                                }
                            }
                        }
                    }
                    r13.A09(str, obj);
                    return i5 + 2;
                }
                obj = A0B(cArr, AnonymousClass6C8.A0F(bArr, i5));
                r13.A09(str, obj);
                return i5 + 2;
            }
            String A0C4 = A0C(cArr, i5);
            r13.A00++;
            if (r13.A06) {
                C153727bq.A01(str, r13.A04, r13.A05);
            }
            C159077l4 r4 = r13.A04;
            C153727bq r22 = r13.A05;
            r4.A07(64, r22.A02(A0C4));
            r4.A04(0);
            return A06(new C161907qo((C161907qo) null, r4, r22, true), cArr, i5 + 2, true);
        }
        return A06(r1, cArr, i2, false);
    }

    public final int A06(C161907qo r5, char[] cArr, int i, boolean z) {
        int A0F = AnonymousClass6C8.A0F(this.A03, i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = A0F - 1;
                if (A0F <= 0) {
                    break;
                }
                i2 = A05((String) null, r5, cArr, i2);
                A0F = i3;
            }
        } else {
            while (true) {
                int i4 = A0F - 1;
                if (A0F <= 0) {
                    break;
                }
                i2 = A05(A0C(cArr, i2), r5, cArr, i2 + 2);
                A0F = i4;
            }
        }
        if (r5 != null) {
            r5.A08();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r8 = r8 & -256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        r7 = r15 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A07(X.AnonymousClass7QN r14, int r15) {
        /*
            r13 = this;
            byte[] r5 = r13.A03
            byte r0 = r5[r15]
            int r8 = X.C18290x4.A07(r5, r0, r15)
            int r1 = r8 >>> 24
            r0 = 1
            if (r1 == 0) goto L_0x0065
            if (r1 == r0) goto L_0x0065
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L_0x006b;
                case 17: goto L_0x006b;
                case 18: goto L_0x006b;
                case 19: goto L_0x0061;
                case 20: goto L_0x0061;
                case 21: goto L_0x0061;
                case 22: goto L_0x0065;
                case 23: goto L_0x006b;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r1) {
                case 64: goto L_0x0025;
                case 65: goto L_0x0025;
                case 66: goto L_0x006b;
                case 67: goto L_0x0023;
                case 68: goto L_0x0023;
                case 69: goto L_0x0023;
                case 70: goto L_0x0023;
                case 71: goto L_0x001c;
                case 72: goto L_0x001c;
                case 73: goto L_0x001c;
                case 74: goto L_0x001c;
                case 75: goto L_0x001c;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x001c:
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r8 = r8 & r0
            int r7 = r15 + 4
            goto L_0x006f
        L_0x0023:
            r8 = r8 & r0
            goto L_0x006d
        L_0x0025:
            r8 = r8 & r0
            int r0 = r15 + 1
            int r10 = X.AnonymousClass6C8.A0F(r5, r0)
            int r7 = r15 + 3
            X.7kh[] r11 = new X.C158877kh[r10]
            r14.A0H = r11
            X.7kh[] r9 = new X.C158877kh[r10]
            r14.A0G = r9
            int[] r6 = new int[r10]
            r14.A0C = r6
            r4 = 0
        L_0x003b:
            if (r4 >= r10) goto L_0x006f
            int r12 = X.AnonymousClass6C8.A0F(r5, r7)
            int r3 = A00(r13, r7)
            int r0 = r7 + 4
            int r2 = X.AnonymousClass6C8.A0F(r5, r0)
            int r7 = r7 + 6
            X.7kh[] r1 = r14.A0I
            X.7kh r0 = r13.A0G(r1, r12)
            r11[r4] = r0
            int r12 = r12 + r3
            X.7kh r0 = r13.A0G(r1, r12)
            r9[r4] = r0
            r6[r4] = r2
            int r4 = r4 + 1
            goto L_0x003b
        L_0x0061:
            r8 = r8 & r0
            int r7 = r15 + 1
            goto L_0x006f
        L_0x0065:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r0
            int r7 = r15 + 2
            goto L_0x006f
        L_0x006b:
            r8 = r8 & -256(0xffffffffffffff00, float:NaN)
        L_0x006d:
            int r7 = r15 + 3
        L_0x006f:
            r14.A06 = r8
            byte r0 = r5[r7]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x0080
            r0 = 0
        L_0x0078:
            r14.A0A = r0
            int r1 = r7 + 1
            int r0 = r2 * 2
            int r1 = r1 + r0
            return r1
        L_0x0080:
            X.7Sc r0 = new X.7Sc
            r0.<init>(r5, r7)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153767bx.A07(X.7QN, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r5[r8] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r5[r8] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return r1 + 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A08(char[] r4, java.lang.Object[] r5, X.C158877kh[] r6, int r7, int r8) {
        /*
            r3 = this;
            byte[] r2 = r3.A03
            int r1 = r7 + 1
            byte r0 = r2[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0028;
                case 2: goto L_0x0025;
                case 3: goto L_0x0022;
                case 4: goto L_0x001f;
                case 5: goto L_0x001c;
                case 6: goto L_0x0019;
                case 7: goto L_0x0030;
                case 8: goto L_0x0010;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x0010:
            int r0 = X.AnonymousClass6C8.A0F(r2, r1)
            X.7kh r0 = r3.A0G(r6, r0)
            goto L_0x0034
        L_0x0019:
            java.lang.Integer r0 = X.C186758vt.A06
            goto L_0x002d
        L_0x001c:
            java.lang.Integer r0 = X.C186758vt.A04
            goto L_0x002d
        L_0x001f:
            java.lang.Integer r0 = X.C186758vt.A03
            goto L_0x002d
        L_0x0022:
            java.lang.Integer r0 = X.C186758vt.A00
            goto L_0x002d
        L_0x0025:
            java.lang.Integer r0 = X.C186758vt.A01
            goto L_0x002d
        L_0x0028:
            java.lang.Integer r0 = X.C186758vt.A02
            goto L_0x002d
        L_0x002b:
            java.lang.Integer r0 = X.C186758vt.A05
        L_0x002d:
            r5[r8] = r0
            return r1
        L_0x0030:
            java.lang.String r0 = r3.A0D(r4, r1)
        L_0x0034:
            r5[r8] = r0
            int r1 = r1 + 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153767bx.A08(char[], java.lang.Object[], X.7kh[], int, int):int");
    }

    public final int A09(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        int i2 = iArr[i];
        byte[] bArr = this.A03;
        if ((bArr[i2] & 255) >= 67) {
            return AnonymousClass6C8.A0F(bArr, i2 + 1);
        }
        return -1;
    }

    public long A0A(int i) {
        byte[] bArr = this.A03;
        int i2 = i + 4;
        return (((long) C18290x4.A07(bArr, bArr[i], i)) << 32) | AnonymousClass6C8.A0M(C18290x4.A07(bArr, bArr[i2], i2));
    }

    public Object A0B(char[] cArr, int i) {
        int[] iArr = this.A05;
        int i2 = iArr[i];
        byte[] bArr = this.A03;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(C18290x4.A07(bArr, bArr[i2], i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(C18290x4.A07(bArr, bArr[i2], i2)));
            case 5:
                return Long.valueOf(A0A(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(A0A(i2)));
            case 7:
                String A0C = A0C(cArr, i2);
                int i3 = 12;
                if (A0C.charAt(0) == '[') {
                    i3 = 9;
                }
                return new C162147rL(i3, 0, A0C, A0C.length());
            case 8:
                return A0C(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        byte b2 = bArr[i2] & 255;
                        int i4 = iArr[AnonymousClass6C8.A0F(bArr, i2 + 1)];
                        int i5 = iArr[A00(this, i4)];
                        return new C152517Ze(A0D(cArr, i4), A0C(cArr, i5), A0C(cArr, i5 + 2), b2, AnonymousClass000.A1U(bArr[i4 - 1], 11));
                    case 16:
                        String A0C2 = A0C(cArr, i2);
                        return new C162147rL(11, 0, A0C2, A0C2.length());
                    case 17:
                        AnonymousClass7ZU[] r9 = this.A07;
                        AnonymousClass7ZU r2 = r9[i];
                        if (r2 != null) {
                            return r2;
                        }
                        int i6 = iArr[A00(this, i2)];
                        String A0C3 = A0C(cArr, i6);
                        String A0C4 = A0C(cArr, i6 + 2);
                        int i7 = this.A04[AnonymousClass6C8.A0F(bArr, i2)];
                        C152517Ze r5 = (C152517Ze) A0B(cArr, AnonymousClass6C8.A0F(bArr, i7));
                        int A002 = A00(this, i7);
                        Object[] objArr = new Object[A002];
                        int i8 = i7 + 4;
                        for (int i9 = 0; i9 < A002; i9++) {
                            objArr[i9] = A0B(cArr, AnonymousClass6C8.A0F(bArr, i8));
                            i8 += 2;
                        }
                        AnonymousClass7ZU r22 = new AnonymousClass7ZU(A0C3, A0C4, r5, objArr);
                        r9[i] = r22;
                        return r22;
                    default:
                        throw AnonymousClass6CA.A0N();
                }
        }
    }

    public String A0C(char[] cArr, int i) {
        byte[] bArr = this.A03;
        int A0F = AnonymousClass6C8.A0F(bArr, i);
        if (i == 0 || A0F == 0) {
            return null;
        }
        String[] strArr = this.A06;
        String str = strArr[A0F];
        if (str != null) {
            return str;
        }
        int i2 = this.A05[A0F];
        String A0E = A0E(cArr, i2 + 2, AnonymousClass6C8.A0F(bArr, i2));
        strArr[A0F] = A0E;
        return A0E;
    }

    public final String A0D(char[] cArr, int i) {
        return A0C(cArr, this.A05[AnonymousClass6C8.A0F(this.A03, i)]);
    }

    public final C158877kh A0G(C158877kh[] r3, int i) {
        if (r3[i] == null) {
            r3[i] = new C158877kh();
        }
        C158877kh r1 = r3[i];
        r1.A05 = (short) (r1.A05 & -2);
        return r1;
    }

    public final void A0H(AnonymousClass7QN r11, C153757bu r12, int i, boolean z) {
        C161907qo[] r8;
        byte[] bArr = this.A03;
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        C176028cL r122 = (C176028cL) r12;
        if (z) {
            r122.A0D = b;
        } else {
            r122.A01 = b;
        }
        char[] cArr = r11.A0B;
        for (int i3 = 0; i3 < b; i3++) {
            int A0F = AnonymousClass6C8.A0F(bArr, i2);
            i2 += 2;
            while (true) {
                int i4 = A0F - 1;
                if (A0F <= 0) {
                    break;
                }
                String A0C = A0C(cArr, i2);
                int i5 = i2 + 2;
                if (z) {
                    r8 = r122.A0b;
                    if (r8 == null) {
                        r8 = new C161907qo[C162147rL.A05(r122.A0i).length];
                        r122.A0b = r8;
                    }
                } else {
                    r8 = r122.A0a;
                    if (r8 == null) {
                        r8 = new C161907qo[C162147rL.A05(r122.A0i).length];
                        r122.A0a = r8;
                    }
                }
                C161907qo A012 = C161907qo.A01(A0C, r8[i3], r122.A0l);
                r8[i3] = A012;
                i2 = A06(A012, cArr, i5, true);
                A0F = i4;
            }
        }
    }

    public final int[] A0I(AnonymousClass7QN r14, C153757bu r15, int i, boolean z) {
        int i2;
        C161907qo A022;
        char[] cArr = r14.A0B;
        byte[] bArr = this.A03;
        int A0F = AnonymousClass6C8.A0F(bArr, i);
        int[] iArr = new int[A0F];
        int i3 = i + 2;
        for (int i4 = 0; i4 < A0F; i4++) {
            iArr[i4] = i3;
            int A072 = C18290x4.A07(bArr, bArr[i3], i3);
            int i5 = A072 >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        switch (i5) {
                            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
                            case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
                                int A0F2 = AnonymousClass6C8.A0F(bArr, i3 + 1);
                                i2 = i3 + 3;
                                while (true) {
                                    int i6 = A0F2 - 1;
                                    if (A0F2 <= 0) {
                                        break;
                                    } else {
                                        int A0F3 = AnonymousClass6C8.A0F(bArr, i2);
                                        int A002 = A00(this, i2);
                                        i2 += 6;
                                        C158877kh[] r0 = r14.A0I;
                                        A0G(r0, A0F3);
                                        A0G(r0, A0F3 + A002);
                                        A0F2 = i6;
                                    }
                                }
                            case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                            case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                            case 68:
                            case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                            case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                                break;
                            case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                            case 72:
                            case 73:
                            case AnonymousClass1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                            case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
                                i2 = i3 + 4;
                                break;
                            default:
                                throw AnonymousClass6CA.A0N();
                        }
                        break;
                }
            }
            i2 = i3 + 3;
            byte b = bArr[i2] & 255;
            C150757Sc r6 = null;
            if (i5 == 66) {
                if (b != 0) {
                    r6 = new C150757Sc(bArr, i2);
                }
                int i7 = i2 + (b * 2) + 1;
                String A0C = A0C(cArr, i7);
                int i8 = i7 + 2;
                int i9 = A072 & -256;
                C176028cL r2 = (C176028cL) r15;
                C153727bq r1 = r2.A0l;
                if (z) {
                    A022 = C161907qo.A02(A0C, r2.A0F, r1, r6, i9);
                    r2.A0F = A022;
                } else {
                    A022 = C161907qo.A02(A0C, r2.A0E, r1, r6, i9);
                    r2.A0E = A022;
                }
                i3 = A06(A022, cArr, i8, true);
            } else {
                i3 = A06((C161907qo) null, cArr, i2 + (b * 2) + 3, true);
            }
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r4 = r4 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C153767bx(byte[] r11) {
        /*
            r10 = this;
            r10.<init>()
            r10.A03 = r11
            r10.A02 = r11
            r0 = 8
            int r8 = X.AnonymousClass6C8.A0F(r11, r0)
            int[] r9 = new int[r8]
            r10.A05 = r9
            java.lang.String[] r0 = new java.lang.String[r8]
            r10.A06 = r0
            r4 = 10
            r7 = 0
            r6 = 0
            r5 = 0
            r0 = 1
        L_0x001b:
            if (r0 >= r8) goto L_0x004b
            int r3 = r0 + 1
            int r2 = r4 + 1
            r9[r0] = r2
            byte r0 = r11[r4]
            r1 = 3
            switch(r0) {
                case 1: goto L_0x002e;
                case 2: goto L_0x0029;
                case 3: goto L_0x003b;
                case 4: goto L_0x003b;
                case 5: goto L_0x003d;
                case 6: goto L_0x003d;
                case 7: goto L_0x0043;
                case 8: goto L_0x0043;
                case 9: goto L_0x003b;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                case 12: goto L_0x003b;
                case 13: goto L_0x0029;
                case 14: goto L_0x0029;
                case 15: goto L_0x0042;
                case 16: goto L_0x0043;
                case 17: goto L_0x0045;
                case 18: goto L_0x0039;
                case 19: goto L_0x0043;
                case 20: goto L_0x0043;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x002e:
            byte[] r0 = r10.A03
            int r0 = X.AnonymousClass6C8.A0F(r0, r2)
            int r1 = r1 + r0
            if (r1 <= r7) goto L_0x0043
            r7 = r1
            goto L_0x0043
        L_0x0039:
            r0 = r3
            goto L_0x0047
        L_0x003b:
            r0 = r3
            goto L_0x0048
        L_0x003d:
            int r3 = r3 + 1
            r1 = 9
            goto L_0x0043
        L_0x0042:
            r1 = 4
        L_0x0043:
            r0 = r3
            goto L_0x0049
        L_0x0045:
            r0 = r3
            r6 = 1
        L_0x0047:
            r5 = 1
        L_0x0048:
            r1 = 5
        L_0x0049:
            int r4 = r4 + r1
            goto L_0x001b
        L_0x004b:
            r10.A01 = r7
            r10.A00 = r4
            r4 = 0
            if (r6 == 0) goto L_0x009f
            X.7ZU[] r0 = new X.AnonymousClass7ZU[r8]
        L_0x0054:
            r10.A07 = r0
            if (r5 == 0) goto L_0x00a6
            char[] r6 = new char[r7]
            int r1 = r10.A02()
            int r2 = r1 + -2
            byte[] r0 = r10.A03
            int r5 = X.AnonymousClass6C8.A0F(r0, r2)
        L_0x0066:
            if (r5 <= 0) goto L_0x00a1
            java.lang.String r4 = r10.A0C(r6, r1)
            int r3 = r1 + 2
            byte[] r2 = r10.A03
            byte r0 = r2[r3]
            int r2 = X.C18290x4.A07(r2, r0, r3)
            int r1 = r1 + 6
            java.lang.String r0 = "BootstrapMethods"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x009b
            byte[] r0 = r10.A03
            int r3 = X.AnonymousClass6C8.A0F(r0, r1)
            int[] r4 = new int[r3]
            int r2 = r1 + 2
            r1 = 0
        L_0x008b:
            if (r1 >= r3) goto L_0x00a6
            r4[r1] = r2
            int r0 = A00(r10, r2)
            int r0 = r0 * 2
            int r0 = r0 + 4
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L_0x008b
        L_0x009b:
            int r1 = r1 + r2
            int r5 = r5 + -1
            goto L_0x0066
        L_0x009f:
            r0 = r4
            goto L_0x0054
        L_0x00a1:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x00a6:
            r10.A04 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153767bx.<init>(byte[]):void");
    }
}
