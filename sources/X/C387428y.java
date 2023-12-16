package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.28y  reason: invalid class name and case insensitive filesystem */
public class C387428y {
    public static List A00(InputStream inputStream) {
        String A00 = C624535b.A00(inputStream);
        C626936e.A06(A00);
        JSONArray jSONArray = new JSONArray(A00);
        ArrayList A0I = AnonymousClass002.A0I(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            C47652db r6 = new C47652db();
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            String str = (String) jSONObject.get("sticker-pack-id");
            if (jSONObject.has("stickers")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("stickers");
                ArrayList A0I2 = AnonymousClass002.A0I(jSONArray2.length());
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    AnonymousClass39M r8 = new AnonymousClass39M();
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    r8.A0D = jSONObject2.getString("file-hash");
                    r8.A00 = jSONObject2.getInt("file-size");
                    r8.A0G = jSONObject2.getString("url");
                    r8.A08 = jSONObject2.getString("enc-file-hash");
                    r8.A0B = jSONObject2.getString("media-key");
                    r8.A0C = jSONObject2.getString("mimetype");
                    r8.A02 = jSONObject2.getInt("height");
                    r8.A03 = jSONObject2.getInt("width");
                    r8.A06 = jSONObject2.getString("direct-path");
                    r8.A0A = jSONObject2.optString("sticker-hash-without-meta");
                    JSONArray optJSONArray = jSONObject2.optJSONArray("emojis");
                    if (optJSONArray != null) {
                        ArrayList A0I3 = AnonymousClass002.A0I(optJSONArray.length());
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            A0I3.add(optJSONArray.getString(i3));
                        }
                        String join = TextUtils.join(" ", A0I3);
                        C162457s7.A0D(join);
                        r8.A07 = join;
                    }
                    r8.A0F = str;
                    A0I2.add(r8);
                }
                r6.A0N = A0I2;
            }
            r6.A0E = str;
            r6.A0G = (String) jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            r6.A0I = (String) jSONObject.get("publisher");
            r6.A03 = (String) jSONObject.get("description");
            r6.A0K = (String) jSONObject.get("tray-image-id");
            r6.A0L = (String) jSONObject.get("tray-image-preview");
            JSONArray jSONArray3 = jSONObject.getJSONArray("preview-image-ids");
            ArrayList A0I4 = AnonymousClass002.A0I(jSONArray3.length());
            for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                A0I4.add(jSONArray3.get(i4));
            }
            r6.A0M = A0I4;
            r6.A01 = jSONObject.getLong("file-size");
            r6.A0F = jSONObject.getString("image-data-hash");
            boolean z = true;
            r6.A0O = AnonymousClass000.A1U(jSONObject.optInt("animated", 0), 1);
            if (jSONObject.optInt("lottie", 0) != 1) {
                z = false;
            }
            r6.A0U = z;
            A0I.add(r6.A00());
        }
        return A0I;
    }
}
