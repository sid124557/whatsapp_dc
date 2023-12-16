package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: X.4H5  reason: invalid class name */
public class AnonymousClass4H5 extends C167047zg {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4H5(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        Runnable runnable;
        switch (this.A02) {
            case 0:
                View view = (View) this.A01;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = -2;
                view.setLayoutParams(layoutParams);
                view.setVisibility(8);
                return;
            case 1:
                AnonymousClass4ZC r1 = (AnonymousClass4ZC) this.A00;
                r1.clearAnimation();
                r1.setVisibility(8);
                r1.A0E = false;
                r1.setEnabled(true);
                C18310x6.A15(r1);
                runnable = (Runnable) this.A01;
                break;
            case 2:
                C18270x1.A0p(((C54172oI) this.A01).A0G);
                runnable = (Runnable) this.A00;
                if (runnable == null) {
                    return;
                }
                break;
            default:
                ImageView imageView = (ImageView) this.A01;
                imageView.setImageBitmap((Bitmap) this.A00);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                imageView.startAnimation(alphaAnimation);
                return;
        }
        runnable.run();
    }

    public void onAnimationStart(Animation animation) {
        if (1 - this.A02 != 0) {
            super.onAnimationStart(animation);
        } else {
            ((View) this.A00).setEnabled(false);
        }
    }
}
