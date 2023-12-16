package X;

import android.os.Build;
import android.view.WindowMetrics;

/* renamed from: X.0Aj  reason: invalid class name and case insensitive filesystem */
public class C01380Aj extends C03020In {
    public final int A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r6.width() >= r1) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (java.lang.Math.min(r6.width(), r6.height()) >= r2) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.graphics.Rect r6) {
        /*
            r5 = this;
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            int r1 = r5.A01
            r4 = 0
            if (r1 == 0) goto L_0x0010
            int r0 = r6.width()
            r3 = 0
            if (r0 < r1) goto L_0x0011
        L_0x0010:
            r3 = 1
        L_0x0011:
            int r2 = r5.A00
            if (r2 == 0) goto L_0x0024
            int r1 = r6.width()
            int r0 = r6.height()
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 0
            if (r1 < r2) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r3 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x002a
            r4 = 1
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01380Aj.A00(android.graphics.Rect):boolean");
    }

    public final boolean A01(WindowMetrics windowMetrics) {
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        return A00(C03030Io.A00(windowMetrics));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C01380Aj) {
                C01380Aj r5 = (C01380Aj) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A00) * 31) + Float.floatToIntBits(0.4f)) * 31) + 3;
    }

    public C01380Aj(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
