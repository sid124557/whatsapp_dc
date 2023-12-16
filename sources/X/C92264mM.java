package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.4mM  reason: invalid class name and case insensitive filesystem */
public class C92264mM extends C89904fT {
    public C108985dt A00;
    public final C116985rC A01;
    public final C111095hX A02;
    public final C85244Fm A03;
    public final C56972sr A04;
    public final C105035Th A05;
    public final C620433g A06;
    public final C105145Tt A07;
    public final AnonymousClass5X1 A08;
    public final C56962sq A09;
    public final AnonymousClass64Q A0A;
    public final C41242Jm A0B;
    public final C64773Ex A0C;
    public final C34461vC A0D;
    public final C56422rx A0E;
    public final AnonymousClass5ZU A0F;
    public final C49772h4 A0G;
    public final AnonymousClass1QO A0H;
    public final C50202hn A0I;
    public final C56152rV A0J;
    public final AnonymousClass2R8 A0K;
    public final AnonymousClass5GF A0L;
    public final AnonymousClass1VX A0M;
    public final AnonymousClass3LP A0N;
    public final AnonymousClass4FV A0O;
    public final AnonymousClass2WP A0P;
    public final C53202mi A0Q;
    public final C1907099n A0R;
    public final AnonymousClass9Tp A0S;
    public final C45592aG A0T;
    public final AnonymousClass2ML A0U;
    public final C187958y5 A0V;
    public final AnonymousClass4FS A0W;
    public final C1227565p A0X;
    public final boolean A0Y;

