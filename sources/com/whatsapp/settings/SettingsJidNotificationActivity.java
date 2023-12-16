package com.whatsapp.settings;

import X.AnonymousClass0x2;
import X.AnonymousClass310;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C08240dc;
import X.C105275Ug;
import X.C51072jE;
import X.C64333Db;
import X.C89184bt;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaPreferenceFragment;

public class SettingsJidNotificationActivity extends C89184bt {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            this.A04 = C64333Db.A8y(A2Y);
            this.A05 = C64333Db.A04(A2Y);
            this.A01 = (AnonymousClass310) A2Y.A9r.get();
            this.A00 = (C105275Ug) A2Y.A0q.get();
            this.A02 = C64333Db.A2o(A2Y);
            this.A03 = (C51072jE) A2Y.ATh.get();
        }
    }

    public SettingsJidNotificationActivity(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 96);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        if (bundle == null) {
            this.A06 = new SettingsJidNotificationFragment();
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A0E(this.A06, "preferenceFragment", R.id.preference_fragment);
            A0J.A01();
            return;
        }
        setTitle(bundle.getCharSequence("settingsJidNotificationFragment"));
        this.A06 = (WaPreferenceFragment) getSupportFragmentManager().A0C(bundle, "preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsJidNotificationFragment", getTitle());
    }

    public SettingsJidNotificationActivity() {
        this(0);
    }
}
