package X;

import android.net.Uri;

/* renamed from: X.76X  reason: invalid class name */
public class AnonymousClass76X {
    public static final Uri A00;

    static {
        String str;
        if (AnonymousClass76Z.A00) {
            str = "com.facebook.appmanager.dev";
        } else {
            str = "com.facebook.appmanager";
        }
        A00 = new Uri.Builder().scheme("content").authority(AnonymousClass000.A0X(".firstparty.settings", AnonymousClass000.A0l(str))).build();
    }
}
