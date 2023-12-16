package X;

import android.graphics.Rect;

/* renamed from: X.9LL  reason: invalid class name */
public class AnonymousClass9LL {
    public static void A00(Rect rect, Rect rect2, int i, int i2) {
        if (!(i2 == 0 || i2 == 180)) {
            rect.set(0, 0, rect.height(), rect.width());
        }
        if (i == 90 || i == 270) {
            rect2.set(0, 0, rect2.height(), rect2.width());
        }
    }
}
