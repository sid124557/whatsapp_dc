package X;

import android.animation.ValueAnimator;

/* renamed from: X.5Ae  reason: invalid class name and case insensitive filesystem */
public class C100255Ae implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C100255Ae(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0 == 0) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x008f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            android.transition.TransitionValues r0 = (android.transition.TransitionValues) r0
            java.lang.Object r9 = r10.A01
            X.4N7 r9 = (X.AnonymousClass4N7) r9
            boolean r3 = X.C18320x8.A1V(r11)
            android.view.View r4 = r0.view
            boolean r0 = r4 instanceof com.whatsapp.mediaview.PhotoView
            if (r0 != 0) goto L_0x001b
            boolean r0 = r4 instanceof com.whatsapp.components.button.ThumbnailButton
            if (r0 == 0) goto L_0x0080
        L_0x001b:
            X.C162457s7.A0C(r4)
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C162457s7.A0K(r1, r0)
            float r7 = X.AnonymousClass001.A05(r1)
            boolean r0 = r9.A05
            r2 = 1
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r3
            float r7 = r0 - r7
        L_0x0033:
            int[] r0 = r9.A06
            r4.getLocationOnScreen(r0)
            r8 = r0[r3]
            int r1 = r4.getHeight()
            int r1 = r1 + r8
            android.graphics.Rect r5 = r9.A03
            r6 = 0
            r5.left = r6
            int r0 = r4.getWidth()
            r5.right = r0
            int r0 = r9.A00
            if (r3 > r0) goto L_0x0089
            if (r0 >= r1) goto L_0x0089
        L_0x0050:
            r3 = 0
            if (r2 == 0) goto L_0x0084
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            int r2 = r4.getHeight()
            int r0 = r9.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 * r7
            int r0 = (int) r0
            int r2 = r2 - r0
        L_0x0062:
            r5.bottom = r2
            int r1 = r9.A01
            if (r8 >= r1) goto L_0x0081
            if (r1 <= 0) goto L_0x0081
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0081
            int r1 = r1 - r8
            float r0 = (float) r1
            float r7 = r7 * r0
            int r0 = (int) r7
            r5.top = r0
            if (r0 != 0) goto L_0x008b
        L_0x0076:
            int r0 = r4.getHeight()
            if (r2 != r0) goto L_0x008b
            r0 = 0
            X.C04910Rd.A01(r4, r0)
        L_0x0080:
            return
        L_0x0081:
            r5.top = r6
            goto L_0x0076
        L_0x0084:
            int r2 = r4.getHeight()
            goto L_0x0062
        L_0x0089:
            r2 = 0
            goto L_0x0050
        L_0x008b:
            X.C04910Rd.A01(r4, r5)
            return
        L_0x008f:
            java.lang.Object r1 = r10.A00
            X.4nZ r1 = (X.C92914nZ) r1
            java.lang.Object r0 = r10.A01
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            int r2 = X.C86604Kt.A01(r0)
            android.view.ViewGroup r1 = r1.A0N
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r2
            r0.height = r2
            r1.setLayoutParams(r0)
            return
        L_0x00a9:
            java.lang.Object r5 = r10.A00
            X.5Y6 r5 = (X.AnonymousClass5Y6) r5
            java.lang.Object r4 = r10.A01
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            int r3 = r4.leftMargin
            int r2 = r4.topMargin
            int r1 = r4.rightMargin
            int r0 = X.C86604Kt.A01(r11)
            r4.setMargins(r3, r2, r1, r0)
            android.view.View r0 = r5.A0C
            r0.setLayoutParams(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100255Ae.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
