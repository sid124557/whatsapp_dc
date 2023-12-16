package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8DH  reason: invalid class name */
public class AnonymousClass8DH implements C835348u {
    public static String A00(Object obj, boolean z, boolean z2) {
        if ((obj instanceof List) || (obj instanceof Map)) {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                A03(jsonWriter, obj, z, z2);
                jsonWriter.close();
                return stringWriter.toString();
            } catch (IOException e) {
                return AnonymousClass000.A0P(e, "Exception in serialization ", AnonymousClass001.A0o());
            }
        } else if (obj == null) {
            return "";
        } else {
            return String.valueOf(obj);
        }
    }

    public static void A03(JsonWriter jsonWriter, Object obj, boolean z, boolean z2) {
        String valueOf;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            boolean A1Z = AnonymousClass001.A1Z(obj);
            if (z2) {
                jsonWriter.value(C18290x4.A09(A1Z ? 1 : 0));
            } else {
                jsonWriter.value(A1Z);
            }
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    Iterator A0q = AnonymousClass000.A0q((Map) obj);
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        treeMap.put(String.valueOf(A0w.getKey()), A0w.getValue());
                    }
                    Iterator A0u = AnonymousClass001.A0u(treeMap);
                    while (A0u.hasNext()) {
                        Map.Entry A0w2 = AnonymousClass001.A0w(A0u);
                        jsonWriter.name(C18310x6.A0q(A0w2));
                        A03(jsonWriter, A0w2.getValue(), z, z2);
                    }
                } else {
                    Iterator A0q2 = AnonymousClass000.A0q((Map) obj);
                    while (A0q2.hasNext()) {
                        Map.Entry A0w3 = AnonymousClass001.A0w(A0q2);
                        jsonWriter.name(String.valueOf(A0w3.getKey()));
                        A03(jsonWriter, A0w3.getValue(), z, z2);
                    }
                }
                jsonWriter.endObject();
                return;
            } else if (obj instanceof List) {
                jsonWriter.beginArray();
                Iterator A0q3 = C18320x8.A0q(obj);
                while (A0q3.hasNext()) {
                    A03(jsonWriter, A0q3.next(), z, z2);
                }
                jsonWriter.endArray();
                return;
            } else {
                valueOf = String.valueOf(obj);
            }
            jsonWriter.value(valueOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        X.C159567m6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B2m(X.C157967jD r7, X.C146787Bp r8, X.C151147Tp r9) {
        /*
            r6 = this;
            java.lang.String r4 = r8.A00     // Catch:{ all -> 0x00b8 }
            X.C159567m6.A01(r4)     // Catch:{ all -> 0x00b8 }
            int r0 = r4.hashCode()     // Catch:{ all -> 0x00b8 }
            r2 = 1
            r3 = 0
            r1 = -1
            switch(r0) {
                case -863899808: goto L_0x007a;
                case -826958968: goto L_0x0070;
                case -138615772: goto L_0x0066;
                case -138615771: goto L_0x005c;
                case 1509306073: goto L_0x0052;
                default: goto L_0x000f;
            }     // Catch:{ all -> 0x00b8 }
        L_0x000f:
            java.lang.String r5 = "Trying to decode malformed json"
            switch(r1) {
                case 0: goto L_0x003c;
                case 1: goto L_0x00aa;
                case 2: goto L_0x0097;
                case 3: goto L_0x0084;
                case 4: goto L_0x0024;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x00b8 }
        L_0x0014:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "Unknown lispy action type: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ all -> 0x00b8 }
            X.8Rb r1 = new X.8Rb     // Catch:{ all -> 0x00b8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b8 }
        L_0x0023:
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x0024:
            java.lang.Object r1 = r7.A04(r3)     // Catch:{ JSONException -> 0x0035 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0035 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0035 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0035 }
            java.util.ArrayList r0 = A01(r0)     // Catch:{ JSONException -> 0x0035 }
            goto L_0x00b4
        L_0x0035:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b8 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x0023
        L_0x003c:
            java.lang.Object r0 = r7.A04(r3)     // Catch:{ JSONException -> 0x004b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x004b }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x004b }
            java.util.HashMap r0 = A02(r0)     // Catch:{ JSONException -> 0x004b }
            goto L_0x00b4
        L_0x004b:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b8 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x0023
        L_0x0052:
            java.lang.String r0 = "bk.action.string.JsonDecodeArray"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x000f
            r1 = 4
            goto L_0x000f
        L_0x005c:
            java.lang.String r0 = "bk.action.string.JsonEncodeV3"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x000f
            r1 = 3
            goto L_0x000f
        L_0x0066:
            java.lang.String r0 = "bk.action.string.JsonEncodeV2"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x000f
            r1 = 2
            goto L_0x000f
        L_0x0070:
            java.lang.String r0 = "bk.action.string.JsonEncode"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x000f
            r1 = 1
            goto L_0x000f
        L_0x007a:
            java.lang.String r0 = "bk.action.string.JsonDecode"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x000f
            r1 = 0
            goto L_0x000f
        L_0x0084:
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x00b8 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00b8 }
            boolean r0 = X.C159427lo.A02(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = A00(r1, r0, r3)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b4
        L_0x0097:
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x00b8 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00b8 }
            boolean r0 = X.C159427lo.A02(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = A00(r1, r0, r2)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b4
        L_0x00aa:
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = A00(r0, r3, r2)     // Catch:{ all -> 0x00b8 }
        L_0x00b4:
            X.C159567m6.A00()
            return r0
        L_0x00b8:
            r0 = move-exception
            X.C159567m6.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DH.B2m(X.7jD, X.7Bp, X.7Tp):java.lang.Object");
    }

    public static ArrayList A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList A0I = AnonymousClass002.A0I(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C159427lo.A00(AnonymousClass6C9.A02(obj));
                    } else if (obj instanceof Float) {
                        obj = C159427lo.A00((double) AnonymousClass001.A05(obj));
                    } else {
                        if (obj instanceof Boolean) {
                            A0I.add(obj);
                        } else if (!(obj instanceof Long)) {
                        }
                    }
                }
            }
            A0I.add(obj);
        }
        return A0I;
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0m = AnonymousClass001.A0m(keys);
            Object obj = jSONObject.get(A0m);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C159427lo.A00(AnonymousClass6C9.A02(obj));
                    } else if (obj instanceof Float) {
                        obj = C159427lo.A00((double) AnonymousClass001.A05(obj));
                    } else if (obj instanceof Boolean) {
                        A0t.put(A0m, obj);
                    } else if (!(obj instanceof Long)) {
                    }
                }
            }
            A0t.put(A0m, obj);
        }
        return A0t;
    }
}
