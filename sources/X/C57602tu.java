package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2tu  reason: invalid class name and case insensitive filesystem */
public class C57602tu {
    public static String A00(Uri uri) {
        AnonymousClass2P6 r1;
        String str;
        AnonymousClass2MJ r4 = AnonymousClass2BJ.A00;
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            r1 = new AnonymousClass2P6();
            r1.A01 = uri.getPath();
            r1.A02 = scheme;
            r1.A00 = authority;
            uri.getQuery();
        } else {
            if (TextUtils.isEmpty(uri.getPath())) {
                str = null;
            } else {
                str = "/--sanitized--";
            }
            A01(uri, r4);
            r1 = new AnonymousClass2P6();
            r1.A02 = scheme;
            r1.A00 = authority;
            r1.A01 = str;
        }
        String str2 = r1.A01;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String A01(Uri uri, AnonymousClass2MJ r4) {
        Set<String> set;
        if (TextUtils.isEmpty(uri.getQuery())) {
            return null;
        }
        try {
            set = uri.getQueryParameterNames();
        } catch (UnsupportedOperationException unused) {
            set = null;
        }
        if (set == null || set.isEmpty()) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        Collections.unmodifiableList(r4.A00);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0o.length() > 0) {
                A0o.append('&');
            }
            A0o.append(A0m);
            A0o.append("=--sanitized--");
        }
        return A0o.toString();
    }
}
