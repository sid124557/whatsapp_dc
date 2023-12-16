package com.whatsapp.bonsai;

import X.AnonymousClass0x9;
import X.AnonymousClass20P;
import X.AnonymousClass4K2;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C162457s7;
import X.C18280x3;
import X.C18290x4;
import X.C18330xA;
import X.C383026z;
import X.C76833sQ;
import X.C76843sR;
import X.C79953xS;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class BonsaiSystemMessageBottomSheet extends Hilt_BonsaiSystemMessageBottomSheet {
    public final int A00 = R.layout.f8nameremoved;
    public final AnonymousClass66R A01;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        int i = 0;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("ARG_TYPE_ORDINAL", 0);
        }
        AnonymousClass66R r3 = this.A01;
        AnonymousClass20P r1 = AnonymousClass20P.values()[i];
        C162457s7.A0J(r1, 0);
        ((BonsaiSystemMessageBottomSheetViewModel) r3.getValue()).A00.A0H(r1);
        AnonymousClass4K2.A00(A0V(), ((BonsaiSystemMessageBottomSheetViewModel) r3.getValue()).A00, new C383026z(this, 0), 9);
        C18290x4.A1H(C18280x3.A0E(view, R.id.bonsai_system_message_bottom_sheet_learn_more_button), this, 10);
    }

    public BonsaiSystemMessageBottomSheet() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(BonsaiSystemMessageBottomSheetViewModel.class);
        this.A01 = C18330xA.A02(new C76833sQ(this), new C76843sR(this), new C79953xS(this), A1E);
    }

    public int A1S() {
        return this.A00;
    }
}
