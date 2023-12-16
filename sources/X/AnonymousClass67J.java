package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.67J  reason: invalid class name */
public class AnonymousClass67J extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass67J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A02 = obj3;
        this.A04 = obj2;
        this.A00 = obj4;
        this.A01 = obj5;
        this.A03 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        Object obj;
        switch (this.A05) {
            case 0:
                C162457s7.A0J(animator, 0);
                super.onAnimationEnd(animator);
                View view = (View) this.A00;
                AnonymousClass5YP.A00(view);
                View view2 = (View) this.A01;
                AnonymousClass5YP.A00(view2);
                View[] viewArr = new View[2];
                C18280x3.A19(view, view2, viewArr);
                AnonymousClass5YP.A01(AnonymousClass8UF.A0o(viewArr));
                view.clearAnimation();
                view2.clearAnimation();
                obj = this.A03;
                break;
            case 1:
                C162457s7.A0J(animator, 0);
                super.onAnimationEnd(animator);
                Object[] objArr = new View[3];
                objArr[0] = this.A03;
                objArr[1] = this.A00;
                AnonymousClass5YP.A01(AnonymousClass0x9.A19(this.A04, objArr, 2));
                View view3 = (View) this.A01;
                AnonymousClass5YP.A00(view3);
                view3.clearAnimation();
                obj = this.A02;
                break;
            case 2:
                C162457s7.A0J(animator, 0);
                super.onAnimationEnd(animator);
                ((View) this.A02).clearAnimation();
                return;
            case 3:
                C86634Kw.A1E(((View) this.A04).animate().alpha(1.0f), 100);
                C86634Kw.A1E(((View) this.A01).animate().alpha(1.0f), 100);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
        ((Animator) obj).start();
    }

    public void onAnimationStart(Animator animator) {
        int i;
        View view;
        switch (this.A05) {
            case 0:
                C162457s7.A0J(animator, 0);
                super.onAnimationStart(animator);
                C86634Kw.A1R(this.A02);
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.A04;
                if (transitionDrawable != null) {
                    transitionDrawable.startTransition(500);
                    return;
                }
                return;
            case 2:
                C162457s7.A0J(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A02).setAlpha(0.0f);
                ((View) this.A03).setVisibility(0);
                ((View) this.A01).setVisibility(0);
                i = 8;
                ((View) this.A04).setVisibility(8);
                view = (View) this.A00;
                break;
            case 3:
                ((AnonymousClass5RH) this.A00).A01.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.A03);
                View view2 = (View) this.A02;
                view2.setVisibility(8);
                view2.setAlpha(1.0f);
                View view3 = (View) this.A04;
                view3.setAlpha(0.0f);
                i = 0;
                view3.setVisibility(0);
                view = (View) this.A01;
                view.setAlpha(0.0f);
                break;
            default:
                super.onAnimationStart(animator);
                return;
        }
        view.setVisibility(i);
    }
}
