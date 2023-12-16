package X;

import java.lang.ref.WeakReference;

/* renamed from: X.55a  reason: invalid class name and case insensitive filesystem */
public class C992555a extends AnonymousClass5ZM {
    public final int A00;
    public final AnonymousClass33p A01;
    public final C56912sl A02;
    public final C153017aX A03;
    public final C97684z4 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c7, code lost:
        if (r0.equals("silent_auth") != false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r29) {
        /*
            r28 = this;
            r1 = r29
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0 = 0
            r11 = r1[r0]
            java.lang.StringBuilder r2 = X.C18290x4.A0u(r11)
            java.lang.String r0 = "VerifyCodeTask/method="
            r2.append(r0)
            r8 = r28
            java.lang.String r0 = r8.A08
            r2.append(r0)
            java.lang.String r1 = "/useStandaloneVerification="
            r2.append(r1)
            boolean r6 = r8.A0B
            r2.append(r6)
            java.lang.String r1 = "/authCodeContext="
            r2.append(r1)
            java.lang.String r15 = r8.A06
            X.C18260x0.A1L(r2, r15)
            X.33p r2 = r8.A01
            X.8qC r5 = r2.A01
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r5)
            java.lang.String r3 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r1 = 0
            java.lang.String r7 = r4.getString(r3, r1)
            if (r6 == 0) goto L_0x008d
            X.C626936e.A06(r15)     // Catch:{ Exception -> 0x0184 }
            X.2sl r6 = r8.A02     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = r8.A07     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = r8.A09     // Catch:{ Exception -> 0x0184 }
            int r9 = r8.A00     // Catch:{ Exception -> 0x0184 }
            X.4z4 r10 = r8.A04     // Catch:{ Exception -> 0x0184 }
            boolean r8 = r6.A0F()     // Catch:{ Exception -> 0x0184 }
            if (r8 != 0) goto L_0x0058
            X.58m r3 = X.C998658m.ERROR_FAIL_TO_INITIALIZE_WAMSYS     // Catch:{ Exception -> 0x0184 }
            X.5LZ r6 = new X.5LZ     // Catch:{ Exception -> 0x0184 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0184 }
            goto L_0x0116
        L_0x0058:
            r8 = 1
            r6.A0E(r8)     // Catch:{ Exception -> 0x0184 }
            byte[] r25 = r6.A0H(r4, r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r8 = "verifyCodeForStandaloneVerification"
            byte[] r26 = r6.A0G(r8)     // Catch:{ Exception -> 0x0184 }
            java.util.Map r24 = r6.A07(r10, r7, r9)     // Catch:{ Exception -> 0x0184 }
            X.5Zj r7 = r6.A0P     // Catch:{ Exception -> 0x0184 }
            java.util.List r23 = r6.A05()     // Catch:{ Exception -> 0x0184 }
            X.2Ic r6 = r6.A0N     // Catch:{ Exception -> 0x0184 }
            r27 = 3
            X.68P r16 = new X.68P     // Catch:{ Exception -> 0x0184 }
            r17 = r6
            r18 = r7
            r19 = r11
            r20 = r4
            r21 = r3
            r22 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0184 }
            java.lang.Object r6 = X.C105935Wz.A00(r16)     // Catch:{ Exception -> 0x0184 }
            X.5LZ r6 = (X.AnonymousClass5LZ) r6     // Catch:{ Exception -> 0x0184 }
            goto L_0x0116
        L_0x008d:
            java.lang.String r3 = "autoconf"
            boolean r3 = r0.equals(r3)     // Catch:{ Exception -> 0x0184 }
            if (r3 == 0) goto L_0x00ae
            X.7aX r4 = r8.A03     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = r8.A05     // Catch:{ Exception -> 0x0184 }
            byte[] r4 = r4.A02(r3)     // Catch:{ Exception -> 0x0184 }
            if (r4 == 0) goto L_0x00a2
            int r3 = r4.length     // Catch:{ Exception -> 0x0184 }
            if (r3 != 0) goto L_0x00af
        L_0x00a2:
            java.lang.String r2 = "VerifyCodeTask/doInBackground/no valid authResponse, skip sending autoconf verification request"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x0184 }
            X.58m r2 = X.C998658m.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x0184 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r1)     // Catch:{ Exception -> 0x0184 }
            return r0
        L_0x00ae:
            r4 = r1
        L_0x00af:
            X.2sl r6 = r8.A02     // Catch:{ Exception -> 0x0184 }
            java.lang.String r12 = r8.A07     // Catch:{ Exception -> 0x0184 }
            java.lang.String r13 = r8.A09     // Catch:{ Exception -> 0x0184 }
            int r9 = r8.A00     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "passkey"
            boolean r3 = r0.equals(r3)     // Catch:{ Exception -> 0x0184 }
            if (r3 != 0) goto L_0x00c9
            java.lang.String r3 = "silent_auth"
            boolean r3 = r0.equals(r3)     // Catch:{ Exception -> 0x0184 }
            r16 = r1
            if (r3 == 0) goto L_0x00cb
        L_0x00c9:
            r16 = r0
        L_0x00cb:
            X.4z4 r8 = r8.A04     // Catch:{ Exception -> 0x0184 }
            boolean r3 = r6.A0F()     // Catch:{ Exception -> 0x0184 }
            if (r3 != 0) goto L_0x00db
            X.58m r3 = X.C998658m.ERROR_FAIL_TO_INITIALIZE_WAMSYS     // Catch:{ Exception -> 0x0184 }
            X.5LZ r6 = new X.5LZ     // Catch:{ Exception -> 0x0184 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0184 }
            goto L_0x0116
        L_0x00db:
            r3 = 1
            r6.A0E(r3)     // Catch:{ Exception -> 0x0184 }
            byte[] r19 = r6.A0H(r12, r13)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "verifyCode"
            byte[] r20 = r6.A0G(r3)     // Catch:{ Exception -> 0x0184 }
            java.util.Map r3 = r6.A07(r8, r7, r9)     // Catch:{ Exception -> 0x0184 }
            r6.A0C(r3)     // Catch:{ Exception -> 0x0184 }
            r6.A09(r3)     // Catch:{ Exception -> 0x0184 }
            r6.A0B(r3)     // Catch:{ Exception -> 0x0184 }
            r6.A0D(r3)     // Catch:{ Exception -> 0x0184 }
            X.5Zj r10 = r6.A0P     // Catch:{ Exception -> 0x0184 }
            java.lang.String r7 = "register_entrypoint"
            java.lang.String r14 = r6.A04(r12, r7)     // Catch:{ Exception -> 0x0184 }
            java.util.List r17 = r6.A05()     // Catch:{ Exception -> 0x0184 }
            X.2Ic r9 = r6.A0N     // Catch:{ Exception -> 0x0184 }
            X.56N r8 = new X.56N     // Catch:{ Exception -> 0x0184 }
            r18 = r3
            r21 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0184 }
            java.lang.Object r6 = X.C105935Wz.A00(r8)     // Catch:{ Exception -> 0x0184 }
            X.5LZ r6 = (X.AnonymousClass5LZ) r6     // Catch:{ Exception -> 0x0184 }
        L_0x0116:
            if (r6 != 0) goto L_0x0124
            java.lang.String r2 = "VerifyCodeTask/doInBackground/null verifyCodeResult"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x0184 }
            X.58m r2 = X.C998658m.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x0184 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r1)     // Catch:{ Exception -> 0x0184 }
            return r0
        L_0x0124:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "VerifyCodeTask/register entrypoint response/autoconfType="
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            int r3 = r6.A00     // Catch:{ Exception -> 0x0184 }
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "/secureVerifier="
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            boolean r3 = r6.A0I     // Catch:{ Exception -> 0x0184 }
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "/resetMethod="
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = r6.A0B     // Catch:{ Exception -> 0x0184 }
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "/wipeWait="
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            long r3 = r6.A04     // Catch:{ Exception -> 0x0184 }
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "/smsWait="
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            long r3 = r6.A02     // Catch:{ Exception -> 0x0184 }
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = ";voiceWait="
            r7.append(r3)     // Catch:{ Exception -> 0x0184 }
            long r3 = r6.A03     // Catch:{ Exception -> 0x0184 }
            X.C18260x0.A1I(r7, r3)     // Catch:{ Exception -> 0x0184 }
            r2.A1U(r11)     // Catch:{ Exception -> 0x0184 }
            int r4 = r6.A00     // Catch:{ Exception -> 0x0184 }
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r2)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = "autoconf_type"
            X.C18270x1.A0h(r3, r2, r4)     // Catch:{ Exception -> 0x0184 }
            boolean r4 = r6.A0I     // Catch:{ Exception -> 0x0184 }
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass0x2.A0E(r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = "pref_autoconf_secure_verifier"
            X.C18270x1.A0l(r3, r2, r4)     // Catch:{ Exception -> 0x0184 }
            X.58m r2 = r6.A06     // Catch:{ Exception -> 0x0184 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r6)     // Catch:{ Exception -> 0x0184 }
            return r0
        L_0x0184:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "verifycode/"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "/error "
            X.C18260x0.A15(r0, r3, r4)
            X.58m r0 = X.C998658m.ERROR_UNSPECIFIED
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C992555a.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02ab, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ad, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("VerifyPhoneNumber/onVerifyGenericCodeResponse/method=");
        r1.append(r7);
        X.C18260x0.A1R(r1, "/status=", r6);
        r4 = r7.equals("email_otp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c4, code lost:
        if (r4 == false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c8, code lost:
        if (r6 == X.C998658m.A0G) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ca, code lost:
        r8.A09.A1R("email_otp_verification_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d1, code lost:
        r9 = X.C998658m.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d3, code lost:
        if (r6 == r9) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d7, code lost:
        if (r6 == X.C998658m.A0H) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02db, code lost:
        if (r6 != X.C998658m.A04) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02dd, code lost:
        r8.BFh();
        X.C386328l.A00(r8.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e9, code lost:
        if (X.AnonymousClass4L0.A0S(r7) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02eb, code lost:
        if (r6 == r9) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ef, code lost:
        if (r6 == X.C998658m.A0H) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f3, code lost:
        if (r6 == X.C998658m.A0G) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f5, code lost:
        r1 = r8.A09;
        r0 = "wa_old_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f9, code lost:
        r1.A1Z(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fd, code lost:
        r1 = r8.A09;
        r0 = "wa_old_successful";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0304, code lost:
        if (r6 != X.C998658m.A09) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0306, code lost:
        r8.A7k(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030a, code lost:
        r10 = r8.A10.A01(r8.A1B, r8.A1E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0316, code lost:
        if (r6 != X.C998658m.A03) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0318, code lost:
        X.C18260x0.A0s("VerifyPhoneNumber/onVerifyGenericCodeErrorConnectivity/method=", r7, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0325, code lost:
        if (X.AnonymousClass4L0.A0S(r7) == false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0327, code lost:
        r0 = X.C86604Kt.A0l(r8, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x032e, code lost:
        r8.A82(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0334, code lost:
        if (r6 != X.C998658m.A08) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0336, code lost:
        X.C18260x0.A0s("VerifyPhoneNumber/onVerifyGenericCodeErrorGuessedTooFast/method=", r7, X.AnonymousClass001.A0o());
        X.AnonymousClass36l.A0O(r8.A09, "server-send-guessed-too-fast");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x034a, code lost:
        if (X.AnonymousClass4L0.A0S(r7) != false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x034c, code lost:
        if (r4 != false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x034e, code lost:
        if (r10 != null) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0350, code lost:
        r0 = "VerifyPhoneNumber/verifysms/error/too-fast/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0352, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0359, code lost:
        if (r8.A0s.A02 != false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x035f, code lost:
        if (r8.BHW() == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0361, code lost:
        X.AnonymousClass36l.A0H(r8, r8.A0g, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0369, code lost:
        r8.A7E();
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0372, code lost:
        if (r6 != X.C998658m.A0D) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0374, code lost:
        X.C18260x0.A0s("VerifyPhoneNumber/onVerifyGenericCodeErrorTemporarilyUnavailable/method=", r7, X.AnonymousClass001.A0o());
        X.AnonymousClass36l.A0O(r8.A09, "server-send-error-temporarily-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0388, code lost:
        if (X.AnonymousClass4L0.A0S(r7) == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038a, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x038d, code lost:
        r0 = r8.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0392, code lost:
        if (r10 != null) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0394, code lost:
        r0 = "VerifyPhoneNumber/verifysms/error/temp-unavail/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0399, code lost:
        if (r6 != X.C998658m.A0G) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x039b, code lost:
        r8.A7i(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a2, code lost:
        if (r6 == X.C998658m.A02) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a6, code lost:
        if (r6 == X.C998658m.A0F) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03aa, code lost:
        if (r6 != X.C998658m.A0B) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ac, code lost:
        r8.A81(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03b1, code lost:
        r8.A10.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b8, code lost:
        if (r6 != X.C998658m.A0A) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ba, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorMissing");
        X.AnonymousClass36l.A0O(r8.A09, "server-send-missing");
        r8.A7E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03cb, code lost:
        if (r6 != X.C998658m.A07) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03cd, code lost:
        r2 = r2.A07;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorBlocked");
        r8.A7Z(12);
        X.AnonymousClass36l.A0O(r8.A09, "server-send-blocked");
        r8.A7u(r2);
        r8.A7H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ea, code lost:
        if (r6 != X.C998658m.A0E) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03ec, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorTooManyGuesses");
        X.AnonymousClass36l.A0O(r8.A09, "server-send-too-many-guesses");
        X.AnonymousClass4SG.A3r(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03fe, code lost:
        if (r6 != X.C998658m.A06) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0400, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorUnspecified");
        X.AnonymousClass36l.A0O(r8.A09, "server-send-error-unspecified");
        r8.A8A(true);
        r8.A7X(109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0418, code lost:
        if (r6 != X.C998658m.A0C) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x041a, code lost:
        X.C18260x0.A0s("VerifyPhoneNumber/onVerifyGenericCodeErrorStale/method=", r7, X.AnonymousClass001.A0o());
        X.AnonymousClass36l.A0O(r8.A09, "server-send-error-stale");
        r8.A7E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0431, code lost:
        if (X.AnonymousClass4L0.A0S(r7) != false) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0433, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0436, code lost:
        if (r4 == false) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0438, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x043b, code lost:
        r8.A82(r8.getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0443, code lost:
        if (r10 != null) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0445, code lost:
        com.whatsapp.util.Log.e("VerifyPhoneNumber/verifysms/error/connectivity/saved-code-is-null");
        r8.A7Z(4);
        r8.A7V(21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0455, code lost:
        r4 = java.lang.Math.random();
        r1 = r8.A01;
        r8.A01 = r1 + 1;
        r11 = (int) (r4 * ((java.lang.Math.pow(2.0d, (double) r1) - 1.0d) * 4000.0d));
        X.C18260x0.A0y("VerifyPhoneNumber/verifysms/schedule-retry/", X.AnonymousClass001.A0o(), r11);
        r8.A0x.sendMessageDelayed(r8.A0x.obtainMessage(1, r10), (long) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0489, code lost:
        r8.A7h(r2, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0490, code lost:
        r8.A7j(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04ca, code lost:
        r8.A7i(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04df, code lost:
        r8.A7j(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashResponse/method=");
        r1.append(r7);
        X.C18260x0.A1R(r1, "/status=", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04ff, code lost:
        r8.A7U(r8.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0504, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r6 == X.C998658m.A0I) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x050f, code lost:
        r8.BFh();
        X.C386328l.A00(r8.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0517, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (r6 == X.C998658m.A0H) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        if (r6 != X.C998658m.A0G) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r8.A7i(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        r8.A83(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        if (r6 == X.C998658m.A02) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if (r6 == X.C998658m.A0F) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashError/method=");
        r1.append(r7);
        X.C18260x0.A1R(r1, "/status=", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        if (r6 != X.C998658m.A04) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        r8.BFh();
        X.C386328l.A00(r8.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        X.C18270x1.A0j(X.C18270x1.A03(r8.A09), "pref_secondary_flash_call_status", "secondary_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        r8.A7U(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r6 != X.C998658m.A09) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r8.A7k(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f2, code lost:
        if (r6 != X.C998658m.A06) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorUnspecified");
        r8.A8A(true);
        r8.A7X(109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0105, code lost:
        if (r6 != X.C998658m.A0A) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorMissing");
        r8.A7E();
        r3 = com.whatsapp.R.string.f11nameremoved;
        r2 = X.AnonymousClass002.A0M();
        r2[0] = r8.A79();
        r1 = r8.getString(com.whatsapp.R.string.f11nameremoved);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        r0 = X.AnonymousClass002.A0F(r8, r1, r2, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        r8.A82(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012f, code lost:
        if (r6 != X.C998658m.A0E) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0131, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTooManyGuesses/retryAfter=");
        X.C18260x0.A1L(r1, r2.A0C);
        X.AnonymousClass4SG.A3r(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014a, code lost:
        if (X.AnonymousClass5VK.A01(r2.A0C) != false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
        r8.A7X(28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        if (r6 != X.C998658m.A08) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0155, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorGuessedTooFast/retryAfter=");
        X.C18260x0.A1K(r1, r2.A0C);
        r8.A7E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016c, code lost:
        if (X.AnonymousClass5VK.A01(r2.A0C) != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016e, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0171, code lost:
        r0 = r8.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1 = java.lang.Long.parseLong(r2.A0C) * 1000;
        r8.A0w.A0C(r1);
        X.AnonymousClass4SG.A3s(r8, com.whatsapp.R.string.f11nameremoved, r1);
        r8.A7a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0190, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter", r1);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019b, code lost:
        if (r6 != X.C998658m.A03) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019d, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorConnectivity");
        r8.A8A(true);
        r3 = com.whatsapp.R.string.f11nameremoved;
        r2 = new java.lang.Object[1];
        r1 = r8.getString(com.whatsapp.R.string.f11nameremoved);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b7, code lost:
        if (r6 != X.C998658m.A07) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b9, code lost:
        r1 = r2.A07;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorBlocked");
        r8.A7Z(12);
        r8.A7u(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cc, code lost:
        if (r6 != X.C998658m.A0C) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ce, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorStale");
        r8.A7E();
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01dc, code lost:
        if (r6 != X.C998658m.A0D) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01de, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTemporarilyUnavailable/retryAfter=");
        X.C18260x0.A1L(r1, r2.A0C);
        X.AnonymousClass36l.A0O(r8.A09, "voice-temporarily-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f9, code lost:
        if (X.AnonymousClass5VK.A01(r2.A0C) != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fb, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r1 = java.lang.Long.parseLong(r2.A0C) * 1000;
        r8.A0w.A0C(r1);
        X.AnonymousClass4SG.A3s(r8, com.whatsapp.R.string.f11nameremoved, r1);
        r8.A7a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021a, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/unable-to-parse-retryAfter", r1);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r1 = java.lang.Long.parseLong(r2.A0C) * 1000;
        r8.A0D = r1;
        r8.A0w.A0C(r1);
        r8.A7X(32);
        r8.A7a(r8.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0240, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0241, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter", r1);
        r8.A7X(28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024d, code lost:
        if (r6 != X.C998658m.A0B) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024f, code lost:
        r8.A81(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0254, code lost:
        r8.A7h(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0259, code lost:
        r8.A7j(r2, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r13) {
        /*
            r12 = this;
            android.util.Pair r13 = (android.util.Pair) r13
            java.lang.ref.WeakReference r0 = r12.A0A
            java.lang.Object r8 = r0.get()
            X.8sB r8 = (X.C184588sB) r8
            if (r8 == 0) goto L_0x0022
            r8.BFh()
            java.lang.String r7 = r12.A08
            java.lang.Object r6 = r13.first
            X.58m r6 = (X.C998658m) r6
            java.lang.Object r2 = r13.second
            X.5LZ r2 = (X.AnonymousClass5LZ) r2
            com.whatsapp.registration.VerifyPhoneNumber r8 = (com.whatsapp.registration.VerifyPhoneNumber) r8
            int r0 = r7.hashCode()
            switch(r0) {
                case -795576526: goto L_0x0023;
                case -792038226: goto L_0x0027;
                case 114009: goto L_0x0072;
                case 97513456: goto L_0x0076;
                case 112386354: goto L_0x0079;
                case 601452370: goto L_0x025e;
                case 1439178067: goto L_0x0288;
                case 2120743944: goto L_0x02a5;
                default: goto L_0x0022;
            }
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "wa_old"
            goto L_0x02a7
        L_0x0027:
            java.lang.String r9 = "passkey"
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyPasskeyResponse/status="
            X.C18260x0.A1R(r1, r0, r6)
            int r5 = r6.ordinal()
            r0 = 0
            java.lang.String r4 = "passkey_finish_login_success"
            java.lang.String r1 = "VerifyPhoneNumber/passkeyEvent/passkey_finish_login_success"
            java.lang.String r3 = "verify_passkey"
            if (r5 == r0) goto L_0x04af
            r0 = 12
            if (r5 == r0) goto L_0x04a5
            r0 = 2
            java.lang.String r4 = "passkey_finish_login_error"
            if (r5 == r0) goto L_0x0495
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/passkeyEvent/passkey_finish_login_error/error="
            X.C18260x0.A1Q(r1, r0, r6)
            X.2s5 r3 = r8.A14
            java.lang.String r2 = "verify_passkey_error_dialog"
            java.lang.String r1 = r6.toString()
            r0 = 0
            r3.A05(r2, r4, r1, r0)
            X.33p r1 = r8.A09
            java.lang.String r0 = r6.name()
            X.AnonymousClass36l.A0O(r1, r0)
            r0 = 54
            X.C621433s.A01(r8, r0)
            return
        L_0x0072:
            java.lang.String r0 = "sms"
            goto L_0x02a7
        L_0x0076:
            java.lang.String r0 = "flash"
            goto L_0x007b
        L_0x0079:
            java.lang.String r0 = "voice"
        L_0x007b:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashResponse/method="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r3 = "/status="
            X.C18260x0.A1R(r1, r3, r6)
            X.58m r0 = X.C998658m.YES
            if (r6 == r0) goto L_0x0259
            X.58m r0 = X.C998658m.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x0259
            X.58m r0 = X.C998658m.SECURITY_CODE
            if (r6 != r0) goto L_0x00a5
            r8.A7i(r2, r7)
        L_0x00a1:
            r8.A83(r7)
            return
        L_0x00a5:
            X.58m r0 = X.C998658m.DEVICE_CONFIRM_OR_SECOND_OTP
            if (r6 == r0) goto L_0x0254
            X.58m r0 = X.C998658m.SECOND_OTP
            if (r6 == r0) goto L_0x0254
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashError/method="
            r1.append(r0)
            r1.append(r7)
            X.C18260x0.A1R(r1, r3, r6)
            X.58m r0 = X.C998658m.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r6 != r0) goto L_0x00e8
            r8.BFh()
            X.3Wi r0 = r8.A05
            X.C386328l.A00(r0)
        L_0x00c8:
            java.lang.String r0 = "flash"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r8.A8D()
            if (r0 != 0) goto L_0x00e3
            X.33p r0 = r8.A09
            java.lang.String r2 = "secondary_failed"
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "pref_secondary_flash_call_status"
            X.C18270x1.A0j(r1, r0, r2)
        L_0x00e3:
            r0 = -1
            r8.A7U(r0)
            goto L_0x00a1
        L_0x00e8:
            X.58m r0 = X.C998658m.FAIL_MISMATCH
            if (r6 != r0) goto L_0x00f0
            r8.A7k(r2, r7)
            goto L_0x00c8
        L_0x00f0:
            X.58m r0 = X.C998658m.ERROR_UNSPECIFIED
            if (r6 != r0) goto L_0x0103
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorUnspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r8.A8A(r0)
            r0 = 109(0x6d, float:1.53E-43)
            r8.A7X(r0)
            goto L_0x00c8
        L_0x0103:
            X.58m r0 = X.C998658m.FAIL_MISSING
            if (r6 != r0) goto L_0x012d
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorMissing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A7E()
            r3 = 2131894953(0x7f1222a9, float:1.9424725E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            r1 = 0
            java.lang.String r0 = r8.A79()
            r2[r1] = r0
            r0 = 2131894997(0x7f1222d5, float:1.9424815E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 1
        L_0x0125:
            java.lang.String r0 = X.AnonymousClass002.A0F(r8, r1, r2, r0, r3)
        L_0x0129:
            r8.A82(r0)
            goto L_0x00c8
        L_0x012d:
            X.58m r0 = X.C998658m.FAIL_TOO_MANY_GUESSES
            if (r6 != r0) goto L_0x0151
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTooManyGuesses/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r2.A0C
            X.C18260x0.A1L(r1, r0)
            X.AnonymousClass4SG.A3r(r8)
            java.lang.String r0 = r2.A0C
            boolean r0 = X.AnonymousClass5VK.A01(r0)
            r5 = 28
            if (r0 != 0) goto L_0x0224
            r8.A7X(r5)
            goto L_0x00c8
        L_0x0151:
            X.58m r0 = X.C998658m.FAIL_GUESSED_TOO_FAST
            if (r6 != r0) goto L_0x0199
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorGuessedTooFast/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r2.A0C
            X.C18260x0.A1K(r1, r0)
            r8.A7E()
            java.lang.String r0 = r2.A0C
            boolean r0 = X.AnonymousClass5VK.A01(r0)
            if (r0 != 0) goto L_0x0176
            r0 = 2131892905(0x7f121aa9, float:1.9420571E38)
        L_0x0171:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x0129
        L_0x0176:
            java.lang.String r0 = r2.A0C     // Catch:{ NumberFormatException -> 0x018f }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x018f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.317 r0 = r8.A0w     // Catch:{ NumberFormatException -> 0x018f }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x018f }
            r0 = 2131892906(0x7f121aaa, float:1.9420574E38)
            X.AnonymousClass4SG.A3s(r8, r0, r1)     // Catch:{ NumberFormatException -> 0x018f }
            r8.A7a(r1)     // Catch:{ NumberFormatException -> 0x018f }
            goto L_0x00c8
        L_0x018f:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131892905(0x7f121aa9, float:1.9420571E38)
            goto L_0x0171
        L_0x0199:
            X.58m r0 = X.C998658m.ERROR_CONNECTIVITY
            if (r6 != r0) goto L_0x01b5
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorConnectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r8.A8A(r0)
            r3 = 2131892894(0x7f121a9e, float:1.942055E38)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 2131888105(0x7f1207e9, float:1.9410836E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 0
            goto L_0x0125
        L_0x01b5:
            X.58m r0 = X.C998658m.FAIL_BLOCKED
            if (r6 != r0) goto L_0x01ca
            X.2nZ r1 = r2.A07
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorBlocked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 12
            r8.A7Z(r0)
            r8.A7u(r1)
            goto L_0x00c8
        L_0x01ca:
            X.58m r0 = X.C998658m.FAIL_STALE
            if (r6 != r0) goto L_0x01da
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorStale"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.A7E()
            r0 = 2131892943(0x7f121acf, float:1.9420649E38)
            goto L_0x0171
        L_0x01da:
            X.58m r0 = X.C998658m.FAIL_TEMPORARILY_UNAVAILABLE
            if (r6 != r0) goto L_0x024b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTemporarilyUnavailable/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r2.A0C
            X.C18260x0.A1L(r1, r0)
            X.33p r1 = r8.A09
            java.lang.String r0 = "voice-temporarily-unavailable"
            X.AnonymousClass36l.A0O(r1, r0)
            java.lang.String r0 = r2.A0C
            boolean r0 = X.AnonymousClass5VK.A01(r0)
            if (r0 != 0) goto L_0x0200
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
            goto L_0x0171
        L_0x0200:
            java.lang.String r0 = r2.A0C     // Catch:{ NumberFormatException -> 0x0219 }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0219 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.317 r0 = r8.A0w     // Catch:{ NumberFormatException -> 0x0219 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x0219 }
            r0 = 2131892946(0x7f121ad2, float:1.9420655E38)
            X.AnonymousClass4SG.A3s(r8, r0, r1)     // Catch:{ NumberFormatException -> 0x0219 }
            r8.A7a(r1)     // Catch:{ NumberFormatException -> 0x0219 }
            goto L_0x00c8
        L_0x0219:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
            goto L_0x0171
        L_0x0224:
            java.lang.String r0 = r2.A0C     // Catch:{ NumberFormatException -> 0x0240 }
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0240 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r8.A0D = r1     // Catch:{ NumberFormatException -> 0x0240 }
            X.317 r0 = r8.A0w     // Catch:{ NumberFormatException -> 0x0240 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x0240 }
            r0 = 32
            r8.A7X(r0)     // Catch:{ NumberFormatException -> 0x0240 }
            long r0 = r8.A0D     // Catch:{ NumberFormatException -> 0x0240 }
            r8.A7a(r0)     // Catch:{ NumberFormatException -> 0x0240 }
            goto L_0x00c8
        L_0x0240:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r8.A7X(r5)
            goto L_0x00c8
        L_0x024b:
            X.58m r0 = X.C998658m.FAIL_NOT_ALLOWED
            if (r6 != r0) goto L_0x00c8
            r8.A81(r7)
            goto L_0x00c8
        L_0x0254:
            r8.A7h(r2, r7)
            goto L_0x00a1
        L_0x0259:
            r8.A7j(r2, r7)
            goto L_0x00a1
        L_0x025e:
            java.lang.String r9 = "silent_auth"
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthResponse/status="
            X.C18260x0.A1R(r1, r0, r6)
            int r3 = r6.ordinal()
            java.lang.String r1 = "silent_auth_successful"
            r0 = 0
            if (r3 == r0) goto L_0x04ce
            r0 = 12
            if (r3 == r0) goto L_0x04b9
            r0 = 2
            java.lang.String r1 = "silent_auth_verify_code_failed"
            if (r3 == r0) goto L_0x0505
            X.33p r0 = r8.A09
            r0.A1X(r1)
            goto L_0x04ff
        L_0x0288:
            java.lang.String r3 = "autoconf"
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyAutoconfResponse/status="
            X.C18260x0.A1R(r1, r0, r6)
            X.58m r0 = X.C998658m.YES
            r1 = 1
            if (r6 != r0) goto L_0x04e3
            r8.A7W(r1)
            r8.A7j(r2, r3)
            return
        L_0x02a5:
            java.lang.String r0 = "email_otp"
        L_0x02a7:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeResponse/method="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "/status="
            X.C18260x0.A1R(r1, r0, r6)
            java.lang.String r0 = "email_otp"
            boolean r4 = r7.equals(r0)
            if (r4 == 0) goto L_0x02d1
            X.58m r0 = X.C998658m.SECURITY_CODE
            if (r6 == r0) goto L_0x02d1
            X.33p r1 = r8.A09
            java.lang.String r0 = "email_otp_verification_failed"
            r1.A1R(r0)
        L_0x02d1:
            X.58m r9 = X.C998658m.YES
            if (r6 == r9) goto L_0x0490
            X.58m r0 = X.C998658m.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x0490
            X.58m r0 = X.C998658m.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r6 != r0) goto L_0x0302
            r8.BFh()
            X.3Wi r0 = r8.A05
            X.C386328l.A00(r0)
        L_0x02e5:
            boolean r0 = X.AnonymousClass4L0.A0S(r7)
            if (r0 == 0) goto L_0x0022
            if (r6 == r9) goto L_0x02fd
            X.58m r0 = X.C998658m.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x02fd
            X.58m r0 = X.C998658m.SECURITY_CODE
            if (r6 == r0) goto L_0x02fd
            X.33p r1 = r8.A09
            java.lang.String r0 = "wa_old_failed"
        L_0x02f9:
            r1.A1Z(r0)
            return
        L_0x02fd:
            X.33p r1 = r8.A09
            java.lang.String r0 = "wa_old_successful"
            goto L_0x02f9
        L_0x0302:
            X.58m r0 = X.C998658m.FAIL_MISMATCH
            if (r6 != r0) goto L_0x030a
            r8.A7k(r2, r7)
            goto L_0x02e5
        L_0x030a:
            X.5UQ r3 = r8.A10
            java.lang.String r1 = r8.A1B
            java.lang.String r0 = r8.A1E
            java.lang.String r10 = r3.A01(r1, r0)
            X.58m r0 = X.C998658m.ERROR_CONNECTIVITY
            if (r6 != r0) goto L_0x0332
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorConnectivity/method="
            X.C18260x0.A0s(r0, r7, r1)
            boolean r0 = X.AnonymousClass4L0.A0S(r7)
            if (r0 == 0) goto L_0x0443
            r0 = 2131892894(0x7f121a9e, float:1.942055E38)
            java.lang.String r0 = X.C86604Kt.A0l(r8, r0)
        L_0x032e:
            r8.A82(r0)
            goto L_0x02e5
        L_0x0332:
            X.58m r0 = X.C998658m.FAIL_GUESSED_TOO_FAST
            if (r6 != r0) goto L_0x0370
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorGuessedTooFast/method="
            X.C18260x0.A0s(r0, r7, r1)
            X.33p r1 = r8.A09
            java.lang.String r0 = "server-send-guessed-too-fast"
            X.AnonymousClass36l.A0O(r1, r0)
            boolean r0 = X.AnonymousClass4L0.A0S(r7)
            if (r0 != 0) goto L_0x0369
            if (r4 != 0) goto L_0x0369
            if (r10 != 0) goto L_0x0455
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/too-fast/saved-code-is-null"
        L_0x0352:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0355:
            X.5Te r0 = r8.A0s
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0361
            boolean r0 = r8.BHW()
            if (r0 == 0) goto L_0x02e5
        L_0x0361:
            X.33T r1 = r8.A0g
            r0 = -1
            X.AnonymousClass36l.A0H(r8, r1, r0)
            goto L_0x02e5
        L_0x0369:
            r8.A7E()
            r0 = 2131892905(0x7f121aa9, float:1.9420571E38)
            goto L_0x038d
        L_0x0370:
            X.58m r0 = X.C998658m.FAIL_TEMPORARILY_UNAVAILABLE
            if (r6 != r0) goto L_0x0397
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorTemporarilyUnavailable/method="
            X.C18260x0.A0s(r0, r7, r1)
            X.33p r1 = r8.A09
            java.lang.String r0 = "server-send-error-temporarily-unavailable"
            X.AnonymousClass36l.A0O(r1, r0)
            boolean r0 = X.AnonymousClass4L0.A0S(r7)
            if (r0 == 0) goto L_0x0392
            r0 = 2131892945(0x7f121ad1, float:1.9420653E38)
        L_0x038d:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x032e
        L_0x0392:
            if (r10 != 0) goto L_0x0455
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/temp-unavail/saved-code-is-null"
            goto L_0x0352
        L_0x0397:
            X.58m r0 = X.C998658m.SECURITY_CODE
            if (r6 != r0) goto L_0x03a0
            r8.A7i(r2, r7)
            goto L_0x02e5
        L_0x03a0:
            X.58m r0 = X.C998658m.DEVICE_CONFIRM_OR_SECOND_OTP
            if (r6 == r0) goto L_0x0489
            X.58m r0 = X.C998658m.SECOND_OTP
            if (r6 == r0) goto L_0x0489
            X.58m r0 = X.C998658m.FAIL_NOT_ALLOWED
            if (r6 != r0) goto L_0x03b1
            r8.A81(r7)
            goto L_0x02e5
        L_0x03b1:
            X.5UQ r0 = r8.A10
            r0.A03()
            X.58m r0 = X.C998658m.FAIL_MISSING
            if (r6 != r0) goto L_0x03e8
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorMissing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r1 = r8.A09
            java.lang.String r0 = "server-send-missing"
            X.AnonymousClass36l.A0O(r1, r0)
            r8.A7E()
        L_0x03c9:
            X.58m r0 = X.C998658m.FAIL_BLOCKED
            if (r6 != r0) goto L_0x0355
            X.2nZ r2 = r2.A07
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorBlocked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 12
            r8.A7Z(r0)
            X.33p r1 = r8.A09
            java.lang.String r0 = "server-send-blocked"
            X.AnonymousClass36l.A0O(r1, r0)
            r8.A7u(r2)
            r8.A7H()
            goto L_0x02e5
        L_0x03e8:
            X.58m r0 = X.C998658m.FAIL_TOO_MANY_GUESSES
            if (r6 != r0) goto L_0x03fc
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorTooManyGuesses"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r1 = r8.A09
            java.lang.String r0 = "server-send-too-many-guesses"
            X.AnonymousClass36l.A0O(r1, r0)
            X.AnonymousClass4SG.A3r(r8)
            goto L_0x03c9
        L_0x03fc:
            X.58m r0 = X.C998658m.ERROR_UNSPECIFIED
            if (r6 != r0) goto L_0x0416
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorUnspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r1 = r8.A09
            java.lang.String r0 = "server-send-error-unspecified"
            X.AnonymousClass36l.A0O(r1, r0)
            r0 = 1
            r8.A8A(r0)
            r0 = 109(0x6d, float:1.53E-43)
            r8.A7X(r0)
            goto L_0x03c9
        L_0x0416:
            X.58m r0 = X.C998658m.FAIL_STALE
            if (r6 != r0) goto L_0x03c9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorStale/method="
            X.C18260x0.A0s(r0, r7, r1)
            X.33p r1 = r8.A09
            java.lang.String r0 = "server-send-error-stale"
            X.AnonymousClass36l.A0O(r1, r0)
            r8.A7E()
            boolean r0 = X.AnonymousClass4L0.A0S(r7)
            if (r0 != 0) goto L_0x0438
            r0 = 2131892943(0x7f121acf, float:1.9420649E38)
            if (r4 == 0) goto L_0x043b
        L_0x0438:
            r0 = 2131894952(0x7f1222a8, float:1.9424723E38)
        L_0x043b:
            java.lang.String r0 = r8.getString(r0)
            r8.A82(r0)
            goto L_0x03c9
        L_0x0443:
            if (r10 != 0) goto L_0x0455
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/connectivity/saved-code-is-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            r8.A7Z(r0)
            r0 = 21
            r8.A7V(r0)
            goto L_0x02e5
        L_0x0455:
            double r4 = java.lang.Math.random()
            int r1 = r8.A01
            int r0 = r1 + 1
            r8.A01 = r0
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r0, r2)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
            r0 = 4661014508095930368(0x40af400000000000, double:4000.0)
            double r2 = r2 * r0
            double r4 = r4 * r2
            int r11 = (int) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/schedule-retry/"
            X.C18260x0.A0y(r0, r1, r11)
            X.4Mc r1 = r8.A0x
            r0 = 1
            android.os.Message r3 = r1.obtainMessage(r0, r10)
            X.4Mc r2 = r8.A0x
            long r0 = (long) r11
            r2.sendMessageDelayed(r3, r0)
            goto L_0x02e5
        L_0x0489:
            java.lang.String r0 = "sms"
            r8.A7h(r2, r0)
            goto L_0x02e5
        L_0x0490:
            r8.A7j(r2, r7)
            goto L_0x02e5
        L_0x0495:
            java.lang.String r0 = "VerifyPhoneNumber/passkeyEvent/passkey_finish_login_error/wamsysFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2s5 r2 = r8.A14
            java.lang.String r1 = r6.toString()
            r0 = 0
            r2.A05(r3, r4, r1, r0)
            goto L_0x050f
        L_0x04a5:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2s5 r1 = r8.A14
            r0 = 0
            r1.A05(r3, r4, r0, r0)
            goto L_0x04ca
        L_0x04af:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2s5 r1 = r8.A14
            r0 = 0
            r1.A05(r3, r4, r0, r0)
            goto L_0x04df
        L_0x04b9:
            X.33p r0 = r8.A09
            r0.A1X(r1)
            X.33p r0 = r8.A09
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "silent_auth_verification_status"
            X.C18270x1.A0l(r1, r0, r3)
        L_0x04ca:
            r8.A7i(r2, r9)
            return
        L_0x04ce:
            X.33p r0 = r8.A09
            r0.A1X(r1)
            X.33p r0 = r8.A09
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "silent_auth_verification_status"
            X.C18270x1.A0l(r1, r0, r3)
        L_0x04df:
            r8.A7j(r2, r9)
            return
        L_0x04e3:
            X.58m r0 = X.C998658m.SECURITY_CODE
            if (r6 != r0) goto L_0x04ee
            r8.A7W(r1)
            r8.A7i(r2, r3)
            return
        L_0x04ee:
            X.58m r1 = X.C998658m.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            r0 = 0
            if (r6 == r1) goto L_0x050f
            r8.A7W(r0)
            X.33p r1 = r8.A09
            java.lang.String r0 = r6.name()
            X.AnonymousClass36l.A0O(r1, r0)
        L_0x04ff:
            int r0 = r8.A04
            r8.A7U(r0)
            return
        L_0x0505:
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthResponse/wamsysFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.33p r0 = r8.A09
            r0.A1X(r1)
        L_0x050f:
            r8.BFh()
            X.3Wi r0 = r8.A05
            X.C386328l.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C992555a.A0C(java.lang.Object):void");
    }

    public C992555a(AnonymousClass33p r4, C56912sl r5, C153017aX r6, C97684z4 r7, C184588sB r8, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A07 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A04 = r7;
        this.A0A = AnonymousClass0x9.A14(r8);
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        int A082 = C86664Kz.A08(AnonymousClass0x2.A0F(r4), "reg_attempts_verify_code", 0);
        C18260x0.A0L(r4, "reg_attempts_verify_code", A082);
        r7.A00 = A082;
        this.A0B = z;
        this.A06 = str4;
        this.A05 = str5;
    }
}
