package X;

import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.930  reason: invalid class name */
public class AnonymousClass930 implements AnonymousClass4CK {
    public Object A00;
    public final int A01;

    public AnonymousClass930(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ void BNp(UserJid userJid) {
    }

    public void BNs(UserJid userJid) {
        switch (this.A01) {
            case 0:
                C87604Ty r1 = (C87604Ty) this.A00;
                if (r1.A07.equals(userJid)) {
                    r1.A0E();
                    return;
                }
                return;
            case 1:
                CatalogListActivity catalogListActivity = (CatalogListActivity) this.A00;
                if (catalogListActivity.A0M.equals(userJid) && !catalogListActivity.A01.A0a(catalogListActivity.A0M)) {
                    catalogListActivity.A76();
                    return;
                }
                return;
            case 2:
                C131766e9.A0C(this.A00, userJid);
                return;
            case 3:
                C90514ha r12 = (C90514ha) this.A00;
                if (r12.A0r.equals(userJid)) {
                    AnonymousClass8EO r3 = r12.A0k.A0H;
                    r3.A04.BkM(new C117115rP(r3, 42));
                    return;
                }
                return;
            case 4:
                C162457s7.A0J(userJid, 0);
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
                if (userJid.equals(catalogSearchFragment.A0M.getValue())) {
                    C620433g r2 = catalogSearchFragment.A0B;
                    if (r2 != null) {
                        r2.A06(new C1898092s(catalogSearchFragment, 4), userJid);
                        return;
                    }
                    throw C18270x1.A0S("businessProfileManager");
                }
                return;
            case 5:
                ((AnonymousClass7XG) this.A00).A04.A0L(userJid);
                return;
            default:
                SearchFragment.A00(userJid, (SearchFragment) this.A00);
                return;
        }
    }
}
