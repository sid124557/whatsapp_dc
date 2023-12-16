package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.5c2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107875c2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C94024pj A04;
    public final /* synthetic */ boolean A05;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C94024pj r8 = this.A04;
        int i = this.A00;
        boolean z = this.A05;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int A032 = (int) (((float) i) * AnonymousClass001.A03(valueAnimator));
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(r8);
        A0T.height = A032;
        A0T.width = A032;
        int i5 = (i - A032) / 2;
        if (z) {
            A0T.setMargins((i2 - A032) - i5, i5, i3 + i5, A0T.bottomMargin);
        } else {
            A0T.setMargins(i4 + i5, i5, 0, A0T.bottomMargin);
        }
        r8.setLayoutParams(A0T);
    }

    public /* synthetic */ C107875c2(C94024pj r1, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = r1;
        this.A00 = i;
        this.A05 = z;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
