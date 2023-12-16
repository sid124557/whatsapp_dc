package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Rz  reason: invalid class name and case insensitive filesystem */
public final class C68133Rz implements AnonymousClass4DO {
    public /* bridge */ /* synthetic */ Object B3Z(String str) {
        String str2 = str;
        C162457s7.A0J(str2, 0);
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str2);
            String string = A1H.getString("uj");
            String string2 = A1H.getString("s");
            long j = A1H.getLong("ct");
            long j2 = A1H.getLong("lit");
            String A03 = AnonymousClass355.A03("a", A1H);
            boolean optBoolean = A1H.optBoolean("hcslm");
            int optInt = A1H.optInt("brc", -1);
            long optLong = A1H.optLong("fmts", -1);
            UserJid A09 = AnonymousClass32Y.A09(string);
            C162457s7.A0H(string2);
            return new C22881Ql(A09, string2, A03, optInt, j, j2, optLong, optBoolean);
        } catch (JSONException e) {
            throw new C376323k("CTWA: OrganicEntryPointTransformer/fromData/JSONException", e);
        } catch (AnonymousClass24P e2) {
            throw new C376323k("CTWA: OrganicEntryPointTransformer/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String Bqn(Object obj) {
        C22881Ql r7 = (C22881Ql) obj;
        C162457s7.A0J(r7, 0);
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("uj", r7.A00.getRawString());
            A1G.put("s", r7.A05);
            String str = r7.A04;
            if (!(str == null || str.length() == 0)) {
                A1G.put("a", str);
            }
            A1G.put("ct", r7.A01);
            A1G.put("lit", r7.A03);
            A1G.put("hcslm", r7.A06);
            int i = r7.A00;
            if (i != -1) {
                A1G.put("brc", i);
            }
            long j = r7.A02;
            if (j != -1) {
                A1G.put("fmts", j);
            }
            return C18290x4.A0o(A1G);
        } catch (JSONException e) {
            throw new C376323k("CTWA: OrganicEntryPointTransformer/toData/JSONException", e);
        }
    }
}
