package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2oc  reason: invalid class name and case insensitive filesystem */
public class C54372oc {
    public final SharedPreferences A00;
    public final String A01;

    public JSONObject A01(String str) {
        String A0Z = C18280x3.A0Z(this.A00, AnonymousClass000.A0h(AnonymousClass000.A0l(this.A01), str.hashCode()));
        if (A0Z == null) {
            A0Z = "{}";
        }
        try {
            return AnonymousClass0x9.A1H(A0Z);
        } catch (JSONException unused) {
            return AnonymousClass0x9.A1G();
        }
    }

    public void A02(String str) {
        C18270x1.A0n(this.A00, AnonymousClass000.A0h(AnonymousClass000.A0l(this.A01), str.hashCode()));
    }

    public C54372oc(SharedPreferences sharedPreferences, String str) {
        this.A01 = AnonymousClass000.A0X("/", AnonymousClass000.A0l(str));
        this.A00 = sharedPreferences;
    }

    public Map A00() {
        JSONObject jSONObject;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(this.A00.getAll());
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (C18310x6.A0q(A0w).startsWith(this.A01)) {
                try {
                    jSONObject = AnonymousClass0x9.A1H((String) A0w.getValue());
                } catch (JSONException unused) {
                    jSONObject = AnonymousClass0x9.A1G();
                }
                if (jSONObject.length() > 0) {
                    String optString = jSONObject.optString("path", "");
                    if (!optString.isEmpty()) {
                        A0t.put(optString, jSONObject);
                    }
                }
            }
        }
        return A0t;
    }

    public void A03(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("path", str);
        } catch (JSONException unused) {
        }
        C18270x1.A0e(this.A00.edit(), jSONObject, AnonymousClass000.A0h(AnonymousClass000.A0l(this.A01), str.hashCode()));
    }
}
