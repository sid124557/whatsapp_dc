package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.0Ib  reason: invalid class name and case insensitive filesystem */
public class C02910Ib implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public static float A00(TimeInterpolator timeInterpolator, float[] fArr, float f, float f2, int i) {
        float f3 = fArr[i % fArr.length];
        float interpolation = timeInterpolator.getInterpolation(f);
        return (f2 * (1.0f - interpolation)) + (f3 * interpolation);
    }

    public C02910Ib(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.01F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.01E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.01F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.01F} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationUpdate(android.animation.ValueAnimator r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0010;
                case 2: goto L_0x0068;
                case 3: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r8.A00
            X.00G r2 = (X.AnonymousClass00G) r2
            long r0 = X.C02910Ib.super.getCurrentPlayTime()
            r2.A01 = r0
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r0 = r8.A00
            X.01G r0 = (X.AnonymousClass01G) r0
            X.0Bu r1 = r0.A08
            if (r1 == 0) goto L_0x000f
            X.00H r0 = r0.A0K
            float r0 = r0.A01()
            r1.A05(r0)
            return
        L_0x0022:
            float r1 = X.AnonymousClass001.A03(r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            float r7 = java.lang.Math.max(r0, r1)
            r0 = 1082130432(0x40800000, float:4.0)
            float r7 = r7 * r0
            int r6 = (int) r7
            float r0 = (float) r6
            float r7 = r7 - r0
            float[] r2 = X.AnonymousClass01E.A0C
            android.view.animation.Interpolator r1 = X.AnonymousClass01E.A0A
            r0 = r2[r6]
            int r3 = r6 + 1
            float r5 = A00(r1, r2, r7, r0, r3)
            float[] r1 = X.AnonymousClass01E.A0D
            android.view.animation.Interpolator r2 = X.AnonymousClass01E.A09
            r0 = r1[r6]
            float r4 = A00(r2, r1, r7, r0, r3)
            float[] r1 = X.AnonymousClass01E.A0B
            r0 = r1[r6]
            float r3 = A00(r2, r1, r7, r0, r3)
            java.lang.Object r6 = r8.A00
            X.01E r6 = (X.AnonymousClass01E) r6
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r4 * r2
            float r1 = r1 + r5
            r0 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 - r0
            r6.A01 = r1
            float r3 = r3 - r4
            float r3 = r3 * r2
            r6.A00 = r3
            goto L_0x007b
        L_0x0068:
            java.lang.Object r6 = r8.A00
            X.01F r6 = (X.AnonymousClass01F) r6
            android.graphics.Paint r2 = r6.A05
            int r1 = r6.A02
            float r0 = X.AnonymousClass001.A03(r9)
            int r0 = X.AnonymousClass0J6.A00(r1, r0)
            r2.setColor(r0)
        L_0x007b:
            r6.invalidateSelf()
            return
        L_0x007f:
            java.lang.Object r1 = r8.A00
            X.0Yj r1 = (X.C06580Yj) r1
            float r0 = r9.getAnimatedFraction()
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02910Ib.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
