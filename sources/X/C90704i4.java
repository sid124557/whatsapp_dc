package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4i4  reason: invalid class name and case insensitive filesystem */
public class C90704i4 extends C95444tg {
    public final int A00;
    public final int A01;
    public final AnonymousClass7H6 A02;
    public final C150967Sx A03;
    public final AnonymousClass5ZO A04;
    public final AnonymousClass1VX A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A = true;
    public final boolean A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90704i4(X.C55682qk r14, X.C181668n8 r15, X.C111525iE r16, X.AnonymousClass7H6 r17, X.C150967Sx r18, X.AnonymousClass5ZO r19, X.C54292oU r20, X.C57162tC r21, X.C620733j r22, X.AnonymousClass1VX r23, X.C184408rk r24, X.C59722xN r25, X.AnonymousClass8E9 r26, X.AnonymousClass4FS r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, boolean r33) {
        /*
            r13 = this;
            r11 = 0
            r0 = 1
            r2 = r13
            r5 = r26
            r10 = r25
            r9 = r24
            r8 = r22
            r7 = r21
            r6 = r16
            r4 = r15
            r12 = r27
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r23
            r13.A05 = r1
            r1 = r28
            r13.A06 = r1
            r1 = r32
            r13.A01 = r1
            r1 = r18
            r13.A03 = r1
            r1 = r17
            r13.A02 = r1
            r1 = r19
            r13.A04 = r1
            r13.A0A = r0
            r0 = r33
            r13.A0B = r0
            r0 = r29
            r13.A07 = r0
            r0 = r30
            r13.A08 = r0
            r0 = r31
            r13.A09 = r0
            r0 = r20
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r0 = r0.densityDpi
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90704i4.<init>(X.2qk, X.8n8, X.5iE, X.7H6, X.7Sx, X.5ZO, X.2oU, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.8E9, X.4FS, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    public String A06() {
        return "query";
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList A0s = AnonymousClass001.A0s();
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = jSONObject2.getJSONArray("categories");
        for (int i = 0; i < jSONArray.length(); i = C95444tg.A01(A0s, jSONArray, i)) {
        }
        String optString = jSONObject2.optString("request_id");
        ArrayList A0s2 = AnonymousClass001.A0s();
        JSONArray jSONArray2 = jSONObject2.getJSONArray("businesses");
        for (int i2 = 0; i2 < jSONArray2.length(); i2 = C95444tg.A00(optString, A0s2, jSONArray2, i2)) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("suggested_queries");
        ArrayList arrayList2 = null;
        if (optJSONArray != null) {
            arrayList = AnonymousClass001.A0s();
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList.add(optJSONArray.getString(i3));
            }
        } else {
            arrayList = null;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("alternative_queries");
        if (optJSONArray2 != null) {
            arrayList2 = AnonymousClass001.A0s();
            for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                arrayList2.add(optJSONArray2.getString(i4));
            }
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("filter_categories");
        if (optJSONArray3 != null) {
            for (int i5 = 0; i5 < optJSONArray3.length(); i5 = C95444tg.A01(A0s3, optJSONArray3, i5)) {
            }
        }
        return new AnonymousClass7QA(new C158377js(arrayList, arrayList2), C86654Ky.A0h("proximity_weight", jSONObject2), jSONObject2.optString("page_id"), this.A07, this.A08, optString, jSONObject2.optString("ranking_logic_ver"), jSONObject2.getString("csvm_config"), A0s, AnonymousClass001.A0s(), A0s2, A0s3, this.A01);
    }

    public Map A07() {
        String str;
        String A0Q;
        String str2;
        String str3;
        HashMap A0t = AnonymousClass001.A0t();
        C95444tg.A03(this.A04, A0t);
        A0t.put("query", this.A06);
        int i = this.A01;
        if (i == 1) {
            str = "typeahead_category";
        } else if (i != 2) {
            str = null;
        } else {
            str = "typeahead_business";
        }
        A0t.put("search_type", str);
        boolean z = this.A0B;
        A0t.put("business_load_all", Boolean.valueOf(z));
        A0t.put("search_by_business_enabled", Boolean.valueOf(this.A0A));
        AnonymousClass1VX r3 = this.A05;
        if (z) {
            A0Q = r3.A0Q(1413);
            str2 = "ranking_logic_ver";
        } else {
            A0Q = r3.A0Q(3440);
            str2 = "typeahead_experiment_ver";
        }
        A0t.put(str2, A0Q);
        A0t.put("tiered_onboarding_supported", Boolean.TRUE);
        C95444tg.A02(this.A02, A0t);
        if (r3.A0X(3250)) {
            if (this.A00 <= 240) {
                str3 = "hdpi";
            } else {
                str3 = "xxhdpi";
            }
            A0t.put("category_icons_resolution", str3);
        }
        C150967Sx r0 = this.A03;
        if (r0 != null) {
            A0t.put("filters", r0.A00());
        }
        String str4 = this.A09;
        if (str4 != null) {
            A0t.put("search_session_id", str4);
        }
        A0t.put("query_id", this.A07);
        A0t.put("search_id", this.A08);
        return A0t;
    }
}
