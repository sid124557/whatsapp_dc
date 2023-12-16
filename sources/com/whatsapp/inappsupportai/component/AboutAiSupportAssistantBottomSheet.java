package com.whatsapp.inappsupportai.component;

import X.C162457s7;
import X.C53602nM;
import X.C635439q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class AboutAiSupportAssistantBottomSheet extends Hilt_AboutAiSupportAssistantBottomSheet {
    public C53602nM A00;
    public WDSButton A01;
    public WDSButton A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, true);
        WDSButton wDSButton = (WDSButton) inflate.findViewById(R.id.ok_button);
        C635439q.A00(wDSButton, this, 44);
        this.A02 = wDSButton;
        WDSButton wDSButton2 = (WDSButton) inflate.findViewById(R.id.learn_more_button);
        C635439q.A00(wDSButton2, this, 45);
        this.A01 = wDSButton2;
        return inflate;
    }

    public void A0a() {
        super.A0a();
        this.A02 = null;
        this.A01 = null;
    }
}
