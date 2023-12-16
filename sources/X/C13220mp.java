package X;

/* renamed from: X.0mp  reason: invalid class name and case insensitive filesystem */
public abstract class C13220mp implements Runnable {
    public final C08960fQ A00 = new C08960fQ();

    public abstract void A00();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        if (r2 != null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C06310Xb r7, java.lang.String r8) {
        /*
            r6 = this;
            androidx.work.impl.WorkDatabase r0 = r7.A04
            X.0uV r5 = r0.A0J()
            X.0sZ r4 = r0.A0E()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r3.add(r8)
        L_0x0012:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0037
            java.lang.Object r2 = r3.remove()
            java.lang.String r2 = (java.lang.String) r2
            X.0GD r1 = r5.BDH(r2)
            X.0GD r0 = X.AnonymousClass0GD.SUCCEEDED
            if (r1 == r0) goto L_0x002f
            X.0GD r0 = X.AnonymousClass0GD.FAILED
            if (r1 == r0) goto L_0x002f
            X.0GD r0 = X.AnonymousClass0GD.CANCELLED
            r5.BnQ(r0, r2)
        L_0x002f:
            java.util.List r0 = r4.B6v(r2)
            r3.addAll(r0)
            goto L_0x0012
        L_0x0037:
            X.0fW r5 = r7.A03
            java.lang.Object r4 = r5.A0A
            monitor-enter(r4)
            X.0Wu r3 = X.C06240Wu.A00()     // Catch:{ all -> 0x008e }
            java.lang.String r2 = X.C09020fW.A0C     // Catch:{ all -> 0x008e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Processor cancelling "
            r1.append(r0)     // Catch:{ all -> 0x008e }
            X.C06240Wu.A03(r3, r8, r2, r1)     // Catch:{ all -> 0x008e }
            java.util.Set r0 = r5.A09     // Catch:{ all -> 0x008e }
            r0.add(r8)     // Catch:{ all -> 0x008e }
            java.util.Map r0 = r5.A07     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r0.remove(r8)     // Catch:{ all -> 0x008e }
            X.0n1 r2 = (X.C13340n1) r2     // Catch:{ all -> 0x008e }
            r1 = 1
            if (r2 != 0) goto L_0x0069
            r1 = 0
            java.util.Map r0 = r5.A06     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r0.remove(r8)     // Catch:{ all -> 0x008e }
            X.0n1 r2 = (X.C13340n1) r2     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x006e
        L_0x0069:
            java.util.Map r0 = r5.A08     // Catch:{ all -> 0x008e }
            r0.remove(r8)     // Catch:{ all -> 0x008e }
        L_0x006e:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            X.C09020fW.A00(r2, r8)
            if (r1 == 0) goto L_0x0077
            r5.A01()
        L_0x0077:
            java.util.List r0 = r7.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x007d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r1.next()
            X.0uB r0 = (X.C16880uB) r0
            r0.AyW(r8)
            goto L_0x007d
        L_0x008d:
            return
        L_0x008e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13220mp.A01(X.0Xb, java.lang.String):void");
    }

    public void run() {
        try {
            A00();
            this.A00.A00(C17140ud.A01);
        } catch (Throwable th) {
            this.A00.A00(new C01440Av(th));
        }
    }
}
