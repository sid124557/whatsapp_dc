package X;

import com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.60E  reason: invalid class name */
public final class AnonymousClass60E extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CollectionProductListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60E(CollectionProductListFragment collectionProductListFragment) {
        super(1);
        this.this$0 = collectionProductListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C148117Gz r9 = (C148117Gz) obj;
        CollectionProductListFragment collectionProductListFragment = this.this$0;
        C162457s7.A0H(r9);
        UserJid userJid = r9.A00;
        C162457s7.A0C(userJid);
        String str = r9.A01;
        C162457s7.A0C(str);
        if (userJid.equals(userJid) && str.equals(collectionProductListFragment.A1O())) {
            boolean z = false;
            if (r9 instanceof C132326f6) {
                C132326f6 r92 = (C132326f6) r9;
                boolean z2 = r92.A01;
                C620433g r6 = collectionProductListFragment.A04;
                if (r6 != null) {
                    r6.A06(new AnonymousClass5AW(collectionProductListFragment, 2), collectionProductListFragment.A1L());
                    if (!z2 && r92.A00) {
                        z = true;
                    }
                    if (!C162457s7.A0P(collectionProductListFragment.A1O(), "catalog_products_all_items_collection_id") && collectionProductListFragment.A00 == -1 && z) {
                        C105255Ue r0 = collectionProductListFragment.A0C;
                        if (r0 != null) {
                            r0.A06("view_collection_details_tag", true);
                        } else {
                            throw C18270x1.A0S("bizQPLManager");
                        }
                    }
                } else {
                    throw C18270x1.A0S("businessProfileManager");
                }
            } else if (r9 instanceof C132316f5) {
                C90254gy A1K = collectionProductListFragment.A1K();
                int i = ((C132316f5) r9).A00;
                A1K.A0P(i);
                if (collectionProductListFragment.A0L.A02.A00(AnonymousClass0GC.RESUMED)) {
                    C182058nn r02 = collectionProductListFragment.A0B;
                    C162457s7.A0H(r02);
                    r02.BT3(i);
                } else {
                    collectionProductListFragment.A0D = Integer.valueOf(i);
                }
                if (!C162457s7.A0P(collectionProductListFragment.A1O(), "catalog_products_all_items_collection_id") && collectionProductListFragment.A00 == -1) {
                    C105255Ue r03 = collectionProductListFragment.A0C;
                    if (r03 != null) {
                        r03.A06("view_collection_details_tag", false);
                    } else {
                        throw C18270x1.A0S("bizQPLManager");
                    }
                }
            }
        }
        return C59022wD.A00;
    }
}
