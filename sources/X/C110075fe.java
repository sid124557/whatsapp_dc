package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.5fe  reason: invalid class name and case insensitive filesystem */
public class C110075fe implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakReference A00;
    public final WeakReference A01;

    public void A00() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            C86664Kz.A0j(weakReference).removeOnAttachStateChangeListener(this);
            View A0j = C86664Kz.A0j(weakReference);
            if (A0j != null) {
                C86604Kt.A1G(A0j, this);
            }
        }
        weakReference.clear();
        this.A01.clear();
    }

    public void onGlobalLayout() {
        WeakReference weakReference = this.A01;
        if (weakReference.get() == null) {
            A00();
        } else {
            weakReference.get();
        }
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A01.get() == null) {
            A00();
        } else if (view != null) {
            C86644Kx.A12(view, this);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.A01.get() == null) {
            A00();
        } else if (view != null) {
            C86604Kt.A1G(view, this);
        }
    }

    public C110075fe(View view, C159097l7 r3) {
        this.A01 = AnonymousClass0x9.A14(r3);
        this.A00 = AnonymousClass0x9.A14(view);
    }
}
