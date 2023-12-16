package X;

import java.util.Arrays;

/* renamed from: X.810  reason: invalid class name */
public class AnonymousClass810 implements C185218tH {
    public C184708sO A00;
    public C153147ak A01;
    public boolean A02;

    public final boolean A00(C153437bJ r9) {
        C153147ak r0;
        C152577Zk r2 = new C152577Zk();
        if (r2.A01(r9, true) && (r2.A03 & 2) == 2) {
            int min = Math.min(r2.A00, 8);
            C161457ph r7 = new C161457ph(min);
            r9.A03(r7.A02, 0, min);
            r7.A0H(0);
            if (r7.A00 - r7.A01 >= 5 && r7.A04() == 127 && r7.A09() == 1179402563) {
                r0 = new C125826Jq();
            } else {
                r7.A0H(0);
                try {
                    if (AnonymousClass710.A00(r7, 1, true)) {
                        r0 = new C125836Jr();
                    }
                } catch (C140626uD unused) {
                }
                r7.A0H(0);
                int i = r7.A00 - r7.A01;
                byte[] bArr = C125846Js.A01;
                int length = bArr.length;
                if (i >= length) {
                    byte[] bArr2 = new byte[length];
                    r7.A0J(bArr2, 0, length);
                    if (Arrays.equals(bArr2, bArr)) {
                        r0 = new C125846Js();
                    }
                }
            }
            this.A01 = r0;
            return true;
        }
        return false;
    }

