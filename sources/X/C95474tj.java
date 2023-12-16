package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4tj  reason: invalid class name and case insensitive filesystem */
public final class C95474tj extends AnonymousClass2WN {
    public void A02(JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = jSONObject;
        C162457s7.A0J(jSONObject2, 0);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("aim_model_batched_manifest");
        JSONArray jSONArray = jSONObject3.getJSONArray("models");
        ArrayList A0s = AnonymousClass001.A0s();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = jSONObject4.getJSONArray("assets");
            C162457s7.A0H(jSONArray2);
            ArrayList A0s2 = AnonymousClass001.A0s();
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                JSONObject jSONObject6 = jSONObject5.getJSONObject("metadata");
                Integer num = null;
                try {
                    Integer valueOf = Integer.valueOf(jSONObject6.getInt("bytecode_version"));
                    if (valueOf != null) {
                        num = Integer.valueOf(valueOf.intValue());
                    }
                } catch (JSONException unused) {
                }
                C108605dG r8 = new C108605dG(num, jSONObject6.getString("file_name"), jSONObject6.getString("operators"));
                JSONArray jSONArray3 = jSONObject5.getJSONArray("delta_cache");
                ArrayList A0s3 = AnonymousClass001.A0s();
                int length3 = jSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject7 = jSONArray3.getJSONObject(i3);
                    A0s3.add(new C108595dF(jSONObject7.getString("base_md5"), jSONObject7.getString("delta_url")));
                }
                String string = jSONObject5.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String string2 = jSONObject5.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String string3 = jSONObject5.getString("cache_key");
                String string4 = jSONObject5.getString("source_content_hash");
                String string5 = jSONObject5.getString("md5_hash");
                String string6 = jSONObject5.getString("asset_handle");
                String string7 = jSONObject5.getString("creation_time");
                String string8 = jSONObject5.getString("url");
                int i4 = jSONObject5.getInt("filesize_bytes");
                String string9 = jSONObject5.getString("compression_type");
                C162457s7.A0D(string9);
                A0s2.add(new C108585dE(AnonymousClass57v.valueOf(string9), r8, string, string2, string3, string4, string5, string6, string7, string8, A0s3, i4));
            }
            JSONArray jSONArray4 = jSONObject4.getJSONArray("properties");
            ArrayList A0s4 = AnonymousClass001.A0s();
            int length4 = jSONArray4.length();
            for (int i5 = 0; i5 < length4; i5++) {
                JSONObject jSONObject8 = jSONArray4.getJSONObject(i5);
                A0s4.add(new C108505d6(jSONObject8.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject8.getString("value")));
            }
            A0s.add(new C108535d9(jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), A0s2, A0s4, jSONObject4.getInt("version")));
        }
        String string10 = jSONObject3.getString("entry_point");
        C162457s7.A0D(string10);
        C997958f valueOf2 = C997958f.valueOf(string10);
        int i6 = jSONObject3.getInt("asset_count");
        int i7 = jSONObject3.getInt("model_count");
        String string11 = jSONObject3.getString("status");
        C162457s7.A0D(string11);
        this.A00 = new C108545dA(valueOf2, C996057h.valueOf(string11), jSONObject3.getString("status_details"), A0s, i6, i7);
    }
}
