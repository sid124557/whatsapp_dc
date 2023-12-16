package com.whatsapp.privacy.checkup;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1kO;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C55602qc;
import X.C55912r7;
import X.C64333Db;

public final class PrivacyCheckupHomeActivity extends AnonymousClass1kO {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = (C55602qc) A002.ANB.get();
            this.A00 = (C55912r7) A002.ARR.get();
        }
    }

    public PrivacyCheckupHomeActivity(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 87);
    }

    public PrivacyCheckupHomeActivity() {
        this(0);
    }
}