    public void BFq(C184708sO r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiC(X.C153437bJ r24, X.AnonymousClass7A1 r25) {
        /*
            r23 = this;
            r4 = r23
            X.7ak r0 = r4.A01
            r8 = r24
            if (r0 != 0) goto L_0x0011
            boolean r0 = r4.A00(r8)
            if (r0 == 0) goto L_0x0297
            r0 = 0
            r8.A01 = r0
        L_0x0011:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0037
            X.8sO r1 = r4.A00
            r0 = 0
            r3 = 1
            X.8tI r2 = r1.Bqz(r0, r3)
            X.8sO r0 = r4.A00
            X.812 r0 = (X.AnonymousClass812) r0
            r0.A0H = r3
            android.os.Handler r1 = r0.A0Q
            java.lang.Runnable r0 = r0.A0Y
            r1.post(r0)
            X.7ak r1 = r4.A01
            X.8sO r0 = r4.A00
            r1.A06 = r0
            r1.A07 = r2
            r1.A00(r3)
            r4.A02 = r3
        L_0x0037:
            X.7ak r7 = r4.A01
            int r0 = r7.A01
            if (r0 == 0) goto L_0x0201
            r6 = 1
            r3 = 2
            if (r0 == r6) goto L_0x0288
            if (r0 != r3) goto L_0x01fc
            X.8sR r0 = r7.A08
            long r2 = r0.BiF(r8)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            r0 = r25
            r0.A00 = r2
            return r6
        L_0x0054:
            r19 = -1
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
            r0 = 2
            long r2 = r2 + r0
            long r0 = -r2
            boolean r2 = r7 instanceof X.C125836Jr
            if (r2 == 0) goto L_0x01d8
            r9 = r7
            X.6Jr r9 = (X.C125836Jr) r9
            r9.A02 = r0
            r3 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r2)
            r9.A04 = r0
            X.7OG r0 = r9.A03
            if (r0 == 0) goto L_0x0076
            int r3 = r0.A01
        L_0x0076:
            r9.A00 = r3
        L_0x0078:
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x0091
            X.8sR r0 = r7.A08
            X.8sP r1 = r0.B11()
            X.8sO r0 = r7.A06
            X.812 r0 = (X.AnonymousClass812) r0
            r0.A07 = r1
            android.os.Handler r1 = r0.A0Q
            java.lang.Runnable r0 = r0.A0Y
            r1.post(r0)
            r7.A0B = r6
        L_0x0091:
            long r1 = r7.A03
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x009f
            X.7TH r0 = r7.A0C
            boolean r0 = r0.A00(r8)
            if (r0 == 0) goto L_0x0292
        L_0x009f:
            r7.A03 = r4
            X.7TH r0 = r7.A0C
            X.7ph r8 = r0.A03
            boolean r0 = r7 instanceof X.C125836Jr
            if (r0 == 0) goto L_0x011f
            r10 = r7
            X.6Jr r10 = (X.C125836Jr) r10
            byte[] r0 = r8.A02
            r2 = 0
            byte r9 = r0[r2]
            r0 = r9 & 1
            if (r0 == r6) goto L_0x01d4
            X.7NS r3 = r10.A01
            int r0 = r3.A00
            int r9 = r9 >> r6
            int r1 = 8 - r0
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 >>> r1
            r9 = r9 & r0
            X.7A3[] r0 = r3.A04
            r0 = r0[r9]
            boolean r1 = r0.A00
            X.7OG r0 = r3.A02
            if (r1 != 0) goto L_0x011c
            int r9 = r0.A01
        L_0x00cc:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x00d5
            int r0 = r10.A00
            int r0 = r0 + r9
            int r2 = r0 / 4
        L_0x00d5:
            long r2 = (long) r2
            int r0 = r8.A00
            int r0 = r0 + 4
            r8.A0G(r0)
            byte[] r1 = r8.A02
            int r0 = r8.A00
            X.AnonymousClass6C8.A1I(r1, r0, r2)
            r10.A04 = r6
            r10.A00 = r9
        L_0x00e8:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0115
            long r0 = r7.A02
            long r10 = r0 + r2
            long r4 = r7.A05
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0115
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
            int r4 = r7.A00
            long r4 = (long) r4
            long r0 = r0 / r4
            X.8tI r5 = r7.A07
            int r4 = r8.A00
            r5.Bkb(r8, r4)
            X.8tI r9 = r7.A07
            int r4 = r8.A00
            r13 = 0
            r10 = 0
            r11 = r6
            r12 = r4
            r14 = r0
            r9.Bkg(r10, r11, r12, r13, r14)
            r0 = r19
            r7.A05 = r0
        L_0x0115:
            long r0 = r7.A02
            long r0 = r0 + r2
            r7.A02 = r0
            goto L_0x0290
        L_0x011c:
            int r9 = r0.A02
            goto L_0x00cc
        L_0x011f:
            boolean r0 = r7 instanceof X.C125846Js
            if (r0 == 0) goto L_0x015e
            byte[] r1 = r8.A02
            r0 = 0
            byte r0 = r1[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            r0 = r10 & 3
            r9 = 1
            if (r0 == 0) goto L_0x0138
            r9 = 2
            if (r0 == r6) goto L_0x0138
            if (r0 == r9) goto L_0x0138
            byte r0 = r1[r6]
            r9 = r0 & 63
        L_0x0138:
            r3 = 3
            int r10 = r10 >> r3
            r2 = r10 & 3
            r0 = 16
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r10 >= r0) goto L_0x015c
            r0 = 12
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r10 < r0) goto L_0x0156
            r0 = r2 & 1
            int r1 = r1 << r0
        L_0x014b:
            long r2 = (long) r9
            long r0 = (long) r1
            long r2 = r2 * r0
            int r0 = r7.A00
            long r0 = (long) r0
            long r2 = X.AnonymousClass6C7.A0H(r0, r2)
            goto L_0x00e8
        L_0x0156:
            if (r2 != r3) goto L_0x015c
            r1 = 60000(0xea60, float:8.4078E-41)
            goto L_0x014b
        L_0x015c:
            int r1 = r1 << r2
            goto L_0x014b
        L_0x015e:
            byte[] r2 = r8.A02
            r18 = 0
            byte r1 = r2[r18]
            r0 = -1
            if (r1 != r0) goto L_0x01d4
            r1 = 2
            byte r0 = r2[r1]
            r13 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            int r13 = r13 >> r0
            switch(r13) {
                case 1: goto L_0x017f;
                case 2: goto L_0x017a;
                case 3: goto L_0x017a;
                case 4: goto L_0x017a;
                case 5: goto L_0x017a;
                case 6: goto L_0x0182;
                case 7: goto L_0x0182;
                case 8: goto L_0x0175;
                case 9: goto L_0x0175;
                case 10: goto L_0x0175;
                case 11: goto L_0x0175;
                case 12: goto L_0x0175;
                case 13: goto L_0x0175;
                case 14: goto L_0x0175;
                case 15: goto L_0x0175;
                default: goto L_0x0171;
            }
        L_0x0171:
            r0 = -1
        L_0x0172:
            long r2 = (long) r0
            goto L_0x00e8
        L_0x0175:
            int r13 = r13 + -8
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x017d
        L_0x017a:
            r0 = 576(0x240, float:8.07E-43)
            int r13 = r13 - r1
        L_0x017d:
            int r0 = r0 << r13
            goto L_0x0172
        L_0x017f:
            r0 = 192(0xc0, float:2.69E-43)
            goto L_0x0172
        L_0x0182:
            r8.A0I(r0)
            byte[] r0 = r8.A02
            r17 = r0
            int r12 = r8.A01
            byte r0 = r0[r12]
            long r0 = (long) r0
            r11 = 7
            r14 = 7
        L_0x0190:
            r10 = 6
            r9 = 1
            if (r14 < 0) goto L_0x01ec
            int r15 = r6 << r14
            long r2 = (long) r15
            long r2 = r2 & r0
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x01b8
            if (r14 >= r10) goto L_0x01bb
            int r15 = r15 - r6
            long r2 = (long) r15
            long r0 = r0 & r2
            int r11 = r11 - r14
            if (r11 == 0) goto L_0x01ec
        L_0x01a4:
            if (r9 >= r11) goto L_0x01be
            int r2 = r12 + r9
            byte r14 = r17[r2]
            r3 = r14 & 192(0xc0, float:2.69E-43)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x01dc
            long r0 = r0 << r10
            r2 = r14 & 63
            long r2 = (long) r2
            long r0 = r0 | r2
            int r9 = r9 + 1
            goto L_0x01a4
        L_0x01b8:
            int r14 = r14 + -1
            goto L_0x0190
        L_0x01bb:
            if (r14 != r11) goto L_0x01ec
            r11 = 1
        L_0x01be:
            int r12 = r12 + r11
            r8.A01 = r12
            if (r13 != r10) goto L_0x01cf
            int r1 = r8.A04()
        L_0x01c7:
            r0 = r18
            r8.A0H(r0)
            int r0 = r1 + 1
            goto L_0x0172
        L_0x01cf:
            int r1 = r8.A06()
            goto L_0x01c7
        L_0x01d4:
            r2 = -1
            goto L_0x0115
        L_0x01d8:
            r7.A02 = r0
            goto L_0x0078
        L_0x01dc:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Invalid UTF-8 sequence continuation byte: "
            java.lang.String r1 = X.AnonymousClass000.A0Z(r2, r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x01ec:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Invalid UTF-8 sequence first byte: "
            java.lang.String r1 = X.AnonymousClass000.A0Z(r2, r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x01fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x0201:
            r4 = 1
        L_0x0202:
            X.7TH r3 = r7.A0C
            boolean r0 = r3.A00(r8)
            if (r0 == 0) goto L_0x0292
            long r5 = r8.A02
            long r0 = r7.A04
            long r5 = r5 - r0
            r7.A03 = r5
            X.7ph r10 = r3.A03
            X.7F6 r2 = r7.A09
            boolean r0 = r7.A01(r2, r10, r0)
            if (r0 == 0) goto L_0x0220
            long r0 = r8.A02
            r7.A04 = r0
            goto L_0x0202
        L_0x0220:
            X.7F6 r0 = r7.A09
            X.7z1 r1 = r0.A00
            int r0 = r1.A0F
            r7.A00 = r0
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x0233
            X.8tI r0 = r7.A07
            r0.B3S(r1)
            r7.A0A = r4
        L_0x0233:
            X.7F6 r0 = r7.A09
            X.8sR r0 = r0.A01
            r11 = 0
            if (r0 != 0) goto L_0x0247
            long r8 = r8.A04
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0263
            X.81B r0 = new X.81B
            r0.<init>()
        L_0x0247:
            r7.A08 = r0
        L_0x0249:
            r7.A09 = r11
            r0 = 2
            r7.A01 = r0
            byte[] r2 = r10.A02
            int r0 = r2.length
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 == r1) goto L_0x0290
            int r0 = r10.A00
            int r0 = java.lang.Math.max(r1, r0)
            byte[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.A02 = r0
            goto L_0x0290
        L_0x0263:
            X.7Zk r6 = r3.A02
            int r0 = r6.A03
            r0 = r0 & 4
            boolean r22 = X.AnonymousClass000.A1S(r0)
            long r4 = r7.A04
            int r1 = r6.A01
            int r0 = r6.A00
            int r1 = r1 + r0
            long r2 = (long) r1
            long r0 = r6.A04
            X.81C r6 = new X.81C
            r12 = r6
            r13 = r7
            r14 = r4
            r16 = r8
            r18 = r2
            r20 = r0
            r12.<init>(r13, r14, r16, r18, r20, r22)
            r7.A08 = r6
            goto L_0x0249
        L_0x0288:
            long r1 = r7.A04
            int r0 = (int) r1
            r8.A01(r0)
            r7.A01 = r3
        L_0x0290:
            r6 = 0
            return r6
        L_0x0292:
            r0 = 3
            r7.A01 = r0
            r6 = -1
            return r6
        L_0x0297:
            java.lang.String r0 = "Failed to determine bitstream type"
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass810.BiC(X.7bJ, X.7A1):int");
    }

    public void Bkz(long j, long j2) {
        C153147ak r3 = this.A01;
        if (r3 != null) {
            AnonymousClass7TH r5 = r3.A0C;
            C152577Zk r0 = r5.A02;
            r0.A03 = 0;
            r0.A04 = 0;
            r0.A02 = 0;
            r0.A01 = 0;
            r0.A00 = 0;
            r5.A03.A0F(0);
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

    public boolean BpR(C153437bJ r2) {
        try {
            return A00(r2);
        } catch (C140626uD unused) {
            return false;
        }
    }
}
