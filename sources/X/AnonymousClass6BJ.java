package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.6BJ  reason: invalid class name */
public class AnonymousClass6BJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass6BJ(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onGlobalLayout() {
        if (this.A03 != 0) {
            ImageView imageView = (ImageView) this.A02;
            C86624Kv.A16(imageView, this);
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
            int[] iArr = new int[2];
            View view = (View) this.A01;
            view.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            ((C113245l7) this.A00).A2f.getLocationOnScreen(iArr2);
            int i = iArr[0] - iArr2[0];
            int i2 = iArr[1] - iArr2[1];
            int width = i - ((intrinsicWidth - view.getWidth()) / 2);
            imageView.setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            float f = (float) width;
            float A0D = (float) (i2 - (C86664Kz.A0D(view, intrinsicHeight) / 2));
            TranslateAnimation translateAnimation = new TranslateAnimation(f, f, A0D, A0D - (((float) intrinsicHeight) * 2.0f));
            float intrinsicWidth2 = (((float) ((ImageView) view).getDrawable().getIntrinsicWidth()) * 1.0f) / ((float) intrinsicWidth);
            ScaleAnimation scaleAnimation = new ScaleAnimation(intrinsicWidth2, 1.0f, intrinsicWidth2, 1.0f, 1, 0.5f, 1, 0.5f);
            animationSet.addAnimation(AnonymousClass4L0.A0C(0.5f, 0.0f));
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(2000);
            animationSet.setInterpolator(new DecelerateInterpolator(2.0f));
            C1232467r.A00(animationSet, this, 6);
            imageView.startAnimation(animationSet);
            return;
        }
        View view2 = (View) this.A01;
        int height = view2.getHeight();
        if (height > 0) {
            C86604Kt.A1G(view2, this);
            AnonymousClass5PD r2 = (AnonymousClass5PD) this.A00;
            WaImageView waImageView = r2.A08;
            ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
            layoutParams.width = height;
            layoutParams.height = height;
            waImageView.setLayoutParams(layoutParams);
            C06270Wx.A03(r2.A0G, ((View) this.A02).getHeight());
        }
    }
}
