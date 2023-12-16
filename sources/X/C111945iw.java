package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5iw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111945iw implements C181808nM {
    public final /* synthetic */ CatalogCategoryTabsActivity A00;

    public final void BT1(C108985dt r6, UserJid userJid) {
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.A00;
        C162457s7.A0J(userJid, 1);
        C08240dc A0J = AnonymousClass0x2.A0J(catalogCategoryTabsActivity);
        if (catalogCategoryTabsActivity.A02 != null) {
            Bundle A08 = AnonymousClass002.A08();
            A08.putParcelable("category_biz_id", userJid);
            A08.putInt("search_entry_point", 1);
            A08.putParcelable("business_profile", r6);
            CatalogSearchFragment catalogSearchFragment = new CatalogSearchFragment();
            catalogSearchFragment.A0u(A08);
            A0J.A0E(catalogSearchFragment, "CategoryTabsSearchFragmentTag", R.id.catalog_search_host);
            A0J.A01();
            return;
        }
        throw C18270x1.A0S("catalogSearchFragmentFactory");
    }

    public /* synthetic */ C111945iw(CatalogCategoryTabsActivity catalogCategoryTabsActivity) {
        this.A00 = catalogCategoryTabsActivity;
    }
}
