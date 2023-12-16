package X;

import android.view.animation.Animation;

/* renamed from: X.4ar  reason: invalid class name and case insensitive filesystem */
public class C88824ar extends C167047zg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5RH A01;
    public final /* synthetic */ AnonymousClass4ZC A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    public C88824ar(AnonymousClass5RH r1, AnonymousClass4ZC r2, Runnable runnable, Runnable runnable2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = runnable;
        this.A00 = i;
        this.A03 = runnable2;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass5RH r2 = this.A01;
        r2.A01.setVisibility(8);
        r2.A01.getLayoutParams().height = this.A00;
        this.A03.run();
        this.A02.setEnabled(true);
        r2.A0C = false;
    }

    public void onAnimationStart(Animation animation) {
        this.A02.setEnabled(false);
        this.A04.run();
    }
}
