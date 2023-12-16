package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.8zo  reason: invalid class name and case insensitive filesystem */
public class C188988zo extends C167047zg {
    public Object A00;
    public Object A01;
    public final int A02;

    public C188988zo(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        View view;
        int i;
        switch (this.A02) {
            case 0:
                Animation animation2 = (Animation) this.A00;
                animation2.setStartOffset(1500);
                ((View) this.A01).startAnimation(animation2);
                return;
            case 2:
                view = (View) this.A01;
                i = 4;
                break;
            case 3:
                view = (View) this.A01;
                i = 8;
                break;
            case 4:
                AnonymousClass7T7 r1 = (AnonymousClass7T7) this.A00;
                r1.A00(C86664Kz.A02(r1.A01));
                ((C167047zg) this.A01).onAnimationEnd(animation);
                return;
            default:
                super.onAnimationEnd(animation);
                return;
        }
        view.setVisibility(i);
    }

    public void onAnimationStart(Animation animation) {
        switch (this.A02) {
            case 1:
                ((View) this.A01).setVisibility(0);
                return;
            case 4:
                ((C167047zg) this.A01).onAnimationStart(animation);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
    }
}
