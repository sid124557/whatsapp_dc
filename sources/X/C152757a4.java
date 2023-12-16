package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.7a4  reason: invalid class name and case insensitive filesystem */
public final class C152757a4 {
    public long A00;
    public C152757a4 A01;
    public C149987Or A02;
    public C166607yy A03;
    public AnonymousClass7NU A04;
    public AnonymousClass7NU A05;
    public boolean A06;
    public boolean A07;
    public final C187418xB A08;
    public final C185778uE A09;
    public final AnonymousClass7FC A0A;
    public final Object A0B;
    public final C184688sM[] A0C;
    public final C185238tJ[] A0D;
    public final boolean[] A0E;

    public long A00(boolean[] zArr, long j, boolean z) {
        AnonymousClass7NU r7;
        AnonymousClass7NU r6;
        int i = 0;
        while (true) {
            r7 = this.A05;
            boolean z2 = true;
            if (i >= r7.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
            if (z || (r6 = this.A04) == null || !Util.A0D(r7.A03[i], r6.A03[i]) || !Util.A0D(r7.A04[i], r6.A04[i])) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        C185238tJ[] r8 = this.A0D;
        this.A04 = r7;
        C187428xC[] r9 = r7.A04;
        long BlB = this.A08.BlB(r8, r9, this.A0E, zArr, j);
        this.A06 = false;
        for (int i2 = 0; i2 < r8.length; i2++) {
            if (r8[i2] != null) {
                C159197lM.A02(AnonymousClass000.A1W(this.A05.A03[i2]));
                this.A06 = true;
            } else {
                C159197lM.A02(AnonymousClass000.A1X(r9[i2]));
            }
        }
        return BlB;
    }

    public void A01() {
        this.A04 = null;
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A09.Biu(((AnonymousClass81S) this.A08).A04);
            } else {
                this.A09.Biu(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int[][][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v149, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v153, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v156, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v193, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v216, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v280, resolved type: int[][]} */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0326, code lost:
        if (r8 == -1) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x034b, code lost:
        if (r8 == -1) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0353, code lost:
        if (r7 == -1) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0359, code lost:
        if (r7 == -1) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x035b, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x07a7, code lost:
        r6 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016d, code lost:
        if ((r1 & r27) == 0) goto L_0x016f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0293 A[LOOP:8: B:54:0x0172->B:131:0x0293, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x028b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0310 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r38 = this;
            r37 = r38
            r0 = r37
            X.7FC r0 = r0.A0A
            r23 = r0
            r0 = r37
            X.8sM[] r12 = r0.A0C
            X.7yy r13 = r0.A03
            r22 = 0
            r0 = r23
            X.6KH r0 = (X.AnonymousClass6KH) r0
            r23 = r0
            int r14 = r12.length
            int r4 = r14 + 1
            int[] r11 = new int[r4]
            X.7yz[][] r10 = new X.C166617yz[r4][]
            int[][][] r2 = new int[r4][][]
            r9 = 0
            r3 = 0
        L_0x0021:
            if (r3 >= r4) goto L_0x0030
            int r1 = r13.A01
            X.7yz[] r0 = new X.C166617yz[r1]
            r10[r3] = r0
            int[][] r0 = new int[r1][]
            r2[r3] = r0
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0030:
            int[] r0 = new int[r14]
            r32 = r0
            r1 = 0
        L_0x0035:
            if (r1 >= r14) goto L_0x0046
            r0 = r12[r1]
            boolean r0 = r0 instanceof X.AnonymousClass6JQ
            if (r0 == 0) goto L_0x0044
            r0 = 8
        L_0x003f:
            r32[r1] = r0
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0044:
            r0 = 0
            goto L_0x003f
        L_0x0046:
            r15 = 0
        L_0x0047:
            int r0 = r13.A01
            if (r15 >= r0) goto L_0x00ba
            X.7yz r8 = X.AnonymousClass6C8.A0V(r13, r15)
            int r1 = r8.A02
            r0 = 5
            boolean r17 = X.AnonymousClass000.A1U(r1, r0)
            r7 = r14
            r6 = 0
            r5 = 0
            r16 = 1
        L_0x005b:
            if (r6 >= r14) goto L_0x008d
            r4 = r12[r6]
            r3 = 0
            r1 = 0
        L_0x0061:
            int r0 = r8.A01
            if (r3 >= r0) goto L_0x0076
            X.7z1[] r0 = r8.A03
            r0 = r0[r3]
            int r0 = r4.BqN(r0)
            r0 = r0 & 7
            int r1 = java.lang.Math.max(r1, r0)
            int r3 = r3 + 1
            goto L_0x0061
        L_0x0076:
            r0 = r11[r6]
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r1 > r5) goto L_0x0086
            if (r1 != r5) goto L_0x008a
            if (r17 == 0) goto L_0x008a
            if (r16 != 0) goto L_0x008a
            if (r0 == 0) goto L_0x008a
        L_0x0086:
            r7 = r6
            r16 = r0
            r5 = r1
        L_0x008a:
            int r6 = r6 + 1
            goto L_0x005b
        L_0x008d:
            if (r7 != r14) goto L_0x00a4
            int r0 = r8.A01
            int[] r5 = new int[r0]
        L_0x0093:
            r1 = r11[r7]
            r0 = r10[r7]
            r0[r1] = r8
            r0 = r2[r7]
            r0[r1] = r5
            int r0 = r1 + 1
            r11[r7] = r0
            int r15 = r15 + 1
            goto L_0x0047
        L_0x00a4:
            r4 = r12[r7]
            int r3 = r8.A01
            int[] r5 = new int[r3]
            r1 = 0
        L_0x00ab:
            if (r1 >= r3) goto L_0x0093
            X.7z1[] r0 = r8.A03
            r0 = r0[r1]
            int r0 = r4.BqN(r0)
            r5[r1] = r0
            int r1 = r1 + 1
            goto L_0x00ab
        L_0x00ba:
            X.7yy[] r5 = new X.C166607yy[r14]
            java.lang.String[] r4 = new java.lang.String[r14]
            int[] r3 = new int[r14]
        L_0x00c0:
            if (r9 >= r14) goto L_0x00fe
            r6 = r11[r9]
            r1 = r10[r9]
            int r0 = r1.length
            boolean r0 = X.AnonymousClass6C8.A1P(r6, r0)
            X.C159197lM.A01(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r6)
            X.7yz[] r1 = (X.C166617yz[]) r1
            X.7yy r0 = new X.7yy
            r0.<init>(r1)
            r5[r9] = r0
            r1 = r2[r9]
            int r0 = r1.length
            boolean r0 = X.AnonymousClass6C8.A1P(r6, r0)
            X.C159197lM.A01(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r6)
            r2[r9] = r0
            r0 = r12[r9]
            java.lang.String r0 = r0.getName()
            r4[r9] = r0
            r0 = r12[r9]
            X.80p r0 = (X.C1673180p) r0
            int r0 = r0.A0B
            r3[r9] = r0
            int r9 = r9 + 1
            goto L_0x00c0
        L_0x00fe:
            r6 = r11[r14]
            r1 = r10[r14]
            int r0 = r1.length
            boolean r0 = X.AnonymousClass6C8.A1P(r6, r0)
            X.C159197lM.A01(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r6)
            X.7yz[] r1 = (X.C166617yz[]) r1
            X.7yy r0 = new X.7yy
            r0.<init>(r1)
            X.7U9 r12 = new X.7U9
            r13 = r0
            r14 = r3
            r15 = r32
            r16 = r5
            r17 = r4
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0 = r23
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r4 = r0.get()
            X.6KG r4 = (X.AnonymousClass6KG) r4
            int r0 = r12.A00
            r36 = r0
            X.8xC[] r3 = new X.C187428xC[r0]
            r6 = 0
            r5 = 0
            r25 = 0
        L_0x0138:
            r18 = 1
            r0 = r36
            if (r5 >= r0) goto L_0x038c
            int[] r0 = r12.A03
            r1 = r0[r5]
            r0 = 2
            if (r0 != r1) goto L_0x037e
            if (r6 != 0) goto L_0x0372
            X.7yy[] r0 = r12.A04
            r31 = r0[r5]
            r30 = r2[r5]
            r1 = r32[r5]
            r0 = r23
            X.7U2 r0 = r0.A01
            r29 = r0
            boolean r0 = r4.A0N
            r28 = r0
            if (r0 != 0) goto L_0x0297
            if (r29 == 0) goto L_0x0297
            boolean r0 = r4.A05
            r27 = 16
            if (r0 == 0) goto L_0x0165
            r27 = 24
        L_0x0165:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x016f
            r1 = r1 & r27
            r26 = 1
            if (r1 != 0) goto L_0x0171
        L_0x016f:
            r26 = 0
        L_0x0171:
            r6 = 0
        L_0x0172:
            r0 = r31
            int r0 = r0.A01
            if (r6 >= r0) goto L_0x0297
            r0 = r31
            X.7yz r1 = X.AnonymousClass6C8.A0V(r0, r6)
            r24 = r30[r6]
            int r0 = r4.A06
            r35 = r0
            int r0 = r4.A05
            r34 = r0
            int r0 = r4.A03
            r33 = r0
            int r10 = r4.A0F
            int r9 = r4.A0E
            boolean r7 = r4.A0P
            boolean r0 = r4.A06
            r21 = r0
            int r0 = r1.A01
            r8 = 2
            if (r0 < r8) goto L_0x0286
            java.util.List r7 = X.AnonymousClass6KH.A00(r1, r10, r9, r7)
            int r0 = r7.size()
            if (r0 < r8) goto L_0x0286
            r20 = 0
            if (r26 != 0) goto L_0x0216
            java.util.HashSet r19 = X.AnonymousClass002.A0K()
            r9 = 0
            r17 = 0
        L_0x01b0:
            int r0 = r7.size()
            if (r9 >= r0) goto L_0x0216
            int r8 = X.AnonymousClass000.A09(r7, r9)
            X.7z1[] r0 = r1.A03
            r16 = r0
            r0 = r0[r8]
            java.lang.String r10 = r0.A0S
            r0 = r19
            boolean r0 = r0.add(r10)
            if (r0 == 0) goto L_0x0213
            r13 = 0
            r11 = 0
        L_0x01cc:
            int r0 = r7.size()
            if (r13 >= r0) goto L_0x020b
            int r0 = X.AnonymousClass000.A09(r7, r13)
            r14 = r16[r0]
            r15 = r24[r0]
            r8 = r15 & 7
            r0 = 4
            if (r8 != r0) goto L_0x0208
            r15 = r15 & r27
            if (r15 == 0) goto L_0x0208
            if (r10 == 0) goto L_0x01ed
            java.lang.String r0 = r14.A0S
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r0, r10)
            if (r0 == 0) goto L_0x0208
        L_0x01ed:
            int r15 = r14.A0I
            r8 = -1
            if (r15 == r8) goto L_0x01f6
            r0 = r35
            if (r15 > r0) goto L_0x0208
        L_0x01f6:
            int r15 = r14.A09
            if (r15 == r8) goto L_0x01fe
            r0 = r34
            if (r15 > r0) goto L_0x0208
        L_0x01fe:
            int r14 = r14.A04
            if (r14 == r8) goto L_0x0206
            r0 = r33
            if (r14 > r0) goto L_0x0208
        L_0x0206:
            int r11 = r11 + 1
        L_0x0208:
            int r13 = r13 + 1
            goto L_0x01cc
        L_0x020b:
            r0 = r17
            if (r11 <= r0) goto L_0x0213
            r17 = r11
            r20 = r10
        L_0x0213:
            int r9 = r9 + 1
            goto L_0x01b0
        L_0x0216:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            int r8 = r7.size()
        L_0x021e:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0262
            int r11 = X.AnonymousClass000.A09(r7, r8)
            X.7z1[] r0 = r1.A03
            r10 = r0[r11]
            r13 = r24[r11]
            r11 = r13 & 7
            r0 = 4
            if (r11 != r0) goto L_0x025b
            r13 = r13 & r27
            if (r13 == 0) goto L_0x025b
            if (r20 == 0) goto L_0x0241
            java.lang.String r11 = r10.A0S
            r0 = r20
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r11, r0)
            if (r0 == 0) goto L_0x025b
        L_0x0241:
            int r13 = r10.A0I
            r11 = -1
            if (r13 == r11) goto L_0x024a
            r0 = r35
            if (r13 > r0) goto L_0x025b
        L_0x024a:
            int r13 = r10.A09
            if (r13 == r11) goto L_0x0252
            r0 = r34
            if (r13 > r0) goto L_0x025b
        L_0x0252:
            int r10 = r10.A04
            if (r10 == r11) goto L_0x021e
            r0 = r33
            if (r10 > r0) goto L_0x025b
            goto L_0x021e
        L_0x025b:
            r7.remove(r8)
            X.C18270x1.A1K(r9, r8)
            goto L_0x021e
        L_0x0262:
            if (r21 == 0) goto L_0x026d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x026d
            r7.addAll(r9)
        L_0x026d:
            int r8 = r7.size()
            r0 = 2
            if (r8 < r0) goto L_0x0286
            int r9 = r7.size()
            int[] r10 = new int[r9]
            r8 = 0
        L_0x027b:
            if (r8 >= r9) goto L_0x0288
            int r0 = X.AnonymousClass000.A09(r7, r8)
            r10[r8] = r0
            int r8 = r8 + 1
            goto L_0x027b
        L_0x0286:
            int[] r10 = X.AnonymousClass6KH.A03
        L_0x0288:
            int r0 = r10.length
            if (r0 <= 0) goto L_0x0293
            r0 = r29
            X.8xC r6 = r0.A00(r1, r10)
            goto L_0x036c
        L_0x0293:
            int r6 = r6 + 1
            goto L_0x0172
        L_0x0297:
            r11 = -1
            r10 = 0
            r24 = 0
            r21 = 0
            r9 = 0
            r8 = -1
            r7 = -1
        L_0x02a0:
            r0 = r31
            int r0 = r0.A01
            if (r10 >= r0) goto L_0x0369
            r0 = r31
            X.7yz r14 = X.AnonymousClass6C8.A0V(r0, r10)
            int r6 = r4.A0F
            int r1 = r4.A0E
            boolean r0 = r4.A0P
            java.util.List r20 = X.AnonymousClass6KH.A00(r14, r6, r1, r0)
            r19 = r30[r10]
            r13 = 0
        L_0x02b9:
            int r0 = r14.A01
            if (r13 >= r0) goto L_0x0365
            r1 = r19[r13]
            boolean r0 = r4.A07
            r6 = r1 & 7
            r1 = 4
            if (r6 == r1) goto L_0x02cb
            if (r0 == 0) goto L_0x0310
            r0 = 3
            if (r6 != r0) goto L_0x0310
        L_0x02cb:
            X.7z1[] r0 = r14.A03
            r6 = r0[r13]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            r0 = r20
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L_0x035d
            int r15 = r6.A0I
            if (r15 == r11) goto L_0x02e3
            int r0 = r4.A06
            if (r15 > r0) goto L_0x035d
        L_0x02e3:
            int r15 = r6.A09
            if (r15 == r11) goto L_0x02eb
            int r0 = r4.A05
            if (r15 > r0) goto L_0x035d
        L_0x02eb:
            int r15 = r6.A04
            if (r15 == r11) goto L_0x02f3
            int r0 = r4.A03
            if (r15 > r0) goto L_0x035d
        L_0x02f3:
            r17 = 1
            r15 = 2
        L_0x02f6:
            r0 = r19[r13]
            r0 = r0 & 7
            r16 = 0
            if (r0 != r1) goto L_0x0302
            r16 = 1
            int r15 = r15 + 1000
        L_0x0302:
            boolean r0 = X.C86624Kv.A1W(r15, r9)
            if (r15 != r9) goto L_0x0314
            if (r28 == 0) goto L_0x0317
            int r1 = r6.A04
            if (r1 != r11) goto L_0x0342
            if (r7 != r11) goto L_0x032f
        L_0x0310:
            int r13 = r13 + 1
            r11 = -1
            goto L_0x02b9
        L_0x0314:
            if (r0 == 0) goto L_0x0310
            goto L_0x032f
        L_0x0317:
            int r1 = r6.A0I
            if (r1 == r11) goto L_0x0321
            int r0 = r6.A09
            if (r0 == r11) goto L_0x0321
            int r11 = r1 * r0
        L_0x0321:
            if (r11 == r8) goto L_0x034e
            r1 = -1
            if (r11 != r1) goto L_0x0348
            if (r8 != r1) goto L_0x0329
        L_0x0328:
            r1 = 0
        L_0x0329:
            if (r16 == 0) goto L_0x0345
            if (r17 == 0) goto L_0x0345
            if (r1 <= 0) goto L_0x0310
        L_0x032f:
            int r7 = r6.A04
            int r0 = r6.A0I
            r8 = -1
            if (r0 == r8) goto L_0x033c
            int r1 = r6.A09
            if (r1 == r8) goto L_0x033c
            int r8 = r0 * r1
        L_0x033c:
            r24 = r14
            r21 = r13
            r9 = r15
            goto L_0x0310
        L_0x0342:
            if (r7 == r11) goto L_0x0310
            int r1 = r1 - r7
        L_0x0345:
            if (r1 >= 0) goto L_0x0310
            goto L_0x032f
        L_0x0348:
            r0 = -1
            int r1 = r11 - r8
            if (r8 != r0) goto L_0x0329
            goto L_0x035b
        L_0x034e:
            int r11 = r6.A04
            r1 = -1
            if (r11 != r1) goto L_0x0356
            if (r7 != r1) goto L_0x0329
            goto L_0x0328
        L_0x0356:
            r0 = -1
            int r1 = r11 - r7
            if (r7 != r0) goto L_0x0329
        L_0x035b:
            r1 = 1
            goto L_0x0329
        L_0x035d:
            r17 = 0
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0310
            r15 = 1
            goto L_0x02f6
        L_0x0365:
            int r10 = r10 + 1
            goto L_0x02a0
        L_0x0369:
            if (r24 != 0) goto L_0x0382
            r6 = 0
        L_0x036c:
            r3[r5] = r6
            boolean r6 = X.AnonymousClass000.A1W(r6)
        L_0x0372:
            X.7yy[] r0 = r12.A04
            r0 = r0[r5]
            int r0 = r0.A01
            if (r0 > 0) goto L_0x037c
            r18 = 0
        L_0x037c:
            r25 = r25 | r18
        L_0x037e:
            int r5 = r5 + 1
            goto L_0x0138
        L_0x0382:
            X.6KD r6 = new X.6KD
            r1 = r21
            r0 = r24
            r6.<init>(r0, r1)
            goto L_0x036c
        L_0x038c:
            r21 = 0
            r5 = 0
            r24 = 0
        L_0x0391:
            r0 = r36
            if (r5 >= r0) goto L_0x057b
            int[] r0 = r12.A03
            r1 = r0[r5]
            r0 = r18
            if (r1 == r0) goto L_0x0484
            r0 = 2
            if (r1 == r0) goto L_0x0571
            r0 = 3
            if (r1 == r0) goto L_0x03f5
            X.7yy[] r0 = r12.A04
            r15 = r0[r5]
            r17 = r2[r5]
            r14 = 0
            r13 = r14
            r11 = 0
            r10 = 0
            r9 = 0
        L_0x03ae:
            int r0 = r15.A01
            if (r11 >= r0) goto L_0x03ea
            X.7yz r8 = X.AnonymousClass6C8.A0V(r15, r11)
            r16 = r17[r11]
            r7 = 0
        L_0x03b9:
            int r0 = r8.A01
            if (r7 >= r0) goto L_0x03e7
            r1 = r16[r7]
            boolean r0 = r4.A07
            r1 = r1 & 7
            r6 = 4
            if (r1 == r6) goto L_0x03cb
            if (r0 == 0) goto L_0x03e4
            r0 = 3
            if (r1 != r0) goto L_0x03e4
        L_0x03cb:
            X.7z1[] r0 = r8.A03
            r0 = r0[r7]
            int r0 = r0.A0G
            r1 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x03d7
            r1 = 2
        L_0x03d7:
            r0 = r16[r7]
            r0 = r0 & 7
            if (r0 != r6) goto L_0x03df
            int r1 = r1 + 1000
        L_0x03df:
            if (r1 <= r9) goto L_0x03e4
            r13 = r8
            r10 = r7
            r9 = r1
        L_0x03e4:
            int r7 = r7 + 1
            goto L_0x03b9
        L_0x03e7:
            int r11 = r11 + 1
            goto L_0x03ae
        L_0x03ea:
            if (r13 == 0) goto L_0x03f1
            X.6KD r14 = new X.6KD
            r14.<init>(r13, r10)
        L_0x03f1:
            r3[r5] = r14
            goto L_0x0571
        L_0x03f5:
            if (r24 != 0) goto L_0x0571
            X.7yy[] r0 = r12.A04
            r13 = r0[r5]
            r20 = r2[r5]
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
        L_0x0401:
            int r0 = r13.A01
            if (r11 >= r0) goto L_0x0568
            X.7yz r7 = X.AnonymousClass6C8.A0V(r13, r11)
            r19 = r20[r11]
            r6 = 0
        L_0x040c:
            int r0 = r7.A01
            if (r6 >= r0) goto L_0x0480
            r0 = r19[r6]
            boolean r14 = r4.A07
            r1 = r0 & 7
            r0 = 4
            if (r1 == r0) goto L_0x041e
            if (r14 == 0) goto L_0x0468
            r0 = 3
            if (r1 != r0) goto L_0x0468
        L_0x041e:
            X.7z1[] r0 = r7.A03
            r14 = r0[r6]
            int r0 = r14.A0G
            int r1 = r4.A00
            int r1 = ~r1
            r0 = r0 & r1
            r15 = r0 & 1
            r1 = 1
            boolean r17 = X.AnonymousClass000.A1S(r15)
            r0 = r0 & 2
            boolean r16 = X.AnonymousClass000.A1S(r0)
            java.util.List r0 = r4.A0K
            boolean r15 = X.AnonymousClass6KH.A02(r14, r0)
            if (r15 != 0) goto L_0x0455
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x0470
            java.lang.String r0 = r14.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0455
            java.lang.String r0 = "und"
            X.6aY r0 = X.C129586aY.of(r0)
            boolean r0 = X.AnonymousClass6KH.A02(r14, r0)
            if (r0 == 0) goto L_0x0470
        L_0x0455:
            if (r17 == 0) goto L_0x046b
            r1 = 8
        L_0x0459:
            int r1 = r1 + r15
        L_0x045a:
            r0 = r19[r6]
            r14 = r0 & 7
            r0 = 4
            if (r14 != r0) goto L_0x0463
            int r1 = r1 + 1000
        L_0x0463:
            if (r1 <= r8) goto L_0x0468
            r10 = r7
            r9 = r6
            r8 = r1
        L_0x0468:
            int r6 = r6 + 1
            goto L_0x040c
        L_0x046b:
            r1 = 4
            if (r16 != 0) goto L_0x0459
            r1 = 6
            goto L_0x0459
        L_0x0470:
            if (r17 == 0) goto L_0x0474
            r1 = 3
            goto L_0x045a
        L_0x0474:
            if (r16 == 0) goto L_0x0468
            java.util.List r0 = r4.A0I
            boolean r0 = X.AnonymousClass6KH.A02(r14, r0)
            if (r0 == 0) goto L_0x045a
            r1 = 2
            goto L_0x045a
        L_0x0480:
            int r11 = r11 + 1
            goto L_0x0401
        L_0x0484:
            if (r21 != 0) goto L_0x0571
            X.7yy[] r0 = r12.A04
            r14 = r0[r5]
            r17 = r2[r5]
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x04d3
            if (r25 == 0) goto L_0x04d3
            r9 = 0
        L_0x0493:
            r13 = 0
            r15 = r13
            r11 = 0
            r10 = -1
            r21 = -1
        L_0x0499:
            int r0 = r14.A01
            if (r11 >= r0) goto L_0x04d8
            X.7yz r8 = X.AnonymousClass6C8.A0V(r14, r11)
            r16 = r17[r11]
            r7 = 0
        L_0x04a4:
            int r0 = r8.A01
            if (r7 >= r0) goto L_0x04d0
            r0 = r16[r7]
            boolean r6 = r4.A07
            r1 = r0 & 7
            r0 = 4
            if (r1 == r0) goto L_0x04b6
            if (r6 == 0) goto L_0x04cd
            r0 = 3
            if (r1 != r0) goto L_0x04cd
        L_0x04b6:
            X.7z1[] r0 = r8.A03
            r6 = r0[r7]
            X.8Lf r1 = new X.8Lf
            r0 = r16[r7]
            r1.<init>(r6, r4, r0)
            if (r15 == 0) goto L_0x04c9
            int r0 = r1.compareTo(r15)
            if (r0 <= 0) goto L_0x04cd
        L_0x04c9:
            r10 = r11
            r21 = r7
            r15 = r1
        L_0x04cd:
            int r7 = r7 + 1
            goto L_0x04a4
        L_0x04d0:
            int r11 = r11 + 1
            goto L_0x0499
        L_0x04d3:
            r0 = r23
            X.7U2 r9 = r0.A01
            goto L_0x0493
        L_0x04d8:
            r0 = -1
            if (r10 == r0) goto L_0x0559
            X.7yz r8 = X.AnonymousClass6C8.A0V(r14, r10)
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x0560
            if (r9 == 0) goto L_0x0560
            r20 = r17[r10]
            boolean r0 = r4.A04
            r19 = r0
            java.util.HashSet r17 = X.AnonymousClass002.A0K()
            r10 = 0
            r26 = r13
            r13 = 0
            r11 = 0
        L_0x04f4:
            int r7 = r8.A01
            if (r13 >= r7) goto L_0x0531
            X.7z1[] r0 = r8.A03
            r16 = r0
            r0 = r0[r13]
            X.7W6 r14 = new X.7W6
            int r6 = r0.A05
            int r1 = r0.A0F
            if (r19 == 0) goto L_0x052e
            r0 = r22
        L_0x0508:
            r14.<init>(r6, r1, r0)
            r0 = r17
            boolean r0 = r0.add(r14)
            if (r0 == 0) goto L_0x052b
            r15 = 0
            r6 = 0
        L_0x0515:
            if (r15 >= r7) goto L_0x0526
            r1 = r16[r15]
            r0 = r20[r15]
            boolean r0 = X.AnonymousClass6KH.A01(r1, r14, r0)
            if (r0 == 0) goto L_0x0523
            int r6 = r6 + 1
        L_0x0523:
            int r15 = r15 + 1
            goto L_0x0515
        L_0x0526:
            if (r6 <= r11) goto L_0x052b
            r11 = r6
            r26 = r14
        L_0x052b:
            int r13 = r13 + 1
            goto L_0x04f4
        L_0x052e:
            java.lang.String r0 = r0.A0S
            goto L_0x0508
        L_0x0531:
            r0 = r18
            if (r11 <= r0) goto L_0x0550
            int[] r6 = new int[r11]
            r13 = 0
        L_0x0538:
            if (r10 >= r7) goto L_0x0552
            X.7z1[] r0 = r8.A03
            r11 = r0[r10]
            r1 = r20[r10]
            r0 = r26
            boolean r0 = X.AnonymousClass6KH.A01(r11, r0, r1)
            if (r0 == 0) goto L_0x054d
            int r0 = r13 + 1
            r6[r13] = r10
            r13 = r0
        L_0x054d:
            int r10 = r10 + 1
            goto L_0x0538
        L_0x0550:
            int[] r6 = X.AnonymousClass6KH.A03
        L_0x0552:
            int r0 = r6.length
            if (r0 <= 0) goto L_0x0560
            X.8xC r13 = r9.A00(r8, r6)
        L_0x0559:
            r3[r5] = r13
            boolean r21 = X.AnonymousClass000.A1W(r13)
            goto L_0x0571
        L_0x0560:
            X.6KD r13 = new X.6KD
            r0 = r21
            r13.<init>(r8, r0)
            goto L_0x0559
        L_0x0568:
            if (r10 != 0) goto L_0x0575
            r0 = 0
        L_0x056b:
            r3[r5] = r0
            boolean r24 = X.AnonymousClass000.A1W(r0)
        L_0x0571:
            int r5 = r5 + 1
            goto L_0x0391
        L_0x0575:
            X.6KD r0 = new X.6KD
            r0.<init>(r10, r9)
            goto L_0x056b
        L_0x057b:
            r5 = 0
            r7 = 0
        L_0x057d:
            r0 = r36
            if (r7 >= r0) goto L_0x05db
            android.util.SparseBooleanArray r0 = r4.A02
            boolean r0 = r0.get(r7)
            if (r0 != 0) goto L_0x05d8
            X.7yy[] r0 = r12.A04
            r9 = r0[r7]
            android.util.SparseArray r1 = r4.A01
            java.lang.Object r0 = r1.get(r7)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x05c4
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L_0x05c4
            java.lang.Object r0 = r1.get(r7)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x05d8
            java.lang.Object r8 = r0.get(r9)
            X.7xr r8 = (X.C165927xr) r8
            if (r8 == 0) goto L_0x05d8
            int r1 = r8.A01
            r0 = r18
            if (r1 != r0) goto L_0x05c7
            int r0 = r8.A00
            X.7yz r6 = X.AnonymousClass6C8.A0V(r9, r0)
            int[] r0 = r8.A02
            r1 = r0[r5]
            X.6KD r0 = new X.6KD
            r0.<init>(r6, r1)
        L_0x05c2:
            r3[r7] = r0
        L_0x05c4:
            int r7 = r7 + 1
            goto L_0x057d
        L_0x05c7:
            r0 = r23
            X.7U2 r6 = r0.A01
            int r0 = r8.A00
            X.7yz r1 = X.AnonymousClass6C8.A0V(r9, r0)
            int[] r0 = r8.A02
            X.8xC r0 = r6.A00(r1, r0)
            goto L_0x05c2
        L_0x05d8:
            r3[r7] = r22
            goto L_0x05c4
        L_0x05db:
            X.7jA[] r6 = new X.C157937jA[r0]
            r7 = 0
        L_0x05de:
            r0 = r36
            if (r7 >= r0) goto L_0x05ff
            android.util.SparseBooleanArray r0 = r4.A02
            boolean r0 = r0.get(r7)
            if (r0 != 0) goto L_0x05fc
            int[] r0 = r12.A03
            r1 = r0[r7]
            r0 = -2
            if (r1 == r0) goto L_0x05f5
            r0 = r3[r7]
            if (r0 == 0) goto L_0x05fc
        L_0x05f5:
            X.7jA r0 = X.C157937jA.A01
        L_0x05f7:
            r6[r7] = r0
            int r7 = r7 + 1
            goto L_0x05de
        L_0x05fc:
            r0 = r22
            goto L_0x05f7
        L_0x05ff:
            int r8 = r4.A00
            if (r8 == 0) goto L_0x0667
            r17 = 0
            r9 = -1
            r7 = -1
            r4 = -1
        L_0x0608:
            r0 = r36
            if (r5 >= r0) goto L_0x0653
            int[] r0 = r12.A03
            r10 = r0[r5]
            r11 = r3[r5]
            r0 = r18
            if (r10 == r0) goto L_0x0619
            r0 = 2
            if (r10 != r0) goto L_0x064a
        L_0x0619:
            if (r11 == 0) goto L_0x064a
            r16 = r2[r5]
            X.7yy[] r0 = r12.A04
            r0 = r0[r5]
            X.81g r11 = (X.C1674881g) r11
            X.7yz r1 = r11.A02
            X.6aY r0 = r0.A02
            int r15 = r0.indexOf(r1)
            if (r15 >= 0) goto L_0x062e
            r15 = -1
        L_0x062e:
            r13 = 0
        L_0x062f:
            int[] r14 = r11.A03
            int r0 = r14.length
            if (r13 >= r0) goto L_0x0643
            r1 = r16[r15]
            r0 = r14[r13]
            r0 = r1[r0]
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x064a
            int r13 = r13 + 1
            goto L_0x062f
        L_0x0643:
            r0 = r18
            if (r10 != r0) goto L_0x064d
            if (r4 != r9) goto L_0x0651
            r4 = r5
        L_0x064a:
            int r5 = r5 + 1
            goto L_0x0608
        L_0x064d:
            if (r7 != r9) goto L_0x0651
            r7 = r5
            goto L_0x064a
        L_0x0651:
            r0 = 0
            goto L_0x0654
        L_0x0653:
            r0 = 1
        L_0x0654:
            if (r4 == r9) goto L_0x065a
            if (r7 == r9) goto L_0x065a
            r17 = 1
        L_0x065a:
            r0 = r0 & r17
            if (r0 == 0) goto L_0x0667
            X.7jA r0 = new X.7jA
            r0.<init>(r8)
            r6[r4] = r0
            r6[r7] = r0
        L_0x0667:
            android.util.Pair r14 = android.util.Pair.create(r6, r3)
            java.lang.Object r3 = r14.second
            X.8gD[] r3 = (X.C177648gD[]) r3
            int r2 = r3.length
            java.util.List[] r0 = new java.util.List[r2]
            r19 = r0
            r1 = 0
        L_0x0675:
            if (r1 >= r2) goto L_0x0689
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0684
            X.6aY r0 = X.C129586aY.of(r0)
        L_0x067f:
            r19[r1] = r0
            int r1 = r1 + 1
            goto L_0x0675
        L_0x0684:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x067f
        L_0x0689:
            X.6aO r15 = new X.6aO
            r15.<init>()
            r13 = 0
        L_0x068f:
            r0 = r36
            if (r13 >= r0) goto L_0x076b
            X.7yy[] r11 = r12.A04
            r10 = r11[r13]
            r17 = r19[r13]
            r9 = 0
        L_0x069a:
            int r0 = r10.A01
            if (r9 >= r0) goto L_0x0767
            X.7yz r8 = X.AnonymousClass6C8.A0V(r10, r9)
            r0 = r11[r13]
            X.7yz r0 = X.AnonymousClass6C8.A0V(r0, r9)
            int r5 = r0.A01
            int[] r4 = new int[r5]
            r3 = 0
            r2 = 0
        L_0x06ae:
            if (r3 >= r5) goto L_0x06c5
            int[][][] r0 = r12.A06
            r0 = r0[r13]
            r0 = r0[r9]
            r0 = r0[r3]
            r1 = r0 & 7
            r0 = 4
            if (r1 != r0) goto L_0x06c2
            int r0 = r2 + 1
            r4[r2] = r3
            r2 = r0
        L_0x06c2:
            int r3 = r3 + 1
            goto L_0x06ae
        L_0x06c5:
            int[] r4 = java.util.Arrays.copyOf(r4, r2)
            r3 = 0
            r2 = 0
            r7 = 0
            r6 = 0
            r1 = 16
        L_0x06cf:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x06ff
            r5 = r4[r3]
            r0 = r11[r13]
            X.7yz r0 = X.AnonymousClass6C8.A0V(r0, r9)
            X.7z1[] r0 = r0.A03
            r0 = r0[r5]
            java.lang.String r0 = r0.A0S
            int r5 = r6 + 1
            if (r6 != 0) goto L_0x06f7
            r2 = r0
        L_0x06e5:
            int[][][] r0 = r12.A06
            r0 = r0[r13]
            r0 = r0[r9]
            r0 = r0[r3]
            r0 = r0 & 24
            int r1 = java.lang.Math.min(r1, r0)
            int r3 = r3 + 1
            r6 = r5
            goto L_0x06cf
        L_0x06f7:
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r2, r0)
            r0 = r0 ^ 1
            r7 = r7 | r0
            goto L_0x06e5
        L_0x06ff:
            if (r7 == 0) goto L_0x0709
            int[] r0 = r12.A02
            r0 = r0[r13]
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0709:
            boolean r16 = X.AnonymousClass000.A1S(r1)
            int r7 = r8.A01
            int[] r6 = new int[r7]
            boolean[] r5 = new boolean[r7]
            r4 = 0
        L_0x0714:
            if (r4 >= r7) goto L_0x0759
            int[][][] r0 = r12.A06
            r0 = r0[r13]
            r0 = r0[r9]
            r0 = r0[r4]
            r0 = r0 & 7
            r6[r4] = r0
            r3 = 0
        L_0x0723:
            int r1 = r17.size()
            r0 = 0
            if (r3 >= r1) goto L_0x074e
            r0 = r17
            java.lang.Object r2 = r0.get(r3)
            X.8gD r2 = (X.C177648gD) r2
            r0 = r2
            X.81g r0 = (X.C1674881g) r0
            X.7yz r0 = r0.A02
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0756
            X.81g r2 = (X.C1674881g) r2
            r1 = 0
        L_0x0740:
            int r0 = r2.A01
            if (r1 >= r0) goto L_0x0756
            int[] r0 = r2.A03
            r0 = r0[r1]
            if (r0 != r4) goto L_0x0753
            r0 = -1
            if (r1 == r0) goto L_0x0756
            r0 = 1
        L_0x074e:
            r5[r4] = r0
            int r4 = r4 + 1
            goto L_0x0714
        L_0x0753:
            int r1 = r1 + 1
            goto L_0x0740
        L_0x0756:
            int r3 = r3 + 1
            goto L_0x0723
        L_0x0759:
            X.80h r1 = new X.80h
            r0 = r16
            r1.<init>(r8, r6, r5, r0)
            r15.add((java.lang.Object) r1)
            int r9 = r9 + 1
            goto L_0x069a
        L_0x0767:
            int r13 = r13 + 1
            goto L_0x068f
        L_0x076b:
            X.7yy r6 = r12.A01
            r5 = 0
        L_0x076e:
            int r0 = r6.A01
            if (r5 >= r0) goto L_0x078b
            X.7yz r4 = X.AnonymousClass6C8.A0V(r6, r5)
            int r0 = r4.A01
            int[] r3 = new int[r0]
            r2 = 0
            java.util.Arrays.fill(r3, r2)
            boolean[] r1 = new boolean[r0]
            X.80h r0 = new X.80h
            r0.<init>(r4, r3, r1, r2)
            r15.add((java.lang.Object) r0)
            int r5 = r5 + 1
            goto L_0x076e
        L_0x078b:
            X.6aY r0 = r15.build()
            X.80f r2 = new X.80f
            r2.<init>(r0)
            java.lang.Object r1 = r14.first
            X.7jA[] r1 = (X.C157937jA[]) r1
            java.lang.Object r0 = r14.second
            X.8xC[] r0 = (X.C187428xC[]) r0
            X.7NU r4 = new X.7NU
            r4.<init>(r2, r12, r1, r0)
            r0 = r37
            X.7NU r7 = r0.A04
            if (r7 == 0) goto L_0x07cd
            X.8xC[] r6 = r7.A04
            int r0 = r6.length
            X.8xC[] r5 = r4.A04
            int r3 = r5.length
            if (r0 != r3) goto L_0x07cd
            r2 = 0
        L_0x07b0:
            if (r2 >= r3) goto L_0x07cf
            X.7jA[] r0 = r4.A03
            r1 = r0[r2]
            X.7jA[] r0 = r7.A03
            r0 = r0[r2]
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            if (r0 == 0) goto L_0x07cd
            r1 = r5[r2]
            r0 = r6[r2]
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            if (r0 == 0) goto L_0x07cd
            int r2 = r2 + 1
            goto L_0x07b0
        L_0x07cd:
            r0 = 0
            goto L_0x07d0
        L_0x07cf:
            r0 = 1
        L_0x07d0:
            r1 = 0
            if (r0 == 0) goto L_0x07d4
            return r1
        L_0x07d4:
            r0 = r37
            r0.A05 = r4
            X.8xC[] r0 = r4.A04
            int r0 = r0.length
        L_0x07db:
            if (r1 >= r0) goto L_0x07e0
            int r1 = r1 + 1
            goto L_0x07db
        L_0x07e0:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152757a4.A02():boolean");
    }

    public C152757a4(C149987Or r7, C185778uE r8, AnonymousClass7FC r9, AnonymousClass7ZV r10, Object obj, C184688sM[] r12, long j) {
        this.A0C = r12;
        long j2 = r7.A03;
        this.A00 = j - j2;
        this.A0A = r9;
        this.A09 = r8;
        obj.getClass();
        this.A0B = obj;
        this.A02 = r7;
        int length = r12.length;
        this.A0D = new C185238tJ[length];
        this.A0E = new boolean[length];
        C187418xB B0v = r8.B0v(r7.A04, r10, j2);
        long j3 = r7.A02;
        this.A08 = j3 != Long.MIN_VALUE ? new AnonymousClass81S(B0v, j3) : B0v;
    }
}
