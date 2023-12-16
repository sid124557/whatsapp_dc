package com.whatsapp.updates.ui.statusmuting;

import X.AnonymousClass08A;
import X.AnonymousClass0R6;
import X.AnonymousClass0UY;
import X.AnonymousClass1Hf;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5E2;
import X.AnonymousClass5E3;
import X.AnonymousClass5FA;
import X.AnonymousClass5MF;
import X.AnonymousClass62Y;
import X.AnonymousClass66J;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C107695bk;
import X.C110565gf;
import X.C124086Ax;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C387028u;
import X.C627736r;
import X.C64333Db;
import X.C85344Fw;
import X.C86604Kt;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class MutedStatusesActivity extends C89644eZ implements AnonymousClass66J, C85344Fw {
    public RecyclerView A00;
    public AnonymousClass5E2 A01;
    public AnonymousClass5E3 A02;
    public AnonymousClass5FA A03;
    public WaTextView A04;
    public MutedStatusesAdapter A05;
    public MutedStatusesViewModel A06;
    public boolean A07;

    public void BcR(UserJid userJid) {
        startActivity(C627736r.A0S(this, userJid, false, false, false));
        MutedStatusesViewModel mutedStatusesViewModel = this.A06;
        if (mutedStatusesViewModel == null) {
            throw C86604Kt.A0j();
        }
        mutedStatusesViewModel.A04.A0G(userJid, (Integer) null, (Integer) null);
    }

    public void BcS(UserJid userJid, boolean z) {
        MutedStatusesViewModel mutedStatusesViewModel = this.A06;
        if (mutedStatusesViewModel == null) {
            throw C86604Kt.A0j();
        }
        Boo(C387028u.A00(userJid, (Long) null, (String) null, (String) null, mutedStatusesViewModel.A04.A0E(), true));
    }

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A01 = (AnonymousClass5E2) A2W.A3q.get();
            this.A03 = (AnonymousClass5FA) r1.A0a.get();
            this.A02 = (AnonymousClass5E3) A2W.A03.get();
        }
    }

    public void BR7(DialogFragment dialogFragment, boolean z) {
    }

    public MutedStatusesActivity(int i) {
        this.A07 = false;
        AnonymousClass68W.A00(this, 113);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass4SG.A37(this);
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A6N();
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A04 = (WaTextView) C18290x4.A0N(this, R.id.no_statuses_text_view);
        AnonymousClass5FA r1 = this.A03;
        if (r1 != null) {
            StatusesViewModel A002 = C110565gf.A00(this, r1, true);
            AnonymousClass5E3 r12 = this.A02;
            if (r12 != null) {
                C162457s7.A0J(A002, 1);
                this.A06 = (MutedStatusesViewModel) C124086Ax.A00(this, A002, r12, 13).A01(MutedStatusesViewModel.class);
                this.A06.A00(A002);
                AnonymousClass08A r13 = this.A06;
                MutedStatusesViewModel mutedStatusesViewModel = this.A06;
                if (mutedStatusesViewModel == null) {
                    throw C86604Kt.A0j();
                }
                r13.A00(mutedStatusesViewModel);
                AnonymousClass5E2 r14 = this.A01;
                if (r14 != null) {
                    AnonymousClass4FS A8y = C64333Db.A8y(r14.A00.A03);
                    C64333Db r0 = r14.A00.A03;
                    MutedStatusesAdapter mutedStatusesAdapter = new MutedStatusesAdapter((AnonymousClass5MF) r0.A00.A2a.get(), C64333Db.A29(r0), C64333Db.A2q(r0), this, A8y);
                    this.A05 = mutedStatusesAdapter;
                    this.A06.A00(mutedStatusesAdapter);
                    View findViewById = findViewById(R.id.muted_statuses_list);
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    MutedStatusesAdapter mutedStatusesAdapter2 = this.A05;
                    if (mutedStatusesAdapter2 == null) {
                        throw C18270x1.A0S("adapter");
                    }
                    recyclerView.setAdapter(mutedStatusesAdapter2);
                    C18270x1.A0u(recyclerView);
                    recyclerView.setItemAnimator((AnonymousClass0UY) null);
                    C162457s7.A0D(findViewById);
                    this.A00 = recyclerView;
                    MutedStatusesViewModel mutedStatusesViewModel2 = this.A06;
                    if (mutedStatusesViewModel2 == null) {
                        throw C86604Kt.A0j();
                    }
                    AnonymousClass6C6.A02(this, mutedStatusesViewModel2.A00, new AnonymousClass62Y(this), 361);
                    return;
                }
                throw C18270x1.A0S("adapterFactory");
            }
            throw C18270x1.A0S("mutedStatusesViewModelFactory");
        }
        throw C18270x1.A0S("statusesViewModelFactory");
    }

    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            throw C18270x1.A0S("recylerView");
        }
        recyclerView.setAdapter((AnonymousClass0R6) null);
    }

    public MutedStatusesActivity() {
        this(0);
    }
}
