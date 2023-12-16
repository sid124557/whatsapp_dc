package X;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: X.0TU  reason: invalid class name */
public final class AnonymousClass0TU {
    public final PointerIcon A00;

    public static AnonymousClass0TU A00(Context context) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            pointerIcon = AnonymousClass0I6.A00(context, 1002);
        } else {
            pointerIcon = null;
        }
        return new AnonymousClass0TU(pointerIcon);
    }

    public Object A01() {
        return this.A00;
    }

    public AnonymousClass0TU(PointerIcon pointerIcon) {
        this.A00 = pointerIcon;
    }
}
