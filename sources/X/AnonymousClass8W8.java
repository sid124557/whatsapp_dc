package X;

import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;

/* renamed from: X.8W8  reason: invalid class name */
public final class AnonymousClass8W8 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8W8(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(0);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
        AnonymousClass5F1 r0 = catalogAllCategoryFragment.A02;
        if (r0 != null) {
            return new CategoryThumbnailLoader(catalogAllCategoryFragment, r0.A00.A01.ABV());
        }
        throw C18270x1.A0S("thumbnailLoaderFactory");
    }
}
