package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1d5  reason: invalid class name and case insensitive filesystem */
public final class C26981d5 extends AnonymousClass2WN {
    public final C55862r2 A00;

    public C26981d5(C55862r2 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final C633438w A03(JSONObject jSONObject) {
        int i;
        JSONObject jSONObject2;
        boolean z;
        JSONArray jSONArray = jSONObject.getJSONArray("emojis");
        ArrayList A0s = AnonymousClass001.A0s();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            C162457s7.A0D(string);
            A0s.add(string);
        }
        if (jSONObject.has("file_size")) {
            i = jSONObject.getInt("file_size");
        } else {
            i = 0;
        }
        if (jSONObject.has("metadata")) {
            jSONObject2 = jSONObject.getJSONObject("metadata");
        } else {
            jSONObject2 = null;
        }
        String A0r = C18290x4.A0r("url", jSONObject);
        String join = TextUtils.join(" ", A0s);
        C162457s7.A0D(join);
        String A0r2 = C18290x4.A0r("mimetype", jSONObject);
        int i3 = jSONObject.getInt("height");
        int i4 = jSONObject.getInt("width");
        String A0r3 = C18290x4.A0r("file_hash", jSONObject);
        String A0r4 = C18290x4.A0r("stable_id", jSONObject);
        if (jSONObject2 == null || !jSONObject2.has("country_specific")) {
            z = false;
        } else {
            z = jSONObject2.getBoolean("country_specific");
        }
        return new C633438w(A0r, join, A0r2, A0r3, A0r4, i, i3, i4, z);
    }
}
