package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.2WV  reason: invalid class name */
public class AnonymousClass2WV {
    public final C55682qk A00;

    public AnonymousClass2WV(C55682qk r1) {
        this.A00 = r1;
    }

    public String A00(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (z) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("DirectPathUtils/direct_path Receive an empty direct path. Stacktrace: ");
                C18260x0.A1K(A0o, Arrays.toString(Thread.currentThread().getStackTrace()));
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse.getQueryParameter("oe") != null && parse.getQueryParameter("oh") != null) {
            return str;
        }
        C18260x0.A0r("DirectPathUtils/direct_path missing signature or expiry ", str, AnonymousClass001.A0o());
        this.A00.A0A("DirectPathUtils/verifyDirectPath", true, "missing signature or expiry");
        return null;
    }
}
