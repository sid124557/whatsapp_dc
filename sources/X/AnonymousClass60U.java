package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.60U  reason: invalid class name */
public final class AnonymousClass60U extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60U(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(1);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass74A r10 = (AnonymousClass74A) obj;
        if (r10 instanceof C133046gb) {
            CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
            C162457s7.A0H(r10);
            C133046gb r102 = (C133046gb) r10;
            Context A0G = catalogAllCategoryFragment.A0G();
            String str = r102.A02;
            UserJid userJid = r102.A01;
            Intent A07 = C18320x8.A07();
            A07.setClassName(A0G.getPackageName(), "com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity");
            A07.putExtra("selected_category_parent_id", str);
            A07.putExtra("business_owner_jid", userJid);
            catalogAllCategoryFragment.A0m(A07);
            CatalogAllCategoryFragment catalogAllCategoryFragment2 = this.this$0;
            C141516vh r1 = r102.A00;
            catalogAllCategoryFragment2.A05.getValue();
            if (r1 == C141516vh.CATALOG_SEARCH_FLOW) {
                C08270df A0U = catalogAllCategoryFragment2.A0U();
                AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[1];
                AnonymousClass3Z6.A04("all_category_has_navigated_to_category_tabs", Boolean.TRUE, r2);
                A0U.A0n("all_category_result_callback_key", C02820Hs.A00(r2));
            }
        } else if (r10 instanceof C133056gc) {
            CatalogAllCategoryFragment catalogAllCategoryFragment3 = this.this$0;
            C133056gc r103 = (C133056gc) r10;
            String str2 = r103.A02;
            String str3 = r103.A03;
            UserJid userJid2 = r103.A01;
            int i = r103.A00;
            Context A1D = catalogAllCategoryFragment3.A1D();
            if (A1D != null) {
                Intent A0k = C627736r.A0k(A1D, userJid2, C18290x4.A0a(), Integer.valueOf(i), str2, str3, (String) null);
                C111095hX r22 = catalogAllCategoryFragment3.A01;
                if (r22 != null) {
                    r22.A0D(catalogAllCategoryFragment3.A0R(), A0k, 3000);
                } else {
                    throw C18270x1.A0S("activityUtils");
                }
            }
        }
        return C59022wD.A00;
    }
}
