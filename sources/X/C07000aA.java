package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0aA  reason: invalid class name and case insensitive filesystem */
public final class C07000aA implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final Runnable A02;

    public static void A00(View view, Runnable runnable) {
        if (view != null) {
            C07000aA r1 = new C07000aA(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(r1);
            view.addOnAttachStateChangeListener(r1);
            return;
        }
        throw AnonymousClass001.A0g("view == null");
    }

    public boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        if (this.A00.isAlive()) {
            viewTreeObserver = this.A00;
        } else {
            viewTreeObserver = this.A01.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.A01.removeOnAttachStateChangeListener(this);
        this.A02.run();
        return true;
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.A00.isAlive()) {
            viewTreeObserver = this.A00;
        } else {
            viewTreeObserver = this.A01.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.A01.removeOnAttachStateChangeListener(this);
    }

    public C07000aA(View view, Runnable runnable) {
        this.A01 = view;
        this.A00 = view.getViewTreeObserver();
        this.A02 = runnable;
    }

    public void onViewAttachedToWindow(View view) {
        this.A00 = view.getViewTreeObserver();
    }
}
