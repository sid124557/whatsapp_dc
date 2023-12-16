package X;

/* renamed from: X.9RS  reason: invalid class name */
public class AnonymousClass9RS {
    public final C193919Qs A00 = new C193919Qs();
    public final C194439Sw A01 = new C194439Sw();
    public final C194439Sw A02 = new C194439Sw();
    public volatile AnonymousClass9KV A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(boolean r4, android.hardware.Camera r5) {
        /*
            r3 = this;
            X.9Qs r1 = r3.A00
            java.util.concurrent.locks.ReentrantLock r2 = r1.A01
            r2.lock()
            if (r5 == 0) goto L_0x003c
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x003c
            r5.stopPreview()     // Catch:{ all -> 0x0037 }
            r2.lock()     // Catch:{ all -> 0x0037 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0032 }
            r2.unlock()     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x003c
            X.9Sw r1 = r3.A02     // Catch:{ all -> 0x0037 }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x003c
            java.util.List r1 = r1.A00     // Catch:{ all -> 0x0037 }
            X.9hM r0 = new X.9hM     // Catch:{ all -> 0x0037 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0037 }
            X.AnonymousClass9WU.A00(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x003c
        L_0x0032:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x003c:
            r2.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9RS.A00(boolean, android.hardware.Camera):void");
    }
}
