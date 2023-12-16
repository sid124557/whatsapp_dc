package com.whatsapp.registration;

import X.AnonymousClass0R8;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C116985rC;
import X.C18290x4;
import X.C64333Db;
import X.C88744aj;
import X.C88834as;
import X.C89634eX;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public final class NotifyContactsSelector extends C89634eX {
    public C116985rC A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2X, r2, this, r2.A6O.get());
            this.A00 = C88744aj.A00;
        }
    }

    public void A7K(int i) {
        if (i <= 0) {
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0A(R.string.f11nameremoved);
                return;
            }
            throw C18290x4.A0Y();
        }
        super.A7K(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("NotifyContactsSelector/permissions denied");
            finish();
        }
    }

    public NotifyContactsSelector(int i) {
        this.A01 = false;
        AnonymousClass68W.A00(this, 82);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && !this.A0A.A00()) {
            RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
        }
    }

    public NotifyContactsSelector() {
        this(0);
    }
}
