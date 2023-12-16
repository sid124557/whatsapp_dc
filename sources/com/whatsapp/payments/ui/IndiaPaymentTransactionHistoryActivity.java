package com.whatsapp.payments.ui;

import X.AnonymousClass3DZ;
import X.AnonymousClass97Z;
import X.C107695bk;
import X.C1899593h;
import X.C204019og;
import X.C64333Db;

public class IndiaPaymentTransactionHistoryActivity extends PaymentTransactionHistoryActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            AnonymousClass97Z.A0C(A002, r1, this);
        }
    }

    public IndiaPaymentTransactionHistoryActivity(int i) {
        this.A00 = false;
        C204019og.A00(this, 45);
    }

    public IndiaPaymentTransactionHistoryActivity() {
        this(0);
    }
}
