package com.whatsapp.catalogsearch.view.fragment;

import X.AnonymousClass66R;
import X.AnonymousClass7CI;
import X.C104975Tb;
import X.C119175wY;
import X.C154517dI;
import X.C620433g;
import X.C90254gy;
import com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;

public final class CatalogSearchProductListFragment extends Hilt_CatalogSearchProductListFragment {
    public AnonymousClass7CI A00;
    public C620433g A01;
    public C104975Tb A02;
    public CatalogSearchFragment A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C119175wY(this));

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0eF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1G(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            super.A1G(r3)
            boolean r0 = r3 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment
            if (r0 != 0) goto L_0x0017
            X.0eF r1 = r2.A0E
            boolean r0 = r1 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment
            if (r0 == 0) goto L_0x001c
            r3 = r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment.CatalogSearchProductListHost"
            X.C162457s7.A0K(r1, r0)
        L_0x0017:
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r3 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r3
            r2.A03 = r3
            return
        L_0x001c:
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r3)
            java.lang.String r0 = " or parentFragment must implement CatalogSearchProductListFragment.CatalogSearchProductListHost"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment.A1G(android.content.Context):void");
    }

    public final void A1O() {
        C90254gy A1K = A1K();
        if (A1K instanceof BusinessProductListAdapter) {
            A1K.A00.clear();
            A1K.A08.clear();
            A1K.A05();
        }
    }
}
