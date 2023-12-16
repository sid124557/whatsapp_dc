package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.0KN  reason: invalid class name */
public final class AnonymousClass0KN {
    public final AnonymousClass0QN A00;

    public AnonymousClass0KN(View view, Window window) {
        AnonymousClass0QN r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass06L(window, this);
        } else if (i >= 26) {
            r0 = new AnonymousClass06I(view, window);
        } else if (i >= 23) {
            r0 = new AnonymousClass06J(view, window);
        } else {
            r0 = new AnonymousClass06K(view, window);
        }
        this.A00 = r0;
    }
}
