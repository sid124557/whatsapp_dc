package com.whatsapp.messaging;

import X.AnonymousClass5RC;
import X.C105365Uq;
import X.C113895mA;
import X.C114015mM;
import X.C30721mu;
import X.C57502tk;
import X.C86604Kt;
import X.C86644Kx;
import X.C93234oB;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ViewOnceAudioFragment extends Hilt_ViewOnceAudioFragment {
    public C105365Uq A00;
    public C114015mM A01;
    public AnonymousClass5RC A02;
    public C113895mA A03;
    public C57502tk A04;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C86604Kt.A0z(A0G(), inflate, R.color.f5nameremoved);
        inflate.setVisibility(0);
        A13(true);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        ViewGroup A0I = C86644Kx.A0I(view, R.id.audio_bubble_container);
        C30721mu r10 = (C30721mu) this.A02;
        if (this.A00 == null) {
            this.A00 = this.A01.A06(A1D(), "conversation-row-inflater");
        }
        C93234oB r4 = new C93234oB(A1D(), this.A00, this, this.A02, this.A03, r10);
        r4.A1s(true);
        r4.setEnabled(false);
        r4.setClickable(false);
        r4.setLongClickable(false);
        r4.A2Q = false;
        A0I.removeAllViews();
        A0I.addView(r4);
    }
}
