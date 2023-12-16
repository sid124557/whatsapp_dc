package X;

import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

/* renamed from: X.8W9  reason: invalid class name */
public final class AnonymousClass8W9 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8W9(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(0);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.this$0;
        AnonymousClass5F1 r0 = catalogCategoryExpandableGroupsListFragment.A03;
        if (r0 != null) {
            return new CategoryThumbnailLoader(catalogCategoryExpandableGroupsListFragment, r0.A00.A01.ABV());
        }
        throw C18270x1.A0S("thumbnailLoaderFactory");
    }
}
