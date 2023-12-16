package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2ep  reason: invalid class name and case insensitive filesystem */
public class C48392ep {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;

    public C48392ep(C55682qk r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Matcher A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            String A0R = this.A01.A0R(C58422vE.A02, 265);
            if (!TextUtils.isEmpty(A0R)) {
                try {
                    C626936e.A06(A0R);
                    Pattern compile = Pattern.compile(AnonymousClass0x9.A1H(A0R).getJSONArray("url").getJSONObject(0).getString("regex"));
                    C626936e.A06(str);
                    return compile.matcher(str);
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    throw new AnonymousClass24N((Throwable) e);
                }
            } else {
                throw new AnonymousClass24N("SHOPS_STOREFRONT_URLS_CONFIG_CODE was null/empty");
            }
        } else {
            throw new AnonymousClass24N("Shop url was null");
        }
    }

    public boolean A01(String str) {
        try {
            return A00(str).matches();
        } catch (AnonymousClass24N e) {
            Log.e((Throwable) e);
            this.A00.A0A("ShopUtils/isShopUrl", true, "ShopUrlException");
            return false;
        }
    }
}
