package X;

/* renamed from: X.0EF  reason: invalid class name */
public class AnonymousClass0EF extends C04710Qi {
    public boolean A00 = true;
    public boolean A01 = true;
    public boolean A02 = true;
    public boolean A03 = true;
    public final C10240hc A04;
    public final C06260Ww A05;
    public final AnonymousClass0QJ A06;
    public final Object A07 = AnonymousClass002.A0D();

    public boolean A01() {
        boolean z;
        synchronized (this.A07) {
            z = this.A00;
        }
        return z;
    }

    public boolean A02() {
        boolean z;
        synchronized (this.A07) {
            z = this.A01;
        }
        return z;
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A07) {
            z = this.A02;
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        synchronized (this.A07) {
            z = this.A03;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r3.A00 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A07
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A01     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A03     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r3.A00     // Catch:{ all -> 0x0017 }
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EF.A05():boolean");
    }

    public boolean A06() {
        C10240hc r4 = this.A04;
        if (r4.A0b()) {
            AnonymousClass0Y7 A032 = this.A05.A03();
            AnonymousClass0QJ r1 = this.A06;
            long j = r1.A06.get();
            long j2 = r1.A07.get();
            boolean A042 = C10240hc.A04(r4, A032, r1.A04.get(), r1.A05.get(), j, j2);
            synchronized (this.A07) {
                this.A03 = r4.A0m();
                this.A02 = r4.A0l();
                this.A00 = r4.A0c();
                this.A01 = r4.A0i();
            }
            if (!A042 || !r4.A0b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return "backup-condition";
    }

    public AnonymousClass0EF(C10240hc r2, C06260Ww r3, AnonymousClass0QJ r4) {
        this.A05 = r3;
        this.A04 = r2;
        this.A06 = r4;
    }
}
