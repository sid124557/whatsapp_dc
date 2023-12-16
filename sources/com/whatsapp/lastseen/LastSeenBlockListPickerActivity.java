package com.whatsapp.lastseen;

import X.AnonymousClass1kI;
import X.AnonymousClass4SG;
import X.C107695bk;
import X.C64333Db;
import X.C86604Kt;
import X.C88834as;
import X.C89104bW;

public class LastSeenBlockListPickerActivity extends C89104bW {
    public AnonymousClass1kI A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3D(this, r2);
            this.A00 = A2X.ACy();
        }
    }

    public LastSeenBlockListPickerActivity(int i) {
        this.A01 = false;
        C86604Kt.A1K(this, 53);
    }

    public LastSeenBlockListPickerActivity() {
        this(0);
    }
}
