package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.3Lk  reason: invalid class name and case insensitive filesystem */
public class C66433Lk implements AnonymousClass485 {
    public final C620733j A00;
    public final C106675Zy A01;

    public Uri A03(String str) {
        Uri.Builder A012 = A01();
        if (!TextUtils.isEmpty(str)) {
            A012.appendPath(str);
        }
        A012.appendQueryParameter("locale", this.A00.A08());
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A012.encodedFragment((String) null);
        }
        return A012.build();
    }

    public static Uri A00(C66433Lk r2, String str) {
        return r2.A02((Pair) null, "general", str, (String) null);
    }

    public Uri.Builder A01() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        return builder;
    }

    @Deprecated
    public Uri A04(String str, String str2) {
        Uri.Builder A012 = A01();
        A012.appendPath("general");
        A012.appendPath(str);
        A012.appendPath(str2);
        A05(A012);
        return A012.build();
    }

    public final void A05(Uri.Builder builder) {
        String str;
        C620733j r2 = this.A00;
        builder.appendQueryParameter("lg", r2.A07());
        builder.appendQueryParameter("lc", r2.A06());
        if (this.A01.A04()) {
            str = "1";
        } else {
            str = "0";
        }
        builder.appendQueryParameter("eea", str);
    }

    public C66433Lk(C620733j r1, C106675Zy r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Uri A02(Pair pair, String str, String str2, String str3) {
        Uri.Builder A012 = A01();
        A012.appendPath(str);
        if (!TextUtils.isEmpty(str2)) {
            A012.appendPath(str2);
        }
        A05(A012);
        if (pair != null) {
            A012.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        if (!TextUtils.isEmpty(str3)) {
            A012.encodedFragment(str3);
        }
        return A012.build();
    }
}
