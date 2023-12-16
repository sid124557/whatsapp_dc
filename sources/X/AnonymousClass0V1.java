package X;

import android.view.PointerIcon;
import android.view.View;

/* renamed from: X.0V1  reason: invalid class name */
public class AnonymousClass0V1 {
    public static void A00(PointerIcon pointerIcon, View view) {
        view.setPointerIcon(pointerIcon);
    }

    public static void A01(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    public static void A02(View view) {
        view.dispatchStartTemporaryDetach();
    }
}
