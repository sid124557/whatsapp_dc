package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2ud  reason: invalid class name and case insensitive filesystem */
public class C58052ud {
    public static final HashMap A00 = AnonymousClass001.A0t();
    public static final HashMap A01 = AnonymousClass001.A0t();

    public static JSONObject A00(HashMap hashMap) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            A1G.put(Integer.toString(C18280x3.A06(A0w)), Long.toString(C18310x6.A0B(A0w.getValue())));
        }
        return A1G;
    }
}
