package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.4hy  reason: invalid class name and case insensitive filesystem */
public class C90644hy extends C95444tg {
    public final int A00;
    public final AnonymousClass5ZO A01;
    public final AnonymousClass1VX A02;

    public C90644hy(C55682qk r13, C181668n8 r14, C111525iE r15, AnonymousClass5ZO r16, C54292oU r17, C57162tC r18, C620733j r19, AnonymousClass1VX r20, C184408rk r21, C59722xN r22, AnonymousClass8E9 r23, AnonymousClass4FS r24) {
        super(r13, r14, r23, r15, r18, r19, r21, r22, (AnonymousClass5ZI) null, r24);
        this.A02 = r20;
        this.A01 = r16;
        this.A00 = AnonymousClass000.A0B(r17.A00).densityDpi;
    }

    public String A06() {
        return "home";
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(C132546fX.A00(jSONObject.getJSONArray("popular_categories")));
        A0s.add(C1450373x.A00(jSONObject.getJSONArray("popular_biz")));
        return A0s;
    }

    public Map A07() {
        Double d;
        Double d2;
        Object obj;
        String str;
        String str2;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass5ZO r4 = this.A01;
        String str3 = r4.A09;
        A0t.put("location_type", str3);
        if (str3.equals("country_default")) {
            obj = r4.A07;
            C626936e.A06(obj);
            str = "country_code";
        } else {
            boolean A08 = r4.A08();
            if (A08) {
                d = r4.A04;
            } else {
                d = r4.A02;
            }
            A0t.put("wa_biz_directory_lat", d);
            if (A08) {
                d2 = r4.A05;
            } else {
                d2 = r4.A03;
            }
            A0t.put("wa_biz_directory_long", d2);
            obj = r4.A06;
            str = "radius";
        }
        A0t.put(str, obj);
        AnonymousClass1VX r6 = this.A02;
        C86654Ky.A1M(r6, A0t, 2878);
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A00 <= 240) {
            str2 = "hdpi";
        } else {
            str2 = "xxhdpi";
        }
        A0t.put("screen_res", str2);
        C149807Ny r1 = new C149807Ny("popular_categories");
        r1.A00 = str2;
        r1.A01 = "screen_res";
        r1.A02 = r6.A0Q(4040);
        A0s.add(r1);
        if (r6.A0X(3161)) {
            C149807Ny r12 = new C149807Ny("popular_biz");
            r12.A02 = r6.A0Q(3173);
            A0s.add(r12);
        }
        A0t.put("module_config", AnonymousClass5BK.A00(A0s));
        return A0t;
    }
}
