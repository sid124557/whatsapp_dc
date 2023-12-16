package com.whatsapp.biz.product.view.activity;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass30V;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CK;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4V2;
import X.AnonymousClass4V5;
import X.AnonymousClass5MK;
import X.AnonymousClass5P6;
import X.AnonymousClass5T7;
import X.AnonymousClass5UW;
import X.AnonymousClass5X1;
import X.AnonymousClass5XF;
import X.AnonymousClass5Y9;
import X.AnonymousClass5ZU;
import X.AnonymousClass6C6;
import X.AnonymousClass74S;
import X.AnonymousClass7OY;
import X.AnonymousClass7PB;
import X.AnonymousClass7SU;
import X.AnonymousClass7SV;
import X.AnonymousClass800;
import X.AnonymousClass8EO;
import X.AnonymousClass930;
import X.C100485Bc;
import X.C101125Do;
import X.C103115Lp;
import X.C104205Qb;
import X.C104975Tb;
import X.C105035Th;
import X.C105145Tt;
import X.C105365Uq;
import X.C105405Uu;
import X.C106945aQ;
import X.C107575bX;
import X.C107695bk;
import X.C108985dt;
import X.C109015dw;
import X.C112055j7;
import X.C114015mM;
import X.C117115rP;
import X.C124086Ax;
import X.C149847Od;
import X.C151257Ua;
import X.C154197cm;
import X.C167237zz;
import X.C179078iZ;
import X.C181728nE;
import X.C181738nF;
import X.C181798nL;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C189038zt;
import X.C29201iR;
import X.C29221iT;
import X.C29291ia;
import X.C49732h0;
import X.C50642iX;
import X.C52332lJ;
import X.C55502qS;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C86654Ky;
import X.C88694ab;
import X.C88834as;
import X.C89654ea;
import X.C90514ha;
import X.C989453v;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

