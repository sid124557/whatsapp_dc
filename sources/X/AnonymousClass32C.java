package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.32C  reason: invalid class name */
public class AnonymousClass32C {
    public final AnonymousClass2SW A00;
    public final AnonymousClass4FX A01;

    public static void A01(Class cls, Object obj, String str, JSONObject jSONObject) {
        if (obj == null || !(cls == double[].class || cls == Double.class)) {
            jSONObject.put(str, obj);
        } else {
            jSONObject.put(str, new BigDecimal(((Number) obj).doubleValue(), MathContext.DECIMAL32).doubleValue());
        }
    }

    public AnonymousClass32C(AnonymousClass2SW r1, AnonymousClass4FX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static JSONArray A00(Class cls, Object obj) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 == null || !(cls == double[].class || cls == Double.class)) {
                A1F.put(obj2);
            } else {
                A1F.put(new BigDecimal(((Number) obj2).doubleValue(), MathContext.DECIMAL32).doubleValue());
            }
        }
        return A1F;
    }
}
