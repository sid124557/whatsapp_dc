package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3EE  reason: invalid class name */
public final class AnonymousClass3EE implements AnonymousClass49J {
    public final C183538qC A00;
    public final Map A01;

    public void Bh5(C49382gR r7, AnonymousClass39C r8, String str, String str2, String str3) {
        int i;
        String str4;
        String str5 = str;
        C162457s7.A0J(str, 0);
        if (str2 != null) {
            try {
                JSONObject optJSONObject = AnonymousClass0x9.A1H(str2).optJSONObject("server_params");
                if (optJSONObject != null) {
                    str4 = optJSONObject.optString("flow");
                    if (str4 == null || str4.length() == 0) {
                        str4 = optJSONObject.optString("linking_entry_point");
                    }
                    C162457s7.A0H(str4);
                    i = optJSONObject.optInt("target_acct_type", -1);
                    if (-1 == i) {
                        i = optJSONObject.optInt("account_type", -1);
                    }
                    if (-1 == i) {
                        i = optJSONObject.optInt("target_account_type", -1);
                    }
                    C18260x0.A0q("AccountLinkingCustomBloksRequest/post appId: ", str, AnonymousClass001.A0o());
                    ((C46832cH) this.A00.get()).A00(new AnonymousClass2EU(r7), C54662p5.A00(), str5, str4, i);
                }
            } catch (JSONException e) {
                r7.A00(e);
                return;
            }
        }
        str4 = "";
        i = -1;
        C18260x0.A0q("AccountLinkingCustomBloksRequest/post appId: ", str, AnonymousClass001.A0o());
        ((C46832cH) this.A00.get()).A00(new AnonymousClass2EU(r7), C54662p5.A00(), str5, str4, i);
    }

    public AnonymousClass3EE(C183538qC r1, Map map) {
        C18260x0.A0Q(r1, map);
        this.A00 = r1;
        this.A01 = map;
    }
}
