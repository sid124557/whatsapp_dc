package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass5SZ;
import X.AnonymousClass65R;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.AnonymousClass9b0;
import X.AnonymousClass9bO;
import X.C107695bk;
import X.C160757oG;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C204119oq;
import X.C64333Db;
import X.C88834as;
import android.os.Bundle;
import com.whatsapp.R;

public class IndiaUpiPaymentsAccountSetupActivity extends AnonymousClass9DA {
    public AnonymousClass9bO A00;
    public AnonymousClass5SZ A01;
    public AnonymousClass9b0 A02;
    public boolean A03;
    public final AnonymousClass65R A04;
    public final C160757oG A05;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A02 = (AnonymousClass9b0) r2.APz.get();
            this.A01 = (AnonymousClass5SZ) r2.AQ4.get();
            this.A00 = (AnonymousClass9bO) r2.AQ3.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0184, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0186;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7V() {
        /*
            r6 = this;
            X.33p r0 = r6.A09
            r5 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0U()
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C18270x1.A0l(r1, r0, r5)
            X.99l r0 = r6.A0I
            X.7Tb r3 = r0.A00()
            boolean r0 = r6.A0l
            if (r0 == 0) goto L_0x004c
            boolean r0 = r6.A0o
            if (r0 != 0) goto L_0x004c
            X.33l r0 = r6.A0P
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x004c
            X.1VX r1 = r6.A0D
            r0 = 2974(0xb9e, float:4.167E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x014d
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x014d
            r0 = 3
            if (r1 == r0) goto L_0x014d
            r0 = 6
            if (r1 == r0) goto L_0x014d
            r0 = 7
            if (r1 == r0) goto L_0x014d
            r0 = 8
            if (r1 == r0) goto L_0x014d
            r0 = 10
            if (r1 == r0) goto L_0x014d
            r0 = 11
            if (r1 == r0) goto L_0x014d
        L_0x004c:
            if (r3 != 0) goto L_0x006a
            X.7oG r1 = r6.A05
            java.lang.String r0 = "showNextStep is already complete"
            r1.A06(r0)
            X.5SZ r0 = r6.A01
            r0.A00()
            X.33l r0 = r6.A0P
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C18270x1.A0l(r1, r0, r2)
            r6.A7W(r5)
        L_0x0069:
            return
        L_0x006a:
            X.7oG r2 = r6.A05
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "showNextStep: "
            X.C1899593h.A1H(r2, r3, r0, r1)
            X.7Tb r0 = X.C194979Vj.A05
            if (r3 != r0) goto L_0x0083
            java.lang.String r1 = "Unset step"
            r0 = 0
            r2.A0A(r1, r0)
            r6.finish()
            return
        L_0x0083:
            java.lang.String r0 = "tos_with_wallet"
            java.lang.String r1 = r3.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "add_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "showAddCard not implemented"
            r2.A06(r0)
            return
        L_0x00a3:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r6, r0)
            java.lang.String r0 = "stepName"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_setup_mode"
            int r0 = r6.A03
            r2.putExtra(r1, r0)
            goto L_0x00f3
        L_0x00b6:
            java.lang.String r0 = "add_bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x010d
            X.33l r0 = r6.A0P
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x0104
            X.9bS r1 = r6.A0M
            java.lang.String r0 = r1.A07()
            boolean r0 = r1.A0S(r0)
            if (r0 != 0) goto L_0x0104
            X.1VX r1 = r6.A0D
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0104
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x0101
            r0 = 3
            if (r1 == r0) goto L_0x0101
            r0 = 6
            if (r1 == r0) goto L_0x0101
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity.class
        L_0x00ef:
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r6, r0)
        L_0x00f3:
            r6.A7O(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r6.A0b
            r2.putExtra(r1, r0)
            r6.A6T(r2, r5)
            return
        L_0x0101:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity.class
            goto L_0x00ef
        L_0x0104:
            r6.A0k = r5
            X.1VX r0 = r6.A0D
            java.lang.Class r0 = X.C192799Lp.A00(r0)
            goto L_0x00ef
        L_0x010d:
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.33l r0 = r6.A0P
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C18270x1.A0l(r1, r0, r2)
            X.5SZ r0 = r6.A01
            r0.A00()
            int r0 = r6.A03
            if (r0 != r5) goto L_0x013e
            X.9W6 r1 = r6.A0N
            X.6hm r0 = r6.A0A
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0142
            java.lang.String r1 = "nav_select_account"
            java.lang.String r0 = r6.A0b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0142
        L_0x013e:
            r6.A7W(r2)
            return
        L_0x0142:
            r6.A0k = r5
            X.6hm r1 = r6.A0A
            java.lang.String r0 = r6.A0a
            android.content.Intent r2 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0C(r6, r1, r0, r2)
            goto L_0x00f3
        L_0x014d:
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x01ea
            r0 = 3
            if (r1 == r0) goto L_0x01ea
            r0 = 6
            if (r1 == r0) goto L_0x01ea
            r0 = 7
            if (r1 == r0) goto L_0x01ea
            r0 = 8
            if (r1 == r0) goto L_0x01ea
            r0 = 10
            if (r1 == r0) goto L_0x01ea
            r0 = 11
            if (r1 == r0) goto L_0x01ea
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity.class
        L_0x0169:
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r6, r0)
            java.lang.String r1 = "extra_setup_mode"
            int r0 = r6.A03
            r4.putExtra(r1, r0)
            java.lang.String r2 = "referral_screen"
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x01c8
            java.lang.String r1 = X.C1899693i.A0a(r6, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01c8
        L_0x0186:
            r4.putExtra(r2, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x019c
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "extra_deep_link_url"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            r4.putExtra(r1, r0)
        L_0x019c:
            r6.A7O(r4)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r6.A0b
            r4.putExtra(r1, r0)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x01c4
            android.content.Intent r3 = r6.getIntent()
            r0 = -1
            java.lang.String r2 = "perf_start_time_ns"
            long r0 = r3.getLongExtra(r2, r0)
            r4.putExtra(r2, r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "perf_origin"
            X.C1899693i.A0j(r1, r4, r0)
        L_0x01c4:
            r6.A6T(r4, r5)
            return
        L_0x01c8:
            int r0 = r6.A02
            switch(r0) {
                case 1: goto L_0x01e7;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01e1;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01de;
                case 7: goto L_0x01db;
                case 8: goto L_0x01d8;
                case 9: goto L_0x01d5;
                case 10: goto L_0x01d2;
                case 11: goto L_0x01cf;
                case 12: goto L_0x01e1;
                case 13: goto L_0x01e1;
                default: goto L_0x01cd;
            }
        L_0x01cd:
            r1 = 0
            goto L_0x0186
        L_0x01cf:
            java.lang.String r1 = "order_details"
            goto L_0x0186
        L_0x01d2:
            java.lang.String r1 = "payment_composer_icon"
            goto L_0x0186
        L_0x01d5:
            java.lang.String r1 = "deeplink"
            goto L_0x0186
        L_0x01d8:
            java.lang.String r1 = "qr_code_scan_prompt"
            goto L_0x0186
        L_0x01db:
            java.lang.String r1 = "payment_bank_account_details"
            goto L_0x0186
        L_0x01de:
            java.lang.String r1 = "new_payment"
            goto L_0x0186
        L_0x01e1:
            java.lang.String r1 = "payment_home"
            goto L_0x0186
        L_0x01e4:
            java.lang.String r1 = "chat"
            goto L_0x0186
        L_0x01e7:
            java.lang.String r1 = "in_app_banner"
            goto L_0x0186
        L_0x01ea:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity.class
            goto L_0x0169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.A7V():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r0.equals(r1) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7W(boolean r6) {
        /*
            r5 = this;
            X.7oG r2 = r5.A05
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "showCompleteAndFinish "
            r1.append(r0)
            X.C1899593h.A1L(r2, r1, r6)
            r5.BjL()
            X.9bO r1 = r5.A00
            r4 = 1
            X.9M0 r0 = new X.9M0
            r0.<init>(r5, r4)
            r1.A00(r0)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity> r0 = com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.class
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r5, r0)
            java.lang.String r2 = "referral_screen"
            java.lang.String r0 = X.C1899693i.A0a(r5, r2)
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = "setup_pin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
        L_0x0032:
            r3.putExtra(r2, r1)
            r5.A7O(r3)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r5.A0b
            r3.putExtra(r1, r0)
            r5.A6T(r3, r4)
            return
        L_0x0043:
            java.lang.String r1 = "nav_select_account"
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.A7W(boolean):void");
    }

    public IndiaUpiPaymentsAccountSetupActivity(int i) {
        this.A03 = false;
        C204019og.A00(this, 77);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
    }

    public void onResume() {
        super.onResume();
        C160757oG r2 = this.A05;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onResume payment setup with mode: ");
        C1899593h.A1K(r2, A0o, this.A03);
        if (!isFinishing() && !this.A01.A02(this.A04)) {
            A7V();
        }
    }

    public IndiaUpiPaymentsAccountSetupActivity() {
        this(0);
        this.A04 = new C204119oq(this, 1);
        this.A05 = C160757oG.A00("IndiaUpiPaymentsAccountSetupActivity", "payment-settings", "IN");
    }
}
