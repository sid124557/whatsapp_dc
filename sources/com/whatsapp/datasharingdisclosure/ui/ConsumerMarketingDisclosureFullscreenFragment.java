package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass214;
import X.AnonymousClass26I;
import X.C08240dc;
import X.C107405bG;
import X.C162457s7;
import X.C61242zw;
import X.C838349y;
import X.C84514Cq;
import X.C95814uZ;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class ConsumerMarketingDisclosureFullscreenFragment extends Hilt_ConsumerMarketingDisclosureFullscreenFragment implements C838349y {
    public C84514Cq A00;
    public final C95814uZ A01;
    public final C61242zw A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        ConsumerMarketingDisclosureFragment A002 = AnonymousClass26I.A00(this.A01, this.A02, AnonymousClass214.BLOCKING_DISCLOSURE);
        C84514Cq r0 = this.A00;
        if (r0 != null) {
            A002.A04 = r0;
        }
        C08240dc r1 = new C08240dc(A0T());
        r1.A0A(A002, R.id.fullscreen_fragment_container);
        r1.A03();
        Dialog dialog = this.A03;
        if (dialog != null) {
            C107405bG.A02(R.color.f5nameremoved, dialog);
        }
    }

    public void Blt(C84514Cq r1) {
        this.A00 = r1;
    }

    public ConsumerMarketingDisclosureFullscreenFragment(C95814uZ r1, C61242zw r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
    }
}
