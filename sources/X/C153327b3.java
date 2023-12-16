package X;

import android.util.Pair;

/* renamed from: X.7b3  reason: invalid class name and case insensitive filesystem */
public final class C153327b3 {
    public long A00;
    public C153327b3 A01;
    public C153047aa A02;
    public C166387yb A03 = C166387yb.A03;
    public AnonymousClass7MD A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C153507bR A08;
    public final C187628xY A09;
    public final AnonymousClass7GA A0A;
    public final Object A0B;
    public final C184858sf[] A0C;
    public final C185338tU[] A0D;
    public final boolean[] A0E;

    public long A01(AnonymousClass7MD r14, boolean[] zArr, long j, boolean z) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= r14.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
            if (!z) {
                AnonymousClass7MD r6 = this.A04;
                if (C162387ry.A0D(r14.A02[i], r6.A02[i]) && C162387ry.A0D(r14.A03[i], r6.A03[i])) {
                    zArr2[i] = z2;
                    i++;
                }
            }
            z2 = false;
            zArr2[i] = z2;
            i++;
        }
        C185338tU[] r7 = this.A0D;
        this.A04 = r14;
        C187628xY r62 = this.A09;
        C187638xZ[] r8 = r14.A03;
        long BlC = r62.BlC(r7, r8, this.A0E, zArr, j);
        this.A06 = false;
        for (int i2 = 0; i2 < r7.length; i2++) {
            if (r7[i2] != null) {
                C161487pm.A04(AnonymousClass000.A1W(r14.A02[i2]));
                this.A06 = true;
            } else {
                C161487pm.A04(AnonymousClass000.A1X(r8[i2]));
            }
        }
        return BlC;
    }

    public long A00() {
        if (!this.A07) {
            return this.A02.A03;
        }
        if (this.A06) {
            long B4y = this.A09.B4y();
            if (B4y != Long.MIN_VALUE) {
                return B4y;
            }
        }
        return this.A02.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: int[][][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.7MC[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.7MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.7MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.7MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v130, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v178, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v181, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v202, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v20, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v248, resolved type: int[][]} */
    /* JADX WARNING: type inference failed for: r2v20, types: [X.6Pg] */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02e3, code lost:
        if (r27 == 0) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b1, code lost:
        if (r10.length > 1) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0165, code lost:
        if ((r1 & r31) == 0) goto L_0x0167;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c8 A[LOOP:8: B:55:0x016a->B:123:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x02aa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7MD A02() {
        /*
            r51 = this;
            r1 = r51
            X.7GA r0 = r1.A0A
            r25 = r0
            X.8sf[] r11 = r1.A0C
            X.7yb r10 = r1.A03
            r0 = r25
            X.6Pk r0 = (X.C126816Pk) r0
            r25 = r0
            int r12 = r11.length
            int r3 = r12 + 1
            int[] r9 = new int[r3]
            X.7ya[][] r8 = new X.C166377ya[r3][]
            int[][][] r0 = new int[r3][][]
            r22 = r0
            r13 = 0
            r2 = 0
        L_0x001d:
            if (r2 >= r3) goto L_0x002c
            int r1 = r10.A01
            X.7ya[] r0 = new X.C166377ya[r1]
            r8[r2] = r0
            int[][] r0 = new int[r1][]
            r22[r2] = r0
            int r2 = r2 + 1
            goto L_0x001d
        L_0x002c:
            int[] r0 = new int[r12]
            r21 = r0
            r1 = 0
        L_0x0031:
            if (r1 >= r12) goto L_0x0042
            r0 = r11[r1]
            boolean r0 = r0 instanceof X.AnonymousClass6OF
            if (r0 == 0) goto L_0x0040
            r0 = 8
        L_0x003b:
            r21[r1] = r0
            int r1 = r1 + 1
            goto L_0x0031
        L_0x0040:
            r0 = 0
            goto L_0x003b
        L_0x0042:
            r14 = 0
        L_0x0043:
            int r0 = r10.A01
            if (r14 >= r0) goto L_0x00bc
            X.7ya[] r0 = r10.A02
            r7 = r0[r14]
            X.7yp[] r0 = r7.A02
            r0 = r0[r13]
            java.lang.String r0 = r0.A0T
            int r1 = X.C162107rG.A00(r0)
            r0 = 5
            boolean r16 = X.AnonymousClass000.A1U(r1, r0)
            r6 = r12
            r5 = 0
            r4 = 0
            r15 = 1
        L_0x005e:
            if (r5 >= r12) goto L_0x008f
            r3 = r11[r5]
            r2 = 0
            r1 = 0
        L_0x0064:
            int r0 = r7.A01
            if (r2 >= r0) goto L_0x0079
            X.7yp[] r0 = r7.A02
            r0 = r0[r2]
            int r0 = r3.BqO(r0)
            r0 = r0 & 7
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0079:
            r0 = r9[r5]
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r1 > r4) goto L_0x0089
            if (r1 != r4) goto L_0x008c
            if (r16 == 0) goto L_0x008c
            if (r15 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x0089:
            r6 = r5
            r15 = r0
            r4 = r1
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x005e
        L_0x008f:
            if (r6 != r12) goto L_0x00a6
            int r0 = r7.A01
            int[] r4 = new int[r0]
        L_0x0095:
            r1 = r9[r6]
            r0 = r8[r6]
            r0[r1] = r7
            r0 = r22[r6]
            r0[r1] = r4
            int r0 = r1 + 1
            r9[r6] = r0
            int r14 = r14 + 1
            goto L_0x0043
        L_0x00a6:
            r3 = r11[r6]
            int r2 = r7.A01
            int[] r4 = new int[r2]
            r1 = 0
        L_0x00ad:
            if (r1 >= r2) goto L_0x0095
            X.7yp[] r0 = r7.A02
            r0 = r0[r1]
            int r0 = r3.BqO(r0)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x00ad
        L_0x00bc:
            X.7yb[] r4 = new X.C166387yb[r12]
            java.lang.String[] r3 = new java.lang.String[r12]
            int[] r2 = new int[r12]
        L_0x00c2:
            if (r13 >= r12) goto L_0x0100
            r5 = r9[r13]
            r1 = r8[r13]
            int r0 = r1.length
            boolean r0 = X.AnonymousClass6C8.A1P(r5, r0)
            X.C161487pm.A03(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            X.7ya[] r1 = (X.C166377ya[]) r1
            X.7yb r0 = new X.7yb
            r0.<init>((X.C166377ya[]) r1)
            r4[r13] = r0
            r1 = r22[r13]
            int r0 = r1.length
            boolean r0 = X.AnonymousClass6C8.A1P(r5, r0)
            X.C161487pm.A03(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r5)
            r22[r13] = r0
            r0 = r11[r13]
            java.lang.String r0 = r0.getName()
            r3[r13] = r0
            r0 = r11[r13]
            X.861 r0 = (X.AnonymousClass861) r0
            int r0 = r0.A09
            r2[r13] = r0
            int r13 = r13 + 1
            goto L_0x00c2
        L_0x0100:
            r5 = r9[r12]
            r1 = r8[r12]
            int r0 = r1.length
            boolean r0 = X.AnonymousClass6C8.A1P(r5, r0)
            X.C161487pm.A03(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            X.7ya[] r1 = (X.C166377ya[]) r1
            X.7yb r0 = new X.7yb
            r0.<init>((X.C166377ya[]) r1)
            X.7UF r9 = new X.7UF
            r10 = r0
            r11 = r2
            r12 = r21
            r13 = r4
            r14 = r3
            r15 = r22
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = r25
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r8 = r0.get()
            X.6Pj r8 = (X.C126806Pj) r8
            int r7 = r9.A00
            X.7MC[] r0 = new X.AnonymousClass7MC[r7]
            r23 = r0
            r6 = 0
            r2 = 0
            r5 = 0
            r27 = 0
        L_0x0139:
            r1 = 2
            r4 = 1
            if (r5 >= r7) goto L_0x02cc
            int[] r0 = r9.A03
            r0 = r0[r5]
            if (r1 != r0) goto L_0x02c1
            if (r2 != 0) goto L_0x02b6
            X.7yb[] r0 = r9.A04
            r3 = r0[r5]
            r20 = r22[r5]
            r1 = r21[r5]
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x0226
            boolean r0 = r8.A0Q
            if (r0 != 0) goto L_0x0226
            boolean r0 = r8.A0L
            r31 = 16
            if (r0 == 0) goto L_0x015d
            r31 = 24
        L_0x015d:
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x0167
            r1 = r1 & r31
            r19 = 1
            if (r1 != 0) goto L_0x0169
        L_0x0167:
            r19 = 0
        L_0x0169:
            r2 = 0
        L_0x016a:
            int r0 = r3.A01
            if (r2 >= r0) goto L_0x0226
            X.7ya[] r0 = r3.A02
            r1 = r0[r2]
            r18 = r20[r2]
            int r0 = r8.A05
            r32 = r0
            int r0 = r8.A04
            r33 = r0
            int r0 = r8.A03
            r34 = r0
            int r0 = r8.A02
            r35 = r0
            int r0 = r8.A09
            r36 = r0
            int r0 = r8.A08
            r37 = r0
            int r0 = r8.A07
            r26 = r0
            int r0 = r8.A06
            r24 = r0
            int r13 = r8.A0B
            int r12 = r8.A0A
            boolean r11 = r8.A0S
            int r0 = r1.A01
            r10 = 2
            if (r0 < r10) goto L_0x02c5
            java.util.List r0 = X.C126816Pk.A01(r1, r13, r12, r11)
            int r11 = r0.size()
            if (r11 < r10) goto L_0x02c5
            r40 = 0
            if (r19 != 0) goto L_0x01f8
            java.util.HashSet r17 = X.AnonymousClass002.A0K()
            r16 = 0
            r11 = 0
        L_0x01b4:
            int r10 = r0.size()
            if (r11 >= r10) goto L_0x01f8
            int r10 = X.AnonymousClass000.A09(r0, r11)
            X.7yp[] r13 = r1.A02
            r10 = r13[r10]
            java.lang.String r15 = r10.A0T
            r10 = r17
            boolean r10 = r10.add(r15)
            if (r10 == 0) goto L_0x01f5
            r10 = 0
            r12 = 0
        L_0x01ce:
            int r14 = r0.size()
            if (r10 >= r14) goto L_0x01ed
            int r14 = X.AnonymousClass000.A09(r0, r10)
            r28 = r13[r14]
            r30 = r18[r14]
            r29 = r15
            r38 = r26
            r39 = r24
            boolean r14 = X.C126816Pk.A02(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            if (r14 == 0) goto L_0x01ea
            int r12 = r12 + 1
        L_0x01ea:
            int r10 = r10 + 1
            goto L_0x01ce
        L_0x01ed:
            r10 = r16
            if (r12 <= r10) goto L_0x01f5
            r16 = r12
            r40 = r15
        L_0x01f5:
            int r11 = r11 + 1
            goto L_0x01b4
        L_0x01f8:
            int r10 = r0.size()
        L_0x01fc:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x029c
            int r12 = X.AnonymousClass000.A09(r0, r10)
            X.7yp[] r11 = r1.A02
            r39 = r11[r12]
            r41 = r18[r12]
            r43 = r32
            r44 = r33
            r45 = r34
            r46 = r35
            r47 = r36
            r48 = r37
            r49 = r26
            r50 = r24
            r42 = r31
            boolean r11 = X.C126816Pk.A02(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            if (r11 != 0) goto L_0x01fc
            r0.remove(r10)
            goto L_0x01fc
        L_0x0226:
            r19 = -1
            r12 = 0
            r18 = r12
            r17 = r12
            r14 = 0
        L_0x022e:
            int r0 = r3.A01
            if (r14 >= r0) goto L_0x028d
            X.7ya[] r0 = r3.A02
            r13 = r0[r14]
            int r2 = r8.A0B
            int r1 = r8.A0A
            boolean r0 = r8.A0S
            java.util.List r11 = X.C126816Pk.A01(r13, r2, r1, r0)
            r16 = r20[r14]
            r10 = 0
        L_0x0243:
            int r0 = r13.A01
            if (r10 >= r0) goto L_0x028a
            X.7yp[] r0 = r13.A02
            r15 = r0[r10]
            int r0 = r15.A0D
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L_0x0276
            r0 = r16[r10]
            boolean r2 = r8.A0N
            r1 = r0 & 7
            r0 = 4
            if (r1 == r0) goto L_0x025f
            if (r2 == 0) goto L_0x0276
            r0 = 3
            if (r1 != r0) goto L_0x0276
        L_0x025f:
            X.8LY r2 = new X.8LY
            r1 = r16[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            boolean r0 = r11.contains(r0)
            r2.<init>(r15, r8, r1, r0)
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0279
            boolean r0 = r8.A0O
            if (r0 != 0) goto L_0x0279
        L_0x0276:
            int r10 = r10 + 1
            goto L_0x0243
        L_0x0279:
            if (r17 == 0) goto L_0x0283
            r0 = r17
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L_0x0276
        L_0x0283:
            r18 = r13
            r19 = r10
            r17 = r2
            goto L_0x0276
        L_0x028a:
            int r14 = r14 + 1
            goto L_0x022e
        L_0x028d:
            if (r18 == 0) goto L_0x02b0
            int[] r2 = new int[r4]
            r2[r6] = r19
            r1 = 0
            X.7MC r12 = new X.7MC
            r0 = r18
            r12.<init>(r0, r1, r2, r6)
            goto L_0x02b0
        L_0x029c:
            int r11 = r0.size()
            r10 = 2
            if (r11 < r10) goto L_0x02c5
            int[] r10 = X.C159357lh.A02(r0)
        L_0x02a7:
            int r0 = r10.length
            if (r0 <= 0) goto L_0x02c8
            r0 = 0
            X.7MC r12 = new X.7MC
            r12.<init>(r1, r0, r10, r6)
        L_0x02b0:
            r23[r5] = r12
            boolean r2 = X.AnonymousClass000.A1W(r12)
        L_0x02b6:
            X.7yb[] r0 = r9.A04
            r0 = r0[r5]
            int r0 = r0.A01
            if (r0 > 0) goto L_0x02bf
            r4 = 0
        L_0x02bf:
            r27 = r27 | r4
        L_0x02c1:
            int r5 = r5 + 1
            goto L_0x0139
        L_0x02c5:
            int[] r10 = X.C126816Pk.A05
            goto L_0x02a7
        L_0x02c8:
            int r2 = r2 + 1
            goto L_0x016a
        L_0x02cc:
            r24 = 0
            r2 = r24
            r28 = r2
            r26 = -1
            r1 = 0
        L_0x02d5:
            if (r1 >= r7) goto L_0x03fe
            int[] r0 = r9.A03
            r0 = r0[r1]
            if (r4 != r0) goto L_0x03f9
            boolean r0 = r8.A0J
            if (r0 != 0) goto L_0x02e5
            r17 = 0
            if (r27 != 0) goto L_0x02e7
        L_0x02e5:
            r17 = 1
        L_0x02e7:
            X.7yb[] r0 = r9.A04
            r13 = r0[r1]
            r16 = r22[r1]
            r21 = r24
            r12 = 0
            r11 = -1
            r4 = -1
        L_0x02f2:
            int r0 = r13.A01
            if (r12 >= r0) goto L_0x0337
            X.7ya[] r0 = r13.A02
            r10 = r0[r12]
            r15 = r16[r12]
            r5 = 0
        L_0x02fd:
            int r0 = r10.A01
            if (r5 >= r0) goto L_0x0334
            r0 = r15[r5]
            boolean r14 = r8.A0N
            r3 = r0 & 7
            r0 = 4
            if (r3 == r0) goto L_0x030f
            if (r14 == 0) goto L_0x0322
            r0 = 3
            if (r3 != r0) goto L_0x0322
        L_0x030f:
            X.7yp[] r0 = r10.A02
            r14 = r0[r5]
            X.8La r3 = new X.8La
            r0 = r15[r5]
            r3.<init>(r14, r8, r0)
            boolean r0 = r3.A0C
            if (r0 != 0) goto L_0x0325
            boolean r0 = r8.A0M
            if (r0 != 0) goto L_0x0325
        L_0x0322:
            int r5 = r5 + 1
            goto L_0x02fd
        L_0x0325:
            if (r21 == 0) goto L_0x032f
            r0 = r21
            int r0 = r3.compareTo(r0)
            if (r0 <= 0) goto L_0x0322
        L_0x032f:
            r11 = r12
            r4 = r5
            r21 = r3
            goto L_0x0322
        L_0x0334:
            int r12 = r12 + 1
            goto L_0x02f2
        L_0x0337:
            r0 = -1
            if (r11 == r0) goto L_0x03f9
            X.7ya[] r0 = r13.A02
            r3 = r0[r11]
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x03b4
            boolean r0 = r8.A0Q
            if (r0 != 0) goto L_0x03b4
            if (r17 == 0) goto L_0x03b4
            r20 = r16[r11]
            int r0 = r8.A00
            r30 = r0
            boolean r0 = r8.A0H
            r19 = r0
            boolean r0 = r8.A0I
            r18 = r0
            boolean r0 = r8.A0G
            r17 = r0
            X.7yp[] r0 = r3.A02
            r16 = r0
            r12 = r0[r4]
            int r0 = r3.A01
            r29 = r0
            int[] r14 = new int[r0]
            r13 = 0
            r11 = 0
        L_0x0368:
            r0 = r29
            if (r13 >= r0) goto L_0x03ab
            if (r13 == r4) goto L_0x03a3
            r15 = r16[r13]
            r0 = r20[r13]
            r5 = r0 & 7
            r0 = 4
            if (r5 != r0) goto L_0x03a8
            int r10 = r15.A05
            r5 = -1
            if (r10 == r5) goto L_0x03a8
            r0 = r30
            if (r10 > r0) goto L_0x03a8
            if (r17 != 0) goto L_0x038a
            int r0 = r15.A06
            if (r0 == r5) goto L_0x03a8
            int r5 = r12.A06
            if (r0 != r5) goto L_0x03a8
        L_0x038a:
            if (r19 != 0) goto L_0x0398
            java.lang.String r5 = r15.A0T
            if (r5 == 0) goto L_0x03a8
            java.lang.String r0 = r12.A0T
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            if (r0 == 0) goto L_0x03a8
        L_0x0398:
            if (r18 != 0) goto L_0x03a3
            int r5 = r15.A0F
            r0 = -1
            if (r5 == r0) goto L_0x03a8
            int r0 = r12.A0F
            if (r5 != r0) goto L_0x03a8
        L_0x03a3:
            int r0 = r11 + 1
            r14[r11] = r13
            r11 = r0
        L_0x03a8:
            int r13 = r13 + 1
            goto L_0x0368
        L_0x03ab:
            int[] r10 = java.util.Arrays.copyOf(r14, r11)
            int r5 = r10.length
            r0 = 1
            if (r5 <= r0) goto L_0x03b4
            goto L_0x03ba
        L_0x03b4:
            int[] r10 = X.C18330xA.A0E()
            r10[r6] = r4
        L_0x03ba:
            X.7MC r4 = new X.7MC
            r0 = r24
            r4.<init>(r3, r0, r10, r6)
            r21.getClass()
            r0 = r21
            android.util.Pair r3 = android.util.Pair.create(r4, r0)
            if (r3 == 0) goto L_0x03f9
            if (r2 == 0) goto L_0x03d8
            java.lang.Object r0 = r3.second
            X.8La r0 = (X.AnonymousClass8La) r0
            int r0 = r0.compareTo(r2)
            if (r0 <= 0) goto L_0x03f9
        L_0x03d8:
            r2 = -1
            r0 = r26
            if (r0 == r2) goto L_0x03df
            r23[r26] = r24
        L_0x03df:
            java.lang.Object r0 = r3.first
            X.7MC r0 = (X.AnonymousClass7MC) r0
            r23[r1] = r0
            X.7ya r4 = r0.A01
            int[] r0 = r0.A03
            r2 = r0[r6]
            X.7yp[] r0 = r4.A02
            r0 = r0[r2]
            java.lang.String r0 = r0.A0S
            r28 = r0
            java.lang.Object r2 = r3.second
            X.8La r2 = (X.AnonymousClass8La) r2
            r26 = r1
        L_0x03f9:
            int r1 = r1 + 1
            r4 = 1
            goto L_0x02d5
        L_0x03fe:
            r1 = r24
            r21 = -1
        L_0x0402:
            if (r6 >= r7) goto L_0x0513
            int[] r0 = r9.A03
            r3 = r0[r6]
            if (r3 == r4) goto L_0x050f
            r0 = 2
            if (r3 == r0) goto L_0x050f
            r2 = 3
            X.7yb[] r0 = r9.A04
            if (r3 == r2) goto L_0x047b
            r20 = r0[r6]
            r19 = r22[r6]
            r11 = 0
            r10 = 0
            r18 = r11
            r5 = r11
            r3 = 0
            r17 = 0
        L_0x041e:
            r0 = r20
            int r0 = r0.A01
            if (r3 >= r0) goto L_0x04fe
            r0 = r20
            X.7ya[] r0 = r0.A02
            r13 = r0[r3]
            r16 = r19[r3]
            r12 = 0
        L_0x042d:
            int r0 = r13.A01
            if (r12 >= r0) goto L_0x0478
            r0 = r16[r12]
            boolean r14 = r8.A0N
            r2 = r0 & 7
            r0 = 4
            if (r2 == r0) goto L_0x043f
            if (r14 == 0) goto L_0x0475
            r0 = 3
            if (r2 != r0) goto L_0x0475
        L_0x043f:
            X.7yp[] r0 = r13.A02
            r14 = r0[r12]
            X.8LU r2 = new X.8LU
            r0 = r16[r12]
            r2.<init>(r14, r0)
            if (r5 == 0) goto L_0x0470
            X.7r4 r14 = X.C162027r4.start()
            boolean r0 = r2.A01
            r26 = r0
            boolean r0 = r5.A01
            r15 = r14
            r14 = r26
            X.7r4 r14 = r15.compareFalseFirst(r14, r0)
            boolean r0 = r2.A00
            r26 = r0
            boolean r0 = r5.A00
            r15 = r14
            r14 = r26
            X.7r4 r0 = r15.compareFalseFirst(r14, r0)
            int r0 = r0.result()
            if (r0 <= 0) goto L_0x0475
        L_0x0470:
            r18 = r13
            r17 = r12
            r5 = r2
        L_0x0475:
            int r12 = r12 + 1
            goto L_0x042d
        L_0x0478:
            int r3 = r3 + 1
            goto L_0x041e
        L_0x047b:
            r15 = r0[r6]
            r19 = r22[r6]
            r18 = -1
            r13 = 0
            r17 = r24
            r12 = r24
            r14 = 0
        L_0x0487:
            int r0 = r15.A01
            if (r14 >= r0) goto L_0x04c8
            X.7ya[] r0 = r15.A02
            r11 = r0[r14]
            r16 = r19[r14]
            r10 = 0
        L_0x0492:
            int r0 = r11.A01
            if (r10 >= r0) goto L_0x04c5
            r0 = r16[r10]
            boolean r3 = r8.A0N
            r2 = r0 & 7
            r0 = 4
            if (r2 == r0) goto L_0x04a4
            if (r3 == 0) goto L_0x04c2
            r0 = 3
            if (r2 != r0) goto L_0x04c2
        L_0x04a4:
            X.7yp[] r0 = r11.A02
            r5 = r0[r10]
            X.8LZ r3 = new X.8LZ
            r2 = r16[r10]
            r0 = r28
            r3.<init>(r5, r8, r0, r2)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x04c2
            if (r12 == 0) goto L_0x04bd
            int r0 = r3.compareTo(r12)
            if (r0 <= 0) goto L_0x04c2
        L_0x04bd:
            r17 = r11
            r18 = r10
            r12 = r3
        L_0x04c2:
            int r10 = r10 + 1
            goto L_0x0492
        L_0x04c5:
            int r14 = r14 + 1
            goto L_0x0487
        L_0x04c8:
            if (r17 == 0) goto L_0x050f
            int[] r5 = new int[r4]
            r5[r13] = r18
            X.7MC r3 = new X.7MC
            r2 = r24
            r0 = r17
            r3.<init>(r0, r2, r5, r13)
            r12.getClass()
            android.util.Pair r2 = android.util.Pair.create(r3, r12)
            if (r2 == 0) goto L_0x050f
            if (r1 == 0) goto L_0x04ec
            java.lang.Object r0 = r2.second
            X.8LZ r0 = (X.AnonymousClass8LZ) r0
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L_0x050f
        L_0x04ec:
            r1 = -1
            r0 = r21
            if (r0 == r1) goto L_0x04f3
            r23[r21] = r24
        L_0x04f3:
            java.lang.Object r0 = r2.first
            r23[r6] = r0
            java.lang.Object r1 = r2.second
            X.8LZ r1 = (X.AnonymousClass8LZ) r1
            r21 = r6
            goto L_0x050f
        L_0x04fe:
            if (r18 == 0) goto L_0x050d
            int[] r3 = new int[r4]
            r3[r10] = r17
            X.7MC r11 = new X.7MC
            r2 = r18
            r0 = r24
            r11.<init>(r2, r0, r3, r10)
        L_0x050d:
            r23[r6] = r11
        L_0x050f:
            int r6 = r6 + 1
            goto L_0x0402
        L_0x0513:
            r5 = 0
        L_0x0514:
            r6 = 0
            if (r5 >= r7) goto L_0x055d
            android.util.SparseBooleanArray r0 = r8.A0D
            boolean r0 = r0.get(r5)
            if (r0 != 0) goto L_0x0558
            X.7yb[] r0 = r9.A04
            r2 = r0[r5]
            android.util.SparseArray r1 = r8.A0C
            java.lang.Object r0 = r1.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x055a
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x055a
            java.lang.Object r0 = r1.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0558
            java.lang.Object r4 = r0.get(r2)
            X.7xs r4 = (X.C165937xs) r4
            if (r4 == 0) goto L_0x0558
            int r1 = r4.A01
            X.7ya[] r0 = r2.A02
            r3 = r0[r1]
            int[] r2 = r4.A03
            int r1 = r4.A02
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.7MC r6 = new X.7MC
            r6.<init>(r3, r0, r2, r1)
        L_0x0558:
            r23[r5] = r6
        L_0x055a:
            int r5 = r5 + 1
            goto L_0x0514
        L_0x055d:
            r0 = r25
            X.8hA r3 = r0.A01
            X.8hG r0 = r0.A01
            r25 = r0
            r25.getClass()
            X.88Q r3 = (X.AnonymousClass88Q) r3
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r2 = 0
            r10 = 0
        L_0x0570:
            r0 = 0
            r5 = 1
            if (r10 >= r7) goto L_0x0592
            r4 = r23[r10]
            if (r4 == 0) goto L_0x0590
            int[] r4 = r4.A03
            int r4 = r4.length
            if (r4 <= r5) goto L_0x0590
            X.6aO r5 = X.C129586aY.builder()
            X.7Vd r4 = new X.7Vd
            r4.<init>(r0, r0)
            r5.add((java.lang.Object) r4)
        L_0x058a:
            r6.add(r5)
            int r10 = r10 + 1
            goto L_0x0570
        L_0x0590:
            r5 = 0
            goto L_0x058a
        L_0x0592:
            long[][] r11 = new long[r7][]
            r10 = 0
            r5 = 0
        L_0x0596:
            if (r5 >= r7) goto L_0x05c8
            r12 = r23[r5]
            if (r12 != 0) goto L_0x05a3
            long[] r0 = new long[r2]
            r11[r5] = r0
        L_0x05a0:
            int r5 = r5 + 1
            goto L_0x0596
        L_0x05a3:
            int[] r0 = r12.A03
            int r0 = r0.length
            long[] r0 = new long[r0]
            r11[r5] = r0
            r4 = 0
        L_0x05ab:
            int[] r1 = r12.A03
            int r0 = r1.length
            if (r4 >= r0) goto L_0x05c2
            r13 = r11[r5]
            X.7ya r0 = r12.A01
            r1 = r1[r4]
            X.7yp[] r0 = r0.A02
            r0 = r0[r1]
            int r0 = r0.A05
            long r0 = (long) r0
            r13[r4] = r0
            int r4 = r4 + 1
            goto L_0x05ab
        L_0x05c2:
            r0 = r11[r5]
            java.util.Arrays.sort(r0)
            goto L_0x05a0
        L_0x05c8:
            int[] r0 = new int[r7]
            r21 = r0
            long[] r12 = new long[r7]
            r4 = 0
        L_0x05cf:
            if (r4 >= r7) goto L_0x05e0
            r1 = r11[r4]
            int r0 = r1.length
            if (r0 != 0) goto L_0x05dd
            r0 = 0
        L_0x05d8:
            r12[r4] = r0
            int r4 = r4 + 1
            goto L_0x05cf
        L_0x05dd:
            r0 = r1[r2]
            goto L_0x05d8
        L_0x05e0:
            X.C126786Ph.A00(r6, r12)
            X.7XX r0 = X.C161807qY.treeKeys()
            X.6at r0 = r0.arrayListValues()
            X.8y1 r20 = r0.build()
        L_0x05ef:
            if (r10 >= r7) goto L_0x0646
            r4 = r11[r10]
            int r1 = r4.length
            r0 = 1
            if (r1 <= r0) goto L_0x0643
            int r15 = r4.length
            double[] r13 = new double[r15]
            r14 = 0
        L_0x05fb:
            r1 = r11[r10]
            int r0 = r1.length
            r18 = 0
            if (r14 >= r0) goto L_0x0614
            r4 = r1[r14]
            r16 = -1
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x060f
            double r0 = (double) r4
            double r18 = java.lang.Math.log(r0)
        L_0x060f:
            r13[r14] = r18
            int r14 = r14 + 1
            goto L_0x05fb
        L_0x0614:
            int r5 = r15 + -1
            r16 = r13[r5]
            r0 = r13[r2]
            double r16 = r16 - r0
            r4 = 0
        L_0x061d:
            if (r4 >= r5) goto L_0x0643
            r14 = r13[r4]
            int r4 = r4 + 1
            r0 = r13[r4]
            double r14 = r14 + r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r14 * r0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x063d
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x062f:
            java.lang.Double r14 = java.lang.Double.valueOf(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0 = r20
            r0.put(r14, r1)
            goto L_0x061d
        L_0x063d:
            r0 = r13[r2]
            double r14 = r14 - r0
            double r14 = r14 / r16
            goto L_0x062f
        L_0x0643:
            int r10 = r10 + 1
            goto L_0x05ef
        L_0x0646:
            java.util.Collection r0 = r20.values()
            X.6aY r10 = X.C129586aY.copyOf((java.util.Collection) r0)
            r5 = 0
        L_0x064f:
            int r0 = r10.size()
            if (r5 >= r0) goto L_0x066b
            int r4 = X.AnonymousClass000.A09(r10, r5)
            r0 = r21[r4]
            int r1 = r0 + 1
            r21[r4] = r1
            r0 = r11[r4]
            r0 = r0[r1]
            r12[r4] = r0
            X.C126786Ph.A00(r6, r12)
            int r5 = r5 + 1
            goto L_0x064f
        L_0x066b:
            r10 = 0
        L_0x066c:
            if (r10 >= r7) goto L_0x067e
            java.lang.Object r0 = r6.get(r10)
            if (r0 == 0) goto L_0x067b
            r4 = r12[r10]
            r0 = 2
            long r4 = r4 * r0
            r12[r10] = r4
        L_0x067b:
            int r10 = r10 + 1
            goto L_0x066c
        L_0x067e:
            X.C126786Ph.A00(r6, r12)
            X.6aO r1 = X.C129586aY.builder()
        L_0x0685:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x06a2
            java.lang.Object r0 = r6.get(r2)
            X.6aO r0 = (X.C129486aO) r0
            if (r0 != 0) goto L_0x069d
            X.6aY r0 = X.C129586aY.of()
        L_0x0697:
            r1.add((java.lang.Object) r0)
            int r2 = r2 + 1
            goto L_0x0685
        L_0x069d:
            X.6aY r0 = r0.build()
            goto L_0x0697
        L_0x06a2:
            X.6aY r6 = r1.build()
            X.8xZ[] r11 = new X.C187638xZ[r7]
            r12 = 0
            r5 = 0
        L_0x06aa:
            if (r5 >= r7) goto L_0x06e1
            r2 = r23[r5]
            if (r2 == 0) goto L_0x06c6
            int[] r10 = r2.A03
            int r0 = r10.length
            if (r0 == 0) goto L_0x06c6
            int r1 = r10.length
            r0 = 1
            X.7ya r4 = r2.A01
            if (r1 != r0) goto L_0x06c9
            r1 = r10[r12]
            java.lang.Object r0 = r2.A02
            X.6Pg r2 = new X.6Pg
            r2.<init>(r4, r0, r1)
        L_0x06c4:
            r11[r5] = r2
        L_0x06c6:
            int r5 = r5 + 1
            goto L_0x06aa
        L_0x06c9:
            java.lang.Object r1 = r6.get(r5)
            X.6aY r1 = (X.C129586aY) r1
            X.8vk r0 = r3.A00
            X.6Ph r2 = new X.6Ph
            r13 = r2
            r14 = r4
            r15 = r25
            r16 = r0
            r17 = r1
            r18 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x06c4
        L_0x06e1:
            X.7jC[] r10 = new X.C157957jC[r7]
            r2 = 0
        L_0x06e4:
            if (r2 >= r7) goto L_0x0703
            android.util.SparseBooleanArray r0 = r8.A0D
            boolean r0 = r0.get(r2)
            if (r0 != 0) goto L_0x0700
            int[] r0 = r9.A03
            r1 = r0[r2]
            r0 = 7
            if (r1 == r0) goto L_0x06f9
            r0 = r11[r2]
            if (r0 == 0) goto L_0x0700
        L_0x06f9:
            X.7jC r0 = X.C157957jC.A01
        L_0x06fb:
            r10[r2] = r0
            int r2 = r2 + 1
            goto L_0x06e4
        L_0x0700:
            r0 = r24
            goto L_0x06fb
        L_0x0703:
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x076d
            r13 = -1
            r17 = 0
            r14 = 0
            r12 = -1
            r8 = -1
        L_0x070d:
            r6 = 1
            if (r14 >= r7) goto L_0x0757
            int[] r0 = r9.A03
            r5 = r0[r14]
            r4 = r11[r14]
            if (r5 == r6) goto L_0x071b
            r0 = 2
            if (r5 != r0) goto L_0x0750
        L_0x071b:
            if (r4 == 0) goto L_0x0750
            r16 = r22[r14]
            X.7yb[] r0 = r9.A04
            r2 = r0[r14]
            X.88R r4 = (X.AnonymousClass88R) r4
            X.7ya r1 = r4.A02
            r3 = 0
        L_0x0728:
            int r0 = r2.A01
            if (r3 >= r0) goto L_0x0735
            X.7ya[] r0 = r2.A02
            r0 = r0[r3]
            if (r0 == r1) goto L_0x0736
            int r3 = r3 + 1
            goto L_0x0728
        L_0x0735:
            r3 = -1
        L_0x0736:
            r2 = 0
        L_0x0737:
            int[] r15 = r4.A03
            int r0 = r15.length
            if (r2 >= r0) goto L_0x074b
            r1 = r16[r3]
            r0 = r15[r2]
            r0 = r1[r0]
            r1 = r0 & 32
            r0 = 32
            if (r1 != r0) goto L_0x0750
            int r2 = r2 + 1
            goto L_0x0737
        L_0x074b:
            if (r5 != r6) goto L_0x0753
            if (r8 != r13) goto L_0x0759
            r8 = r14
        L_0x0750:
            int r14 = r14 + 1
            goto L_0x070d
        L_0x0753:
            if (r12 != r13) goto L_0x0759
            r12 = r14
            goto L_0x0750
        L_0x0757:
            r0 = 1
            goto L_0x075a
        L_0x0759:
            r0 = 0
        L_0x075a:
            if (r8 == r13) goto L_0x0760
            if (r12 == r13) goto L_0x0760
            r17 = 1
        L_0x0760:
            r0 = r0 & r17
            if (r0 == 0) goto L_0x076d
            X.7jC r0 = new X.7jC
            r0.<init>(r6)
            r10[r8] = r0
            r10[r12] = r0
        L_0x076d:
            android.util.Pair r0 = android.util.Pair.create(r10, r11)
            java.lang.Object r1 = r0.first
            X.7jC[] r1 = (X.C157957jC[]) r1
            java.lang.Object r0 = r0.second
            X.8xZ[] r0 = (X.C187638xZ[]) r0
            X.7MD r2 = new X.7MD
            r2.<init>(r9, r1, r0)
            X.8xZ[] r0 = r2.A03
            int r1 = r0.length
            r0 = 0
        L_0x0782:
            if (r0 >= r1) goto L_0x0787
            int r0 = r0 + 1
            goto L_0x0782
        L_0x0787:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153327b3.A02():X.7MD");
    }

    public void A03() {
        long j = this.A02.A01;
        C153507bR r6 = this.A08;
        C187628xY r5 = this.A09;
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            r6.A06(r5);
            return;
        }
        try {
            r6.A06(((C1690087p) r5).A04);
        } catch (RuntimeException e) {
            C159307lc.A02("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public C153327b3(C153047aa r9, C153507bR r10, AnonymousClass7GA r11, AnonymousClass7MD r12, C183888qp r13, C184858sf[] r14, long j) {
        this.A0C = r14;
        this.A00 = j;
        this.A0A = r11;
        this.A08 = r10;
        AnonymousClass6PS r6 = r9.A04;
        Object obj = r6.A04;
        this.A0B = obj;
        this.A02 = r9;
        this.A04 = r12;
        int length = r14.length;
        this.A0D = new C185338tU[length];
        this.A0E = new boolean[length];
        long j2 = r9.A03;
        long j3 = r9.A01;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        AnonymousClass6PS A002 = r6.A00(pair.second);
        Object obj3 = r10.A09.get(obj2);
        obj3.getClass();
        C1685385u r62 = (C1685385u) obj3;
        r10.A0A.add(r62);
        AnonymousClass7JW r4 = (AnonymousClass7JW) r10.A06.get(r62);
        if (r4 != null) {
            r4.A01.B2M(r4.A00);
        }
        r62.A04.add(A002);
        C187628xY A042 = r62.A02.B0w(A002, r13, j2);
        r10.A07.put(A042, r62);
        r10.A02();
        if (!(j3 == -9223372036854775807L || j3 == Long.MIN_VALUE)) {
            A042 = new C1690087p(A042, j3);
        }
        this.A09 = A042;
    }
}
