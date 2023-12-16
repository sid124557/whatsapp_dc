package X;

/* renamed from: X.3Mp  reason: invalid class name and case insensitive filesystem */
public class C66743Mp implements C84544Ct {
    public Boolean A00;
    public final C56492s4 A01;
    public final C29441ip A02;
    public final C56612sH A03;
    public final AnonymousClass1VX A04;
    public final C49532gg A05;
    public final C56432ry A06;
    public final C60442yZ A07;
    public final C55132pq A08;
    public final AnonymousClass3FI A09;
    public final C183538qC A0A;

    public void BlE(C56172rX r2, boolean z) {
        BlG(r2, 0, z, false);
    }

    public void BlG(C56172rX r7, int i, boolean z, boolean z2) {
        A00(r7, i, z, z2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:207:0x04c7 A[LOOP:0: B:22:0x0063->B:207:0x04c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x01f7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C56172rX r49, int r50, boolean r51, boolean r52, boolean r53) {
        /*
            r48 = this;
            r6 = r48
            X.1ip r0 = r6.A02
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0049
            X.2ry r5 = r6.A06
            int r1 = r5.A00()
            r0 = 2
            r4 = 0
            r14 = 1
            r47 = r49
            r35 = r51
            if (r1 == r0) goto L_0x003a
            r0 = 13
            if (r1 == r0) goto L_0x003a
            r0 = 15
            if (r1 == r0) goto L_0x003a
            if (r53 != 0) goto L_0x003a
            r0 = r47
            X.2ru r1 = r0.A04
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x003a
            X.2rT r0 = r1.A00
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x04cb
            java.lang.String r0 = "PrivateStatsUploader/maybeRotateBuffer: cannot rotate since there is no data"
        L_0x0037:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x003a:
            r0 = r47
            X.2ru r0 = r0.A04
            r46 = r0
            boolean r0 = r46.A06()
            if (r0 != 0) goto L_0x004a
            r5.A01()
        L_0x0049:
            return
        L_0x004a:
            r0 = r47
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0053
            r47.A02()
        L_0x0053:
            android.util.SparseArray r27 = r46.A00()
            int r0 = r27.size()
            java.util.ArrayList r26 = X.AnonymousClass002.A0I(r0)
            r27.size()
            r15 = 0
        L_0x0063:
            int r0 = r27.size()
            r32 = r50
            r36 = r52
            if (r15 >= r0) goto L_0x01fb
            r0 = r27
            int r25 = r0.keyAt(r15)
            r1 = r0
            r0 = r25
            java.lang.Object r7 = r1.get(r0)
            byte[] r7 = (byte[]) r7
            long r18 = android.os.SystemClock.elapsedRealtime()
            java.lang.Integer r24 = X.C18290x4.A0c()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r4)
            r1 = r24
            r0 = r23
            android.util.Pair r22 = android.util.Pair.create(r1, r0)
            java.lang.String r0 = "PrivateStatsUploader/doUpload in doUpload"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            monitor-enter(r5)
            boolean r0 = r5.A07()     // Catch:{ all -> 0x04fe }
            r2 = 0
            if (r0 != 0) goto L_0x0102
            X.2qn r10 = r5.A05     // Catch:{ all -> 0x04fe }
            android.content.SharedPreferences r1 = r10.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "original_token"
            java.lang.String r21 = r1.getString(r0, r2)     // Catch:{ all -> 0x04fe }
            if (r21 == 0) goto L_0x00e2
            android.content.SharedPreferences r1 = r10.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "redeem_count"
            int r9 = X.C18310x6.A03(r1, r0)     // Catch:{ all -> 0x04fe }
            X.2sH r0 = r5.A03     // Catch:{ all -> 0x04fe }
            long r16 = X.C56612sH.A00(r0)     // Catch:{ all -> 0x04fe }
            android.content.SharedPreferences r8 = r10.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r3 = "base_timestamp"
            r0 = 0
            long r11 = r8.getLong(r3, r0)     // Catch:{ all -> 0x04fe }
            long r16 = r16 - r11
            if (r9 < 0) goto L_0x00e2
            r3 = 512(0x200, float:7.175E-43)
            if (r9 >= r3) goto L_0x00e2
            android.content.SharedPreferences r8 = r10.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r3 = "time_to_live"
            long r8 = r8.getLong(r3, r0)     // Catch:{ all -> 0x04fe }
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e2
            monitor-exit(r5)
            goto L_0x0105
        L_0x00e2:
            boolean r0 = r5.A0D     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "PrivateStatsToken/getCredentialToken: no valid token and not in progress of generating, compute a new token"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x04fe }
            r5.A0D = r14     // Catch:{ all -> 0x04fe }
            r5.A05(r4)     // Catch:{ all -> 0x04fe }
        L_0x00f0:
            android.content.SharedPreferences r1 = r10.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "token_not_ready_reason"
            int r0 = r1.getInt(r0, r4)     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0102
            r0 = 13
            r10.A03(r0)     // Catch:{ all -> 0x04fe }
        L_0x0102:
            monitor-exit(r5)
            r21 = r2
        L_0x0105:
            r20 = 0
            if (r21 == 0) goto L_0x01a9
            monitor-enter(r5)
            X.2qn r12 = r5.A05     // Catch:{ all -> 0x04fe }
            android.content.SharedPreferences r1 = r12.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "shared_secret"
            java.lang.String r1 = r1.getString(r0, r2)     // Catch:{ all -> 0x04fe }
            if (r1 == 0) goto L_0x0193
            r0 = 8
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0193
            byte[] r11 = X.C380825n.A00(r7, r0)     // Catch:{ Exception -> 0x0188 }
            if (r11 == 0) goto L_0x019c
            android.content.SharedPreferences r0 = r12.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r1 = "redeem_count"
            int r0 = X.C18310x6.A03(r0, r1)     // Catch:{ all -> 0x04fe }
            int r0 = r0 + 1
            r12.A02(r0)     // Catch:{ all -> 0x04fe }
            android.content.SharedPreferences r0 = r12.A00()     // Catch:{ all -> 0x04fe }
            int r13 = X.C18310x6.A03(r0, r1)     // Catch:{ all -> 0x04fe }
            X.3Mh r1 = r5.A01     // Catch:{ all -> 0x04fe }
            X.1Ek r0 = X.C66663Mh.A09     // Catch:{ all -> 0x04fe }
            int r10 = r1.A03(r0)     // Catch:{ all -> 0x04fe }
            X.1Ek r0 = X.C66663Mh.A08     // Catch:{ all -> 0x04fe }
            int r0 = r1.A03(r0)     // Catch:{ all -> 0x04fe }
            long r2 = (long) r0     // Catch:{ all -> 0x04fe }
            X.2sH r0 = r5.A03     // Catch:{ all -> 0x04fe }
            long r16 = X.C56612sH.A00(r0)     // Catch:{ all -> 0x04fe }
            android.content.SharedPreferences r9 = r12.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r8 = "base_timestamp"
            r0 = 0
            long r8 = r9.getLong(r8, r0)     // Catch:{ all -> 0x04fe }
            long r16 = r16 - r8
            boolean r8 = r5.A0D     // Catch:{ all -> 0x04fe }
            if (r8 != 0) goto L_0x0181
            if (r13 >= r10) goto L_0x0178
            android.content.SharedPreferences r9 = r12.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r8 = "time_to_live"
            long r8 = r9.getLong(r8, r0)     // Catch:{ all -> 0x04fe }
            long r8 = r8 - r2
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0181
        L_0x0178:
            r5.A0D = r14     // Catch:{ all -> 0x04fe }
            X.4FS r1 = r5.A07     // Catch:{ all -> 0x04fe }
            r0 = 26
            X.C69993Zl.A00(r1, r5, r0)     // Catch:{ all -> 0x04fe }
        L_0x0181:
            r0 = 10
            java.lang.String r2 = android.util.Base64.encodeToString(r11, r0)     // Catch:{ all -> 0x04fe }
            goto L_0x019c
        L_0x0188:
            r1 = move-exception
            r0 = 6
            r12.A03(r0)     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC failed to compute hmac"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04fe }
            goto L_0x019c
        L_0x0193:
            r0 = 3
            r12.A03(r0)     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC sharedSecret is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04fe }
        L_0x019c:
            monitor-exit(r5)
            if (r2 == 0) goto L_0x01a9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r21)
            java.lang.String r0 = "+"
            java.lang.String r20 = X.AnonymousClass000.A0V(r0, r2, r1)
        L_0x01a9:
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 == 0) goto L_0x0231
            java.lang.String r0 = "PrivateStatsUploader/doUpload no valid auth token, abort uploading"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = X.AnonymousClass0x7.A0g()
            int r0 = r5.A00()
            android.util.Pair r22 = X.C18300x5.A0E(r1, r0)
        L_0x01c0:
            long r33 = X.AnonymousClass0x7.A0E(r18)
            int r0 = X.C18280x3.A03(r22)
            if (r0 != r14) goto L_0x01da
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PrivateStatsUploader/send-->uploaded buffer idx = "
            r0 = r25
            X.C18260x0.A0w(r1, r2, r0)
            r1 = r26
            X.C18270x1.A1K(r1, r0)
        L_0x01da:
            int r2 = X.C18280x3.A03(r22)
            r1 = 7
            X.2gg r0 = r6.A05
            int r30 = X.C18290x4.A03(r22)
            if (r2 != r1) goto L_0x021d
            r28 = r0
            r29 = r1
            r31 = r4
            r28.A00(r29, r30, r31, r32, r33, r35, r36)
        L_0x01f0:
            int r1 = X.C18280x3.A03(r22)
            r0 = 4
            if (r1 != r0) goto L_0x04c7
            r5.A01()
            r4 = 1
        L_0x01fb:
            int r0 = r26.size()
            if (r0 <= 0) goto L_0x020b
            r1 = r46
            r0 = r26
            r1.A04(r0)
            r47.A02()
        L_0x020b:
            if (r53 != 0) goto L_0x0049
            if (r4 != 0) goto L_0x0049
            r0 = r6
            r1 = r47
            r2 = r32
            r3 = r35
            r4 = r36
            r5 = r14
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x021d:
            r41 = r32
            r45 = r36
            r37 = r0
            r38 = r2
            r39 = r4
            r40 = r30
            r42 = r33
            r44 = r35
            r37.A00(r38, r39, r40, r41, r42, r44, r45)
            goto L_0x01f0
        L_0x0231:
            if (r7 != 0) goto L_0x0239
            java.lang.String r0 = "PrivateStatsUploader/doUpload--->dataToSend is null, why?!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01c0
        L_0x0239:
            java.lang.Boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0247
            X.1VX r1 = r6.A04
            r0 = 4020(0xfb4, float:5.633E-42)
            java.lang.Boolean r0 = X.C56952sp.A07(r1, r0)
            r6.A00 = r0
        L_0x0247:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04bf
            X.8qC r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.1i8 r0 = (X.C29011i8) r0
            r0.A0G()
            X.5LI r2 = r0.A0B()
        L_0x025c:
            X.2yZ r1 = r6.A07
            X.2Zd r17 = new X.2Zd
            r0 = r17
            r0.<init>(r1, r2)
            r0 = 23
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r2 = r17.A00()
        L_0x026e:
            if (r2 == 0) goto L_0x01c0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x049a }
            java.lang.String r0 = "PrivateStatsUploader/makeConnection The endpoint address to connect to: "
            X.C18260x0.A0q(r0, r2, r1)     // Catch:{ Exception -> 0x049a }
            java.net.URLConnection r13 = X.C18300x5.A0q(r2)     // Catch:{ Exception -> 0x049a }
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ Exception -> 0x049a }
            X.2pq r0 = r6.A08     // Catch:{ Exception -> 0x049a }
            X.1r9 r0 = r0.A00()     // Catch:{ Exception -> 0x049a }
            r13.setSSLSocketFactory(r0)     // Catch:{ Exception -> 0x049a }
            java.lang.String r2 = X.C58172up.A0Q     // Catch:{ Exception -> 0x049a }
            X.C72353da.A00(r2, r13)     // Catch:{ Exception -> 0x049a }
            r0 = 15000(0x3a98, float:2.102E-41)
            r13.setConnectTimeout(r0)     // Catch:{ Exception -> 0x049a }
            r0 = 60000(0xea60, float:8.4078E-41)
            r13.setReadTimeout(r0)     // Catch:{ Exception -> 0x049a }
            r13.setDoInput(r14)     // Catch:{ Exception -> 0x049a }
            r13.setDoOutput(r14)     // Catch:{ Exception -> 0x049a }
            java.lang.String r0 = "POST"
            r13.setRequestMethod(r0)     // Catch:{ Exception -> 0x049a }
            r13.setChunkedStreamingMode(r4)     // Catch:{ Exception -> 0x049a }
            r13.setUseCaches(r4)     // Catch:{ Exception -> 0x049a }
            java.lang.String r1 = "User-Agent"
            X.3FI r0 = r6.A09     // Catch:{ Exception -> 0x049a }
            java.lang.String r0 = r0.A00()     // Catch:{ Exception -> 0x049a }
            r13.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x049a }
            java.lang.String r1 = "Connection"
            java.lang.String r0 = "Keep-Alive"
            r13.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x049a }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "multipart/form-data; boundary=boundaryWAMpsAAL123xyz"
            r13.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x049a }
            java.lang.String r1 = "Accept"
            java.lang.String r0 = "text/plain"
            r13.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x049a }
            java.lang.String r1 = "Accept-Charset"
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ Exception -> 0x049a }
            r13.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x049a }
            java.lang.String r0 = "Host"
            r13.setRequestProperty(r0, r2)     // Catch:{ Exception -> 0x049a }
            r13.connect()     // Catch:{ Exception -> 0x049a }
            java.lang.String r12 = "\r\n"
            X.2s4 r0 = r6.A01     // Catch:{ Exception -> 0x04a6 }
            r21 = r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x04a6 }
            java.lang.Integer r16 = X.C18300x5.A0Y()     // Catch:{ Exception -> 0x04a6 }
            r1 = r0
            r0 = r16
            X.203 r1 = X.AnonymousClass203.A00(r1, r11, r0, r13)     // Catch:{ Exception -> 0x04a6 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x04a6 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04a6 }
            java.io.DataOutputStream r10 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x04a6 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x04a6 }
            java.lang.String r9 = "--boundaryWAMpsAAL123xyz\r\n"
            r10.writeBytes(r9)     // Catch:{ all -> 0x0495 }
            java.lang.String r1 = "Content-Type: text/plain\r\n"
            r10.writeBytes(r1)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"access_token\"\r\n"
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = X.C58172up.A0S     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r9)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r1)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"credential\"\r\n"
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            r0 = r20
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            r10.size()     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r9)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"message\"; filename=\"WAMEventBuffer.dat\"\r\n"
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "Content-Type: application/octet-stream\r\n"
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            int r8 = r7.length     // Catch:{ all -> 0x0495 }
            r3 = 2048(0x800, float:2.87E-42)
            int r0 = r8 / r3
            int r8 = r8 % r3
            r2 = 0
            r1 = 0
        L_0x0349:
            if (r2 >= r0) goto L_0x0353
            r10.write(r7, r1, r3)     // Catch:{ all -> 0x0495 }
            int r1 = r1 + 2048
            int r2 = r2 + 1
            goto L_0x0349
        L_0x0353:
            if (r8 <= 0) goto L_0x0358
            r10.write(r7, r1, r8)     // Catch:{ all -> 0x0495 }
        L_0x0358:
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            r10.size()     // Catch:{ all -> 0x0495 }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0371 }
            long r0 = X.C18280x3.A07()     // Catch:{ JSONException -> 0x0371 }
            java.lang.String r2 = "t"
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x0371 }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x0371 }
            goto L_0x0378
        L_0x0371:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/writeMetadataPart"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0495 }
            r0 = 0
        L_0x0378:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0495 }
            if (r1 != 0) goto L_0x0397
            r10.writeBytes(r9)     // Catch:{ all -> 0x0495 }
            java.lang.String r1 = "Content-Type: application/json\r\n"
            r10.writeBytes(r1)     // Catch:{ all -> 0x0495 }
            java.lang.String r1 = "Content-Disposition: form-data; name=\"meta_data\"\r\n"
            r10.writeBytes(r1)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            r10.size()     // Catch:{ all -> 0x0495 }
        L_0x0397:
            java.lang.String r0 = "--boundaryWAMpsAAL123xyz--\r\n"
            r10.writeBytes(r0)     // Catch:{ all -> 0x0495 }
            r10.writeBytes(r12)     // Catch:{ all -> 0x0495 }
            r10.flush()     // Catch:{ all -> 0x0495 }
            int r9 = r13.getResponseCode()     // Catch:{ IOException -> 0x047b }
            r13.getResponseMessage()     // Catch:{ IOException -> 0x0479 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 != r1) goto L_0x03b8
            java.lang.String r0 = "PrivateStatsUploader/handleResponse---upload successfully---"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IOException -> 0x0479 }
            android.util.Pair r22 = X.C18300x5.A0E(r11, r1)     // Catch:{ IOException -> 0x0479 }
            goto L_0x048e
        L_0x03b8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0479 }
            java.lang.String r0 = "PrivateStatsUploader/handleResponse --- upload failed --- code = "
            X.C18260x0.A0x(r0, r1, r9)     // Catch:{ IOException -> 0x0479 }
            r8 = 400(0x190, float:5.6E-43)
            if (r9 != r8) goto L_0x045e
            java.io.InputStream r3 = r13.getErrorStream()     // Catch:{ Exception -> 0x044d }
            X.1zz r2 = new X.1zz     // Catch:{ Exception -> 0x044d }
            r1 = r21
            r0 = r16
            r2.<init>(r1, r3, r11, r0)     // Catch:{ Exception -> 0x044d }
            r11 = 0
            java.io.BufferedReader r2 = X.C18310x6.A0Z(r2)     // Catch:{ Exception -> 0x03f7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03ed }
        L_0x03db:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x03ed }
            if (r0 == 0) goto L_0x03e5
            r1.append(r0)     // Catch:{ all -> 0x03ed }
            goto L_0x03db
        L_0x03e5:
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x03ed }
            r2.close()     // Catch:{ Exception -> 0x03f7 }
            goto L_0x0401
        L_0x03ed:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03f2 }
            goto L_0x03f6
        L_0x03f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x03f7 }
        L_0x03f6:
            throw r1     // Catch:{ Exception -> 0x03f7 }
        L_0x03f7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x044d }
            java.lang.String r0 = "PrivateStatsUploader/readresponsemsg "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ Exception -> 0x044d }
        L_0x0401:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x044d }
            r3 = 5
            if (r0 != 0) goto L_0x0444
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r11)     // Catch:{ JSONException -> 0x043a }
            java.lang.String r0 = "error"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x043a }
            java.lang.String r0 = "error_subcode"
            int r2 = r1.getInt(r0)     // Catch:{ JSONException -> 0x043a }
            java.lang.String r0 = "code"
            int r1 = r1.getInt(r0)     // Catch:{ JSONException -> 0x043a }
            r0 = 9
            if (r1 != r0) goto L_0x0425
            r3 = 8
            goto L_0x0444
        L_0x0425:
            r0 = 3067002(0x2ecc7a, float:4.297785E-39)
            if (r2 != r0) goto L_0x042c
            r3 = 2
            goto L_0x0444
        L_0x042c:
            r0 = 3067003(0x2ecc7b, float:4.297787E-39)
            if (r2 != r0) goto L_0x0433
            r3 = 3
            goto L_0x0444
        L_0x0433:
            r0 = 3067004(0x2ecc7c, float:4.297788E-39)
            if (r2 != r0) goto L_0x0444
            r3 = 4
            goto L_0x0444
        L_0x043a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x044d }
            java.lang.String r0 = "PrivateStatsUploader/parseErrorResponse "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ Exception -> 0x044d }
        L_0x0444:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x044d }
            android.util.Pair r22 = X.C18300x5.A0E(r0, r8)     // Catch:{ Exception -> 0x044d }
            goto L_0x048e
        L_0x044d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0479 }
            java.lang.String r0 = "PrivateStatsUploader processing response err "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ IOException -> 0x0479 }
            r0 = r24
            android.util.Pair r22 = X.C18300x5.A0E(r0, r8)     // Catch:{ IOException -> 0x0479 }
            goto L_0x048e
        L_0x045e:
            r1 = 401(0x191, float:5.62E-43)
            if (r9 != r1) goto L_0x0470
            java.lang.Integer r0 = X.C18300x5.A0Z()     // Catch:{ IOException -> 0x0479 }
            android.util.Pair r22 = X.C18300x5.A0E(r0, r1)     // Catch:{ IOException -> 0x0479 }
            java.lang.String r0 = "PrivateStatsUploader error access token"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IOException -> 0x0479 }
            goto L_0x048e
        L_0x0470:
            java.lang.Integer r0 = X.C18310x6.A0e()     // Catch:{ IOException -> 0x0479 }
            android.util.Pair r22 = X.C18300x5.A0E(r0, r9)     // Catch:{ IOException -> 0x0479 }
            goto L_0x048e
        L_0x0479:
            r2 = move-exception
            goto L_0x047d
        L_0x047b:
            r2 = move-exception
            r9 = 0
        L_0x047d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = "PrivateStatsUploader response error "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r0 = X.C18290x4.A0d()     // Catch:{ all -> 0x0495 }
            android.util.Pair r22 = X.C18300x5.A0E(r0, r9)     // Catch:{ all -> 0x0495 }
        L_0x048e:
            r10.close()     // Catch:{ Exception -> 0x04a6 }
            r13.disconnect()     // Catch:{ Exception -> 0x04a6 }
            goto L_0x04c2
        L_0x0495:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x04a1 }
            goto L_0x04a5
        L_0x049a:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/makeConnection error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x04a6 }
            goto L_0x04a5
        L_0x04a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x04a6 }
        L_0x04a5:
            throw r1     // Catch:{ Exception -> 0x04a6 }
        L_0x04a6:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/doUpload error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0501 }
            java.lang.Integer r1 = X.C18290x4.A0d()     // Catch:{ all -> 0x0501 }
            r0 = r23
            android.util.Pair r22 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x0501 }
            java.lang.String r2 = r17.A00()     // Catch:{ all -> 0x0501 }
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x026e
        L_0x04bf:
            r2 = 0
            goto L_0x025c
        L_0x04c2:
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x01c0
        L_0x04c7:
            int r15 = r15 + 1
            goto L_0x0063
        L_0x04cb:
            long r7 = X.C18290x4.A08()
            if (r51 != 0) goto L_0x04f9
            X.2rT r2 = r1.A00
            X.2SH r0 = r2.A06
            X.2SG[] r1 = r0.A05
            int r0 = r2.A02
            r0 = r1[r0]
            long r0 = r0.A04
            long r7 = r7 - r0
            r0 = 600(0x258, double:2.964E-321)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x04f9
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "PrivateStatsUploader/maybeRotateBuffer: it isn't time to rotate; "
            r3.append(r2)
            long r0 = r0 - r7
            r3.append(r0)
            java.lang.String r0 = " seconds remaining"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            goto L_0x0037
        L_0x04f9:
            r47.A03()
            goto L_0x003a
        L_0x04fe:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0501:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66743Mp.A00(X.2rX, int, boolean, boolean, boolean):void");
    }

    public C66743Mp(C56492s4 r1, C29441ip r2, C56612sH r3, AnonymousClass1VX r4, C49532gg r5, C56432ry r6, C60442yZ r7, C55132pq r8, AnonymousClass3FI r9, C183538qC r10) {
        this.A03 = r3;
        this.A09 = r9;
        this.A01 = r1;
        this.A07 = r7;
        this.A06 = r6;
        this.A08 = r8;
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A0A = r10;
    }
}
