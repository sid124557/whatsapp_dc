package com.whatsapp.updates.ui.statusmuting;

import X.AnonymousClass0GH;
import X.AnonymousClass0R6;
import X.AnonymousClass4FS;
import X.AnonymousClass4q5;
import X.AnonymousClass5MF;
import X.AnonymousClass66J;
import X.AnonymousClass66R;
import X.C05570Ua;
import X.C105365Uq;
import X.C114015mM;
import X.C120455yc;
import X.C1228366a;
import X.C154517dI;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C18260x0;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C54292oU;
import X.C72023d3;
import X.C86604Kt;
import X.C86644Kx;
import X.C88504Yz;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class MutedStatusesAdapter extends AnonymousClass0R6 implements C1228366a, C17280vG {
    public AnonymousClass4q5 A00;
    public AnonymousClass66J A01;
    public List A02 = C72023d3.A00;
    public final AnonymousClass5MF A03;
    public final C105365Uq A04;
    public final AnonymousClass66R A05;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return this.A03.A00(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this.A04, this);
    }

    public void BcK(AnonymousClass0GH r3, C15910sA r4) {
        int A022 = C18320x8.A02(r3, 1);
        if (A022 == 3) {
            C86604Kt.A1R(this.A00);
        } else if (A022 == 5) {
            this.A04.A00();
            this.A01 = null;
        }
    }

    public int A0G() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        C88504Yz r22 = (C88504Yz) r2;
        C162457s7.A0J(r22, 0);
        C86644Kx.A1O(r22, this.A02, i);
    }

    public void BWq() {
    }

    public void BcR(UserJid userJid) {
        AnonymousClass66J r0 = this.A01;
        if (r0 != null) {
            r0.BcR(userJid);
        }
    }

    public void BcS(UserJid userJid, boolean z) {
        AnonymousClass66J r0 = this.A01;
        if (r0 != null) {
            r0.BcS(userJid, z);
        }
    }

    public MutedStatusesAdapter(AnonymousClass5MF r3, C114015mM r4, C54292oU r5, AnonymousClass66J r6, AnonymousClass4FS r7) {
        C18260x0.A0c(r7, r4, r5, r3);
        this.A03 = r3;
        this.A01 = r6;
        this.A05 = C154517dI.A01(new C120455yc(r7));
        this.A04 = r4.A06(r5.A00, "muted_statuses_activity");
    }
}
