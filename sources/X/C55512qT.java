package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.crypto.SecretKey;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.2qT  reason: invalid class name and case insensitive filesystem */
public final class C55512qT {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C54402of A02;
    public final AnonymousClass33p A03;
    public final C621133n A04;
    public final C57262tM A05;
    public final AnonymousClass2Y9 A06;
    public final AnonymousClass1Uc A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass31C A09;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004d, code lost:
        if (r1.length() == 0) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass4EG r21, com.whatsapp.jid.UserJid r22, java.lang.String r23, javax.crypto.SecretKey r24, byte[] r25, int r26, boolean r27, boolean r28) {
        /*
            r20 = this;
            r3 = 0
            r9 = 1
            r14 = r21
            X.C162457s7.A0J(r14, r9)
            r11 = 2
            r8 = r20
            r10 = r26
            r18 = r27
            r19 = r28
            X.33p r0 = r8.A03     // Catch:{ GeneralSecurityException -> 0x015f }
            r15 = r22
            java.lang.String r4 = r15.user     // Catch:{ GeneralSecurityException -> 0x015f }
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "galaxy_biz_public_key_"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r2 = X.C18280x3.A0Z(r2, r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.2of r0 = r8.A02     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r5 = r15.user     // Catch:{ GeneralSecurityException -> 0x015f }
            X.C162457s7.A0J(r5, r3)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.3dY r0 = r0.A00     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.Object r4 = r0.get()     // Catch:{ GeneralSecurityException -> 0x015f }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "extensions_biz_public_key_"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ GeneralSecurityException -> 0x015f }
            r7 = 0
            java.lang.String r1 = r4.getString(r0, r7)     // Catch:{ GeneralSecurityException -> 0x015f }
            if (r1 == 0) goto L_0x004f
            int r4 = r1.length()     // Catch:{ GeneralSecurityException -> 0x015f }
            r0 = 0
            if (r4 != 0) goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            r4 = 0
            if (r0 != 0) goto L_0x0081
            X.C162457s7.A0J(r1, r3)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "-----BEGIN PUBLIC KEY-----"
            java.lang.String r2 = ""
            java.lang.String r1 = X.C175738Zn.A0U(r1, r0, r2, r3)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "-----END PUBLIC KEY-----"
            java.lang.String r1 = X.C175738Zn.A0U(r1, r0, r2, r3)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.C175738Zn.A0U(r1, r0, r2, r3)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r0 = android.util.Base64.decode(r0, r11)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch:{ GeneralSecurityException -> 0x015f }
            r1.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.security.PublicKey r7 = r0.generatePublic(r1)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.C162457s7.A0D(r7)     // Catch:{ GeneralSecurityException -> 0x015f }
            goto L_0x00a5
        L_0x0081:
            if (r2 == 0) goto L_0x00a5
            int r0 = r2.length()     // Catch:{ GeneralSecurityException -> 0x015f }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r0 = android.util.Base64.decode(r2, r11)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.security.cert.Certificate r1 = r1.generateCertificate(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            X.C162457s7.A0K(r1, r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.security.PublicKey r7 = r1.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x015f }
        L_0x00a5:
            if (r27 == 0) goto L_0x00b4
            X.1Uc r1 = r8.A07     // Catch:{ GeneralSecurityException -> 0x015f }
            if (r28 == 0) goto L_0x00b1
            java.lang.String r0 = "fetch_key_1_end"
        L_0x00ad:
            X.C56672sN.A01(r1, r0, r10)     // Catch:{ GeneralSecurityException -> 0x015f }
            goto L_0x00b4
        L_0x00b1:
            java.lang.String r0 = "fetch_key_end"
            goto L_0x00ad
        L_0x00b4:
            if (r7 != 0) goto L_0x00cf
            java.lang.String r2 = "extensions-failed-to-load-certificate-from-preferences"
            if (r27 == 0) goto L_0x00bf
            X.1Uc r0 = r8.A07     // Catch:{ GeneralSecurityException -> 0x015f }
            r0.A0C(r10, r2, r4)     // Catch:{ GeneralSecurityException -> 0x015f }
        L_0x00bf:
            java.lang.String r0 = "ExtensionsLogger/ExtensionsDataCryptoProcessor/encryptGalaxyFlowData - null certificate"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.2qk r1 = r8.A00     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = ""
            r1.A0A(r2, r3, r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            r14.BQb(r2)     // Catch:{ GeneralSecurityException -> 0x015f }
            return
        L_0x00cf:
            r3 = 3
            javax.crypto.spec.IvParameterSpec r2 = X.C18330xA.A0D(r25)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r1 = X.AnonymousClass0x2.A1a(r23)     // Catch:{ GeneralSecurityException -> 0x015f }
            javax.crypto.Cipher r0 = X.C18320x8.A0v()     // Catch:{ GeneralSecurityException -> 0x015f }
            r13 = r24
            r0.init(r9, r13, r2)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r6 = r0.getIV()     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r5 = r0.doFinal(r1)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.C162457s7.A0H(r5)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.C162457s7.A0H(r6)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.C162457s7.A0J(r5, r11)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.C162457s7.A0J(r6, r3)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.security.spec.MGF1ParameterSpec r12 = java.security.spec.MGF1ParameterSpec.SHA256     // Catch:{ GeneralSecurityException -> 0x015f }
            javax.crypto.spec.PSource$PSpecified r3 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r2 = "SHA-256"
            java.lang.String r1 = "MGF1"
            javax.crypto.spec.OAEPParameterSpec r0 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ GeneralSecurityException -> 0x015f }
            r0.<init>(r2, r1, r12, r3)     // Catch:{ GeneralSecurityException -> 0x015f }
            r4.init(r9, r7, r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r0 = r13.getEncoded()     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r0 = r4.doFinal(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.C162457s7.A0D(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            X.2Nz r2 = new X.2Nz     // Catch:{ GeneralSecurityException -> 0x015f }
            r2.<init>(r0, r5, r6)     // Catch:{ GeneralSecurityException -> 0x015f }
            if (r27 == 0) goto L_0x0126
            X.1Uc r1 = r8.A07     // Catch:{ GeneralSecurityException -> 0x015f }
            if (r28 == 0) goto L_0x015b
            java.lang.String r0 = "encryption_1_end"
        L_0x0123:
            X.C56672sN.A01(r1, r0, r10)     // Catch:{ GeneralSecurityException -> 0x015f }
        L_0x0126:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = "AesKey="
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r0 = r2.A01     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r11)     // Catch:{ GeneralSecurityException -> 0x015f }
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = ";IV="
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r0 = r2.A02     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r11)     // Catch:{ GeneralSecurityException -> 0x015f }
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = ";Data="
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x015f }
            byte[] r0 = r2.A00     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r11)     // Catch:{ GeneralSecurityException -> 0x015f }
            java.lang.String r16 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ GeneralSecurityException -> 0x015f }
            r17 = r10
            r14.BQc(r15, r16, r17, r18, r19)     // Catch:{ GeneralSecurityException -> 0x015f }
            goto L_0x015e
        L_0x015b:
            java.lang.String r0 = "encryption_end"
            goto L_0x0123
        L_0x015e:
            return
        L_0x015f:
            r3 = move-exception
            java.lang.String r2 = "extensions-encryption-failed-exception"
            if (r27 == 0) goto L_0x017b
            X.1Uc r1 = r8.A07
            if (r28 == 0) goto L_0x0194
            java.lang.String r0 = "fetch_key_1_end"
        L_0x016a:
            X.C56672sN.A01(r1, r0, r10)
            if (r28 == 0) goto L_0x0191
            java.lang.String r0 = "encryption_1_end"
        L_0x0171:
            X.C56672sN.A01(r1, r0, r10)
            java.lang.String r0 = A00(r8, r3)
            r1.A0C(r10, r2, r0)
        L_0x017b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsDataCryptoProcessor/encryptGalaxyFlowData() - error while encrypting data"
            X.C18260x0.A16(r0, r1, r3)
            r14.BQb(r2)
            X.2qk r1 = r8.A00
            java.lang.String r0 = A00(r8, r3)
            r1.A0A(r2, r9, r0)
            return
        L_0x0191:
            java.lang.String r0 = "encryption_end"
            goto L_0x0171
        L_0x0194:
            java.lang.String r0 = "fetch_key_end"
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55512qT.A03(X.4EG, com.whatsapp.jid.UserJid, java.lang.String, javax.crypto.SecretKey, byte[], int, boolean, boolean):void");
    }

    public final boolean A04(UserJid userJid) {
        String A0Z;
        C162457s7.A0J(userJid, 0);
        AnonymousClass33p r3 = this.A03;
        String str = userJid.user;
        C183538qC r6 = r3.A01;
        String A0Z2 = C18280x3.A0Z(C18300x5.A0B(r6), AnonymousClass000.A0V("galaxy_biz_public_key_", str, AnonymousClass001.A0o()));
        AnonymousClass1VX r9 = this.A08;
        C58422vE r4 = C58422vE.A02;
        boolean A0Y = r9.A0Y(r4, 5936);
        C54402of r5 = this.A02;
        String str2 = userJid.user;
        if (A0Y) {
            A0Z = r5.A01(str2);
        } else {
            C162457s7.A0J(str2, 0);
            A0Z = C18280x3.A0Z((SharedPreferences) r5.A00.get(), AnonymousClass000.A0V("extensions_biz_public_key_", str2, AnonymousClass001.A0o()));
        }
        if (A0Z != null && A0Z.length() != 0) {
            String str3 = userJid.user;
            C162457s7.A0J(str3, 0);
            C72333dY r62 = r5.A00;
            long A0B = AnonymousClass0x2.A0B((SharedPreferences) r62.get(), AnonymousClass000.A0V("extensions_biz_fetch_time_", str3, AnonymousClass001.A0o()));
            int A0O = r9.A0O(r4, 3329);
            if (A0O < 0 || A0O >= 43200) {
                A0O = 10080;
            }
            long j = A0B + (((long) A0O) * 60000);
            if (A05(userJid) || this.A01.A0H() <= j) {
                return false;
            }
            String str4 = userJid.user;
            C162457s7.A0J(str4, 0);
            C18260x0.A0G(C72333dY.A00(r5.A00), "extensions_biz_public_key_", str4, AnonymousClass001.A0o());
            String str5 = userJid.user;
            C162457s7.A0J(str5, 0);
            C18260x0.A0G(C72333dY.A00(r62), "flows_biz_public_key_pem_", str5, AnonymousClass001.A0o());
        } else if (!(A0Z2 == null || A0Z2.length() == 0)) {
            long A0B2 = AnonymousClass0x2.A0B(C18300x5.A0B(r6), AnonymousClass000.A0V("galaxy_business_cert_expired_timestamp_", userJid.getRawString(), AnonymousClass001.A0o()));
            if (A05(userJid)) {
                return false;
            }
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(AnonymousClass0x9.A0d(AnonymousClass0x7.A1X(A0Z2)));
            C162457s7.A0K(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            C56612sH r63 = this.A01;
            if (r63.A0H() <= ((X509Certificate) generateCertificate).getNotAfter().getTime() && r63.A0H() <= A0B2) {
                return false;
            }
            r3.A1O(userJid.user);
            return true;
        }
        return true;
    }

    public final boolean A05(UserJid userJid) {
        try {
            JSONArray jSONArray = AnonymousClass0x9.A1H(C56952sp.A08(this.A08, 1695)).getJSONArray("galaxy_allowed_list");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                String str = userJid.user;
                if (string == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (string.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        } catch (JSONException e) {
            Log.e("ExtensionsLogger/ExtensionsDataCryptoProcessor/isTrustedTestNumber()", e);
        }
        return false;
    }

    public final void A01(AnonymousClass4EG r6, UserJid userJid, int i, boolean z) {
        String str;
        String str2;
        C54402of r0 = this.A02;
        String str3 = userJid.user;
        C162457s7.A0J(str3, 0);
        C18260x0.A0G(C72333dY.A00(r0.A00), "extensions_biz_public_key_", str3, AnonymousClass001.A0o());
        Log.e("ExtensionsLogger/ExtensionsDataCryptoProcessor/handleSignedPublicKey() - public key signature could not be verified");
        AnonymousClass1Uc r2 = this.A07;
        if (z) {
            str = "fetch_key_1_end";
        } else {
            str = "fetch_key_end";
        }
        C56672sN.A01(r2, str, i);
        if (z) {
            str2 = "encryption_1_end";
        } else {
            str2 = "encryption_end";
        }
        C56672sN.A01(r2, str2, i);
        r2.A0C(i, "extensions-public-key-signature-verification-exception", (String) null);
        if (r6 != null) {
            r6.BUw(false, "extensions-public-key-signature-verification-exception");
            r6.BQb("extensions-public-key-signature-verification-exception");
        }
    }

    public final void A02(AnonymousClass4EG r18, UserJid userJid, String str, String str2, SecretKey secretKey, byte[] bArr, int i, boolean z) {
        String str3 = str;
        byte[] A1X = AnonymousClass0x7.A1X(str3);
        C162457s7.A0H(A1X);
        String str4 = new String(A1X, AnonymousClass79X.A05);
        C54402of r0 = this.A02;
        UserJid userJid2 = userJid;
        String str5 = userJid2.user;
        C162457s7.A0J(str5, 0);
        C72333dY r4 = r0.A00;
        C18260x0.A0F(C72333dY.A00(r4), "flows_biz_public_key_pem_", str5, str3, AnonymousClass001.A0o());
        String str6 = userJid2.user;
        C162457s7.A0J(str6, 0);
        C18260x0.A0F(C72333dY.A00(r4), "extensions_biz_public_key_", str6, str4, AnonymousClass001.A0o());
        String str7 = userJid2.user;
        long A0H = this.A01.A0H();
        C162457s7.A0J(str7, 0);
        SharedPreferences.Editor A002 = C72333dY.A00(r4);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("extensions_biz_fetch_time_");
        C18270x1.A0k(A002, str7, A0o, A0H);
        AnonymousClass4EG r9 = r18;
        if (r18 != null) {
            r9.BUw(true, (String) null);
        }
        String str8 = str2;
        if (str2 != null && r18 != null) {
            SecretKey secretKey2 = secretKey;
            if (secretKey != null) {
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    A03(r9, userJid2, str8, secretKey2, bArr2, i, true, z);
                }
            }
        }
    }

    public C55512qT(C55682qk r1, C56612sH r2, C54402of r3, AnonymousClass33p r4, C621133n r5, C57262tM r6, AnonymousClass2Y9 r7, AnonymousClass1Uc r8, AnonymousClass1VX r9, AnonymousClass31C r10) {
        C18260x0.A0f(r10, r4, r3, r1, r9);
        C18260x0.A0W(r6, r5, r2);
        this.A09 = r10;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A08 = r9;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
    }

    public static String A00(C55512qT r2, Throwable th) {
        String message = th.getMessage();
        if (r2.A08.A0Y(C58422vE.A02, 3178)) {
            return message;
        }
        return null;
    }
}
