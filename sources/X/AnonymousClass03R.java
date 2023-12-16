package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.03R  reason: invalid class name */
public class AnonymousClass03R extends ImageView {
    public ObjectAnimator A00;
    public boolean A01;

    public void onDetachedFromWindow() {
        this.A01 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
    }

    public AnonymousClass03R(Context context) {
        super(context);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f}).setDuration(850);
        this.A00 = duration;
        duration.setRepeatMode(1);
        this.A00.setRepeatCount(-1);
        this.A00.setInterpolator(new LinearInterpolator());
        setImageDrawable(AnonymousClass0RP.A00(context, R.drawable.spinner_large));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            this.A00.start();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01) {
            this.A00.start();
            this.A01 = false;
        }
    }

    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i != 0 || getVisibility() != 0) {
                this.A00.cancel();
                z = false;
            } else if (getAnimation() != null) {
                return;
            } else {
                if (getMeasuredWidth() != 0) {
                    this.A00.start();
                    return;
                }
                z = true;
            }
            this.A01 = z;
        }
    }
}
