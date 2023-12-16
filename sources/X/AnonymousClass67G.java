package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;

/* renamed from: X.67G  reason: invalid class name */
public class AnonymousClass67G extends AnimatorListenerAdapter {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass67G(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r9 != 5) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r11)
        L_0x0008:
            return
        L_0x0009:
            super.onAnimationEnd(r11)
            java.lang.Object r6 = r10.A00
            X.5Uj r6 = (X.C105305Uj) r6
            android.animation.AnimatorSet r0 = r6.A02
            if (r0 == 0) goto L_0x0008
            java.util.ArrayList r0 = r0.getChildAnimations()
            java.util.Iterator r1 = r0.iterator()
        L_0x001c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r1.next()
            android.animation.Animator r0 = (android.animation.Animator) r0
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.removeAllUpdateListeners()
            goto L_0x001c
        L_0x002e:
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r10.A00
            X.5pH r0 = (X.C115815pH) r0
            com.whatsapp.status.StatusesFragment r0 = r0.A02
            X.8qC r0 = r0.A1E
            r0.get()
        L_0x003d:
            java.lang.Object r0 = r10.A00
            X.5pH r0 = (X.C115815pH) r0
            com.whatsapp.status.StatusesFragment r0 = r0.A02
            X.5Oo r2 = r0.A0x
            X.5Sb r1 = r2.A02
            r0 = 0
            r1.A00 = r0
            r2.A00()
            return
        L_0x004e:
            android.animation.AnimatorSet r0 = r6.A02
            r0.removeAllListeners()
            boolean r5 = r10.A01
            r4 = 0
            if (r5 == 0) goto L_0x00cb
            android.animation.AnimatorSet r0 = r6.A00(r4)
        L_0x005c:
            r6.A02 = r0
            if (r5 == 0) goto L_0x00e1
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r7 = r6.A0I
            X.5Us r0 = r6.A0G
            X.08M r0 = r0.A05
            int r9 = X.C86604Kt.A05(r0)
            r0 = 1
            java.lang.String r8 = "textTool"
            java.lang.String r2 = "shapeTool"
            r3 = 4
            if (r9 == r0) goto L_0x00b2
            r0 = 2
            java.lang.String r1 = "penTool"
            if (r9 == r0) goto L_0x009d
            r0 = 3
            if (r9 == r0) goto L_0x0088
            r0 = 5
            if (r9 == r0) goto L_0x009d
        L_0x007d:
            android.widget.ImageView r0 = r7.A04
            java.lang.String r2 = "cropTool"
            if (r0 != 0) goto L_0x00cd
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0088:
            android.widget.ImageView r0 = r7.A06
            if (r0 != 0) goto L_0x0091
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0091:
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r7.A07
            if (r0 != 0) goto L_0x00c7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x009d:
            android.widget.ImageView r0 = r7.A06
            if (r0 != 0) goto L_0x00a6
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x00a6:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r7.A0C
            if (r0 != 0) goto L_0x00c7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x00b2:
            android.widget.ImageView r0 = r7.A07
            if (r0 != 0) goto L_0x00bb
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x00bb:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r7.A0C
            if (r0 != 0) goto L_0x00c7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x00c7:
            r0.setVisibility(r3)
            goto L_0x007d
        L_0x00cb:
            r0 = 0
            goto L_0x005c
        L_0x00cd:
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00e1
            android.widget.ImageView r0 = r7.A04
            if (r0 != 0) goto L_0x00de
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x00de:
            r0.setVisibility(r3)
        L_0x00e1:
            r6.A09 = r5
            r6.A08 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass67G.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        C94024pj r9;
        int i;
        int i2;
        if (this.A02 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        int i3 = 0;
        while (true) {
            r9 = (C94024pj) this.A00;
            if (i3 >= r9.getChildCount()) {
                break;
            }
            View childAt = r9.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = r9.A0H[i3];
            childAt.setLayoutParams(layoutParams);
            i3++;
        }
        for (int i4 = 0; i4 < r9.getChildCount(); i4++) {
            r9.getChildAt(i4).setVisibility(0);
        }
        boolean z = this.A01;
        int childCount = r9.getChildCount();
        if (z == C620733j.A04(r9.A05)) {
            i = r9.getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            i = 0;
            i2 = 1;
        }
        int i5 = 0;
        while (i != childCount) {
            if (!(r9.getChildAt(i) instanceof AnonymousClass66Z)) {
                C626936e.A0D(false, "Given view is not ReactionTrayItem.");
            }
            AnonymousClass66Z r11 = (AnonymousClass66Z) r9.getChildAt(i);
            r11.setForegroundScale(0.0f);
            AnimatorSet A0O = C86664Kz.A0O();
            float f = 0.1f + 1.0f;
            float[] A0T = AnonymousClass4L0.A0T();
            A0T[0] = 0.0f;
            A0T[1] = f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r11, "foregroundScale", A0T);
            ofFloat.setDuration(160);
            Interpolator interpolator = C100865Co.A02;
            ofFloat.setInterpolator(interpolator);
            ObjectAnimator duration = ObjectAnimator.ofFloat(r11, "foregroundAlpha", new float[]{0.0f, 1.0f}).setDuration(120);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r11, "foregroundScale", new float[]{f, 1.0f});
            ofFloat2.setDuration(160);
            ofFloat2.setInterpolator(interpolator);
            A0O.playSequentially(new Animator[]{ofFloat, ofFloat2});
            r11.setBackgroundAlpha(0.0f);
            Animator[] A1b = C86664Kz.A1b(ofFloat, duration, 3, 0);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r11, "backgroundAlpha", new float[]{0.0f, 1.0f});
            ofFloat3.setInterpolator(C100865Co.A00);
            ofFloat3.setDuration(320);
            A1b[2] = ofFloat3;
            A0O.playTogether(A1b);
            A0O.setStartDelay(((long) i5) * 35);
            A0O.start();
            i += i2;
            i5++;
        }
    }
}
