package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4tl  reason: invalid class name and case insensitive filesystem */
public final class C95494tl extends AnonymousClass2WN {
    public void A02(JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = jSONObject;
        C162457s7.A0J(jSONObject2, 0);
        try {
            JSONObject optJSONObject = jSONObject2.optJSONObject("aim_model_batched_manifest");
            if (optJSONObject != null) {
                JSONArray jSONArray = optJSONObject.getJSONArray("models");
                ArrayList A0s = AnonymousClass001.A0s();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("assets");
                    C162457s7.A0H(jSONArray2);
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                        C162457s7.A0H(jSONObject4);
                        C162457s7.A0J(jSONObject4, 0);
                        A0s2.add(new AnonymousClass5TJ(C57282tO.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject4, false), C57282tO.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject4, false), C57282tO.A00("cache_key", jSONObject4, false), C57282tO.A00("source_content_hash", jSONObject4, false), C57282tO.A00("md5_hash", jSONObject4, false), C57282tO.A00("asset_handle", jSONObject4, false), C57282tO.A00("creation_time", jSONObject4, false), C57282tO.A00("url", jSONObject4, false), C57282tO.A00("compression_type", jSONObject4, false), jSONObject4.getInt("filesize_bytes")));
                    }
                    A0s.add(new AnonymousClass5SC(A0s2, jSONObject3.getInt("version"), C57282tO.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject3, false)));
                }
                this.A00 = new C104915Sv(C57282tO.A00("entry_point", optJSONObject, false), C57282tO.A00("status", optJSONObject, false), C57282tO.A00("status_details", optJSONObject, false), A0s, optJSONObject.getInt("asset_count"), optJSONObject.getInt("model_count"));
            }
        } catch (JSONException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "MLModelMetadataGraphqlDataProcessor/processResponse failed to parse parameters json: ", e);
        }
    }
}
