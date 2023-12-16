package com.whatsapp.businessproductlist.view.fragment;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass5QB;
import X.AnonymousClass5Y9;
import X.AnonymousClass7CI;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C64333Db;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.fragment.Hilt_CatalogSearchProductListFragment;

public abstract class Hilt_BusinessProductListBaseFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (this instanceof Hilt_CatalogSearchProductListFragment) {
            Hilt_CatalogSearchProductListFragment hilt_CatalogSearchProductListFragment = (Hilt_CatalogSearchProductListFragment) this;
            if (!hilt_CatalogSearchProductListFragment.A02) {
                hilt_CatalogSearchProductListFragment.A02 = true;
                AnonymousClass3DY A0E = C18320x8.A0E(hilt_CatalogSearchProductListFragment);
                CatalogSearchProductListFragment catalogSearchProductListFragment = (CatalogSearchProductListFragment) hilt_CatalogSearchProductListFragment;
                C88854au r3 = (C88854au) A0E;
                C64333Db r2 = r3.A1B;
                C107695bk r1 = r2.A00;
                C88834as.A55(r3, r2, r1, catalogSearchProductListFragment, r1.ANI());
                catalogSearchProductListFragment.A00 = (AnonymousClass7CI) r3.A0b.get();
                catalogSearchProductListFragment.A01 = C86624Kv.A0K(r2);
                catalogSearchProductListFragment.A02 = r2.AhS();
            }
        } else if (this instanceof Hilt_CollectionProductListFragment) {
            Hilt_CollectionProductListFragment hilt_CollectionProductListFragment = (Hilt_CollectionProductListFragment) this;
            if (!hilt_CollectionProductListFragment.A02) {
                hilt_CollectionProductListFragment.A02 = true;
                AnonymousClass3DY A0E2 = C18320x8.A0E(hilt_CollectionProductListFragment);
                CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) hilt_CollectionProductListFragment;
                C88854au r4 = (C88854au) A0E2;
                C64333Db r22 = r4.A1B;
                C107695bk r32 = r22.A00;
                C88834as.A55(r4, r22, r32, collectionProductListFragment, r32.ANI());
                collectionProductListFragment.A02 = C64333Db.A04(r22);
                collectionProductListFragment.A03 = C64333Db.A06(r22);
                collectionProductListFragment.A01 = C64333Db.A00(r22);
                collectionProductListFragment.A0C = C86644Kx.A0a(r22);
                collectionProductListFragment.A08 = C64333Db.A26(r22);
                collectionProductListFragment.A06 = (AnonymousClass5Y9) r22.A4Y.get();
                collectionProductListFragment.A0A = C64333Db.A28(r22);
                collectionProductListFragment.A09 = C86614Ku.A0T(r22);
                collectionProductListFragment.A0B = C64333Db.A4B(r22);
                collectionProductListFragment.A05 = (AnonymousClass5QB) r32.A2H.get();
                collectionProductListFragment.A04 = C86624Kv.A0K(r22);
                collectionProductListFragment.A07 = r22.AhS();
            }
        } else if (!this.A02) {
            this.A02 = true;
            C88854au r42 = (C88854au) C18320x8.A0E(this);
            C64333Db r23 = r42.A1B;
            C107695bk r12 = r23.A00;
            C88834as.A55(r42, r23, r12, (BusinessProductListBaseFragment) this, r12.ANI());
        }
    }

    public final void A1I() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1I();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C18270x1.A06(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r2.A1I()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.Hilt_BusinessProductListBaseFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
