package X;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: X.5Wu  reason: invalid class name and case insensitive filesystem */
public class C105885Wu {
    public final Map A00 = AnonymousClass001.A0t();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A00(X.C157917j8 r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map r4 = r5.A00
            monitor-enter(r4)
            X.7Vv r0 = new X.7Vv     // Catch:{ all -> 0x002d }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x002d }
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            r3 = 0
            return r3
        L_0x0013:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x002d }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x0029 }
            r1 = 2
            X.932 r0 = new X.932     // Catch:{ all -> 0x0029 }
            r0.<init>(r1)     // Catch:{ all -> 0x0029 }
            X.AnonymousClass367.A01(r0, r2)     // Catch:{ all -> 0x0029 }
            goto L_0x002b
        L_0x0029:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            return r3
        L_0x002d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105885Wu.A00(X.7j8, boolean):android.graphics.Bitmap");
    }

    public void A01(Bitmap bitmap, C157917j8 r5, boolean z) {
        Map map = this.A00;
        synchronized (map) {
            map.put(new C151677Vv(r5, z), new SoftReference(bitmap));
        }
    }
}
