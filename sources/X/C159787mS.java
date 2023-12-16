package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.7mS  reason: invalid class name and case insensitive filesystem */
public class C159787mS {
    public static volatile int A00 = -1;

    public static int A00(Context context) {
        int i;
        if (A00 == 0) {
            return A00;
        }
        try {
            i = AnonymousClass6Q8.A00.A04(context, 12451000);
        } catch (RuntimeException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "google-utils/checkGooglePlayServicesStatus/unexpected exception/", e);
            i = 8;
        }
        A00 = i;
        return i;
    }

    public static boolean A01(Context context) {
        return AnonymousClass000.A1T(A00(context));
    }

    public static Account[] A02(Context context) {
        try {
            return AccountManager.get(context).getAccountsByType("com.google");
        } catch (Exception e) {
            Log.e("gdrive-activity/get-google-accounts", e);
            return new Account[0];
        }
    }
}
