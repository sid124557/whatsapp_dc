package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3TJ  reason: invalid class name */
public class AnonymousClass3TJ implements AnonymousClass4EZ {
    public C42142My A00;
    public final UserJid A01;
    public final AnonymousClass31C A02;

    public final void A00() {
        C42142My r2 = this.A00;
        if (r2 != null) {
            UserJid userJid = this.A01;
            Log.e("DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureError");
            C56192ra r0 = r2.A00;
            r0.A04(userJid);
            r0.A04.A0A("direct-connection-get-phone-signature-error-response", false, "");
        }
    }

    public AnonymousClass3TJ(UserJid userJid, AnonymousClass31C r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        C18260x0.A0t("GetPhoneNumberSignature/delivery-error with iqId ", str, AnonymousClass001.A0o());
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r4.A2Q(r0.getRawString(), r26.getRawString()) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        com.whatsapp.util.Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate");
        r7.A04.A0A("direct-connection-failed-to-load-certificate-from-preferences", false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0240, code lost:
        r7.A05(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0243, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x025f A[EDGE_INSN: B:103:0x025f->B:93:0x025f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5 A[SYNTHETIC, Splitter:B:42:0x00f5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r28, java.lang.String r29) {
        /*
            r27 = this;
            java.lang.String r0 = "signed_user_info"
            r1 = r28
            X.36K r5 = r1.A0l(r0)
            r2 = r27
            if (r5 == 0) goto L_0x026c
            java.lang.String r24 = "phone_number"
            r0 = r24
            X.36K r4 = r5.A0l(r0)
            java.lang.String r23 = "ttl_timestamp"
            r0 = r23
            X.36K r3 = r5.A0l(r0)
            java.lang.String r22 = "phone_number_signature"
            r0 = r22
            X.36K r1 = r5.A0l(r0)
            java.lang.String r0 = "business_domain"
            X.36K r0 = r5.A0l(r0)
            if (r4 == 0) goto L_0x026c
            if (r3 == 0) goto L_0x026c
            if (r1 == 0) goto L_0x026c
            if (r0 == 0) goto L_0x026c
            java.lang.String r21 = r4.A0n()
            java.lang.String r9 = r3.A0n()
            java.lang.String r20 = r1.A0n()
            java.lang.String r19 = r0.A0n()
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x026c
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x026c
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x026c
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x026c
            X.2My r1 = r2.A00
            if (r1 == 0) goto L_0x026f
            com.whatsapp.jid.UserJid r8 = r2.A01
            java.lang.String r0 = "DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2ra r7 = r1.A00
            com.whatsapp.jid.UserJid r0 = r1.A02
            r26 = r0
            X.5dt r3 = r1.A01
            X.5Tb r2 = r7.A09
            r1 = 1
            java.lang.String r18 = "postcode"
            r0 = r18
            boolean r0 = r2.A03(r3, r0, r1)
            if (r0 != 0) goto L_0x0203
            r10 = 0
        L_0x0080:
            r6 = 0
            r5 = 0
        L_0x0082:
            X.2sr r0 = r7.A05
            r25 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r25)
            if (r0 == 0) goto L_0x009e
            X.33p r4 = r7.A0A
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r26.getRawString()
            boolean r0 = r4.A2Q(r1, r0)
            r17 = 1
            if (r0 != 0) goto L_0x01f8
        L_0x009e:
            r17 = 0
            X.33p r4 = r7.A0A
            java.lang.String r0 = r26.getRawString()
            java.lang.String r0 = r4.A0c(r0)
            if (r0 != 0) goto L_0x01f8
            r0 = 0
            X.2PV r13 = new X.2PV
            r13.<init>(r0, r9, r0, r10)
        L_0x00b2:
            X.1VX r3 = r7.A0C
            r0 = 1867(0x74b, float:2.616E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 == 0) goto L_0x00e6
            X.2Ef r0 = r7.A08
            X.33p r14 = r0.A00
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r14)
            java.lang.String r12 = "latest_biz_backend_request_id"
            java.lang.String r1 = X.C18280x3.A0Z(r0, r12)
            r11 = 0
            if (r1 == 0) goto L_0x00e6
            java.lang.String r0 = "252"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e0
            X.2PV r11 = new X.2PV
            r1 = r21
            r0 = r20
            r11.<init>(r1, r9, r0, r10)
        L_0x00e0:
            X.C18260x0.A0K(r14, r12)
            if (r11 == 0) goto L_0x00e6
            r13 = r11
        L_0x00e6:
            java.lang.String r0 = "yyyyMMdd'T'HHmmss'Z'"
            java.text.SimpleDateFormat r0 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ ParseException -> 0x0259 }
            java.lang.String r14 = r13.A03     // Catch:{ ParseException -> 0x0259 }
            java.util.Date r16 = r0.parse(r14)     // Catch:{ ParseException -> 0x0259 }
            if (r16 == 0) goto L_0x025f
            java.lang.String r12 = r7.A00(r8)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r11 = ""
            if (r12 != 0) goto L_0x00ff
            goto L_0x0233
        L_0x00ff:
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            byte[] r0 = X.AnonymousClass0x7.A1X(r12)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.security.cert.Certificate r12 = r1.generateCertificate(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            javax.security.auth.x500.X500Principal r0 = r12.getSubjectX500Principal()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r1 = X.AnonymousClass34Q.A01(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            r0 = r19
            boolean r0 = r0.equals(r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            if (r0 != 0) goto L_0x013c
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/Incorrect CN in certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            X.2qk r1 = r7.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r0 = "direct-connection-certificate-common-name-mismatch"
            r1.A0A(r0, r6, r11)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            r4.A1N(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            goto L_0x0255
        L_0x013c:
            X.34Q r11 = r7.A07     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r15 = r13.A00     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            if (r15 == 0) goto L_0x014b
            r0 = r24
            r1.put(r0, r15)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
        L_0x014b:
            r0 = r23
            r1.put(r0, r14)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r14 = r13.A01     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            if (r14 == 0) goto L_0x0159
            r0 = r22
            r1.put(r0, r14)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
        L_0x0159:
            java.lang.String r13 = r13.A02     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            if (r13 == 0) goto L_0x0162
            r0 = r18
            r1.put(r0, r13)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
        L_0x0162:
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.security.PublicKey r1 = r12.getPublicKey()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            X.2Mz r13 = X.AnonymousClass34Q.A00(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            javax.crypto.SecretKey r0 = r13.A00     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            byte[] r12 = X.AnonymousClass34Q.A02(r1, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            byte[] r0 = r0.getEncoded()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            r11.A00 = r0     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            byte[] r1 = r13.A02     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            r11.A01 = r1     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            byte[] r0 = r13.A01     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r13 = X.AnonymousClass254.A00(r0, r12, r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            if (r13 == 0) goto L_0x0255
            java.lang.String r14 = r8.getRawString()
            android.content.SharedPreferences$Editor r12 = X.C18270x1.A03(r4)
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "dc_business_domain_"
            r0 = r19
            X.C18260x0.A0F(r12, r1, r14, r0, r11)
            java.lang.String r0 = r7.A02
            if (r0 != 0) goto L_0x01ef
            java.lang.String r12 = r8.getRawString()
            android.content.SharedPreferences$Editor r11 = X.C18270x1.A03(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "smb_business_direct_connection_enc_string_"
            X.C18260x0.A0F(r11, r0, r12, r13, r1)
            java.lang.String r14 = r8.getRawString()
            long r0 = r16.getTime()
            android.content.SharedPreferences$Editor r13 = X.C18270x1.A03(r4)
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r11 = "smb_business_direct_connection_enc_string_expired_timestamp_"
            r12.append(r11)
            X.C18270x1.A0k(r13, r14, r12, r0)
        L_0x01c8:
            r0 = 3760(0xeb0, float:5.269E-42)
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 == 0) goto L_0x0240
            if (r17 != 0) goto L_0x0240
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r25)
            if (r0 == 0) goto L_0x0240
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r26.getRawString()
            boolean r0 = r4.A2Q(r1, r0)
            if (r0 == 0) goto L_0x0240
            int r0 = r5 + 1
            byte r1 = (byte) r0
            r0 = 1
            if (r5 >= r0) goto L_0x0240
            r5 = r1
            goto L_0x0082
        L_0x01ef:
            r7.A01 = r13
            long r0 = r16.getTime()
            r7.A00 = r0
            goto L_0x01c8
        L_0x01f8:
            X.2PV r13 = new X.2PV
            r1 = r21
            r0 = r20
            r13.<init>(r1, r9, r0, r10)
            goto L_0x00b2
        L_0x0203:
            java.lang.String r10 = r7.A02
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0080
            X.33p r1 = r7.A0A
            java.lang.String r0 = r26.getRawString()
            java.lang.String r10 = r1.A0c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0080
            java.lang.String r3 = r26.getRawString()
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "dc_default_postcode_"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.String r10 = X.C18280x3.A0Z(r2, r0)
            goto L_0x0080
        L_0x0233:
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            X.2qk r1 = r7.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            java.lang.String r0 = "direct-connection-failed-to-load-certificate-from-preferences"
            r1.A0A(r0, r6, r11)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0244 }
            goto L_0x0255
        L_0x0240:
            r7.A05(r8)
            return
        L_0x0244:
            r3 = move-exception
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/"
            com.whatsapp.util.Log.e(r0, r3)
            X.2qk r2 = r7.A04
            java.lang.String r1 = "direct-connection-fail-to-generate-encryption-string"
            java.lang.String r0 = r3.toString()
            r2.A0A(r1, r6, r0)
        L_0x0255:
            r7.A04(r8)
            return
        L_0x0259:
            r1 = move-exception
            java.lang.String r0 = "DirectConnectionManager/getExpirationDateFromSignedUserInfo/Invalid timestamp"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x025f:
            r7.A04(r8)
            X.2qk r2 = r7.A04
            java.lang.String r1 = "direct-connection-invalid-expiration-date"
            java.lang.String r0 = ""
            r2.A0A(r1, r6, r0)
            return
        L_0x026c:
            r2.A00()
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TJ.BdM(X.36K, java.lang.String):void");
    }

    public void BQs(String str) {
        A00();
    }
}
