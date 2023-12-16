package X;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: X.9TZ  reason: invalid class name */
public class AnonymousClass9TZ {
    public HashMap A00;
    public boolean A01 = false;
    public final C54292oU A02;
    public final C620933l A03;
    public final C1907099n A04;
    public final C192659Lb A05;

    public String A00(int i) {
        if (this.A04.A02.A0X(698)) {
            return A02(String.valueOf(i));
        }
        return null;
    }

    public String A01(Bundle bundle, String str) {
        String A022;
        if (bundle == null || !this.A04.A02.A0X(698) || (A022 = A02(String.valueOf(bundle.getInt("error_code")))) == null) {
            return str;
        }
        return A022;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d A[Catch:{ JSONException -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x012a A[Catch:{ JSONException -> 0x0167 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r15 = this;
            boolean r0 = r15.A01
            r3 = 1
            if (r0 == 0) goto L_0x000d
            java.util.HashMap r0 = r15.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0175
        L_0x000d:
            java.lang.String r4 = "payments_error_map.json"
            r1 = r15
            monitor-enter(r1)
            X.2oU r0 = r15.A02     // Catch:{ all -> 0x0164 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0164 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x0164 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0164 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0164 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0164 }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/ file name is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0162
        L_0x002c:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0158 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0158 }
            java.lang.String r0 = "PAY:ErrorMapMetadata/getMessage/Getting file from downloaded map"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0158 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0061 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0061 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0061 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0061 }
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/BufferedReader set on file"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0057 }
        L_0x0049:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0053
            r4.append(r0)     // Catch:{ all -> 0x0057 }
            goto L_0x0049
        L_0x0053:
            r2.close()     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0061 }
            goto L_0x0073
        L_0x0057:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0061 }
        L_0x0060:
            throw r1     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0061 }
        L_0x0061:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/IOException: "
            goto L_0x0070
        L_0x0069:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/FileNotFoundException: "
        L_0x0070:
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x0073:
            java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x014b }
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x014b }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x0167 }
            r15.A00 = r0     // Catch:{ JSONException -> 0x0167 }
            r15.A01 = r3     // Catch:{ JSONException -> 0x0167 }
            java.util.Iterator r14 = r7.keys()     // Catch:{ JSONException -> 0x0167 }
        L_0x0087:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r14.next()     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r6 = r0.toString()     // Catch:{ JSONException -> 0x0167 }
            r8 = 0
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0117 }
            java.lang.String r0 = "actions"
            org.json.JSONArray r12 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0117 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x0117 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x010a }
            r10 = 0
        L_0x00a9:
            int r0 = r12.length()     // Catch:{ Exception -> 0x010a }
            if (r10 >= r0) goto L_0x0106
            r13 = 0
            org.json.JSONObject r1 = r12.getJSONObject(r10)     // Catch:{ JSONException -> 0x00fe }
            if (r1 == 0) goto L_0x0103
            java.lang.String r0 = "type"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ JSONException -> 0x00e9 }
            java.lang.String r0 = "name"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x00e6 }
            if (r9 == 0) goto L_0x00f5
            java.lang.String r0 = "FAQ"
            boolean r0 = r9.equals(r0)     // Catch:{ JSONException -> 0x00e4 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "faq_data"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x00d9 }
            java.lang.String r0 = "faq_article_id"
            java.lang.String r13 = r1.getString(r0)     // Catch:{ JSONException -> 0x00d9 }
            goto L_0x00f5
        L_0x00d9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x00e4 }
            java.lang.String r0 = "PAY/ ErrorMapObject/ No article_id present. Exception: "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ JSONException -> 0x00e4 }
            goto L_0x00f5
        L_0x00e4:
            r2 = move-exception
            goto L_0x00ec
        L_0x00e6:
            r2 = move-exception
            r4 = r8
            goto L_0x00ec
        L_0x00e9:
            r2 = move-exception
            r9 = r8
            r4 = r8
        L_0x00ec:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x010a }
            java.lang.String r0 = "PAY/PaymentErrorMapActionList/getActionsList/ Exception : "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ Exception -> 0x010a }
        L_0x00f5:
            X.9SX r0 = new X.9SX     // Catch:{ Exception -> 0x010a }
            r0.<init>(r9, r4, r13)     // Catch:{ Exception -> 0x010a }
            r11.add(r0)     // Catch:{ Exception -> 0x010a }
            goto L_0x0103
        L_0x00fe:
            java.lang.String r0 = "PAY/ ErrorMapObject/ Action not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x010a }
        L_0x0103:
            int r10 = r10 + 1
            goto L_0x00a9
        L_0x0106:
            r5.addAll(r11)     // Catch:{ Exception -> 0x010a }
            goto L_0x0124
        L_0x010a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x0115 }
            java.lang.String r0 = "PAY/ PaymentErrorMapMetadata/ makeMap/ Exception: "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ JSONException -> 0x0115 }
            goto L_0x0124
        L_0x0115:
            r2 = move-exception
            goto L_0x0119
        L_0x0117:
            r2 = move-exception
            r5 = r8
        L_0x0119:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "PAY/ PaymentErrorMapMetadata/ makeMap/ No actions field found. Exception: "
            X.C18260x0.A1P(r1, r0, r2)     // Catch:{ JSONException -> 0x0167 }
            if (r5 == 0) goto L_0x012b
        L_0x0124:
            boolean r0 = r5.isEmpty()     // Catch:{ JSONException -> 0x0167 }
            if (r0 == 0) goto L_0x012b
            r5 = r8
        L_0x012b:
            java.util.HashMap r4 = r15.A00     // Catch:{ JSONException -> 0x0167 }
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "error_title"
            java.lang.String r2 = r1.optString(r0, r8)     // Catch:{ JSONException -> 0x0167 }
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ JSONException -> 0x0167 }
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0167 }
            X.9Oz r0 = new X.9Oz     // Catch:{ JSONException -> 0x0167 }
            r0.<init>(r2, r1, r5)     // Catch:{ JSONException -> 0x0167 }
            r4.put(r6, r0)     // Catch:{ JSONException -> 0x0167 }
            goto L_0x0087
        L_0x014b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: ErrorMapMetadata/parseToJson/JSONException: "
            X.C18260x0.A1Q(r1, r0, r2)
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/ JSONObject is null"
            goto L_0x0172
        L_0x0158:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: ErrorMapMetadata/getMessage/ FileNotFoundException: "
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x0162:
            r0 = 0
            return r0
        L_0x0164:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0167:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: ErrorMapMetadata/makeMap/JSONException: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
        L_0x0172:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0175:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TZ.A03():boolean");
    }

    public AnonymousClass9TZ(C54292oU r2, C620933l r3, C1907099n r4, C192659Lb r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public String A02(String str) {
        if (A03()) {
            if (this.A00.containsKey(str)) {
                C193529Oz r0 = (C193529Oz) this.A00.get(str);
                if (r0 != null) {
                    return r0.A00;
                }
            } else {
                C18260x0.A0r("PAY: ErrorMapMetadata/getMessage/Error code not found. Error code: ", str, AnonymousClass001.A0o());
            }
        }
        return null;
    }
}
