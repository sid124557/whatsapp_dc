package com.whatsapp.businessupsell;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1Y2;
import X.AnonymousClass2X5;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18280x3;
import X.C18300x5;
import X.C64333Db;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import com.whatsapp.R;

public class BusinessAppEducation extends C89644eZ {
    public AnonymousClass4FV A00;
    public AnonymousClass2X5 A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A00 = C64333Db.A4H(r1);
            this.A01 = A0I.ADJ();
        }
    }

    public final void A74(int i) {
        AnonymousClass1Y2 r1 = new AnonymousClass1Y2();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = 12;
        this.A00.BhB(r1);
    }

    public BusinessAppEducation(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 21);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C18300x5.A18(findViewById(R.id.close), this, 21);
        C18300x5.A18(findViewById(R.id.install_smb_google_play), this, 22);
        A74(1);
    }

    public BusinessAppEducation() {
        this(0);
    }
}
