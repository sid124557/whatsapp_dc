package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass746;
import X.AnonymousClass7RX;
import X.C152717a0;
import X.C162457s7;
import X.C175398Yf;
import X.C18270x1;
import X.C1899293e;
import X.C86604Kt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class VariantsCarouselFragment extends Hilt_VariantsCarouselFragment {
    public ShimmerFrameLayout A00;
    public ShimmerFrameLayout A01;
    public AnonymousClass7RX A02;
    public C152717a0 A03;
    public C152717a0 A04;
    public VariantsCarouselFragmentViewModel A05;
    public UserJid A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C152717a0 r2;
        C152717a0 r22;
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A00 = (ShimmerFrameLayout) inflate.findViewById(R.id.variants_container1);
        this.A01 = (ShimmerFrameLayout) inflate.findViewById(R.id.variants_container2);
        ShimmerFrameLayout shimmerFrameLayout = this.A00;
        if (!(shimmerFrameLayout == null || (r22 = this.A03) == null)) {
            UserJid userJid = this.A06;
            if (userJid == null) {
                throw C18270x1.A0S("bizJid");
            }
            r22.A01(A0T(), this, shimmerFrameLayout, userJid);
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.A01;
        if (!(shimmerFrameLayout2 == null || (r2 = this.A04) == null)) {
            UserJid userJid2 = this.A06;
            if (userJid2 == null) {
                throw C18270x1.A0S("bizJid");
            }
            r2.A01(A0T(), this, shimmerFrameLayout2, userJid2);
        }
        C152717a0 r23 = this.A03;
        if (r23 != null) {
            r23.A04 = new C1899293e(this, 0);
        }
        C152717a0 r24 = this.A04;
        if (r24 != null) {
            r24.A04 = new C1899293e(this, 1);
        }
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = this.A05;
        if (variantsCarouselFragmentViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(A0V(), variantsCarouselFragmentViewModel.A04, new AnonymousClass746(this, 3), 30);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel2 = this.A05;
        if (variantsCarouselFragmentViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(A0V(), variantsCarouselFragmentViewModel2.A08, new C175398Yf(view, this), 31);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01db, code lost:
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e3, code lost:
        r10 = r0.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1I(X.C109015dw r21, X.AnonymousClass4GQ r22, boolean r23) {
        /*
            r20 = this;
            r19 = r20
            r0 = r19
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r0.A05
            r18 = r0
            java.lang.String r17 = "viewModel"
            if (r0 != 0) goto L_0x0011
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r17)
            throw r0
        L_0x0011:
            r2 = r21
            r0.A00 = r2
            r1 = r23
            r0.A02 = r1
            X.08M r4 = r0.A05
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            if (r21 == 0) goto L_0x026f
            X.5dV r1 = r2.A0B
            if (r1 == 0) goto L_0x026f
            X.7fW r14 = r0.A06
            r11 = 0
            X.5dM r0 = r1.A00
            r12 = 0
            r10 = 1
            if (r0 == 0) goto L_0x008e
            java.util.List r5 = r0.A00
            if (r5 == 0) goto L_0x008e
            boolean r0 = X.C18310x6.A1X(r5)
            if (r0 == 0) goto L_0x008e
        L_0x0038:
            java.util.List r0 = r1.A03
            if (r0 == 0) goto L_0x026f
            java.lang.Object r7 = X.C73723fy.A04(r0)
            X.7xi r7 = (X.C165837xi) r7
            if (r7 == 0) goto L_0x026f
            java.lang.Object r2 = X.C73723fy.A06(r0, r10)
            X.7xi r2 = (X.C165837xi) r2
            java.util.HashMap r13 = X.AnonymousClass001.A0t()
            if (r2 == 0) goto L_0x00ce
            java.util.List r0 = r7.A00()
            java.util.Iterator r15 = r0.iterator()
            r1 = 0
        L_0x0059:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r8 = r15.next()
            int r9 = r1 + 1
            if (r1 >= 0) goto L_0x006c
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x006c:
            X.7xh r8 = (X.C165827xh) r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r0 = r7 instanceof X.C132216et
            if (r0 == 0) goto L_0x0088
            r0 = r7
            X.6et r0 = (X.C132216et) r0
            java.lang.String r1 = r0.A00
        L_0x007b:
            java.lang.String r0 = r8.A00()
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r1, r0)
            r13.put(r0, r6)
            r1 = r9
            goto L_0x0059
        L_0x0088:
            r0 = r7
            X.6es r0 = (X.C132206es) r0
            java.lang.String r1 = r0.A00
            goto L_0x007b
        L_0x008e:
            r5 = r12
            goto L_0x0038
        L_0x0090:
            java.util.List r0 = r2.A00()
            java.util.Iterator r15 = r0.iterator()
            r1 = 0
        L_0x0099:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r8 = r15.next()
            int r9 = r1 + 1
            if (r1 >= 0) goto L_0x00ac
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x00ac:
            X.7xh r8 = (X.C165827xh) r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r0 = r2 instanceof X.C132216et
            if (r0 == 0) goto L_0x00c8
            r0 = r2
            X.6et r0 = (X.C132216et) r0
            java.lang.String r1 = r0.A00
        L_0x00bb:
            java.lang.String r0 = r8.A00()
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r1, r0)
            r13.put(r0, r6)
            r1 = r9
            goto L_0x0099
        L_0x00c8:
            r0 = r2
            X.6es r0 = (X.C132206es) r0
            java.lang.String r1 = r0.A00
            goto L_0x00bb
        L_0x00ce:
            if (r5 == 0) goto L_0x026f
            java.util.LinkedHashMap r9 = X.C18320x8.A0r()
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.util.Iterator r16 = r5.iterator()
        L_0x00dc:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r16.next()
            X.7y1 r0 = (X.C166027y1) r0
            java.util.List r15 = r0.A01
            if (r15 != 0) goto L_0x00ee
            X.3d3 r15 = X.C72023d3.A00
        L_0x00ee:
            int r5 = r15.size()
            r1 = 2
            if (r5 <= r1) goto L_0x0147
            java.lang.String r0 = "areOptionsValid: found unexpected number of options. Maximum 2 is supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00fa:
            boolean r0 = r7 instanceof X.C132216et
            if (r0 == 0) goto L_0x0141
            r0 = r7
            X.6et r0 = (X.C132216et) r0
            java.lang.String r13 = r0.A00
        L_0x0103:
            X.1VX r6 = r14.A00
            r5 = 4982(0x1376, float:6.981E-42)
            boolean r0 = r6.A0X(r5)
            if (r0 == 0) goto L_0x0219
            java.util.List r0 = r7.A00()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r15 = r0.iterator()
        L_0x0119:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r14 = r15.next()
            r0 = r14
            X.7xh r0 = (X.C165827xh) r0
            java.lang.String r0 = r0.A00()
            X.7xw r1 = new X.7xw
            r1.<init>(r13, r0)
            java.lang.Object r0 = r8.get(r1)
            if (r0 != 0) goto L_0x013d
            if (r2 != 0) goto L_0x0119
            X.7y1 r0 = X.C154217co.A00(r1, r12, r9)
            if (r0 == 0) goto L_0x0119
        L_0x013d:
            r7.add(r14)
            goto L_0x0119
        L_0x0141:
            r0 = r7
            X.6es r0 = (X.C132206es) r0
            java.lang.String r13 = r0.A00
            goto L_0x0103
        L_0x0147:
            java.lang.Object r6 = r15.get(r11)
            X.7xw r6 = (X.C165977xw) r6
            java.lang.Object r5 = X.C73723fy.A06(r15, r10)
            X.7xw r5 = (X.C165977xw) r5
            X.3Z6 r1 = X.AnonymousClass3Z6.A02(r6, r5)
            r9.put(r1, r0)
            if (r5 == 0) goto L_0x00dc
            java.lang.Object r15 = r8.get(r5)
            X.3Z6 r15 = (X.AnonymousClass3Z6) r15
            X.1VX r10 = r14.A00
            r1 = 4982(0x1376, float:6.981E-42)
            boolean r1 = r10.A0X(r1)
            if (r1 == 0) goto L_0x01e8
            if (r15 == 0) goto L_0x019c
            java.lang.Object r1 = r15.first
            X.7xw r1 = (X.C165977xw) r1
            X.7y1 r1 = X.C154217co.A00(r1, r5, r9)
            if (r1 == 0) goto L_0x01e3
            boolean r10 = r0.A02
            boolean r1 = r1.A02
            if (r10 != r1) goto L_0x01e3
        L_0x017e:
            java.lang.Object r1 = r15.first
            X.7xw r1 = (X.C165977xw) r1
            X.7y1 r1 = X.C154217co.A00(r1, r5, r9)
            if (r1 == 0) goto L_0x019f
            boolean r1 = r1.A02
            if (r10 != r1) goto L_0x019f
            java.lang.Object r1 = r15.second
            int r10 = X.AnonymousClass001.A0K(r1)
            java.lang.Number r1 = X.C165977xw.A00(r6, r13)
            int r1 = r1.intValue()
            if (r10 <= r1) goto L_0x019f
        L_0x019c:
            X.C155797fW.A00(r5, r6, r13, r8)
        L_0x019f:
            java.lang.Object r10 = r8.get(r6)
            X.3Z6 r10 = (X.AnonymousClass3Z6) r10
            if (r10 == 0) goto L_0x01df
            java.lang.Object r1 = r10.first
            X.7xw r1 = (X.C165977xw) r1
            X.7y1 r15 = X.C154217co.A00(r1, r6, r9)
            if (r15 == 0) goto L_0x01db
            boolean r1 = r0.A02
            boolean r15 = r15.A02
            if (r1 != r15) goto L_0x01db
        L_0x01b7:
            java.lang.Object r0 = r10.first
            X.7xw r0 = (X.C165977xw) r0
            X.7y1 r0 = X.C154217co.A00(r0, r6, r9)
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r0.A02
            if (r1 != r0) goto L_0x01c8
        L_0x01c5:
            r10 = 1
            goto L_0x00dc
        L_0x01c8:
            if (r1 == 0) goto L_0x01c5
            java.lang.Object r0 = r10.second
            int r1 = X.AnonymousClass001.A0K(r0)
            java.lang.Number r0 = X.C165977xw.A00(r5, r13)
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x01c5
            goto L_0x01df
        L_0x01db:
            boolean r1 = r0.A02
            if (r1 == 0) goto L_0x01b7
        L_0x01df:
            X.C155797fW.A00(r6, r5, r13, r8)
            goto L_0x01c5
        L_0x01e3:
            boolean r10 = r0.A02
            if (r10 == 0) goto L_0x017e
            goto L_0x019c
        L_0x01e8:
            if (r15 == 0) goto L_0x01fa
            java.lang.Object r0 = r15.second
            int r1 = X.AnonymousClass001.A0K(r0)
            java.lang.Number r0 = X.C165977xw.A00(r6, r13)
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x01fd
        L_0x01fa:
            X.C155797fW.A00(r5, r6, r13, r8)
        L_0x01fd:
            java.lang.Object r0 = r8.get(r6)
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            if (r0 == 0) goto L_0x0215
            java.lang.Object r0 = r0.second
            int r1 = X.AnonymousClass001.A0K(r0)
            java.lang.Number r0 = X.C165977xw.A00(r5, r13)
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x01c5
        L_0x0215:
            X.C155797fW.A00(r6, r5, r13, r8)
            goto L_0x01c5
        L_0x0219:
            java.util.List r7 = r7.A00()
        L_0x021d:
            X.7y9 r1 = new X.7y9
            r1.<init>(r13, r7, r9, r8)
            if (r2 == 0) goto L_0x026a
            r0 = 2
            X.7y9[] r7 = new X.C166107y9[r0]
            r7[r11] = r1
            boolean r0 = r2 instanceof X.C132216et
            if (r0 == 0) goto L_0x0264
            r0 = r2
            X.6et r0 = (X.C132216et) r0
            java.lang.String r11 = r0.A00
        L_0x0232:
            boolean r0 = r6.A0X(r5)
            if (r0 == 0) goto L_0x0272
            java.util.List r0 = r2.A00()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r0.iterator()
        L_0x0244:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0276
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.7xh r0 = (X.C165827xh) r0
            java.lang.String r1 = r0.A00()
            X.7xw r0 = new X.7xw
            r0.<init>(r11, r1)
            java.lang.Object r0 = r8.get(r0)
            if (r0 == 0) goto L_0x0244
            r6.add(r2)
            goto L_0x0244
        L_0x0264:
            r0 = r2
            X.6es r0 = (X.C132206es) r0
            java.lang.String r11 = r0.A00
            goto L_0x0232
        L_0x026a:
            java.util.List r7 = X.C18290x4.A12(r1)
            goto L_0x0281
        L_0x026f:
            X.3d3 r7 = X.C72023d3.A00
            goto L_0x0281
        L_0x0272:
            java.util.List r6 = r2.A00()
        L_0x0276:
            X.7y9 r0 = new X.7y9
            r0.<init>(r11, r6, r9, r8)
            r7[r10] = r0
            java.util.List r7 = X.AnonymousClass8UF.A0o(r7)
        L_0x0281:
            r0 = r18
            X.5dw r0 = r0.A00
            r1 = 0
            if (r0 == 0) goto L_0x02ec
            X.5dV r2 = r0.A0B
        L_0x028a:
            r6 = 0
            r0 = r18
            X.7Za r0 = r0.A0D(r2, r7, r6)
            r3.add(r0)
            r0 = r18
            X.5dw r0 = r0.A00
            if (r0 == 0) goto L_0x02ea
            X.5dV r5 = r0.A0B
        L_0x029c:
            r2 = 1
            r0 = r18
            X.7Za r0 = r0.A0D(r5, r7, r2)
            r3.add(r0)
            r0 = r18
            X.5dw r0 = r0.A00
            if (r0 == 0) goto L_0x02e8
            X.5dV r0 = r0.A0B
            if (r0 == 0) goto L_0x02e8
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r0 = X.C73723fy.A06(r0, r6)
        L_0x02b8:
            boolean r0 = r0 instanceof X.C132216et
            if (r0 != 0) goto L_0x02d5
            r0 = r18
            X.5dw r0 = r0.A00
            if (r0 == 0) goto L_0x02ce
            X.5dV r0 = r0.A0B
            if (r0 == 0) goto L_0x02ce
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x02ce
            java.lang.Object r1 = X.C73723fy.A06(r0, r2)
        L_0x02ce:
            boolean r0 = r1 instanceof X.C132216et
            if (r0 == 0) goto L_0x02d5
            java.util.Collections.reverse(r3)
        L_0x02d5:
            X.7Xk r0 = new X.7Xk
            r0.<init>(r3)
            r4.A0G(r0)
            r0 = r19
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r0.A05
            if (r0 != 0) goto L_0x02ee
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r17)
            throw r0
        L_0x02e8:
            r0 = r1
            goto L_0x02b8
        L_0x02ea:
            r5 = r1
            goto L_0x029c
        L_0x02ec:
            r2 = r1
            goto L_0x028a
        L_0x02ee:
            r1 = r22
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.A1I(X.5dw, X.4GQ, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        if (r0.A02.A01.size() > 15) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J(X.C165977xw r8, X.C152717a0 r9, X.C166107y9 r10, java.lang.Integer r11, int r12) {
        /*
            r7 = this;
            if (r11 == 0) goto L_0x0105
            int r1 = r11.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x001e
            if (r9 == 0) goto L_0x0149
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.variants.VariantsDisplayData<com.whatsapp.biz.catalog.data.variants.ProductVariantTypeOption.ThumbnailOption>"
            X.C162457s7.A0K(r10, r0)
            r0 = 1
            r9.A00 = r0
        L_0x0013:
            X.7TW r2 = r9.A06
            java.lang.String r6 = "titleController"
            if (r2 != 0) goto L_0x0045
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x001e:
            r0 = 2
            if (r1 != r0) goto L_0x0105
            if (r9 == 0) goto L_0x0149
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.variants.VariantsDisplayData<com.whatsapp.biz.catalog.data.variants.ProductVariantTypeOption.TextOption>"
            X.C162457s7.A0K(r10, r0)
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r7.A05
            if (r0 != 0) goto L_0x0031
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0031:
            boolean r1 = r0.A03
            r0 = 2
            r9.A00 = r0
            X.7X9 r0 = r9.A03
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "dropdownController"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0041:
            r0.A01(r8, r10, r12, r1)
            goto L_0x0013
        L_0x0045:
            java.lang.String r1 = r10.A00
            int r0 = r9.A00
            r2.A01 = r1
            r2.A00 = r0
            com.facebook.shimmer.ShimmerFrameLayout r0 = r9.A02
            java.lang.String r4 = "shimmerView"
            if (r0 != 0) goto L_0x0058
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x0058:
            r0.A00()
            X.7TW r1 = r9.A06
            if (r1 != 0) goto L_0x0064
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0064:
            r5 = 0
            r0 = 0
            r2 = -1
            android.widget.TextView r1 = r1.A02
            r1.setBackground(r0)
            r0 = -2
            X.C86654Ky.A14(r1, r2, r0)
            java.util.List r0 = r10.A01
            boolean r1 = r0.isEmpty()
            r3 = 8
            com.facebook.shimmer.ShimmerFrameLayout r0 = r9.A02
            if (r1 == 0) goto L_0x0097
            if (r0 != 0) goto L_0x0083
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x0083:
            r0.setVisibility(r3)
            X.7TW r0 = r9.A06
            if (r0 != 0) goto L_0x008f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x008f:
            android.widget.TextView r1 = r0.A02
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            goto L_0x00ed
        L_0x0097:
            if (r0 != 0) goto L_0x009e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x009e:
            r0.setVisibility(r5)
            androidx.recyclerview.widget.RecyclerView r2 = r9.A01
            if (r2 != 0) goto L_0x00ac
            java.lang.String r0 = "carouselView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ac:
            int r1 = r9.A00
            r0 = 2
            r4 = 1
            if (r1 != r0) goto L_0x00ca
            X.7X9 r0 = r9.A03
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "dropdownController"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00bd:
            X.7y9 r0 = r0.A02
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 15
            if (r1 <= r0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            r2.setVisibility(r3)
            X.7xw r3 = X.C154217co.A01(r10, r12)
            X.7TW r2 = r9.A06
            if (r2 != 0) goto L_0x00db
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x00db:
            java.lang.String r1 = r3.A01
            java.util.Map r0 = r10.A02
            X.7y1 r0 = X.C154217co.A00(r3, r8, r0)
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.A02
            if (r0 != r4) goto L_0x00ea
            r5 = 1
        L_0x00ea:
            r2.A00(r1, r5)
        L_0x00ed:
            X.6Hg r1 = r9.A05
            if (r1 != 0) goto L_0x00f8
            java.lang.String r0 = "adapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f8:
            r1.A03 = r10
            r0 = 0
            r1.A04 = r0
            r1.A01 = r8
            r1.A00 = r12
            r1.A05()
            return
        L_0x0105:
            if (r9 == 0) goto L_0x0149
            com.facebook.shimmer.ShimmerFrameLayout r1 = r9.A02
            java.lang.String r0 = "shimmerView"
            if (r1 != 0) goto L_0x0112
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0112:
            r1.A00()
            com.facebook.shimmer.ShimmerFrameLayout r1 = r9.A02
            if (r1 != 0) goto L_0x011e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011e:
            r0 = 8
            r1.setVisibility(r0)
            X.7TW r1 = r9.A06
            java.lang.String r3 = "titleController"
            if (r1 != 0) goto L_0x012e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x012e:
            r0 = 0
            r2 = -1
            android.widget.TextView r1 = r1.A02
            r1.setBackground(r0)
            r0 = -2
            X.C86654Ky.A14(r1, r2, r0)
            X.7TW r0 = r9.A06
            if (r0 != 0) goto L_0x0142
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0142:
            android.widget.TextView r1 = r0.A02
            java.lang.String r0 = r0.A01
            r1.setText(r0)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.A1J(X.7xw, X.7a0, X.7y9, java.lang.Integer, int):void");
    }

    public void A0p(Bundle bundle) {
        UserJid userJid;
        super.A0p(bundle);
        this.A05 = (VariantsCarouselFragmentViewModel) new AnonymousClass0XL(this).A01(VariantsCarouselFragmentViewModel.class);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (userJid = (UserJid) bundle2.getParcelable("extra_product_owner_jid")) == null) {
            throw AnonymousClass001.A0e("VariantsCarouselFragment requires a product owner id");
        }
        this.A06 = userJid;
    }
}
