package X;

/* renamed from: X.2d4  reason: invalid class name and case insensitive filesystem */
public class C47322d4 {
    public final C56922sm A00;
    public final C56982ss A01;
    public final C46412ba A02;
    public final C623334p A03;
    public final C72303dV A04;
    public final C54012o2 A05;
    public final C49002fp A06;
    public final C620233e A07;
    public final C56662sM A08;
    public final AnonymousClass311 A09;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A00() {
        /*
            r4 = this;
            X.34p r1 = r4.A03
            java.util.Map r0 = r1.A04
            r0.clear()
            java.util.Map r0 = r1.A03
            r0.clear()
            X.2o2 r3 = r4.A05
            X.0Qw r1 = r3.A00
            r0 = -1
            r1.A07(r0)
            X.2ge r0 = r3.A08
            X.0Qw r1 = r0.A00
            monitor-enter(r1)
            r2 = -1
            r1.A07(r2)     // Catch:{ all -> 0x0091 }
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            X.2qB r1 = r3.A07
            X.1R3 r0 = r1.A01
            X.0Qw r0 = r0.A00
            r0.A07(r2)
            X.1R2 r0 = r1.A00
            X.0Qw r0 = r0.A00
            r0.A07(r2)
            X.2ba r0 = r4.A02
            java.util.Map r0 = r0.A04
            r0.clear()
            X.2fp r0 = r4.A06
            r0.A01()
            X.3dV r1 = r4.A04
            r0 = 0
            r1.A05()
            r1.A09 = r0
            X.2ss r2 = r4.A01
            monitor-enter(r2)
            boolean r0 = r2.A00     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0059
            monitor-enter(r2)     // Catch:{ all -> 0x008e }
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0G()     // Catch:{ all -> 0x0056 }
            r0.clear()     // Catch:{ all -> 0x0056 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0056 }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x0059:
            monitor-exit(r2)
            X.2sm r1 = r4.A00
            monitor-enter(r1)
            java.util.Map r0 = r1.A0A     // Catch:{ all -> 0x008b }
            r0.clear()     // Catch:{ all -> 0x008b }
            java.util.Map r0 = r1.A0B     // Catch:{ all -> 0x008b }
            r0.clear()     // Catch:{ all -> 0x008b }
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            X.33e r1 = r4.A07
            java.util.concurrent.ConcurrentHashMap r0 = r1.A09
            if (r0 == 0) goto L_0x0073
            java.util.concurrent.ConcurrentHashMap r0 = r1.A09
            r0.clear()
        L_0x0073:
            X.2sM r1 = r4.A08
            java.lang.Object r2 = r1.A04
            monitor-enter(r2)
            java.util.Map r0 = r1.A05     // Catch:{ all -> 0x008e }
            r0.clear()     // Catch:{ all -> 0x008e }
            java.util.Map r0 = r1.A06     // Catch:{ all -> 0x008e }
            r0.clear()     // Catch:{ all -> 0x008e }
            monitor-exit(r2)
            X.311 r0 = r4.A09
            java.util.Map r0 = r0.A06
            r0.clear()
            return
        L_0x008b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r0
        L_0x008e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0091:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47322d4.A00():void");
    }

    public C47322d4(C56922sm r1, C56982ss r2, C46412ba r3, C623334p r4, C72303dV r5, C54012o2 r6, C49002fp r7, C620233e r8, C56662sM r9, AnonymousClass311 r10) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
    }
}
