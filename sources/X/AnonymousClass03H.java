package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import java.util.Iterator;

/* renamed from: X.03H  reason: invalid class name */
public class AnonymousClass03H extends FrameLayout {
    public static final Interpolator A06 = C05030Rp.A00(0.17f, 0.17f, 0.0f, 1.0f);
    public C15440rL A00;
    public final Animator.AnimatorListener A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ObjectAnimator A04;
    public final ObjectAnimator A05;

    public final void A00(long j, long j2) {
        ObjectAnimator objectAnimator = this.A04;
        if (objectAnimator != null) {
            objectAnimator.setDuration(j);
        }
        ObjectAnimator objectAnimator2 = this.A05;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(j2);
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(j);
        }
        ObjectAnimator objectAnimator4 = this.A03;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(j2);
        }
    }

    public final void A01(View view) {
        C15440rL r4 = this.A00;
        if (r4 != null) {
            C09630gV r42 = (C09630gV) r4;
            for (C04190Ne r1 : r42.A0A) {
                if (r1.A00 == view) {
                    r1.A03.A03();
                    r1.A00 = null;
                }
            }
            Iterator it = r42.A0B.iterator();
            while (it.hasNext()) {
                C04190Ne r12 = (C04190Ne) it.next();
                if (r12.A00 == view) {
                    it.remove();
                    C04670Qe r0 = r12.A03;
                    r0.A03();
                    r12.A00 = null;
                    r0.A02();
                }
            }
        }
        removeView(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (1 == X.AnonymousClass001.A0M(r2).getLayoutDirection()) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r9, X.AnonymousClass0GI r10, boolean r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0004
            X.0GI r10 = X.AnonymousClass0GI.DEFAULT
        L_0x0004:
            int r0 = r10.ordinal()
            r4 = 1
            r5 = 2
            if (r0 == r5) goto L_0x014b
            if (r0 == r4) goto L_0x0100
            r2 = 280(0x118, double:1.383E-321)
            r0 = 200(0xc8, double:9.9E-322)
            r8.A00(r2, r0)
            android.content.Context r2 = r8.getContext()
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            int r1 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00fd
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r2)
            int r0 = r0.getLayoutDirection()
            r7 = 1
            if (r4 != r0) goto L_0x00fd
        L_0x002f:
            android.animation.ObjectAnimator r2 = r8.A04
            r6 = 0
            r3 = 0
            if (r2 == 0) goto L_0x004b
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            int r0 = r8.getWidth()
            if (r7 == 0) goto L_0x0043
            int r0 = -r0
        L_0x0043:
            float r0 = (float) r0
            r1[r3] = r0
            r1[r4] = r6
            r2.setFloatValues(r1)
        L_0x004b:
            android.animation.ObjectAnimator r2 = r8.A05
            if (r2 == 0) goto L_0x0065
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            r1[r3] = r6
            int r0 = r8.getWidth()
            if (r7 != 0) goto L_0x005f
            int r0 = -r0
        L_0x005f:
            float r0 = (float) r0
            r1[r4] = r0
            r2.setFloatValues(r1)
        L_0x0065:
            android.animation.ObjectAnimator r2 = r8.A02
            if (r2 == 0) goto L_0x007f
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            int r0 = r8.getWidth()
            if (r7 != 0) goto L_0x0077
            int r0 = -r0
        L_0x0077:
            float r0 = (float) r0
            r1[r3] = r0
            r1[r4] = r6
            r2.setFloatValues(r1)
        L_0x007f:
            android.animation.ObjectAnimator r2 = r8.A03
            if (r2 == 0) goto L_0x0099
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r2.setProperty(r0)
            float[] r1 = new float[r5]
            r1[r3] = r6
            int r0 = r8.getWidth()
            if (r7 == 0) goto L_0x0093
            int r0 = -r0
        L_0x0093:
            float r0 = (float) r0
            r1[r4] = r0
            r2.setFloatValues(r1)
        L_0x0099:
            android.view.ViewParent r1 = r9.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a6
            if (r1 != r8) goto L_0x0153
            r8.removeView(r9)
        L_0x00a6:
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r8.addView(r9, r0)
            int r7 = r8.getChildCount()
            if (r11 == 0) goto L_0x00f8
            android.animation.ObjectAnimator r6 = r8.A04
            android.animation.ObjectAnimator r5 = r8.A05
        L_0x00b9:
            r3 = 0
            r2 = 0
        L_0x00bb:
            if (r2 >= r7) goto L_0x0152
            android.view.View r1 = r8.getChildAt(r2)
            if (r1 != r9) goto L_0x00dc
            r1.setVisibility(r3)
            if (r7 <= r4) goto L_0x00d9
            if (r6 == 0) goto L_0x00d9
            boolean r0 = r6.isStarted()
            if (r0 == 0) goto L_0x00d3
            r6.cancel()
        L_0x00d3:
            r6.setTarget(r1)
            r6.start()
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00bb
        L_0x00dc:
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00d9
            if (r5 == 0) goto L_0x00f4
            boolean r0 = r5.isStarted()
            if (r0 == 0) goto L_0x00ed
            r5.cancel()
        L_0x00ed:
            r5.setTarget(r1)
            r5.start()
            goto L_0x00d9
        L_0x00f4:
            r8.A01(r1)
            goto L_0x00d9
        L_0x00f8:
            android.animation.ObjectAnimator r6 = r8.A02
            android.animation.ObjectAnimator r5 = r8.A03
            goto L_0x00b9
        L_0x00fd:
            r7 = 0
            goto L_0x002f
        L_0x0100:
            r0 = 250(0xfa, double:1.235E-321)
            r8.A00(r0, r0)
            android.animation.ObjectAnimator r1 = r8.A04
            if (r1 == 0) goto L_0x0116
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            r1.setFloatValues(r0)
        L_0x0116:
            android.animation.ObjectAnimator r1 = r8.A05
            if (r1 == 0) goto L_0x0127
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            r1.setFloatValues(r0)
        L_0x0127:
            android.animation.ObjectAnimator r1 = r8.A02
            if (r1 == 0) goto L_0x0138
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            r1.setFloatValues(r0)
        L_0x0138:
            android.animation.ObjectAnimator r1 = r8.A03
            if (r1 == 0) goto L_0x0099
            android.util.Property r0 = android.view.View.ALPHA
            r1.setProperty(r0)
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            r1.setFloatValues(r0)
            goto L_0x0099
        L_0x014b:
            r0 = 0
            r8.A00(r0, r0)
            goto L_0x0099
        L_0x0152:
            return
        L_0x0153:
            java.lang.String r0 = "Trying to show a view that is attached to a different parent"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03H.A02(android.view.View, X.0GI, boolean):void");
    }

    public AnonymousClass03H(Context context) {
        super(context);
        C17440va r2 = new C17440va(this, 3);
        this.A01 = r2;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        Interpolator interpolator = A06;
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.addListener(r2);
        this.A04 = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setInterpolator(interpolator);
        this.A05 = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        objectAnimator3.setInterpolator(interpolator);
        objectAnimator3.addListener(r2);
        this.A02 = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        objectAnimator4.setInterpolator(interpolator);
        this.A03 = objectAnimator4;
    }

    public View getPrimaryChild() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        return getChildAt(childCount - 1);
    }

    public void setOnViewRemovedListener(C15440rL r1) {
        this.A00 = r1;
    }
}
