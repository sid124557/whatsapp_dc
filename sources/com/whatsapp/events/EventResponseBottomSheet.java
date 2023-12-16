package com.whatsapp.events;

import X.AnonymousClass66R;
import X.C06560Yg;
import X.C154517dI;
import X.C162457s7;
import X.C183538qC;
import X.C633839a;
import X.C77903u9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;

public final class EventResponseBottomSheet extends Hilt_EventResponseBottomSheet {
    public LinearLayout A00;
    public LinearLayout A01;
    public C183538qC A02;
    public final AnonymousClass66R A03 = C154517dI.A01(new C77903u9(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A00 = (LinearLayout) C06560Yg.A02(view, R.id.event_going_btn);
        this.A01 = (LinearLayout) C06560Yg.A02(view, R.id.event_not_going_btn);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            C633839a.A00(linearLayout, this, 35);
        }
        LinearLayout linearLayout2 = this.A01;
        if (linearLayout2 != null) {
            C633839a.A00(linearLayout2, this, 36);
        }
    }

    public void A0c() {
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout2 = this.A01;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        this.A01 = null;
        super.A0c();
    }
}
