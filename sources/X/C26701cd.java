package X;

/* renamed from: X.1cd  reason: invalid class name and case insensitive filesystem */
public final class C26701cd extends C55922r8 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x024f, code lost:
        if (r16 == null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x025a, code lost:
        if (r17 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x025c, code lost:
        r28 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0302, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        X.AnonymousClass2A8.A00(r21, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0308, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0255 A[Catch:{ all -> 0x0302 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x00dd A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:179:0x0330=Splitter:B:179:0x0330, B:175:0x0321=Splitter:B:175:0x0321, B:172:0x0316=Splitter:B:172:0x0316} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0PJ A03(X.C25501ac r34, java.lang.String r35) {
        /*
            r33 = this;
            java.lang.String r25 = " processed in "
            java.lang.String r9 = "gif/search/giphy/data at "
            r7 = r33
            X.2sH r6 = r7.A03
            long r2 = r6.A0H()
            r0 = 10
            r24 = 0
            r8 = r34
            r32 = r35
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            java.net.URLConnection r10 = X.C18300x5.A0q(r32)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            X.C162457s7.A0K(r10, r0)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            javax.net.ssl.HttpsURLConnection r10 = (javax.net.ssl.HttpsURLConnection) r10     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            X.3FI r0 = r7.A09     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            X.C18280x3.A0z(r0, r10)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            X.C18270x1.A1J(r10)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            java.lang.String r0 = "GET"
            r10.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r10.connect()     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            long r0 = r6.A0H()     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r8.A03 = r0     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            long r19 = r6.A0H()     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            int r11 = r10.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            long r4 = r6.A0H()     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r0 = r19
            java.lang.Long r0 = X.C18310x6.A0f(r4, r0)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r8.A02 = r0     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r11)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r8.A04 = r0     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r11 == r0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            java.lang.String r0 = "gif/search/giphy/request failed "
            X.C18260x0.A0x(r0, r1, r11)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r0 = r32
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r9, r0)
            r0 = r25
            X.C56612sH.A0A(r6, r0, r1, r2)
            X.C55922r8.A00(r6, r8, r7, r2)
            return r24
        L_0x0073:
            r0 = r32
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r9, r0)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            java.lang.String r0 = " loaded in "
            X.C56612sH.A0A(r6, r0, r1, r2)     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r15 = 0
            r23 = 0
            r14 = 0
            X.2s4 r1 = r7.A02     // Catch:{ SocketTimeoutException -> 0x032f, IOException -> 0x0320, IllegalStateException -> 0x0315 }
            r22 = 0
            r0 = r22
            X.1zz r0 = X.C36851zz.A01(r1, r10, r0)     // Catch:{ SocketTimeoutException -> 0x0313, IOException -> 0x0311, IllegalStateException -> 0x030f }
            android.util.JsonReader r21 = X.C18300x5.A0D(r0)     // Catch:{ SocketTimeoutException -> 0x0313, IOException -> 0x0311, IllegalStateException -> 0x030f }
            r21.beginObject()     // Catch:{ all -> 0x0300 }
        L_0x0093:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0287
            java.lang.String r4 = r21.nextName()     // Catch:{ all -> 0x0300 }
            if (r4 == 0) goto L_0x0279
            int r1 = r4.hashCode()     // Catch:{ all -> 0x0300 }
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r1 == r0) goto L_0x00ce
            r0 = 3347973(0x331605, float:4.69151E-39)
            if (r1 == r0) goto L_0x00c0
            r0 = 1297692570(0x4d59379a, float:2.27768736E8)
            if (r1 != r0) goto L_0x0279
            java.lang.String r0 = "pagination"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0279
            java.lang.String r23 = X.AnonymousClass35I.A02(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0093
        L_0x00c0:
            java.lang.String r0 = "meta"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0279
            X.0PJ r15 = X.AnonymousClass35I.A00(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0093
        L_0x00ce:
            java.lang.String r0 = "data"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0279
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0300 }
            r21.beginArray()     // Catch:{ all -> 0x0300 }
        L_0x00dd:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0274
            r21.beginObject()     // Catch:{ all -> 0x0300 }
            r12 = 0
            r30 = r12
            r28 = r12
            r18 = r12
            r17 = r12
            r16 = r12
            r11 = r12
        L_0x00f2:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x023b
            java.lang.String r1 = r21.nextName()     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "id"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0109
            java.lang.String r30 = r21.nextString()     // Catch:{ all -> 0x0300 }
            goto L_0x00f2
        L_0x0109:
            java.lang.String r0 = "images"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0236
            r21.beginObject()     // Catch:{ all -> 0x0300 }
        L_0x0114:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0231
            java.lang.String r1 = r21.nextName()     // Catch:{ all -> 0x0300 }
            if (r1 == 0) goto L_0x0127
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0300 }
            switch(r0) {
                case -1762572285: goto L_0x012b;
                case -1290895667: goto L_0x0138;
                case -511616133: goto L_0x01a0;
                case 1107258473: goto L_0x01ae;
                case 1723279212: goto L_0x0215;
                case 1968782756: goto L_0x0223;
                default: goto L_0x0127;
            }     // Catch:{ all -> 0x0300 }
        L_0x0127:
            r21.skipValue()     // Catch:{ all -> 0x0300 }
            goto L_0x0114
        L_0x012b:
            java.lang.String r0 = "fixed_height_small_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0127
            X.7y8 r18 = X.AnonymousClass35I.A01(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0114
        L_0x0138:
            java.lang.String r0 = "preview_gif"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0127
            r21.beginObject()     // Catch:{ all -> 0x0300 }
            r12 = 0
            r13 = -1
            r10 = r12
            r5 = -1
        L_0x0148:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0194
            java.lang.String r4 = r21.nextName()     // Catch:{ all -> 0x0300 }
            if (r4 == 0) goto L_0x0190
            int r1 = r4.hashCode()     // Catch:{ all -> 0x0300 }
            r0 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            if (r1 == r0) goto L_0x0183
            r0 = 116079(0x1c56f, float:1.62661E-40)
            if (r1 == r0) goto L_0x0175
            r0 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r1 != r0) goto L_0x0190
            java.lang.String r0 = "width"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0190
            int r13 = X.C18290x4.A02(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0148
        L_0x0175:
            java.lang.String r0 = "url"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0190
            java.lang.String r10 = r21.nextString()     // Catch:{ all -> 0x0300 }
            goto L_0x0148
        L_0x0183:
            java.lang.String r0 = "height"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0190
            int r5 = X.C18290x4.A02(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0148
        L_0x0190:
            r21.skipValue()     // Catch:{ all -> 0x0300 }
            goto L_0x0148
        L_0x0194:
            r21.endObject()     // Catch:{ all -> 0x0300 }
            if (r10 == 0) goto L_0x0114
            X.7y8 r12 = new X.7y8     // Catch:{ all -> 0x0300 }
            r12.<init>(r10, r13, r5)     // Catch:{ all -> 0x0300 }
            goto L_0x0114
        L_0x01a0:
            java.lang.String r0 = "fixed_height_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0127
            X.7y8 r16 = X.AnonymousClass35I.A01(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0114
        L_0x01ae:
            java.lang.String r0 = "downsized_small"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0127
            r21.beginObject()     // Catch:{ all -> 0x0300 }
            r11 = 0
            r13 = -1
            r10 = r11
            r5 = -1
        L_0x01bd:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0209
            java.lang.String r4 = r21.nextName()     // Catch:{ all -> 0x0300 }
            if (r4 == 0) goto L_0x0205
            int r1 = r4.hashCode()     // Catch:{ all -> 0x0300 }
            r0 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            if (r1 == r0) goto L_0x01f8
            r0 = 108273(0x1a6f1, float:1.51723E-40)
            if (r1 == r0) goto L_0x01ea
            r0 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r1 != r0) goto L_0x0205
            java.lang.String r0 = "width"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0205
            int r13 = X.C18290x4.A02(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x01bd
        L_0x01ea:
            java.lang.String r0 = "mp4"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0205
            java.lang.String r10 = r21.nextString()     // Catch:{ all -> 0x0300 }
            goto L_0x01bd
        L_0x01f8:
            java.lang.String r0 = "height"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0205
            int r5 = X.C18290x4.A02(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x01bd
        L_0x0205:
            r21.skipValue()     // Catch:{ all -> 0x0300 }
            goto L_0x01bd
        L_0x0209:
            r21.endObject()     // Catch:{ all -> 0x0300 }
            if (r10 == 0) goto L_0x0114
            X.7y8 r11 = new X.7y8     // Catch:{ all -> 0x0300 }
            r11.<init>(r10, r13, r5)     // Catch:{ all -> 0x0300 }
            goto L_0x0114
        L_0x0215:
            java.lang.String r0 = "fixed_width_small_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0127
            X.7y8 r28 = X.AnonymousClass35I.A01(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0114
        L_0x0223:
            java.lang.String r0 = "fixed_width_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0127
            X.7y8 r17 = X.AnonymousClass35I.A01(r21)     // Catch:{ all -> 0x0300 }
            goto L_0x0114
        L_0x0231:
            r21.endObject()     // Catch:{ all -> 0x0300 }
            goto L_0x00f2
        L_0x0236:
            r21.skipValue()     // Catch:{ all -> 0x0300 }
            goto L_0x00f2
        L_0x023b:
            r21.endObject()     // Catch:{ all -> 0x0300 }
            if (r30 == 0) goto L_0x00dd
            if (r12 == 0) goto L_0x00dd
            if (r11 == 0) goto L_0x00dd
            int r1 = r11.A01     // Catch:{ all -> 0x0300 }
            int r0 = r11.A00     // Catch:{ all -> 0x0300 }
            if (r1 <= r0) goto L_0x024b
            goto L_0x0256
        L_0x024b:
            if (r18 != 0) goto L_0x025f
            if (r28 != 0) goto L_0x0253
            if (r16 != 0) goto L_0x025c
        L_0x0251:
            r28 = r17
        L_0x0253:
            if (r28 == 0) goto L_0x00dd
            goto L_0x0262
        L_0x0256:
            if (r28 != 0) goto L_0x0253
            if (r18 != 0) goto L_0x025f
            if (r17 != 0) goto L_0x0251
        L_0x025c:
            r28 = r16
            goto L_0x0253
        L_0x025f:
            r28 = r18
            goto L_0x0253
        L_0x0262:
            r31 = 1
            X.7yG r0 = new X.7yG     // Catch:{ all -> 0x0300 }
            r26 = r0
            r27 = r12
            r29 = r11
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0300 }
            r14.add(r0)     // Catch:{ all -> 0x0300 }
            goto L_0x00dd
        L_0x0274:
            r21.endArray()     // Catch:{ all -> 0x0300 }
            goto L_0x0093
        L_0x0279:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "gif/search/giphy/unexpected key - "
            X.C18260x0.A0t(r0, r4, r1)     // Catch:{ all -> 0x0300 }
            r21.skipValue()     // Catch:{ all -> 0x0300 }
            goto L_0x0093
        L_0x0287:
            r21.endObject()     // Catch:{ all -> 0x0300 }
            r21.close()     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            long r4 = r6.A0H()     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r0 = r19
            java.lang.Long r0 = X.C18310x6.A0f(r4, r0)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r8.A06 = r0     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r5 = 1
            if (r15 == 0) goto L_0x02d5
            java.lang.Object r4 = r15.A00     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            if (r4 == 0) goto L_0x02ac
            int r1 = r4.intValue()     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x02ac
            r22 = 1
        L_0x02ac:
            if (r22 != 0) goto L_0x02d5
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r4)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r0 = 40
            r1.append(r0)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.Object r0 = r15.A01     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.String r4 = X.C18260x0.A07(r0, r1)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.String r0 = "gif/search/giphy/got error: "
            X.C18260x0.A0t(r0, r4, r1)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.Integer r0 = X.C18290x4.A0c()     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r8.A01 = r0     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r8.A07 = r4     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            goto L_0x0342
        L_0x02d5:
            if (r14 != 0) goto L_0x02e5
            X.0PJ r4 = new X.0PJ     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r1 = r24
            r4.<init>(r1, r1)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r8.A01 = r0     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            goto L_0x02f1
        L_0x02e5:
            r0 = r23
            X.0PJ r4 = X.AnonymousClass0x9.A0G(r0, r14)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            r8.A01 = r0     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
        L_0x02f1:
            r0 = r32
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r9, r0)
            r0 = r25
            X.C56612sH.A0A(r6, r0, r1, r2)
            X.C55922r8.A00(r6, r8, r7, r2)
            return r4
        L_0x0300:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r1 = move-exception
            r0 = r21
            X.AnonymousClass2A8.A00(r0, r4)     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x030d, IOException -> 0x030b, IllegalStateException -> 0x0309 }
        L_0x0309:
            r0 = move-exception
            goto L_0x0316
        L_0x030b:
            r0 = move-exception
            goto L_0x0321
        L_0x030d:
            r0 = move-exception
            goto L_0x0330
        L_0x030f:
            r0 = move-exception
            goto L_0x0316
        L_0x0311:
            r0 = move-exception
            goto L_0x0321
        L_0x0313:
            r0 = move-exception
            goto L_0x0330
        L_0x0315:
            r0 = move-exception
        L_0x0316:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0353 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x0353 }
            r8.A01 = r0     // Catch:{ all -> 0x0353 }
            goto L_0x033e
        L_0x0320:
            r0 = move-exception
        L_0x0321:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0353 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x0353 }
            r8.A01 = r0     // Catch:{ all -> 0x0353 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            goto L_0x0342
        L_0x032f:
            r0 = move-exception
        L_0x0330:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0353 }
            java.lang.Integer r0 = X.C18290x4.A0a()     // Catch:{ all -> 0x0353 }
            r8.A01 = r0     // Catch:{ all -> 0x0353 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            goto L_0x0342
        L_0x033e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
        L_0x0342:
            r1.append(r9)
            r0 = r32
            r1.append(r0)
            r0 = r25
            X.C56612sH.A0A(r6, r0, r1, r2)
            X.C55922r8.A00(r6, r8, r7, r2)
            return r24
        L_0x0353:
            r4 = move-exception
            r0 = r32
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r9, r0)
            r0 = r25
            X.C56612sH.A0A(r6, r0, r1, r2)
            X.C55922r8.A00(r6, r8, r7, r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26701cd.A03(X.1ac, java.lang.String):X.0PJ");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26701cd(C56492s4 r2, C56612sH r3, C620733j r4, C64733Es r5, AnonymousClass4FV r6, C106095Xp r7, C52512lb r8, AnonymousClass3FI r9, AnonymousClass4FS r10) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        C18260x0.A0f(r3, r5, r7, r9, r10);
        C18260x0.A0W(r2, r6, r4);
        C162457s7.A0J(r8, 9);
    }
}
