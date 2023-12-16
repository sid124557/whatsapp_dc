package com.whatsapp.chatinfo.view.custom;

import X.C06560Yg;
import X.C111095hX;
import X.C142006wU;
import X.C18310x6;
import X.C56972sr;
import X.C66433Lk;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class PhoneNumberHiddenInCAGBottomSheet extends Hilt_PhoneNumberHiddenInCAGBottomSheet {
    public C111095hX A00;
    public C56972sr A01;
    public C66433Lk A02;

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        ((WDSButton) C06560Yg.A02(view, R.id.share_pn_cta_positive)).setVariant(C142006wU.FILLED);
        ((WDSButton) C06560Yg.A02(view, R.id.share_pn_cta_negative)).setVariant(C142006wU.BORDERLESS);
        String A0L = this.A01.A0L();
        TextView textView = this.A02;
        if (!(A0L == null || textView == null)) {
            textView.setText(A0L);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(R.string.f11nameremoved);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            textView3.setText(R.string.f11nameremoved);
        }
        TextView textView4 = this.A01;
        if (textView4 != null) {
            textView4.setText(R.string.f11nameremoved);
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            textView5.setText(R.string.f11nameremoved);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (!(id == R.id.share_pn_close_button || id == R.id.share_pn_cta_positive)) {
            if (id == R.id.share_pn_cta_negative) {
                this.A00.A0A(A0R(), C18310x6.A0D(this.A02.A03("831150864932965")));
            } else {
                return;
            }
        }
        A1L();
    }
}
