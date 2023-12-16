package X;

import android.os.Bundle;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.5wW  reason: invalid class name and case insensitive filesystem */
public final class C119155wW extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119155wW(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Jid jid = (Jid) this.this$0.A0M.getValue();
        C162457s7.A0J(jid, 0);
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("category_biz_id", jid);
        A08.putInt("business_product_list_entry_point", 3);
        CatalogSearchProductListFragment catalogSearchProductListFragment = new CatalogSearchProductListFragment();
        catalogSearchProductListFragment.A0u(A08);
        return catalogSearchProductListFragment;
    }
}
