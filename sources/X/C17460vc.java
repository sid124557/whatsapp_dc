package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.0vc  reason: invalid class name and case insensitive filesystem */
public class C17460vc extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C17460vc(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A03 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((AnonymousClass0u4) this.A01).BMP((View) this.A02);
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A03 != 0) {
            C05820Vc r2 = (C05820Vc) this.A01;
            r2.A00.A08(1.0f);
            AnonymousClass069.A03((View) this.A02, r2);
            return;
        }
        ((AnonymousClass0u4) this.A01).BMQ((View) this.A02);
    }

    public void onAnimationStart(Animator animator) {
        if (this.A03 != 0) {
            super.onAnimationStart(animator);
        } else {
            ((AnonymousClass0u4) this.A01).BMS((View) this.A02);
        }
    }
}
