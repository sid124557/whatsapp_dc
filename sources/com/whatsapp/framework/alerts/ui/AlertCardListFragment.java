package com.whatsapp.framework.alerts.ui;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass10A;
import X.AnonymousClass2GU;
import X.AnonymousClass30K;
import X.AnonymousClass3ZO;
import X.AnonymousClass42U;
import X.AnonymousClass4K2;
import X.C15940sD;
import X.C162457s7;
import X.C17190ui;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C195711s;
import X.C39682Cx;
import X.C84564Cv;
import X.C84574Cw;
import X.C86144Iz;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class AlertCardListFragment extends Hilt_AlertCardListFragment implements C84574Cw {
    public RecyclerView A00;
    public C39682Cx A01;
    public AnonymousClass30K A02;
    public AnonymousClass2GU A03;
    public C195711s A04;
    public AnonymousClass10A A05;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        this.A00 = (RecyclerView) C18290x4.A0M(view, R.id.alert_card_list);
        C195711s r1 = new C195711s(this, AnonymousClass001.A0s());
        this.A04 = r1;
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            throw C18270x1.A0S("alertsList");
        }
        recyclerView.setAdapter(r1);
    }

    public void BP2(AnonymousClass3ZO r3) {
        AnonymousClass2GU r0 = this.A03;
        if (r0 != null) {
            for (C84564Cv BP2 : r0.A00) {
                BP2.BP2(r3);
            }
            C18300x5.A1A(this);
            return;
        }
        throw C18270x1.A0S("alertActionObserverManager");
    }

    public void BRL(AnonymousClass3ZO r4) {
        AnonymousClass10A r1 = this.A05;
        if (r1 == null) {
            throw C18270x1.A0S("alertListViewModel");
        }
        String str = r4.A06;
        AnonymousClass30K r2 = r1.A01;
        r2.A05(C18290x4.A12(str));
        r1.A00.A0G(r2.A02());
        AnonymousClass2GU r0 = this.A03;
        if (r0 != null) {
            for (C84564Cv BRL : r0.A00) {
                BRL.BRL(r4);
            }
            return;
        }
        throw C18270x1.A0S("alertActionObserverManager");
    }

    public void A0f() {
        super.A0f();
        AnonymousClass10A r0 = this.A05;
        if (r0 == null) {
            throw C18270x1.A0S("alertListViewModel");
        }
        r0.A00.A0G(r0.A01.A02());
        AnonymousClass10A r02 = this.A05;
        if (r02 == null) {
            throw C18270x1.A0S("alertListViewModel");
        }
        AnonymousClass4K2.A00(this, r02.A00, new AnonymousClass42U(this), 122);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A05 = (AnonymousClass10A) new AnonymousClass0XL((C17190ui) new C86144Iz(this, 3), (C15940sD) A0R()).A01(AnonymousClass10A.class);
    }
}
