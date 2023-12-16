package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Bb  reason: invalid class name and case insensitive filesystem */
public final class C100475Bb {
    public static int A00(JSONObject jSONObject) {
        int i = C60222yC.A06;
        try {
            int i2 = jSONObject.getInt("badgeExpirationInHours");
            if (i2 >= 0) {
                return i2;
            }
            return i;
        } catch (JSONException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1J(A0o, C18300x5.A0k(e, "usernoticebadged no badgeExpirationInHours ", A0o));
            return i;
        }
    }
}
