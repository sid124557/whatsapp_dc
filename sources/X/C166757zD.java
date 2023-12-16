package X;

import android.view.View;

/* renamed from: X.7zD  reason: invalid class name and case insensitive filesystem */
public class C166757zD implements View.OnAttachStateChangeListener {
    public void onViewDetachedFromWindow(View view) {
    }

    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        AnonymousClass0V0.A02(view);
    }
}
