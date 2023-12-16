package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.05U  reason: invalid class name */
public class AnonymousClass05U extends C07830ct {
    public int A00;
    public ArrayList A01;

    public void A0B() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i < arrayList.size()) {
                ((C07830ct) arrayList.get(i)).A0B();
                i++;
            } else {
                return;
            }
        }
    }

    public void A0C() {
        this.A07 = null;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C07830ct) it.next()).A0C();
        }
    }

    public long A09() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C07830ct r2 = (C07830ct) arrayList.get(i);
            j = j + ((long) r2.A05.A00) + r2.A09() + ((long) r2.A04.A00);
        }
        return j;
    }

    public void A0A() {
        C07820cs A03;
        int A002;
        C04800Qs r0;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C07830ct) it.next()).A0A();
        }
        int size = arrayList.size();
        if (size >= 1) {
            AnonymousClass0R7 A003 = A00(arrayList, 0);
            AnonymousClass0R7 A004 = A00(arrayList, size - 1);
            if (this.A01 != 0) {
                C04800Qs r02 = A003.A0Y;
                C04800Qs r6 = A004.A0S;
                C07820cs A032 = C07830ct.A03(r02, 1);
                int A005 = r02.A00();
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    AnonymousClass0R7 A006 = A00(arrayList, i);
                    if (A006.A0N != 8) {
                        A005 = A006.A0Y.A00();
                        break;
                    }
                    i++;
                }
                if (A032 != null) {
                    C07830ct.A05(this.A05, A032, A005);
                }
                A03 = C07830ct.A03(r6, 1);
                A002 = r6.A00();
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    AnonymousClass0R7 A007 = A00(arrayList, size2);
                    if (A007.A0N != 8) {
                        r0 = A007.A0S;
                        break;
                    }
                }
            } else {
                C04800Qs r03 = A003.A0W;
                C04800Qs r62 = A004.A0X;
                C07820cs A033 = C07830ct.A03(r03, 0);
                int A008 = r03.A00();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    AnonymousClass0R7 A009 = A00(arrayList, i2);
                    if (A009.A0N != 8) {
                        A008 = A009.A0W.A00();
                        break;
                    }
                    i2++;
                }
                if (A033 != null) {
                    C07830ct.A05(this.A05, A033, A008);
                }
                A03 = C07830ct.A03(r62, 0);
                A002 = r62.A00();
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    AnonymousClass0R7 A0010 = A00(arrayList, size3);
                    if (A0010.A0N != 8) {
                        r0 = A0010.A0X;
                        break;
                    }
                }
            }
            A002 = r0.A00();
            if (A03 != null) {
                C07830ct.A05(this.A04, A03, -A002);
            }
            this.A05.A03 = this;
            this.A04.A03 = this;
        }
    }

    public boolean A0F() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((C07830ct) arrayList.get(i)).A0F()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0241, code lost:
        if (r13 != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02c0, code lost:
        if (r13 != false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0349, code lost:
        if (r13 != false) goto L_0x031a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrU(X.C15710ro r24) {
        /*
            r23 = this;
            r14 = r23
            X.0cs r3 = r14.A05
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0357
            X.0cs r2 = r14.A04
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0357
            X.0R7 r0 = r14.A03
            X.0R7 r1 = r0.A0Z
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1 instanceof X.AnonymousClass05P
            if (r0 == 0) goto L_0x003b
            X.05P r1 = (X.AnonymousClass05P) r1
            boolean r13 = r1.A0A
        L_0x001c:
            int r0 = r2.A02
            r19 = r0
            int r12 = r3.A02
            int r11 = r0 - r12
            java.util.ArrayList r10 = r14.A01
            int r9 = r10.size()
            r8 = 0
        L_0x002b:
            r7 = -1
            r15 = 8
            if (r8 >= r9) goto L_0x003d
            X.0R7 r0 = A00(r10, r8)
            int r0 = r0.A0N
            if (r0 != r15) goto L_0x003e
            int r8 = r8 + 1
            goto L_0x002b
        L_0x003b:
            r13 = 0
            goto L_0x001c
        L_0x003d:
            r8 = -1
        L_0x003e:
            int r6 = r9 + -1
            r1 = r6
        L_0x0041:
            if (r1 < 0) goto L_0x004f
            X.0R7 r0 = A00(r10, r1)
            int r0 = r0.A0N
            if (r0 != r15) goto L_0x004e
            int r1 = r1 + -1
            goto L_0x0041
        L_0x004e:
            r7 = r1
        L_0x004f:
            r17 = 0
        L_0x0051:
            r2 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r18 = 0
        L_0x0057:
            if (r2 >= r9) goto L_0x00d0
            java.lang.Object r1 = r10.get(r2)
            X.0ct r1 = (X.C07830ct) r1
            X.0R7 r0 = r1.A03
            int r0 = r0.A0N
            if (r0 == r15) goto L_0x00b2
            int r3 = r3 + 1
            if (r2 <= 0) goto L_0x0070
            if (r2 < r8) goto L_0x0070
            X.0cs r0 = r1.A05
            int r0 = r0.A00
            int r5 = r5 + r0
        L_0x0070:
            X.05R r0 = r1.A06
            r20 = r0
            int r0 = r0.A02
            r16 = r0
            X.0Fr r0 = r1.A02
            r15 = r0
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r15 == r0) goto L_0x0096
            r0 = 1
            int r15 = r14.A01
            if (r15 != 0) goto L_0x008f
            X.0R7 r0 = r1.A03
            X.05W r0 = r0.A0c
        L_0x0088:
            X.05R r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00a6
            return
        L_0x008f:
            if (r15 != r0) goto L_0x00a6
            X.0R7 r0 = r1.A03
            X.05V r0 = r0.A0d
            goto L_0x0088
        L_0x0096:
            int r0 = r1.A00
            r15 = r0
            r0 = 1
            if (r15 != r0) goto L_0x00b7
            if (r17 != 0) goto L_0x00b7
            r0 = r20
            int r0 = r0.A00
            r16 = r0
            int r4 = r4 + 1
        L_0x00a6:
            int r5 = r5 + r16
        L_0x00a8:
            if (r2 >= r6) goto L_0x00b2
            if (r2 >= r7) goto L_0x00b2
            X.0cs r0 = r1.A04
            int r0 = r0.A00
            int r0 = -r0
            int r5 = r5 + r0
        L_0x00b2:
            int r2 = r2 + 1
            r15 = 8
            goto L_0x0057
        L_0x00b7:
            r0 = r20
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00a6
            int r4 = r4 + 1
            X.0R7 r0 = r1.A03
            float[] r0 = r0.A0j
            r15 = r0
            int r0 = r14.A01
            r15 = r15[r0]
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            float r18 = r18 + r15
            goto L_0x00a8
        L_0x00d0:
            if (r5 < r11) goto L_0x00e2
            if (r4 == 0) goto L_0x00e2
            int r17 = r17 + 1
            r1 = 2
            r3 = 0
            r5 = 0
            r4 = 0
            r18 = 0
            r0 = r17
            if (r0 >= r1) goto L_0x00e2
            goto L_0x0051
        L_0x00e2:
            if (r13 == 0) goto L_0x00e6
            r12 = r19
        L_0x00e6:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r5 <= r11) goto L_0x00f5
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r5 - r11
            float r0 = (float) r0
            float r0 = r0 / r1
            float r0 = r0 + r2
            int r0 = (int) r0
            if (r13 == 0) goto L_0x0180
            int r12 = r12 + r0
        L_0x00f5:
            if (r4 <= 0) goto L_0x01bf
            int r0 = r11 - r5
            float r0 = (float) r0
            r17 = r0
            float r0 = (float) r4
            float r0 = r17 / r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r22 = r0
            r2 = 0
            r16 = 0
        L_0x0106:
            if (r2 >= r9) goto L_0x0183
            java.lang.Object r15 = r10.get(r2)
            X.0ct r15 = (X.C07830ct) r15
            X.0R7 r0 = r15.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 == r0) goto L_0x0172
            X.0Fr r1 = r15.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x0172
            X.05R r0 = r15.A06
            r21 = r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0172
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x017d
            X.0R7 r0 = r15.A03
            float[] r1 = r0.A0j
            int r0 = r14.A01
            r1 = r1[r0]
            float r1 = r1 * r17
            float r1 = r1 / r18
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r20 = r0
        L_0x013b:
            int r1 = r14.A01
            X.0R7 r0 = r15.A03
            if (r1 != 0) goto L_0x0178
            int r1 = r0.A0F
            int r0 = r0.A0H
        L_0x0145:
            r19 = r0
            int r0 = r15.A00
            r15 = r0
            r0 = 1
            if (r15 != r0) goto L_0x0175
            r0 = r21
            int r0 = r0.A00
            r15 = r20
            int r15 = java.lang.Math.min(r15, r0)
        L_0x0157:
            r0 = r19
            int r15 = java.lang.Math.max(r0, r15)
            if (r1 <= 0) goto L_0x0163
            int r15 = java.lang.Math.min(r1, r15)
        L_0x0163:
            r0 = r20
            if (r15 == r0) goto L_0x016b
            int r16 = r16 + 1
            r20 = r15
        L_0x016b:
            r1 = r21
            r0 = r20
            r1.A02(r0)
        L_0x0172:
            int r2 = r2 + 1
            goto L_0x0106
        L_0x0175:
            r15 = r20
            goto L_0x0157
        L_0x0178:
            int r1 = r0.A0E
            int r0 = r0.A0G
            goto L_0x0145
        L_0x017d:
            r20 = r22
            goto L_0x013b
        L_0x0180:
            int r12 = r12 - r0
            goto L_0x00f5
        L_0x0183:
            if (r16 <= 0) goto L_0x01b4
            int r4 = r4 - r16
            r1 = 0
            r5 = 0
        L_0x0189:
            if (r1 >= r9) goto L_0x01b4
            java.lang.Object r2 = r10.get(r1)
            X.0ct r2 = (X.C07830ct) r2
            X.0R7 r0 = r2.A03
            int r15 = r0.A0N
            r0 = 8
            if (r15 == r0) goto L_0x01b1
            if (r1 <= 0) goto L_0x01a2
            if (r1 < r8) goto L_0x01a2
            X.0cs r0 = r2.A05
            int r0 = r0.A00
            int r5 = r5 + r0
        L_0x01a2:
            X.05R r0 = r2.A06
            int r0 = r0.A02
            int r5 = r5 + r0
            if (r1 >= r6) goto L_0x01b1
            if (r1 >= r7) goto L_0x01b1
            X.0cs r0 = r2.A04
            int r0 = r0.A00
            int r0 = -r0
            int r5 = r5 + r0
        L_0x01b1:
            int r1 = r1 + 1
            goto L_0x0189
        L_0x01b4:
            int r0 = r14.A00
            r1 = 2
            if (r0 != r1) goto L_0x01c0
            if (r16 != 0) goto L_0x01c0
            r0 = 0
            r14.A00 = r0
            goto L_0x01c0
        L_0x01bf:
            r1 = 2
        L_0x01c0:
            if (r5 <= r11) goto L_0x01c4
            r14.A00 = r1
        L_0x01c4:
            if (r3 <= 0) goto L_0x01cc
            if (r4 != 0) goto L_0x01cc
            if (r8 != r7) goto L_0x01cc
            r14.A00 = r1
        L_0x01cc:
            int r1 = r14.A00
            r0 = 1
            if (r1 != r0) goto L_0x0251
            if (r3 <= r0) goto L_0x024a
            int r11 = r11 - r5
            int r0 = r3 + -1
        L_0x01d6:
            int r11 = r11 / r0
        L_0x01d7:
            if (r4 <= 0) goto L_0x01da
            r11 = 0
        L_0x01da:
            r2 = 0
        L_0x01db:
            if (r2 >= r9) goto L_0x0357
            r0 = r2
            if (r13 == 0) goto L_0x01e4
            int r0 = r2 + 1
            int r0 = r9 - r0
        L_0x01e4:
            java.lang.Object r3 = r10.get(r0)
            X.0ct r3 = (X.C07830ct) r3
            X.0R7 r0 = r3.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x01ff
            X.0cs r0 = r3.A05
            r0.A02(r12)
            X.0cs r0 = r3.A04
            r0.A02(r12)
        L_0x01fc:
            int r2 = r2 + 1
            goto L_0x01db
        L_0x01ff:
            if (r2 <= 0) goto L_0x0241
            if (r13 == 0) goto L_0x023f
            int r12 = r12 - r11
        L_0x0204:
            if (r2 < r8) goto L_0x0241
            X.0cs r0 = r3.A05
            int r0 = r0.A00
            if (r13 == 0) goto L_0x0244
            int r12 = r12 - r0
        L_0x020d:
            X.0cs r0 = r3.A04
        L_0x020f:
            r0.A02(r12)
            X.05R r5 = r3.A06
            int r4 = r5.A02
            X.0Fr r1 = r3.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x0223
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L_0x0223
            int r4 = r5.A00
        L_0x0223:
            if (r13 == 0) goto L_0x023b
            int r12 = r12 - r4
            X.0cs r0 = r3.A05
        L_0x0228:
            r0.A02(r12)
            r0 = 1
            r3.A09 = r0
            if (r2 >= r6) goto L_0x01fc
            if (r2 >= r7) goto L_0x01fc
            X.0cs r0 = r3.A04
            int r0 = r0.A00
            int r0 = -r0
            if (r13 == 0) goto L_0x0248
            int r12 = r12 - r0
            goto L_0x01fc
        L_0x023b:
            int r12 = r12 + r4
            X.0cs r0 = r3.A04
            goto L_0x0228
        L_0x023f:
            int r12 = r12 + r11
            goto L_0x0204
        L_0x0241:
            if (r13 == 0) goto L_0x0245
            goto L_0x020d
        L_0x0244:
            int r12 = r12 + r0
        L_0x0245:
            X.0cs r0 = r3.A05
            goto L_0x020f
        L_0x0248:
            int r12 = r12 + r0
            goto L_0x01fc
        L_0x024a:
            if (r3 != r0) goto L_0x024f
            int r11 = r11 - r5
            r0 = 2
            goto L_0x01d6
        L_0x024f:
            r11 = 0
            goto L_0x01d7
        L_0x0251:
            if (r1 != 0) goto L_0x02cb
            int r11 = r11 - r5
            int r0 = r3 + 1
            int r11 = r11 / r0
            if (r4 <= 0) goto L_0x025a
            r11 = 0
        L_0x025a:
            r2 = 0
        L_0x025b:
            if (r2 >= r9) goto L_0x0357
            r0 = r2
            if (r13 == 0) goto L_0x0264
            int r0 = r2 + 1
            int r0 = r9 - r0
        L_0x0264:
            java.lang.Object r3 = r10.get(r0)
            X.0ct r3 = (X.C07830ct) r3
            X.0R7 r0 = r3.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x027f
            X.0cs r0 = r3.A05
            r0.A02(r12)
            X.0cs r0 = r3.A04
            r0.A02(r12)
        L_0x027c:
            int r2 = r2 + 1
            goto L_0x025b
        L_0x027f:
            if (r13 == 0) goto L_0x02c7
            int r12 = r12 - r11
        L_0x0282:
            if (r2 <= 0) goto L_0x02c0
            if (r2 < r8) goto L_0x02c0
            X.0cs r0 = r3.A05
            int r0 = r0.A00
            if (r13 == 0) goto L_0x02c3
            int r12 = r12 - r0
        L_0x028d:
            X.0cs r0 = r3.A04
        L_0x028f:
            r0.A02(r12)
            X.05R r5 = r3.A06
            int r4 = r5.A02
            X.0Fr r1 = r3.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x02a7
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L_0x02a7
            int r0 = r5.A00
            int r4 = java.lang.Math.min(r4, r0)
        L_0x02a7:
            if (r13 == 0) goto L_0x02bc
            int r12 = r12 - r4
            X.0cs r0 = r3.A05
        L_0x02ac:
            r0.A02(r12)
            if (r2 >= r6) goto L_0x027c
            if (r2 >= r7) goto L_0x027c
            X.0cs r0 = r3.A04
            int r0 = r0.A00
            int r0 = -r0
            if (r13 == 0) goto L_0x02c9
            int r12 = r12 - r0
            goto L_0x027c
        L_0x02bc:
            int r12 = r12 + r4
            X.0cs r0 = r3.A04
            goto L_0x02ac
        L_0x02c0:
            if (r13 == 0) goto L_0x02c4
            goto L_0x028d
        L_0x02c3:
            int r12 = r12 + r0
        L_0x02c4:
            X.0cs r0 = r3.A05
            goto L_0x028f
        L_0x02c7:
            int r12 = r12 + r11
            goto L_0x0282
        L_0x02c9:
            int r12 = r12 + r0
            goto L_0x027c
        L_0x02cb:
            r0 = 2
            if (r1 != r0) goto L_0x0357
            int r1 = r14.A01
            X.0R7 r0 = r14.A03
            if (r1 != 0) goto L_0x0354
            float r1 = r0.A02
        L_0x02d6:
            if (r13 == 0) goto L_0x02dc
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 - r1
        L_0x02dc:
            int r11 = r11 - r5
            float r0 = (float) r11
            int r0 = X.AnonymousClass001.A06(r0, r1)
            if (r0 < 0) goto L_0x02e6
            if (r4 <= 0) goto L_0x02e7
        L_0x02e6:
            r0 = 0
        L_0x02e7:
            if (r13 == 0) goto L_0x0352
            int r12 = r12 - r0
        L_0x02ea:
            r2 = 0
        L_0x02eb:
            if (r2 >= r9) goto L_0x0357
            r0 = r2
            if (r13 == 0) goto L_0x02f4
            int r0 = r2 + 1
            int r0 = r9 - r0
        L_0x02f4:
            java.lang.Object r5 = r10.get(r0)
            X.0ct r5 = (X.C07830ct) r5
            X.0R7 r0 = r5.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x030f
            X.0cs r0 = r5.A05
            r0.A02(r12)
            X.0cs r0 = r5.A04
            r0.A02(r12)
        L_0x030c:
            int r2 = r2 + 1
            goto L_0x02eb
        L_0x030f:
            if (r2 <= 0) goto L_0x0349
            if (r2 < r8) goto L_0x0349
            X.0cs r0 = r5.A05
            int r0 = r0.A00
            if (r13 == 0) goto L_0x034c
            int r12 = r12 - r0
        L_0x031a:
            X.0cs r0 = r5.A04
        L_0x031c:
            r0.A02(r12)
            X.05R r4 = r5.A06
            int r3 = r4.A02
            X.0Fr r1 = r5.A02
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x0330
            int r1 = r5.A00
            r0 = 1
            if (r1 != r0) goto L_0x0330
            int r3 = r4.A00
        L_0x0330:
            if (r13 == 0) goto L_0x0345
            int r12 = r12 - r3
            X.0cs r0 = r5.A05
        L_0x0335:
            r0.A02(r12)
            if (r2 >= r6) goto L_0x030c
            if (r2 >= r7) goto L_0x030c
            X.0cs r0 = r5.A04
            int r0 = r0.A00
            int r0 = -r0
            if (r13 == 0) goto L_0x0350
            int r12 = r12 - r0
            goto L_0x030c
        L_0x0345:
            int r12 = r12 + r3
            X.0cs r0 = r5.A04
            goto L_0x0335
        L_0x0349:
            if (r13 == 0) goto L_0x034d
            goto L_0x031a
        L_0x034c:
            int r12 = r12 + r0
        L_0x034d:
            X.0cs r0 = r5.A05
            goto L_0x031c
        L_0x0350:
            int r12 = r12 + r0
            goto L_0x030c
        L_0x0352:
            int r12 = r12 + r0
            goto L_0x02ea
        L_0x0354:
            float r1 = r0.A06
            goto L_0x02d6
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05U.BrU(X.0ro):void");
    }

    public AnonymousClass05U(AnonymousClass0R7 r7, int i) {
        super(r7);
        C04800Qs r2;
        AnonymousClass0R7 r0;
        AnonymousClass0R7 r1;
        Object obj;
        C04800Qs r22;
        int i2;
        C04800Qs r23;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A01 = A0s;
        this.A01 = i;
        AnonymousClass0R7 r5 = this.A03;
        AnonymousClass0R7 r3 = r5;
        if (i == 0) {
            r2 = r5.A0W;
        } else {
            r2 = r5.A0Y;
        }
        while (true) {
            C04800Qs r12 = r2.A03;
            if (r12 == null || r12.A03 != r2) {
                r0 = null;
            } else {
                r0 = r12.A06;
            }
            r1 = r5;
            r5 = r0;
            if (r0 == null) {
                break;
            }
            r3 = r0;
            if (i == 0) {
                r23 = r0.A0W;
            } else {
                r23 = r0.A0Y;
            }
        }
        this.A03 = r3;
        while (true) {
            if (i == 0) {
                obj = r1.A0c;
            } else {
                obj = r1.A0d;
            }
            A0s.add(obj);
            if (i == 0) {
                r22 = r1.A0X;
            } else {
                r22 = r1.A0S;
            }
            C04800Qs r13 = r22.A03;
            if (r13 == null || r13.A03 != r22) {
                Iterator it = A0s.iterator();
            } else {
                r1 = r13.A06;
            }
        }
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            C07830ct r14 = (C07830ct) it2.next();
            int i3 = this.A01;
            if (i3 == 0) {
                r14.A03.A0a = this;
            } else if (i3 == 1) {
                r14.A03.A0b = this;
            }
        }
        int i4 = this.A01;
        if (i4 == 0 && ((AnonymousClass05P) this.A03.A0Z).A0A && A0s.size() > 1) {
            this.A03 = A00(A0s, A0s.size() - 1);
        }
        AnonymousClass0R7 r02 = this.A03;
        if (i4 == 0) {
            i2 = r02.A0A;
        } else {
            i2 = r02.A0L;
        }
        this.A00 = i2;
    }

    public static AnonymousClass0R7 A00(AbstractList abstractList, int i) {
        return ((C07830ct) abstractList.get(i)).A03;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ChainRun ");
        if (this.A01 == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String A0X = AnonymousClass000.A0X(str, A0o);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A0X = AnonymousClass000.A0X("> ", AnonymousClass000.A0l(AnonymousClass000.A0P(it.next(), AnonymousClass000.A0X("<", AnonymousClass000.A0l(A0X)), AnonymousClass001.A0o())));
        }
        return A0X;
    }
}
