package X;

import android.view.animation.Animation;

/* renamed from: X.4ap  reason: invalid class name and case insensitive filesystem */
public class C88804ap extends C167047zg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6AM A01;

    public C88804ap(AnonymousClass6AM r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass5RH r2 = (AnonymousClass5RH) this.A01.A01;
        r2.A02.setTranscriptMode(this.A00);
        r2.A0C = false;
    }

    public void onAnimationStart(Animation animation) {
        ((AnonymousClass5RH) this.A01.A01).A02.setTranscriptMode(2);
    }
}
