package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1RR;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass31C;
import X.AnonymousClass344;
import X.AnonymousClass3ZO;
import X.AnonymousClass4EY;
import X.AnonymousClass4FU;
import X.AnonymousClass4OR;
import X.AnonymousClass56h;
import X.AnonymousClass5OR;
import X.AnonymousClass5VI;
import X.AnonymousClass5VU;
import X.AnonymousClass5Yj;
import X.AnonymousClass65I;
import X.AnonymousClass94L;
import X.AnonymousClass94R;
import X.AnonymousClass95A;
import X.AnonymousClass99H;
import X.AnonymousClass9H1;
import X.AnonymousClass9OK;
import X.AnonymousClass9Qp;
import X.AnonymousClass9T5;
import X.AnonymousClass9TR;
import X.AnonymousClass9U4;
import X.AnonymousClass9VU;
import X.AnonymousClass9W3;
import X.AnonymousClass9W6;
import X.AnonymousClass9WM;
import X.AnonymousClass9d2;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C105365Uq;
import X.C106545Zk;
import X.C107335b8;
import X.C107635bd;
import X.C111095hX;
import X.C133796hx;
import X.C148187Hi;
import X.C154327cz;
import X.C166587yw;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C1901794j;
import X.C1902394t;
import X.C1906399f;
import X.C191789Gl;
import X.C192779Ln;
import X.C192799Lp;
import X.C193999Re;
import X.C194089Rn;
import X.C194209Rz;
import X.C194259Se;
import X.C194389Sr;
import X.C194479Ta;
import X.C194819Up;
import X.C194939Vd;
import X.C195909Zz;
import X.C196419ao;
import X.C196569b8;
import X.C196629bS;
import X.C197109ca;
import X.C197769dq;
import X.C199339gQ;
import X.C199349gR;
import X.C199639gu;
import X.C199739hA;
import X.C201039jQ;
import X.C202669mO;
import X.C203199nH;
import X.C204249p3;
import X.C204409pJ;
import X.C204439pM;
import X.C204449pN;
import X.C205039qK;
import X.C205049qL;
import X.C29441ip;
import X.C54412og;
import X.C56972sr;
import X.C620633i;
import X.C620733j;
import X.C620933l;
import X.C621433s;
import X.C626936e;
import X.C66413Li;
import X.C66543Lv;
import X.C66663Mh;
import X.C69263Wi;
import X.C73723fy;
import X.C86604Kt;
import X.C86644Kx;
import X.C995256b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiPaymentSettingsFragment extends Hilt_IndiaUpiPaymentSettingsFragment implements C203199nH, C202669mO, AnonymousClass65I {
    public View A00 = null;
    public View A01 = null;
    public View A02 = null;
    public View A03 = null;
    public C111095hX A04;
    public C29441ip A05;
    public AnonymousClass9H1 A06;
    public C66413Li A07;
    public C620633i A08;
    public C54412og A09;
    public C66543Lv A0A;
    public AnonymousClass31C A0B;
    public C196629bS A0C;
    public AnonymousClass9W6 A0D;
    public C194479Ta A0E;
    public C195909Zz A0F;
    public C193999Re A0G;
    public AnonymousClass9WM A0H;
    public C197769dq A0I;
    public C194089Rn A0J;
    public C194389Sr A0K;
    public AnonymousClass9VU A0L;
    public C197109ca A0M;
    public C196419ao A0N;
    public AnonymousClass9W3 A0O;
    public AnonymousClass9TR A0P;
    public C1901794j A0Q;
    public C191789Gl A0R;
    public C194819Up A0S;
    public IndiaPaymentSettingsViewModel A0T;
    public C194259Se A0U;
    public List A0V;

    public void A1c(int i) {
        if (i == 3) {
            Intent A082 = AnonymousClass0x9.A08(A0R(), IndiaUpiPaymentsAccountSetupActivity.class);
            A082.putExtra("extra_skip_value_props_display", false);
            A082.putExtra("extra_payments_entry_type", 9);
            Bundle bundle = this.A06;
            if (bundle != null) {
                A082.putExtra("extra_deep_link_url", bundle.getParcelable("extra_deep_link_url"));
            }
            A0m(A082);
            return;
        }
        super.A1c(i);
    }

    public void BMA(boolean z) {
        boolean z2 = z;
        if (this.A0m.A02.A0X(4638) && this.A0c.A0C()) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new AnonymousClass9d2(this, paymentBottomSheet, z));
            AnonymousClass344.A02(paymentBottomSheet, A0Q().getSupportFragmentManager(), "IndiaUpiAccountTypeSelectionFragment");
        } else if (z || this.A0C.A0Q()) {
            A1q("settingsAddPayment", (String) null, 2, 5, z2, false);
        } else {
            A1s(false);
        }
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel;
        View view2 = view;
        super.A0w(bundle, view2);
        new AnonymousClass9Qp(this.A0c).A00(A0R());
        Bundle bundle2 = this.A06;
        String str2 = null;
        if (bundle2 != null && bundle2.getBoolean("extra_send_to_upi_id", false)) {
            new C194209Rz(A0R(), (AnonymousClass4FU) A0R(), this.A0F, this.A0G, "payment_home", false).A00((PaymentBottomSheet) null);
        }
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel2 = this.A0T;
        if (!(indiaPaymentSettingsViewModel2 == null || this.A0B == null)) {
            C205049qL.A02(this, indiaPaymentSettingsViewModel2.A01, 34);
            C205049qL.A02(this, this.A0T.A00, 35);
        }
        if (this.A0O.A08(C66663Mh.A0j)) {
            ViewStub viewStub = (ViewStub) view2.findViewById(R.id.banner_viewstub);
            if (C106545Zk.A02(this.A02)) {
                viewStub.setLayoutResource(R.layout.f8nameremoved);
                viewStub.inflate();
                WDSBanner wDSBanner = (WDSBanner) view2.findViewById(R.id.banner);
                AnonymousClass5OR r8 = new AnonymousClass5OR();
                r8.A02 = new C995256b(new AnonymousClass56h(R.drawable.av_privacy));
                r8.A03 = AnonymousClass5VU.A00(view2.getContext(), R.string.f11nameremoved);
                r8.A05 = true;
                wDSBanner.setState(r8.A00());
                C204409pJ.A00(wDSBanner, view2, this, 15);
                wDSBanner.A05();
            } else {
                viewStub.setLayoutResource(R.layout.f8nameremoved);
                viewStub.inflate();
                C1899593h.A0m(view2, R.id.privacy_banner_avatar, AnonymousClass0Y8.A04(A0G(), R.color.f5nameremoved));
                Context A0G2 = A0G();
                AnonymousClass1VX r14 = this.A02;
                C69263Wi r11 = this.A0L;
                C107635bd.A0E(A0G2, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), this.A04, r11, AnonymousClass0x7.A0K(view2, R.id.payment_privacy_banner_text), this.A08, r14, C08310eF.A09(this).getString(R.string.f11nameremoved, new Object[]{"learn-more"}), "learn-more");
                C86604Kt.A1F(view2, R.id.payment_privacy_banner, 0);
            }
        }
        this.A03 = C06560Yg.A02(view2, R.id.remove_account_container_separator);
        this.A02 = C06560Yg.A02(view2, R.id.remove_account_container);
        View A022 = C06560Yg.A02(view2, R.id.payment_row_remove_method);
        this.A01 = A022;
        C204249p3.A02(A022, this, 71);
        C107335b8.A0E(AnonymousClass0x9.A0E(view2, R.id.delete_payments_account_image), AnonymousClass0Y8.A04(A0G(), R.color.f5nameremoved));
        C18300x5.A0G(view2, R.id.delete_payments_account_text).setText(R.string.f11nameremoved);
        C194939Vd r6 = this.A0v;
        if (bundle2 != null) {
            str = bundle2.getString("notification-type");
            str2 = bundle2.getString("step-up-id");
        } else {
            str = null;
        }
        r6.A07(str, str2);
        this.A0d = new C205039qK(this, 1);
        View inflate = A0I().inflate(R.layout.f8nameremoved, this.A0C, false);
        if (this.A0C.getChildCount() > 0) {
            this.A0C.removeAllViews();
        }
        this.A0C.addView(inflate);
        this.A0C.setVisibility(0);
        if (bundle2 != null && bundle2.getBoolean("extra_is_invalid_deep_link_url", false)) {
            C621433s.A01(A0R(), 101);
        }
        if (this.A0C.A0P() && this.A0i.A03().getInt("payments_upi_transactions_sync_status", 0) == 0 && (indiaPaymentSettingsViewModel = this.A0T) != null) {
            long j = indiaPaymentSettingsViewModel.A09.A03().getLong("payments_upi_last_transactions_sync_time", 0);
            if (j == 0 || indiaPaymentSettingsViewModel.A05.A0H() - j > IndiaPaymentSettingsViewModel.A0D) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel3 = this.A0T;
                indiaPaymentSettingsViewModel3.A0C.BkM(new C201039jQ(indiaPaymentSettingsViewModel3, 1, Integer.valueOf(indiaPaymentSettingsViewModel3.A04.A0N(1782))));
            }
        }
        this.A0Q = (C1901794j) C18290x4.A0O(this).A01(C1901794j.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r1 = r6.A0x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r1.A0L((X.AnonymousClass9VG) null, 36, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r3 = X.C1899593h.A05(A0R());
        r3.putExtra("extra_payments_entry_type", 5);
        r3.putExtra("extra_is_first_payment_method", true);
        r3.putExtra("extra_skip_value_props_display", true);
        r3.putExtra("extra_referral_screen", X.AnonymousClass000.A0V(".", "warm_welcome_banner", X.AnonymousClass000.A0l("payment_home")));
        r0 = "warmWelcomeBanner";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e8, code lost:
        X.AnonymousClass5VI.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01eb, code lost:
        A0m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1f(java.lang.String r7) {
        /*
            r6 = this;
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r0 = r6.A0T
            X.C626936e.A06(r0)
            int r0 = r0.A0O()
            r3 = 0
            switch(r0) {
                case 1: goto L_0x01ad;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00b3;
                case 4: goto L_0x0064;
                case 5: goto L_0x0169;
                case 6: goto L_0x000e;
                case 7: goto L_0x0139;
                case 8: goto L_0x011d;
                case 9: goto L_0x00f1;
                case 10: goto L_0x0027;
                case 11: goto L_0x00b7;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            X.94t r1 = r6.A0x
            if (r1 == 0) goto L_0x001b
            r0 = 97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0K(r3, r0, r7)
        L_0x001b:
            X.99l r0 = r6.A0c
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0027
            r6.A1o()
            return
        L_0x0027:
            X.94t r1 = r6.A0x
            if (r1 == 0) goto L_0x0034
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0L(r3, r0, r7)
        L_0x0034:
            X.03q r0 = r6.A0R()
            android.content.Intent r3 = X.C1899593h.A05(r0)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 5
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_is_first_payment_method"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_skip_value_props_display"
            r3.putExtra(r0, r1)
            java.lang.String r2 = "warm_welcome_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "warmWelcomeBanner"
            goto L_0x01e8
        L_0x0064:
            X.94t r1 = r6.A0x
            if (r1 == 0) goto L_0x0071
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0K(r3, r0, r7)
        L_0x0071:
            X.03q r1 = r6.A0R()
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r5 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r2 = "add_upi_number_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r5.putExtra(r0, r1)
            X.3QD r4 = X.AnonymousClass3QD.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.948 r0 = r6.A0s
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x00a4
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a4
            java.lang.String r3 = A00(r1)
        L_0x00a4:
            java.lang.String r0 = "accountHolderName"
            X.7yt r1 = X.C1899693i.A0F(r4, r2, r3, r0)
            java.lang.String r0 = "extra_payment_name"
            r5.putExtra(r0, r1)
            r6.A0m(r5)
            return
        L_0x00b3:
            r6.A1g(r7)
            return
        L_0x00b7:
            X.94t r1 = r6.A0x
            if (r1 == 0) goto L_0x00df
            java.lang.String r4 = "recent_businesses"
            r0 = 1
            X.9no r3 = r1.A0B
            X.6ig r2 = r3.B0d()
            X.C1899593h.A1B(r2, r0)
            java.lang.String r1 = "payment_home"
            r2.A0b = r1
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.C18280x3.A19(r1, r4, r0)
            X.303 r0 = X.C1899693i.A0Q(r2, r4, r0)
            java.lang.String r0 = r0.toString()
            r2.A0Z = r0
            r3.BKA(r2)
        L_0x00df:
            android.content.Context r1 = r6.A1D()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.whatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r1 = "for_payment_merchants"
            r0 = 1
            r3.putExtra(r1, r0)
            goto L_0x01eb
        L_0x00f1:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r2 = r0.getLanguage()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://youtu.be/"
            r1.append(r0)
            java.lang.String r0 = r6.A1n(r2)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r1, r0)
            goto L_0x01eb
        L_0x011d:
            X.94t r2 = r6.A0x
            if (r2 == 0) goto L_0x0127
            r1 = 1
            java.lang.String r0 = "recovery_2fa_upsell_banner"
            r2.A0H(r1, r0)
        L_0x0127:
            X.03q r2 = r6.A0R()
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {1, 2} // fill-array
            java.lang.String r0 = "CONTINUE"
            android.content.Intent r3 = X.C627736r.A19(r2, r0, r1)
            goto L_0x01eb
        L_0x0139:
            X.94t r2 = r6.A0x
            if (r2 == 0) goto L_0x0143
            r1 = 1
            java.lang.String r0 = "recovery_upin_upsell_banner"
            r2.A0H(r1, r0)
        L_0x0143:
            X.9U4 r0 = r6.A0n
            X.8EA r0 = X.AnonymousClass9U4.A03(r0)
            X.7yw r3 = r0.A06()
            X.6hm r3 = (X.C133686hm) r3
            X.C626936e.A06(r3)
            X.03q r2 = r6.A0R()
            if (r3 == 0) goto L_0x0167
            X.6hx r0 = r3.A08
            if (r0 == 0) goto L_0x0167
            X.99H r0 = (X.AnonymousClass99H) r0
            java.lang.String r1 = r0.A0B
        L_0x0160:
            r0 = 0
            android.content.Intent r3 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0C(r2, r3, r1, r0)
            goto L_0x01eb
        L_0x0167:
            r1 = 0
            goto L_0x0160
        L_0x0169:
            X.94t r1 = r6.A0x
            r4 = 1
            if (r1 == 0) goto L_0x0173
            r0 = 139(0x8b, float:1.95E-43)
            r1.A0G(r4, r0)
        L_0x0173:
            X.03q r1 = r6.A0R()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r0 = "extra_payments_entry_type"
            r3.putExtra(r0, r4)
            java.lang.String r2 = "notify_verification_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r1 = 2
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_setup_mode"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "extra_skip_value_props_display"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "accountRecoveryBanner"
            goto L_0x01e8
        L_0x01ad:
            X.94t r1 = r6.A0x
            if (r1 == 0) goto L_0x01ba
            r0 = 85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0L(r3, r0, r7)
        L_0x01ba:
            X.03q r0 = r6.A0R()
            android.content.Intent r3 = X.C1899593h.A05(r0)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 5
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_is_first_payment_method"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_skip_value_props_display"
            r3.putExtra(r0, r1)
            java.lang.String r2 = "finish_setup"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "resumeOnboardingBanner"
        L_0x01e8:
            X.AnonymousClass5VI.A00(r3, r0)
        L_0x01eb:
            r6.A0m(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A1f(java.lang.String):void");
    }

    public final String A1n(String str) {
        JSONObject jSONObject;
        String A0Q2 = this.A02.A0Q(3480);
        try {
            C626936e.A06(A0Q2);
            jSONObject = AnonymousClass0x9.A1H(A0Q2);
        } catch (JSONException e) {
            Log.e("Error converting abProps to Json", e);
            jSONObject = AnonymousClass0x9.A1G();
        }
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return jSONObject.getString("en");
        } catch (JSONException e2) {
            Log.e(AnonymousClass000.A0V("Error reading video suffix for language tag ", str, AnonymousClass001.A0o()), e2);
            return "X0-QiPD4kqs";
        }
    }

    public final void A1p() {
        boolean z;
        if (!this.A02.A0X(3740) || (!C18280x3.A1W(this.A0i.A03(), "pref_p2m_hybrid_v2_tos_accepted") && this.A17.size() <= 0)) {
            z = false;
        } else {
            z = true;
        }
        View view = this.A02;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
        this.A01.setVisibility(i);
        this.A03.setVisibility(i);
    }

    public String B9i(C166587yw r3) {
        AnonymousClass99H r0 = (AnonymousClass99H) r3.A08;
        if (r0 != null && !AnonymousClass99H.A00(r0)) {
            return C08310eF.A09(this).getString(R.string.f11nameremoved);
        }
        if (AnonymousClass9W6.A01(this.A17)) {
            return "";
        }
        return super.B9i(r3);
    }

    public void BQa(String str) {
        TransactionsExpandableView transactionsExpandableView = this.A11;
        transactionsExpandableView.post(new C199739hA(transactionsExpandableView));
        TransactionsExpandableView transactionsExpandableView2 = this.A10;
        transactionsExpandableView2.post(new C199739hA(transactionsExpandableView2));
    }

    public void Bld(boolean z) {
        C194939Vd r0;
        View view = this.A0B;
        if (view != null) {
            ViewGroup A0I2 = C86644Kx.A0I(view, R.id.action_required_container);
            int i = 0;
            if (this.A00 == null && (r0 = this.A0v) != null) {
                if (r0.A0C.A04() != null) {
                    this.A0Z.A04(C192779Ln.A00(this.A0W, this.A0v.A0C.A04()));
                }
                if (!this.A0Z.A02().isEmpty()) {
                    A0I2.removeAllViews();
                    AnonymousClass94R r4 = new AnonymousClass94R(A0G());
                    List A022 = this.A0Z.A02();
                    r4.A00(new AnonymousClass9T5(new C196569b8(this), (AnonymousClass3ZO) C73723fy.A0E(A022).get(0), A022.size()));
                    A0I2.addView(r4);
                    this.A00 = A0I2;
                }
            }
            if (!z) {
                i = 8;
            }
            A0I2.setVisibility(i);
        }
    }

    public void Brv(List list) {
        this.A0N.A07(list);
        super.Brv(list);
        C1902394t r0 = this.A0x;
        if (r0 != null) {
            r0.A03 = list;
        }
        A1b();
    }

    public void Bs5(List list) {
        this.A0v.A03();
        this.A0N.A07(list);
        super.Bs5(list);
        C1902394t r0 = this.A0x;
        if (r0 != null) {
            r0.A04 = list;
        }
        A1b();
    }

    public static String A00(List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C166587yw A0C2 = C1899693i.A0C(it);
            if (A0C2.A01 == 2) {
                C133796hx r0 = A0C2.A08;
                if (r0 != null) {
                    return (String) C1899593h.A0X(r0.A08());
                }
                C1899593h.A1Q("PaymentMethodUtils", "getDefaultAccountHolderName/null country data");
            }
        }
        return null;
    }

    public void A0e() {
        super.A0e();
        C18270x1.A0l(C620933l.A00(this.A0i), "payments_has_unseen_requests", false);
        this.A15.BkM(new C199349gR(this));
    }

    public void A0f() {
        super.A0f();
        C18270x1.A0l(C620933l.A00(this.A0i), "payments_has_unseen_requests", false);
        this.A15.BkM(new C199339gQ(this));
        this.A0v.A03();
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A0T;
        if (indiaPaymentSettingsViewModel != null) {
            boolean A0P2 = indiaPaymentSettingsViewModel.A0P();
            indiaPaymentSettingsViewModel.A01.A0G(Boolean.valueOf(A0P2));
            if (A0P2) {
                indiaPaymentSettingsViewModel.A0C.BkM(new C199639gu(indiaPaymentSettingsViewModel));
            }
        }
        A1p();
    }

    public void A0g() {
        super.A0g();
        C196419ao r0 = this.A0N;
        r0.A01();
        r0.A02(this);
    }

    public void A0h() {
        super.A0h();
        this.A0N.A03(this);
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i != 1008) {
            if (i != 1009) {
                return;
            }
            if (i2 == -1 && intent != null && intent.getIntExtra("extra_remove_payment_account", 0) >= 1) {
                if (intent.getIntExtra("extra_remove_payment_account", 0) == 2) {
                    Intent A082 = AnonymousClass0x9.A08(A1D(), IndiaUpiPaymentsAccountSetupActivity.class);
                    A082.putExtra("extra_setup_mode", 2);
                    A0m(A082);
                    return;
                }
                C18300x5.A1A(this);
                return;
            }
        }
        this.A0u.A00(false);
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_scan_qr) {
            return super.A1B(menuItem);
        }
        A0m(AnonymousClass0x9.A08(A1D(), IndiaUpiQrCodeScanActivity.class));
        return true;
    }

    public final void A1o() {
        Intent A082 = AnonymousClass0x9.A08(A0R(), IndiaUpiQrTabActivity.class);
        if (this.A0c.A0C()) {
            A082.putExtra("extra_account_holder_name", A00(this.A17));
        }
        A0m(A082);
    }

    public final void A1q(String str, String str2, int i, int i2, boolean z, boolean z2) {
        Intent A082 = AnonymousClass0x9.A08(A1D(), IndiaUpiPaymentsAccountSetupActivity.class);
        A082.putExtra("extra_setup_mode", i);
        A082.putExtra("extra_payments_entry_type", i2);
        A082.putExtra("extra_is_first_payment_method", z);
        A082.putExtra("extra_skip_value_props_display", z2);
        if (this.A0D.A08(str2)) {
            A082.putExtra("extra_payment_method_type", "CREDIT");
            A082.putExtra("extra_referral_screen", "add_credit_card");
        }
        AnonymousClass5VI.A00(A082, str);
        A0m(A082);
    }

    public final void A1r(List list) {
        C003203q A0Q2 = A0Q();
        if (A0Q2 == null || A0Q2.isFinishing()) {
            Log.d("IndiaUpiPaymentSettingsFragment: onPaymentBusinessesProcessed - activity is finished stop showing recent merchants");
            return;
        }
        C105365Uq A062 = this.A0U.A06(A1D(), "payment-settings");
        StringBuilder A0o = AnonymousClass001.A0o();
        List list2 = list;
        AnonymousClass000.A1H("IndiaUpiPaymentSettingsFragment: onPaymentBusinessesProcessed List of paid merchants: ", A0o, list);
        AnonymousClass0x2.A18(A0o);
        boolean isEmpty = list.isEmpty();
        View view = this.A07;
        if (isEmpty) {
            view.setVisibility(8);
            this.A0F.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        this.A0F.setVisibility(0);
        int size = list.size();
        AnonymousClass303 r9 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        r9.A04("recent_merchant_displayed", true);
        r9.A02("number_merchant_displayed", size);
        this.A0M.BKE(r9, 0, (Integer) null, "payment_home", (String) null);
        int i = ((GridLayoutManager) this.A0J.getLayoutManager()).A00;
        this.A0K.setAdapter(new AnonymousClass95A(A0Q(), A062, this.A02, new AnonymousClass9OK(this, list), list2, i, this.A0S.A03));
    }

    public final void A1s(boolean z) {
        Intent A082 = AnonymousClass0x9.A08(A1D(), C192799Lp.A00(this.A02));
        A082.putExtra("extra_payments_entry_type", 5);
        A082.putExtra("extra_skip_value_props_display", true);
        A082.putExtra("extra_is_first_payment_method", false);
        if (z) {
            A082.putExtra("extra_payment_method_type", "CREDIT");
            A082.putExtra("extra_referral_screen", "add_credit_card");
        }
        startActivityForResult(A082, 1008);
    }

    public AnonymousClass4OR B4A() {
        JSONObject jSONObject;
        Context A1D = A1D();
        C620733j r6 = this.A01;
        String language = Resources.getSystem().getConfiguration().locale.getLanguage();
        ArrayList A0s = AnonymousClass001.A0s();
        String A0Q2 = this.A02.A0Q(3480);
        try {
            C626936e.A06(A0Q2);
            jSONObject = AnonymousClass0x9.A1H(A0Q2);
        } catch (JSONException e) {
            Log.e("Error converting abProps to Json", e);
            jSONObject = AnonymousClass0x9.A1G();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0m = AnonymousClass001.A0m(keys);
            boolean equals = language.equals(A0m);
            String A012 = C154327cz.A01(Locale.forLanguageTag(A0m));
            if (equals) {
                A0s.add(0, new C148187Hi(A012, A0m));
            } else {
                A0s.add(new C148187Hi(A012, A0m));
            }
        }
        return new C1906399f(A1D, r6, A0s);
    }

    public void BXr(C166587yw r3) {
        startActivityForResult(C1899593h.A06(A1D(), r3, IndiaUpiBankAccountDetailsActivity.class), 1009);
    }

    public void Brm(List list) {
        String str;
        super.Brm(list);
        if (A16() && A0Q() != null) {
            AnonymousClass94L r3 = new AnonymousClass94L(A0G());
            r3.setBackgroundColor(C08310eF.A09(this).getColor(AnonymousClass5Yj.A01(A1D())));
            C18310x6.A15(r3);
            C204249p3.A02(r3.A05, this, 69);
            C204249p3.A02(r3.A04, this, 70);
            this.A0D.removeAllViews();
            if (this.A0c.A0C() || this.A0C.A0P()) {
                List list2 = this.A0s.A00;
                if (list2 == null || list2.isEmpty()) {
                    str = null;
                } else {
                    str = A00(list2);
                }
                String A002 = C196629bS.A00(this.A0C);
                if (TextUtils.isEmpty(str)) {
                    str = this.A09.A03();
                    this.A0k.A09((AnonymousClass4EY) null, AnonymousClass9U4.A07(this.A0n));
                }
                boolean z = false;
                if (this.A02.A0X(1458)) {
                    String A0Q2 = this.A02.A0Q(1459);
                    String A072 = this.A0C.A07();
                    if (!TextUtils.isEmpty(A0Q2) && !TextUtils.isEmpty(A072) && A0Q2.contains(this.A0C.A07())) {
                        z = true;
                    }
                }
                C56972sr r0 = this.A0M;
                r0.A0P();
                AnonymousClass1RR r02 = r0.A01;
                if (z) {
                    r3.A00(r02, str, A002);
                    ImageView imageView = r3.A01;
                    imageView.setVisibility(0);
                    imageView.setColorFilter(r3.getResources().getColor(R.color.f5nameremoved));
                    TypedValue typedValue = new TypedValue();
                    r3.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
                    LinearLayout linearLayout = r3.A03;
                    linearLayout.setBackgroundResource(typedValue.resourceId);
                    linearLayout.setOnClickListener(new C204439pM(3, str, this));
                } else {
                    r3.A00(r02, str, A002);
                    r3.A03.setOnLongClickListener(new C204449pN(0, A002, this));
                }
            }
            this.A0D.addView(r3);
            this.A0D.setVisibility(0);
            this.A06.setVisibility(0);
        }
    }

    public void BgE() {
    }

    public boolean BoN() {
        return true;
    }
}
