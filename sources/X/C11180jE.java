package X;

/* renamed from: X.0jE  reason: invalid class name and case insensitive filesystem */
public class C11180jE implements Runnable {
    public final /* synthetic */ AnonymousClass0UA A00;

    public C11180jE(AnonymousClass0UA r1) {
        this.A00 = r1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r4 = this;
            X.0UA r3 = r4.A00
            X.0Tu r0 = r3.A03
            if (r0 == 0) goto L_0x0055
            X.0Tu r0 = r3.A03
            java.lang.Object r2 = r0.A00
            if (r2 == 0) goto L_0x0027
            monitor-enter(r3)
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x0052 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x0052 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0052 }
        L_0x0017:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0052 }
            X.0sd r0 = (X.C16200sd) r0     // Catch:{ all -> 0x0052 }
            r0.onResult(r2)     // Catch:{ all -> 0x0052 }
            goto L_0x0017
        L_0x0027:
            java.lang.Throwable r2 = r0.A01
            monitor-enter(r3)
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x0052 }
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)     // Catch:{ all -> 0x0052 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "Lottie encountered an error but no failure listener was added:"
            X.AnonymousClass0S3.A01(r0, r2)     // Catch:{ all -> 0x0052 }
            goto L_0x0050
        L_0x003c:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0052 }
        L_0x0040:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0052 }
            X.0sd r0 = (X.C16200sd) r0     // Catch:{ all -> 0x0052 }
            r0.onResult(r2)     // Catch:{ all -> 0x0052 }
            goto L_0x0040
        L_0x0050:
            monitor-exit(r3)
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11180jE.run():void");
    }
}
