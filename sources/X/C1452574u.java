package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.74u  reason: invalid class name and case insensitive filesystem */
public final class C1452574u {
    public static final C186988wG A00(JSONObject jSONObject) {
        for (C184538rz r1 : C1458777q.A00) {
            if (jSONObject.has(r1.B8E())) {
                try {
                    return r1.B10(jSONObject);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
