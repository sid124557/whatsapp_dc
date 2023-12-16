package com.whatsapp.calling.participantlist;

import X.AnonymousClass002;
import X.AnonymousClass0R6;
import X.AnonymousClass0x9;
import X.AnonymousClass3XG;
import X.AnonymousClass41I;
import X.AnonymousClass41J;
import X.AnonymousClass4K2;
import X.AnonymousClass4WF;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C107215at;
import X.C109315eQ;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C18330xA;
import X.C77183sz;
import X.C77193t0;
import X.C80133xk;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.components.MaxHeightLinearLayout;

public final class ParticipantListBottomSheetDialog extends Hilt_ParticipantListBottomSheetDialog {
    public RecyclerView A00;
    public C111095hX A01;
    public AnonymousClass4WF A02;
    public AnonymousClass3XG A03;
    public MaxHeightLinearLayout A04;
    public final int A05 = R.layout.f8nameremoved;
    public final AnonymousClass66R A06;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        ViewParent parent = view.getParent();
        C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior A012 = BottomSheetBehavior.A01((View) parent);
        C162457s7.A0D(A012);
        A012.A0p = true;
        A012.A0S(3);
        this.A04 = (MaxHeightLinearLayout) view;
        A1Y();
        C06560Yg.A02(view, R.id.close_btn).setOnClickListener(new C109315eQ(this, 14));
        this.A00 = (RecyclerView) C06560Yg.A02(view, R.id.participant_list);
        AnonymousClass4WF r1 = this.A02;
        if (r1 != null) {
            AnonymousClass66R r4 = this.A06;
            r1.A02 = (ParticipantsListViewModel) r4.getValue();
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                AnonymousClass4WF r0 = this.A02;
                if (r0 != null) {
                    recyclerView.setAdapter(r0);
                } else {
                    throw C18270x1.A0S("participantListAdapter");
                }
            }
            AnonymousClass4K2.A00(A0V(), ((ParticipantsListViewModel) r4.getValue()).A01, new AnonymousClass41I(this), 16);
            AnonymousClass4K2.A00(A0V(), ((ParticipantsListViewModel) r4.getValue()).A0E, new AnonymousClass41J(this), 17);
            return;
        }
        throw C18270x1.A0S("participantListAdapter");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        A1Y();
    }

    public ParticipantListBottomSheetDialog() {
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(ParticipantsListViewModel.class);
        this.A06 = C18330xA.A02(new C77183sz(this), new C77193t0(this), new C80133xk(this), A1E);
    }

    public void A0c() {
        super.A0c();
        AnonymousClass3XG r3 = this.A03;
        if (r3 != null) {
            int i = 16;
            if (AnonymousClass0x9.A1Q(((ParticipantsListViewModel) this.A06.getValue()).A0E.A07())) {
                i = 35;
            }
            r3.A01(C18310x6.A0e(), 23, i);
            this.A04 = null;
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setAdapter((AnonymousClass0R6) null);
            }
            this.A00 = null;
            Bundle A08 = AnonymousClass002.A08();
            A08.putBoolean("on_dismissed", true);
            A0U().A0n("participant_list_request", A08);
            return;
        }
        throw C18270x1.A0S("callUserJourneyLogger");
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        Window window = A1J.getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        return A1J;
    }

    public int A1S() {
        return this.A05;
    }

    public final void A1Y() {
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            float f = 0.6f;
            if (C08310eF.A09(this).getConfiguration().orientation == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A04;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) C107215at.A00(A0Q)) * f));
            }
        }
    }
}
