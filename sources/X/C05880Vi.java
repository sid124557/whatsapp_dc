package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;

/* renamed from: X.0Vi  reason: invalid class name and case insensitive filesystem */
public class C05880Vi {
    public static C05880Vi A00() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C004705b(AnonymousClass0HC.A00());
        }
        return new C05880Vi();
    }

    public static C05880Vi A01(Activity activity, AnonymousClass0PJ... r6) {
        Pair[] pairArr;
        if (r6 != null) {
            int length = r6.length;
            pairArr = new Pair[length];
            for (int i = 0; i < length; i++) {
                AnonymousClass0PJ r0 = r6[i];
                pairArr[i] = Pair.create(r0.A00, r0.A01);
            }
        } else {
            pairArr = null;
        }
        return new C004705b(AnonymousClass0RF.A01(activity, pairArr));
    }

    public Bundle A02() {
        return null;
    }
}
