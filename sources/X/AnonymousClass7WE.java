package X;

import java.util.Queue;

/* renamed from: X.7WE  reason: invalid class name */
public final class AnonymousClass7WE {
    public Queue A00;
    public boolean A01;
    public final Object A02 = AnonymousClass002.A0D();

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = (X.C181168mJ) r2.A00.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r2.A01 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        r0.Btw(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.google.android.gms.tasks.Task r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.A02
            monitor-enter(r1)
            java.util.Queue r0 = r2.A00     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            boolean r0 = r2.A01     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
        L_0x000f:
            monitor-enter(r1)
            java.util.Queue r0 = r2.A00     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0025 }
            X.8mJ r0 = (X.C181168mJ) r0     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001f
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            goto L_0x0024
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            r0.Btw(r3)
            goto L_0x000f
        L_0x0024:
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WE.A00(com.google.android.gms.tasks.Task):void");
    }

    public final void A01(C181168mJ r3) {
        synchronized (this.A02) {
            Queue queue = this.A00;
            if (queue == null) {
                queue = AnonymousClass6CA.A0a();
                this.A00 = queue;
            }
            queue.add(r3);
        }
    }
}
