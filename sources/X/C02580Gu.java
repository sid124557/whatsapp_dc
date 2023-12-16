package X;

import android.os.Build;

/* renamed from: X.0Gu  reason: invalid class name and case insensitive filesystem */
public class C02580Gu {
    public static boolean A00(int i) {
        if (!(i == 15 || i == 255)) {
            if (i != 32768) {
                if (i == 32783) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 28 || i2 > 29) {
                        return true;
                    }
                    return false;
                } else if (i == 33023 || i == 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 30) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
