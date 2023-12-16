package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* renamed from: X.5fS  reason: invalid class name and case insensitive filesystem */
public class C109955fS implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass5RG A01;

    public C109955fS(AnonymousClass5RG r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public void onGlobalLayout() {
        AnonymousClass5RG r5 = this.A01;
        View view = r5.A03;
        C86624Kv.A16(view, this);
        float A02 = C86664Kz.A02(view);
        float f = this.A00;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f - (f / A02), 1, 0.0f);
        C86604Kt.A1I(translateAnimation, 300);
        view.startAnimation(translateAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.addAnimation(AnonymousClass4L0.A0C(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 0, (A02 - f) * 1.4f, 0, 0.0f));
        animationSet.setDuration(300);
        r5.A05.startAnimation(animationSet);
        r5.A04.startAnimation(animationSet);
    }
}
