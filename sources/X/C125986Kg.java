package X;

import android.content.Context;

/* renamed from: X.6Kg  reason: invalid class name and case insensitive filesystem */
public class C125986Kg extends C172748Mo {
    public long A00;
    public final C185258tL A01;

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.C158827kc.A07.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        android.util.Log.e("MapConfig", "Unable to download config", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01cf, code lost:
        if (r3 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022c, code lost:
        if (r3 != null) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0231, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0232, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0233, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r0.importance == 100) goto L_0x0035;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x01c1 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c1 A[EDGE_INSN: B:54:0x01c1->B:55:? ?: BREAK  , PHI: r3 
      PHI: (r3v6 java.io.InputStream) = (r3v2 java.io.InputStream), (r3v2 java.io.InputStream), (r3v2 java.io.InputStream), (r3v7 java.io.InputStream), (r3v8 java.io.InputStream), (r3v8 java.io.InputStream) binds: [B:19:0x0076, B:20:?, B:21:0x008c, B:51:0x01bc, B:22:?, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:54:0x01c1] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c7 A[ExcHandler: IOException (r2v9 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v5 java.io.InputStream) = (r3v2 java.io.InputStream), (r3v2 java.io.InputStream), (r3v7 java.io.InputStream), (r3v8 java.io.InputStream) binds: [B:19:0x0076, B:20:?, B:51:0x01bc, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE], Splitter:B:19:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0232 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r30 = this;
            r6 = r30
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            java.lang.String r2 = X.C161247pI.A03
            if (r2 == 0) goto L_0x001b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "&country="
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r2, r1)
        L_0x0017:
            r0 = 512(0x200, float:7.175E-43)
            r3 = 0
            goto L_0x0076
        L_0x001b:
            X.8tL r3 = r6.A01
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x0017
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0035
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r1 = r0.importance
            r0 = 100
            if (r1 != r0) goto L_0x0017
        L_0x0035:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x004f
            android.content.Context r1 = X.C161247pI.A02
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0017
            android.content.Context r1 = X.C161247pI.A02
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0017
        L_0x004f:
            android.location.Location r3 = r3.B6T()
            if (r3 == 0) goto L_0x0017
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r2)
            java.lang.String r0 = "&latitude="
            r2.append(r0)
            double r0 = r3.getLatitude()
            r2.append(r0)
            java.lang.String r0 = "&longitude="
            r2.append(r0)
            double r0 = r3.getLongitude()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            goto L_0x0017
        L_0x0076:
            byte[] r5 = new byte[r0]     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            java.lang.String r0 = X.C161247pI.A0D     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            r1.append(r0)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            java.lang.String r0 = X.C161247pI.A0C     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            java.io.InputStream r3 = r0.openStream()     // Catch:{ IOException -> 0x01b9, Exception -> 0x01c1, all -> 0x0232 }
            r4 = 0
            r2 = 0
        L_0x0092:
            int r0 = r5.length     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            int r0 = r0 - r2
            int r1 = r3.read(r5, r2, r0)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            r0 = -1
            if (r1 == r0) goto L_0x00aa
            int r2 = r2 + r1
            int r0 = r5.length     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            if (r2 < r0) goto L_0x0092
            int r0 = r5.length     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            int r0 = r0 << 1
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            int r0 = r5.length     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            java.lang.System.arraycopy(r5, r4, r1, r4, r0)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            r5 = r1
            goto L_0x0092
        L_0x00aa:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            r0.<init>(r5, r4, r2)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            java.lang.String r0 = "data"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            org.json.JSONObject r9 = r0.getJSONObject(r4)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1 }
            r3.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            if (r9 == 0) goto L_0x01d4
            java.lang.String r23 = "south"
            java.lang.String r22 = "east"
            java.lang.String r21 = "north"
            java.lang.String r20 = "west"
            java.lang.String r15 = "rectangles"
            X.7Ou r0 = X.C161247pI.A0B
            java.lang.String r0 = r0.A01
            java.lang.String r14 = "base_url"
            java.lang.String r24 = r9.optString(r14, r0)
            X.7Ou r0 = X.C161247pI.A0B
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "static_base_url"
            java.lang.String r25 = r9.optString(r0, r1)
            java.lang.String r0 = "osm_config"
            org.json.JSONObject r1 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x0140 }
            java.lang.String r0 = "zoom_threshold"
            int r16 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0140 }
            org.json.JSONArray r12 = r1.getJSONArray(r15)     // Catch:{ JSONException -> 0x0140 }
            int r8 = r12.length()     // Catch:{ JSONException -> 0x0140 }
            android.graphics.Rect[] r0 = new android.graphics.Rect[r8]     // Catch:{ JSONException -> 0x0140 }
            r19 = r0
            r7 = 1
            int r7 = r7 << r16
            r5 = 0
        L_0x00fc:
            if (r5 >= r8) goto L_0x014c
            org.json.JSONObject r4 = r12.getJSONObject(r5)     // Catch:{ JSONException -> 0x0140 }
            double r2 = (double) r7     // Catch:{ JSONException -> 0x0140 }
            r0 = r20
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0140 }
            double r10 = X.C106725a3.A01(r0)     // Catch:{ JSONException -> 0x0140 }
            double r0 = r2 * r10
            int r10 = (int) r0     // Catch:{ JSONException -> 0x0140 }
            r0 = r21
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0140 }
            double r17 = X.C106725a3.A00(r0)     // Catch:{ JSONException -> 0x0140 }
            double r0 = r2 * r17
            int r11 = (int) r0     // Catch:{ JSONException -> 0x0140 }
            r0 = r22
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0140 }
            double r17 = X.C106725a3.A01(r0)     // Catch:{ JSONException -> 0x0140 }
            double r0 = r2 * r17
            int r13 = (int) r0     // Catch:{ JSONException -> 0x0140 }
            r0 = r23
            double r0 = r4.getDouble(r0)     // Catch:{ JSONException -> 0x0140 }
            double r0 = X.C106725a3.A00(r0)     // Catch:{ JSONException -> 0x0140 }
            double r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ JSONException -> 0x0140 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ JSONException -> 0x0140 }
            r1.<init>(r10, r11, r13, r0)     // Catch:{ JSONException -> 0x0140 }
            r19[r5] = r1     // Catch:{ JSONException -> 0x0140 }
            int r5 = r5 + 1
            goto L_0x00fc
        L_0x0140:
            X.7Ou r0 = X.C161247pI.A0B
            int r0 = r0.A00
            r16 = r0
            X.7Ou r0 = X.C161247pI.A0B
            android.graphics.Rect[] r0 = r0.A04
            r19 = r0
        L_0x014c:
            java.lang.String r0 = "url_override_config"
            org.json.JSONArray r12 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x01f7 }
            int r7 = r12.length()     // Catch:{ JSONException -> 0x01f7 }
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ JSONException -> 0x01f7 }
            X.7iL[][] r5 = new X.C157467iL[r7][]     // Catch:{ JSONException -> 0x01f7 }
            r4 = 0
        L_0x015b:
            if (r4 >= r7) goto L_0x01ff
            org.json.JSONObject r1 = r12.getJSONObject(r4)     // Catch:{ JSONException -> 0x01f7 }
            java.lang.String r0 = r1.getString(r14)     // Catch:{ JSONException -> 0x01f7 }
            r10[r4] = r0     // Catch:{ JSONException -> 0x01f7 }
            org.json.JSONArray r11 = r1.getJSONArray(r15)     // Catch:{ JSONException -> 0x01f7 }
            int r8 = r11.length()     // Catch:{ JSONException -> 0x01f7 }
            X.7iL[] r0 = new X.C157467iL[r8]     // Catch:{ JSONException -> 0x01f7 }
            r5[r4] = r0     // Catch:{ JSONException -> 0x01f7 }
            r3 = 0
        L_0x0174:
            if (r3 >= r8) goto L_0x01b6
            X.7iL r2 = new X.7iL     // Catch:{ JSONException -> 0x01f7 }
            r2.<init>()     // Catch:{ JSONException -> 0x01f7 }
            org.json.JSONObject r9 = r11.getJSONObject(r3)     // Catch:{ JSONException -> 0x01f7 }
            r0 = r20
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f7 }
            double r0 = X.C106725a3.A01(r0)     // Catch:{ JSONException -> 0x01f7 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x01f7 }
            r0 = r21
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f7 }
            double r0 = X.C106725a3.A00(r0)     // Catch:{ JSONException -> 0x01f7 }
            r2.A03 = r0     // Catch:{ JSONException -> 0x01f7 }
            r0 = r22
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f7 }
            double r0 = X.C106725a3.A01(r0)     // Catch:{ JSONException -> 0x01f7 }
            r2.A02 = r0     // Catch:{ JSONException -> 0x01f7 }
            r0 = r23
            double r0 = r9.getDouble(r0)     // Catch:{ JSONException -> 0x01f7 }
            double r0 = X.C106725a3.A00(r0)     // Catch:{ JSONException -> 0x01f7 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x01f7 }
            r0 = r5[r4]     // Catch:{ JSONException -> 0x01f7 }
            r0[r3] = r2     // Catch:{ JSONException -> 0x01f7 }
            int r3 = r3 + 1
            goto L_0x0174
        L_0x01b6:
            int r4 = r4 + 1
            goto L_0x015b
        L_0x01b9:
            r1 = move-exception
            java.lang.String r0 = "Exception while loading map config"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
            throw r0     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c1, all -> 0x0232 }
        L_0x01c1:
            X.7kc r0 = X.C158827kc.A07     // Catch:{ all -> 0x022b }
            r0.A01()     // Catch:{ all -> 0x022b }
            goto L_0x01cf
        L_0x01c7:
            r2 = move-exception
            java.lang.String r1 = "MapConfig"
            java.lang.String r0 = "Unable to download config"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x022b }
        L_0x01cf:
            if (r3 == 0) goto L_0x01d4
            r3.close()     // Catch:{ IOException -> 0x01d4 }
        L_0x01d4:
            long r2 = r6.A00
            r4 = 3
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x021e
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "MapConfigUpdateDispatchable"
            X.C161847qe.A01(r6)
            r6.A02 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 + r2
            r6.A01 = r0
            X.7FF r0 = X.C161847qe.A00()
            java.util.concurrent.BlockingQueue r0 = r0.A00
            r0.add(r6)
            return
        L_0x01f7:
            X.7Ou r0 = X.C161247pI.A0B
            java.lang.String[] r10 = r0.A05
            X.7Ou r0 = X.C161247pI.A0B
            X.7iL[][] r5 = r0.A06
        L_0x01ff:
            X.7Ou r23 = new X.7Ou
            r26 = r19
            r27 = r10
            r28 = r5
            r29 = r16
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.C161247pI.A0B = r23
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C161247pI.A00 = r0
            X.6KY r1 = new X.6KY
            r1.<init>()
            android.os.Handler r0 = X.C161847qe.A02
            r0.post(r1)
        L_0x021e:
            r0 = 0
            r6.A00 = r0
            r0 = 0
            X.C161247pI.A06 = r0
            java.util.concurrent.Semaphore r0 = X.C161247pI.A0A
            r0.release()
            return
        L_0x022b:
            r0 = move-exception
            if (r3 == 0) goto L_0x0233
            r3.close()     // Catch:{ IOException -> 0x0233 }
            throw r0
        L_0x0232:
            r0 = move-exception
        L_0x0233:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125986Kg.run():void");
    }

    public C125986Kg(Context context) {
        C185258tL r1 = null;
        if (C161247pI.A03 == null) {
            try {
                AnonymousClass76J.A00(context);
                r1 = AnonymousClass76J.A00.Azl();
            } catch (AnonymousClass8RB unused) {
                C158827kc.A07.A01();
            }
        }
        this.A01 = r1;
    }
}
