package X;

import com.whatsapp.util.Log;
import java.util.Random;
import java.util.Set;

/* renamed from: X.0X8  reason: invalid class name */
public class AnonymousClass0X8 {
    public static final Set A00 = AnonymousClass002.A0K();

    public static C60902zM A00(int i) {
        return new C60902zM(new Random(), i, 3600000);
    }

    public static Object A01(C04150Mz r1, C04710Qi r2, String str) {
        return A02(r1, r2, str, 14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r2 <= 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Google Drive failures/total attempts: ");
        r1.append(r2);
        r1.append("/");
        r1 = new X.AnonymousClass0EN(X.AnonymousClass000.A0h(r1, r7.A00()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(X.C04150Mz r9, X.C04710Qi r10, java.lang.String r11, int r12) {
        /*
            java.lang.String r8 = "gdrive-retry-task/execute/attempt-"
            X.2zM r7 = A00(r12)
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00ce }
            java.util.Set r0 = A00     // Catch:{ all -> 0x00ce }
            monitor-enter(r0)     // Catch:{ all -> 0x00ce }
            r0.add(r3)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            r0.size()     // Catch:{ all -> 0x00ce }
            r2 = 0
        L_0x0015:
            r6 = 0
            if (r10 == 0) goto L_0x002c
            boolean r0 = r10.A06()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x002c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "gdrive-retry-task/condition-failed/"
            java.lang.String r0 = X.AnonymousClass000.A0P(r10, r0, r1)     // Catch:{ all -> 0x00ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00a8
        L_0x002c:
            int r0 = r7.A00()     // Catch:{ 0EU -> 0x004b }
            java.lang.Object r4 = r9.A01(r0)     // Catch:{ 0EU -> 0x004b }
            if (r4 == 0) goto L_0x0049
            if (r0 <= 0) goto L_0x009a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r8)     // Catch:{ 0EU -> 0x004b }
            r1.append(r0)     // Catch:{ 0EU -> 0x004b }
            java.lang.String r0 = "/success: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)     // Catch:{ 0EU -> 0x004b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0EU -> 0x004b }
            goto L_0x009a
        L_0x0049:
            r5 = -1
            goto L_0x0055
        L_0x004b:
            r1 = move-exception
            int r2 = r2 + 1
            java.lang.String r0 = "gdrive-retry-task/execute"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ce }
            int r5 = r1.retryAfter     // Catch:{ all -> 0x00ce }
        L_0x0055:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r8)     // Catch:{ all -> 0x00ce }
            int r0 = r7.A00()     // Catch:{ all -> 0x00ce }
            r1.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "/failed: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)     // Catch:{ all -> 0x00ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ce }
            java.lang.Long r4 = r7.A01()     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x00a5
            if (r5 <= 0) goto L_0x007c
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ce }
            long r0 = (long) r5     // Catch:{ all -> 0x00ce }
            long r0 = r4.toMillis(r0)     // Catch:{ all -> 0x00ce }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ce }
        L_0x007c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x009e }
            java.lang.String r0 = "gdrive/gdrive-retry-task backoff for "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x009e }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x009e }
            java.lang.String r0 = " milliseconds"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ InterruptedException -> 0x009e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x009e }
            long r0 = r4.longValue()     // Catch:{ InterruptedException -> 0x009e }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x009e }
            goto L_0x0015
        L_0x009a:
            A04(r3)
            return r4
        L_0x009e:
            r1 = move-exception
            java.lang.String r0 = "gdrive-retry-task/interrupted"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00ce }
            goto L_0x00a8
        L_0x00a5:
            if (r2 <= 0) goto L_0x00a8
            goto L_0x00af
        L_0x00a8:
            A04(r3)
            return r6
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            goto L_0x00cd
        L_0x00af:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "Google Drive failures/total attempts: "
            r1.append(r0)     // Catch:{ all -> 0x00ce }
            r1.append(r2)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x00ce }
            int r0 = r7.A00()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x00ce }
            X.0EN r1 = new X.0EN     // Catch:{ all -> 0x00ce }
            r1.<init>(r0)     // Catch:{ all -> 0x00ce }
        L_0x00cd:
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            A04(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X8.A02(X.0Mz, X.0Qi, java.lang.String, int):java.lang.Object");
    }

    public static void A03() {
        Set<Thread> set = A00;
        synchronized (set) {
            for (Thread interrupt : set) {
                interrupt.interrupt();
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive-retry-task/interrupt-active-tasks/size/");
        Log.i(AnonymousClass000.A0h(A0o, set.size()));
    }

    public static void A04(Thread thread) {
        Set set = A00;
        synchronized (set) {
            set.remove(thread);
        }
        set.size();
    }
}
