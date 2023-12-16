package X;

/* renamed from: X.3xB  reason: invalid class name and case insensitive filesystem */
public final class C79783xB extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C46862cK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79783xB(C46862cK r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0102, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0112, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0116, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0119, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011a, code lost:
        X.AnonymousClass2A8.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            X.2cK r6 = r8.this$0
            org.json.JSONArray r4 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x011e }
            java.util.List r0 = r6.A03     // Catch:{ JSONException -> 0x011e }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x011e }
        L_0x000c:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x011e }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r3 = r5.next()     // Catch:{ JSONException -> 0x011e }
            X.2kq r3 = (X.C52072kq) r3     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "waffle_di"
            java.lang.String r0 = r3.A01     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "waffle_da"
            X.223 r0 = r3.A00     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = r0.iqValue     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "waffle_ds"
            java.lang.String r0 = "STORY"
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            r4.put(r0)     // Catch:{ JSONException -> 0x011e }
            goto L_0x000c
        L_0x003d:
            org.json.JSONArray r3 = X.AnonymousClass0x9.A1F()     // Catch:{ JSONException -> 0x011e }
            java.util.List r0 = r6.A04     // Catch:{ JSONException -> 0x011e }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ JSONException -> 0x011e }
        L_0x0047:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x011e }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r5 = r7.next()     // Catch:{ JSONException -> 0x011e }
            X.2nI r5 = (X.C53562nI) r5     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "media_everstore_direct_path"
            java.lang.String r0 = r5.A02     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "message"
            java.lang.String r0 = r5.A04     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "link_url"
            java.lang.String r0 = r5.A01     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "wa_status_id"
            java.lang.String r0 = r5.A05     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "media_type"
            java.lang.String r0 = r5.A03     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "dispatch_timestamp"
            java.lang.Long r0 = r5.A00     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            r3.put(r0)     // Catch:{ JSONException -> 0x011e }
            goto L_0x0047
        L_0x008c:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x011e }
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r6.A02     // Catch:{ JSONException -> 0x011e }
            org.json.JSONObject r1 = r2.put(r1, r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = "destinations"
            org.json.JSONObject r1 = r1.put(r0, r4)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = "statuses"
            org.json.JSONObject r0 = r1.put(r0, r3)     // Catch:{ JSONException -> 0x011e }
            X.C162457s7.A0H(r0)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = X.C18290x4.A0o(r0)
            byte[] r1 = X.AnonymousClass0x2.A1a(r0)
            int r0 = r1.length
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>(r0)
            java.util.zip.DeflaterOutputStream r2 = X.C18310x6.A0u(r3)     // Catch:{ all -> 0x0117 }
            r2.write(r1)     // Catch:{ all -> 0x0110 }
            r2.close()     // Catch:{ all -> 0x0110 }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x0110 }
            r5 = 2
            byte[] r0 = android.util.Base64.encode(r0, r5)     // Catch:{ all -> 0x0110 }
            r4 = 0
            r2.close()     // Catch:{ all -> 0x0117 }
            r3.close()
            X.C162457s7.A0D(r0)
            X.2XA r2 = r6.A00
            java.io.ByteArrayInputStream r3 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ IOException -> 0x0103 }
            r0 = 24
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x00fc }
            java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ all -> 0x00fc }
            r0.<init>()     // Catch:{ all -> 0x00fc }
            r0.nextBytes(r1)     // Catch:{ all -> 0x00fc }
            java.io.InputStream r2 = r2.A00(r3, r1)     // Catch:{ all -> 0x00fc }
            byte[] r0 = X.C624535b.A05(r2)     // Catch:{ all -> 0x00f5 }
            r2.close()     // Catch:{ all -> 0x00fc }
            r3.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0109
        L_0x00f5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x00fc }
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IOException -> 0x0103 }
            throw r0     // Catch:{ IOException -> 0x0103 }
        L_0x0103:
            java.lang.String r0 = "CrosspostPurposeEncryptionClient/encrypt IOException: data cannot be encrypted"
            X.AnonymousClass356.A02(r0)
            r0 = r4
        L_0x0109:
            if (r0 == 0) goto L_0x010f
            java.lang.String r4 = android.util.Base64.encodeToString(r0, r5)
        L_0x010f:
            return r4
        L_0x0110:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r3, r0)
            throw r1
        L_0x011e:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79783xB.invoke():java.lang.Object");
    }
}
