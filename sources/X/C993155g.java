package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.55g  reason: invalid class name and case insensitive filesystem */
public class C993155g extends AnonymousClass5ZM {
    public AnonymousClass5LR A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final C56912sl A05;
    public final C183538qC A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final WeakReference A0B;

    public static void A00(AnonymousClass0PJ r2, AbstractMap abstractMap) {
        abstractMap.put(r2.A00, ((String) r2.A01).getBytes());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        X.C621433s.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0162, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0165, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r11) {
        /*
            r10 = this;
            X.58k r11 = (X.C998458k) r11
            java.lang.ref.WeakReference r0 = r10.A0B
            java.lang.Object r1 = r0.get()
            X.8pH r1 = (X.C182968pH) r1
            if (r1 != 0) goto L_0x0012
            java.lang.String r0 = "SecurityCodeTask/onPostExecute/null callback"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            return
        L_0x0012:
            r0 = 1
            r1.Blx(r0)
            X.5LR r8 = r10.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r1 = (com.whatsapp.registration.VerifyTwoFactorAuth) r1
            r0 = 0
            r1.A0S = r0
            int r0 = r1.A00
            X.C621433s.A00(r1, r0)
            r3 = 1
            r1.Blx(r3)
            r9 = 0
            r1.A0e = r9
            X.1ip r0 = r1.A07
            X.49Y r2 = r1.A0g
            r0.A07(r2)
            int r0 = r11.ordinal()
            r6 = 1000(0x3e8, double:4.94E-321)
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0214;
                case 2: goto L_0x00af;
                case 3: goto L_0x01ee;
                case 4: goto L_0x0102;
                case 5: goto L_0x01a5;
                case 6: goto L_0x00f4;
                case 7: goto L_0x0166;
                case 8: goto L_0x0158;
                case 9: goto L_0x0110;
                case 10: goto L_0x01ee;
                case 11: goto L_0x00ce;
                default: goto L_0x0039;
            }
        L_0x0039:
            return
        L_0x003a:
            X.C626936e.A06(r8)
            int r0 = r1.A01
            if (r0 != r3) goto L_0x0066
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-email-sent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131894521(0x7f1220f9, float:1.942385E38)
            r1.Bot(r0)
            java.lang.String r0 = "forgotPinDialogTag"
            r1.A6c(r0)
            r1.A78(r8)
            r1.A7B(r9)
            r3 = 0
            java.lang.String r0 = "VerifyTwoFactorAuth/do-check-if-exists"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.os.Handler r2 = r1.A0f
            java.lang.Runnable r0 = r1.A0h
            r2.postDelayed(r0, r3)
            return
        L_0x0066:
            java.lang.String r0 = r8.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A7B(r3)
            X.33p r2 = r1.A09
            boolean r0 = r8.A0D
            r2.A1t(r0)
            X.33p r2 = r1.A09
            boolean r0 = r8.A0C
            r2.A1s(r0)
            X.33p r0 = r1.A09
            boolean r3 = r8.A0B
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r0)
            java.lang.String r0 = "first_party_migration_initiated"
            X.C18270x1.A0l(r2, r0, r3)
            int r0 = r1.A01
            if (r0 != 0) goto L_0x009b
            X.043 r0 = X.AnonymousClass36l.A07(r1)
            r1.A09 = r0
        L_0x009b:
            r0 = 13
            X.3a1 r2 = new X.3a1
            r2.<init>(r1, r0, r8)
            X.043 r0 = r1.A09
            if (r0 == 0) goto L_0x0224
            r0.show()
            X.3Wi r0 = r1.A05
            r0.A0T(r2, r6)
            return
        L_0x00af:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/unspecified"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.55g r0 = r1.A0S
            if (r0 == 0) goto L_0x00cb
            boolean r0 = X.C18320x8.A1T(r0)
            if (r0 != 0) goto L_0x00cb
            r1.A0e = r3
            X.1ip r0 = r1.A07     // Catch:{ IllegalStateException -> 0x00c6 }
            r0.A06(r2)     // Catch:{ IllegalStateException -> 0x00c6 }
            goto L_0x00cb
        L_0x00c6:
            java.lang.String r0 = "VerifyTwoFactorAuth/register-connectivity-observer already registered"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x00cb:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x00f0
        L_0x00ce:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/blocked"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1.A7B(r3)
            if (r8 == 0) goto L_0x00ee
            X.2nZ r0 = r8.A04
            if (r0 == 0) goto L_0x00ee
            X.317 r0 = r1.A0O
            r0.A09()
            X.2nZ r0 = r8.A04
            android.content.Intent r0 = X.C627736r.A0n(r1, r0)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x00ee:
            r0 = 124(0x7c, float:1.74E-43)
        L_0x00f0:
            X.C621433s.A01(r1, r0)
            return
        L_0x00f4:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too-many-guesses"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1.A7B(r3)
            X.5Te r1 = r1.A0L
            r0 = 2131894533(0x7f122105, float:1.9423873E38)
            goto L_0x0162
        L_0x0102:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/incorrect"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1.A7B(r3)
            X.5Te r1 = r1.A0L
            r0 = 2131892979(0x7f121af3, float:1.9420722E38)
            goto L_0x0162
        L_0x0110:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/stale"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r5 = r1.A74()
            X.C626936e.A06(r8)
            r1.A78(r8)
            int r4 = r1.A74()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/stale previous="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " new="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " isRetry="
            r2.append(r0)
            boolean r0 = r1.A0d
            X.C18260x0.A1U(r2, r0)
            boolean r0 = r1.A0d
            if (r0 != 0) goto L_0x014f
            if (r5 != r4) goto L_0x014f
            java.lang.String r2 = r1.A0X
            int r0 = r1.A01
            r1.A76(r0, r2, r3)
            return
        L_0x014f:
            r1.A7B(r3)
            X.5Te r1 = r1.A0L
            r0 = 2131892943(0x7f121acf, float:1.9420649E38)
            goto L_0x0162
        L_0x0158:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-too-soon"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.5Te r1 = r1.A0L
            r0 = 2131894522(0x7f1220fa, float:1.9423851E38)
        L_0x0162:
            r1.A02(r0)
            return
        L_0x0166:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/guessed-too-fast"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.C626936e.A06(r8)
            java.lang.String r0 = r8.A06     // Catch:{ NumberFormatException -> 0x018d }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x018d }
            long r4 = r4 * r6
            X.5Te r7 = r1.A0L     // Catch:{ NumberFormatException -> 0x018d }
            r6 = 2131892906(0x7f121aaa, float:1.9420574E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ NumberFormatException -> 0x018d }
            X.33j r0 = r1.A00     // Catch:{ NumberFormatException -> 0x018d }
            java.lang.String r0 = X.C107565bW.A0D(r0, r4)     // Catch:{ NumberFormatException -> 0x018d }
            java.lang.String r0 = X.AnonymousClass002.A0F(r1, r0, r2, r9, r6)     // Catch:{ NumberFormatException -> 0x018d }
            r7.A03(r0)     // Catch:{ NumberFormatException -> 0x018d }
            r1.A77(r4)     // Catch:{ NumberFormatException -> 0x018d }
            return
        L_0x018d:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too_fast failed to parse: "
            r2.append(r0)
            java.lang.String r0 = r8.A06
            X.C18260x0.A14(r0, r2, r3)
            X.5Te r1 = r1.A0L
            r0 = 2131894533(0x7f122105, float:1.9423873E38)
            r1.A02(r0)
            return
        L_0x01a5:
            X.C626936e.A06(r8)
            android.content.SharedPreferences r2 = X.AnonymousClass1Hf.A27(r1)
            java.lang.String r0 = "registration_code"
            java.lang.String r2 = X.C18280x3.A0Z(r2, r0)
            java.lang.String r0 = r1.A0X
            boolean r3 = X.AnonymousClass75J.A00(r0, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch "
            X.C18260x0.A1E(r0, r2, r3)
            com.whatsapp.CodeInputField r0 = r1.A0C
            X.C86634Kw.A1I(r0)
            X.5Te r2 = r1.A0L
            r0 = 2131894540(0x7f12210c, float:1.9423888E38)
            if (r3 == 0) goto L_0x01d0
            r0 = 2131894497(0x7f1220e1, float:1.94238E38)
        L_0x01d0:
            r2.A02(r0)
            java.lang.String r0 = r8.A06     // Catch:{ NumberFormatException -> 0x01de }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01de }
            long r2 = r2 * r6
            r1.A77(r2)     // Catch:{ NumberFormatException -> 0x01de }
            return
        L_0x01de:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch failed to parse: "
            r1.append(r0)
            java.lang.String r0 = r8.A06
            X.C18260x0.A14(r0, r1, r2)
            return
        L_0x01ee:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3 = 32
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyTwoFactorAuth/notify/dialog "
            X.C18260x0.A0w(r0, r2, r3)
            X.5Te r0 = r1.A0L
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x020e
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x020e
            X.C621433s.A01(r1, r3)
            return
        L_0x020e:
            X.33T r0 = r1.A0G
            X.AnonymousClass36l.A0H(r1, r0, r3)
            return
        L_0x0214:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "VerifyTwoFactorAuth/removeProgressDialog/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Wi r0 = r1.A05
            X.C386328l.A00(r0)
            return
        L_0x0224:
            r2.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C993155g.A0C(java.lang.Object):void");
    }

    public C993155g(Context context, AnonymousClass33p r3, AnonymousClass1VX r4, C56912sl r5, C182968pH r6, C183538qC r7, String str, String str2, String str3, String str4, int i) {
        this.A01 = i;
        this.A0A = str;
        this.A08 = str3;
        this.A07 = str2;
        this.A09 = str4;
        this.A06 = r7;
        this.A02 = context;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A0B = AnonymousClass0x9.A14(r6);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass0PJ r7;
        AnonymousClass0PJ r6;
        AnonymousClass0PJ r5;
        AnonymousClass0PJ r3;
        AnonymousClass5LR r1;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SecurityCodeTask/doInBackground code=");
        String str = this.A09;
        A0o.append(str);
        A0o.append(" resetMode=");
        int i = this.A01;
        C18260x0.A1F(A0o, i);
        try {
            AnonymousClass33p r10 = this.A03;
            C183538qC r8 = r10.A01;
            int A082 = C86664Kz.A08(C18300x5.A0B(r8), "reg_attempts_verify_2fa", 0);
            C18260x0.A0L(r10, "reg_attempts_verify_2fa", A082);
            C150607Rl r14 = new C150607Rl(A082);
            if (str != null) {
                C183538qC r9 = this.A06;
                if (r9.get() == null || C18280x3.A0Z(C18300x5.A0B(r8), "pref_wfs_blob") == null || C18280x3.A0Z(AnonymousClass0x2.A0F(r10), "pref_wfs_user") == null || C18280x3.A0Z(AnonymousClass0x2.A0F(r10), "pref_wfs_pw") == null || C18300x5.A0B(r8).getString("pref_wfs_id_sign", (String) null) == null) {
                    r7 = null;
                    r6 = null;
                    r5 = null;
                    r3 = null;
                } else {
                    C103365Mp.A00(r9);
                    r7 = AnonymousClass0x9.A0G("foa_authproof", C18300x5.A0B(r8).getString("pref_wfs_blob", (String) null));
                    C103365Mp.A00(r9);
                    r6 = AnonymousClass0x9.A0G("wa_ac_ent_id", C18280x3.A0Z(AnonymousClass0x2.A0F(r10), "pref_wfs_user"));
                    C103365Mp.A00(r9);
                    r5 = AnonymousClass0x9.A0G("wa_ac_ent_enc_pw", C18280x3.A0Z(AnonymousClass0x2.A0F(r10), "pref_wfs_pw"));
                    C103365Mp.A00(r9);
                    r3 = AnonymousClass0x9.A0G("id_ac_sign", C18300x5.A0B(r8).getString("pref_wfs_id_sign", (String) null));
                }
                C56912sl r4 = this.A05;
                String str2 = this.A07;
                String str3 = this.A08;
                if (!r4.A0F()) {
                    r1 = new AnonymousClass5LR(C998458k.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
                } else {
                    r4.A0E(true);
                    byte[] A0H = r4.A0H(str2, str3);
                    byte[] A0G = r4.A0G("verifySecurityCode");
                    HashMap A0t = AnonymousClass001.A0t();
                    if (!(r7 == null || r6 == null || r5 == null || r3 == null)) {
                        A00(r7, A0t);
                        A00(r6, A0t);
                        A00(r5, A0t);
                        A00(r3, A0t);
                    }
                    A0t.put("client_metrics", r14.A00().toString().getBytes());
                    r4.A09(A0t);
                    r4.A0C(A0t);
                    r4.A08(A0t);
                    r1 = (AnonymousClass5LR) C105935Wz.A00(new AnonymousClass56M(r4.A0N, r4.A0P, str, str2, str3, r4.A04(str2, "security_entrypoint"), r4.A05(), A0t, (byte[]) null, A0H, A0G, 0));
                }
                this.A00 = r1;
            } else if (i == 1) {
                this.A00 = this.A05.A03(r14, this.A07, this.A08, "email", (String) null);
            } else if (i == 2) {
                this.A00 = this.A05.A03(r14, this.A07, this.A08, "wipe", this.A0A);
            }
            AnonymousClass5LR r2 = this.A00;
            if (r2 == null) {
                Log.i("SecurityCodeTask/doInBackground/null SecurityResult");
                return C998458k.ERROR_UNSPECIFIED;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("SecurityCodeTask/security entrypoint response//resetMethod=");
            A0o2.append(r2.A08);
            A0o2.append("/wipeWait=");
            C18260x0.A1I(A0o2, r2.A02);
            return this.A00.A03;
        } catch (Exception e) {
            Log.e("SecurityCodeTask/doInBackground/error ", e);
            return C998458k.ERROR_UNSPECIFIED;
        }
    }
}
