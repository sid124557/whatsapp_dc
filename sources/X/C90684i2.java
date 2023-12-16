package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4i2  reason: invalid class name and case insensitive filesystem */
public class C90684i2 extends C95444tg {
    public final AnonymousClass7H6 A00;
    public final C150967Sx A01;
    public final AnonymousClass5ZO A02;
    public final AnonymousClass1VX A03;
    public final Jid A04;

    public C90684i2(C55682qk r14, C181668n8 r15, C111525iE r16, AnonymousClass7H6 r17, C150967Sx r18, AnonymousClass5ZO r19, C57162tC r20, C620733j r21, AnonymousClass1VX r22, C184408rk r23, C59722xN r24, Jid jid, AnonymousClass8E9 r26, AnonymousClass4FS r27) {
        super(r14, r15, r26, r16, r20, r21, r23, r24, (AnonymousClass5ZI) null, r27);
        AnonymousClass1VX r1 = r22;
        this.A03 = r1;
        this.A01 = r18;
        this.A04 = jid;
        this.A02 = r19;
        this.A00 = r17;
        if (r1.A0X(3400)) {
            this.A00 = "3.0";
        }
    }

    public String A06() {
        return "recommendations";
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        String str;
        String str2;
        ArrayList A0s = AnonymousClass001.A0s();
        String optString = jSONObject.optString("request_id");
        JSONArray jSONArray = jSONObject.getJSONArray("business_profiles");
        for (int i = 0; i < jSONArray.length(); i = C95444tg.A00(optString, A0s, jSONArray, i)) {
        }
        Double valueOf = Double.valueOf(0.0d);
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        if (this.A03.A0X(3400)) {
            JSONArray optJSONArray = jSONObject.optJSONArray("filter_categories");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("subcategories");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2 = C95444tg.A01(A0s2, optJSONArray2, i2)) {
                }
            }
            if (optJSONArray != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3 = C95444tg.A01(A0s3, optJSONArray, i3)) {
                }
            }
            valueOf = Double.valueOf(jSONObject.optDouble("proximity_weight", 0.0d));
            str = jSONObject.optString("ranking_logic_ver");
            str2 = jSONObject.optString("page_id");
        } else {
            str2 = null;
            str = null;
        }
        return new AnonymousClass5TI(new C158367jr(), valueOf, str2, optString, str, jSONObject.getString("csvm_config"), A0s2, AnonymousClass001.A0s(), A0s, A0s3);
    }

    public Map A07() {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("business_jid", this.A04.getRawString());
        AnonymousClass1VX r1 = this.A03;
        if (r1.A0X(3400)) {
            C86654Ky.A1M(r1, A0t, 3399);
            AnonymousClass5ZO r0 = this.A02;
            if (r0 != null) {
                C95444tg.A03(r0, A0t);
            }
            C150967Sx r02 = this.A01;
            if (r02 != null) {
                A0t.put("filters", r02.A00());
            }
            C95444tg.A02(this.A00, A0t);
        }
        return A0t;
    }
}
