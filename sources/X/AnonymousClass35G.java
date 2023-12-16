package X;

import android.net.Uri;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.35G  reason: invalid class name */
public final class AnonymousClass35G {
    public static final List A00 = AnonymousClass8UF.A0o("facebook.com", "www.facebook.com", "m.facebook.com");
    public static final List A01 = AnonymousClass8UF.A0o("fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch");
    public static final List A02 = AnonymousClass8UF.A0o("instagram.com", "www.instagram.com");
    public static final List A03 = AnonymousClass8UF.A0o("lassovideos.com", "www.lassovideos.com");
    public static final List A04 = AnonymousClass8UF.A0o("netflix.com", "www.netflix.com");
    public static final List A05 = AnonymousClass8UF.A0o("sharechat.com", "www.sharechat.com");
    public static final List A06 = AnonymousClass8UF.A0o("streamable.com", "www.streamable.com");

    public static final int A00(int i) {
        if (i == 2) {
            return R.drawable.ic_pip_facebook;
        }
        if (i == 3) {
            return R.drawable.ic_pip_instagram;
        }
        if (i == 4) {
            return R.drawable.ic_pip_youtube;
        }
        if (i == 5) {
            return R.drawable.ic_pip_facebook;
        }
        if (i == 6) {
            return R.drawable.ic_pip_lasso;
        }
        if (i != 8) {
            return -1;
        }
        return R.drawable.ic_pip_sharechat;
    }

    public static final int A01(C106685Zz r5, String str) {
        C18270x1.A14(r5, str);
        Uri parse = Uri.parse(C106685Zz.A01(str));
        C162457s7.A0H(parse);
        if (!A03(parse, A01)) {
            List list = A00;
            if (!A03(parse, list) || !"1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
                if (A03(parse, list)) {
                    return 2;
                }
                if (A03(parse, A02)) {
                    return 3;
                }
                if (A03(parse, A06)) {
                    return 1;
                }
                C162457s7.A0J(parse, 0);
                String A022 = A02(parse);
                if (A022 != null && A022.length() != 0) {
                    return 4;
                }
                if (A03(parse, A03)) {
                    return 6;
                }
                if (A03(parse, A04)) {
                    return 7;
                }
                if (A03(parse, A05)) {
                    return 8;
                }
                return 0;
            }
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (X.AnonymousClass2AB.A04(X.C18320x8.A0g(r0, r1), "shorts") == true) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.net.Uri r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x0031
            java.lang.String r1 = r4.getHost()
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "m.youtube.com"
            r2 = 1
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "www.youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "youtube.com"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "youtu.be"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0031
        L_0x002d:
            java.lang.String r3 = r4.getLastPathSegment()
        L_0x0031:
            return r3
        L_0x0032:
            java.lang.String r1 = r4.getPath()
            if (r1 == 0) goto L_0x004b
            java.util.Locale r0 = java.util.Locale.US
            X.C162457s7.A0F(r0)
            java.lang.String r1 = X.C18320x8.A0g(r0, r1)
            java.lang.String r0 = "shorts"
            boolean r0 = X.AnonymousClass2AB.A04(r1, r0)
            if (r0 != r2) goto L_0x004b
            goto L_0x002d
        L_0x004b:
            java.lang.String r0 = "v"
            java.lang.String r3 = r4.getQueryParameter(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35G.A02(android.net.Uri):java.lang.String");
    }

    public static final boolean A03(Uri uri, List list) {
        String str = null;
        if (uri != null) {
            str = uri.getHost();
        }
        if (uri == null || str == null) {
            return false;
        }
        for (Object next : list) {
            if (str.equalsIgnoreCase((String) next)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
