package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5bn  reason: invalid class name and case insensitive filesystem */
public class C107725bn implements LayoutTransition.TransitionListener {
    public final /* synthetic */ LayoutTransition A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;

    public C107725bn(LayoutTransition layoutTransition, View view, ViewGroup viewGroup) {
        this.A01 = view;
        this.A00 = layoutTransition;
        this.A02 = viewGroup;
    }

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        if (view == this.A01) {
            this.A00.removeTransitionListener(this);
            ViewGroup viewGroup2 = this.A02;
            viewGroup2.postDelayed(new C71263bp((Object) viewGroup2, 8), 100);
        }
    }

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }
}
