package X;

/* renamed from: X.46B  reason: invalid class name */
public abstract class AnonymousClass46B extends C73853gB {
    public long A00;
    public C73693fv A01;
    public boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        if (X.AnonymousClass0x7.A01(r1) == ((int) ((r1 & 1152921503533105152L) >> 30))) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0082 A[EDGE_INSN: B:74:0x0082->B:39:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A04() {
        /*
            r14 = this;
            r9 = r14
            X.46L r9 = (X.AnonymousClass46L) r9
            boolean r0 = r9.A08()
            r12 = 0
            if (r0 != 0) goto L_0x0065
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = X.AnonymousClass46L.A01
            java.lang.Object r7 = r8.get(r9)
            X.2ys r7 = (X.C60632ys) r7
            if (r7 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C60632ys.A01
            int r0 = r0.get(r7)
            if (r0 == 0) goto L_0x0046
            long r10 = java.lang.System.nanoTime()
        L_0x0021:
            monitor-enter(r7)
            X.48m[] r1 = r7.A00     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r6 = r1[r0]     // Catch:{ all -> 0x00d8 }
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            r5 = 0
            if (r6 == 0) goto L_0x0043
            X.3cf r6 = (X.C71783cf) r6     // Catch:{ all -> 0x00d8 }
            long r3 = r6.A01     // Catch:{ all -> 0x00d8 }
            long r1 = r10 - r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0043
            r1 = 0
            boolean r0 = r9.A0E(r6)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0043
            X.48m r5 = r7.A01(r1)     // Catch:{ all -> 0x00d8 }
        L_0x0043:
            monitor-exit(r7)
            if (r5 != 0) goto L_0x0021
        L_0x0046:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.AnonymousClass46L.A02
        L_0x0048:
            java.lang.Object r4 = r3.get(r9)
            r1 = 0
            if (r4 == 0) goto L_0x0082
            boolean r0 = r4 instanceof X.AnonymousClass309
            if (r0 == 0) goto L_0x0074
            r2 = r4
            X.309 r2 = (X.AnonymousClass309) r2
            java.lang.Object r1 = r2.A02()
            X.2XH r0 = X.AnonymousClass309.A06
            if (r1 == r0) goto L_0x0068
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L_0x0060:
            if (r1 == 0) goto L_0x0082
            r1.run()
        L_0x0065:
            r2 = 0
        L_0x0067:
            return r2
        L_0x0068:
            long r0 = r2.A01()
            X.309 r0 = r2.A03(r0)
            X.AnonymousClass0H6.A00(r9, r4, r0, r3)
            goto L_0x0048
        L_0x0074:
            X.2XH r0 = X.C39422Bx.A00
            if (r4 == r0) goto L_0x0082
            boolean r0 = X.AnonymousClass0H6.A00(r9, r4, r1, r3)
            if (r0 == 0) goto L_0x0048
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r1 = r4
            goto L_0x0060
        L_0x0082:
            X.3fv r0 = r9.A01
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0065
        L_0x008c:
            java.lang.Object r1 = r3.get(r9)
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r1 instanceof X.AnonymousClass309
            if (r0 == 0) goto L_0x00ce
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.AnonymousClass309.A04
            long r1 = r0.get(r1)
            int r5 = X.AnonymousClass0x7.A01(r1)
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r0 = 30
            long r1 = r1 >> r0
            int r0 = (int) r1
            if (r5 != r0) goto L_0x0065
        L_0x00ac:
            java.lang.Object r2 = r8.get(r9)
            X.2ys r2 = (X.C60632ys) r2
            if (r2 == 0) goto L_0x00d2
            monitor-enter(r2)
            X.48m[] r1 = r2.A00     // Catch:{ all -> 0x00db }
            r0 = 0
            if (r1 == 0) goto L_0x00bd
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00db }
        L_0x00bd:
            monitor-exit(r2)
            X.3cf r0 = (X.C71783cf) r0
            if (r0 == 0) goto L_0x00d2
            long r2 = r0.A01
            long r0 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            goto L_0x0065
        L_0x00ce:
            X.2XH r0 = X.C39422Bx.A00
            if (r1 != r0) goto L_0x0065
        L_0x00d2:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r2
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00db:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass46B.A04():long");
    }

    public abstract void A05();

    public final void A06(AnonymousClass47B r2) {
        C73693fv r0 = this.A01;
        if (r0 == null) {
            r0 = new C73693fv();
            this.A01 = r0;
        }
        r0.A06(r2);
    }

    public final void A07(boolean z) {
        long j;
        long j2 = this.A00;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.A00 = j3;
        if (j3 <= 0 && this.A02) {
            A05();
        }
    }

    public final boolean A08() {
        Object A04;
        C73693fv r2 = this.A01;
        if (r2 != null) {
            if (r2.isEmpty()) {
                A04 = null;
            } else {
                A04 = r2.A04();
            }
            AnonymousClass47B r0 = (AnonymousClass47B) A04;
            if (r0 != null) {
                r0.run();
                return true;
            }
        }
        return false;
    }
}
