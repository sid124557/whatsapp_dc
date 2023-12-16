package X;

import com.airbnb.lottie.LottieAnimationView;

/* renamed from: X.0wv  reason: invalid class name and case insensitive filesystem */
public class C18210wv implements C16200sd {
    public Object A00;
    public final int A01;

    public C18210wv(LottieAnimationView lottieAnimationView, int i) {
        this.A01 = i;
        this.A00 = lottieAnimationView;
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        if (this.A01 != 0) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A00;
            int i = lottieAnimationView.A02;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            C16200sd r0 = lottieAnimationView.A04;
            if (r0 == null) {
                r0 = LottieAnimationView.A0J;
            }
            r0.onResult(obj);
            return;
        }
        ((LottieAnimationView) this.A00).setComposition((AnonymousClass0QL) obj);
    }
}
