package X;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.2pC  reason: invalid class name and case insensitive filesystem */
public abstract class C54732pC {
    public final int A00;
    public final C54842pN A01;
    public final Set A02 = AnonymousClass002.A0K();
    public final Executor A03;

    public final void A02(String str, HashMap hashMap) {
        String str2;
        LinkedList linkedList;
        HashMap hashMap2 = hashMap;
        if (hashMap == null) {
            hashMap2 = new HashMap(1);
        }
        int i = this.A00;
        if (i == 1) {
            str2 = "BLOCKED_QUEUE";
        } else if (i == 2) {
            str2 = "LONG_RUNNING_JOB";
        } else if (i != 3) {
            str2 = "DELAYED_JOB";
        } else {
            str2 = "FREQUENT_RUNNING_JOB";
        }
        hashMap2.put("anomalyName", str2);
        synchronized (this) {
            linkedList = new LinkedList(this.A02);
        }
        this.A03.execute(new C71603cN(this, linkedList, hashMap2, str, 27));
    }

    public void A00(Runnable runnable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (X.C34191uN) r10;
        r9 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.Runnable r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C34191uN
            if (r0 == 0) goto L_0x0075
            r4 = r10
            X.1uN r4 = (X.C34191uN) r4
            X.2pN r9 = r4.A01
            X.8Tz r8 = r9.A00(r11)
            if (r8 == 0) goto L_0x0075
            java.lang.String r0 = "WhatsApp Worker"
            java.lang.String r7 = r8.A00
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0075
            java.util.Map r1 = r4.A00
            monitor-enter(r1)
            java.lang.Object r0 = r1.remove(r11)     // Catch:{ all -> 0x0024 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            throw r0
        L_0x0027:
            long r2 = android.os.SystemClock.uptimeMillis()
            if (r0 == 0) goto L_0x0075
            long r0 = r0.longValue()
            long r2 = r2 - r0
            r5 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            boolean r0 = r11 instanceof X.AnonymousClass3ZZ
            if (r0 == 0) goto L_0x0076
            r0 = r11
            X.3ZZ r0 = (X.AnonymousClass3ZZ) r0
            java.lang.String r6 = r0.A00
        L_0x0041:
            java.lang.String r5 = r9.A03(r8, r11)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DelayedJobAnomalyDetector detected delayMillis="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " thread="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " job="
            X.C18260x0.A0t(r0, r6, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A01
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = ":"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r6, r1)
            r0 = 0
            r4.A02(r1, r0)
        L_0x0075:
            return
        L_0x0076:
            r6 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54732pC.A01(java.lang.Runnable):void");
    }

    public C54732pC(C54842pN r2, Executor executor, int i) {
        this.A00 = i;
        this.A03 = executor;
        this.A01 = r2;
    }
}
