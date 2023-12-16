package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.12t  reason: invalid class name and case insensitive filesystem */
public final class C198112t extends AnonymousClass0P5 {
    public final /* synthetic */ C52762m0 A00;

    public C198112t(C52762m0 r1) {
        this.A00 = r1;
    }

    public void A02(Drawable drawable) {
        View view;
        C52762m0 r1 = this.A00;
        AnonymousClass0AR r0 = r1.A00;
        if (r0 != null) {
            r0.start();
        }
        WeakReference weakReference = r1.A02;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.invalidate();
        }
    }
}
