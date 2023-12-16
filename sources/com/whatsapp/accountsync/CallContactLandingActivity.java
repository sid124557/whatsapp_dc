package com.whatsapp.accountsync;

import X.AnonymousClass0N6;
import X.AnonymousClass1FB;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.C107695bk;
import X.C1230066r;
import X.C64333Db;
import X.C88744aj;

public class CallContactLandingActivity extends ProfileActivity {
    public C1230066r A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = r0.ALf();
            this.A00 = C88744aj.A00;
            this.A02 = (AnonymousClass0N6) A002.A1u.get();
            this.A04 = C64333Db.A26(A002);
            AnonymousClass1FB.A1g(A002, this, C64333Db.A5A(A002));
            this.A00 = (C1230066r) A002.A4Q.get();
        }
    }

    public CallContactLandingActivity(int i) {
        this.A01 = false;
        AnonymousClass1Hf.A2D(this, 5);
    }

    public CallContactLandingActivity() {
        this(0);
    }
}
