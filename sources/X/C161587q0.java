package X;

import android.util.Pair;

/* renamed from: X.7q0  reason: invalid class name and case insensitive filesystem */
public final class C161587q0 {
    public static final byte[] A00 = "OpusHead".getBytes(AnonymousClass79T.A05);

    public static Pair A00(C161467pi r4, int i) {
        r4.A0S(i + 8 + 4);
        r4.A0T(1);
        do {
        } while ((r4.A0C() & 128) == 128);
        int A02 = C161467pi.A02(r4, 2);
        if ((A02 & 128) != 0) {
            r4.A0T(2);
        }
        if ((A02 & 64) != 0) {
            r4.A0T(r4.A0F());
        }
        if ((A02 & 32) != 0) {
            r4.A0T(2);
        }
        r4.A0T(1);
        do {
        } while ((r4.A0C() & 128) == 128);
        String A022 = C162107rG.A02(r4.A0C());
        if ("audio/mpeg".equals(A022) || "audio/vnd.dts".equals(A022) || "audio/vnd.dts.hd".equals(A022)) {
            return Pair.create(A022, (Object) null);
        }
        r4.A0T(12);
        int A023 = C161467pi.A02(r4, 1);
        int i2 = A023 & 127;
        while ((A023 & 128) == 128) {
            A023 = r4.A0C();
            i2 = (i2 << 7) | (A023 & 127);
        }
        byte[] bArr = new byte[i2];
        r4.A0V(bArr, 0, i2);
        return Pair.create(A022, bArr);
    }

