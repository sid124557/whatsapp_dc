package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.calling.callgrid.view.PipViewContainer;

/* renamed from: X.5c1  reason: invalid class name and case insensitive filesystem */
public class C107865c1 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ PipViewContainer A05;

    public C107865c1(View view, PipViewContainer pipViewContainer, int i, int i2) {
        this.A05 = pipViewContainer;
        this.A04 = view;
        this.A02 = i;
        this.A03 = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        PipViewContainer pipViewContainer = this.A05;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(pipViewContainer);
        C620733j r6 = pipViewContainer.A07;
        C626936e.A06(r6);
        if (animatedFraction == 0.0f) {
            this.A01 = A0T.topMargin;
            if (C620733j.A04(r6)) {
                i2 = A0T.leftMargin;
            } else {
                i2 = A0T.rightMargin;
            }
            this.A00 = i2;
            pipViewContainer.getWidth();
            pipViewContainer.getHeight();
        }
        View view = this.A04;
        int i3 = ((int) (((float) this.A02) * animatedFraction)) + this.A00;
        int i4 = A0T.topMargin;
        if (C620733j.A04(r6)) {
            i = A0T.rightMargin;
        } else {
            i = A0T.leftMargin;
        }
        C107555bV.A06(view, r6, i3, i4, i, A0T.bottomMargin);
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(pipViewContainer);
        A0T2.topMargin = this.A01 + ((int) (((float) this.A03) * animatedFraction));
        pipViewContainer.setLayoutParams(A0T2);
    }
}
