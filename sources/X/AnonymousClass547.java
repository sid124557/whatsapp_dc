package X;

import android.view.View;

/* renamed from: X.547  reason: invalid class name */
public class AnonymousClass547 extends C109665ez {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass547(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new AnonymousClass547(obj, obj2, obj3, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x049d, code lost:
        r1.Bon(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c9, code lost:
        X.AnonymousClass5ZY.A01(r1, r2, r3, r4, r4, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0269, code lost:
        r3.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x026c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02b3, code lost:
        r1 = X.C627736r.A0Y(r2, r1, r0);
        r0 = X.C111095hX.A04(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02d6, code lost:
        r0.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02d9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A03
            r4 = r17
            switch(r1) {
                case 0: goto L_0x01d8;
                case 1: goto L_0x01f1;
                case 2: goto L_0x0026;
                case 3: goto L_0x020b;
                case 4: goto L_0x006d;
                case 5: goto L_0x0224;
                case 6: goto L_0x0247;
                case 7: goto L_0x026d;
                case 8: goto L_0x0298;
                case 9: goto L_0x02a6;
                case 10: goto L_0x00ce;
                case 11: goto L_0x02bc;
                case 12: goto L_0x010b;
                case 13: goto L_0x02da;
                case 14: goto L_0x0144;
                case 15: goto L_0x030a;
                case 16: goto L_0x033f;
                case 17: goto L_0x0397;
                case 18: goto L_0x03cc;
                case 19: goto L_0x03dd;
                case 20: goto L_0x017e;
                case 21: goto L_0x040b;
                case 22: goto L_0x044a;
                case 23: goto L_0x0474;
                case 24: goto L_0x04a1;
                case 25: goto L_0x0563;
                case 26: goto L_0x057c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r6 = r0.A02
            X.5NK r6 = (X.AnonymousClass5NK) r6
            X.5Q7 r5 = r6.A01
            java.lang.Object r4 = r0.A01
            android.view.View r4 = (android.view.View) r4
            android.content.Context r3 = X.C18290x4.A0F(r4)
            X.21A r2 = X.AnonymousClass21A.WA_CROSSPOST_STATUS_PRIVACY_SETTINGS
            java.lang.Object r1 = r0.A00
            X.223 r1 = (X.AnonymousClass223) r1
            X.5jN r0 = new X.5jN
            r0.<init>(r4, r6)
            r5.A01(r3, r2, r0, r1)
        L_0x0025:
            return
        L_0x0026:
            java.lang.Object r1 = r0.A00
            X.0Ua r1 = (X.C05570Ua) r1
            int r2 = r1.A01()
            r1 = -1
            if (r2 == r1) goto L_0x0025
            java.lang.Object r1 = r0.A02
            X.8nD r1 = (X.C181718nD) r1
            X.7Ce r1 = r1.B76(r2)
            X.6em r1 = (X.C132146em) r1
            X.7Ya r1 = r1.A00
            java.lang.Object r2 = r0.A01
            com.whatsapp.biz.cart.view.fragment.CartFragment r2 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r2
            X.5dw r0 = r1.A02
            java.lang.String r6 = r0.A0F
            android.os.Bundle r1 = r2.A0H()
            java.lang.String r0 = "extra_product_id"
            java.lang.String r0 = r1.getString(r0)
            X.4V6 r1 = r2.A0W
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005b
            r2.A1K()
            return
        L_0x005b:
            com.whatsapp.jid.UserJid r3 = r1.A0R
            r2.A1K()
            android.content.Context r1 = r2.A0G()
            r8 = 0
            r4 = 0
            android.content.Intent r2 = X.C627736r.A1E(r1, r8, r8)
            r7 = 8
            goto L_0x00c9
        L_0x006d:
            java.lang.Object r1 = r0.A00
            X.0Ua r1 = (X.C05570Ua) r1
            int r2 = r1.A01()
            r1 = -1
            if (r2 == r1) goto L_0x0025
            java.lang.Object r1 = r0.A01
            X.8nD r1 = (X.C181718nD) r1
            X.7Ce r1 = r1.B76(r2)
            X.6el r1 = (X.C132136el) r1
            X.5dJ r4 = r1.A00
            java.lang.Object r3 = r0.A02
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r3 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r3
            X.5Tt r2 = r3.A09
            X.5P6 r1 = X.AnonymousClass5P6.A00(r2)
            X.5Tt r0 = r3.A09
            X.AnonymousClass5P6.A04(r1, r0)
            r0 = 39
            X.AnonymousClass5P6.A02(r1, r0)
            r0 = 46
            X.AnonymousClass5P6.A03(r1, r0)
            java.lang.String r6 = r4.A07
            r1.A0G = r6
            X.5dV r0 = r4.A04
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A06(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0L
            r1.A00 = r0
            java.lang.String r0 = r3.A0W
            r1.A0F = r0
            r2.A03(r1)
            X.4UZ r0 = r3.A0D
            android.content.Context r1 = r3.A0G()
            com.whatsapp.jid.UserJid r3 = r0.A0E
            r8 = 0
            r4 = 0
            android.content.Intent r2 = X.C627736r.A1E(r1, r8, r8)
            r7 = 9
        L_0x00c9:
            r5 = r4
            X.AnonymousClass5ZY.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x00ce:
            java.lang.Object r1 = r0.A01
            X.2FF r1 = (X.AnonymousClass2FF) r1
            java.lang.Object r3 = r0.A02
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            com.whatsapp.community.AddGroupsToCommunityActivity r0 = r1.A00
            X.10d r2 = r0.A03
            java.lang.Class<X.1fK> r0 = X.C28001fK.class
            com.whatsapp.jid.Jid r0 = r3.A0I(r0)
            if (r0 == 0) goto L_0x00f3
            java.util.Set r1 = r2.A0C
            boolean r0 = r1.remove(r3)
            if (r0 == 0) goto L_0x0025
            X.107 r0 = r2.A09
            r0.A0G(r1)
        L_0x00ef:
            r2.A0D()
            return
        L_0x00f3:
            java.lang.Class<X.1fL> r0 = X.C28011fL.class
            com.whatsapp.jid.Jid r0 = r3.A0I(r0)
            if (r0 == 0) goto L_0x0025
            java.util.Set r0 = r2.A01
            boolean r0 = r0.remove(r3)
            if (r0 == 0) goto L_0x0025
            X.107 r1 = r2.A08
            java.util.Set r0 = r2.A01
            r1.A0G(r0)
            goto L_0x00ef
        L_0x010b:
            java.lang.Object r5 = r0.A01
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            X.2qS r1 = r5.A0E
            if (r1 == 0) goto L_0x058f
            boolean r1 = r1.A09
            if (r1 == 0) goto L_0x058f
            android.content.Context r1 = r4.getContext()
            X.4ea r4 = X.C89654ea.A4J(r1)
            if (r4 == 0) goto L_0x0025
            java.lang.Object r1 = r0.A00
            X.4lo r1 = (X.C91924lo) r1
            X.8qC r1 = r1.A0C
            java.lang.Object r2 = r1.get()
            X.66o r2 = (X.C1229766o) r2
            java.lang.Object r1 = r0.A02
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.5jJ r3 = new X.5jJ
            r3.<init>(r1, r5, r0)
            X.5jK r2 = (X.C112185jK) r2
            X.2hm r2 = r2.A08
            java.lang.Integer r1 = X.C18300x5.A0Y()
            X.57k r0 = X.C996357k.AGENT
            r2.A00(r4, r3, r0, r1)
            return
        L_0x0144:
            java.lang.Object r5 = r0.A00
            X.4oI r5 = (X.C93304oI) r5
            r1 = 1
            com.whatsapp.jid.UserJid[] r3 = new com.whatsapp.jid.UserJid[r1]
            java.lang.Object r1 = r0.A01
            X.34x r1 = (X.C624134x) r1
            X.2z0 r1 = r1.A1J
            X.4uZ r1 = r1.A00
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r1)
            r1 = 0
            java.util.List r9 = X.AnonymousClass0x9.A1A(r2, r3, r1)
            java.lang.Object r8 = r0.A02
            X.1fJ r8 = (X.C27991fJ) r8
            android.content.Context r0 = r5.getContext()
            X.4ea r3 = X.C89654ea.A4J(r0)
            if (r8 == 0) goto L_0x0025
            if (r3 == 0) goto L_0x0025
            X.1ip r0 = r5.A0s
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x059b
            X.3Wi r2 = r5.A0X
            r1 = 2131886465(0x7f120181, float:1.940751E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x017e:
            java.lang.Object r5 = r0.A02
            com.whatsapp.info.views.EncryptionInfoView r5 = (com.whatsapp.info.views.EncryptionInfoView) r5
            X.2sj r1 = r5.getGroupParticipantsManager$chat_consumerBeta()
            java.lang.Object r4 = r0.A00
            X.1fL r4 = (X.C28011fL) r4
            boolean r1 = r1.A0F(r4)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x01be
            X.8qC r1 = r5.getDependencyBridgeRegistryLazy$chat_consumerBeta()
            java.lang.Object r2 = r1.get()
            X.2eH r2 = (X.C48062eH) r2
            java.lang.Class<X.3LE> r1 = X.AnonymousClass3LE.class
            r2.A02(r1)
            r1 = 4
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r3 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r1)
            X.4ea r2 = r5.A03
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r2.Bon(r3, r1)
        L_0x01b3:
            java.lang.Object r1 = r0.A01
            X.4sb r1 = (X.C95084sb) r1
            if (r1 == 0) goto L_0x0025
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A05 = r0
            return
        L_0x01be:
            X.4ea r3 = r5.A03
            X.8qC r1 = r5.getDependencyBridgeRegistryLazy$chat_consumerBeta()
            java.lang.Object r2 = r1.get()
            X.2eH r2 = (X.C48062eH) r2
            java.lang.Class<X.3LC> r1 = X.AnonymousClass3LC.class
            r2.A02(r1)
            r2 = 0
            com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment r1 = com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment.A00(r4)
            r3.Bon(r1, r2)
            goto L_0x01b3
        L_0x01d8:
            java.lang.Object r3 = r0.A00
            X.4Ro r3 = (X.AnonymousClass4Ro) r3
            java.lang.Object r2 = r0.A01
            int[] r2 = (int[]) r2
            X.4A4 r1 = r3.A09
            r1.Bbj(r2)
            r3.dismiss()
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x01f1:
            java.lang.Object r2 = r0.A01
            X.5Pp r2 = (X.C104085Pp) r2
            java.lang.Runnable r1 = r2.A02
            if (r1 == 0) goto L_0x01fc
            r1.run()
        L_0x01fc:
            X.8n4 r1 = r2.A01
            if (r1 == 0) goto L_0x0203
            r1.BJw()
        L_0x0203:
            java.lang.Object r0 = r0.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r4)
            return
        L_0x020b:
            android.content.Context r4 = r4.getContext()
            java.lang.Object r3 = r0.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Integer r2 = X.C18300x5.A0Y()
            r1 = 1
            android.content.Intent r1 = X.C627736r.A0l(r4, r3, r2, r1, r1)
            java.lang.Object r0 = r0.A01
            X.5hX r0 = (X.C111095hX) r0
            r0.A0A(r4, r1)
            return
        L_0x0224:
            r2 = 0
            java.lang.Object r1 = r0.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r1)
            X.4uZ r1 = (X.C95814uZ) r1
            X.5XB r3 = new X.5XB
            r3.<init>((android.view.View) r4, (X.C95814uZ) r1, (java.lang.Integer) r2)
            java.lang.Object r1 = r0.A02
            X.5J3 r1 = (X.AnonymousClass5J3) r1
            android.widget.ImageView r1 = r1.A00
            java.lang.String r1 = X.AnonymousClass0YZ.A06(r1)
            r3.A04 = r1
            java.lang.Object r0 = r0.A00
            X.4OP r0 = (X.AnonymousClass4OP) r0
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = r0.A00
            goto L_0x0269
        L_0x0247:
            r2 = 0
            java.lang.Object r1 = r0.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A04(r1)
            X.4uZ r1 = (X.C95814uZ) r1
            X.5XB r3 = new X.5XB
            r3.<init>((android.view.View) r4, (X.C95814uZ) r1, (java.lang.Integer) r2)
            java.lang.Object r1 = r0.A02
            X.5J4 r1 = (X.AnonymousClass5J4) r1
            android.widget.ImageView r1 = r1.A01
            java.lang.String r1 = X.AnonymousClass0YZ.A06(r1)
            r3.A04 = r1
            java.lang.Object r0 = r0.A00
            X.4Ob r0 = (X.C87114Ob) r0
            android.app.Activity r0 = r0.A04
        L_0x0269:
            r3.A02(r0)
            return
        L_0x026d:
            java.lang.Object r2 = r0.A02
            X.4Rw r2 = (X.AnonymousClass4Rw) r2
            X.4ea r1 = r2.getActivity()
            X.0df r3 = r1.getSupportFragmentManager()
            X.4ea r4 = r2.getActivity()
            X.C162457s7.A0D(r4)
            java.lang.Object r5 = r0.A00
            X.1fJ r5 = (X.C27991fJ) r5
            java.lang.Object r6 = r0.A01
            X.1fJ r6 = (X.C27991fJ) r6
            X.60c r9 = new X.60c
            r9.<init>(r2)
            r10 = 1
            X.3d3 r7 = X.C72023d3.A00
            X.8XS r8 = X.AnonymousClass8XS.A00
            r11 = 6
            r12 = r10
            X.AnonymousClass27C.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0298:
            java.lang.Object r3 = r0.A01
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r3.getContext()
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r0 = 0
            goto L_0x02b3
        L_0x02a6:
            java.lang.Object r3 = r0.A01
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r3.getContext()
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r0 = 1
        L_0x02b3:
            android.content.Intent r1 = X.C627736r.A0Y(r2, r1, r0)
            android.app.Activity r0 = X.C111095hX.A04(r3)
            goto L_0x02d6
        L_0x02bc:
            java.lang.Object r2 = r0.A01
            X.4sb r2 = (X.C95084sb) r2
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.A09 = r1
            java.lang.Object r2 = r0.A02
            com.whatsapp.info.views.StarredMessageInfoView r2 = (com.whatsapp.info.views.StarredMessageInfoView) r2
            android.content.Context r1 = r2.getContext()
            java.lang.Object r0 = r0.A00
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            android.content.Intent r1 = X.C627736r.A0a(r1, r0)
            X.4ea r0 = r2.A00
        L_0x02d6:
            r0.startActivity(r1)
            return
        L_0x02da:
            java.lang.Object r4 = r0.A00
            X.4mu r4 = (X.C92574mu) r4
            X.2sq r2 = r4.A0q
            java.lang.Object r1 = r0.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r2.A0P(r1)
            if (r1 == 0) goto L_0x0302
            X.4ea r3 = r4.A01
            r0 = 2
            X.5AX r2 = new X.5AX
            r2.<init>(r3, r0, r4)
            r0 = 2131892656(0x7f1219b0, float:1.9420066E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 0
            com.whatsapp.blocklist.UnblockDialogFragment r0 = com.whatsapp.blocklist.UnblockDialogFragment.A00(r2, r1, r0, r0)
            r3.Boo(r0)
            return
        L_0x0302:
            java.lang.Object r0 = r0.A02
            X.4uZ r0 = (X.C95814uZ) r0
            r4.A01.Bon(r4.getSharePhoneNumberBridge().A00(r0, 5), "SharePhoneNumberBottomSheet")
            return
        L_0x030a:
            java.lang.Object r5 = r0.A00
            X.5Xl r5 = (X.C106055Xl) r5
            java.lang.Object r2 = r0.A02
            X.34x r2 = (X.C624134x) r2
            boolean r1 = r2 instanceof X.C30481mW
            r4 = 0
            if (r1 == 0) goto L_0x032d
            X.1mW r2 = (X.C30481mW) r2
            int r3 = r2.A00
            X.4Fm r2 = r5.A05
            android.content.Context r1 = r5.A04
            java.lang.Object r0 = r0.A01
            X.32K r0 = (X.AnonymousClass32K) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.BkX(r1, r0, r4, r3)
            return
        L_0x032d:
            X.4Fm r2 = r5.A05
            android.content.Context r1 = r5.A04
            java.lang.Object r0 = r0.A01
            X.32K r0 = (X.AnonymousClass32K) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.BkW(r1, r0, r4)
            return
        L_0x033f:
            java.lang.Object r5 = r0.A00
            X.4pl r5 = (X.C94044pl) r5
            X.2sr r1 = r5.A01
            com.whatsapp.jid.PhoneUserJid r7 = X.C56972sr.A05(r1)
            X.2sr r1 = r5.A01
            X.2og r1 = r1.A0D
            java.lang.String r2 = r1.A03()
            X.5a1 r6 = new X.5a1
            r6.<init>()
            X.5Ot r1 = r6.A0A
            r1.A01 = r2
            r10 = 2
            java.lang.String r8 = X.AnonymousClass36P.A06(r7)
            r9 = 0
            r11 = 1
            r6.A04(r7, r8, r9, r10, r11)
            X.33j r3 = r5.A05
            X.5Xx r2 = r5.A00
            X.5Wg r1 = new X.5Wg
            r1.<init>(r2, r3)
            java.lang.String r4 = r1.A01(r6)     // Catch:{ 6zK -> 0x038b }
            android.content.Context r1 = r5.getContext()     // Catch:{ 6zK -> 0x038b }
            java.lang.Object r3 = r0.A01     // Catch:{ 6zK -> 0x038b }
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3     // Catch:{ 6zK -> 0x038b }
            android.content.Intent r2 = X.C109665ez.A06(r1, r11)     // Catch:{ 6zK -> 0x038b }
            java.lang.String r1 = "jid"
            X.AnonymousClass0x2.A0u(r2, r3, r1)     // Catch:{ 6zK -> 0x038b }
            java.lang.String r1 = "vcard"
            r2.putExtra(r1, r4)     // Catch:{ 6zK -> 0x038b }
            X.C86614Ku.A14(r2, r5)     // Catch:{ 6zK -> 0x038b }
            goto L_0x0391
        L_0x038b:
            r2 = move-exception
            java.lang.String r1 = "ReciprocalShare"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0391:
            java.lang.Object r0 = r0.A02
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x0397:
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r1)
            java.lang.Object r1 = r0.A00
            X.4pk r1 = (X.C94034pk) r1
            X.2bE r1 = r1.A02
            java.util.ArrayList r4 = r1.A00(r2)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            r4.size()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = "edit_mode"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r0 = "vcard_sender_infos"
            r2.putParcelableArrayListExtra(r0, r4)
            r3.startActivity(r2)
            return
        L_0x03cc:
            java.lang.Object r3 = r0.A02
            X.33m r3 = (X.C621033m) r3
            java.lang.Object r2 = r0.A00
            X.4uZ r2 = (X.C95814uZ) r2
            r1 = 0
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3.A0H(r2, r0, r1)
            return
        L_0x03dd:
            java.lang.Object r1 = r0.A02
            com.whatsapp.events.EventInfoFragment r1 = (com.whatsapp.events.EventInfoFragment) r1
            X.1fd r2 = r1.A0G
            if (r2 == 0) goto L_0x0404
            android.content.Context r3 = r1.A1D()
            java.lang.Object r1 = r0.A00
            X.2k9 r1 = (X.C51642k9) r1
            double r6 = r1.A00
            double r8 = r1.A01
            java.lang.Object r0 = r0.A01
            X.1mU r0 = (X.C30461mU) r0
            X.2lS r0 = r0.A01
            r5 = 0
            if (r0 == 0) goto L_0x0402
            java.lang.String r4 = r0.A02
            java.lang.String r5 = r0.A01
        L_0x03fe:
            r2.A08(r3, r4, r5, r6, r8)
            return
        L_0x0402:
            r4 = r5
            goto L_0x03fe
        L_0x0404:
            java.lang.String r0 = "locationUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x040b:
            java.lang.Object r2 = r0.A01
            X.4sb r2 = (X.C95084sb) r2
            if (r2 == 0) goto L_0x0415
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.A05 = r1
        L_0x0415:
            java.lang.Object r1 = r0.A02
            com.whatsapp.info.views.EncryptionInfoView r1 = (com.whatsapp.info.views.EncryptionInfoView) r1
            X.4ea r5 = r1.A03
            X.8qC r1 = r1.getDependencyBridgeRegistryLazy$chat_consumerBeta()
            java.lang.Object r2 = r1.get()
            X.2eH r2 = (X.C48062eH) r2
            java.lang.Class<X.3LF> r1 = X.AnonymousClass3LF.class
            r2.A02(r1)
            java.lang.Object r4 = r0.A00
            X.4uZ r4 = (X.C95814uZ) r4
            r3 = 0
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r2 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0v(r1, r4, r0)
            java.lang.String r0 = "business_state_id"
            r1.putInt(r0, r3)
            r2.A0u(r1)
            r0 = 0
            r5.Bon(r2, r0)
            return
        L_0x044a:
            java.lang.Object r4 = r0.A02
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r4 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r4
            java.lang.Object r3 = r0.A00
            java.lang.Object r2 = r0.A01
            X.4FS r1 = r4.getWaWorkers$chat_consumerBeta()
            r0 = 35
            X.C70343aL.A01(r1, r2, r4, r3, r0)
            X.8qC r0 = r4.getDependencyBridgeRegistryLazy$chat_consumerBeta()
            java.lang.Object r1 = r0.get()
            X.2eH r1 = (X.C48062eH) r1
            java.lang.Class<X.8y7> r0 = X.C187978y7.class
            r1.A02(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet
            r2.<init>()
            X.4ea r1 = r4.A06
            java.lang.String r0 = "PhoneNumberHiddenInCAGBottomSheet"
            goto L_0x049d
        L_0x0474:
            java.lang.Object r4 = r0.A02
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r4 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r4
            java.lang.Object r3 = r0.A00
            java.lang.Object r2 = r0.A01
            X.4FS r1 = r4.getWaWorkers$chat_consumerBeta()
            r0 = 35
            X.C70343aL.A01(r1, r2, r4, r3, r0)
            X.8qC r0 = r4.getDependencyBridgeRegistryLazy$chat_consumerBeta()
            java.lang.Object r1 = r0.get()
            X.2eH r1 = (X.C48062eH) r1
            java.lang.Class<X.8y8> r0 = X.C187988y8.class
            r1.A02(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            r2.<init>()
            X.4ea r1 = r4.A06
            java.lang.String r0 = "PhoneNumberSharedInCAGBottomSheet"
        L_0x049d:
            r1.Bon(r2, r0)
            return
        L_0x04a1:
            java.lang.Object r9 = r0.A00
            com.whatsapp.invites.InviteGroupParticipantsActivity r9 = (com.whatsapp.invites.InviteGroupParticipantsActivity) r9
            java.lang.Object r8 = r0.A02
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r10 = r0.A01
            X.1fJ r10 = (X.C27991fJ) r10
            X.33m r6 = r9.A01
            X.1VX r1 = r9.A0D
            X.3ZH r0 = r9.A09
            boolean r0 = X.AnonymousClass5YT.A00(r0, r1)
            if (r0 == 0) goto L_0x052c
            X.3ZH r0 = r9.A09
            java.lang.String r11 = r0.A0J()
        L_0x04bf:
            java.util.List r1 = r9.A0C
            byte[] r7 = r9.A0E
            com.whatsapp.mentions.MentionableEntry r0 = r9.A0A
            java.lang.String r5 = r0.getStringText()
            java.lang.String r0 = "UserActions/userActionSendGroupInviteMessages"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sr r0 = r6.A04
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r0)
            java.util.Iterator r15 = r1.iterator()
        L_0x04d8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0535
            java.lang.Object r12 = r15.next()
            X.2QD r12 = (X.AnonymousClass2QD) r12
            X.35J r1 = r6.A1X
            com.whatsapp.jid.UserJid r0 = r12.A02
            r13 = 1
            X.2z0 r2 = r1.A04(r0, r13)
            X.2sH r0 = r6.A0V
            long r0 = r0.A0H()
            X.1mN r3 = new X.1mN
            r3.<init>(r2, r0)
            r3.A02 = r13
            X.1fJ r14 = r12.A01
            java.lang.String r13 = r12.A03
            long r1 = r12.A00
            X.2ss r0 = r6.A0i
            int r12 = r0.A06(r14)
            r0 = 0
            r3.A02 = r14
            r3.A03 = r4
            r3.A05 = r11
            r3.A06 = r13
            r3.A01 = r1
            r3.A07 = r0
            r3.A00 = r12
            r3.A04 = r5
            if (r7 == 0) goto L_0x0523
            X.30w r0 = r3.A0y()
            X.C626936e.A06(r0)
            r0.A03(r7)
        L_0x0523:
            r6.A0O(r3)
            X.3Lv r0 = r6.A0l
            r0.A0V(r3)
            goto L_0x04d8
        L_0x052c:
            X.5ZU r1 = r9.A03
            X.3ZH r0 = r9.A09
            java.lang.String r11 = r1.A0H(r0)
            goto L_0x04bf
        L_0x0535:
            r0 = -1
            r9.setResult(r0)
            X.3Wi r7 = r9.A05
            X.33j r6 = r9.A07
            r5 = 2131755166(0x7f10009e, float:1.9141204E38)
            java.util.List r0 = r9.A0C
            int r0 = r0.size()
            long r3 = (long) r0
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            java.util.List r0 = r9.A0C
            int r0 = r0.size()
            boolean r1 = X.C18300x5.A1Y(r2, r0)
            java.lang.String r0 = r6.A0L(r2, r5, r3)
            r7.A0P(r0, r1)
            r9.A74(r10, r8)
            r9.finish()
            return
        L_0x0563:
            java.lang.Object r2 = r0.A01
            if (r2 == 0) goto L_0x0574
            java.lang.Object r1 = r0.A02
            X.5fd r1 = (X.C110065fd) r1
            X.4ab r1 = r1.A03
            java.util.List r1 = r1.A08
            if (r1 == 0) goto L_0x0574
            r1.remove(r2)
        L_0x0574:
            java.lang.Object r0 = r0.A00
            X.5ez r0 = (X.C109665ez) r0
            r0.A07(r4)
            return
        L_0x057c:
            java.lang.Object r2 = r0.A02
            android.os.Handler r2 = (android.os.Handler) r2
            java.lang.Object r1 = r0.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            java.lang.Object r0 = r0.A01
            X.4Dp r0 = (X.C84764Dp) r0
            r0.Bes()
            return
        L_0x058f:
            java.lang.Object r1 = r0.A00
            X.4lo r1 = (X.C91924lo) r1
            java.lang.Object r0 = r0.A02
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.C91924lo.A01(r0, r1, r5)
            return
        L_0x059b:
            r1 = 2131891657(0x7f1215c9, float:1.941804E38)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.BpA(r1, r0)
            X.3Lq r7 = r5.A1V
            X.1hw r6 = r5.A0E
            X.1di r4 = new X.1di
            r4.<init>(r5, r6, r7, r8, r9)
            X.4UC r2 = r4.A03
            r1 = 0
            X.4K4 r0 = new X.4K4
            r0.<init>(r8, r5, r3, r1)
            r2.A0B(r3, r0)
            X.4UC r2 = r4.A02
            r1 = 1
            X.4K4 r0 = new X.4K4
            r0.<init>(r8, r5, r3, r1)
            r2.A0B(r3, r0)
            X.4UC r2 = r4.A01
            r1 = 2
            X.4K4 r0 = new X.4K4
            r0.<init>(r8, r5, r3, r1)
            r2.A0B(r3, r0)
            X.4UC r1 = r4.A00
            r0 = 190(0xbe, float:2.66E-43)
            X.C86604Kt.A1M(r3, r1, r0)
            X.3Lr r3 = r5.A0G
            X.4FS r2 = r3.A08
            r0 = 29
            X.3Zx r1 = new X.3Zx
            r1.<init>(r3, r0, r4)
            java.lang.String r0 = "GroupXmppMethods/sendAddParticipants"
            r2.BkV(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass547.A07(android.view.View):void");
    }
}
