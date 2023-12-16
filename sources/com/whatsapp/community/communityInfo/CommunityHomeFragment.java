package com.whatsapp.community.communityInfo;

import X.AnonymousClass11H;
import X.AnonymousClass41U;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass5WH;
import X.AnonymousClass66R;
import X.C003203q;
import X.C009707r;
import X.C103145Ls;
import X.C105365Uq;
import X.C114015mM;
import X.C118055sv;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C27991fJ;
import X.C28891hw;
import X.C29241iV;
import X.C29291ia;
import X.C29301ib;
import X.C29421in;
import X.C39542Cj;
import X.C39612Cq;
import X.C44092Uq;
import X.C44272Vj;
import X.C56542sA;
import X.C64333Db;
import X.C80233xu;
import X.C88834as;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class CommunityHomeFragment extends Hilt_CommunityHomeFragment {
    public C39612Cq A00;
    public AnonymousClass11H A01;
    public AnonymousClass5WH A02;
    public C105365Uq A03;
    public C114015mM A04;
    public C56542sA A05;
    public final AnonymousClass66R A06 = C154517dI.A00(AnonymousClass58H.NONE, new C80233xu(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(A0G(), (AttributeSet) null);
        C003203q A0R = A0R();
        C162457s7.A0K(A0R, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C009707r r14 = (C009707r) A0R;
        C114015mM r2 = this.A04;
        if (r2 != null) {
            this.A03 = r2.A04(A0G(), this, "CommunityHomeFragment");
            C39612Cq r1 = this.A00;
            if (r1 != null) {
                C27991fJ r12 = (C27991fJ) this.A06.getValue();
                C105365Uq r11 = this.A03;
                if (r11 == null) {
                    throw C18270x1.A0S("contactPhotoLoader");
                }
                C56542sA r10 = this.A05;
                if (r10 != null) {
                    C118055sv r22 = r1.A00;
                    C64333Db r13 = r22.A04;
                    r13.A07.get();
                    C28891hw A3C = C64333Db.A3C(r13);
                    C88834as r132 = r22.A01;
                    C29301ib r222 = (C29301ib) r13.A57.get();
                    C44272Vj r23 = (C44272Vj) r13.A5U.get();
                    C39542Cj r20 = (C39542Cj) r132.A3V.get();
                    C29291ia r21 = (C29291ia) r13.A3w.get();
                    C103145Ls r19 = (C103145Ls) r132.A0a.get();
                    C44092Uq r18 = (C44092Uq) r132.A0Z.get();
                    RecyclerView recyclerView2 = recyclerView;
                    AnonymousClass5WH r133 = new AnonymousClass5WH(r14, r14, r14, recyclerView2, r18, r19, r20, r21, r222, r23, (C29421in) r13.A6P.get(), r11, r10, A3C, (C29241iV) r13.AGn.get(), r12);
                    this.A02 = r133;
                    AnonymousClass11H r0 = r133.A04;
                    C162457s7.A0D(r0);
                    this.A01 = r0;
                    AnonymousClass4K2.A00(r14, r0.A02.A03, new AnonymousClass41U(this), 45);
                    return recyclerView;
                }
                throw C18270x1.A0S("chatManager");
            }
            throw C18270x1.A0S("subgroupsComponentFactory");
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public void A0a() {
        super.A0a();
        AnonymousClass5WH r0 = this.A02;
        if (r0 == null) {
            throw C18270x1.A0S("subgroupsComponent");
        }
        r0.A07.A01();
    }
}
