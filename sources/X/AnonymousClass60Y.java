package X;

import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.60Y  reason: invalid class name */
public final class AnonymousClass60Y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60Y(CatalogSearchFragment catalogSearchFragment) {
        super(1);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CatalogSearchProductListFragment catalogSearchProductListFragment;
        C90254gy r1;
        boolean z;
        AnonymousClass7HO r12;
        AnonymousClass66R r0;
        AnonymousClass7DS r7 = (AnonymousClass7DS) obj;
        C08310eF A0D = this.this$0.A0T().A0D("SEARCH_RESULT_LIST_FRAGMENT");
        if (A0D instanceof CatalogSearchProductListFragment) {
            catalogSearchProductListFragment = (CatalogSearchProductListFragment) A0D;
        } else {
            catalogSearchProductListFragment = null;
        }
        if ((r7 instanceof C133206gr) || (r7 instanceof C133196gq)) {
            if (catalogSearchProductListFragment != null) {
                r1 = catalogSearchProductListFragment.A1K();
                z = true;
            }
            return C59022wD.A00;
        }
        if (r7 instanceof C133226gt) {
            if (catalogSearchProductListFragment != null) {
                catalogSearchProductListFragment.A1O();
            }
        } else if (!(r7 instanceof C133216gs)) {
            if (!(r7 instanceof C133236gu)) {
                if (r7 instanceof C133176go) {
                    CatalogSearchFragment catalogSearchFragment = this.this$0;
                    AnonymousClass74D r13 = ((C133176go) r7).A00;
                    if (r13 instanceof C133156gm) {
                        r0 = catalogSearchFragment.A0O;
                    } else if (r13 instanceof C133166gn) {
                        r0 = catalogSearchFragment.A0P;
                    }
                    C159097l7 r14 = (C159097l7) r0.getValue();
                    if (!r14.A0B()) {
                        r14.A05();
                    }
                } else if (r7 instanceof C133186gp) {
                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.this$0.A0Q.getValue();
                    AnonymousClass74D r15 = ((C133186gp) r7).A00;
                    if (r15 instanceof C133156gm) {
                        r12 = C133266gx.A00;
                    } else if (r15 instanceof C133166gn) {
                        r12 = C133276gy.A00;
                    }
                    catalogSearchViewModel.A0D(new AnonymousClass6h1(r12));
                } else {
                    if (r7 instanceof C133246gv) {
                        ((CatalogSearchViewModel) this.this$0.A0Q.getValue()).A0D(new AnonymousClass6h1(C133286gz.A00));
                    }
                    return C59022wD.A00;
                }
            }
            if (catalogSearchProductListFragment != null) {
                r1 = catalogSearchProductListFragment.A1K();
                z = false;
            }
            return C59022wD.A00;
        }
        C162457s7.A0H(r7);
        List list = r7.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (next instanceof C133136gk) {
                A0s.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0c.add(((C133136gk) it.next()).A00);
        }
        if (catalogSearchProductListFragment != null) {
            catalogSearchProductListFragment.A1K().A0S(false);
            C620433g r4 = catalogSearchProductListFragment.A01;
            if (r4 != null) {
                r4.A06(new C116935r6(A0c, 5, catalogSearchProductListFragment), catalogSearchProductListFragment.A1L());
            } else {
                throw C18270x1.A0S("businessProfileManager");
            }
        }
        return C59022wD.A00;
        r1.A0S(z);
        return C59022wD.A00;
    }
}
