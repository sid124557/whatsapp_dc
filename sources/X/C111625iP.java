package X;

/* renamed from: X.5iP  reason: invalid class name and case insensitive filesystem */
public final class C111625iP implements AnonymousClass66U {
    public final C46272bM A00;
    public final C51072jE A01;

    public String BDW() {
        return "PhonyIDAsyncInit";
    }

    public /* synthetic */ void BMe() {
    }

    public C111625iP(C46272bM r1, C51072jE r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if ("true".equals(java.lang.System.getProperty("fb.running_e2e")) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BMd() {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PhonyIDAsyncInit"
            r1.append(r0)
            java.lang.String r0 = ": onAsyncInitAnyUserState - PhoneIdRequester"
            X.C18260x0.A1J(r1, r0)
            X.2jE r0 = r5.A01
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0056
            java.lang.Class<X.5Yp> r4 = X.C106345Yp.class
            monitor-enter(r4)
            X.C106345Yp.A00()     // Catch:{ all -> 0x004b }
            boolean r0 = X.C106345Yp.A02     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0048
            java.lang.String r3 = "true"
            java.lang.String r1 = "fb.running_e2e"
            java.lang.String r0 = X.C159907mf.A01(r1)     // Catch:{ all -> 0x004b }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x004b }
            r2 = 1
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x004b }
            boolean r1 = r3.equals(r0)     // Catch:{ all -> 0x004b }
            r0 = 0
            if (r1 == 0) goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            X.C106345Yp.A03 = r0     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "EndToEnd-Test"
            java.lang.String r0 = "Is running E2E test"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x004b }
        L_0x0046:
            X.C106345Yp.A02 = r2     // Catch:{ all -> 0x004b }
        L_0x0048:
            boolean r0 = X.C106345Yp.A03     // Catch:{ all -> 0x004b }
            goto L_0x004e
        L_0x004b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x004e:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x0056
            X.2bM r0 = r5.A00
            r0.A00()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111625iP.BMd():void");
    }
}
