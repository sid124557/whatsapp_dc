package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5aT  reason: invalid class name and case insensitive filesystem */
public final class C106975aT {
    public C08920fK A00;
    public List A01 = AnonymousClass001.A0s();
    public final C110435gE A02 = new C110435gE(this);

    public final synchronized void A00() {
        C08920fK r1 = this.A00;
        if (r1 != null) {
            C110435gE r4 = this.A02;
            C162457s7.A0J(r4, 0);
            ReentrantLock reentrantLock = r1.A02;
            reentrantLock.lock();
            try {
                Map map = r1.A01;
                C85474Gj r12 = (C85474Gj) map.get(r4);
                if (r12 != null) {
                    r12.AyX((CancellationException) null);
                }
                map.remove(r4);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.A00 = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|(2:26|(2:30|(2:32|(6:34|(1:36)(1:38)|37|39|40|(2:42|(1:44))))))|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009d */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(android.app.Activity r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0106 }
            r2 = 29
            if (r3 < r2) goto L_0x0013
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = "SM-F700"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x0015
            if (r3 != r2) goto L_0x0015
        L_0x0013:
            monitor-exit(r8)
            return
        L_0x0015:
            if (r9 == 0) goto L_0x0013
            X.66R r0 = X.C05190Sj.A01     // Catch:{ all -> 0x0106 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0106 }
            X.0ts r2 = (X.C16730ts) r2     // Catch:{ all -> 0x0106 }
            if (r2 != 0) goto L_0x00ac
            X.0fI r0 = X.C08900fI.A03     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x00a7
            java.util.concurrent.locks.ReentrantLock r7 = X.C08900fI.A02     // Catch:{ all -> 0x0106 }
            r7.lock()     // Catch:{ all -> 0x0106 }
            X.0fI r0 = X.C08900fI.A03     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x00a4
            r4 = 0
            java.lang.String r1 = androidx.window.sidecar.SidecarProvider.getApiVersion()     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            if (r0 != 0) goto L_0x009d
            if (r1 == 0) goto L_0x009d
            boolean r0 = X.C175738Zn.A0V(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            java.util.regex.Matcher r6 = r0.matcher(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            boolean r0 = r6.matches()     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            if (r0 == 0) goto L_0x009d
            r0 = 1
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            if (r0 == 0) goto L_0x009d
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            r0 = 2
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            if (r0 == 0) goto L_0x009d
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            r0 = 3
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            if (r0 == 0) goto L_0x009d
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            r1 = 4
            java.lang.String r0 = r6.group(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = r6.group(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
        L_0x007d:
            X.C162457s7.A0G(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            X.0iC r1 = new X.0iC     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            r1.<init>(r5, r3, r0, r2)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x009d }
            goto L_0x0089
        L_0x0086:
            java.lang.String r0 = ""
            goto L_0x007d
        L_0x0089:
            X.0iC r0 = X.C10600iC.A07     // Catch:{  }
            int r0 = r1.compareTo(r0)     // Catch:{  }
            if (r0 < 0) goto L_0x009d
            X.0fF r1 = new X.0fF     // Catch:{  }
            r1.<init>(r9)     // Catch:{  }
            boolean r0 = r1.A03()     // Catch:{  }
            if (r0 == 0) goto L_0x009d
            r4 = r1
        L_0x009d:
            X.0fI r0 = new X.0fI     // Catch:{ all -> 0x00fc }
            r0.<init>(r4)     // Catch:{ all -> 0x00fc }
            X.C08900fI.A03 = r0     // Catch:{ all -> 0x00fc }
        L_0x00a4:
            r7.unlock()     // Catch:{ all -> 0x0106 }
        L_0x00a7:
            X.0fI r2 = X.C08900fI.A03     // Catch:{ all -> 0x0106 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x0106 }
        L_0x00ac:
            X.0fM r1 = X.C08940fM.A00     // Catch:{ all -> 0x0106 }
            X.0fJ r0 = new X.0fJ     // Catch:{ all -> 0x0106 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0106 }
            X.0fK r3 = new X.0fK     // Catch:{ all -> 0x0106 }
            r3.<init>(r0)     // Catch:{ all -> 0x0106 }
            r8.A00 = r3     // Catch:{ all -> 0x0106 }
            r0 = 1
            X.0wb r2 = new X.0wb     // Catch:{ all -> 0x0106 }
            r2.<init>(r0)     // Catch:{ all -> 0x0106 }
            X.5gE r7 = r8.A02     // Catch:{ all -> 0x0106 }
            r0 = 2
            X.C162457s7.A0J(r7, r0)     // Catch:{ all -> 0x0106 }
            X.0ub r1 = r3.A00     // Catch:{ all -> 0x0106 }
            X.0fJ r1 = (X.C08910fJ) r1     // Catch:{ all -> 0x0106 }
            r6 = 0
            androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 r0 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1     // Catch:{ all -> 0x0106 }
            r0.<init>(r9, r1, r6)     // Catch:{ all -> 0x0106 }
            X.4C8 r5 = X.AnonymousClass2AL.A00(r0)     // Catch:{ all -> 0x0106 }
            java.util.concurrent.locks.ReentrantLock r4 = r3.A02     // Catch:{ all -> 0x0106 }
            r4.lock()     // Catch:{ all -> 0x0106 }
            java.util.Map r3 = r3.A01     // Catch:{ all -> 0x0101 }
            java.lang.Object r0 = r3.get(r7)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00f7
            X.46P r0 = new X.46P     // Catch:{ all -> 0x0101 }
            r0.<init>(r2)     // Catch:{ all -> 0x0101 }
            X.4C6 r2 = X.AnonymousClass349.A02(r0)     // Catch:{ all -> 0x0101 }
            androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1 r1 = new androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1     // Catch:{ all -> 0x0101 }
            r1.<init>(r7, r6, r5)     // Catch:{ all -> 0x0101 }
            r0 = 3
            X.4Gj r0 = X.C616131n.A02(r6, r1, r2, r6, r0)     // Catch:{ all -> 0x0101 }
            r3.put(r7, r0)     // Catch:{ all -> 0x0101 }
        L_0x00f7:
            r4.unlock()     // Catch:{ all -> 0x0106 }
            goto L_0x0013
        L_0x00fc:
            r0 = move-exception
            r7.unlock()     // Catch:{ all -> 0x0106 }
            goto L_0x0105
        L_0x0101:
            r0 = move-exception
            r4.unlock()     // Catch:{ all -> 0x0106 }
        L_0x0105:
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106975aT.A01(android.app.Activity):void");
    }

    public final synchronized void A02(C15790rw r2) {
        C162457s7.A0J(r2, 0);
        this.A01.add(r2);
    }
}
