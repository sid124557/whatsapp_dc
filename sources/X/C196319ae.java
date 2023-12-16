package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ae  reason: invalid class name and case insensitive filesystem */
public class C196319ae implements C181918nZ {
    public C55682qk A00;
    public C40142Er A01;
    public AnonymousClass4FV A02;

    public void Bje(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        AnonymousClass99Z r4 = new AnonymousClass99Z();
        r4.A03 = "";
        r4.A00 = Long.valueOf((long) 0);
        r4.A04 = str;
        String str7 = this.A01.A00;
        if (str7 != null) {
            r4.A01 = str7;
        } else {
            r4.A01 = "unknown";
        }
        if (str3 != null) {
            try {
                JSONObject A10 = C18300x5.A10("callsite", AnonymousClass0x9.A1H(str3));
                r4.A02 = A10.optString("feature", "unknown");
                r4.A05 = A10.optString("oncall", "unknown");
                r4.A06 = A10.optString("product", "unknown");
            } catch (JSONException unused) {
                this.A00.A0A("wa_bloks_mins_crash_logs", true, "Failed to parse loggingID");
            }
        }
        this.A02.BhA(r4);
    }
}
