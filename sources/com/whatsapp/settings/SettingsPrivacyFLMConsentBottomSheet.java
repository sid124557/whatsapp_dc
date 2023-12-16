package com.whatsapp.settings;

import X.AnonymousClass0x9;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C18330xA;
import X.C185408tb;
import X.C79583wr;
import X.C79593ws;
import X.C81173zS;
import com.whatsapp.calling.avatar.view.FLMConsentBottomSheet;

public final class SettingsPrivacyFLMConsentBottomSheet extends FLMConsentBottomSheet {
    public final AnonymousClass66R A00;
    public final boolean A01 = true;

    public /* bridge */ /* synthetic */ C185408tb A1Y() {
        return (SettingsPrivacyCameraEffectsViewModel) this.A00.getValue();
    }

    public SettingsPrivacyFLMConsentBottomSheet() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(SettingsPrivacyCameraEffectsViewModel.class);
        this.A00 = C18330xA.A02(new C79583wr(this), new C79593ws(this), new C81173zS(this), A1E);
    }

    public boolean A1b() {
        return this.A01;
    }
}
