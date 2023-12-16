package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7sK  reason: invalid class name and case insensitive filesystem */
public class C162527sK implements LayoutTransition.TransitionListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C89154bn A01;

    public C162527sK(ViewGroup viewGroup, C89154bn r2) {
        this.A01 = r2;
        this.A00 = viewGroup;
    }

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.setLayoutTransition((LayoutTransition) null);
    }

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }
}
