package com.whatsapp.events;

import X.AnonymousClass0IT;
import X.AnonymousClass0XL;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass11J;
import X.AnonymousClass20D;
import X.AnonymousClass30V;
import X.AnonymousClass340;
import X.AnonymousClass58H;
import X.AnonymousClass5Vo;
import X.AnonymousClass66R;
import X.C139816sf;
import X.C154517dI;
import X.C15940sD;
import X.C162457s7;
import X.C17190ui;
import X.C18270x1;
import X.C18290x4;
import X.C39652Cu;
import X.C616131n;
import X.C633839a;
import X.C63673Ae;
import X.C80333y4;
import X.C817640z;
import X.C84814Du;
import X.C85494Gl;
import X.C95814uZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class EventCreationBottomSheet extends Hilt_EventCreationBottomSheet {
    public C39652Cu A00;
    public WaImageView A01;
    public WaTextView A02;
    public AnonymousClass11J A03;
    public AnonymousClass30V A04;
    public final AnonymousClass66R A05 = C154517dI.A00(AnonymousClass58H.NONE, new C80333y4(this));
    public final AnonymousClass66R A06 = AnonymousClass340.A01(this, "extra_quoted_message_row_id");

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C39652Cu r4 = this.A00;
        if (r4 != null) {
            C95814uZ r3 = (C95814uZ) this.A05.getValue();
            long A0D = C18290x4.A0D(this.A06);
            C162457s7.A0J(r3, 1);
            this.A03 = (AnonymousClass11J) new AnonymousClass0XL((C17190ui) new C63673Ae(r4, r3, A0D), (C15940sD) this).A01(AnonymousClass11J.class);
            C616131n.A02((C85494Gl) null, new EventCreationBottomSheet$onViewCreated$1(this, (C84814Du) null), AnonymousClass0IT.A00(A0V()), (AnonymousClass20D) null, 3);
            WaImageView A0L = AnonymousClass0x9.A0L(view, R.id.event_creation_close_button);
            this.A01 = A0L;
            if (A0L != null) {
                A0L.setImageResource(R.drawable.ic_close);
            }
            WaImageView waImageView = this.A01;
            if (waImageView != null) {
                C633839a.A00(waImageView, this, 26);
            }
            WaTextView A0L2 = AnonymousClass0x7.A0L(view, R.id.event_creation_bottom_sheet_title);
            this.A02 = A0L2;
            if (A0L2 != null) {
                A0L2.setText(R.string.f11nameremoved);
                return;
            }
            return;
        }
        throw C18270x1.A0S("eventCreationViewModelFactory");
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
        this.A02 = null;
        this.A01 = null;
        super.A0c();
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
