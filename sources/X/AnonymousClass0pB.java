package X;

import android.animation.Animator;

/* renamed from: X.0pB  reason: invalid class name */
public final class AnonymousClass0pB extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass003 this$0;

    public final void A00(Animator.AnimatorListener animatorListener) {
        C162457s7.A0J(animatorListener, 0);
        animatorListener.onAnimationEnd(this.this$0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0pB(AnonymousClass003 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((Animator.AnimatorListener) obj);
        return C59022wD.A00;
    }
}
