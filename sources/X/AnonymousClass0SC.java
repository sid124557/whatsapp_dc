package X;

import java.util.Comparator;

/* renamed from: X.0SC  reason: invalid class name */
public class AnonymousClass0SC {
    public static final Comparator A00 = new C17940wU(2);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0085, code lost:
        if (r4[r2 - 1] < r4[r2 + 1]) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        if (r14 > r9) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        r13 = r14 + r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        if (r13 == (r9 + r19)) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        if (r13 == (r8 + r19)) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        r2 = r23 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c9, code lost:
        if (r3[r2 - 1] >= r3[r2 + 1]) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cb, code lost:
        r2 = r3[(r23 + r13) - 1];
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d2, code lost:
        r16 = r2 - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (r2 <= 0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
        if (r16 <= 0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        if (r25.A04((r21 + r2) - 1, (r20 + r16) - 1) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        r2 = r2 - 1;
        r16 = r16 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ed, code lost:
        r0 = r23 + r13;
        r3[r0] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        if (r18 != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        if (r13 < r8) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        if (r13 > r9) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        r1 = r4[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        if (r1 < r2) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fb, code lost:
        r2 = new X.AnonymousClass0MN();
        r8 = r3[r0];
        r2.A01 = r8;
        r2.A02 = r8 - r13;
        r2.A00 = r1 - r8;
        r2.A03 = r17;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        r14 = r14 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        r2 = r3[(r23 + r13) + 1] - 1;
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b7, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3 A[LOOP:3: B:16:0x0091->B:20:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3 A[LOOP:2: B:9:0x0075->B:79:0x01b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0133 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011e A[EDGE_INSN: B:99:0x011e->B:46:0x011e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0U0 A00(X.AnonymousClass0QO r25) {
        /*
            r7 = 1
            int r2 = r25.A01()
            int r1 = r25.A00()
            java.util.ArrayList r24 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.0TG r0 = new X.0TG
            r0.<init>(r2, r1)
            r6.add(r0)
            int r23 = r2 + r1
            int r0 = X.AnonymousClass001.A0A(r2, r1)
            int r23 = r23 + r0
            int r0 = r23 * 2
            int[] r4 = new int[r0]
            int[] r3 = new int[r0]
            java.util.ArrayList r22 = X.AnonymousClass001.A0s()
        L_0x002b:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01c9
            int r0 = r6.size()
            int r0 = r0 + -1
            java.lang.Object r5 = r6.remove(r0)
            X.0TG r5 = (X.AnonymousClass0TG) r5
            int r0 = r5.A03
            r21 = r0
            int r11 = r5.A02
            int r0 = r5.A01
            r20 = r0
            int r12 = r5.A00
            int r11 = r11 - r21
            int r12 = r12 - r0
            if (r11 < r7) goto L_0x01bb
            if (r12 < r7) goto L_0x01bb
            int r19 = r11 - r12
            int r0 = r11 + r12
            int r0 = r0 + 1
            int r10 = r0 / 2
            int r2 = r23 - r10
            int r2 = r2 - r7
            int r0 = r23 + r10
            int r1 = r0 + 1
            r0 = 0
            java.util.Arrays.fill(r4, r2, r1, r0)
            int r2 = r2 + r19
            int r1 = r1 + r19
            java.util.Arrays.fill(r3, r2, r1, r11)
            int r0 = r19 % 2
            boolean r18 = X.AnonymousClass000.A1S(r0)
            r9 = 0
        L_0x0071:
            if (r9 > r10) goto L_0x01c2
            int r8 = -r9
            r13 = r8
        L_0x0075:
            if (r13 > r9) goto L_0x00b2
            if (r13 == r8) goto L_0x0087
            if (r13 == r9) goto L_0x00a8
            int r2 = r23 + r13
            int r0 = r2 + -1
            r1 = r4[r0]
            int r0 = r2 + 1
            r0 = r4[r0]
            if (r1 >= r0) goto L_0x00a8
        L_0x0087:
            int r0 = r23 + r13
            int r0 = r0 + 1
            r14 = r4[r0]
            r16 = 0
        L_0x008f:
            int r15 = r14 - r13
        L_0x0091:
            if (r14 >= r11) goto L_0x011e
            if (r15 >= r12) goto L_0x011e
            int r1 = r21 + r14
            int r0 = r20 + r15
            r2 = r1
            r1 = r0
            r0 = r25
            boolean r0 = r0.A04(r2, r1)
            if (r0 == 0) goto L_0x011e
            int r14 = r14 + 1
            int r15 = r15 + 1
            goto L_0x0091
        L_0x00a8:
            int r0 = r23 + r13
            int r0 = r0 - r7
            r0 = r4[r0]
            int r14 = r0 + 1
            r16 = 1
            goto L_0x008f
        L_0x00b2:
            r14 = r8
        L_0x00b3:
            if (r14 > r9) goto L_0x01b7
            int r13 = r14 + r19
            int r0 = r9 + r19
            if (r13 == r0) goto L_0x00cb
            int r0 = r8 + r19
            if (r13 == r0) goto L_0x0114
            int r2 = r23 + r13
            int r0 = r2 + -1
            r1 = r3[r0]
            int r0 = r2 + 1
            r0 = r3[r0]
            if (r1 >= r0) goto L_0x0114
        L_0x00cb:
            int r0 = r23 + r13
            int r0 = r0 - r7
            r2 = r3[r0]
            r17 = 0
        L_0x00d2:
            int r16 = r2 - r13
        L_0x00d4:
            if (r2 <= 0) goto L_0x00ed
            if (r16 <= 0) goto L_0x00ed
            int r0 = r21 + r2
            int r1 = r0 + -1
            int r0 = r20 + r16
            int r15 = r0 + -1
            r0 = r25
            boolean r0 = r0.A04(r1, r15)
            if (r0 == 0) goto L_0x00ed
            int r2 = r2 + -1
            int r16 = r16 + -1
            goto L_0x00d4
        L_0x00ed:
            int r0 = r23 + r13
            r3[r0] = r2
            if (r18 != 0) goto L_0x0111
            if (r13 < r8) goto L_0x0111
            if (r13 > r9) goto L_0x0111
            r1 = r4[r0]
            if (r1 < r2) goto L_0x0111
            X.0MN r2 = new X.0MN
            r2.<init>()
            r8 = r3[r0]
            r2.A01 = r8
            int r0 = r8 - r13
            r2.A02 = r0
            int r1 = r1 - r8
            r2.A00 = r1
            r0 = r17
            r2.A03 = r0
            r0 = 1
            goto L_0x0148
        L_0x0111:
            int r14 = r14 + 2
            goto L_0x00b3
        L_0x0114:
            int r0 = r23 + r13
            int r0 = r0 + 1
            r2 = r3[r0]
            int r2 = r2 - r7
            r17 = 1
            goto L_0x00d2
        L_0x011e:
            int r15 = r23 + r13
            r4[r15] = r14
            if (r18 == 0) goto L_0x01b3
            int r0 = r19 - r9
            int r0 = r0 + 1
            if (r13 < r0) goto L_0x01b3
            int r0 = r19 + r9
            int r0 = r0 - r7
            if (r13 > r0) goto L_0x01b3
            r1 = r3[r15]
            if (r14 < r1) goto L_0x01b3
            X.0MN r2 = new X.0MN
            r2.<init>()
            r2.A01 = r1
            int r0 = r1 - r13
            r2.A02 = r0
            r0 = r4[r15]
            int r0 = r0 - r1
            r2.A00 = r0
            r0 = r16
            r2.A03 = r0
            r0 = 0
        L_0x0148:
            r2.A04 = r0
            int r9 = r2.A00
            if (r9 <= 0) goto L_0x0153
            r0 = r24
            r0.add(r2)
        L_0x0153:
            int r10 = r2.A01
            int r12 = r5.A03
            int r10 = r10 + r12
            r2.A01 = r10
            int r8 = r2.A02
            int r11 = r5.A01
            int r8 = r8 + r11
            r2.A02 = r8
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x01a4
            X.0TG r0 = new X.0TG
            r0.<init>()
        L_0x016c:
            r0.A03 = r12
            r0.A01 = r11
            boolean r11 = r2.A04
            if (r11 == 0) goto L_0x0198
            r1 = r10
        L_0x0175:
            r0.A02 = r1
            r1 = r8
        L_0x0178:
            r0.A00 = r1
            r6.add(r0)
            if (r11 == 0) goto L_0x0196
            boolean r0 = r2.A03
            int r10 = r10 + r9
            if (r0 == 0) goto L_0x0190
            int r10 = r10 + 1
        L_0x0186:
            r5.A03 = r10
            int r8 = r8 + r9
        L_0x0189:
            r5.A01 = r8
            r6.add(r5)
            goto L_0x002b
        L_0x0190:
            r5.A03 = r10
            int r8 = r8 + r9
            int r8 = r8 + 1
            goto L_0x0189
        L_0x0196:
            int r10 = r10 + r9
            goto L_0x0186
        L_0x0198:
            boolean r1 = r2.A03
            if (r1 == 0) goto L_0x019f
            int r1 = r10 + -1
            goto L_0x0175
        L_0x019f:
            r0.A02 = r10
            int r1 = r8 + -1
            goto L_0x0178
        L_0x01a4:
            int r0 = r22.size()
            int r1 = r0 + -1
            r0 = r22
            java.lang.Object r0 = r0.remove(r1)
            X.0TG r0 = (X.AnonymousClass0TG) r0
            goto L_0x016c
        L_0x01b3:
            int r13 = r13 + 2
            goto L_0x0075
        L_0x01b7:
            int r9 = r9 + 1
            goto L_0x0071
        L_0x01bb:
            r0 = r22
            r0.add(r5)
            goto L_0x002b
        L_0x01c2:
            java.lang.String r0 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x01c9:
            java.util.Comparator r1 = A00
            r0 = r24
            java.util.Collections.sort(r0, r1)
            X.0U0 r2 = new X.0U0
            r1 = r0
            r0 = r25
            r2.<init>(r0, r1, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SC.A00(X.0QO):X.0U0");
    }
}
