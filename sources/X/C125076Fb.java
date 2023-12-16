package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.6Fb  reason: invalid class name and case insensitive filesystem */
public class C125076Fb extends ImageView {
    public Animatable A00;
    public boolean A01;

    public void A00() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.start();
        }
        this.A01 = true;
    }

    public void A01() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.stop();
        }
        this.A01 = false;
    }

    public void A02(Drawable drawable) {
        Animatable animatable = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        }
        this.A00 = animatable;
        setImageDrawable(drawable);
    }

    public void onAttachedToWindow() {
        Animatable animatable;
        super.onAttachedToWindow();
        if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            this.A00.start();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animatable animatable = this.A00;
        if (animatable != null && animatable.isRunning()) {
            this.A00.stop();
        }
    }

    public void setVisibility(int i) {
        Animatable animatable;
        super.setVisibility(i);
        if (getVisibility() != 0) {
            Animatable animatable2 = this.A00;
            if (animatable2 != null && animatable2.isRunning()) {
                this.A00.stop();
            }
        } else if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            this.A00.start();
        }
    }

    public C125076Fb(Context context) {
        super(context);
    }
}
