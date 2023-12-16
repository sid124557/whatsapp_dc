package com.whatsapp.blockinguserinteraction;

import X.AnonymousClass08M;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.C55442qM;
import X.C625835r;
import X.C64333Db;
import X.C84474Cm;
import X.C89654ea;
import android.os.Bundle;
import com.whatsapp.R;

public class BlockingUserInteractionActivity extends C89654ea {
    public C84474Cm A00;
    public C625835r A01;
    public boolean A02;

    public void onCreate(Bundle bundle) {
        AnonymousClass4K2 r2;
        AnonymousClass08M r0;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("blocking_type", 0);
        if (intExtra == 0) {
            setContentView((int) R.layout.f8nameremoved);
            C625835r r1 = this.A01;
            r2 = new AnonymousClass4K2(this, 7);
            r0 = r1.A03;
        } else if (intExtra == 1) {
            setTitle(R.string.f11nameremoved);
            setContentView((int) R.layout.f8nameremoved);
            C84474Cm r12 = this.A00;
            r2 = new AnonymousClass4K2(this, 8);
            r0 = ((C55442qM) r12).A00;
        } else {
            return;
        }
        r0.A0B(this, r2);
    }

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            AnonymousClass1Hf.A2F(A002, this);
            this.A01 = (C625835r) A002.AM8.get();
            this.A00 = A002.Ajr();
        }
    }

    public BlockingUserInteractionActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 19);
    }

    public BlockingUserInteractionActivity() {
        this(0);
    }
}
