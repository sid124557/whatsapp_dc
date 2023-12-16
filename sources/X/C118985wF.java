package X;

import android.app.Application;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;

/* renamed from: X.5wF  reason: invalid class name and case insensitive filesystem */
public final class C118985wF extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CollectionProductListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118985wF(CollectionProductListFragment collectionProductListFragment) {
        super(0);
        this.this$0 = collectionProductListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CollectionProductListFragment collectionProductListFragment = this.this$0;
        Application application = collectionProductListFragment.A0R().getApplication();
        CollectionProductListFragment collectionProductListFragment2 = this.this$0;
        AnonymousClass5Y9 r2 = collectionProductListFragment2.A06;
        if (r2 != null) {
            AnonymousClass5QB r1 = collectionProductListFragment2.A05;
            if (r1 != null) {
                return AnonymousClass4L0.A0F(new C110595gi(application, r1, r2), collectionProductListFragment).A01(C87584Tn.class);
            }
            throw C18270x1.A0S("categoriesLogger");
        }
        throw C18270x1.A0S("catalogManager");
    }
}
