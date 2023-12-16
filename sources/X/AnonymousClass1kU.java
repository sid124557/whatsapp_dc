package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1kU  reason: invalid class name */
public class AnonymousClass1kU extends C151227Tx {
    public final C61202zs A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1kU r5 = (AnonymousClass1kU) obj;
            if (!this.A06.equals(r5.A06) || !this.A05.equals(r5.A05) || !this.A07.equals(r5.A07) || !this.A08.equals(r5.A08) || !this.A01.equals(r5.A01) || !this.A00.equals(r5.A00) || !AnonymousClass75J.A00(this.A02, r5.A02) || !AnonymousClass75J.A00(this.A04, r5.A04) || !AnonymousClass75J.A00(this.A03, r5.A03) || !AnonymousClass75J.A00(this.A02, r5.A02) || !AnonymousClass75J.A00(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        Object[] objArr = new Object[11];
        objArr[0] = this.A06;
        objArr[1] = this.A05;
        objArr[2] = this.A07;
        objArr[3] = this.A08;
        objArr[4] = this.A01;
        objArr[5] = this.A00;
        objArr[6] = this.A02;
        objArr[7] = this.A04;
        objArr[8] = this.A03;
        C142396x8 r0 = this.A02;
        String str2 = "";
        if (r0 == null) {
            str = str2;
        } else {
            str = r0.id;
        }
        objArr[9] = str;
        C142406x9 r02 = this.A03;
        if (r02 != null) {
            str2 = r02.id;
        }
        return C18310x6.A08(str2, objArr, 10);
    }

    public AnonymousClass1kU(C61202zs r1, C142396x8 r2, C142406x9 r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        super(r2, r3, str3);
        this.A06 = str;
        this.A05 = str2;
        this.A08 = list;
        this.A07 = str4;
        this.A01 = str5;
        this.A00 = r1;
        this.A02 = str6;
        this.A04 = str7;
        this.A03 = str8;
    }

    public static AnonymousClass1kU A00(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("icon_description");
        String string3 = jSONObject.getString("agree_button_text");
        String string4 = jSONObject.getString("icon_light_url");
        String string5 = jSONObject.getString("icon_dark_url");
        if (jSONObject.has("icon_role")) {
            str = jSONObject.getString("icon_role");
        } else {
            str = null;
        }
        if (jSONObject.has("icon_style")) {
            str2 = jSONObject.getString("icon_style");
        } else {
            str2 = null;
        }
        C47462dI r8 = new C47462dI(C61202zs.A00(jSONObject.getJSONObject("timing")), string4, string5, string2, string, string3);
        r8.A00 = AnonymousClass752.A00(str);
        r8.A01 = AnonymousClass753.A00(str2);
        JSONArray jSONArray = jSONObject.getJSONArray("bullets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string6 = jSONObject2.getString("bullet_text_");
            if (jSONObject2.has("bullet_icon_light_url_")) {
                str3 = jSONObject2.optString("bullet_icon_light_url_");
            } else {
                str3 = null;
            }
            if (jSONObject2.has("bullet_icon_dark_url_")) {
                str4 = jSONObject2.optString("bullet_icon_dark_url_");
            } else {
                str4 = null;
            }
            r8.A0A.add(new AnonymousClass5SH(string6, str3, str4));
        }
        if (jSONObject.has("body")) {
            r8.A03 = jSONObject.getString("body");
        }
        if (jSONObject.has("footer")) {
            r8.A05 = jSONObject.getString("footer");
        }
        if (jSONObject.has("dismiss_button_text")) {
            r8.A04 = jSONObject.getString("dismiss_button_text");
        }
        return r8.A00();
    }

    public JSONObject A02() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("title", this.A07);
        A1G.put("icon_description", this.A04);
        A1G.put("agree_button_text", this.A01);
        A1G.put("icon_light_url", this.A06);
        A1G.put("icon_dark_url", this.A05);
        C142396x8 r0 = this.A02;
        if (r0 != null) {
            A1G.put("icon_role", r0.id);
        }
        C142406x9 r02 = this.A03;
        if (r02 != null) {
            A1G.put("icon_style", r02.id);
        }
        A1G.put("timing", this.A00.A01());
        JSONArray A1F = AnonymousClass0x9.A1F();
        for (AnonymousClass5SH r4 : this.A08) {
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("bullet_text_", r4.A02);
            String str = r4.A01;
            if (str != null) {
                A1G2.put("bullet_icon_light_url_", str);
            }
            String str2 = r4.A00;
            if (str2 != null) {
                A1G2.put("bullet_icon_dark_url_", str2);
            }
            A1F.put(A1G2);
        }
        A1G.put("bullets", A1F);
        String str3 = this.A02;
        if (str3 != null) {
            A1G.put("body", str3);
        }
        String str4 = this.A04;
        if (str4 != null) {
            A1G.put("footer", str4);
        }
        String str5 = this.A03;
        if (str5 != null) {
            A1G.put("dismiss_button_text", str5);
        }
        return A1G;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeModal{iconLightUrl='");
        char A012 = C18300x5.A01(this.A06, A0o);
        A0o.append(", iconDarkUrl='");
        A0o.append(this.A05);
        A0o.append(A012);
        A0o.append("iconRole='");
        C142396x8 r0 = this.A02;
        String str2 = "null";
        if (r0 != null) {
            str = r0.name();
        } else {
            str = str2;
        }
        A0o.append(str);
        A0o.append(A012);
        A0o.append(", iconStyle='");
        C142406x9 r02 = this.A03;
        if (r02 != null) {
            str2 = r02.name();
        }
        A0o.append(str2);
        A0o.append(A012);
        A0o.append(", iconDescription='");
        A0o.append(this.A04);
        A0o.append(A012);
        A0o.append(", title='");
        A0o.append(this.A07);
        A0o.append(A012);
        A0o.append(", bulletPoints=");
        A0o.append(this.A08);
        A0o.append(", agreeButtonText='");
        A0o.append(this.A01);
        A0o.append(A012);
        A0o.append(", timing=");
        A0o.append(this.A00);
        A0o.append(", body='");
        A0o.append(this.A02);
        A0o.append(A012);
        A0o.append(", footer='");
        A0o.append(this.A04);
        A0o.append(A012);
        A0o.append(", dismissButtonText='");
        A0o.append(this.A03);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