    public static Pair A01(C161467pi r19, int i, int i2) {
        int i3;
        int i4;
        C161467pi r4 = r19;
        int i5 = r4.A01;
        while (i5 - i < i2) {
            int A04 = C161467pi.A04(r4, i5);
            C161487pm.A02("childAtomSize should be positive", AnonymousClass001.A1W(A04));
            if (r4.A07() == 1936289382) {
                int i6 = i5 + 8;
                boolean z = false;
                C149607Nc r12 = null;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A04) {
                    int A042 = C161467pi.A04(r4, i6);
                    int A07 = r4.A07();
                    if (A07 == 1718775137) {
                        num = Integer.valueOf(r4.A07());
                    } else if (A07 == 1935894637) {
                        r4.A0T(4);
                        str = r4.A0O(4);
                    } else if (A07 == 1935894633) {
                        i7 = i6;
                        i8 = A042;
                    }
                    i6 += A042;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    if (num != null) {
                        if (i7 != -1) {
                            z = true;
                        }
                        C161487pm.A02("schi atom is mandatory", z);
                        int i9 = i7 + 8;
                        while (true) {
                            byte[] bArr = null;
                            if (i9 - i7 >= i8) {
                                break;
                            }
                            int A043 = C161467pi.A04(r4, i9);
                            if (r4.A07() == 1952804451) {
                                int A072 = (r4.A07() >> 24) & 255;
                                r4.A0T(1);
                                if (A072 == 0) {
                                    r4.A0T(1);
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    int A0C = r4.A0C();
                                    i3 = (A0C & 240) >> 4;
                                    i4 = A0C & 15;
                                }
                                boolean A1U = AnonymousClass000.A1U(r4.A0C(), 1);
                                int A0C2 = r4.A0C();
                                byte[] bArr2 = new byte[16];
                                r4.A0V(bArr2, 0, 16);
                                if (A1U && A0C2 == 0) {
                                    int A0C3 = r4.A0C();
                                    bArr = new byte[A0C3];
                                    r4.A0V(bArr, 0, A0C3);
                                }
                                r12 = new C149607Nc(str, bArr2, bArr, A0C2, i3, i4, A1U);
                            } else {
                                i9 += A043;
                            }
                        }
                        if (r12 != null) {
                            Pair create = Pair.create(num, r12);
                            if (create != null) {
                                return create;
                            }
                        } else {
                            throw AnonymousClass001.A0e(String.valueOf("tenc atom is mandatory"));
                        }
                    } else {
                        throw AnonymousClass001.A0e(String.valueOf("frma atom is mandatory"));
                    }
                }
            }
            i5 += A04;
        }
        return null;
    }

    public static C157057he A02(String str, int i) {
        C157057he r1 = new C157057he();
        r1.A0O = Integer.toString(i);
        r1.A0R = str;
        return r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: X.7Nc[]} */
    /* JADX WARNING: type inference failed for: r36v1, types: [X.8sh] */
    /* JADX WARNING: type inference failed for: r0v281, types: [X.870] */
    /* JADX WARNING: type inference failed for: r0v282, types: [X.86z] */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06c7, code lost:
        if (r11 <= 0) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0c6d, code lost:
        if (r7 == 1) goto L_0x0c6f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x08cb  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0b20  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0b29  */
    /* JADX WARNING: Removed duplicated region for block: B:626:0x0d05  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A03(X.C166647z2 r50, X.C157347i9 r51, X.C126616Oq r52, X.C181298mX r53, long r54, boolean r56) {
        /*
            java.util.ArrayList r24 = X.AnonymousClass001.A0s()
            r20 = 0
        L_0x0006:
            r3 = r52
            java.util.List r2 = r3.A01
            int r1 = r2.size()
            r0 = r20
            if (r0 >= r1) goto L_0x0dcd
            java.lang.Object r23 = r2.get(r0)
            r0 = r23
            X.6Oq r0 = (X.C126616Oq) r0
            r23 = r0
            int r1 = r0.A00
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 != r0) goto L_0x0946
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            X.6Op r5 = r3.A01(r0)
            r5.getClass()
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r0 = r23
            X.6Oq r1 = r0.A00(r1)
            r1.getClass()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.6Op r0 = r1.A01(r0)
            r0.getClass()
            X.7pi r2 = r0.A00
            r0 = 16
            int r2 = X.C161467pi.A04(r2, r0)
            r0 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r2 != r0) goto L_0x088f
            r16 = 1
        L_0x0052:
            r2 = -1
            r22 = 0
            r0 = r16
            if (r0 == r2) goto L_0x08e6
            r2 = 1953196132(0x746b6864, float:7.46037E31)
            r0 = r23
            X.6Op r0 = r0.A01(r2)
            r0.getClass()
            X.7pi r3 = r0.A00
            r7 = 8
            int r10 = X.C161467pi.A01(r3)
            r6 = 16
            r0 = 16
            if (r10 != 0) goto L_0x0075
            r0 = 8
        L_0x0075:
            r3.A0T(r0)
            int r30 = r3.A07()
            r4 = 4
            r3.A0T(r4)
            int r9 = r3.A01
            if (r10 != 0) goto L_0x0085
            r7 = 4
        L_0x0085:
            r18 = 0
            r8 = 0
        L_0x0088:
            byte[] r0 = r3.A02
            int r2 = r9 + r8
            byte r2 = r0[r2]
            r0 = -1
            if (r2 == r0) goto L_0x0888
            r0 = 0
        L_0x0092:
            r40 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0873
            r3.A0T(r7)
        L_0x009c:
            r3.A0T(r6)
            int r7 = r3.A07()
            int r6 = r3.A07()
            r3.A0T(r4)
            int r4 = r3.A07()
            int r3 = r3.A07()
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r7 != 0) goto L_0x0867
            if (r6 != r0) goto L_0x085d
            if (r4 != r2) goto L_0x00c0
            if (r3 != 0) goto L_0x00c0
            r18 = 90
        L_0x00c0:
            r46 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r54 > r46 ? 1 : (r54 == r46 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            r40 = r54
        L_0x00cb:
            X.7pi r2 = r5.A00
            r0 = 8
            int r3 = X.C161467pi.A01(r2)
            if (r3 == 0) goto L_0x00d7
            r0 = 16
        L_0x00d7:
            r2.A0T(r0)
            long r44 = r2.A0I()
            int r0 = (r40 > r46 ? 1 : (r40 == r46 ? 0 : -1))
            if (r0 == 0) goto L_0x00e9
            r42 = 1000000(0xf4240, double:4.940656E-318)
            long r46 = X.C162387ry.A05(r40, r42, r44)
        L_0x00e9:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.6Oq r2 = r1.A00(r0)
            r2.getClass()
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.6Oq r2 = r2.A00(r0)
            r2.getClass()
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            X.6Op r0 = r1.A01(r0)
            r0.getClass()
            X.7pi r3 = r0.A00
            r1 = 8
            int r6 = X.C161467pi.A01(r3)
            r0 = 16
            if (r6 != 0) goto L_0x0115
            r0 = 8
        L_0x0115:
            r3.A0T(r0)
            long r4 = r3.A0I()
            if (r6 != 0) goto L_0x011f
            r1 = 4
        L_0x011f:
            r3.A0T(r1)
            int r3 = r3.A0F()
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
            android.util.Pair r28 = android.util.Pair.create(r0, r1)
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            X.6Op r0 = r2.A01(r0)
            r0.getClass()
            X.7pi r4 = r0.A00
            r0 = r28
            java.lang.Object r0 = r0.second
            r25 = r0
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r25 = r0
            r0 = 12
            int r26 = X.C161467pi.A04(r4, r0)
            r34 = 0
            r27 = 0
            r0 = r26
            X.7Nc[] r0 = new X.C149607Nc[r0]
            r21 = r0
            r40 = 0
            r17 = 0
        L_0x0180:
            r1 = r17
            r0 = r26
            if (r1 >= r0) goto L_0x0800
            int r13 = r4.A01
            int r19 = r4.A07()
            boolean r1 = X.AnonymousClass001.A1W(r19)
            java.lang.String r29 = "childAtomSize should be positive"
            r0 = r29
            X.C161487pm.A02(r0, r1)
            int r5 = r4.A07()
            r1 = 1635148593(0x61766331, float:2.840654E20)
            r0 = r50
            if (r5 == r1) goto L_0x0644
            r1 = 1635148595(0x61766333, float:2.8406544E20)
            if (r5 == r1) goto L_0x0644
            r1 = 1701733238(0x656e6376, float:7.035987E22)
            if (r5 == r1) goto L_0x0644
            r1 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r5 == r1) goto L_0x0644
            r1 = 1836070006(0x6d703476, float:4.646239E27)
            if (r5 == r1) goto L_0x0644
            r1 = 1752589105(0x68766331, float:4.6541277E24)
            if (r5 == r1) goto L_0x0644
            r1 = 1751479857(0x68657631, float:4.3344087E24)
            if (r5 == r1) goto L_0x0644
            r1 = 1932670515(0x73323633, float:1.4119387E31)
            if (r5 == r1) goto L_0x0644
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r5 == r1) goto L_0x0644
            r1 = 1987063865(0x76703039, float:1.2178997E33)
            if (r5 == r1) goto L_0x0644
            r1 = 1635135537(0x61763031, float:2.8383572E20)
            if (r5 == r1) goto L_0x0644
            r1 = 1685479798(0x64766176, float:1.8179687E22)
            if (r5 == r1) goto L_0x0644
            r1 = 1685479729(0x64766131, float:1.817961E22)
            if (r5 == r1) goto L_0x0644
            r1 = 1685481573(0x64766865, float:1.8181686E22)
            if (r5 == r1) goto L_0x0644
            r1 = 1685481521(0x64766831, float:1.8181627E22)
            if (r5 == r1) goto L_0x0644
            r1 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r5 == r1) goto L_0x0300
            r1 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r5 == r1) goto L_0x0300
            r1 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r5 == r1) goto L_0x0300
            r1 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r5 == r1) goto L_0x0300
            r1 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r5 == r1) goto L_0x0300
            r1 = 1685353315(0x64747363, float:1.803728E22)
            if (r5 == r1) goto L_0x0300
            r1 = 1685353317(0x64747365, float:1.8037282E22)
            if (r5 == r1) goto L_0x0300
            r1 = 1685353320(0x64747368, float:1.8037286E22)
            if (r5 == r1) goto L_0x0300
            r1 = 1685353324(0x6474736c, float:1.803729E22)
            if (r5 == r1) goto L_0x0300
            r1 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r5 == r1) goto L_0x0300
            r1 = 1935767394(0x73617762, float:1.7863284E31)
            if (r5 == r1) goto L_0x0300
            r1 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r5 == r1) goto L_0x0300
            r1 = 1936684916(0x736f7774, float:1.89725E31)
            if (r5 == r1) goto L_0x0300
            r1 = 1953984371(0x74776f73, float:7.841539E31)
            if (r5 == r1) goto L_0x0300
            r1 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r5 == r1) goto L_0x0300
            r1 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r5 == r1) goto L_0x0300
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r5 == r1) goto L_0x0300
            r1 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r5 == r1) goto L_0x0300
            r1 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r5 == r1) goto L_0x0300
            r1 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r5 == r1) goto L_0x0300
            r1 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r5 == r1) goto L_0x0300
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r5 == r0) goto L_0x02aa
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r5 == r0) goto L_0x02aa
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r5 == r0) goto L_0x02aa
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r5 == r0) goto L_0x02aa
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r5 == r0) goto L_0x02aa
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r5 != r0) goto L_0x0292
            int r0 = r13 + 8
            int r0 = r0 + 8
            r4.A0S(r0)
            r4.A0L()
            java.lang.String r0 = r4.A0L()
            if (r0 == 0) goto L_0x0289
            r1 = r30
            X.7he r0 = A02(r0, r1)
            X.7yp r34 = X.C166527yp.A00(r0)
        L_0x0289:
            int r13 = r13 + r19
            r4.A0S(r13)
            int r17 = r17 + 1
            goto L_0x0180
        L_0x0292:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r5 != r0) goto L_0x0289
            X.7he r1 = X.C157057he.A00()
            java.lang.String r0 = java.lang.Integer.toString(r30)
            r1.A0O = r0
            java.lang.String r0 = "application/x-camera-motion"
            r1.A0R = r0
            X.7yp r34 = X.C166527yp.A00(r1)
            goto L_0x0289
        L_0x02aa:
            int r0 = r13 + 8
            int r0 = r0 + 8
            r4.A0S(r0)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            java.lang.String r6 = "application/ttml+xml"
            r3 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r5 == r2) goto L_0x02d3
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r5 != r2) goto L_0x02e6
            int r2 = r19 + -8
            int r5 = r2 + -8
            byte[] r3 = new byte[r5]
            r2 = 0
            r4.A0V(r3, r2, r5)
            X.6aY r3 = X.C129586aY.of(r3)
            java.lang.String r6 = "application/x-quicktime-tx3g"
        L_0x02d3:
            r2 = r30
            X.7he r5 = A02(r6, r2)
            r2 = r25
            r5.A0Q = r2
            r5.A0H = r0
            r5.A0S = r3
            X.7yp r34 = X.C166527yp.A00(r5)
            goto L_0x0289
        L_0x02e6:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r5 != r2) goto L_0x02ee
            java.lang.String r6 = "application/x-mp4-vtt"
            goto L_0x02d3
        L_0x02ee:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r5 != r2) goto L_0x02f6
            r0 = 0
            goto L_0x02d3
        L_0x02f6:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r5 != r2) goto L_0x0dba
            r40 = 1
            java.lang.String r6 = "application/x-mp4-cea-608"
            goto L_0x02d3
        L_0x0300:
            int r1 = r13 + 8
            r2 = 8
            int r1 = r1 + 8
            r4.A0S(r1)
            r1 = 6
            if (r56 == 0) goto L_0x061e
            int r3 = r4.A0F()
            r4.A0T(r1)
        L_0x0313:
            r8 = 16
            r2 = 2
            r6 = 1
            if (r3 == 0) goto L_0x05fc
            if (r3 == r6) goto L_0x05fc
            if (r3 != r2) goto L_0x0289
            r4.A0T(r8)
            long r1 = r4.A0H()
            double r1 = java.lang.Double.longBitsToDouble(r1)
            long r1 = java.lang.Math.round(r1)
            int r12 = (int) r1
            int r14 = r4.A0E()
            r1 = 20
            r4.A0T(r1)
        L_0x0336:
            int r3 = r4.A01
            r1 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r5 != r1) goto L_0x05f9
            r1 = r19
            android.util.Pair r1 = A01(r4, r13, r1)
            if (r1 == 0) goto L_0x05f6
            int r5 = X.C18280x3.A03(r1)
            if (r50 != 0) goto L_0x05db
            r2 = 0
        L_0x034c:
            java.lang.Object r0 = r1.second
            r21[r17] = r0
        L_0x0350:
            r4.A0S(r3)
        L_0x0353:
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r5 != r0) goto L_0x0543
            java.lang.String r1 = "audio/ac3"
        L_0x035d:
            r11 = -1
        L_0x035e:
            r15 = 0
            r7 = 0
        L_0x0360:
            int r5 = r3 - r13
            r0 = r19
            if (r5 >= r0) goto L_0x0624
            int r10 = X.C161467pi.A04(r4, r3)
            if (r10 > 0) goto L_0x036d
            r6 = 0
        L_0x036d:
            r0 = r29
            X.C161487pm.A02(r0, r6)
            int r0 = r4.A07()
            r5 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 == r5) goto L_0x03a1
            if (r56 == 0) goto L_0x03cf
            r5 = 2002876005(0x77617665, float:4.5729223E33)
            if (r0 != r5) goto L_0x03cf
            r6 = 1
            int r5 = r4.A01
        L_0x0385:
            int r0 = r5 - r3
            if (r0 >= r10) goto L_0x040c
            int r9 = X.C161467pi.A04(r4, r5)
            boolean r8 = X.AnonymousClass001.A1W(r9)
            r0 = r29
            X.C161487pm.A02(r0, r8)
            int r8 = r4.A07()
            r0 = 1702061171(0x65736473, float:7.183675E22)
            if (r8 == r0) goto L_0x03a3
            int r5 = r5 + r9
            goto L_0x0385
        L_0x03a1:
            r6 = 1
            r5 = r3
        L_0x03a3:
            r0 = -1
            if (r5 == r0) goto L_0x040c
            android.util.Pair r0 = A00(r4, r5)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x040c
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x04fc
            int r7 = r0.length
            X.7oL r5 = new X.7oL
            r5.<init>(r0, r7)
            r7 = 0
            X.7JX r5 = X.C159817mV.A00(r5, r7)
            int r12 = r5.A01
            int r14 = r5.A00
            java.lang.String r15 = r5.A02
            goto L_0x04fc
        L_0x03cf:
            r5 = 1684103987(0x64616333, float:1.6630662E22)
            if (r0 != r5) goto L_0x040f
            int r0 = r3 + 8
            r4.A0S(r0)
            java.lang.String r0 = java.lang.Integer.toString(r30)
            int r5 = r4.A0C()
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r6 = r5 >> 6
            int[] r5 = X.C155627fD.A03
            r8 = r5[r6]
            int r9 = r4.A0C()
            int[] r6 = X.C155627fD.A02
            r5 = r9 & 56
            int r5 = r5 >> 3
            r6 = r6[r5]
            r5 = r9 & 4
            if (r5 == 0) goto L_0x03fb
            int r6 = r6 + 1
        L_0x03fb:
            X.7he r5 = X.C157057he.A00()
            r5.A0O = r0
            java.lang.String r0 = "audio/ac3"
            r5.A0R = r0
            r0 = r25
            X.7yp r34 = X.C157057he.A01(r5, r2, r0, r6, r8)
        L_0x040b:
            r6 = 1
        L_0x040c:
            int r3 = r3 + r10
            goto L_0x0360
        L_0x040f:
            r5 = 1684366131(0x64656333, float:1.692581E22)
            if (r0 != r5) goto L_0x0471
            int r0 = r3 + 8
            r4.A0S(r0)
            java.lang.String r8 = java.lang.Integer.toString(r30)
            r0 = 2
            int r5 = X.C161467pi.A02(r4, r0)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r6 = r5 >> 6
            int[] r5 = X.C155627fD.A03
            r9 = r5[r6]
            int r31 = r4.A0C()
            int[] r6 = X.C155627fD.A02
            r5 = r31 & 14
            int r5 = r5 >> 1
            r6 = r6[r5]
            r5 = r31 & 1
            if (r5 == 0) goto L_0x043c
            int r6 = r6 + 1
        L_0x043c:
            int r5 = r4.A0C()
            r5 = r5 & 30
            int r5 = r5 >> 1
            if (r5 <= 0) goto L_0x044f
            int r5 = r4.A0C()
            r0 = r0 & r5
            if (r0 == 0) goto L_0x044f
            int r6 = r6 + 2
        L_0x044f:
            int r0 = X.C161467pi.A00(r4)
            if (r0 <= 0) goto L_0x046e
            int r0 = r4.A0C()
            r0 = r0 & 1
            if (r0 == 0) goto L_0x046e
            java.lang.String r5 = "audio/eac3-joc"
        L_0x045f:
            X.7he r0 = X.C157057he.A00()
            r0.A0O = r8
            r0.A0R = r5
            r5 = r25
            X.7yp r34 = X.C157057he.A01(r0, r2, r5, r6, r9)
            goto L_0x040b
        L_0x046e:
            java.lang.String r5 = "audio/eac3"
            goto L_0x045f
        L_0x0471:
            r5 = 1684103988(0x64616334, float:1.6630663E22)
            if (r0 != r5) goto L_0x04a3
            int r0 = r3 + 8
            r4.A0S(r0)
            java.lang.String r8 = java.lang.Integer.toString(r30)
            r5 = 1
            int r0 = X.C161467pi.A02(r4, r5)
            r0 = r0 & 32
            int r0 = r0 >> 5
            r6 = 44100(0xac44, float:6.1797E-41)
            if (r0 != r5) goto L_0x0490
            r6 = 48000(0xbb80, float:6.7262E-41)
        L_0x0490:
            X.7he r5 = X.C157057he.A00()
            r5.A0O = r8
            java.lang.String r0 = "audio/ac4"
            r5.A0R = r0
            r8 = 2
            r0 = r25
            X.7yp r34 = X.C157057he.A01(r5, r2, r0, r8, r6)
            goto L_0x040b
        L_0x04a3:
            r5 = 1684305011(0x64647473, float:1.6856995E22)
            if (r0 != r5) goto L_0x04b6
            r0 = r30
            X.7he r5 = A02(r1, r0)
            r0 = r25
            X.7yp r34 = X.C157057he.A01(r5, r2, r0, r14, r12)
            goto L_0x040b
        L_0x04b6:
            r5 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r0 != r5) goto L_0x04d4
            int r6 = r10 + -8
            byte[] r0 = A00
            int r5 = r0.length
            int r7 = r5 + r6
            byte[] r7 = java.util.Arrays.copyOf(r0, r7)
            int r0 = r3 + 8
            r4.A0S(r0)
            r4.A0V(r7, r5, r6)
            java.util.List r7 = X.AnonymousClass728.A00(r7)
            goto L_0x040b
        L_0x04d4:
            r5 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r0 != r5) goto L_0x0502
            int r5 = r10 + -12
            int r0 = r5 + 4
            byte[] r0 = new byte[r0]
            r7 = 102(0x66, float:1.43E-43)
            r6 = 0
            r0[r6] = r7
            r7 = 76
            r6 = 1
            r0[r6] = r7
            r8 = 97
            r7 = 2
            r0[r7] = r8
            r8 = 3
            r7 = 67
            r0[r8] = r7
            int r7 = r3 + 12
            r4.A0S(r7)
            r7 = 4
            r4.A0V(r0, r7, r5)
        L_0x04fc:
            X.6aY r7 = X.C129586aY.of(r0)
            goto L_0x040c
        L_0x0502:
            r5 = 1634492771(0x616c6163, float:2.7252807E20)
            r6 = 1
            if (r0 != r5) goto L_0x040c
            int r0 = r10 + -12
            byte[] r5 = new byte[r0]
            int r7 = r3 + 12
            r4.A0S(r7)
            r7 = 0
            r4.A0V(r5, r7, r0)
            X.7pi r0 = new X.7pi
            r0.<init>((byte[]) r5)
            r7 = 9
            r0.A0S(r7)
            int r8 = r0.A0C()
            r7 = 20
            int r0 = X.C161467pi.A03(r0, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            android.util.Pair r0 = android.util.Pair.create(r7, r0)
            int r12 = X.C18280x3.A03(r0)
            int r14 = X.C18290x4.A03(r0)
            X.6aY r7 = X.C129586aY.of(r5)
            goto L_0x040c
        L_0x0543:
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r5 != r0) goto L_0x054c
            java.lang.String r1 = "audio/eac3"
            goto L_0x035d
        L_0x054c:
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r5 != r0) goto L_0x0555
            java.lang.String r1 = "audio/ac4"
            goto L_0x035d
        L_0x0555:
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r5 != r0) goto L_0x055e
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x035d
        L_0x055e:
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r5 == r0) goto L_0x05d7
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r5 == r0) goto L_0x05d7
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r5 != r0) goto L_0x0571
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x035d
        L_0x0571:
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r5 != r0) goto L_0x057a
            java.lang.String r1 = "audio/3gpp"
            goto L_0x035d
        L_0x057a:
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r5 != r0) goto L_0x0583
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x035d
        L_0x0583:
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            java.lang.String r1 = "audio/raw"
            if (r5 == r0) goto L_0x05d4
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r5 == r0) goto L_0x05d4
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r5 != r0) goto L_0x0598
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x035e
        L_0x0598:
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r5 == r0) goto L_0x05d0
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r5 == r0) goto L_0x05d0
            if (r5 != r7) goto L_0x05a8
            java.lang.String r1 = "audio/alac"
            goto L_0x035d
        L_0x05a8:
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r5 != r0) goto L_0x05b1
            java.lang.String r1 = "audio/g711-alaw"
            goto L_0x035d
        L_0x05b1:
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r5 != r0) goto L_0x05ba
            java.lang.String r1 = "audio/g711-mlaw"
            goto L_0x035d
        L_0x05ba:
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r5 != r0) goto L_0x05c3
            java.lang.String r1 = "audio/opus"
            goto L_0x035d
        L_0x05c3:
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r5 != r0) goto L_0x05cc
            java.lang.String r1 = "audio/flac"
            goto L_0x035d
        L_0x05cc:
            r11 = -1
            r1 = 0
            goto L_0x035e
        L_0x05d0:
            java.lang.String r1 = "audio/mpeg"
            goto L_0x035d
        L_0x05d4:
            r11 = 2
            goto L_0x035e
        L_0x05d7:
            java.lang.String r1 = "audio/vnd.dts.hd"
            goto L_0x035d
        L_0x05db:
            java.lang.Object r2 = r1.second
            X.7Nc r2 = (X.C149607Nc) r2
            java.lang.String r7 = r2.A02
            java.lang.String r2 = r0.A01
            boolean r2 = X.C162387ry.A0D(r2, r7)
            if (r2 == 0) goto L_0x05ec
            r2 = r0
            goto L_0x034c
        L_0x05ec:
            r8 = 0
            X.7yc[] r0 = r0.A02
            X.7z2 r2 = new X.7z2
            r2.<init>(r7, r0, r8)
            goto L_0x034c
        L_0x05f6:
            r2 = r0
            goto L_0x0350
        L_0x05f9:
            r2 = r0
            goto L_0x0353
        L_0x05fc:
            int r14 = r4.A0F()
            r4.A0T(r1)
            byte[] r7 = r4.A02
            int r2 = r4.A01
            int r1 = r2 + 1
            int r2 = X.AnonymousClass6C9.A0F(r7, r2)
            int r9 = r1 + 1
            int r12 = X.AnonymousClass6CA.A0B(r7, r1, r2)
            int r1 = r9 + 2
            r4.A01 = r1
            if (r3 != r6) goto L_0x0336
            r4.A0T(r8)
            goto L_0x0336
        L_0x061e:
            r4.A0T(r2)
            r3 = 0
            goto L_0x0313
        L_0x0624:
            if (r34 != 0) goto L_0x0289
            if (r1 == 0) goto L_0x0289
            r0 = r30
            X.7he r0 = A02(r1, r0)
            r0.A0M = r15
            r0.A04 = r14
            r0.A0D = r12
            r0.A09 = r11
            r0.A0S = r7
            r0.A0I = r2
            r1 = r25
            r0.A0Q = r1
            X.7yp r34 = X.C166527yp.A00(r0)
            goto L_0x0289
        L_0x0644:
            r15 = r0
            int r1 = r13 + 8
            int r1 = r1 + 8
            r4.A0S(r1)
            r1 = 16
            r4.A0T(r1)
            int r33 = r4.A0F()
            int r32 = r4.A0F()
            r1 = 50
            r4.A0T(r1)
            int r7 = r4.A01
            r1 = 1701733238(0x656e6376, float:7.035987E22)
            r12 = 0
            if (r5 != r1) goto L_0x067c
            r1 = r19
            android.util.Pair r3 = A01(r4, r13, r1)
            if (r3 == 0) goto L_0x0679
            int r5 = X.C18280x3.A03(r3)
            if (r50 != 0) goto L_0x07e8
            r15 = r12
        L_0x0675:
            java.lang.Object r0 = r3.second
            r21[r17] = r0
        L_0x0679:
            r4.A0S(r7)
        L_0x067c:
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r5 != r0) goto L_0x07e5
            java.lang.String r2 = "video/mpeg"
        L_0x0683:
            r9 = r12
            r14 = r12
            r1 = 1065353216(0x3f800000, float:1.0)
            r6 = -1
            r31 = 0
        L_0x068a:
            int r3 = r7 - r13
            r0 = r19
            if (r3 >= r0) goto L_0x06a0
            r4.A0S(r7)
            int r3 = r4.A01
            int r11 = r4.A07()
            if (r11 != 0) goto L_0x06c6
            int r8 = r4.A01
            int r8 = r8 - r13
            if (r8 != r0) goto L_0x06c9
        L_0x06a0:
            if (r2 == 0) goto L_0x0289
            r0 = r30
            X.7he r0 = A02(r2, r0)
            r0.A0M = r12
            r2 = r33
            r0.A0G = r2
            r2 = r32
            r0.A07 = r2
            r0.A01 = r1
            r1 = r18
            r0.A0C = r1
            r0.A0T = r9
            r0.A0F = r6
            r0.A0S = r14
            r0.A0I = r15
            X.7yp r34 = X.C166527yp.A00(r0)
            goto L_0x0289
        L_0x06c6:
            r8 = 1
            if (r11 > 0) goto L_0x06ca
        L_0x06c9:
            r8 = 0
        L_0x06ca:
            r0 = r29
            X.C161487pm.A02(r0, r8)
            int r0 = r4.A07()
            r8 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 != r8) goto L_0x06f8
            boolean r0 = X.AnonymousClass000.A1X(r2)
            X.C161487pm.A04(r0)
            int r0 = r3 + 8
            r4.A0S(r0)
            X.7hH r2 = X.C156827hH.A00(r4)
            java.util.List r14 = r2.A05
            int r0 = r2.A02
            r27 = r0
            if (r31 != 0) goto L_0x06f2
            float r1 = r2.A00
        L_0x06f2:
            java.lang.String r12 = r2.A04
            java.lang.String r2 = "video/avc"
        L_0x06f6:
            int r7 = r7 + r11
            goto L_0x068a
        L_0x06f8:
            r8 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r8) goto L_0x0718
            boolean r0 = X.AnonymousClass000.A1X(r2)
            X.C161487pm.A04(r0)
            int r0 = r3 + 8
            r4.A0S(r0)
            X.7gR r2 = X.C156327gR.A00(r4)
            java.util.List r14 = r2.A02
            int r0 = r2.A00
            r27 = r0
            java.lang.String r12 = r2.A01
            java.lang.String r2 = "video/hevc"
            goto L_0x06f6
        L_0x0718:
            r8 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r8) goto L_0x07d9
            r8 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 == r8) goto L_0x07d9
            r8 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 != r8) goto L_0x0739
            boolean r0 = X.AnonymousClass000.A1X(r2)
            X.C161487pm.A04(r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r5 != r0) goto L_0x0736
            java.lang.String r2 = "video/x-vnd.on2.vp8"
            goto L_0x06f6
        L_0x0736:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            goto L_0x06f6
        L_0x0739:
            r8 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r8) goto L_0x0748
            boolean r0 = X.AnonymousClass000.A1X(r2)
            X.C161487pm.A04(r0)
            java.lang.String r2 = "video/av01"
            goto L_0x06f6
        L_0x0748:
            r8 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r8) goto L_0x0757
            boolean r0 = X.AnonymousClass000.A1X(r2)
            X.C161487pm.A04(r0)
            java.lang.String r2 = "video/3gpp"
            goto L_0x06f6
        L_0x0757:
            r8 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r8) goto L_0x0774
            boolean r0 = X.AnonymousClass000.A1X(r2)
            X.C161487pm.A04(r0)
            android.util.Pair r0 = A00(r4, r3)
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x06f6
            X.6aY r14 = X.C129586aY.of(r0)
            goto L_0x06f6
        L_0x0774:
            r8 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r8) goto L_0x078a
            int r0 = r3 + 8
            int r1 = X.C161467pi.A03(r4, r0)
            int r0 = r4.A0E()
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r31 = 1
            goto L_0x06f6
        L_0x078a:
            r8 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r8) goto L_0x07b0
            int r0 = r3 + 8
        L_0x0791:
            int r8 = r0 - r3
            if (r8 >= r11) goto L_0x07ad
            int r8 = X.C161467pi.A04(r4, r0)
            int r10 = r4.A07()
            r9 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r10 != r9) goto L_0x07ab
            byte[] r3 = r4.A02
            int r8 = r8 + r0
            byte[] r9 = java.util.Arrays.copyOfRange(r3, r0, r8)
            goto L_0x06f6
        L_0x07ab:
            int r0 = r0 + r8
            goto L_0x0791
        L_0x07ad:
            r9 = 0
            goto L_0x06f6
        L_0x07b0:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r3) goto L_0x06f6
            int r0 = r4.A0C()
            r3 = 3
            r4.A0T(r3)
            if (r0 != 0) goto L_0x06f6
            int r0 = r4.A0C()
            if (r0 == 0) goto L_0x07d6
            r8 = 1
            if (r0 == r8) goto L_0x07d3
            r8 = 2
            if (r0 == r8) goto L_0x07d0
            if (r0 != r3) goto L_0x06f6
            r6 = 3
            goto L_0x06f6
        L_0x07d0:
            r6 = 2
            goto L_0x06f6
        L_0x07d3:
            r6 = 1
            goto L_0x06f6
        L_0x07d6:
            r6 = 0
            goto L_0x06f6
        L_0x07d9:
            X.7fP r0 = X.C155727fP.A00(r4)
            if (r0 == 0) goto L_0x06f6
            java.lang.String r12 = r0.A00
            java.lang.String r2 = "video/dolby-vision"
            goto L_0x06f6
        L_0x07e5:
            r2 = r12
            goto L_0x0683
        L_0x07e8:
            java.lang.Object r1 = r3.second
            X.7Nc r1 = (X.C149607Nc) r1
            java.lang.String r2 = r1.A02
            java.lang.String r1 = r0.A01
            boolean r1 = X.C162387ry.A0D(r1, r2)
            if (r1 != 0) goto L_0x0675
            r1 = 0
            X.7yc[] r0 = r0.A02
            X.7z2 r15 = new X.7z2
            r15.<init>(r2, r0, r1)
            goto L_0x0675
        L_0x0800:
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r23
            X.6Oq r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x0db5
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            X.6Op r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0db5
            X.7pi r5 = r0.A00
            int r9 = X.C161467pi.A01(r5)
            int r4 = r5.A0E()
            long[] r8 = new long[r4]
            long[] r7 = new long[r4]
            r3 = 0
        L_0x0823:
            if (r3 >= r4) goto L_0x08bb
            r2 = 1
            if (r9 != r2) goto L_0x0858
            long r0 = r5.A0J()
        L_0x082c:
            r8[r3] = r0
            if (r9 != r2) goto L_0x0852
            long r0 = r5.A0H()
        L_0x0834:
            r7[r3] = r0
            byte[] r6 = r5.A02
            int r1 = r5.A01
            int r0 = r1 + 1
            int r10 = X.AnonymousClass6C9.A0F(r6, r1)
            int r1 = r0 + 1
            r5.A01 = r1
            int r0 = X.AnonymousClass6CA.A0B(r6, r0, r10)
            short r0 = (short) r0
            if (r0 != r2) goto L_0x0dbf
            r0 = 2
            r5.A0T(r0)
            int r3 = r3 + 1
            goto L_0x0823
        L_0x0852:
            int r0 = r5.A07()
            long r0 = (long) r0
            goto L_0x0834
        L_0x0858:
            long r0 = r5.A0I()
            goto L_0x082c
        L_0x085d:
            if (r6 != r2) goto L_0x00c0
            if (r4 != r0) goto L_0x00c0
            if (r3 != 0) goto L_0x00c0
            r18 = 270(0x10e, float:3.78E-43)
            goto L_0x00c0
        L_0x0867:
            if (r7 != r2) goto L_0x00c0
            if (r6 != 0) goto L_0x00c0
            if (r4 != 0) goto L_0x00c0
            if (r3 != r2) goto L_0x00c0
            r18 = 180(0xb4, float:2.52E-43)
            goto L_0x00c0
        L_0x0873:
            if (r10 != 0) goto L_0x0883
            long r9 = r3.A0I()
        L_0x0879:
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
            r40 = r9
            goto L_0x009c
        L_0x0883:
            long r9 = r3.A0J()
            goto L_0x0879
        L_0x0888:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x0088
            r0 = 1
            goto L_0x0092
        L_0x088f:
            r0 = 1986618469(0x76696465, float:1.1834389E33)
            if (r2 != r0) goto L_0x0898
            r16 = 2
            goto L_0x0052
        L_0x0898:
            r0 = 1952807028(0x74657874, float:7.272211E31)
            if (r2 == r0) goto L_0x08b7
            r0 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r2 == r0) goto L_0x08b7
            r0 = 1937072756(0x73756274, float:1.944137E31)
            if (r2 == r0) goto L_0x08b7
            r0 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r2 == r0) goto L_0x08b7
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            r16 = -1
            if (r2 != r0) goto L_0x0052
            r16 = 5
            goto L_0x0052
        L_0x08b7:
            r16 = 3
            goto L_0x0052
        L_0x08bb:
            android.util.Pair r0 = android.util.Pair.create(r8, r7)
            if (r0 == 0) goto L_0x0db5
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
        L_0x08c9:
            if (r34 == 0) goto L_0x08e6
            r2 = r28
            java.lang.Object r2 = r2.first
            long r42 = X.C18310x6.A0B(r2)
            X.7Q0 r22 = new X.7Q0
            r33 = r22
            r35 = r1
            r36 = r0
            r37 = r21
            r38 = r30
            r39 = r16
            r41 = r27
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46)
        L_0x08e6:
            r1 = r53
            r0 = r22
            java.lang.Object r13 = r1.apply(r0)
            X.7Q0 r13 = (X.AnonymousClass7Q0) r13
            if (r13 == 0) goto L_0x0946
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r0 = r23
            X.6Oq r1 = r0.A00(r1)
            r1.getClass()
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.6Oq r1 = r1.A00(r0)
            r1.getClass()
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.6Oq r2 = r1.A00(r0)
            r2.getClass()
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            X.6Op r3 = r2.A01(r0)
            if (r3 == 0) goto L_0x0da3
            X.7yp r1 = r13.A07
            X.86z r36 = new X.86z
            r0 = r36
            r0.<init>(r1, r3)
        L_0x0924:
            int r35 = r36.BCQ()
            r0 = 0
            if (r35 != 0) goto L_0x094a
            long[] r4 = new long[r0]
            int[] r3 = new int[r0]
            r14 = 0
            long[] r2 = new long[r0]
            int[] r1 = new int[r0]
            r15 = 0
            X.7UO r0 = new X.7UO
            r8 = r0
            r9 = r13
            r10 = r3
            r11 = r1
            r12 = r4
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x0941:
            r1 = r24
            r1.add(r0)
        L_0x0946:
            int r20 = r20 + 1
            goto L_0x0006
        L_0x094a:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            X.6Op r0 = r2.A01(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0a62
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            X.6Op r0 = r2.A01(r0)
            r0.getClass()
            r34 = 1
        L_0x0960:
            X.7pi r0 = r0.A00
            r40 = r0
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            X.6Op r0 = r2.A01(r0)
            r0.getClass()
            X.7pi r0 = r0.A00
            r39 = r0
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            X.6Op r0 = r2.A01(r0)
            r0.getClass()
            X.7pi r0 = r0.A00
            r37 = r0
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            X.6Op r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0a5e
            X.7pi r0 = r0.A00
            r33 = r0
        L_0x098d:
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            X.6Op r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0a5a
            X.7pi r0 = r0.A00
            r32 = r0
        L_0x099a:
            r5 = 0
            r31 = 0
            r1 = 12
            r0 = r40
            int r12 = X.C161467pi.A03(r0, r1)
            r0 = r39
            int r30 = X.C161467pi.A03(r0, r1)
            int r0 = r39.A07()
            boolean r2 = X.AnonymousClass6C9.A1M(r0)
            java.lang.String r0 = "first_chunk must be 1"
            X.C161487pm.A02(r0, r2)
            r8 = -1
            r0 = r37
            int r7 = X.C161467pi.A03(r0, r1)
            int r7 = r7 - r9
            int r11 = r37.A0E()
            int r29 = r37.A0E()
            if (r32 == 0) goto L_0x0a56
            r0 = r32
            int r28 = X.C161467pi.A03(r0, r1)
        L_0x09d0:
            if (r33 == 0) goto L_0x0a53
            r0 = r33
            int r6 = X.C161467pi.A03(r0, r1)
            if (r6 <= 0) goto L_0x0a50
            int r0 = r33.A0E()
            int r14 = r0 + -1
        L_0x09e0:
            int r4 = r36.B7i()
            X.7yp r0 = r13.A07
            r38 = r0
            java.lang.String r1 = r0.A0T
            if (r4 == r8) goto L_0x0aa3
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0a04
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0a04
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0aa3
        L_0x0a04:
            if (r7 != 0) goto L_0x0aa3
            if (r28 != 0) goto L_0x0aa3
            if (r6 != 0) goto L_0x0aa3
            long[] r11 = new long[r12]
            int[] r7 = new int[r12]
        L_0x0a0e:
            r18 = 1
            int r8 = r8 + 1
            if (r8 != r12) goto L_0x0a29
            r0 = r29
            long r0 = (long) r0
            r10 = 8192(0x2000, float:1.14794E-41)
            int r10 = r10 / r4
            r8 = 0
            r3 = 0
            r2 = 0
        L_0x0a1d:
            if (r3 >= r12) goto L_0x0a66
            r5 = r7[r3]
            int r5 = r5 + r10
            int r5 = r5 + -1
            int r5 = r5 / r10
            int r2 = r2 + r5
            int r3 = r3 + 1
            goto L_0x0a1d
        L_0x0a29:
            if (r34 == 0) goto L_0x0a4b
            long r2 = r40.A0J()
        L_0x0a2f:
            if (r8 != r5) goto L_0x0a44
            int r31 = r39.A0E()
            r1 = 4
            r0 = r39
            r0.A0T(r1)
            int r30 = r30 - r9
            if (r30 <= 0) goto L_0x0a49
            int r5 = r39.A0E()
            int r5 = r5 - r9
        L_0x0a44:
            r11[r8] = r2
            r7[r8] = r31
            goto L_0x0a0e
        L_0x0a49:
            r5 = -1
            goto L_0x0a44
        L_0x0a4b:
            long r2 = r40.A0I()
            goto L_0x0a2f
        L_0x0a50:
            r33 = 0
            goto L_0x0a54
        L_0x0a53:
            r6 = 0
        L_0x0a54:
            r14 = -1
            goto L_0x09e0
        L_0x0a56:
            r28 = 0
            goto L_0x09d0
        L_0x0a5a:
            r32 = 0
            goto L_0x099a
        L_0x0a5e:
            r33 = 0
            goto L_0x098d
        L_0x0a62:
            r34 = 0
            goto L_0x0960
        L_0x0a66:
            long[] r3 = new long[r2]
            r27 = r3
            int[] r3 = new int[r2]
            r26 = r3
            long[] r9 = new long[r2]
            int[] r2 = new int[r2]
            r25 = r2
            r6 = 0
            r17 = 0
            r23 = 0
        L_0x0a79:
            if (r8 >= r12) goto L_0x0bb8
            r5 = r7[r8]
            r15 = r11[r8]
        L_0x0a7f:
            if (r5 <= 0) goto L_0x0aa0
            int r14 = java.lang.Math.min(r10, r5)
            r27[r17] = r15
            int r3 = r4 * r14
            r26[r17] = r3
            r2 = r23
            int r23 = java.lang.Math.max(r2, r3)
            long r2 = (long) r6
            long r2 = r2 * r0
            r9[r17] = r2
            r25[r17] = r18
            r2 = r26[r17]
            long r2 = (long) r2
            long r15 = r15 + r2
            int r6 = r6 + r14
            int r5 = r5 - r14
            int r17 = r17 + 1
            goto L_0x0a7f
        L_0x0aa0:
            int r8 = r8 + 1
            goto L_0x0a79
        L_0x0aa3:
            r0 = r35
            long[] r0 = new long[r0]
            r27 = r0
            r0 = r35
            int[] r0 = new int[r0]
            r26 = r0
            r0 = r35
            long[] r9 = new long[r0]
            int[] r0 = new int[r0]
            r25 = r0
            r4 = 0
            r23 = 0
            r19 = 0
            r15 = 0
            r10 = 0
            r0 = 0
            r21 = 0
        L_0x0ac2:
            java.lang.String r16 = "AtomParsers"
            r2 = r35
            if (r4 >= r2) goto L_0x0aef
            r18 = 1
        L_0x0aca:
            if (r15 != 0) goto L_0x0b5b
            int r8 = r8 + 1
            if (r8 != r12) goto L_0x0b34
            java.lang.String r3 = "Unexpected end of chunk data"
            r2 = r16
            android.util.Log.w(r2, r3)
            r2 = r27
            long[] r27 = java.util.Arrays.copyOf(r2, r4)
            r2 = r26
            int[] r26 = java.util.Arrays.copyOf(r2, r4)
            long[] r9 = java.util.Arrays.copyOf(r9, r4)
            r2 = r25
            int[] r25 = java.util.Arrays.copyOf(r2, r4)
            r35 = r4
        L_0x0aef:
            r2 = r19
            long r2 = (long) r2
            long r0 = r0 + r2
            if (r32 == 0) goto L_0x0b32
        L_0x0af5:
            if (r28 <= 0) goto L_0x0b32
            int r2 = r32.A0E()
            if (r2 == 0) goto L_0x0b2c
            r4 = 0
        L_0x0afe:
            if (r6 != 0) goto L_0x0b0a
            if (r11 != 0) goto L_0x0b0a
            if (r15 != 0) goto L_0x0b0a
            if (r7 != 0) goto L_0x0b0a
            if (r10 != 0) goto L_0x0b0a
            if (r4 != 0) goto L_0x0bba
        L_0x0b0a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Inconsistent stbl box for track "
            r3.append(r2)
            int r2 = r13.A00
            r3.append(r2)
            X.AnonymousClass6C9.A18(r3, r6, r11, r15, r7)
            r3.append(r10)
            if (r4 != 0) goto L_0x0b29
            java.lang.String r4 = ", ctts invalid"
        L_0x0b22:
            r2 = r16
            X.AnonymousClass000.A1F(r4, r2, r3)
            goto L_0x0bba
        L_0x0b29:
            java.lang.String r4 = ""
            goto L_0x0b22
        L_0x0b2c:
            r32.A07()
            int r28 = r28 + -1
            goto L_0x0af5
        L_0x0b32:
            r4 = 1
            goto L_0x0afe
        L_0x0b34:
            if (r34 == 0) goto L_0x0b56
            long r21 = r40.A0J()
        L_0x0b3a:
            if (r8 != r5) goto L_0x0b50
            int r31 = r39.A0E()
            r3 = 4
            r2 = r39
            r2.A0T(r3)
            int r30 = r30 - r18
            if (r30 <= 0) goto L_0x0b54
            int r5 = r39.A0E()
            int r5 = r5 - r18
        L_0x0b50:
            r15 = r31
            goto L_0x0aca
        L_0x0b54:
            r5 = -1
            goto L_0x0b50
        L_0x0b56:
            long r21 = r40.A0I()
            goto L_0x0b3a
        L_0x0b5b:
            if (r32 == 0) goto L_0x0b6e
        L_0x0b5d:
            if (r10 != 0) goto L_0x0b6c
            if (r28 <= 0) goto L_0x0b6c
            int r10 = r32.A0E()
            int r19 = r32.A07()
            int r28 = r28 + -1
            goto L_0x0b5d
        L_0x0b6c:
            int r10 = r10 + -1
        L_0x0b6e:
            r27[r4] = r21
            int r3 = r36.BiO()
            r26[r4] = r3
            r2 = r23
            if (r3 <= r2) goto L_0x0b7c
            r23 = r3
        L_0x0b7c:
            r2 = r19
            long r2 = (long) r2
            long r2 = r2 + r0
            r9[r4] = r2
            boolean r2 = X.AnonymousClass000.A1X(r33)
            r25[r4] = r2
            if (r4 != r14) goto L_0x0b99
            r25[r4] = r18
            int r6 = r6 + -1
            if (r6 <= 0) goto L_0x0b99
            r33.getClass()
            int r14 = r33.A0E()
            int r14 = r14 - r18
        L_0x0b99:
            r2 = r29
            long r2 = (long) r2
            long r0 = r0 + r2
            int r11 = r11 + -1
            if (r11 != 0) goto L_0x0bad
            if (r7 <= 0) goto L_0x0bad
            int r11 = r37.A0E()
            int r29 = r37.A07()
            int r7 = r7 + -1
        L_0x0bad:
            r2 = r26[r4]
            long r2 = (long) r2
            long r21 = r21 + r2
            int r15 = r15 + -1
            int r4 = r4 + 1
            goto L_0x0ac2
        L_0x0bb8:
            long r2 = (long) r6
            long r0 = r0 * r2
        L_0x0bba:
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r13.A06
            r48 = r2
            r28 = r0
            r32 = r2
            long r7 = X.C162387ry.A05(r28, r30, r32)
            long[] r6 = r13.A08
            if (r6 != 0) goto L_0x0be1
            X.C162387ry.A0B(r9, r2)
        L_0x0bd0:
            X.7UO r0 = new X.7UO
            r1 = r13
            r2 = r26
            r3 = r25
            r4 = r27
            r5 = r9
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0941
        L_0x0be1:
            int r7 = r6.length
            r3 = 1
            if (r7 != r3) goto L_0x0c6d
            int r2 = r13.A03
            if (r2 != r3) goto L_0x0c6f
            int r3 = r9.length
            r2 = 2
            if (r3 < r2) goto L_0x0c6f
            long[] r4 = r13.A09
            r4.getClass()
            r2 = 0
            r36 = r4[r2]
            r14 = r6[r2]
            long r10 = r13.A05
            r16 = r48
            r18 = r10
            long r16 = X.C162387ry.A05(r14, r16, r18)
            long r16 = r16 + r36
            r2 = 1
            int r5 = r3 - r2
            r4 = 4
            r2 = 0
            int r8 = X.AnonymousClass001.A0D(r4, r5, r2)
            int r3 = r3 - r4
            int r5 = X.AnonymousClass001.A0D(r3, r5, r2)
            r14 = r9[r2]
            int r2 = (r14 > r36 ? 1 : (r14 == r36 ? 0 : -1))
            if (r2 > 0) goto L_0x0c6f
            r3 = r9[r8]
            int r2 = (r36 > r3 ? 1 : (r36 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0c6f
            r3 = r9[r5]
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0c6f
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0c6f
            long r42 = r0 - r16
            long r36 = r36 - r14
            r2 = r38
            int r2 = r2.A0F
            long r4 = (long) r2
            r40 = r48
            r38 = r4
            long r2 = X.C162387ry.A05(r36, r38, r40)
            r44 = r4
            r46 = r48
            long r4 = X.C162387ry.A05(r42, r44, r46)
            r14 = 0
            int r8 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x0c4a
            int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0c6f
        L_0x0c4a:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x0c6f
            int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x0c6f
            int r0 = (int) r2
            r1 = r51
            r1.A00 = r0
            int r0 = (int) r4
            r1.A01 = r0
            r0 = r48
            X.C162387ry.A0B(r9, r0)
            r0 = 0
            r28 = r6[r0]
            r32 = r10
            long r7 = X.C162387ry.A05(r28, r30, r32)
            goto L_0x0bd0
        L_0x0c6d:
            if (r7 != r3) goto L_0x0c9c
        L_0x0c6f:
            r5 = 0
            r10 = r6[r5]
            r3 = 0
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0c9c
            long[] r2 = r13.A09
            r2.getClass()
            r5 = r2[r5]
            r4 = 0
        L_0x0c80:
            int r2 = r9.length
            if (r4 >= r2) goto L_0x0c90
            r28 = r9[r4]
            long r28 = r28 - r5
            long r2 = X.C162387ry.A05(r28, r30, r32)
            r9[r4] = r2
            int r4 = r4 + 1
            goto L_0x0c80
        L_0x0c90:
            long r0 = r0 - r5
            r2 = r0
            r4 = r30
            r6 = r48
            long r7 = X.C162387ry.A05(r2, r4, r6)
            goto L_0x0bd0
        L_0x0c9c:
            int r1 = r13.A03
            r0 = 1
            boolean r16 = X.AnonymousClass000.A1U(r1, r0)
            int[] r3 = new int[r7]
            int[] r10 = new int[r7]
            long[] r0 = r13.A09
            r21 = r0
            r21.getClass()
            r5 = 0
            r19 = 0
            r4 = 0
            r2 = 0
        L_0x0cb3:
            if (r5 >= r7) goto L_0x0d0d
            r0 = r21[r5]
            r11 = -1
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0d08
            r28 = r6[r5]
            long r11 = r13.A05
            r30 = r48
            r32 = r11
            long r11 = X.C162387ry.A05(r28, r30, r32)
            r8 = 1
            int r8 = X.C162387ry.A04(r9, r0, r8)
            r3[r5] = r8
            long r0 = r0 + r11
            int r11 = java.util.Arrays.binarySearch(r9, r0)
            if (r11 >= 0) goto L_0x0cf7
            int r11 = ~r11
        L_0x0cd8:
            r10[r5] = r11
        L_0x0cda:
            r0 = r3[r5]
            r1 = r10[r5]
            if (r0 >= r1) goto L_0x0ceb
            r8 = r25[r0]
            r8 = r8 & 1
            if (r8 != 0) goto L_0x0ceb
            int r0 = r0 + 1
            r3[r5] = r0
            goto L_0x0cda
        L_0x0ceb:
            int r8 = r1 - r0
            int r4 = r4 + r8
            boolean r0 = X.AnonymousClass001.A1X(r2, r0)
            r0 = r0 | r19
            r19 = r0
            goto L_0x0d09
        L_0x0cf7:
            int r11 = r11 + 1
            int r8 = r9.length
            if (r11 >= r8) goto L_0x0d03
            r14 = r9[r11]
            int r8 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0d03
            goto L_0x0cf7
        L_0x0d03:
            if (r16 == 0) goto L_0x0cd8
            int r11 = r11 + -1
            goto L_0x0cd8
        L_0x0d08:
            r1 = r2
        L_0x0d09:
            int r5 = r5 + 1
            r2 = r1
            goto L_0x0cb3
        L_0x0d0d:
            r2 = 0
            r1 = 1
            r0 = r35
            if (r4 != r0) goto L_0x0d14
            r1 = 0
        L_0x0d14:
            r19 = r19 | r1
            if (r19 == 0) goto L_0x0d80
            long[] r0 = new long[r4]
            r36 = r0
            int[] r12 = new int[r4]
            r23 = 0
            int[] r0 = new int[r4]
            r22 = r0
        L_0x0d24:
            long[] r0 = new long[r4]
            r18 = r0
            r1 = 0
            r28 = 0
        L_0x0d2b:
            if (r2 >= r7) goto L_0x0d87
            r14 = r21[r2]
            r0 = r3[r2]
            r11 = r10[r2]
            if (r19 == 0) goto L_0x0d4a
            int r8 = r11 - r0
            r5 = r27
            r4 = r36
            java.lang.System.arraycopy(r5, r0, r4, r1, r8)
            r4 = r26
            java.lang.System.arraycopy(r4, r0, r12, r1, r8)
            r5 = r25
            r4 = r22
            java.lang.System.arraycopy(r5, r0, r4, r1, r8)
        L_0x0d4a:
            if (r0 >= r11) goto L_0x0d79
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r13.A05
            r32 = r4
            long r16 = X.C162387ry.A05(r28, r30, r32)
            r4 = r9[r0]
            long r30 = X.AnonymousClass6C8.A0Q(r4, r14)
            r32 = 1000000(0xf4240, double:4.940656E-318)
            r34 = r48
            long r4 = X.C162387ry.A05(r30, r32, r34)
            long r16 = r16 + r4
            r18[r1] = r16
            if (r19 == 0) goto L_0x0d74
            r5 = r12[r1]
            r4 = r23
            if (r5 <= r4) goto L_0x0d74
            r23 = r26[r0]
        L_0x0d74:
            int r1 = r1 + 1
            int r0 = r0 + 1
            goto L_0x0d4a
        L_0x0d79:
            r4 = r6[r2]
            long r28 = r28 + r4
            int r2 = r2 + 1
            goto L_0x0d2b
        L_0x0d80:
            r36 = r27
            r12 = r26
            r22 = r25
            goto L_0x0d24
        L_0x0d87:
            long r0 = r13.A05
            r30 = 1000000(0xf4240, double:4.940656E-318)
            r32 = r0
            long r7 = X.C162387ry.A05(r28, r30, r32)
            X.7UO r0 = new X.7UO
            r1 = r13
            r2 = r12
            r3 = r22
            r4 = r36
            r5 = r18
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0941
        L_0x0da3:
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            X.6Op r1 = r2.A01(r0)
            if (r1 == 0) goto L_0x0dc6
            X.870 r36 = new X.870
            r0 = r36
            r0.<init>(r1)
            goto L_0x0924
        L_0x0db5:
            r1 = r22
            r0 = r1
            goto L_0x08c9
        L_0x0dba:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x0dbf:
            java.lang.String r0 = "Unsupported media rate."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0dc6:
            java.lang.String r0 = "Track has no sample table size information"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x0dcd:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161587q0.A03(X.7z2, X.7i9, X.6Oq, X.8mX, long, boolean):java.util.List");
    }
}
