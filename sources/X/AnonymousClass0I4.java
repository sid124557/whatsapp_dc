package X;

import android.os.Build;
import android.view.Menu;

/* renamed from: X.0I4  reason: invalid class name */
public final class AnonymousClass0I4 {
    public static void A00(Menu menu) {
        if (menu instanceof C17220vA) {
            ((C17220vA) menu).setGroupDividerEnabled(true);
        } else if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass0I3.A00(menu, true);
        }
    }
}
