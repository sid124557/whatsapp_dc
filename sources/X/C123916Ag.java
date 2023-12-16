package X;

import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.newsletter.viewmodel.NewsletterListViewModel;

/* renamed from: X.6Ag  reason: invalid class name and case insensitive filesystem */
public class C123916Ag implements C17190ui {
    public Object A00;
    public final int A01;

    public C123916Ag(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C05550Ty Azr(Class cls) {
        switch (this.A01) {
            case 0:
                if (cls.isAssignableFrom(C87644Uc.class)) {
                    return new C87644Uc();
                }
                throw AnonymousClass001.A0c("Invalid UIModeViewModel for DialogActivity");
            case 1:
                GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) this.A00;
                AnonymousClass7CL r1 = groupMembershipApprovalRequestsFragment.A00;
                if (r1 != null) {
                    C27991fJ r13 = groupMembershipApprovalRequestsFragment.A06;
                    if (r13 != null) {
                        C56612sH A2p = C64333Db.A2p(r1.A00.A04);
                        C118055sv r12 = r1.A00;
                        C64333Db r0 = r12.A04;
                        AnonymousClass4FS A8y = C64333Db.A8y(r0);
                        C56982ss A39 = C64333Db.A39(r0);
                        AnonymousClass4FV A4H = C64333Db.A4H(r0);
                        C64773Ex A26 = C64333Db.A26(r0);
                        C56942so A1k = C64333Db.A1k(r0);
                        AnonymousClass5ZU A28 = C64333Db.A28(r0);
                        C56892sj A3G = C64333Db.A3G(r0);
                        C64333Db r3 = r12.A03.A1B;
                        AnonymousClass4FS A0g = C86604Kt.A0g(r3);
                        return new AnonymousClass4V4(A1k, A26, A28, A2p, A39, (C54442oj) r0.AGZ.get(), A3G, A4H, new AnonymousClass2RH((C54442oj) r3.AGZ.get(), (AnonymousClass3DL) r3.AGa.get(), C86614Ku.A0c(r3), (C53022mQ) r3.ARQ.get(), A0g), r13, A8y);
                    }
                    throw C18270x1.A0S("groupJid");
                }
                throw C18270x1.A0S("pendingRequestsViewModelFactory");
            default:
                C64333Db r32 = ((C101025De) this.A00).A00.A03;
                C56842se A66 = C64333Db.A66(r32);
                return new NewsletterListViewModel((C29311ic) r32.ANW.get(), (C113835m4) r32.A00.A8E.get(), A66);
        }
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return C86604Kt.A0K(this, cls);
    }
}
