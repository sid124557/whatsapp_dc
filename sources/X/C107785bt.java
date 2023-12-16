package X;

import android.animation.ValueAnimator;
import android.text.Spannable;

/* renamed from: X.5bt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107785bt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Spannable A01;
    public final /* synthetic */ AnonymousClass5O7 A02;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass5O7 r3 = this.A02;
        Spannable spannable = this.A01;
        int i = this.A00;
        C162457s7.A0J(valueAnimator, 3);
        r3.A00(spannable, i, C86614Ku.A02(valueAnimator));
    }

    public /* synthetic */ C107785bt(Spannable spannable, AnonymousClass5O7 r2, int i) {
        this.A02 = r2;
        this.A01 = spannable;
        this.A00 = i;
    }
}