public class ProductDetailActivity extends C90514ha implements C181738nF, C179078iZ {
    public C88694ab A00;
    public C101125Do A01;
    public C29291ia A02;
    public AnonymousClass4V2 A03;
    public PostcodeChangeBottomSheet A04;
    public C104975Tb A05;
    public AnonymousClass5X1 A06;
    public AnonymousClass5ZU A07;
    public C105365Uq A08;
    public C114015mM A09;
    public AnonymousClass7SU A0A;
    public AnonymousClass30V A0B;
    public boolean A0C;
    public final AnonymousClass4CK A0D;
    public final C50642iX A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0193, code lost:
        if (r0.size() <= 0) goto L_0x0195;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A74() {
        /*
            r15 = this;
            r9 = r15
            r15.invalidateOptionsMenu()
            X.5dw r0 = r15.A0V
            r2 = 8
            r1 = 1
            r8 = 0
            if (r0 != 0) goto L_0x00c9
            int r3 = r15.A00
            com.whatsapp.TextEmojiLabel r0 = r15.A0F
            if (r3 != r1) goto L_0x00b8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r15.A0A
            r0.setVisibility(r2)
            android.view.View r0 = r15.A04
            if (r0 == 0) goto L_0x0021
            r0.setVisibility(r8)
        L_0x0021:
            X.4V5 r5 = r15.A0k
            int r3 = r15.A00
            X.5dw r2 = r15.A0V
            boolean r0 = r5.A0E(r2, r3)
            r4 = 1
            r1 = 2
            if (r0 == 0) goto L_0x0056
            X.08M r0 = r5.A04
            java.lang.Object r2 = r0.A07()
            X.5dt r2 = (X.C108985dt) r2
            X.5dw r0 = r15.A0V
            if (r0 == 0) goto L_0x00b3
            int r0 = r0.A00
            if (r0 != r1) goto L_0x00b3
            X.5Tb r1 = r15.A05
            java.lang.String r0 = "postcode"
            boolean r0 = r1.A03(r2, r0, r4)
            if (r0 == 0) goto L_0x00b3
            r15.A79(r2)
            com.whatsapp.TextEmojiLabel r1 = r15.A0E
            r0 = 0
        L_0x004f:
            r1.setVisibility(r0)
        L_0x0052:
            super.A74()
            return
        L_0x0056:
            if (r3 == r1) goto L_0x0068
            if (r2 == 0) goto L_0x009a
            X.38u r0 = r2.A01
            if (r0 == 0) goto L_0x0062
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0068
        L_0x0062:
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x009a
        L_0x0068:
            r3 = 2131893053(0x7f121b3d, float:1.9420872E38)
        L_0x006b:
            X.4V5 r0 = r15.A0k
            X.08M r0 = r0.A04
            java.lang.Object r2 = r0.A07()
            X.5dt r2 = (X.C108985dt) r2
            X.5Tb r1 = r15.A05
            java.lang.String r0 = "postcode"
            boolean r0 = r1.A03(r2, r0, r4)
            if (r0 == 0) goto L_0x0088
            r15.A79(r2)
        L_0x0082:
            com.whatsapp.TextEmojiLabel r0 = r15.A0E
            r0.setVisibility(r8)
            goto L_0x0052
        L_0x0088:
            com.whatsapp.TextEmojiLabel r2 = r15.A0E
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131100005(0x7f060165, float:1.781238E38)
            X.C18320x8.A11(r1, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r15.A0E
            r0.setText(r3)
            goto L_0x0082
        L_0x009a:
            r0 = 3
            if (r3 != r0) goto L_0x00a1
            r3 = 2131887535(0x7f1205af, float:1.940968E38)
            goto L_0x006b
        L_0x00a1:
            if (r2 == 0) goto L_0x00a7
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x00a9
        L_0x00a7:
            if (r3 != r4) goto L_0x00b3
        L_0x00a9:
            boolean r0 = X.AnonymousClass4SG.A40(r15)
            if (r0 != 0) goto L_0x00b3
            r3 = 2131887760(0x7f120690, float:1.9410136E38)
            goto L_0x006b
        L_0x00b3:
            com.whatsapp.TextEmojiLabel r1 = r15.A0E
            r0 = 8
            goto L_0x004f
        L_0x00b8:
            r0.setVisibility(r8)
            android.widget.TextView r0 = r15.A0A
            r0.setVisibility(r8)
            android.view.View r0 = r15.A04
            if (r0 == 0) goto L_0x0021
            r0.setVisibility(r2)
            goto L_0x0021
        L_0x00c9:
            android.view.View r0 = r15.A04
            if (r0 == 0) goto L_0x00d0
            r0.setVisibility(r2)
        L_0x00d0:
            X.5dw r0 = r15.A0V
            java.lang.String r0 = r0.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02a3
            com.whatsapp.TextEmojiLabel r3 = r15.A0F
            X.5dw r0 = r15.A0V
            java.lang.String r5 = r0.A05
            r4 = 0
            r7 = 450(0x1c2, float:6.3E-43)
            r6 = r4
            r3.A0H(r4, r5, r6, r7, r8)
            com.whatsapp.TextEmojiLabel r0 = r15.A0F
            r0.setVisibility(r8)
        L_0x00ec:
            X.5dw r3 = r15.A0V
            java.math.BigDecimal r0 = r3.A06
            if (r0 == 0) goto L_0x029c
            X.7ny r0 = r3.A04
            if (r0 == 0) goto L_0x029c
            android.widget.TextView r0 = r15.A0A
            r0.setVisibility(r8)
            android.widget.TextView r3 = r15.A0A
            X.5dw r0 = r15.A0V
            java.math.BigDecimal r13 = r0.A06
            X.7ny r11 = r0.A04
            X.5dU r10 = r0.A02
            X.33j r12 = r15.A00
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            android.text.SpannableString r0 = X.C106945aQ.A01(r9, r10, r11, r12, r13, r14)
            r3.setText(r0)
        L_0x0113:
            X.5dw r0 = r15.A0V
            java.lang.String r0 = r0.A0C
            boolean r0 = X.C107575bX.A0F(r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r5 = r15.A0e
            if (r0 == 0) goto L_0x0289
            r5.setVisibility(r2)
        L_0x0122:
            X.5dw r0 = r15.A0V
            java.lang.String r0 = r0.A0E
            boolean r0 = X.C107575bX.A0F(r0)
            android.widget.TextView r4 = r15.A09
            if (r0 == 0) goto L_0x026e
            r4.setVisibility(r2)
        L_0x0131:
            X.5dw r0 = r15.A0V
            java.lang.String r0 = r0.A0G
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 != 0) goto L_0x0267
            X.2rx r3 = r15.A0p
            com.whatsapp.jid.UserJid r0 = r15.A0r
            boolean r0 = r3.A03(r0)
            if (r0 != 0) goto L_0x0267
            android.widget.TextView r4 = r15.A0B
            X.5dw r0 = r15.A0V
            java.lang.String r3 = r0.A0G
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.C107575bX.A0C(r3, r0)
            r4.setText(r0)
            android.widget.TextView r0 = r15.A0B
            r0.setVisibility(r8)
        L_0x0159:
            X.5dw r0 = r15.A0V
            int r3 = r0.A00
            com.whatsapp.wds.components.button.WDSButton r0 = r15.A0v
            if (r3 == 0) goto L_0x025d
            r0.setEnabled(r8)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r0 = r15.A0i
            r0.setEnabled(r8)
        L_0x0169:
            X.5dw r0 = r15.A0V
            int r0 = r0.A00
            com.whatsapp.WaTextView r3 = r15.A0H
            if (r0 != r1) goto L_0x0258
            r0 = 2131892756(0x7f121a14, float:1.942027E38)
            r3.setText(r0)
            com.whatsapp.WaTextView r0 = r15.A0H
            r0.setVisibility(r8)
        L_0x017c:
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r0 = r15.A0f
            if (r0 == 0) goto L_0x01bc
            X.5dw r0 = r15.A0V
            X.5dV r0 = r0.A0B
            if (r0 == 0) goto L_0x0195
            X.5dM r0 = r0.A00
            if (r0 == 0) goto L_0x0195
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0195
            int r0 = r0.size()
            r2 = 1
            if (r0 > 0) goto L_0x0196
        L_0x0195:
            r2 = 0
        L_0x0196:
            boolean r0 = r15.A16
            if (r0 == 0) goto L_0x01bc
            X.5dw r0 = r15.A0V
            r15.A0U = r0
            if (r2 != 0) goto L_0x01af
            X.5dV r0 = r0.A0B
            if (r0 == 0) goto L_0x01af
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x01af
            int r0 = r0.size()
            if (r0 == 0) goto L_0x01af
            r1 = 0
        L_0x01af:
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r4 = r15.A0f
            X.5dw r3 = r15.A0V
            r2 = 2
            X.6Bz r0 = new X.6Bz
            r0.<init>(r15, r2)
            r4.A1I(r3, r0, r1)
        L_0x01bc:
            java.util.List r0 = r15.A12
            if (r0 == 0) goto L_0x01c3
            r15.A77(r0)
        L_0x01c3:
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r4 = r15.A0c
            X.5dw r7 = r15.A0V
            X.7aS r5 = r15.A0a
            com.whatsapp.jid.UserJid r3 = r15.A0r
            int r2 = r15.A00
            r1 = 0
            if (r7 == 0) goto L_0x01dd
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x01dd
            if (r2 != 0) goto L_0x01dd
            boolean r0 = r7.A02()
            if (r0 != 0) goto L_0x01dd
            r1 = 1
        L_0x01dd:
            r4.A03 = r5
            r4.A07 = r3
            r4.A0B = r1
            X.5dw r0 = r4.A01
            boolean r0 = r7.equals(r0)
            r2 = 1
            r6 = r0 ^ 1
            r4.A01 = r7
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x024f
            r4.A0C = r2
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r4)
            r0 = 2131625838(0x7f0e076e, float:1.8878895E38)
            android.view.View r5 = r1.inflate(r0, r4, r2)
            r0 = 2131432659(0x7f0b14d3, float:1.8487082E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.C86654Ky.A0P(r5, r0)
            r4.A00 = r0
            r4.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            r0.setLayoutManager(r1)
            X.4We r1 = new X.4We
            r1.<init>(r4)
            r4.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r4.A00
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131167894(0x7f070a96, float:1.7950074E38)
            int r2 = r1.getDimensionPixelSize(r0)
            X.33j r1 = r4.A06
            X.4XT r0 = new X.4XT
            r0.<init>(r1, r2)
            r3.A0o(r0)
            r0 = 2131433259(0x7f0b172b, float:1.8488299E38)
            android.view.View r2 = X.C06560Yg.A02(r5, r0)
            com.whatsapp.biz.catalog.view.CarouselScrollbarView r2 = (com.whatsapp.biz.catalog.view.CarouselScrollbarView) r2
            r4.A04 = r2
            androidx.recyclerview.widget.RecyclerView r1 = r4.A00
            r2.A00 = r1
            X.8za r0 = new X.8za
            r0.<init>(r2, r8)
            r1.A0q(r0)
        L_0x024f:
            if (r6 == 0) goto L_0x0021
            X.4We r0 = r4.A05
            r0.A05()
            goto L_0x0021
        L_0x0258:
            r3.setVisibility(r2)
            goto L_0x017c
        L_0x025d:
            r0.setEnabled(r1)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r0 = r15.A0i
            r0.setEnabled(r1)
            goto L_0x0169
        L_0x0267:
            android.widget.TextView r0 = r15.A0B
            r0.setVisibility(r2)
            goto L_0x0159
        L_0x026e:
            X.5dw r0 = r15.A0V
            java.lang.String r3 = r0.A0E
            r0 = 420(0x1a4, float:5.89E-43)
            java.lang.String r0 = X.C107575bX.A0C(r3, r0)
            r4.setText(r0)
            android.widget.TextView r3 = r15.A09
            r0 = 26
            X.C989453v.A00(r3, r15, r0)
            android.widget.TextView r0 = r15.A09
            r0.setVisibility(r8)
            goto L_0x0131
        L_0x0289:
            r5.A03 = r1
            X.5dw r0 = r15.A0V
            java.lang.String r4 = r0.A0C
            r3 = 0
            r0 = 180(0xb4, float:2.52E-43)
            r5.A0J(r4, r3, r0, r1)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r15.A0e
            r0.setVisibility(r8)
            goto L_0x0122
        L_0x029c:
            android.widget.TextView r0 = r15.A0A
            r0.setVisibility(r2)
            goto L_0x0113
        L_0x02a3:
            com.whatsapp.TextEmojiLabel r0 = r15.A0F
            r0.setVisibility(r2)
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.A74():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A79(X.C108985dt r9) {
        /*
            r8 = this;
            r2 = 0
            if (r9 == 0) goto L_0x0022
            X.33p r1 = r8.A09
            com.whatsapp.jid.UserJid r0 = r8.A0r
            java.lang.String r0 = r0.getRawString()
            java.lang.String r1 = r1.A0c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0021
            X.7y4 r0 = r9.A02
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r0.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r2 = r1
        L_0x0022:
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0095
            r0 = 2131891257(0x7f121439, float:1.9417229E38)
            java.lang.String r5 = r8.getString(r0)
            r0 = 2
            android.text.SpannableStringBuilder[] r4 = new android.text.SpannableStringBuilder[r0]
            android.text.SpannableStringBuilder r0 = X.C18330xA.A00(r2)
            r4[r6] = r0
            r0 = 2131887598(0x7f1205ee, float:1.9409808E38)
            java.lang.String r0 = r8.getString(r0)
            android.text.SpannableStringBuilder r3 = X.C18330xA.A00(r0)
            X.67t r2 = new X.67t
            r2.<init>(r8, r8, r6)
            int r1 = r0.length()
            r0 = 33
            r3.setSpan(r2, r6, r1, r0)
            r4[r7] = r3
            android.text.SpannableStringBuilder r3 = X.C107635bd.A03(r5, r4)
        L_0x0055:
            com.whatsapp.TextEmojiLabel r1 = r8.A0E
            X.1VX r0 = r8.A0D
            X.AnonymousClass0x2.A14(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r8.A0E
            X.33i r0 = r8.A08
            X.AnonymousClass0x2.A12(r1, r0)
            com.whatsapp.TextEmojiLabel r0 = r8.A0E
            r0.setLinksClickable(r7)
            com.whatsapp.TextEmojiLabel r0 = r8.A0E
            r0.setFocusable(r6)
            com.whatsapp.TextEmojiLabel r2 = r8.A0E
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.C18320x8.A11(r1, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r8.A0E
            r0.setText(r3)
            com.whatsapp.TextEmojiLabel r1 = r8.A0E
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.setGravity(r0)
            r0 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            android.view.View r1 = r8.findViewById(r0)
            int r0 = X.AnonymousClass5Yj.A01(r8)
            X.C86604Kt.A0z(r8, r1, r0)
            return
        L_0x0095:
            r0 = 2131891256(0x7f121438, float:1.9417227E38)
            java.lang.String r5 = r8.getString(r0)
            android.text.Spannable[] r4 = new android.text.Spannable[r7]
            r0 = 2131887598(0x7f1205ee, float:1.9409808E38)
            java.lang.String r0 = r8.getString(r0)
            android.text.SpannableStringBuilder r3 = X.C18330xA.A00(r0)
            X.67t r2 = new X.67t
            r2.<init>(r8, r8, r6)
            int r1 = r0.length()
            r0 = 33
            r3.setSpan(r2, r6, r1, r0)
            r4[r6] = r3
            android.text.SpannableStringBuilder r3 = X.C107635bd.A03(r5, r4)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.A79(X.5dt):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 55) {
            this.A0R.A01(this, this.A0a, this.A0r, this.A0r, Collections.singletonList(this.A0V), 2, 0, 0);
        }
    }

    public void A5r() {
        if (!this.A0C) {
            this.A0C = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r3, this, AnonymousClass4SG.A2t(r1, r3, this));
            this.A0l = (C106945aQ) A2X.A08.get();
            this.A0O = A2X.ABU();
            this.A0G = C64333Db.A08(r1);
            this.A0R = (AnonymousClass5XF) r1.A4f.get();
            this.A0t = C86644Kx.A0a(r1);
            this.A0M = (AnonymousClass5UW) r1.A4T.get();
            this.A0L = (C29201iR) r1.A4U.get();
            this.A0Y = (AnonymousClass5Y9) r1.A4Y.get();
            this.A0s = (C103115Lp) r3.A8P.get();
            this.A0q = C86644Kx.A0T(r1);
            this.A0n = C64333Db.A26(r1);
            this.A0S = (C29221iT) r1.ARg.get();
            this.A0Z = (C151257Ua) r3.A2I.get();
            this.A0K = (AnonymousClass5T7) r1.A4a.get();
            this.A0p = C86614Ku.A0T(r1);
            this.A0T = (C105405Uu) r1.A4W.get();
            this.A0J = C86624Kv.A0K(r1);
            this.A0P = (C181728nE) A2X.A1C.get();
            this.A0X = C86644Kx.A0P(r1);
            this.A0o = C86644Kx.A0R(r1);
            this.A0u = (AnonymousClass7SV) r3.A2J.get();
            this.A0I = (C105035Th) r1.A3s.get();
            this.A0m = r1.Ai7();
            this.A0j = new AnonymousClass7OY((C105405Uu) r1.A4W.get(), (AnonymousClass5Y9) r1.A4Y.get(), (C104205Qb) r1.ARe.get(), C86614Ku.A0U(r1), C86604Kt.A0g(r1));
            this.A0g = new AnonymousClass5MK((C105145Tt) r1.A4V.get());
            this.A0N = new C154197cm();
            this.A0h = (C49732h0) A2X.A4Y.A02.get();
            this.A0b = (C181798nL) A2X.A1N.get();
            this.A09 = C64333Db.A29(r1);
            this.A07 = C64333Db.A28(r1);
            this.A02 = C86654Ky.A0S(r1);
            this.A01 = (C101125Do) A2X.A47.get();
            this.A05 = r1.AhS();
            this.A06 = (AnonymousClass5X1) r1.A3p.get();
            this.A0A = (AnonymousClass7SU) r1.A4d.get();
            this.A0B = C86604Kt.A0f(r1);
        }
    }

    public void A66() {
        if (this.A0D.A0X(6715)) {
            this.A0B.A03(this.A0r, 61);
        }
        super.A66();
    }

    public boolean A6C() {
        return true;
    }

    public void BYv(C149847Od r6, boolean z) {
        C109015dw r0 = this.A0V;
        if (r0 != null && r0.A0F.equals(r6.A03)) {
            BjL();
            String str = null;
            C105145Tt r3 = this.A0X;
            AnonymousClass5P6 r2 = new AnonymousClass5P6();
            r2.A0A = r6.A05;
            AnonymousClass5P6.A05(r2, r3, r6.A00);
            r2.A09 = Long.valueOf(r6.A01);
            C109015dw r02 = this.A0V;
            if (z) {
                if (r02 != null) {
                    str = r02.A0F;
                }
                r2.A0G = str;
                r2.A00 = this.A0r;
                r3.A03(r2);
                C89654ea.A4X(this, R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            }
            if (r02 != null) {
                str = r02.A0F;
            }
            r2.A0G = str;
            r2.A00 = this.A0r;
            r3.A03(r2);
            Bot(R.string.f11nameremoved);
        }
    }

    public void onBackPressed() {
        if (this.A0r != null && AnonymousClass0x9.A1N(getIntent(), "go_back_to_catalog_from_deeplink")) {
            this.A0A.A00();
            this.A0K.A00(this, this.A0r, 1, 13);
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        this.A0Y.A0Q.remove(this);
        this.A0S.A07(this.A0E);
        this.A02.A07(this.A0D);
        super.onDestroy();
        C105365Uq r0 = this.A08;
        if (r0 != null) {
            r0.A00();
        }
    }

    public ProductDetailActivity(int i) {
        this.A0C = false;
        C86604Kt.A1K(this, 18);
    }

    public final void A78(C108985dt r12) {
        int A012 = AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved);
        C52332lJ A002 = this.A0m.A00(r12, AnonymousClass74S.A00());
        this.A0Y.A09(new AnonymousClass7PB(A002, this.A0r, Integer.valueOf(getIntent().getIntExtra("thumb_width", A012)), Integer.valueOf(getIntent().getIntExtra("thumb_height", A012)), this.A10, this.A0X.A02, false));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.A02.A06(this.A0D);
        View findViewById = findViewById(R.id.product_business_info_container);
        C101125Do r1 = this.A01;
        UserJid userJid = this.A0r;
        boolean A1Y = AnonymousClass0x2.A1Y(r1, userJid);
        this.A03 = (AnonymousClass4V2) C124086Ax.A00(this, r1, userJid, 0).A01(AnonymousClass4V2.class);
        C86604Kt.A1M(this, this.A0k.A05, 40);
        this.A0k.A04.A0B(this, new C100485Bc(bundle, findViewById, this, A1Y ? 1 : 0));
        AnonymousClass6C6.A01(this, this.A0k.A07, 27);
        C86604Kt.A1M(this, this.A0k.A03, 41);
        this.A0S.A06(this.A0E);
        this.A0Y.A0Q.add(this);
        if (findViewById != null && !this.A01.A0a(this.A0r)) {
            C18280x3.A0r(this, R.id.divider_bizinfo, 0);
            findViewById.setVisibility(0);
            View findViewById2 = findViewById(R.id.contact_info_container);
            TextView A0L = C18310x6.A0L(this, R.id.contact_name);
            ImageView A0M = C86654Ky.A0M(this, R.id.contact_photo);
            C55502qS A012 = this.A0p.A01(this.A0r);
            if (A012 == null) {
                str = null;
            } else {
                str = A012.A08;
            }
            AnonymousClass3ZH A0A2 = this.A0n.A0A(this.A0r);
            if (A0L != null) {
                if (C107575bX.A0F(str)) {
                    str = this.A07.A0H(A0A2);
                }
                A0L.setText(str);
            }
            C105365Uq A062 = this.A09.A06(this, "product-detail-activity");
            this.A08 = A062;
            A062.A08(A0M, A0A2);
            C989453v.A00(findViewById2, this, 29);
        }
        AnonymousClass8EO r2 = this.A0k.A0H;
        C117115rP.A01(r2.A04, r2, 42);
        this.A0Q.A0E();
        this.A0q.A03(new C167237zz(), this.A0r);
        this.A0q.A03(new AnonymousClass800(0), this.A0r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r2 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131820569(0x7f110019, float:1.9273857E38)
            r1.inflate(r0, r4)
            X.4V5 r2 = r3.A0k
            int r1 = r3.A00
            X.5dw r0 = r3.A0V
            boolean r2 = r2.A0E(r0, r1)
            r0 = 2131431380(0x7f0b0fd4, float:1.8484488E38)
            android.view.MenuItem r1 = r4.findItem(r0)
            boolean r0 = r3.A14
            if (r0 != 0) goto L_0x0022
            r0 = 1
            if (r2 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r1.setVisible(r0)
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (R.id.menu_report == itemId) {
            ReportProductDialogFragment reportProductDialogFragment = new ReportProductDialogFragment();
            reportProductDialogFragment.A00 = new C112055j7(this);
            Bon(reportProductDialogFragment, (String) null);
            return true;
        } else if (16908332 != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0k.A0D(this);
            return true;
        }
    }

    public void onStart() {
        super.onStart();
        if (AnonymousClass0x9.A1N(getIntent(), "partial_loaded")) {
            AnonymousClass4V5 r2 = this.A0k;
            C18320x8.A18(r2.A07, r2.A0I.A0F());
        }
    }

    public ProductDetailActivity() {
        this(0);
        this.A0E = new C189038zt(this, 1);
        this.A0D = new AnonymousClass930(this, 3);
    }
}
