package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4vv  reason: invalid class name and case insensitive filesystem */
public final class C96174vv extends C95434tf {
    public final int A00;
    public final AnonymousClass1VX A01;
    public final JSONArray A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C96174vv(X.C55682qk r13, X.C181668n8 r14, X.C54292oU r15, X.C57162tC r16, X.C620733j r17, X.AnonymousClass1VX r18, X.C184408rk r19, X.C59722xN r20, X.AnonymousClass5ZI r21, X.AnonymousClass5GZ r22, X.AnonymousClass4FS r23) {
        /*
            r12 = this;
            r3 = r13
            r4 = r14
            r6 = r17
            r11 = r23
            X.C18260x0.A0f(r13, r11, r6, r15, r14)
            r5 = r16
            r1 = r18
            r10 = r22
            X.C18260x0.A0W(r5, r10, r1)
            r0 = 10
            r8 = r20
            X.C162457s7.A0J(r8, r0)
            r2 = r12
            r7 = r19
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A01 = r1
            android.content.Context r0 = r15.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r0 = r0.densityDpi
            r12.A00 = r0
            r0 = 4313(0x10d9, float:6.044E-42)
            org.json.JSONObject r1 = r1.A0S(r0)
            java.lang.String r0 = "featured_categories_modules"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            r12.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96174vv.<init>(X.2qk, X.8n8, X.2oU, X.2tC, X.33j, X.1VX, X.8rk, X.2xN, X.5ZI, X.5GZ, X.4FS):void");
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray optJSONArray = jSONObject.optJSONArray("biz_categories");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C162457s7.A0D(jSONObject2);
                String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C626936e.A05(string);
                C162457s7.A0D(string);
                String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                C626936e.A05(string2);
                C162457s7.A0D(string2);
                String optString = jSONObject2.optString("icon_url", "");
                int optInt = jSONObject2.optInt("num_of_biz");
                C162457s7.A0H(optString);
                A0s.add(new C133336hB(Integer.valueOf(optInt), string, string2, optString));
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("popular_biz");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2 = C109065e1.A00(A0s2, optJSONArray2, i2)) {
            }
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        JSONArray jSONArray = this.A02;
        if (jSONArray != null) {
            for (String str : AnonymousClass0x7.A1b(C829345m.A01(new C72623e1(new AnonymousClass41F(jSONArray), C73723fy.A0R(C175708Zk.A02(0, jSONArray.length())))))) {
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                if (optJSONObject != null) {
                    C162457s7.A0J(str, 1);
                    String string3 = optJSONObject.getString("browsable_category");
                    String string4 = optJSONObject.getString("list_name");
                    ArrayList A0s4 = AnonymousClass001.A0s();
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("businesses");
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3 = C109065e1.A00(A0s4, jSONArray2, i3)) {
                    }
                    C162457s7.A0H(string3);
                    C162457s7.A0H(string4);
                    A0s3.add(new AnonymousClass7ZA(string3, string4, str, A0s4));
                }
            }
        }
        return new C152267Yf(A0s2, A0s, A0s3);
    }

    public String A06() {
        return "home";
    }

    public Map A07() {
        String str;
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass1VX r6 = this.A01;
        if (r6.A0X(2270)) {
            C149807Ny r2 = new C149807Ny("biz_categories");
            if (this.A00 <= 240) {
                str = "hdpi";
            } else {
                str = "xxhdpi";
            }
            r2.A00 = str;
            r2.A01 = "icon_spec";
            r2.A02 = r6.A0Q(3111);
            A0s.add(r2);
        }
        if (r6.A0X(2948)) {
            C149807Ny r1 = new C149807Ny("popular_biz");
            r1.A02 = r6.A0Q(2970);
            A0s.add(r1);
        }
        JSONArray jSONArray = this.A02;
        if (jSONArray != null) {
            for (String r0 : AnonymousClass0x7.A1b(C829345m.A01(new C72623e1(new AnonymousClass41E(jSONArray), C73723fy.A0R(C175708Zk.A02(0, jSONArray.length())))))) {
                C149807Ny r12 = new C149807Ny(r0);
                r12.A03 = "ENTERPRISE";
                r12.A02 = r6.A0Q(4312);
                A0s.add(r12);
            }
        }
        A0t.put("module_config", AnonymousClass5BK.A00(A0s));
        return A0t;
    }
}
