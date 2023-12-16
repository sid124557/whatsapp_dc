package X;

/* renamed from: X.3aa  reason: invalid class name and case insensitive filesystem */
public class C70493aa implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public C70493aa(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x030c, code lost:
        if (r2 == null) goto L_0x030e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0239 A[Catch:{ Exception -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x025f A[Catch:{ Exception -> 0x0292 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r7 = r25
            int r0 = r7.A04
            switch(r0) {
                case 0: goto L_0x046a;
                case 1: goto L_0x0449;
                case 2: goto L_0x03f7;
                case 3: goto L_0x03af;
                case 4: goto L_0x001b;
                case 5: goto L_0x02b9;
                case 6: goto L_0x02a0;
                case 7: goto L_0x0114;
                case 8: goto L_0x00f6;
                case 9: goto L_0x0068;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r7.A00
            X.3MF r0 = (X.AnonymousClass3MF) r0
            java.lang.String r4 = r7.A02
            java.lang.String r3 = r7.A03
            java.lang.Object r2 = r7.A01
            java.util.Map r2 = (java.util.Map) r2
            X.2xG r1 = r0.A08
            java.lang.String r0 = r0.A0D
            r1.A01(r4, r3, r0, r2)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r6 = r7.A00
            com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver r6 = (com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver) r6
            java.lang.Object r5 = r7.A01
            java.lang.String r0 = r7.A02
            java.lang.String r3 = r7.A03
            X.4uZ r2 = X.C18310x6.A0S(r0)
            X.2qz r1 = r6.A03
            r0 = 0
            X.34x r4 = X.C55832qz.A01(r2, r1, r3, r0)
            X.2w3 r1 = X.C614030o.A00(r4)
            if (r1 == 0) goto L_0x001a
            X.30o r0 = r6.A02
            boolean r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0056
            X.3Wi r2 = r6.A00
            r0 = 30
            X.3Zz r1 = new X.3Zz
            r1.<init>(r6, r0, r4)
        L_0x0047:
            r2.A0S(r1)
        L_0x004a:
            X.2oD r3 = r6.A01
            com.whatsapp.jid.UserJid r2 = r4.A0o()
            r1 = 2
            r0 = 1
            r3.A00(r2, r1, r0, r0)
            return
        L_0x0056:
            X.30o r0 = r6.A02
            boolean r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x004a
            X.3Wi r2 = r6.A00
            r0 = 28
            X.3aM r1 = new X.3aM
            r1.<init>(r6, r4, r5, r0)
            goto L_0x0047
        L_0x0068:
            java.lang.Object r0 = r7.A00
            X.2na r0 = (X.C53742na) r0
            java.lang.String r3 = r7.A02
            java.lang.String r2 = r7.A03
            java.lang.Object r1 = r7.A01
            X.4Dh r1 = (X.C84684Dh) r1
            X.2hM r7 = r0.A05
            X.2oU r4 = r0.A03
            android.content.Context r9 = r4.A00
            java.lang.String r12 = "blocked_ban_appeals"
            X.2zf r8 = r7.A01
            long r21 = r8.A03()
            r4 = 1
            long[] r6 = new long[r4]
            r23 = 1
            X.4Ko r5 = new X.4Ko
            r5.<init>(r6, r4, r7)
            X.2s6 r4 = r7.A00
            boolean r4 = r4.A07(r5)
            r24 = 0
            if (r4 == 0) goto L_0x009c
            long r4 = r8.A02()
            r6[r24] = r4
        L_0x009c:
            java.lang.String r15 = android.os.Environment.getExternalStorageState()
            X.34j r8 = r7.A04
            r10 = 0
            r19 = r6[r24]
            r13 = r10
            r14 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r11 = r10
            java.lang.String r15 = r8.A04(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24)
            X.2DG r4 = r0.A00
            X.3dX r4 = r4.A00
            X.3Db r4 = r4.A01
            X.1VX r10 = X.C64333Db.A4B(r4)
            X.2s4 r8 = X.C64333Db.A07(r4)
            X.33p r9 = X.C64333Db.A2s(r4)
            X.8qC r12 = X.C64333Db.A9V(r4)
            X.4C1 r6 = r4.AXO
            X.4C1 r5 = r4.A1y
            X.28T r11 = X.C64333Db.A7R(r4)
            X.1dW r4 = new X.1dW
            r7 = r4
            r13 = r3
            r14 = r2
            r16 = r6
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ip r2 = r0.A02
            boolean r2 = r2.A0F()
            if (r2 == 0) goto L_0x00ee
            r3 = 3
            X.4Kd r2 = new X.4Kd
            r2.<init>(r1, r3, r0)
            r4.Bh4(r2)
            return
        L_0x00ee:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1.BSq(r0)
            return
        L_0x00f6:
            java.lang.Object r0 = r7.A00
            X.3Sm r0 = (X.C68263Sm) r0
            java.lang.Object r3 = r7.A01
            android.util.Pair r3 = (android.util.Pair) r3
            X.2P5 r0 = r0.A00
            X.8qC r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.30e r2 = (X.C613130e) r2
            int r1 = X.C18280x3.A03(r3)
            java.lang.Object r0 = r3.second
            java.lang.String r0 = (java.lang.String) r0
            r2.A03(r0, r1)
            return
        L_0x0114:
            java.lang.Object r1 = r7.A00
            X.2hq r1 = (X.C50232hq) r1
            java.lang.String r12 = r7.A02
            java.lang.String r11 = r7.A03
            java.lang.Object r0 = r7.A01
            X.4DZ r0 = (X.AnonymousClass4DZ) r0
            X.2oU r2 = r1.A02
            android.content.Context r2 = r2.A00
            java.lang.String r13 = X.C57922uQ.A00(r2, r12)
            java.lang.String r2 = "AccountDefenceDataManager/resendDeviceConfirmationNotice"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.33p r9 = r1.A03
            X.8qC r5 = r9.A01
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r5)
            java.lang.String r2 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r3 = 0
            java.lang.String r10 = r4.getString(r2, r3)
            X.33i r2 = r1.A00
            android.telephony.TelephonyManager r6 = r2.A0N()
            r4 = 0
            if (r6 == 0) goto L_0x016f
            java.lang.String r2 = r6.getNetworkOperator()
        L_0x0149:
            X.34d r8 = X.AnonymousClass34d.A00(r2)
            if (r6 == 0) goto L_0x0153
            java.lang.String r4 = r6.getSimOperator()
        L_0x0153:
            X.34d r7 = X.AnonymousClass34d.A00(r4)
            android.content.SharedPreferences r6 = X.C18300x5.A0B(r5)
            r2 = 0
            java.lang.String r4 = "reg_attempts_device_confirmation"
            int r2 = r6.getInt(r4, r2)
            int r2 = r2 + 1
            X.C18260x0.A0L(r9, r4, r2)
            X.7Rl r9 = new X.7Rl
            r9.<init>(r2)
            r2 = -1
            goto L_0x0171
        L_0x016f:
            r2 = r3
            goto L_0x0149
        L_0x0171:
            X.2sl r6 = r1.A04     // Catch:{ Exception -> 0x0292 }
            android.content.SharedPreferences r5 = X.C18300x5.A0B(r5)     // Catch:{ Exception -> 0x0292 }
            java.lang.String r4 = "registration_failure_reason"
            java.lang.String r5 = X.AnonymousClass0x9.A0v(r5, r4)     // Catch:{ Exception -> 0x0292 }
            boolean r4 = r6.A0F()     // Catch:{ Exception -> 0x0292 }
            if (r4 != 0) goto L_0x0188
            r13 = 15
            r15 = 0
            goto L_0x01e2
        L_0x0188:
            r3 = 1
            r6.A0E(r3)     // Catch:{ Exception -> 0x0292 }
            byte[] r17 = r6.A0H(r11, r12)     // Catch:{ Exception -> 0x0292 }
            java.lang.String r3 = "sendAccountDefenceDeviceConfirmation"
            byte[] r18 = r6.A0G(r3)     // Catch:{ Exception -> 0x0292 }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0292 }
            if (r10 == 0) goto L_0x01a3
            java.lang.String r3 = "mistyped"
            X.C18280x3.A1B(r3, r10, r4)     // Catch:{ Exception -> 0x0292 }
        L_0x01a3:
            java.lang.String r3 = "reason"
            X.C18280x3.A1B(r3, r5, r4)     // Catch:{ Exception -> 0x0292 }
            org.json.JSONObject r3 = r9.A00()     // Catch:{ Exception -> 0x0292 }
            byte[] r5 = X.AnonymousClass0x9.A1R(r3)     // Catch:{ Exception -> 0x0292 }
            java.lang.String r3 = "client_metrics"
            X.C56912sl.A00(r8, r7, r3, r5, r4)     // Catch:{ Exception -> 0x0292 }
            r6.A08(r4)     // Catch:{ Exception -> 0x0292 }
            X.5Zj r10 = r6.A0P     // Catch:{ Exception -> 0x0292 }
            java.lang.String r3 = "send_device_confirm_entrypoint"
            java.lang.String r14 = r6.A04(r11, r3)     // Catch:{ Exception -> 0x0292 }
            java.util.List r15 = r6.A05()     // Catch:{ Exception -> 0x0292 }
            X.2Ic r9 = r6.A0N     // Catch:{ Exception -> 0x0292 }
            r19 = 1
            X.68P r8 = new X.68P     // Catch:{ Exception -> 0x0292 }
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0292 }
            java.lang.Object r10 = X.C105935Wz.A00(r8)     // Catch:{ Exception -> 0x0292 }
            X.5Sy r10 = (X.C104945Sy) r10     // Catch:{ Exception -> 0x0292 }
            if (r10 != 0) goto L_0x01ec
            java.lang.String r1 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/result is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x0292 }
            r0.onError(r2)     // Catch:{ Exception -> 0x0292 }
            return
        L_0x01e2:
            X.5Sy r10 = new X.5Sy     // Catch:{ Exception -> 0x0292 }
            r12 = r3
            r11 = r3
            r14 = r2
            r16 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0292 }
        L_0x01ec:
            int r5 = r10.A00     // Catch:{ Exception -> 0x0292 }
            r3 = 15
            if (r5 != r3) goto L_0x01fb
            java.lang.String r1 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x0292 }
            r0.onError(r3)     // Catch:{ Exception -> 0x0292 }
            return
        L_0x01fb:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0292 }
            java.lang.String r3 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/success status: "
            X.C18260x0.A0y(r3, r4, r5)     // Catch:{ Exception -> 0x0292 }
            r4 = 11
            X.5Pg r3 = r1.A06     // Catch:{ Exception -> 0x0292 }
            if (r5 != r4) goto L_0x0276
            java.lang.String r1 = "AccountDefenceLocalDataRepository/saveRetryLimitReachedForResendingNotice/"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0292 }
            X.2y5 r7 = r3.A01     // Catch:{ Exception -> 0x0292 }
            java.lang.String r6 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r4 = X.C60152y5.A00(r7, r6)     // Catch:{ Exception -> 0x0292 }
            java.lang.String r3 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r1 = 1
            r4.putBoolean(r3, r1)     // Catch:{ Exception -> 0x0292 }
            boolean r1 = r4.commit()     // Catch:{ Exception -> 0x0292 }
            if (r1 != 0) goto L_0x0228
            java.lang.String r1 = "AccountDefenceLocalDataRepository/saveRetryLimitReachedForResendingNotice/error"
        L_0x0225:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x0292 }
        L_0x0228:
            java.lang.String r1 = r10.A03     // Catch:{ Exception -> 0x0292 }
            r3 = -1
            long r8 = X.AnonymousClass36l.A01(r1, r3)     // Catch:{ Exception -> 0x0292 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r3
            r3 = 0
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x025f
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0292 }
            long r3 = r3 + r8
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0292 }
            java.lang.String r1 = "AccountDefenceLocalDataRepository/saveRetryTimeForResendingNotice/"
            X.C18260x0.A12(r1, r5, r3)     // Catch:{ Exception -> 0x0292 }
            android.content.SharedPreferences$Editor r5 = X.C60152y5.A00(r7, r6)     // Catch:{ Exception -> 0x0292 }
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r5.putLong(r1, r3)     // Catch:{ Exception -> 0x0292 }
            boolean r1 = r5.commit()     // Catch:{ Exception -> 0x0292 }
            if (r1 != 0) goto L_0x025b
            java.lang.String r1 = "AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveRetryTimeForResendingNotice/error"
        L_0x0258:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x0292 }
        L_0x025b:
            r0.BPS(r10)     // Catch:{ Exception -> 0x0292 }
            goto L_0x0291
        L_0x025f:
            java.lang.String r1 = "AccountDefenceLocalDataRepository/clearRetryTimeForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0292 }
            android.content.SharedPreferences$Editor r3 = X.C60152y5.A00(r7, r6)     // Catch:{ Exception -> 0x0292 }
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r3.remove(r1)     // Catch:{ Exception -> 0x0292 }
            boolean r1 = r3.commit()     // Catch:{ Exception -> 0x0292 }
            if (r1 != 0) goto L_0x025b
            java.lang.String r1 = "AccountDefenceLocalDataRepository/clearRetryTimeForResendingNotice/error"
            goto L_0x0258
        L_0x0276:
            java.lang.String r1 = "AccountDefenceLocalDataRepository/clearRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0292 }
            X.2y5 r7 = r3.A01     // Catch:{ Exception -> 0x0292 }
            java.lang.String r6 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r3 = X.C60152y5.A00(r7, r6)     // Catch:{ Exception -> 0x0292 }
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r3.remove(r1)     // Catch:{ Exception -> 0x0292 }
            boolean r1 = r3.commit()     // Catch:{ Exception -> 0x0292 }
            if (r1 != 0) goto L_0x0228
            java.lang.String r1 = "AccountDefenceLocalDataRepository/clearRetryLimitReachedForResendingNotice/error"
            goto L_0x0225
        L_0x0291:
            return
        L_0x0292:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/error "
            X.C18260x0.A1Q(r3, r1, r4)
            r0.onError(r2)
            return
        L_0x02a0:
            java.lang.Object r1 = r7.A00
            X.33I r1 = (X.AnonymousClass33I) r1
            java.lang.Object r0 = r7.A01
            X.2Ri r0 = (X.C43242Ri) r0
            java.lang.String r4 = r7.A02
            java.lang.String r3 = r7.A03
            X.2dz r2 = r1.A0G
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.2vg r0 = new X.2vg
            r0.<init>(r1, r4, r3)
            r2.A01(r0)
            return
        L_0x02b9:
            java.lang.Object r5 = r7.A00
            com.whatsapp.otp.OtpIdentityHashRequestedReceiver r5 = (com.whatsapp.otp.OtpIdentityHashRequestedReceiver) r5
            java.lang.Object r6 = r7.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r4 = r7.A02
            java.lang.String r3 = r7.A03
            X.33Z r2 = r5.A00
            if (r2 == 0) goto L_0x03a8
            X.33n r0 = r2.A0A
            X.35n r0 = r0.A00
            X.2KK r0 = r0.A04()
            java.security.MessageDigest r1 = X.AnonymousClass0x7.A0t()     // Catch:{ NoSuchAlgorithmException -> 0x02ec }
            X.2e4 r0 = r0.A01     // Catch:{ NoSuchAlgorithmException -> 0x02ec }
            X.2jv r0 = r0.A00     // Catch:{ NoSuchAlgorithmException -> 0x02ec }
            byte[] r0 = r0.A00()     // Catch:{ NoSuchAlgorithmException -> 0x02ec }
            byte[] r1 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x02ec }
            r0 = 8
            byte[] r0 = X.C18320x8.A1Z(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x02ec }
            java.lang.String r2 = X.C18290x4.A0t(r0)     // Catch:{ NoSuchAlgorithmException -> 0x02ec }
            goto L_0x02f9
        L_0x02ec:
            r1 = move-exception
            java.lang.String r0 = "DeviceADVInfoManager/getMyIdentityHash no such algorithm exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.2pv r1 = r2.A0E
            r0 = 1
            r1.A04(r0)
            r2 = 0
        L_0x02f9:
            X.2RY r5 = r5.A02
            if (r5 == 0) goto L_0x03a0
            X.2sr r1 = r5.A00
            X.6kH r0 = X.C56972sr.A03(r1)
            boolean r0 = r1.A0b(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x030e
            r9 = 0
            if (r2 != 0) goto L_0x0352
        L_0x030e:
            r9 = 1
            X.33p r8 = r5.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r8)
            java.lang.String r7 = "d_identity_key"
            java.lang.String r2 = X.C18280x3.A0Z(r0, r7)
            if (r2 != 0) goto L_0x0336
            r0 = 10
            byte[] r1 = new byte[r0]
            java.util.Random r0 = X.AnonymousClass0x9.A1C()
            r0.nextBytes(r1)
            java.lang.String r2 = X.C18290x4.A0t(r1)
            X.C162457s7.A0D(r2)
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r8)
            X.C18270x1.A0j(r0, r7, r2)
        L_0x0336:
            java.security.MessageDigest r1 = X.AnonymousClass0x7.A0t()
            byte[] r0 = X.AnonymousClass0x2.A1a(r2)
            r1.update(r0)
            byte[] r1 = r1.digest()
            r0 = 8
            byte[] r0 = X.C18320x8.A1Z(r1, r0)
            java.lang.String r2 = X.C18290x4.A0t(r0)
            X.C162457s7.A0D(r2)
        L_0x0352:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "client_"
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r2, r1)
            r0 = 2
            X.C162457s7.A0J(r2, r0)
            android.content.Intent r1 = X.C18320x8.A07()
            r1.setPackage(r4)
            java.lang.String r0 = "com.whatsapp.otp.ID_HASH_REQUESTED"
            r1.setAction(r0)
            java.lang.String r0 = "id_hash"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "request_id"
            r1.putExtra(r0, r3)
            X.C385027w.A00(r6, r1)
            r6.sendBroadcast(r1)
            X.2Wh r0 = r5.A03
            java.util.ArrayList r1 = r0.A00(r4)
            java.lang.String r0 = ","
            java.lang.String r3 = X.C73723fy.A09(r0, r1)
            X.2ph r2 = r5.A02
            X.1YV r1 = new X.1YV
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A00 = r0
            r1.A01 = r4
            r1.A02 = r3
            X.4FV r0 = r2.A06
            r0.BhD(r1)
            return
        L_0x03a0:
            java.lang.String r0 = "otpIdentityHashService"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03a8:
            java.lang.String r0 = "deviceADVInfoHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03af:
            java.lang.Object r2 = r7.A00
            X.03q r2 = (X.C003203q) r2
            java.lang.String r4 = r7.A02
            java.lang.Object r1 = r7.A01
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r5 = r7.A03
            r0 = 3
            X.C162457s7.A0J(r5, r0)
            X.0df r6 = r2.getSupportFragmentManager()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r1.iterator()
        L_0x03cb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03dd
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C96854x6
            if (r0 == 0) goto L_0x03cb
            r3.add(r1)
            goto L_0x03cb
        L_0x03dd:
            java.util.ArrayList r2 = X.C73783g4.A0c(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x03e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x043f
            java.lang.Object r0 = r1.next()
            X.4x6 r0 = (X.C96854x6) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r2.add(r0)
            goto L_0x03e5
        L_0x03f7:
            java.lang.Object r2 = r7.A00
            X.03q r2 = (X.C003203q) r2
            java.lang.String r4 = r7.A02
            java.lang.Object r1 = r7.A01
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r5 = r7.A03
            r0 = 3
            X.C162457s7.A0J(r5, r0)
            X.0df r6 = r2.getSupportFragmentManager()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r1.iterator()
        L_0x0413:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0425
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C96854x6
            if (r0 == 0) goto L_0x0413
            r3.add(r1)
            goto L_0x0413
        L_0x0425:
            java.util.ArrayList r2 = X.C73783g4.A0c(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x042d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x043f
            java.lang.Object r0 = r1.next()
            X.4x6 r0 = (X.C96854x6) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r2.add(r0)
            goto L_0x042d
        L_0x043f:
            X.21J r0 = X.AnonymousClass21J.INVITE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.AnonymousClass27t.A00(r0, r4, r5, r2)
            X.AnonymousClass344.A01(r0, r6)
            return
        L_0x0449:
            java.lang.Object r6 = r7.A00
            X.4oJ r6 = (X.C93314oJ) r6
            java.lang.Object r5 = r7.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r4 = r7.A02
            java.lang.String r3 = r7.A03
            r1 = 2131886463(0x7f12017f, float:1.9407506E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            r2 = 0
            X.C18280x3.A19(r4, r3, r0)
            java.lang.String r1 = r5.getString(r1, r0)
            X.3Wi r0 = r6.A0X
            r0.A0W(r1, r2)
            return
        L_0x046a:
            java.lang.Object r5 = r7.A00
            X.3XA r5 = (X.AnonymousClass3XA) r5
            java.lang.String r4 = r7.A02
            java.lang.String r3 = r7.A03
            java.lang.Object r1 = r7.A01
            X.3Ls r1 = (X.C66513Ls) r1
            X.23E r2 = X.AnonymousClass23E.SUCCESS
            r0 = 0
            X.2vy r1 = X.C58882vy.A00(r1, r0, r4, r3)
            X.2NR r0 = new X.2NR
            r0.<init>(r1, r2, r4)
            r5.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70493aa.run():void");
    }
}
