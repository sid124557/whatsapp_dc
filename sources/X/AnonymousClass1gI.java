package X;

/* renamed from: X.1gI  reason: invalid class name */
public class AnonymousClass1gI extends C67743Qm {
    public final C46362bV A00;
    public final C48442eu A01;
    public final C28881hv A02;
    public final C42742Pi A03;
    public final C47872dy A04;
    public final AnonymousClass4FS A05;

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0294, code lost:
        if (r0 != 12) goto L_0x0296;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r24, int r25) {
        /*
            r23 = this;
            r9 = r23
            X.2eu r14 = r9.A01
            boolean r0 = r14.A00()
            if (r0 != 0) goto L_0x0012
            X.2bV r0 = r9.A00
            X.2ou r0 = r0.A02
            r0.A00()
        L_0x0011:
            return
        L_0x0012:
            r0 = 252(0xfc, float:3.53E-43)
            r1 = r25
            if (r1 != r0) goto L_0x0011
            X.36K r1 = r24.A0j()
            java.lang.String r20 = "stage"
            r0 = r20
            java.lang.String r2 = r1.A0q(r0)
            java.lang.String r0 = "companion_hello"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r14.A00()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "LinkCodeCompanionRegNotificationHandler/handleCompanionHelloNotification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r0 = "link_code_pairing_wrapped_companion_ephemeral_pub"
            X.36K r0 = r1.A0m(r0)
            byte[] r13 = r0.A01
            java.lang.String r0 = "companion_server_auth_key_pub"
            X.36K r0 = r1.A0m(r0)
            byte[] r12 = r0.A01
            java.lang.String r0 = "link_code_pairing_ref"
            X.36K r0 = r1.A0m(r0)
            java.lang.String r11 = r0.A0n()
            java.lang.String r10 = "companion_platform_id"
            X.36K r0 = r1.A0l(r10)
            r8 = 0
            if (r0 == 0) goto L_0x00d8
            X.36K r0 = r1.A0l(r10)
            java.lang.String r7 = r0.A0n()
        L_0x0063:
            java.lang.String r6 = "companion_platform_display"
            X.36K r0 = r1.A0l(r6)
            if (r0 == 0) goto L_0x0073
            X.36K r0 = r1.A0l(r6)
            java.lang.String r8 = r0.A0n()
        L_0x0073:
            java.lang.String r0 = "should_show_push_notification"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r1, r0)
            java.lang.String r3 = "true"
            boolean r15 = r3.equals(r0)
            if (r13 == 0) goto L_0x04a2
            if (r12 == 0) goto L_0x04a2
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x04a2
            X.1hv r5 = r9.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/handleCompanionHelloNotificationData ref = "
            X.C18260x0.A0q(r0, r11, r1)
            X.2fj r4 = r5.A03
            X.2y7 r0 = r4.A00()
            if (r0 == 0) goto L_0x00b0
            java.lang.String r2 = r0.A02
            boolean r0 = r2.equals(r11)
            if (r0 != 0) goto L_0x00b0
            X.31C r1 = r5.A07
            X.3TD r0 = new X.3TD
            r0.<init>(r1)
            r0.A00(r2, r3)
        L_0x00b0:
            X.1VX r1 = r4.A02
            r0 = 3816(0xee8, float:5.347E-42)
            long r2 = X.C56952sp.A04(r1, r0)
            r0 = 360000(0x57e40, double:1.778636E-318)
            long r1 = java.lang.Math.min(r0, r2)
            X.2sH r0 = r4.A00
            long r21 = r0.A0H()
            long r21 = r21 + r1
            X.2y7 r0 = new X.2y7
            r20 = r12
            r19 = r13
            r18 = r7
            r17 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            monitor-enter(r4)
            goto L_0x00da
        L_0x00d8:
            r7 = r8
            goto L_0x0063
        L_0x00da:
            X.33p r3 = r4.A01     // Catch:{ all -> 0x01cf }
            org.json.JSONObject r12 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = "wrappedCompanionEphemeralPubBase64"
            byte[] r1 = r0.A04     // Catch:{ JSONException -> 0x010e }
            r13 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r13)     // Catch:{ JSONException -> 0x010e }
            r12.put(r2, r1)     // Catch:{ JSONException -> 0x010e }
            java.lang.String r2 = "companionServerAuthKeyPubBase64"
            byte[] r1 = r0.A03     // Catch:{ JSONException -> 0x010e }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r13)     // Catch:{ JSONException -> 0x010e }
            r12.put(r2, r1)     // Catch:{ JSONException -> 0x010e }
            java.lang.String r2 = "linkCodePairingRef"
            java.lang.String r1 = r0.A02     // Catch:{ JSONException -> 0x010e }
            r12.put(r2, r1)     // Catch:{ JSONException -> 0x010e }
            java.lang.String r2 = "companionPlatformId"
            java.lang.String r1 = r0.A01     // Catch:{ JSONException -> 0x010e }
            r12.put(r2, r1)     // Catch:{ JSONException -> 0x010e }
            java.lang.String r2 = "expirationTsMs"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x010e }
            r12.put(r2, r0)     // Catch:{ JSONException -> 0x010e }
            goto L_0x0116
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "CompanionHelloInfoManager/toJsonString error: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01cf }
            r2 = 0
            goto L_0x011a
        L_0x0116:
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x01cf }
        L_0x011a:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r3)     // Catch:{ all -> 0x01cf }
            java.lang.String r0 = "companion_reg_with_link_code_companion_hello_info_json"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ all -> 0x01cf }
            monitor-exit(r4)     // Catch:{ all -> 0x01cf }
            X.33p r0 = r5.A05
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "companion_reg_with_link_code_retry_count"
            X.C18270x1.A0g(r1, r0)
            X.2Xh r1 = r5.A02
            r0 = 1
            r1.A00(r0, r11, r7)
            X.33p r0 = r14.A00
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "did_receive_companion_hello"
            X.C18270x1.A0l(r1, r0, r2)
            if (r15 == 0) goto L_0x0011
            X.2Pi r5 = r9.A03
            r14 = 0
            X.C162457s7.A0J(r11, r14)
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33T r4 = r5.A03
            X.0Tx r0 = r4.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x015e
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer notification disabled"
        L_0x015a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x015e:
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer user is already on enter code screen"
            goto L_0x015a
        L_0x0165:
            X.2oU r12 = r5.A02
            r0 = 2131888030(0x7f12079e, float:1.9410684E38)
            java.lang.String r9 = X.C54292oU.A04(r12, r0)
            android.content.Context r13 = r12.A00
            X.0Ue r3 = X.C66553Lw.A01(r13)
            java.lang.String r0 = "critical_app_alerts@1"
            r3.A0K = r0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.CompanionHelloConfirmationActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "pairing_ref"
            r2.putExtra(r0, r11)
            if (r7 == 0) goto L_0x0190
            r2.putExtra(r10, r7)
        L_0x0190:
            if (r8 == 0) goto L_0x0195
            r2.putExtra(r6, r8)
        L_0x0195:
            android.app.PendingIntent r0 = X.C624735e.A04(r13, r2, r14)
            r3.A09 = r0
            r2 = 1
            r3.A03 = r2
            r1 = 2131895980(0x7f1226ac, float:1.9426808E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r12)
            java.lang.String r0 = r0.getString(r1)
            r3.A0B(r0)
            r3.A0C(r9)
            r3.A0A(r9)
            r0 = 3
            r3.A02(r0)
            r3.A0E(r2)
            X.C18270x1.A0r(r3, r9)
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r3, r0)
            r0 = 54
            X.AnonymousClass33T.A03(r3, r4, r0)
            X.2Xh r1 = r5.A01
            r0 = 10
            r1.A00(r0, r11, r7)
            return
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01cf }
            throw r0
        L_0x01d2:
            java.lang.String r19 = "companion_finish"
            r0 = r19
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = "LinkCodeCompanionRegNotificationHandler/handleCompanionFinishNotification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r0 = "link_code_pairing_wrapped_key_bundle"
            X.36K r0 = r1.A0m(r0)
            byte[] r5 = r0.A01
            java.lang.String r0 = "companion_identity_public"
            X.36K r0 = r1.A0m(r0)
            byte[] r4 = r0.A01
            java.lang.String r0 = "link_code_pairing_ref"
            X.36K r0 = r1.A0m(r0)
            java.lang.String r3 = r0.A0n()
            if (r5 == 0) goto L_0x0220
            if (r4 == 0) goto L_0x0220
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0220
            X.4FS r2 = r9.A05
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LinkCodeCompanionRegNotificationHandler/handleCompanionFinishNotification/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            r11 = 8
            X.3cN r6 = new X.3cN
            r7 = r9
            r8 = r5
            r9 = r4
            r10 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r2.BkQ(r6, r0)
            return
        L_0x0220:
            X.2qk r5 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "companion_finish:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ","
            goto L_0x049b
        L_0x0232:
            java.lang.String r0 = "primary_hello"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0471
            java.lang.String r0 = "LinkCodeCompanionRegNotificationHandler/handlePrimaryHelloNotification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r0 = "link_code_pairing_wrapped_primary_ephemeral_pub"
            X.36K r0 = r1.A0m(r0)
            byte[] r12 = r0.A01
            java.lang.String r0 = "primary_identity_pub"
            X.36K r0 = r1.A0m(r0)
            byte[] r11 = r0.A01
            java.lang.String r18 = "link_code_pairing_ref"
            r0 = r18
            X.36K r0 = r1.A0m(r0)
            java.lang.String r4 = r0.A0n()
            if (r12 == 0) goto L_0x0459
            if (r11 == 0) goto L_0x0459
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0459
            X.2dy r0 = r9.A04
            X.1iA r5 = r0.A00()
            monitor-enter(r5)
            java.lang.String r0 = "companion/registration/primary-hello/received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            X.2jr r6 = r5.A0S     // Catch:{ all -> 0x0456 }
            int r0 = r6.A00()     // Catch:{ all -> 0x0456 }
            r2 = 0
            r3 = 12
            r1 = 13
            if (r0 != r1) goto L_0x0294
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0t     // Catch:{ all -> 0x0456 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0456 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0456 }
            if (r0 == 0) goto L_0x0296
            java.lang.String r0 = "companion/registration/primary-hello/received retry for same ref"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            r5.A0G = r2     // Catch:{ all -> 0x0456 }
            goto L_0x029d
        L_0x0294:
            if (r0 == r3) goto L_0x029d
        L_0x0296:
            java.lang.String r0 = "companion/registration/primary-hello/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            goto L_0x0454
        L_0x029d:
            int r8 = r12.length     // Catch:{ IllegalArgumentException -> 0x0445 }
            r7 = 48
            if (r8 < r7) goto L_0x043e
            r0 = 0
            r2 = 32
            byte[] r10 = java.util.Arrays.copyOfRange(r12, r0, r2)     // Catch:{ IllegalArgumentException -> 0x0445 }
            byte[] r9 = java.util.Arrays.copyOfRange(r12, r2, r7)     // Catch:{ IllegalArgumentException -> 0x0445 }
            byte[] r8 = java.util.Arrays.copyOfRange(r12, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0445 }
            com.whatsapp.jid.UserJid r0 = r5.A07     // Catch:{ all -> 0x0456 }
            if (r0 == 0) goto L_0x0438
            X.2KI r0 = r5.A04     // Catch:{ all -> 0x0456 }
            if (r0 == 0) goto L_0x0438
            X.2KK r0 = r5.A05     // Catch:{ all -> 0x0456 }
            if (r0 == 0) goto L_0x0438
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0t     // Catch:{ all -> 0x0456 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0456 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0456 }
            if (r0 != 0) goto L_0x02d0
            java.lang.String r0 = "companion/registration/primary-hello/ignoring as pairing ref does not match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            goto L_0x0454
        L_0x02d0:
            r6.A01(r1)     // Catch:{ all -> 0x0456 }
            java.lang.Runnable r1 = r5.A09     // Catch:{ all -> 0x0456 }
            if (r1 == 0) goto L_0x02dc
            X.4FS r0 = r5.A0o     // Catch:{ all -> 0x0456 }
            r0.BjN(r1)     // Catch:{ all -> 0x0456 }
        L_0x02dc:
            X.4FS r12 = r5.A0o     // Catch:{ all -> 0x0456 }
            X.3Zi r7 = X.C69963Zi.A00(r5, r2)     // Catch:{ all -> 0x0456 }
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.String r6 = "CompanionRegistrationManager/linkCodePairSuccessRunnable"
            java.lang.Runnable r0 = r12.Bkn(r7, r6, r0)     // Catch:{ all -> 0x0456 }
            r5.A09 = r0     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = r5.A0E     // Catch:{ all -> 0x0456 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0456 }
            char[] r7 = r0.toCharArray()     // Catch:{ all -> 0x0456 }
            r6 = 131072(0x20000, float:1.83671E-40)
            r1 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKey r1 = X.C627236i.A08(r0, r10, r7, r6, r1)     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0432 }
            X.C18290x4.A1S(r1, r0, r9)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0432 }
            byte[] r7 = r0.doFinal(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0432 }
            if (r7 == 0) goto L_0x042c
            int r6 = r7.length     // Catch:{ all -> 0x0456 }
            r1 = 0
        L_0x0311:
            if (r1 >= r6) goto L_0x042c
            byte r0 = r7[r1]     // Catch:{ all -> 0x0456 }
            if (r0 == 0) goto L_0x036b
            r13 = 5
            X.2jv r1 = new X.2jv     // Catch:{ all -> 0x0456 }
            r1.<init>(r7, r13)     // Catch:{ all -> 0x0456 }
            X.2KI r0 = r5.A04     // Catch:{ all -> 0x0456 }
            X.2ew r0 = r0.A00     // Catch:{ all -> 0x0456 }
            byte[] r8 = X.AnonymousClass36G.A08(r0, r1)     // Catch:{ all -> 0x0456 }
            java.security.SecureRandom r0 = X.AnonymousClass29O.A00()     // Catch:{ all -> 0x0456 }
            byte[] r7 = new byte[r2]     // Catch:{ all -> 0x0456 }
            r0.nextBytes(r7)     // Catch:{ all -> 0x0456 }
            java.security.SecureRandom r0 = X.AnonymousClass29O.A00()     // Catch:{ all -> 0x0456 }
            byte[] r14 = new byte[r2]     // Catch:{ all -> 0x0456 }
            r0.nextBytes(r14)     // Catch:{ all -> 0x0456 }
            java.security.SecureRandom r0 = X.AnonymousClass29O.A00()     // Catch:{ all -> 0x0456 }
            byte[] r12 = new byte[r3]     // Catch:{ all -> 0x0456 }
            r0.nextBytes(r12)     // Catch:{ all -> 0x0456 }
            java.lang.String r1 = "link_code_pairing_key_bundle_encryption_key"
            java.nio.charset.Charset r0 = X.AnonymousClass79X.A05     // Catch:{ all -> 0x0456 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x0456 }
            byte[] r1 = X.AnonymousClass31Q.A02(r8, r14, r0, r2)     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r15 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x0456 }
            r15.<init>(r1, r0)     // Catch:{ all -> 0x0456 }
            X.2KK r0 = r5.A05     // Catch:{ all -> 0x0456 }
            X.2e4 r0 = r0.A01     // Catch:{ all -> 0x0456 }
            X.2jv r0 = r0.A00     // Catch:{ all -> 0x0456 }
            byte[] r9 = r0.A01     // Catch:{ all -> 0x0456 }
            r10 = 3
            byte[][] r0 = new byte[r10][]     // Catch:{ all -> 0x0456 }
            r17 = 0
            r0[r17] = r9     // Catch:{ all -> 0x0456 }
            r6 = 1
            r0[r6] = r11     // Catch:{ all -> 0x0456 }
            r3 = 2
            byte[] r16 = X.AnonymousClass36A.A04(r7, r0, r3)     // Catch:{ all -> 0x0456 }
            goto L_0x036e
        L_0x036b:
            int r1 = r1 + 1
            goto L_0x0311
        L_0x036e:
            javax.crypto.Cipher r1 = X.C18320x8.A0v()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x044c }
            javax.crypto.spec.IvParameterSpec r0 = X.C18330xA.A0D(r12)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x044c }
            r2 = r1
            r1 = r16
            byte[] r1 = X.C18310x6.A1Y(r15, r0, r2, r1, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x044c }
            byte[][] r0 = new byte[r10][]     // Catch:{ all -> 0x0456 }
            r0[r17] = r14     // Catch:{ all -> 0x0456 }
            byte[] r12 = X.AnonymousClass36A.A03(r12, r1, r0, r6, r3)     // Catch:{ all -> 0x0456 }
            X.2jv r1 = new X.2jv     // Catch:{ all -> 0x0456 }
            r1.<init>(r11, r13)     // Catch:{ all -> 0x0456 }
            X.2KK r0 = r5.A05     // Catch:{ all -> 0x0456 }
            X.2ew r0 = r0.A00     // Catch:{ all -> 0x0456 }
            byte[] r1 = X.AnonymousClass36G.A08(r0, r1)     // Catch:{ all -> 0x0456 }
            byte[][] r0 = new byte[r10][]     // Catch:{ all -> 0x0456 }
            r0[r17] = r8     // Catch:{ all -> 0x0456 }
            byte[] r2 = X.AnonymousClass36A.A03(r1, r7, r0, r6, r3)     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "adv_secret"
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x0456 }
            r0 = 32
            byte[] r0 = X.AnonymousClass31Q.A00(r2, r1, r0)     // Catch:{ all -> 0x0456 }
            r5.A0G = r0     // Catch:{ all -> 0x0456 }
            X.2Vq r1 = r5.A0U     // Catch:{ all -> 0x0456 }
            com.whatsapp.jid.UserJid r2 = r5.A07     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "companion/registration/send-link-code-companion-reg-companion-finish"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            X.31C r8 = r1.A00     // Catch:{ all -> 0x0456 }
            java.lang.String r1 = r8.A03()     // Catch:{ all -> 0x0456 }
            X.6kI r3 = X.C135206kI.A00     // Catch:{ all -> 0x0456 }
            byte[] r11 = r4.getBytes()     // Catch:{ all -> 0x0456 }
            r0 = 22
            X.1wm r10 = new X.1wm     // Catch:{ all -> 0x0456 }
            r10.<init>((java.lang.String) r1, (int) r0)     // Catch:{ all -> 0x0456 }
            X.2rL r7 = X.C56052rL.A01()     // Catch:{ all -> 0x0456 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "md"
            X.C56052rL.A0D(r7, r1, r0)     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "to"
            X.C56052rL.A06(r3, r7, r0)     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "link_code_companion_reg"
            X.2rL r6 = X.C56052rL.A04(r0)     // Catch:{ all -> 0x0456 }
            r1 = r20
            r0 = r19
            X.C56052rL.A0D(r6, r1, r0)     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "link_code_companion_reg->jid"
            boolean r0 = X.C626836d.A0L(r2, r0)     // Catch:{ all -> 0x0456 }
            if (r0 == 0) goto L_0x03f0
            java.lang.String r0 = "jid"
            X.C56052rL.A06(r2, r6, r0)     // Catch:{ all -> 0x0456 }
        L_0x03f0:
            java.lang.String r0 = "link_code_pairing_wrapped_key_bundle"
            X.2rL r0 = X.C56052rL.A04(r0)     // Catch:{ all -> 0x0456 }
            r3 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            r1 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            X.C626836d.A0H(r12, r3, r1)     // Catch:{ all -> 0x0456 }
            X.C56052rL.A09(r0, r6, r12)     // Catch:{ all -> 0x0456 }
            java.lang.String r0 = "companion_identity_public"
            X.2rL r0 = X.C56052rL.A04(r0)     // Catch:{ all -> 0x0456 }
            X.C626836d.A0H(r9, r3, r1)     // Catch:{ all -> 0x0456 }
            X.C56052rL.A09(r0, r6, r9)     // Catch:{ all -> 0x0456 }
            X.2rL r0 = X.C56052rL.A04(r18)     // Catch:{ all -> 0x0456 }
            X.C626836d.A0H(r11, r3, r1)     // Catch:{ all -> 0x0456 }
            X.C56052rL.A09(r0, r6, r11)     // Catch:{ all -> 0x0456 }
            X.C56052rL.A07(r6, r7)     // Catch:{ all -> 0x0456 }
            X.C41032Ir.A08(r7, r10)     // Catch:{ all -> 0x0456 }
            X.36K r1 = r7.A0F()     // Catch:{ all -> 0x0456 }
            r0 = 365(0x16d, float:5.11E-43)
            r8.A0G(r1, r0)     // Catch:{ all -> 0x0456 }
            goto L_0x0454
        L_0x042c:
            java.lang.String r0 = "companion/registration/companion-finish/aborting as primary ADV public key is 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            goto L_0x0451
        L_0x0432:
            java.lang.String r0 = "companion/registration/companion-finish/failed to decrypt primary ADV public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            goto L_0x0451
        L_0x0438:
            java.lang.String r0 = "companion/registration/companion-finish/some required registration data is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
            goto L_0x0451
        L_0x043e:
            java.lang.String r0 = "WrappedPrimaryEphemeralPubData/input byte array length too small"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x0445 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0445 }
        L_0x0445:
            r1 = move-exception
            java.lang.String r0 = "companion/registration/primary-hello/received invalid primary hello data"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0456 }
            goto L_0x0451
        L_0x044c:
            java.lang.String r0 = "companion/registration/companion-finish/failed to encrypt key bundle"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0456 }
        L_0x0451:
            r5.A0B()     // Catch:{ all -> 0x0456 }
        L_0x0454:
            monitor-exit(r5)
            return
        L_0x0456:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0459:
            X.2qk r5 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "primary_hello:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            X.C18310x6.A1Q(r1, r0, r11)
            r1.append(r4)
            goto L_0x04b8
        L_0x0471:
            java.lang.String r0 = "refresh_code"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0520
            java.lang.String r0 = "link_code_pairing_ref"
            X.36K r0 = r1.A0m(r0)
            java.lang.String r3 = r0.A0n()
            java.lang.String r2 = "force_manual_refresh"
            java.lang.String r0 = "false"
            boolean r4 = X.AnonymousClass36K.A0X(r1, r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x04c3
            X.2qk r5 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "refresh_code:"
        L_0x049b:
            r1.append(r0)
            r1.append(r3)
            goto L_0x04b8
        L_0x04a2:
            X.2qk r5 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "companion_hello:"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ","
            X.C18310x6.A1Q(r1, r0, r12)
            r1.append(r11)
        L_0x04b8:
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "invalid_link_code_reg_notification"
            r5.A0A(r0, r1, r2)
            return
        L_0x04c3:
            X.39T r0 = r9.A01()
            r9.A03(r0)
            X.2dy r0 = r9.A04
            X.1iA r2 = r0.A00()
            monitor-enter(r2)
            java.lang.String r0 = "companion/registration/refresh-code/received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x051d }
            X.2jr r0 = r2.A0S     // Catch:{ all -> 0x051d }
            int r1 = r0.A00()     // Catch:{ all -> 0x051d }
            r0 = 10
            if (r1 < r0) goto L_0x0516
            r0 = 14
            if (r1 > r0) goto L_0x0516
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0t     // Catch:{ all -> 0x051d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x051d }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x051d }
            if (r0 != 0) goto L_0x04f6
            java.lang.String r0 = "companion/registration/refresh-code/different session"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x051d }
            goto L_0x051b
        L_0x04f6:
            r2.A0A()     // Catch:{ all -> 0x051d }
            if (r4 == 0) goto L_0x050f
            java.util.Iterator r1 = X.C61102zi.A03(r2)     // Catch:{ all -> 0x051d }
        L_0x04ff:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x051d }
            if (r0 == 0) goto L_0x051b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x051d }
            X.2rf r0 = (X.C56242rf) r0     // Catch:{ all -> 0x051d }
            r0.A00()     // Catch:{ all -> 0x051d }
            goto L_0x04ff
        L_0x050f:
            com.whatsapp.jid.UserJid r1 = r2.A07     // Catch:{ all -> 0x051d }
            r0 = 1
            r2.A0F(r1, r0)     // Catch:{ all -> 0x051d }
            goto L_0x051b
        L_0x0516:
            java.lang.String r0 = "companion/registration/refresh-code/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x051d }
        L_0x051b:
            monitor-exit(r2)
            return
        L_0x051d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0520:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LinkCodeCompanionRegNotificationHandler/handleNotification stage="
            X.C18260x0.A0q(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gI.A05(X.36K, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1gI(X.C55682qk r8, X.C46362bV r9, X.C48442eu r10, X.C28881hv r11, X.C42742Pi r12, X.C47872dy r13, X.AnonymousClass31C r14, X.C55892r5 r15, X.AnonymousClass4FS r16) {
        /*
            r7 = this;
            int[] r5 = X.C18330xA.A0E()
            r1 = 0
            r0 = 252(0xfc, float:3.53E-43)
            r5[r1] = r0
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A05 = r4
            r7.A00 = r9
            r7.A04 = r13
            r7.A02 = r11
            r7.A01 = r10
            r7.A03 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gI.<init>(X.2qk, X.2bV, X.2eu, X.1hv, X.2Pi, X.2dy, X.31C, X.2r5, X.4FS):void");
    }
}
