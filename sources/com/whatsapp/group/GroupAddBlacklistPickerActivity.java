package com.whatsapp.group;

import X.AnonymousClass0x9;
import X.AnonymousClass1kH;
import X.AnonymousClass4D7;
import X.AnonymousClass4SG;
import X.C107695bk;
import X.C64333Db;
import X.C86604Kt;
import X.C89104bW;
import android.os.Bundle;

public class GroupAddBlacklistPickerActivity extends C89104bW implements AnonymousClass4D7 {
    public AnonymousClass1kH A00;
    public boolean A01;
    public boolean A02;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            AnonymousClass4SG.A3D(this, A2Y);
            this.A00 = (AnonymousClass1kH) r1.A5m.get();
        }
    }

    public void Ayg() {
    }

    public GroupAddBlacklistPickerActivity(int i) {
        this.A01 = false;
        C86604Kt.A1K(this, 43);
    }

    public void Azf() {
        AnonymousClass4SG.A3e(this);
        C86604Kt.A1M(this, this.A00.A01(this.A0V), 228);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = AnonymousClass0x9.A1N(getIntent(), "was_nobody");
    }

    public GroupAddBlacklistPickerActivity() {
        this(0);
    }
}
