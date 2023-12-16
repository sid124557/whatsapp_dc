package X;

/* renamed from: X.2tE  reason: invalid class name and case insensitive filesystem */
public class C57182tE {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ IllegalArgumentException | JSONException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[Catch:{ IllegalArgumentException | JSONException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[Catch:{ IllegalArgumentException | JSONException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[Catch:{ IllegalArgumentException | JSONException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d A[Catch:{ IllegalArgumentException | JSONException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007e A[Catch:{ IllegalArgumentException | JSONException -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C46402bZ A00(java.lang.String r12) {
        /*
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>(r12)
            int r0 = r7.length()
            r6 = 0
            r5 = 2
            if (r0 < r5) goto L_0x008c
            r0 = 0
            int r12 = r7.getInt(r0)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            r0 = 1
            java.lang.String r4 = r7.getString(r0)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r12 == 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            java.lang.String r3 = r7.getString(r5)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            goto L_0x0022
        L_0x001f:
            if (r12 == r5) goto L_0x001a
            r3 = r6
        L_0x0022:
            r2 = 3
            if (r12 != r5) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            r1 = r6
            if (r12 == r5) goto L_0x002f
            r8 = r6
            goto L_0x0034
        L_0x002b:
            java.lang.String r1 = r7.getString(r2)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
        L_0x002f:
            r0 = 4
            java.lang.String r8 = r7.getString(r0)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
        L_0x0034:
            byte[] r9 = android.util.Base64.decode(r4, r2)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r3 == 0) goto L_0x003f
            byte[] r10 = android.util.Base64.decode(r3, r2)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            goto L_0x0040
        L_0x003f:
            r10 = r6
        L_0x0040:
            if (r1 == 0) goto L_0x0047
            byte[] r11 = android.util.Base64.decode(r1, r2)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            goto L_0x0048
        L_0x0047:
            r11 = r6
        L_0x0048:
            if (r9 == 0) goto L_0x007e
            int r0 = r9.length     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 <= 0) goto L_0x007e
            X.2bZ r7 = new X.2bZ     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            int r0 = r7.A00     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 != 0) goto L_0x005e
            byte[] r0 = r7.A03     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 == 0) goto L_0x0077
            int r0 = r0.length     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 <= 0) goto L_0x0077
            return r7
        L_0x005e:
            if (r0 != r5) goto L_0x007d
            byte[] r0 = r7.A03     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 == 0) goto L_0x0077
            int r0 = r0.length     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 <= 0) goto L_0x0077
            byte[] r0 = r7.A04     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 == 0) goto L_0x0077
            int r0 = r0.length     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 <= 0) goto L_0x0077
            java.lang.String r0 = r7.A01     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            if (r0 != 0) goto L_0x0077
            return r7
        L_0x0077:
            java.lang.String r0 = "KeyData/failed to parse json/key data not valid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            return r6
        L_0x007d:
            return r7
        L_0x007e:
            java.lang.String r0 = "KeyData/failed to parse json/wrong data"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0086, IllegalArgumentException -> 0x0084 }
            return r6
        L_0x0084:
            r1 = move-exception
            goto L_0x0087
        L_0x0086:
            r1 = move-exception
        L_0x0087:
            java.lang.String r0 = "KeyData/failed to parse json"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x008c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57182tE.A00(java.lang.String):X.2bZ");
    }
}
