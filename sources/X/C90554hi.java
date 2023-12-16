package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4hi  reason: invalid class name and case insensitive filesystem */
public class C90554hi extends AnonymousClass6J5 {
    public final View A00;
    public final C111095hX A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final C181828nP A04;
    public final AnonymousClass6HX A05;
    public final WDSButton A06;

    public /* bridge */ /* synthetic */ void A07(C147037Co r5) {
        AnonymousClass6fI r52 = (AnonymousClass6fI) r5;
        this.A03.setText(r52.A00);
        int i = 0;
        this.A00.setVisibility(AnonymousClass001.A08(r52.A01 ? 1 : 0));
        WDSButton wDSButton = this.A06;
        if ("catalog_products_all_items_collection_id".equals(r52.A02)) {
            i = 8;
        }
        wDSButton.setVisibility(i);
    }

    public C90554hi(View view, C111095hX r4, C181828nP r5, AnonymousClass6HX r6, UserJid userJid) {
        super(view);
        this.A01 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = C06560Yg.A02(view, R.id.collection_divider);
        WDSButton A0f = C86654Ky.A0f(view, R.id.button_collection_see_all);
        this.A06 = A0f;
        this.A03 = AnonymousClass0x7.A0L(view, R.id.textview_collection_title);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.textview_collection_subtitle);
        C109705f3.A00(A0f, this, userJid, 24);
    }
}
