package X;

/* renamed from: X.7ei  reason: invalid class name and case insensitive filesystem */
public final class C155347ei {
    public static final Object A00 = AnonymousClass002.A0D();
    public static volatile AnonymousClass8L7 A01 = AnonymousClass6V2.A00;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r1 = r9.getAuthority()
            java.lang.String r7 = "com.google.android.gms.phenotype"
            boolean r0 = r7.equals(r1)
            r5 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r2 = "PhenotypeClientHelper"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            X.AnonymousClass6C9.A14(r1, r0, r2)
            return r5
        L_0x0019:
            X.8L7 r0 = A01
            boolean r0 = r0 instanceof X.AnonymousClass6V1
            if (r0 != 0) goto L_0x0087
            java.lang.Object r6 = A00
            monitor-enter(r6)
            X.8L7 r0 = A01     // Catch:{ all -> 0x0084 }
            boolean r0 = r0 instanceof X.AnonymousClass6V1     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x003f
            X.8L7 r1 = A01     // Catch:{ all -> 0x0084 }
            boolean r0 = r1 instanceof X.AnonymousClass6V1     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0038
            X.6V1 r1 = (X.AnonymousClass6V1) r1     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r1.zza     // Catch:{ all -> 0x0084 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ all -> 0x0084 }
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            return r0
        L_0x0038:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x003f:
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r0 = r8.getPackageName()     // Catch:{ all -> 0x0084 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0059
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ all -> 0x0084 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0084 }
            r1 = 29
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 >= r1) goto L_0x0069
            r0 = 0
            goto L_0x0069
        L_0x0059:
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ all -> 0x0084 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0077 }
            int r0 = r0.flags     // Catch:{ all -> 0x0084 }
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L_0x0077
            r5 = 1
            goto L_0x0077
        L_0x0069:
            android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r7, r0)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x0084 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0059
        L_0x0077:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0084 }
            X.6V1 r0 = new X.6V1     // Catch:{ all -> 0x0084 }
            r0.<init>(r1)     // Catch:{ all -> 0x0084 }
            A01 = r0     // Catch:{ all -> 0x0084 }
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            throw r0
        L_0x0087:
            X.8L7 r1 = A01
            boolean r0 = r1 instanceof X.AnonymousClass6V1
            if (r0 == 0) goto L_0x0096
            X.6V1 r1 = (X.AnonymousClass6V1) r1
            java.lang.Object r0 = r1.zza
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            return r0
        L_0x0096:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155347ei.A00(android.content.Context, android.net.Uri):boolean");
    }
}
