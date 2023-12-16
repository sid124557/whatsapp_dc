package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass49S;
import X.AnonymousClass4SG;
import X.AnonymousClass4X5;
import X.AnonymousClass5AV;
import X.AnonymousClass5PX;
import X.AnonymousClass5QZ;
import X.AnonymousClass5UX;
import X.AnonymousClass5XA;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C005205m;
import X.C100345Ao;
import X.C100485Bc;
import X.C100635Br;
import X.C102895Kr;
import X.C104335Qo;
import X.C105055Tk;
import X.C105365Uq;
import X.C106165Xw;
import X.C106715a2;
import X.C107695bk;
import X.C111095hX;
import X.C114015mM;
import X.C1223163x;
import X.C1225164r;
import X.C18280x3;
import X.C27991fJ;
import X.C44272Vj;
import X.C46632bx;
import X.C47122ck;
import X.C52882mC;
import X.C54042o5;
import X.C56892sj;
import X.C56942so;
import X.C56972sr;
import X.C620533h;
import X.C626936e;
import X.C64223Cq;
import X.C64333Db;
import X.C64773Ex;
import X.C66433Lk;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommunityMembersActivity extends C89644eZ {
    public AnonymousClass0R8 A00;
    public AnonymousClass5XA A01;
    public C54042o5 A02;
    public C44272Vj A03;
    public AnonymousClass49S A04;
    public C56942so A05;
    public C1225164r A06;
    public C1223163x A07;
    public AnonymousClass5UX A08;
    public C64773Ex A09;
    public AnonymousClass5ZU A0A;
    public C114015mM A0B;
    public C64223Cq A0C;
    public C56892sj A0D;
    public C620533h A0E;
    public C66433Lk A0F;
    public C105055Tk A0G;
    public C106165Xw A0H;
    public C106715a2 A0I;
    public Runnable A0J;
    public boolean A0K;

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r3 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r3, this, AnonymousClass4SG.A2t(r2, r3, this));
            this.A07 = (C1223163x) A2W.A3T.get();
            this.A02 = (C54042o5) r2.ANE.get();
            this.A0I = C18280x3.A0Q(r3);
            this.A0B = C64333Db.A29(r2);
            this.A08 = C86614Ku.A0R(r2);
            this.A09 = C64333Db.A26(r2);
            this.A0F = C86604Kt.A0e(r2);
            this.A0A = C64333Db.A28(r2);
            this.A0H = C86614Ku.A0l(r2);
            this.A0G = C86614Ku.A0k(r2);
            this.A0C = C86604Kt.A0T(r2);
            this.A05 = C64333Db.A1k(r2);
            this.A0E = (C620533h) r2.APC.get();
            this.A03 = (C44272Vj) r2.A5U.get();
            this.A0D = C64333Db.A3G(r2);
            this.A01 = (AnonymousClass5XA) r2.A24.get();
            this.A06 = (C1225164r) A2W.A0W.get();
            this.A04 = (AnonymousClass49S) A2W.A0V.get();
        }
    }

    public final void A74(AnonymousClass4X5 r7, List list, boolean z) {
        if (z) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(r7.A0C);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass5QZ r3 = (AnonymousClass5QZ) it.next();
                GroupJid groupJid = r7.A0L;
                if (groupJid != null && C86624Kv.A0J(r7.A0I, groupJid, r3.A04) == null) {
                    A0s.add(new AnonymousClass5PX(2, r3));
                }
            }
            A0s.add(r7.A0A);
            r7.A0K(A0s);
            return;
        }
        C86624Kv.A1M(this.A04, r7, list, 33);
    }

    public void onCreate(Bundle bundle) {
        GroupJid groupJid;
        super.onCreate(bundle);
        A61("load_community_member");
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, AnonymousClass1Hf.A28(this));
        this.A00 = A2S;
        A2S.A0Q(true);
        this.A00.A0N(true);
        this.A00.A0B(R.string.f11nameremoved);
        C105365Uq A062 = this.A0B.A06(this, "community-view-members");
        RecyclerView recyclerView = (RecyclerView) C005205m.A00(this, R.id.community_members_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C27991fJ A0k = C86634Kw.A0k(getIntent(), "extra_community_jid");
        C626936e.A06(A0k);
        boolean A1N = AnonymousClass0x9.A1N(getIntent(), "extra_non_cag_members_view");
        C52882mC A002 = this.A05.A0H.A00(A0k);
        if (A002 != null) {
            groupJid = A002.A02;
        } else {
            groupJid = null;
        }
        C46632bx Azz = this.A04.Azz(this, A0k, 2);
        CommunityMembersViewModel A003 = AnonymousClass5AV.A00(this, this.A07, A0k);
        C1225164r r4 = this.A06;
        C56972sr r14 = this.A01;
        AnonymousClass5Y0 r2 = this.A0C;
        AnonymousClass4X5 B0M = r4.B0M(new C102895Kr(this.A01, r14, this, Azz, A003, this.A09, this.A0A, r2), A062, groupJid, A0k);
        B0M.A0E(true);
        recyclerView.setAdapter(B0M);
        AnonymousClass6C6.A01(this, A003.A01, 106);
        A003.A00.A0B(this, new C100635Br(B0M, this, 0, A1N));
        A003.A02.A0B(this, new C100345Ao(0, B0M, A1N));
        AnonymousClass1VX r15 = this.A0D;
        C106715a2 r1 = this.A0I;
        C111095hX r9 = this.A00;
        C64773Ex r12 = this.A09;
        C66433Lk r0 = this.A0F;
        A003.A03.A0B(this, new C100485Bc(new C104335Qo(r9, this, A003, r12, this.A0A, this.A08, r15, r0, r1), A0k, this, 2));
    }

    public CommunityMembersActivity(int i) {
        this.A0K = false;
        AnonymousClass68W.A00(this, 27);
    }

    public C47122ck A5u() {
        C47122ck A5u = super.A5u();
        A5u.A05 = true;
        return A5u;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            this.A0C.A08();
            this.A0G.A00();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0J;
        if (runnable != null) {
            this.A05.A0R(runnable);
        }
    }

    public int A5t() {
        return 579545668;
    }

    public CommunityMembersActivity() {
        this(0);
    }
}
