package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.9LX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9LX {
    public static boolean A00(Uri uri, C203329nW r3) {
        String queryParameter = uri.getQueryParameter(r3.B5F());
        String B4h = r3.B4h();
        if (TextUtils.isEmpty(B4h) || TextUtils.isEmpty(queryParameter) || !B4h.contains(queryParameter)) {
            return false;
        }
        return true;
    }
}
