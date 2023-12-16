package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.27V  reason: invalid class name */
public final class AnonymousClass27V {
    public static final C54692p8 A00(JSONObject jSONObject) {
        String string = jSONObject.getString("business_jid");
        String string2 = jSONObject.getString("business_type");
        String string3 = jSONObject.getString("conversion_event_type");
        long j = jSONObject.getLong("conversion_event_timestamp");
        UserJid A09 = AnonymousClass32Y.A09(string);
        C162457s7.A0H(string2);
        AnonymousClass20Z valueOf = AnonymousClass20Z.valueOf(string2);
        C162457s7.A0H(string3);
        return new C54692p8(valueOf, AnonymousClass20L.valueOf(string3), A09, j);
    }
}
