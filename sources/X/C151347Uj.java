package X;

/* renamed from: X.7Uj  reason: invalid class name and case insensitive filesystem */
public abstract class C151347Uj {
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
    public boolean A02(X.AnonymousClass8L6 r13) {
        /*
            r12 = this;
            r11 = r12
            boolean r0 = r12 instanceof X.C126066Ko
            if (r0 == 0) goto L_0x0019
            X.6Kj r13 = (X.C126016Kj) r13
            java.lang.String r0 = "Null value passed to getSnapshot!"
            if (r13 == 0) goto L_0x0120
            long r0 = android.os.SystemClock.elapsedRealtime()
            r13.realtimeMs = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r13.uptimeMs = r0
        L_0x0017:
            r0 = 1
            return r0
        L_0x0019:
            boolean r0 = r12 instanceof X.C126106Ks
            if (r0 == 0) goto L_0x008a
            r6 = r12
            X.6Ks r6 = (X.C126106Ks) r6
            X.6Kk r13 = (X.C126026Kk) r13
            monitor-enter(r11)
            boolean r0 = r6.A00     // Catch:{ all -> 0x012e }
            r4 = 0
            if (r0 == 0) goto L_0x0148
            X.7iv r5 = r6.A01     // Catch:{ all -> 0x012e }
            long[] r3 = r6.A02     // Catch:{ all -> 0x012e }
            boolean r0 = r5.A02(r3)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0148
            long[] r10 = r6.A03     // Catch:{ all -> 0x012e }
            r9 = 0
        L_0x0035:
            int r0 = r3.length     // Catch:{ all -> 0x012e }
            if (r9 >= r0) goto L_0x0069
            r7 = r3[r9]     // Catch:{ all -> 0x012e }
            r1 = r10[r9]     // Catch:{ all -> 0x012e }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012e }
            java.lang.String r0 = "Network Bytes decreased from "
            r1.append(r0)     // Catch:{ all -> 0x012e }
            java.lang.String r0 = java.util.Arrays.toString(r10)     // Catch:{ all -> 0x012e }
            r1.append(r0)     // Catch:{ all -> 0x012e }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x012e }
            java.lang.String r0 = java.util.Arrays.toString(r3)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x012e }
            java.lang.String r1 = "NetworkMetricsCollector"
            r0 = 0
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x012e }
            goto L_0x0067
        L_0x0064:
            int r9 = r9 + 1
            goto L_0x0035
        L_0x0067:
            r0 = 0
            goto L_0x006d
        L_0x0069:
            java.lang.System.arraycopy(r3, r4, r10, r4, r0)     // Catch:{ all -> 0x012e }
            r0 = 1
        L_0x006d:
            r6.A00 = r0     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0148
            boolean r2 = r5.A01()     // Catch:{ all -> 0x012e }
            r0 = 0
            r13.mobileBytesTx = r0     // Catch:{ all -> 0x012e }
            r13.mobileBytesRx = r0     // Catch:{ all -> 0x012e }
            r13.wifiBytesTx = r0     // Catch:{ all -> 0x012e }
            r13.wifiBytesRx = r0     // Catch:{ all -> 0x012e }
            X.C126106Ks.A00(r13, r3, r4)     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x0088
            r0 = 4
            X.C126106Ks.A00(r13, r3, r0)     // Catch:{ all -> 0x012e }
        L_0x0088:
            monitor-exit(r11)
            goto L_0x0017
        L_0x008a:
            boolean r0 = r12 instanceof X.C126086Kq
            if (r0 == 0) goto L_0x0091
            monitor-enter(r11)
            goto L_0x0125
        L_0x0091:
            boolean r0 = r12 instanceof X.C126096Kr
            if (r0 == 0) goto L_0x0158
            r2 = r12
            X.6Kr r2 = (X.C126096Kr) r2
            X.6Kl r13 = (X.C126036Kl) r13
            java.lang.String r5 = "CpuMetricsCollector"
            java.lang.String r0 = "Null value passed to getSnapshot!"
            if (r13 == 0) goto L_0x0153
            java.lang.ThreadLocal r1 = r2.A01     // Catch:{ 8RC -> 0x014b }
            java.lang.Object r3 = r1.get()     // Catch:{ 8RC -> 0x014b }
            X.7bg r3 = (X.C153627bg) r3     // Catch:{ 8RC -> 0x014b }
            if (r3 != 0) goto L_0x00b4
            java.lang.String r0 = "/proc/self/stat"
            X.7bg r3 = new X.7bg     // Catch:{ 8RC -> 0x014b }
            r3.<init>(r0)     // Catch:{ 8RC -> 0x014b }
            r1.set(r3)     // Catch:{ 8RC -> 0x014b }
        L_0x00b4:
            r3.A02()     // Catch:{ 8RC -> 0x014b }
            boolean r0 = r3.A05     // Catch:{ 8RC -> 0x014b }
            if (r0 == 0) goto L_0x0149
            r1 = 0
        L_0x00bc:
            r3.A04()     // Catch:{ 8RC -> 0x014b }
            int r1 = r1 + 1
            r0 = 13
            if (r1 < r0) goto L_0x00bc
            double r0 = X.C126096Kr.A00(r3)     // Catch:{ 8RC -> 0x014b }
            r13.userTimeS = r0     // Catch:{ 8RC -> 0x014b }
            double r0 = X.C126096Kr.A00(r3)     // Catch:{ 8RC -> 0x014b }
            r13.systemTimeS = r0     // Catch:{ 8RC -> 0x014b }
            double r0 = X.C126096Kr.A00(r3)     // Catch:{ 8RC -> 0x014b }
            r13.childUserTimeS = r0     // Catch:{ 8RC -> 0x014b }
            double r0 = X.C126096Kr.A00(r3)     // Catch:{ 8RC -> 0x014b }
            r13.childSystemTimeS = r0     // Catch:{ 8RC -> 0x014b }
            java.lang.ThreadLocal r1 = r2.A00
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x00ed
            X.6Kl r0 = new X.6Kl
            r0.<init>()
            r1.set(r0)
        L_0x00ed:
            java.lang.Object r4 = r1.get()
            X.6Kl r4 = (X.C126036Kl) r4
            double r2 = r13.userTimeS
            double r0 = r4.userTimeS
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x0131
            double r2 = r13.systemTimeS
            double r0 = r4.systemTimeS
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x0131
            double r2 = r13.childUserTimeS
            double r0 = r4.childUserTimeS
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x0131
            double r2 = r13.childSystemTimeS
            double r0 = r4.childSystemTimeS
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 < 0) goto L_0x0131
            r4.A02(r13)
            goto L_0x0017
        L_0x0120:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0125:
            java.lang.String r0 = "Null value passed to getSnapshot!"
            if (r13 != 0) goto L_0x0148
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x012e:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0131:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cpu Time Decreased from "
            X.C18270x1.A1H(r1, r0, r4)
            java.lang.String r0 = " to "
            X.C18270x1.A1H(r1, r0, r13)
            java.lang.String r1 = r1.toString()
            r0 = 0
            android.util.Log.e(r5, r1, r0)
            goto L_0x0149
        L_0x0148:
            monitor-exit(r11)
        L_0x0149:
            r0 = 0
            return r0
        L_0x014b:
            r1 = move-exception
            java.lang.String r0 = "Unable to parse CPU time field"
            android.util.Log.e(r5, r0, r1)
            r0 = 0
            return r0
        L_0x0153:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0158:
            r8 = r12
            X.6Kp r8 = (X.C126076Kp) r8
            X.6Kn r13 = (X.C126056Kn) r13
            java.lang.String r0 = "Null value passed to getSnapshot!"
            if (r13 == 0) goto L_0x0198
            X.0Wz r7 = r13.mMetricsMap
            int r6 = r7.size()
            r5 = 0
            r4 = 0
        L_0x0169:
            if (r5 >= r6) goto L_0x0197
            java.lang.Object[] r1 = r7.A02
            int r0 = r5 << 1
            r3 = r1[r0]
            java.lang.Class r3 = (java.lang.Class) r3
            X.0Wz r0 = r8.A00
            java.lang.Object r1 = r0.get(r3)
            X.7Uj r1 = (X.C151347Uj) r1
            if (r1 == 0) goto L_0x0195
            X.8L6 r0 = r13.A02(r3)
            boolean r2 = r1.A02(r0)
        L_0x0185:
            X.0Wz r1 = r13.mMetricsValid
            if (r2 == 0) goto L_0x0192
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x018b:
            r1.put(r3, r0)
            r4 = r4 | r2
            int r5 = r5 + 1
            goto L_0x0169
        L_0x0192:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x018b
        L_0x0195:
            r2 = 0
            goto L_0x0185
        L_0x0197:
            return r4
        L_0x0198:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151347Uj.A02(X.8L6):boolean");
    }

    public AnonymousClass8L6 A01() {
        if (this instanceof C126066Ko) {
            return new C126016Kj();
        }
        if (this instanceof C126106Ks) {
            return new C126026Kk();
        }
        if (this instanceof C126086Kq) {
            return new C126046Km();
        }
        if (this instanceof C126096Kr) {
            return new C126036Kl();
        }
        C126056Kn r6 = new C126056Kn();
        C06290Wz r5 = ((C126076Kp) this).A00;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            Object[] objArr = r5.A02;
            int i2 = i << 1;
            Object obj = objArr[i2];
            r6.mMetricsMap.put(obj, ((C151347Uj) objArr[i2 + 1]).A01());
            r6.mMetricsValid.put(obj, Boolean.FALSE);
        }
        return r6;
    }
}
