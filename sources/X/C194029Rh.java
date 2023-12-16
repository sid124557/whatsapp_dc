package X;

import org.json.JSONObject;

/* renamed from: X.9Rh  reason: invalid class name and case insensitive filesystem */
public class C194029Rh {
    public C620633i A00;
    public C56612sH A01;
    public C620933l A02;
    public C160757oG A03 = C160757oG.A00("NetworkDeviceIdManager", "infra", "COMMON");
    public JSONObject A04;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(int r11) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            org.json.JSONObject r1 = r10.A04     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0036
            X.33l r0 = r10.A02     // Catch:{ JSONException -> 0x0020 }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ JSONException -> 0x0020 }
            java.lang.String r0 = "payments_network_id_map"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)     // Catch:{ JSONException -> 0x0020 }
            if (r0 == 0) goto L_0x001b
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0020 }
        L_0x0018:
            r10.A04 = r1     // Catch:{ JSONException -> 0x0020 }
            goto L_0x0036
        L_0x001b:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0020 }
            goto L_0x0018
        L_0x0020:
            r3 = move-exception
            X.7oG r2 = r10.A03     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "JSONObject instantiation "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)     // Catch:{ all -> 0x00ca }
            r2.A05(r0)     // Catch:{ all -> 0x00ca }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x00ca }
            r10.A04 = r1     // Catch:{ all -> 0x00ca }
        L_0x0036:
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00ca }
            r0 = 0
            java.lang.String r3 = r1.optString(r7, r0)     // Catch:{ all -> 0x00ca }
            monitor-exit(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x005e
            X.7oG r2 = r10.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getNetworkId with CARD "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ": from cache: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            r2.A04(r0)
            return r3
        L_0x005e:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            X.33i r0 = r10.A00
            X.5UR r0 = r0.A0R()
            java.lang.String r0 = X.C627236i.A01(r0)
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            byte[] r8 = r0.getBytes()
            r0 = 1
            if (r11 == r0) goto L_0x0087
            r0 = 5
            if (r11 == r0) goto L_0x0087
            r3 = 0
        L_0x0085:
            monitor-enter(r9)
            goto L_0x00aa
        L_0x0087:
            r6 = 128(0x80, float:1.794E-43)
            r5 = 150(0x96, float:2.1E-43)
            java.lang.String r4 = "PBKDF2WithHmacSHA1And8BIT"
            int r3 = r8.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x0091:
            if (r1 >= r3) goto L_0x009b
            byte r0 = r8[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0091
        L_0x009b:
            javax.crypto.SecretKey r0 = X.C627236i.A08(r4, r8, r2, r6, r5)
            byte[] r1 = r0.getEncoded()
            r0 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r0)
            goto L_0x0085
        L_0x00aa:
            org.json.JSONObject r0 = r10.A04     // Catch:{ JSONException -> 0x00c1 }
            r0.put(r7, r3)     // Catch:{ JSONException -> 0x00c1 }
            X.33l r1 = r10.A02     // Catch:{ JSONException -> 0x00c1 }
            org.json.JSONObject r0 = r10.A04     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x00c1 }
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r1)     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r0 = "payments_network_id_map"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ JSONException -> 0x00c1 }
            goto L_0x00c8
        L_0x00c1:
            X.7oG r1 = r10.A03     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "setDeviceId :: failed"
            r1.A05(r0)     // Catch:{ all -> 0x00ca }
        L_0x00c8:
            monitor-exit(r9)
            return r3
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194029Rh.A00(int):java.lang.String");
    }

    public C194029Rh(C620633i r4, C56612sH r5, C620933l r6) {
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
    }
}
