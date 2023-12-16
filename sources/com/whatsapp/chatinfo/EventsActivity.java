package com.whatsapp.chatinfo;

import X.AnonymousClass0IT;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass20D;
import X.AnonymousClass30V;
import X.AnonymousClass4HY;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C107695bk;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C195911u;
import X.C39522Ch;
import X.C616131n;
import X.C64333Db;
import X.C77283t9;
import X.C80163xn;
import X.C84814Du;
import X.C85494Gl;
import X.C88834as;
import X.C89644eZ;
import X.C95814uZ;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class EventsActivity extends C89644eZ {
    public RecyclerView A00;
    public C39522Ch A01;
    public AnonymousClass30V A02;
    public boolean A03;
    public final C195911u A04;
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A02 = (AnonymousClass30V) r1.ANL.get();
            this.A01 = (C39522Ch) A0I.A3M.get();
        }
    }

    public void A66() {
        AnonymousClass30V r2 = this.A02;
        if (r2 != null) {
            r2.A03((C95814uZ) this.A05.getValue(), 57);
            super.A66();
            return;
        }
        throw C18270x1.A0S("navigationTimeSpentManager");
    }

    public EventsActivity(int i) {
        this.A03 = false;
        AnonymousClass4HY.A00(this, 28);
    }

    public boolean A6C() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Hf.A2E(this);
        C616131n.A02((C85494Gl) null, new EventsActivity$onCreate$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        RecyclerView recyclerView = (RecyclerView) C18290x4.A0N(this, R.id.events_recycler_view);
        this.A00 = recyclerView;
        if (recyclerView == null) {
            throw C18270x1.A0S("eventsRecyclerView");
        }
        recyclerView.getContext();
        C18270x1.A0u(recyclerView);
        recyclerView.setAdapter(this.A04);
    }

    public EventsActivity() {
        this(0);
        this.A05 = C154517dI.A00(AnonymousClass58H.NONE, new C80163xn(this));
        this.A06 = C154517dI.A01(new C77283t9(this));
        this.A04 = new C195911u();
    }
}
