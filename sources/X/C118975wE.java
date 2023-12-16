package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5wE  reason: invalid class name and case insensitive filesystem */
public final class C118975wE extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118975wE(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(0);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
        UserJid A1L = businessProductListBaseFragment.A1L();
        C181728nE r0 = this.this$0.A03;
        if (r0 != null) {
            return C86604Kt.A0L(businessProductListBaseFragment, r0, A1L);
        }
        throw C18270x1.A0S("cartMenuViewModelFactory");
    }
}
