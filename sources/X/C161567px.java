package X;

import android.util.Pair;

/* renamed from: X.7px  reason: invalid class name and case insensitive filesystem */
public final class C161567px {
    public static final byte[] A00 = "OpusHead".getBytes(AnonymousClass79T.A05);

    public static Pair A00(C161457ph r19, int i, int i2) {
        int i3;
        int i4;
        C161457ph r5 = r19;
        int i5 = r5.A01;
        while (i5 - i < i2) {
            int A02 = C161457ph.A02(r5, i5);
            AnonymousClass70y.A00(AnonymousClass001.A1W(A02), "childAtomSize must be positive");
            if (r5.A03() == 1936289382) {
                int i6 = i5 + 8;
                boolean z = false;
                AnonymousClass7NR r12 = null;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A02) {
                    int A022 = C161457ph.A02(r5, i6);
                    int A03 = r5.A03();
                    if (A03 == 1718775137) {
                        num = Integer.valueOf(r5.A03());
                    } else if (A03 == 1935894637) {
                        r5.A0I(4);
                        str = r5.A0D(4);
                    } else if (A03 == 1935894633) {
                        i7 = i6;
                        i8 = A022;
                    }
                    i6 += A022;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AnonymousClass70y.A00(AnonymousClass000.A1W(num), "frma atom is mandatory");
                    AnonymousClass70y.A00(AnonymousClass001.A1X(i7, -1), "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        int A023 = C161457ph.A02(r5, i9);
                        if (r5.A03() == 1952804451) {
                            int A032 = (r5.A03() >> 24) & 255;
                            r5.A0I(1);
                            if (A032 == 0) {
                                r5.A0I(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A04 = r5.A04();
                                i3 = (A04 & 240) >> 4;
                                i4 = A04 & 15;
                            }
                            boolean A1U = AnonymousClass000.A1U(r5.A04(), 1);
                            int A042 = r5.A04();
                            byte[] bArr2 = new byte[16];
                            r5.A0J(bArr2, 0, 16);
                            if (A1U && A042 == 0) {
                                int A043 = r5.A04();
                                bArr = new byte[A043];
                                r5.A0J(bArr, 0, A043);
                            }
                            r12 = new AnonymousClass7NR(str, bArr2, bArr, A042, i3, i4, A1U);
                            z = true;
                        } else {
                            i9 += A023;
                        }
                    }
                    AnonymousClass70y.A00(z, "tenc atom is mandatory");
                    Pair create = Pair.create(num, r12);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i5 += A02;
        }
        return null;
    }

    public static C157797it A01(String str, int i) {
        C157797it r1 = new C157797it();
        r1.A0P = Integer.toString(i);
        r1.A0R = str;
        return r1;
    }

    public static C149137Le A02(C161457ph r9, int i) {
        r9.A0H(i + 8 + 4);
        r9.A0I(1);
        do {
        } while ((r9.A04() & 128) == 128);
        int A01 = C161457ph.A01(r9, 2);
        if ((A01 & 128) != 0) {
            r9.A0I(2);
        }
        if ((A01 & 64) != 0) {
            r9.A0I(r9.A04());
        }
        if ((A01 & 32) != 0) {
            r9.A0I(2);
        }
        r9.A0I(1);
        do {
        } while ((r9.A04() & 128) == 128);
        String A03 = C162097rD.A03(r9.A04());
        if ("audio/mpeg".equals(A03) || "audio/vnd.dts".equals(A03) || "audio/vnd.dts.hd".equals(A03)) {
            return new C149137Le(A03, (byte[]) null, -1, -1);
        }
        r9.A0I(4);
        long A09 = r9.A09();
        long A092 = r9.A09();
        int A012 = C161457ph.A01(r9, 1);
        int i2 = A012 & 127;
        while ((A012 & 128) == 128) {
            A012 = r9.A04();
            i2 = (i2 << 7) | (A012 & 127);
        }
        byte[] bArr = new byte[i2];
        r9.A0J(bArr, 0, i2);
        long j = -1;
        if (A092 <= 0) {
            A092 = -1;
        }
        if (A09 > 0) {
            j = A09;
        }
        return new C149137Le(A03, bArr, A092, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: X.7NR[]} */
    /* JADX WARNING: type inference failed for: r3v71, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07fa, code lost:
        if (r20 != null) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0830, code lost:
        if (r22 <= 0) goto L_0x0832;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0e12, code lost:
        if (r1 == 7) goto L_0x0e14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:763:0x0fd1, code lost:
        if ((r7.A04() & 128) == 0) goto L_0x0fd3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:775:0x0fea, code lost:
        if (r0 == 7) goto L_0x0fec;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1012:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:886:0x1192  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C150247Pw A03(X.C166657z3 r74, X.C125816Jp r75, X.C125806Jo r76, long r77, boolean r79) {
        /*
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r68 = r75
            r0 = r68
            X.6Jp r4 = r0.A00(r1)
            r4.getClass()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.6Jo r0 = r4.A01(r0)
            r0.getClass()
            X.7ph r1 = r0.A00
            r0 = 16
            int r1 = X.C161457ph.A02(r1, r0)
            r0 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r1 != r0) goto L_0x10c5
            r25 = 1
        L_0x0027:
            r1 = -1
            r32 = 0
            r0 = r25
            if (r0 == r1) goto L_0x11b1
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            r0 = r68
            X.6Jo r0 = r0.A01(r1)
            r0.getClass()
            X.7ph r8 = r0.A00
            r5 = 8
            int r9 = X.C161457ph.A00(r8)
            r7 = 16
            r0 = 16
            if (r9 != 0) goto L_0x004a
            r0 = 8
        L_0x004a:
            r8.A0I(r0)
            int r45 = r8.A03()
            r3 = 4
            r8.A0I(r3)
            int r6 = r8.A01
            if (r9 != 0) goto L_0x005a
            r5 = 4
        L_0x005a:
            r30 = 0
            r2 = 0
        L_0x005d:
            byte[] r1 = r8.A02
            int r0 = r6 + r2
            byte r1 = r1[r0]
            r0 = -1
            if (r1 == r0) goto L_0x10be
            r2 = 0
        L_0x0067:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x10aa
            r8.A0I(r5)
        L_0x0071:
            r8.A0I(r7)
            int r6 = r8.A03()
            int r5 = r8.A03()
            r8.A0I(r3)
            int r7 = r8.A03()
            int r8 = r8.A03()
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r6 != 0) goto L_0x109e
            if (r5 != r2) goto L_0x1094
            if (r7 != r3) goto L_0x0095
            if (r8 != 0) goto L_0x0095
            r30 = 90
        L_0x0095:
            r72 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r77 > r72 ? 1 : (r77 == r72 ? 0 : -1))
            if (r2 == 0) goto L_0x00a0
            r0 = r77
        L_0x00a0:
            r2 = r76
            X.7ph r5 = r2.A00
            r3 = 8
            int r2 = X.C161457ph.A00(r5)
            if (r2 == 0) goto L_0x00ae
            r3 = 16
        L_0x00ae:
            r5.A0I(r3)
            long r42 = r5.A09()
            int r2 = (r0 > r72 ? 1 : (r0 == r72 ? 0 : -1))
            if (r2 == 0) goto L_0x00bf
            r2 = r42
            long r72 = com.facebook.android.exoplayer2.util.Util.A06(r0, r2)
        L_0x00bf:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.6Jp r1 = r4.A00(r0)
            r1.getClass()
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.6Jp r2 = r1.A00(r0)
            r2.getClass()
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            X.6Jo r0 = r4.A01(r0)
            r0.getClass()
            X.7ph r6 = r0.A00
            r3 = 8
            int r1 = X.C161457ph.A00(r6)
            r0 = 16
            if (r1 != 0) goto L_0x00eb
            r0 = 8
        L_0x00eb:
            r6.A0I(r0)
            long r4 = r6.A09()
            if (r1 != 0) goto L_0x00f5
            r3 = 4
        L_0x00f5:
            r6.A0I(r3)
            int r3 = r6.A06()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = ""
            r1.append(r0)
            int r0 = r3 >> 10
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r3 >> 5
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            r0 = r3 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            java.lang.String r1 = X.AnonymousClass001.A0j(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            android.util.Pair r44 = android.util.Pair.create(r0, r1)
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            X.6Jo r0 = r2.A01(r0)
            r0.getClass()
            X.7ph r7 = r0.A00
            r0 = r44
            java.lang.Object r0 = r0.second
            r40 = r0
            r0 = r40
            java.lang.String r0 = (java.lang.String) r0
            r40 = r0
            r0 = 12
            int r41 = X.C161457ph.A02(r7, r0)
            r5 = 0
            r38 = 0
            r0 = r41
            X.7NR[] r0 = new X.AnonymousClass7NR[r0]
            r34 = r0
            r66 = 0
            r24 = 0
        L_0x0155:
            r1 = r24
            r0 = r41
            if (r1 >= r0) goto L_0x112d
            int r0 = r7.A01
            r16 = r0
            int r31 = r7.A03()
            boolean r0 = X.AnonymousClass001.A1W(r31)
            java.lang.String r39 = "childAtomSize must be positive"
            r1 = r39
            X.AnonymousClass70y.A00(r0, r1)
            int r6 = r7.A03()
            r0 = 1635148593(0x61766331, float:2.840654E20)
            r3 = r74
            if (r6 == r0) goto L_0x0747
            r0 = 1635148595(0x61766333, float:2.8406544E20)
            if (r6 == r0) goto L_0x0747
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r6 == r0) goto L_0x0747
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r6 == r0) goto L_0x0747
            r0 = 1836070006(0x6d703476, float:4.646239E27)
            if (r6 == r0) goto L_0x0747
            r0 = 1752589105(0x68766331, float:4.6541277E24)
            if (r6 == r0) goto L_0x0747
            r0 = 1751479857(0x68657631, float:4.3344087E24)
            if (r6 == r0) goto L_0x0747
            r0 = 1932670515(0x73323633, float:1.4119387E31)
            if (r6 == r0) goto L_0x0747
            r0 = 1211250227(0x48323633, float:182488.8)
            if (r6 == r0) goto L_0x0747
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r6 == r0) goto L_0x0747
            r0 = 1987063865(0x76703039, float:1.2178997E33)
            if (r6 == r0) goto L_0x0747
            r0 = 1635135537(0x61763031, float:2.8383572E20)
            if (r6 == r0) goto L_0x0747
            r0 = 1685479798(0x64766176, float:1.8179687E22)
            if (r6 == r0) goto L_0x0747
            r0 = 1685479729(0x64766131, float:1.817961E22)
            if (r6 == r0) goto L_0x0747
            r0 = 1685481573(0x64766865, float:1.8181686E22)
            if (r6 == r0) goto L_0x0747
            r0 = 1685481521(0x64766831, float:1.8181627E22)
            if (r6 == r0) goto L_0x0747
            r0 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r6 == r0) goto L_0x02f6
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r6 == r0) goto L_0x02f6
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r6 == r0) goto L_0x02f6
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r6 == r0) goto L_0x02f6
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r6 == r0) goto L_0x02f6
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r6 == r0) goto L_0x029f
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r6 == r0) goto L_0x029f
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r6 == r0) goto L_0x029f
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r6 == r0) goto L_0x029f
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r6 == r0) goto L_0x029f
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r6 != r0) goto L_0x0285
            int r0 = r16 + 8
            int r0 = r0 + 8
            r7.A0H(r0)
            r7.A0B()
            java.lang.String r0 = r7.A0B()
            if (r0 == 0) goto L_0x027a
            r1 = r45
            X.7it r0 = A01(r0, r1)
            X.7z1 r5 = new X.7z1
            r5.<init>(r0)
        L_0x027a:
            int r16 = r16 + r31
            r0 = r16
            r7.A0H(r0)
            int r24 = r24 + 1
            goto L_0x0155
        L_0x0285:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r6 != r0) goto L_0x027a
            X.7it r0 = new X.7it
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r45)
            r0.A0P = r1
            java.lang.String r1 = "application/x-camera-motion"
            r0.A0R = r1
            X.7z1 r5 = new X.7z1
            r5.<init>(r0)
            goto L_0x027a
        L_0x029f:
            int r0 = r16 + 8
            int r0 = r0 + 8
            r7.A0H(r0)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            java.lang.String r4 = "application/ttml+xml"
            r3 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 == r2) goto L_0x02c8
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r6 != r2) goto L_0x02dc
            int r2 = r31 + -8
            int r4 = r2 + -8
            byte[] r3 = new byte[r4]
            r2 = 0
            r7.A0J(r3, r2, r4)
            X.6aY r3 = X.C129586aY.of(r3)
            java.lang.String r4 = "application/x-quicktime-tx3g"
        L_0x02c8:
            r2 = r45
            X.7it r2 = A01(r4, r2)
            r4 = r40
            r2.A0Q = r4
            r2.A0I = r0
            r2.A0S = r3
            X.7z1 r5 = new X.7z1
            r5.<init>(r2)
            goto L_0x027a
        L_0x02dc:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r6 != r2) goto L_0x02e4
            java.lang.String r4 = "application/x-mp4-vtt"
            goto L_0x02c8
        L_0x02e4:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r6 != r2) goto L_0x02ec
            r0 = 0
            goto L_0x02c8
        L_0x02ec:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r6 != r2) goto L_0x10f1
            r66 = 1
            java.lang.String r4 = "application/x-mp4-cea-608"
            goto L_0x02c8
        L_0x02f6:
            r11 = r3
            int r0 = r16 + 8
            r1 = 8
            int r0 = r0 + 8
            r7.A0H(r0)
            r0 = 6
            if (r79 == 0) goto L_0x0709
            int r8 = r7.A06()
            r7.A0I(r0)
        L_0x030a:
            r4 = 16
            r13 = 4
            r1 = 2
            r2 = 1
            if (r8 == 0) goto L_0x06e2
            if (r8 == r2) goto L_0x06e2
            if (r8 != r1) goto L_0x027a
            r7.A0I(r4)
            long r0 = r7.A08()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = java.lang.Math.round(r0)
            int r9 = (int) r0
            int r10 = r7.A05()
            r0 = 20
            r7.A0I(r0)
            r19 = 0
        L_0x0330:
            int r8 = r7.A01
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r6 != r0) goto L_0x034f
            r1 = r16
            r0 = r31
            android.util.Pair r2 = A00(r7, r1, r0)
            if (r2 == 0) goto L_0x034c
            int r6 = X.C18280x3.A03(r2)
            if (r74 != 0) goto L_0x06cb
            r11 = 0
        L_0x0348:
            java.lang.Object r0 = r2.second
            r34[r24] = r0
        L_0x034c:
            r7.A0H(r8)
        L_0x034f:
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r6 != r0) goto L_0x060d
            java.lang.String r4 = "audio/ac3"
        L_0x0359:
            r18 = -1
        L_0x035b:
            r6 = 0
            r17 = 0
            r3 = 0
        L_0x035f:
            int r1 = r8 - r16
            r0 = r31
            if (r1 >= r0) goto L_0x070f
            int r2 = X.C161457ph.A02(r7, r8)
            boolean r1 = X.AnonymousClass001.A1W(r2)
            r0 = r39
            X.AnonymousClass70y.A00(r1, r0)
            int r0 = r7.A03()
            r1 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r0 != r1) goto L_0x038e
            int r3 = r2 + -13
            byte[] r1 = new byte[r3]
            int r0 = r8 + 13
            r7.A0H(r0)
            r0 = 0
            r7.A0J(r1, r0, r3)
            X.6aY r3 = X.C129586aY.of(r1)
        L_0x038c:
            int r8 = r8 + r2
            goto L_0x035f
        L_0x038e:
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 == r12) goto L_0x0595
            if (r79 == 0) goto L_0x03be
            r1 = 2002876005(0x77617665, float:4.5729223E33)
            if (r0 != r1) goto L_0x03be
            int r1 = r7.A01
            boolean r13 = X.C18280x3.A1U(r1, r8)
            r0 = r32
            X.AnonymousClass70y.A00(r13, r0)
        L_0x03a5:
            int r0 = r1 - r8
            if (r0 >= r2) goto L_0x038c
            int r14 = X.C161457ph.A02(r7, r1)
            boolean r13 = X.AnonymousClass001.A1W(r14)
            r0 = r39
            X.AnonymousClass70y.A00(r13, r0)
            int r0 = r7.A03()
            if (r0 == r12) goto L_0x0596
            int r1 = r1 + r14
            goto L_0x03a5
        L_0x03be:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r0 != r1) goto L_0x0406
            int r0 = r8 + 8
            r7.A0H(r0)
            java.lang.String r0 = java.lang.Integer.toString(r45)
            int r1 = r7.A04()
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r5 = r1 >> 6
            int[] r1 = X.C1461678x.A02
            r12 = r1[r5]
            int r13 = r7.A04()
            int[] r5 = X.C1461678x.A01
            r1 = r13 & 56
            int r1 = r1 >> 3
            r5 = r5[r1]
            r1 = r13 & 4
            if (r1 == 0) goto L_0x03ea
            int r5 = r5 + 1
        L_0x03ea:
            X.7it r1 = new X.7it
            r1.<init>()
            r1.A0P = r0
            java.lang.String r0 = "audio/ac3"
            r1.A0R = r0
            r1.A04 = r5
            r1.A0E = r12
            r1.A00(r11)
            r0 = r40
            r1.A0Q = r0
            X.7z1 r5 = new X.7z1
            r5.<init>(r1)
            goto L_0x038c
        L_0x0406:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r0 != r1) goto L_0x0475
            int r0 = r8 + 8
            r7.A0H(r0)
            java.lang.String r13 = java.lang.Integer.toString(r45)
            r0 = 2
            int r1 = X.C161457ph.A01(r7, r0)
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r5 = r1 >> 6
            int[] r1 = X.C1461678x.A02
            r12 = r1[r5]
            int r14 = r7.A04()
            int[] r5 = X.C1461678x.A01
            r1 = r14 & 14
            int r1 = r1 >> 1
            r5 = r5[r1]
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0433
            int r5 = r5 + 1
        L_0x0433:
            int r1 = r7.A04()
            r1 = r1 & 30
            int r1 = r1 >> 1
            if (r1 <= 0) goto L_0x0446
            int r1 = r7.A04()
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0446
            int r5 = r5 + 2
        L_0x0446:
            int r1 = r7.A00
            int r0 = r7.A01
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0472
            int r0 = r7.A04()
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0472
            java.lang.String r1 = "audio/eac3-joc"
        L_0x0457:
            X.7it r0 = new X.7it
            r0.<init>()
            r0.A0P = r13
            r0.A0R = r1
            r0.A04 = r5
            r0.A0E = r12
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.7z1 r5 = new X.7z1
            r5.<init>(r0)
            goto L_0x038c
        L_0x0472:
            java.lang.String r1 = "audio/eac3"
            goto L_0x0457
        L_0x0475:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r0 != r1) goto L_0x04b3
            int r0 = r8 + 8
            r7.A0H(r0)
            java.lang.String r12 = java.lang.Integer.toString(r45)
            r0 = 1
            int r0 = X.C161457ph.A01(r7, r0)
            r0 = r0 & 32
            int r5 = r0 >> 5
            r0 = 1
            r1 = 44100(0xac44, float:6.1797E-41)
            if (r5 != r0) goto L_0x0495
            r1 = 48000(0xbb80, float:6.7262E-41)
        L_0x0495:
            X.7it r0 = new X.7it
            r0.<init>()
            r0.A0P = r12
            java.lang.String r5 = "audio/ac4"
            r0.A0R = r5
            r5 = 2
            r0.A04 = r5
            r0.A0E = r1
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.7z1 r5 = new X.7z1
            r5.<init>(r0)
            goto L_0x038c
        L_0x04b3:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r0 != r1) goto L_0x04bf
            if (r19 <= 0) goto L_0x10f6
            r9 = r19
            r10 = 2
            goto L_0x038c
        L_0x04bf:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r0 != r1) goto L_0x04dc
            r0 = r45
            X.7it r0 = A01(r4, r0)
            r0.A04 = r10
            r0.A0E = r9
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.7z1 r5 = new X.7z1
            r5.<init>(r0)
            goto L_0x038c
        L_0x04dc:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r0 != r1) goto L_0x0524
            int r1 = r2 + -8
            byte[] r3 = A00
            int r0 = r3.length
            int r12 = r0 + r1
            byte[] r12 = java.util.Arrays.copyOf(r3, r12)
            int r3 = r8 + 8
            r7.A0H(r3)
            r7.A0J(r12, r0, r1)
            r0 = 11
            int r1 = X.AnonymousClass6C9.A0F(r12, r0)
            r0 = 10
            int r0 = X.AnonymousClass6CA.A0B(r12, r0, r1)
            long r0 = (long) r0
            r13 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r13
            r13 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 / r13
            r3 = 3
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r3)
            r3.add(r12)
            byte[] r0 = X.AnonymousClass6C7.A1a(r0)
            r3.add(r0)
            r0 = 80000000(0x4c4b400, double:3.95252517E-316)
            byte[] r0 = X.AnonymousClass6C7.A1a(r0)
            r3.add(r0)
            goto L_0x038c
        L_0x0524:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r0 != r1) goto L_0x0552
            int r3 = r2 + -12
            int r0 = r3 + 4
            byte[] r1 = new byte[r0]
            r12 = 102(0x66, float:1.43E-43)
            r0 = 0
            r1[r0] = r12
            r12 = 76
            r0 = 1
            r1[r0] = r12
            r12 = 97
            r0 = 2
            r1[r0] = r12
            r12 = 3
            r0 = 67
            r1[r12] = r0
            int r0 = r8 + 12
            r7.A0H(r0)
            r0 = 4
            r7.A0J(r1, r0, r3)
            X.6aY r3 = X.C129586aY.of(r1)
            goto L_0x038c
        L_0x0552:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r0 != r1) goto L_0x038c
            int r3 = r2 + -12
            byte[] r0 = new byte[r3]
            int r1 = r8 + 12
            r7.A0H(r1)
            r1 = 0
            r7.A0J(r0, r1, r3)
            X.7ph r3 = new X.7ph
            r3.<init>((byte[]) r0)
            r1 = 9
            r3.A0H(r1)
            int r9 = r3.A04()
            r1 = 20
            r3.A0H(r1)
            int r1 = r3.A05()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            int r9 = X.C18280x3.A03(r1)
            int r10 = X.C18290x4.A03(r1)
            X.6aY r3 = X.C129586aY.of(r0)
            goto L_0x038c
        L_0x0595:
            r1 = r8
        L_0x0596:
            r15 = -1
            if (r1 == r15) goto L_0x038c
            X.7Le r6 = A02(r7, r1)
            java.lang.String r4 = r6.A02
            byte[] r12 = r6.A03
            if (r12 == 0) goto L_0x038c
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0607
            X.7k6 r10 = new X.7k6
            r10.<init>(r12)
            r0 = 5
            int r0 = r10.A00(r0)
            r9 = 31
            if (r0 != r9) goto L_0x05c0
            r0 = 6
            int r0 = r10.A00(r0)
            int r0 = r0 + 32
        L_0x05c0:
            int r3 = X.C155267ea.A00(r10)
            r1 = 4
            int r17 = r10.A00(r1)
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()
            java.lang.String r13 = "mp4a.40."
            java.lang.String r14 = X.AnonymousClass000.A0Y(r13, r14, r0)
            r13 = 5
            if (r0 == r13) goto L_0x05da
            r13 = 29
            if (r0 != r13) goto L_0x05f4
        L_0x05da:
            int r3 = X.C155267ea.A00(r10)
            r0 = 5
            int r0 = r10.A00(r0)
            if (r0 != r9) goto L_0x05ec
            r0 = 6
            int r0 = r10.A00(r0)
            int r0 = r0 + 32
        L_0x05ec:
            r9 = 22
            if (r0 != r9) goto L_0x05f4
            int r17 = r10.A00(r1)
        L_0x05f4:
            int[] r0 = X.C155267ea.A00
            r1 = r0[r17]
            if (r1 == r15) goto L_0x110b
            X.7Ir r0 = new X.7Ir
            r0.<init>(r3, r1, r14)
            int r9 = r0.A01
            int r10 = r0.A00
            java.lang.String r0 = r0.A02
            r17 = r0
        L_0x0607:
            X.6aY r3 = X.C129586aY.of(r12)
            goto L_0x038c
        L_0x060d:
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r6 != r0) goto L_0x0616
            java.lang.String r4 = "audio/eac3"
            goto L_0x0359
        L_0x0616:
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r6 != r0) goto L_0x061f
            java.lang.String r4 = "audio/ac4"
            goto L_0x0359
        L_0x061f:
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r6 != r0) goto L_0x0628
            java.lang.String r4 = "audio/vnd.dts"
            goto L_0x0359
        L_0x0628:
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r6 == r0) goto L_0x06c7
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r6 == r0) goto L_0x06c7
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r6 != r0) goto L_0x063b
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0359
        L_0x063b:
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r6 != r0) goto L_0x0644
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x0359
        L_0x0644:
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r6 != r0) goto L_0x064d
            java.lang.String r4 = "audio/3gpp"
            goto L_0x0359
        L_0x064d:
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r6 != r0) goto L_0x0656
            java.lang.String r4 = "audio/amr-wb"
            goto L_0x0359
        L_0x0656:
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            java.lang.String r4 = "audio/raw"
            if (r6 == r0) goto L_0x06c3
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r6 == r0) goto L_0x06c3
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r6 != r0) goto L_0x066b
            r18 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x035b
        L_0x066b:
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r6 == r0) goto L_0x06bf
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r6 == r0) goto L_0x06bf
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r6 != r0) goto L_0x067e
            java.lang.String r4 = "audio/mha1"
            goto L_0x0359
        L_0x067e:
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r6 != r0) goto L_0x0687
            java.lang.String r4 = "audio/mhm1"
            goto L_0x0359
        L_0x0687:
            if (r6 != r1) goto L_0x068d
            java.lang.String r4 = "audio/alac"
            goto L_0x0359
        L_0x068d:
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r6 != r0) goto L_0x0696
            java.lang.String r4 = "audio/g711-alaw"
            goto L_0x0359
        L_0x0696:
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r6 != r0) goto L_0x069f
            java.lang.String r4 = "audio/g711-mlaw"
            goto L_0x0359
        L_0x069f:
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r6 != r0) goto L_0x06a8
            java.lang.String r4 = "audio/opus"
            goto L_0x0359
        L_0x06a8:
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r6 != r0) goto L_0x06b1
            java.lang.String r4 = "audio/flac"
            goto L_0x0359
        L_0x06b1:
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r6 != r0) goto L_0x06ba
            java.lang.String r4 = "audio/true-hd"
            goto L_0x0359
        L_0x06ba:
            r18 = -1
            r4 = 0
            goto L_0x035b
        L_0x06bf:
            java.lang.String r4 = "audio/mpeg"
            goto L_0x0359
        L_0x06c3:
            r18 = 2
            goto L_0x035b
        L_0x06c7:
            java.lang.String r4 = "audio/vnd.dts.hd"
            goto L_0x0359
        L_0x06cb:
            java.lang.Object r0 = r2.second
            X.7NR r0 = (X.AnonymousClass7NR) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r3.A02
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r0, r1)
            if (r0 != 0) goto L_0x0348
            X.7yl[] r0 = r3.A03
            X.7z3 r11 = new X.7z3
            r11.<init>(r1, r0)
            goto L_0x0348
        L_0x06e2:
            int r10 = r7.A06()
            r7.A0I(r0)
            byte[] r9 = r7.A02
            int r0 = r7.A01
            int r1 = r0 + 1
            int r0 = X.AnonymousClass6C9.A0F(r9, r0)
            int r12 = r1 + 1
            int r9 = X.AnonymousClass6CA.A0B(r9, r1, r0)
            int r0 = r12 + 2
            r7.A01 = r0
            int r0 = r0 - r13
            int r19 = X.C161457ph.A02(r7, r0)
            if (r8 != r2) goto L_0x0330
            r7.A0I(r4)
            goto L_0x0330
        L_0x0709:
            r7.A0I(r1)
            r8 = 0
            goto L_0x030a
        L_0x070f:
            if (r5 != 0) goto L_0x027a
            if (r4 == 0) goto L_0x027a
            r0 = r45
            X.7it r2 = A01(r4, r0)
            r0 = r17
            r2.A0N = r0
            r2.A04 = r10
            r2.A0E = r9
            r0 = r18
            r2.A0A = r0
            r2.A0S = r3
            r2.A00(r11)
            r0 = r40
            r2.A0Q = r0
            if (r6 == 0) goto L_0x0740
            long r0 = r6.A00
            int r0 = X.C159357lh.A01(r0)
            r2.A03 = r0
            long r0 = r6.A01
            int r0 = X.C159357lh.A01(r0)
            r2.A0B = r0
        L_0x0740:
            X.7z1 r5 = new X.7z1
            r5.<init>(r2)
            goto L_0x027a
        L_0x0747:
            r33 = r3
            int r0 = r16 + 8
            int r0 = r0 + 8
            r7.A0H(r0)
            r0 = 16
            r7.A0I(r0)
            int r36 = r7.A06()
            int r37 = r7.A06()
            r0 = 50
            r7.A0I(r0)
            int r0 = r7.A01
            r28 = r0
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r6 != r0) goto L_0x0786
            r1 = r16
            r0 = r31
            android.util.Pair r2 = A00(r7, r1, r0)
            if (r2 == 0) goto L_0x0781
            int r6 = X.C18280x3.A03(r2)
            if (r74 != 0) goto L_0x107b
            r33 = 0
        L_0x077d:
            java.lang.Object r0 = r2.second
            r34[r24] = r0
        L_0x0781:
            r0 = r28
            r7.A0H(r0)
        L_0x0786:
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r35 = "video/3gpp"
            if (r6 != r0) goto L_0x1071
            java.lang.String r11 = "video/mpeg"
        L_0x078f:
            r27 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r49 = 0
            r48 = 0
            r21 = -1
            r19 = -1
            r18 = -1
            r17 = -1
            r20 = 0
            r29 = 0
            r23 = 0
        L_0x07a5:
            int r1 = r28 - r16
            r0 = r31
            if (r1 >= r0) goto L_0x07c0
            r0 = r28
            r7.A0H(r0)
            int r2 = r7.A01
            int r22 = r7.A03()
            if (r22 != 0) goto L_0x082f
            int r1 = r7.A01
            int r1 = r1 - r16
            r0 = r31
            if (r1 != r0) goto L_0x0832
        L_0x07c0:
            if (r11 == 0) goto L_0x027a
            r0 = r45
            X.7it r2 = A01(r11, r0)
            r0 = r49
            r2.A0N = r0
            r0 = r36
            r2.A0H = r0
            r0 = r37
            r2.A08 = r0
            r0 = r27
            r2.A01 = r0
            r0 = r30
            r2.A0D = r0
            r0 = r26
            r2.A0T = r0
            r0 = r21
            r2.A0G = r0
            r0 = r48
            r2.A0S = r0
            r0 = r33
            r2.A00(r0)
            r0 = -1
            r1 = r19
            if (r1 != r0) goto L_0x082a
            r1 = r18
            if (r1 != r0) goto L_0x082a
            r1 = r17
            if (r1 != r0) goto L_0x082a
            if (r20 == 0) goto L_0x080d
        L_0x07fc:
            byte[] r1 = r20.array()
        L_0x0800:
            X.7z0 r0 = new X.7z0
            r3 = r19
            r4 = r18
            r5 = r17
            r0.<init>(r3, r1, r4, r5)
            r2.A0M = r0
        L_0x080d:
            if (r29 == 0) goto L_0x0823
            r0 = r29
            long r0 = r0.A00
            int r0 = X.C159357lh.A01(r0)
            r2.A03 = r0
            r0 = r29
            long r0 = r0.A01
            int r0 = X.C159357lh.A01(r0)
            r2.A0B = r0
        L_0x0823:
            X.7z1 r5 = new X.7z1
            r5.<init>(r2)
            goto L_0x027a
        L_0x082a:
            if (r20 != 0) goto L_0x07fc
            r1 = r32
            goto L_0x0800
        L_0x082f:
            r1 = 1
            if (r22 > 0) goto L_0x0833
        L_0x0832:
            r1 = 0
        L_0x0833:
            r0 = r39
            X.AnonymousClass70y.A00(r1, r0)
            int r3 = r7.A03()
            r0 = 1635148611(0x61766343, float:2.8406573E20)
            if (r3 != r0) goto L_0x0a01
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r32
            X.AnonymousClass70y.A00(r1, r0)
            int r0 = r2 + 8
            r7.A0H(r0)
            r0 = 4
            int r1 = X.C161457ph.A01(r7, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r0 = 3
            r1 = r1 & 3
            int r14 = r1 + 1
            if (r14 == r0) goto L_0x1114
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r0 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10 = r0 & 31
            r4 = 0
            r9 = 0
        L_0x0867:
            if (r9 >= r10) goto L_0x0887
            int r8 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r12 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r7.A0I(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            byte[] r3 = r7.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            byte[] r2 = X.AnonymousClass78H.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r1 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r0 = r1 + r8
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.System.arraycopy(r2, r4, r0, r4, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.System.arraycopy(r3, r12, r0, r1, r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r11.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r9 = r9 + 1
            goto L_0x0867
        L_0x0887:
            int r13 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r9 = 0
        L_0x088c:
            if (r9 >= r13) goto L_0x08ac
            int r8 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r12 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r7.A0I(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            byte[] r3 = r7.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            byte[] r2 = X.AnonymousClass78H.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r1 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r0 = r1 + r8
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.System.arraycopy(r2, r4, r0, r4, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.System.arraycopy(r3, r12, r0, r1, r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r11.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r9 = r9 + 1
            goto L_0x088c
        L_0x08ac:
            if (r10 <= 0) goto L_0x09cd
            java.lang.Object r0 = r11.get(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            byte[] r0 = (byte[]) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.Object r2 = r11.get(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            byte[] r2 = (byte[]) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r1 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r0 = r14 + 1
            X.7bQ r10 = new X.7bQ     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.<init>(r2, r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r0 = 8
            int r9 = r10.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r47 = r10.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r15 = r10.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r0 = 100
            r8 = 3
            r12 = 1
            if (r9 == r0) goto L_0x08fd
            r0 = 110(0x6e, float:1.54E-43)
            if (r9 == r0) goto L_0x08fd
            r0 = 122(0x7a, float:1.71E-43)
            if (r9 == r0) goto L_0x08fd
            r0 = 244(0xf4, float:3.42E-43)
            if (r9 == r0) goto L_0x08fd
            r0 = 44
            if (r9 == r0) goto L_0x08fd
            r0 = 83
            if (r9 == r0) goto L_0x08fd
            r0 = 86
            if (r9 == r0) goto L_0x08fd
            r0 = 118(0x76, float:1.65E-43)
            if (r9 == r0) goto L_0x08fd
            r0 = 128(0x80, float:1.794E-43)
            if (r9 == r0) goto L_0x08fd
            r0 = 138(0x8a, float:1.93E-43)
            if (r9 != r0) goto L_0x0950
        L_0x08fd:
            int r0 = r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r0 != r8) goto L_0x0906
            r10.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
        L_0x0906:
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            boolean r1 = r10.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r1 == 0) goto L_0x0950
            r3 = 12
            if (r0 == r8) goto L_0x091b
            r3 = 8
        L_0x091b:
            boolean r0 = r10.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r0 == 0) goto L_0x094b
            r0 = 6
            r2 = 64
            if (r4 >= r0) goto L_0x0928
            r2 = 16
        L_0x0928:
            r46 = 8
            r1 = 0
        L_0x092b:
            int r38 = r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r13 = r38 % 2
            r0 = 1
            if (r13 != 0) goto L_0x0935
            r0 = -1
        L_0x0935:
            int r13 = r38 + 1
            int r13 = r13 / 2
            int r0 = r0 * r13
            int r0 = r0 + r46
            int r0 = r0 + 256
            int r0 = r0 % 256
            if (r0 == 0) goto L_0x0944
            r46 = r0
        L_0x0944:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x094b
            if (r0 == 0) goto L_0x0944
            goto L_0x092b
        L_0x094b:
            int r4 = r4 + 1
            if (r4 >= r3) goto L_0x0950
            goto L_0x091b
        L_0x0950:
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r0 = r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r0 != 0) goto L_0x09ab
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
        L_0x095c:
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            boolean r0 = r10.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r0 != 0) goto L_0x0971
            r10.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
        L_0x0971:
            r10.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            boolean r0 = r10.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r0 == 0) goto L_0x0986
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
        L_0x0986:
            boolean r0 = r10.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x09d8
            boolean r0 = r10.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r0 == 0) goto L_0x09d8
            r0 = 8
            int r2 = r10.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r0 = 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L_0x09d1
            r2 = 16
            int r0 = r10.A01(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r2 = r10.A01(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r0 == 0) goto L_0x09d8
            goto L_0x09c7
        L_0x09ab:
            if (r0 != r12) goto L_0x095c
            r10.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r0 = r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            long r2 = (long) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r4 = 0
        L_0x09bc:
            long r0 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x095c
            r10.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r4 = r4 + 1
            goto L_0x09bc
        L_0x09c7:
            if (r2 == 0) goto L_0x09d8
            float r1 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            float r0 = (float) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            float r1 = r1 / r0
            goto L_0x09d8
        L_0x09cd:
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x09ea
        L_0x09d1:
            float[] r3 = X.AnonymousClass79B.A03     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            int r0 = r3.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            if (r2 >= r0) goto L_0x09f1
            r1 = r3[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
        L_0x09d8:
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r2 = 0
            r0 = r47
            X.C86604Kt.A1X(r3, r9, r2, r0, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r0 = 2
            X.AnonymousClass000.A1P(r3, r15, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.String r0 = "avc1.%02X%02X%02X"
            java.lang.String r2 = java.lang.String.format(r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
        L_0x09ea:
            X.7Li r0 = new X.7Li     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            r0.<init>(r2, r11, r1, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            goto L_0x1059
        L_0x09f1:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r3, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            java.lang.String r0 = "NalUnitUtil"
            android.util.Log.w(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            goto L_0x09d8
        L_0x0a01:
            r0 = 1752589123(0x68766343, float:4.6541328E24)
            if (r3 != r0) goto L_0x0dc5
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r32
            X.AnonymousClass70y.A00(r1, r0)
            int r0 = r2 + 8
            r7.A0H(r0)
            r0 = 21
            int r0 = X.C161457ph.A01(r7, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r65 = r0 & 3
            int r64 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r3 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r2 = 0
            r63 = 0
        L_0x0a25:
            r1 = 1
            r0 = r64
            if (r2 >= r0) goto L_0x0a45
            r7.A0I(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r4 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r1 = 0
        L_0x0a32:
            if (r1 >= r4) goto L_0x0a42
            int r0 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r8 = r0 + 4
            int r63 = r63 + r8
            r7.A0I(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r1 = r1 + 1
            goto L_0x0a32
        L_0x0a42:
            int r2 = r2 + 1
            goto L_0x0a25
        L_0x0a45:
            r7.A0H(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = r63
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r67 = r0
            r8 = 0
            r62 = 0
            r61 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0a55:
            r2 = r62
            r0 = r64
            if (r2 >= r0) goto L_0x0d9d
            int r0 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r2 = r0 & 127(0x7f, float:1.78E-43)
            int r60 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r59 = 0
        L_0x0a67:
            r3 = r59
            r0 = r60
            if (r3 >= r0) goto L_0x0d99
            int r58 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            byte[] r10 = X.AnonymousClass79B.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r9 = r10.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r4 = 0
            r3 = r67
            r0 = r61
            java.lang.System.arraycopy(r10, r4, r3, r0, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r61 = r61 + r9
            byte[] r10 = r7.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r9 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r4 = r3
            r3 = r61
            r0 = r58
            java.lang.System.arraycopy(r10, r9, r4, r3, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 33
            if (r2 != r0) goto L_0x0d8e
            if (r59 != 0) goto L_0x0d8e
            int r2 = r61 + r58
            int r1 = r61 + 2
            X.7bQ r11 = new X.7bQ     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.<init>(r4, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 4
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r2 = 3
            int r1 = r11.A01(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 2
            int r57 = r11.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r56 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 5
            int r55 = r11.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r54 = 0
            r3 = 0
        L_0x0ab6:
            r0 = 32
            r10 = 1
            if (r3 >= r0) goto L_0x0ac7
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0ac4
            int r10 = r10 << r3
            r54 = r54 | r10
        L_0x0ac4:
            int r3 = r3 + 1
            goto L_0x0ab6
        L_0x0ac7:
            r9 = 6
            int[] r0 = new int[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r53 = r0
            r3 = 0
        L_0x0acd:
            r0 = 8
            int r0 = r11.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r53[r3] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r3 = r3 + 1
            if (r3 < r9) goto L_0x0acd
            r0 = 8
            int r52 = r11.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r3 = 0
            r0 = 0
        L_0x0ae1:
            if (r3 >= r1) goto L_0x0af6
            boolean r4 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r4 == 0) goto L_0x0aeb
            int r0 = r0 + 89
        L_0x0aeb:
            boolean r4 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r4 == 0) goto L_0x0af3
            int r0 = r0 + 8
        L_0x0af3:
            int r3 = r3 + 1
            goto L_0x0ae1
        L_0x0af6:
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r1 <= 0) goto L_0x0b02
            int r0 = 8 - r1
            int r0 = r0 * 2
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0b02:
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 != r2) goto L_0x0b0e
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0b0e:
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0b26
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0b26:
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r51 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r2 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = r1
            if (r2 == 0) goto L_0x0b38
            r0 = 0
        L_0x0b38:
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 > r1) goto L_0x0b46
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r0 + 1
            goto L_0x0b38
        L_0x0b46:
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0b92
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0b92
            r2 = 0
        L_0x0b5f:
            r3 = 0
        L_0x0b60:
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r4 = 1
            if (r0 != 0) goto L_0x0b6b
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            goto L_0x0b85
        L_0x0b6b:
            int r0 = r2 << 1
            int r0 = r0 + 4
            int r1 = r10 << r0
            r0 = 64
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r2 <= r10) goto L_0x0b7c
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0b7c:
            r0 = 0
        L_0x0b7d:
            if (r0 >= r1) goto L_0x0b85
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r0 + 1
            goto L_0x0b7d
        L_0x0b85:
            r0 = 3
            if (r2 != r0) goto L_0x0b89
            r4 = 3
        L_0x0b89:
            int r3 = r3 + r4
            if (r3 < r9) goto L_0x0b60
            int r2 = r2 + 1
            r0 = 4
            if (r2 >= r0) goto L_0x0b92
            goto L_0x0b5f
        L_0x0b92:
            r0 = 2
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0baa
            r0 = 8
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0baa:
            int r50 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 0
            int[] r15 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int[] r12 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r8 = -1
            r4 = -1
            r49 = 0
        L_0x0bb7:
            r1 = r50
            r0 = r49
            if (r0 >= r1) goto L_0x0ca6
            if (r0 == 0) goto L_0x0c74
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0c74
            int r13 = r8 + r4
            boolean r2 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r1 = r0 + 1
            int r0 = r2 * 2
            int r48 = 1 - r0
            int r48 = r48 * r1
            int r2 = r13 + 1
            boolean[] r3 = new boolean[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 0
        L_0x0bdc:
            if (r0 > r13) goto L_0x0bf0
            boolean r1 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r1 != 0) goto L_0x0beb
            boolean r1 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r3[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            goto L_0x0bed
        L_0x0beb:
            r3[r0] = r10     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0bed:
            int r0 = r0 + 1
            goto L_0x0bdc
        L_0x0bf0:
            int[] r1 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int[] r14 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r46 = r4 + -1
            r2 = 0
        L_0x0bf7:
            if (r46 < 0) goto L_0x0c0d
            r38 = r12[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r38 = r38 + r48
            if (r38 >= 0) goto L_0x0c0a
            int r0 = r8 + r46
            boolean r0 = r3[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0c0a
            int r0 = r2 + 1
            r1[r2] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r2 = r0
        L_0x0c0a:
            int r46 = r46 + -1
            goto L_0x0bf7
        L_0x0c0d:
            if (r48 >= 0) goto L_0x0c18
            boolean r0 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0c18
            int r0 = r2 + 1
            r1[r2] = r48     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r2 = r0
        L_0x0c18:
            r0 = 0
        L_0x0c19:
            if (r0 >= r8) goto L_0x0c2e
            r46 = r15[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r46 = r46 + r48
            if (r46 >= 0) goto L_0x0c2b
            boolean r38 = r3[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r38 == 0) goto L_0x0c2b
            int r38 = r2 + 1
            r1[r2] = r46     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r2 = r38
        L_0x0c2b:
            int r0 = r0 + 1
            goto L_0x0c19
        L_0x0c2e:
            int[] r47 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r46 = r8 + -1
            r1 = 0
        L_0x0c35:
            if (r46 < 0) goto L_0x0c49
            r38 = r15[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r38 = r38 + r48
            if (r38 <= 0) goto L_0x0c46
            boolean r0 = r3[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0c46
            int r0 = r1 + 1
            r14[r1] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r1 = r0
        L_0x0c46:
            int r46 = r46 + -1
            goto L_0x0c35
        L_0x0c49:
            if (r48 <= 0) goto L_0x0c54
            boolean r0 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0c54
            int r0 = r1 + 1
            r14[r1] = r48     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r1 = r0
        L_0x0c54:
            r0 = 0
        L_0x0c55:
            if (r0 >= r4) goto L_0x0c6b
            r15 = r12[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r15 = r15 + r48
            if (r15 <= 0) goto L_0x0c68
            int r13 = r8 + r0
            boolean r13 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r13 == 0) goto L_0x0c68
            int r13 = r1 + 1
            r14[r1] = r15     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r1 = r13
        L_0x0c68:
            int r0 = r0 + 1
            goto L_0x0c55
        L_0x0c6b:
            int[] r12 = java.util.Arrays.copyOf(r14, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r15 = r47
            r8 = r2
            r4 = r1
            goto L_0x0ca2
        L_0x0c74:
            int r8 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r4 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int[] r15 = new int[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 0
        L_0x0c7f:
            if (r0 >= r8) goto L_0x0c8f
            int r1 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r1 = r1 + 1
            r15[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r0 + 1
            goto L_0x0c7f
        L_0x0c8f:
            int[] r12 = new int[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 0
        L_0x0c92:
            if (r0 >= r4) goto L_0x0ca2
            int r1 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r1 = r1 + 1
            r12[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r0 + 1
            goto L_0x0c92
        L_0x0ca2:
            int r49 = r49 + 1
            goto L_0x0bb7
        L_0x0ca6:
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0cbd
            r1 = 0
        L_0x0cad:
            int r0 = r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r1 >= r0) goto L_0x0cbd
            int r0 = r51 + 4
            int r0 = r0 + 1
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r1 = r1 + 1
            goto L_0x0cad
        L_0x0cbd:
            r0 = 2
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0d22
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0cf2
            r0 = 8
            int r3 = r11.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L_0x0ceb
            r0 = 16
            int r2 = r11.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r11.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r2 == 0) goto L_0x0cf2
            if (r0 == 0) goto L_0x0cf2
            float r1 = (float) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            float r1 = r1 / r0
            goto L_0x0cf2
        L_0x0ceb:
            float[] r2 = X.AnonymousClass79B.A03     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r3 >= r0) goto L_0x0d3a
            r1 = r2[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0cf2:
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0cfb
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0cfb:
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0d10
            r0 = 4
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0d10
            r0 = 24
            r11.A04(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0d10:
            boolean r0 = r11.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0d1c
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0d1c:
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0d22:
            r2 = 33
            r0 = 5
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String[] r0 = X.AnonymousClass78H.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = r0[r57]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r3 = 0
            r4[r3] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = r55
            X.AnonymousClass000.A1P(r4, r0, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r8 = 2
            r0 = r54
            X.AnonymousClass000.A1P(r4, r0, r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            goto L_0x0d4a
        L_0x0d3a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r2, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r0 = "NalUnitUtil"
            android.util.Log.w(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            goto L_0x0cf2
        L_0x0d4a:
            r0 = 76
            if (r56 == 0) goto L_0x0d50
            r0 = 72
        L_0x0d50:
            java.lang.Character r8 = java.lang.Character.valueOf(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 3
            r4[r0] = r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r8 = 4
            r0 = r52
            X.AnonymousClass000.A1P(r4, r0, r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r8 = "hvc1.%s%d.%X.%c%d"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r0 = java.lang.String.format(r0, r8, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.StringBuilder r11 = X.C18330xA.A0A(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0d69:
            int r0 = r9 + -1
            r0 = r53[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 != 0) goto L_0x0d74
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x0d8a
            goto L_0x0d69
        L_0x0d74:
            r8 = 0
        L_0x0d75:
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = r53[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.AnonymousClass000.A1P(r4, r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r0 = ".%02X"
            java.lang.String r0 = java.lang.String.format(r0, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r8 = r8 + 1
            if (r8 >= r9) goto L_0x0d8a
            goto L_0x0d75
        L_0x0d8a:
            java.lang.String r8 = r11.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0d8e:
            int r61 = r61 + r58
            r0 = r58
            r7.A0I(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r59 = r59 + 1
            goto L_0x0a67
        L_0x0d99:
            int r62 = r62 + 1
            goto L_0x0a55
        L_0x0d9d:
            if (r63 != 0) goto L_0x0da4
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            goto L_0x0da8
        L_0x0da4:
            java.util.List r3 = java.util.Collections.singletonList(r67)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0da8:
            int r2 = r65 + 1
            X.7Lj r0 = new X.7Lj     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0.<init>(r8, r3, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.util.List r1 = r0.A03
            r48 = r1
            int r1 = r0.A01
            r38 = r1
            if (r23 != 0) goto L_0x0dbd
            float r1 = r0.A00
            r27 = r1
        L_0x0dbd:
            java.lang.String r0 = r0.A02
            r49 = r0
            java.lang.String r11 = "video/hevc"
            goto L_0x106d
        L_0x0dc5:
            r0 = 1685480259(0x64766343, float:1.8180206E22)
            if (r3 == r0) goto L_0x1011
            r0 = 1685485123(0x64767643, float:1.8185683E22)
            if (r3 == r0) goto L_0x1011
            r0 = 1987076931(0x76706343, float:1.21891066E33)
            r1 = 2
            if (r3 != r0) goto L_0x0e3d
            boolean r3 = X.AnonymousClass000.A1X(r11)
            r0 = r32
            X.AnonymousClass70y.A00(r3, r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r6 != r0) goto L_0x0e3a
            java.lang.String r11 = "video/x-vnd.on2.vp8"
        L_0x0de5:
            int r0 = r2 + 12
            r7.A0H(r0)
            int r0 = X.C161457ph.A01(r7, r1)
            r0 = r0 & 1
            boolean r4 = X.AnonymousClass000.A1S(r0)
            int r1 = r7.A04()
            int r2 = r7.A04()
            r19 = 1
            r0 = r19
            if (r1 == r0) goto L_0x0e16
            r0 = 9
            r3 = 6
            if (r1 == r0) goto L_0x0e37
            r0 = 4
            if (r1 == r0) goto L_0x0e14
            r0 = 5
            if (r1 == r0) goto L_0x0e14
            if (r1 == r3) goto L_0x0e14
            r0 = 7
            r19 = -1
            if (r1 != r0) goto L_0x0e16
        L_0x0e14:
            r19 = 2
        L_0x0e16:
            r18 = 2
            if (r4 == 0) goto L_0x0e1c
            r18 = 1
        L_0x0e1c:
            r0 = 1
            if (r2 == r0) goto L_0x0e33
            r0 = 16
            r1 = 6
            r17 = 6
            if (r2 == r0) goto L_0x106d
            r0 = 18
            r17 = 7
            if (r2 == r0) goto L_0x106d
            if (r2 == r1) goto L_0x0e33
            r0 = 7
            r17 = -1
            if (r2 != r0) goto L_0x106d
        L_0x0e33:
            r17 = 3
            goto L_0x106d
        L_0x0e37:
            r19 = 6
            goto L_0x0e16
        L_0x0e3a:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            goto L_0x0de5
        L_0x0e3d:
            r0 = 1635135811(0x61763143, float:2.8384055E20)
            if (r3 != r0) goto L_0x0e4f
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r32
            X.AnonymousClass70y.A00(r1, r0)
            java.lang.String r11 = "video/av01"
            goto L_0x106d
        L_0x0e4f:
            r0 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r3 != r0) goto L_0x0e79
            if (r20 != 0) goto L_0x0e62
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r20 = r1.order(r0)
        L_0x0e62:
            r0 = 21
            r1 = r20
            r1.position(r0)
            short r0 = r7.A0E()
            r1.putShort(r0)
            short r0 = r7.A0E()
            r1.putShort(r0)
            goto L_0x106d
        L_0x0e79:
            r0 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r3 != r0) goto L_0x0eeb
            if (r20 != 0) goto L_0x0e8c
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r20 = r1.order(r0)
        L_0x0e8c:
            short r14 = r7.A0E()
            short r47 = r7.A0E()
            short r46 = r7.A0E()
            short r15 = r7.A0E()
            short r13 = r7.A0E()
            short r12 = r7.A0E()
            short r10 = r7.A0E()
            short r9 = r7.A0E()
            long r2 = r7.A09()
            long r0 = r7.A09()
            r8 = 1
            r4 = r20
            r4.position(r8)
            r4.putShort(r13)
            r4.putShort(r12)
            r4.putShort(r14)
            r8 = r4
            r4 = r47
            r8.putShort(r4)
            r4 = r46
            r8.putShort(r4)
            r8.putShort(r15)
            r8.putShort(r10)
            r8.putShort(r9)
            r8 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 / r8
            int r4 = (int) r2
            short r3 = (short) r4
            r2 = r20
            r2.putShort(r3)
            long r0 = r0 / r8
            int r2 = (int) r0
            short r0 = (short) r2
            r1 = r20
            r1.putShort(r0)
            goto L_0x106d
        L_0x0eeb:
            r0 = 1681012275(0x64323633, float:1.3149704E22)
            if (r3 != r0) goto L_0x0efd
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r32
            X.AnonymousClass70y.A00(r1, r0)
            r11 = r35
            goto L_0x106d
        L_0x0efd:
            r0 = 1702061171(0x65736473, float:7.183675E22)
            if (r3 != r0) goto L_0x0f1d
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r32
            X.AnonymousClass70y.A00(r1, r0)
            X.7Le r29 = A02(r7, r2)
            r0 = r29
            java.lang.String r11 = r0.A02
            byte[] r0 = r0.A03
            if (r0 == 0) goto L_0x106d
            X.6aY r48 = X.C129586aY.of(r0)
            goto L_0x106d
        L_0x0f1d:
            r0 = 1885434736(0x70617370, float:2.7909473E29)
            if (r3 != r0) goto L_0x0f39
            int r0 = r2 + 8
            r7.A0H(r0)
            int r0 = r7.A05()
            int r1 = r7.A05()
            float r0 = (float) r0
            r27 = r0
            float r0 = (float) r1
            float r27 = r27 / r0
            r23 = 1
            goto L_0x106d
        L_0x0f39:
            r0 = 1937126244(0x73763364, float:1.9506033E31)
            if (r3 != r0) goto L_0x0f62
            int r4 = r2 + 8
        L_0x0f40:
            int r1 = r4 - r2
            r0 = r22
            if (r1 >= r0) goto L_0x0f5e
            int r3 = X.C161457ph.A02(r7, r4)
            int r1 = r7.A03()
            r0 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r1 != r0) goto L_0x0f5c
            byte[] r0 = r7.A02
            int r3 = r3 + r4
            byte[] r26 = java.util.Arrays.copyOfRange(r0, r4, r3)
            goto L_0x106d
        L_0x0f5c:
            int r4 = r4 + r3
            goto L_0x0f40
        L_0x0f5e:
            r26 = 0
            goto L_0x106d
        L_0x0f62:
            r0 = 1936995172(0x73743364, float:1.9347576E31)
            if (r3 != r0) goto L_0x0f8e
            int r0 = r7.A04()
            r3 = 3
            r7.A0I(r3)
            if (r0 != 0) goto L_0x106d
            int r2 = r7.A04()
            if (r2 == 0) goto L_0x0f8a
            r0 = 1
            if (r2 == r0) goto L_0x0f86
            if (r2 == r1) goto L_0x0f82
            if (r2 != r3) goto L_0x106d
            r21 = 3
            goto L_0x106d
        L_0x0f82:
            r21 = 2
            goto L_0x106d
        L_0x0f86:
            r21 = 1
            goto L_0x106d
        L_0x0f8a:
            r21 = 0
            goto L_0x106d
        L_0x0f8e:
            r0 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r3 != r0) goto L_0x106d
            int r2 = r7.A03()
            r0 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r2 == r0) goto L_0x0fb9
            r0 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r2 == r0) goto L_0x0fb9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported color type: "
            r1.append(r0)
            java.lang.String r0 = X.C160197nC.A00(r2)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x106d
        L_0x0fb9:
            int r0 = r7.A06()
            int r2 = r7.A06()
            r7.A0I(r1)
            r1 = 19
            r3 = r22
            if (r3 != r1) goto L_0x0fd3
            int r1 = r7.A04()
            r1 = r1 & 128(0x80, float:1.794E-43)
            r4 = 1
            if (r1 != 0) goto L_0x0fd4
        L_0x0fd3:
            r4 = 0
        L_0x0fd4:
            r19 = 1
            r1 = r19
            if (r0 == r1) goto L_0x0fee
            r1 = 9
            r3 = 6
            if (r0 == r1) goto L_0x100e
            r1 = 4
            if (r0 == r1) goto L_0x0fec
            r1 = 5
            if (r0 == r1) goto L_0x0fec
            if (r0 == r3) goto L_0x0fec
            r1 = 7
            r19 = -1
            if (r0 != r1) goto L_0x0fee
        L_0x0fec:
            r19 = 2
        L_0x0fee:
            r18 = 2
            if (r4 == 0) goto L_0x0ff4
            r18 = 1
        L_0x0ff4:
            r0 = 1
            if (r2 == r0) goto L_0x100b
            r0 = 16
            r1 = 6
            r17 = 6
            if (r2 == r0) goto L_0x106d
            r0 = 18
            r17 = 7
            if (r2 == r0) goto L_0x106d
            if (r2 == r1) goto L_0x100b
            r0 = 7
            r17 = -1
            if (r2 != r0) goto L_0x106d
        L_0x100b:
            r17 = 3
            goto L_0x106d
        L_0x100e:
            r19 = 6
            goto L_0x0fee
        L_0x1011:
            r0 = 2
            int r0 = X.C161457ph.A01(r7, r0)
            int r3 = r0 >> 1
            r4 = r0 & 1
            r2 = 5
            int r4 = r4 << r2
            int r0 = r7.A04()
            int r0 = r0 >> 3
            r1 = r0 & 31
            r1 = r1 | r4
            r0 = 4
            if (r3 == r0) goto L_0x1056
            if (r3 == r2) goto L_0x1056
            r0 = 7
            if (r3 == r0) goto L_0x1056
            r0 = 8
            if (r3 != r0) goto L_0x104f
            java.lang.String r0 = "hev1"
        L_0x1033:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = ".0"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r2, r1)
            X.7A9 r0 = new X.7A9
            r0.<init>(r1)
            java.lang.String r0 = r0.A00
            r49 = r0
            java.lang.String r11 = "video/dolby-vision"
            goto L_0x106d
        L_0x104f:
            r0 = 9
            if (r3 != r0) goto L_0x106d
            java.lang.String r0 = "avc3"
            goto L_0x1033
        L_0x1056:
            java.lang.String r0 = "dvhe"
            goto L_0x1033
        L_0x1059:
            java.util.List r1 = r0.A03
            r48 = r1
            int r1 = r0.A01
            r38 = r1
            if (r23 != 0) goto L_0x1067
            float r1 = r0.A00
            r27 = r1
        L_0x1067:
            java.lang.String r0 = r0.A02
            r49 = r0
            java.lang.String r11 = "video/avc"
        L_0x106d:
            int r28 = r28 + r22
            goto L_0x07a5
        L_0x1071:
            r0 = 1211250227(0x48323633, float:182488.8)
            r11 = 0
            if (r6 != r0) goto L_0x078f
            r11 = r35
            goto L_0x078f
        L_0x107b:
            java.lang.Object r0 = r2.second
            X.7NR r0 = (X.AnonymousClass7NR) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r3.A02
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r0, r1)
            if (r0 != 0) goto L_0x077d
            X.7yl[] r3 = r3.A03
            X.7z3 r33 = new X.7z3
            r0 = r33
            r0.<init>(r1, r3)
            goto L_0x077d
        L_0x1094:
            if (r5 != r3) goto L_0x0095
            if (r7 != r2) goto L_0x0095
            if (r8 != 0) goto L_0x0095
            r30 = 270(0x10e, float:3.78E-43)
            goto L_0x0095
        L_0x109e:
            if (r6 != r3) goto L_0x0095
            if (r5 != 0) goto L_0x0095
            if (r7 != 0) goto L_0x0095
            if (r8 != r3) goto L_0x0095
            r30 = 180(0xb4, float:2.52E-43)
            goto L_0x0095
        L_0x10aa:
            if (r9 != 0) goto L_0x10b9
            long r9 = r8.A09()
        L_0x10b0:
            r5 = 0
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0071
            r0 = r9
            goto L_0x0071
        L_0x10b9:
            long r9 = r8.A0A()
            goto L_0x10b0
        L_0x10be:
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x005d
            r2 = 1
            goto L_0x0067
        L_0x10c5:
            r0 = 1986618469(0x76696465, float:1.1834389E33)
            if (r1 != r0) goto L_0x10ce
            r25 = 2
            goto L_0x0027
        L_0x10ce:
            r0 = 1952807028(0x74657874, float:7.272211E31)
            if (r1 == r0) goto L_0x10ed
            r0 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r1 == r0) goto L_0x10ed
            r0 = 1937072756(0x73756274, float:1.944137E31)
            if (r1 == r0) goto L_0x10ed
            r0 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r1 == r0) goto L_0x10ed
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            r25 = -1
            if (r1 != r0) goto L_0x0027
            r25 = 5
            goto L_0x0027
        L_0x10ed:
            r25 = 3
            goto L_0x0027
        L_0x10f1:
            java.lang.IllegalStateException r1 = X.AnonymousClass6CA.A0O()
            throw r1
        L_0x10f6:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0 = r19
            java.lang.String r3 = X.AnonymousClass000.A0Y(r1, r2, r0)
            r2 = 1
            X.6uD r1 = new X.6uD
            r0 = r32
            r1.<init>(r3, r0, r2)
            throw r1
        L_0x110b:
            r3 = 1
            X.6uD r2 = new X.6uD
            r1 = r32
            r2.<init>(r1, r1, r3)
            throw r2
        L_0x1114:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1119 }
        L_0x1119:
            r3 = move-exception
            java.lang.String r2 = "Error parsing AVC config"
            r1 = 1
            X.6uD r0 = new X.6uD
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x1123:
            r3 = move-exception
            java.lang.String r2 = "Error parsing HEVC config"
            r1 = 1
            X.6uD r0 = new X.6uD
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x112d:
            r1 = 1701082227(0x65647473, float:6.742798E22)
            r0 = r68
            X.6Jp r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x11b2
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            X.6Jo r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x11b2
            X.7ph r9 = r0.A00
            int r8 = X.C161457ph.A00(r9)
            int r7 = r9.A05()
            long[] r6 = new long[r7]
            long[] r4 = new long[r7]
            r3 = 0
        L_0x1150:
            if (r3 >= r7) goto L_0x1182
            r2 = 1
            if (r8 != r2) goto L_0x1176
            long r0 = r9.A0A()
        L_0x1159:
            r6[r3] = r0
            if (r8 != r2) goto L_0x1170
            long r0 = r9.A08()
        L_0x1161:
            r4[r3] = r0
            short r0 = r9.A0E()
            if (r0 != r2) goto L_0x117b
            r0 = 2
            r9.A0I(r0)
            int r3 = r3 + 1
            goto L_0x1150
        L_0x1170:
            int r0 = r9.A03()
            long r0 = (long) r0
            goto L_0x1161
        L_0x1176:
            long r0 = r9.A09()
            goto L_0x1159
        L_0x117b:
            java.lang.String r0 = "Unsupported media rate."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1182:
            android.util.Pair r0 = android.util.Pair.create(r6, r4)
            if (r0 == 0) goto L_0x11b2
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
        L_0x1190:
            if (r5 == 0) goto L_0x11b1
            r2 = r44
            java.lang.Object r2 = r2.first
            long r68 = X.C18310x6.A0B(r2)
            X.7Pw r32 = new X.7Pw
            r59 = r32
            r60 = r5
            r61 = r1
            r62 = r0
            r63 = r34
            r64 = r45
            r65 = r25
            r67 = r38
            r70 = r42
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r70, r72)
        L_0x11b1:
            return r32
        L_0x11b2:
            r1 = r32
            r0 = r1
            goto L_0x1190
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161567px.A03(X.7z3, X.6Jp, X.6Jo, long, boolean):X.7Pw");
    }
}
