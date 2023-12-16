package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4tk  reason: invalid class name and case insensitive filesystem */
public final class C95484tk extends AnonymousClass2WN {
    public void A02(JSONObject jSONObject, long j) {
        String str;
        Double d;
        JSONArray jSONArray;
        JSONObject jSONObject2 = jSONObject;
        C162457s7.A0J(jSONObject2, 0);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("xwa_search_businesses");
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray jSONArray2 = jSONObject3.getJSONArray("businesses");
        int length = jSONArray2.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
            String string = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String string2 = jSONObject4.getString("jid");
            String string3 = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int optInt = jSONObject4.optInt("verified_level");
            JSONObject optJSONObject = jSONObject4.optJSONObject("ui_data");
            Double d2 = null;
            if (optJSONObject != null) {
                str = null;
                String optString = optJSONObject.optString("subtitle");
                if (!TextUtils.isEmpty(optString) && (optString == null || !optString.equalsIgnoreCase("null"))) {
                    str = optString;
                }
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = jSONObject4.optJSONObject("location");
            if (optJSONObject2 != null) {
                d2 = C86654Ky.A0h("latitude", optJSONObject2);
                d = C86654Ky.A0h("longitude", optJSONObject2);
            } else {
                d = null;
            }
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("verified_name_highlight_ranges");
            } else {
                jSONArray = null;
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            if (jSONArray != null) {
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
                    A0s2.add(new C104465Rb(jSONObject5.getInt("start"), jSONObject5.getInt("end")));
                }
            }
            C162457s7.A0H(string);
            C162457s7.A0H(string2);
            C162457s7.A0H(string3);
            A0s.add(new AnonymousClass5T8(d2, d, Integer.valueOf(optInt), string, string2, string3, str, A0s2));
        }
        this.A00 = new C50752ii(A0s);
    }
}
