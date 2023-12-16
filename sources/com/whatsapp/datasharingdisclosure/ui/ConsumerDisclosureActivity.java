package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1YF;
import X.AnonymousClass214;
import X.AnonymousClass26H;
import X.AnonymousClass3L5;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.AnonymousClass66R;
import X.C08240dc;
import X.C107695bk;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C58272uz;
import X.C64333Db;
import X.C77823u1;
import X.C89644eZ;
import X.C95814uZ;
import android.os.Bundle;
import com.whatsapp.R;

public final class ConsumerDisclosureActivity extends C89644eZ {
    public C58272uz A00;
    public boolean A01;
    public final AnonymousClass66R A02;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db r1 = C18280x3.A0I(this).A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A00 = new C58272uz((AnonymousClass4FV) r1.ASY.get());
        }
    }

    public ConsumerDisclosureActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 56);
    }

    public void onBackPressed() {
        super.onBackPressed();
        C58272uz r0 = this.A00;
        if (r0 != null) {
            AnonymousClass4FV r2 = r0.A00;
            AnonymousClass1YF r1 = new AnonymousClass1YF();
            r1.A01 = AnonymousClass001.A0f();
            AnonymousClass1YF.A00(r2, r1, 4);
            return;
        }
        throw C18270x1.A0S("dataSharingCtwaDisclosureLogger");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        if (bundle == null) {
            C58272uz r0 = this.A00;
            if (r0 != null) {
                AnonymousClass4FV r2 = r0.A00;
                AnonymousClass1YF r1 = new AnonymousClass1YF();
                r1.A01 = AnonymousClass001.A0f();
                AnonymousClass1YF.A00(r2, r1, 0);
                ConsumerDisclosureFragment A002 = AnonymousClass26H.A00((C95814uZ) null, AnonymousClass214.BLOCKING_DISCLOSURE, (Boolean) null);
                A002.A04 = new AnonymousClass3L5(this);
                C08240dc A0J = AnonymousClass0x2.A0J(this);
                A0J.A0A(A002, R.id.fragment_container);
                A0J.A03();
                return;
            }
            throw C18270x1.A0S("dataSharingCtwaDisclosureLogger");
        }
    }

    public ConsumerDisclosureActivity() {
        this(0);
        this.A02 = C154517dI.A01(new C77823u1(this));
    }
}
