package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Ty  reason: invalid class name and case insensitive filesystem */
public class C194649Ty {
    public final C54292oU A00;
    public final AnonymousClass1VX A01;
    public final C620933l A02;
    public final C1907099n A03;
    public final AnonymousClass9U4 A04;
    public final AnonymousClass9TR A05;

    public final String A02() {
        C151007Tb A002;
        if (this.A03.A00() && (A002 = this.A04.A0C("merchant_account_linking_context").A00()) != null) {
            String str = A002.A03;
            if (str.equals("tos_merchant")) {
                return "brpay_m_tos";
            }
            if (str.equals("add_business")) {
                return "brpay_m_enter_taxid";
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            X.33l r3 = r6.A02
            android.content.SharedPreferences r0 = r3.A03()
            java.lang.String r2 = "pref_br_onboarding_add_kyc_step_migration"
            boolean r0 = X.C18280x3.A1W(r0, r2)
            if (r0 != 0) goto L_0x0054
            X.1VX r1 = r6.A01
            r0 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r1.A0X(r0)
            java.lang.String r4 = "p2p_context"
            if (r0 == 0) goto L_0x0026
            android.content.SharedPreferences r1 = r3.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x003c
        L_0x0026:
            boolean r0 = r6.A08(r4)
            if (r0 == 0) goto L_0x004c
            X.9TR r0 = r6.A05
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "generic_context"
            boolean r0 = r6.A07(r0)
            if (r0 == 0) goto L_0x004c
        L_0x003c:
            X.9U4 r0 = r6.A04
            X.9Vj r1 = r0.A0C(r4)
            java.lang.String r0 = "kyc"
            r1.A09(r0)
            java.lang.String r0 = "pending"
            r3.A0L(r0)
        L_0x004c:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C620933l.A00(r3)
            X.C18270x1.A0l(r0, r2, r1)
        L_0x0054:
            java.lang.String r4 = "p2m_context"
            boolean r5 = r4.equals(r7)
            if (r5 == 0) goto L_0x00a7
            X.1VX r1 = r6.A01
            r0 = 2928(0xb70, float:4.103E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r3 = "p2p_context"
            boolean r0 = r6.A08(r3)
            if (r0 == 0) goto L_0x007f
            boolean r0 = r6.A08(r4)
            if (r0 != 0) goto L_0x007f
            java.lang.String r1 = "tos_no_wallet"
            X.9U4 r0 = r6.A04
            X.9Vj r0 = r0.A0C(r4)
            r0.A09(r1)
        L_0x007f:
            X.9U4 r2 = r6.A04
            X.9Vj r0 = r2.A0C(r3)
            java.lang.String r1 = "kyc"
            boolean r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x0094
            X.9Vj r0 = r2.A0C(r4)
            r0.A09(r1)
        L_0x0094:
            X.9Vj r0 = r2.A0C(r3)
            java.lang.String r1 = "add_card"
            boolean r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x00a7
            X.9Vj r0 = r2.A0C(r4)
            r0.A09(r1)
        L_0x00a7:
            java.lang.String r2 = "generic_context"
            boolean r0 = r2.equals(r7)
            r3 = 0
            if (r0 == 0) goto L_0x00cd
            java.lang.String r1 = "p2p_context"
            boolean r0 = r6.A08(r1)
            if (r0 != 0) goto L_0x00be
            boolean r0 = r6.A08(r4)
            if (r0 == 0) goto L_0x00d4
        L_0x00be:
            X.9TR r0 = r6.A05
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r6.A07(r2)
            if (r0 == 0) goto L_0x00d4
        L_0x00cc:
            return r3
        L_0x00cd:
            X.9U4 r0 = r6.A04
            X.9Vj r0 = r0.A0C(r7)
            goto L_0x00da
        L_0x00d4:
            X.9U4 r0 = r6.A04
            X.9Vj r0 = r0.A0C(r1)
        L_0x00da:
            X.7Tb r1 = r0.A00()
            if (r1 == 0) goto L_0x00cc
            java.lang.String r0 = "tos_no_wallet"
            java.lang.String r1 = r1.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
            return r0
        L_0x00f3:
            X.9TR r0 = r6.A05
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "brpay_p_pin_nux_create"
            return r0
        L_0x00fe:
            java.lang.String r0 = "kyc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0111
            if (r5 == 0) goto L_0x010e
            boolean r0 = r6.A07(r2)
            if (r0 != 0) goto L_0x00cc
        L_0x010e:
            java.lang.String r0 = "brpay_p_compliance_kyc_next_screen_router"
            return r0
        L_0x0111:
            java.lang.String r0 = "add_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cc
            if (r8 != 0) goto L_0x00cc
            java.lang.String r0 = "brpay_p_add_card"
            return r0
        L_0x011e:
            boolean r0 = r6.A09(r7)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "brpay_p_consent_flow"
            return r0
        L_0x0127:
            java.lang.String r0 = "brpay_p_tos"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194649Ty.A03(java.lang.String, boolean):java.lang.String");
    }

    public boolean A05() {
        return this.A05.A03();
    }

    public boolean A06() {
        C620933l r6 = this.A02;
        if (C18280x3.A1W(r6.A03(), "payment_account_recoverable")) {
            AnonymousClass1VX r3 = this.A01;
            if (r6.A01.A0H() - AnonymousClass0x2.A0B(r6.A03(), "payment_account_recoverable_time_ms") > TimeUnit.DAYS.toMillis((long) r3.A0N(2267)) || C18280x3.A1W(r6.A03(), "payment_account_recovered") || !r3.A0X(2000)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A07(String str) {
        if (!"generic_context".equals(str)) {
            return this.A04.A0C(str).A0G("add_card");
        }
        AnonymousClass9U4 r1 = this.A04;
        if (r1.A0C("p2p_context").A0G("add_card") || r1.A0C("p2m_context").A0G("add_card")) {
            return true;
        }
        return false;
    }

    public boolean A08(String str) {
        return this.A04.A0C(str).A0G("tos_no_wallet");
    }

    public boolean A09(String str) {
        if (!this.A01.A0X(2928) || !str.equals("p2p_context") || !A07("p2m_context") || A08("p2p_context")) {
            return false;
        }
        return true;
    }

    public C194649Ty(C54292oU r1, AnonymousClass1VX r2, C620933l r3, C1907099n r4, AnonymousClass9U4 r5, AnonymousClass9TR r6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
    }

    public Intent A00(Context context, C133736hr r5) {
        Intent A032 = C1899693i.A03(context);
        A032.putExtra("screen_params", A04(r5, (C198179eV) null, (String) null, -1));
        A032.putExtra("screen_name", "brpay_p_card_verified");
        return A032;
    }

    public Intent A01(Context context, C133736hr r5, C198179eV r6, String str, int i) {
        Intent A032 = C1899693i.A03(context);
        A032.putExtra("screen_params", A04(r5, r6, str, i));
        A032.putExtra("screen_name", "brpay_p_card_verify_options");
        A032.putExtra("payment_method_credential_id", r5.A0A);
        return A032;
    }

    public HashMap A04(C133736hr r5, C198179eV r6, String str, int i) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("credential_id", r5.A0A);
        if (str != null) {
            A0t.put("verify_methods", str);
            if (!(!this.A01.A0X(2443) || i == -1 || r6 == null)) {
                A0t.put("default_selected_position", String.valueOf(i));
                BrazilPayBloksActivity.A0e(r6, A0t);
            }
        }
        A0t.put("source", "pay_flow");
        A0t.put("network_name", C133736hr.A02(r5.A01));
        C133786hw r3 = (C133786hw) r5.A08;
        if (r3 != null && !TextUtils.isEmpty(r3.A0E)) {
            A0t.put("card_image_url", r3.A0E);
        }
        A0t.put("readable_name", C195169Wk.A02(this.A00.A00, r5));
        A0t.put("verified_state", C1899693i.A0Z(((C133786hw) r5.A08).A0a ? 1 : 0));
        return A0t;
    }
}
