package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7f0  reason: invalid class name and case insensitive filesystem */
public class C155497f0 {
    public static Long A00 = AnonymousClass0x2.A0T();
    public static Locale A01;
    public static final Map A02 = AnonymousClass001.A0t();

    static {
        Locale locale;
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int i = 0;
            while (true) {
                if (i == availableLocales.length) {
                    break;
                } else if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                    break;
                } else {
                    i++;
                }
            }
            A01 = locale;
        }
        locale = Locale.getDefault();
        A01 = locale;
    }

    public static Date A00(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = A02;
        synchronized (map) {
            Long l = (Long) map.get(locale);
            if (l == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                if (time == 0) {
                    l = A00;
                } else {
                    l = Long.valueOf(time);
                }
                map.put(locale, l);
            }
            if (l == A00) {
                return date;
            }
            Date date2 = new Date(date.getTime() - l.longValue());
            return date2;
        }
    }
}
