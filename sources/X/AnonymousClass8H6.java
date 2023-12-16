package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.8H6  reason: invalid class name */
public final class AnonymousClass8H6 implements C185078t1 {
    public final JSONObject A00;
    public final JSONObject A01;

    public final boolean A00() {
        String str;
        JSONObject jSONObject = this.A00;
        if (jSONObject != null) {
            str = jSONObject.optString("severity");
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("critical");
    }

    public String B5K() {
        return "EXTENSION";
    }

    public int B5a() {
        JSONObject jSONObject = this.A00;
        if (jSONObject != null) {
            return jSONObject.optInt("error_code");
        }
        return 417;
    }

    public String B6z() {
        String optString = this.A01.optString("message");
        if (optString == null) {
            return "";
        }
        return optString;
    }

    public AnonymousClass8H6(JSONObject jSONObject) {
        this.A01 = jSONObject;
        this.A00 = jSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }
}
