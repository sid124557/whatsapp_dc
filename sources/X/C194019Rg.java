package X;

/* renamed from: X.9Rg  reason: invalid class name and case insensitive filesystem */
public class C194019Rg {
    public final C54292oU A00;
    public final AnonymousClass9PJ A01;
    public final C193539Pa A02;
    public final AnonymousClass9OF A03;
    public final AnonymousClass9W3 A04;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|23|24|25|26|(1:28)) */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03c6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        com.whatsapp.util.Log.w("PAY: DefaultTrustTokenBuilder/addSignature", r1);
        r0 = new X.AnonymousClass9KN(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03d2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03d3, code lost:
        com.whatsapp.util.Log.e("PAY: DefaultTrustTokenBuilder/constructInputForSigning", r1);
        r0 = new X.AnonymousClass9KN(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03eb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        com.whatsapp.util.Log.w("PAY: DefaultTrustTokenBuilder/signWith", r1);
        r0 = new X.AnonymousClass9KN(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0416, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0417, code lost:
        com.whatsapp.util.Log.e("PAY: MFAFactors/registerTD/", r1);
        r2.BS8(new X.AnonymousClass9V4(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0425, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.whatsapp.util.Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03de A[Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03eb A[ExcHandler: 9KL | NoSuchAlgorithmException (r1v14 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:93:0x0231] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0416 A[ExcHandler: 9KN | NoSuchAlgorithmException | JSONException (r1v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:76:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[Catch:{ KeyStoreException -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bf A[Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }, LOOP:0: B:78:0x01b9->B:80:0x01bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d5 A[Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020e A[Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x022b A[Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0246 A[Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C203089n6 r22, boolean r23) {
        /*
            r21 = this;
            r5 = r21
            X.9OF r3 = r5.A03
            r4 = 0
            r2 = r22
            X.33l r0 = r3.A00     // Catch:{ JSONException -> 0x002f }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x002f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x002f }
            if (r0 != 0) goto L_0x0035
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x002f }
            java.lang.String r0 = "td"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x002f }
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "td_is_committed"
            boolean r0 = r1.optBoolean(r0, r4)     // Catch:{ JSONException -> 0x002f }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r2.onResult(r0)
            return
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore isCommitted failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0035:
            if (r23 == 0) goto L_0x00d8
            X.9Qf r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            java.lang.String r7 = "alias-payments-br-trusted-device-key"
            X.9kR r0 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            java.lang.Object r0 = r0.get()     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            X.9R1 r0 = (X.AnonymousClass9R1) r0     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            if (r0 == 0) goto L_0x007f
            r6 = 0
            java.security.KeyStore r4 = r0.A01     // Catch:{ Exception -> 0x007a }
            java.security.cert.Certificate r1 = r4.getCertificate(r7)     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x007f
            boolean r0 = r1 instanceof java.security.cert.X509Certificate     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x0069
            r0 = r1
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ Exception -> 0x007a }
            r0.checkValidity()     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0059 }
            goto L_0x0069
        L_0x0059:
            boolean r0 = r4.containsAlias(r7)     // Catch:{ KeyStoreException -> 0x0063 }
            if (r0 == 0) goto L_0x007f
            r4.deleteEntry(r7)     // Catch:{ KeyStoreException -> 0x0063 }
            goto L_0x007f
        L_0x0063:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x007f
        L_0x0069:
            java.security.PublicKey r1 = r1.getPublicKey()     // Catch:{ Exception -> 0x007a }
            java.security.Key r0 = r4.getKey(r7, r6)     // Catch:{ Exception -> 0x007a }
            java.security.PrivateKey r0 = (java.security.PrivateKey) r0     // Catch:{ Exception -> 0x007a }
            java.security.KeyPair r8 = new java.security.KeyPair     // Catch:{ Exception -> 0x007a }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x0144
        L_0x007a:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/retrieveKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
        L_0x007f:
            X.33l r0 = r3.A00     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x00d2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00d2 }
            if (r0 != 0) goto L_0x00d8
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r0 = "td"
            org.json.JSONObject r6 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x00d2 }
            if (r6 == 0) goto L_0x00d8
            java.lang.String r0 = "td_public_key_bytes"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x00d2 }
            r1 = 11
            byte[] r4 = android.util.Base64.decode(r0, r1)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r0 = "td_private_key_bytes"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x00d2 }
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r6 = "PAY: TrustedDeviceKeyStore recreateKeyPair failed"
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch:{ JSONException -> 0x00d2 }
            r1.<init>(r4)     // Catch:{ JSONException -> 0x00d2 }
            java.security.spec.PKCS8EncodedKeySpec r4 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ JSONException -> 0x00d2 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00cd }
            java.security.PublicKey r1 = r0.generatePublic(r1)     // Catch:{  }
            java.security.PrivateKey r0 = r0.generatePrivate(r4)     // Catch:{  }
            java.security.KeyPair r8 = new java.security.KeyPair     // Catch:{  }
            r8.<init>(r1, r0)     // Catch:{  }
            goto L_0x0144
        L_0x00cd:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00d8
        L_0x00d2:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore retrieveKeyPair failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
        L_0x00d8:
            X.9Qf r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            X.0PJ r0 = r0.A00()     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            java.lang.Object r8 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            if (r8 == 0) goto L_0x040b
            java.lang.Object r0 = r0.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            X.C626936e.A06(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            if (r0 != 0) goto L_0x013e
            r10 = r8
            java.security.KeyPair r10 = (java.security.KeyPair) r10     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            java.lang.String r9 = "td"
            X.33l r7 = r3.A00     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = r7.A06()     // Catch:{ JSONException -> 0x0137 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0137 }
            if (r0 != 0) goto L_0x013e
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0137 }
            org.json.JSONObject r4 = r6.optJSONObject(r9)     // Catch:{ JSONException -> 0x0137 }
            if (r4 != 0) goto L_0x010c
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0137 }
        L_0x010c:
            java.lang.String r1 = "td_public_key_bytes"
            java.security.PublicKey r0 = r10.getPublic()     // Catch:{ JSONException -> 0x0137 }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x0137 }
            r3 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x0137 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r1 = "td_private_key_bytes"
            java.security.PrivateKey r0 = r10.getPrivate()     // Catch:{ JSONException -> 0x0137 }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x0137 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x0137 }
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x0137 }
            r6.put(r9, r4)     // Catch:{ JSONException -> 0x0137 }
            X.C1899593h.A1D(r7, r6)     // Catch:{ JSONException -> 0x0137 }
            goto L_0x013e
        L_0x0137:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore store failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            throw r1     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
        L_0x013e:
            java.security.KeyPair r8 = (java.security.KeyPair) r8     // Catch:{ InvalidAlgorithmParameterException -> 0x0403 }
            if (r8 != 0) goto L_0x0144
            goto L_0x040b
        L_0x0144:
            X.9PJ r6 = r5.A01     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.2oU r0 = r5.A00     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            android.content.Context r11 = r0.A00     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            byte[] r1 = r0.getEncoded()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r0 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r3 = "auth_ticket_type"
            java.lang.String r1 = "TRUSTED_DEVICE"
            X.9OE r0 = new X.9OE     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r0.<init>(r3, r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r10.add(r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r1 = "public_key"
            X.9OE r0 = new X.9OE     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r0.<init>(r1, r4)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r10.add(r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.3Wi r9 = r6.A00     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.1ip r7 = r6.A01     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.2Ha r1 = r6.A02     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9U5 r0 = r6.A03     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.util.List r19 = java.util.Collections.emptyList()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r3 = "CREATE_AUTH_TICKET_BASED_FACTOR"
            java.lang.String r4 = "mfa-create-auth-ticket-based-factor"
            X.9Py r6 = new X.9Py     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r12 = r6
            r13 = r11
            r14 = r9
            r15 = r7
            r16 = r1
            r17 = r0
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9Pa r9 = r5.A02     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r1 = "ver"
            r0 = 1
            r7.put(r1, r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = "op"
            r7.put(r0, r3)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r3 = "nonce"
            X.2sH r1 = r9.A01     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.2sr r0 = r9.A00     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = X.AnonymousClass35J.A02(r0, r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            org.json.JSONObject r10 = X.C18300x5.A0z(r0, r3, r7)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.util.List r0 = r6.A05     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
        L_0x01b9:
            boolean r0 = r11.hasNext()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r0 = r11.next()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9OE r0 = (X.AnonymousClass9OE) r0     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r1 = r0.A00     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = r0.A01     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r10.put(r1, r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            goto L_0x01b9
        L_0x01cd:
            java.util.List r1 = r6.A06     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            boolean r0 = r1.isEmpty()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            if (r0 != 0) goto L_0x01f1
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r11.<init>()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
        L_0x01de:
            boolean r0 = r1.hasNext()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r1.next()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r11.put(r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            goto L_0x01de
        L_0x01ec:
            java.lang.String r0 = "caps"
            r10.put(r0, r11)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
        L_0x01f1:
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "com.whatsapp"
            r10.put(r1, r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9Se r0 = r9.A03     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r1 = r0.A01()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = "device_id"
            r10.put(r0, r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = "data"
            r7.put(r0, r10)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            int r0 = r3.length()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            if (r0 <= 0) goto L_0x022b
            r1 = 0
            java.lang.String r0 = "server key was never set, its null"
            X.C626936e.A07(r1, r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            com.whatsapp.wamsys.JniBridge r1 = r9.A04     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9Qf r0 = r9.A02     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9Ae r9 = new X.9Ae     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r9.<init>(r0, r1, r7, r3)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
        L_0x021d:
            r0 = 1
            java.security.PublicKey[] r1 = new java.security.PublicKey[r0]     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r14 = 0
            r1[r14] = r0     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r9.A00(r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            goto L_0x0231
        L_0x022b:
            X.9Ad r9 = new X.9Ad     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r9.<init>(r7)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            goto L_0x021d
        L_0x0231:
            java.util.List r0 = r9.A00     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            X.C626936e.A06(r0)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.util.List r1 = r9.A00     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = X.AnonymousClass9UD.A01(r0)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            boolean r0 = r1.contains(r0)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            if (r0 == 0) goto L_0x03de
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r12 = r9.A01()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            X.C626936e.A06(r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r11 = "alg"
            java.lang.String r10 = "ES256"
            r1.put(r11, r10)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = X.AnonymousClass9UD.A01(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r7 = "kid"
            java.lang.String r0 = X.AnonymousClass0x9.A0y(r0, r7, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r3 = X.AnonymousClass9UD.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r1 = "."
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            X.C18280x3.A19(r3, r12, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r1 = android.text.TextUtils.join(r1, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            byte[] r3 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d2, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x03e5, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.security.PrivateKey r0 = r8.getPrivate()     // Catch:{ Exception -> 0x03e5, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r1.initSign(r0)     // Catch:{ Exception -> 0x03e5, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r1.update(r3)     // Catch:{ Exception -> 0x03e5, 9KL | NoSuchAlgorithmException -> 0x03eb }
            byte[] r13 = r1.sign()     // Catch:{ Exception -> 0x03e5, 9KL | NoSuchAlgorithmException -> 0x03eb }
            if (r13 == 0) goto L_0x03e5
            java.security.PublicKey r20 = r8.getPublic()     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.util.List r0 = r9.A00     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            X.C626936e.A06(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.util.List r1 = r9.A00     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = X.AnonymousClass9UD.A01(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            boolean r0 = r1.contains(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            if (r0 == 0) goto L_0x03b9
            int r0 = r13.length     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r3 = 8
            java.lang.String r1 = "Invalid ECDSA signature format"
            if (r0 < r3) goto L_0x03b3
            byte r8 = r13[r14]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r3 = 48
            if (r8 != r3) goto L_0x03b3
            r3 = 1
            byte r12 = r13[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r3 = 2
            if (r12 <= 0) goto L_0x02bd
            r19 = 2
            goto L_0x02c3
        L_0x02bd:
            r8 = -127(0xffffffffffffff81, float:NaN)
            if (r12 != r8) goto L_0x03ad
            r19 = 3
        L_0x02c3:
            int r8 = r19 + 1
            byte r18 = r13[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r14 = r18
        L_0x02c9:
            if (r14 <= 0) goto L_0x02d7
            int r8 = r19 + 2
            int r8 = r8 + r18
            int r8 = r8 - r14
            byte r8 = r13[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            if (r8 != 0) goto L_0x02d7
            int r14 = r14 + -1
            goto L_0x02c9
        L_0x02d7:
            int r17 = r19 + 2
            int r17 = r17 + r18
            int r8 = r17 + 1
            byte r16 = r13[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r12 = r16
        L_0x02e1:
            if (r12 <= 0) goto L_0x02ef
            int r8 = r17 + 2
            int r8 = r8 + r16
            int r8 = r8 - r12
            byte r8 = r13[r8]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            if (r8 != 0) goto L_0x02ef
            int r12 = r12 + -1
            goto L_0x02e1
        L_0x02ef:
            int r15 = java.lang.Math.max(r14, r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r8 = 32
            int r8 = java.lang.Math.max(r15, r8)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            int r15 = r19 + -1
            byte r15 = r13[r15]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r19
            if (r15 != r0) goto L_0x03c0
            int r0 = r18 + 2
            int r0 = r0 + 2
            int r0 = r0 + r16
            if (r15 != r0) goto L_0x03c0
            byte r0 = r13[r19]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            if (r0 != r3) goto L_0x03c0
            byte r0 = r13[r17]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            if (r0 != r3) goto L_0x03c0
            int r3 = r8 * 2
            byte[] r1 = new byte[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            int r0 = r17 - r14
            int r8 = r8 - r14
            java.lang.System.arraycopy(r13, r0, r1, r8, r14)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            int r0 = r17 + 2
            int r0 = r0 + r16
            int r0 = r0 - r12
            int r3 = r3 - r12
            java.lang.System.arraycopy(r13, r0, r1, r3, r12)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1G()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = "signature"
            r8.put(r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r3 = "protected"
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r1.put(r11, r10)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = X.AnonymousClass9UD.A01(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = X.AnonymousClass0x9.A0y(r0, r7, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r0 = X.AnonymousClass9UD.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r8.put(r3, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            org.json.JSONArray r7 = r9.A01     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r7.put(r8)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            java.lang.String r3 = r9.A01()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f7 }
            X.C626936e.A06(r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f7 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f7 }
            java.lang.String r0 = "payload"
            r1.put(r0, r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f7 }
            java.lang.String r0 = "signatures"
            java.lang.String r0 = X.AnonymousClass0x9.A0y(r7, r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f7 }
            java.lang.String r3 = X.AnonymousClass9UD.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f7 }
            java.lang.String r1 = "trust-token"
            r0 = 0
            X.36K r8 = new X.36K     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r8.<init>((java.lang.String) r1, (java.lang.String) r3, (X.AnonymousClass39V[]) r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9OD r7 = new X.9OD     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r7.<init>(r2, r5)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9U5 r5 = r6.A04     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = "action"
            X.AnonymousClass39V.A03(r0, r4, r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r4 = 0
            X.39V[] r3 = X.C18300x5.A1Z(r1, r4)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r0 = 1
            X.36K[] r1 = new X.AnonymousClass36K[r0]     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r1[r4] = r8     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = "account"
            X.36K r4 = new X.36K     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r4.<init>((java.lang.String) r0, (X.AnonymousClass39V[]) r3, (X.AnonymousClass36K[]) r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            android.content.Context r3 = r6.A00     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.3Wi r1 = r6.A01     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.2Ha r0 = r6.A03     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r14 = 13
            X.9oU r8 = new X.9oU     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r9 = r3
            r10 = r0
            r11 = r1
            r12 = r6
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            java.lang.String r0 = "set"
            r5.A0E(r8, r4, r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            return
        L_0x03ad:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            goto L_0x03c5
        L_0x03b3:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            goto L_0x03c5
        L_0x03b9:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            goto L_0x03c5
        L_0x03c0:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
        L_0x03c5:
            throw r0     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c6, 9KL | NoSuchAlgorithmException -> 0x03eb }
        L_0x03c6:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/addSignature"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            X.9KN r0 = new X.9KN     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            r0.<init>(r1)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            goto L_0x03ea
        L_0x03d2:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/constructInputForSigning"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            X.9KN r0 = new X.9KN     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            r0.<init>(r1)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            goto L_0x03ea
        L_0x03de:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            goto L_0x03ea
        L_0x03e5:
            X.9KL r0 = new X.9KL     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
            r0.<init>()     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
        L_0x03ea:
            throw r0     // Catch:{ 9KL | NoSuchAlgorithmException -> 0x03eb }
        L_0x03eb:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/signWith"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9KN r0 = new X.9KN     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r0.<init>(r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            goto L_0x0402
        L_0x03f7:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/build"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            X.9KN r0 = new X.9KN     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r0.<init>(r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
        L_0x0402:
            throw r0     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
        L_0x0403:
            r0 = 8
            X.9V4 r1 = new X.9V4     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r1.<init>((int) r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            goto L_0x0412
        L_0x040b:
            r0 = 8
            X.9V4 r1 = new X.9V4     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            r1.<init>((int) r0)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
        L_0x0412:
            r2.BS8(r1)     // Catch:{ 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416, 9KN | NoSuchAlgorithmException | JSONException -> 0x0416 }
            return
        L_0x0416:
            r1 = move-exception
            java.lang.String r0 = "PAY: MFAFactors/registerTD/"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 6
            X.9V4 r0 = new X.9V4
            r0.<init>((int) r1)
            r2.BS8(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194019Rg.A00(X.9n6, boolean):void");
    }

    public C194019Rg(C54292oU r1, AnonymousClass9PJ r2, C193539Pa r3, AnonymousClass9OF r4, AnonymousClass9W3 r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
