package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.91h  reason: invalid class name and case insensitive filesystem */
public class C1894391h implements C181808nM {
    public Object A00;
    public final int A01;

    public C1894391h(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BT1(C108985dt r6, UserJid userJid) {
        int i;
        int i2 = this.A01;
        C08240dc r4 = new C08240dc(((C003203q) this.A00).getSupportFragmentManager());
        if (i2 != 0) {
            i = 2;
            C162457s7.A0J(userJid, 0);
        } else {
            i = 0;
            C162457s7.A0J(userJid, 0);
        }
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("category_biz_id", userJid);
        A08.putInt("search_entry_point", i);
        A08.putParcelable("business_profile", r6);
        CatalogSearchFragment catalogSearchFragment = new CatalogSearchFragment();
        catalogSearchFragment.A0u(A08);
        r4.A0E(catalogSearchFragment, "CatalogSearchFragmentTag", R.id.catalog_search_host);
        r4.A01();
    }
}
