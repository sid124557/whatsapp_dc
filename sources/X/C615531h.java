package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.31h  reason: invalid class name and case insensitive filesystem */
public class C615531h {
    public static int A00(AnonymousClass36K r2, Map map) {
        return A01(r2.A0r("size", (String) null), map.size());
    }

    public static long A02(AnonymousClass36K r4) {
        return A04(r4.A0r("s_t", (String) null), 0);
    }

    public static long A03(String str) {
        return A04(str, 0);
    }

    public static int A01(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long A04(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static Float A05(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return Float.valueOf(f);
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return Float.valueOf(f);
        }
    }
}
