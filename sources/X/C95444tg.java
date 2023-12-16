package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4tg  reason: invalid class name and case insensitive filesystem */
public abstract class C95444tg extends AnonymousClass8E7 {
    public String A00 = "1.0";
    public final C181688nA A01;
    public final AnonymousClass8r5 A02;
    public final C57162tC A03;
    public final C620733j A04;

    public C95444tg(C55682qk r10, C181668n8 r11, C181688nA r12, AnonymousClass8r5 r13, C57162tC r14, C620733j r15, C184408rk r16, C59722xN r17, AnonymousClass5ZI r18, AnonymousClass4FS r19) {
        super(r10, r11, r16, r17, r18, r19, "WA_BizDirectorySearch");
        this.A04 = r15;
        this.A01 = r12;
        this.A03 = r14;
        this.A02 = r13;
    }

    public static void A02(AnonymousClass7H6 r3, AbstractMap abstractMap) {
        if (r3 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_id", r3.A01);
            jSONObject.put("page_size", r3.A00);
            abstractMap.put("pagination", jSONObject);
        }
    }

    public static void A03(AnonymousClass5ZO r3, HashMap hashMap) {
        Double d;
        Double d2;
        String str;
        Object obj;
        String str2 = r3.A09;
        hashMap.put("location_type", str2);
        if (str2.equals("country_default")) {
            obj = r3.A07;
            C626936e.A06(obj);
            str = "country_code";
        } else {
            boolean A08 = r3.A08();
            if (A08) {
                d = r3.A04;
            } else {
                d = r3.A02;
            }
            hashMap.put("wa_biz_directory_lat", d);
            if (A08) {
                d2 = r3.A05;
            } else {
                d2 = r3.A03;
            }
            hashMap.put("wa_biz_directory_long", d2);
            str = "radius";
            obj = r3.A06;
        }
        hashMap.put(str, obj);
    }

    public int A0C() {
        return 19;
    }

    public int A0D() {
        if (this instanceof C90704i4) {
            return 1;
        }
        return 0;
    }

    public int A0E() {
        return 19;
    }

    public String A0F() {
        return C58172up.A08;
    }

    public void A0H(C149757Nt r9) {
        this.A02.BKM(r9.A02, r9.A00, r9.A01, A06(), r9.A04, r9.A03, 0);
    }

    public void A0I(Integer num, Integer num2) {
        this.A02.BJx(num, num2);
    }

    public void A0J(Integer num, Long l, String str, String str2, String str3, String str4) {
        this.A01.BKK(num, AnonymousClass0x2.A0T(), l, str, str2, str3, str4);
    }

    public void A0K(Integer num, Long l, String str, String str2, String str3, String str4) {
        this.A01.BKK(num, l, AnonymousClass0x2.A0T(), str, str2, "Cronet", str4);
    }

    public void A0L(String str) {
        this.A02.BKM((Integer) null, (Integer) null, (Integer) null, A06(), str, (String) null, 0);
    }

    public static int A00(String str, AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        C109065e1 A022 = C109065e1.A02(jSONArray.getJSONObject(i));
        A022.A03 = str;
        abstractCollection.add(A022);
        return i + 1;
    }

    public static int A01(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(C91824lC.A00(jSONArray.getJSONObject(i)));
        return i + 1;
    }

    public static void A04(AbstractMap abstractMap, Iterator it, JSONArray jSONArray) {
        String str;
        C150407Qp r2 = (C150407Qp) it.next();
        boolean z = r2 instanceof C132556fZ;
        if (z) {
            str = "product_images";
        } else if (r2 instanceof C132576fb) {
            str = "description";
        } else if (r2 instanceof AnonymousClass6fY) {
            str = "post_images";
        } else {
            str = "full_details";
        }
        jSONArray.put(str);
        if (z) {
            C132556fZ r22 = (C132556fZ) r2;
            abstractMap.put("product_image_width", Integer.valueOf(r22.A01));
            abstractMap.put("product_image_height", Integer.valueOf(r22.A00));
        }
    }

    public JSONObject A0G() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("locale", C620733j.A02(this.A04).toString());
        A1G.put("version", this.A00);
        if (!TextUtils.isEmpty(this.A01)) {
            A1G.put("credential", this.A01);
        }
        Iterator A0q = AnonymousClass000.A0q(A07());
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            A1G.put(C18310x6.A0q(A0w), A0w.getValue());
        }
        return A1G;
    }
}
