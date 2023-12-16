package X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.5Yp  reason: invalid class name and case insensitive filesystem */
public class C106345Yp {
    public static Context A00;
    public static JSONObject A01 = AnonymousClass0x9.A1G();
    public static boolean A02;
    public static boolean A03;

    public static synchronized JSONObject A00() {
        JSONObject jSONObject;
        synchronized (C106345Yp.class) {
            jSONObject = A01;
            jSONObject.length();
        }
        return jSONObject;
    }
}
