package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4h9  reason: invalid class name and case insensitive filesystem */
public final class C90334h9 extends C67163Of {
    public /* bridge */ /* synthetic */ Object A02(JSONObject jSONObject, long j) {
        if (!C57332tT.A01("listing", jSONObject)) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray optJSONArray = jSONObject.optJSONArray("listing");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                boolean optBoolean = optJSONObject.optBoolean("is_available");
                String optString = optJSONObject.optString("product_id");
                ArrayList A0s2 = AnonymousClass001.A0s();
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("options");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        if (optJSONObject2 != null) {
                            String A00 = C57332tT.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, optJSONObject2);
                            if (A00 != null) {
                                String A002 = C57332tT.A00("value", optJSONObject2);
                                if (A002 != null) {
                                    A0s2.add(new C165977xw(A00, A002));
                                } else {
                                    throw AnonymousClass001.A0e("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass001.A0e("Required value was null.");
                            }
                        }
                    }
                    continue;
                }
                C162457s7.A0H(optString);
                A0s.add(new C166027y1(optString, A0s2, optBoolean));
            }
        }
        return new C108665dM(A0s);
    }
}
