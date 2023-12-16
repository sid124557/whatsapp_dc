package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4i3  reason: invalid class name and case insensitive filesystem */
public class C90694i3 extends C95444tg {
    public String A00;
    public String A01;
    public final int A02;
    public final AnonymousClass7H6 A03;
    public final C150967Sx A04;
    public final AnonymousClass5ZO A05;
    public final C166447yh A06;
    public final AnonymousClass1VX A07;
    public final C105355Up A08;
    public final String A09;
    public final String A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90694i3(X.C55682qk r14, X.C181668n8 r15, X.C111525iE r16, X.AnonymousClass7H6 r17, X.C150967Sx r18, X.AnonymousClass5ZO r19, X.C166447yh r20, X.C54292oU r21, X.C57162tC r22, X.C620733j r23, X.AnonymousClass1VX r24, X.C184408rk r25, X.C59722xN r26, X.C105355Up r27, X.AnonymousClass8E9 r28, X.AnonymousClass4FS r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r13 = this;
            r11 = 0
            r2 = r13
            r10 = r26
            r9 = r25
            r8 = r23
            r7 = r22
            r12 = r29
            r6 = r16
            r5 = r28
            r4 = r15
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r24
            r13.A07 = r0
            r0 = r18
            r13.A04 = r0
            r0 = r20
            r13.A06 = r0
            r0 = r30
            r13.A09 = r0
            r0 = r19
            r13.A05 = r0
            r0 = r31
            r13.A0A = r0
            r1 = r27
            r13.A08 = r1
            r0 = r32
            r13.A00 = r0
            r0 = r33
            r13.A01 = r0
            r0 = r17
            r13.A03 = r0
            r0 = r21
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r0 = r0.densityDpi
            r13.A02 = r0
            X.1VX r1 = r1.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x005e
            r0 = 4844(0x12ec, float:6.788E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "6.0"
        L_0x005b:
            r13.A00 = r0
            return
        L_0x005e:
            java.lang.String r0 = "5.0"
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90694i3.<init>(X.2qk, X.8n8, X.5iE, X.7H6, X.7Sx, X.5ZO, X.7yh, X.2oU, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.5Up, X.8E9, X.4FS, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public String A06() {
        return "businesses";
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        ArrayList A0s;
        C108965dr r30;
        boolean z;
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = jSONObject2.getJSONArray("business_profiles");
        String optString = jSONObject2.optString("request_id");
        for (int i = 0; i < jSONArray.length(); i = C95444tg.A00(optString, A0s2, jSONArray, i)) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("api_business_profiles");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2 = C95444tg.A00(optString, A0s3, optJSONArray, i2)) {
            }
        }
        ArrayList A0s4 = AnonymousClass001.A0s();
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("subcategories");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3 = C95444tg.A01(A0s4, optJSONArray2, i3)) {
            }
        }
        ArrayList A0s5 = AnonymousClass001.A0s();
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("filter_categories");
        if (optJSONArray3 != null) {
            for (int i4 = 0; i4 < optJSONArray3.length(); i4 = C95444tg.A01(A0s5, optJSONArray3, i4)) {
            }
        }
        Double A0h = C86654Ky.A0h("proximity_weight", jSONObject2);
        String optString2 = jSONObject2.optString("ranking_logic_ver");
        String optString3 = jSONObject2.optString("page_id");
        String string = jSONObject2.getString("csvm_config");
        JSONObject optJSONObject = jSONObject2.optJSONObject("map_view");
        if (optJSONObject == null) {
            A0s = AnonymousClass001.A0s();
        } else {
            HashMap A0t = AnonymousClass001.A0t();
            JSONArray optJSONArray4 = optJSONObject.optJSONArray("categories");
            if (optJSONArray4 != null) {
                for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                    C91824lC A002 = C91824lC.A00(optJSONArray4.getJSONObject(i5));
                    A0t.put(A002.A00, A002);
                }
            }
            JSONArray optJSONArray5 = optJSONObject.optJSONArray("business_profiles");
            A0s = AnonymousClass001.A0s();
            if (optJSONArray5 != null) {
                for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                    JSONObject jSONObject3 = optJSONArray5.getJSONObject(i6);
                    C162457s7.A0J(jSONObject3, 0);
                    String string2 = jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C162457s7.A0D(string2);
                    double d = jSONObject3.getDouble("latitude");
                    double d2 = jSONObject3.getDouble("longitude");
                    if (jSONObject3.has("responsive")) {
                        z = true;
                        if (jSONObject3.getBoolean("responsive")) {
                            double d3 = jSONObject3.getDouble("biz_pre_rank_score");
                            Object obj = A0t.get(jSONObject3.getString("category_id"));
                            C626936e.A06(obj);
                            C162457s7.A0D(obj);
                            A0s.add(new C109055e0((C109065e1) null, (C91824lC) obj, string2, d, d2, d3, z));
                        }
                    }
                    z = false;
                    double d32 = jSONObject3.getDouble("biz_pre_rank_score");
                    Object obj2 = A0t.get(jSONObject3.getString("category_id"));
                    C626936e.A06(obj2);
                    C162457s7.A0D(obj2);
                    A0s.add(new C109055e0((C109065e1) null, (C91824lC) obj2, string2, d, d2, d32, z));
                }
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("config");
            if (optJSONObject2 != null) {
                double d4 = optJSONObject2.getDouble("max_allowed_business_distance_in_meters");
                int i7 = optJSONObject2.getInt("max_num_of_businesses_to_select");
                ArrayList A0s6 = AnonymousClass001.A0s();
                JSONArray jSONArray2 = optJSONObject2.getJSONArray("zoom_level_for_layers");
                int length = jSONArray2.length();
                for (int i8 = 0; i8 < length; i8++) {
                    A0s6.add(Float.valueOf((float) jSONArray2.getDouble(i8)));
                }
                float f = (float) optJSONObject2.getDouble("default_zoom_level");
                JSONArray jSONArray3 = optJSONObject2.getJSONArray("segments");
                ArrayList A0t2 = C18300x5.A0t(jSONArray3);
                int length2 = jSONArray3.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i9);
                    float optDouble = (float) jSONObject4.optDouble("start_distance_in_meters");
                    float optDouble2 = (float) jSONObject4.optDouble("end_distance_in_meters");
                    int optInt = jSONObject4.optInt("show_compact_pin_for_layer_upto");
                    ArrayList A0s7 = AnonymousClass001.A0s();
                    JSONArray optJSONArray6 = jSONObject4.optJSONArray("layers");
                    if (optJSONArray6 != null) {
                        int length3 = optJSONArray6.length();
                        for (int i10 = 0; i10 < length3; i10++) {
                            JSONObject jSONObject5 = optJSONArray6.getJSONObject(i10);
                            A0s7.add(new C165987xx(jSONObject5.optInt("zoom_level_index"), jSONObject5.optInt("regular_pin_count")));
                        }
                    }
                    A0t2.add(new C108825dc(A0s7, optDouble, optDouble2, optInt, jSONObject4.getInt("grid_size")));
                }
                r30 = new C108965dr(A0s6, A0t2, d4, f, i7);
                return new AnonymousClass5TI(new C158367jr(r30, A0s), A0h, optString3, optString, optString2, string, A0s4, A0s3, A0s2, A0s5);
            }
        }
        r30 = null;
        return new AnonymousClass5TI(new C158367jr(r30, A0s), A0h, optString3, optString, optString2, string, A0s4, A0s3, A0s2, A0s5);
    }

    public Map A07() {
        String str;
        HashMap A0t = AnonymousClass001.A0t();
        C95444tg.A03(this.A05, A0t);
        C166447yh r0 = this.A06;
        if (r0 != null) {
            A0t.put("category_id", r0.A00);
        }
        A0t.put("businesses_list_inclusion_level", this.A00);
        A0t.put("subcategories_list_inclusion_level", this.A01);
        String str2 = this.A09;
        if (str2 != null) {
            A0t.put("browse_use_case", str2);
            if ("map_view_serp".equals(str2)) {
                A0t.put("map_view_config_version", this.A07.A0Q(4461));
            }
        }
        A0t.put("ranking_formula_ver", "linear_weights_v1");
        C86654Ky.A1M(this.A07, A0t, 1412);
        A0t.put("tiered_onboarding_supported", Boolean.TRUE);
        if (this.A02 <= 240) {
            str = "hdpi";
        } else {
            str = "xxhdpi";
        }
        A0t.put("category_icons_resolution", str);
        C150967Sx r02 = this.A04;
        if (r02 != null) {
            A0t.put("filters", r02.A00());
        }
        C95444tg.A02(this.A03, A0t);
        String str3 = this.A0A;
        if (str3 != null) {
            A0t.put("search_session_id", str3);
        }
        return A0t;
    }
}
