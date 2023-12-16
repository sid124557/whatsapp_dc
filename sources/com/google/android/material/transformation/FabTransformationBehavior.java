package com.google.android.material.transformation;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass4L0;
import X.AnonymousClass7BZ;
import X.C002002f;
import X.C158807ka;
import X.C159917mg;
import X.C161407pZ;
import X.C86664Kz;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float A00;
    public float A01;
    public final Rect A02 = AnonymousClass001.A0N();
    public final RectF A03 = AnonymousClass002.A07();
    public final RectF A04 = AnonymousClass002.A07();
    public final int[] A05 = C86664Kz.A1Z();

    public static final Pair A01(AnonymousClass7BZ r3, float f, float f2, boolean z) {
        C158807ka A032;
        C161407pZ r1;
        String str;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            A032 = r3.A00.A03("translationXLinear");
            r1 = r3.A00;
            str = "translationYLinear";
        } else if (!z ? i <= 0 : f2 >= 0.0f) {
            A032 = r3.A00.A03("translationXCurveDownwards");
            r1 = r3.A00;
            str = "translationYCurveDownwards";
        } else {
            A032 = r3.A00.A03("translationXCurveUpwards");
            r1 = r3.A00;
            str = "translationYCurveUpwards";
        }
        return AnonymousClass0x9.A0C(A032, r1.A03(str));
    }

    public static final float A00(C158807ka r8, AnonymousClass7BZ r9, float f) {
        long j = r8.A02;
        long j2 = r8.A03;
        C158807ka A032 = r9.A00.A03("expansion");
        float f2 = ((float) (((A032.A02 + A032.A03) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = r8.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C159917mg.A02;
        }
        return AnonymousClass001.A00(0.0f, f, timeInterpolator.getInterpolation(f2));
    }

    public void A0D(C002002f r2) {
        if (r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x013e, code lost:
        if ((r4 instanceof android.view.ViewGroup) != false) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet A0L(android.view.View r20, android.view.View r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            r13 = r21
            android.content.Context r1 = r13.getContext()
            r0 = 2130837535(0x7f02001f, float:1.7280027E38)
            r12 = r22
            if (r22 == 0) goto L_0x0010
            r0 = 2130837536(0x7f020020, float:1.7280029E38)
        L_0x0010:
            X.7BZ r11 = new X.7BZ
            r11.<init>()
            X.7pZ r0 = X.C161407pZ.A00(r1, r0)
            r11.A00 = r0
            r10 = r19
            r14 = r20
            if (r22 == 0) goto L_0x002d
            float r0 = r14.getTranslationX()
            r10.A00 = r0
            float r0 = r14.getTranslationY()
            r10.A01 = r0
        L_0x002d:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()
            float r3 = X.AnonymousClass0YZ.A00(r13)
            float r0 = X.AnonymousClass0YZ.A00(r14)
            float r3 = r3 - r0
            r8 = 0
            r1 = 1
            if (r22 == 0) goto L_0x01a9
            if (r23 != 0) goto L_0x0048
            float r0 = -r3
            r13.setTranslationZ(r0)
        L_0x0048:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r1]
            r0 = 0
        L_0x004d:
            android.animation.ObjectAnimator r2 = X.AnonymousClass6CA.A0H(r2, r13, r1, r0, r8)
            X.7pZ r1 = r11.A00
            java.lang.String r0 = "elevation"
            X.7ka r0 = r1.A03(r0)
            r0.A00(r2)
            r9.add(r2)
            android.graphics.RectF r7 = r10.A03
            android.graphics.RectF r6 = r10.A04
            X.AnonymousClass6C9.A0t(r7, r6, r14, r13, r10)
            float r5 = r6.centerX()
            float r0 = r7.centerX()
            float r5 = r5 - r0
            r0 = 0
            float r5 = r5 + r0
            X.AnonymousClass6C9.A0t(r7, r6, r14, r13, r10)
            float r4 = r6.centerY()
            float r0 = r7.centerY()
            float r4 = r4 - r0
            r3 = 0
            float r4 = r4 + r3
            android.util.Pair r1 = A01(r11, r5, r4, r12)
            java.lang.Object r0 = r1.first
            r17 = r0
            r0 = r17
            X.7ka r0 = (X.C158807ka) r0
            r17 = r0
            java.lang.Object r15 = r1.second
            X.7ka r15 = (X.C158807ka) r15
            r2 = 1
            if (r22 == 0) goto L_0x0195
            if (r23 != 0) goto L_0x009e
            float r0 = -r5
            r13.setTranslationX(r0)
            float r0 = -r4
            r13.setTranslationY(r0)
        L_0x009e:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            float[] r0 = new float[r2]
            android.animation.ObjectAnimator r16 = X.AnonymousClass6CA.A0H(r1, r13, r0, r3, r8)
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            float[] r1 = new float[r2]
            android.animation.ObjectAnimator r1 = X.AnonymousClass6CA.A0H(r0, r13, r1, r3, r8)
            float r2 = -r5
            float r4 = -r4
            r0 = r17
            float r5 = A00(r0, r11, r2)
            float r2 = A00(r15, r11, r4)
            android.graphics.Rect r0 = r10.A02
            r13.getWindowVisibleDisplayFrame(r0)
            r7.set(r0)
            r10.A0M(r6, r13)
            r6.offset(r5, r2)
            r6.intersect(r7)
            r7.set(r6)
        L_0x00ce:
            r2 = r16
            r0 = r17
            r0.A00(r2)
            r15.A00(r1)
            r9.add(r2)
            r9.add(r1)
            r7.width()
            r7.height()
            X.AnonymousClass6C9.A0t(r7, r6, r14, r13, r10)
            float r0 = r6.centerX()
            float r1 = r7.centerX()
            float r0 = r0 - r1
            float r0 = r0 + r3
            X.AnonymousClass6C9.A0t(r7, r6, r14, r13, r10)
            float r6 = r6.centerY()
            float r1 = r7.centerY()
            float r6 = r6 - r1
            float r6 = r6 + r3
            android.util.Pair r1 = A01(r11, r0, r6, r12)
            java.lang.Object r4 = r1.first
            X.7ka r4 = (X.C158807ka) r4
            java.lang.Object r2 = r1.second
            X.7ka r2 = (X.C158807ka) r2
            android.util.Property r7 = android.view.View.TRANSLATION_X
            r5 = 1
            float[] r1 = new float[r5]
            if (r22 != 0) goto L_0x0113
            float r0 = r10.A00
        L_0x0113:
            android.animation.ObjectAnimator r1 = X.AnonymousClass6CA.A0H(r7, r14, r1, r0, r8)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r0 = new float[r5]
            if (r22 != 0) goto L_0x011f
            float r6 = r10.A01
        L_0x011f:
            android.animation.ObjectAnimator r0 = X.AnonymousClass6CA.A0H(r7, r14, r0, r6, r8)
            r4.A00(r1)
            r2.A00(r0)
            r9.add(r1)
            r9.add(r0)
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0165
            r0 = 2131431601(0x7f0b10b1, float:1.8484936E38)
            android.view.View r4 = r13.findViewById(r0)
            if (r4 == 0) goto L_0x0193
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0165
        L_0x0140:
            if (r22 == 0) goto L_0x018a
            if (r23 != 0) goto L_0x014d
            android.util.Property r1 = X.AnonymousClass6EL.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r1.set(r4, r0)
        L_0x014d:
            android.util.Property r2 = X.AnonymousClass6EL.A00
            float[] r1 = new float[r5]
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r2 = X.AnonymousClass6CA.A0H(r2, r4, r1, r0, r8)
        L_0x0157:
            X.7pZ r1 = r11.A00
            java.lang.String r0 = "contentFade"
            X.7ka r0 = r1.A03(r0)
            r0.A00(r2)
            r9.add(r2)
        L_0x0165:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            X.C1446272h.A00(r3, r9)
            X.6CI r0 = new X.6CI
            r0.<init>(r13, r14, r10, r12)
            r3.addListener(r0)
            int r2 = r18.size()
            r1 = 0
        L_0x017a:
            if (r1 >= r2) goto L_0x01b0
            r0 = r18
            java.lang.Object r0 = r0.get(r1)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r3.addListener(r0)
            int r1 = r1 + 1
            goto L_0x017a
        L_0x018a:
            android.util.Property r1 = X.AnonymousClass6EL.A00
            float[] r0 = new float[r5]
            android.animation.ObjectAnimator r2 = X.AnonymousClass6CA.A0H(r1, r4, r0, r3, r8)
            goto L_0x0157
        L_0x0193:
            r4 = r13
            goto L_0x0140
        L_0x0195:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            float[] r0 = new float[r2]
            float r5 = -r5
            android.animation.ObjectAnimator r16 = X.AnonymousClass6CA.A0H(r1, r13, r0, r5, r8)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float[] r2 = new float[r2]
            float r0 = -r4
            android.animation.ObjectAnimator r1 = X.AnonymousClass6CA.A0H(r1, r13, r2, r0, r8)
            goto L_0x00ce
        L_0x01a9:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r1]
            float r0 = -r3
            goto L_0x004d
        L_0x01b0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.A0L(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A0M(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, AnonymousClass4L0.A00(view), C86664Kz.A02(view));
        int[] iArr = this.A05;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public FabTransformationBehavior() {
    }
}
