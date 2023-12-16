package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.5bu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107795bu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BitmapDrawable A00;
    public final /* synthetic */ BitmapDrawable A01;
    public final /* synthetic */ C105795Wl A02;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C105795Wl r5 = this.A02;
        BitmapDrawable bitmapDrawable = this.A00;
        BitmapDrawable bitmapDrawable2 = this.A01;
        C162457s7.A0J(valueAnimator, 3);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C162457s7.A0K(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r5.A07.BkM(new C117255rd(bitmapDrawable, bitmapDrawable2, r5, AnonymousClass001.A05(animatedValue)));
    }

    public /* synthetic */ C107795bu(BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, C105795Wl r3) {
        this.A02 = r3;
        this.A00 = bitmapDrawable;
        this.A01 = bitmapDrawable2;
    }
}
