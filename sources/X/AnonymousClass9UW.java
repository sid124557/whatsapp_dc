package X;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.9UW  reason: invalid class name */
public class AnonymousClass9UW {
    public static final Pattern A00 = Pattern.compile("[0-9]+");

    public static boolean A00(AnonymousClass1VX r3, String str) {
        if (!r3.A0X(1458)) {
            return false;
        }
        String A0Q = r3.A0Q(1459);
        if (TextUtils.isEmpty(A0Q) || TextUtils.isEmpty(str) || !A0Q.contains(str)) {
            return false;
        }
        return true;
    }
}
