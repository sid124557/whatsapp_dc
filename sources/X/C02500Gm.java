package X;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: X.0Gm  reason: invalid class name and case insensitive filesystem */
public class C02500Gm {
    public static void A00(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }
}
