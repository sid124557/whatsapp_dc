package X;

import android.animation.Animator;

/* renamed from: X.0pE  reason: invalid class name and case insensitive filesystem */
public final class C14270pE extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass003 this$0;

    public final void A00(Animator.AnimatorListener animatorListener) {
        C162457s7.A0J(animatorListener, 0);
        animatorListener.onAnimationEnd(this.this$0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14270pE(AnonymousClass003 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((Animator.AnimatorListener) obj);
        return C59022wD.A00;
    }
}
