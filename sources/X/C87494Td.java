package X;

import android.os.Bundle;
import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4Td  reason: invalid class name and case insensitive filesystem */
public final class C87494Td extends AnonymousClass0AY {
    public List A00;

    public C87494Td(C08270df r2) {
        super(r2, 1);
    }

    public /* bridge */ /* synthetic */ CharSequence A04(int i) {
        List list = this.A00;
        if (list != null) {
            return ((AnonymousClass7ZH) list.get(i)).A02;
        }
        throw C18270x1.A0S("tabItemsList");
    }

    public int A0C() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        throw C18270x1.A0S("tabItemsList");
    }

    public C08310eF A0G(int i) {
        List list = this.A00;
        if (list == null) {
            throw C18270x1.A0S("tabItemsList");
        }
        AnonymousClass7ZH r1 = (AnonymousClass7ZH) list.get(i);
        if (r1.A03) {
            UserJid userJid = r1.A00;
            String str = r1.A01;
            Bundle A08 = AnonymousClass002.A08();
            A08.putParcelable("category_biz_id", userJid);
            A08.putString("collection-id", str);
            A08.putString("collection-index", (String) null);
            A08.putInt("business_product_list_entry_point", 2);
            A08.putInt("category_browsing_entry_point", 3);
            A08.putInt("category_level", 1);
            CollectionProductListFragment collectionProductListFragment = new CollectionProductListFragment();
            collectionProductListFragment.A0u(A08);
            return collectionProductListFragment;
        }
        String str2 = r1.A01;
        UserJid userJid2 = r1.A00;
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("parent_category_id", str2);
        A082.putParcelable("category_biz_id", userJid2);
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = new CatalogCategoryExpandableGroupsListFragment();
        catalogCategoryExpandableGroupsListFragment.A0u(A082);
        return catalogCategoryExpandableGroupsListFragment;
    }
}
