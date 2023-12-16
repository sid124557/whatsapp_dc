package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Y8  reason: invalid class name */
public final class AnonymousClass2Y8 {
    public JSONObject A00;
    public final Map A01;

    public final List A00(JSONObject jSONObject, JSONObject jSONObject2) {
        this.A00 = jSONObject2;
        String optString = jSONObject.optString("version");
        C162457s7.A0H(optString);
        Integer A06 = C829745q.A06(optString);
        if (A06 == null || A06.intValue() > 1) {
            throw AnonymousClass24W.A01(C18320x8.A0X(), AnonymousClass000.A0V("Unsupported layout version: ", optString, AnonymousClass001.A0o()));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("layout");
        if (optJSONArray == null) {
            return null;
        }
        AnonymousClass8U9 r5 = new AnonymousClass8U9();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            AnonymousClass4GQ r0 = (AnonymousClass4GQ) this.A01.get(optJSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
            if (r0 != null) {
                r5.add(r0.invoke(optJSONObject));
            }
        }
        return C159507lx.A0h(r5);
    }

    public AnonymousClass2Y8() {
        LinkedHashMap A0r = C18320x8.A0r();
        this.A01 = A0r;
        A0r.put("Rating", new C383026z(this, 15));
    }
}
