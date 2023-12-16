package X;

import org.json.JSONObject;

/* renamed from: X.31V  reason: invalid class name */
public class AnonymousClass31V {
    public static C60272yH A00(C50912iy r11, String str, JSONObject jSONObject) {
        Long l;
        JSONObject A10 = C18300x5.A10("data", jSONObject);
        long j = A10.getLong("fbid");
        String string = A10.getString("access_token");
        long j2 = A10.getLong("timestamp");
        String str2 = null;
        if (A10.has("ttl")) {
            l = Long.valueOf(A10.optLong("ttl"));
        } else {
            l = null;
        }
        if (A10.has("analytics_claim")) {
            str2 = A10.optString("analytics_claim");
        }
        return new C60272yH(r11, l, str, string, str2, j, j2);
    }

    public static String A01(JSONObject jSONObject) {
        return C18300x5.A10("data", jSONObject).getString("access_token");
    }
}
