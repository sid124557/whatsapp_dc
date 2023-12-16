package X;

/* renamed from: X.7mM  reason: invalid class name and case insensitive filesystem */
public final class C159727mM {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06e1, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0273 A[LOOP:8: B:145:0x0271->B:146:0x0273, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x006f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0230 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[SYNTHETIC, Splitter:B:8:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C151137To A00(X.AnonymousClass21X r30, java.lang.String r31, java.util.Map r32) {
        /*
            r6 = r32
            if (r32 == 0) goto L_0x0020
            X.6vY r1 = X.C141426vY.CHARACTER_SET
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x0020
            r7 = 1
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r9 = r0.toString()
        L_0x0015:
            java.lang.String r3 = "Shift_JIS"
            boolean r0 = r3.equals(r9)
            r8 = r31
            if (r0 == 0) goto L_0x0044
            goto L_0x0024
        L_0x0020:
            r7 = 0
            java.lang.String r9 = "ISO-8859-1"
            goto L_0x0015
        L_0x0024:
            byte[] r5 = r8.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            int r4 = r5.length
            int r0 = r4 % 2
            if (r0 != 0) goto L_0x0044
            r2 = 0
        L_0x002e:
            if (r2 >= r4) goto L_0x006c
            byte r0 = r5[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L_0x0069
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 235(0xeb, float:3.3E-43)
            if (r1 <= r0) goto L_0x0069
        L_0x0044:
            r5 = 0
            r1 = 0
            r4 = 0
        L_0x0047:
            int r0 = r8.length()
            if (r5 >= r0) goto L_0x006f
            char r2 = r8.charAt(r5)
            r0 = 48
            if (r2 < r0) goto L_0x005d
            r0 = 57
            if (r2 > r0) goto L_0x005d
            r4 = 1
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x005d:
            int[] r1 = A00
            int r0 = r1.length
            if (r2 >= r0) goto L_0x00df
            r1 = r1[r2]
            r0 = -1
            if (r1 == r0) goto L_0x00df
            r1 = 1
            goto L_0x005a
        L_0x0069:
            int r2 = r2 + 2
            goto L_0x002e
        L_0x006c:
            X.6xo r1 = X.C142806xo.A07
            goto L_0x0073
        L_0x006f:
            if (r1 == 0) goto L_0x00da
            X.6xo r1 = X.C142806xo.A01
        L_0x0073:
            X.8LP r5 = new X.8LP
            r5.<init>()
            X.6xo r4 = X.C142806xo.A02
            if (r1 != r4) goto L_0x009a
            if (r7 == 0) goto L_0x009a
            java.util.Map r0 = X.C142856xu.A00
            java.lang.Object r7 = r0.get(r9)
            X.6xu r7 = (X.C142856xu) r7
            if (r7 == 0) goto L_0x009a
            X.6xo r0 = X.C142806xo.A03
            int r2 = r0.bits
            r0 = 4
            r5.A01(r2, r0)
            int[] r2 = r7.values
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            r5.A01(r2, r0)
        L_0x009a:
            if (r32 == 0) goto L_0x00be
            X.6vY r2 = X.C141426vY.GS1_FORMAT
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00be
            X.6xo r0 = X.C142806xo.A04
            int r2 = r0.bits
            r0 = 4
            r5.A01(r2, r0)
        L_0x00be:
            int r2 = r1.bits
            r0 = 4
            r5.A01(r2, r0)
            X.8LP r7 = new X.8LP
            r7.<init>()
            int r2 = r1.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x0199
            r0 = 2
            if (r2 == r0) goto L_0x0159
            r0 = 4
            if (r2 == r0) goto L_0x0140
            r0 = 6
            if (r2 != r0) goto L_0x0130
            goto L_0x00e2
        L_0x00da:
            if (r4 == 0) goto L_0x00df
            X.6xo r1 = X.C142806xo.A08
            goto L_0x0073
        L_0x00df:
            X.6xo r1 = X.C142806xo.A02
            goto L_0x0073
        L_0x00e2:
            byte[] r10 = r8.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x0129 }
            int r9 = r10.length
            r3 = 0
        L_0x00e8:
            if (r3 >= r9) goto L_0x01de
            byte r0 = r10[r3]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r3 + 1
            byte r0 = r10[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r11 = r2 << 8
            r11 = r11 | r0
            r12 = 33088(0x8140, float:4.6366E-41)
            r2 = -1
            if (r11 < r12) goto L_0x0121
            r0 = 40956(0x9ffc, float:5.7392E-41)
            if (r11 <= r0) goto L_0x010f
            r0 = 57408(0xe040, float:8.0446E-41)
            if (r11 < r0) goto L_0x0121
            r0 = 60351(0xebbf, float:8.457E-41)
            if (r11 > r0) goto L_0x0121
            r12 = 49472(0xc140, float:6.9325E-41)
        L_0x010f:
            int r11 = r11 - r12
            if (r11 == r2) goto L_0x0121
            int r0 = r11 >> 8
            int r2 = r0 * 192
            r0 = r11 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            r0 = 13
            r7.A01(r2, r0)
            int r3 = r3 + 2
            goto L_0x00e8
        L_0x0121:
            java.lang.String r1 = "Invalid byte sequence"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0129:
            r1 = move-exception
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0130:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Invalid mode: "
            java.lang.String r1 = r0.concat(r1)
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0140:
            byte[] r10 = r8.getBytes(r9)     // Catch:{ UnsupportedEncodingException -> 0x0152 }
            int r9 = r10.length
            r3 = 0
        L_0x0146:
            if (r3 >= r9) goto L_0x01de
            byte r2 = r10[r3]
            r0 = 8
            r7.A01(r2, r0)
            int r3 = r3 + 1
            goto L_0x0146
        L_0x0152:
            r1 = move-exception
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0159:
            int r11 = r8.length()
            r12 = 0
        L_0x015e:
            if (r12 >= r11) goto L_0x01de
            char r0 = r8.charAt(r12)
            int[] r13 = A00
            int r10 = r13.length
            if (r0 >= r10) goto L_0x0193
            r9 = r13[r0]
            r3 = -1
            if (r9 == r3) goto L_0x0193
            int r2 = r12 + 1
            if (r2 >= r11) goto L_0x0187
            char r0 = r8.charAt(r2)
            if (r0 >= r10) goto L_0x018d
            r0 = r13[r0]
            if (r0 == r3) goto L_0x018d
            int r2 = r9 * 45
            int r2 = r2 + r0
            r0 = 11
            r7.A01(r2, r0)
            int r12 = r12 + 2
            goto L_0x015e
        L_0x0187:
            r0 = 6
            r7.A01(r9, r0)
            r12 = r2
            goto L_0x015e
        L_0x018d:
            X.6zg r0 = new X.6zg
            r0.<init>()
            throw r0
        L_0x0193:
            X.6zg r0 = new X.6zg
            r0.<init>()
            throw r0
        L_0x0199:
            int r10 = r8.length()
            r12 = 0
        L_0x019e:
            if (r12 >= r10) goto L_0x01de
            char r0 = r8.charAt(r12)
            int r2 = r0 + -48
            int r3 = r12 + 2
            if (r3 >= r10) goto L_0x01c6
            int r0 = r12 + 1
            char r0 = r8.charAt(r0)
            int r11 = r0 + -48
            char r0 = r8.charAt(r3)
            int r9 = r0 + -48
            int r3 = r2 * 100
            r2 = 10
            int r0 = r11 * 10
            int r3 = r3 + r0
            int r3 = r3 + r9
            r7.A01(r3, r2)
            int r12 = r12 + 3
            goto L_0x019e
        L_0x01c6:
            int r12 = r12 + 1
            if (r12 >= r10) goto L_0x01d9
            char r0 = r8.charAt(r12)
            int r0 = r0 + -48
            int r2 = r2 * 10
            int r2 = r2 + r0
            r0 = 7
            r7.A01(r2, r0)
            r12 = r3
            goto L_0x019e
        L_0x01d9:
            r0 = 4
            r7.A01(r2, r0)
            goto L_0x019e
        L_0x01de:
            r32 = r30
            if (r6 == 0) goto L_0x0214
            X.6vY r2 = X.C141426vY.QR_VERSION
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L_0x0214
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            X.7pT r2 = X.C161347pT.A03(r0)
            int r3 = r5.A00
            int r0 = r1.A00(r2)
            int r3 = r3 + r0
            int r0 = r7.A00
            int r3 = r3 + r0
            r0 = r32
            boolean r0 = A01(r0, r2, r3)
            if (r0 != 0) goto L_0x0263
            java.lang.String r1 = "Data too big for requested version"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0214:
            X.7pT[] r2 = X.C161347pT.A05
            r0 = 0
            r0 = r2[r0]
            int r6 = r5.A00
            int r0 = r1.A00(r0)
            int r6 = r6 + r0
            int r0 = r7.A00
            int r6 = r6 + r0
            r3 = 1
        L_0x0224:
            X.7pT r2 = X.C161347pT.A03(r3)
            r0 = r32
            boolean r0 = A01(r0, r2, r6)
            if (r0 == 0) goto L_0x0255
            int r6 = r5.A00
            int r0 = r1.A00(r2)
            int r6 = r6 + r0
            int r0 = r7.A00
            int r6 = r6 + r0
            r3 = 1
        L_0x023b:
            X.7pT r2 = X.C161347pT.A03(r3)
            r0 = r32
            boolean r0 = A01(r0, r2, r6)
            if (r0 != 0) goto L_0x0263
            int r3 = r3 + 1
            r0 = 40
            if (r3 <= r0) goto L_0x023b
            java.lang.String r1 = "Data too big"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0255:
            int r3 = r3 + 1
            r0 = 40
            if (r3 <= r0) goto L_0x0224
            java.lang.String r1 = "Data too big"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0263:
            X.8LP r6 = new X.8LP
            r6.<init>()
            int r9 = r5.A00
            int r0 = r6.A00
            int r0 = r0 + r9
            r6.A00(r0)
            r3 = 0
        L_0x0271:
            if (r3 >= r9) goto L_0x027d
            boolean r0 = r5.A03(r3)
            r6.A02(r0)
            int r3 = r3 + 1
            goto L_0x0271
        L_0x027d:
            if (r1 != r4) goto L_0x02a6
            int r0 = r7.A00
            int r0 = r0 + 7
            int r5 = r0 / 8
        L_0x0285:
            int r0 = r1.A00(r2)
            r4 = 1
            int r3 = r4 << r0
            if (r5 >= r3) goto L_0x0776
            r6.A01(r5, r0)
            int r4 = r7.A00
            int r0 = r6.A00
            int r0 = r0 + r4
            r6.A00(r0)
            r3 = 0
        L_0x029a:
            if (r3 >= r4) goto L_0x02ab
            boolean r0 = r7.A03(r3)
            r6.A02(r0)
            int r3 = r3 + 1
            goto L_0x029a
        L_0x02a6:
            int r5 = r8.length()
            goto L_0x0285
        L_0x02ab:
            X.7Gb[] r3 = r2.A03
            int r0 = r32.ordinal()
            r10 = r3[r0]
            int r4 = r2.A00
            int r9 = r10.A00
            X.7Ga[] r8 = r10.A01
            int r7 = r8.length
            r5 = 0
            r3 = 0
        L_0x02bc:
            if (r5 >= r7) goto L_0x02c6
            r0 = r8[r5]
            int r0 = r0.A00
            int r3 = r3 + r0
            int r5 = r5 + 1
            goto L_0x02bc
        L_0x02c6:
            int r9 = r9 * r3
            int r30 = r4 - r9
            int r8 = r30 << 3
            int r3 = r6.A00
            if (r3 > r8) goto L_0x0761
            r9 = 0
            r3 = 0
        L_0x02d1:
            int r0 = r6.A00
            if (r0 >= r8) goto L_0x02de
            r6.A02(r9)
            int r3 = r3 + 1
            r0 = 4
            if (r3 >= r0) goto L_0x02de
            goto L_0x02d1
        L_0x02de:
            int r0 = r6.A00
            r0 = r0 & 7
            r7 = 8
            if (r0 <= 0) goto L_0x02ee
        L_0x02e6:
            if (r0 >= r7) goto L_0x02ee
            r6.A02(r9)
            int r0 = r0 + 1
            goto L_0x02e6
        L_0x02ee:
            int r0 = r6.A00
            int r0 = r0 + 7
            int r0 = r0 / 8
            int r5 = r30 - r0
        L_0x02f6:
            if (r9 >= r5) goto L_0x0306
            r3 = r9 & 1
            r0 = 17
            if (r3 != 0) goto L_0x0300
            r0 = 236(0xec, float:3.31E-43)
        L_0x0300:
            r6.A01(r0, r7)
            int r9 = r9 + 1
            goto L_0x02f6
        L_0x0306:
            int r9 = r6.A00
            if (r9 != r8) goto L_0x0759
            X.7Ga[] r8 = r10.A01
            int r7 = r8.length
            r5 = 0
            r3 = 0
        L_0x030f:
            if (r5 >= r7) goto L_0x0319
            r0 = r8[r5]
            int r0 = r0.A00
            int r3 = r3 + r0
            int r5 = r5 + 1
            goto L_0x030f
        L_0x0319:
            int r0 = r9 + 7
            int r5 = r0 / 8
            r0 = r30
            if (r5 != r0) goto L_0x0751
            java.util.ArrayList r29 = X.AnonymousClass002.A0I(r3)
            r5 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
        L_0x032e:
            r0 = r28
            if (r0 >= r3) goto L_0x0511
            r7 = 1
            int[] r0 = new int[r7]
            r24 = r0
            int[] r12 = new int[r7]
            r0 = r28
            if (r0 >= r3) goto L_0x0509
            int r14 = r4 % r3
            int r13 = r3 - r14
            int r7 = r4 / r3
            int r11 = r7 + 1
            int r10 = r30 / r3
            int r9 = r10 + 1
            int r7 = r7 - r10
            int r11 = r11 - r9
            if (r7 != r11) goto L_0x0501
            int r0 = r13 + r14
            if (r3 != r0) goto L_0x04f9
            int r8 = r10 + r7
            int r8 = r8 * r13
            int r0 = r9 + r11
            int r0 = r0 * r14
            int r8 = r8 + r0
            if (r4 != r8) goto L_0x04f1
            r0 = r28
            if (r0 >= r13) goto L_0x04d0
            r24[r5] = r10
            r12[r5] = r7
        L_0x0362:
            r8 = r24[r5]
            byte[] r0 = new byte[r8]
            r23 = r0
            int r12 = r27 << 3
            r11 = 0
        L_0x036b:
            if (r11 >= r8) goto L_0x0389
            r13 = 0
            r10 = 0
        L_0x036f:
            boolean r0 = r6.A03(r12)
            if (r0 == 0) goto L_0x037a
            int r9 = 7 - r13
            r0 = 1
            int r0 = r0 << r9
            r10 = r10 | r0
        L_0x037a:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r0 = 8
            if (r13 < r0) goto L_0x036f
            r0 = r23
            int r11 = X.AnonymousClass6CA.A0A(r0, r10, r11)
            goto L_0x036b
        L_0x0389:
            int r11 = r8 + r7
            int[] r9 = new int[r11]
            r22 = 0
            r10 = 0
        L_0x0390:
            if (r10 >= r8) goto L_0x039b
            byte r0 = r23[r10]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9[r10] = r0
            int r10 = r10 + 1
            goto L_0x0390
        L_0x039b:
            X.7kb r18 = X.C158817kb.A0D
            java.util.ArrayList r17 = X.AnonymousClass001.A0s()
            r10 = 1
            int[] r13 = new int[r10]
            r13[r5] = r10
            X.7bD r12 = new X.7bD
            r0 = r18
            r12.<init>(r0, r13)
            r0 = r17
            r0.add(r12)
            if (r7 == 0) goto L_0x04ea
            int r11 = r11 - r7
            if (r11 <= 0) goto L_0x04e3
            int r0 = r17.size()
            if (r7 < r0) goto L_0x03f5
            int r12 = r17.size()
            int r12 = r12 - r10
            r0 = r17
            java.lang.Object r13 = r0.get(r12)
            X.7bD r13 = (X.C153377bD) r13
            int r12 = r17.size()
        L_0x03ce:
            if (r12 > r7) goto L_0x03f5
            int[] r16 = X.C86664Kz.A1Z()
            r16[r5] = r10
            int r14 = r12 + -1
            r0 = r18
            int[] r0 = r0.A04
            r0 = r0[r14]
            r16[r10] = r0
            X.7bD r15 = new X.7bD
            r14 = r18
            r0 = r16
            r15.<init>(r14, r0)
            X.7bD r13 = r13.A04(r15)
            r0 = r17
            r0.add(r13)
            int r12 = r12 + 1
            goto L_0x03ce
        L_0x03f5:
            r0 = r17
            java.lang.Object r15 = r0.get(r7)
            X.7bD r15 = (X.C153377bD) r15
            int[] r13 = new int[r11]
            java.lang.System.arraycopy(r9, r5, r13, r5, r11)
            X.7bD r12 = new X.7bD
            r0 = r18
            r12.<init>(r0, r13)
            X.7bD r14 = r12.A02(r7, r10)
            X.7kb r13 = r14.A00
            X.7kb r0 = r15.A00
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x04dc
            int[] r0 = r15.A01
            r12 = r0
            r0 = r0[r5]
            if (r0 != 0) goto L_0x0425
            java.lang.String r0 = "Divide by 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0425:
            X.7bD r0 = r13.A03
            r31 = r0
            r21 = r0
            int r0 = r12.length
            int r20 = r0 + -1
            int r0 = r20 - r20
            r0 = r12[r0]
            int r19 = r13.A00(r0)
        L_0x0436:
            int[] r0 = r14.A01
            int r0 = r0.length
            int r0 = r0 + -1
            r12 = r0
            r0 = r20
            if (r12 < r0) goto L_0x0483
            int[] r0 = r14.A01
            r0 = r0[r5]
            if (r0 == 0) goto L_0x0483
            int[] r0 = r14.A01
            r12 = r0
            int r0 = r0.length
            int r0 = r0 + -1
            int r18 = r0 - r20
            int r0 = r0 - r0
            r0 = r12[r0]
            r12 = r0
            r0 = r19
            int r16 = r13.A01(r12, r0)
            r12 = r18
            r0 = r16
            X.7bD r17 = r15.A02(r12, r0)
            if (r18 < 0) goto L_0x04d7
            if (r16 != 0) goto L_0x0475
            r16 = r31
        L_0x0466:
            r12 = r21
            r0 = r16
            X.7bD r21 = r12.A03(r0)
            r0 = r17
            X.7bD r14 = r14.A03(r0)
            goto L_0x0436
        L_0x0475:
            int r0 = r18 + 1
            int[] r0 = new int[r0]
            r0[r5] = r16
            X.7bD r16 = new X.7bD
            r12 = r16
            r12.<init>(r13, r0)
            goto L_0x0466
        L_0x0483:
            r0 = 2
            X.7bD[] r0 = new X.C153377bD[r0]
            r0[r5] = r21
            r0[r10] = r14
            r0 = r0[r10]
            int[] r14 = r0.A01
            int r13 = r14.length
            int r12 = r7 - r13
            r10 = 0
        L_0x0492:
            if (r10 >= r12) goto L_0x049b
            int r0 = r11 + r10
            r9[r0] = r5
            int r10 = r10 + 1
            goto L_0x0492
        L_0x049b:
            int r11 = r11 + r12
            java.lang.System.arraycopy(r14, r5, r9, r11, r13)
            byte[] r11 = new byte[r7]
        L_0x04a1:
            r0 = r22
            if (r0 >= r7) goto L_0x04b0
            int r0 = r8 + r22
            r10 = r9[r0]
            r0 = r22
            int r22 = X.AnonymousClass6CA.A0A(r11, r10, r0)
            goto L_0x04a1
        L_0x04b0:
            X.7Gc r9 = new X.7Gc
            r0 = r23
            r9.<init>(r0, r11)
            r0 = r29
            r0.add(r9)
            r0 = r26
            int r26 = java.lang.Math.max(r0, r8)
            r0 = r25
            int r25 = java.lang.Math.max(r0, r7)
            r0 = r24[r5]
            int r27 = r27 + r0
            int r28 = r28 + 1
            goto L_0x032e
        L_0x04d0:
            r24[r5] = r9
            r12[r5] = r11
            r7 = r11
            goto L_0x0362
        L_0x04d7:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x04dc:
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x04e3:
            java.lang.String r0 = "No data bytes provided"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x04ea:
            java.lang.String r0 = "No error correction bytes"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x04f1:
            java.lang.String r1 = "Total bytes mismatch"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04f9:
            java.lang.String r1 = "RS blocks mismatch"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0501:
            java.lang.String r1 = "EC bytes mismatch"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0509:
            java.lang.String r1 = "Block ID too large"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0511:
            r3 = r27
            r0 = r30
            if (r0 != r3) goto L_0x0749
            X.8LP r3 = new X.8LP
            r3.<init>()
            r9 = 0
        L_0x051d:
            r8 = 8
            r0 = r26
            if (r9 >= r0) goto L_0x0541
            java.util.Iterator r7 = r29.iterator()
        L_0x0527:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r7.next()
            X.7Gc r0 = (X.C147887Gc) r0
            byte[] r6 = r0.A00
            int r0 = r6.length
            if (r9 >= r0) goto L_0x0527
            byte r0 = r6[r9]
            r3.A01(r0, r8)
            goto L_0x0527
        L_0x053e:
            int r9 = r9 + 1
            goto L_0x051d
        L_0x0541:
            r0 = r25
            if (r5 >= r0) goto L_0x0563
            java.util.Iterator r7 = r29.iterator()
        L_0x0549:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0560
            java.lang.Object r0 = r7.next()
            X.7Gc r0 = (X.C147887Gc) r0
            byte[] r6 = r0.A01
            int r0 = r6.length
            if (r5 >= r0) goto L_0x0549
            byte r0 = r6[r5]
            r3.A01(r0, r8)
            goto L_0x0549
        L_0x0560:
            int r5 = r5 + 1
            goto L_0x0541
        L_0x0563:
            int r0 = r3.A00
            int r0 = r0 + 7
            int r5 = r0 / 8
            if (r4 != r5) goto L_0x072c
            X.7To r4 = new X.7To
            r4.<init>()
            r0 = r32
            r4.A01 = r0
            r4.A02 = r1
            r4.A03 = r2
            int r0 = r2.A01
            int r0 = r0 * 4
            int r0 = r0 + 17
            X.7Sr r5 = new X.7Sr
            r5.<init>(r0, r0)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r18 = -1
            r6 = 0
        L_0x0589:
            r0 = r32
            X.C161647qA.A00(r3, r0, r2, r5, r6)
            int r10 = r5.A00
            int r13 = r5.A01
            byte[][] r12 = r5.A02
            r7 = 0
            r8 = 0
        L_0x0596:
            if (r7 >= r10) goto L_0x05bd
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x059b:
            r9 = 5
            if (r11 >= r13) goto L_0x05b3
            r0 = r12[r7]
            byte r1 = r0[r11]
            if (r1 != r15) goto L_0x05a9
            int r14 = r14 + 1
        L_0x05a6:
            int r11 = r11 + 1
            goto L_0x059b
        L_0x05a9:
            if (r14 < r9) goto L_0x05b0
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05b0:
            r15 = r1
            r14 = 1
            goto L_0x05a6
        L_0x05b3:
            if (r14 < r9) goto L_0x05ba
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x05ba:
            int r7 = r7 + 1
            goto L_0x0596
        L_0x05bd:
            r7 = 0
            r16 = 0
        L_0x05c0:
            if (r7 >= r13) goto L_0x05e9
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x05c5:
            r9 = 5
            if (r11 >= r10) goto L_0x05de
            r0 = r12[r11]
            byte r1 = r0[r7]
            if (r1 != r15) goto L_0x05d3
            int r14 = r14 + 1
        L_0x05d0:
            int r11 = r11 + 1
            goto L_0x05c5
        L_0x05d3:
            if (r14 < r9) goto L_0x05db
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05db:
            r15 = r1
            r14 = 1
            goto L_0x05d0
        L_0x05de:
            if (r14 < r9) goto L_0x05e6
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05e6:
            int r7 = r7 + 1
            goto L_0x05c0
        L_0x05e9:
            int r8 = r8 + r16
            r9 = 0
            r16 = 0
        L_0x05ee:
            int r0 = r10 + -1
            if (r9 >= r0) goto L_0x0614
            r15 = r12[r9]
            r14 = 0
        L_0x05f5:
            int r0 = r13 + -1
            if (r14 >= r0) goto L_0x0611
            byte r7 = r15[r14]
            int r11 = r14 + 1
            byte r0 = r15[r11]
            if (r7 != r0) goto L_0x060f
            int r0 = r9 + 1
            r1 = r12[r0]
            byte r0 = r1[r14]
            if (r7 != r0) goto L_0x060f
            byte r0 = r1[r11]
            if (r7 != r0) goto L_0x060f
            int r16 = r16 + 1
        L_0x060f:
            r14 = r11
            goto L_0x05f5
        L_0x0611:
            int r9 = r9 + 1
            goto L_0x05ee
        L_0x0614:
            int r0 = r16 * 3
            int r8 = r8 + r0
            r9 = 0
            r17 = 0
        L_0x061a:
            if (r9 >= r10) goto L_0x06eb
            r7 = 0
        L_0x061d:
            if (r7 >= r13) goto L_0x06e7
            r14 = r12[r9]
            int r11 = r7 + 6
            r1 = 1
            if (r11 >= r13) goto L_0x067a
            byte r0 = r14[r7]
            if (r0 != r1) goto L_0x067a
            int r0 = r7 + 1
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x067a
            int r0 = r7 + 2
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x067a
            int r0 = r7 + 3
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x067a
            int r0 = r7 + 4
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x067a
            int r0 = r7 + 5
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x067a
            byte r0 = r14[r11]
            if (r0 != r1) goto L_0x067a
            int r0 = r7 + -4
            r15 = 0
            int r11 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r16 = java.lang.Math.min(r7, r0)
        L_0x0658:
            r0 = r16
            if (r11 >= r0) goto L_0x0678
            byte r0 = r14[r11]
            int r11 = r11 + 1
            if (r0 != r1) goto L_0x0658
            int r0 = r7 + 7
            int r11 = r7 + 11
            int r15 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r11 = java.lang.Math.min(r11, r0)
        L_0x066f:
            if (r15 >= r11) goto L_0x0678
            byte r0 = r14[r15]
            if (r0 == r1) goto L_0x067a
            int r15 = r15 + 1
            goto L_0x066f
        L_0x0678:
            int r17 = r17 + 1
        L_0x067a:
            int r11 = r9 + 6
            if (r11 >= r10) goto L_0x06e3
            r0 = r12[r9]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e3
            int r0 = r9 + 1
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06e3
            int r0 = r9 + 2
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e3
            int r0 = r9 + 3
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e3
            int r0 = r9 + 4
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e3
            int r0 = r9 + 5
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06e3
            r0 = r12[r11]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06e3
            int r0 = r9 + -4
            r14 = 0
            int r15 = java.lang.Math.max(r0, r14)
            int r11 = r12.length
            int r16 = java.lang.Math.min(r9, r11)
        L_0x06be:
            r0 = r16
            if (r15 >= r0) goto L_0x06e1
            r0 = r12[r15]
            byte r0 = r0[r7]
            int r15 = r15 + 1
            if (r0 != r1) goto L_0x06be
            int r15 = r9 + 7
            int r0 = r9 + 11
            int r14 = java.lang.Math.max(r15, r14)
            int r11 = java.lang.Math.min(r0, r11)
        L_0x06d6:
            if (r14 >= r11) goto L_0x06e1
            r0 = r12[r14]
            byte r0 = r0[r7]
            if (r0 == r1) goto L_0x06e3
            int r14 = r14 + 1
            goto L_0x06d6
        L_0x06e1:
            int r17 = r17 + 1
        L_0x06e3:
            int r7 = r7 + 1
            goto L_0x061d
        L_0x06e7:
            int r9 = r9 + 1
            goto L_0x061a
        L_0x06eb:
            int r0 = r17 * 40
            int r8 = r8 + r0
            r14 = 0
            r11 = 0
        L_0x06f0:
            r9 = 1
            if (r14 >= r10) goto L_0x0704
            r7 = r12[r14]
            r1 = 0
        L_0x06f6:
            if (r1 >= r13) goto L_0x0701
            byte r0 = r7[r1]
            if (r0 != r9) goto L_0x06fe
            int r11 = r11 + 1
        L_0x06fe:
            int r1 = r1 + 1
            goto L_0x06f6
        L_0x0701:
            int r14 = r14 + 1
            goto L_0x06f0
        L_0x0704:
            int r10 = r10 * r13
            int r0 = r11 << 1
            int r0 = X.AnonymousClass001.A0A(r0, r10)
            int r0 = r0 * 10
            int r0 = r0 / r10
            int r0 = r0 * 10
            int r8 = r8 + r0
            r0 = r19
            if (r8 >= r0) goto L_0x0719
            r18 = r6
            r19 = r8
        L_0x0719:
            int r6 = r6 + 1
            r0 = 8
            if (r6 < r0) goto L_0x0589
            r0 = r18
            r4.A00 = r0
            r1 = r0
            r0 = r32
            X.C161647qA.A00(r3, r0, r2, r5, r1)
            r4.A04 = r5
            return r4
        L_0x072c:
            java.lang.String r0 = "Interleaving error: "
            java.lang.StringBuilder r1 = X.C18330xA.A0A(r0)
            r1.append(r4)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " differ."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0749:
            java.lang.String r1 = "Data bytes does not match offset"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0751:
            java.lang.String r1 = "Number of bits and data bytes does not match"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0759:
            java.lang.String r1 = "Bits size does not equal capacity"
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0761:
            java.lang.String r0 = "data bits cannot fit in the QR Code"
            java.lang.StringBuilder r1 = X.C18330xA.A0A(r0)
            r1.append(r3)
            java.lang.String r0 = " > "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r8)
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0776:
            java.lang.StringBuilder r1 = X.C18320x8.A0j(r5)
            java.lang.String r0 = " is bigger than "
            r1.append(r0)
            int r3 = r3 - r4
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r3)
            X.6zg r0 = new X.6zg
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159727mM.A00(X.21X, java.lang.String, java.util.Map):X.7To");
    }

    public static boolean A01(AnonymousClass21X r7, C161347pT r8, int i) {
        int i2 = r8.A00;
        C147877Gb r0 = r8.A03[r7.ordinal()];
        int i3 = r0.A00;
        int i4 = 0;
        for (C147867Ga r02 : r0.A01) {
            i4 += r02.A00;
        }
        return C18280x3.A1U(i2 - (i3 * i4), (i + 7) / 8);
    }
}
