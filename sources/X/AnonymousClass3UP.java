package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: X.3UP  reason: invalid class name */
public abstract class AnonymousClass3UP implements C182988pJ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Uri.Builder A01(AnonymousClass7US r5) {
        String str = this.A03;
        C626936e.A06(str);
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendEncodedPath = builder.scheme("https").encodedAuthority(r5.A02).appendPath(this.A00).appendPath(this.A01).appendEncodedPath(C107575bX.A0A(str));
        int i = 1;
        if (r5.A00 == 0) {
            i = 0;
        }
        appendEncodedPath.appendQueryParameter("direct_ip", String.valueOf(i));
        return builder;
    }

    public AnonymousClass3UP(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str)) {
            str4 = C107575bX.A0A(str);
        } else {
            str4 = null;
        }
        this.A03 = str4;
        this.A01 = str2;
        this.A00 = str3 == null ? "mms" : str3;
        this.A02 = str;
    }

    public static Uri.Builder A00(Uri.Builder builder, String str, String str2) {
        Uri build = builder.build();
        if (build.getQueryParameter(str) == null) {
            return builder.appendQueryParameter(str, str2);
        }
        builder.clearQuery();
        Iterator<String> it = build.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (str.equals(A0m)) {
                builder.appendQueryParameter(A0m, str2);
            } else {
                builder.appendQueryParameter(A0m, build.getQueryParameter(A0m));
            }
        }
        return builder;
    }
}
