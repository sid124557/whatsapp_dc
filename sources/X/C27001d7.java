package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.1d7  reason: invalid class name and case insensitive filesystem */
public final class C27001d7 extends C618532n {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27001d7(JSONObject jSONObject) {
        super(jSONObject);
        C162457s7.A0J(jSONObject, 1);
        JSONObject optJSONObject = jSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (optJSONObject != null) {
            this.A00 = optJSONObject.optInt("error_code", 417);
            optJSONObject.optBoolean("is_retryable");
        }
    }
}
