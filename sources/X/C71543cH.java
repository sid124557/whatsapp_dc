package X;

import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.registration.VerifyTwoFactorAuth;

/* renamed from: X.3cH  reason: invalid class name and case insensitive filesystem */
public class C71543cH implements Runnable {
    public Object A00;
    public final int A01;

    public C71543cH(VerifyPhoneNumber verifyPhoneNumber, int i) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                this.A00 = verifyPhoneNumber;
                return;
            default:
                this.A00 = verifyPhoneNumber;
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: com.whatsapp.registration.VerifyPhoneNumber} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: com.whatsapp.registration.VerifyTwoFactorAuth} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03bf, code lost:
        r3.BkM(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0417, code lost:
        X.C621433s.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x041a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x044c, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x044f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0486, code lost:
        r2.A0H(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0489, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0285, code lost:
        X.C06270Wx.A03(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0288, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r5 = r21
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0511;
                case 1: goto L_0x0497;
                case 2: goto L_0x048a;
                case 3: goto L_0x047e;
                case 4: goto L_0x0476;
                case 5: goto L_0x0080;
                case 6: goto L_0x0450;
                case 7: goto L_0x0443;
                case 8: goto L_0x041b;
                case 9: goto L_0x004e;
                case 10: goto L_0x0412;
                case 11: goto L_0x03fe;
                case 12: goto L_0x03f2;
                case 13: goto L_0x03e8;
                case 14: goto L_0x03da;
                case 15: goto L_0x03d2;
                case 16: goto L_0x03c3;
                case 17: goto L_0x03aa;
                case 18: goto L_0x0395;
                case 19: goto L_0x037c;
                case 20: goto L_0x032a;
                case 21: goto L_0x0322;
                case 22: goto L_0x02cc;
                case 23: goto L_0x02c4;
                case 24: goto L_0x02b2;
                case 25: goto L_0x0297;
                case 26: goto L_0x028f;
                case 27: goto L_0x0289;
                case 28: goto L_0x027b;
                case 29: goto L_0x0240;
                case 30: goto L_0x022d;
                case 31: goto L_0x0007;
                case 32: goto L_0x0007;
                case 33: goto L_0x0222;
                case 34: goto L_0x020d;
                case 35: goto L_0x0044;
                case 36: goto L_0x01e1;
                case 37: goto L_0x019f;
                case 38: goto L_0x018d;
                case 39: goto L_0x0179;
                case 40: goto L_0x016d;
                case 41: goto L_0x015c;
                case 42: goto L_0x014f;
                case 43: goto L_0x0128;
                case 44: goto L_0x0023;
                case 45: goto L_0x0117;
                case 46: goto L_0x00f2;
                case 47: goto L_0x0014;
                case 48: goto L_0x00de;
                case 49: goto L_0x00aa;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r2 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r2
            X.2nM r1 = r2.A04
            java.lang.String r0 = "notification-problems-troubleshooting"
        L_0x0010:
            r1.A01(r2, r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r1 = r5.A00
            X.5S9 r1 = (X.AnonymousClass5S9) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            r1.A01(r0)
            return
        L_0x0023:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r2 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r2
            X.2xS r1 = r2.A0w
            r0 = 1
            r1.A01(r0)
            X.2xS r1 = r2.A0w
            r0 = 2
            r1.A01(r0)
            java.lang.String r4 = "status_crossposting"
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0013
            X.3dV r0 = r2.A0U
            X.4Fq r3 = r0.A04()
            goto L_0x0519
        L_0x0044:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity r2 = (com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity) r2
            X.2nM r1 = r2.A00
            java.lang.String r0 = "received-verification-code"
            goto L_0x0010
        L_0x004e:
            java.lang.Object r5 = r5.A00
            com.whatsapp.registration.VerifyEmail r5 = (com.whatsapp.registration.VerifyEmail) r5
            com.whatsapp.CodeInputField r0 = r5.A03
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x005d:
            java.lang.String r0 = r0.getCode()
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x0013
            X.2sH r0 = r5.A06
            long r3 = r0.A0H()
            long r1 = r5.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0013
            com.whatsapp.wds.components.button.WDSButton r1 = r5.A0D
            if (r1 != 0) goto L_0x0542
            java.lang.String r0 = "nextButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0080:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.VerifyCaptcha r2 = (com.whatsapp.registration.VerifyCaptcha) r2
            X.2oU r0 = r2.A74()
            java.io.File r1 = X.C54292oU.A03(r0)
            java.lang.String r0 = "captcha_audio.mp3"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)
            r2.A0V = r0
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x054b }
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "VerifyCaptcha/setupAudio/ file does not exists"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IOException -> 0x054b }
            java.io.File r0 = r2.A0V     // Catch:{ IOException -> 0x054b }
            if (r0 != 0) goto L_0x0547
            java.lang.String r0 = "captchaAudioFile"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IOException -> 0x054b }
            throw r0     // Catch:{ IOException -> 0x054b }
        L_0x00aa:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.report.BanReportViewModel r2 = (com.whatsapp.registration.report.BanReportViewModel) r2
            X.5Fj r0 = r2.A03
            java.lang.String r9 = r2.A00
            X.5sw r1 = r0.A00
            X.3Db r0 = r1.A02
            X.2s4 r4 = X.C64333Db.A07(r0)
            X.33p r5 = X.C64333Db.A2s(r0)
            X.8qC r8 = X.C64333Db.A9V(r0)
            X.3FI r7 = X.C64333Db.A8x(r0)
            X.1VX r6 = X.C64333Db.A4B(r0)
            X.4aw r0 = r1.A03
            X.4C1 r10 = r0.A1D
            X.4C1 r11 = r0.A0H
            X.1q5 r3 = new X.1q5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.5n5 r0 = new X.5n5
            r0.<init>(r2)
            r3.Bh4(r0)
            return
        L_0x00de:
            java.lang.Object r4 = r5.A00
            com.whatsapp.registration.report.BanReportViewModel r4 = (com.whatsapp.registration.report.BanReportViewModel) r4
            X.2qI r3 = r4.A07
            java.lang.String r2 = X.C18280x3.A0Y()
            r1 = 0
            X.6AP r0 = new X.6AP
            r0.<init>(r4, r1)
            r3.A04(r0, r2)
            return
        L_0x00f2:
            java.lang.Object r3 = r5.A00
            X.5Ii r3 = (X.C102305Ii) r3
            X.33p r2 = r3.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r1 = "pref_profile_checkpoint_name"
            java.lang.String r0 = X.C18280x3.A0Z(r0, r1)
            if (r0 == 0) goto L_0x0108
            X.C18260x0.A0K(r2, r1)
        L_0x0108:
            X.2ro r0 = r3.A00
            X.3Dh r1 = r0.A00
            java.lang.String r0 = "tmpp"
            java.io.File r0 = r1.A0S(r0)
            X.C18270x1.A0x(r0)
            return
        L_0x0117:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r0 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r0
            X.2b8 r1 = r0.A0p
            java.lang.String r0 = r0.A1E
            r1.A00(r0)
            X.3bl r0 = com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName.A1K
            r0.run()
            return
        L_0x0128:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r0 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r0
            X.8qC r0 = r0.A1A
            java.lang.Object r0 = r0.get()
            X.2ea r0 = (X.C48242ea) r0
            X.2eH r1 = r0.A00
            java.lang.Class<X.3LT> r0 = X.AnonymousClass3LT.class
            X.485 r1 = r1.A02(r0)
            X.3LT r1 = (X.AnonymousClass3LT) r1
            java.lang.String r0 = "ConsumerBridge/onSyncExportMigrationFeatureState"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8qC r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.2sE r0 = (X.C56582sE) r0
            r0.A04()
            return
        L_0x014f:
            java.lang.Object r1 = r5.A00
            X.4ea r1 = (X.C89654ea) r1
            X.2eY r0 = new X.2eY
            r0.<init>(r1)
            r0.A00()
            return
        L_0x015c:
            java.lang.Object r0 = r5.A00
            X.4ea r0 = (X.C89654ea) r0
            X.2eY r2 = new X.2eY
            r2.<init>(r0)
            r1 = 0
            r0 = 2131891668(0x7f1215d4, float:1.9418063E38)
            r2.A01(r1, r0)
            return
        L_0x016d:
            java.lang.Object r1 = r5.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ProfileCheckpointRegisterName/dialog/initprogress/removedialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x0417
        L_0x0179:
            java.lang.Object r0 = r5.A00
            X.4ea r0 = (X.C89654ea) r0
            X.33p r0 = r0.A09
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "google_migrate_import_start_time"
            X.C18270x1.A0i(r1, r0, r2)
            return
        L_0x018d:
            java.lang.Object r0 = r5.A00
            X.4bJ r0 = (X.C88994bJ) r0
            X.5hX r2 = r0.A00
            android.app.Activity r1 = r0.A01
            java.lang.String r0 = "android.settings.DATE_SETTINGS"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)
            r2.A0A(r1, r0)
            return
        L_0x019f:
            java.lang.Object r7 = r5.A00
            X.1iQ r7 = (X.C29191iQ) r7
            java.util.Iterator r6 = X.C61102zi.A03(r7)
        L_0x01a7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r0 = r6.next()
            X.2I2 r0 = (X.AnonymousClass2I2) r0
            int r5 = r7.A00
            int r4 = r7.A01
            X.10z r3 = r0.A00
            X.08M r2 = r3.A04
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r4
            r2.A0G(r1)
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r3.A00
            java.lang.Runnable r0 = r3.A0D
            r1.removeCallbacks(r0)
            r3.A0E()
            goto L_0x01a7
        L_0x01d7:
            X.3Wi r3 = r7.A03
            java.lang.Runnable r2 = r7.A02
            r0 = 500(0x1f4, double:2.47E-321)
            r3.A0T(r2, r0)
            return
        L_0x01e1:
            java.lang.Object r2 = r5.A00
            X.10z r2 = (X.AnonymousClass10z) r2
            X.33p r0 = r2.A06
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "migrate_from_other_app_attempt_count"
            int r1 = X.C18280x3.A02(r1, r0)
            r0 = 4
            r2.A0G(r1, r0)
            r2.A0F(r0)
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r2.A00
            java.lang.Runnable r0 = r2.A0D
            r1.removeCallbacks(r0)
            X.1qH r0 = r2.A0A
            X.1qE r0 = r0.A00
            X.C18290x4.A1L(r0)
            return
        L_0x020d:
            java.lang.Object r3 = r5.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0222:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.4UC r1 = r0.A0I
            r0 = 4
            X.C06270Wx.A04(r1, r0)
            return
        L_0x022d:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r3 = r0.A07
            X.2s5 r2 = r3.A0G
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "confirm_with_second_sms"
            r2.A04(r1, r0)
            X.4UC r2 = r3.A0I
            r1 = 2
            goto L_0x0285
        L_0x0240:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r5 = r0.A07
            X.2hq r0 = r5.A0F
            X.5Pg r1 = r0.A06
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2y5 r1 = r1.A01
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r1 = r1.A03(r0)
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            boolean r2 = X.C18280x3.A1W(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice/result "
            X.C18260x0.A1E(r0, r1, r2)
            if (r2 == 0) goto L_0x026c
            X.4UC r2 = r5.A0H
            r1 = 5
            goto L_0x0285
        L_0x026c:
            long r3 = r5.A0D()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            X.4UC r2 = r5.A0H
            r1 = 1
            if (r0 <= 0) goto L_0x0285
            r1 = 6
            goto L_0x0285
        L_0x027b:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = r0.A07
            X.4UC r2 = r0.A0H
            r1 = 9
        L_0x0285:
            X.C06270Wx.A03(r2, r1)
            return
        L_0x0289:
            java.lang.Object r0 = r5.A00
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x028f:
            java.lang.Object r1 = r5.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 12
            goto L_0x0417
        L_0x0297:
            java.lang.Object r5 = r5.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r5 = (com.whatsapp.registration.VerifyTwoFactorAuth) r5
            X.4FS r0 = r5.A04
            X.33p r3 = r5.A09
            X.2sl r4 = r5.A0N
            java.lang.String r6 = r5.A0V
            java.lang.String r7 = r5.A0W
            X.2oU r2 = r5.A0F
            X.559 r1 = new X.559
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r5.A0Q = r1
            X.C18270x1.A0w(r1, r0)
            return
        L_0x02b2:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r2 = (com.whatsapp.registration.VerifyTwoFactorAuth) r2
            X.317 r0 = r2.A0O
            r0.A09()
            android.content.Intent r0 = X.C627736r.A04(r2)
            r2.startActivity(r0)
            goto L_0x044c
        L_0x02c4:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            r0.A75()
            return
        L_0x02cc:
            java.lang.Object r6 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r6 = (com.whatsapp.registration.VerifyPhoneNumber) r6
            int r0 = r6.A75()
            X.5UY r1 = r6.A18
            if (r0 == 0) goto L_0x031c
            r0 = 0
            r1.A06(r0)
            r0 = 2131429443(0x7f0b0843, float:1.8480559E38)
            android.widget.TextView r4 = X.C18310x6.A0L(r6, r0)
            int r3 = r6.A03
            X.2oU r0 = r6.A0f
            android.content.Context r2 = r0.A00
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            r1 = 2131888633(0x7f1209f9, float:1.9411907E38)
            if (r3 == r0) goto L_0x0317
            r0 = 2
            r1 = 2131888619(0x7f1209eb, float:1.9411878E38)
            if (r3 == r0) goto L_0x0317
            r0 = 3
            r1 = 2131888627(0x7f1209f3, float:1.9411895E38)
            if (r3 == r0) goto L_0x0317
            r0 = 4
            r1 = 2131888624(0x7f1209f0, float:1.9411889E38)
            if (r3 == r0) goto L_0x0317
            r0 = 5
            if (r3 == r0) goto L_0x0314
            java.lang.String r0 = ""
        L_0x0309:
            r4.setText(r0)
        L_0x030c:
            android.os.Handler r2 = r6.A0H
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.postDelayed(r5, r0)
            return
        L_0x0314:
            r1 = 2131888630(0x7f1209f6, float:1.94119E38)
        L_0x0317:
            java.lang.String r0 = X.C18290x4.A0l(r2, r1)
            goto L_0x0309
        L_0x031c:
            r0 = 8
            r1.A06(r0)
            goto L_0x030c
        L_0x0322:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r0 = (com.whatsapp.registration.VerifyPhoneNumber) r0
            r0.A7Q()
            return
        L_0x032a:
            java.lang.Object r3 = r5.A00
            X.4eZ r3 = (X.C89644eZ) r3
            X.2sr r0 = r3.A01
            com.whatsapp.Me r0 = r0.A0E()
            if (r0 == 0) goto L_0x034c
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/delete old phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Context r2 = r3.getApplicationContext()
            X.33p r1 = r3.A09
            X.2sr r0 = r3.A01
            com.whatsapp.Me r0 = r0.A0E()
            java.lang.String r0 = r0.number
            X.AnonymousClass36Q.A02(r2, r1, r0)
        L_0x034c:
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/encrypt and save (new) phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0375 }
            X.2sH r5 = r3.A06     // Catch:{ IOException -> 0x0375 }
            android.content.Context r4 = r3.getApplicationContext()     // Catch:{ IOException -> 0x0375 }
            X.33p r6 = r3.A09     // Catch:{ IOException -> 0x0375 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r6)     // Catch:{ IOException -> 0x0375 }
            java.lang.String r0 = "token_used_during_reg"
            java.lang.String r1 = X.AnonymousClass0x9.A0v(r1, r0)     // Catch:{ IOException -> 0x0375 }
            r0 = 3
            byte[] r9 = android.util.Base64.decode(r1, r0)     // Catch:{ IOException -> 0x0375 }
            X.33p r0 = r3.A09     // Catch:{ IOException -> 0x0375 }
            java.lang.String r8 = r0.A0b()     // Catch:{ IOException -> 0x0375 }
            r10 = 1
            r7 = 0
            X.AnonymousClass36Q.A01(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0375 }
            return
        L_0x0375:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x037c:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r0 = (com.whatsapp.registration.VerifyPhoneNumber) r0
            com.whatsapp.registration.report.BanReportViewModel r3 = r0.A16
            X.08M r1 = r3.A02
            r0 = 3
            X.C06270Wx.A03(r1, r0)
            X.4FS r2 = r3.A08
            r1 = 49
            X.3cH r0 = new X.3cH
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.BkM(r0)
            return
        L_0x0395:
            java.lang.Object r1 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.C621433s.A01(r1, r0)
            com.whatsapp.registration.report.BanReportViewModel r1 = r1.A16
            X.4FS r3 = r1.A08
            r0 = 48
            X.3cH r2 = new X.3cH
            r2.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x03bf
        L_0x03aa:
            java.lang.Object r1 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.C621433s.A01(r1, r0)
            com.whatsapp.registration.report.BanReportViewModel r4 = r1.A16
            r1 = 0
            X.4FS r3 = r4.A08
            r0 = 10
            X.3cJ r2 = new X.3cJ
            r2.<init>((java.lang.Object) r4, (int) r1, (int) r0)
        L_0x03bf:
            r3.BkM(r2)
            return
        L_0x03c3:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r0 = (com.whatsapp.registration.VerifyPhoneNumber) r0
            X.2s5 r2 = r0.A14
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "wrong_number"
            r2.A03(r1, r0)
            return
        L_0x03d2:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r0 = (com.whatsapp.registration.VerifyPhoneNumber) r0
            r0.A7L()
            return
        L_0x03da:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r0 = (com.whatsapp.registration.VerifyPhoneNumber) r0
            X.7kf r2 = r0.A0n
            r1 = 0
            java.lang.String r0 = "verify_phone"
            r2.A02(r1, r0)
            return
        L_0x03e8:
            java.lang.Object r1 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            int r0 = r1.A04
            r1.A7U(r0)
            return
        L_0x03f2:
            java.lang.Object r0 = r5.A00
            X.4ea r0 = (X.C89654ea) r0
            X.3Wi r2 = r0.A05
            r1 = 2131894034(0x7f121f12, float:1.9422861E38)
            r0 = 0
            goto L_0x0486
        L_0x03fe:
            java.lang.Object r2 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r2 = (com.whatsapp.registration.VerifyPhoneNumber) r2
            java.lang.String r0 = "VerifyPhoneNumber/updateUiOn2FARequired"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A1G
            android.content.Intent r1 = X.C627736r.A1D(r2, r0)
            r0 = 0
            r2.A6T(r1, r0)
            goto L_0x044c
        L_0x0412:
            java.lang.Object r1 = r5.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
        L_0x0417:
            X.C621433s.A00(r1, r0)
            return
        L_0x041b:
            java.lang.Object r3 = r5.A00
            com.whatsapp.registration.VerifyEmail r3 = (com.whatsapp.registration.VerifyEmail) r3
            com.whatsapp.WaTextView r2 = r3.A05
            java.lang.String r1 = "resendCodeText"
            if (r2 != 0) goto L_0x042b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x042b:
            r0 = 1
            r2.setClickable(r0)
            com.whatsapp.WaTextView r2 = r3.A05
            if (r2 != 0) goto L_0x0438
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0438:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131103043(0x7f060d43, float:1.7818541E38)
            X.C18320x8.A11(r1, r2, r0)
            return
        L_0x0443:
            java.lang.Object r2 = r5.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "VerifyEmail/handleSuccessVerification/start main"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x044c:
            r2.finish()
            return
        L_0x0450:
            java.lang.Object r6 = r5.A00
            com.whatsapp.registration.VerifyEmail r6 = (com.whatsapp.registration.VerifyEmail) r6
            java.lang.String r0 = "VerifyEmail/edit email"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5hX r5 = r6.A00
            int r4 = r6.A00
            java.lang.String r3 = r6.A0H
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.RegisterEmail"
            r2.setClassName(r1, r0)
            X.C18310x6.A10(r2, r3, r4)
            r5.A0A(r6, r2)
            r6.finish()
            return
        L_0x0476:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyCaptcha r0 = (com.whatsapp.registration.VerifyCaptcha) r0
            r0.A78()
            return
        L_0x047e:
            java.lang.Object r2 = r5.A00
            X.3Wi r2 = (X.C69263Wi) r2
            r1 = 2131894598(0x7f122146, float:1.9424005E38)
            r0 = 1
        L_0x0486:
            r2.A0H(r1, r0)
            return
        L_0x048a:
            java.lang.Object r1 = r5.A00
            X.4FU r1 = (X.AnonymousClass4FU) r1
            com.whatsapp.dialogs.UnrecoverableErrorDialogFragment r0 = new com.whatsapp.dialogs.UnrecoverableErrorDialogFragment
            r0.<init>()
            r1.Boo(r0)
            return
        L_0x0497:
            java.lang.Object r9 = r5.A00
            com.whatsapp.registration.SendSmsToWa r9 = (com.whatsapp.registration.SendSmsToWa) r9
            r1 = 0
            X.4FS r0 = r9.A04
            X.33p r2 = r9.A09
            java.lang.String r10 = r2.A0Z()
            X.33p r2 = r9.A09
            java.lang.String r11 = r2.A0b()
            java.lang.String r12 = "sms"
            X.33p r2 = r9.A09
            int r16 = r2.A04()
            android.content.SharedPreferences r3 = X.AnonymousClass1Hf.A27(r9)
            java.lang.String r2 = "pref_flash_call_manage_call_permission_granted"
            r4 = -1
            int r17 = r3.getInt(r2, r4)
            android.content.SharedPreferences r3 = X.AnonymousClass1Hf.A27(r9)
            java.lang.String r2 = "pref_flash_call_call_log_permission_granted"
            int r18 = r3.getInt(r2, r4)
            java.lang.String r14 = "0"
            X.2oU r4 = r9.A02
            if (r4 == 0) goto L_0x0509
            X.33p r2 = r9.A09
            int r2 = r2.A0F()
            X.4z5 r8 = new X.4z5
            r8.<init>(r2)
            r13 = 0
            X.33i r3 = r9.A08
            X.33p r5 = r9.A09
            X.2sl r6 = r9.A05
            if (r6 == 0) goto L_0x0501
            X.7aX r7 = r9.A07
            if (r7 == 0) goto L_0x04fa
            X.55p r2 = new X.55p
            r20 = r1
            r15 = r13
            r19 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.A08 = r2
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.BkL(r2, r1)
            return
        L_0x04fa:
            java.lang.String r0 = "autoconfManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0501:
            java.lang.String r0 = "registrationHttpManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0509:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0511:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.VerifyPhoneNumber r0 = (com.whatsapp.registration.VerifyPhoneNumber) r0
            r0.A7A()
            return
        L_0x0519:
            X.3dV r0 = r2.A0U     // Catch:{ all -> 0x0538 }
            r0.A05()     // Catch:{ all -> 0x0538 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0538 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0538 }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x0538 }
            boolean r0 = X.C626235v.A04(r2, r4)     // Catch:{ all -> 0x0538 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0534
            java.lang.String r1 = "DELETE_ALL_RECORDS"
            r0 = 0
            r2.A07(r4, r0, r1, r0)     // Catch:{ all -> 0x0538 }
        L_0x0534:
            r3.close()
            return
        L_0x0538:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x053d }
            throw r1
        L_0x053d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0542:
            r0 = 1
            r1.setEnabled(r0)
            return
        L_0x0547:
            r0.createNewFile()     // Catch:{ IOException -> 0x054b }
            return
        L_0x054b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyCaptcha/setupAudio/createNewFile/IOException : "
            X.C18260x0.A16(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71543cH.run():void");
    }

    public C71543cH(VerifyTwoFactorAuth verifyTwoFactorAuth, int i) {
        this.A01 = i;
        switch (i) {
            case 23:
            case 24:
                this.A00 = verifyTwoFactorAuth;
                return;
            default:
                this.A00 = verifyTwoFactorAuth;
                return;
        }
    }

    public C71543cH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
