package com.whatsapp.polls;

import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass4SG;
import X.AnonymousClass4W7;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.AnonymousClass6HI;
import X.C101105Dm;
import X.C101115Dn;
import X.C101135Dp;
import X.C105365Uq;
import X.C107395bF;
import X.C107695bk;
import X.C114015mM;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C25251aD;
import X.C30451mT;
import X.C55832qz;
import X.C617532c;
import X.C624134x;
import X.C626936e;
import X.C64333Db;
import X.C66543Lv;
import X.C86614Ku;
import X.C86654Ky;
import X.C88834as;
import X.C89644eZ;
import X.C95814uZ;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public class PollResultsActivity extends C89644eZ {
    public C101105Dm A00;
    public C101115Dn A01;
    public C101135Dp A02;
    public C105365Uq A03;
    public C114015mM A04;
    public C66543Lv A05;
    public C617532c A06;
    public AnonymousClass4W7 A07;
    public PollResultsViewModel A08;
    public C30451mT A09;
    public C55832qz A0A;
    public boolean A0B;

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A00 = (C101105Dm) A2W.A1k.get();
            this.A01 = (C101115Dn) A2W.A1l.get();
            this.A02 = (C101135Dp) A2W.A1m.get();
            this.A04 = C64333Db.A29(r2);
            this.A05 = C86614Ku.A0Z(r2);
            this.A0A = C64333Db.A8F(r2);
            this.A06 = (C617532c) r1.A9D.get();
        }
    }

    public void onBackPressed() {
        PollResultsViewModel pollResultsViewModel = this.A08;
        if (pollResultsViewModel.A01 != -1) {
            pollResultsViewModel.A01 = -1;
            pollResultsViewModel.A0D();
            return;
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        PollResultsViewModel pollResultsViewModel = this.A08;
        pollResultsViewModel.A0C.A07(pollResultsViewModel.A0B);
        super.onDestroy();
    }

    public PollResultsActivity(int i) {
        this.A0B = false;
        AnonymousClass68W.A00(this, 70);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, AnonymousClass1Hf.A28(this));
        A2S.A0N(true);
        A2S.A0B(R.string.f11nameremoved);
        C624134x A052 = this.A0A.A05(C107395bF.A02(getIntent()));
        C626936e.A06(A052);
        this.A09 = (C30451mT) A052;
        this.A03 = this.A04.A06(getBaseContext(), "poll-results-activity");
        PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) AnonymousClass0x9.A0H(this).A01(PollResultsViewModel.class);
        this.A08 = pollResultsViewModel;
        AnonymousClass6C6.A01(this, pollResultsViewModel.A0F, 269);
        AnonymousClass6C6.A01(this, this.A08.A0E, 270);
        PollResultsViewModel pollResultsViewModel2 = this.A08;
        pollResultsViewModel2.A0C.A06(pollResultsViewModel2.A0B);
        RecyclerView A0P = C86654Ky.A0P(this.A00, R.id.poll_results_users_recycler_view);
        C18270x1.A0u(A0P);
        AnonymousClass6HI r2 = new AnonymousClass6HI();
        PollResultsViewModel pollResultsViewModel3 = this.A08;
        AnonymousClass4W7 r1 = new AnonymousClass4W7(r2, this.A00, this.A01, this.A02, this.A03, pollResultsViewModel3);
        this.A07 = r1;
        A0P.setAdapter(r1);
        C617532c r3 = this.A06;
        C30451mT r22 = this.A09;
        C162457s7.A0J(r22, 0);
        C25251aD r12 = new C25251aD();
        C95814uZ r0 = r22.A1J.A00;
        if (r0 != null) {
            r3.A02(r12, r0);
        }
        C617532c.A01(r12, r22);
        r12.A04 = C18290x4.A0b();
        C617532c.A00(r12, (C95814uZ) null, r22);
        r3.A01.BhD(r12);
        this.A08.A0F(this.A09);
    }

    public PollResultsActivity() {
        this(0);
    }
}
