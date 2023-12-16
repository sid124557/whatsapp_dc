package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.5fT  reason: invalid class name and case insensitive filesystem */
public class C109965fT implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final C69263Wi A01;
    public final WeakReference A02;
    public final WeakReference A03;

    public void onGlobalLayout() {
        int width;
        View A0j = C86664Kz.A0j(this.A02);
        if (A0j != null && (width = A0j.getWidth()) != 0 && width != this.A00) {
            this.A00 = width;
            Runnable runnable = (Runnable) this.A03.get();
            if (runnable != null) {
                C69263Wi r0 = this.A01;
                r0.A0R(runnable);
                r0.A0S(runnable);
            }
        }
    }

    public C109965fT(View view, C69263Wi r3, Runnable runnable) {
        this.A02 = AnonymousClass0x9.A14(view);
        this.A01 = r3;
        this.A03 = AnonymousClass0x9.A14(runnable);
    }
}
