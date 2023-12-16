package X;

/* renamed from: X.05W  reason: invalid class name */
public class AnonymousClass05W extends C07830ct {
    public static int[] A00 = new int[2];

    public static int A00(C07820cs r2) {
        return ((C07820cs) r2.A08.get(0)).A02;
    }

    public static final void A01(int[] iArr, float f, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i2 - i;
        int i9 = i4 - i3;
        if (i5 == -1) {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            i7 = (int) ((((float) i8) / f) + 0.5f);
            if (i6 > i8) {
                if (i7 > i9) {
                    return;
                }
            }
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        } else if (i5 != 0) {
            i7 = (int) ((((float) i8) * f) + 0.5f);
        } else {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        }
        iArr[0] = i8;
        iArr[1] = i7;
    }

    public void A0C() {
        this.A07 = null;
        this.A05.A01();
        this.A04.A01();
        this.A06.A01();
        this.A09 = false;
    }

    public void A0G() {
        this.A09 = false;
        C07820cs r0 = this.A05;
        r0.A01();
        r0.A0B = false;
        C07820cs r02 = this.A04;
        r02.A01();
        r02.A0B = false;
        this.A06.A0B = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r5 = r7.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r7 = this;
            X.0R7 r2 = r7.A03
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.05R r1 = r7.A06
            int r0 = r2.A05()
            r1.A02(r0)
        L_0x000f:
            X.05R r3 = r7.A06
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0066
            X.0R7 r6 = r7.A03
            X.0Fr[] r1 = r6.A0o
            r0 = 0
            r4 = r1[r0]
            r7.A02 = r4
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r4 == r0) goto L_0x00aa
            X.0Fr r2 = X.C02310Fr.MATCH_PARENT
            if (r4 != r2) goto L_0x009f
            X.0R7 r5 = r6.A0Z
            if (r5 == 0) goto L_0x0033
            X.0Fr[] r1 = r5.A0o
            r0 = 0
            r1 = r1[r0]
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r1 == r0) goto L_0x003a
        L_0x0033:
            X.0Fr[] r1 = r5.A0o
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x009f
        L_0x003a:
            int r4 = r5.A05()
            X.0Qs r0 = r6.A0W
            int r2 = r0.A00()
            int r4 = r4 - r2
            X.0Qs r0 = r6.A0X
            int r0 = r0.A00()
            int r4 = r4 - r0
            X.0cs r1 = r7.A05
            X.05W r0 = r5.A0c
            X.0cs r0 = r0.A05
            X.C07830ct.A05(r1, r0, r2)
            X.0cs r2 = r7.A04
            X.05W r0 = r5.A0c
            X.0cs r1 = r0.A04
            X.0R7 r0 = r7.A03
            X.0Qs r0 = r0.A0X
            X.C07830ct.A04(r0, r2, r1)
            r3.A02(r4)
        L_0x0065:
            return
        L_0x0066:
            X.0Fr r0 = r7.A02
            X.0Fr r2 = X.C02310Fr.MATCH_PARENT
            if (r0 != r2) goto L_0x00aa
            X.0R7 r5 = r7.A03
            X.0R7 r4 = r5.A0Z
            if (r4 == 0) goto L_0x007b
            X.0Fr[] r1 = r4.A0o
            r0 = 0
            r1 = r1[r0]
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r1 == r0) goto L_0x0082
        L_0x007b:
            X.0Fr[] r1 = r4.A0o
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x00aa
        L_0x0082:
            X.0cs r2 = r7.A05
            X.05W r0 = r4.A0c
            X.0cs r1 = r0.A05
            X.0Qs r0 = r5.A0W
            int r0 = r0.A00()
            X.C07830ct.A05(r2, r1, r0)
            X.0cs r2 = r7.A04
            X.05W r0 = r4.A0c
            X.0cs r1 = r0.A04
            X.0R7 r0 = r7.A03
            X.0Qs r0 = r0.A0X
            X.C07830ct.A04(r0, r2, r1)
            return
        L_0x009f:
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r4 != r0) goto L_0x00aa
            int r0 = r6.A05()
            r3.A02(r0)
        L_0x00aa:
            boolean r0 = r3.A0B
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0142
            X.0R7 r5 = r7.A03
            boolean r0 = r5.A0i
            if (r0 == 0) goto L_0x0142
            X.0Qs[] r1 = r5.A0n
            r6 = r1[r6]
            X.0Qs r0 = r6.A03
            if (r0 == 0) goto L_0x0100
            r2 = r1[r4]
            X.0Qs r0 = r2.A03
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r5.A0L()
            if (r0 != 0) goto L_0x028a
            X.0cs r2 = X.C07830ct.A02(r6)
            if (r2 == 0) goto L_0x00d9
            X.0cs r1 = r7.A05
            int r0 = r6.A00()
            X.C07830ct.A05(r1, r2, r0)
        L_0x00d9:
            X.0R7 r0 = r7.A03
            X.0Qs[] r0 = r0.A0n
            r2 = r0[r4]
            X.0cs r1 = X.C07830ct.A02(r2)
            if (r1 == 0) goto L_0x00ea
            X.0cs r0 = r7.A04
            X.C07830ct.A04(r2, r0, r1)
        L_0x00ea:
            X.0cs r0 = r7.A05
            r0.A09 = r4
            X.0cs r0 = r7.A04
            r0.A09 = r4
            return
        L_0x00f3:
            X.0cs r1 = X.C07830ct.A02(r6)
            if (r1 == 0) goto L_0x0065
            X.0cs r4 = r7.A05
            int r0 = r6.A00()
            goto L_0x013a
        L_0x0100:
            r1 = r1[r4]
            X.0Qs r0 = r1.A03
            if (r0 == 0) goto L_0x011a
            X.0cs r0 = X.C07830ct.A02(r1)
            if (r0 == 0) goto L_0x0065
            X.0cs r4 = r7.A04
            X.C07830ct.A04(r1, r4, r0)
            X.0cs r1 = r7.A05
            int r0 = r3.A02
            int r0 = -r0
        L_0x0116:
            X.C07830ct.A05(r1, r4, r0)
            return
        L_0x011a:
            boolean r0 = r5 instanceof X.C15690rm
            if (r0 != 0) goto L_0x0065
            X.0R7 r0 = r5.A0Z
            if (r0 == 0) goto L_0x0065
            X.0G0 r0 = X.AnonymousClass0G0.CENTER
            X.0Qs r0 = r5.A08(r0)
            X.0Qs r0 = r0.A03
            if (r0 != 0) goto L_0x0065
            X.0R7 r2 = r7.A03
            X.0R7 r0 = r2.A0Z
            X.05W r0 = r0.A0c
            X.0cs r1 = r0.A05
            X.0cs r4 = r7.A05
            int r0 = r2.A06()
        L_0x013a:
            X.C07830ct.A05(r4, r1, r0)
            X.0cs r1 = r7.A04
            int r0 = r3.A02
            goto L_0x0116
        L_0x0142:
            X.0Fr r1 = r7.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x01ab
            X.0R7 r5 = r7.A03
            int r2 = r5.A0D
            r0 = 2
            if (r2 == r0) goto L_0x022d
            r1 = 3
            if (r2 != r1) goto L_0x01ab
            int r0 = r5.A0C
            if (r0 != r1) goto L_0x01f8
            X.0cs r0 = r7.A05
            r0.A03 = r7
            X.0cs r0 = r7.A04
            r0.A03 = r7
            X.05V r1 = r5.A0d
            X.0cs r0 = r1.A05
            r0.A03 = r7
            X.0cs r0 = r1.A04
            r0.A03 = r7
            r3.A03 = r7
            boolean r0 = r5.A0M()
            if (r0 == 0) goto L_0x01e2
            java.util.List r2 = r3.A08
            X.05R r0 = r1.A06
            r2.add(r0)
            X.0R7 r0 = r7.A03
            X.05V r0 = r0.A0d
            X.05R r0 = r0.A06
            X.C07820cs.A00(r0, r3)
            X.0R7 r0 = r7.A03
            X.05V r1 = r0.A0d
            X.05R r0 = r1.A06
            r0.A03 = r7
            X.0cs r0 = r1.A05
            r2.add(r0)
            X.0R7 r0 = r7.A03
            X.05V r0 = r0.A0d
            X.0cs r0 = r0.A04
            r2.add(r0)
            X.0R7 r0 = r7.A03
            X.05V r0 = r0.A0d
            X.0cs r0 = r0.A05
            X.C07820cs.A00(r0, r3)
            X.0R7 r0 = r7.A03
            X.05V r0 = r0.A0d
            X.0cs r0 = r0.A04
            java.util.List r1 = r0.A07
        L_0x01a7:
            r0 = r3
        L_0x01a8:
            r1.add(r0)
        L_0x01ab:
            X.0R7 r5 = r7.A03
            X.0Qs[] r1 = r5.A0n
            r6 = r1[r6]
            X.0Qs r0 = r6.A03
            if (r0 == 0) goto L_0x0257
            r2 = r1[r4]
            X.0Qs r0 = r2.A03
            if (r0 == 0) goto L_0x024a
            boolean r0 = r5.A0L()
            if (r0 != 0) goto L_0x028a
            X.0cs r0 = X.C07830ct.A02(r6)
            X.0cs r1 = X.C07830ct.A02(r2)
            X.C07820cs.A00(r0, r7)
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x01d3
            r7.BrU(r7)
        L_0x01d3:
            X.C07820cs.A00(r1, r7)
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x01dd
            r7.BrU(r7)
        L_0x01dd:
            X.0FM r0 = X.AnonymousClass0FM.CENTER
            r7.A08 = r0
            return
        L_0x01e2:
            boolean r0 = r5.A0L()
            X.05R r2 = r1.A06
            if (r0 == 0) goto L_0x0229
            java.util.List r0 = r2.A08
            r0.add(r3)
            java.util.List r1 = r3.A07
            X.0R7 r0 = r7.A03
            X.05V r0 = r0.A0d
            X.05R r0 = r0.A06
            goto L_0x01a8
        L_0x01f8:
            X.05V r0 = r5.A0d
            X.05R r1 = r0.A06
            java.util.List r0 = r3.A08
            r0.add(r1)
            X.C07820cs.A00(r1, r3)
            X.0R7 r0 = r7.A03
            X.05V r0 = r0.A0d
            X.0cs r0 = r0.A05
            X.C07820cs.A00(r0, r3)
            X.0R7 r0 = r7.A03
            X.05V r0 = r0.A0d
            X.0cs r0 = r0.A04
            X.C07820cs.A00(r0, r3)
            r3.A09 = r4
            java.util.List r1 = r3.A07
            X.0cs r0 = r7.A05
            r1.add(r0)
            X.0cs r2 = r7.A04
            r1.add(r2)
            java.util.List r0 = r0.A08
            r0.add(r3)
        L_0x0229:
            java.util.List r1 = r2.A08
            goto L_0x01a7
        L_0x022d:
            X.0R7 r0 = r5.A0Z
            if (r0 == 0) goto L_0x01ab
            X.05V r0 = r0.A0d
            X.05R r1 = r0.A06
            java.util.List r0 = r3.A08
            r0.add(r1)
            X.C07820cs.A00(r1, r3)
            r3.A09 = r4
            java.util.List r1 = r3.A07
            X.0cs r0 = r7.A05
            r1.add(r0)
            X.0cs r0 = r7.A04
            goto L_0x01a8
        L_0x024a:
            X.0cs r2 = X.C07830ct.A02(r6)
            if (r2 == 0) goto L_0x0065
            X.0cs r1 = r7.A05
            int r0 = r6.A00()
            goto L_0x0281
        L_0x0257:
            r1 = r1[r4]
            X.0Qs r0 = r1.A03
            if (r0 == 0) goto L_0x026f
            X.0cs r0 = X.C07830ct.A02(r1)
            if (r0 == 0) goto L_0x0065
            X.0cs r2 = r7.A04
            X.C07830ct.A04(r1, r2, r0)
            X.0cs r1 = r7.A05
            r0 = -1
            r7.A0E(r1, r2, r3, r0)
            return
        L_0x026f:
            boolean r0 = r5 instanceof X.C15690rm
            if (r0 != 0) goto L_0x0065
            X.0R7 r0 = r5.A0Z
            if (r0 == 0) goto L_0x0065
            X.05W r0 = r0.A0c
            X.0cs r2 = r0.A05
            X.0cs r1 = r7.A05
            int r0 = r5.A06()
        L_0x0281:
            X.C07830ct.A05(r1, r2, r0)
            X.0cs r0 = r7.A04
            r7.A0E(r0, r1, r3, r4)
            return
        L_0x028a:
            X.0cs r1 = r7.A05
            int r0 = r6.A00()
            r1.A00 = r0
            X.0cs r1 = r7.A04
            int r0 = r2.A00()
            int r0 = -r0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05W.A0A():void");
    }

    public void A0B() {
        C07820cs r2 = this.A05;
        if (r2.A0B) {
            this.A03.A0P = r2.A02;
        }
    }

    public boolean A0F() {
        if (this.A02 != C02310Fr.MATCH_CONSTRAINT || this.A03.A0D == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0258, code lost:
        if (r5 == r4) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0180, code lost:
        if (r10 != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d5, code lost:
        if (r11 != false) goto L_0x01d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrU(X.C15710ro r22) {
        /*
            r21 = this;
            r2 = r21
            X.0FM r0 = r2.A08
            int r0 = r0.ordinal()
            r8 = 2
            r6 = 3
            r3 = 1
            r1 = 0
            if (r0 == r3) goto L_0x001c
            if (r0 == r8) goto L_0x001c
            if (r0 != r6) goto L_0x001c
            X.0R7 r0 = r2.A03
            X.0Qs r3 = r0.A0W
            X.0Qs r0 = r0.A0X
            r2.A0D(r3, r0, r1)
        L_0x001b:
            return
        L_0x001c:
            X.05R r0 = r2.A06
            boolean r4 = r0.A0B
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x004e
            X.0Fr r5 = r2.A02
            X.0Fr r4 = X.C02310Fr.MATCH_CONSTRAINT
            if (r5 != r4) goto L_0x004e
            X.0R7 r7 = r2.A03
            int r4 = r7.A0D
            if (r4 == r8) goto L_0x0228
            if (r4 != r6) goto L_0x004e
            int r4 = r7.A0C
            r9 = -1
            if (r4 == 0) goto L_0x0072
            if (r4 == r6) goto L_0x0072
            int r4 = r7.A08
            if (r4 == r9) goto L_0x0067
            if (r4 != 0) goto L_0x0067
            X.05V r4 = r7.A0d
            X.05R r4 = r4.A06
            int r4 = r4.A02
            float r5 = (float) r4
            float r4 = r7.A01
            float r5 = r5 / r4
        L_0x0049:
            float r5 = r5 + r13
            int r4 = (int) r5
        L_0x004b:
            r0.A02(r4)
        L_0x004e:
            X.0cs r8 = r2.A05
            boolean r4 = r8.A0A
            if (r4 == 0) goto L_0x001b
            X.0cs r6 = r2.A04
            boolean r4 = r6.A0A
            if (r4 == 0) goto L_0x001b
            boolean r4 = r8.A0B
            if (r4 == 0) goto L_0x023e
            boolean r4 = r6.A0B
            if (r4 == 0) goto L_0x023e
            boolean r4 = r0.A0B
            if (r4 == 0) goto L_0x023e
            return
        L_0x0067:
            X.05V r4 = r7.A0d
            X.05R r4 = r4.A06
            int r4 = r4.A02
            float r5 = (float) r4
            float r4 = r7.A01
            float r5 = r5 * r4
            goto L_0x0049
        L_0x0072:
            X.05V r4 = r7.A0d
            X.0cs r5 = r4.A05
            X.0cs r4 = r4.A04
            X.0Qs r6 = r7.A0W
            X.0Qs r6 = r6.A03
            boolean r12 = X.AnonymousClass000.A1W(r6)
            X.0Qs r6 = r7.A0Y
            X.0Qs r6 = r6.A03
            boolean r11 = X.AnonymousClass000.A1W(r6)
            X.0Qs r6 = r7.A0X
            X.0Qs r6 = r6.A03
            boolean r10 = X.AnonymousClass000.A1W(r6)
            X.0Qs r6 = r7.A0S
            X.0Qs r6 = r6.A03
            boolean r8 = X.AnonymousClass000.A1W(r6)
            int r6 = r7.A08
            if (r12 == 0) goto L_0x01d5
            if (r11 == 0) goto L_0x0180
            if (r10 == 0) goto L_0x01d7
            if (r8 == 0) goto L_0x0182
            float r12 = r7.A01
            boolean r7 = r5.A0B
            if (r7 == 0) goto L_0x00ea
            boolean r7 = r4.A0B
            if (r7 == 0) goto L_0x00ea
            X.0cs r9 = r2.A05
            boolean r7 = r9.A0A
            if (r7 == 0) goto L_0x001b
            X.0cs r8 = r2.A04
            boolean r7 = r8.A0A
            if (r7 == 0) goto L_0x001b
            int r13 = A00(r9)
            int r7 = r9.A00
            int r13 = r13 + r7
            int r14 = A00(r8)
            int r7 = r8.A00
            int r14 = r14 - r7
            int r15 = r5.A02
            int r5 = r5.A00
            int r15 = r15 + r5
            int r5 = r4.A02
            int r4 = r4.A00
            int r5 = r5 - r4
            int[] r11 = A00
            r17 = r6
            r16 = r5
            A01(r11, r12, r13, r14, r15, r16, r17)
            r1 = r11[r1]
            r0.A02(r1)
            X.0R7 r0 = r2.A03
            X.05V r0 = r0.A0d
            X.05R r1 = r0.A06
            r0 = r11[r3]
            r1.A02(r0)
            return
        L_0x00ea:
            X.0cs r8 = r2.A05
            boolean r7 = r8.A0B
            if (r7 == 0) goto L_0x0134
            X.0cs r11 = r2.A04
            boolean r7 = r11.A0B
            if (r7 == 0) goto L_0x0134
            boolean r7 = r5.A0A
            if (r7 == 0) goto L_0x001b
            boolean r7 = r4.A0A
            if (r7 == 0) goto L_0x001b
            int r10 = r8.A02
            int r7 = r8.A00
            int r10 = r10 + r7
            int r9 = r11.A02
            int r7 = r11.A00
            int r9 = r9 - r7
            int r18 = A00(r5)
            int r7 = r5.A00
            int r18 = r18 + r7
            int r19 = A00(r4)
            int r7 = r4.A00
            int r19 = r19 - r7
            int[] r14 = A00
            r15 = r12
            r16 = r10
            r17 = r9
            r20 = r6
            A01(r14, r15, r16, r17, r18, r19, r20)
            r7 = r14[r1]
            r0.A02(r7)
            X.0R7 r7 = r2.A03
            X.05V r7 = r7.A0d
            X.05R r9 = r7.A06
            r7 = r14[r3]
            r9.A02(r7)
        L_0x0134:
            boolean r7 = r8.A0A
            if (r7 == 0) goto L_0x001b
            X.0cs r9 = r2.A04
            boolean r7 = r9.A0A
            if (r7 == 0) goto L_0x001b
            boolean r7 = r5.A0A
            if (r7 == 0) goto L_0x001b
            boolean r7 = r4.A0A
            if (r7 == 0) goto L_0x001b
            int r16 = A00(r8)
            int r7 = r8.A00
            int r16 = r16 + r7
            int r17 = A00(r9)
            int r7 = r9.A00
            int r17 = r17 - r7
            int r18 = A00(r5)
            int r5 = r5.A00
            int r18 = r18 + r5
            int r19 = A00(r4)
            int r4 = r4.A00
            int r19 = r19 - r4
            int[] r14 = A00
            r15 = r12
            r20 = r6
            A01(r14, r15, r16, r17, r18, r19, r20)
            r4 = r14[r1]
            r0.A02(r4)
            X.0R7 r4 = r2.A03
            X.05V r4 = r4.A0d
            X.05R r5 = r4.A06
            r4 = r14[r3]
            r5.A02(r4)
            goto L_0x004e
        L_0x0180:
            if (r10 == 0) goto L_0x004e
        L_0x0182:
            X.0cs r5 = r2.A05
            boolean r4 = r5.A0A
            if (r4 == 0) goto L_0x001b
            X.0cs r10 = r2.A04
            boolean r4 = r10.A0A
            if (r4 == 0) goto L_0x001b
            float r7 = r7.A01
            int r8 = A00(r5)
            int r4 = r5.A00
            int r8 = r8 + r4
            int r5 = A00(r10)
            int r4 = r10.A00
            int r5 = r5 - r4
            if (r6 == r9) goto L_0x01c3
            if (r6 == 0) goto L_0x01c3
            int r5 = r5 - r8
            int r6 = r2.A08(r5, r1)
            float r4 = (float) r6
            float r4 = r4 / r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A08(r4, r3)
            if (r4 == r5) goto L_0x01b5
            float r4 = (float) r5
            float r4 = r4 * r7
        L_0x01b3:
            float r4 = r4 + r13
            int r6 = (int) r4
        L_0x01b5:
            r0.A02(r6)
            X.0R7 r4 = r2.A03
            X.05V r4 = r4.A0d
            X.05R r4 = r4.A06
            r4.A02(r5)
            goto L_0x004e
        L_0x01c3:
            int r5 = r5 - r8
            int r6 = r2.A08(r5, r1)
            float r4 = (float) r6
            float r4 = r4 * r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A08(r4, r3)
            if (r4 == r5) goto L_0x01b5
            float r4 = (float) r5
            float r4 = r4 / r7
            goto L_0x01b3
        L_0x01d5:
            if (r11 == 0) goto L_0x004e
        L_0x01d7:
            if (r8 == 0) goto L_0x004e
            boolean r8 = r5.A0A
            if (r8 == 0) goto L_0x001b
            boolean r8 = r4.A0A
            if (r8 == 0) goto L_0x001b
            float r7 = r7.A01
            int r8 = A00(r5)
            int r5 = r5.A00
            int r8 = r8 + r5
            int r5 = A00(r4)
            int r4 = r4.A00
            int r5 = r5 - r4
            if (r6 == r9) goto L_0x0216
            if (r6 != 0) goto L_0x0216
            int r5 = r5 - r8
            int r6 = r2.A08(r5, r3)
            float r4 = (float) r6
            float r4 = r4 * r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A08(r4, r1)
            if (r4 == r5) goto L_0x0208
            float r4 = (float) r5
            float r4 = r4 / r7
        L_0x0206:
            float r4 = r4 + r13
            int r6 = (int) r4
        L_0x0208:
            r0.A02(r5)
            X.0R7 r4 = r2.A03
            X.05V r4 = r4.A0d
            X.05R r4 = r4.A06
            r4.A02(r6)
            goto L_0x004e
        L_0x0216:
            int r5 = r5 - r8
            int r6 = r2.A08(r5, r3)
            float r4 = (float) r6
            float r4 = r4 / r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A08(r4, r1)
            if (r4 == r5) goto L_0x0208
            float r4 = (float) r5
            float r4 = r4 * r7
            goto L_0x0206
        L_0x0228:
            X.0R7 r4 = r7.A0Z
            if (r4 == 0) goto L_0x004e
            X.05W r4 = r4.A0c
            X.05R r6 = r4.A06
            boolean r4 = r6.A0B
            if (r4 == 0) goto L_0x004e
            float r5 = r7.A04
            int r4 = r6.A02
            float r4 = (float) r4
            float r4 = r4 * r5
            float r4 = r4 + r13
            int r4 = (int) r4
            goto L_0x004b
        L_0x023e:
            boolean r4 = r0.A0B
            if (r4 != 0) goto L_0x029e
            X.0Fr r5 = r2.A02
            X.0Fr r4 = X.C02310Fr.MATCH_CONSTRAINT
            if (r5 != r4) goto L_0x0258
            X.0R7 r5 = r2.A03
            int r4 = r5.A0D
            if (r4 != 0) goto L_0x025a
            boolean r4 = r5.A0L()
            if (r4 != 0) goto L_0x025a
            X.C07830ct.A06(r8, r6, r0)
            return
        L_0x0258:
            if (r5 != r4) goto L_0x029e
        L_0x025a:
            int r4 = r2.A00
            if (r4 != r3) goto L_0x029e
            java.util.List r5 = r8.A08
            int r3 = r5.size()
            if (r3 <= 0) goto L_0x029e
            java.util.List r4 = r6.A08
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x029e
            java.lang.Object r3 = r5.get(r1)
            X.0cs r3 = (X.C07820cs) r3
            java.lang.Object r4 = r4.get(r1)
            X.0cs r4 = (X.C07820cs) r4
            int r5 = r3.A02
            int r3 = r8.A00
            int r5 = r5 + r3
            int r4 = r4.A02
            int r3 = r6.A00
            int r4 = r4 + r3
            int r4 = r4 - r5
            int r3 = r0.A00
            int r5 = java.lang.Math.min(r4, r3)
            X.0R7 r3 = r2.A03
            int r4 = r3.A0F
            int r3 = r3.A0H
            int r3 = java.lang.Math.max(r3, r5)
            if (r4 <= 0) goto L_0x029b
            int r3 = java.lang.Math.min(r4, r3)
        L_0x029b:
            r0.A02(r3)
        L_0x029e:
            boolean r3 = r0.A0B
            if (r3 == 0) goto L_0x001b
            java.util.List r3 = r8.A08
            java.lang.Object r11 = r3.get(r1)
            X.0cs r11 = (X.C07820cs) r11
            java.util.List r3 = r6.A08
            java.lang.Object r10 = r3.get(r1)
            X.0cs r10 = (X.C07820cs) r10
            int r9 = r11.A02
            int r1 = r8.A00
            int r7 = r9 + r1
            int r5 = r10.A02
            int r1 = r6.A00
            int r4 = r5 + r1
            X.0R7 r1 = r2.A03
            float r3 = r1.A02
            if (r11 != r10) goto L_0x02c8
            r7 = r9
            r4 = r5
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x02c8:
            int r4 = r4 - r7
            int r1 = r0.A02
            int r4 = r4 - r1
            float r2 = (float) r7
            float r2 = r2 + r13
            float r1 = (float) r4
            float r1 = r1 * r3
            float r2 = r2 + r1
            int r1 = (int) r2
            r8.A02(r1)
            int r1 = r8.A02
            int r0 = r0.A02
            int r1 = r1 + r0
            r6.A02(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05W.BrU(X.0ro):void");
    }

    public AnonymousClass05W(AnonymousClass0R7 r3) {
        super(r3);
        this.A05.A04 = AnonymousClass0G1.LEFT;
        this.A04.A04 = AnonymousClass0G1.RIGHT;
        this.A01 = 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HorizontalRun ");
        return AnonymousClass000.A0X(this.A03.A0f, A0o);
    }
}
