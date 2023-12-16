package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3EN  reason: invalid class name */
public final class AnonymousClass3EN implements AnonymousClass4E1 {
    public static final AnonymousClass3EN A00 = new AnonymousClass3EN();

    /* renamed from: A01 */
    public C52822m6 B3a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        UserJid A0E = UserJid.Companion.A0E(jSONObject.optString("jid"));
        long optLong = jSONObject.optLong("count");
        Long valueOf = Long.valueOf(optLong);
        List A01 = AnonymousClass31K.A01(AnonymousClass3EM.A00, jSONObject.optJSONArray("themes"));
        String optString = jSONObject.optString("persona_id");
        if (A0E == null) {
            return null;
        }
        if (valueOf == null) {
            optLong = 0;
        }
        return new C52822m6(A0E, optString, A01, optLong);
    }

    public /* bridge */ /* synthetic */ Object B3b(Object obj) {
        C34871vx r9 = (C34871vx) obj;
        C162457s7.A0J(r9, 0);
        UserJid userJid = r9.A00;
        Long l = r9.A01;
        List A002 = AnonymousClass31K.A00(AnonymousClass3EM.A00, r9.A03);
        String str = r9.A02;
        if (userJid == null) {
            return null;
        }
        return new C52822m6(userJid, str, A002, AnonymousClass0x2.A0D(l));
    }

    public /* bridge */ /* synthetic */ JSONObject Bqt(Object obj) {
        return A00((C52822m6) obj);
    }

    public static JSONObject A00(C52822m6 r7) {
        Long l;
        JSONObject A0l = AnonymousClass0x2.A0l(r7);
        A0l.put("jid", r7.A01.getRawString());
        long j = r7.A00;
        if (j != 0) {
            l = Long.valueOf(j);
        } else {
            l = null;
        }
        A0l.put("count", l);
        A0l.put("themes", AnonymousClass31K.A02(AnonymousClass3EM.A00, r7.A03));
        A0l.put("persona_id", r7.A02);
        return A0l;
    }
}
