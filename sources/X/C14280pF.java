package X;

import android.animation.Animator;

/* renamed from: X.0pF  reason: invalid class name and case insensitive filesystem */
public final class C14280pF extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass004 this$0;

    public final void A00(Animator.AnimatorListener animatorListener) {
        C162457s7.A0J(animatorListener, 0);
        animatorListener.onAnimationCancel(this.this$0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14280pF(AnonymousClass004 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((Animator.AnimatorListener) obj);
        return C59022wD.A00;
    }
}
