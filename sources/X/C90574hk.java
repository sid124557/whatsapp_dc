package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.Date;

/* renamed from: X.4hk  reason: invalid class name and case insensitive filesystem */
public abstract class C90574hk extends AnonymousClass6J5 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;
    public final C146957Cg A09;
    public final C152967aS A0A;
    public final C185018sv A0B;
    public final C104975Tb A0C;
    public final C620733j A0D;
    public final UserJid A0E;
    public final Date A0F = new Date();

    public C90574hk(View view, C146957Cg r6, C152967aS r7, C185018sv r8, C104975Tb r9, C620733j r10, UserJid userJid) {
        super(view);
        this.A0D = r10;
        this.A0A = r7;
        this.A0B = r8;
        this.A0E = userJid;
        this.A09 = r6;
        this.A0C = r9;
        this.A03 = (FrameLayout) C18290x4.A0M(view, R.id.catalog_item_view);
        this.A04 = (ImageView) C18290x4.A0M(view, R.id.catalog_list_product_image);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(view, R.id.catalog_list_product_title);
        this.A07 = textEmojiLabel;
        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) C18290x4.A0M(view, R.id.catalog_list_product_description);
        this.A06 = textEmojiLabel2;
        this.A08 = (TextEmojiLabel) C18290x4.A0M(view, R.id.catalog_list_product_variant_description);
        TextView A0F2 = C18280x3.A0F(view, R.id.catalog_list_product_price);
        this.A05 = A0F2;
        this.A02 = textEmojiLabel.getTextColors().getDefaultColor();
        this.A00 = textEmojiLabel2.getTextColors().getDefaultColor();
        this.A01 = A0F2.getTextColors().getDefaultColor();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r0.A02 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        if (r2 != true) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C132426fH r16) {
        /*
            r15 = this;
            int r4 = r15.A01()
            r3 = 0
            android.widget.FrameLayout r2 = r15.A03
            if (r4 != 0) goto L_0x021c
            android.view.View r0 = r15.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167884(0x7f070a8c, float:1.7950054E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r3, r0, r3, r3)
        L_0x0019:
            X.8sv r6 = r15.A0B
            X.5dw r1 = r6.BBi(r4)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = r1.A0F
            X.C162457s7.A0C(r0)
            com.whatsapp.TextEmojiLabel r7 = r15.A07
            java.lang.String r0 = r1.A05
            r8 = 0
            r7.A0K(r8, r0)
            X.5dt r0 = r6.B4z()
            r5 = 1
            if (r0 == 0) goto L_0x003b
            boolean r2 = r0.A0X
            r0 = 1
            if (r2 == r5) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r4 = 8
            if (r0 == 0) goto L_0x01ff
            X.C86654Ky.A1F(r7)
            com.whatsapp.TextEmojiLabel r0 = r15.A06
            r0.setVisibility(r4)
            X.5dV r0 = r1.A0B
            if (r0 == 0) goto L_0x01fc
            X.5dP r0 = r0.A01
            if (r0 == 0) goto L_0x01fc
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x01fc
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r7 = r2.toUpperCase(r0)
            X.C162457s7.A0D(r7)
        L_0x005d:
            X.5Tb r2 = r15.A0C
            X.5dt r0 = r6.B4z()
            boolean r0 = r2.A01(r0)
            if (r0 != r5) goto L_0x01f9
            if (r7 == 0) goto L_0x01f9
            boolean r0 = X.C175738Zn.A0V(r7)
            if (r0 != 0) goto L_0x01f9
            com.whatsapp.TextEmojiLabel r0 = r15.A08
        L_0x0073:
            r0.setVisibility(r3)
            r0.A0J(r7, r8, r3, r5)
        L_0x0079:
            X.5Tb r2 = r15.A0C
            X.5dt r0 = r6.B4z()
            boolean r0 = r2.A01(r0)
            if (r0 != r5) goto L_0x0092
            X.5dV r0 = r1.A0B
            if (r0 == 0) goto L_0x0092
            X.5dP r0 = r0.A01
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.A02
            r2 = 1
            if (r0 != 0) goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            r0 = 1
            if (r2 == 0) goto L_0x01b2
            X.5dV r2 = r1.A0B
            if (r2 == 0) goto L_0x01b2
            X.5dP r2 = r2.A01
            if (r2 == 0) goto L_0x01b2
            java.math.BigDecimal r11 = r2.A01
            if (r11 == 0) goto L_0x01b2
            android.widget.TextView r6 = r15.A05
            r6.setVisibility(r3)
            X.7ny r9 = r1.A04
            X.33j r10 = r15.A0D
            java.util.Date r12 = r15.A0F
            android.content.Context r7 = r6.getContext()
            android.text.SpannableString r5 = X.C106945aQ.A01(r7, r8, r9, r10, r11, r12)
            android.content.Context r4 = r6.getContext()
            r2 = 2131892762(0x7f121a1a, float:1.9420281E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.AnonymousClass0x7.A1E(r5, r0, r3)
            X.AnonymousClass001.A0y(r4, r6, r0, r2)
        L_0x00c4:
            com.whatsapp.jid.UserJid r4 = r15.A0E
            r5 = r15
            X.4hb r5 = (X.C90524hb) r5
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00e8
            X.5Tb r2 = r5.A0C
            X.8sv r0 = r5.A0B
            X.5dt r0 = r0.B4z()
            boolean r2 = r2.A01(r0)
            r0 = 1
            if (r2 != r0) goto L_0x0184
            X.5dV r0 = r1.A0B
            if (r0 == 0) goto L_0x0184
            X.5dP r0 = r0.A01
            if (r0 == 0) goto L_0x0184
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0184
        L_0x00e8:
            com.whatsapp.TextEmojiLabel r2 = r5.A07
            int r0 = r5.A02
            r2.setTextColor(r0)
            com.whatsapp.TextEmojiLabel r2 = r5.A06
            int r0 = r5.A00
            r2.setTextColor(r0)
            android.widget.TextView r2 = r5.A05
            int r0 = r5.A01
            r2.setTextColor(r0)
            X.66R r3 = r5.A04
            java.lang.Object r2 = X.C18300x5.A0d(r3)
            android.view.View r2 = (android.view.View) r2
            X.8sv r6 = r5.A0B
            boolean r0 = r6.B5J()
            int r0 = X.AnonymousClass001.A08(r0)
            r2.setVisibility(r0)
            android.widget.ImageView r2 = r5.A04
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            X.5Tb r2 = r5.A0C
            X.5dt r0 = r6.B4z()
            boolean r2 = r2.A01(r0)
            r0 = 1
            if (r2 != r0) goto L_0x017c
            X.5dV r0 = r1.A0B
            if (r0 == 0) goto L_0x017c
            X.5dP r0 = r0.A01
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x017c
            java.lang.Object r2 = X.C18300x5.A0d(r3)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r2 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r2
            X.5NN r0 = new X.5NN
            r0.<init>(r1, r5, r4)
        L_0x013d:
            r2.A06 = r0
        L_0x013f:
            android.widget.ImageView r6 = r15.A04
            X.C1448873i.A00(r6)
            java.util.List r2 = r1.A07
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = "ProductBaseViewHolder/bindViewInSection/no-product-images"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0151:
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0179
            boolean r0 = X.C18310x6.A1X(r2)
            if (r0 == 0) goto L_0x0179
            X.7Cg r0 = r15.A09
            if (r0 == 0) goto L_0x017a
            X.7Gw r9 = new X.7Gw
            r9.<init>(r0, r4)
        L_0x0166:
            X.7aS r5 = r15.A0A
            java.lang.Object r7 = X.C73723fy.A03(r2)
            X.5db r7 = (X.C108815db) r7
            r12 = 2
            r0 = 1
            X.70p r11 = new X.70p
            r11.<init>(r0)
            r10 = r8
            r5.A01(r6, r7, r8, r9, r10, r11, r12)
        L_0x0179:
            return
        L_0x017a:
            r9 = 0
            goto L_0x0166
        L_0x017c:
            java.lang.Object r2 = X.C18300x5.A0d(r3)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r2 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r2
            r0 = 0
            goto L_0x013d
        L_0x0184:
            com.whatsapp.TextEmojiLabel r2 = r5.A07
            X.66R r3 = r5.A03
            int r0 = X.AnonymousClass0x2.A09(r3)
            r2.setTextColor(r0)
            com.whatsapp.TextEmojiLabel r2 = r5.A06
            int r0 = X.AnonymousClass0x2.A09(r3)
            r2.setTextColor(r0)
            android.widget.TextView r2 = r5.A05
            int r0 = X.AnonymousClass0x2.A09(r3)
            r2.setTextColor(r0)
            X.66R r0 = r5.A04
            java.lang.Object r0 = X.C18300x5.A0d(r0)
            X.C86634Kw.A1R(r0)
            android.widget.ImageView r2 = r5.A04
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.setAlpha(r0)
            goto L_0x013f
        L_0x01b2:
            java.math.BigDecimal r2 = r1.A06
            if (r2 == 0) goto L_0x01f2
            X.7ny r2 = r1.A04
            if (r2 == 0) goto L_0x01f2
            android.widget.TextView r4 = r15.A05
            r4.setVisibility(r3)
            java.math.BigDecimal r13 = r1.A06
            X.7ny r11 = r1.A04
            X.5dU r10 = r1.A02
            X.33j r12 = r15.A0D
            java.util.Date r14 = r15.A0F
            android.content.Context r9 = r4.getContext()
            android.text.SpannableString r2 = X.C106945aQ.A01(r9, r10, r11, r12, r13, r14)
            android.text.SpannableStringBuilder r5 = X.C18330xA.A00(r2)
            int r2 = r1.A00
            if (r0 != r2) goto L_0x01ed
            java.lang.String r0 = " • "
            android.text.SpannableStringBuilder r3 = r5.append(r0)
            android.content.Context r2 = r4.getContext()
            r0 = 2131891561(0x7f121569, float:1.9417846E38)
            java.lang.String r0 = r2.getString(r0)
            r3.append(r0)
        L_0x01ed:
            r4.setText(r5)
            goto L_0x00c4
        L_0x01f2:
            android.widget.TextView r0 = r15.A05
            r0.setVisibility(r4)
            goto L_0x00c4
        L_0x01f9:
            com.whatsapp.TextEmojiLabel r0 = r15.A08
            goto L_0x0217
        L_0x01fc:
            r7 = 0
            goto L_0x005d
        L_0x01ff:
            r7.setSingleLine(r5)
            com.whatsapp.TextEmojiLabel r0 = r15.A08
            r0.setVisibility(r4)
            java.lang.String r7 = r1.A0C
            if (r7 == 0) goto L_0x0215
            boolean r0 = X.C175738Zn.A0V(r7)
            if (r0 != 0) goto L_0x0215
            com.whatsapp.TextEmojiLabel r0 = r15.A06
            goto L_0x0073
        L_0x0215:
            com.whatsapp.TextEmojiLabel r0 = r15.A06
        L_0x0217:
            r0.setVisibility(r4)
            goto L_0x0079
        L_0x021c:
            r2.setPadding(r3, r3, r3, r3)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90574hk.A08(X.6fH):void");
    }
}
