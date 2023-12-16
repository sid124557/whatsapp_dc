package X;

/* renamed from: X.1ce  reason: invalid class name and case insensitive filesystem */
public final class C26711ce extends C55922r8 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.AnonymousClass2A8.A00(r16, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0211, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0PJ A03(X.C25501ac r30, java.lang.String r31) {
        /*
            r29 = this;
            java.lang.String r22 = "gif/search/tenor/unknown_error"
            java.lang.String r7 = " processed in "
            java.lang.String r6 = "gif/search/tenor/data at "
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gif/search/tenor/requesting data at "
            r8 = r31
            X.C18260x0.A0q(r0, r8, r1)
            r5 = r29
            X.2sH r4 = r5.A03
            long r2 = r4.A0H()
            r0 = 10
            r14 = 0
            r9 = r30
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.net.URLConnection r12 = X.C18300x5.A0q(r8)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            X.C162457s7.A0K(r12, r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            X.3FI r0 = r5.A09     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            X.C18280x3.A0z(r0, r12)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            X.C18270x1.A1J(r12)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.String r0 = "GET"
            r12.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r12.connect()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            long r0 = r4.A0H()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A03 = r0     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            long r10 = r4.A0H()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            int r13 = r12.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            long r0 = r4.A0H()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r10)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A02 = r0     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r13)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A04 = r0     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r13 == r0) goto L_0x0077
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.String r0 = "gif/search/tenor/request failed "
            X.C18260x0.A0x(r0, r1, r13)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r6, r8)
            X.C56612sH.A0A(r4, r7, r0, r2)
            X.C55922r8.A00(r4, r9, r5, r2)
            return r14
        L_0x0077:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r8)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.String r0 = " loaded in "
            X.C56612sH.A0A(r4, r0, r1, r2)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r10 = 0
            r21 = 0
            r19 = -1
            r13 = 0
            r11 = 0
            long r17 = r4.A0H()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            X.2s4 r1 = r5.A02     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r0 = 0
            X.1zz r0 = X.C36851zz.A01(r1, r12, r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            android.util.JsonReader r16 = X.C18300x5.A0D(r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r16.beginObject()     // Catch:{ all -> 0x0209 }
        L_0x0099:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x01a3
            if (r10 != 0) goto L_0x01a3
            java.lang.String r1 = r16.nextName()     // Catch:{ all -> 0x0209 }
            if (r1 == 0) goto L_0x00ae
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0209 }
            switch(r0) {
                case -791787109: goto L_0x0193;
                case 3059181: goto L_0x0185;
                case 3377907: goto L_0x0176;
                case 96784904: goto L_0x00bb;
                case 1097546742: goto L_0x00c8;
                default: goto L_0x00ae;
            }     // Catch:{ all -> 0x0209 }
        L_0x00ae:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0209 }
            java.lang.String r0 = "gif/search/tenor/unexpected key - "
            X.C18260x0.A0t(r0, r1, r12)     // Catch:{ all -> 0x0209 }
        L_0x00b7:
            r16.skipValue()     // Catch:{ all -> 0x0209 }
            goto L_0x0099
        L_0x00bb:
            java.lang.String r0 = "error"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r10 = r16.nextString()     // Catch:{ all -> 0x0209 }
            goto L_0x0099
        L_0x00c8:
            java.lang.String r0 = "results"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x00ae
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0209 }
            r16.beginArray()     // Catch:{ all -> 0x0209 }
        L_0x00d8:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x019e
            r16.beginObject()     // Catch:{ all -> 0x0209 }
            r27 = 0
            r1 = r21
            r0 = r1
            r12 = r1
        L_0x00e7:
            boolean r14 = r16.hasNext()     // Catch:{ all -> 0x0209 }
            if (r14 == 0) goto L_0x0157
            java.lang.String r14 = r16.nextName()     // Catch:{ all -> 0x0209 }
            java.lang.String r15 = "id"
            boolean r15 = X.C162457s7.A0P(r14, r15)     // Catch:{ all -> 0x0209 }
            if (r15 == 0) goto L_0x00fe
            java.lang.String r27 = r16.nextString()     // Catch:{ all -> 0x0209 }
            goto L_0x00e7
        L_0x00fe:
            java.lang.String r15 = "media"
            boolean r14 = X.C162457s7.A0P(r14, r15)     // Catch:{ all -> 0x0209 }
            if (r14 == 0) goto L_0x0153
            r16.beginArray()     // Catch:{ all -> 0x0209 }
            r16.beginObject()     // Catch:{ all -> 0x0209 }
        L_0x010c:
            boolean r14 = r16.hasNext()     // Catch:{ all -> 0x0209 }
            if (r14 == 0) goto L_0x0142
            java.lang.String r14 = r16.nextName()     // Catch:{ all -> 0x0209 }
            java.lang.String r15 = "tinymp4"
            boolean r15 = X.C162457s7.A0P(r14, r15)     // Catch:{ all -> 0x0209 }
            if (r15 == 0) goto L_0x0128
            X.0PJ r12 = X.AnonymousClass279.A00(r16)     // Catch:{ all -> 0x0209 }
            java.lang.Object r12 = r12.A00     // Catch:{ all -> 0x0209 }
            X.7y8 r12 = (X.C166097y8) r12     // Catch:{ all -> 0x0209 }
            goto L_0x010c
        L_0x0128:
            java.lang.String r15 = "previewgif"
            boolean r14 = X.C162457s7.A0P(r14, r15)     // Catch:{ all -> 0x0209 }
            if (r14 == 0) goto L_0x013e
            X.0PJ r0 = X.AnonymousClass279.A00(r16)     // Catch:{ all -> 0x0209 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0209 }
            X.7y8 r1 = (X.C166097y8) r1     // Catch:{ all -> 0x0209 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0209 }
            X.7y8 r0 = (X.C166097y8) r0     // Catch:{ all -> 0x0209 }
            goto L_0x010c
        L_0x013e:
            r16.skipValue()     // Catch:{ all -> 0x0209 }
            goto L_0x010c
        L_0x0142:
            r16.endObject()     // Catch:{ all -> 0x0209 }
        L_0x0145:
            boolean r14 = r16.hasNext()     // Catch:{ all -> 0x0209 }
            if (r14 == 0) goto L_0x014f
            r16.skipValue()     // Catch:{ all -> 0x0209 }
            goto L_0x0145
        L_0x014f:
            r16.endArray()     // Catch:{ all -> 0x0209 }
            goto L_0x00e7
        L_0x0153:
            r16.skipValue()     // Catch:{ all -> 0x0209 }
            goto L_0x00e7
        L_0x0157:
            r16.endObject()     // Catch:{ all -> 0x0209 }
            if (r27 == 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00d8
            if (r0 == 0) goto L_0x00d8
            if (r12 == 0) goto L_0x00d8
            r28 = 2
            X.7yG r14 = new X.7yG     // Catch:{ all -> 0x0209 }
            r23 = r14
            r24 = r1
            r25 = r0
            r26 = r12
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0209 }
            r11.add(r14)     // Catch:{ all -> 0x0209 }
            goto L_0x00d8
        L_0x0176:
            java.lang.String r0 = "next"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r13 = r16.nextString()     // Catch:{ all -> 0x0209 }
            goto L_0x0099
        L_0x0185:
            java.lang.String r0 = "code"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x00ae
            long r19 = r16.nextLong()     // Catch:{ all -> 0x0209 }
            goto L_0x0099
        L_0x0193:
            java.lang.String r0 = "weburl"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0209 }
            if (r0 != 0) goto L_0x00b7
            goto L_0x00ae
        L_0x019e:
            r16.endArray()     // Catch:{ all -> 0x0209 }
            goto L_0x0099
        L_0x01a3:
            r16.endObject()     // Catch:{ all -> 0x0209 }
            r16.close()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            long r14 = r4.A0H()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r0 = r17
            java.lang.Long r0 = X.C18310x6.A0f(r14, r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A06 = r0     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            if (r10 == 0) goto L_0x01db
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r0 = r19
            r11.append(r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r0 = 40
            r11.append(r0)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.String r10 = X.C18260x0.A07(r10, r11)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.String r0 = "gif/search/tenor/got error: "
            X.C18260x0.A0t(r0, r10, r1)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.Integer r0 = X.C18290x4.A0c()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A01 = r0     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A07 = r10     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            goto L_0x0238
        L_0x01db:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r13)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            if (r0 == 0) goto L_0x01e4
            r13 = 0
        L_0x01e4:
            if (r11 != 0) goto L_0x01f4
            X.0PJ r10 = new X.0PJ     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r1 = r21
            r10.<init>(r1, r1)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A01 = r0     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            goto L_0x01fe
        L_0x01f4:
            X.0PJ r10 = X.AnonymousClass0x9.A0G(r13, r11)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            java.lang.Integer r0 = X.AnonymousClass001.A0f()     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            r9.A01 = r0     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
        L_0x01fe:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r6, r8)
            X.C56612sH.A0A(r4, r7, r0, r2)
            X.C55922r8.A00(r4, r9, r5, r2)
            return r10
        L_0x0209:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x020b }
        L_0x020b:
            r1 = move-exception
            r0 = r16
            X.AnonymousClass2A8.A00(r0, r10)     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x022c, IOException -> 0x021f, IllegalStateException -> 0x0212 }
        L_0x0212:
            r1 = move-exception
            r0 = r22
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0244 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x0244 }
            r9.A01 = r0     // Catch:{ all -> 0x0244 }
            goto L_0x0238
        L_0x021f:
            r1 = move-exception
            r0 = r22
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0244 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x0244 }
            r9.A01 = r0     // Catch:{ all -> 0x0244 }
            goto L_0x0238
        L_0x022c:
            r1 = move-exception
            java.lang.String r0 = "gif/search/tenor/timeout"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0244 }
            java.lang.Integer r0 = X.C18290x4.A0a()     // Catch:{ all -> 0x0244 }
            r9.A01 = r0     // Catch:{ all -> 0x0244 }
        L_0x0238:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r6, r8)
            X.C56612sH.A0A(r4, r7, r0, r2)
            X.C55922r8.A00(r4, r9, r5, r2)
            r0 = 0
            return r0
        L_0x0244:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r6, r8)
            X.C56612sH.A0A(r4, r7, r0, r2)
            X.C55922r8.A00(r4, r9, r5, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26711ce.A03(X.1ac, java.lang.String):X.0PJ");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26711ce(C56492s4 r2, C56612sH r3, C620733j r4, C64733Es r5, AnonymousClass4FV r6, C106095Xp r7, C52512lb r8, AnonymousClass3FI r9, AnonymousClass4FS r10) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        C18260x0.A0f(r3, r5, r7, r9, r10);
        C18260x0.A0W(r2, r6, r4);
        C162457s7.A0J(r8, 9);
    }
}
