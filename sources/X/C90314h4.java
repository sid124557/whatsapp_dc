package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4h4  reason: invalid class name and case insensitive filesystem */
public class C90314h4 extends C125626It {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final AnonymousClass5PC A07;
    public final CartFragment A08;
    public final C152967aS A09;
    public final QuantitySelector A0A;
    public final C104975Tb A0B;
    public final C1448773h A0C;
    public final C108985dt A0D;
    public final C620733j A0E;
    public final UserJid A0F;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C146937Ce r13) {
        /*
            r12 = this;
            X.6em r13 = (X.C132146em) r13
            X.7Ya r6 = r13.A00
            android.widget.TextView r1 = r12.A04
            X.5dw r4 = r6.A02
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r5 = r12.A0A
            long r2 = r6.A00
            long r0 = r4.A09
            r5.A04(r2, r0)
            r3 = 0
            r5.setVisibility(r3)
            long r5 = r6.A00
            java.math.BigDecimal r2 = r4.A06
            X.7ny r9 = r4.A04
            X.5dU r1 = r4.A02
            X.33j r8 = r12.A0E
            java.util.Date r11 = r13.A01
            android.view.View r0 = r12.A0H
            r0.getContext()
            r10 = 0
            if (r2 == 0) goto L_0x010f
            if (r9 == 0) goto L_0x010f
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r5)
            java.math.BigDecimal r0 = r2.multiply(r0)
            r7 = 1
            java.lang.String r2 = r9.A04(r8, r0, r7)
            if (r1 == 0) goto L_0x0053
            boolean r0 = r1.A00(r11)
            if (r0 == 0) goto L_0x0053
            java.math.BigDecimal r1 = r1.A01
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r5)
            java.math.BigDecimal r0 = r1.multiply(r0)
            java.lang.String r10 = r9.A04(r8, r0, r7)
        L_0x0053:
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r2, r10)
        L_0x0057:
            java.lang.Object r2 = r1.A00
            if (r2 != 0) goto L_0x00df
            android.widget.TextView r1 = r12.A02
            java.lang.String r0 = "$000.00"
            r1.setText(r0)
            android.widget.LinearLayout r1 = r12.A01
            r0 = 4
        L_0x0065:
            r1.setVisibility(r0)
        L_0x0068:
            android.widget.ImageView r5 = r12.A00
            boolean r0 = r12.A08(r5, r4)
            if (r0 != 0) goto L_0x0083
            X.5PC r0 = r12.A07
            java.lang.String r2 = r4.A0F
            X.5Uu r1 = r0.A0G
            r0 = 0
            X.5dw r0 = r1.A08(r0, r2)
            if (r0 == 0) goto L_0x00db
            boolean r0 = r12.A08(r5, r0)
            if (r0 == 0) goto L_0x00db
        L_0x0083:
            X.5Tb r1 = r12.A0B
            X.5dt r0 = r12.A0D
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x013e
            X.5dV r0 = r4.A0B
            if (r0 == 0) goto L_0x013e
            java.util.List r1 = r0.A02
            if (r1 == 0) goto L_0x013e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x013e
            android.widget.TextView r7 = r12.A05
            r7.setVisibility(r3)
            java.util.ArrayList r5 = X.C73783g4.A0c(r1)
            java.util.Iterator r6 = r1.iterator()
        L_0x00a8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r4 = r6.next()
            X.7xw r4 = (X.C165977xw) r4
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r4.A00
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            X.C162457s7.A0D(r0)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            java.lang.String r0 = r4.A01
            java.lang.String r0 = r0.toUpperCase(r1)
            X.C162457s7.A0D(r0)
            r2.append(r0)
            X.AnonymousClass0x7.A1D(r2, r5)
            goto L_0x00a8
        L_0x00db:
            X.C1448873i.A00(r5)
            goto L_0x0083
        L_0x00df:
            android.widget.LinearLayout r0 = r12.A01
            r0.setVisibility(r3)
            java.lang.Object r1 = r1.A01
            android.widget.TextView r0 = r12.A02
            if (r1 != 0) goto L_0x00f5
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r1 = r12.A03
            r0 = 8
            goto L_0x0065
        L_0x00f5:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.widget.TextView r1 = r12.A03
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1.setVisibility(r3)
            int r0 = r1.getPaintFlags()
            r0 = r0 | 16
            r1.setPaintFlags(r0)
            goto L_0x0068
        L_0x010f:
            X.0PJ r1 = new X.0PJ
            r1.<init>(r10, r10)
            goto L_0x0057
        L_0x0116:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0128
            r7.setVisibility(r3)
            java.lang.Object r0 = r5.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.setText(r0)
        L_0x0128:
            int r1 = r5.size()
            r0 = 1
            if (r1 <= r0) goto L_0x014a
            android.widget.TextView r1 = r12.A06
            r1.setVisibility(r3)
            java.lang.Object r0 = r5.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            return
        L_0x013e:
            android.widget.TextView r0 = r12.A05
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r12.A06
            r0.setVisibility(r1)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90314h4.A07(X.7Ce):void");
    }

    public final boolean A08(ImageView imageView, C109015dw r7) {
        List<C108815db> list = r7.A07;
        if (!list.isEmpty() && !r7.A02()) {
            for (C108815db r2 : list) {
                if (r2 != null && !TextUtils.isEmpty(r2.A01)) {
                    C166357yY r4 = new C166357yY(r2.A04, r2.A01);
                    C152967aS r3 = this.A09;
                    UserJid userJid = this.A0F;
                    C148087Gw r1 = null;
                    if (userJid != null) {
                        r1 = new C148087Gw(new C146957Cg(897453112), userJid);
                    }
                    C1448673g.A00(imageView, r1, r3, r4);
                    return true;
                }
            }
        }
        return false;
    }

    public C90314h4(View view, AnonymousClass5PC r4, C181718nD r5, CartFragment cartFragment, CartFragment cartFragment2, C152967aS r8, C104975Tb r9, C1448773h r10, C108985dt r11, C620733j r12, UserJid userJid) {
        super(view);
        this.A0E = r12;
        this.A07 = r4;
        this.A09 = r8;
        this.A08 = cartFragment2;
        this.A0B = r9;
        this.A0C = r10;
        this.A0D = r11;
        this.A04 = C18300x5.A0G(view, R.id.cart_item_title);
        this.A02 = C18300x5.A0G(view, R.id.cart_item_price);
        this.A03 = C18300x5.A0G(view, R.id.cart_item_original_price);
        this.A01 = C86654Ky.A0N(view, R.id.cart_item_price_container);
        QuantitySelector quantitySelector = (QuantitySelector) C06560Yg.A02(view, R.id.cart_item_quantity_selector);
        this.A0A = quantitySelector;
        quantitySelector.A03 = new C111995j1(r5, this, cartFragment2);
        quantitySelector.A04 = new C112015j3(r5, this, cartFragment2);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.cart_item_thumbnail);
        AnonymousClass547.A00(view, r5, this, cartFragment, 2);
        this.A05 = C18300x5.A0G(view, R.id.cart_item_variant_info_1);
        this.A06 = C18300x5.A0G(view, R.id.cart_item_variant_info_2);
        this.A0F = userJid;
    }
}
