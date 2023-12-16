package X;

import android.view.View;

/* renamed from: X.0D8  reason: invalid class name */
public final class AnonymousClass0D8 extends AnonymousClass5PK implements View.OnAttachStateChangeListener {
    public final View A00;

    public AnonymousClass0D8(View view) {
        this.A00 = view;
        view.addOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
        A00();
    }

    public void onViewDetachedFromWindow(View view) {
        A01();
    }
}
