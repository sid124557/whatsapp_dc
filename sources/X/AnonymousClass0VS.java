package X;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: X.0VS  reason: invalid class name */
public class AnonymousClass0VS {
    public static final C04840Qw A00 = new C04840Qw(16);
    public static final AnonymousClass0Q5 A01;

    static {
        AnonymousClass0Q5 r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            r0 = new C005805t();
        } else if (i >= 28) {
            r0 = new C005505q();
        } else if (i >= 26) {
            r0 = new C005605r();
        } else if (i < 24 || !C005905u.A00()) {
            r0 = new C005705s();
        } else {
            r0 = new C005905u();
        }
        A01 = r0;
    }

    public static String A00(Resources resources, String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        return AnonymousClass000.A0h(sb, i3);
    }
}
