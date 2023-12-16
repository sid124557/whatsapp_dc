package X;

/* renamed from: X.7nP  reason: invalid class name and case insensitive filesystem */
public class C160307nP {
    public static C160307nP A07;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C158197ja A04;
    public C151067Th A05;
    public final C186588vc A06;

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03e3, code lost:
        if (r50 != null) goto L_0x03e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0360 A[LOOP:8: B:142:0x0358->B:144:0x0360, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x038a A[LOOP:9: B:146:0x0384->B:148:0x038a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02a5 A[EDGE_INSN: B:178:0x02a5->B:115:0x02a5 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate A00(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r50) {
        /*
            r49 = this;
            r33 = r49
            monitor-enter(r33)
            r0 = r33
            X.7Th r13 = r0.A05     // Catch:{ all -> 0x03ee }
            monitor-enter(r13)     // Catch:{ all -> 0x03ee }
            r13.A00()     // Catch:{ all -> 0x03eb }
            boolean r0 = r13.A03     // Catch:{ all -> 0x03eb }
            if (r0 != 0) goto L_0x0013
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = r13.A00     // Catch:{ all -> 0x03eb }
            goto L_0x03e8
        L_0x0013:
            java.util.Deque r0 = r13.A01     // Catch:{ all -> 0x03eb }
            r35 = r0
            boolean r0 = r35.isEmpty()     // Catch:{ all -> 0x03eb }
            if (r0 != 0) goto L_0x03da
            java.util.Deque r0 = r13.A02     // Catch:{ all -> 0x03eb }
            r34 = r0
            boolean r0 = r34.isEmpty()     // Catch:{ all -> 0x03eb }
            if (r0 != 0) goto L_0x03da
            r48 = r50
            if (r50 == 0) goto L_0x01ea
            boolean r0 = r48.shouldUseLowPassEMAForBWEstimation()     // Catch:{ all -> 0x03eb }
            if (r0 == 0) goto L_0x01ea
            java.util.Iterator r5 = r35.iterator()     // Catch:{ all -> 0x03d8 }
            r16 = 0
            r20 = 0
            r3 = r16
            r11 = 0
            r0 = 0
        L_0x003f:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x03d8 }
            X.6L2 r4 = (X.AnonymousClass6L2) r4     // Catch:{ all -> 0x03d8 }
            if (r3 == 0) goto L_0x0055
            long r2 = r4.A01     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r2     // Catch:{ all -> 0x03d8 }
            double r2 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03d8 }
            double r11 = r11 + r2
        L_0x0055:
            r3 = r4
            goto L_0x003f
        L_0x0057:
            int r2 = r35.size()     // Catch:{ all -> 0x03d8 }
            r5 = 1
            if (r2 <= r5) goto L_0x006a
            double r2 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03d8 }
            double r11 = r11 - r2
            int r2 = r35.size()     // Catch:{ all -> 0x03d8 }
            int r2 = r2 - r5
            double r2 = (double) r2     // Catch:{ all -> 0x03d8 }
            double r11 = r11 / r2
        L_0x006a:
            int r4 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r4 >= 0) goto L_0x0073
            double r14 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x03d8 }
            goto L_0x0077
        L_0x0073:
            double r14 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x03d8 }
        L_0x0077:
            boolean r2 = r48.shouldUseLowPassEMAAsymmetryForBWEstimation()     // Catch:{ all -> 0x03d8 }
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r2 == 0) goto L_0x0089
            double r9 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x03d8 }
            double r2 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x03d8 }
            double r9 = r9 / r2
            goto L_0x008b
        L_0x0089:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x008b:
            int r2 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x009d
            if (r4 >= 0) goto L_0x0093
            r2 = r9
            goto L_0x0095
        L_0x0093:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0095:
            double r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03d8 }
            double r0 = r0 / r11
            double r2 = r2 + r0
            double r6 = r6 / r2
            double r14 = r14 * r6
        L_0x009d:
            java.util.Iterator r8 = r34.iterator()     // Catch:{ all -> 0x03d8 }
            r6 = 0
            r2 = 0
        L_0x00a5:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x00be
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x03d8 }
            X.6L3 r4 = (X.AnonymousClass6L3) r4     // Catch:{ all -> 0x03d8 }
            if (r16 == 0) goto L_0x00bb
            long r0 = r4.A00     // Catch:{ all -> 0x03d8 }
            double r2 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x03d8 }
            double r6 = r6 + r0
        L_0x00bb:
            r16 = r4
            goto L_0x00a5
        L_0x00be:
            int r0 = r34.size()     // Catch:{ all -> 0x03d8 }
            if (r0 <= r5) goto L_0x00d0
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x03d8 }
            double r6 = r6 - r0
            int r0 = r34.size()     // Catch:{ all -> 0x03d8 }
            int r0 = r0 - r5
            double r0 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r6 = r6 / r0
        L_0x00d0:
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d9
            double r18 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x03d8 }
            goto L_0x00dd
        L_0x00d9:
            double r18 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x03d8 }
        L_0x00dd:
            boolean r0 = r48.shouldUseLowPassEMAAsymmetryForBWEstimation()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x00ec
            double r9 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x03d8 }
            double r0 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x03d8 }
            double r9 = r9 / r0
        L_0x00ec:
            int r0 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            if (r4 >= 0) goto L_0x00f4
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x00f4:
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x03d8 }
            double r0 = r0 / r6
            double r9 = r9 + r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 / r9
            double r18 = r18 * r0
        L_0x00ff:
            java.lang.Object r6 = r35.peekLast()     // Catch:{ all -> 0x03d8 }
            X.6L2 r6 = (X.AnonymousClass6L2) r6     // Catch:{ all -> 0x03d8 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r14
            r6.getClass()     // Catch:{ all -> 0x03d8 }
            r0 = 0
            double r4 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r2 = r2 * r4
            long r6 = r6.A00     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r6     // Catch:{ all -> 0x03d8 }
            double r0 = r0 * r14
            double r2 = r2 + r0
            long r8 = (long) r2     // Catch:{ all -> 0x03d8 }
            java.lang.Object r0 = r34.peekLast()     // Catch:{ all -> 0x03d8 }
            X.6L3 r0 = (X.AnonymousClass6L3) r0     // Catch:{ all -> 0x03d8 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r18
            r0.getClass()     // Catch:{ all -> 0x03d8 }
            double r2 = r2 * r4
            long r4 = r0.A01     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r4     // Catch:{ all -> 0x03d8 }
            double r0 = r0 * r18
            double r2 = r2 + r0
            long r6 = (long) r2     // Catch:{ all -> 0x03d8 }
            java.util.Iterator r12 = r35.iterator()     // Catch:{ all -> 0x03d8 }
            r4 = 0
        L_0x0130:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x03d8 }
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x03d8 }
            X.6L2 r0 = (X.AnonymousClass6L2) r0     // Catch:{ all -> 0x03d8 }
            long r0 = r0.A00     // Catch:{ all -> 0x03d8 }
            long r0 = r0 - r8
            long r0 = r0 / r10
            double r2 = (double) r0     // Catch:{ all -> 0x03d8 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x03d8 }
            double r20 = r20 + r4
            goto L_0x0130
        L_0x014c:
            int r0 = r35.size()     // Catch:{ all -> 0x03d8 }
            r1 = 1
            if (r0 <= r1) goto L_0x015d
            double r20 = r20 - r4
            int r0 = r35.size()     // Catch:{ all -> 0x03d8 }
            int r0 = r0 - r1
            double r0 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r20 = r20 / r0
        L_0x015d:
            double r1 = r48.getMaxAlphaLowPassEMABwVol()     // Catch:{ all -> 0x03d8 }
            r16 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x016b
            r14 = r1
        L_0x016b:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r14
            double r2 = java.lang.Math.sqrt(r20)     // Catch:{ all -> 0x03d8 }
            double r0 = r0 * r2
            double r2 = java.lang.Math.sqrt(r4)     // Catch:{ all -> 0x03d8 }
            double r14 = r14 * r2
            double r0 = r0 + r14
            long r4 = (long) r0     // Catch:{ all -> 0x03d8 }
            long r4 = r4 * r10
            java.util.Iterator r12 = r34.iterator()     // Catch:{ all -> 0x03d8 }
            r14 = 0
            r10 = 0
        L_0x0183:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x03d8 }
            X.6L3 r0 = (X.AnonymousClass6L3) r0     // Catch:{ all -> 0x03d8 }
            long r0 = r0.A01     // Catch:{ all -> 0x03d8 }
            long r0 = r0 - r6
            double r2 = (double) r0     // Catch:{ all -> 0x03d8 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x03d8 }
            double r10 = r10 + r14
            goto L_0x0183
        L_0x019b:
            int r0 = r34.size()     // Catch:{ all -> 0x03d8 }
            r1 = 1
            if (r0 <= r1) goto L_0x01aa
            double r10 = r10 - r14
            int r0 = r34.size()     // Catch:{ all -> 0x03d8 }
            int r0 = r0 - r1
            double r0 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r10 = r10 / r0
        L_0x01aa:
            double r1 = r48.getMaxAlphaLowPassEMATtfbVol()     // Catch:{ all -> 0x03d8 }
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b4
            r18 = r1
        L_0x01b4:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r18
            double r0 = java.lang.Math.sqrt(r10)     // Catch:{ all -> 0x03d8 }
            double r2 = r2 * r0
            double r0 = java.lang.Math.sqrt(r14)     // Catch:{ all -> 0x03d8 }
            double r18 = r18 * r0
            double r2 = r2 + r18
            long r0 = (long) r2     // Catch:{ all -> 0x03d8 }
            r37 = 1000(0x3e8, double:4.94E-321)
            int r3 = r35.size()     // Catch:{ all -> 0x03d8 }
            int r2 = r34.size()     // Catch:{ all -> 0x03d8 }
            int r3 = r3 + r2
            int r3 = r3 / 2
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x03d8 }
            r34 = r2
            r35 = r6
            r39 = r0
            r41 = r8
            r43 = r37
            r45 = r4
            r47 = r3
            r34.<init>(r35, r37, r39, r41, r43, r45, r47, r48)     // Catch:{ all -> 0x03d8 }
            r13.A00 = r2     // Catch:{ all -> 0x03d8 }
            goto L_0x03e5
        L_0x01ea:
            int r0 = r34.size()     // Catch:{ all -> 0x03d8 }
            double[] r0 = new double[r0]     // Catch:{ all -> 0x03d8 }
            r32 = r0
            int r0 = r35.size()     // Catch:{ all -> 0x03d8 }
            double[] r0 = new double[r0]     // Catch:{ all -> 0x03d8 }
            r31 = r0
            if (r50 == 0) goto L_0x0225
            boolean r0 = r48.shouldUseLowPassWithWeightedEMAForBWEstimation()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0225
            r20 = 1
            r6 = 0
            java.util.Iterator r2 = r35.iterator()     // Catch:{ all -> 0x03d8 }
            r4 = 0
        L_0x020c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0220
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x03d8 }
            X.6L2 r0 = (X.AnonymousClass6L2) r0     // Catch:{ all -> 0x03d8 }
            long r0 = r0.A01     // Catch:{ all -> 0x03d8 }
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03d8 }
            long r4 = r4 + r0
            goto L_0x020c
        L_0x0220:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0227
            goto L_0x022a
        L_0x0225:
            r20 = 0
        L_0x0227:
            r4 = 1
            goto L_0x0230
        L_0x022a:
            int r0 = r35.size()     // Catch:{ all -> 0x03d8 }
            long r0 = (long) r0     // Catch:{ all -> 0x03d8 }
            long r4 = r4 / r0
        L_0x0230:
            long r29 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03d8 }
            java.util.Iterator r17 = r35.iterator()     // Catch:{ all -> 0x03d8 }
            r11 = 0
            r27 = 0
            r16 = 0
        L_0x023e:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x03d8 }
            r25 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r8 = r17.next()     // Catch:{ all -> 0x03d8 }
            X.6L2 r8 = (X.AnonymousClass6L2) r8     // Catch:{ all -> 0x03d8 }
            long r2 = r8.A00     // Catch:{ all -> 0x03d8 }
            long r0 = r29 - r2
            double r6 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r6 = r6 / r25
            if (r20 == 0) goto L_0x0276
            long r0 = r8.A01     // Catch:{ all -> 0x03d8 }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x026a
            r48.getClass()     // Catch:{ all -> 0x03d8 }
            double r9 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x03d8 }
            goto L_0x0271
        L_0x026a:
            r48.getClass()     // Catch:{ all -> 0x03d8 }
            double r9 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x03d8 }
        L_0x0271:
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0284
            goto L_0x0279
        L_0x0276:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0284
        L_0x0279:
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03d8 }
            double r2 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r4     // Catch:{ all -> 0x03d8 }
            double r2 = r2 / r0
            double r2 = r2 + r23
            double r23 = r23 / r2
        L_0x0284:
            r0 = -4631501856787818086(0xbfb999999999999a, double:-0.1)
            double r6 = r6 * r0
            double r6 = java.lang.Math.exp(r6)     // Catch:{ all -> 0x03d8 }
            long r2 = r8.A01     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r2     // Catch:{ all -> 0x03d8 }
            double r6 = r6 * r0
            double r6 = r6 * r23
            double r6 = r6 * r9
            long r2 = r8.A00     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r2     // Catch:{ all -> 0x03d8 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x03d8 }
            double r0 = r0 * r6
            double r27 = r27 + r0
            double r11 = r11 + r6
            r31[r16] = r6     // Catch:{ all -> 0x03d8 }
            int r16 = r16 + 1
            goto L_0x023e
        L_0x02a5:
            if (r20 == 0) goto L_0x02c8
            java.util.Iterator r2 = r34.iterator()     // Catch:{ all -> 0x03d8 }
            r4 = 0
        L_0x02ad:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x03d8 }
            X.6L3 r0 = (X.AnonymousClass6L3) r0     // Catch:{ all -> 0x03d8 }
            long r0 = r0.A00     // Catch:{ all -> 0x03d8 }
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03d8 }
            long r4 = r4 + r0
            goto L_0x02ad
        L_0x02c1:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c8
            goto L_0x02cb
        L_0x02c8:
            r4 = 1
            goto L_0x02d1
        L_0x02cb:
            int r0 = r34.size()     // Catch:{ all -> 0x03d8 }
            long r0 = (long) r0     // Catch:{ all -> 0x03d8 }
            long r4 = r4 / r0
        L_0x02d1:
            java.util.Iterator r19 = r34.iterator()     // Catch:{ all -> 0x03d8 }
            r6 = 0
            r18 = 0
            r21 = 0
        L_0x02db:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0341
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x03d8 }
            X.6L3 r10 = (X.AnonymousClass6L3) r10     // Catch:{ all -> 0x03d8 }
            long r2 = r10.A00     // Catch:{ all -> 0x03d8 }
            long r0 = r29 - r2
            double r8 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r8 = r8 / r25
            if (r20 == 0) goto L_0x0311
            r20 = 1
            long r0 = r10.A00     // Catch:{ all -> 0x03d8 }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x0302
            r48.getClass()     // Catch:{ all -> 0x03d8 }
            double r16 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x03d8 }
            goto L_0x0309
        L_0x0302:
            r48.getClass()     // Catch:{ all -> 0x03d8 }
            double r16 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x03d8 }
        L_0x0309:
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x030e
            goto L_0x0318
        L_0x030e:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0323
        L_0x0311:
            r20 = 0
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0323
        L_0x0318:
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03d8 }
            double r2 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r4     // Catch:{ all -> 0x03d8 }
            double r2 = r2 / r0
            double r2 = r2 + r23
            double r14 = r23 / r2
        L_0x0323:
            r0 = -4625196817309499392(0xbfd0000000000000, double:-0.25)
            double r8 = r8 * r0
            double r8 = java.lang.Math.exp(r8)     // Catch:{ all -> 0x03d8 }
            long r2 = r10.A01     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r2     // Catch:{ all -> 0x03d8 }
            double r8 = r8 * r0
            double r8 = r8 * r14
            double r8 = r8 * r16
            long r2 = r10.A01     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r2     // Catch:{ all -> 0x03d8 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x03d8 }
            double r0 = r0 * r8
            double r21 = r21 + r0
            double r6 = r6 + r8
            r32[r18] = r8     // Catch:{ all -> 0x03d8 }
            int r18 = r18 + 1
            goto L_0x02db
        L_0x0341:
            double r27 = r27 / r11
            double r2 = java.lang.Math.exp(r27)     // Catch:{ all -> 0x03d8 }
            long r0 = (long) r2     // Catch:{ all -> 0x03d8 }
            r19 = r0
            double r21 = r21 / r6
            double r0 = java.lang.Math.exp(r21)     // Catch:{ all -> 0x03d8 }
            long r14 = (long) r0     // Catch:{ all -> 0x03d8 }
            java.util.Iterator r16 = r35.iterator()     // Catch:{ all -> 0x03d8 }
            r4 = -1
            r10 = 0
        L_0x0358:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03d8 }
            r45 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x037d
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x03d8 }
            X.6L2 r0 = (X.AnonymousClass6L2) r0     // Catch:{ all -> 0x03d8 }
            double r2 = (double) r4     // Catch:{ all -> 0x03d8 }
            r8 = r31[r10]     // Catch:{ all -> 0x03d8 }
            long r0 = r0.A00     // Catch:{ all -> 0x03d8 }
            long r0 = r0 - r19
            long r0 = r0 / r45
            double r4 = (double) r0     // Catch:{ all -> 0x03d8 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r4, r0)     // Catch:{ all -> 0x03d8 }
            double r8 = r8 * r0
            double r8 = r8 / r11
            double r2 = r2 + r8
            long r4 = (long) r2     // Catch:{ all -> 0x03d8 }
            int r10 = r10 + 1
            goto L_0x0358
        L_0x037d:
            java.util.Iterator r18 = r34.iterator()     // Catch:{ all -> 0x03d8 }
            r0 = -1
            r10 = 0
        L_0x0384:
            boolean r2 = r18.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r2 == 0) goto L_0x03a7
            java.lang.Object r8 = r18.next()     // Catch:{ all -> 0x03d8 }
            X.6L3 r8 = (X.AnonymousClass6L3) r8     // Catch:{ all -> 0x03d8 }
            double r2 = (double) r0     // Catch:{ all -> 0x03d8 }
            r16 = r32[r10]     // Catch:{ all -> 0x03d8 }
            long r0 = r8.A01     // Catch:{ all -> 0x03d8 }
            long r0 = r0 - r14
            double r8 = (double) r0     // Catch:{ all -> 0x03d8 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r8, r0)     // Catch:{ all -> 0x03d8 }
            double r16 = r16 * r0
            double r16 = r16 / r6
            double r2 = r2 + r16
            long r0 = (long) r2     // Catch:{ all -> 0x03d8 }
            int r10 = r10 + 1
            goto L_0x0384
        L_0x03a7:
            double r2 = (double) r0     // Catch:{ all -> 0x03d8 }
            double r0 = java.lang.Math.sqrt(r2)     // Catch:{ all -> 0x03d8 }
            long r8 = (long) r0     // Catch:{ all -> 0x03d8 }
            double r0 = (double) r4     // Catch:{ all -> 0x03d8 }
            double r2 = java.lang.Math.sqrt(r0)     // Catch:{ all -> 0x03d8 }
            long r0 = (long) r2     // Catch:{ all -> 0x03d8 }
            long r45 = r45 * r0
            long r0 = (long) r6     // Catch:{ all -> 0x03d8 }
            long r3 = (long) r11     // Catch:{ all -> 0x03d8 }
            int r5 = r35.size()     // Catch:{ all -> 0x03d8 }
            int r2 = r34.size()     // Catch:{ all -> 0x03d8 }
            int r5 = r5 + r2
            int r5 = r5 / 2
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x03d8 }
            r34 = r2
            r35 = r14
            r37 = r0
            r39 = r8
            r41 = r19
            r43 = r3
            r47 = r5
            r34.<init>(r35, r37, r39, r41, r43, r45, r47, r48)     // Catch:{ all -> 0x03d8 }
            r13.A00 = r2     // Catch:{ all -> 0x03d8 }
            goto L_0x03e2
        L_0x03d8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03eb }
        L_0x03da:
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x03eb }
            r2.<init>()     // Catch:{ all -> 0x03eb }
            r13.A00 = r2     // Catch:{ all -> 0x03eb }
            goto L_0x03e5
        L_0x03e2:
            r0 = 1
            if (r50 == 0) goto L_0x03e6
        L_0x03e5:
            r0 = 0
        L_0x03e6:
            r13.A03 = r0     // Catch:{ all -> 0x03eb }
        L_0x03e8:
            monitor-exit(r13)     // Catch:{ all -> 0x03ee }
            monitor-exit(r33)
            return r2
        L_0x03eb:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x03ee }
            throw r0     // Catch:{ all -> 0x03ee }
        L_0x03ee:
            r0 = move-exception
            monitor-exit(r33)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160307nP.A00(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration):com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate");
    }

    public C160307nP(C186588vc r1) {
        this();
        this.A06 = r1;
    }

    public C160307nP() {
        this.A02 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = new C158197ja();
        this.A05 = new C151067Th(C186588vc.A00);
    }
}
