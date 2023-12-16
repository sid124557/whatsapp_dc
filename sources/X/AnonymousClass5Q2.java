package X;

import android.graphics.Matrix;

/* renamed from: X.5Q2  reason: invalid class name */
public class AnonymousClass5Q2 {
    public final Matrix A00 = AnonymousClass002.A05();
    public final C104435Qy A01;
    public final float[] A02 = AnonymousClass4L0.A0T();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF A00(float r10, float r11) {
        /*
            r9 = this;
            android.graphics.Matrix r2 = r9.A00
            r2.reset()
            X.5Qy r1 = r9.A01
            int r0 = r1.A02
            int r0 = -r0
            float r0 = (float) r0
            r2.preRotate(r0)
            int r4 = r1.A02
            r0 = 90
            r3 = 0
            if (r4 != r0) goto L_0x0071
            android.graphics.RectF r0 = r1.A0B
            float r0 = r0.width()
            int r0 = (int) r0
            int r0 = -r0
            float r4 = (float) r0
        L_0x001e:
            r2.preTranslate(r4, r3)
        L_0x0021:
            android.graphics.Rect r3 = r1.A05
            if (r3 == 0) goto L_0x0041
            int r0 = r3.width()
            float r0 = (float) r0
            float r10 = r10 * r0
            int r0 = r1.A04
            float r0 = (float) r0
            float r10 = r10 / r0
            int r0 = r3.left
            float r0 = (float) r0
            float r10 = r10 + r0
            int r0 = r3.height()
            float r0 = (float) r0
            float r11 = r11 * r0
            int r0 = r1.A03
            float r0 = (float) r0
            float r11 = r11 / r0
            int r0 = r3.top
            float r0 = (float) r0
            float r11 = r11 + r0
        L_0x0041:
            float[] r7 = r9.A02
            android.graphics.RectF r3 = r1.A0B
            float r0 = r3.left
            float r10 = r10 - r0
            r8 = 0
            r7[r8] = r10
            float r0 = r3.top
            float r11 = r11 - r0
            r6 = 1
            r7[r6] = r11
            r2.mapPoints(r7)
            android.graphics.RectF r5 = r1.A07
            float r4 = r5.left
            android.graphics.RectF r3 = r1.A06
            float r0 = r3.left
            float r4 = r4 - r0
            r0 = r7[r8]
            float r2 = r1.A00
            float r0 = r0 / r2
            float r4 = r4 + r0
            float r1 = r5.top
            float r0 = r3.top
            float r1 = r1 - r0
            r0 = r7[r6]
            float r0 = r0 / r2
            float r1 = r1 + r0
            android.graphics.PointF r0 = X.AnonymousClass4L0.A08(r4, r1)
            return r0
        L_0x0071:
            r0 = 180(0xb4, float:2.52E-43)
            if (r4 != r0) goto L_0x0086
            android.graphics.RectF r3 = r1.A0B
            float r0 = r3.width()
            int r0 = (int) r0
            int r0 = -r0
            float r4 = (float) r0
            float r0 = r3.height()
            int r0 = (int) r0
            int r0 = -r0
            float r3 = (float) r0
            goto L_0x001e
        L_0x0086:
            r0 = 270(0x10e, float:3.78E-43)
            if (r4 != r0) goto L_0x0097
            android.graphics.RectF r0 = r1.A0B
            float r0 = r0.height()
            int r0 = (int) r0
            int r0 = -r0
            float r0 = (float) r0
            r2.preTranslate(r3, r0)
            goto L_0x0021
        L_0x0097:
            if (r4 == 0) goto L_0x0021
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Q2.A00(float, float):android.graphics.PointF");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF A01(android.graphics.PointF r10) {
        /*
            r9 = this;
            float[] r4 = r9.A02
            float r3 = r10.x
            X.5Qy r2 = r9.A01
            android.graphics.RectF r8 = r2.A07
            float r1 = r8.left
            android.graphics.RectF r6 = r2.A06
            float r0 = r6.left
            float r1 = r1 - r0
            float r3 = r3 - r1
            float r5 = r2.A00
            float r3 = r3 * r5
            r7 = 0
            r4[r7] = r3
            float r3 = r10.y
            float r1 = r8.top
            float r0 = r6.top
            float r1 = r1 - r0
            float r3 = r3 - r1
            float r3 = r3 * r5
            r6 = 1
            r4[r6] = r3
            android.graphics.Matrix r3 = r9.A00
            r3.reset()
            int r5 = r2.A02
            r0 = 90
            r1 = 0
            if (r5 != r0) goto L_0x0073
            android.graphics.RectF r0 = r2.A0B
            float r0 = r0.width()
            int r0 = (int) r0
            float r5 = (float) r0
        L_0x0036:
            r3.preTranslate(r5, r1)
        L_0x0039:
            int r0 = r2.A02
            float r0 = (float) r0
            r3.preRotate(r0)
            r3.mapPoints(r4)
            r3 = r4[r7]
            r1 = r4[r6]
            android.graphics.RectF r4 = r2.A0B
            float r0 = r4.left
            float r3 = r3 + r0
            float r0 = r4.top
            float r1 = r1 + r0
            android.graphics.Rect r4 = r2.A05
            if (r4 == 0) goto L_0x006e
            int r0 = r4.left
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r2.A04
            float r0 = (float) r0
            float r3 = r3 * r0
            int r0 = r4.width()
            float r0 = (float) r0
            float r3 = r3 / r0
            int r0 = r4.top
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = r2.A03
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = r4.height()
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x006e:
            android.graphics.PointF r0 = X.AnonymousClass4L0.A08(r3, r1)
            return r0
        L_0x0073:
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 != r0) goto L_0x0086
            android.graphics.RectF r1 = r2.A0B
            float r0 = r1.width()
            int r0 = (int) r0
            float r5 = (float) r0
            float r0 = r1.height()
            int r0 = (int) r0
            float r1 = (float) r0
            goto L_0x0036
        L_0x0086:
            r0 = 270(0x10e, float:3.78E-43)
            if (r5 != r0) goto L_0x0096
            android.graphics.RectF r0 = r2.A0B
            float r0 = r0.height()
            int r0 = (int) r0
            float r0 = (float) r0
            r3.preTranslate(r1, r0)
            goto L_0x0039
        L_0x0096:
            if (r5 == 0) goto L_0x0039
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Q2.A01(android.graphics.PointF):android.graphics.PointF");
    }

    public AnonymousClass5Q2(C104435Qy r2) {
        this.A01 = r2;
    }
}
