package X;

import java.util.Map;

/* renamed from: X.82l  reason: invalid class name and case insensitive filesystem */
public final class C1677682l implements C186188ut {
    public int A00 = -1;
    public C172258Kh A01;

    public final synchronized void A00() {
        C172258Kh r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (X.C172258Kh.A01(r2.A01) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean Aza(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0011 }
            if (r3 != r0) goto L_0x000e
            X.8Kh r0 = r2.A01     // Catch:{ all -> 0x0011 }
            boolean r1 = X.C172258Kh.A01(r0)     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677682l.Aza(int):boolean");
    }

    public synchronized C172258Kh B4f(int i, int i2, int i3) {
        C172258Kh r0;
        try {
            C172258Kh r02 = this.A01;
            if (r02 != null) {
                r0 = r02.A02();
            } else {
                r0 = null;
            }
            A00();
        } catch (Throwable th) {
            A00();
            throw th;
        }
        return r0;
    }

    public synchronized C172258Kh B54(int i) {
        C172258Kh r0;
        C172258Kh r02;
        if (this.A00 != i || (r02 = this.A01) == null) {
            r0 = null;
        } else {
            r0 = r02.A02();
        }
        return r0;
    }

    public synchronized C172258Kh B7Z(int i) {
        C172258Kh r0;
        C172258Kh r02 = this.A01;
        if (r02 != null) {
            r0 = r02.A02();
        } else {
            r0 = null;
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (X.C162457s7.A0P(r1, r0) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void BTs(X.C172258Kh r3, int r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            X.8Kh r0 = r2.A01     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0018
            java.lang.Object r1 = r3.A03()     // Catch:{ all -> 0x002c }
            X.8Kh r0 = r2.A01     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0016
            android.graphics.Bitmap r0 = X.C172258Kh.A00(r0)     // Catch:{ all -> 0x002c }
        L_0x0011:
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x002c }
            goto L_0x0028
        L_0x0016:
            r0 = 0
            goto L_0x0011
        L_0x0018:
            X.8Kh r0 = r2.A01     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x001f
            r0.close()     // Catch:{ all -> 0x002c }
        L_0x001f:
            X.8Kh r0 = r3.A02()     // Catch:{ all -> 0x002c }
            r2.A01 = r0     // Catch:{ all -> 0x002c }
            r2.A00 = r4     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0028:
            if (r0 == 0) goto L_0x0018
        L_0x002a:
            monitor-exit(r2)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677682l.BTs(X.8Kh, int, int):void");
    }

    public synchronized void clear() {
        A00();
    }

    public boolean BH1() {
        return false;
    }

    public boolean BMR(Map map) {
        return true;
    }

    public void BTq(C172258Kh r1, int i, int i2) {
    }
}
