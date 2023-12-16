package X;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.7U4  reason: invalid class name */
public final class AnonymousClass7U4 {
    public C146667Bd A00;
    public Boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass8CS A04;
    public final /* synthetic */ FirebaseInstanceId A05;

    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|7|8|9|(6:14|15|(1:17)(4:19|20|(1:28)|29)|18|(3:32|33|(2:35|97))|47)|13|15|(0)(0)|18|(0)|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e4, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[SYNTHETIC, Splitter:B:19:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[SYNTHETIC, Splitter:B:32:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A00() {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            boolean r0 = r7.A03     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "com.google.firebase.messaging.FirebaseMessaging"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000c }
            goto L_0x0031
        L_0x000c:
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00e6 }
            X.7qO r0 = r0.A01     // Catch:{ all -> 0x00e6 }
            r0.A02()     // Catch:{ all -> 0x00e6 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ all -> 0x00e6 }
            r2.setPackage(r0)     // Catch:{ all -> 0x00e6 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x00e6 }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r2, r0)     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0033
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0033
        L_0x0031:
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r7.A02 = r0     // Catch:{ all -> 0x00e6 }
            java.lang.String r5 = "firebase_messaging_auto_init_enabled"
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00e6 }
            X.7qO r0 = r0.A01     // Catch:{ all -> 0x00e6 }
            r0.A02()     // Catch:{ all -> 0x00e6 }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "com.google.firebase.messaging"
            r3 = 0
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r0, r3)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = "auto_init"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r2.getBoolean(r1, r3)     // Catch:{ all -> 0x00e6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00e6 }
        L_0x0058:
            r7.A01 = r0     // Catch:{ all -> 0x00e6 }
            goto L_0x0084
        L_0x005b:
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0082 }
            if (r2 == 0) goto L_0x0082
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0082 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0082 }
            if (r1 == 0) goto L_0x0082
            android.os.Bundle r0 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0082 }
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.containsKey(r5)     // Catch:{ NameNotFoundException -> 0x0082 }
            if (r0 == 0) goto L_0x0082
            android.os.Bundle r0 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0082 }
            boolean r0 = r0.getBoolean(r5)     // Catch:{ NameNotFoundException -> 0x0082 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x0058
        L_0x0082:
            r0 = 0
            goto L_0x0058
        L_0x0084:
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r7.A02     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00b8
            X.7Bd r5 = new X.7Bd     // Catch:{ all -> 0x00e6 }
            r5.<init>(r7)     // Catch:{ all -> 0x00e6 }
            r7.A00 = r5     // Catch:{ all -> 0x00e6 }
            X.8CS r4 = r7.A04     // Catch:{ all -> 0x00e6 }
            java.lang.Class<X.70N> r3 = X.AnonymousClass70N.class
            java.util.concurrent.Executor r2 = r4.A02     // Catch:{ all -> 0x00e6 }
            monitor-enter(r4)     // Catch:{ all -> 0x00e6 }
            X.C162177rO.A02(r2)     // Catch:{ all -> 0x00b4 }
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x00b4 }
            boolean r0 = r1.containsKey(r3)     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00aa
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass0x9.A1D()     // Catch:{ all -> 0x00b4 }
            r1.put(r3, r0)     // Catch:{ all -> 0x00b4 }
        L_0x00aa:
            java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x00b4 }
            r0.put(r5, r2)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b7
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00b7:
            monitor-exit(r4)     // Catch:{ all -> 0x00e6 }
        L_0x00b8:
            r0 = 1
            r7.A03 = r0     // Catch:{ all -> 0x00e6 }
        L_0x00bb:
            java.lang.Boolean r0 = r7.A01     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00e8 }
            monitor-exit(r6)
            return r0
        L_0x00c5:
            boolean r0 = r7.A02     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e3
            com.google.firebase.iid.FirebaseInstanceId r0 = r7.A05     // Catch:{ all -> 0x00e8 }
            X.7qO r0 = r0.A01     // Catch:{ all -> 0x00e8 }
            r0.A02()     // Catch:{ all -> 0x00e8 }
            X.8CV r0 = r0.A03     // Catch:{ all -> 0x00e8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e8 }
            X.7MM r0 = (X.AnonymousClass7MM) r0     // Catch:{ all -> 0x00e8 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A03     // Catch:{ all -> 0x00e8 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e3
            monitor-exit(r6)
            r0 = 1
            return r0
        L_0x00e3:
            monitor-exit(r6)
            r0 = 0
            return r0
        L_0x00e6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7U4.A00():boolean");
    }

    public AnonymousClass7U4(AnonymousClass8CS r1, FirebaseInstanceId firebaseInstanceId) {
        this.A05 = firebaseInstanceId;
        this.A04 = r1;
    }
}
