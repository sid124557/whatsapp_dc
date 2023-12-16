package X;

/* renamed from: X.3eP  reason: invalid class name and case insensitive filesystem */
public final class C72853eP implements AnonymousClass4C9 {
    public final AnonymousClass4GR A00;
    public final AnonymousClass4C9 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (((X.C72853eP) r1).A00(r6) == r5) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C84814Du r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C74533hH
            if (r0 == 0) goto L_0x0068
            r6 = r8
            X.3hH r6 = (X.C74533hH) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r3) goto L_0x0026
            if (r0 != r4) goto L_0x006e
            X.C57682u2.A01(r1)
        L_0x0023:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0026:
            java.lang.Object r2 = r6.L$1
            X.8P9 r2 = (X.AnonymousClass8P9) r2
            java.lang.Object r0 = r6.L$0
            X.3eP r0 = (X.C72853eP) r0
            X.C57682u2.A01(r1)     // Catch:{ all -> 0x0073 }
            goto L_0x004f
        L_0x0032:
            X.C57682u2.A01(r1)
            X.4C9 r1 = r7.A01
            X.4Gl r0 = r6.B5w()
            X.3hZ r2 = new X.3hZ
            r2.<init>(r0, r1)
            X.4GR r0 = r7.A00     // Catch:{ all -> 0x0073 }
            r6.L$0 = r7     // Catch:{ all -> 0x0073 }
            r6.L$1 = r2     // Catch:{ all -> 0x0073 }
            r6.label = r3     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r0.invoke(r2, r6)     // Catch:{ all -> 0x0073 }
            if (r0 == r5) goto L_0x0067
            r0 = r7
        L_0x004f:
            r2.A08()
            X.4C9 r1 = r0.A01
            boolean r0 = r1 instanceof X.C72853eP
            if (r0 == 0) goto L_0x0023
            X.3eP r1 = (X.C72853eP) r1
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r0 = r1.A00(r6)
            if (r0 != r5) goto L_0x0023
        L_0x0067:
            return r5
        L_0x0068:
            X.3hH r6 = new X.3hH
            r6.<init>(r8, r7)
            goto L_0x0012
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0073:
            r0 = move-exception
            r2.A08()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72853eP.A00(X.4Du):java.lang.Object");
    }

    public Object B2K(Object obj, C84814Du r3) {
        return this.A01.B2K(obj, r3);
    }

    public C72853eP(AnonymousClass4GR r1, AnonymousClass4C9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
