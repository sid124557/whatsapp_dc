package X;

import android.view.View;

/* renamed from: X.95T  reason: invalid class name */
public abstract class AnonymousClass95T extends C05570Ua {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r3.length() == 0) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass9NY r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass9EH
            if (r0 == 0) goto L_0x003c
            r2 = r12
            X.9EH r2 = (X.AnonymousClass9EH) r2
            X.9E2 r13 = (X.AnonymousClass9E2) r13
            com.whatsapp.WaImageView r1 = r2.A00
            int r0 = r13.A01
            float r0 = (float) r0
            r1.setRotation(r0)
            android.view.View r5 = r2.A0H
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r1 = r13.A02
            r3 = 0
            if (r1 != 0) goto L_0x0033
            r2 = 0
        L_0x001f:
            int r1 = r13.A00
            if (r1 == 0) goto L_0x002b
            android.content.res.Resources r0 = X.C18290x4.A0G(r5)
            int r3 = r0.getDimensionPixelSize(r1)
        L_0x002b:
            int r1 = r4.leftMargin
            int r0 = r4.rightMargin
            r4.setMargins(r1, r2, r0, r3)
        L_0x0032:
            return
        L_0x0033:
            android.content.res.Resources r0 = X.C18290x4.A0G(r5)
            int r2 = r0.getDimensionPixelSize(r1)
            goto L_0x001f
        L_0x003c:
            boolean r0 = r12 instanceof X.AnonymousClass9EG
            if (r0 == 0) goto L_0x0057
            r1 = r12
            X.9EG r1 = (X.AnonymousClass9EG) r1
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            boolean r0 = r13 instanceof X.AnonymousClass9Dz
            if (r0 == 0) goto L_0x0032
            X.9Dz r13 = (X.AnonymousClass9Dz) r13
            if (r13 == 0) goto L_0x0032
            com.whatsapp.WaTextView r1 = r1.A00
            java.lang.CharSequence r0 = r13.A00
        L_0x0053:
            r1.setText(r0)
            return
        L_0x0057:
            boolean r0 = r12 instanceof X.AnonymousClass9EL
            if (r0 == 0) goto L_0x00ab
            r5 = r12
            X.9EL r5 = (X.AnonymousClass9EL) r5
            r4 = 0
            X.C162457s7.A0J(r13, r4)
            boolean r0 = r13 instanceof X.AnonymousClass9E4
            if (r0 == 0) goto L_0x0032
            X.9E4 r13 = (X.AnonymousClass9E4) r13
            if (r13 == 0) goto L_0x0032
            com.whatsapp.WaImageView r2 = r5.A03
            android.view.View r0 = r5.A0H
            android.content.Context r1 = r0.getContext()
            int r0 = r13.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0VX.A01(r1, r0)
            r2.setImageDrawable(r0)
            java.lang.CharSequence r3 = r13.A03
            if (r3 == 0) goto L_0x0086
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L_0x0087
        L_0x0086:
            r1 = 1
        L_0x0087:
            r2 = 8
            com.whatsapp.TextEmojiLabel r0 = r5.A02
            if (r1 != 0) goto L_0x00a7
            r0.setVisibility(r4)
            r0.setText(r3)
        L_0x0093:
            com.whatsapp.TextEmojiLabel r1 = r5.A01
            java.lang.CharSequence r0 = r13.A02
            r1.setText(r0)
            android.view.View$OnClickListener r1 = r13.A01
            android.widget.ImageView r0 = r5.A00
            if (r1 == 0) goto L_0x0380
            r0.setVisibility(r4)
            r0.setOnClickListener(r1)
            return
        L_0x00a7:
            r0.setVisibility(r2)
            goto L_0x0093
        L_0x00ab:
            boolean r0 = r12 instanceof X.AnonymousClass9EP
            if (r0 == 0) goto L_0x016c
            r8 = r12
            X.9EP r8 = (X.AnonymousClass9EP) r8
            r7 = r13
            X.9E5 r7 = (X.AnonymousClass9E5) r7
            boolean r0 = r7.A04
            r6 = 8
            r5 = 0
            if (r0 == 0) goto L_0x0166
            com.whatsapp.WaTextView r9 = r8.A02
            r9.setVisibility(r5)
            int r1 = r13.A00
            r0 = 12
            android.view.View r10 = r8.A0H
            android.content.Context r11 = r10.getContext()
            if (r1 == r0) goto L_0x0141
            X.4Fi r0 = r7.A01
            int r4 = r7.A00
            X.9P6 r3 = X.AnonymousClass9EP.A00(r11, r0, r4)
        L_0x00d5:
            android.graphics.drawable.Drawable r1 = r3.A01
            android.content.res.Resources r0 = r10.getResources()
            int r11 = r3.A00
            int r0 = r0.getColor(r11)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A0B(r1, r0)
            java.lang.String r1 = r3.A02
            android.text.TextPaint r0 = r9.getPaint()
            java.lang.CharSequence r1 = X.C87044Mw.A01(r0, r2, r1)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r1)
            android.content.res.Resources r0 = r10.getResources()
            int r0 = r0.getColor(r11)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r0)
            int r1 = r1.length()
            r0 = 33
            r3.setSpan(r2, r5, r1, r0)
            r9.setText(r3)
            r3 = 0
            android.content.res.Resources r2 = r10.getResources()
            r1 = 3
            r0 = 2131233356(0x7f080a4c, float:1.8082847E38)
            if (r4 != r1) goto L_0x011b
            r0 = 2131233357(0x7f080a4d, float:1.808285E38)
        L_0x011b:
            android.graphics.drawable.Drawable r0 = X.C02680He.A00(r3, r2, r0)
            r9.setBackground(r0)
        L_0x0122:
            java.lang.String r2 = r7.A02
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            com.whatsapp.WaTextView r0 = r8.A01
            if (r1 == 0) goto L_0x013a
            r0.setVisibility(r6)
        L_0x012f:
            android.view.View r1 = r8.A00
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0136
            r6 = 0
        L_0x0136:
            r1.setVisibility(r6)
            return
        L_0x013a:
            r0.setText(r2)
            r0.setVisibility(r5)
            goto L_0x012f
        L_0x0141:
            X.4Fi r2 = r7.A01
            int r4 = r7.A00
            X.9P6 r3 = X.AnonymousClass9EP.A00(r11, r2, r4)
            r0 = 1
            if (r4 != r0) goto L_0x00d5
            r1 = 2131102351(0x7f060a8f, float:1.7817137E38)
            r0 = 2131167688(0x7f0709c8, float:1.7949657E38)
            android.graphics.drawable.Drawable r2 = X.C195219Wq.A03(r11, r2, r1, r0)
            r0 = 2131891467(0x7f12150b, float:1.9417655E38)
            java.lang.String r1 = r11.getString(r0)
            int r0 = r3.A00
            X.9P6 r3 = new X.9P6
            r3.<init>(r2, r1, r0)
            goto L_0x00d5
        L_0x0166:
            com.whatsapp.WaTextView r0 = r8.A02
            r0.setVisibility(r6)
            goto L_0x0122
        L_0x016c:
            boolean r0 = r12 instanceof X.AnonymousClass9ED
            if (r0 != 0) goto L_0x0032
            boolean r0 = r12 instanceof X.AnonymousClass9EK
            if (r0 == 0) goto L_0x01bc
            r6 = r12
            X.9EK r6 = (X.AnonymousClass9EK) r6
            X.9E0 r13 = (X.AnonymousClass9E0) r13
            boolean r0 = r13.A01
            r7 = 8
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x019e
            com.whatsapp.TextEmojiLabel r4 = r6.A01
            X.2oU r0 = r6.A03
            android.content.Context r3 = r0.A00
            r2 = 2131891427(0x7f1214e3, float:1.9417574E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r13.A00
            r1[r5] = r0
            X.AnonymousClass001.A0y(r3, r4, r1, r2)
            android.view.View r0 = r6.A00
            r0.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r6.A02
        L_0x019a:
            r0.setVisibility(r7)
            return
        L_0x019e:
            com.whatsapp.WaTextView r4 = r6.A02
            X.2oU r3 = r6.A03
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = r13.A00
            r2[r5] = r0
            r1 = 2131891456(0x7f121500, float:1.9417633E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r3)
            java.lang.String r0 = r0.getString(r1, r2)
            r4.setText(r0)
            r4.setVisibility(r5)
            android.view.View r0 = r6.A00
            goto L_0x019a
        L_0x01bc:
            boolean r0 = r12 instanceof X.AnonymousClass9EC
            if (r0 != 0) goto L_0x0032
            boolean r0 = r12 instanceof X.AnonymousClass9EJ
            if (r0 == 0) goto L_0x01f5
            r3 = r12
            X.9EJ r3 = (X.AnonymousClass9EJ) r3
            X.9E6 r13 = (X.AnonymousClass9E6) r13
            java.util.List r0 = r13.A05
            java.util.Iterator r6 = r0.iterator()
        L_0x01cf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0384
            java.lang.Object r5 = r6.next()
            X.9Xj r5 = (X.C195339Xj) r5
            java.lang.String r1 = r5.A0A
            java.lang.String r0 = r13.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01cf
            com.whatsapp.WaTextView r4 = r3.A02
            X.2nc r2 = r3.A03
            java.lang.String r1 = r5.A09
            java.lang.String r0 = r5.A08
            java.lang.String r0 = X.C1899593h.A0b(r2, r1, r0)
            r4.setText(r0)
            goto L_0x01cf
        L_0x01f5:
            boolean r0 = r12 instanceof X.AnonymousClass9EN
            if (r0 == 0) goto L_0x02ef
            r6 = r12
            X.9EN r6 = (X.AnonymousClass9EN) r6
            X.9E8 r13 = (X.AnonymousClass9E8) r13
            X.4DV r0 = r13.A06
            X.39W r3 = r0.B5s()
            android.widget.LinearLayout r1 = r6.A00
            r7 = 8
            r1.setVisibility(r7)
            r8 = 1
            r5 = 0
            if (r3 == 0) goto L_0x02e7
            X.39S r0 = r3.A01
            if (r0 == 0) goto L_0x02e7
            X.99n r2 = r6.A0A
            X.1VX r4 = r2.A02
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 != 0) goto L_0x0227
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x023d
        L_0x0227:
            X.39S r0 = r3.A01
            java.lang.String r0 = r0.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x023d
            r1.setVisibility(r5)
            com.whatsapp.WaTextView r1 = r6.A05
            X.39S r0 = r3.A01
            java.lang.String r0 = r0.A0A
            r1.setText(r0)
        L_0x023d:
            X.39S r0 = r3.A01
            java.lang.String r0 = r0.A0D
            boolean r3 = r2.A0K(r0)
            r2 = 1
        L_0x0246:
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x02e1
            com.whatsapp.WaTextView r0 = r6.A07
            r0.setVisibility(r7)
            com.whatsapp.WaImageView r1 = r6.A03
            android.graphics.drawable.Drawable r0 = r13.A01
            r1.setImageDrawable(r0)
            r0 = 4
            if (r2 == 0) goto L_0x025a
            r0 = 0
        L_0x025a:
            r1.setVisibility(r0)
            X.34w r1 = r13.A03
            if (r3 == 0) goto L_0x02d1
            r6.A08(r1)
            X.99n r0 = r6.A0A
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0282
            com.whatsapp.WaTextView r1 = r6.A08
            r0 = 2131891949(0x7f1216ed, float:1.9418632E38)
            r1.setText(r0)
            X.5UY r1 = r6.A0B
            r1.A06(r5)
            r0 = 128(0x80, float:1.794E-43)
            X.9p3 r0 = X.C204249p3.A00(r13, r0)
            r1.A07(r0)
        L_0x0282:
            android.widget.LinearLayout r1 = r6.A02
            r1.setVisibility(r5)
            r0 = 129(0x81, float:1.81E-43)
            X.C204249p3.A02(r1, r13, r0)
        L_0x028c:
            if (r3 != 0) goto L_0x02c3
            java.lang.String r4 = r13.A07
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x02c3
            android.view.View r0 = r6.A0H
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131891430(0x7f1214e6, float:1.941758E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.9O6 r0 = r13.A02
            if (r0 == 0) goto L_0x02c1
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x02c1
        L_0x02a9:
            java.lang.String r1 = X.C18320x8.A0b(r3, r0, r1, r5, r2)
        L_0x02ad:
            com.whatsapp.WaTextView r0 = r6.A06
            r0.setText(r1)
            boolean r0 = r13.A09
            if (r0 == 0) goto L_0x02eb
            android.widget.LinearLayout r1 = r6.A01
            r1.setVisibility(r5)
            r0 = 130(0x82, float:1.82E-43)
            X.C204249p3.A02(r1, r13, r0)
            return
        L_0x02c1:
            r0 = r4
            goto L_0x02a9
        L_0x02c3:
            android.view.View r0 = r6.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131891431(0x7f1214e7, float:1.9417582E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x02ad
        L_0x02d1:
            if (r1 == 0) goto L_0x0282
            X.1S4 r0 = r1.A0A
            if (r0 == 0) goto L_0x0282
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x0282
            r6.A08(r1)
            goto L_0x0282
        L_0x02e1:
            android.widget.LinearLayout r0 = r6.A02
            r0.setVisibility(r7)
            goto L_0x028c
        L_0x02e7:
            r3 = 0
            r2 = 0
            goto L_0x0246
        L_0x02eb:
            android.widget.LinearLayout r0 = r6.A01
            goto L_0x019a
        L_0x02ef:
            boolean r0 = r12 instanceof X.AnonymousClass9EI
            if (r0 == 0) goto L_0x0346
            r4 = r12
            X.9EI r4 = (X.AnonymousClass9EI) r4
            X.9E3 r13 = (X.AnonymousClass9E3) r13
            com.whatsapp.WaImageView r6 = r4.A00
            r5 = 0
            r6.setVisibility(r5)
            X.5mM r3 = r4.A03
            android.view.View r2 = r4.A0H
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "payment-checkout-order-details-view"
            X.5Uq r1 = r3.A06(r1, r0)
            X.3ZH r0 = r13.A00
            X.C626936e.A06(r0)
            r1.A08(r6, r0)
            java.lang.String r3 = r13.A01
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x032e
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131891454(0x7f1214fe, float:1.9417629E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            java.lang.String r0 = X.C18320x8.A0b(r2, r3, r0, r5, r1)
            r6.setContentDescription(r0)
        L_0x032e:
            boolean r0 = r13.A03
            com.whatsapp.WaTextView r1 = r4.A01
            if (r0 == 0) goto L_0x0340
            r1.setVisibility(r5)
            r1.setText(r3)
        L_0x033a:
            com.whatsapp.WaTextView r1 = r4.A02
            java.lang.String r0 = r13.A02
            goto L_0x0053
        L_0x0340:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x033a
        L_0x0346:
            boolean r0 = r12 instanceof X.AnonymousClass9EB
            if (r0 != 0) goto L_0x0032
            boolean r0 = r12 instanceof X.AnonymousClass9EA
            if (r0 != 0) goto L_0x0032
            boolean r0 = r12 instanceof X.AnonymousClass9EF
            if (r0 == 0) goto L_0x036b
            r1 = r12
            X.9EF r1 = (X.AnonymousClass9EF) r1
            X.9Dy r13 = (X.C191199Dy) r13
            java.lang.String r2 = r13.A00
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            android.widget.TextView r1 = r1.A00
            if (r0 != 0) goto L_0x0369
            r1.setText(r2)
            r0 = 0
        L_0x0365:
            r1.setVisibility(r0)
            return
        L_0x0369:
            r0 = 4
            goto L_0x0365
        L_0x036b:
            boolean r0 = r12 instanceof X.AnonymousClass9EE
            if (r0 == 0) goto L_0x0032
            r1 = r12
            X.9EE r1 = (X.AnonymousClass9EE) r1
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            com.whatsapp.payments.ui.widget.ContactMerchantView r1 = r1.A00
            X.9Dx r13 = (X.AnonymousClass9Dx) r13
            X.4uZ r0 = r13.A00
            r1.A00(r0)
            return
        L_0x0380:
            r0.setVisibility(r2)
            return
        L_0x0384:
            java.lang.String r1 = r13.A03
            java.lang.String r0 = "checkout_lite"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03a3
            android.widget.ImageView r1 = r3.A01
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r2 = r3.A00
            r2.setVisibility(r0)
            r1 = 0
            X.9oc r0 = new X.9oc
            r0.<init>(r13, r1, r3)
            r2.setOnClickListener(r0)
            return
        L_0x03a3:
            android.view.View r0 = r3.A00
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A01
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass95T.A07(X.9NY):void");
    }

    public AnonymousClass95T(View view) {
        super(view);
    }
}
