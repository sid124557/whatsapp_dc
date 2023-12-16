package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedList;

/* renamed from: X.2wT  reason: invalid class name and case insensitive filesystem */
public class C59172wT {
    public static final int[] A01 = {0, 0, 0, 2000, 5000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000, 40000, 80000, 160000};
    public LinkedList A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long A00() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.LinkedList r6 = r9.A00     // Catch:{ all -> 0x0040 }
            int r3 = r6.size()     // Catch:{ all -> 0x0040 }
        L_0x0007:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x003c
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            java.lang.Object r0 = r6.get(r3)     // Catch:{ all -> 0x0040 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0040 }
            long r7 = r7 - r0
            int[] r2 = A01     // Catch:{ all -> 0x0040 }
            int r1 = r3 + 1
            int r0 = r2.length     // Catch:{ all -> 0x0040 }
            int r0 = r0 + -1
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0040 }
            r0 = r2[r0]     // Catch:{ all -> 0x0040 }
            long r4 = (long) r0     // Catch:{ all -> 0x0040 }
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0007
            if (r3 <= 0) goto L_0x003c
            java.lang.Object r0 = r6.get(r3)     // Catch:{ all -> 0x0040 }
            long r2 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0040 }
            long r2 = r2 + r4
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r2 = r2 - r0
            monitor-exit(r9)
            return r2
        L_0x003c:
            monitor-exit(r9)
            r0 = 0
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59172wT.A00():long");
    }

    public C59172wT() {
        synchronized (this) {
            this.A00 = AnonymousClass0x9.A18();
        }
    }
}
