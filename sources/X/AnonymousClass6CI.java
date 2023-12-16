package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* renamed from: X.6CI  reason: invalid class name */
public class AnonymousClass6CI extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FabTransformationBehavior A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass6CI(View view, View view2, FabTransformationBehavior fabTransformationBehavior, boolean z) {
        this.A02 = fabTransformationBehavior;
        this.A03 = z;
        this.A00 = view;
        this.A01 = view2;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A03) {
            this.A00.setVisibility(4);
            View view = this.A01;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A03) {
            this.A00.setVisibility(0);
            View view = this.A01;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
