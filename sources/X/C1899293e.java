package X;

import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;

/* renamed from: X.93e  reason: invalid class name and case insensitive filesystem */
public class C1899293e implements C181848nR {
    public Object A00;
    public final int A01;

    public C1899293e(VariantsCarouselFragment variantsCarouselFragment, int i) {
        this.A01 = i;
        this.A00 = variantsCarouselFragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.7Za} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.7Za} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.7Za} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.7Za} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BGq(X.C165977xw r19, X.C166107y9 r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            int r2 = r0.A01
            java.lang.Object r1 = r0.A00
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r1 = (com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment) r1
            r0 = 2
            r8 = r20
            X.C162457s7.A0J(r8, r0)
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r6 = r1.A05
            if (r2 == 0) goto L_0x0019
            if (r6 != 0) goto L_0x0022
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0019:
            if (r6 != 0) goto L_0x0020
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0020:
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            r15 = r21
            X.7xw r12 = X.C154217co.A01(r8, r15)
            java.util.Map r7 = r8.A02
            r0 = r19
            X.7y1 r0 = X.C154217co.A00(r12, r0, r7)
            r4 = 0
            if (r0 == 0) goto L_0x00e1
            java.lang.String r3 = r0.A00
        L_0x0036:
            r1 = 1
            if (r3 != 0) goto L_0x00df
            java.util.Map r0 = r8.A03
            java.lang.Object r2 = r0.get(r12)
            X.3Z6 r2 = (X.AnonymousClass3Z6) r2
            if (r2 == 0) goto L_0x00dc
            java.lang.Object r0 = r2.first
            X.7xw r0 = (X.C165977xw) r0
        L_0x0047:
            X.7y1 r0 = X.C154217co.A00(r12, r0, r7)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r3 = r0.A00
            boolean r0 = r0.A02
            if (r0 == r1) goto L_0x005d
            X.1VX r1 = r6.A07
            r0 = 4982(0x1376, float:6.981E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0063
        L_0x005d:
            X.4UC r1 = r6.A08
            r0 = 2
            X.C06270Wx.A04(r1, r0)
        L_0x0063:
            X.0Wx r0 = r6.A04
            java.lang.Object r1 = r0.A07()
            X.7Xk r1 = (X.C152067Xk) r1
            if (r1 == 0) goto L_0x00ab
            r0 = r5 ^ 1
            java.util.List r7 = r1.A00
            java.lang.Object r1 = X.C73723fy.A06(r7, r0)
            X.7Za r1 = (X.C152477Za) r1
            r9 = 0
            if (r1 == 0) goto L_0x00da
            boolean r0 = r1.A04
            X.7y9 r13 = r1.A02
            java.lang.Integer r14 = r1.A03
            X.7Za r11 = new X.7Za
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0087:
            java.lang.Object r10 = X.C73723fy.A06(r7, r5)
            if (r2 != 0) goto L_0x00ba
            r9 = r10
        L_0x008e:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            if (r11 == 0) goto L_0x0097
            r7.add(r11)
        L_0x0097:
            if (r9 == 0) goto L_0x009c
            r7.add(r9)
        L_0x009c:
            if (r5 != 0) goto L_0x00a1
            java.util.Collections.reverse(r7)
        L_0x00a1:
            X.08M r1 = r6.A05
            X.7Xk r0 = new X.7Xk
            r0.<init>(r7)
            r1.A0G(r0)
        L_0x00ab:
            X.4GQ r0 = r6.A01
            if (r0 == 0) goto L_0x00b2
            r0.invoke(r3)
        L_0x00b2:
            if (r2 != 0) goto L_0x00b9
            X.4UC r0 = r6.A08
            r0.A0G(r4)
        L_0x00b9:
            return
        L_0x00ba:
            X.7Za r10 = (X.C152477Za) r10
            if (r10 == 0) goto L_0x008e
            java.lang.Object r0 = r2.second
            int r16 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r8 = r2.first
            X.7xw r8 = (X.C165977xw) r8
            boolean r7 = r10.A04
            X.7y9 r1 = r10.A02
            java.lang.Integer r0 = r10.A03
            X.7Za r9 = new X.7Za
            r15 = r0
            r17 = r7
            r14 = r1
            r13 = r8
            r12 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x008e
        L_0x00da:
            r11 = r4
            goto L_0x0087
        L_0x00dc:
            r0 = r4
            goto L_0x0047
        L_0x00df:
            r2 = r4
            goto L_0x0063
        L_0x00e1:
            r3 = r4
            goto L_0x0036
        L_0x00e4:
            X.4UC r0 = r6.A08
            X.C06270Wx.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1899293e.BGq(X.7xw, X.7y9, int):void");
    }
}
