package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.HomeActivity;

/* renamed from: X.5bw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107815bw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FrameLayout.LayoutParams A00;
    public final /* synthetic */ LinearLayout.LayoutParams A01;
    public final /* synthetic */ HomeActivity A02;
    public final /* synthetic */ boolean A03;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HomeActivity homeActivity = this.A02;
        boolean z = this.A03;
        FrameLayout.LayoutParams layoutParams = this.A00;
        LinearLayout.LayoutParams layoutParams2 = this.A01;
        int A012 = C86604Kt.A01(valueAnimator);
        if (z) {
            layoutParams.height = A012;
        } else {
            layoutParams2.height = A012;
        }
        homeActivity.A0K.setLayoutParams(layoutParams2);
        homeActivity.A0F.setLayoutParams(layoutParams);
    }

    public /* synthetic */ C107815bw(FrameLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, HomeActivity homeActivity, boolean z) {
        this.A02 = homeActivity;
        this.A03 = z;
        this.A00 = layoutParams;
        this.A01 = layoutParams2;
    }
}
