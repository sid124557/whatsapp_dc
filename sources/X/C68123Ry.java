package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ry  reason: invalid class name and case insensitive filesystem */
public final class C68123Ry implements AnonymousClass4DO {
    public /* bridge */ /* synthetic */ Object B3Z(String str) {
        C162457s7.A0J(str, 0);
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            String string = A1H.getString("brj");
            String string2 = A1H.getString("ap");
            String string3 = A1H.getString("s");
            long j = A1H.getLong("ct");
            List list = null;
            String A03 = AnonymousClass355.A03("tb_t", A1H);
            int optInt = A1H.optInt("tb_a", -1);
            JSONArray optJSONArray = A1H.optJSONArray("cf");
            boolean optBoolean = A1H.optBoolean("lrt");
            boolean optBoolean2 = A1H.optBoolean("cde");
            if (optJSONArray != null) {
                list = AnonymousClass25q.A00(optJSONArray);
            }
            UserJid A09 = AnonymousClass32Y.A09(string);
            if (A03 == null) {
                A03 = "";
            }
            C162457s7.A0H(string2);
            C162457s7.A0H(string3);
            return new C22891Qm(A09, string2, string3, A03, list, optInt, j, optBoolean, optBoolean2);
        } catch (JSONException e) {
            throw new C376323k("CTWA: AdsEntryPointTransformer/fromData/JSONException", e);
        } catch (AnonymousClass24P e2) {
            throw new C376323k("CTWA: AdsEntryPointTransformer/fromData/InvalidJidException", e2);
        } catch (IllegalArgumentException e3) {
            throw new C376323k("CTWA: AdsEntryPointTransformer/fromData/IllegalArgumentException", e3);
        }
    }

    public /* bridge */ /* synthetic */ String Bqn(Object obj) {
        C22891Qm r5 = (C22891Qm) obj;
        C162457s7.A0J(r5, 0);
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("brj", r5.A00.getRawString());
            A1G.put("ap", r5.A02);
            A1G.put("s", r5.A03);
            A1G.put("ct", r5.A01);
            String str = r5.A04;
            if (str.length() > 0) {
                A1G.put("tb_t", str);
                A1G.put("tb_a", r5.A00);
            }
            List<C371221a> list = r5.A05;
            if (list != null) {
                JSONArray A1F = AnonymousClass0x9.A1F();
                for (C371221a r0 : list) {
                    A1F.put(r0.label);
                }
                A1G.put("cf", A1F);
            }
            A1G.put("lrt", r5.A06);
            A1G.put("cde", r5.A07);
            return C18290x4.A0o(A1G);
        } catch (JSONException e) {
            throw new C376323k("CTWA: AdsEntryPointTransformer/toData/JSONException", e);
        }
    }
}
