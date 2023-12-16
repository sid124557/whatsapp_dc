package X;

/* renamed from: X.3ak  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70593ak implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C29011i8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r3.A09(r4, r5, r6, r7, false).A00(new X.C86464Kf(r3, 1)) != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        com.whatsapp.util.Log.d("routeselector/prewarm/skipped; no valid routes available yet");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.1i8 r3 = r9.A01
            java.lang.String r4 = r9.A02
            java.lang.String r5 = r9.A03
            java.lang.String r6 = r9.A04
            int r7 = r9.A00
            r3.A0K()
            java.lang.Object r1 = r3.A0J
            monitor-enter(r1)
            X.5LI r0 = r3.A0B()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "routeselector/prewarm/skipped; no routing response available yet"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0037 }
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            return
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            r8 = 0
            X.2YO r2 = r3.A09(r4, r5, r6, r7, r8)
            r1 = 1
            X.4Kf r0 = new X.4Kf
            r0.<init>(r3, r1)
            java.lang.Object r0 = r2.A00(r0)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "routeselector/prewarm/skipped; no valid routes available yet"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70593ak.run():void");
    }

    public /* synthetic */ C70593ak(C29011i8 r1, String str, String str2, String str3, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i;
    }
}
