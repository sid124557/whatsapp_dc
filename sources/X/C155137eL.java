package X;

/* renamed from: X.7eL  reason: invalid class name and case insensitive filesystem */
public class C155137eL {
    public static boolean A00;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(android.content.Context r9) {
        /*
            java.lang.Class<X.7eL> r8 = X.C155137eL.class
            monitor-enter(r8)
            boolean r0 = A00     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "whatsappsoloader/init: already initialized"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x0090
        L_0x000e:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a0 }
            r0 = 23
            r7 = 0
            if (r1 >= r0) goto L_0x0033
            java.lang.String r1 = X.AnonymousClass321.A02()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "x86"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0033
            X.3Ax r1 = X.C63793Ax.A00()     // Catch:{ all -> 0x00a0 }
            java.lang.String[] r0 = com.facebook.soloader.SoLoader.A0B     // Catch:{ all -> 0x00a0 }
            com.facebook.soloader.SoLoader.A01(r9, r1, r0, r7)     // Catch:{ all -> 0x00a0 }
            goto L_0x0036
        L_0x0033:
            com.facebook.soloader.SoLoader.init(r9, r7)     // Catch:{ all -> 0x00a0 }
        L_0x0036:
            r3 = 1
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "decompressed/libs.spo"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x009e }
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x00a0 }
            X.6NR r5 = new X.6NR     // Catch:{ all -> 0x00a0 }
            r5.<init>(r1, r0, r3)     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "SoLoader"
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = com.facebook.soloader.SoLoader.A0A     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00a0 }
            r0.lock()     // Catch:{ all -> 0x00a0 }
            boolean r0 = com.facebook.soloader.SoLoader.A03()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0092
            int r0 = com.facebook.soloader.SoLoader.A00()     // Catch:{ all -> 0x0099 }
            r5.A03(r0)     // Catch:{ all -> 0x0099 }
            X.7Uk[] r0 = com.facebook.soloader.SoLoader.A0C     // Catch:{ all -> 0x0099 }
            int r0 = r0.length     // Catch:{ all -> 0x0099 }
            int r0 = r0 + 1
            X.7Uk[] r2 = new X.AnonymousClass7Uk[r0]     // Catch:{ all -> 0x0099 }
            r2[r7] = r5     // Catch:{ all -> 0x0099 }
            X.7Uk[] r1 = com.facebook.soloader.SoLoader.A0C     // Catch:{ all -> 0x0099 }
            X.7Uk[] r0 = com.facebook.soloader.SoLoader.A0C     // Catch:{ all -> 0x0099 }
            int r0 = r0.length     // Catch:{ all -> 0x0099 }
            java.lang.System.arraycopy(r1, r7, r2, r3, r0)     // Catch:{ all -> 0x0099 }
            com.facebook.soloader.SoLoader.A0C = r2     // Catch:{ all -> 0x0099 }
            java.util.concurrent.atomic.AtomicInteger r0 = com.facebook.soloader.SoLoader.A09     // Catch:{ all -> 0x0099 }
            r0.getAndIncrement()     // Catch:{ all -> 0x0099 }
            boolean r0 = X.AnonymousClass6C9.A1Q(r4)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x008b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "Prepended to SO sources: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ all -> 0x0099 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0099 }
        L_0x008b:
            X.AnonymousClass0x7.A1M(r6)     // Catch:{ all -> 0x00a0 }
            A00 = r3     // Catch:{ all -> 0x00a0 }
        L_0x0090:
            monitor-exit(r8)
            return
        L_0x0092:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.AnonymousClass0x7.A1M(r6)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x009e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155137eL.A00(android.content.Context):void");
    }
}
