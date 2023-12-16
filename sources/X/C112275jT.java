package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5jT  reason: invalid class name and case insensitive filesystem */
public class C112275jT implements C186048uf, C184408rk {
    public C95444tg A00;
    public C171328Gq A01;
    public C171338Gr A02;
    public C171348Gs A03;
    public C114425n1 A04;
    public C171318Gp A05;
    public C114385mx A06;
    public C114415n0 A07;
    public C114395my A08;
    public C184168rM A09;
    public C184178rN A0A;
    public C184188rO A0B;
    public C184198rP A0C;
    public C112315jX A0D;
    public C112285jU A0E;
    public AnonymousClass7HD A0F;
    public C149347Mc A0G;
    public BusinessDirectoryContextualSearchViewModel A0H;
    public final AnonymousClass64T A0I;
    public final AnonymousClass64U A0J;
    public final AnonymousClass64V A0K;
    public final AnonymousClass64W A0L;
    public final AnonymousClass64X A0M;
    public final AnonymousClass64Y A0N;
    public final AnonymousClass64Z A0O;
    public final C1223464a A0P;
    public final C1223564b A0Q;
    public final C105705Wb A0R;
    public final C64773Ex A0S;
    public final AnonymousClass5GG A0T;
    public final C105355Up A0U;
    public final C83964Am A0V;
    public final Set A0W = AnonymousClass002.A0K();

    public void B34(String str, List list, List list2) {
        A00();
        C171348Gs r2 = new C171348Gs(this, list);
        this.A03 = r2;
        C90664i0 B0E = this.A0N.B0E(r2, this.A0T.A00, (AnonymousClass5ZI) null, (String) null, list, list2);
        B0E.A08();
        this.A00 = B0E;
    }

    public void B39(AnonymousClass5ZO r14, int i) {
        C90624hw r1;
        A00();
        AnonymousClass64X r2 = this.A0M;
        C59722xN r10 = this.A0T.A00;
        C124006Ap r22 = (C124006Ap) r2;
        int i2 = r22.A01;
        Object obj = r22.A00;
        AnonymousClass5ZO r5 = r14;
        if (i2 != 0) {
            C64333Db r12 = ((C118065sw) obj).A02;
            C55682qk A012 = C64333Db.A01(r12);
            AnonymousClass4FS A8y = C64333Db.A8y(r12);
            C620733j A2t = C64333Db.A2t(r12);
            AnonymousClass1VX A4B = C64333Db.A4B(r12);
            C107695bk r0 = r12.A00;
            r1 = new C90624hw(A012, r0.AIq(), C107695bk.A0d(r0), r5, C86624Kv.A0R(r12), A2t, A4B, this, r10, C107695bk.A2m(r0), A8y);
        } else {
            C64333Db r13 = ((C118075sx) obj).A03;
            C55682qk A013 = C64333Db.A01(r13);
            AnonymousClass4FS A8y2 = C64333Db.A8y(r13);
            C620733j A2t2 = C64333Db.A2t(r13);
            AnonymousClass1VX A4B2 = C64333Db.A4B(r13);
            C107695bk r02 = r13.A00;
            r1 = new C90624hw(A013, r02.AIq(), C107695bk.A0d(r02), r5, C86624Kv.A0R(r13), A2t2, A4B2, this, r10, C107695bk.A2m(r02), A8y2);
        }
        r1.A00 = "2.0";
        r1.A08();
        this.A00 = r1;
    }

    public void A00() {
        if (this instanceof C90714i5) {
            C95444tg r3 = this.A00;
            if (r3 != null && r3.A07.A06() != 2) {
                AnonymousClass5ZM r1 = r3.A07;
                if (!C18320x8.A1T(r1)) {
                    r1.A0D(true);
                    this.A00 = null;
                    return;
                }
                return;
            }
            return;
        }
        C95444tg r0 = this.A00;
        if (r0 != null && r0.A07.A06() != 2 && !C18320x8.A1T(this.A00.A07)) {
            this.A00.A07.A0D(true);
            this.A00 = null;
        }
    }

    public void AyZ() {
        Log.d("cancelAdditionalBusinessDataRequests");
        Set<AnonymousClass8E7> set = this.A0W;
        for (AnonymousClass8E7 r0 : set) {
            AnonymousClass5ZM r2 = r0.A07;
            if (r2.A06() != 2 && !C18320x8.A1T(r2)) {
                r2.A0D(true);
            }
        }
        set.clear();
    }

    public void B33(AnonymousClass5ZO r15) {
        C90644hy r1;
        C95444tg r12 = this.A00;
        if (!(r12 instanceof C90694i3) && !(r12 instanceof C90674i1)) {
            A00();
        }
        C171318Gp r10 = new C171318Gp(this);
        this.A05 = r10;
        AnonymousClass64Z r2 = this.A0O;
        C59722xN r11 = this.A0T.A00;
        C123936Ai r22 = (C123936Ai) r2;
        int i = r22.A01;
        Object obj = r22.A00;
        AnonymousClass5ZO r5 = r15;
        if (i != 0) {
            C64333Db r13 = ((C118065sw) obj).A02;
            AnonymousClass1VX A4B = C64333Db.A4B(r13);
            C55682qk A012 = C64333Db.A01(r13);
            C54292oU A2q = C64333Db.A2q(r13);
            AnonymousClass4FS A8y = C64333Db.A8y(r13);
            C620733j A2t = C64333Db.A2t(r13);
            C107695bk r0 = r13.A00;
            r1 = new C90644hy(A012, r0.AIq(), C107695bk.A0d(r0), r5, A2q, C86624Kv.A0R(r13), A2t, A4B, r10, r11, C107695bk.A2m(r0), A8y);
        } else {
            C64333Db r14 = ((C118075sx) obj).A03;
            AnonymousClass1VX A4B2 = C64333Db.A4B(r14);
            C55682qk A013 = C64333Db.A01(r14);
            C54292oU A2q2 = C64333Db.A2q(r14);
            AnonymousClass4FS A8y2 = C64333Db.A8y(r14);
            C620733j A2t2 = C64333Db.A2t(r14);
            C107695bk r02 = r14.A00;
            r1 = new C90644hy(A013, r02.AIq(), C107695bk.A0d(r02), r5, A2q2, C86624Kv.A0R(r14), A2t2, A4B2, r10, r11, C107695bk.A2m(r02), A8y2);
        }
        r1.A08();
        this.A00 = r1;
    }

