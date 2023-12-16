package com.whatsapp.registration.directmigration;

import X.AnonymousClass4SG;
import X.C103535Ni;
import X.C107695bk;
import X.C49632gq;
import X.C64333Db;
import X.C86604Kt;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;

public class RequestPermissionFromSisterAppActivity extends RequestPermissionActivity {
    public boolean A00;

    public void A6E(String str, Bundle bundle) {
        super.A6E(A6D(bundle, true), bundle);
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            this.A04 = C64333Db.A8y(A2Y);
            C107695bk r1 = A2Y.A00;
            this.A07 = AnonymousClass4SG.A2q(r1);
            this.A01 = C86604Kt.A0T(A2Y);
            this.A02 = C64333Db.A2o(A2Y);
            this.A06 = (C49632gq) r1.A2E.get();
            this.A03 = C64333Db.A2r(A2Y);
            this.A04 = C64333Db.A2s(A2Y);
            this.A00 = (C103535Ni) r1.A0T.get();
            this.A05 = C64333Db.A4B(A2Y);
        }
    }

    public RequestPermissionFromSisterAppActivity(int i) {
        this.A00 = false;
        C86604Kt.A1K(this, 90);
    }

    public RequestPermissionFromSisterAppActivity() {
        this(0);
    }
}
