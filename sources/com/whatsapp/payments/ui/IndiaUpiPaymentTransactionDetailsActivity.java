package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass2CY;
import X.AnonymousClass2CZ;
import X.AnonymousClass4L0;
import X.AnonymousClass5V0;
import X.AnonymousClass94y;
import X.AnonymousClass97V;
import X.AnonymousClass9EX;
import X.AnonymousClass9RH;
import X.AnonymousClass9W6;
import X.AnonymousClass9cV;
import X.C05570Ua;
import X.C08310eF;
import X.C105655Vw;
import X.C107335b8;
import X.C107695bk;
import X.C134246ig;
import X.C160757oG;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C1899593h;
import X.C191219Eb;
import X.C191289Ei;
import X.C191309Ek;
import X.C191329Em;
import X.C191339En;
import X.C191399Et;
import X.C191589Fm;
import X.C191669Fv;
import X.C193089Nc;
import X.C19340zH;
import X.C194309Sj;
import X.C197109ca;
import X.C202119lP;
import X.C204019og;
import X.C204219p0;
import X.C204759ps;
import X.C204909q7;
import X.C64333Db;
import X.C84074Ax;
import X.C86604Kt;
import X.C86614Ku;
import X.C88834as;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import java.util.GregorianCalendar;

public class IndiaUpiPaymentTransactionDetailsActivity extends PaymentTransactionDetailsListActivity implements C84074Ax, C202119lP {
    public AnonymousClass2CY A00;
    public AnonymousClass2CZ A01;
    public AnonymousClass9W6 A02;
    public C194309Sj A03;
    public AnonymousClass9RH A04;
    public C197109ca A05;
    public IndiaUpiDobPickerBottomSheet A06;
    public C191669Fv A07;
    public C105655Vw A08;
    public boolean A09;
    public final C134246ig A0A;
    public final C160757oG A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0198, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0238, code lost:
        r1.A0T(r0);
        r1.A0Y((android.content.DialogInterface.OnClickListener) null, com.whatsapp.R.string.f11nameremoved);
        r1.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0244, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A78(X.AnonymousClass9QJ r14) {
        /*
            r13 = this;
            r5 = r14
            X.34w r6 = r14.A05
            if (r6 == 0) goto L_0x000f
            X.6ig r1 = r13.A0A
            boolean r0 = r6.A0Q
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
        L_0x000f:
            int r4 = r14.A00
            r0 = 4
            java.lang.String r9 = "payment_transaction_details"
            r2 = 1
            if (r4 == r0) goto L_0x007f
            r0 = 9
            if (r4 == r0) goto L_0x005f
            r0 = 10
            if (r4 != r0) goto L_0x002c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.A79(r1, r0)
        L_0x002c:
            boolean r0 = r14 instanceof X.C191619Fq
            r1 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0042
            r12 = r5
            X.9Fq r12 = (X.C191619Fq) r12
            r11 = 4
            r10 = 0
            r6 = 0
            switch(r4) {
                case 101: goto L_0x0098;
                case 102: goto L_0x00f4;
                case 103: goto L_0x0138;
                case 104: goto L_0x003e;
                case 105: goto L_0x0156;
                case 106: goto L_0x018f;
                case 107: goto L_0x019c;
                case 108: goto L_0x01aa;
                case 109: goto L_0x01b9;
                case 110: goto L_0x01ca;
                case 111: goto L_0x01db;
                case 112: goto L_0x01e4;
                case 113: goto L_0x01fc;
                case 114: goto L_0x022b;
                case 115: goto L_0x0245;
                default: goto L_0x003e;
            }
        L_0x003e:
            super.A78(r14)
            return
        L_0x0042:
            if (r4 != r1) goto L_0x003e
            X.7yw r1 = r14.A04
            X.C626936e.A06(r1)
            X.6hm r1 = (X.C133686hm) r1
            if (r1 == 0) goto L_0x005d
            X.6hx r0 = r1.A08
            if (r0 == 0) goto L_0x005d
            X.99H r0 = (X.AnonymousClass99H) r0
            java.lang.String r0 = r0.A0B
        L_0x0055:
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0C(r13, r1, r0, r2)
            r13.startActivity(r0)
            return
        L_0x005d:
            r0 = 0
            goto L_0x0055
        L_0x005f:
            X.6ig r1 = r13.A0A
            X.C1899593h.A1B(r1, r2)
            r0 = 59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A0b = r9
            java.lang.String r0 = r13.A0b
            r1.A0a = r0
            if (r6 == 0) goto L_0x0092
            boolean r0 = X.AnonymousClass9V7.A00(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A06 = r0
            goto L_0x0092
        L_0x007f:
            X.6ig r1 = r13.A0A
            X.C1899593h.A1B(r1, r2)
            r0 = 60
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A0b = r9
            java.lang.String r0 = r13.A0b
            r1.A0a = r0
        L_0x0092:
            X.9ca r0 = r13.A05
            r0.BKA(r1)
            goto L_0x002c
        L_0x0098:
            X.7oG r1 = r13.A0B
            java.lang.String r0 = "return back to caller without getting the finalized status"
            r1.A06(r0)
            java.lang.String r9 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.String r7 = r12.A05
            java.lang.String r6 = r12.A04
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String[] r5 = new java.lang.String[r11]
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "txnId="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r1)
            r5[r10] = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "txnRef="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r8, r1)
            r5[r2] = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Status="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r7, r1)
            r0 = 2
            r5[r0] = r1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "responseCode="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r6, r1)
            r0 = 3
            r5[r0] = r1
            java.util.List r1 = java.util.Arrays.asList(r5)
            java.lang.String r0 = "&"
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = "response"
            r4.putExtra(r0, r1)
            r0 = -1
            r13.setResult(r0, r4)
            goto L_0x0198
        L_0x00f4:
            X.5Vw r7 = r13.A08
            java.lang.String r0 = r12.A07
            android.net.Uri r5 = android.net.Uri.parse(r0)
            X.2oU r0 = r7.A01
            android.content.Context r8 = r0.A00
            r4 = 2131890423(0x7f1210f7, float:1.9415537E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = X.C105655Vw.A00(r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r8, r0, r1, r10, r4)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            android.text.util.Linkify.addLinks(r1, r2)
            r0 = 2132082701(0x7f15000d, float:1.9805524E38)
            X.0zH r4 = X.AnonymousClass5V0.A01(r13, r0)
            r4.A0g(r1)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r4.A0W(r6, r0)
            r1 = 2131887053(0x7f1203cd, float:1.9408702E38)
            X.9p7 r0 = new X.9p7
            r0.<init>(r13, r5, r7, r2)
            r4.A0Y(r0, r1)
            r4.A0S()
            return
        L_0x0138:
            X.34w r0 = r12.A05
            X.C626936e.A06(r0)
            X.34w r1 = r12.A05
            boolean r0 = r12.A0I
            if (r0 == 0) goto L_0x0145
            r11 = 9
        L_0x0145:
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0C(r13, r1, r9, r11)
            r13.startActivity(r0)
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.A79(r7, r0)
            return
        L_0x0156:
            X.9Zz r0 = r13.A0H
            android.content.Intent r4 = r0.A01(r13, r10, r10)
            X.7yt r1 = r12.A00
            java.lang.String r0 = "extra_payment_handle"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_payment_handle_id"
            java.lang.String r0 = r12.A0E
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_payee_name"
            X.7yt r0 = r12.A07
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_token"
            java.lang.String r0 = r12.A02
            r4.putExtra(r1, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "send_again_button"
            r4.putExtra(r1, r0)
            java.lang.String r0 = "extra_mapper_alias_resolved"
            r4.putExtra(r0, r2)
            java.lang.String r1 = "extra_merchant_code"
            java.lang.String r0 = r12.A0B
            r4.putExtra(r1, r0)
            r13.A6T(r4, r10)
            return
        L_0x018f:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r13, r0)
            r13.startActivity(r0)
        L_0x0198:
            r13.finish()
            return
        L_0x019c:
            r13.A7B()
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r0 = new com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment
            r0.<init>()
            r0.A01 = r13
            r13.Boo(r0)
            return
        L_0x01aa:
            X.0zH r1 = X.AnonymousClass5V0.A00(r13)
            r0 = 2131894873(0x7f122259, float:1.9424563E38)
            r1.A0U(r0)
            r0 = 2131894880(0x7f122260, float:1.9424577E38)
            goto L_0x0238
        L_0x01b9:
            r13.A7B()
            X.0zH r1 = X.AnonymousClass5V0.A00(r13)
            r0 = 2131894881(0x7f122261, float:1.942458E38)
            r1.A0U(r0)
            r0 = 2131894879(0x7f12225f, float:1.9424575E38)
            goto L_0x0238
        L_0x01ca:
            r13.A7B()
            X.0zH r1 = X.AnonymousClass5V0.A00(r13)
            r0 = 2131894871(0x7f122257, float:1.942456E38)
            r1.A0U(r0)
            r0 = 2131894872(0x7f122258, float:1.9424561E38)
            goto L_0x0238
        L_0x01db:
            X.9Fv r0 = r13.A07
            r0.A0d(r2)
            r0.A0c(r10)
            return
        L_0x01e4:
            X.34w r0 = r12.A05
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0C(r13, r0, r9, r1)
            r13.startActivity(r0)
            X.9ca r6 = r13.A05
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = r13.A0b
            r11 = r2
            r6.BKC(r7, r8, r9, r10, r11)
            return
        L_0x01fc:
            java.lang.Class<com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity> r0 = com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r13, r0)
            java.lang.String r0 = "extra_disable_search"
            r4.putExtra(r0, r2)
            X.38i r1 = r12.A01
            if (r1 == 0) goto L_0x0225
            java.lang.String r0 = "extra_predefined_search_filter"
            r4.putExtra(r0, r1)
        L_0x0210:
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r4.putExtra(r0, r11)
            r0 = 2131892167(0x7f1217c7, float:1.9419075E38)
            java.lang.String r1 = r13.getString(r0)
            java.lang.String r0 = "extra_list_screen_configurable_title"
            r4.putExtra(r0, r1)
            r13.startActivity(r4)
            return
        L_0x0225:
            java.lang.String r0 = "extra_show_empty_list_screen"
            r4.putExtra(r0, r2)
            goto L_0x0210
        L_0x022b:
            X.0zH r1 = X.AnonymousClass5V0.A00(r13)
            r0 = 2131891982(0x7f12170e, float:1.94187E38)
            r1.A0U(r0)
            r0 = 2131891981(0x7f12170d, float:1.9418697E38)
        L_0x0238:
            r1.A0T(r0)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1.A0Y(r6, r0)
            r1.A0S()
            return
        L_0x0245:
            X.7yw r1 = r14.A04
            if (r1 == 0) goto L_0x025d
            java.lang.String r0 = r1.A0A
            X.7yt r6 = r1.A09
        L_0x024d:
            com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet r2 = X.AnonymousClass285.A00(r6, r0, r10, r2)
            r13.A06 = r2
            X.0df r1 = r13.getSupportFragmentManager()
            java.lang.String r0 = "IndiaUpiDobPickerBottomSheet"
            r2.A1O(r1, r0)
            return
        L_0x025d:
            r0 = r6
            goto L_0x024d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity.A78(X.9QJ):void");
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r3 = A0I.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r2 = r3.A00;
            C1899593h.A0z(r3, r2, this, C1899593h.A0W(r3, r2, this));
            AnonymousClass97V.A0Y(r3, r2, this);
            AnonymousClass97V.A0X(r3, r2, this);
            this.A0M = C1899593h.A0I(r3);
            AnonymousClass97V.A0L(A0I, r3, r2, this, r3.AMe.get());
            AnonymousClass97V.A0C(A0I, r3, r2, this);
            this.A02 = (AnonymousClass9W6) r3.AHa.get();
            this.A08 = (C105655Vw) r2.A4I.get();
            this.A05 = C1899593h.A0L(r3);
            this.A03 = C1899593h.A0J(r2);
            this.A04 = (AnonymousClass9RH) r2.A8s.get();
            this.A00 = (AnonymousClass2CY) A0I.A3h.get();
            this.A01 = (AnonymousClass2CZ) A0I.A3i.get();
        }
    }

    public AnonymousClass94y A76(Bundle bundle) {
        AnonymousClass0XL A0F;
        Class cls;
        if (bundle == null) {
            bundle = C86614Ku.A0D(this);
        }
        if (bundle == null || !bundle.getBoolean("extra_new_mandate_transaction", false)) {
            A0F = AnonymousClass4L0.A0F(new C204759ps(bundle, 2, this), this);
            cls = C191669Fv.class;
        } else {
            A0F = AnonymousClass4L0.A0F(new C204759ps(bundle, 1, this), this);
            cls = C191589Fm.class;
        }
        C191669Fv r0 = (C191669Fv) A0F.A01(cls);
        this.A07 = r0;
        return r0;
    }

    public final void A7B() {
        this.A05.BKB(AnonymousClass001.A0f(), 138, "payment_transaction_details", (String) null);
    }

    public void BQf(long j, String str) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        this.A03.A00(new AnonymousClass9cV(this), "kyc-recollect", str, gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
    }

    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(false);
        C204219p0.A01(A002, this, 53, R.string.f11nameremoved);
        A002.A0U(R.string.f11nameremoved);
        return A002.create();
    }

    public void onNewIntent(Intent intent) {
        C191669Fv r2 = this.A07;
        if (r2 != null) {
            r2.A01 = intent.getBooleanExtra("extra_return_after_completion", false);
        }
        super.onNewIntent(intent);
    }

    public IndiaUpiPaymentTransactionDetailsActivity(int i) {
        this.A09 = false;
        C204019og.A00(this, 76);
    }

    public void A5d(C08310eF r3) {
        super.A5d(r3);
        if (r3 instanceof ProgressDialogFragment) {
            ((ProgressDialogFragment) r3).A00 = new C204909q7(this, 1);
        }
    }

    public C05570Ua A74(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1000:
                return new C191289Ei(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 1001:
                View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                C107335b8.A0E(AnonymousClass0x9.A0F(A0R, R.id.payment_empty_icon), C18290x4.A0G(viewGroup).getColor(R.color.f5nameremoved));
                return new C191329Em(A0R);
            case 1004:
                return new C191399Et(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 1005:
                return new C191219Eb(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 1006:
                return new AnonymousClass9EX(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 1007:
                return new C191309Ek(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 1008:
                return new C191339En(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
            default:
                return super.A74(viewGroup, i);
        }
    }

    public void onBackPressed() {
        Integer A0f = AnonymousClass001.A0f();
        A79(A0f, A0f);
        this.A07.A0Q(new C193089Nc(301));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A07.A0Q(new C193089Nc(2));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (C86614Ku.A0D(this) != null) {
            bundle.putAll(C86614Ku.A0D(this));
        }
        super.onSaveInstanceState(bundle);
    }

    public IndiaUpiPaymentTransactionDetailsActivity() {
        this(0);
        this.A0B = C160757oG.A00("IndiaUpiPaymentTransactionDetailsActivity", "payment-settings", "IN");
        this.A0A = new C134246ig();
    }
}
