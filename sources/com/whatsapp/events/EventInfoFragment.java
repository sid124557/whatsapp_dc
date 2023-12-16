package com.whatsapp.events;

import X.AnonymousClass0IT;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass20D;
import X.AnonymousClass30V;
import X.AnonymousClass36Y;
import X.AnonymousClass5UY;
import X.AnonymousClass5Y0;
import X.AnonymousClass66R;
import X.C06560Yg;
import X.C106715a2;
import X.C114015mM;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C196011v;
import X.C28071fd;
import X.C54922pV;
import X.C56612sH;
import X.C56972sr;
import X.C60152y5;
import X.C616131n;
import X.C620633i;
import X.C620733j;
import X.C69263Wi;
import X.C73853gB;
import X.C77893u8;
import X.C84814Du;
import X.C85244Fm;
import X.C85494Gl;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class EventInfoFragment extends Hilt_EventInfoFragment {
    public View A00;
    public RecyclerView A01;
    public C69263Wi A02;
    public C85244Fm A03;
    public C56972sr A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public C114015mM A08;
    public C620633i A09;
    public C56612sH A0A;
    public C620733j A0B;
    public AnonymousClass36Y A0C;
    public AnonymousClass5Y0 A0D;
    public C54922pV A0E;
    public C196011v A0F;
    public C28071fd A0G;
    public C60152y5 A0H;
    public AnonymousClass30V A0I;
    public C106715a2 A0J;
    public AnonymousClass5UY A0K;
    public AnonymousClass5UY A0L;
    public AnonymousClass5UY A0M;
    public WDSButton A0N;
    public C73853gB A0O;
    public final AnonymousClass66R A0P = C154517dI.A01(new C77893u8(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.event_info_name);
        this.A06 = AnonymousClass0x7.A0L(view, R.id.event_info_date);
        this.A05 = AnonymousClass0x7.A0L(view, R.id.event_add_to_calendar);
        this.A0N = (WDSButton) C06560Yg.A02(view, R.id.event_info_action);
        this.A00 = C06560Yg.A02(view, R.id.event_info_action_divider);
        this.A0L = AnonymousClass0x2.A0M(view, R.id.event_info_description);
        this.A0M = AnonymousClass0x2.A0M(view, R.id.event_info_location_container);
        this.A0K = AnonymousClass0x2.A0M(view, R.id.event_info_call_container);
        this.A01 = (RecyclerView) C06560Yg.A02(view, R.id.event_responses_recycler_view);
        C114015mM r2 = this.A08;
        if (r2 != null) {
            this.A0F = new C196011v(r2.A04(A0G(), this, "event-info-fragment"));
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                A1D();
                C18270x1.A0u(recyclerView);
            }
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                C196011v r0 = this.A0F;
                if (r0 == null) {
                    throw C18270x1.A0S("adapter");
                }
                recyclerView2.setAdapter(r0);
            }
            C616131n.A02((C85494Gl) null, new EventInfoFragment$onViewCreated$1(this, (C84814Du) null), AnonymousClass0IT.A00(A0V()), (AnonymousClass20D) null, 3);
            return;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public void A0c() {
        WDSButton wDSButton = this.A0N;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        WaTextView waTextView = this.A05;
        if (waTextView != null) {
            waTextView.setOnClickListener((View.OnClickListener) null);
        }
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A0N = null;
        this.A00 = null;
        this.A0L = null;
        this.A0M = null;
        this.A0K = null;
        this.A01 = null;
        super.A0c();
    }
}
