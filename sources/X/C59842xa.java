package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.2xa  reason: invalid class name and case insensitive filesystem */
public class C59842xa {
    public final C60482yd A00;

    public static String A00(Integer num) {
        if (num == null) {
            return null;
        }
        try {
            return AnonymousClass0x9.A0y(num, "FDS_INSTANCE_KEY", AnonymousClass0x9.A1G());
        } catch (JSONException e) {
            Log.e("PAY: createQplPramsStringFromInstanceKey threw exception ", e);
            return null;
        }
    }

    public void A01(String str) {
        if (str != null) {
            try {
                String string = AnonymousClass0x9.A1H(str).getString("FDS_INSTANCE_KEY");
                if (string != null) {
                    A02(string, "OPEN_SCREEN", (Map) null);
                }
            } catch (JSONException unused) {
                Log.e("qpl params parsing failure");
            }
        }
    }

    public void A02(String str, String str2, Map map) {
        if (map == null) {
            map = AnonymousClass001.A0t();
        }
        this.A00.A00().A01(new C69383Wu(str, str2, map));
    }

    public C59842xa(C60482yd r1) {
        this.A00 = r1;
    }
}
