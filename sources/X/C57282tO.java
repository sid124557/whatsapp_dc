package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2tO  reason: invalid class name and case insensitive filesystem */
public final class C57282tO {
    public static final Iterator A01(JSONArray jSONArray) {
        return new C71983cz(new C72623e1(new C820241z(jSONArray), C73723fy.A0R(C175708Zk.A02(0, jSONArray.length()))));
    }

    public static final String A00(String str, JSONObject jSONObject, boolean z) {
        String str2;
        Object opt = jSONObject.opt(str);
        if (opt == null || opt.equals(JSONObject.NULL)) {
            str2 = null;
        } else {
            str2 = opt.toString();
        }
        if (!z || (str2 != null && str2.length() != 0)) {
            return str2;
        }
        return null;
    }
}
