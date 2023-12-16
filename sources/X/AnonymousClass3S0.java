package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3S0  reason: invalid class name */
public final class AnonymousClass3S0 implements AnonymousClass4DO {
    public /* bridge */ /* synthetic */ Object B3Z(String str) {
        C162457s7.A0J(str, 0);
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            UserJid A0A = AnonymousClass32Y.A0A(A1H.getString("KEY_JID"));
            JSONObject jSONObject = A1H.getJSONObject("KEY_DATA");
            C162457s7.A0H(jSONObject);
            return new C51512jw(A0A, jSONObject);
        } catch (JSONException e) {
            throw new C376323k("CTWA: CtwaTrustSignalStoreStore/fromData/JSONException", e);
        } catch (AnonymousClass24P e2) {
            throw new C376323k("CTWA: CtwaTrustSignalStoreStore/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String Bqn(Object obj) {
        C51512jw r4 = (C51512jw) obj;
        C162457s7.A0J(r4, 0);
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("KEY_JID", r4.A00.getRawString());
            String A0y = AnonymousClass0x9.A0y(r4.A01, "KEY_DATA", A1G);
            C162457s7.A0H(A0y);
            return A0y;
        } catch (JSONException e) {
            throw new C376323k("CTWA: CtwaTrustSignalStoreStore/toData/JSONException", e);
        }
    }
}
