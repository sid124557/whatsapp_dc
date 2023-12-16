package X;

import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import java.lang.ref.WeakReference;

/* renamed from: X.0wa  reason: invalid class name and case insensitive filesystem */
public class C18000wa implements C16310so {
    public Object A00;
    public Object A01;
    public final int A02;

    public void BRN() {
        if (this.A02 != 0) {
            A01(this);
        } else {
            A00(this);
        }
    }

    public C18000wa(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(C18000wa r4) {
        C06040Vz r3 = (C06040Vz) r4.A00;
        Context A002 = r3.A08.A00();
        View view = (View) r4.A01;
        view.setVisibility(8);
        try {
            ViewManager viewManager = (ViewManager) A002.getSystemService("window");
            if (viewManager != null) {
                viewManager.removeView(view);
                WeakReference weakReference = C06110Wh.A00;
                if (weakReference.get() == view) {
                    weakReference.clear();
                }
                C16310so r0 = r3.A06;
                if (r0 != null) {
                    r0.BRN();
                    return;
                }
                return;
            }
            throw AnonymousClass001.A0e("Window manager required but not found.");
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final void A01(C18000wa r2) {
        A03((C131266dJ) r2.A01, (C835248t) r2.A00);
    }

    public static /* synthetic */ void A03(C131266dJ r1, C835248t r2) {
        if (r2 != null) {
            C157157hp.A00(r1, C157967jD.A01, r2);
        }
    }
}
