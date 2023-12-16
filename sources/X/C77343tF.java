package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;

/* renamed from: X.3tF  reason: invalid class name and case insensitive filesystem */
public final class C77343tF extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CAGInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77343tF(CAGInfoViewModel cAGInfoViewModel) {
        super(0);
        this.this$0 = cAGInfoViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CAGInfoViewModel cAGInfoViewModel = this.this$0;
        C27991fJ r2 = cAGInfoViewModel.A04;
        if (r2 != null) {
            return new C65163Gl(new C67333Ow(cAGInfoViewModel), r2);
        }
        throw C18270x1.A0S("cagJid");
    }
}
