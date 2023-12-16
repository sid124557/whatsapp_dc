package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* renamed from: X.0xB  reason: invalid class name and case insensitive filesystem */
public final class C18340xB extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C93314oJ A01;

    public C18340xB(C93314oJ r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationStart(Animator animator) {
        C93314oJ r2 = this.A01;
        int i = this.A00;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            r2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
