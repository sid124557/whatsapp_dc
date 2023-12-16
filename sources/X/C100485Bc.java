package X;

/* renamed from: X.5Bc  reason: invalid class name and case insensitive filesystem */
public class C100485Bc implements C15930sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C100485Bc(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        if (r1 == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019e, code lost:
        if (r12 != null) goto L_0x01a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BOf(java.lang.Object r18) {
        /*
            r17 = this;
            r12 = r18
            r4 = r17
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x01f3;
                case 1: goto L_0x00a3;
                case 2: goto L_0x01aa;
                case 3: goto L_0x0069;
                case 4: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r6 = r4.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r6 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r6
            java.lang.Object r2 = r4.A01
            X.5OD r2 = (X.AnonymousClass5OD) r2
            java.lang.Object r1 = r4.A02
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            java.util.List r12 = (java.util.List) r12
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0009
            int r5 = r2.A00
            X.33j r3 = r6.A0E
            java.lang.String r7 = r2.A03
            int r8 = r12.size()
            android.content.Context r2 = r1.getContext()
            r0 = 2131625879(0x7f0e0797, float:1.8878978E38)
            android.view.View r4 = X.C18310x6.A0H(r1, r0)
            r0 = 2131432864(0x7f0b15a0, float:1.8487497E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass0x7.A0K(r4, r0)
            r0 = 0
            r1.A0K(r0, r7)
            r0 = 2131432863(0x7f0b159f, float:1.8487495E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r4, r0)
            java.lang.String r0 = X.C107165ao.A01(r2, r3, r8)
            r1.setText(r0)
            java.lang.String r3 = X.C107165ao.A01(r2, r3, r8)
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131755287(0x7f100117, float:1.914145E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A16(r3, r7, r0)
            java.lang.String r0 = r2.getQuantityString(r1, r8, r0)
            r4.setContentDescription(r0)
            r6.A1a(r4, r5)
            return
        L_0x0069:
            java.lang.Object r1 = r4.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r5 = r4.A02
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Number r12 = (java.lang.Number) r12
            int r4 = r12.intValue()
            if (r4 <= 0) goto L_0x018c
            r3 = 0
            r2.setVisibility(r3)
            X.33j r0 = r1.A11
            java.text.NumberFormat r0 = r0.A0M()
            java.lang.String r0 = r0.format(r12)
            r5.setText(r0)
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131755155(0x7f100093, float:1.9141181E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            r0[r3] = r12
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            r5.setContentDescription(r0)
            return
        L_0x00a3:
            java.lang.Object r2 = r4.A00
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r2 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r2
            java.lang.Object r7 = r4.A01
            java.lang.Object r6 = r4.A02
            X.5dt r12 = (X.C108985dt) r12
            X.4V5 r3 = r2.A0k
            X.5Th r0 = r3.A0B
            java.lang.String r1 = r0.A00(r12)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c2
            X.08M r0 = r3.A03
            r0.A0H(r1)
        L_0x00c2:
            X.4V5 r3 = r2.A0k
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x019e
            if (r12 != 0) goto L_0x01a0
            X.8EO r1 = r3.A0H
            X.3TS r0 = r1.A02
            r0.A00(r1)
            r0 = 1
            r3.A00 = r0
        L_0x00d4:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r9 = r2.A0d
            r5 = 8
            r4 = 0
            if (r9 == 0) goto L_0x0136
            X.4V5 r8 = r2.A0k
            if (r12 == 0) goto L_0x019a
            boolean r0 = r12.A0Y
            if (r0 == 0) goto L_0x019a
            int r3 = r8.A02
            r1 = 1
            if (r3 == r1) goto L_0x00f7
            r0 = 9
            if (r3 == r0) goto L_0x00f7
            if (r3 == r5) goto L_0x00f7
            r0 = 5
            if (r3 == r0) goto L_0x00f7
            r0 = 6
            if (r3 == r0) goto L_0x00f7
            r0 = 7
            if (r3 != r0) goto L_0x019a
        L_0x00f7:
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x019a
            r9.setVisibility(r4)
            com.whatsapp.biz.catalog.view.CatalogMediaCard r11 = r2.A0d
            com.whatsapp.jid.UserJid r13 = r2.A0r
            boolean r15 = X.AnonymousClass000.A1W(r7)
            java.lang.String r14 = r2.A10
            r16 = r1
            r11.A02(r12, r13, r14, r15, r16)
            r0 = 2131430945(0x7f0b0e21, float:1.8483605E38)
            android.view.View r7 = r2.findViewById(r0)
            r0 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            android.view.View r3 = r2.findViewById(r0)
            r1 = 2130968913(0x7f040151, float:1.7546493E38)
            r0 = 2131100074(0x7f0601aa, float:1.781252E38)
            int r1 = X.C18300x5.A03(r2, r1, r0)
            r7.setBackgroundColor(r1)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            X.C18280x3.A0r(r2, r0, r4)
            com.whatsapp.biz.catalog.view.CatalogMediaCard r0 = r2.A0d
            r0.setBackgroundColor(r1)
            r3.setBackgroundColor(r1)
        L_0x0136:
            if (r6 == 0) goto L_0x0158
            X.2sr r1 = r2.A01
            com.whatsapp.jid.UserJid r0 = r2.A0r
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x0158
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            com.whatsapp.TextEmojiLabel r3 = X.C86664Kz.A0z(r2, r0)
            if (r12 == 0) goto L_0x0158
            if (r3 == 0) goto L_0x0158
            java.lang.String r1 = r12.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0192
            r3.setVisibility(r5)
        L_0x0158:
            X.5Tb r3 = r2.A05
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = r3.A03(r12, r0, r1)
            if (r0 == 0) goto L_0x017d
            X.4V2 r0 = r2.A03
            X.0Wx r1 = r0.A04
            r0 = 42
            X.C86604Kt.A1M(r2, r1, r0)
            X.4V2 r0 = r2.A03
            X.0Wx r1 = r0.A02
            int r0 = r1.A00
            if (r0 > 0) goto L_0x0178
            r0 = 3
            X.C100385As.A00(r2, r1, r12, r0)
        L_0x0178:
            X.4V2 r0 = r2.A03
            r0.A0D(r12)
        L_0x017d:
            androidx.fragment.app.FragmentContainerView r0 = r2.A0C
            if (r0 == 0) goto L_0x0009
            X.5Tb r0 = r2.A05
            boolean r1 = r0.A01(r12)
            androidx.fragment.app.FragmentContainerView r2 = r2.A0C
            r0 = 0
            if (r1 != 0) goto L_0x018e
        L_0x018c:
            r0 = 8
        L_0x018e:
            r2.setVisibility(r0)
            return
        L_0x0192:
            r0 = 0
            r3.A0K(r0, r1)
            r3.setVisibility(r4)
            goto L_0x0158
        L_0x019a:
            r9.setVisibility(r5)
            goto L_0x0136
        L_0x019e:
            if (r12 == 0) goto L_0x00d4
        L_0x01a0:
            r2.A74()
            X.4Ty r0 = r2.A0Q
            r0.A0E()
            goto L_0x00d4
        L_0x01aa:
            java.lang.Object r3 = r4.A00
            X.4ea r3 = (X.C89654ea) r3
            java.lang.Object r2 = r4.A01
            X.5Qo r2 = (X.C104335Qo) r2
            java.lang.Object r1 = r4.A02
            X.1fJ r1 = (X.C27991fJ) r1
            X.5AY r12 = (X.AnonymousClass5AY) r12
            r3.BjL()
            boolean r0 = r12 instanceof X.C91724kx
            if (r0 == 0) goto L_0x01c5
            X.4kx r12 = (X.C91724kx) r12
            r2.A01(r12, r1)
            return
        L_0x01c5:
            boolean r0 = r12 instanceof X.C91744kz
            if (r0 == 0) goto L_0x01d3
            r1 = 2131891659(0x7f1215cb, float:1.9418044E38)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.BpA(r1, r0)
            return
        L_0x01d3:
            boolean r0 = r12 instanceof X.C91704kv
            if (r0 == 0) goto L_0x01e9
            X.4kv r12 = (X.C91704kv) r12
            X.3Wi r2 = r3.A05
            int r1 = X.C29441ip.A00(r3)
            r0 = 0
            r2.A0H(r1, r0)
            X.4GP r0 = r12.A00
            r0.invoke()
            return
        L_0x01e9:
            boolean r0 = r12 instanceof X.C91714kw
            if (r0 == 0) goto L_0x0009
            X.4kw r12 = (X.C91714kw) r12
            r2.A00(r12)
            return
        L_0x01f3:
            java.lang.Object r0 = r4.A00
            X.4Tu r0 = (X.AnonymousClass4Tu) r0
            java.lang.Object r3 = r4.A01
            X.39E r3 = (X.AnonymousClass39E) r3
            java.lang.Object r1 = r4.A02
            X.5Qb r1 = (X.C104205Qb) r1
            X.3Dx r12 = (X.C64543Dx) r12
            X.08J r9 = r0.A01
            int r0 = r12.A00
            if (r0 != 0) goto L_0x0269
            X.7KH r1 = r1.A03
            X.2oU r0 = r1.A01
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r0 = r0.heightPixels
            float r2 = (float) r0
            float r1 = r1.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0261
            r10 = 1
        L_0x021b:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()
            r6 = 0
            java.util.List r0 = r3.A02
            java.util.Iterator r4 = r0.iterator()
        L_0x022e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x026b
            java.lang.Object r3 = r4.next()
            X.396 r3 = (X.AnonymousClass396) r3
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.List r0 = r3.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0244:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0258
            java.lang.Object r0 = r1.next()
            X.392 r0 = (X.AnonymousClass392) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            int r6 = r6 + 1
            goto L_0x0244
        L_0x0258:
            java.lang.String r0 = r3.A00
            r11.add(r0)
            r8.add(r2)
            goto L_0x022e
        L_0x0261:
            float r2 = r2 / r1
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            int r10 = (int) r0
            goto L_0x021b
        L_0x0269:
            r10 = 0
            goto L_0x021b
        L_0x026b:
            java.util.List r12 = r12.A02
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            if (r12 == 0) goto L_0x02f1
            java.util.Iterator r3 = r12.iterator()
        L_0x0277:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x028d
            X.5dw r2 = X.C86664Kz.A12(r3)
            java.lang.String r1 = r2.A0F
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x0277
            r7.put(r1, r2)
            goto L_0x0277
        L_0x028d:
            r4 = 0
            r3 = 0
        L_0x028f:
            int r0 = r11.size()
            if (r3 >= r0) goto L_0x02dc
            java.lang.Object r0 = r8.get(r3)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Iterator r13 = r0.iterator()
        L_0x02a3:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.Object r0 = r13.next()
            java.lang.Object r1 = r7.get(r0)
            X.5dw r1 = (X.C109015dw) r1
            if (r1 == 0) goto L_0x02a3
            X.8EZ r0 = new X.8EZ
            r0.<init>(r1)
            r2.add(r0)
            goto L_0x02a3
        L_0x02be:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02d9
            java.lang.String r1 = X.C86664Kz.A1M(r11, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02d6
            X.8EY r0 = new X.8EY
            r0.<init>(r1)
            r5.add(r0)
        L_0x02d6:
            r5.addAll(r2)
        L_0x02d9:
            int r3 = r3 + 1
            goto L_0x028f
        L_0x02dc:
            int r0 = r12.size()
            int r6 = r6 - r0
            if (r6 <= r10) goto L_0x02e4
            r6 = r10
        L_0x02e4:
            if (r4 >= r6) goto L_0x02f1
            X.8EX r0 = new X.8EX
            r0.<init>()
            r5.add(r0)
            int r4 = r4 + 1
            goto L_0x02e4
        L_0x02f1:
            r9.A0G(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100485Bc.BOf(java.lang.Object):void");
    }
}
