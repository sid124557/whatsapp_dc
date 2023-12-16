package com.whatsapp.ptv;

import X.AnonymousClass001;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;

public final class SelfieCameraPlaceholder extends FrameLayout {
    public final AnimatorSet A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SelfieCameraPlaceholder(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }

    public final void A00() {
        if (getVisibility() == 0) {
            AnimatorSet animatorSet = this.A00;
            if (!animatorSet.isStarted()) {
                animatorSet.start();
                return;
            }
        }
        if (getVisibility() != 0) {
            AnimatorSet animatorSet2 = this.A00;
            if (animatorSet2.isRunning()) {
                animatorSet2.pause();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.end();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelfieCameraPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.selfie_camera_placeholder);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        C86644Kx.A1A(imageView);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.selfie_camera_placeholder);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        C86644Kx.A1A(imageView2);
        addView(imageView2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{1.0f, 1.5f});
        ofFloat.setDuration(1200);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 5.0f, 0.0f, -4.0f, 0.0f});
        ofFloat2.setDuration(1100);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        C86644Kx.A0j(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, "scaleY", new float[]{1.0f, 1.5f});
        ofFloat3.setDuration(1400);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setRepeatMode(2);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "alpha", new float[]{0.0f, 0.5f});
        ofFloat4.setDuration(1700);
        ofFloat4.setRepeatCount(-1);
        ofFloat4.setRepeatMode(2);
        AnimatorSet A0O = C86664Kz.A0O();
        Animator[] animatorArr = new Animator[4];
        AnonymousClass001.A1I(ofFloat, ofFloat2, animatorArr);
        animatorArr[2] = ofFloat3;
        animatorArr[3] = ofFloat4;
        A0O.playTogether(animatorArr);
        this.A00 = A0O;
        A00();
    }

    public /* synthetic */ SelfieCameraPlaceholder(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