    public void B35(AnonymousClass7H6 r14, C150967Sx r15, AnonymousClass5ZO r16, String str) {
        if (!(this.A00 instanceof C90644hy)) {
            A00();
        }
        AnonymousClass5ZO r4 = r16;
        C114425n1 r6 = new C114425n1(r4, this, (Jid) null);
        this.A04 = r6;
        C90694i3 B0D = this.A0J.B0D(r14, r15, r4, (C166447yh) null, r6, this.A0T.A00, (AnonymousClass5ZI) null, "all_descendents", "all_descendents", str, "nearby");
        B0D.A08();
        this.A00 = B0D;
    }

    public void B3B(AnonymousClass7H6 r18, C150967Sx r19, AnonymousClass5ZO r20, Jid jid, String str) {
        C95444tg B0D;
        A00();
        AnonymousClass7H6 r6 = r18;
        C150967Sx r7 = r19;
        AnonymousClass5ZO r8 = r20;
        Jid jid2 = jid;
        if (this.A0U.A01()) {
            C171338Gr r12 = new C171338Gr(r8, this);
            this.A02 = r12;
            AnonymousClass64V r3 = this.A0K;
            C59722xN r13 = this.A0T.A00;
            C123966Al r32 = (C123966Al) r3;
            int i = r32.A01;
            Object obj = r32.A00;
            if (i != 0) {
                C64333Db r2 = ((C118065sw) obj).A02;
                AnonymousClass1VX A4B = C64333Db.A4B(r2);
                C55682qk A012 = C64333Db.A01(r2);
                AnonymousClass4FS A8y = C64333Db.A8y(r2);
                C620733j A2t = C64333Db.A2t(r2);
                C107695bk r1 = r2.A00;
                B0D = new C90684i2(A012, r1.AIq(), C107695bk.A0d(r1), r6, r7, r8, C86624Kv.A0R(r2), A2t, A4B, r12, r13, jid2, C107695bk.A2m(r1), A8y);
            } else {
                C64333Db r22 = ((C118075sx) obj).A03;
                AnonymousClass1VX A4B2 = C64333Db.A4B(r22);
                C55682qk A013 = C64333Db.A01(r22);
                AnonymousClass4FS A8y2 = C64333Db.A8y(r22);
                C620733j A2t2 = C64333Db.A2t(r22);
                C107695bk r14 = r22.A00;
                B0D = new C90684i2(A013, r14.AIq(), C107695bk.A0d(r14), r6, r7, r8, C86624Kv.A0R(r22), A2t2, A4B2, r12, r13, jid2, C107695bk.A2m(r14), A8y2);
            }
        } else {
            C114425n1 r10 = new C114425n1(r8, this, jid2);
            this.A04 = r10;
            B0D = this.A0J.B0D(r6, r7, r8, (C166447yh) null, r10, this.A0T.A00, (AnonymousClass5ZI) null, "all_descendents", "all_descendents", str, "chaining");
        }
        B0D.A08();
        this.A00 = B0D;
    }

    public void BSO(AnonymousClass7T4 r4, int i) {
        AnonymousClass7HD r2 = this.A0F;
        if (r2 != null) {
            C149337Mb r1 = r2.A01;
            r1.A01 = 4;
            r1.A00 = i;
            r2.A00.A0G(r1);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C149337Mb r1;
        List list = (List) obj;
        AnonymousClass7HD r7 = this.A0F;
        if (r7 != null) {
            if (list.isEmpty()) {
                r1 = r7.A01;
                r1.A01 = 3;
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                int i = 0;
                while (i < list.size()) {
                    C166447yh r4 = (C166447yh) list.get(i);
                    i++;
                    A0s.add(new C96344wD(new AnonymousClass54H(r7, r4, i, 0), r4.A00, r4.A01));
                }
                r1 = r7.A01;
                r1.A01 = 1;
                List list2 = r1.A03;
                list2.clear();
                list2.addAll(A0s);
            }
            r7.A00.A0G(r1);
        }
    }

    public C112275jT(AnonymousClass64T r2, AnonymousClass64U r3, AnonymousClass64V r4, AnonymousClass64W r5, AnonymousClass64X r6, AnonymousClass64Y r7, AnonymousClass64Z r8, C1223464a r9, C1223564b r10, C105705Wb r11, C64773Ex r12, AnonymousClass5GG r13, C105355Up r14, C83964Am r15) {
        this.A0S = r12;
        this.A0U = r14;
        this.A0T = r13;
        this.A0L = r5;
        this.A0O = r8;
        this.A0Q = r10;
        this.A0P = r9;
        this.A0K = r4;
        this.A0V = r15;
        this.A0J = r3;
        this.A0N = r7;
        this.A0M = r6;
        this.A0I = r2;
        this.A0R = r11;
    }
}
