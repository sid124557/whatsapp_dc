package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5JA  reason: invalid class name */
public final class AnonymousClass5JA {
    public int A00 = -1;
    public String A01;
    public String A02;
    public JSONArray A03;

    public AnonymousClass5JA(JSONObject jSONObject, int i) {
        if (jSONObject.has("bottom_sheet")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("bottom_sheet");
            optJSONObject = optJSONObject == null ? AnonymousClass0x9.A1G() : optJSONObject;
            int optInt = optJSONObject.optInt("in_thread_buttons_limit", i);
            this.A00 = optInt > i ? i : optInt;
            this.A03 = optJSONObject.optJSONArray("divider_indices");
            this.A01 = optJSONObject.optString("button_title", (String) null);
            this.A02 = optJSONObject.optString("list_title", (String) null);
            return;
        }
        this.A00 = i;
    }
}
