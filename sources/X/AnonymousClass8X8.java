package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8X8  reason: invalid class name */
public final class AnonymousClass8X8 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C158757kV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8X8(C158757kV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r = C18320x8.A0r();
        String A0A = this.this$0.A00.A0A();
        if (!(A0A == null || A0A.length() == 0)) {
            JSONArray jSONArray = new JSONArray(A0A);
            Iterator it = C175708Zk.A02(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((C72013d2) it).A00());
                A0r.put(C18290x4.A0r("credentialId", jSONObject), new AnonymousClass7ZK(jSONObject.getLong("startTime"), C18290x4.A0r("credentialId", jSONObject), jSONObject.getLong("endTime"), C18290x4.A0r("internationalActivationStatus", jSONObject)));
            }
        }
        return A0r;
    }
}
