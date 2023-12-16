package X;

import android.content.Context;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesViewModel;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.6Ax  reason: invalid class name and case insensitive filesystem */
public class C124086Ax implements C17190ui {
    public Object A00;
    public Object A01;
    public final int A02;

    public C124086Ax(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static AnonymousClass0XL A00(C15940sD r2, Object obj, Object obj2, int i) {
        return new AnonymousClass0XL((C17190ui) new C124086Ax(obj, i, obj2), r2);
    }

    public /* synthetic */ C05550Ty Azr(Class cls) {
        Object value;
        C56892sj r1;
        C27991fJ r5;
        switch (this.A02) {
            case 0:
                throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 1:
                throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 2:
                return new C125196Gs((C27991fJ) this.A01, (C53232ml) ((AnonymousClass7CJ) this.A00).A00.A04.AOY.get());
            case 3:
                C64333Db r0 = ((C101455Ev) this.A00).A00.A01.A4Z;
                C55682qk A0U = C86634Kw.A0U(r0);
                AnonymousClass31C A0c = C86614Ku.A0c(r0);
                C64773Ex A0P = C86604Kt.A0P(r0);
                return new AnonymousClass4VM(new C102585Jk(A0U, (C48352el) r0.A7i.get(), C86654Ky.A0W(r0), A0P, A0c), (C27991fJ) this.A01);
            case 4:
                C64333Db r12 = ((C112655k5) ((C1223163x) this.A00)).A00.A03;
                C56972sr A06 = C64333Db.A06(r12);
                AnonymousClass5ZU A28 = C64333Db.A28(r12);
                C64773Ex A26 = C64333Db.A26(r12);
                C29421in A0S = C86614Ku.A0S(r12);
                C84384Cd AiI = r12.AiI();
                C50932j0 A1A = C86664Kz.A1A(r12);
                C56892sj A3G = C64333Db.A3G(r12);
                AnonymousClass46Q r20 = AnonymousClass2C4.A01;
                C615931l.A00(r20);
                C29441ip A24 = C64333Db.A24(r12);
                C29241iV A0T = C86624Kv.A0T(r12);
                AnonymousClass31C A0c2 = C86614Ku.A0c(r12.A00.ACP);
                C162457s7.A0J(A0c2, 0);
                CommunityMembersViewModel communityMembersViewModel = new CommunityMembersViewModel(A06, (C54042o5) r12.ANE.get(), AiI, new AnonymousClass5G2(A0c2), A24, A26, A0S, A28, A3G, A1A, A0T, (C27991fJ) this.A01, r20);
                C85524Gp r6 = communityMembersViewModel.A0N;
                do {
                    value = r6.getValue();
                    r1 = communityMembersViewModel.A0E;
                    r5 = communityMembersViewModel.A0K;
                } while (!r6.AzD(value, new C104485Rd(r1.A0D(r5) ^ true ? 1 : 0, (Integer) null)));
                C54042o5 r13 = communityMembersViewModel.A06;
                ((C61102zi) r13.A0C.get()).A06(communityMembersViewModel.A05);
                communityMembersViewModel.A0B.A06(communityMembersViewModel.A0C);
                communityMembersViewModel.A0I.A06(communityMembersViewModel.A0J);
                communityMembersViewModel.A0G.A00(communityMembersViewModel.A0F);
                communityMembersViewModel.A0E();
                C64623Eg r3 = (C64623Eg) communityMembersViewModel.A07;
                if (!r3.A08.A0D(r5)) {
                    Log.d("Attempted to fetch members when not admin");
                    return communityMembersViewModel;
                }
                C58372v9 r14 = new C58372v9(r3.A0D);
                AnonymousClass5HT r4 = new AnonymousClass5HT(r3, r5);
                AnonymousClass31C r8 = r14.A00;
                String A03 = r8.A03();
                C35721xK r15 = new C35721xK(new C35481ww(r5, new C35381wm(A03, 7)), 17);
                AnonymousClass36K r10 = r15.A00;
                C162457s7.A0D(r10);
                r8.A0D(new AnonymousClass93F(r4, 0, r15), r10, A03, 349, C58372v9.A01);
                return communityMembersViewModel;
            case 5:
                C64333Db r02 = ((AnonymousClass8G2) ((C179238ip) this.A00)).A00.A03;
                C56892sj A3G2 = C64333Db.A3G(r02);
                C52472lX A0W = C86644Kx.A0W(r02);
                return new AnonymousClass4UU(C64333Db.A26(r02), A3G2, (AnonymousClass3ZH) this.A01, A0W, C64333Db.A8y(r02));
            case 6:
                throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 7:
                C64333Db r03 = ((C101445Eu) this.A01).A00.A03;
                C29421in A0S2 = C86614Ku.A0S(r03);
                C52472lX A0W2 = C86644Kx.A0W(r03);
                AnonymousClass4Ul r7 = new AnonymousClass4Ul(A0S2, C86634Kw.A0f(r03), (AnonymousClass3ZH) this.A00, A0W2);
                AnonymousClass3ZH A012 = r7.A03.A01(C106405Yw.A03(r7.A00.A0H));
                r7.A00 = A012;
                AnonymousClass4UC r16 = r7.A05;
                C52472lX r2 = r7.A04;
                C06270Wx.A05(r16, r2.A00(A012));
                C06270Wx.A05(r7.A06, r2.A00(r7.A00));
                return r7;
            case 8:
                return new C87674Ui((C95814uZ) this.A01, C86664Kz.A1D(((AnonymousClass5DC) this.A00).A00.A03));
            case 9:
                C05550Ty r72 = (C05550Ty) cls.cast(new AnonymousClass4UF(((int[]) this.A01)[0]));
                Objects.requireNonNull(r72);
                return r72;
            case 10:
                throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 11:
                C64333Db r32 = ((AnonymousClass5DR) this.A00).A00.A03;
                C56842se A66 = C64333Db.A66(r32);
                return new NewsletterViewModel((C95804uY) this.A01, (C29311ic) r32.ANW.get(), (C113835m4) r32.A00.A8E.get(), A66);
            case 12:
                C88834as r17 = ((C101175Dt) this.A00).A00.A01;
                C101185Du r22 = (C101185Du) r17.A0H.get();
                C101205Dw r18 = (C101205Dw) r17.A0G.get();
                AnonymousClass46Q r04 = AnonymousClass2C4.A01;
                C615931l.A00(r04);
                return new StatusSeeAllViewModel(r22, r18, (StatusesViewModel) this.A01, r04);
            case 13:
                C118075sx r23 = ((AnonymousClass5E3) this.A00).A00;
                AnonymousClass4FS A8y = C64333Db.A8y(r23.A03);
                return new MutedStatusesViewModel((AnonymousClass5E4) r23.A01.A3d.get(), (StatusesViewModel) this.A01, A8y);
            default:
                return new C87634Ub(new C88844at(new C101485Ey(C389229y.A01((Context) this.A01).AcK).A00));
        }
    }

    public C05550Ty B09(AnonymousClass0N3 r12, Class cls) {
        switch (this.A02) {
            case 0:
                C64333Db r1 = ((C101125Do) this.A01).A00.A03;
                AnonymousClass33p A2s = C64333Db.A2s(r1);
                AnonymousClass5Y9 r6 = (AnonymousClass5Y9) r1.A4Y.get();
                C104975Tb AhS = r1.AhS();
                return new AnonymousClass4V2((C48372en) r1.A3x.get(), r6, new C150397Qo(), AhS, A2s, (UserJid) this.A00);
            case 1:
                C118075sx r2 = ((C101435Et) this.A00).A00;
                return new C91514kI((C39512Cg) r2.A01.A3G.get(), (C95814uZ) this.A01, C64333Db.A8y(r2.A03));
            case 6:
                C64333Db r0 = ((AnonymousClass5DV) this.A01).A00.A03;
                C55832qz A8F = C64333Db.A8F(r0);
                return new C87654Ud(C64333Db.A3K(r0), (AnonymousClass2z0) this.A00, A8F);
            case 10:
                C118075sx r22 = ((C114585nH) ((C1223363z) this.A00)).A00;
                return new C22411Nc((C39512Cg) r22.A01.A3G.get(), (C95814uZ) this.A01, C64333Db.A8y(r22.A03));
            default:
                return C86604Kt.A0K(this, cls);
        }
    }
}
