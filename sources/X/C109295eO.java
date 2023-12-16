package X;

import android.view.View;

/* renamed from: X.5eO  reason: invalid class name and case insensitive filesystem */
public class C109295eO implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C91234j9 A01;

    public C109295eO(View view, C91234j9 r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public void onViewAttachedToWindow(View view) {
        C91234j9 r2 = this.A01;
        C105175Tw r0 = r2.A07;
        if (r0 == null || !r0.A0L) {
            C117695sL.A01(this.A00, this, 7);
            return;
        }
        r2.A0C.set(0, 0, 0, 0);
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(r2.A0H);
    }

    public void onViewDetachedFromWindow(View view) {
        C91234j9 r2 = this.A01;
        r2.A0F.setVisibility(8);
        this.A00.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A0H);
    }
}
