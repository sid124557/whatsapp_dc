package X;

import android.transition.Transition;

/* renamed from: X.0Zv  reason: invalid class name */
public class AnonymousClass0Zv implements Transition.TransitionListener {
    public final /* synthetic */ C010007y A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass0Zv(C010007y r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public void onTransitionEnd(Transition transition) {
        this.A01.run();
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
