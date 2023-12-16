package com.whatsapp.events;

import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass11L;
import X.AnonymousClass4J4;
import X.AnonymousClass5Vo;
import X.AnonymousClass66R;
import X.C08240dc;
import X.C139816sf;
import X.C154517dI;
import X.C15940sD;
import X.C162457s7;
import X.C17190ui;
import X.C18270x1;
import X.C18300x5;
import X.C39662Cv;
import X.C633839a;
import X.C77883u7;
import X.C817640z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class EventInfoBottomSheet extends Hilt_EventInfoBottomSheet {
    public C39662Cv A00;
    public WaImageView A01;
    public AnonymousClass11L A02;
    public final AnonymousClass66R A03 = C154517dI.A01(new C77883u7(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C39662Cv r3 = this.A00;
        if (r3 != null) {
            this.A02 = (AnonymousClass11L) new AnonymousClass0XL((C17190ui) new AnonymousClass4J4(C18300x5.A0d(this.A03), 3, r3), (C15940sD) this).A01(AnonymousClass11L.class);
            this.A01 = AnonymousClass0x9.A0L(view, R.id.event_info_close_button);
            C08240dc r2 = new C08240dc(A0T());
            r2.A0A(new EventInfoFragment(), R.id.event_info_fragment_container);
            r2.A0I("EVENT_INFO_FRAGMENT");
            r2.A01();
            WaImageView waImageView = this.A01;
            if (waImageView != null) {
                C633839a.A00(waImageView, this, 34);
                return;
            }
            return;
        }
        throw C18270x1.A0S("eventInfoViewModelFactory");
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        r3.A00.A04 = new C139816sf(C817640z.A00);
    }

    public void A0c() {
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            waImageView.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        super.A0c();
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
