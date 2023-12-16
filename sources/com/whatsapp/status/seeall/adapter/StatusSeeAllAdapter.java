package com.whatsapp.status.seeall.adapter;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass0R6;
import X.AnonymousClass4FS;
import X.AnonymousClass4q4;
import X.AnonymousClass532;
import X.AnonymousClass533;
import X.AnonymousClass53P;
import X.AnonymousClass53S;
import X.AnonymousClass5MF;
import X.AnonymousClass648;
import X.AnonymousClass66R;
import X.C05570Ua;
import X.C105365Uq;
import X.C114015mM;
import X.C120305yN;
import X.C1228366a;
import X.C154517dI;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C386928t;
import X.C387028u;
import X.C54292oU;
import X.C627736r;
import X.C72023d3;
import X.C86604Kt;
import X.C86644Kx;
import X.C88504Yz;
import X.C986452r;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.seeall.StatusSeeAllActivity;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import java.util.List;

public final class StatusSeeAllAdapter extends AnonymousClass0R6 implements C1228366a, C17280vG {
    public AnonymousClass4q4 A00;
    public List A01 = C72023d3.A00;
    public final AnonymousClass5MF A02;
    public final C105365Uq A03;
    public final AnonymousClass648 A04;
    public final AnonymousClass4FS A05;
    public final AnonymousClass66R A06 = C154517dI.A01(new C120305yN(this));

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C05570Ua A002;
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            AnonymousClass5MF r2 = this.A02;
            View A0R = AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
            C162457s7.A0D(A0R);
            A002 = r2.A00(A0R, this.A03, this);
        } else if (i == 2) {
            View A0R2 = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
            C162457s7.A0D(A0R2);
            A002 = new AnonymousClass53P(A0R2);
        } else if (i == 3) {
            View A0R3 = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
            C162457s7.A0D(A0R3);
            A002 = new AnonymousClass53S(A0R3, this);
        } else {
            throw AnonymousClass000.A0G("View type not supported ", AnonymousClass001.A0o(), i);
        }
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.updates.ui.adapter.viewholders.UpdatesViewHolder<com.whatsapp.updates.ui.adapter.UpdatesDataItem>");
        return A002;
    }

    public void BcK(AnonymousClass0GH r3, C15910sA r4) {
        int A022 = C18320x8.A02(r3, 1);
        if (A022 == 3) {
            C86604Kt.A1R(this.A00);
        } else if (A022 == 5) {
            this.A03.A00();
        }
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        C88504Yz r22 = (C88504Yz) r2;
        C162457s7.A0J(r22, 0);
        C86644Kx.A1O(r22, this.A01, i);
    }

    public void BWq() {
    }

    public void BcR(UserJid userJid) {
        StatusSeeAllActivity statusSeeAllActivity = (StatusSeeAllActivity) this.A04;
        statusSeeAllActivity.startActivity(C627736r.A0S(statusSeeAllActivity, userJid, false, false, false));
        StatusesViewModel statusesViewModel = statusSeeAllActivity.A0A;
        if (statusesViewModel == null) {
            throw C18270x1.A0S("statusesViewModel");
        }
        statusesViewModel.A0G(userJid, (Integer) null, (Integer) null);
    }

    public void BcS(UserJid userJid, boolean z) {
        DialogFragment dialogFragment;
        StatusSeeAllActivity statusSeeAllActivity = (StatusSeeAllActivity) this.A04;
        StatusesViewModel statusesViewModel = statusSeeAllActivity.A0A;
        UserJid userJid2 = userJid;
        if (z) {
            if (statusesViewModel == null) {
                throw C18270x1.A0S("statusesViewModel");
            }
            dialogFragment = C387028u.A00(userJid2, (Long) null, (String) null, (String) null, statusesViewModel.A0E(), true);
        } else if (statusesViewModel == null) {
            throw C18270x1.A0S("statusesViewModel");
        } else {
            dialogFragment = C386928t.A00(userJid2, (Long) null, (String) null, (String) null, statusesViewModel.A0E(), true);
        }
        statusSeeAllActivity.Boo(dialogFragment);
    }

    public int getItemViewType(int i) {
        Object obj = this.A01.get(i);
        if (obj instanceof C986452r) {
            return 1;
        }
        if (obj instanceof AnonymousClass532) {
            return 2;
        }
        if (obj instanceof AnonymousClass533) {
            return 3;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("View type not supported ");
        throw AnonymousClass001.A0c(AnonymousClass000.A0R(this.A01.get(i), A0o));
    }

    public StatusSeeAllAdapter(AnonymousClass5MF r3, C114015mM r4, C54292oU r5, AnonymousClass648 r6, AnonymousClass4FS r7) {
        C18260x0.A0c(r7, r4, r5, r3);
        this.A05 = r7;
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r4.A06(r5.A00, "StatusSeeAllActivity");
    }
}
