package X;

import com.facebook.common.callercontext.CallerContextable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.9Yw  reason: invalid class name and case insensitive filesystem */
public class C195639Yw implements CallerContextable {
    public String A00 = null;
    public final AnonymousClass9W5 A01;
    public final C192529Kl A02;
    public final AnonymousClass9PU A03;
    public final C193649Pl A04;
    public final C192559Ko A05;
    public final C104855Sp A06;
    public final C89984fb A07;
    public final C100675Bv A08;
    public final Map A09 = Collections.synchronizedMap(AnonymousClass001.A0t());
    public final Set A0A = Collections.newSetFromMap(new WeakHashMap());
    public final ScheduledExecutorService A0B;

    /* JADX WARNING: type inference failed for: r3v3, types: [X.9k4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C195639Yw r11, X.AnonymousClass9QB r12, X.AnonymousClass9QN r13, X.C202879mj r14, X.C192529Kl r15, X.C195349Xk r16, boolean r17) {
        /*
            r5 = r12
            X.32L r10 = r12.A09
            r4 = r11
            r7 = r14
            r9 = r16
            X.8yc r3 = r12.A03     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x002d }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x002d }
            r0 = 120(0x78, double:5.93E-322)
            java.lang.Object r0 = r3.get(r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x002d }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x002d }
            if (r0 != 0) goto L_0x0050
            X.9Tm r1 = new X.9Tm
            r1.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.VOLTRON_MODULE_FAILURE
            r1.A00 = r0
            java.lang.String r0 = "Voltron modules required for effect failed to load."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            r1.A03 = r0
            X.9KQ r15 = r1.A00()
            goto L_0x0044
        L_0x002d:
            r2 = move-exception
            java.lang.String r1 = "DefaultCameraCoreEffectManager"
            java.lang.String r0 = "voltron module load exception."
            X.C162477s9.A0B(r1, r0, r2)
            X.9Tm r1 = new X.9Tm
            r1.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.VOLTRON_MODULE_FAILURE
            r1.A00 = r0
            r1.A03 = r2
            X.9KQ r15 = r1.A00()
        L_0x0044:
            X.9jt r3 = new X.9jt
            r11 = r3
            r12 = r4
            r13 = r14
            r14 = r9
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0059
        L_0x0050:
            X.9k4 r3 = new X.9k4
            r6 = r13
            r8 = r15
            r11 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0059:
            r3.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195639Yw.A00(X.9Yw, X.9QB, X.9QN, X.9mj, X.9Kl, X.9Xk, boolean):void");
    }

    public static /* synthetic */ void A01(C195639Yw r5, C202879mj r6, C195349Xk r7, AnonymousClass32L r8, Exception exc) {
        AnonymousClass9KQ A002;
        Exception exc2 = exc;
        if (exc instanceof AnonymousClass9KQ) {
            A002 = (AnonymousClass9KQ) exc2;
        } else {
            C194579Tm r1 = new C194579Tm();
            r1.A00 = AnonymousClass9K2.OTHER;
            r1.A03 = exc;
            A002 = r1.A00();
        }
        new C201329jt(r5, r6, r7, A002, r8).run();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C202249ld A02(X.C202879mj r24, X.AnonymousClass32L r25, java.util.List r26) {
        /*
            r23 = this;
            r4 = 0
            r10 = 0
            r6 = r25
            r6.A02 = r10
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r21 = r26
            java.util.Iterator r3 = r21.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r2 = r3.next()
            X.9Xk r2 = (X.C195349Xk) r2
            X.9WL r0 = r2.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r0.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            if (r1 != r0) goto L_0x0010
            r5.add(r2)
            goto L_0x0010
        L_0x0028:
            int r1 = r5.size()
            r0 = 1
            r2 = r23
            r22 = r24
            if (r1 == r0) goto L_0x005b
            X.9Tm r3 = new X.9Tm
            r3.<init>()
            X.9K2 r0 = X.AnonymousClass9K2.REQUEST_ASSET_CREATION_FAILURE
            r3.A00 = r0
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "effect asset is missing"
        L_0x0044:
            r3.A01 = r0
            X.9iv r1 = new X.9iv
            r0 = r22
            r1.<init>(r2, r0, r3)
            r1.run()
            X.9YT r3 = new X.9YT
            r0 = r21
            r3.<init>(r2, r4, r4, r0)
            return r3
        L_0x0058:
            java.lang.String r0 = "can't load more than one effect at once"
            goto L_0x0044
        L_0x005b:
            java.lang.Object r5 = r5.get(r10)
            X.9Xk r5 = (X.C195349Xk) r5
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x00af
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x00a9
            X.5Sp r12 = r2.A06
            java.util.Map r0 = r12.A04
            java.lang.Object r11 = r0.get(r1)
            X.32L r11 = (X.AnonymousClass32L) r11
            if (r11 == 0) goto L_0x00a9
            r0.remove(r1)
            boolean r0 = r12.A02(r11)
            if (r0 != 0) goto L_0x009a
            X.4fc r9 = r12.A01
            long r3 = r9.A06(r11)
            monitor-enter(r9)
            long r7 = r9.A00     // Catch:{ all -> 0x011c }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x008f
            r0 = 0
            r9.A00 = r0     // Catch:{ all -> 0x011c }
        L_0x008f:
            monitor-exit(r9)
            r9.A00(r3)
            java.util.Map r1 = r12.A03
            java.lang.String r0 = r11.A01
            r1.remove(r0)
        L_0x009a:
            X.4fb r3 = r2.A07
            boolean r0 = r3.A07(r11)
            if (r0 != 0) goto L_0x00a9
            long r0 = r3.A06(r11)
            r3.A00(r0)
        L_0x00a9:
            X.9WL r0 = r5.A02
            java.lang.String r0 = r0.A0A
            r2.A00 = r0
        L_0x00af:
            X.4fb r8 = r2.A07
            X.C162457s7.A0J(r5, r10)
            X.9WL r0 = r5.A02
            java.lang.String r7 = r0.A0A
            X.C162457s7.A0D(r7)
            java.lang.String r10 = r0.A0B
            boolean r0 = r8.A07(r6)
            if (r0 != 0) goto L_0x00e0
            long r0 = r8.A06(r6)
            r8.A01(r0)
            r11 = r8
            r12 = r6
            r13 = r7
            r14 = r10
            r15 = r0
            r11.A05(r12, r13, r14, r15)
            java.lang.String r4 = r6.A00
            java.lang.String r3 = "marker_start_zero"
            r8.A04(r0, r3, r4)
            java.lang.String r4 = "oc_ar_xlogger"
            java.lang.String r3 = "false"
            r8.A03(r0, r4, r3)
        L_0x00e0:
            X.5Sp r3 = r2.A06
            java.util.Map r0 = r3.A04
            X.C162457s7.A0C(r0)
            r0.put(r7, r6)
            boolean r0 = r3.A02(r6)
            if (r0 != 0) goto L_0x0146
            java.util.Map r1 = r3.A03
            X.C162457s7.A0C(r1)
            java.lang.String r11 = r6.A01
            X.5WA r0 = new X.5WA
            r0.<init>(r5)
            r1.put(r11, r0)
            X.4fc r9 = r3.A01
            long r3 = r9.A06(r6)
            monitor-enter(r9)
            long r0 = r9.A00     // Catch:{ all -> 0x011c }
            r12 = 0
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0113
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r0 = 0
            goto L_0x0119
        L_0x0115:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x011c }
        L_0x0119:
            r9.A00 = r3     // Catch:{ all -> 0x011c }
            goto L_0x011f
        L_0x011c:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x011f:
            monitor-exit(r9)
            if (r0 == 0) goto L_0x0129
            long r0 = r0.longValue()
            r9.A00(r0)
        L_0x0129:
            r9.A01(r3)
            r12 = r9
            r13 = r6
            r14 = r7
            r15 = r10
            r16 = r3
            r12.A05(r13, r14, r15, r16)
            java.util.Map r0 = r9.A02
            r0.get(r11)
            java.lang.String r0 = "connection_class"
            java.lang.String r1 = "UNKNOWN"
            r9.A03(r3, r0, r1)
            java.lang.String r0 = "connection_name"
            r9.A03(r3, r0, r1)
        L_0x0146:
            X.9Kl r0 = r2.A02
            r18 = r0
            java.lang.Double r0 = X.AnonymousClass6C8.A0Z()
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>(r0)
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            X.9RQ r9 = new X.9RQ
            r9.<init>(r2, r0, r4, r8)
            X.95g r3 = new X.95g
            r3.<init>(r2, r8, r0, r4)
            X.9Pl r12 = r2.A04
            X.9QB r8 = new X.9QB
            r0 = r22
            r8.<init>(r0, r5, r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.8CN r0 = new X.8CN
            r0.<init>(r1)
            r8.A03 = r0
            java.lang.String r15 = r5.A09
            if (r15 == 0) goto L_0x01b9
            X.5Bv r4 = r2.A08
            X.9K1 r0 = X.AnonymousClass9K1.A06
            java.util.List r13 = java.util.Collections.singletonList(r0)
            r1 = 1
            r0 = 2
            X.C162457s7.A0J(r13, r0)
            boolean r0 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad
            if (r0 != 0) goto L_0x0196
            com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad = r1
        L_0x0196:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r14 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r14.<init>(r4)
            int r0 = r13.size()
            int[] r10 = new int[r0]
            int r4 = r13.size()
            r1 = 0
        L_0x01aa:
            if (r1 >= r4) goto L_0x01d4
            java.lang.Object r0 = r13.get(r1)
            X.9K1 r0 = (X.AnonymousClass9K1) r0
            int r0 = r0.mCppValue
            r10[r1] = r0
            int r1 = r1 + 1
            goto L_0x01aa
        L_0x01b9:
            X.9Sh r4 = new X.9Sh
            r20 = r6
            r15 = r8
            r16 = r3
            r17 = r22
            r19 = r5
            r13 = r4
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            java.util.concurrent.Executor r1 = r12.A05
            X.9iz r0 = new X.9iz
            r0.<init>(r4, r12, r6)
            r1.execute(r0)
            goto L_0x01f2
        L_0x01d4:
            int[] r14 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.filterNeededServicesNative(r15, r7, r10, r14)
            int r10 = r14.length
            r7 = 0
        L_0x01da:
            if (r7 < r10) goto L_0x0245
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x01b9
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            X.9QT r0 = new X.9QT
            r0.<init>(r1)
            r8.A01 = r0
            r0 = 1
            r8.A06 = r0
        L_0x01f2:
            X.9PU r7 = r2.A03
            java.util.List r4 = r5.A0B
            X.9Rr r10 = new X.9Rr
            r17 = r6
            r12 = r8
            r13 = r3
            r14 = r22
            r15 = r18
            r16 = r5
            r11 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.util.concurrent.Executor r1 = r7.A04
            X.9ju r0 = new X.9ju
            r11 = r0
            r12 = r9
            r13 = r10
            r14 = r7
            r15 = r6
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r1.execute(r0)
            r0 = 1
            X.9qA r4 = new X.9qA
            r4.<init>(r7, r0)
            X.32L r0 = r8.A09
            X.9YW r6 = new X.9YW
            r13 = r0
            r9 = r3
            r10 = r22
            r11 = r18
            r12 = r5
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.util.List r12 = java.util.Collections.singletonList(r5)
            X.9W5 r7 = r2.A01
            r8 = r3
            r9 = r6
            r10 = r11
            r11 = r0
            X.9ld r1 = r7.A04(r8, r9, r10, r11, r12)
            X.9YT r3 = new X.9YT
            r0 = r21
            r3.<init>(r2, r1, r4, r0)
            java.util.Set r1 = r2.A0A
            monitor-enter(r1)
            goto L_0x0265
        L_0x0245:
            r4 = r14[r7]
            java.util.Iterator r15 = r13.iterator()
        L_0x024b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x026d
            java.lang.Object r1 = r15.next()
            r0 = r1
            X.9K1 r0 = (X.AnonymousClass9K1) r0
            int r0 = r0.mCppValue
            if (r0 != r4) goto L_0x024b
            if (r1 == 0) goto L_0x026d
            r11.add(r1)
            int r7 = r7 + 1
            goto L_0x01da
        L_0x0265:
            r1.add(r3)     // Catch:{ all -> 0x026a }
            monitor-exit(r1)     // Catch:{ all -> 0x026a }
            return r3
        L_0x026a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x026a }
            throw r0
        L_0x026d:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195639Yw.A02(X.9mj, X.32L, java.util.List):X.9ld");
    }

    public C195639Yw(AnonymousClass9W5 r2, AnonymousClass9PU r3, C193649Pl r4, C192559Ko r5, C104855Sp r6, C89984fb r7, C100675Bv r8, ScheduledExecutorService scheduledExecutorService) {
        this.A06 = r6;
        this.A07 = r7;
        this.A01 = r2;
        this.A05 = r5;
        this.A08 = r8;
        this.A03 = r3;
        this.A02 = new C192529Kl();
        this.A0B = scheduledExecutorService;
        this.A04 = r4;
    }
}
