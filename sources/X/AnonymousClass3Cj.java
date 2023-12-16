package X;

/* renamed from: X.3Cj  reason: invalid class name */
public class AnonymousClass3Cj implements AnonymousClass4F2 {
    public AnonymousClass2HQ A00;
    public AnonymousClass2RX A01;
    public boolean A02;
    public boolean A03;
    public final C29411im A04;
    public final C56612sH A05;
    public final AnonymousClass4FS A06;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r13 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00(boolean r13) {
        /*
            r12 = this;
            r5 = r12
            monitor-enter(r5)
            r0 = 1
            r12.A02 = r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r12.A03     // Catch:{ all -> 0x0048 }
            r12.A03 = r13     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003c
            if (r13 != 0) goto L_0x0046
            X.2HQ r0 = r12.A00     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003e
            X.2RX r0 = r12.A01     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x003e
            long r3 = r0.A00     // Catch:{ all -> 0x0048 }
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r0
            X.2sH r0 = r12.A05     // Catch:{ all -> 0x0048 }
            long r1 = r0.A0H()     // Catch:{ all -> 0x0048 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            X.2HQ r7 = r12.A00     // Catch:{ all -> 0x0048 }
            X.2RX r0 = r12.A01     // Catch:{ all -> 0x0048 }
            X.2z0 r8 = r0.A01     // Catch:{ all -> 0x0048 }
            boolean r10 = r0.A03     // Catch:{ all -> 0x0048 }
            boolean r11 = r0.A02     // Catch:{ all -> 0x0048 }
            X.33b r0 = r7.A00     // Catch:{ all -> 0x0048 }
            X.4FS r0 = r0.A0Y     // Catch:{ all -> 0x0048 }
            r9 = 4
            X.3c5 r6 = new X.3c5     // Catch:{ all -> 0x0048 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0048 }
            r0.BkM(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x003e
        L_0x003c:
            if (r13 != 0) goto L_0x0046
        L_0x003e:
            r0 = 0
            r12.A01 = r0     // Catch:{ all -> 0x0044 }
            r12.A00 = r0     // Catch:{ all -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r5)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Cj.A00(boolean):void");
    }

    public void BUB() {
        boolean z;
        synchronized (this) {
            this.A02 = false;
            z = this.A03;
        }
        if (z) {
            this.A06.Bkn(C71263bp.A00(this, 3), "PeerPresenceManager/onHandlerConnected", 10000);
        }
    }

    public AnonymousClass3Cj(C29411im r1, C56612sH r2, AnonymousClass4FS r3) {
        this.A05 = r2;
        this.A06 = r3;
        this.A04 = r1;
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }
}
