package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4i1  reason: invalid class name and case insensitive filesystem */
public final class C90674i1 extends C95444tg {
    public final int A00;
    public final AnonymousClass5ZO A01;
    public final AnonymousClass1VX A02;
    public final String A03;

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject jSONObject2 = jSONObject;
        C162457s7.A0J(jSONObject2, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        String optString = jSONObject2.optString("request_id");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("business_profiles");
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                C109065e1 A032 = C109065e1.A03(optJSONArray2.getJSONObject(i));
                A032.A03 = optString;
                A0s.add(A032);
            }
        }
        if (jSONObject2.optJSONArray("countries") == null && (optJSONArray = jSONObject2.optJSONArray("clusters")) != null) {
            int length2 = optJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                A0s2.add(new C166047y3(jSONObject3.getDouble("latitude"), jSONObject3.getDouble("longitude"), jSONObject3.getInt("count")));
            }
        }
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("countries");
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject jSONObject4 = optJSONArray3.getJSONObject(i3);
                A0s2.add(new C166047y3(jSONObject4.getDouble("latitude"), jSONObject4.getDouble("longitude"), 0));
            }
        }
        String optString2 = jSONObject2.optString("view");
        if (optString2 == null || optString2.length() == 0) {
            if (jSONObject2.optJSONArray("countries") != null) {
                optString2 = "world";
            } else if (jSONObject2.optJSONArray("clusters") != null) {
                optString2 = "city";
            } else if (jSONObject2.optJSONArray("business_profiles") != null) {
                optString2 = "street";
            } else {
                optString2 = "microscope";
            }
        }
        return new AnonymousClass7ZC(optString2, optString, A0s2, A0s);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90674i1(X.C55682qk r14, X.C181668n8 r15, X.C111525iE r16, X.AnonymousClass5ZO r17, X.C57162tC r18, X.C620733j r19, X.AnonymousClass1VX r20, X.C184408rk r21, X.C59722xN r22, X.AnonymousClass8E9 r23, X.AnonymousClass5ZI r24, X.AnonymousClass4FS r25, java.lang.String r26, int r27) {
        /*
            r13 = this;
            r12 = r25
            r3 = r14
            r4 = r15
            r8 = r19
            r1 = r20
            X.C18260x0.A0f(r14, r12, r1, r8, r15)
            r6 = r16
            r7 = r18
            r5 = r23
            X.C18260x0.A0W(r7, r6, r5)
            r0 = 9
            r10 = r22
            X.C162457s7.A0J(r10, r0)
            r11 = r24
            r2 = r13
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A02 = r1
            r0 = r17
            r13.A01 = r0
            r0 = r27
            r13.A00 = r0
            r0 = r26
            r13.A03 = r0
            java.lang.String r0 = "4.0"
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90674i1.<init>(X.2qk, X.8n8, X.5iE, X.5ZO, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.8E9, X.5ZI, X.4FS, java.lang.String, int):void");
    }

    public String A06() {
        return "map";
    }

    public Map A07() {
        Double d;
        Double d2;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass5ZO r4 = this.A01;
        boolean A08 = r4.A08();
        if (A08) {
            d = r4.A04;
        } else {
            d = r4.A02;
        }
        A0t.put("latitude", d);
        if (A08) {
            d2 = r4.A05;
        } else {
            d2 = r4.A03;
        }
        A0t.put("longitude", d2);
        A0t.put("search_radius_meters", r4.A06);
        String str = this.A03;
        if (str != null) {
            A0t.put("category_id", str);
        }
        A0t.put("zoom_level", Integer.valueOf(this.A00));
        C86654Ky.A1M(this.A02, A0t, 3037);
        return A0t;
    }
}
