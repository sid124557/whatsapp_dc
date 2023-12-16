package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.31O  reason: invalid class name */
public final class AnonymousClass31O {
    public static List A00(JSONArray jSONArray) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            A0s.add(obj);
        }
        return A0s;
    }

    public static Map A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass001.A0t();
        }
        try {
            return A02(AnonymousClass0x9.A1H(str));
        } catch (JSONException e) {
            Log.d("ParamsJsonUtils/jsonToMap ", e);
            return AnonymousClass001.A0t();
        }
    }

    public static Map A02(JSONObject jSONObject) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0m = AnonymousClass001.A0m(keys);
            Object obj = jSONObject.get(A0m);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            A0t.put(A0m, obj);
        }
        return A0t;
    }
}
