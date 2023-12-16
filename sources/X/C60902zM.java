package X;

import java.util.Random;

/* renamed from: X.2zM  reason: invalid class name and case insensitive filesystem */
public class C60902zM {
    public int A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final long A03;
    public final Random A04;

    public synchronized int A00() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Long A01() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r1 = r8.A00     // Catch:{ all -> 0x0049 }
            int r0 = r8.A02     // Catch:{ all -> 0x0049 }
            if (r1 < r0) goto L_0x000a
            monitor-exit(r8)
            r0 = 0
            return r0
        L_0x000a:
            r5 = 1
            int r1 = r1 + 1
            r8.A00 = r1     // Catch:{ all -> 0x0049 }
            boolean r0 = r8.A01     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0041
            r0 = 50
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0049 }
            r6 = 1
            long r6 = r6 << r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            r0 = 2
            long r3 = r6 / r0
            java.util.Random r0 = r8.A04     // Catch:{ all -> 0x0049 }
            long r0 = r0.nextLong()     // Catch:{ all -> 0x0049 }
            long r0 = r0 % r6
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0049 }
            long r3 = r3 + r0
            long r1 = r8.A03     // Catch:{ all -> 0x0049 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            r8.A01 = r5     // Catch:{ all -> 0x0049 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x003c:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0041:
            long r0 = r8.A03     // Catch:{ all -> 0x0049 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r8)
            return r0
        L_0x0049:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60902zM.A01():java.lang.Long");
    }

    public synchronized void A02() {
        this.A00 = 0;
    }

    public C60902zM(Random random, int i, long j) {
        this.A04 = random;
        this.A02 = i;
        this.A03 = j;
    }

    public C60902zM(Random random) {
        this.A04 = random;
        this.A02 = 20;
        this.A03 = 3600000;
    }
}
