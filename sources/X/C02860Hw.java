package X;

import android.content.Context;
import android.os.UserManager;

/* renamed from: X.0Hw  reason: invalid class name and case insensitive filesystem */
public class C02860Hw {
    public static boolean A00(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
