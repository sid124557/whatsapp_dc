package com.whatsapp.group;

import X.AnonymousClass10I;
import X.AnonymousClass24P;
import X.AnonymousClass2D1;
import X.AnonymousClass34R;
import X.AnonymousClass4FS;
import X.AnonymousClass4K7;
import X.AnonymousClass4u4;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C27991fJ;
import X.C52372lN;
import X.C64333Db;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class NonAdminGJRFragment extends Hilt_NonAdminGJRFragment {
    public AnonymousClass2D1 A00;
    public AnonymousClass4u4 A01;
    public AnonymousClass10I A02;
    public C27991fJ A03;

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
            C27991fJ A05 = AnonymousClass34R.A05(str);
            this.A03 = A05;
            AnonymousClass2D1 r1 = this.A00;
            if (r1 != null) {
                AnonymousClass4FS A8y = C64333Db.A8y(r1.A00.A04);
                C64333Db r0 = r1.A00.A04;
                this.A02 = new AnonymousClass10I(C64333Db.A26(r0), (C52372lN) r0.AOR.get(), A05, A8y);
                AnonymousClass4u4 r12 = this.A01;
                if (r12 != null) {
                    C27991fJ r02 = this.A03;
                    if (r02 == null) {
                        throw C18270x1.A0S("groupJid");
                    }
                    r12.A00 = r02;
                    RecyclerView recyclerView = (RecyclerView) C18290x4.A0M(view, R.id.pending_requests_recycler_view);
                    recyclerView.getContext();
                    C18270x1.A0u(recyclerView);
                    AnonymousClass4u4 r03 = this.A01;
                    if (r03 != null) {
                        recyclerView.setAdapter(r03);
                        AnonymousClass10I r04 = this.A02;
                        if (r04 == null) {
                            throw C18270x1.A0S("viewModel");
                        }
                        r04.A00.A0B(A0V(), new AnonymousClass4K7(this, 6, recyclerView));
                        return;
                    }
                    throw C18270x1.A0S("nonAdminGJRAdapter");
                }
                throw C18270x1.A0S("nonAdminGJRAdapter");
            }
            throw C18270x1.A0S("nonAdminGJRViewModelFactory");
        } catch (AnonymousClass24P e) {
            Log.e("GroupPendingParticipants started with invalid jid ", e);
            C18300x5.A1A(this);
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A13(false);
    }
}
