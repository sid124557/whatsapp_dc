package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.whatsapp.RollingCounterView;

/* renamed from: X.5c0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107855c0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ RollingCounterView A05;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RollingCounterView rollingCounterView = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A04;
        float A032 = AnonymousClass001.A03(valueAnimator);
        int i6 = ((int) (((float) i) * A032)) + i2;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(rollingCounterView);
        A0T.width = i6;
        A0T.height = i3;
        A0T.leftMargin = AnonymousClass001.A07((float) (rollingCounterView.A01 - i4), A032) + i4;
        A0T.rightMargin = AnonymousClass001.A07(A032, (float) (rollingCounterView.A02 - i5)) + i5;
        rollingCounterView.A0C.set(0, 0, i6, i3);
        rollingCounterView.setLayoutParams(A0T);
    }

    public /* synthetic */ C107855c0(RollingCounterView rollingCounterView, int i, int i2, int i3, int i4, int i5) {
        this.A05 = rollingCounterView;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
    }
}
