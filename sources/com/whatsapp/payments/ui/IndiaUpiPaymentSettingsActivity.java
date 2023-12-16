package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass3DZ;
import X.AnonymousClass5V0;
import X.AnonymousClass6C7;
import X.AnonymousClass99N;
import X.AnonymousClass9C6;
import X.AnonymousClass9R6;
import X.AnonymousClass9U1;
import X.AnonymousClass9VH;
import X.C107695bk;
import X.C1899593h;
import X.C19340zH;
import X.C195229Ws;
import X.C204019og;
import X.C204219p0;
import X.C46092b4;
import X.C64333Db;
import X.C84064Aw;
import X.C86614Ku;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class IndiaUpiPaymentSettingsActivity extends AnonymousClass9C6 {
    public AnonymousClass9VH A00;
    public AnonymousClass9U1 A01;
    public AnonymousClass99N A02;
    public C46092b4 A03;
    public PaymentBottomSheet A04;
    public boolean A05;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A00 = C1899593h.A0H(A002);
            this.A00 = (AnonymousClass9VH) r1.A0z.get();
            this.A02 = (AnonymousClass99N) A002.APg.get();
            this.A01 = (AnonymousClass9U1) A002.AHX.get();
            this.A03 = (C46092b4) r1.A2O.get();
        }
    }

    public Dialog onCreateDialog(int i) {
        C19340zH A002;
        PaymentSettingsFragment paymentSettingsFragment = this.A01;
        if (paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment) {
            if (i == 100) {
                A002 = AnonymousClass5V0.A00(paymentSettingsFragment.A0R());
                A002.A0T(R.string.f11nameremoved);
                A002.A0i(false);
                C204219p0.A01(A002, paymentSettingsFragment, 50, R.string.f11nameremoved);
                A002.A0U(R.string.f11nameremoved);
            } else if (i == 101) {
                A002 = AnonymousClass5V0.A00(paymentSettingsFragment.A0R());
                A002.A0T(R.string.f11nameremoved);
                A002.A0i(true);
                C204219p0.A01(A002, paymentSettingsFragment, 51, R.string.f11nameremoved);
            }
            AnonymousClass043 create = A002.create();
            if (create != null) {
                return create;
            }
        }
        return super.onCreateDialog(i);
    }

    public IndiaUpiPaymentSettingsActivity(int i) {
        this.A05 = false;
        C204019og.A00(this, 75);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03.A00((C84064Aw) null);
        if (this.A00.A02.A0X(698)) {
            this.A02.A0E();
        }
        AnonymousClass6C7.A0y(this);
        if (getIntent().getBooleanExtra("extra_open_transaction_confirmation_fragment", false) && bundle == null) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            this.A04 = paymentBottomSheet;
            Bundle A08 = AnonymousClass002.A08();
            IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment = new IndiaUpiPaymentTransactionConfirmationFragment();
            indiaUpiPaymentTransactionConfirmationFragment.A0u(A08);
            indiaUpiPaymentTransactionConfirmationFragment.A0u(C86614Ku.A0D(this));
            indiaUpiPaymentTransactionConfirmationFragment.A0A = new AnonymousClass9R6(this, paymentBottomSheet);
            paymentBottomSheet.A02 = indiaUpiPaymentTransactionConfirmationFragment;
            Bon(paymentBottomSheet, "IndiaUpiPaymentTransactionConfirmationFragment");
            getIntent().putExtra("extra_open_transaction_confirmation_fragment", false);
        }
        this.A00.A01(new C195229Ws(this, 3));
    }

    public void onResume() {
        super.onResume();
        if (this.A00.A02()) {
            AnonymousClass9VH.A00(this);
        }
    }

    public IndiaUpiPaymentSettingsActivity() {
        this(0);
        this.A04 = new PaymentBottomSheet();
    }
}
