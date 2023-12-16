package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.0WZ  reason: invalid class name */
public class AnonymousClass0WZ {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    @Deprecated
    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean A02() {
        if (Build.VERSION.SDK_INT >= 33) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                if (str.toUpperCase(locale).compareTo("UpsideDownCake".toUpperCase(locale)) < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
