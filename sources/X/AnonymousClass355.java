package X;

import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.355  reason: invalid class name */
public final class AnonymousClass355 {
    public static final String A01(String str, JSONObject jSONObject) {
        if (!jSONObject.isNull(str)) {
            String string = jSONObject.getString(str);
            C162457s7.A0H(string);
            return string;
        }
        String format = String.format(Locale.ENGLISH, "%s is null", Arrays.copyOf(new Object[]{str}, 1));
        C162457s7.A0D(format);
        throw new JSONException(format);
    }

    public static final String A02(String str, JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        return A03(str, jSONObject);
    }

    public static final String A03(String str, JSONObject jSONObject) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto L_0x002d
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.Iterator r2 = r4.keys()
            X.C162457s7.A0D(r2)
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            java.lang.Object r0 = r4.get(r1)
            X.C162457s7.A0H(r1)
            X.C162457s7.A0H(r0)
            java.lang.Object r0 = A00(r0)
            r3.put(r1, r0)
            goto L_0x0011
        L_0x002d:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0050
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r2 = r4.length()
            r1 = 0
        L_0x003c:
            if (r1 >= r2) goto L_0x004f
            java.lang.Object r0 = r4.get(r1)
            X.C162457s7.A0D(r0)
            java.lang.Object r0 = A00(r0)
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x003c
        L_0x004f:
            return r3
        L_0x0050:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass355.A00(java.lang.Object):java.lang.Object");
    }
}
