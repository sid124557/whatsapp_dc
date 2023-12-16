package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Rl  reason: invalid class name and case insensitive filesystem */
public class C150607Rl {
    public int A00;

    public C150607Rl(int i) {
        this.A00 = i;
    }

    public JSONObject A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("attempts", this.A00);
        } catch (JSONException unused) {
        }
        return A1G;
    }
}
