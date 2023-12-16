package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.8TS  reason: invalid class name */
public class AnonymousClass8TS extends HashMap<String, String> {
    public final /* synthetic */ C160077mz this$0;
    public final /* synthetic */ JSONObject val$jsonProfile;

    public AnonymousClass8TS(C160077mz r3, JSONObject jSONObject) {
        this.this$0 = r3;
        this.val$jsonProfile = jSONObject;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
    }
}
