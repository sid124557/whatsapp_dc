package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0wt  reason: invalid class name and case insensitive filesystem */
public class C18190wt implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C18190wt(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(C18190wt r4) {
        View view = (View) r4.A00;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        C03830Ls r2 = (C03830Ls) r4.A01;
        viewTreeObserver.removeOnGlobalLayoutListener(r2.A01);
        AnonymousClass04T A012 = ((AnonymousClass0D5) r4.A02).A01;
        if (A012 == null) {
            C162457s7.A0M("parametricSlider");
            throw AnonymousClass000.A0L();
        } else {
            A012.A02(r2, view.getHeight());
        }
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive;
        boolean isAlive2;
        if (this.A03 != 0) {
            try {
                ((Runnable) this.A00).run();
                if ((!isAlive && viewTreeObserver == null) || !isAlive2) {
                    throw AnonymousClass001.A0c("Given null or dead view tree observer.");
                }
            } finally {
                viewTreeObserver = (ViewTreeObserver) this.A01;
                if ((viewTreeObserver.isAlive() || (viewTreeObserver = ((View) this.A02).getViewTreeObserver()) != null) && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    throw th;
                } else {
                    IllegalArgumentException A0c = AnonymousClass001.A0c("Given null or dead view tree observer.");
                }
            }
        } else {
            A00(this);
        }
    }
}
