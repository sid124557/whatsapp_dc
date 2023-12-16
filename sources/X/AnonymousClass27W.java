package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.27W  reason: invalid class name */
public final class AnonymousClass27W {
    public static final C53212mj A00(JSONObject jSONObject) {
        String string = jSONObject.getString("session_id");
        String string2 = jSONObject.getString("business_jid");
        String string3 = jSONObject.getString("business_session_id");
        long j = jSONObject.getLong("survey_start_timestamp");
        JSONObject jSONObject2 = jSONObject.getJSONObject("conversion_info");
        C162457s7.A0D(jSONObject2);
        C54692p8 A00 = AnonymousClass27V.A00(jSONObject2);
        C162457s7.A0H(string);
        UserJid A09 = AnonymousClass32Y.A09(string2);
        C162457s7.A0H(string3);
        return new C53212mj(A00, A09, string, string3, j);
    }
}
