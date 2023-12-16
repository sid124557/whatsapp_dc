package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8Iu  reason: invalid class name and case insensitive filesystem */
public final class C171888Iu implements C184538rz {
    public C186988wG B10(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        JSONArray jSONArray = jSONObject.getJSONArray("or");
        int length = jSONArray.length();
        C186988wG[] r2 = new C186988wG[length];
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C162457s7.A0D(jSONObject2);
            r2[i] = C1452574u.A00(jSONObject2);
        }
        List A03 = C73703fw.A03(r2);
        if (A03.size() > 1) {
            z = true;
        }
        C626936e.A0D(z, "expected 2 or more rules in input");
        return new AnonymousClass8IA(A03);
    }

    public String B8E() {
        return "or";
    }
}
