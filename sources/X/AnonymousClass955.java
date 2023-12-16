package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.955  reason: invalid class name */
public class AnonymousClass955 extends AnonymousClass0R6 {
    public List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ AnonymousClass9Bz A01;

    public AnonymousClass955(AnonymousClass9Bz r2) {
        this.A01 = r2;
    }

    public int A0G() {
        return this.A00.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:251:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r17, int r18) {
        /*
            r16 = this;
            r0 = r17
            boolean r1 = r0 instanceof X.AnonymousClass95U
            r2 = r16
            r3 = r18
            if (r1 != 0) goto L_0x070b
            boolean r1 = r0 instanceof X.AnonymousClass95V
            if (r1 == 0) goto L_0x06fa
            X.95V r0 = (X.AnonymousClass95V) r0
            java.util.List r1 = r2.A00
            java.lang.Object r1 = r1.get(r3)
            X.9NZ r1 = (X.AnonymousClass9NZ) r1
            boolean r2 = r0 instanceof X.C191309Ek
            if (r2 != 0) goto L_0x0044
            boolean r2 = r0 instanceof X.C191439Ex
            if (r2 == 0) goto L_0x0045
            X.9Ex r0 = (X.C191439Ex) r0
            X.9FQ r1 = (X.AnonymousClass9FQ) r1
            android.widget.TextView r4 = r0.A01
            java.lang.String r2 = r1.A01
            r4.setText(r2)
            java.lang.String r2 = r1.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 8
            if (r2 == 0) goto L_0x0038
            r4.setVisibility(r3)
        L_0x0038:
            com.whatsapp.WaImageView r2 = r0.A02
            r2.setVisibility(r3)
            android.view.View r2 = r0.A00
            android.view.View$OnClickListener r0 = r1.A00
        L_0x0041:
            r2.setOnClickListener(r0)
        L_0x0044:
            return
        L_0x0045:
            boolean r2 = r0 instanceof X.C191389Es
            if (r2 == 0) goto L_0x008a
            X.9Es r0 = (X.C191389Es) r0
            X.9Fb r1 = (X.C191479Fb) r1
            android.widget.TextView r3 = r0.A01
            java.lang.String r2 = r1.A04
            r3.setText(r2)
            android.widget.TextView r5 = r0.A00
            java.lang.String r2 = r1.A03
            r5.setText(r2)
            android.view.View r4 = r0.A0H
            android.content.res.Resources r0 = X.C18290x4.A0G(r4)
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            boolean r3 = X.AnonymousClass001.A1T(r0)
            android.graphics.drawable.Drawable r2 = r1.A00
            if (r2 == 0) goto L_0x0077
            r0 = 0
            if (r3 == 0) goto L_0x0086
            r5.setCompoundDrawables(r0, r0, r2, r0)
        L_0x0077:
            android.view.View$OnClickListener r0 = r1.A01
            if (r0 == 0) goto L_0x007e
            r4.setOnClickListener(r0)
        L_0x007e:
            android.view.View$OnLongClickListener r0 = r1.A02
            if (r0 == 0) goto L_0x0044
            r4.setOnLongClickListener(r0)
            return
        L_0x0086:
            r5.setCompoundDrawables(r2, r0, r0, r0)
            goto L_0x0077
        L_0x008a:
            boolean r2 = r0 instanceof X.C191369Eq
            if (r2 == 0) goto L_0x00a6
            X.9Eq r0 = (X.C191369Eq) r0
            X.9FL r1 = (X.AnonymousClass9FL) r1
            X.34x r2 = r1.A00
            X.1nE r2 = (X.AnonymousClass1nE) r2
            X.5Xu r1 = r0.A00
            r0 = 0
            r1.A03(r2, r0)
            boolean r0 = X.C627636p.A0z(r2)
            if (r0 == 0) goto L_0x0675
            r1.A01()
            return
        L_0x00a6:
            boolean r2 = r0 instanceof X.AnonymousClass9F4
            if (r2 == 0) goto L_0x0176
            X.9F4 r0 = (X.AnonymousClass9F4) r0
            X.9Ff r1 = (X.C191519Ff) r1
            com.whatsapp.WaTextView r5 = r0.A05
            android.graphics.drawable.Drawable r4 = r5.getBackground()
            android.content.Context r9 = r0.A00
            android.content.res.Resources r3 = r9.getResources()
            int r2 = r1.A02
            int r3 = r3.getColor(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.setColorFilter(r3, r2)
            java.lang.CharSequence r2 = r1.A04
            r5.setText(r2)
            java.lang.CharSequence r2 = r1.A05
            r5.setContentDescription(r2)
            float r3 = r1.A00
            r2 = 0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00d9
            r5.setTextSize(r3)
        L_0x00d9:
            int r2 = r1.A01
            com.whatsapp.WaTextView r4 = r0.A06
            if (r2 == 0) goto L_0x0163
            X.C106905aM.A04(r4)
            int r2 = r1.A01
            r4.setText(r2)
            android.content.res.Resources r3 = r9.getResources()
            int r2 = r1.A02
            X.C18320x8.A11(r3, r4, r2)
            java.lang.CharSequence r2 = r1.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00ff
            android.widget.TextView r3 = r0.A03
            java.lang.CharSequence r2 = r1.A07
        L_0x00fc:
            r3.setText(r2)
        L_0x00ff:
            java.lang.String r2 = r1.A0B
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            com.whatsapp.TextEmojiLabel r8 = r0.A04
            if (r2 != 0) goto L_0x0160
            X.1VX r2 = r0.A08
            X.AnonymousClass0x2.A14(r2, r8)
            X.33i r2 = r0.A07
            X.AnonymousClass0x2.A12(r8, r2)
            java.lang.String r7 = r1.A0B
            java.util.Map r6 = r1.A0C
            android.content.res.Resources r5 = r9.getResources()
            r3 = 2130969960(0x7f040568, float:1.7548617E38)
            r2 = 2131101315(0x7f060683, float:1.7815036E38)
            int r2 = X.AnonymousClass5Yj.A02(r9, r3, r2)
            int r3 = r5.getColor(r2)
            r2 = 0
            android.text.SpannableStringBuilder r2 = X.C57002su.A00(r2, r7, r6, r3, r4)
        L_0x012f:
            r8.setText(r2)
            java.lang.CharSequence r2 = r1.A09
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r7 = 8
            android.widget.TextView r3 = r0.A02
            if (r2 != 0) goto L_0x015c
            java.lang.CharSequence r2 = r1.A09
            r3.setText(r2)
            r3.setVisibility(r4)
        L_0x0146:
            java.lang.CharSequence r2 = r1.A08
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x06c1
            android.widget.TextView r2 = r0.A01
            java.lang.CharSequence r0 = r1.A08
            r2.setText(r0)
            r2.setVisibility(r4)
            android.view.View$OnClickListener r0 = r1.A03
            goto L_0x0041
        L_0x015c:
            r3.setVisibility(r7)
            goto L_0x0146
        L_0x0160:
            java.lang.CharSequence r2 = r1.A0A
            goto L_0x012f
        L_0x0163:
            r4.A0A()
            java.lang.CharSequence r2 = r1.A06
            r4.setText(r2)
            r2 = 2131102438(0x7f060ae6, float:1.7817314E38)
            X.AnonymousClass0x2.A0q(r9, r4, r2)
            android.widget.TextView r3 = r0.A03
            java.lang.String r2 = ""
            goto L_0x00fc
        L_0x0176:
            boolean r2 = r0 instanceof X.AnonymousClass9F0
            if (r2 == 0) goto L_0x01a3
            X.9F0 r0 = (X.AnonymousClass9F0) r0
            X.9FP r1 = (X.AnonymousClass9FP) r1
            android.content.Context r3 = r0.A01
            X.94A r2 = new X.94A
            r2.<init>(r3, r1)
            android.widget.ListView r5 = r0.A03
            r5.setAdapter(r2)
            boolean r1 = r1.A01
            r4 = 0
            r3 = 8
            if (r1 == 0) goto L_0x0683
            boolean r1 = r0.A00
            if (r1 != 0) goto L_0x0683
            android.view.View r2 = r0.A02
            r2.setVisibility(r4)
            r5.setVisibility(r3)
            r1 = 131(0x83, float:1.84E-43)
            X.C204249p3.A02(r2, r0, r1)
            return
        L_0x01a3:
            boolean r2 = r0 instanceof X.C191359Ep
            if (r2 == 0) goto L_0x01b1
            X.9Ep r0 = (X.C191359Ep) r0
            X.9FM r1 = (X.AnonymousClass9FM) r1
            com.whatsapp.wds.components.button.WDSButton r2 = r0.A00
            android.view.View$OnClickListener r0 = r1.A00
            goto L_0x0041
        L_0x01b1:
            boolean r2 = r0 instanceof X.C191429Ew
            if (r2 == 0) goto L_0x01ed
            X.9Ew r0 = (X.C191429Ew) r0
            X.9FS r1 = (X.AnonymousClass9FS) r1
            android.widget.LinearLayout r3 = r0.A01
            android.view.View$OnClickListener r2 = r1.A00
            r3.setOnClickListener(r2)
            android.widget.ImageView r4 = r0.A00
            android.content.Context r3 = r4.getContext()
            r2 = 2131102437(0x7f060ae5, float:1.7817312E38)
            X.C1899593h.A0i(r3, r4, r2)
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x0044
            com.whatsapp.WaTextView r1 = r0.A02
            r0 = 2131891949(0x7f1216ed, float:1.9418632E38)
            r1.setText(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131232301(0x7f08062d, float:1.8080707E38)
            X.C18290x4.A1A(r1, r4, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131102102(0x7f060996, float:1.7816632E38)
            X.C1899593h.A0i(r1, r4, r0)
            return
        L_0x01ed:
            boolean r2 = r0 instanceof X.AnonymousClass9F5
            if (r2 == 0) goto L_0x0301
            X.9F5 r0 = (X.AnonymousClass9F5) r0
            X.9Fe r1 = (X.C191509Fe) r1
            java.lang.String r2 = r1.A09
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r4 = 8
            if (r2 != 0) goto L_0x02fa
            android.widget.TextView r3 = r0.A06
            java.lang.String r2 = r1.A09
            r3.setText(r2)
            android.widget.TextView r3 = r0.A05
            java.lang.String r2 = r1.A08
            r3.setText(r2)
            java.lang.String r2 = r1.A0A
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x021c
            android.widget.TextView r3 = r0.A07
            java.lang.String r2 = r1.A0A
            r3.setText(r2)
        L_0x021c:
            X.3ZH r2 = r1.A05
            if (r2 == 0) goto L_0x02ef
            X.5mM r5 = r0.A0C
            android.content.Context r3 = r0.A00
            java.lang.String r2 = "payment-transaction-payee-payer-detail"
            X.5Uq r3 = r5.A06(r3, r2)
            X.3ZH r2 = r1.A05
            android.widget.ImageView r6 = r0.A02
            r3.A08(r6, r2)
        L_0x0231:
            android.view.View$OnClickListener r3 = r1.A04
            r5 = 0
            if (r3 == 0) goto L_0x02e7
            android.widget.RelativeLayout r2 = r0.A04
            r2.setOnClickListener(r3)
            com.whatsapp.WaImageView r2 = r0.A09
            r2.setVisibility(r5)
        L_0x0240:
            int r2 = r1.A01
            r6.setVisibility(r2)
            android.widget.ProgressBar r3 = r0.A03
            int r2 = r1.A02
            r3.setVisibility(r2)
            java.lang.String r2 = r1.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x029a
            java.lang.String r2 = r1.A06
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x029a
            X.5a2 r6 = r0.A0F
            com.whatsapp.TextEmojiLabel r3 = r0.A08
            android.content.Context r7 = r3.getContext()
            java.lang.String r8 = r1.A07
            java.lang.String r2 = "incentive-blurb-cashback-help"
            java.lang.String[] r10 = new java.lang.String[]{r2}
            r4 = 1
            java.lang.String[] r11 = new java.lang.String[r4]
            X.5X8 r2 = r0.A0A
            java.lang.String r1 = r1.A06
            android.net.Uri r1 = r2.A00(r1)
            X.AnonymousClass0x7.A1E(r1, r11, r5)
            java.lang.Runnable[] r9 = new java.lang.Runnable[r4]
            X.9eu r1 = new X.9eu
            r1.<init>()
            r9[r5] = r1
            android.text.SpannableString r2 = r6.A04(r7, r8, r9, r10, r11)
            X.33i r1 = r0.A0D
            X.AnonymousClass0x2.A12(r3, r1)
            X.1VX r1 = r0.A0E
            X.AnonymousClass0x2.A14(r1, r3)
            r3.setText(r2)
        L_0x0294:
            android.view.View r0 = r0.A01
            r0.setVisibility(r5)
            return
        L_0x029a:
            java.lang.String r2 = r1.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x068c
            android.view.View$OnClickListener r2 = r1.A03
            if (r2 == 0) goto L_0x068c
            java.lang.String r2 = r1.A07
            android.text.Spanned r11 = android.text.Html.fromHtml(r2)
            java.lang.String r2 = r11.toString()
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r2)
            int r3 = r2.length()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Object[] r9 = r11.getSpans(r5, r3, r2)
            int r8 = r9.length
            r7 = 0
        L_0x02c1:
            if (r7 >= r8) goto L_0x02da
            r2 = r9[r7]
            X.941 r6 = new X.941
            r6.<init>(r0, r1)
            int r4 = r11.getSpanStart(r2)
            int r3 = r11.getSpanEnd(r2)
            r2 = 33
            r10.setSpan(r6, r4, r3, r2)
            int r7 = r7 + 1
            goto L_0x02c1
        L_0x02da:
            com.whatsapp.TextEmojiLabel r2 = r0.A08
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r1)
            r2.setText(r10)
            goto L_0x0294
        L_0x02e7:
            com.whatsapp.WaImageView r3 = r0.A09
            r2 = 4
            r3.setVisibility(r2)
            goto L_0x0240
        L_0x02ef:
            X.5UX r3 = r0.A0B
            android.widget.ImageView r6 = r0.A02
            int r2 = r1.A00
            r3.A06(r6, r2)
            goto L_0x0231
        L_0x02fa:
            android.widget.RelativeLayout r2 = r0.A04
            r2.setVisibility(r4)
            goto L_0x021c
        L_0x0301:
            boolean r2 = r0 instanceof X.C191349Eo
            if (r2 == 0) goto L_0x0318
            X.9Eo r0 = (X.C191349Eo) r0
            X.9FO r1 = (X.AnonymousClass9FO) r1
            if (r1 == 0) goto L_0x0044
            android.widget.TextView r2 = r0.A00
            java.lang.String r0 = r1.A01
            r2.setText(r0)
            int r0 = r1.A00
            r2.setVisibility(r0)
            return
        L_0x0318:
            boolean r2 = r0 instanceof X.AnonymousClass9F2
            if (r2 == 0) goto L_0x0358
            X.9F2 r0 = (X.AnonymousClass9F2) r0
            X.9FW r1 = (X.AnonymousClass9FW) r1
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x0692
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x0692
            com.whatsapp.TextEmojiLabel r11 = r0.A02
            android.content.Context r7 = r11.getContext()
            X.1VX r13 = r0.A04
            X.3Wi r10 = r0.A01
            X.5hX r9 = r0.A00
            X.33i r12 = r0.A03
            android.content.Context r6 = r11.getContext()
            r5 = 2131891601(0x7f121591, float:1.9417927E38)
            java.lang.Object[] r4 = X.AnonymousClass002.A0L()
            r3 = 0
            java.lang.String r2 = r1.A01
            java.lang.String r14 = X.AnonymousClass002.A0F(r6, r2, r4, r3, r5)
            java.lang.String r15 = r1.A01
            X.3Lk r2 = r0.A05
            java.lang.String r0 = r1.A00
            android.net.Uri r8 = r2.A03(r0)
            X.C107635bd.A0E(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0358:
            boolean r2 = r0 instanceof X.C191419Ev
            if (r2 == 0) goto L_0x0383
            X.9Ev r0 = (X.C191419Ev) r0
            X.9FR r1 = (X.AnonymousClass9FR) r1
            android.widget.LinearLayout r3 = r0.A01
            android.view.View$OnClickListener r2 = r1.A00
            r3.setOnClickListener(r2)
            android.widget.ImageView r4 = r0.A00
            android.content.Context r3 = r4.getContext()
            r2 = 2131102437(0x7f060ae5, float:1.7817312E38)
            X.C1899593h.A0i(r3, r4, r2)
            boolean r2 = r1.A01
            android.widget.TextView r1 = r0.A02
            r0 = 2131896310(0x7f1227f6, float:1.9427478E38)
            if (r2 == 0) goto L_0x037f
            r0 = 2131894386(0x7f122072, float:1.9423575E38)
        L_0x037f:
            r1.setText(r0)
            return
        L_0x0383:
            boolean r2 = r0 instanceof X.C191459Ez
            if (r2 == 0) goto L_0x03e4
            X.9Ez r0 = (X.C191459Ez) r0
            X.9FV r1 = (X.AnonymousClass9FV) r1
            X.9Pj r2 = r1.A02
            if (r2 == 0) goto L_0x0044
            X.9Tr r5 = r0.A04
            android.view.View r6 = r0.A00
            X.9m8 r10 = r1.A01
            X.34w r8 = r2.A01
            X.34x r11 = r2.A02
            android.widget.Button r7 = r0.A02
            android.widget.Button r4 = r0.A03
            android.widget.Button r2 = r0.A01
            X.9SM r9 = r1.A00
            r0 = 8
            r6.setVisibility(r0)
            int r1 = r8.A02
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 != r0) goto L_0x069a
            r0 = 2131433052(0x7f0b165c, float:1.8487879E38)
            android.view.View r1 = X.C06560Yg.A02(r6, r0)
            r0 = 2131433068(0x7f0b166c, float:1.8487911E38)
            android.view.View r0 = X.C06560Yg.A02(r6, r0)
            X.C86624Kv.A12(r1, r0)
            r0 = 0
            r6.setVisibility(r0)
            r4.setVisibility(r0)
            X.9U4 r1 = r5.A0A
            java.lang.String r0 = r8.A0G
            X.9SU r1 = r1.A0F(r0)
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = r8.A0I
            X.9oC r3 = r1.A01(r0)
            if (r3 == 0) goto L_0x0044
            android.content.Context r2 = r6.getContext()
            r1 = 2
            X.9oz r0 = new X.9oz
            r0.<init>(r2, r3, r11, r1)
            r4.setOnClickListener(r0)
            return
        L_0x03e4:
            boolean r2 = r0 instanceof X.C191409Eu
            if (r2 == 0) goto L_0x044c
            X.9Eu r0 = (X.C191409Eu) r0
            X.9FU r1 = (X.AnonymousClass9FU) r1
            if (r1 == 0) goto L_0x0044
            android.widget.TextView r3 = r0.A02
            java.lang.String r2 = r1.A01
            r3.setText(r2)
            boolean r2 = r1.A02
            android.widget.ImageView r4 = r0.A01
            if (r2 == 0) goto L_0x042a
            r2 = 2131233859(0x7f080c43, float:1.8083867E38)
            r4.setImageResource(r2)
            r2 = 1127481344(0x43340000, float:180.0)
            r4.setRotation(r2)
            android.content.Context r3 = r4.getContext()
            r2 = 2131102589(0x7f060b7d, float:1.781762E38)
            android.content.res.ColorStateList r2 = X.AnonymousClass0Y8.A07(r3, r2)
            X.C05040Rr.A00(r2, r4)
            android.view.View r3 = r0.A00
            android.content.Context r2 = r3.getContext()
            r0 = 2131233766(0x7f080be6, float:1.8083679E38)
        L_0x041d:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r2, r0)
            r3.setBackground(r0)
            android.view.View$OnClickListener r0 = r1.A00
            r3.setOnClickListener(r0)
            return
        L_0x042a:
            r2 = 2131233971(0x7f080cb3, float:1.8084095E38)
            r4.setImageResource(r2)
            r2 = 0
            r4.setRotation(r2)
            android.content.Context r3 = r4.getContext()
            r2 = 2131102590(0x7f060b7e, float:1.7817622E38)
            android.content.res.ColorStateList r2 = X.AnonymousClass0Y8.A07(r3, r2)
            X.C05040Rr.A00(r2, r4)
            android.view.View r3 = r0.A00
            android.content.Context r2 = r3.getContext()
            r0 = 2131233765(0x7f080be5, float:1.8083677E38)
            goto L_0x041d
        L_0x044c:
            boolean r2 = r0 instanceof X.AnonymousClass9F3
            if (r2 == 0) goto L_0x04bd
            X.9F3 r0 = (X.AnonymousClass9F3) r0
            X.9Fc r1 = (X.C191489Fc) r1
            android.widget.Button r5 = r0.A02
            android.view.View$OnClickListener r2 = r1.A01
            r5.setOnClickListener(r2)
            android.widget.ImageView r6 = r0.A03
            int r2 = r1.A00
            r6.setImageResource(r2)
            android.content.Context r7 = r0.A00
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131103005(0x7f060d1d, float:1.7818464E38)
            int r3 = r3.getColor(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r6.setColorFilter(r3, r2)
            android.widget.TextView r3 = r0.A05
            java.lang.CharSequence r2 = r1.A04
            r3.setText(r2)
            android.widget.TextView r4 = r0.A04
            java.lang.CharSequence r2 = r1.A02
            r4.setText(r2)
            com.whatsapp.TextEmojiLabel r3 = r0.A06
            java.lang.CharSequence r2 = r1.A03
            r3.setText(r2)
            boolean r2 = r1.A06
            if (r2 == 0) goto L_0x0497
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131100304(0x7f060290, float:1.7812986E38)
            X.C18320x8.A11(r3, r5, r2)
        L_0x0497:
            boolean r2 = r1.A07
            r7 = 8
            if (r2 == 0) goto L_0x04a4
            java.lang.CharSequence r2 = r1.A02
            if (r2 != 0) goto L_0x04a4
            r4.setVisibility(r7)
        L_0x04a4:
            boolean r3 = r1.A05
            r2 = 0
            if (r3 == 0) goto L_0x04b9
            r6.setVisibility(r2)
        L_0x04ac:
            boolean r1 = r1.A07
            if (r1 == 0) goto L_0x06bb
            r5.setVisibility(r7)
            android.view.View r0 = r0.A01
            r0.setVisibility(r2)
            return
        L_0x04b9:
            r6.setVisibility(r7)
            goto L_0x04ac
        L_0x04bd:
            boolean r2 = r0 instanceof X.C191299Ej
            if (r2 != 0) goto L_0x0044
            boolean r2 = r0 instanceof X.AnonymousClass9F1
            if (r2 == 0) goto L_0x0572
            X.9F1 r0 = (X.AnonymousClass9F1) r0
            X.9Fa r1 = (X.C191469Fa) r1
            android.widget.TextView r5 = r0.A03
            java.lang.CharSequence r2 = r1.A03
            r5.setText(r2)
            android.view.View r2 = r0.A0H
            android.content.res.Resources r6 = r2.getResources()
            android.content.Context r4 = r2.getContext()
            r3 = 2130970280(0x7f0406a8, float:1.7549266E38)
            r2 = 2131102109(0x7f06099d, float:1.7816647E38)
            int r2 = X.AnonymousClass5Yj.A02(r4, r3, r2)
            X.C18320x8.A11(r6, r5, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r2)
            java.lang.CharSequence r2 = r1.A02
            r5.setContentDescription(r2)
            boolean r6 = r1.A04
            if (r6 == 0) goto L_0x0568
            X.C192719Lh.A00(r5)
        L_0x04f8:
            java.lang.CharSequence r3 = r1.A01
            r4 = 0
            if (r3 == 0) goto L_0x0505
            android.widget.TextView r2 = r0.A02
            r2.setVisibility(r4)
            r2.setText(r3)
        L_0x0505:
            X.1VX r3 = r0.A04
            r2 = 605(0x25d, float:8.48E-43)
            boolean r2 = r3.A0X(r2)
            if (r2 != 0) goto L_0x0517
            r2 = 629(0x275, float:8.81E-43)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x0044
        L_0x0517:
            X.39R r7 = r1.A00
            android.view.View r2 = r0.A00
            if (r7 == 0) goto L_0x06ea
            r2.setVisibility(r4)
            int r1 = r7.A0C
            r5.setTextColor(r1)
            if (r6 == 0) goto L_0x052d
            r1 = 1057635697(0x3f0a3d71, float:0.54)
            r5.setAlpha(r1)
        L_0x052d:
            android.widget.ImageView r6 = r0.A01
            int r1 = r7.A0A
            r6.setBackgroundColor(r1)
            java.lang.String r2 = r7.A01
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x053f
            r6.setContentDescription(r2)
        L_0x053f:
            int r1 = r7.A0D
            float r2 = (float) r1
            int r1 = r7.A09
            float r1 = (float) r1
            float r2 = r2 / r1
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            int r9 = r1.width
            float r1 = (float) r9
            float r1 = r1 / r2
            int r10 = (int) r1
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r1.height = r10
            r6.requestLayout()
            X.9Tn r8 = r0.A05
            X.3Dh r0 = r8.A00
            boolean r0 = X.C194589Tn.A00(r0, r7)
            if (r0 == 0) goto L_0x06c7
            X.9RV r0 = r8.A08
            r0.A00(r6, r7, r9, r10)
            return
        L_0x0568:
            int r2 = r5.getPaintFlags()
            r2 = r2 & -17
            r5.setPaintFlags(r2)
            goto L_0x04f8
        L_0x0572:
            boolean r2 = r0 instanceof X.AnonymousClass9F6
            if (r2 == 0) goto L_0x05ab
            X.9F6 r0 = (X.AnonymousClass9F6) r0
            X.9FL r1 = (X.AnonymousClass9FL) r1
            X.34x r7 = r1.A00
            java.lang.String r1 = r7.A13()
            java.lang.CharSequence r1 = X.C107575bX.A03(r1)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r1)
            X.5Xz r5 = r0.A04
            android.view.View r1 = r0.A0H
            android.content.Context r4 = r1.getContext()
            X.2z0 r1 = r7.A1J
            X.4uZ r3 = r1.A00
            java.util.List r2 = r7.A18
            r1 = 1
            r5.A05(r4, r6, r3, r2)
            com.whatsapp.text.ReadMoreTextView r3 = r0.A05
            r0.A07(r6, r3, r1)
            X.5OL r2 = r0.A02
            X.9ap r1 = new X.9ap
            r1.<init>(r0)
            r2.A00(r3, r1, r7, r6)
            return
        L_0x05ab:
            boolean r2 = r0 instanceof X.C191449Ey
            if (r2 == 0) goto L_0x05de
            X.9Ey r0 = (X.C191449Ey) r0
            X.9FN r1 = (X.AnonymousClass9FN) r1
            android.widget.LinearLayout r2 = r0.A01
            android.view.View$OnClickListener r1 = r1.A00
            r2.setOnClickListener(r1)
            android.widget.ImageView r3 = r0.A00
            android.content.Context r2 = r3.getContext()
            r1 = 2131102437(0x7f060ae5, float:1.7817312E38)
            X.C1899593h.A0i(r2, r3, r1)
            com.whatsapp.WaTextView r5 = r0.A02
            X.2dl r4 = X.AnonymousClass2BO.A00
            android.content.res.Resources r3 = X.C18290x4.A0G(r5)
            X.1VX r2 = r0.A03
            r1 = 2130903076(0x7f030024, float:1.741296E38)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = r4.A00(r3, r2, r0, r1)
            r5.setText(r0)
            return
        L_0x05de:
            boolean r2 = r0 instanceof X.C191339En
            if (r2 == 0) goto L_0x060a
            X.9En r0 = (X.C191339En) r0
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            com.whatsapp.payments.ui.widget.ContactMerchantView r2 = r0.A00
            X.9FC r1 = (X.AnonymousClass9FC) r1
            X.4uZ r1 = r1.A00
            r2.A00(r1)
            android.view.View r2 = r0.A0H
            r1 = 2131168872(0x7f070e68, float:1.7952058E38)
            android.content.res.Resources r0 = r2.getResources()
            int r1 = r0.getDimensionPixelOffset(r1)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.bottomMargin = r1
            r2.setLayoutParams(r0)
            return
        L_0x060a:
            boolean r2 = r0 instanceof X.C191379Er
            if (r2 == 0) goto L_0x0625
            X.9Er r0 = (X.C191379Er) r0
            X.9F8 r1 = (X.AnonymousClass9F8) r1
            android.widget.TextView r3 = r0.A01
            java.lang.String r2 = r1.A01
            r3.setText(r2)
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x0044
            android.widget.TextView r2 = r0.A00
            r2.setText(r1)
            r0 = 0
            goto L_0x06ec
        L_0x0625:
            boolean r2 = r0 instanceof X.C191329Em
            if (r2 == 0) goto L_0x0633
            X.9Em r0 = (X.C191329Em) r0
            android.view.View r2 = r0.A00
            X.9FJ r1 = (X.AnonymousClass9FJ) r1
            android.view.View$OnClickListener r0 = r1.A00
            goto L_0x0041
        L_0x0633:
            boolean r2 = r0 instanceof X.C191289Ei
            if (r2 != 0) goto L_0x0044
            boolean r2 = r0 instanceof X.C191399Et
            if (r2 == 0) goto L_0x066b
            X.9Et r0 = (X.C191399Et) r0
            X.9F9 r1 = (X.AnonymousClass9F9) r1
            java.lang.String r5 = r1.A00
            r4 = 0
            r3 = 8
            android.widget.TextView r2 = r0.A01
            if (r5 == 0) goto L_0x0662
            r2.setText(r5)
            r2.setVisibility(r4)
            android.widget.Space r2 = r0.A00
            r2.setVisibility(r3)
        L_0x0653:
            android.widget.TextView r2 = r0.A02
            android.text.SpannableStringBuilder r0 = r1.A02
            r2.setText(r0)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x06f0
            X.C192719Lh.A00(r2)
            return
        L_0x0662:
            r2.setVisibility(r3)
            android.widget.Space r2 = r0.A00
            r2.setVisibility(r4)
            goto L_0x0653
        L_0x066b:
            X.9El r0 = (X.C191319El) r0
            X.9FH r1 = (X.AnonymousClass9FH) r1
            com.whatsapp.wds.components.button.WDSButton r2 = r0.A00
            android.view.View$OnClickListener r0 = r1.A00
            goto L_0x0041
        L_0x0675:
            boolean r0 = X.C627636p.A10(r2)
            if (r0 == 0) goto L_0x067f
            r1.A02()
            return
        L_0x067f:
            r1.A00()
            return
        L_0x0683:
            android.view.View r0 = r0.A02
            r0.setVisibility(r3)
            r5.setVisibility(r4)
            return
        L_0x068c:
            android.view.View r0 = r0.A01
            r0.setVisibility(r4)
            return
        L_0x0692:
            com.whatsapp.TextEmojiLabel r2 = r0.A02
            java.lang.String r0 = r1.A02
            r2.setText(r0)
            return
        L_0x069a:
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x06aa
            r9 = 1
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r4.A04(r5, r6, r7, r8, r9)
            return
        L_0x06aa:
            int r1 = r8.A02
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x06b4
            r5.A02(r6, r2, r8)
            return
        L_0x06b4:
            r13 = 1
            java.lang.String r12 = "payment_transaction_details"
            r5.A03(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x06bb:
            r5.setVisibility(r2)
            android.view.View r0 = r0.A01
            goto L_0x06c3
        L_0x06c1:
            android.widget.TextView r0 = r0.A01
        L_0x06c3:
            r0.setVisibility(r7)
            return
        L_0x06c7:
            X.1VX r1 = r8.A05
            r0 = 1084(0x43c, float:1.519E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x06d9
            X.9VS r1 = r8.A0C
            X.1if r0 = r8.A0A
            r1.A03(r7, r0)
            return
        L_0x06d9:
            X.9cU r5 = new X.9cU
            r5.<init>(r6, r7, r8, r9, r10)
            X.4FS r2 = r8.A0D
            r1 = 1
            X.9oe r0 = new X.9oe
            r0.<init>(r5, r1, r8)
            X.C18270x1.A0w(r0, r2)
            return
        L_0x06ea:
            r0 = 8
        L_0x06ec:
            r2.setVisibility(r0)
            return
        L_0x06f0:
            int r0 = r2.getPaintFlags()
            r0 = r0 & -17
            r2.setPaintFlags(r0)
            return
        L_0x06fa:
            boolean r1 = r0 instanceof X.C191279Eh
            if (r1 != 0) goto L_0x070b
            java.lang.String r1 = "PaymentComponentListActivity"
            java.lang.String r0 = "unsupported holder"
            java.lang.String r0 = X.C160757oG.A01(r1, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x070b:
            X.95U r0 = (X.AnonymousClass95U) r0
            java.util.List r1 = r2.A00
            java.lang.Object r1 = r1.get(r3)
            X.9NZ r1 = (X.AnonymousClass9NZ) r1
            r0.A07(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass955.BNf(X.0Ua, int):void");
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        return this.A01.A74(viewGroup, i);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9NZ) this.A00.get(i)).A00;
    }
}
