package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.Map;

/* renamed from: X.6Ny  reason: invalid class name and case insensitive filesystem */
public class C126456Ny extends C153597bc {
    public final C152937aP A00;
    public final VpsEventCallback A01;
    public final C187458xF A02;
    public final AnonymousClass0Xd A03;
    public final AnonymousClass8LG A04;
    public final C1445071v A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C126456Ny(C152937aP r8, C141886wI r9, VpsEventCallback vpsEventCallback, C187458xF r11, AnonymousClass0Xd r12, C166337yW r13, AnonymousClass8LG r14, C1445071v r15, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(r9, r13, str, str2, false);
        this.A04 = r14;
        this.A03 = r12;
        this.A02 = r11;
        this.A01 = vpsEventCallback;
        this.A05 = r15;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A00 = r8;
    }

    public static boolean A00(Map map) {
        if (!map.containsKey("update_prefetch_priority") || Integer.parseInt(C18310x6.A0o("update_prefetch_priority", map)) == 0) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0433 A[Catch:{ Exception -> 0x049e }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0438 A[Catch:{ Exception -> 0x049e }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0443 A[ExcHandler: 6KQ (e X.6KQ), Splitter:B:62:0x01e2] */
    public void A02() {
        /*
            r69 = this;
            r4 = r69
            X.8LG r0 = r4.A04
            boolean r0 = r0.isVideoQplPipelineEnabled
            if (r0 == 0) goto L_0x0016
            com.facebook.exoplayer.monitor.VpsEventCallback r2 = r4.A01
            if (r2 == 0) goto L_0x0016
            X.7yW r1 = r4.A01
            X.6Nt r0 = new X.6Nt
            r0.<init>((X.C166337yW) r1)
            r2.AyO(r0)
        L_0x0016:
            X.0Xd r3 = r4.A03
            X.7yW r2 = r4.A01
            X.8xF r0 = r4.A02
            r27 = r0
            com.facebook.exoplayer.monitor.VpsEventCallback r0 = r4.A01
            r26 = r0
            X.71v r0 = r4.A05
            r25 = r0
            r29 = 0
            int r1 = r2.A02     // Catch:{ Exception -> 0x049e }
            long r6 = (long) r1     // Catch:{ Exception -> 0x049e }
            int r0 = r3.A00     // Catch:{ Exception -> 0x049e }
            long r4 = (long) r0     // Catch:{ Exception -> 0x049e }
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x005d
            java.lang.String r5 = X.AnonymousClass0Xd.A0G     // Catch:{ Exception -> 0x049e }
            java.lang.Object[] r4 = X.AnonymousClass0x9.A1X()     // Catch:{ Exception -> 0x049e }
            X.7yv r0 = r2.A0E     // Catch:{ Exception -> 0x049e }
            android.net.Uri r0 = r0.A05     // Catch:{ Exception -> 0x049e }
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x049e }
        L_0x0042:
            r0 = 0
            r4[r0] = r1     // Catch:{ Exception -> 0x049e }
            int r0 = r2.A02     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass000.A1M(r4, r0)     // Catch:{ Exception -> 0x049e }
            int r0 = r3.A00     // Catch:{ Exception -> 0x049e }
            long r0 = (long) r0     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass0x2.A1U(r4, r0)     // Catch:{ Exception -> 0x049e }
            java.lang.String r0 = "Attempting to prefetch more bytes than the prefetch size %s %d %d"
            java.lang.String r0 = java.lang.String.format(r0, r4)     // Catch:{ Exception -> 0x049e }
            android.util.Log.e(r5, r0)     // Catch:{ Exception -> 0x049e }
            goto L_0x0473
        L_0x005b:
            r1 = 0
            goto L_0x0042
        L_0x005d:
            r16 = 0
            if (r1 == 0) goto L_0x0473
            java.lang.String r0 = r2.A0F     // Catch:{ Exception -> 0x049e }
            r24 = r0
            X.7yv r9 = r2.A0E     // Catch:{ Exception -> 0x049e }
            java.lang.String r6 = r9.A0H     // Catch:{ Exception -> 0x049e }
            android.net.Uri r8 = r9.A05     // Catch:{ Exception -> 0x049e }
            X.8LG r5 = r3.A0D     // Catch:{ Exception -> 0x049e }
            X.8L1 r0 = r5.abrSetting     // Catch:{ Exception -> 0x049e }
            boolean r7 = r0.hashUrlForUnique     // Catch:{ Exception -> 0x049e }
            boolean r4 = r5.useShortKey     // Catch:{ Exception -> 0x049e }
            boolean r0 = r2.A0S     // Catch:{ Exception -> 0x049e }
            r19 = r0
            boolean r1 = r5.splitLastSegmentCachekey     // Catch:{ Exception -> 0x049e }
            boolean r0 = r5.skipThumbnailCacheKey     // Catch:{ Exception -> 0x049e }
            r30 = r8
            r31 = r24
            r32 = r6
            r33 = r7
            r34 = r4
            r35 = r19
            r36 = r1
            r37 = r0
            java.lang.String r4 = X.C161157p6.A00(r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x049e }
            boolean r0 = r5.skipPrefetchInCacheManager     // Catch:{ Exception -> 0x049e }
            r13 = 2
            r12 = 0
            r11 = 1
            if (r0 == 0) goto L_0x00b2
            java.util.Map r1 = r3.A0E     // Catch:{ Exception -> 0x049e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x049e }
            boolean r0 = r1.containsKey(r4)     // Catch:{ all -> 0x00ae }
            monitor-exit(r1)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r5 = X.AnonymousClass0Xd.A0G     // Catch:{ Exception -> 0x049e }
            java.lang.String r3 = "prefetch request for Vid:%s with length:%d is skipped because a prefetch request with the same vid is already in progress"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x049e }
            r1[r12] = r6     // Catch:{ Exception -> 0x049e }
            int r0 = r2.A02     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass000.A1P(r1, r0, r11)     // Catch:{ Exception -> 0x049e }
            goto L_0x0126
        L_0x00ae:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ae }
            goto L_0x0472
        L_0x00b2:
            int r1 = r2.A02     // Catch:{ Exception -> 0x049e }
            X.0gq r23 = new X.0gq     // Catch:{ Exception -> 0x049e }
            r0 = r23
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x049e }
            X.8xH r10 = r3.A08()     // Catch:{ Exception -> 0x049e }
            X.6xv r18 = X.C142866xv.A05     // Catch:{ Exception -> 0x049e }
            int r0 = r2.A04     // Catch:{ Exception -> 0x049e }
            if (r0 != r11) goto L_0x00c8
            X.6xv r22 = X.C142866xv.A01     // Catch:{ Exception -> 0x049e }
            goto L_0x00cf
        L_0x00c8:
            if (r0 != r13) goto L_0x00cd
            X.6xv r22 = X.C142866xv.A03     // Catch:{ Exception -> 0x049e }
            goto L_0x00cf
        L_0x00cd:
            r22 = r18
        L_0x00cf:
            r8 = 3
            if (r10 == 0) goto L_0x0130
            boolean r0 = r5.skipPrefetchInCacheManager     // Catch:{ Exception -> 0x049e }
            if (r0 == 0) goto L_0x012b
            boolean r0 = r5.enableCacheLookUp     // Catch:{ Exception -> 0x049e }
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r5.usePerVideoLookupToCheckCache     // Catch:{ Exception -> 0x049e }
            if (r0 == 0) goto L_0x00e7
            X.0gs r0 = r3.A05     // Catch:{ Exception -> 0x049e }
            if (r0 == 0) goto L_0x012b
            boolean r0 = r0.A00(r6)     // Catch:{ Exception -> 0x049e }
            goto L_0x0109
        L_0x00e7:
            boolean r7 = r5.useIsCachedSkipInit     // Catch:{ Exception -> 0x049e }
            long r14 = r2.A07     // Catch:{ Exception -> 0x049e }
            int r0 = r2.A02     // Catch:{ Exception -> 0x049e }
            long r0 = (long) r0     // Catch:{ Exception -> 0x049e }
            if (r7 == 0) goto L_0x00fd
            r30 = r10
            r31 = r4
            r32 = r14
            r34 = r0
            boolean r0 = r30.BH9(r31, r32, r34)     // Catch:{ Exception -> 0x049e }
            goto L_0x0109
        L_0x00fd:
            r30 = r10
            r31 = r4
            r32 = r14
            r34 = r0
            boolean r0 = r30.BH8(r31, r32, r34)     // Catch:{ Exception -> 0x049e }
        L_0x0109:
            if (r0 == 0) goto L_0x012b
            X.0u1 r3 = r3.A0B     // Catch:{ Exception -> 0x049e }
            java.lang.String r1 = "Cache"
            X.6Nu r0 = new X.6Nu     // Catch:{ Exception -> 0x049e }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x049e }
            r3.B2p(r0)     // Catch:{ Exception -> 0x049e }
            java.lang.String r5 = X.AnonymousClass0Xd.A0G     // Catch:{ Exception -> 0x049e }
            java.lang.String r3 = "prefetch request for Vid:%s with length:%d is skipped because it is already in cache %s"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x049e }
            r1[r12] = r6     // Catch:{ Exception -> 0x049e }
            int r0 = r2.A02     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass000.A1P(r1, r0, r11)     // Catch:{ Exception -> 0x049e }
            r1[r13] = r4     // Catch:{ Exception -> 0x049e }
        L_0x0126:
            X.C161157p6.A01(r5, r3, r1)     // Catch:{ Exception -> 0x049e }
            goto L_0x0473
        L_0x012b:
            r0 = r23
            r10.AwW(r0, r4)     // Catch:{ Exception -> 0x049e }
        L_0x0130:
            if (r6 == 0) goto L_0x014a
            X.0u1 r7 = r3.A0B     // Catch:{ Exception -> 0x049e }
            java.lang.String r1 = r22.toString()     // Catch:{ Exception -> 0x049e }
            X.6Np r0 = new X.6Np     // Catch:{ Exception -> 0x049e }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x049e }
            r7.B2p(r0)     // Catch:{ Exception -> 0x049e }
            java.lang.String r1 = "Network"
            X.6Nu r0 = new X.6Nu     // Catch:{ Exception -> 0x049e }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x049e }
            r7.B2p(r0)     // Catch:{ Exception -> 0x049e }
        L_0x014a:
            java.lang.String r15 = X.AnonymousClass0Xd.A0G     // Catch:{ Exception -> 0x049e }
            java.lang.String r1 = "Prefetch Vid:%s from %s, Format:%s, PrefetchLength:%d, RequestKey:%s, AugmentedKey: %s"
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x049e }
            r0[r12] = r6     // Catch:{ Exception -> 0x049e }
            java.lang.String r7 = r9.A0B     // Catch:{ Exception -> 0x049e }
            r0[r11] = r7     // Catch:{ Exception -> 0x049e }
            X.6vz r10 = r9.A07     // Catch:{ Exception -> 0x049e }
            java.lang.String r10 = r10.name()     // Catch:{ Exception -> 0x049e }
            r0[r13] = r10     // Catch:{ Exception -> 0x049e }
            int r10 = r2.A02     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass000.A1P(r0, r10, r8)     // Catch:{ Exception -> 0x049e }
            r21 = 4
            r0[r21] = r24     // Catch:{ Exception -> 0x049e }
            r20 = 5
            r0[r20] = r4     // Catch:{ Exception -> 0x049e }
            X.C161157p6.A01(r15, r1, r0)     // Catch:{ Exception -> 0x049e }
            boolean r0 = r2.A0K     // Catch:{ Exception -> 0x049e }
            r38 = r0 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x049e }
            r1.<init>(r12)     // Catch:{ Exception -> 0x049e }
            java.lang.String r13 = r9.A0C     // Catch:{ Exception -> 0x049e }
            X.6vI r0 = r2.A0B     // Catch:{ Exception -> 0x049e }
            r68 = r0
            X.6vA r12 = r9.A06     // Catch:{ Exception -> 0x049e }
            boolean r11 = r9.A0M     // Catch:{ Exception -> 0x049e }
            java.lang.String r10 = r2.A0P     // Catch:{ Exception -> 0x049e }
            java.lang.String r8 = r2.A0O     // Catch:{ Exception -> 0x049e }
            boolean r0 = r2.A0J     // Catch:{ Exception -> 0x049e }
            X.7oI r34 = new X.7oI     // Catch:{ Exception -> 0x049e }
            r39 = r34
            r40 = r68
            r41 = r12
            r42 = r6
            r43 = r7
            r44 = r13
            r45 = r10
            r46 = r8
            r47 = r1
            r48 = r11
            r49 = r19
            r50 = r0
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ Exception -> 0x049e }
            r7 = r22
            r0 = r18
            boolean r42 = X.AnonymousClass000.A1Y(r7, r0)
            java.util.HashMap r36 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x049e }
            X.7pY r7 = r3.A0C     // Catch:{ Exception -> 0x049e }
            r0 = 8
            int r39 = r7.A01(r0)     // Catch:{ Exception -> 0x049e }
            r0 = 0
            int r40 = r7.A01(r0)     // Catch:{ Exception -> 0x049e }
            r12 = 0
            r19 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x049e }
            r0.<init>(r12)     // Catch:{ Exception -> 0x049e }
            r8 = -1
            r7 = 1
            r0 = 6
            r30 = r3
            r31 = r26
            r32 = r27
            r33 = r22
            r35 = r25
            r37 = r1
            r41 = r7
            r43 = r12
            X.8xD r10 = r30.A05(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x049e }
            X.7n1 r14 = new X.7n1     // Catch:{ Exception -> 0x049e }
            r14.<init>(r6, r7)     // Catch:{ Exception -> 0x049e }
            int r1 = r2.A02     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            if (r1 > 0) goto L_0x01e8
            if (r1 != r8) goto L_0x036e
        L_0x01e8:
            boolean r7 = r5.enableHttpPriorityForPrefetch     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            if (r7 == 0) goto L_0x020a
            X.6vy r7 = r2.A0D     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            int r11 = r7.ordinal()     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            r8 = 7
            r7 = 8
            if (r11 == r0) goto L_0x0205
            if (r11 == r8) goto L_0x0205
            if (r11 == r7) goto L_0x0200
            X.6uk r0 = X.C140926uk.A02     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            X.7nU r11 = r0.mHttpPriority     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            goto L_0x020e
        L_0x0200:
            X.6uk r0 = X.C140926uk.A04     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            X.7nU r11 = r0.mHttpPriority     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            goto L_0x020e
        L_0x0205:
            X.6uk r0 = X.C140926uk.A01     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            X.7nU r11 = r0.mHttpPriority     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            goto L_0x020e
        L_0x020a:
            X.6uk r0 = X.C140926uk.A00     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            X.7nU r11 = r0.mHttpPriority     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
        L_0x020e:
            android.net.Uri r0 = r9.A05     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            r61 = r0
            long r7 = r2.A07     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0219
            goto L_0x021c
        L_0x0219:
            r59 = 0
            goto L_0x021e
        L_0x021c:
            r59 = r7
        L_0x021e:
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0224
            r7 = 0
        L_0x0224:
            long r0 = (long) r1     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            r66 = r0
            java.lang.String r13 = r2.A0H     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            int r0 = r2.A01     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            r65 = r0
            long r0 = (long) r0     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a3, all -> 0x039e }
            r49 = r0
            r0 = r22
            int r0 = r0.value     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            r47 = -1
            r41 = -1
            java.lang.String r32 = ""
            r18 = 1
            X.7ni r25 = new X.7ni     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            r31 = r29
            r34 = r29
            r35 = r29
            r37 = r12
            r38 = r12
            r43 = r41
            r44 = r41
            r51 = r47
            r53 = r47
            r55 = r12
            r56 = r12
            r57 = r12
            r58 = r12
            r26 = r11
            r27 = r14
            r28 = r13
            r30 = r29
            r33 = r32
            r36 = r12
            r39 = r0
            r40 = r18
            r42 = r41
            r45 = r49
            r49 = r47
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47, r49, r51, r53, r55, r56, r57, r58)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            X.7pX r0 = new X.7pX     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            r53 = r0
            r54 = r61
            r55 = r25
            r56 = r24
            r57 = r29
            r61 = r7
            r63 = r66
            r53.<init>(r54, r55, r56, r57, r58, r59, r61, r63)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            boolean r1 = r5.enableCDNDebugHeaders     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            if (r1 == 0) goto L_0x02c5
            if (r6 == 0) goto L_0x0293
            java.lang.String r5 = "x-fb-abr-video-id"
            X.7ni r1 = r0.A05     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            java.util.Map r1 = r1.A0N     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            r1.put(r5, r6)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
        L_0x0293:
            java.lang.String r8 = "x-fb-abr-is-prefetch"
            java.lang.String r7 = "1"
            X.7ni r1 = r0.A05     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            java.util.Map r5 = r1.A0N     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            r5.put(r8, r7)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            if (r13 == 0) goto L_0x02a5
            java.lang.String r1 = "x-fb-abr-quality-label"
            r5.put(r1, r13)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
        L_0x02a5:
            java.lang.String r7 = "x-fb-abr-bitrate"
            java.lang.String r1 = java.lang.Integer.toString(r65)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            if (r1 == 0) goto L_0x02b0
            r5.put(r7, r1)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
        L_0x02b0:
            java.lang.String r7 = "x-fb-abr-track-type"
            r1 = r22
            int r1 = r1.value     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            if (r1 == 0) goto L_0x02c5
            r5.put(r7, r1)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x02c0, all -> 0x039e }
            goto L_0x02c5
        L_0x02c0:
            r8 = move-exception
            r0 = 0
            goto L_0x03a8
        L_0x02c5:
            java.util.Map r1 = r3.A0F     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            r25 = r1
            boolean r1 = A00(r25)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x03a5, all -> 0x039e }
            if (r1 == 0) goto L_0x02dc
            if (r4 == 0) goto L_0x02dc
            java.util.Map r1 = r3.A0E     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
            monitor-enter(r1)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
            r1.put(r4, r10)     // Catch:{ all -> 0x02d9 }
            monitor-exit(r1)     // Catch:{ all -> 0x02d9 }
            goto L_0x02dc
        L_0x02d9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02d9 }
            throw r0     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
        L_0x02dc:
            long r0 = r10.Bfw(r0)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x039c, all -> 0x039e }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f2
            int r7 = r2.A02     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
            if (r7 <= 0) goto L_0x02f0
            int r5 = (int) r0     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
            int r5 = java.lang.Math.min(r7, r5)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
        L_0x02ed:
            r2.A02 = r5     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
            goto L_0x02f2
        L_0x02f0:
            int r5 = (int) r0     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
            goto L_0x02ed
        L_0x02f2:
            int r5 = r2.A02     // Catch:{ 6KQ -> 0x0443, IOException -> 0x039c, all -> 0x039e }
            long r7 = (long) r5     // Catch:{ 6KQ -> 0x0443, IOException -> 0x039c, all -> 0x039e }
            int r0 = r3.A00     // Catch:{ 6KQ -> 0x0443, IOException -> 0x039c, all -> 0x039e }
            long r0 = (long) r0     // Catch:{ 6KQ -> 0x0443, IOException -> 0x039c, all -> 0x039e }
            int r11 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x032d
            java.lang.String r7 = "Attempting to completed unbounded prefetch with more bytes than the prefetch size %s %d %d"
            java.lang.Object[] r5 = X.AnonymousClass0x9.A1X()     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            android.net.Uri r0 = r9.A05     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            if (r0 == 0) goto L_0x0310
            java.lang.String r19 = r0.toString()     // Catch:{ 6KQ -> 0x0443, IOException -> 0x030b, all -> 0x039e }
            goto L_0x0310
        L_0x030b:
            r8 = move-exception
            r0 = 0
            goto L_0x03a8
        L_0x0310:
            r5[r12] = r19     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            int r1 = r2.A02     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            r0 = r18
            X.AnonymousClass000.A1P(r5, r1, r0)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            int r0 = r3.A00     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            long r0 = (long) r0     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            X.AnonymousClass0x2.A1U(r5, r0)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            java.lang.String r0 = java.lang.String.format(r7, r5)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            android.util.Log.e(r15, r0)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            java.lang.String r0 = "Attempting to cache amount greater than CacheSize"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            throw r0     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
        L_0x032d:
            if (r5 <= 0) goto L_0x036e
            r5 = 65536(0x10000, float:9.18355E-41)
            byte[] r13 = new byte[r5]     // Catch:{ 6KQ -> 0x0443, IOException -> 0x036a, all -> 0x039e }
            r0 = 0
        L_0x0335:
            int r11 = r2.A02     // Catch:{ 6KQ -> 0x034e, IOException -> 0x034c }
            long r7 = (long) r11     // Catch:{ 6KQ -> 0x034e, IOException -> 0x034c }
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x0370
            int r7 = (int) r0     // Catch:{ 6KQ -> 0x034e, IOException -> 0x034c }
            int r7 = X.AnonymousClass6C9.A0A(r11, r7, r5)     // Catch:{ 6KQ -> 0x034e, IOException -> 0x034c }
            int r7 = r10.read(r13, r12, r7)     // Catch:{ 6KQ -> 0x034e, IOException -> 0x034c }
            long r7 = (long) r7     // Catch:{ 6KQ -> 0x034e, IOException -> 0x034c }
            int r11 = (r7 > r47 ? 1 : (r7 == r47 ? 0 : -1))
            if (r11 == 0) goto L_0x0370
            long r0 = r0 + r7
            goto L_0x0335
        L_0x034c:
            r8 = move-exception
            goto L_0x03a8
        L_0x034e:
            r7 = move-exception
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x0446
            r10.close()     // Catch:{ Exception -> 0x049e }
            boolean r5 = A00(r25)     // Catch:{ Exception -> 0x049e }
            if (r5 == 0) goto L_0x03e2
            if (r4 == 0) goto L_0x03e2
            java.util.Map r5 = r3.A0E     // Catch:{ Exception -> 0x049e }
            monitor-enter(r5)     // Catch:{ Exception -> 0x049e }
            r5.remove(r4)     // Catch:{ all -> 0x0366 }
            monitor-exit(r5)     // Catch:{ all -> 0x0366 }
            goto L_0x03e2
        L_0x0366:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0366 }
            goto L_0x0472
        L_0x036a:
            r8 = move-exception
            r0 = 0
            goto L_0x03a8
        L_0x036e:
            r0 = 0
        L_0x0370:
            r10.close()     // Catch:{ Exception -> 0x049e }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x0386
            X.8xH r5 = r3.A08()     // Catch:{ Exception -> 0x049e }
            if (r5 == 0) goto L_0x0386
            X.8xH r7 = r3.A08()     // Catch:{ Exception -> 0x049e }
            r5 = r23
            r7.BjD(r5, r4)     // Catch:{ Exception -> 0x049e }
        L_0x0386:
            java.util.Map r5 = r3.A0F     // Catch:{ Exception -> 0x049e }
            boolean r5 = A00(r5)     // Catch:{ Exception -> 0x049e }
            if (r5 == 0) goto L_0x03e2
            if (r4 == 0) goto L_0x03e2
            java.util.Map r5 = r3.A0E     // Catch:{ Exception -> 0x049e }
            monitor-enter(r5)     // Catch:{ Exception -> 0x049e }
            r5.remove(r4)     // Catch:{ all -> 0x0398 }
            monitor-exit(r5)     // Catch:{ all -> 0x0398 }
            goto L_0x03e2
        L_0x0398:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0398 }
            goto L_0x0472
        L_0x039c:
            r8 = move-exception
            goto L_0x03a6
        L_0x039e:
            r6 = move-exception
            r0 = 0
            goto L_0x0448
        L_0x03a3:
            r8 = move-exception
            goto L_0x03a6
        L_0x03a5:
            r8 = move-exception
        L_0x03a6:
            r0 = 0
        L_0x03a8:
            java.lang.String r7 = "IO Exception prefetching CacheKey:%s, Read:%d"
            r5 = r24
            java.lang.Object[] r5 = X.C18310x6.A1b(r5, r12)     // Catch:{ all -> 0x0447 }
            X.AnonymousClass001.A1Q(r5, r0)     // Catch:{ all -> 0x0447 }
            X.AnonymousClass6C9.A15(r7, r15, r8, r5)     // Catch:{ all -> 0x0447 }
            r10.close()     // Catch:{ Exception -> 0x049e }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x03cc
            X.8xH r5 = r3.A08()     // Catch:{ Exception -> 0x049e }
            if (r5 == 0) goto L_0x03cc
            X.8xH r7 = r3.A08()     // Catch:{ Exception -> 0x049e }
            r5 = r23
            r7.BjD(r5, r4)     // Catch:{ Exception -> 0x049e }
        L_0x03cc:
            java.util.Map r5 = r3.A0F     // Catch:{ Exception -> 0x049e }
            boolean r5 = A00(r5)     // Catch:{ Exception -> 0x049e }
            if (r5 == 0) goto L_0x03e2
            if (r4 == 0) goto L_0x03e2
            java.util.Map r5 = r3.A0E     // Catch:{ Exception -> 0x049e }
            monitor-enter(r5)     // Catch:{ Exception -> 0x049e }
            r5.remove(r4)     // Catch:{ all -> 0x03de }
            monitor-exit(r5)     // Catch:{ all -> 0x03de }
            goto L_0x03e2
        L_0x03de:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03de }
            goto L_0x0472
        L_0x03e2:
            X.7oI r8 = new X.7oI     // Catch:{ Exception -> 0x049e }
            r5 = r68
            r8.<init>(r5, r6)     // Catch:{ Exception -> 0x049e }
            java.util.HashMap r34 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x049e }
            X.6xv r31 = X.C142866xv.A03     // Catch:{ Exception -> 0x049e }
            r11 = 1
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x049e }
            r7.<init>(r12)     // Catch:{ Exception -> 0x049e }
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x049e }
            r5.<init>(r12)     // Catch:{ Exception -> 0x049e }
            r30 = r29
            r33 = r29
            r37 = r12
            r38 = r12
            r39 = r12
            r40 = r12
            r28 = r3
            r32 = r8
            r35 = r7
            r36 = r12
            r41 = r11
            r28.A05(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x049e }
            java.lang.String r13 = "Prefetched VideoId %s, PrefetchLength %d, total read %d, fetched length from network %d, CacheKey %s"
            r5 = r20
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x049e }
            r5[r12] = r6     // Catch:{ Exception -> 0x049e }
            int r7 = r2.A02     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass000.A1P(r5, r7, r11)     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass0x2.A1U(r5, r0)     // Catch:{ Exception -> 0x049e }
            long r7 = r23.A01     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass0x2.A1V(r5, r7)     // Catch:{ Exception -> 0x049e }
            r5[r21] = r4     // Catch:{ Exception -> 0x049e }
            X.C161157p6.A01(r15, r13, r5)     // Catch:{ Exception -> 0x049e }
            boolean r4 = r10 instanceof X.C09890gv     // Catch:{ Exception -> 0x049e }
            if (r4 == 0) goto L_0x0438
            X.0gv r10 = (X.C09890gv) r10     // Catch:{ Exception -> 0x049e }
            long r4 = r10.A03     // Catch:{ Exception -> 0x049e }
            goto L_0x043a
        L_0x0438:
            r4 = 0
        L_0x043a:
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0482
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0482
            goto L_0x0476
        L_0x0443:
            r7 = move-exception
            r0 = 0
        L_0x0446:
            throw r7     // Catch:{ all -> 0x0447 }
        L_0x0447:
            r6 = move-exception
        L_0x0448:
            r10.close()     // Catch:{ Exception -> 0x049e }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x045e
            X.8xH r0 = r3.A08()     // Catch:{ Exception -> 0x049e }
            if (r0 == 0) goto L_0x045e
            X.8xH r1 = r3.A08()     // Catch:{ Exception -> 0x049e }
            r0 = r23
            r1.BjD(r0, r4)     // Catch:{ Exception -> 0x049e }
        L_0x045e:
            java.util.Map r0 = r3.A0F     // Catch:{ Exception -> 0x049e }
            boolean r0 = A00(r0)     // Catch:{ Exception -> 0x049e }
            if (r0 == 0) goto L_0x0472
            if (r4 == 0) goto L_0x0472
            java.util.Map r0 = r3.A0E     // Catch:{ Exception -> 0x049e }
            monitor-enter(r0)     // Catch:{ Exception -> 0x049e }
            r0.remove(r4)     // Catch:{ all -> 0x0470 }
            monitor-exit(r0)     // Catch:{ all -> 0x0470 }
            goto L_0x0472
        L_0x0470:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0470 }
        L_0x0472:
            throw r6     // Catch:{ Exception -> 0x049e }
        L_0x0473:
            r3 = 0
            goto L_0x0496
        L_0x0476:
            java.lang.String r1 = "resourceLength of videoId %s is %d"
            java.lang.Object[] r0 = X.C18310x6.A1b(r6, r12)     // Catch:{ Exception -> 0x049e }
            X.AnonymousClass000.A1Q(r0, r11, r4)     // Catch:{ Exception -> 0x049e }
            X.C161157p6.A01(r15, r1, r0)     // Catch:{ Exception -> 0x049e }
        L_0x0482:
            X.0u1 r4 = r3.A0B     // Catch:{ Exception -> 0x049e }
            java.lang.String r3 = r22.toString()     // Catch:{ Exception -> 0x049e }
            java.lang.String r1 = r9.A0E     // Catch:{ Exception -> 0x049e }
            X.6Nq r0 = new X.6Nq     // Catch:{ Exception -> 0x049e }
            r0.<init>(r6, r3, r1)     // Catch:{ Exception -> 0x049e }
            r4.B2p(r0)     // Catch:{ Exception -> 0x049e }
            long r3 = r23.A01     // Catch:{ Exception -> 0x049e }
        L_0x0496:
            X.7jB r1 = X.C157947jB.A01     // Catch:{ Exception -> 0x049e }
            X.7yv r0 = r2.A0E     // Catch:{ Exception -> 0x049e }
            r1.A01(r0, r3)     // Catch:{ Exception -> 0x049e }
            return
        L_0x049e:
            r3 = move-exception
            java.lang.Object[] r2 = X.AnonymousClass4L0.A0U()
            java.lang.String r1 = "VodUriPrefetchTask"
            java.lang.String r0 = "prefetch sync failed with exception"
            X.AnonymousClass6C9.A15(r0, r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126456Ny.A02():void");
    }

    public final void A03() {
        VpsEventCallback vpsEventCallback;
        C166337yW r0;
        C166577yv r02;
        String str;
        if (this.A04.isVideoQplPipelineEnabled && (vpsEventCallback = this.A01) != null && (r0 = this.A01) != null && (r02 = r0.A0E) != null && (str = r02.A0H) != null) {
            vpsEventCallback.AyO(new AnonymousClass6No(str, true));
        }
    }
}
