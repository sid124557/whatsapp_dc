package X;

import java.util.Arrays;

/* renamed from: X.86R  reason: invalid class name */
public class AnonymousClass86R implements C185328tT {
    public C187028wK A00;
    public C153157al A01;
    public boolean A02;

    public final boolean A00(C187648xa r9) {
        C153157al r0;
        C152597Zm r2 = new C152597Zm();
        if (r2.A01(r9, true) && (r2.A03 & 2) == 2) {
            int min = Math.min(r2.A00, 8);
            C161467pi A05 = C161467pi.A05(min);
            C161467pi.A06(r9, A05, min);
            A05.A0S(0);
            if (C161467pi.A00(A05) >= 5 && A05.A0C() == 127 && A05.A0I() == 1179402563) {
                r0 = new C126626Or();
            } else {
                A05.A0S(0);
                try {
                    if (C154007cQ.A00(A05, 1, true)) {
                        r0 = new C126636Os();
                    }
                } catch (AnonymousClass6u7 unused) {
                }
                A05.A0S(0);
                int A002 = C161467pi.A00(A05);
                byte[] bArr = C126646Ot.A01;
                int length = bArr.length;
                if (A002 >= length) {
                    byte[] bArr2 = new byte[length];
                    A05.A0V(bArr2, 0, length);
                    if (Arrays.equals(bArr2, bArr)) {
                        r0 = new C126646Ot();
                    }
                }
            }
            this.A01 = r0;
            return true;
        }
        return false;
    }

