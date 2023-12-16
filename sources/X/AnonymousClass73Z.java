package X;

import android.net.Uri;

/* renamed from: X.73Z  reason: invalid class name */
public abstract class AnonymousClass73Z {
    public static Uri A00(C108775dX r2, int i) {
        String str;
        StringBuilder A0A = C18330xA.A0A("https://");
        if (i != 0) {
            if (i == 1) {
                A0A.append("www.instagram.com/");
                str = r2.A01;
            }
            return Uri.parse(A0A.toString());
        }
        A0A.append("www.facebook.com/");
        str = r2.A02;
        A0A.append(str);
        return Uri.parse(A0A.toString());
    }
}
