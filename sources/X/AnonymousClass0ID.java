package X;

import android.os.Build;
import android.view.Window;

/* renamed from: X.0ID  reason: invalid class name */
public final class AnonymousClass0ID {
    public static void A00(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass0IC.A00(window, z);
        } else {
            AnonymousClass0IB.A00(window, z);
        }
    }
}
