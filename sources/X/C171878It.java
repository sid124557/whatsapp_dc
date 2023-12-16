package X;

import org.json.JSONObject;

/* renamed from: X.8It  reason: invalid class name and case insensitive filesystem */
public final class C171878It implements C184538rz {
    public C186988wG B10(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("not");
        C162457s7.A0D(jSONObject2);
        C186988wG A00 = C1452574u.A00(jSONObject2);
        if (A00 != null) {
            return new AnonymousClass8I9(A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public String B8E() {
        return "not";
    }
}
