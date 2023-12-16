package X;

import android.net.Uri;

/* renamed from: X.8JU  reason: invalid class name */
public class AnonymousClass8JU implements C182988pJ {
    public final Uri.Builder A00;
    public final String A01;
    public final String A02;

    public String B3m(AnonymousClass7US r3, boolean z) {
        return this.A00.encodedAuthority(r3.A02).build().toString();
    }

    public AnonymousClass8JU(String str, String str2) {
        Uri parse = Uri.parse(str);
        this.A00 = parse.buildUpon();
        this.A01 = parse.getAuthority();
        this.A02 = str2;
    }
}
