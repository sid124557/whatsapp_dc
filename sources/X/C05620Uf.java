package X;

import java.util.Arrays;

/* renamed from: X.0Uf  reason: invalid class name and case insensitive filesystem */
public class C05620Uf {
    public static int A0E = 1000;
    public static boolean A0F = true;
    public static long A0G;
    public static long A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public C15680rl A07;
    public C15680rl A08;
    public boolean A09;
    public C07790cp[] A0A;
    public C04700Qh[] A0B;
    public boolean[] A0C;
    public final AnonymousClass0M1 A0D;

    public C04700Qh A06(Object obj) {
        C04700Qh r3 = null;
        if (obj != null) {
            if (this.A03 + 1 >= this.A01) {
                A08();
            }
            if (obj instanceof C04800Qs) {
                C04800Qs r5 = (C04800Qs) obj;
                r3 = r5.A02;
                if (r3 == null) {
                    r5.A03();
                    r3 = r5.A02;
                }
                int i = r3.A02;
                if (i != -1) {
                    if (i > this.A06 || this.A0D.A03[i] == null) {
                        if (i != -1) {
                            r3.A00();
                        }
                    }
                }
                int i2 = this.A06 + 1;
                this.A06 = i2;
                this.A03++;
                r3.A02 = i2;
                r3.A06 = C02300Fq.UNRESTRICTED;
                this.A0D.A03[i2] = r3;
            }
        }
        return r3;
    }

