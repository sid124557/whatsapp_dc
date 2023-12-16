package X;

/* renamed from: X.2WD  reason: invalid class name */
public final class AnonymousClass2WD {
    public final C627036g A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        if (r3 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x020c, code lost:
        if (r3 == null) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r14 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass39W r13, X.AnonymousClass39W r14, java.lang.String r15) {
        /*
            r12 = this;
            if (r13 == r14) goto L_0x03d7
            X.36g r6 = r12.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " selectListContent null check."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r3 = 1
            if (r13 == 0) goto L_0x0014
            r0 = 1
            if (r14 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r6.A0e(r1, r0)
            if (r13 == 0) goto L_0x03d7
            if (r14 == 0) goto L_0x03d7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Field: description."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A08
            java.lang.String r0 = r14.A08
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: footerText."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A09
            java.lang.String r0 = r14.A09
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: buttonText."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r13.A07
            java.lang.String r0 = r14.A07
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: selectListType."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r13.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r14.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: sections"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.util.List r0 = r13.A0B
            int r1 = r0.size()
            java.util.List r0 = r14.A0B
            int r0 = r0.size()
            if (r1 == r0) goto L_0x0075
            r3 = 0
        L_0x0075:
            r6.A0e(r2, r3)
            X.39A r4 = r13.A02
            X.39A r3 = r14.A02
            if (r4 == r3) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Interactive message. Header null check."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            if (r4 == 0) goto L_0x008d
            r0 = 1
            if (r3 != 0) goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            java.lang.StringBuilder r1 = X.C627036g.A06(r6, r1, r15, r0)
            java.lang.String r0 = " Field: title."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r3.A01
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: subTitle."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r3.A00
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: thumbnail."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r4.A02
            byte[] r0 = r3.A02
            r6.A0f(r2, r1, r0)
        L_0x00bb:
            java.util.List r9 = r13.A0B
            java.util.List r8 = r14.A0B
            r7 = 0
        L_0x00c0:
            int r0 = r8.size()
            if (r7 >= r0) goto L_0x014e
            java.lang.Object r5 = r9.get(r7)
            X.5dS r5 = (X.C108725dS) r5
            java.lang.Object r4 = r8.get(r7)
            X.5dS r4 = (X.C108725dS) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Field: title."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r4.A01
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: section.items"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.util.List r0 = r5.A02
            int r1 = r0.size()
            java.util.List r0 = r4.A02
            int r0 = r0.size()
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            r6.A0e(r2, r0)
            r3 = 0
        L_0x00fe:
            java.util.List r0 = r4.A02
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x014a
            java.util.List r0 = r5.A02
            java.lang.Object r11 = r0.get(r3)
            X.5dY r11 = (X.C108785dY) r11
            java.util.List r0 = r4.A02
            java.lang.Object r10 = r0.get(r3)
            X.5dY r10 = (X.C108785dY) r10
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Field: fixtureItem.id"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r11.A02
            java.lang.String r0 = r10.A02
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: fixtureItem.title"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r11.A03
            java.lang.String r0 = r10.A03
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Field: fixtureItem.description"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r11.A00
            java.lang.String r0 = r10.A00
            boolean r0 = X.C107575bX.A0G(r1, r0)
            r6.A0e(r2, r0)
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x014a:
            int r7 = r7 + 1
            goto L_0x00c0
        L_0x014e:
            X.39E r4 = r13.A04
            X.39E r3 = r14.A04
            if (r4 == 0) goto L_0x01f8
            if (r3 == 0) goto L_0x01f8
            java.util.List r9 = r4.A02
            java.util.List r8 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " product sections list size."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r9)
            java.lang.Integer r0 = X.AnonymousClass0x9.A0l(r8)
            java.lang.StringBuilder r1 = X.C627036g.A05(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Business owner jid."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.jid.UserJid r1 = r4.A00
            com.whatsapp.jid.UserJid r0 = r3.A00
            r6.A0Y(r1, r0, r2)
            r7 = 0
        L_0x017e:
            int r0 = r9.size()
            if (r7 >= r0) goto L_0x01f8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Product title."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.Object r0 = r9.get(r7)
            X.396 r0 = (X.AnonymousClass396) r0
            java.lang.String r1 = r0.A00
            java.lang.Object r0 = r8.get(r7)
            X.396 r0 = (X.AnonymousClass396) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.C107575bX.A0G(r1, r0)
            r6.A0e(r2, r0)
            java.lang.Object r0 = r9.get(r7)
            X.396 r0 = (X.AnonymousClass396) r0
            java.util.List r5 = r0.A01
            java.lang.Object r0 = r8.get(r7)
            X.396 r0 = (X.AnonymousClass396) r0
            java.util.List r4 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Product list size."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r5)
            int r0 = r4.size()
            X.C627036g.A0R(r6, r1, r2, r0)
            r3 = 0
        L_0x01cb:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x01f5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Product id."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.Object r0 = r5.get(r7)
            X.392 r0 = (X.AnonymousClass392) r0
            java.lang.String r1 = r0.A00
            java.lang.Object r0 = r4.get(r7)
            X.392 r0 = (X.AnonymousClass392) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.C107575bX.A0G(r1, r0)
            r6.A0e(r2, r0)
            int r3 = r3 + 1
            goto L_0x01cb
        L_0x01f5:
            int r7 = r7 + 1
            goto L_0x017e
        L_0x01f8:
            X.39S r4 = r13.A01
            X.39S r3 = r14.A01
            if (r4 == r3) goto L_0x02b0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " CheckoutInfoContent null check."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r5 = 1
            if (r4 == 0) goto L_0x020e
            r0 = 1
            if (r3 != 0) goto L_0x020f
        L_0x020e:
            r0 = 0
        L_0x020f:
            java.lang.StringBuilder r1 = X.C627036g.A06(r6, r1, r15, r0)
            java.lang.String r0 = " Checkout Info thumbnail."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            byte[] r1 = r4.A0M
            if (r1 == 0) goto L_0x0220
            int r0 = r1.length
            if (r0 >= r5) goto L_0x0324
        L_0x0220:
            byte[] r0 = r3.A0M
            if (r0 == 0) goto L_0x0227
            int r0 = r0.length
            if (r0 >= r5) goto L_0x0324
        L_0x0227:
            java.lang.StringBuilder r1 = X.C627036g.A06(r6, r2, r15, r5)
            java.lang.String r0 = " Checkout Info title."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = r3.A0F
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info totalAmount."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.39G r1 = r4.A09
            X.39G r0 = r3.A09
            java.lang.StringBuilder r1 = X.C627036g.A05(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info referenceId."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A0E
            java.lang.String r0 = r3.A0E
            java.lang.StringBuilder r1 = X.C627036g.A05(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info type."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A0G
            java.lang.String r0 = r3.A0G
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info currency."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.4Fi r1 = r4.A06
            X.4Fi r0 = r3.A06
            java.lang.StringBuilder r1 = X.C627036g.A05(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info paymentConfiguration."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r4.A04()
            java.lang.String r0 = r3.A04()
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info order.status"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.39H r4 = r4.A07
            java.lang.String r1 = r4.A01
            X.39H r3 = r3.A07
            java.lang.String r0 = r3.A01
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info order.subtotal"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.39G r1 = r4.A05
            X.39G r0 = r3.A05
            java.lang.StringBuilder r1 = X.C627036g.A05(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Checkout Info order.tax"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.39G r1 = r4.A06
            X.39G r0 = r3.A06
            r6.A0Y(r1, r0, r2)
        L_0x02b0:
            X.39P r8 = r13.A03
            X.39P r7 = r14.A03
            if (r8 == 0) goto L_0x0383
            if (r7 == 0) goto L_0x0383
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Native flow buttons list size."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.util.List r5 = r8.A03
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r5)
            java.util.List r4 = r7.A03
            int r0 = r4.size()
            X.C627036g.A0R(r6, r1, r2, r0)
            r3 = 0
        L_0x02d2:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x032f
            java.lang.Object r10 = r5.get(r3)
            X.395 r10 = (X.AnonymousClass395) r10
            java.lang.Object r9 = r4.get(r3)
            X.395 r9 = (X.AnonymousClass395) r9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " Native flow button selected state."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r10.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r9.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.StringBuilder r1 = X.C627036g.A05(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Native flow name."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            X.398 r10 = r10.A01
            java.lang.String r1 = r10.A00
            X.398 r9 = r9.A01
            java.lang.String r0 = r9.A00
            java.lang.StringBuilder r1 = X.C627036g.A04(r6, r1, r0, r2, r15)
            java.lang.String r0 = " Native flow params."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = r10.A01
            java.lang.String r0 = r9.A01
            boolean r0 = X.C107575bX.A0G(r1, r0)
            r6.A0e(r2, r0)
            int r3 = r3 + 1
            goto L_0x02d2
        L_0x0324:
            byte[] r0 = r3.A0M
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0227
            r5 = 0
            goto L_0x0227
        L_0x032f:
            java.util.List r5 = r8.A04
            java.util.List r4 = r7.A04
            if (r5 == r4) goto L_0x0383
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " FormElements expected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r2 = 1
            r3 = 0
            boolean r0 = X.AnonymousClass000.A1W(r5)
            java.lang.StringBuilder r1 = X.C627036g.A06(r6, r1, r15, r0)
            java.lang.String r0 = " FormElements actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            if (r4 != 0) goto L_0x0352
            r2 = 0
        L_0x0352:
            java.lang.StringBuilder r1 = X.C627036g.A06(r6, r0, r15, r2)
            java.lang.String r0 = " Native flow form list size."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r5)
            int r0 = r4.size()
            X.C627036g.A0R(r6, r1, r2, r0)
        L_0x0367:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0383
            java.lang.Object r1 = r5.get(r3)
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toString()
            r6.A0Y(r1, r0, r15)
            int r3 = r3 + 1
            goto L_0x0367
        L_0x0383:
            X.38e r3 = r13.A05
            X.38e r7 = r14.A05
            if (r3 == r7) goto L_0x03d7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " CarouselContent expected value is null."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r2 = 1
            r5 = 0
            boolean r0 = X.AnonymousClass000.A1W(r3)
            java.lang.StringBuilder r1 = X.C627036g.A06(r6, r1, r15, r0)
            java.lang.String r0 = " CarouselContent actual value is null."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            if (r7 != 0) goto L_0x03a6
            r2 = 0
        L_0x03a6:
            java.lang.StringBuilder r1 = X.C627036g.A06(r6, r0, r15, r2)
            java.lang.String r0 = " Carousel content cards list size."
            java.lang.String r4 = X.AnonymousClass000.A0X(r0, r1)
            java.util.List r3 = r3.A00
            java.lang.Integer r1 = X.AnonymousClass0x9.A0l(r3)
            java.util.List r2 = r7.A00
            int r0 = r2.size()
            X.C627036g.A0R(r6, r1, r4, r0)
        L_0x03bf:
            int r0 = r3.size()
            if (r5 >= r0) goto L_0x03d7
            java.lang.Object r1 = r3.get(r5)
            X.39W r1 = (X.AnonymousClass39W) r1
            java.lang.Object r0 = r2.get(r5)
            X.39W r0 = (X.AnonymousClass39W) r0
            r12.A00(r1, r0, r15)
            int r5 = r5 + 1
            goto L_0x03bf
        L_0x03d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WD.A00(X.39W, X.39W, java.lang.String):void");
    }

    public AnonymousClass2WD(C627036g r1) {
        this.A00 = r1;
    }
}
