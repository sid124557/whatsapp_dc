package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4ti  reason: invalid class name and case insensitive filesystem */
public final class C95464ti extends AnonymousClass2WN {
    public void A02(JSONObject jSONObject, long j) {
        C162457s7.A0J(jSONObject, 0);
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ar_scripting_modules_package_download");
            int i = jSONObject2.getInt("revision");
            String string = jSONObject2.getString("cdn_uri");
            C162457s7.A0H(string);
            this.A00 = new AnonymousClass5RY(i, string);
        } catch (JSONException e) {
            Log.e("GetScriptingPackageMetadataDataProcessor/processResponse Failed to parse parameters", e);
        }
    }
}
