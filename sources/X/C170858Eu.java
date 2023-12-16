package X;

import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8Eu  reason: invalid class name and case insensitive filesystem */
public final class C170858Eu implements C181878nU {
    public final /* synthetic */ CatalogSearchProductListFragment A00;

    public C170858Eu(CatalogSearchProductListFragment catalogSearchProductListFragment) {
        this.A00 = catalogSearchProductListFragment;
    }

    public void BYu(C109015dw r7, int i) {
        CatalogSearchProductListFragment catalogSearchProductListFragment = this.A00;
        UserJid A1L = catalogSearchProductListFragment.A1L();
        String str = r7.A0F;
        C162457s7.A0C(str);
        ((CatalogSearchViewModel) catalogSearchProductListFragment.A04.getValue()).A02.A00(A1L, C18290x4.A0a(), (Integer) null, Integer.valueOf(i), str);
    }
}
