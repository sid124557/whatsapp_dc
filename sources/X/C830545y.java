package X;

import java.util.concurrent.locks.LockSupport;

/* renamed from: X.45y  reason: invalid class name and case insensitive filesystem */
public final class C830545y extends C831046d {
    public final Thread A00;
    public final AnonymousClass46B A01;

    public C830545y(Thread thread, C85494Gl r3, AnonymousClass46B r4) {
        super(r3, true);
        this.A00 = thread;
        this.A01 = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.333} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A12() {
        /*
            r6 = this;
            X.46B r5 = r6.A01     // Catch:{ all -> 0x0058 }
            r4 = 0
            if (r5 == 0) goto L_0x000f
            long r2 = r5.A00     // Catch:{ all -> 0x0058 }
            r0 = 1
            long r2 = r2 + r0
            r5.A00 = r2     // Catch:{ all -> 0x0058 }
            r0 = 1
            r5.A02 = r0     // Catch:{ all -> 0x0058 }
        L_0x000f:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0047
            if (r5 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0022
        L_0x001e:
            long r1 = r5.A04()     // Catch:{ all -> 0x0050 }
        L_0x0022:
            boolean r0 = r6.BHF()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x002c
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r1)     // Catch:{ all -> 0x0050 }
            goto L_0x000f
        L_0x002c:
            if (r5 == 0) goto L_0x0032
            r0 = 0
            r5.A07(r0)     // Catch:{ all -> 0x0058 }
        L_0x0032:
            java.lang.Object r0 = r6.A0A()
            java.lang.Object r1 = X.AnonymousClass36I.A01(r0)
            boolean r0 = r1 instanceof X.AnonymousClass333
            if (r0 == 0) goto L_0x0041
            r4 = r1
            X.333 r4 = (X.AnonymousClass333) r4
        L_0x0041:
            if (r4 != 0) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Throwable r0 = r4.A00
            throw r0
        L_0x0047:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x0050 }
            r0.<init>()     // Catch:{ all -> 0x0050 }
            r6.A0b(r0)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            if (r5 == 0) goto L_0x0057
            r0 = 0
            r5.A07(r0)     // Catch:{ all -> 0x0058 }
        L_0x0057:
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C830545y.A12():java.lang.Object");
    }

    public void A0V(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.A00;
        if (!C162457s7.A0P(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }

    public boolean A0m() {
        return true;
    }
}
