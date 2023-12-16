package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.0iL  reason: invalid class name and case insensitive filesystem */
public class C10680iL implements Runnable {
    public final /* synthetic */ AnonymousClass03y A00;

    public C10680iL(AnonymousClass03y r1) {
        this.A00 = r1;
    }

    public void run() {
        C07890cz r3;
        AnonymousClass03y r1 = this.A00;
        Menu A0Y = r1.A0Y();
        if (A0Y instanceof C07890cz) {
            r3 = (C07890cz) A0Y;
            if (r3 != null) {
                r3.A08();
            }
        } else {
            r3 = null;
        }
        try {
            A0Y.clear();
            Window.Callback callback = r1.A00;
            if (!callback.onCreatePanelMenu(0, A0Y) || !callback.onPreparePanel(0, (View) null, A0Y)) {
                A0Y.clear();
            }
        } finally {
            if (r3 != null) {
                r3.A07();
            }
        }
    }
}
