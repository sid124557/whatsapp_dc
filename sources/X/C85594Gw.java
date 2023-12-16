package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.4Gw  reason: invalid class name and case insensitive filesystem */
public class C85594Gw extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C85594Gw(View view, ViewPropertyAnimator viewPropertyAnimator, C46612bv r3, C197912r r4, int i) {
        this.A04 = i;
        this.A00 = r4;
        this.A01 = r3;
        if (2 - i != 0) {
            this.A03 = viewPropertyAnimator;
            this.A02 = view;
        } else {
            this.A02 = viewPropertyAnimator;
            this.A03 = view;
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A04 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        View view = (View) this.A03;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        r2.remove(r0);
        r3.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0084, code lost:
        r0.remove(r1);
        r2.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            int r0 = r4.A04
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x006f;
                case 2: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A03
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r0 = r4.A02
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass0x2.A0w(r0)
            java.lang.Object r3 = r4.A00
            X.12r r3 = (X.C197912r) r3
            java.lang.Object r1 = r4.A01
            X.2bv r1 = (X.C46612bv) r1
            X.0Ua r0 = r1.A04
            r3.A02(r0)
            java.util.ArrayList r2 = r3.A03
            X.0Ua r0 = r1.A04
        L_0x0025:
            r2.remove(r0)
            r3.A0G()
            return
        L_0x002c:
            java.lang.Object r1 = r4.A02
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r0 = r4.A03
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass0x2.A0w(r0)
            java.lang.Object r3 = r4.A00
            X.12r r3 = (X.C197912r) r3
            java.lang.Object r1 = r4.A01
            X.2bv r1 = (X.C46612bv) r1
            X.0Ua r0 = r1.A05
            r3.A02(r0)
            java.util.ArrayList r2 = r3.A03
            X.0Ua r0 = r1.A05
            goto L_0x0025
        L_0x004d:
            java.lang.Object r1 = r4.A01
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r1 = r4.A03
            android.view.View r1 = (android.view.View) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            java.lang.Object r2 = r4.A00
            X.12r r2 = (X.C197912r) r2
            java.lang.Object r1 = r4.A02
            X.0Ua r1 = (X.C05570Ua) r1
            r2.A02(r1)
            java.util.ArrayList r0 = r2.A0B
            goto L_0x0084
        L_0x006f:
            java.lang.Object r1 = r4.A01
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r2 = r4.A00
            X.12r r2 = (X.C197912r) r2
            java.lang.Object r1 = r4.A02
            X.0Ua r1 = (X.C05570Ua) r1
            r2.A02(r1)
            java.util.ArrayList r0 = r2.A01
        L_0x0084:
            r0.remove(r1)
            r2.A0G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85594Gw.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        ((C197912r) this.A00).A0C = true;
    }

    public C85594Gw(View view, ViewPropertyAnimator viewPropertyAnimator, C05570Ua r3, C197912r r4, int i) {
        this.A04 = i;
        this.A00 = r4;
        this.A02 = r3;
        if (i != 0) {
            this.A03 = view;
            this.A01 = viewPropertyAnimator;
        } else {
            this.A01 = viewPropertyAnimator;
            this.A03 = view;
        }
    }
}
