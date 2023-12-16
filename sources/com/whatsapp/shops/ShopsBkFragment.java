package com.whatsapp.shops;

import X.C205049qL;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment;

public abstract class ShopsBkFragment extends BkFragment {
    public void A0c() {
        super.A0c();
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A06;
        Log.d("BkLayoutViewModel :Setting activity result event");
        shopsBkLayoutViewModel.A0D();
        shopsBkLayoutViewModel.A01.A0A(A0V());
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A06;
        Log.d("BkLayoutViewModel :Setting activity result event");
        shopsBkLayoutViewModel.A0D();
        C205049qL.A03(A0V(), shopsBkLayoutViewModel.A01, this, 70);
    }

    public Class A1I() {
        return ShopsBkLayoutViewModel.class;
    }
}
