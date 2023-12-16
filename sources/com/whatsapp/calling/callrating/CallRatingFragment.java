package com.whatsapp.calling.callrating;

import X.AnonymousClass002;
import X.AnonymousClass60P;
import X.AnonymousClass66R;
import X.AnonymousClass69Y;
import X.AnonymousClass6C6;
import X.C06270Wx;
import X.C119045wL;
import X.C154517dI;
import X.C162457s7;
import X.C86664Kz;
import X.C999258s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.StarRatingBar;
import com.whatsapp.base.WaFragment;

public final class CallRatingFragment extends WaFragment {
    public TextView A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C119045wL(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        this.A00 = AnonymousClass002.A09(inflate, R.id.rating_description);
        ((StarRatingBar) inflate.findViewById(R.id.rating_bar)).A01 = new AnonymousClass69Y(this, 0);
        AnonymousClass66R r2 = this.A01;
        C06270Wx.A03(C86664Kz.A14(r2).A09, C999258s.CALL_RATINGS.titleRes);
        AnonymousClass6C6.A02(A0V(), C86664Kz.A14(r2).A0C, new AnonymousClass60P(this), 65);
        return inflate;
    }

    public void A0c() {
        super.A0c();
        this.A00 = null;
    }
}
