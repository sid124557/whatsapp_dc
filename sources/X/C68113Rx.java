package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Rx  reason: invalid class name and case insensitive filesystem */
public final class C68113Rx implements AnonymousClass4DO {
    public /* bridge */ /* synthetic */ Object B3Z(String str) {
        String str2 = str;
        C162457s7.A0J(str2, 0);
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str2);
            String string = A1H.getString("jid");
            JSONObject jSONObject = A1H.getJSONObject("lt");
            C162457s7.A0D(jSONObject);
            C53982nz r5 = new C53982nz(jSONObject.optInt("brc"), jSONObject.optBoolean("cslm"), jSONObject.optBoolean("fml"), jSONObject.optBoolean("sml"), jSONObject.optBoolean("tml"), jSONObject.optBoolean("fbrl"), jSONObject.optBoolean("sbrl"), jSONObject.optBoolean("dcl"), jSONObject.optBoolean("fcl"), jSONObject.optBoolean("flcl"), jSONObject.optBoolean("fkci"));
            long j = A1H.getLong("lit");
            C162457s7.A0H(string);
            return new C60712z2(r5, string, j);
        } catch (JSONException e) {
            throw new C376323k("CTWA: CtwaAdConsumerDCStateInfoStore/fromData/JSONException", e);
        } catch (AnonymousClass24P e2) {
            throw new C376323k("CTWA: CtwaAdConsumerDCStateInfoStore/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String Bqn(Object obj) {
        C60712z2 r6 = (C60712z2) obj;
        C162457s7.A0J(r6, 0);
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("jid", r6.A02);
            C53982nz r4 = r6.A01;
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("brc", r4.A00);
            A1G2.put("cslm", r4.A02);
            A1G2.put("fml", r4.A07);
            A1G2.put("sml", r4.A09);
            A1G2.put("tml", r4.A0A);
            A1G2.put("fbrl", r4.A04);
            A1G2.put("sbrl", r4.A08);
            A1G2.put("dcl", r4.A03);
            A1G2.put("fcl", r4.A05);
            A1G2.put("flcl", r4.A06);
            A1G2.put("fkci", r4.A01);
            A1G.put("lt", A1G2);
            A1G.put("lit", r6.A00);
            String obj2 = A1G.toString();
            C162457s7.A0H(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new C376323k("CTWA: CtwaAdConsumerDCStateInfoStore/toData/JSONException", e);
        }
    }
}
