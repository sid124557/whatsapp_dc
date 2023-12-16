package X;

/* renamed from: X.3CR  reason: invalid class name */
public abstract class AnonymousClass3CR implements C835548w, C83894Af {
    public final C44062Un A00;
    public final C29001i7 A01;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.String BDJ() {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r6 instanceof X.C33141sV
            if (r0 == 0) goto L_0x001d
            r2 = r6
            X.1sV r2 = (X.C33141sV) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mtc="
            r1.append(r0)
            java.util.HashMap r0 = r2.A06
            int r0 = r0.size()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            return r0
        L_0x001d:
            boolean r0 = r6 instanceof X.C33071sO
            if (r0 == 0) goto L_0x0051
            r2 = r6
            X.1sO r2 = (X.C33071sO) r2
            monitor-enter(r5)
            java.lang.String r0 = "sc="
            java.lang.StringBuilder r1 = X.C18330xA.A0A(r0)     // Catch:{ all -> 0x0117 }
            X.0Qw r0 = r2.A00     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "null"
            r1.append(r0)     // Catch:{ all -> 0x0117 }
        L_0x0036:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0117 }
            goto L_0x0092
        L_0x003b:
            int r0 = r0.A01()     // Catch:{ all -> 0x0117 }
            r1.append(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0117 }
            X.0Qw r0 = r2.A00     // Catch:{ all -> 0x0117 }
            int r0 = r0.A00()     // Catch:{ all -> 0x0117 }
            r1.append(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x0036
        L_0x0051:
            boolean r0 = r6 instanceof X.C33111sS
            if (r0 == 0) goto L_0x0094
            r1 = r6
            X.1sS r1 = (X.C33111sS) r1
            monitor-enter(r5)
            java.lang.String r0 = "fpspc/"
            java.lang.StringBuilder r4 = X.C18330xA.A0A(r0)     // Catch:{ all -> 0x0117 }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0117 }
            java.util.Iterator r3 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x0117 }
            r2 = 0
            r1 = 0
        L_0x0067:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0117 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0117 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0117 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0067
            int r2 = r2 + 1
            int r0 = r0.size()     // Catch:{ all -> 0x0117 }
            int r1 = r1 + r0
            goto L_0x0067
        L_0x0083:
            java.lang.String r0 = "s="
            r4.append(r0)     // Catch:{ all -> 0x0117 }
            r4.append(r2)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "/el="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r4, r1)     // Catch:{ all -> 0x0117 }
        L_0x0092:
            monitor-exit(r5)
            return r0
        L_0x0094:
            boolean r0 = r6 instanceof X.C33121sT
            if (r0 == 0) goto L_0x00b4
            r2 = r6
            X.1sT r2 = (X.C33121sT) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LottieCache - "
            r1.append(r0)
            X.0Qw r0 = r2.A01
            int r0 = r0.A01()
            r1.append(r0)
            java.lang.String r0 = " items"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            return r0
        L_0x00b4:
            boolean r0 = r6 instanceof X.C33151sW
            if (r0 == 0) goto L_0x00dd
            r1 = r6
            X.1sW r1 = (X.C33151sW) r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r1.A08
            X.C18290x4.A1R(r2, r0)
            X.1Mq r0 = r1.A06
            X.0zQ r1 = r0.A02
            int r0 = r1.A01()
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            int r0 = r1.A00()
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            return r0
        L_0x00dd:
            boolean r0 = r6 instanceof X.C33091sQ
            if (r0 == 0) goto L_0x00f9
            r2 = r6
            X.1sQ r2 = (X.C33091sQ) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AIStickersCache - "
            r1.append(r0)
            java.util.Map r0 = r2.A01
            X.AnonymousClass0x7.A1H(r1, r0)
            java.lang.String r0 = " items"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            return r0
        L_0x00f9:
            boolean r0 = r6 instanceof X.C33081sP
            if (r0 == 0) goto L_0x011a
            r2 = r6
            X.1sP r2 = (X.C33081sP) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "state a="
            r1.append(r0)
            monitor-enter(r5)
            android.util.SparseArray r0 = r2.A01     // Catch:{ all -> 0x0117 }
            int r0 = r0.size()     // Catch:{ all -> 0x0117 }
            monitor-exit(r5)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            return r0
        L_0x0117:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x011a:
            boolean r0 = r6 instanceof X.C33131sU
            if (r0 == 0) goto L_0x0141
            r1 = r6
            X.1sU r1 = (X.C33131sU) r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r1.A04
            X.C18290x4.A1R(r2, r0)
            X.0zQ r1 = r1.A02
            int r0 = r1.A01()
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            int r0 = r1.A00()
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            return r0
        L_0x0141:
            r1 = r6
            X.1sR r1 = (X.C33101sR) r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bkch="
            r2.append(r0)
            X.2gQ r0 = r1.A01
            X.8Ke r0 = r0.A00
            if (r0 != 0) goto L_0x015a
            r0 = 0
        L_0x0155:
            java.lang.String r0 = X.AnonymousClass001.A0k(r2, r0)
            return r0
        L_0x015a:
            long r0 = r0.A07()
            goto L_0x0155
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CR.BDJ():java.lang.String");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void Bej(boolean r9) {
        /*
            r8 = this;
            r7 = r8
            boolean r0 = r8 instanceof X.C33141sV
            if (r0 == 0) goto L_0x0015
            r1 = r8
            X.1sV r1 = (X.C33141sV) r1
            monitor-enter(r7)
            java.lang.String r0 = "MessageThumbCache/handleLowMemory"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00f2 }
            java.util.HashMap r0 = r1.A06     // Catch:{ all -> 0x00f2 }
            r0.clear()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f0
        L_0x0015:
            boolean r0 = r8 instanceof X.C33071sO
            if (r0 == 0) goto L_0x0027
            r0 = r8
            X.1sO r0 = (X.C33071sO) r0
            monitor-enter(r7)
            X.0Qw r1 = r0.A00     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00f0
            r0 = -1
            r1.A07(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f0
        L_0x0027:
            boolean r0 = r8 instanceof X.C33111sS
            if (r0 == 0) goto L_0x0055
            r0 = r8
            X.1sS r0 = (X.C33111sS) r0
            monitor-enter(r7)
            java.util.Map r3 = r0.A00     // Catch:{ all -> 0x00f2 }
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r3)     // Catch:{ all -> 0x00f2 }
        L_0x0035:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0050
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00f2 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x00f2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x004c
            r0.clear()     // Catch:{ all -> 0x00f2 }
        L_0x004c:
            r1.clear()     // Catch:{ all -> 0x00f2 }
            goto L_0x0035
        L_0x0050:
            r3.clear()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f0
        L_0x0055:
            boolean r0 = r8 instanceof X.C33121sT
            if (r0 == 0) goto L_0x0068
            r2 = r8
            X.1sT r2 = (X.C33121sT) r2
            X.0Qw r0 = r2.A00
            r1 = -1
            r0.A07(r1)
            X.0Qw r0 = r2.A01
            r0.A07(r1)
        L_0x0067:
            return
        L_0x0068:
            boolean r0 = r8 instanceof X.C33151sW
            if (r0 == 0) goto L_0x0073
            r6 = r8
            X.1sW r6 = (X.C33151sW) r6
            monitor-enter(r7)
            if (r9 == 0) goto L_0x00d6
            goto L_0x00c2
        L_0x0073:
            boolean r0 = r8 instanceof X.C33091sQ
            if (r0 == 0) goto L_0x0085
            r1 = r8
            X.1sQ r1 = (X.C33091sQ) r1
            java.util.Map r0 = r1.A00
            r0.clear()
            java.util.Map r0 = r1.A01
            r0.clear()
            return
        L_0x0085:
            boolean r0 = r8 instanceof X.C33081sP
            if (r0 == 0) goto L_0x008e
            r0 = r8
            X.1sP r0 = (X.C33081sP) r0
            monitor-enter(r7)
            goto L_0x00eb
        L_0x008e:
            boolean r0 = r8 instanceof X.C33131sU
            if (r0 == 0) goto L_0x00b2
            r4 = r8
            X.1sU r4 = (X.C33131sU) r4
            if (r9 == 0) goto L_0x00b0
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A00
            int r0 = r0.get()
        L_0x009d:
            long r2 = r4.A05(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r4.A04
            r1.append(r0)
            java.lang.String r0 = "/cleaned:"
            X.C18260x0.A10(r0, r1, r2)
            return
        L_0x00b0:
            r0 = 0
            goto L_0x009d
        L_0x00b2:
            r0 = r8
            X.1sR r0 = (X.C33101sR) r0
            X.2IO r0 = r0.A00
            if (r0 == 0) goto L_0x0067
            X.2qq r0 = r0.A00
            X.0Qw r1 = r0.A01
            r0 = -1
            r1.A07(r0)
            return
        L_0x00c2:
            X.1Mq r0 = r6.A06     // Catch:{ all -> 0x00f2 }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01     // Catch:{ all -> 0x00f2 }
            long r4 = r0.get()     // Catch:{ all -> 0x00f2 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f2 }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f0
        L_0x00d6:
            X.1Mq r2 = r6.A06     // Catch:{ all -> 0x00f2 }
            r0 = 0
            r2.A07(r0)     // Catch:{ all -> 0x00f2 }
            X.0zQ r1 = r2.A02     // Catch:{ all -> 0x00f2 }
            r0 = -1
            r1.A07(r0)     // Catch:{ all -> 0x00f2 }
            r0 = 0
            r6.A09 = r0     // Catch:{ all -> 0x00f2 }
            X.49N r0 = r6.A03     // Catch:{ all -> 0x00f2 }
            r2.A07(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f0
        L_0x00eb:
            android.util.SparseArray r0 = r0.A01     // Catch:{ all -> 0x00f2 }
            r0.clear()     // Catch:{ all -> 0x00f2 }
        L_0x00f0:
            monitor-exit(r7)
            return
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CR.Bej(boolean):void");
    }

    public final void A04() {
        this.A01.A06(this);
        C44062Un r2 = this.A00;
        synchronized (r2) {
            r2.A00.add(AnonymousClass0x9.A14(this));
        }
    }

    public AnonymousClass3CR(AnonymousClass2MO r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }
}
