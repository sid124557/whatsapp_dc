package com.whatsapp.bonsai.onboarding;

import X.AnonymousClass0L9;
import X.AnonymousClass4SG;
import X.AnonymousClass4TV;
import X.AnonymousClass68W;
import X.C10620iF;
import X.C107695bk;
import X.C112165jI;
import X.C112185jK;
import X.C1229766o;
import X.C18270x1;
import X.C627736r;
import X.C64333Db;
import X.C89644eZ;
import X.C996357k;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public final class BonsaiOnboardingActivity extends C89644eZ {
    public C1229766o A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A00 = (C1229766o) A2Y.A3A.get();
        }
    }

    public BonsaiOnboardingActivity(int i) {
        this.A01 = false;
        AnonymousClass68W.A00(this, 11);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("bonsaiOnboardingEntryPoint", -1);
        if (intExtra == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(intExtra);
        }
        if (isTaskRoot()) {
            finish();
            C10620iF r2 = new C10620iF(this);
            Intent A02 = C627736r.A02(this);
            ArrayList arrayList = r2.A01;
            arrayList.add(A02);
            arrayList.add(C627736r.A0p(this, valueOf));
            r2.A01();
            return;
        }
        C1229766o r0 = this.A00;
        if (r0 != null) {
            ((C112185jK) r0).A08.A00(this, new C112165jI(this, valueOf, 0), C996357k.AGENT, valueOf);
            getSupportFragmentManager().A0X.A01.add(new AnonymousClass0L9(new AnonymousClass4TV(this), false));
            return;
        }
        throw C18270x1.A0S("bonsaiUiUtil");
    }

    public BonsaiOnboardingActivity() {
        this(0);
    }
}
