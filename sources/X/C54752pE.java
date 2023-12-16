package X;

/* renamed from: X.2pE  reason: invalid class name and case insensitive filesystem */
public abstract class C54752pE {
    public int A00;
    public int A01;
    public C832046n A02;
    public C47792dp[] A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C47792dp A02() {
        /*
            r11 = this;
            monitor-enter(r11)
            X.2dp[] r0 = r11.A03     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r11 instanceof X.C832246p     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0068
            r0 = 2
            X.46r[] r0 = new X.C832446r[r0]     // Catch:{ all -> 0x0098 }
        L_0x000c:
            r11.A03 = r0     // Catch:{ all -> 0x0098 }
        L_0x000e:
            int r9 = r11.A01     // Catch:{ all -> 0x0098 }
        L_0x0010:
            r5 = r0[r9]     // Catch:{ all -> 0x0098 }
            if (r5 != 0) goto L_0x001f
            boolean r1 = r11 instanceof X.C832246p     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x0062
            X.46r r5 = new X.46r     // Catch:{ all -> 0x0098 }
            r5.<init>()     // Catch:{ all -> 0x0098 }
        L_0x001d:
            r0[r9] = r5     // Catch:{ all -> 0x0098 }
        L_0x001f:
            int r9 = r9 + 1
            int r1 = r0.length     // Catch:{ all -> 0x0098 }
            if (r9 < r1) goto L_0x0025
            r9 = 0
        L_0x0025:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            X.C162457s7.A0K(r5, r1)     // Catch:{ all -> 0x0098 }
            r10 = r11
            boolean r1 = r5 instanceof X.C832446r     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x0048
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C832446r.A00     // Catch:{ all -> 0x0098 }
            java.lang.Object r1 = r2.get(r5)     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x0010
            X.2XH r0 = X.C39432By.A00     // Catch:{ all -> 0x0098 }
            r2.set(r5, r0)     // Catch:{ all -> 0x0098 }
        L_0x003d:
            r11.A01 = r9     // Catch:{ all -> 0x0098 }
            int r0 = r11.A00     // Catch:{ all -> 0x0098 }
            int r0 = r0 + 1
            r11.A00 = r0     // Catch:{ all -> 0x0098 }
            X.46n r1 = r11.A02     // Catch:{ all -> 0x0098 }
            goto L_0x007d
        L_0x0048:
            r8 = r5
            X.46q r8 = (X.C832346q) r8     // Catch:{ all -> 0x0098 }
            X.46o r10 = (X.C832146o) r10     // Catch:{ all -> 0x0098 }
            long r6 = r8.A00     // Catch:{ all -> 0x0098 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0010
            long r3 = r10.A03     // Catch:{ all -> 0x0098 }
            long r1 = r10.A02     // Catch:{ all -> 0x0098 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            r10.A02 = r3     // Catch:{ all -> 0x0098 }
        L_0x005f:
            r8.A00 = r3     // Catch:{ all -> 0x0098 }
            goto L_0x003d
        L_0x0062:
            X.46q r5 = new X.46q     // Catch:{ all -> 0x0098 }
            r5.<init>()     // Catch:{ all -> 0x0098 }
            goto L_0x001d
        L_0x0068:
            r0 = 2
            X.46q[] r0 = new X.C832346q[r0]     // Catch:{ all -> 0x0098 }
            goto L_0x000c
        L_0x006c:
            int r2 = r11.A00     // Catch:{ all -> 0x0098 }
            int r1 = r0.length     // Catch:{ all -> 0x0098 }
            if (r2 < r1) goto L_0x000e
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x0098 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0098 }
            X.2dp[] r0 = (X.C47792dp[]) r0     // Catch:{ all -> 0x0098 }
            goto L_0x000c
        L_0x007d:
            monitor-exit(r11)
            if (r1 == 0) goto L_0x0097
            monitor-enter(r1)
            java.lang.Object r0 = X.C832046n.A00(r1)     // Catch:{ all -> 0x0093 }
            int r0 = X.AnonymousClass001.A0K(r0)     // Catch:{ all -> 0x0093 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0093 }
            r1.BrA(r0)     // Catch:{ all -> 0x0093 }
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0096:
            monitor-exit(r1)
        L_0x0097:
            return r5
        L_0x0098:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54752pE.A02():X.2dp");
    }

    public final void A03(C47792dp r8) {
        C832046n r4;
        int i;
        C84814Du[] r3;
        synchronized (this) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            r4 = this.A02;
            if (i2 == 0) {
                this.A01 = 0;
            }
            C162457s7.A0K(r8, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            if (r8 instanceof C832446r) {
                C832446r.A00.set(r8, (Object) null);
                r3 = C39232Be.A00;
            } else {
                C832346q r82 = (C832346q) r8;
                long j = r82.A00;
                r82.A00 = -1;
                r82.A01 = null;
                r3 = ((C832146o) this).A0A(j);
            }
        }
        for (C84814Du r1 : r3) {
            if (r1 != null) {
                r1.BkD(C59022wD.A00);
            }
        }
        if (r4 != null) {
            synchronized (r4) {
                r4.BrA(Integer.valueOf(AnonymousClass001.A0K(C832046n.A00(r4)) - 1));
            }
        }
    }
}
