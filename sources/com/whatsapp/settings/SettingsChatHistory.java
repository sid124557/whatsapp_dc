package com.whatsapp.settings;

import X.AnonymousClass0x2;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C08240dc;
import X.C64333Db;
import X.C89114bZ;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaPreferenceFragment;

public class SettingsChatHistory extends C89114bZ {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            this.A04 = C64333Db.A8y(A2Y);
            this.A05 = C64333Db.A04(A2Y);
        }
    }

    public SettingsChatHistory(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 93);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        if (bundle == null) {
            this.A06 = new SettingsChatHistoryFragment();
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A0E(this.A06, "preferenceFragment", R.id.preference_fragment);
            A0J.A01();
            return;
        }
        setTitle(bundle.getCharSequence("settingsChatHistoryTitle"));
        this.A06 = (WaPreferenceFragment) getSupportFragmentManager().A0D("preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsChatHistoryTitle", getTitle());
    }

    public SettingsChatHistory() {
        this(0);
    }
}
