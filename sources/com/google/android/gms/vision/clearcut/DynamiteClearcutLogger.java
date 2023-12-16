package com.google.android.gms.vision.clearcut;

import X.C148857Jz;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DynamiteClearcutLogger {
    public static final ExecutorService zza;
    public C148857Jz zzb = new C148857Jz();
    public VisionClearcutLogger zzc;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        android.util.Log.v("Vision", java.lang.String.format("Skipping image analysis log due to rate limiting", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r3 = X.AnonymousClass4L0.A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (android.util.Log.isLoggable("Vision", 2) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r10, X.C128706Xd r11) {
        /*
            r9 = this;
            r0 = 3
            if (r10 != r0) goto L_0x0034
            X.7Jz r8 = r9.zzb
            java.lang.Object r7 = r8.A02
            monitor-enter(r7)
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0031 }
            long r1 = r8.A00     // Catch:{ all -> 0x0031 }
            long r5 = r8.A01     // Catch:{ all -> 0x0031 }
            long r1 = r1 + r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            monitor-exit(r7)     // Catch:{ all -> 0x0031 }
            java.lang.Object[] r3 = X.AnonymousClass4L0.A0U()
            java.lang.String r2 = "Skipping image analysis log due to rate limiting"
            r0 = 2
            java.lang.String r1 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = java.lang.String.format(r2, r3)
            android.util.Log.v(r1, r0)
            return
        L_0x002d:
            r8.A00 = r3     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0034
        L_0x0031:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0031 }
            throw r0
        L_0x0034:
            java.util.concurrent.ExecutorService r2 = zza
            r1 = 1
            X.3ca r0 = new X.3ca
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r11, (int) r10, (int) r1)
            r2.execute(r0)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.clearcut.DynamiteClearcutLogger.zza(int, X.6Xd):void");
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }
}
