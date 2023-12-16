package X;

/* renamed from: X.05V  reason: invalid class name */
public class AnonymousClass05V extends C07830ct {
    public C07820cs A00;
    public AnonymousClass05R A01 = null;

    public void A0C() {
        this.A07 = null;
        this.A05.A01();
        this.A04.A01();
        this.A00.A01();
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
        C07820cs r03 = this.A00;
        r03.A01();
        r03.A0B = false;
        this.A06.A0B = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r4 = r12.A03;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r12 = this;
            X.0R7 r2 = r12.A03
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.05R r1 = r12.A06
            int r0 = r2.A04()
            r1.A02(r0)
        L_0x000f:
            X.05R r3 = r12.A06
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x006a
            X.0R7 r6 = r12.A03
            X.0Fr[] r1 = r6.A0o
            r0 = 1
            r2 = r1[r0]
            r12.A02 = r2
            boolean r0 = r6.A0h
            if (r0 == 0) goto L_0x0029
            X.05Q r0 = new X.05Q
            r0.<init>(r12)
            r12.A01 = r0
        L_0x0029:
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r2 == r0) goto L_0x00ac
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT
            if (r2 != r0) goto L_0x00a1
            X.0R7 r5 = r6.A0Z
            if (r5 == 0) goto L_0x00a1
            X.0Fr[] r1 = r5.A0o
            r0 = 1
            r1 = r1[r0]
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r1 != r0) goto L_0x00a1
            int r4 = r5.A04()
            X.0Qs r0 = r6.A0Y
            int r2 = r0.A00()
            int r4 = r4 - r2
            X.0Qs r0 = r6.A0S
            int r0 = r0.A00()
            int r4 = r4 - r0
            X.0cs r1 = r12.A05
            X.05V r0 = r5.A0d
            X.0cs r0 = r0.A05
            X.C07830ct.A05(r1, r0, r2)
            X.0cs r2 = r12.A04
            X.05V r0 = r5.A0d
            X.0cs r1 = r0.A04
            X.0R7 r0 = r12.A03
            X.0Qs r0 = r0.A0S
            X.C07830ct.A04(r0, r2, r1)
            r3.A02(r4)
        L_0x0069:
            return
        L_0x006a:
            X.0Fr r1 = r12.A02
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT
            if (r1 != r0) goto L_0x00ac
            X.0R7 r4 = r12.A03
            X.0R7 r5 = r4.A0Z
            if (r5 == 0) goto L_0x00ac
            X.0Fr[] r1 = r5.A0o
            r0 = 1
            r1 = r1[r0]
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r1 != r0) goto L_0x00ac
            X.0cs r2 = r12.A05
            X.05V r0 = r5.A0d
            X.0cs r1 = r0.A05
            X.0Qs r0 = r4.A0Y
            int r0 = r0.A00()
            X.C07830ct.A05(r2, r1, r0)
            X.0cs r4 = r12.A04
            X.05V r0 = r5.A0d
            X.0cs r2 = r0.A04
            X.0R7 r0 = r12.A03
            X.0Qs r0 = r0.A0S
            int r0 = r0.A00()
            int r0 = -r0
        L_0x009d:
            X.C07830ct.A05(r4, r2, r0)
            return
        L_0x00a1:
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r2 != r0) goto L_0x00ac
            int r0 = r6.A04()
            r3.A02(r0)
        L_0x00ac:
            boolean r0 = r3.A0B
            r4 = 0
            r11 = 4
            r6 = 2
            r2 = 1
            r5 = 3
            if (r0 == 0) goto L_0x0186
            X.0R7 r7 = r12.A03
            boolean r0 = r7.A0i
            if (r0 == 0) goto L_0x02b7
            X.0Qs[] r8 = r7.A0n
            r6 = r8[r6]
            X.0Qs r0 = r6.A03
            if (r0 == 0) goto L_0x0123
            r4 = r8[r5]
            X.0Qs r0 = r4.A03
            if (r0 == 0) goto L_0x0116
            boolean r0 = r7.A0M()
            if (r0 == 0) goto L_0x00ed
            X.0cs r1 = r12.A05
            int r0 = r6.A00()
            r1.A00 = r0
            X.0cs r1 = r12.A04
            int r0 = r4.A00()
            int r0 = -r0
            r1.A00 = r0
        L_0x00e0:
            X.0R7 r1 = r12.A03
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x0069
            X.0cs r4 = r12.A00
            X.0cs r2 = r12.A05
            int r0 = r1.A07
            goto L_0x009d
        L_0x00ed:
            X.0cs r3 = X.C07830ct.A02(r6)
            if (r3 == 0) goto L_0x00fc
            X.0cs r1 = r12.A05
            int r0 = r6.A00()
            X.C07830ct.A05(r1, r3, r0)
        L_0x00fc:
            X.0R7 r0 = r12.A03
            X.0Qs[] r0 = r0.A0n
            r3 = r0[r5]
            X.0cs r1 = X.C07830ct.A02(r3)
            if (r1 == 0) goto L_0x010d
            X.0cs r0 = r12.A04
            X.C07830ct.A04(r3, r0, r1)
        L_0x010d:
            X.0cs r0 = r12.A05
            r0.A09 = r2
            X.0cs r0 = r12.A04
            r0.A09 = r2
            goto L_0x00e0
        L_0x0116:
            X.0cs r1 = X.C07830ct.A02(r6)
            if (r1 == 0) goto L_0x0069
            X.0cs r4 = r12.A05
            int r0 = r6.A00()
            goto L_0x017e
        L_0x0123:
            r1 = r8[r5]
            X.0Qs r0 = r1.A03
            if (r0 == 0) goto L_0x013d
            X.0cs r0 = X.C07830ct.A02(r1)
            if (r0 == 0) goto L_0x00e0
            X.0cs r4 = r12.A04
            X.C07830ct.A04(r1, r4, r0)
            X.0cs r1 = r12.A05
            int r0 = r3.A02
            int r0 = -r0
        L_0x0139:
            X.C07830ct.A05(r1, r4, r0)
            goto L_0x00e0
        L_0x013d:
            r1 = r8[r11]
            X.0Qs r0 = r1.A03
            if (r0 == 0) goto L_0x015e
            X.0cs r0 = X.C07830ct.A02(r1)
            if (r0 == 0) goto L_0x0069
            X.0cs r1 = r12.A00
            X.C07830ct.A05(r1, r0, r4)
            X.0cs r2 = r12.A05
            X.0R7 r0 = r12.A03
            int r0 = r0.A07
            int r0 = -r0
            X.C07830ct.A05(r2, r1, r0)
            X.0cs r4 = r12.A04
            int r0 = r3.A02
            goto L_0x009d
        L_0x015e:
            boolean r0 = r7 instanceof X.C15690rm
            if (r0 != 0) goto L_0x0069
            X.0R7 r0 = r7.A0Z
            if (r0 == 0) goto L_0x0069
            X.0G0 r0 = X.AnonymousClass0G0.CENTER
            X.0Qs r0 = r7.A08(r0)
            X.0Qs r0 = r0.A03
            if (r0 != 0) goto L_0x0069
            X.0R7 r2 = r12.A03
            X.0R7 r0 = r2.A0Z
            X.05V r0 = r0.A0d
            X.0cs r1 = r0.A05
            X.0cs r4 = r12.A05
            int r0 = r2.A07()
        L_0x017e:
            X.C07830ct.A05(r4, r1, r0)
            X.0cs r1 = r12.A04
            int r0 = r3.A02
            goto L_0x0139
        L_0x0186:
            X.0Fr r1 = r12.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x02b7
            X.0R7 r1 = r12.A03
            int r0 = r1.A0C
            if (r0 == r6) goto L_0x02af
            if (r0 != r5) goto L_0x01b8
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x01b8
            int r0 = r1.A0D
            if (r0 == r5) goto L_0x01b8
            X.05W r0 = r1.A0c
        L_0x01a0:
            X.05R r1 = r0.A06
            java.util.List r0 = r3.A08
            r0.add(r1)
            X.C07820cs.A00(r1, r3)
            r3.A09 = r2
            java.util.List r1 = r3.A07
            X.0cs r0 = r12.A05
            r1.add(r0)
            X.0cs r0 = r12.A04
            r1.add(r0)
        L_0x01b8:
            X.0R7 r7 = r12.A03
            X.0Qs[] r10 = r7.A0n
            r9 = r10[r6]
            X.0Qs r1 = r9.A03
            if (r1 == 0) goto L_0x021a
            r6 = r10[r5]
            X.0Qs r0 = r6.A03
            if (r0 == 0) goto L_0x021a
            boolean r0 = r7.A0M()
            if (r0 == 0) goto L_0x01f9
            X.0cs r1 = r12.A05
            int r0 = r9.A00()
            r1.A00 = r0
            X.0cs r1 = r12.A04
            int r0 = r6.A00()
            int r0 = -r0
            r1.A00 = r0
        L_0x01df:
            X.0R7 r0 = r12.A03
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x01ee
            X.0cs r1 = r12.A00
            X.0cs r4 = r12.A05
            X.05R r0 = r12.A01
        L_0x01eb:
            r12.A0E(r1, r4, r0, r2)
        L_0x01ee:
            java.util.List r0 = r3.A08
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0069
            r3.A0A = r2
            return
        L_0x01f9:
            X.0cs r0 = X.C07830ct.A02(r9)
            X.0cs r1 = X.C07830ct.A02(r6)
            X.C07820cs.A00(r0, r12)
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x020b
            r12.BrU(r12)
        L_0x020b:
            X.C07820cs.A00(r1, r12)
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0215
            r12.BrU(r12)
        L_0x0215:
            X.0FM r0 = X.AnonymousClass0FM.CENTER
            r12.A08 = r0
            goto L_0x01df
        L_0x021a:
            r8 = 0
            if (r1 == 0) goto L_0x0265
            X.0cs r1 = X.C07830ct.A02(r9)
            if (r1 == 0) goto L_0x01ee
            X.0cs r4 = r12.A05
            int r0 = r9.A00()
        L_0x0229:
            X.C07830ct.A05(r4, r1, r0)
            X.0cs r0 = r12.A04
            r12.A0E(r0, r4, r3, r2)
            X.0R7 r0 = r12.A03
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x023e
            X.0cs r1 = r12.A00
            X.05R r0 = r12.A01
            r12.A0E(r1, r4, r0, r2)
        L_0x023e:
            X.0Fr r0 = r12.A02
            X.0Fr r4 = X.C02310Fr.MATCH_CONSTRAINT
            if (r0 != r4) goto L_0x01ee
            X.0R7 r1 = r12.A03
            float r0 = r1.A01
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ee
            X.05W r1 = r1.A0c
            X.0Fr r0 = r1.A02
            if (r0 != r4) goto L_0x01ee
            X.05R r0 = r1.A06
            X.C07820cs.A00(r0, r3)
            java.util.List r1 = r3.A08
            X.0R7 r0 = r12.A03
            X.05W r0 = r0.A0c
            X.05R r0 = r0.A06
            r1.add(r0)
            r3.A03 = r12
            goto L_0x01ee
        L_0x0265:
            r6 = r10[r5]
            X.0Qs r0 = r6.A03
            r5 = -1
            if (r0 == 0) goto L_0x027e
            X.0cs r0 = X.C07830ct.A02(r6)
            if (r0 == 0) goto L_0x01ee
            X.0cs r1 = r12.A04
            X.C07830ct.A04(r6, r1, r0)
            X.0cs r0 = r12.A05
            r12.A0E(r0, r1, r3, r5)
            goto L_0x01df
        L_0x027e:
            r1 = r10[r11]
            X.0Qs r0 = r1.A03
            if (r0 == 0) goto L_0x029b
            X.0cs r0 = X.C07830ct.A02(r1)
            if (r0 == 0) goto L_0x01ee
            X.0cs r1 = r12.A00
            X.C07830ct.A05(r1, r0, r4)
            X.0cs r4 = r12.A05
            X.05R r0 = r12.A01
            r12.A0E(r4, r1, r0, r5)
            X.0cs r1 = r12.A04
            r0 = r3
            goto L_0x01eb
        L_0x029b:
            boolean r0 = r7 instanceof X.C15690rm
            if (r0 != 0) goto L_0x01ee
            X.0R7 r0 = r7.A0Z
            if (r0 == 0) goto L_0x01ee
            X.05V r0 = r0.A0d
            X.0cs r1 = r0.A05
            X.0cs r4 = r12.A05
            int r0 = r7.A07()
            goto L_0x0229
        L_0x02af:
            X.0R7 r0 = r1.A0Z
            if (r0 == 0) goto L_0x01b8
            X.05V r0 = r0.A0d
            goto L_0x01a0
        L_0x02b7:
            X.C07820cs.A00(r3, r12)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x01b8
            r12.BrU(r12)
            goto L_0x01b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05V.A0A():void");
    }

    public void A0B() {
        C07820cs r2 = this.A05;
        if (r2.A0B) {
            this.A03.A0Q = r2.A02;
        }
    }

    public boolean A0F() {
        if (this.A02 != C02310Fr.MATCH_CONSTRAINT || this.A03.A0C == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009d, code lost:
        if (r1 == r0) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrU(X.C15710ro r13) {
        /*
            r12 = this;
            X.0FM r0 = r12.A08
            int r0 = r0.ordinal()
            r7 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L_0x0019
            if (r0 == r2) goto L_0x0019
            if (r0 != r7) goto L_0x0019
            X.0R7 r0 = r12.A03
            X.0Qs r1 = r0.A0Y
            X.0Qs r0 = r0.A0S
            r12.A0D(r1, r0, r3)
        L_0x0018:
            return
        L_0x0019:
            X.05R r5 = r12.A06
            boolean r0 = r5.A0A
            r11 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            if (r0 == 0) goto L_0x004e
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x004e
            X.0Fr r1 = r12.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x004e
            X.0R7 r6 = r12.A03
            int r0 = r6.A0C
            if (r0 == r2) goto L_0x006e
            if (r0 != r7) goto L_0x004e
            X.05W r0 = r6.A0c
            X.05R r2 = r0.A06
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x004e
            int r1 = r6.A08
            r0 = -1
            if (r1 == r0) goto L_0x0067
            if (r1 != 0) goto L_0x0067
            int r0 = r2.A02
            float r1 = (float) r0
            float r0 = r6.A01
            float r1 = r1 * r0
        L_0x0049:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x004b:
            r5.A02(r0)
        L_0x004e:
            X.0cs r7 = r12.A05
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0018
            X.0cs r6 = r12.A04
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0018
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0083
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0083
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0083
            return
        L_0x0067:
            int r0 = r2.A02
            float r1 = (float) r0
            float r0 = r6.A01
            float r1 = r1 / r0
            goto L_0x0049
        L_0x006e:
            X.0R7 r0 = r6.A0Z
            if (r0 == 0) goto L_0x004e
            X.05V r0 = r0.A0d
            X.05R r2 = r0.A06
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x004e
            float r1 = r6.A03
            int r0 = r2.A02
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            goto L_0x004b
        L_0x0083:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x00d1
            X.0Fr r1 = r12.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x009d
            X.0R7 r1 = r12.A03
            int r0 = r1.A0D
            if (r0 != 0) goto L_0x009f
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x009f
            X.C07830ct.A06(r7, r6, r5)
            return
        L_0x009d:
            if (r1 != r0) goto L_0x00d1
        L_0x009f:
            int r0 = r12.A00
            if (r0 != r3) goto L_0x00d1
            java.util.List r2 = r7.A08
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00d1
            java.util.List r1 = r6.A08
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00d1
            java.lang.Object r0 = r2.get(r4)
            X.0cs r0 = (X.C07820cs) r0
            java.lang.Object r1 = r1.get(r4)
            X.0cs r1 = (X.C07820cs) r1
            int r2 = r0.A02
            int r0 = r7.A00
            int r2 = r2 + r0
            int r1 = r1.A02
            int r0 = r6.A00
            int r1 = r1 + r0
            int r1 = r1 - r2
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x011d
            r5.A02(r1)
        L_0x00d1:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0018
            java.util.List r2 = r7.A08
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0018
            java.util.List r1 = r6.A08
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0018
            java.lang.Object r10 = r2.get(r4)
            X.0cs r10 = (X.C07820cs) r10
            java.lang.Object r9 = r1.get(r4)
            X.0cs r9 = (X.C07820cs) r9
            int r8 = r10.A02
            int r0 = r7.A00
            int r4 = r8 + r0
            int r1 = r9.A02
            int r0 = r6.A00
            int r3 = r1 + r0
            X.0R7 r0 = r12.A03
            float r2 = r0.A06
            if (r10 != r9) goto L_0x0107
            r4 = r8
            r3 = r1
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x0107:
            int r3 = r3 - r4
            int r0 = r5.A02
            int r3 = r3 - r0
            float r1 = (float) r4
            float r1 = r1 + r11
            float r0 = (float) r3
            float r0 = r0 * r2
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.A02(r0)
            int r1 = r7.A02
            int r0 = r5.A02
            int r1 = r1 + r0
            r6.A02(r1)
            return
        L_0x011d:
            r5.A02(r0)
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05V.BrU(X.0ro):void");
    }

    public AnonymousClass05V(AnonymousClass0R7 r4) {
        super(r4);
        C07820cs r2 = new C07820cs(this);
        this.A00 = r2;
        this.A05.A04 = AnonymousClass0G1.TOP;
        this.A04.A04 = AnonymousClass0G1.BOTTOM;
        r2.A04 = AnonymousClass0G1.BASELINE;
        this.A01 = 1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerticalRun ");
        return AnonymousClass000.A0X(this.A03.A0f, A0o);
    }
}
