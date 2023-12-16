package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.351  reason: invalid class name */
public final class AnonymousClass351 {
    public static Uri.Builder A00(AnonymousClass1VX r3, C49912hI r4, String str) {
        Uri.Builder buildUpon;
        if (r3.A0Y(C58422vE.A02, 2713)) {
            Uri.Builder scheme = new Uri.Builder().scheme("https");
            r4.A01();
            buildUpon = scheme.encodedAuthority(r4.A00);
        } else {
            buildUpon = Uri.parse("https://static.whatsapp.net").buildUpon();
        }
        return buildUpon.path(str);
    }

    public static String A01(Uri.Builder builder, Map map) {
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            builder.appendQueryParameter(C18310x6.A0q(A0w), AnonymousClass0x9.A12(A0w));
        }
        return C18300x5.A0f(builder);
    }

    public static String A02(AnonymousClass1VX r1, C49912hI r2, String str, String str2, String str3, String str4) {
        Uri.Builder A00 = A00(r1, r2, "wa/static/downloadable");
        A00.appendQueryParameter("category", str);
        if (str2 != null) {
            A00.appendQueryParameter("locale", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A00.appendQueryParameter("existing_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            A00.appendQueryParameter("version", str4);
        }
        return C18300x5.A0f(A00);
    }

    public static void A03(C55682qk r2, String str) {
        C18260x0.A0r("DownloadableUtils/reportCriticalEventIfBeta", str, AnonymousClass001.A0o());
        r2.A0A("DownloadableUtils/reportCriticalEventIfBeta", true, str);
    }

    public static boolean A04(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
                return false;
            }
        }
        return true;
    }
}
