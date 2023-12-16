package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.7jE  reason: invalid class name and case insensitive filesystem */
public final class C157977jE {
    public static final WeakHashMap A01 = new WeakHashMap();
    public final WeakReference A00;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r4.A00.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L_0x0025
            r2 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.Class r1 = r5.getClass()
            java.lang.Class<X.7jE> r0 = X.C157977jE.class
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0026
            java.lang.ref.WeakReference r0 = r4.A00
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0026
            X.7jE r5 = (X.C157977jE) r5
            java.lang.ref.WeakReference r0 = r5.A00
            java.lang.Object r0 = r0.get()
            if (r1 == r0) goto L_0x0025
            r3 = 0
        L_0x0025:
            return r3
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157977jE.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return C18280x3.A04(this.A00.get());
    }

    public C157977jE(View view) {
        this.A00 = AnonymousClass0x9.A14(view);
    }
}
