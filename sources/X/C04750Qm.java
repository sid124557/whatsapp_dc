package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0Qm  reason: invalid class name and case insensitive filesystem */
public class C04750Qm {
    public AnonymousClass05P A00;
    public AnonymousClass05P A01;
    public C03990Mi A02 = new C03990Mi();
    public C15700rn A03 = null;
    public ArrayList A04 = AnonymousClass001.A0s();
    public ArrayList A05 = AnonymousClass001.A0s();
    public ArrayList A06 = AnonymousClass001.A0s();
    public boolean A07 = true;
    public boolean A08 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        if ((r11 instanceof X.AnonymousClass05W) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        if ((r11 instanceof X.AnonymousClass05V) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        r0 = r3.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r23 == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.AnonymousClass05P r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r0 = r0.A04
            r20 = r0
            int r19 = r20.size()
            r6 = 0
            r12 = 0
        L_0x000d:
            r0 = r19
            if (r12 >= r0) goto L_0x00e1
            r0 = r20
            java.lang.Object r2 = r0.get(r12)
            X.0OU r2 = (X.AnonymousClass0OU) r2
            X.0ct r11 = r2.A00
            boolean r0 = r11 instanceof X.AnonymousClass05U
            r4 = 0
            r3 = r22
            r13 = r23
            if (r0 == 0) goto L_0x00cf
            int r0 = r11.A01
            if (r0 != r13) goto L_0x00d5
            if (r23 != 0) goto L_0x00dd
        L_0x002b:
            X.05W r0 = r3.A0c
        L_0x002d:
            X.0cs r1 = r0.A05
            if (r23 != 0) goto L_0x00cb
            X.05W r0 = r3.A0c
        L_0x0033:
            X.0cs r3 = r0.A04
            X.0cs r14 = r11.A05
            java.util.List r0 = r14.A08
            boolean r1 = r0.contains(r1)
            X.0cs r10 = r11.A04
            java.util.List r0 = r10.A08
            boolean r0 = r0.contains(r3)
            long r17 = r11.A09()
            if (r1 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00a0
            long r8 = r2.A01(r14, r4)
            long r15 = r2.A00(r10, r4)
            long r8 = r8 - r17
            int r2 = r10.A00
            int r0 = -r2
            long r0 = (long) r0
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0061
            long r0 = (long) r2
            long r8 = r8 + r0
        L_0x0061:
            long r2 = -r15
            long r2 = r2 - r17
            int r0 = r14.A00
            long r0 = (long) r0
            long r2 = r2 - r0
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x006d
            long r2 = r2 - r0
        L_0x006d:
            X.0R7 r11 = r11.A03
            if (r23 != 0) goto L_0x009d
            float r11 = r11.A02
        L_0x0073:
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x0082
            float r4 = (float) r2
            float r4 = r4 / r11
            float r3 = (float) r8
            float r2 = r14 - r11
            float r3 = r3 / r2
            float r4 = r4 + r3
            long r4 = (long) r4
        L_0x0082:
            float r8 = (float) r4
            float r3 = r8 * r11
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            long r4 = (long) r3
            float r14 = r14 - r11
            float r8 = r8 * r14
            float r8 = r8 + r2
            long r2 = (long) r8
            long r4 = r4 + r17
            long r4 = r4 + r2
            long r0 = r0 + r4
        L_0x0091:
            int r2 = r10.A00
            long r2 = (long) r2
            long r0 = r0 - r2
        L_0x0095:
            long r6 = java.lang.Math.max(r6, r0)
            int r12 = r12 + 1
            goto L_0x000d
        L_0x009d:
            float r11 = r11.A06
            goto L_0x0073
        L_0x00a0:
            int r0 = r14.A00
            long r0 = (long) r0
            long r1 = r2.A01(r14, r0)
            int r0 = r14.A00
            long r3 = (long) r0
            long r3 = r3 + r17
            goto L_0x00bd
        L_0x00ad:
            if (r0 == 0) goto L_0x00c2
            int r0 = r10.A00
            long r0 = (long) r0
            long r8 = r2.A00(r10, r0)
            int r0 = r10.A00
            int r0 = -r0
            long r3 = (long) r0
            long r3 = r3 + r17
            long r1 = -r8
        L_0x00bd:
            long r0 = java.lang.Math.max(r1, r3)
            goto L_0x0095
        L_0x00c2:
            int r0 = r14.A00
            long r0 = (long) r0
            long r2 = r11.A09()
            long r0 = r0 + r2
            goto L_0x0091
        L_0x00cb:
            X.05V r0 = r3.A0d
            goto L_0x0033
        L_0x00cf:
            if (r23 != 0) goto L_0x00d8
            boolean r0 = r11 instanceof X.AnonymousClass05W
            if (r0 != 0) goto L_0x002b
        L_0x00d5:
            r0 = 0
            goto L_0x0095
        L_0x00d8:
            boolean r0 = r11 instanceof X.AnonymousClass05V
            if (r0 != 0) goto L_0x00dd
            goto L_0x00d5
        L_0x00dd:
            X.05V r0 = r3.A0d
            goto L_0x002d
        L_0x00e1:
            int r0 = (int) r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04750Qm.A00(X.05P, int):int");
    }

    public void A01() {
        Object r0;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        AnonymousClass05P r3 = this.A01;
        AnonymousClass05W r1 = r3.A0c;
        r1.A0C();
        AnonymousClass05V r02 = r3.A0d;
        r02.A0C();
        arrayList.add(r1);
        arrayList.add(r02);
        Iterator it = r3.A00.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            AnonymousClass0R7 r4 = (AnonymousClass0R7) it.next();
            if (r4 instanceof AnonymousClass05K) {
                r0 = new AnonymousClass05S(r4);
            } else {
                if (r4.A0L()) {
                    AnonymousClass05U r12 = r4.A0a;
                    if (r12 == null) {
                        r12 = new AnonymousClass05U(r4, 0);
                        r4.A0a = r12;
                    }
                    if (hashSet == null) {
                        hashSet = AnonymousClass002.A0K();
                    }
                    hashSet.add(r12);
                } else {
                    arrayList.add(r4.A0c);
                }
                if (r4.A0M()) {
                    AnonymousClass05U r13 = r4.A0b;
                    if (r13 == null) {
                        r13 = new AnonymousClass05U(r4, 1);
                        r4.A0b = r13;
                    }
                    if (hashSet == null) {
                        hashSet = AnonymousClass002.A0K();
                    }
                    hashSet.add(r13);
                } else {
                    arrayList.add(r4.A0d);
                }
                if (r4 instanceof AnonymousClass05O) {
                    r0 = new AnonymousClass05T(r4);
                }
            }
            arrayList.add(r0);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C07830ct) it2.next()).A0C();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C07830ct r14 = (C07830ct) it3.next();
            if (r14.A03 != r3) {
                r14.A0A();
            }
        }
        ArrayList arrayList2 = this.A04;
        arrayList2.clear();
        AnonymousClass0OU.A03 = 0;
        AnonymousClass05P r15 = this.A00;
        A06(r15.A0c, arrayList2, 0);
        A06(r15.A0d, arrayList2, 1);
        this.A07 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r6 == r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r7 == r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        r4.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r4.A02(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r21 = this;
            r11 = r21
            X.05P r0 = r11.A00
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r10 = r0.iterator()
        L_0x000a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r14 = r10.next()
            X.0R7 r14 = (X.AnonymousClass0R7) r14
            boolean r0 = r14.A0i
            if (r0 != 0) goto L_0x000a
            X.0Fr[] r0 = r14.A0o
            r9 = 0
            r7 = r0[r9]
            r3 = 1
            r6 = r0[r3]
            int r2 = r14.A0D
            int r1 = r14.A0C
            X.0Fr r12 = X.C02310Fr.WRAP_CONTENT
            if (r7 == r12) goto L_0x0030
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r7 != r0) goto L_0x00a2
            if (r2 != r3) goto L_0x00a2
        L_0x0030:
            r8 = 1
        L_0x0031:
            if (r6 == r12) goto L_0x0039
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r6 != r0) goto L_0x003a
            if (r1 != r3) goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            X.05W r0 = r14.A0c
            X.05R r5 = r0.A06
            boolean r1 = r5.A0B
            X.05V r2 = r14.A0d
            X.05R r4 = r2.A06
            boolean r0 = r4.A0B
            if (r1 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0066
            X.0Fr r12 = X.C02310Fr.FIXED
            int r15 = r5.A02
            int r0 = r4.A02
            r13 = r12
            r16 = r0
            r11.A03(r12, r13, r14, r15, r16)
        L_0x0056:
            r14.A0i = r3
        L_0x0058:
            boolean r0 = r14.A0i
            if (r0 == 0) goto L_0x000a
            X.05R r1 = r2.A01
            if (r1 == 0) goto L_0x000a
            int r0 = r14.A07
            r1.A02(r0)
            goto L_0x000a
        L_0x0066:
            if (r9 == 0) goto L_0x0058
            X.0Fr r16 = X.C02310Fr.FIXED
            int r1 = r5.A02
            int r0 = r4.A02
            r15 = r11
            r17 = r12
            r18 = r14
            r19 = r1
            r20 = r0
            r15.A03(r16, r17, r18, r19, r20)
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            int r1 = r14.A04()
            if (r6 != r0) goto L_0x009e
            goto L_0x009b
        L_0x0083:
            if (r0 == 0) goto L_0x0058
            if (r8 == 0) goto L_0x0058
            int r15 = r5.A02
            X.0Fr r13 = X.C02310Fr.FIXED
            int r0 = r4.A02
            r16 = r0
            r11.A03(r12, r13, r14, r15, r16)
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            r4 = r5
            int r1 = r14.A05()
            if (r7 != r0) goto L_0x009e
        L_0x009b:
            r4.A00 = r1
            goto L_0x0058
        L_0x009e:
            r4.A02(r1)
            goto L_0x0056
        L_0x00a2:
            r8 = 0
            goto L_0x0031
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04750Qm.A02():void");
    }

    public final void A03(C02310Fr r3, C02310Fr r4, AnonymousClass0R7 r5, int i, int i2) {
        C03990Mi r1 = this.A02;
        r1.A05 = r3;
        r1.A06 = r4;
        r1.A00 = i;
        r1.A04 = i2;
        r5.A0h = C03990Mi.A00(r5, r1, this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c7, code lost:
        if (r15[3].A03 != null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0234, code lost:
        if (r9.A0C == 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0163, code lost:
        if (r16[1].A03 != null) goto L_0x0166;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass05P r28) {
        /*
            r27 = this;
            r26 = r28
            r0 = r26
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r18 = r0.iterator()
        L_0x000a:
            boolean r0 = r18.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0237
            java.lang.Object r9 = r18.next()
            X.0R7 r9 = (X.AnonymousClass0R7) r9
            X.0Fr[] r0 = r9.A0o
            r12 = r0[r1]
            r10 = 1
            r11 = r0[r10]
            int r2 = r9.A0N
            r0 = 8
            if (r2 == r0) goto L_0x00f7
            float r8 = r9.A04
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x0033
            r0 = 2
            r9.A0D = r0
        L_0x0033:
            float r7 = r9.A03
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r11 != r0) goto L_0x0040
            r0 = 2
            r9.A0C = r0
        L_0x0040:
            float r2 = r9.A01
            r0 = 0
            r6 = 3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            X.0Fr r2 = X.C02310Fr.MATCH_CONSTRAINT
            if (r12 != r2) goto L_0x021a
            X.0Fr r0 = X.C02310Fr.WRAP_CONTENT
            if (r11 == r0) goto L_0x0054
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r11 != r0) goto L_0x021a
        L_0x0054:
            r9.A0D = r6
        L_0x0056:
            X.0Fr r5 = X.C02310Fr.MATCH_CONSTRAINT
            if (r12 != r5) goto L_0x006c
            int r0 = r9.A0D
            if (r0 != r10) goto L_0x006c
            X.0Qs r0 = r9.A0W
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x006a
            X.0Qs r0 = r9.A0X
            X.0Qs r0 = r0.A03
            if (r0 != 0) goto L_0x006c
        L_0x006a:
            X.0Fr r12 = X.C02310Fr.WRAP_CONTENT
        L_0x006c:
            if (r11 != r5) goto L_0x0080
            int r0 = r9.A0C
            if (r0 != r10) goto L_0x0080
            X.0Qs r0 = r9.A0Y
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x007e
            X.0Qs r0 = r9.A0S
            X.0Qs r0 = r0.A03
            if (r0 != 0) goto L_0x0080
        L_0x007e:
            X.0Fr r11 = X.C02310Fr.WRAP_CONTENT
        L_0x0080:
            X.05W r4 = r9.A0c
            r4.A02 = r12
            int r3 = r9.A0D
            r4.A00 = r3
            X.05V r0 = r9.A0d
            r25 = r0
            r0.A02 = r11
            int r14 = r9.A0C
            r0.A00 = r14
            X.0Fr r15 = X.C02310Fr.MATCH_PARENT
            r19 = r27
            if (r12 == r15) goto L_0x00a0
            X.0Fr r13 = X.C02310Fr.FIXED
            if (r12 == r13) goto L_0x00a0
            X.0Fr r2 = X.C02310Fr.WRAP_CONTENT
            if (r12 != r2) goto L_0x00fb
        L_0x00a0:
            if (r11 == r15) goto L_0x00aa
            X.0Fr r13 = X.C02310Fr.FIXED
            if (r11 == r13) goto L_0x00aa
            X.0Fr r2 = X.C02310Fr.WRAP_CONTENT
            if (r11 != r2) goto L_0x00fb
        L_0x00aa:
            int r1 = r9.A05()
            if (r12 != r15) goto L_0x00c0
            int r1 = r26.A05()
            X.0Qs r0 = r9.A0W
            int r0 = r0.A01
            int r1 = r1 - r0
            X.0Qs r0 = r9.A0X
            int r0 = r0.A01
            int r1 = r1 - r0
            X.0Fr r12 = X.C02310Fr.FIXED
        L_0x00c0:
            int r2 = r9.A04()
            if (r11 != r15) goto L_0x00d6
            int r2 = r26.A04()
            X.0Qs r0 = r9.A0Y
            int r0 = r0.A01
            int r2 = r2 - r0
            X.0Qs r0 = r9.A0S
            int r0 = r0.A01
            int r2 = r2 - r0
            X.0Fr r11 = X.C02310Fr.FIXED
        L_0x00d6:
            r20 = r12
            r21 = r11
            r22 = r9
            r23 = r1
            r24 = r2
            r19.A03(r20, r21, r22, r23, r24)
            X.05R r1 = r4.A06
            int r0 = r9.A05()
            r1.A02(r0)
            r0 = r25
            X.05R r1 = r0.A06
            int r0 = r9.A04()
            r1.A02(r0)
        L_0x00f7:
            r9.A0i = r10
            goto L_0x000a
        L_0x00fb:
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r12 != r5) goto L_0x0166
            if (r11 == r2) goto L_0x0103
            if (r11 != r13) goto L_0x0166
        L_0x0103:
            if (r3 != r6) goto L_0x0122
            if (r11 != r2) goto L_0x0114
            r21 = r2
            r24 = r1
            r20 = r2
            r22 = r9
            r23 = r1
            r19.A03(r20, r21, r22, r23, r24)
        L_0x0114:
            int r2 = r9.A04()
            float r1 = (float) r2
            float r0 = r9.A01
            float r1 = r1 * r0
            float r1 = r1 + r17
            int r1 = (int) r1
        L_0x011f:
            r12 = r13
        L_0x0120:
            r11 = r13
            goto L_0x00d6
        L_0x0122:
            if (r3 != r10) goto L_0x0139
            r24 = r1
            r20 = r2
            r21 = r11
            r22 = r9
            r23 = r1
            r19.A03(r20, r21, r22, r23, r24)
            X.05R r1 = r4.A06
            int r0 = r9.A05()
            goto L_0x0216
        L_0x0139:
            r0 = 2
            if (r3 != r0) goto L_0x0155
            r0 = r26
            X.0Fr[] r0 = r0.A0o
            r0 = r0[r1]
            if (r0 == r13) goto L_0x0146
            if (r0 != r15) goto L_0x0166
        L_0x0146:
            int r0 = r26.A05()
            float r0 = (float) r0
            float r8 = r8 * r0
            float r8 = r8 + r17
            int r1 = (int) r8
            int r2 = r9.A04()
            r12 = r13
            goto L_0x00d6
        L_0x0155:
            X.0Qs[] r0 = r9.A0n
            r16 = r0
            r0 = r0[r1]
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x01c9
            r0 = r16[r10]
            X.0Qs r0 = r0.A03
            if (r0 != 0) goto L_0x0166
            goto L_0x01c9
        L_0x0166:
            if (r11 != r5) goto L_0x01cd
            if (r12 == r2) goto L_0x016c
            if (r12 != r13) goto L_0x01cd
        L_0x016c:
            if (r14 != r6) goto L_0x0192
            if (r12 != r2) goto L_0x017d
            r21 = r2
            r24 = r1
            r20 = r2
            r22 = r9
            r23 = r1
            r19.A03(r20, r21, r22, r23, r24)
        L_0x017d:
            int r1 = r9.A05()
            float r3 = r9.A01
            int r2 = r9.A08
            r0 = -1
            if (r2 != r0) goto L_0x018c
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0 / r3
        L_0x018c:
            float r7 = (float) r1
        L_0x018d:
            float r7 = r7 * r3
            float r7 = r7 + r17
            int r2 = (int) r7
            goto L_0x011f
        L_0x0192:
            if (r14 != r10) goto L_0x019f
            r8 = r1
            r3 = r19
            r4 = r12
            r5 = r2
            r6 = r9
            r7 = r1
            r3.A03(r4, r5, r6, r7, r8)
            goto L_0x020e
        L_0x019f:
            r0 = 2
            if (r14 != r0) goto L_0x01bb
            r0 = r26
            X.0Fr[] r0 = r0.A0o
            r0 = r0[r10]
            if (r0 == r13) goto L_0x01ac
            if (r0 != r15) goto L_0x01cd
        L_0x01ac:
            int r1 = r9.A05()
            int r0 = r26.A04()
            float r0 = (float) r0
            float r7 = r7 * r0
            float r7 = r7 + r17
            int r2 = (int) r7
            goto L_0x0120
        L_0x01bb:
            X.0Qs[] r15 = r9.A0n
            r0 = r15[r0]
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x01c9
            r0 = r15[r6]
            X.0Qs r0 = r0.A03
            if (r0 != 0) goto L_0x01cd
        L_0x01c9:
            r12 = r2
            r2 = 0
            goto L_0x00d6
        L_0x01cd:
            if (r12 != r5) goto L_0x000a
            if (r11 != r5) goto L_0x000a
            if (r3 == r10) goto L_0x01f9
            if (r14 == r10) goto L_0x01f9
            r0 = 2
            if (r14 != r0) goto L_0x000a
            if (r3 != r0) goto L_0x000a
            r0 = r26
            X.0Fr[] r2 = r0.A0o
            r0 = r2[r1]
            if (r0 == r13) goto L_0x01e4
            if (r0 != r13) goto L_0x000a
        L_0x01e4:
            r0 = r2[r10]
            if (r0 == r13) goto L_0x01ea
            if (r0 != r13) goto L_0x000a
        L_0x01ea:
            int r0 = r26.A05()
            float r0 = (float) r0
            float r8 = r8 * r0
            float r8 = r8 + r17
            int r1 = (int) r8
            int r0 = r26.A04()
            float r3 = (float) r0
            goto L_0x018d
        L_0x01f9:
            r21 = r2
            r24 = r1
            r20 = r2
            r22 = r9
            r23 = r1
            r19.A03(r20, r21, r22, r23, r24)
            X.05R r1 = r4.A06
            int r0 = r9.A05()
            r1.A00 = r0
        L_0x020e:
            r0 = r25
            X.05R r1 = r0.A06
            int r0 = r9.A04()
        L_0x0216:
            r1.A00 = r0
            goto L_0x000a
        L_0x021a:
            if (r11 != r2) goto L_0x0228
            X.0Fr r0 = X.C02310Fr.WRAP_CONTENT
            if (r12 == r0) goto L_0x0224
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r12 != r0) goto L_0x0228
        L_0x0224:
            r9.A0C = r6
            goto L_0x0056
        L_0x0228:
            if (r12 != r2) goto L_0x0056
            if (r11 != r2) goto L_0x0056
            int r0 = r9.A0D
            if (r0 != 0) goto L_0x0232
            r9.A0D = r6
        L_0x0232:
            int r0 = r9.A0C
            if (r0 != 0) goto L_0x0056
            goto L_0x0224
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04750Qm.A04(X.05P):void");
    }

    public final void A05(C07820cs r19, C07820cs r20, AnonymousClass0OU r21, ArrayList arrayList, int i) {
        C07820cs r8;
        int i2;
        AnonymousClass0OU r9 = r21;
        C07830ct r3 = r19.A06;
        if (r3.A07 == null) {
            AnonymousClass05P r1 = this.A00;
            if (r3 != r1.A0c && r3 != r1.A0d) {
                ArrayList arrayList2 = arrayList;
                if (r21 == null) {
                    r9 = new AnonymousClass0OU(r3);
                    arrayList2.add(r9);
                }
                r3.A07 = r9;
                r9.A02.add(r3);
                r9.A01 = r3;
                C07820cs r5 = r3.A05;
                Iterator it = r5.A07.iterator();
                while (true) {
                    r8 = r20;
                    i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    C15710ro r7 = (C15710ro) it.next();
                    if (r7 instanceof C07820cs) {
                        A05((C07820cs) r7, r8, r9, arrayList2, i2);
                    }
                }
                C07820cs r4 = r3.A04;
                for (C15710ro r72 : r4.A07) {
                    if (r72 instanceof C07820cs) {
                        A05((C07820cs) r72, r8, r9, arrayList2, i2);
                    }
                }
                if (i2 == 1 && (r3 instanceof AnonymousClass05V)) {
                    for (C15710ro r13 : ((AnonymousClass05V) r3).A00.A07) {
                        if (r13 instanceof C07820cs) {
                            A05((C07820cs) r13, r8, r9, arrayList2, 1);
                        }
                    }
                }
                for (C07820cs A052 : r5.A08) {
                    A05(A052, r8, r9, arrayList2, i2);
                }
                for (C07820cs A053 : r4.A08) {
                    A05(A053, r8, r9, arrayList2, i2);
                }
                if (i2 == 1 && (r3 instanceof AnonymousClass05V)) {
                    for (C07820cs A054 : ((AnonymousClass05V) r3).A00.A08) {
                        A05(A054, r8, r9, arrayList2, 1);
                    }
                }
            }
        }
    }

    public final void A06(C07830ct r15, ArrayList arrayList, int i) {
        ArrayList arrayList2;
        int i2;
        C07820cs r9;
        C07820cs r3;
        C07820cs r10 = r15.A05;
        Iterator it = r10.A07.iterator();
        while (true) {
            arrayList2 = arrayList;
            i2 = i;
            if (!it.hasNext()) {
                break;
            }
            C15710ro r32 = (C15710ro) it.next();
            if (r32 instanceof C07820cs) {
                r3 = (C07820cs) r32;
            } else if (r32 instanceof C07830ct) {
                r3 = ((C07830ct) r32).A05;
            }
            A05(r3, r15.A04, (AnonymousClass0OU) null, arrayList2, i2);
        }
        for (C15710ro r92 : r15.A04.A07) {
            if (r92 instanceof C07820cs) {
                r9 = (C07820cs) r92;
            } else if (r92 instanceof C07830ct) {
                r9 = ((C07830ct) r92).A04;
            }
            A05(r9, r10, (AnonymousClass0OU) null, arrayList2, i2);
        }
        if (i2 == 1) {
            for (C15710ro r33 : ((AnonymousClass05V) r15).A00.A07) {
                if (r33 instanceof C07820cs) {
                    A05((C07820cs) r33, (C07820cs) null, (AnonymousClass0OU) null, arrayList2, 1);
                }
            }
        }
    }

    public C04750Qm(AnonymousClass05P r2) {
        this.A00 = r2;
        this.A01 = r2;
    }
}
