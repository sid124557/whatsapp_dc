package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.04g  reason: invalid class name and case insensitive filesystem */
public class C003904g extends C04530Oq {
    public final Object A00 = AnonymousClass002.A0D();
    public final ExecutorService A01 = Executors.newFixedThreadPool(4, new C13720nd(this));
    public volatile Handler A02;

    public void A01(Runnable runnable) {
        this.A01.execute(runnable);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = new android.os.Handler(r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.Runnable r5) {
        /*
            r4 = this;
            android.os.Handler r0 = r4.A02
            if (r0 != 0) goto L_0x002b
            java.lang.Object r3 = r4.A00
            monitor-enter(r3)
            android.os.Handler r0 = r4.A02     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x001b
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0028 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0028 }
            r0 = 28
            if (r1 < r0) goto L_0x001d
            android.os.Handler r0 = android.os.Handler.createAsync(r2)     // Catch:{ all -> 0x0028 }
        L_0x0019:
            r4.A02 = r0     // Catch:{ all -> 0x0028 }
        L_0x001b:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x001d:
            android.os.Handler r0 = X.AnonymousClass001.A0O(r2)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0022 }
            goto L_0x0019
        L_0x0022:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0028 }
            r0.<init>(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0019
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            android.os.Handler r0 = r4.A02
            r0.post(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003904g.A02(java.lang.Runnable):void");
    }

    public boolean A03() {
        return AnonymousClass000.A1Y(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
