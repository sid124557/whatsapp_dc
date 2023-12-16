package X;

import java.util.List;

/* renamed from: X.0ct  reason: invalid class name and case insensitive filesystem */
public abstract class C07830ct implements C15710ro {
    public int A00;
    public int A01 = 0;
    public C02310Fr A02;
    public AnonymousClass0R7 A03;
    public C07820cs A04 = new C07820cs(this);
    public C07820cs A05 = new C07820cs(this);
    public AnonymousClass05R A06 = new AnonymousClass05R(this);
    public AnonymousClass0OU A07;
    public AnonymousClass0FM A08 = AnonymousClass0FM.NONE;
    public boolean A09 = false;

    public static void A06(C07820cs r3, C07820cs r4, C07820cs r5) {
        int i = ((C07820cs) r3.A08.get(0)).A02 + r3.A00;
        int i2 = ((C07820cs) r4.A08.get(0)).A02 + r4.A00;
        r3.A02(i);
        r4.A02(i2);
        r5.A02(i2 - i);
    }

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C();

    public abstract boolean A0F();

    public abstract void BrU(C15710ro r1);

    public static final C07820cs A02(C04800Qs r3) {
        C04800Qs r0 = r3.A03;
        if (r0 == null) {
            return null;
        }
        AnonymousClass0R7 r2 = r0.A06;
        int ordinal = r0.A05.ordinal();
        if (ordinal == 1) {
            return r2.A0c.A05;
        }
        if (ordinal == 3) {
            return r2.A0c.A04;
        }
        if (ordinal == 2) {
            return r2.A0d.A05;
        }
        if (ordinal == 5) {
            return r2.A0d.A00;
        }
        if (ordinal == 4) {
            return r2.A0d.A04;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != 4) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C07820cs A03(X.C04800Qs r3, int r4) {
        /*
            X.0Qs r1 = r3.A03
            r3 = 0
            if (r1 == 0) goto L_0x001d
            X.0R7 r0 = r1.A06
            if (r4 != 0) goto L_0x001e
            X.05W r2 = r0.A0c
        L_0x000b:
            X.0G0 r0 = r1.A05
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r0 = 4
            if (r1 == r0) goto L_0x0021
        L_0x001d:
            return r3
        L_0x001e:
            X.05V r2 = r0.A0d
            goto L_0x000b
        L_0x0021:
            X.0cs r3 = r2.A04
            return r3
        L_0x0024:
            X.0cs r3 = r2.A05
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07830ct.A03(X.0Qs, int):X.0cs");
    }

    public static final void A05(C07820cs r1, C07820cs r2, int i) {
        r1.A08.add(r2);
        r1.A00 = i;
        C07820cs.A00(r2, r1);
    }

    public final int A08(int i, int i2) {
        int i3;
        int i4;
        AnonymousClass0R7 r0 = this.A03;
        if (i2 == 0) {
            i3 = r0.A0F;
            i4 = r0.A0H;
        } else {
            i3 = r0.A0E;
            i4 = r0.A0G;
        }
        int max = Math.max(i4, i);
        if (i3 > 0) {
            max = Math.min(i3, i);
        }
        if (max != i) {
            return max;
        }
        return i;
    }

    public long A09() {
        AnonymousClass05R r1 = this.A06;
        if (r1.A0B) {
            return (long) r1.A02;
        }
        return 0;
    }

    public final void A0E(C07820cs r3, C07820cs r4, AnonymousClass05R r5, int i) {
        List list = r3.A08;
        list.add(r4);
        list.add(this.A06);
        r3.A01 = i;
        r3.A05 = r5;
        C07820cs.A00(r4, r3);
        C07820cs.A00(r5, r3);
    }

    public C07830ct(AnonymousClass0R7 r2) {
        this.A03 = r2;
    }

    public static void A04(C04800Qs r0, C07820cs r1, C07820cs r2) {
        A05(r1, r2, -r0.A00());
    }

    public static void A07(C07820cs r0, Object obj, List list) {
        list.add(r0);
        r0.A08.add(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1.A00 == 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C04800Qs r16, X.C04800Qs r17, int r18) {
        /*
            r15 = this;
            X.0cs r7 = A02(r16)
            X.0cs r2 = A02(r17)
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0066
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0066
            int r6 = r7.A02
            int r0 = r16.A00()
            int r6 = r6 + r0
            int r5 = r2.A02
            int r0 = r17.A00()
            int r5 = r5 - r0
            int r9 = r5 - r6
            X.05R r4 = r15.A06
            boolean r0 = r4.A0B
            r8 = r18
            if (r0 != 0) goto L_0x0054
            X.0Fr r0 = r15.A02
            X.0Fr r13 = X.C02310Fr.MATCH_CONSTRAINT
            if (r0 != r13) goto L_0x0054
            r0 = r9
            int r1 = r15.A00
            if (r1 == 0) goto L_0x00b4
            r10 = 1
            if (r1 == r10) goto L_0x008f
            r0 = 2
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r0) goto L_0x009a
            r12 = 3
            if (r1 != r12) goto L_0x0054
            X.0R7 r11 = r15.A03
            X.05W r3 = r11.A0c
            X.0Fr r0 = r3.A02
            if (r0 != r13) goto L_0x00bf
            int r0 = r3.A00
            if (r0 != r12) goto L_0x00bf
            X.05V r1 = r11.A0d
            X.0Fr r0 = r1.A02
            if (r0 != r13) goto L_0x00bf
            int r0 = r1.A00
            if (r0 != r12) goto L_0x00bf
        L_0x0054:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0066
            int r1 = r4.A02
            if (r1 != r9) goto L_0x0067
            X.0cs r0 = r15.A05
            r0.A02(r6)
            X.0cs r1 = r15.A04
        L_0x0063:
            r1.A02(r5)
        L_0x0066:
            return
        L_0x0067:
            X.0R7 r0 = r15.A03
            if (r18 != 0) goto L_0x008c
            float r3 = r0.A02
        L_0x006d:
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r7 != r2) goto L_0x0077
            int r6 = r7.A02
            int r5 = r2.A02
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0077:
            int r5 = r5 - r6
            int r5 = r5 - r1
            X.0cs r2 = r15.A05
            float r1 = (float) r6
            float r1 = r1 + r0
            float r0 = (float) r5
            float r0 = r0 * r3
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A02(r0)
            X.0cs r1 = r15.A04
            int r5 = r2.A02
            int r0 = r4.A02
            int r5 = r5 + r0
            goto L_0x0063
        L_0x008c:
            float r3 = r0.A06
            goto L_0x006d
        L_0x008f:
            int r0 = r4.A00
            int r0 = r15.A08(r0, r8)
            int r0 = java.lang.Math.min(r0, r9)
            goto L_0x00d3
        L_0x009a:
            X.0R7 r1 = r15.A03
            X.0R7 r0 = r1.A0Z
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00bc
            X.05W r0 = r0.A0c
        L_0x00a4:
            X.05R r3 = r0.A06
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00b9
            float r1 = r1.A04
        L_0x00ae:
            int r0 = r3.A02
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00b4:
            int r0 = r15.A08(r0, r8)
            goto L_0x00d3
        L_0x00b9:
            float r1 = r1.A03
            goto L_0x00ae
        L_0x00bc:
            X.05V r0 = r0.A0d
            goto L_0x00a4
        L_0x00bf:
            if (r18 != 0) goto L_0x00c3
            X.05V r3 = r11.A0d
        L_0x00c3:
            X.05R r3 = r3.A06
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0054
            float r1 = r11.A01
            int r0 = r3.A02
            float r0 = (float) r0
            if (r8 != r10) goto L_0x00d8
            float r0 = r0 / r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00d3:
            r4.A02(r0)
            goto L_0x0054
        L_0x00d8:
            float r1 = r1 * r0
            float r1 = r1 + r14
            int r0 = (int) r1
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07830ct.A0D(X.0Qs, X.0Qs, int):void");
    }
}
