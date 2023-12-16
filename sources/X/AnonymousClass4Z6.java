package X;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: X.4Z6  reason: invalid class name */
public abstract class AnonymousClass4Z6 extends C05570Ua {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Z6(View view) {
        super(view);
        C162457s7.A0J(view, 1);
    }

    public void A07() {
        if (this instanceof C95374tX) {
            LottieAnimationView lottieAnimationView = ((C95374tX) this).A00;
            if (lottieAnimationView != null) {
                lottieAnimationView.A01();
                return;
            }
            throw C18270x1.A0S("animation");
        }
    }

    public void A08() {
    }

    public void A09() {
    }

    public boolean A0C() {
        return false;
    }

    public void A0A(boolean z) {
    }

    public void A0B(boolean z) {
    }
}
