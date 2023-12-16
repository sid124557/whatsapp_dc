package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4vw  reason: invalid class name and case insensitive filesystem */
public final class C96184vw extends C95434tf {
    public final C166447yh A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass7YI A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C96184vw(X.C55682qk r13, X.C181668n8 r14, X.C166447yh r15, X.C57162tC r16, X.C620733j r17, X.AnonymousClass1VX r18, X.C184408rk r19, X.C59722xN r20, X.AnonymousClass7YI r21, X.AnonymousClass5ZI r22, X.AnonymousClass5GZ r23, X.AnonymousClass4FS r24, java.lang.String r25) {
        /*
            r12 = this;
            r3 = r13
            r4 = r14
            r5 = r16
            r6 = r17
            r11 = r24
            X.C18260x0.A0f(r13, r11, r6, r14, r5)
            r1 = r18
            r10 = r23
            X.C18260x0.A0U(r10, r1)
            r0 = 9
            r8 = r20
            X.C162457s7.A0J(r8, r0)
            r2 = r12
            r7 = r19
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A01 = r1
            r0 = r25
            r12.A03 = r0
            r12.A00 = r15
            r0 = r21
            r12.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96184vw.<init>(X.2qk, X.8n8, X.7yh, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.7YI, X.5ZI, X.5GZ, X.4FS, java.lang.String):void");
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray jSONArray = jSONObject.getJSONArray("businesses");
        C162457s7.A0D(jSONArray);
        int length = jSONArray.length();
        for (int i = 0; i < length; i = C109065e1.A00(A0s, jSONArray, i)) {
        }
        String str = this.A03;
        String str2 = null;
        if ("search_by_category".equals(str)) {
            str2 = jSONObject.optString("page_id", (String) null);
        }
        return new C152277Yg(str, str2, A0s);
    }

    public String A06() {
        return "businesses";
    }

    public Map A07() {
        AnonymousClass1VX r1;
        int i;
        HashMap A0t = AnonymousClass001.A0t();
        C166447yh r0 = this.A00;
        if (r0 != null) {
            A0t.put("category_id", r0.A00);
        }
        AnonymousClass7YI r5 = this.A02;
        if (r5 != null) {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("page_size", r5.A00);
            A1G.put("page_id", r5.A01);
            A0t.put("pagination", A1G);
        }
        List list = new AnonymousClass7EF().A00;
        list.add("profile_pic");
        JSONObject A1G2 = AnonymousClass0x9.A1G();
        A1G2.put("requested_fields", new JSONArray(list));
        A0t.put("fields_config", A1G2);
        String str = this.A03;
        A0t.put("use_case", str);
        if (C162457s7.A0P(str, "search_by_category")) {
            r1 = this.A01;
            i = 2968;
        } else if (C162457s7.A0P(str, "popular_biz")) {
            r1 = this.A01;
            i = 2970;
        } else {
            C18260x0.A0r("BusinessApiBusinessesListRequest/getInternalParams unknown search use case ", str, AnonymousClass001.A0o());
            return A0t;
        }
        A0t.put("ranking_logic_ver", r1.A0Q(i));
        return A0t;
    }
}
