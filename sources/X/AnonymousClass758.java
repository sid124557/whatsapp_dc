package X;

/* renamed from: X.758  reason: invalid class name */
public class AnonymousClass758 {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r3.A01 == null) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r7, X.AnonymousClass33p r8) {
        /*
            if (r7 == 0) goto L_0x00c3
            X.0Vt r3 = new X.0Vt
            r3.<init>(r7)
            X.80a r5 = new X.80a
            r5.<init>(r3, r8)
            int r2 = r3.A00
            r0 = 2
            if (r2 != r0) goto L_0x001a
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r0 = r3.A02
            if (r0 == 0) goto L_0x001a
            android.content.ServiceConnection r1 = r3.A01
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r4 = 0
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "Service connection is valid. No need to re-initialize."
            X.AnonymousClass0S4.A00(r0)
            r5.BUe(r4)
        L_0x0026:
            return
        L_0x0027:
            r0 = 3
            r6 = 1
            if (r2 != r6) goto L_0x003a
            java.lang.String r2 = "Client is already in the process of connecting to the service."
        L_0x002d:
            java.lang.String r1 = "InstallReferrerClient"
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0026
            android.util.Log.w(r1, r2)
            return
        L_0x003a:
            if (r2 != r0) goto L_0x003f
            java.lang.String r2 = "Client was already closed and can't be reused. Please create another instance."
            goto L_0x002d
        L_0x003f:
            java.lang.String r0 = "Starting install referrer service setup."
            X.AnonymousClass0S4.A00(r0)
            java.lang.String r0 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            android.content.Intent r7 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r1 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            java.lang.String r8 = "com.android.vending"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r8, r1)
            r7.setComponent(r0)
            android.content.Context r2 = r3.A03
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.util.List r1 = r0.queryIntentServices(r7, r4)
            if (r1 == 0) goto L_0x00bb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00bb
            java.lang.Object r0 = r1.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r1 = r0.serviceInfo
            if (r1 == 0) goto L_0x00bb
            java.lang.String r0 = r1.packageName
            java.lang.String r1 = r1.name
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a7
            if (r1 == 0) goto L_0x00a7
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r8, r0)     // Catch:{ NameNotFoundException -> 0x00a7 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00a7 }
            r0 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r1 < r0) goto L_0x00a7
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7)
            X.0Z8 r0 = new X.0Z8
            r0.<init>(r3, r5)
            r3.A01 = r0
            boolean r0 = r2.bindService(r1, r0, r6)     // Catch:{ SecurityException -> 0x00aa }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "Service was bonded successfully."
            goto L_0x00bf
        L_0x00a4:
            java.lang.String r2 = "Connection to service is blocked."
            goto L_0x00ac
        L_0x00a7:
            java.lang.String r2 = "Play Store missing or incompatible. Version 8.3.73 or later required."
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r2 = "No permission to connect to service."
        L_0x00ac:
            java.lang.String r1 = "InstallReferrerClient"
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x00b8
            android.util.Log.w(r1, r2)
        L_0x00b8:
            r3.A00 = r4
            return
        L_0x00bb:
            r3.A00 = r4
            java.lang.String r0 = "Install Referrer service unavailable on device."
        L_0x00bf:
            X.AnonymousClass0S4.A00(r0)
            return
        L_0x00c3:
            java.lang.String r0 = "Please provide a valid Context."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass758.A00(android.content.Context, X.33p):void");
    }
}
