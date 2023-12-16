package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.2tZ  reason: invalid class name and case insensitive filesystem */
public class C57392tZ {
    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return A01(C18330xA.A0B(str));
        } catch (MalformedURLException e) {
            Log.w("redactedversion/not-url", e);
            int length = str.length();
            if (length <= 25) {
                return "***";
            }
            return AnonymousClass000.A0V(AnonymousClass0x7.A0r(str, length - 25), "***", AnonymousClass001.A0o());
        }
    }

    public static String A01(URL url) {
        String str;
        int length;
        if (url == null) {
            return null;
        }
        String path = url.getPath();
        if (path == null || (length = path.length()) <= 25) {
            str = "";
        } else {
            str = AnonymousClass0x7.A0r(path, length - 25);
        }
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder authority = builder.scheme(url.getProtocol()).authority(url.getHost());
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("***");
        C626936e.A06(path);
        authority.path(AnonymousClass000.A0X(path.substring(path.length() - 4), A0l)).encodedQuery(url.getQuery());
        return C18300x5.A0f(builder);
    }
}
