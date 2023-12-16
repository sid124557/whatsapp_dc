package X;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.7Ou  reason: invalid class name and case insensitive filesystem */
public class C150017Ou {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Rect[] A04;
    public final String[] A05;
    public final C157467iL[][] A06;

    public C150017Ou(String str, String str2, Rect[] rectArr, String[] strArr, C157467iL[][] r7, int i) {
        this.A01 = str;
        String queryParameter = Uri.parse(str).getQueryParameter("v");
        this.A02 = TextUtils.isEmpty(queryParameter) ? "unknown" : queryParameter;
        this.A03 = str2;
        this.A04 = rectArr;
        this.A00 = i;
        this.A05 = strArr;
        this.A06 = r7;
    }
}
