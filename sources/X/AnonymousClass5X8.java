package X;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5X8  reason: invalid class name */
public class AnonymousClass5X8 {
    public static final Map A05;
    public final C111095hX A00;
    public final C69263Wi A01;
    public final C620633i A02;
    public final C620733j A03;
    public final C106675Zy A04;

    public Uri A01(String str, boolean z) {
        String str2;
        if (z) {
            str = AnonymousClass000.A0X("-uk", AnonymousClass000.A0l(str));
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        C620733j r2 = this.A03;
        buildUpon.appendQueryParameter("lg", r2.A07());
        buildUpon.appendQueryParameter("lc", r2.A06());
        if (!z) {
            if (this.A04.A04()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            buildUpon.appendQueryParameter("eea", str2);
        }
        return buildUpon.build();
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A05 = A0t;
        A0t.put("terms-of-service", "https://www.whatsapp.com/legal/#terms-of-service");
        A0t.put("privacy-policy", "https://www.whatsapp.com/legal/#privacy-policy");
        A0t.put("end-to-end-encryption", "https://faq.whatsapp.com/general/28030015/");
        A0t.put("facebook-companies", "https://www.facebook.com/help/111814505650678");
        A0t.put("how-whatsapp-works-with-the-meta-companies", "https://www.whatsapp.com/legal/privacy-policy-eea#privacy-policy-how-we-work-with-other-meta-companies");
        A0t.put("privacy-policy-managing-and-deleting-your-information", "https://www.whatsapp.com/legal/#privacy-policy-managing-and-deleting-your-information");
        A0t.put("privacy-policy-our-global-operations", "https://www.whatsapp.com/legal/#privacy-policy-our-global-operations");
        A0t.put("terms-of-service-age", "https://www.whatsapp.com/legal/#terms-of-service-age");
        A0t.put("cookies", "https://www.whatsapp.com/legal/#cookies");
    }

    public AnonymousClass5X8(C111095hX r1, C69263Wi r2, C620633i r3, C620733j r4, C106675Zy r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public Uri A00(String str) {
        String str2;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        C620733j r2 = this.A03;
        buildUpon.appendQueryParameter("lg", r2.A07());
        buildUpon.appendQueryParameter("lc", r2.A06());
        if (this.A04.A04()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        buildUpon.appendQueryParameter("eea", str2);
        return buildUpon.build();
    }
}
