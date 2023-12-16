package X;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: X.7lc  reason: invalid class name and case insensitive filesystem */
public final class C159307lc {
    public static String A00(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (!(th2 instanceof UnknownHostException)) {
                    th2 = th2.getCause();
                    if (th2 == null) {
                        str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                } else {
                    str2 = "UnknownHostException (no network)";
                    break;
                }
            }
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("\n  ");
        A0l.append(str2.replace("\n", "\n  "));
        return AnonymousClass001.A0j(A0l, 10);
    }

    public static void A01(String str, String str2, Throwable th) {
        Log.w(str2, A00(str, th));
    }

    public static void A02(String str, String str2, Throwable th) {
        Log.e(str, A00(str2, th));
    }
}
