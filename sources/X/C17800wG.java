package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0wG  reason: invalid class name and case insensitive filesystem */
public class C17800wG implements View.OnAttachStateChangeListener {
    public Object A00;
    public final int A01;

    public C17800wG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass04M r2 = (AnonymousClass04M) obj;
            ViewTreeObserver viewTreeObserver2 = r2.A04;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    r2.A04 = view.getViewTreeObserver();
                }
                viewTreeObserver = r2.A04;
                onGlobalLayoutListener = r2.A0F;
            }
            view.removeOnAttachStateChangeListener(this);
        }
        AnonymousClass04L r22 = (AnonymousClass04L) obj;
        ViewTreeObserver viewTreeObserver3 = r22.A07;
        if (viewTreeObserver3 != null) {
            if (!viewTreeObserver3.isAlive()) {
                r22.A07 = view.getViewTreeObserver();
            }
            viewTreeObserver = r22.A07;
            onGlobalLayoutListener = r22.A0L;
        }
        view.removeOnAttachStateChangeListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        view.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
    }
}
