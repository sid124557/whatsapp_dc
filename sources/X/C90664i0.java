package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4i0  reason: invalid class name and case insensitive filesystem */
public final class C90664i0 extends C95444tg {
    public final AnonymousClass1VX A00;
    public final String A01;
    public final List A02;
    public final List A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90664i0(X.C55682qk r15, X.C181668n8 r16, X.C111525iE r17, X.C57162tC r18, X.C620733j r19, X.AnonymousClass1VX r20, X.C184408rk r21, X.C59722xN r22, X.AnonymousClass8E9 r23, X.AnonymousClass4FS r24, java.lang.String r25, java.util.List r26, java.util.List r27) {
        /*
            r14 = this;
            r12 = 0
            r4 = r15
            r5 = r16
            r9 = r19
            r2 = r20
            r13 = r24
            X.C18260x0.A0f(r2, r15, r13, r9, r5)
            r7 = r17
            r8 = r18
            r6 = r23
            X.C18260x0.A0W(r8, r7, r6)
            r0 = 9
            r11 = r22
            X.C162457s7.A0J(r11, r0)
            r0 = 14
            r1 = r27
            X.C162457s7.A0J(r1, r0)
            r3 = r14
            r10 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A00 = r2
            r0 = r26
            r14.A02 = r0
            r0 = r25
            r14.A01 = r0
            r14.A03 = r1
            java.lang.String r0 = "1.0"
            r14.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90664i0.<init>(X.2qk, X.8n8, X.5iE, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.8E9, X.4FS, java.lang.String, java.util.List, java.util.List):void");
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        LinkedHashMap A0r = C18320x8.A0r();
        JSONArray jSONArray = jSONObject.getJSONArray("business_profiles");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            JSONObject optJSONObject = jSONObject2.optJSONObject("full_details");
            if (optJSONObject != null) {
                C109065e1 A022 = C109065e1.A02(optJSONObject);
                A022.A04 = jSONObject2.optString("description");
                JSONArray optJSONArray = jSONObject2.optJSONArray("product_images");
                if (optJSONArray != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    int length2 = optJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        String string = optJSONArray.getString(i2);
                        C162457s7.A0D(string);
                        A0s.add(string);
                    }
                    A022.A06 = A0s;
                }
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("post_images");
                if (optJSONArray2 != null) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    int length3 = optJSONArray2.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        String string2 = optJSONArray2.getString(i3);
                        C162457s7.A0D(string2);
                        A0s2.add(string2);
                    }
                    A022.A05 = A0s2;
                }
                A022.A01 = 1;
                String str = A022.A0E;
                C162457s7.A0C(str);
                A0r.put(str, A022);
            }
        }
        return A0r;
    }

    public String A06() {
        return "business_info";
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
        JSONArray A1F2 = AnonymousClass0x9.A1F();
        for (Object put : this.A02) {
            A1F2.put(put);
        }
        String str = this.A01;
        if (str != null) {
            A0t.put("request_query", str);
        }
        String A0Q = this.A00.A0Q(4384);
        if (A0Q != null) {
            A0t.put("experiment_ver", A0Q);
        }
        A0t.put("business_ids", A1F2);
        A0t.put("fields_config", A1G);
        return A0t;
    }
}
