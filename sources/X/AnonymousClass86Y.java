package X;

import java.io.EOFException;

/* renamed from: X.86Y  reason: invalid class name */
public final class AnonymousClass86Y implements C185328tT {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C187028wK A05;
    public C185598tw A06;
    public C185598tw A07;
    public C187608xW A08;
    public C166547ys A09;
    public boolean A0A;
    public final AnonymousClass7UD A0B;
    public final C157347i9 A0C;
    public final AnonymousClass7RJ A0D;
    public final C185598tw A0E;
    public final C161467pi A0F;

    public void Bkz(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0;
        this.A00 = 0;
    }

    public boolean BpS(C187648xa r2) {
        return A02(r2, true);
    }

    public final C187608xW A00(C187648xa r7) {
        C161467pi r3 = this.A0F;
        r7.Bgd(r3.A02, 0, 4);
        r3.A0S(0);
        AnonymousClass7UD r1 = this.A0B;
        r1.A00(r3.A07());
        return new C126556Ok(r1, r7.getLength(), r7.BBW());
    }

    public final boolean A01(C187648xa r8) {
        C187608xW r0 = this.A08;
        if (r0 != null) {
            long B6k = r0.B6k();
            if (B6k != -1 && r8.BBF() > B6k - 4) {
                return true;
            }
        }
        try {
            return !r8.Bge(this.A0F.A02, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean A02(C187648xa r18, boolean z) {
        int i;
        int i2;
        int A002;
        int i3 = AnonymousClass35S.A0F;
        if (z) {
            i3 = 32768;
        }
        C187648xa r11 = r18;
        r11.Bjy();
        if (r11.BBW() == 0) {
            C166547ys A003 = this.A0D.A00(r11, (C180708lV) null);
            this.A09 = A003;
            if (A003 != null) {
                this.A0C.A00(A003);
            }
            i2 = (int) r11.BBF();
            if (!z) {
                r11.BpP(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!A01(r11)) {
                int A042 = C161467pi.A04(this.A0F, 0);
                if ((i == 0 || ((long) (-128000 & A042)) == (((long) i) & -128000)) && (A002 = C159937mi.A00(A042)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.A0B.A00(A042);
                        i = A042;
                    }
                    r11.Awu(A002 - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            r11.Bjy();
                            r11.Awu(i2 + i6);
                        } else {
                            r11.BpP(1);
                        }
                        i5 = i6;
                        i = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw AnonymousClass6u7.A01("Searched too many bytes.");
                    }
                }
            } else if (i4 <= 0) {
                throw AnonymousClass6CA.A0M();
            }
        }
        if (z) {
            r11.BpP(i2 + i5);
        } else {
            r11.Bjy();
        }
        this.A01 = i;
        return true;
    }

    public void BFs(C187028wK r3) {
        this.A05 = r3;
        C185598tw Br0 = r3.Br0(0, 1);
        this.A07 = Br0;
        this.A06 = Br0;
        this.A05.B2W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0259, code lost:
        if (X.C161467pi.A04(r12, 36) == 1447187017) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0265, code lost:
        if (r2 != 1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r2 == 1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034c, code lost:
        if (r4 != null) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034e, code lost:
        r4 = A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r6 == 1447187017) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c0, code lost:
        if (r9.A01 != -1) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        if (r6 != 1231971951) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d3, code lost:
        r4 = A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f6, code lost:
        if (r2 > 0) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f8, code lost:
        r9.A00 = r3;
        r9.A01 = r2;
        r4 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r31, X.AnonymousClass7BG r32) {
        /*
            r30 = this;
            r0 = r30
            X.8tw r1 = r0.A07
            X.C161487pm.A01(r1)
            int r1 = r0.A01
            r8 = r31
            if (r1 != 0) goto L_0x0014
            r1 = 0
            r0.A02(r8, r1)     // Catch:{ EOFException -> 0x0012 }
            goto L_0x0014
        L_0x0012:
            r0 = -1
            return r0
        L_0x0014:
            X.8xW r1 = r0.A08
            if (r1 != 0) goto L_0x026f
            X.7UD r1 = r0.A0B
            int r3 = r1.A02
            X.7pi r12 = X.C161467pi.A05(r3)
            byte[] r2 = r12.A02
            r11 = 0
            r8.Bgd(r2, r11, r3)
            int r2 = r1.A05
            r15 = 1
            r3 = r2 & 1
            int r2 = r1.A01
            if (r3 == 0) goto L_0x0263
            r7 = 36
            if (r2 != r15) goto L_0x0035
        L_0x0033:
            r7 = 21
        L_0x0035:
            int r3 = r12.A00
            int r2 = r7 + 4
            if (r3 < r2) goto L_0x024a
            int r6 = X.C161467pi.A04(r12, r7)
            r2 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r6 == r2) goto L_0x0049
            r2 = 1231971951(0x496e666f, float:976486.94)
            if (r6 != r2) goto L_0x024a
        L_0x0049:
            r2 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1231971951(0x496e666f, float:976486.94)
            if (r6 == r2) goto L_0x017d
            if (r6 == r13) goto L_0x017d
            r2 = 1447187017(0x56425249, float:5.3414667E13)
            if (r6 != r2) goto L_0x025d
        L_0x0058:
            long r6 = r8.getLength()
            long r2 = r8.BBW()
            r4 = 10
            r12.A0T(r4)
            int r5 = r12.A07()
            r4 = 0
            if (r5 <= 0) goto L_0x00bf
            int r11 = r1.A03
            long r9 = (long) r5
            r5 = 32000(0x7d00, float:4.4842E-41)
            r4 = 576(0x240, float:8.07E-43)
            if (r11 < r5) goto L_0x0077
            r4 = 1152(0x480, float:1.614E-42)
        L_0x0077:
            long r18 = X.AnonymousClass6CA.A0G(r4)
            long r4 = (long) r11
            r20 = r4
            r16 = r9
            long r21 = X.C162387ry.A05(r16, r18, r20)
            int r11 = r12.A0F()
            int r20 = r12.A0F()
            int r10 = r12.A0F()
            r4 = 2
            r12.A0T(r4)
            int r4 = r1.A02
            long r4 = (long) r4
            long r18 = r2 + r4
            long[] r4 = new long[r11]
            r17 = r4
            long[] r4 = new long[r11]
            r16 = r4
            r9 = 0
        L_0x00a2:
            if (r9 >= r11) goto L_0x014d
            long r4 = (long) r9
            long r4 = r4 * r21
            long r13 = (long) r11
            long r4 = r4 / r13
            r17[r9] = r4
            r4 = r18
            long r4 = java.lang.Math.max(r2, r4)
            r16[r9] = r4
            if (r10 == r15) goto L_0x013c
            r4 = 2
            if (r10 == r4) goto L_0x0137
            r4 = 3
            if (r10 == r4) goto L_0x0141
            r4 = 4
            if (r10 == r4) goto L_0x0132
            r4 = 0
        L_0x00bf:
            int r2 = r1.A02
            r8.BpP(r2)
        L_0x00c4:
            X.7ys r2 = r0.A09
            long r17 = r8.BBW()
            if (r2 == 0) goto L_0x0285
            X.8x6[] r9 = r2.A00
            int r7 = r9.length
            r3 = 0
        L_0x00d0:
            if (r3 >= r7) goto L_0x0285
            r13 = r9[r3]
            boolean r2 = r13 instanceof X.AnonymousClass6PB
            if (r2 == 0) goto L_0x012f
            X.6PB r13 = (X.AnonymousClass6PB) r13
            r6 = 0
        L_0x00db:
            if (r6 >= r7) goto L_0x0129
            r5 = r9[r6]
            boolean r2 = r5 instanceof X.AnonymousClass6P5
            if (r2 == 0) goto L_0x0126
            X.6P5 r5 = (X.AnonymousClass6P5) r5
            java.lang.String r3 = r5.A00
            java.lang.String r2 = "TLEN"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0126
            java.lang.String r2 = r5.A01
            long r2 = java.lang.Long.parseLong(r2)
            long r2 = X.C161207pD.A00(r2)
        L_0x00f9:
            int[] r12 = r13.A03
            int r11 = r12.length
            int r5 = r11 + 1
            long[] r10 = new long[r5]
            long[] r9 = new long[r5]
            r5 = 0
            r10[r5] = r17
            r15 = 0
            r9[r5] = r15
            r7 = 1
        L_0x010a:
            if (r7 > r11) goto L_0x0269
            int r6 = r13.A00
            int r14 = r7 + -1
            r5 = r12[r14]
            int r6 = r6 + r5
            long r5 = (long) r6
            long r17 = r17 + r5
            int r6 = r13.A01
            int[] r5 = r13.A04
            r5 = r5[r14]
            int r6 = r6 + r5
            long r5 = (long) r6
            long r15 = r15 + r5
            r10[r7] = r17
            r9[r7] = r15
            int r7 = r7 + 1
            goto L_0x010a
        L_0x0126:
            int r6 = r6 + 1
            goto L_0x00db
        L_0x0129:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00f9
        L_0x012f:
            int r3 = r3 + 1
            goto L_0x00d0
        L_0x0132:
            int r4 = r12.A0E()
            goto L_0x0145
        L_0x0137:
            int r4 = r12.A0F()
            goto L_0x0145
        L_0x013c:
            int r4 = r12.A0C()
            goto L_0x0145
        L_0x0141:
            int r4 = r12.A0D()
        L_0x0145:
            int r4 = r4 * r20
            long r4 = (long) r4
            long r2 = r2 + r4
            int r9 = r9 + 1
            goto L_0x00a2
        L_0x014d:
            r9 = -1
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x016e
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x016e
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "VBRI data size mismatch: "
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = ", "
            java.lang.String r5 = X.AnonymousClass000.A0Z(r4, r5, r2)
            java.lang.String r4 = "VbriSeeker"
            android.util.Log.w(r4, r5)
        L_0x016e:
            X.86w r4 = new X.86w
            r18 = r4
            r19 = r17
            r20 = r16
            r23 = r2
            r18.<init>(r19, r20, r21, r23)
            goto L_0x00bf
        L_0x017d:
            long r2 = r8.getLength()
            long r17 = r8.BBW()
            int r5 = r1.A04
            int r4 = r1.A03
            int r14 = r12.A07()
            r9 = r14 & 1
            if (r9 != r15) goto L_0x0247
            int r9 = r12.A0E()
            if (r9 == 0) goto L_0x0247
            long r9 = (long) r9
            long r21 = X.AnonymousClass6CA.A0G(r5)
            long r4 = (long) r4
            r19 = r9
            r23 = r4
            long r19 = X.C162387ry.A05(r19, r21, r23)
            r5 = 6
            r4 = r14 & 6
            if (r4 == r5) goto L_0x01fd
            int r2 = r1.A02
            r21 = -1
            r15 = 0
            X.86x r4 = new X.86x
            r14 = r4
            r16 = r2
            r14.<init>(r15, r16, r17, r19, r21)
        L_0x01b7:
            X.7i9 r9 = r0.A0C
            int r2 = r9.A00
            r3 = -1
            if (r2 == r3) goto L_0x01d9
            int r2 = r9.A01
            if (r2 == r3) goto L_0x01d9
        L_0x01c2:
            int r2 = r1.A02
            r8.BpP(r2)
            if (r4 == 0) goto L_0x00c4
            long[] r2 = r4.A05
            boolean r2 = X.AnonymousClass000.A1W(r2)
            if (r2 != 0) goto L_0x00c4
            if (r6 != r13) goto L_0x00c4
            X.8xW r4 = r0.A00(r8)
            goto L_0x00c4
        L_0x01d9:
            r8.Bjy()
            int r2 = r7 + 141
            r8.Awu(r2)
            X.7pi r5 = r0.A0F
            byte[] r3 = r5.A02
            r2 = 3
            r8.Bgd(r3, r11, r2)
            r5.A0S(r11)
            int r2 = r5.A0D()
            int r3 = r2 >> 12
            r2 = r2 & 4095(0xfff, float:5.738E-42)
            if (r3 > 0) goto L_0x01f8
            if (r2 <= 0) goto L_0x01c2
        L_0x01f8:
            r9.A00 = r3
            r9.A01 = r2
            goto L_0x01c2
        L_0x01fd:
            long r28 = r12.A0I()
            r5 = 100
            long[] r14 = new long[r5]
            r4 = 0
        L_0x0206:
            int r9 = r12.A0C()
            long r9 = (long) r9
            r14[r4] = r9
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x0206
            r9 = -1
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0234
            long r4 = r17 + r28
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0234
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r10 = "XING data size mismatch: "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r2 = ", "
            java.lang.String r3 = X.AnonymousClass000.A0Z(r2, r9, r4)
            java.lang.String r2 = "XingSeeker"
            android.util.Log.w(r2, r3)
        L_0x0234:
            int r2 = r1.A02
            X.86x r4 = new X.86x
            r21 = r4
            r22 = r14
            r23 = r2
            r24 = r17
            r26 = r19
            r21.<init>(r22, r23, r24, r26, r28)
            goto L_0x01b7
        L_0x0247:
            r4 = 0
            goto L_0x01c2
        L_0x024a:
            int r3 = r12.A00
            r2 = 40
            if (r3 < r2) goto L_0x025d
            r2 = 36
            int r3 = X.C161467pi.A04(r12, r2)
            r2 = 1447187017(0x56425249, float:5.3414667E13)
            if (r3 != r2) goto L_0x025d
            goto L_0x0058
        L_0x025d:
            r8.Bjy()
            r4 = 0
            goto L_0x00c4
        L_0x0263:
            r7 = 13
            if (r2 == r15) goto L_0x0035
            goto L_0x0033
        L_0x0269:
            X.86y r5 = new X.86y
            r5.<init>(r10, r9, r2)
            goto L_0x0286
        L_0x026f:
            long r4 = r0.A03
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02c3
            long r2 = r8.BBW()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x02c3
            long r4 = r4 - r2
            int r1 = (int) r4
            r8.BpP(r1)
            goto L_0x02c3
        L_0x0285:
            r5 = 0
        L_0x0286:
            boolean r2 = r0.A0A
            if (r2 == 0) goto L_0x0347
            X.6Ol r4 = new X.6Ol
            r4.<init>()
        L_0x028f:
            r0.A08 = r4
            X.8wK r2 = r0.A05
            r2.Bl0(r4)
            X.8tw r4 = r0.A06
            X.7he r3 = X.C157057he.A00()
            java.lang.String r2 = r1.A06
            r3.A0R = r2
            r2 = 4096(0x1000, float:5.74E-42)
            r3.A08 = r2
            int r2 = r1.A01
            r3.A04 = r2
            int r1 = r1.A03
            r3.A0D = r1
            X.7i9 r2 = r0.A0C
            int r1 = r2.A00
            r3.A05 = r1
            int r1 = r2.A01
            r3.A06 = r1
            X.7ys r1 = r0.A09
            r3.A0J = r1
            X.C166527yp.A01(r3, r4)
            long r1 = r8.BBW()
            r0.A03 = r1
        L_0x02c3:
            int r2 = r0.A00
            r10 = 1
            r5 = -1
            r12 = 0
            if (r2 != 0) goto L_0x030f
            r8.Bjy()
            boolean r1 = r0.A01(r8)
            if (r1 != 0) goto L_0x0354
            X.7pi r1 = r0.A0F
            int r9 = X.C161467pi.A04(r1, r12)
            int r1 = r0.A01
            long r3 = (long) r1
            r1 = -128000(0xfffffffffffe0c00, float:NaN)
            r1 = r1 & r9
            long r1 = (long) r1
            r6 = -128000(0xfffffffffffe0c00, double:NaN)
            long r3 = r3 & r6
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0341
            int r1 = X.C159937mi.A00(r9)
            if (r1 == r5) goto L_0x0341
            X.7UD r4 = r0.A0B
            r4.A00(r9)
            long r1 = r0.A02
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x030b
            X.8xW r3 = r0.A08
            long r1 = r8.BBW()
            long r1 = r3.BDg(r1)
            r0.A02 = r1
        L_0x030b:
            int r2 = r4.A02
            r0.A00 = r2
        L_0x030f:
            X.8tw r1 = r0.A06
            int r2 = r1.Bkf(r8, r2, r12, r10)
            if (r2 == r5) goto L_0x0354
            int r1 = r0.A00
            int r1 = r1 - r2
            r0.A00 = r1
            if (r1 > 0) goto L_0x033f
            X.8tw r8 = r0.A06
            long r1 = r0.A04
            long r13 = r0.A02
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r3
            X.7UD r5 = r0.A0B
            int r3 = r5.A03
            long r3 = (long) r3
            long r1 = r1 / r3
            long r13 = r13 + r1
            int r11 = r5.A02
            r9 = 0
            r8.Bkh(r9, r10, r11, r12, r13)
            long r3 = r0.A04
            int r1 = r5.A04
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.A04 = r3
            r0.A00 = r12
        L_0x033f:
            r0 = 0
            return r0
        L_0x0341:
            r8.BpP(r10)
            r0.A01 = r12
            goto L_0x033f
        L_0x0347:
            if (r5 == 0) goto L_0x034c
            r4 = r5
            goto L_0x028f
        L_0x034c:
            if (r4 != 0) goto L_0x028f
            X.8xW r4 = r0.A00(r8)
            goto L_0x028f
        L_0x0354:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86Y.BiD(X.8xa, X.7BG):int");
    }

    public AnonymousClass86Y(int i) {
        this.A0F = C161467pi.A05(10);
        this.A0B = new AnonymousClass7UD();
        this.A0C = new C157347i9();
        this.A02 = -9223372036854775807L;
        this.A0D = new AnonymousClass7RJ();
        C1687786s r0 = new C1687786s();
        this.A0E = r0;
        this.A06 = r0;
    }

    public AnonymousClass86Y() {
        this(0);
    }
}
