package X;

import android.net.Uri;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;

/* renamed from: X.27O  reason: invalid class name */
public class AnonymousClass27O {
    public static String A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(uri.getScheme())) {
            if (!AnonymousClass0x9.A1O(uri, "chat")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter != null) {
                return queryParameter;
            }
        } else if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
            return null;
        } else {
            if (!AnonymousClass0x9.A1O(uri, AnonymousClass000.A0X(".whatsapp.com", AnonymousClass000.A0l("chat")))) {
                if (!AnonymousClass0x9.A1O(uri, "whatsapp.com") || !"chat".equals(uri.getLastPathSegment())) {
                    return null;
                }
                return uri.getQueryParameter("code");
            }
        }
        return uri.getLastPathSegment();
    }
}
