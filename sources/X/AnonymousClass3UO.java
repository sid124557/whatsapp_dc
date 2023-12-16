package X;

import android.net.Uri;

/* renamed from: X.3UO  reason: invalid class name */
public class AnonymousClass3UO implements C182988pJ {
    public final Uri A00;
    public final String A01;
    public final String A02;

    public String B3m(AnonymousClass7US r6, boolean z) {
        Uri uri = this.A00;
        if (!"PSA".equals(uri.getQueryParameter("category"))) {
            return this.A02;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(r6.A02);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wa/static");
        encodedAuthority.encodedPath(AnonymousClass000.A0X(uri.getEncodedPath(), A0o));
        String str = r6.A03;
        if (str != null) {
            AnonymousClass3UP.A00(buildUpon, "_nc_cat", str);
        }
        return C18300x5.A0f(buildUpon);
    }

    public AnonymousClass3UO(String str) {
        this.A02 = str;
        Uri parse = Uri.parse(str);
        this.A00 = parse;
        String authority = parse.getAuthority();
        C626936e.A06(authority);
        this.A01 = authority;
    }
}
