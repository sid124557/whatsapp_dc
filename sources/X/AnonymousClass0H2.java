package X;

import android.os.LocaleList;

/* renamed from: X.0H2  reason: invalid class name */
public class AnonymousClass0H2 {
    public static String A00() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
