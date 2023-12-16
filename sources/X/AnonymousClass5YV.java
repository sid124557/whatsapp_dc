package X;

import org.json.JSONObject;

/* renamed from: X.5YV  reason: invalid class name */
public abstract class AnonymousClass5YV {
    public static String A02(int i, String str) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("success", false);
        A1G.put("error_code", i);
        A1G.put("error_message", str);
        return A1G.toString();
    }

    public static String A03(Object obj) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("success", true);
        A1G.putOpt("result", obj);
        return A1G.toString();
    }
}
