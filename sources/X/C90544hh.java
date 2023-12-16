package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CategoryMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4hh  reason: invalid class name and case insensitive filesystem */
public class C90544hh extends AnonymousClass6J5 {
    public C87614Tz A00;
    public final C111095hX A01;
    public final C152967aS A02;
    public final CategoryMediaCard A03;
    public final UserJid A04;

    public /* bridge */ /* synthetic */ void A07(C147037Co r9) {
        AnonymousClass7MZ r0;
        List list = ((C132396fD) r9).A00;
        if (list != null && !list.isEmpty()) {
            LinkedList A18 = AnonymousClass0x9.A18();
            int i = 0;
            while (i < list.size()) {
                C43072Qq r02 = (C43072Qq) list.get(i);
                A18.add(new AnonymousClass7MZ((Drawable) null, new C111955ix(r02, this, i), new C148107Gy(r02, this), r02.A02));
                i++;
                if (i >= 6) {
                    break;
                }
            }
            if (list.size() > 6) {
                CategoryMediaCard categoryMediaCard = this.A03;
                r0 = new AnonymousClass7MZ(AnonymousClass0RP.A00(categoryMediaCard.getContext(), R.drawable.catalog_product_placeholder_background), new C170748Ej(this), (C148107Gy) null, categoryMediaCard.getContext().getString(R.string.f11nameremoved));
            } else {
                r0 = null;
            }
            CategoryMediaCard categoryMediaCard2 = this.A03;
            categoryMediaCard2.setup(A18, r0);
            categoryMediaCard2.setVisibility(0);
        }
    }

    public C90544hh(C111095hX r1, C152967aS r2, CategoryMediaCard categoryMediaCard, C87614Tz r4, UserJid userJid) {
        super(categoryMediaCard);
        this.A01 = r1;
        this.A04 = userJid;
        this.A03 = categoryMediaCard;
        this.A02 = r2;
        this.A00 = r4;
    }
}
