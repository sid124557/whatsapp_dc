package X;

/* renamed from: X.68K  reason: invalid class name */
public class AnonymousClass68K extends C109665ez {
    public Object A00;
    public final int A01;

    public AnonymousClass68K(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x01a3;
                case 1: goto L_0x0117;
                case 2: goto L_0x0072;
                case 3: goto L_0x00d5;
                case 4: goto L_0x004c;
                case 5: goto L_0x00bd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A00
            com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment r3 = (com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment) r3
            r0 = 1
            r3.A06 = r0
            X.5hb r1 = r3.A05
            if (r1 == 0) goto L_0x00b6
            java.lang.String r0 = "TAP_NUX_CONTINUE"
            r1.A05(r0)
            X.5Ke r5 = r3.A03
            if (r5 == 0) goto L_0x00af
            X.03q r7 = r3.A0Q()
            if (r7 == 0) goto L_0x00aa
            X.21S r6 = com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment.A07
            X.66O r2 = r3.A02
            r0 = 1
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r6, r0)
            java.lang.String r0 = "AccountLinkingLauncher/startAccountLinkingActivityForResult called by caller "
            X.C18260x0.A1N(r1, r0, r6)
            r5.A00 = r2
            X.3Wi r0 = r5.A02
            X.2fU r8 = new X.2fU
            r8.<init>(r0)
            r0 = 2131886298(0x7f1200da, float:1.940717E38)
            r8.A01(r0)
            X.4FS r0 = r5.A03
            r9 = 27
            X.3ac r4 = new X.3ac
            r4.<init>(r5, r6, r7, r8, r9)
            r0.BkM(r4)
            r3.A1K()
        L_0x004b:
            return
        L_0x004c:
            java.lang.Object r3 = r10.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.99n r1 = r3.A1o
            r0 = 0
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x004b
            X.9U4 r0 = r3.A1p
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BAt()
            if (r0 == 0) goto L_0x004b
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            X.3ZH r0 = r3.A19
            X.4uZ r0 = r0.A0H
            java.lang.String r1 = X.C627336j.A07(r0)
            goto L_0x00a0
        L_0x0072:
            java.lang.Object r3 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.4sd r1 = r3.A1S
            if (r1 == 0) goto L_0x007e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A07 = r0
        L_0x007e:
            X.99n r0 = r3.A1b
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x004b
            X.9U4 r0 = r3.A1c
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BAt()
            if (r0 == 0) goto L_0x004b
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            X.3ZH r0 = r3.A1K
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            java.lang.String r1 = r0.getRawString()
        L_0x00a0:
            java.lang.String r0 = "extra_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r3.startActivity(r0)
            return
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        L_0x00af:
            java.lang.String r0 = "accountLinkingLauncher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b6:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00bd:
            java.lang.Object r2 = r10.A00
            com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment r2 = (com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment) r2
            X.5hb r1 = r2.A05
            if (r1 == 0) goto L_0x00ce
            java.lang.String r0 = "TAP_NUX_NOT_NOW"
            r1.A05(r0)
            r2.A1K()
            return
        L_0x00ce:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d5:
            java.lang.Object r1 = r10.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r1 = (com.whatsapp.conversation.ConversationAttachmentContentView) r1
            android.content.Context r0 = r1.getContext()
            X.0zH r4 = X.AnonymousClass5V0.A00(r0)
            X.9Wq r0 = r1.A0S
            java.lang.String r0 = r0.A0L()
            r4.A0h(r0)
            X.9Wq r3 = r1.A0S
            X.5LJ r2 = r1.A0D
            X.4uZ r0 = r1.A0O
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            X.3Ex r0 = r2.A01
            X.3ZH r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x0115
            X.5ZU r0 = r2.A02
            java.lang.String r0 = r0.A0H(r1)
        L_0x0102:
            java.lang.String r0 = r3.A0g(r0)
            r4.A0g(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 37
            X.C1235268t.A03(r4, r10, r0, r1)
            X.C18280x3.A0q(r4)
            return
        L_0x0115:
            r0 = 0
            goto L_0x0102
        L_0x0117:
            java.lang.Object r3 = r10.A00
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r3 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r3
            X.9Wq r1 = r3.A0N
            com.whatsapp.jid.UserJid r0 = r3.A0K
            int r1 = r1.A0C(r0)
            X.7ae r0 = r3.A0M
            X.7pU r2 = r0.A02()
            r0 = 1
            if (r1 != r0) goto L_0x0188
            if (r2 == 0) goto L_0x0188
            java.lang.String r1 = "BR"
            java.lang.String r0 = r2.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0188
            X.0zH r2 = X.C18300x5.A0M(r3)
            r0 = 2131891544(0x7f121558, float:1.9417811E38)
            r2.A0U(r0)
            r0 = 2131891543(0x7f121557, float:1.941781E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r5 = 4
            X.90p r0 = new X.90p
            r0.<init>(r5)
            r2.A0Y(r0, r1)
            X.C18280x3.A0q(r2)
            X.2rA r4 = r3.A0R
            java.lang.String r3 = "received_cart"
            java.lang.String r2 = "from_cart"
            X.1VX r1 = r4.A05
            r0 = 1345(0x541, float:1.885E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x016d
            java.lang.String r0 = "OrderDetailsMessageLogging/logFieldstatEvent :: Not logging any events. Please turn on the abprop value"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x016d:
            X.4rM r1 = new X.4rM
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A00 = r0
            r1.A01 = r3
            boolean r0 = X.C107575bX.A0F(r2)
            if (r0 != 0) goto L_0x0182
            r1.A02 = r2
        L_0x0182:
            X.4FV r0 = r4.A06
            r0.BhD(r1)
            return
        L_0x0188:
            r3.A0G()
            X.5rC r0 = r3.A01
            r0.A04()
            r3.A0G()
            android.os.Bundle r1 = r3.A0H()
            java.lang.String r0 = ""
            X.C107395bF.A03(r1, r0)
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x01a3:
            java.lang.Object r2 = r10.A00
            X.5id r2 = (X.C111755id) r2
            com.whatsapp.chatinfo.ContactInfoActivity r4 = r2.A0n
            X.0XL r1 = X.AnonymousClass0x9.A0H(r4)
            X.9Rm r3 = r2.A15
            r7 = 0
            java.lang.Class<X.94j> r0 = X.C1901794j.class
            X.0Ty r6 = r1.A01(r0)
            X.94j r6 = (X.C1901794j) r6
            r9 = 0
            r5 = r4
            r8 = r7
            X.9Sp r1 = r3.A00(r4, r5, r6, r7, r8, r9)
            X.3ZH r0 = r2.A0M
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r0)
            r6 = 2
            java.lang.String r5 = "contact_card"
            r4 = r7
            r3 = r7
            r7 = r9
            r1.A00(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68K.A07(android.view.View):void");
    }
}
