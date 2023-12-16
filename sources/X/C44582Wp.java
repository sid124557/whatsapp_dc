package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2Wp  reason: invalid class name and case insensitive filesystem */
public final class C44582Wp {
    public final C54292oU A00;

    public C44582Wp(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final File A00(String str, int i) {
        String str2 = null;
        File A0A = AnonymousClass002.A0A(AnonymousClass002.A0A(C54292oU.A03(this.A00), "privacy_disclosure"), String.valueOf(i));
        if (A0A.exists() || A0A.mkdirs()) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str2 = parse.getLastPathSegment();
            }
            return AnonymousClass002.A0A(A0A, str2);
        }
        Log.e("PrivacyDisclosureFileCache/getPrivacyDisclosureDir can not make directory");
        return null;
    }
}
