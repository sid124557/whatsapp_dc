package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.28m  reason: invalid class name and case insensitive filesystem */
public final class C386428m {
    public static final C52002kj A00(JSONObject jSONObject) {
        int i;
        String str;
        C162457s7.A0J(jSONObject, 0);
        Object obj = jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        C162457s7.A0K(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2.has("error_code")) {
            Object obj2 = jSONObject2.get("error_code");
            C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.Int");
            i = AnonymousClass001.A0K(obj2);
        } else {
            i = 405;
        }
        if (jSONObject2.has("description")) {
            Object obj3 = jSONObject2.get("description");
            C162457s7.A0K(obj3, "null cannot be cast to non-null type kotlin.String");
            str = (String) obj3;
        } else {
            str = "";
        }
        return new C52002kj(i, str);
    }
}
