package X;

/* renamed from: X.1qh  reason: invalid class name and case insensitive filesystem */
public class C32481qh extends C69823Yn {
    public final C55902r6 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r6 == X.AnonymousClass216.A02) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IInterface A00() {
        /*
            r13 = this;
            X.2r6 r5 = r13.A00
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "svc-client/getBinder; service="
            r4.append(r2)
            java.lang.String r3 = "GoogleMigrateClient"
            java.lang.String r12 = X.AnonymousClass000.A0X(r3, r4)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r12)
            java.lang.String r8 = ", timeout="
            X.C18260x0.A10(r8, r2, r0)
            if (r5 != r5) goto L_0x0294
            monitor-enter(r5)
            X.37I r2 = r5.A01     // Catch:{ all -> 0x0291 }
            r11 = 1
            if (r2 != 0) goto L_0x0048
            android.content.Context r9 = r5.A04     // Catch:{ all -> 0x0291 }
            X.2qk r7 = r5.A05     // Catch:{ all -> 0x0291 }
            X.2I4 r6 = new X.2I4     // Catch:{ all -> 0x0291 }
            r6.<init>(r5)     // Catch:{ all -> 0x0291 }
            X.2I5 r4 = new X.2I5     // Catch:{ all -> 0x0291 }
            r4.<init>(r5)     // Catch:{ all -> 0x0291 }
            X.37I r2 = new X.37I     // Catch:{ all -> 0x0291 }
            r2.<init>(r9, r7, r6, r4)     // Catch:{ all -> 0x0291 }
            r5.A01 = r2     // Catch:{ all -> 0x0291 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x0291 }
            java.lang.String r2 = ", new connection created"
            X.C18260x0.A1J(r4, r2)     // Catch:{ all -> 0x0291 }
        L_0x0043:
            X.37I r4 = r5.A01     // Catch:{ all -> 0x0291 }
            if (r11 == 0) goto L_0x012d
            goto L_0x0092
        L_0x0048:
            java.lang.Object r7 = r2.A06     // Catch:{ all -> 0x0291 }
            monitor-enter(r7)     // Catch:{ all -> 0x0291 }
            X.216 r6 = r2.A01     // Catch:{ all -> 0x01c4 }
            X.216 r2 = X.AnonymousClass216.CONNECTING     // Catch:{ all -> 0x01c4 }
            if (r6 == r2) goto L_0x0056
            X.216 r4 = X.AnonymousClass216.CONNECTED     // Catch:{ all -> 0x01c4 }
            r2 = 0
            if (r6 != r4) goto L_0x0057
        L_0x0056:
            r2 = 1
        L_0x0057:
            monitor-exit(r7)     // Catch:{ all -> 0x01c4 }
            r9 = 0
            if (r2 != 0) goto L_0x0090
            X.37I r2 = r5.A01     // Catch:{ all -> 0x0291 }
            r2.A01(r9)     // Catch:{ all -> 0x0291 }
            android.content.Context r10 = r5.A04     // Catch:{ all -> 0x0291 }
            X.2qk r7 = r5.A05     // Catch:{ all -> 0x0291 }
            X.2I4 r6 = new X.2I4     // Catch:{ all -> 0x0291 }
            r6.<init>(r5)     // Catch:{ all -> 0x0291 }
            X.2I5 r4 = new X.2I5     // Catch:{ all -> 0x0291 }
            r4.<init>(r5)     // Catch:{ all -> 0x0291 }
            X.37I r2 = new X.37I     // Catch:{ all -> 0x0291 }
            r2.<init>(r10, r7, r6, r4)     // Catch:{ all -> 0x0291 }
            r5.A01 = r2     // Catch:{ all -> 0x0291 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x0291 }
            java.lang.String r2 = ", existing connection has unexpected state; new connection created"
            X.C18260x0.A1J(r4, r2)     // Catch:{ all -> 0x0291 }
            java.lang.String r6 = "svc-client-inconsistent-connection"
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0291 }
            java.lang.String r2 = "name="
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r3, r4)     // Catch:{ all -> 0x0291 }
            r7.A0A(r6, r9, r2)     // Catch:{ all -> 0x0291 }
            goto L_0x0043
        L_0x0090:
            r11 = 0
            goto L_0x0043
        L_0x0092:
            java.lang.String r6 = r5.A02     // Catch:{ all -> 0x0123 }
            if (r6 != 0) goto L_0x00ae
            java.lang.String r6 = "com.google.android.apps.restore"
            boolean r2 = r5.A05(r6)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00ac
            java.lang.String r6 = "com.google.android.apps.pixelmigrate"
            boolean r2 = r5.A05(r6)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00ac
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ all -> 0x0123 }
            r0.<init>()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x00ac:
            r5.A02 = r6     // Catch:{ all -> 0x0123 }
        L_0x00ae:
            android.content.Intent r7 = X.C18320x8.A07()     // Catch:{ NameNotFoundException -> 0x0125 }
            r7.setPackage(r6)     // Catch:{ NameNotFoundException -> 0x0125 }
            java.lang.String r2 = "com.google.android.apps.pixelmigrate.IOS_APP_DATA_READER_SERVICE"
            r7.setAction(r2)     // Catch:{ NameNotFoundException -> 0x0125 }
            r6 = 1
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0291 }
            java.lang.String r2 = "svc-connection/start-connect; service="
            java.lang.String r12 = X.AnonymousClass000.A0V(r2, r3, r9)     // Catch:{ all -> 0x0291 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x0291 }
            java.lang.String r2 = ", intent="
            X.C18260x0.A1R(r9, r2, r7)     // Catch:{ all -> 0x0291 }
            java.lang.Object r10 = r4.A06     // Catch:{ all -> 0x0291 }
            monitor-enter(r10)     // Catch:{ all -> 0x0291 }
            X.216 r9 = r4.A01     // Catch:{ all -> 0x011f }
            X.216 r2 = X.AnonymousClass216.NEW     // Catch:{ all -> 0x011f }
            if (r9 != r2) goto L_0x0101
            X.216 r9 = X.AnonymousClass216.CONNECTING     // Catch:{ all -> 0x011f }
            r4.A01 = r9     // Catch:{ all -> 0x011f }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = " -> state="
            X.C18260x0.A1R(r2, r11, r9)     // Catch:{ all -> 0x011f }
            monitor-exit(r10)     // Catch:{ all -> 0x011f }
            android.content.Context r2 = r4.A03     // Catch:{ all -> 0x0291 }
            boolean r9 = r2.bindService(r7, r4, r6)     // Catch:{ all -> 0x0291 }
            if (r9 != 0) goto L_0x012d
            monitor-enter(r10)     // Catch:{ all -> 0x0291 }
            X.216 r1 = X.AnonymousClass216.CLOSED     // Catch:{ all -> 0x00fd }
            r4.A01 = r1     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x00fd }
            X.C18260x0.A1Q(r0, r11, r1)     // Catch:{ all -> 0x00fd }
            monitor-exit(r10)     // Catch:{ all -> 0x00fd }
            goto L_0x01c7
        L_0x00fd:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00fd }
            goto L_0x0211
        L_0x0101:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = ", cannot start from state="
            X.C18260x0.A1Q(r1, r0, r9)     // Catch:{ all -> 0x011f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "Cannot start connection from state: "
            r1.append(r0)     // Catch:{ all -> 0x011f }
            X.216 r0 = r4.A01     // Catch:{ all -> 0x011f }
            java.lang.String r1 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x011f }
            X.24Q r0 = new X.24Q     // Catch:{ all -> 0x011f }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x011f }
            throw r0     // Catch:{ all -> 0x011f }
        L_0x011f:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x011f }
            goto L_0x0211
        L_0x0123:
            r0 = move-exception
            throw r0     // Catch:{ NameNotFoundException -> 0x0125 }
        L_0x0125:
            r0 = move-exception
            X.24Q r1 = new X.24Q     // Catch:{ all -> 0x0291 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0291 }
            goto L_0x0211
        L_0x012d:
            monitor-exit(r5)     // Catch:{ all -> 0x0291 }
            boolean r2 = X.C615631i.A02()
            r5 = r2 ^ 1
            java.lang.String r2 = "Cannot be called from main thread, will deadlock."
            X.C626936e.A0F(r5, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r9 = "svc-connection/await-binder; service="
            java.lang.String r12 = X.AnonymousClass000.A0V(r9, r3, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r12)
            X.C18260x0.A10(r8, r2, r0)
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 + r0
            java.lang.Object r2 = r4.A06
            monitor-enter(r2)
        L_0x0153:
            X.216 r8 = r4.A01     // Catch:{ all -> 0x01c1 }
            X.216 r0 = X.AnonymousClass216.CONNECTED     // Catch:{ all -> 0x01c1 }
            if (r8 != r0) goto L_0x015f
            android.os.IInterface r0 = r4.A00     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01b0
            monitor-exit(r2)     // Catch:{ all -> 0x01c1 }
            goto L_0x0173
        L_0x015f:
            X.216 r0 = X.AnonymousClass216.CONNECTING     // Catch:{ all -> 0x01c1 }
            if (r8 != r0) goto L_0x0192
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01c1 }
            long r0 = r10 - r5
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0174
            r2.wait(r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x0153
        L_0x0173:
            return r0
        L_0x0174:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = ", timed out when in state="
            X.C18260x0.A1Q(r1, r0, r8)     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "Timed out. Connection state: "
            r1.append(r0)     // Catch:{ all -> 0x01c1 }
            X.216 r0 = r4.A01     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x01c1 }
            X.24Q r1 = new X.24Q     // Catch:{ all -> 0x01c1 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x01c0
        L_0x0192:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = ", not in CONNECTING state; state="
            X.C18260x0.A1Q(r1, r0, r8)     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "Cannot wait for binder from state: "
            r1.append(r0)     // Catch:{ all -> 0x01c1 }
            X.216 r0 = r4.A01     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x01c1 }
            X.24Q r1 = new X.24Q     // Catch:{ all -> 0x01c1 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x01c0
        L_0x01b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r9, r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = ", null binder"
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "Unexpected failure. Connected with null binder."
            X.24Q r1 = new X.24Q     // Catch:{ all -> 0x01c1 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x01c1 }
        L_0x01c0:
            throw r1     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01c1 }
            throw r0
        L_0x01c4:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01c4 }
            goto L_0x0211
        L_0x01c7:
            android.content.ComponentName r8 = r7.getComponent()     // Catch:{ all -> 0x0291 }
            r4 = 0
            if (r8 != 0) goto L_0x023b
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ all -> 0x0291 }
            java.util.List r8 = r0.queryIntentServices(r7, r4)     // Catch:{ all -> 0x0291 }
            int r0 = r8.size()     // Catch:{ all -> 0x0291 }
            if (r0 != 0) goto L_0x0212
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "No services found for "
            r1.append(r0)     // Catch:{ all -> 0x0291 }
            r1.append(r7)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = ". Did you update AndroidManifest/queries to enable package visibility for target service?"
            r1.append(r0)     // Catch:{ all -> 0x0291 }
        L_0x01ed:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0291 }
        L_0x01f1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = ", failed to bind; "
            X.C18260x0.A0t(r0, r2, r1)     // Catch:{ all -> 0x0291 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "Failed to bind to "
            r1.append(r0)     // Catch:{ all -> 0x0291 }
            r1.append(r3)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x0291 }
            X.24Q r1 = new X.24Q     // Catch:{ all -> 0x0291 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0291 }
        L_0x0211:
            throw r1     // Catch:{ all -> 0x0291 }
        L_0x0212:
            int r0 = r8.size()     // Catch:{ all -> 0x0291 }
            if (r0 <= r6) goto L_0x022a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "Multiple services ("
            X.AnonymousClass000.A1H(r0, r1, r8)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = ") found for "
            r1.append(r0)     // Catch:{ all -> 0x0291 }
            r1.append(r7)     // Catch:{ all -> 0x0291 }
            goto L_0x01ed
        L_0x022a:
            java.lang.Object r0 = r8.get(r4)     // Catch:{ all -> 0x0291 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ all -> 0x0291 }
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ all -> 0x0291 }
            java.lang.String r1 = r0.packageName     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x0291 }
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ all -> 0x0291 }
            r8.<init>(r1, r0)     // Catch:{ all -> 0x0291 }
        L_0x023b:
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ all -> 0x0291 }
            java.lang.String r7 = r8.getPackageName()     // Catch:{ all -> 0x0291 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x027a }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x027a }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x027a }
            if (r0 != 0) goto L_0x025a
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x027a }
            java.lang.String r1 = "Package %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x027a }
            r0[r4] = r7     // Catch:{ NameNotFoundException -> 0x027a }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x027a }
            goto L_0x01f1
        L_0x025a:
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r8, r4)     // Catch:{ NameNotFoundException -> 0x0283 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0283 }
            if (r0 != 0) goto L_0x026f
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0283 }
            java.lang.String r1 = "Service %s is disabled."
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x0283 }
            r0[r4] = r8     // Catch:{ NameNotFoundException -> 0x0283 }
            java.lang.String r2 = java.lang.String.format(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x0283 }
            goto L_0x01f1
        L_0x026f:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0291 }
            java.lang.Object[] r1 = X.C18310x6.A1b(r7, r4)     // Catch:{ all -> 0x0291 }
            r1[r6] = r8     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "Package %s is present and enabled; service %s is present and enabled."
            goto L_0x028b
        L_0x027a:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0291 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0291 }
            r1[r4] = r7     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "Package %s is not present."
            goto L_0x028b
        L_0x0283:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0291 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0291 }
            r1[r4] = r8     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "Service %s is not present."
        L_0x028b:
            java.lang.String r2 = java.lang.String.format(r2, r0, r1)     // Catch:{ all -> 0x0291 }
            goto L_0x01f1
        L_0x0291:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0291 }
            throw r0
        L_0x0294:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "A session from a different client has been provided. Client: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32481qh.A00():android.os.IInterface");
    }

    public C32481qh(C55902r6 r1) {
        super(r1);
        this.A00 = r1;
    }
}
