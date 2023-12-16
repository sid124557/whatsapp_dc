package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.4h3  reason: invalid class name and case insensitive filesystem */
public class C90304h3 extends C125626It {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final C620433g A05;
    public final C152967aS A06;
    public final C104975Tb A07;
    public final C620733j A08;
    public final UserJid A09;

    public void A07(C146937Ce r8) {
        Context A0T;
        int i;
        Object[] objArr;
        C160617ny r1;
        C108635dJ r6 = ((C132136el) r8).A00;
        this.A02.setText(r6.A06);
        BigDecimal bigDecimal = r6.A02;
        if (bigDecimal == null || (r1 = r6.A01) == null) {
            A0T = C86664Kz.A0T(this);
            i = R.string.f11nameremoved;
            objArr = new Object[1];
            AnonymousClass000.A1P(objArr, r6.A00, 0);
        } else {
            String A042 = r1.A04(this.A08, bigDecimal, true);
            A0T = C86664Kz.A0T(this);
            i = R.string.f11nameremoved;
            objArr = C18310x6.A1b(A042, 0);
            AnonymousClass000.A1P(objArr, r6.A00, 1);
        }
        this.A01.setText(A0T.getString(i, objArr));
        ImageView imageView = this.A00;
        C166357yY r4 = r6.A05;
        C152967aS r2 = this.A06;
        UserJid userJid = this.A09;
        C148087Gw r12 = null;
        if (userJid != null) {
            r12 = new C148087Gw(new C146957Cg(897465374), userJid);
        }
        C1448673g.A00(imageView, r12, r2, r4);
        this.A05.A06(new C116935r6(r6, 3, this), userJid);
    }

    public C90304h3(View view, C620433g r3, C181718nD r4, C152967aS r5, C104975Tb r6, OrderDetailFragment orderDetailFragment, C620733j r8, UserJid userJid) {
        super(view);
        this.A08 = r8;
        this.A07 = r6;
        this.A05 = r3;
        this.A06 = r5;
        this.A02 = C18300x5.A0G(view, R.id.cart_item_title);
        this.A01 = C18300x5.A0G(view, R.id.cart_item_subtitle);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.cart_item_thumbnail);
        this.A03 = AnonymousClass0x7.A0K(view, R.id.cart_item_variant_info_1);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.cart_item_variant_info_2);
        C86604Kt.A1B(view, R.id.cart_item_quantity_container);
        AnonymousClass547.A00(view, orderDetailFragment, this, r4, 4);
        this.A09 = userJid;
    }
}
