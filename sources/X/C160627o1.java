package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.7o1  reason: invalid class name and case insensitive filesystem */
public class C160627o1 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C160627o1)) {
            return false;
        }
        C160627o1 r4 = (C160627o1) obj;
        return AnonymousClass75J.A00(this.A01, r4.A01) && AnonymousClass75J.A00(this.A00, r4.A00) && AnonymousClass75J.A00(this.A02, r4.A02) && AnonymousClass75J.A00(this.A03, r4.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        return C18310x6.A08(this.A03, objArr, 3);
    }

    public String A01() {
        Object obj = this.A03.get(Integer.toString(-1));
        C626936e.A06(obj);
        return (String) obj;
    }

    public String A03(int i) {
        String A0o = C18310x6.A0o(Integer.toString(i), this.A03);
        if (A0o == null) {
            return "";
        }
        return A0o;
    }

    public C160627o1(String str, String str2, String str3, String str4, Map map) {
        this.A01 = str;
        this.A00 = str3;
        this.A02 = str4;
        map = map == null ? AnonymousClass001.A0t() : map;
        this.A03 = map;
        map.put(Integer.toString(-1), str2);
    }

    public static C160627o1 A00(String str) {
        HashMap A0t;
        Object obj;
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        JSONObject optJSONObject = A1H.optJSONObject("bundles");
        if (optJSONObject == null) {
            A0t = null;
        } else {
            A0t = AnonymousClass001.A0t();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String A0m = AnonymousClass001.A0m(keys);
                A0t.put(A0m, optJSONObject.getString(A0m));
            }
            if (A0t != null) {
                obj = A0t.get(Integer.toString(-1));
                String string = A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                C626936e.A06(obj);
                return new C160627o1(string, (String) obj, A1H.optString("locale_lang", (String) null), A1H.optString("url", (String) null), A0t);
            }
        }
        obj = "";
        String string2 = A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C626936e.A06(obj);
        return new C160627o1(string2, (String) obj, A1H.optString("locale_lang", (String) null), A1H.optString("url", (String) null), A0t);
    }

    public String A02() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
        A1G.put("locale_lang", this.A00);
        A1G.put("url", this.A02);
        return AnonymousClass0x9.A0y(new JSONObject(this.A03), "bundles", A1G);
    }
}
