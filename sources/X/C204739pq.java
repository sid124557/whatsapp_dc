package X;

/* renamed from: X.9pq  reason: invalid class name and case insensitive filesystem */
public class C204739pq implements C202339lr {
    public Object A00;
    public final int A01;

    public C204739pq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BYr(X.AnonymousClass9S8 r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            if (r0 == 0) goto L_0x004f
            java.lang.Object r2 = r1.A00
            X.9ZR r2 = (X.AnonymousClass9ZR) r2
            X.9lr r1 = r2.A06
            if (r1 != 0) goto L_0x0016
            r0 = 1
            X.9pq r1 = new X.9pq
            r1.<init>(r2, r0)
            r2.A06 = r1
        L_0x0016:
            r2.BjI(r1)
            X.9RS r4 = r2.A0L
            X.9Qs r3 = r4.A00
            java.util.concurrent.locks.ReentrantLock r2 = r3.A01
            r2.lock()
            r2.lock()     // Catch:{ all -> 0x004a }
            int r0 = r3.A00     // Catch:{ all -> 0x0045 }
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x002d
            r1 = 0
        L_0x002d:
            r2.unlock()     // Catch:{ all -> 0x004a }
            r2.lock()     // Catch:{ all -> 0x004a }
            boolean r0 = r3.A00()     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0041
            int r0 = r3.A00     // Catch:{ all -> 0x0045 }
            r0 = r0 | 2
            r0 = r0 & -2
            r3.A00 = r0     // Catch:{ all -> 0x0045 }
        L_0x0041:
            r2.unlock()     // Catch:{ all -> 0x004a }
            goto L_0x00bb
        L_0x0045:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x004f:
            java.lang.Object r3 = r1.A00
            X.9Yl r3 = (X.C195579Yl) r3
            X.9li r1 = r3.A0A
            X.9nu r2 = r3.A0Q
            if (r2 == 0) goto L_0x00d7
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x00d7
            if (r1 == 0) goto L_0x00d7
            int r13 = r2.BCp()
            int r4 = r3.A04
            r0 = -1
            if (r4 == r0) goto L_0x0079
            int r3 = r3.A00
            r0 = 1
            r2 = -90
            if (r3 != r0) goto L_0x0073
            r2 = 90
        L_0x0073:
            int r0 = r13 + 360
            int r2 = r2 * r4
            int r0 = r0 + r2
            int r13 = r0 % 360
        L_0x0079:
            r9 = 0
            r2 = r18
            X.9RE[] r8 = r2.A0C
            if (r8 == 0) goto L_0x009a
            int r7 = r8.length
            X.9Ym[] r9 = new X.C195589Ym[r7]
            r6 = 0
        L_0x0084:
            if (r6 >= r7) goto L_0x009a
            r0 = r8[r6]
            if (r0 == 0) goto L_0x0097
            java.nio.ByteBuffer r5 = r0.A02
            int r4 = r0.A00
            int r3 = r0.A01
            X.9Ym r0 = new X.9Ym
            r0.<init>(r4, r5, r3)
            r9[r6] = r0
        L_0x0097:
            int r6 = r6 + 1
            goto L_0x0084
        L_0x009a:
            byte[] r7 = r2.A0A
            float[] r8 = r2.A0B
            android.util.Pair r3 = r2.A05
            java.lang.Long r5 = r2.A08
            java.lang.Float r4 = r2.A06
            java.lang.Long r6 = r2.A07
            int r10 = r2.A01
            long r14 = r2.A03
            boolean r0 = r2.A09
            int r11 = r2.A02
            int r12 = r2.A00
            X.9U3 r2 = new X.9U3
            r16 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16)
            r1.BYq(r2)
            return
        L_0x00bb:
            r2.unlock()
            if (r1 == 0) goto L_0x00d7
            X.AnonymousClass9WT.A00()
            X.9Sw r1 = r4.A01
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d7
            java.util.List r1 = r1.A00
            X.9hL r0 = new X.9hL
            r0.<init>(r4, r1)
            X.AnonymousClass9WU.A00(r0)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204739pq.BYr(X.9S8):void");
    }
}
