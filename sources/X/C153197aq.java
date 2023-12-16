package X;

import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7aq  reason: invalid class name and case insensitive filesystem */
public abstract class C153197aq {
    public final JSONObject A00;

    public final C153197aq A00(Class cls, String str) {
        JSONObject optJSONObject = this.A00.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (C153197aq) AnonymousClass6C9.A0b(cls, optJSONObject, new Class[]{JSONObject.class});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public final C129586aY A01() {
        JSONArray optJSONArray = this.A00.optJSONArray("blocked_codes");
        if (optJSONArray == null) {
            return null;
        }
        C129486aO r2 = new C129486aO();
        for (int i = 0; i < optJSONArray.length(); i++) {
            r2.add((Object) optJSONArray.optString(i));
        }
        return r2.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:4:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C129586aY A02(java.lang.Class r10, java.lang.String r11) {
        /*
            r9 = this;
            org.json.JSONObject r0 = r9.A00
            org.json.JSONArray r8 = r0.optJSONArray(r11)
            r7 = 0
            if (r8 != 0) goto L_0x000a
            return r7
        L_0x000a:
            r6 = 1
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r5 = 0
            r1[r5] = r0     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.reflect.Constructor r4 = r10.getConstructor(r1)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            X.6aO r3 = new X.6aO     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r2 = 0
        L_0x001c:
            int r0 = r8.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r2 >= r0) goto L_0x0036
            org.json.JSONObject r1 = r8.optJSONObject(r2)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r1 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r0[r5] = r1     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.add((java.lang.Object) r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0036:
            X.6aY r0 = r3.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            return r0
        L_0x003b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153197aq.A02(java.lang.Class, java.lang.String):X.6aY");
    }

    public final Enum A03(Enum enumR, String str) {
        String optString = this.A00.optString(str);
        if (optString == null) {
            return enumR;
        }
        try {
            return Enum.valueOf(enumR.getClass(), optString.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return enumR;
        }
    }

    public final String A04(String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public C153197aq(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }
}
