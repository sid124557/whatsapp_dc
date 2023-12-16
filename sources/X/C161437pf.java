package X;

/* renamed from: X.7pf  reason: invalid class name and case insensitive filesystem */
public class C161437pf {
    public int A00;
    public C158877kh A01;
    public short A02;
    public short A03;
    public int[] A04;
    public int[] A05;
    public int[] A06;
    public int[] A07;
    public int[] A08;

    public final void A0A(String str, C153727bq r6) {
        int i = 0;
        if (str.charAt(0) == '(') {
            int i2 = 1;
            while (str.charAt(i2) != ')') {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i3 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i2 = Math.max(i3, str.indexOf(59, i3) + 1);
                } else {
                    i2 = i3;
                }
            }
            i = i2 + 1;
        }
        int A012 = A01(str, r6, i);
        if (A012 != 0) {
            A07(A012);
            if (A012 == 4194308 || A012 == 4194307) {
                A07(4194304);
            }
        }
    }

    public static int A00(Object obj, C153727bq r5) {
        int A042;
        int i;
        if (obj instanceof Integer) {
            A042 = AnonymousClass001.A0K(obj);
            i = 4194304;
        } else if (obj instanceof String) {
            String str = (String) obj;
            int i2 = 12;
            if (str.charAt(0) == '[') {
                i2 = 9;
            }
            return A01(new C162147rL(i2, 0, str, str.length()).A06(), r5, 0);
        } else {
            A042 = r5.A04("", ((C158877kh) obj).A00);
            i = 12582912;
        }
        return A042 | i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        if (r6 == 8388608) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C153727bq r15, int[] r16, int r17, int r18) {
        /*
            r6 = r17
            r3 = r16[r18]
            r4 = 0
            if (r3 == r6) goto L_0x001a
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r17
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L_0x0016
            if (r3 == r1) goto L_0x001a
            r6 = 4194309(0x400005, float:5.877479E-39)
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            r16[r18] = r6
        L_0x001a:
            return
        L_0x001b:
            r9 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r8 = r3 & r9
            r2 = 4194304(0x400000, float:5.877472E-39)
            r7 = 62914560(0x3c00000, float:1.1284746E-36)
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r8 != 0) goto L_0x003d
            r0 = r3 & r7
            if (r0 == r5) goto L_0x003d
            if (r3 != r1) goto L_0x0038
            r0 = r6 & r9
            if (r0 != 0) goto L_0x0037
            r0 = r6 & r7
            if (r0 == r5) goto L_0x0037
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x0037:
            r2 = r6
        L_0x0038:
            if (r2 == r3) goto L_0x001a
            r16[r18] = r2
            return
        L_0x003d:
            if (r6 == r1) goto L_0x001a
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r0 = r6 & r1
            r1 = r1 & r3
            java.lang.String r10 = "java/lang/Object"
            if (r0 != r1) goto L_0x00ef
            r0 = r3 & r7
            if (r0 != r5) goto L_0x00ec
            r2 = r6 & r9
            r2 = r2 | r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r5
            r5 = r5 & r3
            r7 = 32
            if (r6 >= r5) goto L_0x00e8
            long r12 = (long) r6
            long r0 = (long) r5
        L_0x005a:
            long r0 = r0 << r7
            long r12 = r12 | r0
            int r1 = r6 + r5
            r11 = 130(0x82, float:1.82E-43)
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r14 = r11 + r1
            r14 = r14 & r0
            X.7qE r7 = X.C153727bq.A00(r15, r14)
        L_0x006a:
            if (r7 == 0) goto L_0x0081
            int r0 = r7.A04
            if (r0 != r11) goto L_0x007e
            int r0 = r7.A02
            if (r0 != r14) goto L_0x007e
            long r0 = r7.A05
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x007e
            int r0 = r7.A00
        L_0x007c:
            r2 = r2 | r0
            goto L_0x0038
        L_0x007e:
            X.7qE r7 = r7.A01
            goto L_0x006a
        L_0x0081:
            X.7qE[] r1 = r15.A09
            r0 = r1[r6]
            java.lang.String r8 = r0.A08
            r0 = r1[r5]
            java.lang.String r7 = r0.A08
            X.7a9 r0 = r15.A0A
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r6 = r0.getClassLoader()
            r5 = 46
            r1 = 47
            java.lang.String r0 = r8.replace(r1, r5)     // Catch:{ ClassNotFoundException -> 0x0115 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r6)     // Catch:{ ClassNotFoundException -> 0x0115 }
            java.lang.String r9 = r7.replace(r1, r5)     // Catch:{ ClassNotFoundException -> 0x010e }
            java.lang.Class r4 = java.lang.Class.forName(r9, r4, r6)     // Catch:{ ClassNotFoundException -> 0x010e }
            boolean r6 = r0.isAssignableFrom(r4)
            if (r6 != 0) goto L_0x00b6
            boolean r6 = r4.isAssignableFrom(r0)
            if (r6 == 0) goto L_0x00c7
            r8 = r7
        L_0x00b6:
            int r0 = r15.A03(r8)
            int r10 = r15.A04
            X.7qE r9 = new X.7qE
            r9.<init>((int) r10, (int) r11, (long) r12, (int) r14)
            r15.A0F(r9)
            r9.A00 = r0
            goto L_0x007c
        L_0x00c7:
            boolean r6 = r0.isInterface()
            if (r6 != 0) goto L_0x00d3
            boolean r6 = r4.isInterface()
            if (r6 == 0) goto L_0x00d5
        L_0x00d3:
            r8 = r10
            goto L_0x00b6
        L_0x00d5:
            java.lang.Class r0 = r0.getSuperclass()
            boolean r6 = r0.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x00d5
            java.lang.String r0 = r0.getName()
            java.lang.String r8 = r0.replace(r5, r1)
            goto L_0x00b6
        L_0x00e8:
            long r12 = (long) r5
            long r0 = (long) r6
            goto L_0x005a
        L_0x00ec:
            r6 = r6 & r9
            int r6 = r6 + r9
            goto L_0x0101
        L_0x00ef:
            r1 = r6 & r9
            r6 = r6 & r7
            if (r1 != 0) goto L_0x010a
            if (r6 != r5) goto L_0x0038
        L_0x00f6:
            if (r8 == 0) goto L_0x00fd
            r0 = r3 & r7
            if (r0 == r5) goto L_0x00fd
            int r8 = r8 + r9
        L_0x00fd:
            int r6 = java.lang.Math.min(r1, r8)
        L_0x0101:
            r6 = r6 | r5
            int r0 = r15.A03(r10)
            r2 = r6 | r0
            goto L_0x0038
        L_0x010a:
            if (r6 == r5) goto L_0x00f6
            int r1 = r1 + r9
            goto L_0x00f6
        L_0x010e:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r7, r0)
            throw r1
        L_0x0115:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161437pf.A02(X.7bq, int[], int, int):void");
    }

    public final int A03() {
        short s = this.A03;
        if (s > 0) {
            int[] iArr = this.A08;
            short s2 = (short) (s - 1);
            this.A03 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.A02 - 1);
        this.A02 = s3;
        return (-s3) | 20971520;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if ((r9 & 1048576) != 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if ((r9 & 1048576) != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04(int r9, int r10) {
        /*
            r8 = this;
            r7 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r7 = r7 & r9
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r1 = r1 & r9
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r6 = 4194307(0x400003, float:5.877476E-39)
            r5 = 4194304(0x400000, float:5.877472E-39)
            r4 = 4194308(0x400004, float:5.877477E-39)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r0) goto L_0x0026
            int[] r1 = r8.A05
            r0 = r9 & r2
            r0 = r1[r0]
            int r7 = r7 + r0
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0036
        L_0x0021:
            if (r7 == r4) goto L_0x0025
            if (r7 != r6) goto L_0x0036
        L_0x0025:
            return r5
        L_0x0026:
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r1 != r0) goto L_0x0037
            int[] r1 = r8.A06
            r0 = r9 & r2
            int r10 = r10 - r0
            r0 = r1[r10]
            int r7 = r7 + r0
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0036
            goto L_0x0021
        L_0x0036:
            return r7
        L_0x0037:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161437pf.A04(int, int):int");
    }

    public final void A06(int i) {
        short s;
        short s2 = this.A03;
        if (s2 >= i) {
            s = (short) (s2 - i);
        } else {
            this.A02 = (short) (this.A02 - (i - s2));
            s = 0;
        }
        this.A03 = s;
    }

    public final void A07(int i) {
        int[] iArr = this.A08;
        if (iArr == null) {
            iArr = new int[10];
            this.A08 = iArr;
        }
        int length = iArr.length;
        short s = this.A03;
        if (s >= length) {
            int[] iArr2 = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A08 = iArr2;
            iArr = iArr2;
        }
        short s2 = this.A03;
        short s3 = (short) (s2 + 1);
        this.A03 = s3;
        iArr[s2] = i;
        short s4 = (short) (this.A02 + s3);
        C158877kh r1 = this.A01;
        if (s4 > r1.A08) {
            r1.A08 = s4;
        }
    }

    public final void A08(int i, int i2) {
        int[] iArr = this.A07;
        if (iArr == null) {
            iArr = new int[10];
            this.A07 = iArr;
        }
        int length = iArr.length;
        if (i >= length) {
            int[] iArr2 = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A07 = iArr2;
            iArr = iArr2;
        }
        iArr[i] = i2;
    }

    public final void A0B(String str, C153727bq r12, int i, int i2) {
        int i3;
        int i4;
        int[] iArr = new int[i2];
        this.A05 = iArr;
        this.A06 = new int[0];
        int i5 = 0;
        if ((i & 8) == 0) {
            i5 = 1;
            if ((i & 262144) == 0) {
                i4 = r12.A03(r12.A05) | 8388608;
            } else {
                i4 = 4194310;
            }
            iArr[0] = i4;
        }
        for (C162147rL A062 : C162147rL.A05(str)) {
            int A012 = A01(A062.A06(), r12, 0);
            int[] iArr2 = this.A05;
            int i6 = i3 + 1;
            iArr2[i3] = A012;
            if (A012 != 4194308) {
                i3 = i6;
                if (A012 != 4194307) {
                }
            }
            i3 = i6 + 1;
            iArr2[i6] = 4194304;
        }
        while (i3 < i2) {
            this.A05[i3] = 4194304;
            i3++;
        }
    }

    public final void A0C(C176028cL r14) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.A05;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0:
        while (true) {
            int i8 = 0;
            do {
                int i9 = 2;
                if (i6 >= iArr.length) {
                    break loop0;
                }
                i4 = iArr[i6];
                if (!(i4 == 4194308 || i4 == 4194307)) {
                    i9 = 1;
                }
                i6 += i9;
                i8++;
            } while (i4 == 4194304);
            i7 += i8;
        }
        int[] iArr2 = this.A06;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr2.length) {
            int i12 = iArr2[i10];
            if (i12 != 4194308) {
                i3 = 1;
                if (i12 != 4194307) {
                    i10 += i3;
                    i11++;
                }
            }
            i3 = 2;
            i10 += i3;
            i11++;
        }
        int i13 = this.A01.A00;
        int i14 = i7 + 3 + i11;
        int[] iArr3 = r14.A0Y;
        if (iArr3 == null || iArr3.length < i14) {
            iArr3 = new int[i14];
            r14.A0Y = iArr3;
        }
        iArr3[0] = i13;
        iArr3[1] = i7;
        iArr3[2] = i11;
        int i15 = 3;
        int i16 = 0;
        while (true) {
            int i17 = i7 - 1;
            if (i7 <= 0) {
                break;
            }
            int i18 = iArr[i16];
            if (i18 != 4194308) {
                i2 = 1;
                if (i18 != 4194307) {
                    i16 += i2;
                    iArr3[i15] = i18;
                    i7 = i17;
                    i15++;
                }
            }
            i2 = 2;
            i16 += i2;
            iArr3[i15] = i18;
            i7 = i17;
            i15++;
        }
        while (true) {
            int i19 = i11 - 1;
            if (i11 > 0) {
                int i20 = iArr2[i5];
                if (i20 != 4194308) {
                    i = 1;
                    if (i20 != 4194307) {
                        i5 += i;
                        iArr3[i15] = i20;
                        i15++;
                        i11 = i19;
                    }
                }
                i = 2;
                i5 += i;
                iArr3[i15] = i20;
                i15++;
                i11 = i19;
            } else {
                r14.A0E();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0216, code lost:
        r1 = r15.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0218, code lost:
        A0A(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0224, code lost:
        r3 = r2.A03(r1) | 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x022a, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022b, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022e, code lost:
        A07(4194307);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0235, code lost:
        A07(4194306);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0238, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x023c, code lost:
        A07(4194308);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x023f, code lost:
        A07(4194304);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0242, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0246, code lost:
        A07(4194305);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0249, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0255, code lost:
        A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0258, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r1.charAt(0) == '[') goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r3 = r3 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0173, code lost:
        A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0176, code lost:
        A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017c, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0180, code lost:
        A06(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0188, code lost:
        A06(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018e, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018f, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0195, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b1, code lost:
        if (r18 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b3, code lost:
        r3 = r18 - 1;
        r2 = r14.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b7, code lost:
        if (r2 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ba, code lost:
        if (r3 >= r2.length) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r1 = r2[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01be, code lost:
        if (r1 != 0) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c0, code lost:
        r1 = r3 | androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        r2[r3] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c4, code lost:
        if (r1 == 4194308) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c6, code lost:
        if (r1 == 4194307) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c8, code lost:
        r0 = r1 & 62914560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ca, code lost:
        if (r0 == 16777216) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cc, code lost:
        if (r0 != 20971520) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ce, code lost:
        A08(r3, r1 | 1048576);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d5, code lost:
        r1 = r3 | androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d8, code lost:
        A08(r3, 4194304);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01db, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C161677qE r15, X.C153727bq r16, int r17, int r18) {
        /*
            r14 = this;
            r3 = r18
            r9 = 4194306(0x400002, float:5.877475E-39)
            r13 = 8388608(0x800000, float:1.17549435E-38)
            r10 = 4194305(0x400001, float:5.877473E-39)
            r8 = 4194307(0x400003, float:5.877476E-39)
            r7 = 4194308(0x400004, float:5.877477E-39)
            r6 = 4194304(0x400000, float:5.877472E-39)
            r1 = r17
            r2 = r16
            switch(r17) {
                case 0: goto L_0x021b;
                case 1: goto L_0x024a;
                case 2: goto L_0x0246;
                case 3: goto L_0x0246;
                case 4: goto L_0x0246;
                case 5: goto L_0x0246;
                case 6: goto L_0x0246;
                case 7: goto L_0x0246;
                case 8: goto L_0x0246;
                case 9: goto L_0x023c;
                case 10: goto L_0x023c;
                case 11: goto L_0x0235;
                case 12: goto L_0x0235;
                case 13: goto L_0x0235;
                case 14: goto L_0x022e;
                case 15: goto L_0x022e;
                case 16: goto L_0x0246;
                case 17: goto L_0x0246;
                case 18: goto L_0x0202;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r17) {
                case 21: goto L_0x0246;
                case 22: goto L_0x023c;
                case 23: goto L_0x0235;
                case 24: goto L_0x022e;
                case 25: goto L_0x01ec;
                default: goto L_0x001c;
            }
        L_0x001c:
            r5 = 20971520(0x1400000, float:3.526483E-38)
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r12 = 62914560(0x3c00000, float:1.1284746E-36)
            r11 = 1
            switch(r17) {
                case 46: goto L_0x018e;
                case 47: goto L_0x0194;
                case 48: goto L_0x0188;
                case 49: goto L_0x022a;
                case 50: goto L_0x01dc;
                case 51: goto L_0x018e;
                case 52: goto L_0x018e;
                case 53: goto L_0x018e;
                case 54: goto L_0x01aa;
                case 55: goto L_0x019a;
                case 56: goto L_0x01aa;
                case 57: goto L_0x019a;
                case 58: goto L_0x01aa;
                default: goto L_0x0026;
            }
        L_0x0026:
            r12 = 3
            r5 = 91
            r4 = 0
            r0 = 4
            switch(r17) {
                case 79: goto L_0x0184;
                case 80: goto L_0x017c;
                case 81: goto L_0x0184;
                case 82: goto L_0x017c;
                case 83: goto L_0x0184;
                case 84: goto L_0x0184;
                case 85: goto L_0x0184;
                case 86: goto L_0x0184;
                case 87: goto L_0x0180;
                case 88: goto L_0x017b;
                case 89: goto L_0x024e;
                case 90: goto L_0x016b;
                case 91: goto L_0x0158;
                case 92: goto L_0x014c;
                case 93: goto L_0x013c;
                case 94: goto L_0x0122;
                case 95: goto L_0x0115;
                case 96: goto L_0x018e;
                case 97: goto L_0x0195;
                case 98: goto L_0x0188;
                case 99: goto L_0x022b;
                case 100: goto L_0x018e;
                case 101: goto L_0x0195;
                case 102: goto L_0x0188;
                case 103: goto L_0x022b;
                case 104: goto L_0x018e;
                case 105: goto L_0x0195;
                case 106: goto L_0x0188;
                case 107: goto L_0x022b;
                case 108: goto L_0x018e;
                case 109: goto L_0x0195;
                case 110: goto L_0x0188;
                case 111: goto L_0x022b;
                case 112: goto L_0x018e;
                case 113: goto L_0x0195;
                case 114: goto L_0x0188;
                case 115: goto L_0x022b;
                case 116: goto L_0x021b;
                case 117: goto L_0x021b;
                case 118: goto L_0x021b;
                case 119: goto L_0x021b;
                case 120: goto L_0x018e;
                case 121: goto L_0x0239;
                case 122: goto L_0x018e;
                case 123: goto L_0x0239;
                case 124: goto L_0x018e;
                case 125: goto L_0x0239;
                case 126: goto L_0x018e;
                case 127: goto L_0x0195;
                case 128: goto L_0x018e;
                case 129: goto L_0x0195;
                case 130: goto L_0x018e;
                case 131: goto L_0x0195;
                case 132: goto L_0x0111;
                case 133: goto L_0x0040;
                case 134: goto L_0x0232;
                case 135: goto L_0x003b;
                case 136: goto L_0x018e;
                case 137: goto L_0x0188;
                case 138: goto L_0x022a;
                case 139: goto L_0x0243;
                case 140: goto L_0x0040;
                case 141: goto L_0x003b;
                case 142: goto L_0x018e;
                case 143: goto L_0x0194;
                case 144: goto L_0x0188;
                case 145: goto L_0x021b;
                case 146: goto L_0x021b;
                case 147: goto L_0x021b;
                case 148: goto L_0x018f;
                case 149: goto L_0x018e;
                case 150: goto L_0x018e;
                case 151: goto L_0x018f;
                case 152: goto L_0x018f;
                case 153: goto L_0x0180;
                case 154: goto L_0x0180;
                case 155: goto L_0x0180;
                case 156: goto L_0x0180;
                case 157: goto L_0x0180;
                case 158: goto L_0x0180;
                case 159: goto L_0x017b;
                case 160: goto L_0x017b;
                case 161: goto L_0x017b;
                case 162: goto L_0x017b;
                case 163: goto L_0x017b;
                case 164: goto L_0x017b;
                case 165: goto L_0x017b;
                case 166: goto L_0x017b;
                case 167: goto L_0x021b;
                case 168: goto L_0x0078;
                case 169: goto L_0x0078;
                case 170: goto L_0x0180;
                case 171: goto L_0x0180;
                case 172: goto L_0x0180;
                case 173: goto L_0x017b;
                case 174: goto L_0x0180;
                case 175: goto L_0x017b;
                case 176: goto L_0x0180;
                case 177: goto L_0x021b;
                case 178: goto L_0x0216;
                case 179: goto L_0x010b;
                case 180: goto L_0x0213;
                case 181: goto L_0x0102;
                case 182: goto L_0x00bc;
                case 183: goto L_0x00bc;
                case 184: goto L_0x00bc;
                case 185: goto L_0x00bc;
                case 186: goto L_0x00b3;
                case 187: goto L_0x00a8;
                case 188: goto L_0x0045;
                case 189: goto L_0x008c;
                case 190: goto L_0x0243;
                case 191: goto L_0x0180;
                case 192: goto L_0x007f;
                case 193: goto L_0x0243;
                case 194: goto L_0x0180;
                case 195: goto L_0x0180;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r17) {
                case 197: goto L_0x0036;
                case 198: goto L_0x0180;
                case 199: goto L_0x0180;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x0036:
            r14.A06(r3)
            goto L_0x0216
        L_0x003b:
            r14.A06(r11)
            goto L_0x022e
        L_0x0040:
            r14.A06(r11)
            goto L_0x023c
        L_0x0045:
            r14.A03()
            switch(r18) {
                case 4: goto L_0x0073;
                case 5: goto L_0x006e;
                case 6: goto L_0x0069;
                case 7: goto L_0x0064;
                case 8: goto L_0x005f;
                case 9: goto L_0x005a;
                case 10: goto L_0x0055;
                case 11: goto L_0x0050;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x0050:
            r3 = 71303172(0x4400004, float:2.2569499E-36)
            goto L_0x0255
        L_0x0055:
            r3 = 71303169(0x4400001, float:2.2569493E-36)
            goto L_0x0255
        L_0x005a:
            r3 = 71303180(0x440000c, float:2.2569513E-36)
            goto L_0x0255
        L_0x005f:
            r3 = 71303178(0x440000a, float:2.256951E-36)
            goto L_0x0255
        L_0x0064:
            r3 = 71303171(0x4400003, float:2.2569497E-36)
            goto L_0x0255
        L_0x0069:
            r3 = 71303170(0x4400002, float:2.2569495E-36)
            goto L_0x0255
        L_0x006e:
            r3 = 71303179(0x440000b, float:2.2569511E-36)
            goto L_0x0255
        L_0x0073:
            r3 = 71303177(0x4400009, float:2.2569508E-36)
            goto L_0x0255
        L_0x0078:
            java.lang.String r0 = "JSR/RET are not supported with computeFrames option"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x007f:
            java.lang.String r1 = r15.A08
            r14.A03()
            char r0 = r1.charAt(r4)
            if (r0 != r5) goto L_0x0224
            goto L_0x0218
        L_0x008c:
            java.lang.String r1 = r15.A08
            r14.A03()
            char r0 = r1.charAt(r4)
            if (r0 != r5) goto L_0x00a1
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r1 = X.AnonymousClass0x2.A0e(r1, r0, r5)
            goto L_0x0218
        L_0x00a1:
            r0 = 75497472(0x4800000, float:3.0092655E-36)
            int r3 = r2.A03(r1)
            goto L_0x00b0
        L_0x00a8:
            java.lang.String r0 = r15.A08
            int r3 = r2.A04(r0, r3)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00b0:
            r3 = r3 | r0
            goto L_0x0255
        L_0x00b3:
            java.lang.String r0 = r15.A08
            r14.A09(r0)
            r14.A0A(r0, r2)
            return
        L_0x00bc:
            java.lang.String r6 = r15.A08
            r14.A09(r6)
            r0 = 184(0xb8, float:2.58E-43)
            if (r1 == r0) goto L_0x00fe
            int r7 = r14.A03()
            r0 = 183(0xb7, float:2.56E-43)
            if (r1 != r0) goto L_0x00fe
            java.lang.String r0 = r15.A06
            char r1 = r0.charAt(r4)
            r0 = 60
            if (r1 != r0) goto L_0x00fe
            int[] r5 = r14.A04
            if (r5 != 0) goto L_0x00e1
            int[] r5 = X.C86664Kz.A1Z()
            r14.A04 = r5
        L_0x00e1:
            int r3 = r5.length
            int r0 = r14.A00
            if (r0 < r3) goto L_0x00f6
            int r1 = r0 + 1
            int r0 = r3 * 2
            int r0 = java.lang.Math.max(r1, r0)
            int[] r0 = new int[r0]
            java.lang.System.arraycopy(r5, r4, r0, r4, r3)
            r14.A04 = r0
            r5 = r0
        L_0x00f6:
            int r1 = r14.A00
            int r0 = r1 + 1
            r14.A00 = r0
            r5[r1] = r7
        L_0x00fe:
            r14.A0A(r6, r2)
            return
        L_0x0102:
            java.lang.String r0 = r15.A08
            r14.A09(r0)
            r14.A03()
            return
        L_0x010b:
            java.lang.String r0 = r15.A08
            r14.A09(r0)
            return
        L_0x0111:
            r14.A08(r3, r10)
            return
        L_0x0115:
            int r0 = r14.A03()
            int r3 = r14.A03()
            r14.A07(r0)
            goto L_0x0255
        L_0x0122:
            int r3 = r14.A03()
            int r2 = r14.A03()
            int r1 = r14.A03()
            int r0 = r14.A03()
            r14.A07(r2)
            r14.A07(r3)
            r14.A07(r0)
            goto L_0x0167
        L_0x013c:
            int r3 = r14.A03()
            int r2 = r14.A03()
            int r1 = r14.A03()
            r14.A07(r2)
            goto L_0x0164
        L_0x014c:
            int r3 = r14.A03()
            int r2 = r14.A03()
            r14.A07(r2)
            goto L_0x0173
        L_0x0158:
            int r3 = r14.A03()
            int r2 = r14.A03()
            int r1 = r14.A03()
        L_0x0164:
            r14.A07(r3)
        L_0x0167:
            r14.A07(r1)
            goto L_0x0176
        L_0x016b:
            int r3 = r14.A03()
            int r2 = r14.A03()
        L_0x0173:
            r14.A07(r3)
        L_0x0176:
            r14.A07(r2)
            goto L_0x0255
        L_0x017b:
            r0 = 2
        L_0x017c:
            r14.A06(r0)
            return
        L_0x0180:
            r14.A06(r11)
            return
        L_0x0184:
            r14.A06(r12)
            return
        L_0x0188:
            r0 = 2
            r14.A06(r0)
            goto L_0x0235
        L_0x018e:
            r0 = 2
        L_0x018f:
            r14.A06(r0)
            goto L_0x0246
        L_0x0194:
            r0 = 2
        L_0x0195:
            r14.A06(r0)
            goto L_0x023c
        L_0x019a:
            r14.A06(r11)
            int r0 = r14.A03()
            r14.A08(r3, r0)
            int r0 = r18 + 1
            r14.A08(r0, r6)
            goto L_0x01b1
        L_0x01aa:
            int r0 = r14.A03()
            r14.A08(r3, r0)
        L_0x01b1:
            if (r18 <= 0) goto L_0x021b
            int r3 = r18 + -1
            int[] r2 = r14.A07
            if (r2 == 0) goto L_0x01d5
            int r0 = r2.length
            if (r3 >= r0) goto L_0x01d5
            r1 = r2[r3]
            if (r1 != 0) goto L_0x01c4
            r1 = r3 | r4
            r2[r3] = r1
        L_0x01c4:
            if (r1 == r7) goto L_0x01d8
            if (r1 == r8) goto L_0x01d8
            r0 = r1 & r12
            if (r0 == r4) goto L_0x01ce
            if (r0 != r5) goto L_0x021b
        L_0x01ce:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r14.A08(r3, r1)
            return
        L_0x01d5:
            r1 = r3 | r4
            goto L_0x01c4
        L_0x01d8:
            r14.A08(r3, r6)
            return
        L_0x01dc:
            r14.A06(r11)
            int r3 = r14.A03()
            r0 = 4194309(0x400005, float:5.877479E-39)
            if (r3 == r0) goto L_0x0255
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            int r3 = r3 + r0
            goto L_0x0255
        L_0x01ec:
            int[] r2 = r14.A07
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r2 == 0) goto L_0x01ff
            int r0 = r2.length
            if (r3 >= r0) goto L_0x01ff
            r0 = r2[r18]
            if (r0 != 0) goto L_0x01fd
            r0 = r18 | r1
            r2[r18] = r0
        L_0x01fd:
            r3 = r0
            goto L_0x0255
        L_0x01ff:
            r3 = r18 | r1
            goto L_0x0255
        L_0x0202:
            int r0 = r15.A04
            switch(r0) {
                case 3: goto L_0x0246;
                case 4: goto L_0x0235;
                case 5: goto L_0x023c;
                case 6: goto L_0x022e;
                case 7: goto L_0x021f;
                case 8: goto L_0x021c;
                default: goto L_0x0207;
            }
        L_0x0207:
            switch(r0) {
                case 15: goto L_0x0222;
                case 16: goto L_0x0210;
                case 17: goto L_0x0216;
                default: goto L_0x020a;
            }
        L_0x020a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0210:
            java.lang.String r1 = "java/lang/invoke/MethodType"
            goto L_0x0224
        L_0x0213:
            r14.A06(r11)
        L_0x0216:
            java.lang.String r1 = r15.A08
        L_0x0218:
            r14.A0A(r1, r2)
        L_0x021b:
            return
        L_0x021c:
            java.lang.String r1 = "java/lang/String"
            goto L_0x0224
        L_0x021f:
            java.lang.String r1 = "java/lang/Class"
            goto L_0x0224
        L_0x0222:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
        L_0x0224:
            int r3 = r2.A03(r1)
            r3 = r3 | r13
            goto L_0x0255
        L_0x022a:
            r0 = 2
        L_0x022b:
            r14.A06(r0)
        L_0x022e:
            r14.A07(r8)
            goto L_0x023f
        L_0x0232:
            r14.A06(r11)
        L_0x0235:
            r14.A07(r9)
            return
        L_0x0239:
            r14.A06(r12)
        L_0x023c:
            r14.A07(r7)
        L_0x023f:
            r14.A07(r6)
            return
        L_0x0243:
            r14.A06(r11)
        L_0x0246:
            r14.A07(r10)
            return
        L_0x024a:
            r3 = 4194309(0x400005, float:5.877479E-39)
            goto L_0x0255
        L_0x024e:
            int r3 = r14.A03()
            r14.A07(r3)
        L_0x0255:
            r14.A07(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161437pf.A0D(X.7qE, X.7bq, int, int):void");
    }

    public C161437pf(C158877kh r1) {
        this.A01 = r1;
    }

    public static int A01(String str, C153727bq r13, int i) {
        char charAt = str.charAt(i);
        int i2 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt == 'L') {
            return r13.A03(str.substring(i + 1, str.length() - 1)) | 8388608;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return 4194308;
                }
                if (charAt != 'Z') {
                    if (charAt != '[') {
                        switch (charAt) {
                            case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                            case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                break;
                            case 'D':
                                return 4194307;
                            default:
                                throw AnonymousClass6CA.A0N();
                        }
                    } else {
                        int i3 = i + 1;
                        while (str.charAt(i3) == '[') {
                            i3++;
                        }
                        char charAt2 = str.charAt(i3);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'L') {
                                i2 = r13.A03(str.substring(i3 + 1, str.length() - 1)) | 8388608;
                            } else if (charAt2 == 'S') {
                                i2 = 4194316;
                            } else if (charAt2 == 'Z') {
                                i2 = 4194313;
                            } else if (charAt2 == 'I') {
                                i2 = 4194305;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                                        i2 = 4194314;
                                        break;
                                    case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                        i2 = 4194315;
                                        break;
                                    case 'D':
                                        i2 = 4194307;
                                        break;
                                    default:
                                        throw AnonymousClass6CA.A0N();
                                }
                            } else {
                                i2 = 4194308;
                            }
                        }
                        return ((i3 - i) << 26) | i2;
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[LOOP:0: B:5:0x000d->B:18:0x003f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A05(X.C153727bq r9, int r10) {
        /*
            r8 = this;
            r6 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r6) goto L_0x000c
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r0) goto L_0x004d
        L_0x000c:
            r7 = 0
        L_0x000d:
            int r0 = r8.A00
            if (r7 >= r0) goto L_0x004d
            int[] r0 = r8.A04
            r1 = r0[r7]
            r5 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r5 = r5 & r1
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r1
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r1 & r3
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r0) goto L_0x0042
            int[] r0 = r8.A05
            r1 = r0[r2]
        L_0x0028:
            int r1 = r1 + r5
        L_0x0029:
            if (r10 != r1) goto L_0x003f
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r10 != r6) goto L_0x0037
            java.lang.String r0 = r9.A05
        L_0x0031:
            int r0 = r9.A03(r0)
            r0 = r0 | r1
            return r0
        L_0x0037:
            r10 = r10 & r3
            X.7qE[] r0 = r9.A09
            r0 = r0[r10]
            java.lang.String r0 = r0.A08
            goto L_0x0031
        L_0x003f:
            int r7 = r7 + 1
            goto L_0x000d
        L_0x0042:
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r0) goto L_0x0029
            int[] r1 = r8.A06
            int r0 = r1.length
            int r0 = r0 - r2
            r1 = r1[r0]
            goto L_0x0028
        L_0x004d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161437pf.A05(X.7bq, int):int");
    }

    public final void A09(String str) {
        char A002 = AnonymousClass6C9.A00(str);
        if (A002 == '(') {
            A06((C162147rL.A00(str) >> 2) - 1);
        } else if (A002 == 'J' || A002 == 'D') {
            A06(2);
        } else {
            A06(1);
        }
    }
}
