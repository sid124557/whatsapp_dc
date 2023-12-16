package com.whatsapp.group;

import X.AnonymousClass10O;
import X.AnonymousClass24P;
import X.AnonymousClass34R;
import X.AnonymousClass4K2;
import X.AnonymousClass5MG;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.C105365Uq;
import X.C114015mM;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C27991fJ;
import X.C39702Cz;
import X.C46672c1;
import X.C56612sH;
import X.C620733j;
import X.C64333Db;
import X.C87774Wb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class GroupPendingInvitesFragment extends Hilt_GroupPendingInvitesFragment {
    public C39702Cz A00;
    public AnonymousClass64J A01;
    public AnonymousClass5ZU A02;
    public C114015mM A03;
    public C620733j A04;
    public AnonymousClass10O A05;
    public C27991fJ A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        try {
            Bundle bundle2 = this.A06;
            String str = null;
            if (bundle2 != null) {
                str = bundle2.getString("gid");
            }
            this.A06 = AnonymousClass34R.A05(str);
            RecyclerView recyclerView = (RecyclerView) C18290x4.A0M(view, R.id.pending_invites_recycler_view);
            C39702Cz r2 = this.A00;
            if (r2 != null) {
                C27991fJ r5 = this.A06;
                if (r5 == null) {
                    throw C18270x1.A0S("groupJid");
                }
                C56612sH A2p = C64333Db.A2p(r2.A00.A04);
                C64333Db r1 = r2.A00.A04;
                this.A05 = new AnonymousClass10O(C64333Db.A26(r1), A2p, (C46672c1) r1.AGV.get(), r5, C64333Db.A8y(r1));
                Context A0G = A0G();
                AnonymousClass5ZU r8 = this.A02;
                if (r8 != null) {
                    C620733j r10 = this.A04;
                    if (r10 != null) {
                        AnonymousClass5MG r7 = new AnonymousClass5MG(A0G());
                        C114015mM r3 = this.A03;
                        if (r3 != null) {
                            C105365Uq A062 = r3.A06(A0G(), "group-pending-participants");
                            AnonymousClass64J r6 = this.A01;
                            if (r6 != null) {
                                C87774Wb r4 = new C87774Wb(A0G, r6, r7, r8, A062, r10, 0);
                                r4.A03 = true;
                                r4.A05();
                                AnonymousClass10O r12 = this.A05;
                                if (r12 == null) {
                                    throw C18270x1.A0S("viewModel");
                                }
                                AnonymousClass4K2.A00(A0V(), r12.A00, r4, 123);
                                recyclerView.getContext();
                                C18270x1.A0u(recyclerView);
                                recyclerView.setAdapter(r4);
                                return;
                            }
                            throw C18270x1.A0S("textEmojiLabelViewControllerFactory");
                        }
                        throw C18270x1.A0S("contactPhotos");
                    }
                    throw C18270x1.A0S("whatsAppLocale");
                }
                throw C18270x1.A0S("waContactNames");
            }
            throw C18270x1.A0S("pendingInvitesViewModelFactory");
        } catch (AnonymousClass24P e) {
            Log.e("GroupPendingParticipants started with invalid jid ", e);
            C18300x5.A1A(this);
        }
    }
}
