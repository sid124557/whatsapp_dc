package X;

import android.text.TextUtils;

/* renamed from: X.31T  reason: invalid class name */
public class AnonymousClass31T {
    public static boolean A00(int i) {
        return i == 1 || i == 4 || i == 2 || i == 3 || i == 8 || i == 9;
    }

    public static boolean A01(C30331mH r2) {
        if (r2 instanceof C30571mf) {
            return TextUtils.isEmpty(((C30571mf) r2).A01);
        }
        if (r2 instanceof C30551md) {
            if (((C30551md) r2).A01 == 0) {
                return true;
            }
            return false;
        } else if (r2 instanceof C30591mh) {
            return ((C30591mh) r2).A06.isEmpty();
        } else {
            return false;
        }
    }
}
