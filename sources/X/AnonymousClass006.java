package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.006  reason: invalid class name */
public class AnonymousClass006 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C009407h A02;
    public final /* synthetic */ C010107z A03;
    public final /* synthetic */ AnonymousClass0QW A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass006(View view, ViewGroup viewGroup, C009407h r3, C010107z r4, AnonymousClass0QW r5, boolean z) {
        this.A03 = r4;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A05 = z;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.A01;
        View view = this.A00;
        viewGroup.endViewTransition(view);
        if (this.A05) {
            this.A04.A01.A02(view);
        }
        this.A02.A00();
        if (C08270df.A04()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Animator from operation ");
            A0o.append(this.A04);
            AnonymousClass000.A1I(A0o, " has ended.");
        }
    }
}
