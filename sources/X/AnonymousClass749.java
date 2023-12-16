package X;

import android.os.Bundle;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.749  reason: invalid class name */
public final class AnonymousClass749 {
    public static final CatalogAllCategoryFragment A00(C141516vh r3, UserJid userJid, String str) {
        C162457s7.A0J(str, 0);
        C18260x0.A0Q(userJid, r3);
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("parent_category_id", str);
        A08.putParcelable("category_biz_id", userJid);
        A08.putString("category_display_context", r3.name());
        CatalogAllCategoryFragment catalogAllCategoryFragment = new CatalogAllCategoryFragment();
        catalogAllCategoryFragment.A0u(A08);
        return catalogAllCategoryFragment;
    }
}
