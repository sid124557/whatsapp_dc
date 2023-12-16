package X;

import android.webkit.URLUtil;

/* renamed from: X.73a  reason: invalid class name and case insensitive filesystem */
public class C1448073a {
    public static String A00(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return str;
        }
        return AnonymousClass000.A0V("https://", str, AnonymousClass001.A0o());
    }
}
