package X;

import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import java.util.List;

/* renamed from: X.8Y8  reason: invalid class name */
public final class AnonymousClass8Y8 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Y8(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(1);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
        C162457s7.A0H(list);
        AnonymousClass6HV r0 = catalogAllCategoryFragment.A03;
        if (r0 == null) {
            throw C18270x1.A0S("categoryListAdapter");
        }
        r0.A0L(list);
        return C59022wD.A00;
    }
}
