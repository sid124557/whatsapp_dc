package X;

import java.util.WeakHashMap;

/* renamed from: X.2xh  reason: invalid class name and case insensitive filesystem */
public class C59912xh {
    public static C59912xh A01;
    public final WeakHashMap A00 = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 != 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A01(android.graphics.BitmapFactory.Options r7, java.io.FileDescriptor r8) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r7.mCancel
            r4 = 0
            if (r0 != 0) goto L_0x004a
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            monitor-enter(r5)
            java.util.WeakHashMap r2 = r6.A00     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0047 }
            X.2Zf r0 = (X.C45232Zf) r0     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x001a
            int r1 = r0.A00     // Catch:{ all -> 0x0047 }
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r5)
            if (r0 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BitmapManager/Thread "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is not allowed to decode."
            X.C18260x0.A1J(r1, r0)
            return r4
        L_0x0030:
            monitor-enter(r5)
            X.2Zf r0 = r6.A02(r3)     // Catch:{ all -> 0x0047 }
            r0.A01 = r7     // Catch:{ all -> 0x0047 }
            monitor-exit(r5)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFileDescriptor(r8, r4, r7)
            monitor-enter(r5)
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0047 }
            X.2Zf r0 = (X.C45232Zf) r0     // Catch:{ all -> 0x0047 }
            r0.A01 = r4     // Catch:{ all -> 0x0047 }
            monitor-exit(r5)
            return r1
        L_0x0047:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59912xh.A01(android.graphics.BitmapFactory$Options, java.io.FileDescriptor):android.graphics.Bitmap");
    }

    public final synchronized C45232Zf A02(Thread thread) {
        C45232Zf r0;
        WeakHashMap weakHashMap = this.A00;
        r0 = (C45232Zf) weakHashMap.get(thread);
        if (r0 == null) {
            r0 = new C45232Zf();
            weakHashMap.put(thread, r0);
        }
        return r0;
    }

    public static synchronized C59912xh A00() {
        C59912xh r0;
        synchronized (C59912xh.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C59912xh();
                A01 = r0;
            }
        }
        return r0;
    }
}
