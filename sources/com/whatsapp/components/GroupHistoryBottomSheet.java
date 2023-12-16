package com.whatsapp.components;

import X.C111095hX;
import X.C162457s7;
import X.C18310x6;
import X.C66433Lk;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class GroupHistoryBottomSheet extends Hilt_GroupHistoryBottomSheet {
    public C111095hX A00;
    public C66433Lk A01;
    public WDSButton A02;
    public WDSButton A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, true);
        WDSButton wDSButton = (WDSButton) inflate.findViewById(R.id.ok_button);
        C18310x6.A17(wDSButton, this, 15);
        this.A03 = wDSButton;
        WDSButton wDSButton2 = (WDSButton) inflate.findViewById(R.id.learn_more_button);
        C18310x6.A17(wDSButton2, this, 16);
        this.A02 = wDSButton2;
        return inflate;
    }

    public void A0a() {
        this.A03 = null;
        this.A02 = null;
        super.A0a();
    }
}
