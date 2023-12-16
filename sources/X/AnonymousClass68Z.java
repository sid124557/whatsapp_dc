package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/* renamed from: X.68Z  reason: invalid class name */
public class AnonymousClass68Z implements Animator.AnimatorListener {
    public Object A00;
    public final int A01;

    public AnonymousClass68Z(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        View view;
        int i;
        switch (this.A01) {
            case 0:
                AnonymousClass5KV r4 = (AnonymousClass5KV) this.A00;
                View view2 = r4.A02;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i = C06060Wb.A02((ViewGroup.MarginLayoutParams) layoutParams);
                } else {
                    i = 0;
                }
                C107555bV.A03(view2, i, 0);
                Animator animator2 = r4.A01;
                r4.A00 = animator2;
                r4.A01 = null;
                if (animator2 != null) {
                    animator2.start();
                    return;
                }
                return;
            case 1:
                view = ((AnonymousClass5J8) this.A00).A01;
                break;
            case 2:
                view = ((AnonymousClass5J9) this.A00).A03;
                break;
            default:
                C94264qq r0 = (C94264qq) this.A00;
                r0.A0G();
                ImageButton imageButton = r0.A0I;
                if (imageButton != null) {
                    imageButton.setAlpha(1.0f);
                    return;
                }
                return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = -2;
        view.setLayoutParams(layoutParams2);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