    public void BFs(C187028wK r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r23, X.AnonymousClass7BG r24) {
        /*
            r22 = this;
            r4 = r22
            X.8wK r0 = r4.A00
            X.C161487pm.A01(r0)
            X.7al r0 = r4.A01
            r6 = r23
            if (r0 != 0) goto L_0x0016
            boolean r0 = r4.A00(r6)
            if (r0 == 0) goto L_0x022e
            r6.Bjy()
        L_0x0016:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0034
            X.8wK r1 = r4.A00
            r0 = 0
            r3 = 1
            X.8tw r2 = r1.Br0(r0, r3)
            X.8wK r0 = r4.A00
            r0.B2W()
            X.7al r1 = r4.A01
            X.8wK r0 = r4.A00
            r1.A06 = r0
            r1.A07 = r2
            r1.A00(r3)
            r4.A02 = r3
        L_0x0034:
            X.7al r12 = r4.A01
            X.8tw r0 = r12.A07
            X.C161487pm.A01(r0)
            int r0 = r12.A01
            if (r0 == 0) goto L_0x0060
            r15 = 1
            r3 = 2
            if (r0 == r15) goto L_0x0056
            if (r0 != r3) goto L_0x022c
            X.8si r0 = r12.A08
            long r2 = r0.BiG(r6)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e9
            r0 = r24
            r0.A00 = r2
            return r15
        L_0x0056:
            long r1 = r12.A04
            int r0 = (int) r1
            r6.BpP(r0)
            r12.A01 = r3
            goto L_0x01b5
        L_0x0060:
            X.7TM r3 = r12.A0C
            boolean r0 = r3.A00(r6)
            if (r0 == 0) goto L_0x0229
            long r4 = r6.BBW()
            long r0 = r12.A04
            long r4 = r4 - r0
            r12.A03 = r4
            X.7pi r4 = r3.A03
            X.7G1 r2 = r12.A09
            boolean r0 = r12.A01(r2, r4, r0)
            if (r0 == 0) goto L_0x0082
            long r0 = r6.BBW()
            r12.A04 = r0
            goto L_0x0060
        L_0x0082:
            X.7G1 r0 = r12.A09
            X.7yp r2 = r0.A00
            int r0 = r2.A0F
            r12.A00 = r0
            boolean r0 = r12.A0A
            r1 = 1
            if (r0 != 0) goto L_0x0096
            X.8tw r0 = r12.A07
            r0.B3T(r2)
            r12.A0A = r1
        L_0x0096:
            X.7G1 r0 = r12.A09
            X.8si r0 = r0.A01
            if (r0 != 0) goto L_0x00ab
            long r15 = r6.getLength()
            r1 = -1
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c9
            X.871 r0 = new X.871
            r0.<init>()
        L_0x00ab:
            r12.A08 = r0
        L_0x00ad:
            r0 = 2
            r12.A01 = r0
            byte[] r2 = r4.A02
            int r0 = r2.length
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 == r1) goto L_0x01b5
            int r0 = r4.A00
            int r0 = java.lang.Math.max(r1, r0)
            byte[] r1 = java.util.Arrays.copyOf(r2, r0)
            int r0 = r4.A00
            r4.A0U(r1, r0)
            goto L_0x01b5
        L_0x00c9:
            X.7Zm r5 = r3.A02
            int r0 = r5.A03
            r0 = r0 & 4
            boolean r21 = X.AnonymousClass000.A1S(r0)
            long r13 = r12.A04
            int r1 = r5.A01
            int r0 = r5.A00
            int r1 = r1 + r0
            long r2 = (long) r1
            long r0 = r5.A04
            X.873 r11 = new X.873
            r17 = r2
            r19 = r0
            r11.<init>(r12, r13, r15, r17, r19, r21)
            r12.A08 = r11
            goto L_0x00ad
        L_0x00e9:
            r7 = -1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x010d
            r0 = 2
            long r2 = r2 + r0
            long r0 = -r2
            boolean r2 = r12 instanceof X.C126636Os
            if (r2 == 0) goto L_0x0225
            r9 = r12
            X.6Os r9 = (X.C126636Os) r9
            r9.A02 = r0
            r3 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r2)
            r9.A04 = r0
            X.7P0 r0 = r9.A02
            if (r0 == 0) goto L_0x010b
            int r3 = r0.A02
        L_0x010b:
            r9.A00 = r3
        L_0x010d:
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x0121
            X.8si r0 = r12.A08
            X.8sg r1 = r0.B12()
            X.C161487pm.A01(r1)
            X.8wK r0 = r12.A06
            r0.Bl0(r1)
            r12.A0B = r15
        L_0x0121:
            long r0 = r12.A03
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x012f
            X.7TM r0 = r12.A0C
            boolean r0 = r0.A00(r6)
            if (r0 == 0) goto L_0x0229
        L_0x012f:
            r12.A03 = r4
            X.7TM r0 = r12.A0C
            X.7pi r6 = r0.A03
            boolean r0 = r12 instanceof X.C126636Os
            if (r0 == 0) goto L_0x01be
            r10 = r12
            X.6Os r10 = (X.C126636Os) r10
            byte[] r11 = r6.A02
            r2 = 0
            byte r9 = r11[r2]
            r0 = r9 & 1
            if (r0 == r15) goto L_0x0222
            X.7Nd r3 = r10.A03
            X.C161487pm.A01(r3)
            int r0 = r3.A00
            int r9 = r9 >> r15
            int r1 = 8 - r0
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 >>> r1
            r9 = r9 & r0
            X.7BI[] r0 = r3.A04
            r0 = r0[r9]
            boolean r1 = r0.A00
            X.7P0 r0 = r3.A02
            if (r1 != 0) goto L_0x01bb
            int r9 = r0.A02
        L_0x015f:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0168
            int r0 = r10.A00
            int r0 = r0 + r9
            int r2 = r0 / 4
        L_0x0168:
            long r0 = (long) r2
            int r3 = r11.length
            int r2 = r6.A00
            int r2 = r2 + 4
            if (r3 >= r2) goto L_0x01b7
            byte[] r3 = java.util.Arrays.copyOf(r11, r2)
            int r2 = r3.length
            r6.A0U(r3, r2)
        L_0x0178:
            byte[] r3 = r6.A02
            int r2 = r6.A00
            X.AnonymousClass6C8.A1I(r3, r2, r0)
            r10.A04 = r15
            r10.A00 = r9
        L_0x0183:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x01b0
            long r2 = r12.A02
            long r10 = r2 + r0
            long r4 = r12.A05
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x01b0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            int r4 = r12.A00
            long r4 = (long) r4
            long r2 = r2 / r4
            X.8tw r5 = r12.A07
            int r4 = r6.A00
            r5.Bkc(r6, r4)
            X.8tw r13 = r12.A07
            int r4 = r6.A00
            r17 = 0
            r14 = 0
            r16 = r4
            r18 = r2
            r13.Bkh(r14, r15, r16, r17, r18)
            r12.A05 = r7
        L_0x01b0:
            long r2 = r12.A02
            long r2 = r2 + r0
            r12.A02 = r2
        L_0x01b5:
            r15 = 0
            return r15
        L_0x01b7:
            r6.A0R(r2)
            goto L_0x0178
        L_0x01bb:
            int r9 = r0.A03
            goto L_0x015f
        L_0x01be:
            boolean r0 = r12 instanceof X.C126646Ot
            if (r0 == 0) goto L_0x01fd
            byte[] r1 = r6.A02
            r0 = 0
            byte r0 = r1[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            r0 = r10 & 3
            r9 = 1
            if (r0 == 0) goto L_0x01d7
            r9 = 2
            if (r0 == r15) goto L_0x01d7
            if (r0 == r9) goto L_0x01d7
            byte r0 = r1[r15]
            r9 = r0 & 63
        L_0x01d7:
            r3 = 3
            int r10 = r10 >> r3
            r2 = r10 & 3
            r0 = 16
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r10 >= r0) goto L_0x01fb
            r0 = 12
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r10 < r0) goto L_0x01f5
            r0 = r2 & 1
            int r1 = r1 << r0
        L_0x01ea:
            long r2 = (long) r9
            long r0 = (long) r1
            long r2 = r2 * r0
            int r0 = r12.A00
            long r0 = (long) r0
            long r0 = X.AnonymousClass6C7.A0H(r0, r2)
            goto L_0x0183
        L_0x01f5:
            if (r2 != r3) goto L_0x01fb
            r1 = 60000(0xea60, float:8.4078E-41)
            goto L_0x01ea
        L_0x01fb:
            int r1 = r1 << r2
            goto L_0x01ea
        L_0x01fd:
            byte[] r2 = r6.A02
            r3 = 0
            byte r1 = r2[r3]
            r0 = -1
            if (r1 != r0) goto L_0x0222
            r0 = 2
            byte r0 = r2[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = 4
            int r2 = r2 >> r1
            r0 = 6
            if (r2 == r0) goto L_0x0212
            r0 = 7
            if (r2 != r0) goto L_0x0218
        L_0x0212:
            r6.A0T(r1)
            r6.A0K()
        L_0x0218:
            int r0 = X.C153997cP.A00(r6, r2)
            r6.A0S(r3)
            long r0 = (long) r0
            goto L_0x0183
        L_0x0222:
            r0 = -1
            goto L_0x01b0
        L_0x0225:
            r12.A02 = r0
            goto L_0x010d
        L_0x0229:
            r0 = 3
            r12.A01 = r0
        L_0x022c:
            r15 = -1
            return r15
        L_0x022e:
            java.lang.String r0 = "Failed to determine bitstream type"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86R.BiD(X.8xa, X.7BG):int");
    }

    public void Bkz(long j, long j2) {
        C153157al r3 = this.A01;
        if (r3 != null) {
            AnonymousClass7TM r5 = r3.A0C;
            C152597Zm r0 = r5.A02;
            r0.A03 = 0;
            r0.A04 = 0;
            r0.A02 = 0;
            r0.A01 = 0;
            r0.A00 = 0;
            r5.A03.A0Q(0);
            r5.A00 = -1;
            r5.A01 = false;
            if (j == 0) {
                r3.A00(!r3.A0B);
            } else if (r3.A01 != 0) {
                long A0H = AnonymousClass6C7.A0H((long) r3.A00, j2);
                r3.A05 = A0H;
                r3.A08.Bpw(A0H);
                r3.A01 = 2;
            }
        }
    }

    public boolean BpS(C187648xa r2) {
        try {
            return A00(r2);
        } catch (AnonymousClass6u7 unused) {
            return false;
        }
    }
}