    public void A07() {
        AnonymousClass0M1 r5;
        C04700Qh[] r7;
        C15680rl r0;
        int i = 0;
        while (true) {
            r5 = this.A0D;
            r7 = r5.A03;
            if (i >= r7.length) {
                break;
            }
            C04700Qh r02 = r7[i];
            if (r02 != null) {
                r02.A00();
            }
            i++;
        }
        C14860qO r4 = r5.A02;
        C04700Qh[] r3 = this.A0B;
        int i2 = this.A05;
        C07800cq r42 = (C07800cq) r4;
        int length = r3.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            A01(r42, r3[i3]);
        }
        this.A05 = 0;
        Arrays.fill(r7, (Object) null);
        this.A06 = 0;
        AnonymousClass05I r1 = (AnonymousClass05I) this.A07;
        r1.A00 = 0;
        r1.A00 = 0.0f;
        this.A03 = 1;
        for (int i4 = 0; i4 < this.A04; i4++) {
        }
        A09();
        this.A04 = 0;
        if (A0F) {
            r0 = new AnonymousClass05H(r5, this);
        } else {
            r0 = new C07790cp(r5);
        }
        this.A08 = r0;
    }

    public final void A0C(C15680rl r10) {
        for (int i = 0; i < this.A03; i++) {
            this.A0C[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 < this.A03 * 2) {
                C04700Qh r0 = ((C07790cp) r10).A02;
                if (r0 != null) {
                    this.A0C[r0.A02] = true;
                }
                boolean[] zArr = this.A0C;
                C04700Qh BBM = r10.BBM(this, zArr);
                if (BBM != null) {
                    int i3 = BBM.A02;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                        float f = Float.MAX_VALUE;
                        int i4 = -1;
                        for (int i5 = 0; i5 < this.A04; i5++) {
                            C07790cp r1 = this.A0A[i5];
                            if (r1.A02.A06 != C02300Fq.UNRESTRICTED && !r1.A04 && r1.A01.Azb(BBM)) {
                                float B3n = r1.A01.B3n(BBM);
                                if (B3n < 0.0f) {
                                    float f2 = (-r1.A00) / B3n;
                                    if (f2 < f) {
                                        i4 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        if (i4 > -1) {
                            C07790cp r12 = this.A0A[i4];
                            r12.A02.A01 = -1;
                            r12.A04(BBM);
                            C04700Qh r02 = r12.A02;
                            r02.A01 = i4;
                            r02.A04(r12);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static int A00(Object obj) {
        C04700Qh r0 = ((C04800Qs) obj).A02;
        if (r0 != null) {
            return (int) (r0.A00 + 0.5f);
        }
        return 0;
    }

    public static void A01(C07800cq r3, Object obj) {
        int i = r3.A00;
        Object[] objArr = r3.A01;
        if (i < objArr.length) {
            objArr[i] = obj;
            r3.A00 = i + 1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.0cp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C07790cp A02() {
        /*
            r8 = this;
            boolean r0 = A0F
            r6 = 1
            X.0M1 r5 = r8.A0D
            if (r0 == 0) goto L_0x0032
            X.0qO r3 = r5.A01
            X.0cq r3 = (X.C07800cq) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0030
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x001b:
            X.0cp r4 = (X.C07790cp) r4
            if (r4 != 0) goto L_0x0056
            X.05H r4 = new X.05H
            r4.<init>(r5, r8)
            long r0 = A0H
            long r0 = r0 + r6
            A0H = r0
        L_0x0029:
            int r0 = X.C04700Qh.A0C
            int r0 = r0 + 1
            X.C04700Qh.A0C = r0
            return r4
        L_0x0030:
            r4 = r2
            goto L_0x001b
        L_0x0032:
            X.0qO r3 = r5.A00
            X.0cq r3 = (X.C07800cq) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0054
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x0045:
            X.0cp r4 = (X.C07790cp) r4
            if (r4 != 0) goto L_0x0056
            X.0cp r4 = new X.0cp
            r4.<init>(r5)
            long r0 = A0G
            long r0 = r0 + r6
            A0G = r0
            goto L_0x0029
        L_0x0054:
            r4 = r2
            goto L_0x0045
        L_0x0056:
            r0 = 0
            r4.A02 = r0
            X.0uW r0 = r4.A01
            r0.clear()
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A04 = r0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05620Uf.A02():X.0cp");
    }

    public C04700Qh A03() {
        if (this.A03 + 1 >= this.A01) {
            A08();
        }
        C04700Qh A052 = A05(C02300Fq.SLACK);
        int i = this.A06 + 1;
        this.A06 = i;
        this.A03++;
        A052.A02 = i;
        this.A0D.A03[i] = A052;
        return A052;
    }

    public C04700Qh A04(int i) {
        if (this.A03 + 1 >= this.A01) {
            A08();
        }
        C04700Qh A052 = A05(C02300Fq.ERROR);
        int i2 = this.A06 + 1;
        this.A06 = i2;
        this.A03++;
        A052.A02 = i2;
        A052.A04 = i;
        this.A0D.A03[i2] = A052;
        AnonymousClass05I r3 = (AnonymousClass05I) this.A07;
        r3.A02.A01 = A052;
        float[] fArr = A052.A09;
        Arrays.fill(fArr, 0.0f);
        fArr[A052.A04] = 1.0f;
        r3.A07(A052);
        return A052;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.0Qh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C04700Qh A05(X.C02300Fq r6) {
        /*
            r5 = this;
            X.0M1 r0 = r5.A0D
            X.0qO r4 = r0.A02
            X.0cq r4 = (X.C07800cq) r4
            int r0 = r4.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0043
            int r1 = r0 + -1
            java.lang.Object[] r0 = r4.A01
            r3 = r0[r1]
            r0[r1] = r2
            r4.A00 = r1
        L_0x0015:
            X.0Qh r3 = (X.C04700Qh) r3
            if (r3 != 0) goto L_0x003f
            X.0Qh r3 = new X.0Qh
            r3.<init>(r6)
        L_0x001e:
            r3.A06 = r6
            int r1 = r5.A05
            int r0 = A0E
            if (r1 < r0) goto L_0x0034
            int r1 = r0 * 2
            A0E = r1
            X.0Qh[] r0 = r5.A0B
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            X.0Qh[] r0 = (X.C04700Qh[]) r0
            r5.A0B = r0
        L_0x0034:
            X.0Qh[] r2 = r5.A0B
            int r1 = r5.A05
            int r0 = r1 + 1
            r5.A05 = r0
            r2[r1] = r3
            return r3
        L_0x003f:
            r3.A00()
            goto L_0x001e
        L_0x0043:
            r3 = r2
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05620Uf.A05(X.0Fq):X.0Qh");
    }

    public final void A08() {
        int i = this.A00 * 2;
        this.A00 = i;
        this.A0A = (C07790cp[]) Arrays.copyOf(this.A0A, i);
        AnonymousClass0M1 r2 = this.A0D;
        r2.A03 = (C04700Qh[]) Arrays.copyOf(r2.A03, this.A00);
        int i2 = this.A00;
        this.A0C = new boolean[i2];
        this.A01 = i2;
        this.A02 = i2;
    }

    public final void A09() {
        int i = 0;
        if (A0F) {
            while (true) {
                C07790cp[] r2 = this.A0A;
                if (i < r2.length) {
                    C07790cp r1 = r2[i];
                    if (r1 != null) {
                        A01((C07800cq) this.A0D.A01, r1);
                    }
                    r2[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C07790cp[] r22 = this.A0A;
                if (i < r22.length) {
                    C07790cp r12 = r22[i];
                    if (r12 != null) {
                        A01((C07800cq) this.A0D.A00, r12);
                    }
                    r22[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C07790cp r18) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A04
            r4 = 1
            int r1 = r0 + 1
            int r0 = r5.A02
            if (r1 >= r0) goto L_0x0013
            int r0 = r5.A03
            int r1 = r0 + 1
            int r0 = r5.A01
            if (r1 < r0) goto L_0x0016
        L_0x0013:
            r5.A08()
        L_0x0016:
            r6 = r18
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x019d
            X.0cp[] r0 = r5.A0A
            int r0 = r0.length
            if (r0 != 0) goto L_0x0108
        L_0x0021:
            X.0Qh r0 = r6.A02
            if (r0 != 0) goto L_0x0035
            float r1 = r6.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            X.0uW r0 = r6.A01
            int r0 = r0.B6a()
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            float r1 = r6.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
            r6.A00 = r1
            X.0uW r0 = r6.A01
            r0.BGi()
        L_0x0046:
            X.0uW r8 = r6.A01
            int r7 = r8.B6a()
            r9 = 0
            r16 = 0
            r15 = r9
            r3 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
        L_0x0055:
            if (r3 >= r7) goto L_0x009f
            float r10 = r8.BED(r3)
            X.0Qh r2 = r8.BEC(r3)
            X.0Fq r1 = r2.A06
            X.0Fq r0 = X.C02300Fq.UNRESTRICTED
            if (r1 != r0) goto L_0x0080
            if (r9 == 0) goto L_0x0077
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            if (r14 != 0) goto L_0x0074
            int r0 = r2.A05
            if (r0 > r4) goto L_0x0074
            r12 = r10
            r9 = r2
            r14 = 1
        L_0x0074:
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0077:
            int r0 = r2.A05
            r14 = 1
            if (r0 <= r4) goto L_0x007d
            r14 = 0
        L_0x007d:
            r12 = r10
            r9 = r2
            goto L_0x0074
        L_0x0080:
            if (r9 != 0) goto L_0x0074
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            if (r15 == 0) goto L_0x0096
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            if (r13 != 0) goto L_0x0074
            int r0 = r2.A05
            if (r0 > r4) goto L_0x0074
            r11 = r10
            r15 = r2
            r13 = 1
            goto L_0x0074
        L_0x0096:
            int r0 = r2.A05
            r13 = 1
            if (r0 <= r4) goto L_0x009c
            r13 = 0
        L_0x009c:
            r11 = r10
            r15 = r2
            goto L_0x0074
        L_0x009f:
            if (r9 != 0) goto L_0x0100
            r9 = r15
            if (r15 != 0) goto L_0x0100
            r1 = 1
        L_0x00a5:
            X.0uW r0 = r6.A01
            int r0 = r0.B6a()
            if (r0 != 0) goto L_0x00af
            r6.A04 = r4
        L_0x00af:
            if (r1 == 0) goto L_0x0105
            int r0 = r5.A03
            int r1 = r0 + 1
            int r0 = r5.A01
            if (r1 < r0) goto L_0x00bc
            r5.A08()
        L_0x00bc:
            X.0Fq r0 = X.C02300Fq.SLACK
            X.0Qh r7 = r5.A05(r0)
            int r0 = r5.A06
            int r1 = r0 + 1
            r5.A06 = r1
            int r0 = r5.A03
            int r0 = r0 + 1
            r5.A03 = r0
            r7.A02 = r1
            X.0M1 r0 = r5.A0D
            X.0Qh[] r0 = r0.A03
            r0[r1] = r7
            r6.A02 = r7
            r5.A0B(r6)
            X.0rl r8 = r5.A08
            X.0cp r8 = (X.C07790cp) r8
            r0 = 0
            r8.A02 = r0
            X.0uW r0 = r8.A01
            r0.clear()
            r3 = 0
        L_0x00e8:
            X.0uW r1 = r6.A01
            int r0 = r1.B6a()
            if (r3 >= r0) goto L_0x0165
            X.0Qh r2 = r1.BEC(r3)
            float r1 = r1.BED(r3)
            X.0uW r0 = r8.A01
            r0.AwI(r2, r1, r4)
            int r3 = r3 + 1
            goto L_0x00e8
        L_0x0100:
            r6.A04(r9)
            r1 = 0
            goto L_0x00a5
        L_0x0105:
            r4 = 0
            goto L_0x018b
        L_0x0108:
            X.0uW r8 = r6.A01
            int r7 = r8.B6a()
            r3 = 0
        L_0x010f:
            if (r3 >= r7) goto L_0x0126
            X.0Qh r2 = r8.BEC(r3)
            int r1 = r2.A01
            r0 = -1
            if (r1 != r0) goto L_0x011e
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0123
        L_0x011e:
            java.util.ArrayList r0 = r6.A03
            r0.add(r2)
        L_0x0123:
            int r3 = r3 + 1
            goto L_0x010f
        L_0x0126:
            java.util.ArrayList r9 = r6.A03
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0021
            java.util.Iterator r8 = r9.iterator()
        L_0x0132:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r7 = r8.next()
            X.0Qh r7 = (X.C04700Qh) r7
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0157
            X.0uW r3 = r6.A01
            float r2 = r3.B3n(r7)
            float r1 = r6.A00
            float r0 = r7.A00
            float r0 = r0 * r2
            float r1 = r1 + r0
            r6.A00 = r1
            r3.Bj2(r7, r4)
            r7.A03(r6)
            goto L_0x0132
        L_0x0157:
            X.0cp[] r1 = r5.A0A
            int r0 = r7.A01
            r0 = r1[r0]
            r6.A03(r0, r4)
            goto L_0x0132
        L_0x0161:
            r9.clear()
            goto L_0x0108
        L_0x0165:
            X.0rl r0 = r5.A08
            r5.A0C(r0)
            int r1 = r7.A01
            r0 = -1
            if (r1 != r0) goto L_0x018b
            X.0Qh r0 = r6.A02
            if (r0 != r7) goto L_0x017d
            r0 = 0
            X.0Qh r0 = r6.A02(r7, r0)
            if (r0 == 0) goto L_0x017d
            r6.A04(r0)
        L_0x017d:
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0186
            X.0Qh r0 = r6.A02
            r0.A04(r6)
        L_0x0186:
            int r0 = r5.A04
            int r0 = r0 - r4
            r5.A04 = r0
        L_0x018b:
            X.0Qh r0 = r6.A02
            if (r0 == 0) goto L_0x0034
            X.0Fq r1 = r0.A06
            X.0Fq r0 = X.C02300Fq.UNRESTRICTED
            if (r1 == r0) goto L_0x019b
            float r0 = r6.A00
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
        L_0x019b:
            if (r4 != 0) goto L_0x0034
        L_0x019d:
            r5.A0B(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05620Uf.A0A(X.0cp):void");
    }

    public final void A0B(C07790cp r5) {
        C14860qO r0;
        boolean z = A0F;
        C07790cp[] r3 = this.A0A;
        int i = this.A04;
        C07790cp r1 = r3[i];
        if (z) {
            if (r1 != null) {
                r0 = this.A0D.A01;
            }
            r3[i] = r5;
            C04700Qh r12 = r5.A02;
            r12.A01 = i;
            this.A04 = i + 1;
            r12.A04(r5);
        }
        if (r1 != null) {
            r0 = this.A0D.A00;
        }
        r3[i] = r5;
        C04700Qh r122 = r5.A02;
        r122.A01 = i;
        this.A04 = i + 1;
        r122.A04(r5);
        A01((C07800cq) r0, r1);
        r3[i] = r5;
        C04700Qh r1222 = r5.A02;
        r1222.A01 = i;
        this.A04 = i + 1;
        r1222.A04(r5);
    }

    public void A0D(C04700Qh r4, int i) {
        C07790cp r2;
        C17070uW r1;
        float f;
        int i2 = r4.A01;
        if (i2 == -1) {
            r4.A01((float) i);
            return;
        }
        if (i2 != -1) {
            C07790cp r12 = this.A0A[i2];
            if (!r12.A04) {
                if (r12.A01.B6a() == 0) {
                    r12.A04 = true;
                } else {
                    r2 = A02();
                    if (i < 0) {
                        r2.A00 = (float) (-i);
                        r1 = r2.A01;
                        f = 1.0f;
                    } else {
                        r2.A00 = (float) i;
                        r1 = r2.A01;
                        f = -1.0f;
                    }
                    r1.Bhm(r4, f);
                }
            }
            r12.A00 = (float) i;
            return;
        }
        r2 = A02();
        r2.A02 = r4;
        float f2 = (float) i;
        r4.A00 = f2;
        r2.A00 = f2;
        r2.A04 = true;
        A0A(r2);
    }

    public void A0E(C04700Qh r7, C04700Qh r8, int i, int i2) {
        if (i2 == 8 && r8.A08 && r7.A01 == -1) {
            r7.A01(r8.A00 + ((float) i));
            return;
        }
        C07790cp A022 = A02();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            A022.A00 = (float) i;
        }
        C17070uW r0 = A022.A01;
        if (!z) {
            r0.Bhm(r7, -1.0f);
            C07790cp.A00(A022, r8, 1.0f);
        } else {
            r0.Bhm(r7, 1.0f);
            C07790cp.A00(A022, r8, -1.0f);
        }
        if (i2 != 8) {
            A022.A01.Bhm(A04(i2), 1.0f);
            A022.A01.Bhm(A04(i2), -1.0f);
        }
        A0A(A022);
    }

    public C05620Uf() {
        C15680rl r0;
        this.A06 = 0;
        this.A00 = 32;
        this.A01 = 32;
        this.A0A = null;
        this.A09 = false;
        this.A0C = new boolean[32];
        this.A03 = 1;
        this.A04 = 0;
        this.A02 = 32;
        this.A0B = new C04700Qh[A0E];
        this.A05 = 0;
        this.A0A = new C07790cp[32];
        A09();
        AnonymousClass0M1 r1 = new AnonymousClass0M1();
        this.A0D = r1;
        this.A07 = new AnonymousClass05I(r1);
        if (A0F) {
            r0 = new AnonymousClass05H(r1, this);
        } else {
            r0 = new C07790cp(r1);
        }
        this.A08 = r0;
    }

    public void A0F(C04700Qh r5, C04700Qh r6, int i, int i2) {
        C07790cp A022 = A02();
        C04700Qh A032 = A03();
        A032.A04 = 0;
        A022.A05(r5, r6, A032, i);
        if (i2 != 8) {
            int B3n = (int) (A022.A01.B3n(A032) * -1.0f);
            A022.A01.Bhm(A04(i2), (float) B3n);
        }
        A0A(A022);
    }

    public void A0G(C04700Qh r5, C04700Qh r6, int i, int i2) {
        C07790cp A022 = A02();
        C04700Qh A032 = A03();
        A032.A04 = 0;
        A022.A06(r5, r6, A032, i);
        if (i2 != 8) {
            int B3n = (int) (A022.A01.B3n(A032) * -1.0f);
            A022.A01.Bhm(A04(i2), (float) B3n);
        }
        A0A(A022);
    }

    public void A0H(C04700Qh r7, C04700Qh r8, C04700Qh r9, C04700Qh r10, float f, int i, int i2, int i3) {
        float f2;
        int i4;
        C07790cp A022 = A02();
        if (r8 == r9) {
            C07790cp.A00(A022, r7, 1.0f);
            C07790cp.A00(A022, r10, 1.0f);
            A022.A01.Bhm(r8, -2.0f);
        } else {
            if (f == 0.5f) {
                C07790cp.A01(A022, r7, r8, 1.0f, -1.0f);
                C07790cp.A01(A022, r9, r10, -1.0f, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                }
            } else {
                if (f <= 0.0f) {
                    C07790cp.A01(A022, r7, r8, -1.0f, 1.0f);
                    f2 = (float) i;
                } else if (f >= 1.0f) {
                    C07790cp.A01(A022, r10, r9, -1.0f, 1.0f);
                    i4 = -i2;
                } else {
                    float f3 = 1.0f - f;
                    A022.A01.Bhm(r7, f3 * 1.0f);
                    A022.A01.Bhm(r8, f3 * -1.0f);
                    A022.A01.Bhm(r9, -1.0f * f);
                    A022.A01.Bhm(r10, 1.0f * f);
                    if (i > 0 || i2 > 0) {
                        f2 = (((float) (-i)) * f3) + (((float) i2) * f);
                    }
                }
                A022.A00 = f2;
            }
            f2 = (float) i4;
            A022.A00 = f2;
        }
        if (i3 != 8) {
            A022.A01.Bhm(A04(i3), 1.0f);
            A022.A01.Bhm(A04(i3), -1.0f);
        }
        A0A(A022);
    }
}
