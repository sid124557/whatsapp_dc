package X;

import com.whatsapp.util.Log;

/* renamed from: X.0EG  reason: invalid class name */
public class AnonymousClass0EG extends C04710Qi {
    public C29411im A00;
    public C10240hc A01;
    public AnonymousClass31C A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public final Object A06 = AnonymousClass002.A0D();

    public synchronized boolean A06() {
        if (!A09()) {
            Log.i("google-backup-worker-task-condition/block backup is not running");
            return false;
        }
        A07();
        A08();
        return A05();
    }

    public boolean A02() {
        boolean z;
        synchronized (this.A06) {
            z = this.A03;
        }
        return z;
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A06) {
            z = this.A04;
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        synchronized (this.A06) {
            z = this.A05;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r3.A05 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            boolean r0 = r3.A04     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.A03     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r1 = r3.A05     // Catch:{ all -> 0x0013 }
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EG.A05():boolean");
    }

    public void A07() {
        synchronized (this.A06) {
            this.A05 = true;
            this.A04 = true;
            this.A03 = true;
            C10240hc r2 = this.A01;
            if (!r2.A0l()) {
                Log.i("google-backup-worker-task-condition/refreshConditions sd card is not available");
                this.A04 = false;
            }
            if (!r2.A0i()) {
                Log.i("google-backup-worker-task-condition/refreshConditions network is not available for backup");
                this.A03 = false;
            }
            if (!this.A00.A0C()) {
                Log.i("google-backup-worker-task-condition/refreshConditions xmpp is not connected");
                this.A05 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r6.A04 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r6 = this;
            java.lang.Object r5 = r6.A06
            monitor-enter(r5)
            boolean r0 = r6.A05     // Catch:{ all -> 0x0038 }
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0012
            boolean r0 = r6.A03     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0012
            boolean r1 = r6.A04     // Catch:{ all -> 0x0038 }
            r0 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp is not connected, reconnecting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.31C r2 = r6.A02     // Catch:{ 23j -> 0x002a }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A08(r0)     // Catch:{ 23j -> 0x002a }
            monitor-enter(r5)     // Catch:{ 23j -> 0x002a }
            r6.A05 = r4     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ 23j -> 0x002a }
        L_0x002a:
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp reconnect wasn't successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r5)
            r6.A05 = r3     // Catch:{ all -> 0x0034 }
            monitor-exit(r5)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EG.A08():void");
    }

    public boolean A09() {
        return this.A01.A0b();
    }

    public String toString() {
        return "backup-condition-for-backup-worker";
    }

    public AnonymousClass0EG(C29411im r2, C10240hc r3, AnonymousClass31C r4) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }
}
