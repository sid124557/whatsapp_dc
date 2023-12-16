package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1eo  reason: invalid class name and case insensitive filesystem */
public final class C27871eo extends C51762kL {
    public final C153197aq A00;
    public final JSONArray A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27871eo(C153197aq r3, JSONArray jSONArray) {
        super(r3, jSONArray);
        C18260x0.A0Q(r3, jSONArray);
        this.A00 = r3;
        this.A01 = jSONArray;
        boolean z = true;
        this.A02 = AnonymousClass001.A1W(r3.A00.length());
        this.A03 = this.A01.length() <= 0 ? false : z;
    }

    public String toString() {
        String jSONObject;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MexResponse(data=");
        JSONObject jSONObject2 = this.A00.A00;
        if (jSONObject2 == null) {
            jSONObject = "";
        } else {
            jSONObject = jSONObject2.toString(2);
            C162457s7.A0D(jSONObject);
        }
        A0o.append(jSONObject);
        A0o.append(", errors=");
        return C18260x0.A07(this.A01.toString(2), A0o);
    }
}
