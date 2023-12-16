package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.55R  reason: invalid class name */
public class AnonymousClass55R extends AnonymousClass5ZM {
    public final C56912sl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass5LS r2;
        try {
            C56912sl r22 = this.A00;
            String str = this.A02;
            String str2 = this.A03;
            String str3 = this.A01;
            if (!r22.A0F()) {
                r2 = new AnonymousClass5LS(C998358j.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
            } else {
                r22.A0E(true);
                byte[] A0H = r22.A0H(str, str2);
                byte[] A0G = r22.A0G("verifyCaptcha");
                HashMap A0t = AnonymousClass001.A0t();
                r22.A08(A0t);
                r2 = (AnonymousClass5LS) C105935Wz.A00(new AnonymousClass68P(r22.A0N, r22.A0P, str, str2, str3, r22.A04(str, "verify_captcha_entrypoint"), r22.A05(), A0t, A0H, A0G, 0));
            }
            if (r2 == null) {
                Log.e("VerifyCaptchaTask/doInBackground/null VerifyCaptchaResult");
                return AnonymousClass0x9.A0C(C998358j.ERROR_UNSPECIFIED, (Object) null);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VerifyCaptchaTask/captcha_verify entrypoint response//waOldEligible=");
            A0o.append(r2.A05);
            A0o.append("/emailOtpEligible=");
            A0o.append(r2.A00);
            A0o.append("/flashType=");
            A0o.append(r2.A01);
            A0o.append("/smsWait=");
            A0o.append(r2.A0B);
            A0o.append(";voiceWait=");
            A0o.append(r2.A0C);
            A0o.append(";waOldWait=");
            A0o.append(r2.A0D);
            A0o.append(";emailOtpWait=");
            C18260x0.A1L(A0o, r2.A09);
            return AnonymousClass0x9.A0C(r2.A0F, r2);
        } catch (Exception e) {
            Log.e("VerifyCaptchaTask/entrypoint call error: ", e);
            return AnonymousClass0x9.A0C(C998358j.ERROR_UNSPECIFIED, (Object) null);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        r10.A77();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01e0, code lost:
        com.whatsapp.util.Log.w("VerifyCaptcha/onVerifyCaptchaResponse/response is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021f, code lost:
        X.C621433s.A01(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x022b, code lost:
        r10.A09.A1Q("captcha_request_failed");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r18
            android.util.Pair r1 = (android.util.Pair) r1
            r0 = r17
            java.lang.ref.WeakReference r0 = r0.A04
            java.lang.Object r10 = r0.get()
            X.644 r10 = (X.AnonymousClass644) r10
            if (r10 != 0) goto L_0x0016
            java.lang.String r0 = "VerifyCaptchaTask/onPostExecute/null callback"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0016:
            com.whatsapp.registration.VerifyCaptcha r10 = (com.whatsapp.registration.VerifyCaptcha) r10
            r0 = 2
            X.C621433s.A00(r10, r0)
            java.lang.Object r3 = r1.first
            X.C626936e.A06(r3)
            X.58j r3 = (X.C998358j) r3
            java.lang.Object r6 = r1.second
            X.5LS r6 = (X.AnonymousClass5LS) r6
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r3)
            java.lang.String r0 = "VerifyCaptcha/onVerifyCaptchaResponse/status="
            X.C18260x0.A1P(r1, r0, r3)
            r7 = 3
            r4 = 1
            r5 = 0
            if (r6 == 0) goto L_0x0091
            int r0 = r6.A05
            r10.A02 = r0
            int r0 = r6.A01
            r10.A01 = r0
            int r0 = r6.A00
            r10.A00 = r0
            X.33p r0 = r10.A09
            java.lang.String r2 = r6.A08
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "email_address"
            X.C18270x1.A0j(r1, r0, r2)
            int r0 = r10.A02
            if (r0 == r4) goto L_0x023d
            if (r0 == r7) goto L_0x023d
            if (r0 != 0) goto L_0x005b
            X.33p r0 = r10.A09
            r0.A1Z(r5)
        L_0x005b:
            X.33p r1 = r10.A09
            int r0 = r10.A02
            boolean r2 = X.AnonymousClass000.A1U(r0, r7)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "pref_wa_old_for_uc"
            X.C18270x1.A0l(r1, r0, r2)
            int r0 = r10.A00
            if (r0 != r4) goto L_0x0232
            X.33p r1 = r10.A09
            java.lang.String r0 = "email_otp_eligible"
            r1.A1R(r0)
        L_0x0077:
            int r2 = r6.A03
            if (r2 <= 0) goto L_0x0084
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass4SG.A2P(r10)
            java.lang.String r0 = "registration_voice_code_length"
            X.C18270x1.A0h(r1, r0, r2)
        L_0x0084:
            int r2 = r6.A02
            if (r2 <= 0) goto L_0x0091
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass4SG.A2P(r10)
            java.lang.String r0 = "registration_sms_code_length"
            X.C18270x1.A0h(r1, r0, r2)
        L_0x0091:
            int r3 = r3.ordinal()
            java.lang.String r2 = "VerifyCaptcha/onVerifyCaptchaResponse/response is null"
            r0 = 7
            java.lang.String r1 = "captcha_request_failed"
            switch(r3) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x021f;
                case 2: goto L_0x021f;
                case 3: goto L_0x0223;
                case 4: goto L_0x01fa;
                case 5: goto L_0x018a;
                case 6: goto L_0x01fa;
                case 7: goto L_0x01e4;
                case 8: goto L_0x01fa;
                case 9: goto L_0x0210;
                case 10: goto L_0x021d;
                default: goto L_0x009d;
            }
        L_0x009d:
            r10.A77()
            return
        L_0x00a1:
            if (r6 == 0) goto L_0x01e0
            X.33p r1 = r10.A09
            java.lang.String r0 = "captcha_successful"
            r1.A1Q(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyCaptcha/handleVerifiedCaptchaCode smsCodeLength "
            r1.append(r0)
            int r0 = r6.A02
            r1.append(r0)
            java.lang.String r0 = ", voiceCodeLength "
            r1.append(r0)
            int r0 = r6.A03
            r1.append(r0)
            java.lang.String r0 = ", waOldCodeLength "
            r1.append(r0)
            int r0 = r6.A04
            r1.append(r0)
            java.lang.String r0 = ", smsWait "
            r1.append(r0)
            java.lang.String r0 = r6.A0B
            r1.append(r0)
            java.lang.String r0 = ", voiceWait "
            r1.append(r0)
            java.lang.String r0 = r6.A0C
            r1.append(r0)
            java.lang.String r0 = ", waOldWait "
            r1.append(r0)
            java.lang.String r0 = r6.A0D
            r1.append(r0)
            java.lang.String r0 = ", emailOtpWait "
            r1.append(r0)
            java.lang.String r0 = r6.A09
            r1.append(r0)
            java.lang.String r0 = ", flashType "
            r1.append(r0)
            int r0 = r6.A01
            r1.append(r0)
            java.lang.String r0 = ", waOldEligible "
            r1.append(r0)
            int r0 = r6.A05
            r1.append(r0)
            java.lang.String r0 = ", emailOtpEligible "
            r1.append(r0)
            int r0 = r6.A00
            X.C18260x0.A1F(r1, r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r0 = r6.A0B
            r2 = 0
            long r0 = X.AnonymousClass36l.A01(r0, r2)
            long r0 = r5.toMillis(r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r8
            r10.A04 = r0
            java.lang.String r0 = r6.A0C
            long r0 = X.AnonymousClass36l.A01(r0, r2)
            long r0 = r5.toMillis(r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r8
            r10.A05 = r0
            java.lang.String r0 = r6.A0D
            long r0 = X.AnonymousClass36l.A01(r0, r2)
            long r0 = r5.toMillis(r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r8
            r10.A06 = r0
            java.lang.String r0 = r6.A09
            long r0 = X.AnonymousClass36l.A01(r0, r2)
            long r2 = r5.toMillis(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            r10.A03 = r2
            int r1 = r10.A02
            if (r1 == r4) goto L_0x024d
            if (r1 == r7) goto L_0x024d
            r0 = 4
            if (r1 == r0) goto L_0x024d
            int r0 = r10.A00
            if (r0 == r4) goto L_0x024d
            X.33i r2 = r10.A08
            X.C162457s7.A0C(r2)
            X.1VW r1 = r10.A0M
            if (r1 == 0) goto L_0x0246
            int r0 = r10.A01
            boolean r0 = X.C100535Bh.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x024d
            int r11 = r10.A01
            long r12 = r10.A04
            long r14 = r10.A05
            boolean r0 = r10.A0Y
            r16 = r0
            android.content.Intent r0 = X.C627736r.A0C(r10, r11, r12, r14, r16)
            r10.A6T(r0, r4)
            return
        L_0x018a:
            if (r6 == 0) goto L_0x01e0
            X.33p r2 = r10.A09
            java.lang.String r0 = "captcha_blocked"
            r2.A1Q(r0)
            java.lang.String r0 = "VerifyCaptcha/handleBlockedUser"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.5dC r2 = r6.A06
            r10.A0O = r2
            r3 = 9
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x027e
            boolean r0 = r10.A0Y
            if (r0 != 0) goto L_0x027e
            java.lang.String r0 = "VerifyCaptcha/startBanAppealFlowForBlockedUser"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            if (r2 == 0) goto L_0x026f
            java.lang.String r3 = r2.A01
            if (r3 == 0) goto L_0x026f
            int r0 = r3.length()
            if (r0 == 0) goto L_0x026f
            java.lang.String r2 = r2.A04
            if (r2 == 0) goto L_0x026f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x026f
            boolean r0 = android.text.TextUtils.isDigitsOnly(r2)
            if (r0 != r4) goto L_0x026f
            X.317 r1 = r10.A0R
            if (r1 == 0) goto L_0x0268
            r0 = 10
            r1.A0B(r0, r4)
            int r1 = java.lang.Integer.parseInt(r2)
            r0 = 5
            android.content.Intent r0 = X.C627736r.A0w(r10, r3, r1, r0)
            r10.startActivity(r0)
            r10.finish()
            return
        L_0x01e0:
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x021f
        L_0x01e4:
            if (r6 == 0) goto L_0x01f8
            java.lang.String r0 = r6.A0A
            java.lang.String r5 = r6.A07
        L_0x01ea:
            boolean r0 = r10.A7B(r0, r5)
            if (r0 == 0) goto L_0x009d
            X.C621433s.A01(r10, r4)
            X.33p r1 = r10.A09
            java.lang.String r0 = "captcha_mismatch_failed"
            goto L_0x0218
        L_0x01f8:
            r0 = r5
            goto L_0x01ea
        L_0x01fa:
            if (r6 == 0) goto L_0x020e
            java.lang.String r0 = r6.A0A
            java.lang.String r5 = r6.A07
        L_0x0200:
            boolean r0 = r10.A7B(r0, r5)
            if (r0 == 0) goto L_0x009d
            X.C621433s.A01(r10, r7)
            X.33p r1 = r10.A09
            java.lang.String r0 = "captcha_code_failed"
            goto L_0x0218
        L_0x020e:
            r0 = r5
            goto L_0x0200
        L_0x0210:
            r0 = 5
            X.C621433s.A01(r10, r0)
            X.33p r1 = r10.A09
            java.lang.String r0 = "captcha_too_many_guesses_failed"
        L_0x0218:
            r1.A1Q(r0)
            goto L_0x009d
        L_0x021d:
            r0 = 8
        L_0x021f:
            X.C621433s.A01(r10, r0)
            goto L_0x022b
        L_0x0223:
            X.3Wi r0 = r10.A05
            X.C162457s7.A0C(r0)
            X.C386328l.A00(r0)
        L_0x022b:
            X.33p r0 = r10.A09
            r0.A1Q(r1)
            goto L_0x009d
        L_0x0232:
            if (r0 != 0) goto L_0x0077
            X.33p r1 = r10.A09
            java.lang.String r0 = "email_otp_not_eligible"
            r1.A1R(r0)
            goto L_0x0077
        L_0x023d:
            X.33p r1 = r10.A09
            java.lang.String r0 = "wa_old_eligible"
            r1.A1Z(r0)
            goto L_0x005b
        L_0x0246:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x024d:
            X.33p r3 = r10.A09
            X.2oU r2 = r10.A74()
            X.1VW r1 = r10.A0M
            if (r1 == 0) goto L_0x0261
            r0 = 3902(0xf3e, float:5.468E-42)
            boolean r0 = r1.A0X(r0)
            X.C100525Bg.A00(r2, r3, r10, r0)
            return
        L_0x0261:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0268:
            java.lang.String r0 = "registrationManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x026f:
            java.lang.String r0 = "VerifyCaptcha/startBanAppealFlowForBlockedUser/banPolicy is null or bad data"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 7
            X.C621433s.A01(r10, r0)
            X.33p r0 = r10.A09
            r0.A1Q(r1)
            return
        L_0x027e:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r10)
            java.lang.String r0 = "underage_account_banned"
            boolean r2 = X.C18280x3.A1W(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-shared-prefs/getUnderageAccountBanned "
            X.C18260x0.A1D(r0, r1, r2)
            if (r2 != 0) goto L_0x0294
            r3 = 4
        L_0x0294:
            X.C621433s.A01(r10, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55R.A0C(java.lang.Object):void");
    }

    public AnonymousClass55R(C56912sl r2, AnonymousClass644 r3, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = AnonymousClass0x9.A14(r3);
        this.A00 = r2;
    }
}
