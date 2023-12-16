package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9eI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198049eI implements C84134Bd {
    public final /* synthetic */ AnonymousClass39Q A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ AnonymousClass9XZ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r4 != null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r29) {
        /*
            r28 = this;
            r4 = r29
            r0 = r28
            com.whatsapp.payments.ui.BrazilPaymentActivity r10 = r0.A01
            boolean r1 = r0.A05
            X.39Q r8 = r0.A00
            java.lang.String r14 = r0.A03
            X.9XZ r2 = r0.A02
            java.lang.String r13 = r0.A04
            java.util.List r4 = (java.util.List) r4
            X.99n r0 = r10.A0O
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0020
            X.39U r0 = r10.A7F()
            if (r0 != 0) goto L_0x002a
        L_0x0020:
            X.99n r0 = r10.A0O
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003d
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x004c
            X.7yw r0 = X.C1899693i.A0D(r4, r3)
            int r1 = r0.A03
            r0 = 2
            if (r1 == r0) goto L_0x004d
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003d:
            int r3 = X.C195169Wk.A01(r4)
            if (r4 == 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            java.lang.String r1 = "brpay_p_add_card"
            r0 = 0
            r10.A7Q(r1, r14, r0, r13)
            goto L_0x0100
        L_0x004c:
            r3 = 0
        L_0x004d:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0044
            X.7yw r22 = X.C1899693i.A0D(r4, r3)
            X.C626936e.A06(r22)
            com.whatsapp.payments.ui.widget.PaymentView r0 = r10.A0W
            if (r0 == 0) goto L_0x0156
            X.39M r20 = r0.getStickerIfSelected()
        L_0x0062:
            r26 = 0
            if (r0 == 0) goto L_0x0152
            X.39R r16 = r0.getPaymentBackground()
        L_0x006a:
            if (r20 != 0) goto L_0x0121
            if (r16 != 0) goto L_0x0121
            r7 = r26
        L_0x0070:
            X.32a r1 = r10.A07
            java.lang.String r0 = "BRL"
            X.4Fi r20 = r1.A01(r0)
            com.whatsapp.payments.ui.PaymentBottomSheet r12 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r12.<init>()
            com.whatsapp.jid.UserJid r0 = r10.A0G
            if (r0 == 0) goto L_0x011d
            X.9U4 r0 = r10.A0P
            X.8EA r1 = X.AnonymousClass9U4.A03(r0)
            com.whatsapp.jid.UserJid r0 = r10.A0G
            X.6hl r1 = r1.A05(r0)
        L_0x008d:
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r10.A0Y
            if (r0 == 0) goto L_0x011a
            X.08M r0 = r0.A02
            java.lang.Object r0 = r0.A07()
            if (r0 == 0) goto L_0x011a
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r10.A0Y
            X.08M r0 = r0.A02
            java.lang.Object r0 = r0.A07()
            X.9WE r0 = (X.AnonymousClass9WE) r0
            java.lang.Object r9 = r0.A01
            X.9VG r9 = (X.AnonymousClass9VG) r9
        L_0x00a7:
            X.99n r0 = r10.A0O
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00b5
            X.39U r0 = r10.A7F()
            if (r0 != 0) goto L_0x00c1
        L_0x00b5:
            X.99n r0 = r10.A0O
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0106
            boolean r0 = r10.A0g
            if (r0 == 0) goto L_0x0106
        L_0x00c1:
            r27 = 0
        L_0x00c3:
            com.whatsapp.jid.UserJid r1 = r10.A0G
            X.C626936e.A06(r1)
            java.lang.String r0 = r10.A0p
            r23 = r1
            r24 = r2
            r25 = r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r11 = com.whatsapp.payments.ui.ConfirmPaymentFragment.A00(r22, r23, r24, r25, r26, r27)
            r12.A02 = r11
            X.9XA r0 = r12.A03
            r0.A00 = r10
            X.9cx r6 = new X.9cx
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r11.A0O = r6
            X.9cr r0 = new X.9cr
            r19 = r0
            r21 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r11.A0N = r0
            r10.A0T = r11
            X.9B2 r2 = r10.A0O
            java.lang.String r1 = "confirm_payment"
            int r0 = r10.A00
            r2.BKh(r1, r0)
            r10.Boo(r12)
        L_0x0100:
            X.3XA r0 = r10.A04
            r0.A02()
            return
        L_0x0106:
            if (r1 == 0) goto L_0x0117
            com.whatsapp.jid.UserJid r0 = r1.A05
            if (r0 == 0) goto L_0x0117
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0117
            int r27 = r1.A07()
            goto L_0x00c3
        L_0x0117:
            r27 = 1
            goto L_0x00c3
        L_0x011a:
            r9 = r26
            goto L_0x00a7
        L_0x011d:
            r1 = r26
            goto L_0x008d
        L_0x0121:
            X.9VS r15 = r10.A0S
            X.4uZ r4 = r10.A0E
            X.C626936e.A06(r4)
            com.whatsapp.jid.UserJid r3 = r10.A0G
            long r0 = r10.A02
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x014f
            X.2qz r5 = r10.A0e
            X.2pp r5 = r5.A02
            X.34x r19 = r5.A01(r0)
        L_0x013a:
            com.whatsapp.payments.ui.widget.PaymentView r0 = r10.A0W
            if (r0 == 0) goto L_0x014c
            java.lang.Integer r21 = r0.getStickerSendOrigin()
        L_0x0142:
            r18 = r3
            r17 = r4
            X.3XA r7 = r15.A01(r16, r17, r18, r19, r20, r21)
            goto L_0x0070
        L_0x014c:
            r21 = 0
            goto L_0x0142
        L_0x014f:
            r19 = r26
            goto L_0x013a
        L_0x0152:
            r16 = r26
            goto L_0x006a
        L_0x0156:
            r20 = 0
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198049eI.AwB(java.lang.Object):void");
    }

    public /* synthetic */ C198049eI(AnonymousClass39Q r1, BrazilPaymentActivity brazilPaymentActivity, AnonymousClass9XZ r3, String str, String str2, boolean z) {
        this.A01 = brazilPaymentActivity;
        this.A05 = z;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = str2;
    }
}
