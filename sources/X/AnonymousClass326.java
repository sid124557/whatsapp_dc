package X;

import android.content.ContentUris;
import android.net.Uri;
import android.text.TextUtils;

@Deprecated
/* renamed from: X.326  reason: invalid class name */
public class AnonymousClass326 {
    public static final Uri A00;
    public static final String A01;

    public static Uri A00(AnonymousClass3ZH r3) {
        return ContentUris.withAppendedId(A00, r3.A0F());
    }

    public static boolean A01(Uri uri) {
        if (uri == null || !TextUtils.equals(uri.getScheme(), "content") || !TextUtils.equals(uri.getAuthority(), A01)) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp");
        String A0X = AnonymousClass000.A0X(".provider.contact", A0o);
        A01 = A0X;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("content://");
        A0o2.append(A0X);
        A00 = Uri.parse(AnonymousClass000.A0X("/contacts", A0o2));
    }
}
