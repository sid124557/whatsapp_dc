package X;

import android.animation.ValueAnimator;
import com.whatsapp.WaTextView;
import com.whatsapp.components.AutoScrollView;

/* renamed from: X.7sR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C162597sR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AutoScrollView A04;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A01;
        int i2 = this.A02;
        AutoScrollView autoScrollView = this.A04;
        float f = this.A00;
        int i3 = this.A03;
        C162457s7.A0J(valueAnimator, 5);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C162457s7.A0K(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float A05 = ((float) i) * AnonymousClass001.A05(animatedValue) * ((float) i2);
        WaTextView waTextView = autoScrollView.A0A;
        waTextView.setTranslationX(f + A05);
        autoScrollView.A0B.setTranslationX(waTextView.getTranslationX() + ((float) (i * i3)));
    }

    public /* synthetic */ C162597sR(AutoScrollView autoScrollView, float f, int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A04 = autoScrollView;
        this.A00 = f;
        this.A03 = i3;
    }
}
