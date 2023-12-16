package X;

/* renamed from: X.7kS  reason: invalid class name and case insensitive filesystem */
public class C158727kS {
    public static final C161277pL A02 = C161277pL.A00();
    public volatile C172548Lq A00;
    public volatile C187928y2 A01;

    public C172548Lq A00() {
        C172548Lq Bql;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 != null) {
                C172548Lq r0 = this.A00;
                return r0;
            }
            if (this.A01 == null) {
                Bql = C172548Lq.A01;
            } else {
                Bql = this.A01.Bql();
            }
            this.A00 = Bql;
            C172548Lq r02 = this.A00;
            return r02;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C187928y2 r2) {
        /*
            r1 = this;
            X.8y2 r0 = r1.A01
            if (r0 != 0) goto L_0x001b
            monitor-enter(r1)
            X.8y2 r0 = r1.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            r1.A01 = r2     // Catch:{ 6u5 -> 0x0010 }
            X.8Lq r0 = X.C172548Lq.A01     // Catch:{ 6u5 -> 0x0010 }
            r1.A00 = r0     // Catch:{ 6u5 -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r1.A01 = r2     // Catch:{ all -> 0x0018 }
            X.8Lq r0 = X.C172548Lq.A01     // Catch:{ all -> 0x0018 }
            r1.A00 = r0     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158727kS.A01(X.8y2):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158727kS)) {
            return false;
        }
        C158727kS r4 = (C158727kS) obj;
        C187928y2 r2 = this.A01;
        C187928y2 r1 = r4.A01;
        if (r2 == null) {
            if (r1 == null) {
                return A00().equals(r4.A00());
            }
            A01(r1.B6s());
            return this.A01.equals(r1);
        } else if (r1 != null) {
            return r2.equals(r1);
        } else {
            r4.A01(r2.B6s());
            return r2.equals(r4.A01);
        }
    }

    public int hashCode() {
        return 1;
    }
}
