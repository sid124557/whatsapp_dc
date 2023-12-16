package com.whatsapp.calling.avatar.view;

import X.AnonymousClass0x9;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C18330xA;
import X.C185408tb;
import X.C76933sa;
import X.C76943sb;
import X.C80003xX;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;

public final class CallAvatarFLMConsentBottomSheet extends FLMConsentBottomSheet {
    public final AnonymousClass66R A00;

    public /* bridge */ /* synthetic */ C185408tb A1Y() {
        return (CallAvatarViewModel) this.A00.getValue();
    }

    public CallAvatarFLMConsentBottomSheet() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(CallAvatarViewModel.class);
        this.A00 = C18330xA.A02(new C76933sa(this), new C76943sb(this), new C80003xX(this), A1E);
    }

    public boolean A1b() {
        return false;
    }
}
