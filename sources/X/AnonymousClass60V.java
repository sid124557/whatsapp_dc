package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.60V  reason: invalid class name */
public final class AnonymousClass60V extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60V(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(1);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass74A r10 = (AnonymousClass74A) obj;
        if (r10 instanceof C133056gc) {
            CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.this$0;
            C133056gc r102 = (C133056gc) r10;
            String str = r102.A02;
            String str2 = r102.A03;
            UserJid userJid = r102.A01;
            int i = r102.A00;
            Context A1D = catalogCategoryExpandableGroupsListFragment.A1D();
            if (A1D != null) {
                Intent A0k = C627736r.A0k(A1D, userJid, C18290x4.A0a(), Integer.valueOf(i), str, str2, (String) null);
                C111095hX r2 = catalogCategoryExpandableGroupsListFragment.A02;
                if (r2 != null) {
                    r2.A0D(catalogCategoryExpandableGroupsListFragment.A0R(), A0k, 3000);
                } else {
                    throw C18270x1.A0S("activityUtils");
                }
            }
        }
        return C59022wD.A00;
    }
}
