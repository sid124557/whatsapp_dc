package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.46K  reason: invalid class name */
public final class AnonymousClass46K extends AnonymousClass46L implements Runnable {
    public static final long A00;
    public static final AnonymousClass46K A01;
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    public void A05() {
        debugStatus = 4;
        super.A05();
    }

    public final synchronized void A0F() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AnonymousClass46L.A02.set(this, (Object) null);
            AnonymousClass46L.A01.set(this, (Object) null);
            notifyAll();
        }
    }

    static {
        Long l;
        AnonymousClass46K r4 = new AnonymousClass46K();
        A01 = r4;
        r4.A00++;
        r4.A02 = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        A00 = timeUnit.toNanos(l.longValue());
    }

    public void A0B(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A0B(runnable);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 149 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.lang.ThreadLocal r0 = X.C57992uX.A00
            r0.set(r14)
            r13 = 0
            r2 = r14
            monitor-enter(r2)     // Catch:{ all -> 0x006e }
            int r1 = debugStatus     // Catch:{ all -> 0x006b }
            r0 = 2
            if (r1 == r0) goto L_0x005b
            r0 = 3
            if (r1 == r0) goto L_0x005b
            r0 = 1
            debugStatus = r0     // Catch:{ all -> 0x006b }
            r14.notifyAll()     // Catch:{ all -> 0x006b }
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0025
        L_0x0022:
            java.util.concurrent.locks.LockSupport.parkNanos(r14, r5)     // Catch:{ all -> 0x006e }
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x006e }
            long r5 = r14.A04()     // Catch:{ all -> 0x006e }
            r7 = 0
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0049
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006e }
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x003d
            long r0 = A00     // Catch:{ all -> 0x006e }
            long r0 = r0 + r3
        L_0x003d:
            long r9 = r0 - r3
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x005c
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x004e
            r5 = r9
            goto L_0x004e
        L_0x0049:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x004e:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0025
            int r3 = debugStatus     // Catch:{ all -> 0x006e }
            r2 = 2
            if (r3 == r2) goto L_0x005c
            r2 = 3
            if (r3 == r2) goto L_0x005c
            goto L_0x0022
        L_0x005b:
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
        L_0x005c:
            _thread = r13
            r14.A0F()
            boolean r0 = r14.A0D()
            if (r0 != 0) goto L_0x006a
            r14.A09()
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            _thread = r13
            r14.A0F()
            boolean r0 = r14.A0D()
            if (r0 != 0) goto L_0x007d
            r14.A09()
        L_0x007d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass46K.run():void");
    }
}
