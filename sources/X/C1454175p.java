package X;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* renamed from: X.75p  reason: invalid class name and case insensitive filesystem */
public class C1454175p {
    public static Context A00(Context context, String str) {
        Locale A0k = AnonymousClass6C8.A0k(str);
        Locale.setDefault(A0k);
        Configuration A0M = AnonymousClass001.A0M(context);
        A0M.setLocale(A0k);
        A0M.setLayoutDirection(A0k);
        return context.createConfigurationContext(A0M);
    }
}
