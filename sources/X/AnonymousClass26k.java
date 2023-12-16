package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.26k  reason: invalid class name */
public final class AnonymousClass26k {
    public static final C53832nk A00(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject = jSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        String[] strArr = null;
        if (optJSONObject == null || (jSONObject2 = optJSONObject.optJSONObject("metadata")) == null) {
            jSONObject2 = jSONObject;
        }
        String A0l = C18300x5.A0l("flow_id", jSONObject);
        String A00 = C57282tO.A00("data_api_version", jSONObject2, true);
        String A002 = C57282tO.A00("state", jSONObject2, false);
        String A003 = C57282tO.A00("flow_version_ids", jSONObject2, true);
        String A004 = C57282tO.A00("psl_cdn_url", jSONObject2, true);
        String A005 = C57282tO.A00("psl_signature", jSONObject2, true);
        JSONArray optJSONArray = jSONObject2.optJSONArray("categories");
        if (optJSONArray != null) {
            String[] A1b = AnonymousClass0x7.A1b(C829345m.A01(new C72623e1(new AnonymousClass42E(optJSONArray), C73723fy.A0R(C175708Zk.A02(0, optJSONArray.length())))));
            if (A1b != null) {
                strArr = A1b;
                return new C53832nk(A0l, A00, A002, A003, A004, A005, strArr, jSONObject2.optInt("well_version", 0));
            }
        }
        String A006 = C57282tO.A00("categories", jSONObject2, false);
        if (A006 != null) {
            strArr = AnonymousClass0x7.A1b(new C116975rB("\\s*,\\s*").A01(A006, 0));
        }
        return new C53832nk(A0l, A00, A002, A003, A004, A005, strArr, jSONObject2.optInt("well_version", 0));
    }
}
