package X;

import android.net.Uri;

/* renamed from: X.5B3  reason: invalid class name */
public final class AnonymousClass5B3 {
    public static final String A00(String str, String... strArr) {
        C162457s7.A0J(str, 0);
        int length = strArr.length;
        int i = 0;
        if (length == 0) {
            return str;
        }
        if (length % 2 != 0) {
            C18260x0.A0x("gdrive-util/append-query-parameters/odd number of params - ", AnonymousClass001.A0o(), length);
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        do {
            buildUpon.appendQueryParameter(strArr[i], strArr[i + 1]);
            i += 2;
        } while (i < length);
        return C18290x4.A0o(buildUpon.build());
    }
}
