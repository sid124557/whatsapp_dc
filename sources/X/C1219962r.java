package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.62r  reason: invalid class name and case insensitive filesystem */
public final class C1219962r extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UserJid $selectedUserJid;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1219962r(CommunityMembersViewModel communityMembersViewModel, UserJid userJid) {
        super(1);
        this.this$0 = communityMembersViewModel;
        this.$selectedUserJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass29w r8 = (AnonymousClass29w) obj;
        C162457s7.A0J(r8, 0);
        if (!(r8 instanceof C36721zm) || !((AnonymousClass5XW) ((C36721zm) r8).A01).A04.isEmpty()) {
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            UserJid userJid = this.$selectedUserJid;
            C85524Gp r4 = communityMembersViewModel.A0P;
            do {
            } while (!r4.AzD(r4.getValue(), new C91714kw(userJid, new C119245wf(communityMembersViewModel), new C1213460e(communityMembersViewModel))));
        } else {
            CommunityMembersViewModel communityMembersViewModel2 = this.this$0;
            C84384Cd r1 = communityMembersViewModel2.A07;
            C27991fJ r3 = communityMembersViewModel2.A0K;
            UserJid userJid2 = this.$selectedUserJid;
            C162457s7.A0J(userJid2, 1);
            C51562k1 r12 = ((C64623Eg) r1).A09;
            synchronized (r12) {
                r12.A02(r3, Collections.singletonList(userJid2));
            }
            C85524Gp r2 = this.this$0.A0P;
            do {
            } while (!r2.AzD(r2.getValue(), C91734ky.A00));
        }
        return C59022wD.A00;
    }
}
