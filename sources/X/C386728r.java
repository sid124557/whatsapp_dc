package X;

import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.28r  reason: invalid class name and case insensitive filesystem */
public class C386728r {
    public static Pair A00(String str) {
        int lastIndexOf = str.lastIndexOf(95);
        if (lastIndexOf != -1) {
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                String A0r = AnonymousClass0x7.A0r(str, lastIndexOf);
                if (!TextUtils.isEmpty(A0r)) {
                    return C18290x4.A0K(A0r, parseInt);
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
