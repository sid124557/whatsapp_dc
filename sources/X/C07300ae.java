package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.0ae  reason: invalid class name and case insensitive filesystem */
public class C07300ae implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C009407h A02;
    public final /* synthetic */ C010107z A03;
    public final /* synthetic */ AnonymousClass0QW A04;

    public C07300ae(View view, ViewGroup viewGroup, C009407h r3, C010107z r4, AnonymousClass0QW r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A02 = r3;
    }

    public void onAnimationEnd(Animation animation) {
        this.A01.post(new C10940iq(this));
        if (C08270df.A04()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Animation from operation ");
            A0o.append(this.A04);
            AnonymousClass000.A1I(A0o, " has ended.");
        }
    }

    public void onAnimationStart(Animation animation) {
        if (C08270df.A04()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Animation from operation ");
            A0o.append(this.A04);
            AnonymousClass000.A1I(A0o, " has reached onAnimationStart.");
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