    public final boolean A08() {
        if (!this.A0K.BIh()) {
            C95814uZ r2 = this.A0V;
            AnonymousClass5TW r0 = this.A0B;
            C56972sr r1 = this.A04;
            if (r2 == null || r0.A01() || r1.A0a(r2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0208, code lost:
        if (r7.A0G.A00(r6) != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (X.C86644Kx.A1Z(r7.A0M) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQQ(android.view.Menu r18) {
        /*
            r17 = this;
            r9 = r18
            boolean r0 = r9 instanceof X.C07890cz
            r8 = 1
            r7 = r17
            if (r0 == 0) goto L_0x0016
            X.1VX r0 = r7.A0M
            boolean r0 = X.C106545Zk.A00(r0)
            if (r0 == 0) goto L_0x0016
            r0 = r9
            X.0cz r0 = (X.C07890cz) r0
            r0.A0H = r8
        L_0x0016:
            java.lang.String r0 = "contactconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sr r1 = r7.A04
            X.4uZ r6 = r7.A0V
            r1.A0a(r6)
            X.3LP r0 = r7.A0N
            boolean r16 = X.C57362tW.A00(r0, r6)
            X.2mi r0 = r7.A0Q
            boolean r15 = r0.A02(r6)
            boolean r0 = r1.A0a(r6)
            if (r0 == 0) goto L_0x003d
            X.1VX r0 = r7.A0M
            boolean r0 = X.C86644Kx.A1Z(r0)
            r14 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r14 = 0
        L_0x003e:
            X.3ZH r0 = r7.A00
            boolean r4 = r0.A0T()
            X.99n r1 = r7.A0R
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0063
            int r0 = r1.A04(r6)
            if (r0 != r8) goto L_0x0063
            X.33g r3 = r7.A06
            X.3ZH r0 = r7.A00
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass3ZH.A07(r0)
            r1 = 3
            X.5AW r0 = new X.5AW
            r0.<init>(r7, r1)
            r3.A06(r0, r2)
        L_0x0063:
            if (r16 != 0) goto L_0x00ab
            if (r14 != 0) goto L_0x00ab
            if (r15 != 0) goto L_0x00ab
            if (r4 != 0) goto L_0x00ab
            X.3ZH r0 = r7.A00
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x0231
            X.1VX r1 = r7.A0M
            r0 = 1464(0x5b8, float:2.052E-42)
            boolean r5 = r1.A0X(r0)
            r0 = 4067(0xfe3, float:5.699E-42)
            int r4 = r1.A0N(r0)
            r3 = r6
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.33g r2 = r7.A06
            r1 = 6
            X.5r6 r0 = new X.5r6
            r0.<init>(r9, r1, r7)
            r2.A06(r0, r3)
            X.2rx r1 = r7.A0E
            X.3ZH r0 = r7.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r0)
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x01fa
            if (r4 < r8) goto L_0x00a6
            X.4FS r1 = r7.A0W
            r0 = 49
            X.C70203a7.A00(r1, r7, r9, r0)
        L_0x00a6:
            if (r5 == 0) goto L_0x00ab
            r7.A07(r9)
        L_0x00ab:
            r1 = 2131895053(0x7f12230d, float:1.9424928E38)
            r2 = 2131234157(0x7f080d6d, float:1.8084472E38)
            r0 = 21
            r7.A04(r9, r0, r1, r2)
            if (r14 == 0) goto L_0x00cc
            X.1vC r1 = r7.A0D
            X.3ZH r0 = r7.A00
            com.whatsapp.jid.Jid r0 = X.AnonymousClass4L0.A0M(r0)
            X.3ZH r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r0.A0Q()
            if (r0 != 0) goto L_0x00d4
        L_0x00cc:
            r1 = 2131886335(0x7f1200ff, float:1.9407246E38)
            r0 = 22
            r7.A04(r9, r0, r1, r2)
        L_0x00d4:
            X.3ZH r0 = r7.A00
            boolean r0 = r0.A0R()
            r5 = 5
            r3 = 23
            r10 = 12
            r4 = 9
            r2 = 24
            r11 = 4
            r13 = 7
            r12 = 6
            if (r0 == 0) goto L_0x0181
            if (r16 != 0) goto L_0x00f5
            if (r15 != 0) goto L_0x00f5
            r1 = 2131893093(0x7f121b65, float:1.9420953E38)
            r0 = 2131232756(0x7f0807f4, float:1.808163E38)
            r7.A04(r9, r4, r1, r0)
        L_0x00f5:
            if (r14 != 0) goto L_0x0102
            if (r15 != 0) goto L_0x0102
            r1 = 2131886799(0x7f1202cf, float:1.9408187E38)
            r0 = 2131233938(0x7f080c92, float:1.8084028E38)
            r7.A04(r9, r3, r1, r0)
        L_0x0102:
            r1 = 2131894564(0x7f122124, float:1.9423936E38)
            r0 = 2131233938(0x7f080c92, float:1.8084028E38)
            r7.A04(r9, r2, r1, r0)
            r1 = 2131896276(0x7f1227d4, float:1.9427409E38)
            r0 = 2131231776(0x7f080420, float:1.8079643E38)
            r7.A04(r9, r13, r1, r0)
            if (r14 != 0) goto L_0x0120
            int r1 = r7.A03()
            r0 = 2131231753(0x7f080409, float:1.8079596E38)
            r7.A04(r9, r11, r1, r0)
        L_0x0120:
            X.3ZH r0 = r7.A00
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r0.A0I(r2)
            if (r0 == 0) goto L_0x0143
            X.2hv r1 = r7.A0Y
            X.3ZH r0 = r7.A00
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A05(r0, r2)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0143
            r1 = 2131889027(0x7f120b83, float:1.9412706E38)
            r0 = 2131232283(0x7f08061b, float:1.808067E38)
            r7.A04(r9, r10, r1, r0)
        L_0x0143:
            r1 = 2131895476(0x7f1224b4, float:1.9425786E38)
            r0 = 2131232723(0x7f0807d3, float:1.8081563E38)
            r7.A04(r9, r5, r1, r0)
            r0 = 2131896074(0x7f12270a, float:1.9426999E38)
            r5 = 0
            android.view.SubMenu r8 = r9.addSubMenu(r5, r8, r5, r0)
            r8.clearHeader()
            r8.clearHeader()
            r1 = 2131895060(0x7f122314, float:1.9424942E38)
            r0 = 2131232677(0x7f0807a5, float:1.808147E38)
            r7.A04(r8, r12, r1, r0)
        L_0x0163:
            X.C89904fT.A01(r8, r7)
            X.2ML r2 = r7.A0U
            X.C162457s7.A0J(r6, r5)
            boolean r0 = X.C627336j.A0L(r6)
            if (r0 == 0) goto L_0x0180
            X.1VX r1 = r2.A01
            r0 = 3519(0xdbf, float:4.931E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0180
            X.2sr r0 = r2.A00
            r0.A0Y()
        L_0x0180:
            return
        L_0x0181:
            r1 = 2131895060(0x7f122314, float:1.9424942E38)
            r0 = 2131232677(0x7f0807a5, float:1.808147E38)
            r7.A04(r9, r12, r1, r0)
            r1 = 2131896276(0x7f1227d4, float:1.9427409E38)
            r0 = 2131231776(0x7f080420, float:1.8079643E38)
            r7.A04(r9, r13, r1, r0)
            if (r14 != 0) goto L_0x019f
            int r1 = r7.A03()
            r0 = 2131231753(0x7f080409, float:1.8079596E38)
            r7.A04(r9, r11, r1, r0)
        L_0x019f:
            X.3ZH r0 = r7.A00
            java.lang.Class<com.whatsapp.jid.UserJid> r11 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r0.A0I(r11)
            if (r0 == 0) goto L_0x01c2
            X.2hv r1 = r7.A0Y
            X.3ZH r0 = r7.A00
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A05(r0, r11)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x01c2
            r1 = 2131889027(0x7f120b83, float:1.9412706E38)
            r0 = 2131232283(0x7f08061b, float:1.808067E38)
            r7.A04(r9, r10, r1, r0)
        L_0x01c2:
            r1 = 2131895476(0x7f1224b4, float:1.9425786E38)
            r0 = 2131232723(0x7f0807d3, float:1.8081563E38)
            r7.A04(r9, r5, r1, r0)
            r0 = 2131896074(0x7f12270a, float:1.9426999E38)
            r5 = 0
            android.view.SubMenu r8 = r9.addSubMenu(r5, r8, r5, r0)
            r8.clearHeader()
            r8.clearHeader()
            if (r14 != 0) goto L_0x01ef
            if (r15 != 0) goto L_0x01ef
            r1 = 2131893093(0x7f121b65, float:1.9420953E38)
            r0 = 2131232756(0x7f0807f4, float:1.808163E38)
            r7.A04(r8, r4, r1, r0)
            r1 = 2131886799(0x7f1202cf, float:1.9408187E38)
            r0 = 2131233938(0x7f080c92, float:1.8084028E38)
            r7.A04(r8, r3, r1, r0)
        L_0x01ef:
            r1 = 2131894564(0x7f122124, float:1.9423936E38)
            r0 = 2131233938(0x7f080c92, float:1.8084028E38)
            r7.A04(r8, r2, r1, r0)
            goto L_0x0163
        L_0x01fa:
            boolean r0 = r7.A08()
            r2 = 0
            if (r0 == 0) goto L_0x020a
            X.2h4 r0 = r7.A0G
            com.whatsapp.jid.UserJid r0 = r0.A00(r6)
            r4 = 1
            if (r0 == 0) goto L_0x020b
        L_0x020a:
            r4 = 0
        L_0x020b:
            r3 = 2131887209(0x7f120469, float:1.9409019E38)
            r1 = 28
            r0 = 5
            android.view.MenuItem r1 = r9.add(r2, r1, r0, r3)
            r0 = 2131231757(0x7f08040d, float:1.8079604E38)
            android.view.MenuItem r2 = r1.setIcon(r0)
            r0 = 2131624133(0x7f0e00c5, float:1.8875437E38)
            android.view.View r1 = X.C86644Kx.A0F(r2, r0)
            X.07r r0 = r7.A01
            X.C18300x5.A13(r0, r1, r3)
            r7.A06(r2, r3, r4)
            r0 = 2
            r2.setShowAsAction(r0)
            goto L_0x00ab
        L_0x0231:
            boolean r5 = r7.A08()
            r4 = 2131886482(0x7f120192, float:1.9407544E38)
            r3 = 2
            r2 = 2131895016(0x7f1222e8, float:1.9424853E38)
            r1 = 2131233785(0x7f080bf9, float:1.8083717E38)
            r0 = 26
            android.view.MenuItem r1 = r7.A04(r9, r0, r2, r1)
            r0 = 2131626253(0x7f0e090d, float:1.8879737E38)
            r1.setActionView(r0)
            r7.A06(r1, r2, r5)
            r1.setShowAsAction(r3)
            r1 = 25
            r0 = 2131231718(0x7f0803e6, float:1.8079525E38)
            android.view.MenuItem r2 = r7.A04(r9, r1, r4, r0)
            r0 = 2131624117(0x7f0e00b5, float:1.8875405E38)
            android.view.View r1 = X.C86644Kx.A0F(r2, r0)
            X.07r r0 = r7.A01
            X.C18300x5.A13(r0, r1, r4)
            r7.A06(r2, r4, r5)
            r2.setShowAsAction(r3)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92264mM.BQQ(android.view.Menu):void");
    }

    public final void A07(Menu menu) {
        boolean A082 = A08();
        MenuItem A042 = A04(menu, 25, R.string.f11nameremoved, R.drawable.ic_action_call);
        C18300x5.A13(this.A01, C86644Kx.A0F(A042, R.layout.f8nameremoved), R.string.f11nameremoved);
        A06(A042, R.string.f11nameremoved, A082);
        A042.setShowAsAction(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018c, code lost:
        r2.Boo(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BXQ(android.view.MenuItem r14) {
        /*
            r13 = this;
            int r2 = r14.getItemId()
            r1 = 11
            r0 = 1
            if (r2 == r1) goto L_0x01ec
            r1 = 15
            r4 = 2
            if (r2 == r1) goto L_0x01b3
            r1 = 34
            if (r2 == r1) goto L_0x019d
            java.lang.String r5 = "overflow_menu_block"
            r8 = 0
            switch(r2) {
                case 21: goto L_0x00cb;
                case 22: goto L_0x00ec;
                case 23: goto L_0x007f;
                case 24: goto L_0x0109;
                case 25: goto L_0x0134;
                case 26: goto L_0x014f;
                case 27: goto L_0x001d;
                case 28: goto L_0x016a;
                case 29: goto L_0x00b0;
                case 30: goto L_0x0034;
                case 31: goto L_0x006d;
                case 32: goto L_0x0190;
                default: goto L_0x0018;
            }
        L_0x0018:
            boolean r0 = super.BXQ(r14)
        L_0x001c:
            return r0
        L_0x001d:
            X.5rC r2 = r13.A03
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x001c
            r2.A04()
            X.5rC r0 = r13.A04
            r0.A04()
            java.lang.String r0 = "getLabelChatMenuItem"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0034:
            android.view.View r2 = r14.getActionView()
            r1 = 2131434172(0x7f0b1abc, float:1.849015E38)
            java.lang.Object r3 = r2.getTag(r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x001c
            X.4Fm r2 = r13.A03
            X.07r r1 = r13.A01
            X.C86604Kt.A12(r1, r2, r3)
            X.65p r1 = r13.A0X
            boolean r1 = r1.BJ8()
            if (r1 == 0) goto L_0x001c
            X.4rS r2 = new X.4rS
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.A01 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.A00 = r1
            X.4FV r1 = r13.A0O
            r1.BhD(r2)
            return r0
        L_0x006d:
            X.5rC r2 = r13.A01
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x001c
            r2.A04()
            java.lang.String r0 = "showChatAssignmentPicker"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x007f:
            X.4uZ r1 = r13.A0V
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A04(r1)
            X.3ZH r1 = r13.A00
            boolean r1 = r1.A0R()
            if (r1 == 0) goto L_0x009b
            X.07r r5 = r13.A01
            java.lang.String r7 = "biz_overflow_menu_block"
            r10 = r8
            r11 = r8
            r12 = r8
            r9 = r8
            android.content.Intent r1 = X.C627736r.A0m(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x020d
        L_0x009b:
            X.64Q r1 = r13.A0A
            X.5Op r1 = r1.Azw(r6, r5)
            r1.A04 = r0
            r1.A05 = r8
            r1.A01(r8, r0)
            X.4FU r2 = r13.A05
            com.whatsapp.blockui.BlockConfirmationDialogFragment r1 = X.C103835Op.A00(r1)
            goto L_0x018c
        L_0x00b0:
            X.2hn r3 = r13.A0I
            X.4uZ r4 = r13.A0V
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r4)
            r1 = 9
            r3.A01(r2, r1)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.33g r3 = r13.A06
            r2 = 7
            X.5r6 r1 = new X.5r6
            r1.<init>(r4, r2, r13)
            r3.A06(r1, r4)
            return r0
        L_0x00cb:
            X.07r r4 = r13.A01
            r1 = 2131434443(0x7f0b1bcb, float:1.84907E38)
            android.view.View r2 = r4.findViewById(r1)
            X.5MG r1 = r13.A0A
            android.os.Bundle r3 = X.AnonymousClass5MG.A00(r4, r2, r1)
            X.3ZH r1 = r13.A00
            com.whatsapp.jid.UserJid r2 = X.C86604Kt.A0d(r1)
            java.lang.Integer r1 = X.C18290x4.A0a()
            android.content.Intent r1 = X.C627736r.A0l(r4, r2, r1, r0, r8)
            X.AnonymousClass0RN.A00(r4, r1, r3)
            return r0
        L_0x00ec:
            X.2hn r4 = r13.A0I
            X.4uZ r1 = r13.A0V
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A03(r1)
            X.1VX r2 = r4.A03
            r1 = 2805(0xaf5, float:3.93E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x0103
            r1 = 20
            r4.A01(r3, r1)
        L_0x0103:
            X.67A r1 = r13.A0K
            r1.Awo()
            return r0
        L_0x0109:
            X.3ZH r1 = r13.A00
            boolean r1 = r1.A0R()
            if (r1 == 0) goto L_0x0113
            java.lang.String r5 = "biz_overflow_menu_block"
        L_0x0113:
            X.2sq r3 = r13.A09
            X.07r r2 = r13.A01
            X.3ZH r1 = r13.A00
            r3.A0F(r2, r1, r5, r8)
            X.3LP r3 = r13.A0N
            X.4FS r6 = r13.A0W
            X.4FV r4 = r13.A0O
            X.2rV r2 = r13.A0J
            X.3ZH r1 = r13.A00
            X.4uZ r5 = X.AnonymousClass3ZH.A01(r1)
            java.lang.Integer r7 = X.C18290x4.A0b()
            r9 = 2
            r8 = 0
            X.AnonymousClass31G.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0134:
            X.2hn r3 = r13.A0I
            X.4uZ r1 = r13.A0V
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r1)
            r1 = 8
            r3.A01(r2, r1)
            X.2aG r2 = r13.A0T
            r1 = 6
            r2.A00(r1)
            X.67A r2 = r13.A0K
            X.3ZH r1 = r13.A00
            r2.BhP(r1, r8, r8)
            return r0
        L_0x014f:
            X.2hn r3 = r13.A0I
            X.4uZ r1 = r13.A0V
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r1)
            r1 = 8
            r3.A01(r2, r1)
            X.2aG r2 = r13.A0T
            r1 = 7
            r2.A00(r1)
            X.67A r2 = r13.A0K
            X.3ZH r1 = r13.A00
            r2.BhP(r1, r0, r8)
            return r0
        L_0x016a:
            X.2hn r3 = r13.A0I
            X.4uZ r1 = r13.A0V
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r1)
            r1 = 8
            r3.A01(r2, r1)
            X.2aG r2 = r13.A0T
            r1 = 9
            r2.A00(r1)
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = new com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment
            r1.<init>()
            r1.A0u(r2)
            X.4FU r2 = r13.A05
        L_0x018c:
            r2.Boo(r1)
            return r0
        L_0x0190:
            X.4FS r3 = r13.A0W
            r2 = 46
            X.3Zj r1 = new X.3Zj
            r1.<init>(r13, r2)
            r3.BkM(r1)
            return r0
        L_0x019d:
            X.1QO r2 = r13.A0H
            X.07r r3 = r13.A01
            java.lang.String r5 = ""
            r1 = 0
            X.398 r4 = new X.398
            r4.<init>(r5, r1)
            java.lang.String r6 = X.C18280x3.A0Y()
            r7 = -1
            r2.A0D(r3, r4, r5, r6, r7)
            return r0
        L_0x01b3:
            X.99n r1 = r13.A0R
            X.4uZ r2 = r13.A0V
            int r1 = r1.A04(r2)
            if (r1 != r4) goto L_0x01df
            X.3Ex r1 = r13.A0C
            X.3ZH r1 = r1.A0A(r2)
            java.lang.String r3 = r1.A0J()
            X.07r r4 = r13.A01
            r2 = 2131891500(0x7f12152c, float:1.9417722E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r3 = X.C86614Ku.A0s(r4, r3, r1, r2)
            X.4FU r2 = r13.A05
            r1 = 2131891501(0x7f12152d, float:1.9417724E38)
            java.lang.String r1 = r4.getString(r1)
            r2.Bov(r1, r3)
            return r0
        L_0x01df:
            X.9Tp r2 = r13.A0S
            X.2sr r1 = r13.A04
            r2.A03(r1)
            X.4FV r1 = r13.A0O
            r2.A04(r1)
            return r0
        L_0x01ec:
            X.2WP r1 = r13.A0P
            r3 = 5
            r1.A00(r3)
            X.07r r5 = r13.A01
            android.content.Context r2 = r5.getApplicationContext()
            X.3ZH r1 = r13.A00
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r1)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r1.getRawString()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            android.content.Intent r1 = X.C627736r.A1A(r2, r1, r3)
        L_0x020d:
            r5.startActivity(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92264mM.BXQ(android.view.MenuItem):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (X.C86644Kx.A1Z(r6.A0M) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BYj(android.view.Menu r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactconversationmenu/onprepareoptionsmenu "
            r1.append(r0)
            int r0 = r7.size()
            X.C18260x0.A1G(r1, r0)
            int r0 = r7.size()
            r1 = 0
            if (r0 != 0) goto L_0x0018
            return r1
        L_0x0018:
            X.2sr r4 = r6.A04
            X.4uZ r3 = r6.A0V
            boolean r0 = r4.A0a(r3)
            if (r0 == 0) goto L_0x002b
            X.1VX r0 = r6.A0M
            boolean r0 = X.C86644Kx.A1Z(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0034
        L_0x002b:
            r5 = 0
            r0 = 4
            android.view.MenuItem r0 = r7.findItem(r0)
            r6.A05(r0)
        L_0x0034:
            X.3ZH r0 = r6.A00
            X.2k5 r0 = r0.A0F
            if (r0 == 0) goto L_0x003b
            r1 = 1
        L_0x003b:
            r0 = 21
            X.C89904fT.A00(r7, r0, r1)
            if (r5 == 0) goto L_0x0056
            X.1vC r1 = r6.A0D
            X.3ZH r0 = r6.A00
            com.whatsapp.jid.Jid r0 = X.AnonymousClass4L0.A0M(r0)
            X.3ZH r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.A0Q()
            if (r0 != 0) goto L_0x0094
        L_0x0056:
            X.3ZH r2 = r6.A00
            X.2k5 r0 = r2.A0F
            if (r0 != 0) goto L_0x00b5
            boolean r0 = X.C86654Ky.A1Y(r2)
            if (r0 != 0) goto L_0x00b5
            boolean r0 = X.C86664Kz.A1W(r4)
            if (r0 == 0) goto L_0x00b5
            X.3LP r0 = r6.A0N
            boolean r0 = X.C86624Kv.A1X(r2, r0)
            if (r0 != 0) goto L_0x00b5
            X.2mi r1 = r6.A0Q
            X.4uZ r0 = r2.A0H
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r6.A0Y
            if (r0 != 0) goto L_0x00b5
            X.2Jm r1 = r6.A0B
            boolean r0 = r2.A0T()
            if (r0 == 0) goto L_0x008e
            X.1VX r0 = r1.A01
            boolean r0 = X.AnonymousClass75P.A00(r0)
            if (r0 != 0) goto L_0x00b5
        L_0x008e:
            r1 = 1
        L_0x008f:
            r0 = 22
            X.C89904fT.A00(r7, r0, r1)
        L_0x0094:
            X.2sq r0 = r6.A09
            boolean r2 = X.C86614Ku.A1X(r0, r3)
            if (r5 != 0) goto L_0x00ab
            X.2mi r0 = r6.A0Q
            boolean r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x00ab
            r1 = r2 ^ 1
            r0 = 23
            X.C89904fT.A00(r7, r0, r1)
        L_0x00ab:
            r0 = 24
            X.C89904fT.A00(r7, r0, r2)
            boolean r0 = super.BYj(r7)
            return r0
        L_0x00b5:
            r1 = 0
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92264mM.BYj(android.view.Menu):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92264mM(X.C009707r r39, X.C116985rC r40, X.C116985rC r41, X.C116985rC r42, X.C116985rC r43, X.C111095hX r44, X.AnonymousClass5M8 r45, X.AnonymousClass5M9 r46, X.C101365Em r47, X.AnonymousClass4FU r48, X.C69263Wi r49, X.C85244Fm r50, X.C56972sr r51, X.C66663Mh r52, X.C621033m r53, X.AnonymousClass5MG r54, X.C105035Th r55, X.C620433g r56, X.C105145Tt r57, X.AnonymousClass5X1 r58, X.C56962sq r59, X.AnonymousClass64Q r60, X.C41242Jm r61, X.AnonymousClass5TW r62, X.C29301ib r63, X.C46342bT r64, X.C64773Ex r65, X.C34461vC r66, X.C29421in r67, X.C56422rx r68, X.AnonymousClass5ZU r69, X.AnonymousClass7T1 r70, X.AnonymousClass67A r71, X.C49772h4 r72, X.C113905mB r73, X.AnonymousClass1QO r74, X.AnonymousClass33p r75, X.C620733j r76, X.C50202hn r77, X.C56982ss r78, X.C66473Lo r79, X.C56152rV r80, X.AnonymousClass3ZH r81, X.C29041iB r82, X.AnonymousClass2R8 r83, X.AnonymousClass5GF r84, X.AnonymousClass1VX r85, X.AnonymousClass3LP r86, X.AnonymousClass4FV r87, X.C29241iV r88, X.AnonymousClass2WP r89, X.C53202mi r90, X.C95814uZ r91, X.C50452iC r92, X.C1907099n r93, X.AnonymousClass9Tp r94, X.AnonymousClass1R1 r95, X.C45592aG r96, X.C50282hv r97, X.AnonymousClass2ML r98, X.C187958y5 r99, X.AnonymousClass4FS r100, X.C1227565p r101) {
        /*
            r38 = this;
            r4 = r38
            r36 = r97
            r35 = r95
            r11 = r47
            r10 = r46
            r9 = r45
            r5 = r39
            r15 = r52
            r16 = r53
            r17 = r54
            r8 = r43
            r18 = r62
            r0 = r100
            r7 = r41
            r6 = r40
            r21 = r67
            r20 = r64
            r19 = r63
            r12 = r48
            r13 = r49
            r14 = r51
            r22 = r71
            r23 = r73
            r24 = r75
            r25 = r76
            r26 = r78
            r27 = r79
            r3 = r81
            r29 = r82
            r2 = r85
            r1 = r86
            r32 = r88
            r33 = r91
            r34 = r92
            r28 = r3
            r30 = r2
            r31 = r1
            r37 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4.A0M = r2
            r4.A04 = r14
            r4.A0W = r0
            r0 = r87
            r4.A0O = r0
            r4.A0N = r1
            r0 = r50
            r4.A03 = r0
            r0 = r44
            r4.A02 = r0
            r0 = r65
            r4.A0C = r0
            r0 = r99
            r4.A0V = r0
            r0 = r69
            r4.A0F = r0
            r0 = r101
            r4.A0X = r0
            r0 = r59
            r4.A09 = r0
            r0 = r80
            r4.A0J = r0
            r0 = r94
            r4.A0S = r0
            r0 = r89
            r4.A0P = r0
            r0 = r68
            r4.A0E = r0
            r0 = r83
            r4.A0K = r0
            r0 = r55
            r4.A05 = r0
            r0 = r93
            r4.A0R = r0
            r0 = r56
            r4.A06 = r0
            r0 = r57
            r4.A07 = r0
            r0 = r66
            r4.A0D = r0
            r0 = r98
            r4.A0U = r0
            r0 = r61
            r4.A0B = r0
            r0 = r96
            r4.A0T = r0
            r0 = r72
            r4.A0G = r0
            r0 = r58
            r4.A08 = r0
            r0 = r77
            r4.A0I = r0
            r0 = r42
            r4.A01 = r0
            r0 = r90
            r4.A0Q = r0
            r0 = r70
            boolean r0 = r0.A00(r3)
            r4.A0Y = r0
            r0 = r84
            r4.A0L = r0
            r0 = r74
            r4.A0H = r0
            r0 = r60
            r4.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92264mM.<init>(X.07r, X.5rC, X.5rC, X.5rC, X.5rC, X.5hX, X.5M8, X.5M9, X.5Em, X.4FU, X.3Wi, X.4Fm, X.2sr, X.3Mh, X.33m, X.5MG, X.5Th, X.33g, X.5Tt, X.5X1, X.2sq, X.64Q, X.2Jm, X.5TW, X.1ib, X.2bT, X.3Ex, X.1vC, X.1in, X.2rx, X.5ZU, X.7T1, X.67A, X.2h4, X.5mB, X.1QO, X.33p, X.33j, X.2hn, X.2ss, X.3Lo, X.2rV, X.3ZH, X.1iB, X.2R8, X.5GF, X.1VX, X.3LP, X.4FV, X.1iV, X.2WP, X.2mi, X.4uZ, X.2iC, X.99n, X.9Tp, X.1R1, X.2aG, X.2hv, X.2ML, X.8y5, X.4FS, X.65p):void");
    }
}
