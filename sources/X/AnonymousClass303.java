package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.303  reason: invalid class name */
public class AnonymousClass303 {
    public final String A00;
    public final JSONObject A01;

    public AnonymousClass303(AnonymousClass303... r2) {
        this((String) null, r2);
    }

    public void A01(AnonymousClass303 r6) {
        try {
            String str = r6.A00;
            if (str == null) {
                JSONObject jSONObject = r6.A01;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    this.A01.put(A0m, jSONObject.get(A0m));
                }
                return;
            }
            this.A01.put(str, r6.A01);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A02(String str, int i) {
        try {
            this.A01.put(str, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A03(String str, String str2) {
        try {
            this.A01.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A04(String str, boolean z) {
        try {
            this.A01.put(str, z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            String str = this.A00;
            if (str != null) {
                A1G.put(str, this.A01);
            } else {
                A1G = this.A01;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return A1G.toString();
    }

    public AnonymousClass303(String str, AnonymousClass303... r5) {
        this.A01 = AnonymousClass0x9.A1G();
        this.A00 = str;
        for (AnonymousClass303 A012 : r5) {
            A01(A012);
        }
    }
}
