package X;

import com.whatsapp.community.communityInfo.CommunityHomeFragment;

/* renamed from: X.41U  reason: invalid class name */
public final class AnonymousClass41U extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CommunityHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41U(CommunityHomeFragment communityHomeFragment) {
        super(1);
        this.this$0 = communityHomeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        CommunityHomeFragment communityHomeFragment = this.this$0;
        C162457s7.A0H(bool);
        if (bool.booleanValue()) {
            AnonymousClass5WH r3 = communityHomeFragment.A02;
            if (r3 == null) {
                throw C18270x1.A0S("subgroupsComponent");
            }
            r3.A05.BiZ(new AnonymousClass4H2(r3, 0));
        }
        return C59022wD.A00;
    }
}
