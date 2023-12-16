package X;

import com.whatsapp.biz.catalog.view.CatalogHeader;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6fK  reason: invalid class name */
public class AnonymousClass6fK extends AnonymousClass6J5 {
    public final CatalogHeader A00;

    public AnonymousClass6fK(C111095hX r3, C56972sr r4, CatalogHeader catalogHeader, UserJid userJid) {
        super(catalogHeader);
        this.A00 = catalogHeader;
        catalogHeader.setUp(userJid);
        if (!r4.A0a(userJid)) {
            catalogHeader.setOnTextClickListener(new AnonymousClass547(userJid, this, r3, 3));
        }
    }
}
