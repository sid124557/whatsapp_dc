package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0RP;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass66R;
import X.AnonymousClass6CA;
import X.AnonymousClass8P7;
import X.AnonymousClass8WW;
import X.AnonymousClass97l;
import X.AnonymousClass9Df;
import X.AnonymousClass9U4;
import X.C107335b8;
import X.C162457s7;
import X.C175578Yx;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C1891290c;
import X.C1897492m;
import X.C1907099n;
import X.C71363bz;
import X.C86604Kt;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

public final class BusinessHubActivity extends AnonymousClass97l {
    public ViewGroup A00;
    public ViewGroup A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C1907099n A0A;
    public AnonymousClass9U4 A0B;
    public AnonymousClass9Df A0C;
    public final AnonymousClass66R A0D = AnonymousClass8P7.A00(new AnonymousClass8WW(this));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setSupportActionBar((Toolbar) findViewById(R.id.pay_service_toolbar));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0J((CharSequence) null);
            supportActionBar.A0N(true);
            int A042 = AnonymousClass0Y8.A04(this, R.color.f5nameremoved);
            Drawable A002 = AnonymousClass0RP.A00(this, R.drawable.ic_close);
            if (A002 != null) {
                supportActionBar.A0E(C107335b8.A0B(A002, A042));
            }
        }
        View findViewById = findViewById(R.id.payment_partner_container);
        ImageView A0J = C86604Kt.A0J(findViewById, R.id.payment_business_icon);
        C162457s7.A0J(A0J, 0);
        this.A02 = A0J;
        TextView A0I = AnonymousClass0x2.A0I(findViewById, R.id.business_account_name);
        C162457s7.A0J(A0I, 0);
        this.A04 = A0I;
        TextView A0I2 = AnonymousClass0x2.A0I(findViewById, R.id.business_account_status);
        C162457s7.A0J(A0I2, 0);
        this.A05 = A0I2;
        ViewGroup viewGroup = (ViewGroup) C18280x3.A0E(findViewById, R.id.view_dashboard_row);
        C162457s7.A0J(viewGroup, 0);
        this.A01 = viewGroup;
        TextView A0I3 = AnonymousClass0x2.A0I(findViewById, R.id.payment_partner_dashboard);
        C162457s7.A0J(A0I3, 0);
        this.A06 = A0I3;
        View findViewById2 = findViewById(R.id.payout_method_container);
        ImageView A0J2 = C86604Kt.A0J(findViewById2, R.id.payout_bank_icon);
        C162457s7.A0J(A0J2, 0);
        this.A03 = A0J2;
        TextView A0I4 = AnonymousClass0x2.A0I(findViewById2, R.id.payout_bank_name);
        C162457s7.A0J(A0I4, 0);
        this.A07 = A0I4;
        TextView A0I5 = AnonymousClass0x2.A0I(findViewById2, R.id.payout_bank_status);
        C162457s7.A0J(A0I5, 0);
        this.A08 = A0I5;
        int i = 8;
        C18280x3.A0E(findViewById2, R.id.warning_container).setVisibility(8);
        View A0E = C18280x3.A0E(findViewById(R.id.partner_support_container), R.id.request_dyi_report_action);
        C18310x6.A0L(this, R.id.request_payment_account_info_text).setText(R.string.f11nameremoved);
        C1891290c.A00(A0E, this, 6);
        int A043 = AnonymousClass0Y8.A04(this, R.color.f5nameremoved);
        C107335b8.A0E((ImageView) findViewById(R.id.request_payment_account_info_icon), A043);
        C1907099n r0 = this.A0A;
        if (r0 != null) {
            if (!r0.A02.A0X(4781)) {
                i = 0;
            }
            A0E.setVisibility(i);
            ViewGroup viewGroup2 = (ViewGroup) C18290x4.A0N(this, R.id.delete_payments_account_action);
            C162457s7.A0J(viewGroup2, 0);
            this.A00 = viewGroup2;
            C107335b8.A0E((ImageView) viewGroup2.findViewById(R.id.delete_payments_account_icon), A043);
            ViewGroup viewGroup3 = this.A00;
            if (viewGroup3 != null) {
                TextView A0I6 = AnonymousClass0x2.A0I(viewGroup3, R.id.delete_payments_account_label);
                C162457s7.A0J(A0I6, 0);
                this.A09 = A0I6;
                C1897492m r1 = new C1897492m(this, 304);
                AnonymousClass66R r3 = this.A0D;
                AnonymousClass6CA.A0J(((PaymentMerchantAccountViewModel) r3.getValue()).A09).A0B(this, r1);
                C86604Kt.A1N(this, AnonymousClass6CA.A0J(((PaymentMerchantAccountViewModel) r3.getValue()).A0B), new C175578Yx(this), 305);
                PaymentMerchantAccountViewModel paymentMerchantAccountViewModel = (PaymentMerchantAccountViewModel) r3.getValue();
                paymentMerchantAccountViewModel.A08.BkP(new C71363bz(1, paymentMerchantAccountViewModel, true));
                return;
            }
            throw C18270x1.A0S("removeAccountRow");
        }
        throw C18270x1.A0S("paymentsGatingManager");
    }
}
