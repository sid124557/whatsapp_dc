package X;

import com.whatsapp.graphapi.GraphApiACSNetworkRequestKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4th  reason: invalid class name and case insensitive filesystem */
public final class C95454th extends GraphApiACSNetworkRequestKt {
    public final int A00;
    public final C111525iE A01;
    public final AnonymousClass5ZO A02;
    public final C57162tC A03;
    public final C620733j A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass8E9 A06;
    public final String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95454th(X.C55682qk r8, X.C181668n8 r9, X.C111525iE r10, X.AnonymousClass5ZO r11, X.C57162tC r12, X.C620733j r13, X.AnonymousClass1VX r14, X.C59722xN r15, X.AnonymousClass8E9 r16, X.AnonymousClass5ZI r17, X.AnonymousClass4FS r18, java.lang.String r19, int r20) {
        /*
            r7 = this;
            r2 = r8
            r3 = r9
            r6 = r18
            X.C18260x0.A0f(r8, r6, r14, r13, r9)
            r0 = r16
            X.C18260x0.A0W(r12, r10, r0)
            r1 = r7
            r4 = r15
            r5 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A04 = r13
            r7.A03 = r12
            r7.A01 = r10
            r7.A06 = r0
            r7.A05 = r14
            r7.A02 = r11
            r0 = r20
            r7.A00 = r0
            r0 = r19
            r7.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95454th.<init>(X.2qk, X.8n8, X.5iE, X.5ZO, X.2tC, X.33j, X.1VX, X.2xN, X.8E9, X.5ZI, X.4FS, java.lang.String, int):void");
    }

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

    public void A0H(C149757Nt r9) {
        this.A01.BKM(r9.A02, r9.A00, r9.A01, "map", r9.A04, r9.A03, 0);
    }

    public void A0J(Integer num, Long l, String str, String str2, String str3, String str4) {
        AnonymousClass0x2.A1A(str3, 2, str4);
        Integer num2 = num;
        this.A06.BKK(num2, AnonymousClass0x2.A0T(), l, str, str2, str3, str4);
    }

    public void A0L(String str) {
        C162457s7.A0J(str, 0);
        this.A01.BKM((Integer) null, (Integer) null, (Integer) null, "map", str, (String) null, 0);
    }

    public String A06() {
        return "map";
    }

    public int A0C() {
        return 19;
    }

    public int A0D() {
        return 0;
    }

    public int A0E() {
        return 19;
    }

    public String A0F() {
        String str = C58172up.A08;
        C162457s7.A0F(str);
        return str;
    }

    public void A0I(Integer num, Integer num2) {
        this.A01.BJx(num, num2);
    }

    public void A0K(Integer num, Long l, String str, String str2, String str3, String str4) {
        C162457s7.A0J(str4, 5);
        Integer num2 = num;
        Long l2 = l;
        this.A06.BKK(num2, l2, AnonymousClass0x2.A0T(), str, str2, "Cronet", str4);
    }

    public Map A07() {
        Double d;
        Double d2;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass5ZO r4 = this.A02;
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
        String str = this.A07;
        if (str != null) {
            A0t.put("category_id", str);
        }
        A0t.put("zoom_level", Integer.valueOf(this.A00));
        C86654Ky.A1M(this.A05, A0t, 3037);
        return A0t;
    }

    public JSONObject A0G() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("locale", C620733j.A02(this.A04).toString());
        A1G.put("version", C142506xJ.V4.versionName);
        String str = this.A01;
        if (!(str == null || str.length() == 0)) {
            A1G.put("credential", str);
        }
        Iterator A16 = AnonymousClass0x9.A16(A07());
        while (A16.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A16);
            A1G.put(C18310x6.A0q(A0w), A0w.getValue());
        }
        return A1G;
    }
}
