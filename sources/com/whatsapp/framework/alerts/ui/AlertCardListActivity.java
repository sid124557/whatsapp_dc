package com.whatsapp.framework.alerts.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass66R;
import X.AnonymousClass978;
import X.C08240dc;
import X.C08310eF;
import X.C154517dI;
import X.C78623vJ;
import android.os.Bundle;
import com.whatsapp.R;

public final class AlertCardListActivity extends AnonymousClass978 {
    public final AnonymousClass66R A00 = C154517dI.A01(new C78623vJ(this));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
        }
        AnonymousClass1Hf.A2E(this);
        AnonymousClass0R8 supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.A0E(AnonymousClass0RP.A00(this, R.drawable.ic_back));
        }
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A0D((C08310eF) this.A00.getValue(), (String) null, R.id.alert_list_fragment_container);
        A0J.A01();
    }
}
