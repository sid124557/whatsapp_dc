package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4vu  reason: invalid class name and case insensitive filesystem */
public class C96164vu extends C95434tf {
    public final AnonymousClass1VX A00;
    public final String A01;

    public C96164vu(C55682qk r12, C181668n8 r13, C57162tC r14, C620733j r15, AnonymousClass1VX r16, C184408rk r17, C59722xN r18, AnonymousClass5ZI r19, AnonymousClass5GZ r20, AnonymousClass4FS r21, String str) {
        super(r12, r13, r14, r15, r17, r18, r19, r20, r21);
        this.A01 = str;
        this.A00 = r16;
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        AnonymousClass7UR r4 = new AnonymousClass7UR();
        ArrayList A0r = C18300x5.A0r(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("businesses");
        C162457s7.A0D(jSONArray);
        int length = jSONArray.length();
        for (int i = 0; i < length; i = C109065e1.A00(A0r, jSONArray, i)) {
        }
        r4.A04 = A0r;
        r4.A00 = 4;
        return r4.A00();
    }

    public String A06() {
        return "query";
    }

    public Map A07() {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("query", this.A01);
        List list = new AnonymousClass7EF().A00;
        list.add("profile_pic");
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("requested_fields", new JSONArray(list));
        A0t.put("fields_config", A1G);
        C86654Ky.A1M(this.A00, A0t, 2969);
        return A0t;
    }
}
