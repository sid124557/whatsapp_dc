package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2YY  reason: invalid class name */
public class AnonymousClass2YY {
    public final AnonymousClass4FV A00;
    public final AnonymousClass7WN A01;

    public final JSONObject A00(String str, JSONArray jSONArray) {
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                break;
            } else if (!str.equals(((JSONObject) jSONArray.get(i)).optString("business_owner_jid"))) {
                i++;
            } else if (i != -1) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                jSONArray.remove(i);
                return jSONObject;
            }
        }
        return AnonymousClass0x9.A1G();
    }

    public AnonymousClass2YY(AnonymousClass4FV r1, AnonymousClass7WN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
