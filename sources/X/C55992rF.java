package X;

import java.util.concurrent.Callable;

/* renamed from: X.2rF  reason: invalid class name and case insensitive filesystem */
public class C55992rF {
    public int A00 = 1;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0008 A[LOOP:0: B:3:0x0008->B:16:0x0008, LOOP_START, SYNTHETIC] */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3.A05()
            if (r0 == 0) goto L_0x0017
            monitor-enter(r2)
        L_0x0008:
            int r1 = r3.A00     // Catch:{ all -> 0x0014 }
            r0 = 3
            if (r1 <= r0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            goto L_0x0013
        L_0x000f:
            r3.wait()     // Catch:{ InterruptedException -> 0x0008 }
            goto L_0x0008
        L_0x0013:
            return
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            throw r0
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55992rF.A00():void");
    }

    public synchronized void A01() {
        this.A00 = 5;
        notifyAll();
    }

    public synchronized void A02() {
        this.A00 = 4;
        notifyAll();
    }

    public synchronized void A03() {
        this.A00 = 3;
    }

    public void A04(Callable callable) {
        synchronized (this) {
            if (this.A00 == 1) {
                try {
                    callable.call();
                } catch (Exception e) {
                    if (e instanceof RuntimeException) {
                        throw ((RuntimeException) e);
                    }
                    throw AnonymousClass002.A0E(AnonymousClass000.A0a("Exception occurred with while executing operation with message: ", AnonymousClass001.A0o(), e));
                }
            }
        }
    }

    public synchronized boolean A05() {
        boolean z;
        z = false;
        if (this.A00 > 3) {
            z = true;
        }
        return !z;
    }
}
