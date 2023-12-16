package X;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.0Go  reason: invalid class name and case insensitive filesystem */
public class C02520Go {
    public static int A00(Context context) {
        Configuration A0M = AnonymousClass001.A0M(context);
        int i = A0M.screenWidthDp;
        int i2 = A0M.screenHeightDp;
        if (A0M.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i < 500) {
            if (i > 480) {
                if (i2 > 640) {
                    return 4;
                }
                return 3;
            } else if (i >= 360) {
                return 3;
            } else {
                return 2;
            }
        }
        return 4;
    }
}
