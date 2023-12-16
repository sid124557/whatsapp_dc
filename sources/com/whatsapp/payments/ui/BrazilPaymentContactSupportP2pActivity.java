package com.whatsapp.payments.ui;

import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1905197d;
import X.C191569Fk;
import X.C204019og;
import X.C205049qL;
import X.C64333Db;
import X.C88834as;

public class BrazilPaymentContactSupportP2pActivity extends C1905197d {
    public C191569Fk A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            this.A00 = (C191569Fk) A0I.A0B.get();
        }
    }

    public BrazilPaymentContactSupportP2pActivity(int i) {
        this.A01 = false;
        C204019og.A00(this, 30);
    }

    public void A75() {
        super.A75();
        C205049qL.A02(this, this.A00.A00, 14);
    }

    public BrazilPaymentContactSupportP2pActivity() {
        this(0);
    }
}
