package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7qc  reason: invalid class name and case insensitive filesystem */
public final class C161827qc {
    public static volatile Handler A00;

    public static Handler A00() {
        if (A00 == null) {
            synchronized (C161827qc.class) {
                if (A00 == null) {
                    A00 = AnonymousClass000.A0A();
                }
            }
        }
        return A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.util.concurrent.Future r7, int r8) {
        /*
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r6 = 1
            r3 = 0
            boolean r2 = X.AnonymousClass001.A1X(r8, r0)
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x0017
            r1 = 1
            if (r2 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = A04()
            if (r0 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x0035
            int r0 = android.os.Process.myTid()
            int r0 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r8)
        L_0x002c:
            if (r0 >= r3) goto L_0x0036
            android.os.Process.setThreadPriority(r8, r0)     // Catch:{ SecurityException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            int r0 = r0 + 1
            goto L_0x002c
        L_0x0035:
            r6 = 0
        L_0x0036:
            java.lang.Object r0 = r7.get()     // Catch:{ ExecutionException -> 0x0055, InterruptedException | CancellationException -> 0x0053 }
            if (r6 == 0) goto L_0x0052
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0040 }
            goto L_0x0051
        L_0x0040:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass6C7.A1J(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        L_0x0051:
            return r0
        L_0x0052:
            return r0
        L_0x0053:
            r1 = move-exception
            goto L_0x006a
        L_0x0055:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x0073 }
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0061
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x0073 }
            goto L_0x0072
        L_0x0061:
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0073 }
            java.lang.RuntimeException r1 = X.AnonymousClass6CA.A0Q(r0, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0072
        L_0x006a:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0073 }
            java.lang.RuntimeException r1 = X.AnonymousClass6CA.A0Q(r0, r1)     // Catch:{ all -> 0x0073 }
        L_0x0072:
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            if (r6 == 0) goto L_0x008b
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException | SecurityException -> 0x007a }
            throw r0
        L_0x007a:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass6C7.A1J(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        L_0x008b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161827qc.A01(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static void A03(String str) {
        if (!C1455076d.A00 && !A04()) {
            if (str == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("This must run on the main thread; but is running on ");
                str = AnonymousClass000.A0X(Thread.currentThread().getName(), A0o);
            }
            throw AnonymousClass001.A0e(str);
        }
    }

    public static void A02(Runnable runnable) {
        A00().post(runnable);
    }

    public static boolean A04() {
        return AnonymousClass000.A1Y(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
