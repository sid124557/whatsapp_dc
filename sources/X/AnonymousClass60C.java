package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.60C  reason: invalid class name */
public final class AnonymousClass60C extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60C(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(1);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        C90254gy A1K = this.this$0.A1K();
        if (!bool.equals(A1K.A01)) {
            A1K.A01 = bool;
            A1K.A05();
        }
        BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
        businessProductListBaseFragment.A1N(businessProductListBaseFragment.A1K().B5J());
        return C59022wD.A00;
    }
}
