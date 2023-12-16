package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.8VQ  reason: invalid class name */
public final class AnonymousClass8VQ extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8VQ(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(0);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
        C181798nL r1 = businessProductListBaseFragment.A08;
        if (r1 != null) {
            return r1.Azv(businessProductListBaseFragment.A1L());
        }
        throw C18270x1.A0S("catalogListRepositoryFactory");
    }
}
