package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4hz  reason: invalid class name and case insensitive filesystem */
public final class C90654hz extends C95444tg {
    public final AnonymousClass1VX A00;
    public final String A01;
    public final String A02;
    public final List A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90654hz(X.C55682qk r14, X.C181668n8 r15, X.C111525iE r16, X.C57162tC r17, X.C620733j r18, X.AnonymousClass1VX r19, X.C184408rk r20, X.C59722xN r21, X.AnonymousClass8E9 r22, X.AnonymousClass4FS r23, java.lang.String r24, java.lang.String r25, java.util.List r26) {
        /*
            r13 = this;
            r11 = 0
            r3 = r14
            r4 = r15
            r8 = r18
            r1 = r19
            r12 = r23
            X.C18260x0.A0f(r1, r14, r12, r8, r15)
            r6 = r16
            r7 = r17
            r5 = r22
            X.C18260x0.A0W(r7, r6, r5)
            r0 = 10
            r10 = r21
            X.C162457s7.A0J(r10, r0)
            r2 = r13
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r1
            r0 = r24
            r13.A01 = r0
            r0 = r25
            r13.A02 = r0
            r0 = r26
            r13.A03 = r0
            java.lang.String r0 = "1.0"
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90654hz.<init>(X.2qk, X.8n8, X.5iE, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.8E9, X.4FS, java.lang.String, java.lang.String, java.util.List):void");
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        JSONArray jSONArray = jSONObject.getJSONArray("business_profiles");
        LinkedHashMap A0r = C18320x8.A0r();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C162457s7.A0D(jSONObject2);
            String string = jSONObject2.getString("jid");
            String optString = jSONObject2.optString("description");
            JSONArray optJSONArray = jSONObject2.optJSONArray("product_images");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("post_images");
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    String string2 = optJSONArray2.getString(i2);
                    C162457s7.A0D(string2);
                    A0s2.add(string2);
                }
            }
            if (optJSONArray != null) {
                int length3 = optJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    String string3 = optJSONArray.getString(i3);
                    C162457s7.A0D(string3);
                    A0s.add(string3);
                }
            }
            C162457s7.A0H(string);
            AnonymousClass7ZB r1 = new AnonymousClass7ZB(string, optString, A0s2, A0s);
            A0r.put(r1.A00, r1);
        }
        return A0r;
    }

    public String A06() {
        return "cached_data";
    }

    public Map A07() {
        HashMap A0t = AnonymousClass001.A0t();
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            C95444tg.A04(A0t, it, A1F);
        }
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("requested_fields", A1F);
        A0t.put("request_id", this.A01);
        String str = this.A02;
        if (str != null && this.A00.A0X(3225)) {
            A0t.put("request_query", str);
        }
        String A0Q = this.A00.A0Q(3226);
        if (A0Q != null) {
            A0t.put("experiment_ver", A0Q);
        }
        A0t.put("fields_config", A1G);
        return A0t;
    }
}
