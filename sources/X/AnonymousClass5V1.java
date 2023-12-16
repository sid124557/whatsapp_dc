package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.5V1  reason: invalid class name */
public final class AnonymousClass5V1 {
    public static void A00(C620433g r0, UserJid userJid, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        A02(str, r0.A07.A01(userJid), jSONObject, jSONObject2, true);
    }

    public static final void A02(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (!(!z || str2 == null || str2.length() == 0)) {
            jSONObject2.put("direct_connection_encrypted_info", str2);
        }
        JSONObject A1G = AnonymousClass0x9.A1G();
        JSONObject A0z = C18300x5.A0z(jSONObject2, str, A1G);
        A0z.put("request", A1G);
        jSONObject.put("variables", A0z);
    }

    public static final void A01(C52332lJ r4, JSONObject jSONObject) {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (C142516xK r1 : r4.A02) {
            if (A0o.length() > 0) {
                A0o.append(",");
            }
            A0o.append(r1.variantInfoTypeString);
        }
        if (A0o.length() > 0) {
            jSONObject.put("variant_info_fields", A0o.toString());
            jSONObject.put("variant_thumbnail_width", String.valueOf(r4.A01));
            jSONObject.put("variant_thumbnail_height", String.valueOf(r4.A00));
        }
    }
}
