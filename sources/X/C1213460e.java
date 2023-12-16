package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.60e  reason: invalid class name and case insensitive filesystem */
public final class C1213460e extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1213460e(CommunityMembersViewModel communityMembersViewModel) {
        super(1);
        this.this$0 = communityMembersViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        C162457s7.A0J(userJid, 0);
        CommunityMembersViewModel communityMembersViewModel = this.this$0;
        if (communityMembersViewModel.A09.A0F()) {
            communityMembersViewModel.A0F(userJid);
        } else {
            C85524Gp r3 = communityMembersViewModel.A0P;
            do {
            } while (!r3.AzD(r3.getValue(), new C91704kv(new C119235we(communityMembersViewModel))));
        }
        return C59022wD.A00;
    }
}
