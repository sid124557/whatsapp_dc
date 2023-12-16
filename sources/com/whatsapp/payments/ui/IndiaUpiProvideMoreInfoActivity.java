package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass97T;
import X.AnonymousClass9Bb;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C204249p3;
import X.C64333Db;
import X.C88834as;
import android.os.Bundle;
import com.whatsapp.R;

public class IndiaUpiProvideMoreInfoActivity extends AnonymousClass9Bb {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
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
            this.A00 = C1899593h.A09(r2);
            this.A02 = r1.AN7();
        }
    }

    public IndiaUpiProvideMoreInfoActivity(int i) {
        this.A00 = false;
        C204019og.A00(this, 86);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A0Y = AnonymousClass97T.A0Y(this);
        if (A0Y != null) {
            C1899593h.A0o(A0Y, getString(R.string.f11nameremoved));
        }
        C204249p3.A02(findViewById(R.id.account_recovery_info_continue), this, 90);
    }

    public IndiaUpiProvideMoreInfoActivity() {
        this(0);
    }
}
