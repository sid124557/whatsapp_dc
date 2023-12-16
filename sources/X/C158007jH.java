package X;

import android.net.Uri;

/* renamed from: X.7jH  reason: invalid class name and case insensitive filesystem */
public class C158007jH {
    public Uri A00;
    public float[] A01;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r9 = (X.C158007jH) r9;
        r5 = r9.A01;
        r0 = r5.length;
        r4 = r8.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r8 == r9) goto L_0x003a
            r6 = 0
            if (r9 == 0) goto L_0x0039
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r0 = r9.getClass()
            if (r1 != r0) goto L_0x0039
            X.7jH r9 = (X.C158007jH) r9
            float[] r5 = r9.A01
            int r0 = r5.length
            float[] r4 = r8.A01
            int r3 = r4.length
            if (r0 != r3) goto L_0x0039
            r2 = 0
        L_0x001b:
            if (r2 >= r3) goto L_0x002a
            r1 = r5[r2]
            r0 = r4[r2]
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x0039
            int r2 = r2 + 1
            goto L_0x001b
        L_0x002a:
            android.net.Uri r1 = r8.A00
            android.net.Uri r0 = r9.A00
            if (r1 == 0) goto L_0x0035
            boolean r7 = r1.equals(r0)
            return r7
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r7 = 0
            return r7
        L_0x0039:
            return r6
        L_0x003a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158007jH.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int A04 = C18280x3.A04(this.A00);
        int i2 = 0;
        while (true) {
            float[] fArr = this.A01;
            if (i2 >= fArr.length) {
                return A04;
            }
            int i3 = A04 * 31;
            float f = fArr[i2];
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            A04 = i3 + i;
            i2++;
        }
    }

    public C158007jH(Uri uri, float[] fArr) {
        this.A00 = uri;
        this.A01 = fArr;
    }

    public C158007jH() {
    }
}
