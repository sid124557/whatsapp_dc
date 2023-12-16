package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.71F  reason: invalid class name */
public class AnonymousClass71F {
    public static boolean A00(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            return false;
        }
        return TextUtils.isEmpty(uri.getScheme()) || "file".equals(uri.getScheme()) || "content".equals(uri.getScheme());
    }
}
