package X;

import android.text.TextUtils;
import android.widget.ImageView;

/* renamed from: X.73g  reason: invalid class name and case insensitive filesystem */
public class C1448673g {
    public static void A00(ImageView imageView, C148087Gw r11, C152967aS r12, C166357yY r13) {
        ImageView imageView2 = imageView;
        C1448873i.A00(imageView);
        if (r13 != null) {
            String str = r13.A01;
            if (!TextUtils.isEmpty(str)) {
                C148087Gw r5 = r11;
                C152967aS r1 = r12;
                r1.A01(imageView2, new C108815db(r13.A00, str, (String) null, 0, 0), (C181758nH) null, r5, new C170668Eb(), new C1442470p(0), 2);
            }
        }
    }
}
