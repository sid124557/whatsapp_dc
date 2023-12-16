package X;

import org.json.JSONObject;

/* renamed from: X.91b  reason: invalid class name and case insensitive filesystem */
public class C1893791b implements C182508oW {
    public final int A00;

    public C1893791b(int i) {
        this.A00 = i;
    }

    public final Object Br1(Object obj) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                if (str != null) {
                    return AnonymousClass0x9.A1H(str);
                }
                break;
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null && jSONObject.has("data") && !jSONObject.isNull("data")) {
                    return jSONObject.getJSONObject("data");
                }
            case 2:
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null || !jSONObject2.has("errors") || jSONObject2.isNull("errors")) {
                    return AnonymousClass0x9.A1F();
                }
                return jSONObject2.getJSONArray("errors");
            default:
                return AnonymousClass0x9.A1F().put(String.valueOf(obj));
        }
        return AnonymousClass0x9.A1G();
    }
}
