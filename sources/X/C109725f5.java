package X;

import android.view.View;

/* renamed from: X.5f5  reason: invalid class name and case insensitive filesystem */
public class C109725f5 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C109725f5(C153427bI r1, AnonymousClass84O r2, C835248t r3, int i) {
        this.A03 = i;
        if (i != 0) {
            this.A00 = r2;
            this.A01 = r3;
            this.A02 = r1;
            return;
        }
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new C109725f5(obj, obj2, obj3, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: com.whatsapp.group.GroupMembersSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: com.whatsapp.invites.InviteGroupParticipantsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v99, resolved type: com.whatsapp.group.GroupMembersSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v100, resolved type: com.whatsapp.group.GroupMembersSelector} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0359, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x035c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0502, code lost:
        r2.BkM(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0505, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0543, code lost:
        r6 = r0.A00;
        r3 = r6.A0Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0549, code lost:
        if (r3 == null) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x054b, code lost:
        r2 = true;
        r0 = X.AnonymousClass000.A1U(r5.A0H, 2);
        r1 = r6.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0555, code lost:
        if (r0 == false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x055d, code lost:
        if (X.C627436k.A0J(r6.A0Y) != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x055f, code lost:
        r1.BJS(r3, r5, 3, r2);
        r6.A0G.A0K(r4, r5.A0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x056a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x056b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x056d, code lost:
        com.whatsapp.util.Log.w("voip/CallsFragment no activity registered to join ongoing call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0572, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0592, code lost:
        r1.A00(r4, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0595, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05f0, code lost:
        r0.A00.A00(r4, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x061d, code lost:
        r3.setClassName(r2, "com.whatsapp.calling.calllink.view.CallLinkActivity");
        r1.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0625, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0626, code lost:
        r3.A0H(com.whatsapp.R.string.f11nameremoved, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x062c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06b1, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0703, code lost:
        r3 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0707, code lost:
        r5.BYw(r3, r7.A01(r6), r7.A03(r6), r7.A02(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0716, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0717, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0126, code lost:
        r0.A00.A0G(new X.AnonymousClass5S7(r3, r4, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r17) {
        /*
            r16 = this;
            r6 = r17
            r3 = r16
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x080f;
                case 1: goto L_0x07c9;
                case 2: goto L_0x07a6;
                case 3: goto L_0x027a;
                case 4: goto L_0x0786;
                case 5: goto L_0x0762;
                case 6: goto L_0x0248;
                case 7: goto L_0x0745;
                case 8: goto L_0x021b;
                case 9: goto L_0x0719;
                case 10: goto L_0x06e3;
                case 11: goto L_0x06b5;
                case 12: goto L_0x069a;
                case 13: goto L_0x0674;
                case 14: goto L_0x064a;
                case 15: goto L_0x062d;
                case 16: goto L_0x05f6;
                case 17: goto L_0x05e3;
                case 18: goto L_0x05d5;
                case 19: goto L_0x0596;
                case 20: goto L_0x0583;
                case 21: goto L_0x0573;
                case 22: goto L_0x0535;
                case 23: goto L_0x0515;
                case 24: goto L_0x0506;
                case 25: goto L_0x04d5;
                case 26: goto L_0x04bd;
                case 27: goto L_0x048a;
                case 28: goto L_0x019a;
                case 29: goto L_0x0169;
                case 30: goto L_0x0131;
                case 31: goto L_0x046d;
                case 32: goto L_0x0434;
                case 33: goto L_0x0418;
                case 34: goto L_0x0408;
                case 35: goto L_0x03f8;
                case 36: goto L_0x03e8;
                case 37: goto L_0x0111;
                case 38: goto L_0x00fb;
                case 39: goto L_0x00e6;
                case 40: goto L_0x003d;
                case 41: goto L_0x03af;
                case 42: goto L_0x037d;
                case 43: goto L_0x035d;
                case 44: goto L_0x0339;
                case 45: goto L_0x0320;
                case 46: goto L_0x02fe;
                case 47: goto L_0x02ee;
                case 48: goto L_0x02c0;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r6 = r3.A00
            X.4WT r6 = (X.AnonymousClass4WT) r6
            java.lang.Object r5 = r3.A01
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r4 = r3.A02
            X.0Ua r4 = (X.C05570Ua) r4
            r3 = 1
            X.5ng r2 = r6.A01
            java.lang.Object r1 = r5.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C162457s7.A0K(r1, r0)
            int r0 = X.AnonymousClass001.A0K(r1)
            r2.A00(r0)
            int r1 = r6.A00
            int r0 = r4.A01()
            if (r1 == r0) goto L_0x003c
            r6.A06(r1)
            int r0 = r4.A01()
            r6.A00 = r0
            r5.setSelected(r3)
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r8 = r3.A00
            X.5kg r8 = (X.C112975kg) r8
            java.lang.Object r4 = r3.A01
            java.lang.Object r9 = r3.A02
            java.util.Set r9 = (java.util.Set) r9
            X.66y r0 = r8.A0N
            X.4FS r2 = r0.getWaWorkers()
            r1 = 28
            X.3bw r0 = new X.3bw
            r0.<init>(r8, r1, r4)
            r2.BkP(r0)
            X.4FV r4 = r8.A0e
            X.36Y r6 = r8.A0c
            X.30N r7 = r8.A0f
            X.2hp r5 = r8.A0t
            X.2Yl r3 = r8.A0u
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x003c
            java.util.Iterator r10 = r9.iterator()
            r8 = -1
            r2 = 0
            r11 = r2
            r1 = -1
        L_0x006f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a9
            X.34x r0 = X.C18300x5.A0T(r10)
            if (r1 != r8) goto L_0x007e
            byte r1 = r0.A1I
            r11 = r0
        L_0x007e:
            byte r0 = r0.A1I
            if (r1 == r0) goto L_0x006f
            java.lang.String r0 = "DeleteMessagesDialog/getSampleMessageForMediaType/multi msg type delete"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0087:
            java.util.Iterator r1 = r9.iterator()
            r8 = 0
        L_0x008c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ab
            X.34x r0 = X.C18300x5.A0T(r1)
            if (r8 != 0) goto L_0x009d
            X.2z0 r0 = r0.A1J
            X.4uZ r8 = r0.A00
            goto L_0x008c
        L_0x009d:
            boolean r0 = X.AnonymousClass2z0.A0E(r0, r8)
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "DeleteMessagesDialog/getSampleMessageForMediaType/multi chat jid delete"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x00a9:
            r2 = r11
            goto L_0x0087
        L_0x00ab:
            if (r8 == 0) goto L_0x003c
            X.4rv r1 = new X.4rv
            r1.<init>()
            boolean r0 = X.C627336j.A0K(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            int r0 = r9.size()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r1.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A02 = r0
            java.lang.String r0 = r8.getRawString()
            java.lang.String r0 = r7.A04(r0)
            r1.A04 = r0
            if (r2 == 0) goto L_0x00e2
            int r0 = X.AnonymousClass29K.A01(r6, r2, r5, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
        L_0x00e2:
            r4.BhD(r1)
            return
        L_0x00e6:
            java.lang.Object r0 = r3.A00
            com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts r0 = (com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts) r0
            java.lang.Object r4 = r3.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r3 = r3.A02
            android.view.View r3 = (android.view.View) r3
            r2 = 2
            X.C162457s7.A0J(r3, r2)
            X.4Uk r0 = r0.A00
            if (r0 == 0) goto L_0x003c
            goto L_0x0126
        L_0x00fb:
            java.lang.Object r1 = r3.A00
            com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts r1 = (com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts) r1
            java.lang.Object r4 = r3.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r3 = r3.A02
            android.view.View r3 = (android.view.View) r3
            r0 = 2
            X.C162457s7.A0J(r3, r0)
            X.4Uk r0 = r1.A00
            if (r0 == 0) goto L_0x003c
            r2 = 1
            goto L_0x0126
        L_0x0111:
            java.lang.Object r1 = r3.A00
            com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts r1 = (com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts) r1
            java.lang.Object r4 = r3.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r3 = r3.A02
            android.view.View r3 = (android.view.View) r3
            r0 = 2
            X.C162457s7.A0J(r3, r0)
            X.4Uk r0 = r1.A00
            if (r0 == 0) goto L_0x003c
            r2 = 0
        L_0x0126:
            X.08M r1 = r0.A00
            X.5S7 r0 = new X.5S7
            r0.<init>(r3, r4, r2)
            r1.A0G(r0)
            return
        L_0x0131:
            java.lang.Object r5 = r3.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r3.A01
            X.5rC r1 = (X.C116985rC) r1
            java.lang.Object r4 = r3.A02
            X.4GP r4 = (X.AnonymousClass4GP) r4
            r3 = 1
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x014e
            r1.A04()
            java.lang.String r0 = "getMessageQRActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x014e:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.contactqr.ContactQrActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "scan"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            if (r4 == 0) goto L_0x003c
            r4.invoke()
            return
        L_0x0169:
            java.lang.Object r5 = r3.A00
            X.4WP r5 = (X.AnonymousClass4WP) r5
            java.lang.Object r4 = r3.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            java.lang.Object r1 = r3.A02
            X.4YP r1 = (X.AnonymousClass4YP) r1
            boolean r0 = r4.A0y
            if (r0 == 0) goto L_0x003c
            android.view.View r0 = r1.A00
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131886121(0x7f120029, float:1.9406812E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r5.A00
            X.C18290x4.A1K(r0, r4, r1)
            java.lang.String r0 = r3.getString(r2, r1)
            r6.announceForAccessibility(r0)
            com.whatsapp.contact.picker.SelectedContactsList r0 = r5.A01
            X.66i r0 = r0.A08
            r0.Ayk(r4)
            return
        L_0x019a:
            java.lang.Object r4 = r3.A00
            X.4eX r4 = (X.C89634eX) r4
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r3.A02
            X.5Jl r6 = (X.C102595Jl) r6
            int r0 = r1.size()
            r5 = 0
            r7 = 1
            if (r0 != r7) goto L_0x01c0
            X.3ZH r0 = X.AnonymousClass4L0.A0L(r1, r5)
            java.lang.String r1 = X.AnonymousClass36P.A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003c
            X.C89634eX.A0Y(r4, r1)
            return
        L_0x01c0:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r1.iterator()
        L_0x01c8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01f5
            X.3ZH r2 = X.C18310x6.A0R(r8)
            X.33j r0 = r4.A0N
            java.lang.CharSequence r1 = X.AnonymousClass5ZU.A00(r4, r0, r2)
            java.lang.String r2 = X.AnonymousClass36P.A02(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01c8
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r1 = r1.toString()
            X.5dN r0 = new X.5dN
            r0.<init>(r1, r2)
            r3.add(r0)
            goto L_0x01c8
        L_0x01f5:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x003c
            r2 = 2131890733(0x7f12122d, float:1.9416166E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.whatsapp.TextEmojiLabel r0 = r6.A02
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.AnonymousClass002.A0F(r4, r0, r1, r5, r2)
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r2 = com.whatsapp.contact.picker.PhoneNumberSelectionDialog.A00(r0, r3)
            X.0dc r1 = X.AnonymousClass0x2.A0J(r4)
            java.lang.String r0 = "phone_number_selection_dialog"
            r1.A0C(r2, r0)
            r1.A02()
            return
        L_0x021b:
            java.lang.Object r4 = r3.A00
            X.8ib r4 = (X.C179098ib) r4
            java.lang.Object r0 = r3.A01
            X.4YN r0 = (X.AnonymousClass4YN) r0
            java.lang.Object r1 = r3.A02
            X.3ZL r1 = (X.AnonymousClass3ZL) r1
            com.whatsapp.WaImageView r0 = r0.A00
            android.content.Context r0 = X.C18290x4.A0F(r0)
            java.lang.String r1 = r1.A01
            X.5jL r4 = (X.C112195jL) r4
            r4.A00(r0, r1)
            com.whatsapp.jid.UserJid r2 = r4.A02
            if (r2 == 0) goto L_0x003c
            java.lang.String r0 = "imagine"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x003c
            X.5mB r1 = r4.A04
            X.21N r0 = X.AnonymousClass21N.IMAGINE_CMD_IN_CMD_PICKER_CLICK
            r1.A04(r0, r2)
            return
        L_0x0248:
            java.lang.Object r2 = r3.A00
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            java.lang.Object r5 = r3.A01
            X.84O r5 = (X.AnonymousClass84O) r5
            java.lang.Object r4 = r3.A02
            X.7bI r4 = (X.C153427bI) r4
            boolean r0 = r2.isChecked()
            r1 = r0 ^ 1
            r2.setChecked(r1)
            r0 = 40
            X.48t r3 = r5.A0L(r0)
            if (r3 == 0) goto L_0x003c
            X.7Xj r2 = new X.7Xj
            r2.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0 = 0
            r2.A05(r1, r0)
            X.7jD r0 = r2.A03()
            X.C159377lj.A01(r4, r5, r0, r3)
            return
        L_0x027a:
            java.lang.Object r5 = r3.A00
            X.5ZF r5 = (X.AnonymousClass5ZF) r5
            java.lang.Object r4 = r3.A01
            X.2y5 r4 = (X.C60152y5) r4
            java.lang.Object r7 = r3.A02
            X.33p r7 = (X.AnonymousClass33p) r7
            X.4Rm r0 = r5.A04
            if (r0 == 0) goto L_0x0291
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0291
            return
        L_0x0291:
            X.4Ro r0 = r5.A03
            if (r0 == 0) goto L_0x029c
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x029c
            return
        L_0x029c:
            X.4NX r6 = (X.AnonymousClass4NX) r6
            android.graphics.drawable.Drawable r0 = r6.A03
            if (r0 == 0) goto L_0x003c
            int[] r3 = r6.A07
            if (r3 == 0) goto L_0x003c
            boolean r0 = X.C107425bI.A02(r3)
            if (r0 == 0) goto L_0x0830
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r4.A03(r0)
            java.lang.String r0 = X.C107005aX.A00(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x08d5
            r5.A02(r6)
            return
        L_0x02c0:
            java.lang.Object r4 = r3.A00
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r4 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r4
            java.lang.Object r1 = r3.A01
            X.5ng r1 = (X.C114835ng) r1
            java.lang.Object r3 = r3.A02
            X.7Nx r3 = (X.C149797Nx) r3
            X.7Nx r0 = r1.A04
            int r0 = r0.A02
            int r0 = r0 + 1
            int r0 = r0 % 4
            r1.A00(r0)
            X.4vO r2 = r1.A00
            boolean r0 = r2 instanceof com.whatsapp.mediacomposer.doodle.textentry.TextEntryView
            if (r0 == 0) goto L_0x02ea
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r2 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r2
            com.whatsapp.WaTextView r1 = r2.A03
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r2.A01
            android.graphics.Typeface r0 = r0.getTypeface()
            r1.setTypeface(r0)
        L_0x02ea:
            r4.A03(r3)
            return
        L_0x02ee:
            java.lang.Object r2 = r3.A00
            com.whatsapp.invites.InviteGroupParticipantsActivity r2 = (com.whatsapp.invites.InviteGroupParticipantsActivity) r2
            java.lang.Object r1 = r3.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r3.A02
            X.1fJ r0 = (X.C27991fJ) r0
            r2.A74(r0, r1)
            goto L_0x0359
        L_0x02fe:
            java.lang.Object r0 = r3.A00
            X.4Wb r0 = (X.C87774Wb) r0
            java.lang.Object r1 = r3.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r3 = r3.A02
            X.7Hh r3 = (X.C148177Hh) r3
            android.content.Context r0 = r0.A04
            android.app.Activity r2 = X.C111095hX.A02(r0)
            X.4ea r2 = (X.C89654ea) r2
            com.whatsapp.jid.UserJid r1 = X.C86604Kt.A0d(r1)
            X.1mN r0 = r3.A01
            com.whatsapp.invites.RevokeInviteDialogFragment r0 = com.whatsapp.invites.RevokeInviteDialogFragment.A00(r1, r0)
            r2.Boo(r0)
            return
        L_0x0320:
            java.lang.Object r5 = r3.A00
            X.2Th r5 = (X.C43742Th) r5
            java.lang.Object r4 = r3.A01
            X.1fJ r4 = (X.C27991fJ) r4
            java.lang.Object r0 = r3.A02
            X.1fJ r0 = (X.C27991fJ) r0
            X.4C6 r3 = r5.A09
            r2 = 0
            com.whatsapp.group.SuggestGroupResultHandler$showSnackBar$1$1$1$1 r1 = new com.whatsapp.group.SuggestGroupResultHandler$showSnackBar$1$1$1$1
            r1.<init>(r5, r4, r0, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x0339:
            java.lang.Object r0 = r3.A00
            X.1sn r0 = (X.C33311sn) r0
            java.lang.Object r4 = r3.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r3 = r3.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            com.whatsapp.group.GroupMembersSelector r2 = r0.A00
            X.36r r1 = X.C86664Kz.A1B()
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Intent r0 = X.C86634Kw.A0D(r0, r1, r4)
            r2.startActivity(r0)
            r3.dismiss()
        L_0x0359:
            r2.finish()
            return
        L_0x035d:
            java.lang.Object r2 = r3.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r3.A01
            X.3Lk r1 = (X.C66433Lk) r1
            java.lang.Object r3 = r3.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            java.lang.String r0 = "728928448599090"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r1 = X.C18310x6.A0D(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            r2.startActivity(r1)
            goto L_0x06b1
        L_0x037d:
            java.lang.Object r7 = r3.A00
            X.5g7 r7 = (X.C110365g7) r7
            java.lang.Object r6 = r3.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r3.A02
            java.util.Iterator r4 = r6.iterator()
        L_0x038b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03a2
            X.4uZ r3 = X.C18300x5.A0P(r4)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r7.A0N
            X.2sA r2 = r0.A1n
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A06(r3, r0, r1)
            goto L_0x038b
        L_0x03a2:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r7.A0N
            X.4FS r2 = r0.A2u
            r0 = 40
            X.3aK r1 = new X.3aK
            r1.<init>(r7, r6, r5, r0)
            goto L_0x0502
        L_0x03af:
            java.lang.Object r6 = r3.A00
            X.4ea r6 = (X.C89654ea) r6
            java.lang.Object r1 = r3.A01
            X.5JE r1 = (X.AnonymousClass5JE) r1
            java.lang.Object r5 = r3.A02
            X.4uY r5 = (X.C95804uY) r5
            r4 = 1
            X.8qC r0 = r1.A02
            java.lang.Object r3 = X.C18300x5.A0b(r0)
            X.2eH r3 = (X.C48062eH) r3
            X.5m4 r0 = r1.A01
            X.08M r2 = r0.A00
            r1 = 2
            X.921 r0 = new X.921
            r0.<init>(r5, r1)
            X.0Wx r0 = X.C05110Rz.A00(r0, r2)
            java.lang.Object r0 = r0.A07()
            X.5Rp r0 = (X.C104595Rp) r0
            r1 = 0
            if (r0 == 0) goto L_0x03e4
            X.1RL r0 = r0.A00
            boolean r0 = r0.A0K()
            if (r0 != r4) goto L_0x03e4
            r1 = 1
        L_0x03e4:
            X.C106265Yg.A00(r6, r3, r5, r1)
            return
        L_0x03e8:
            java.lang.Object r2 = r3.A00
            X.1Pd r2 = (X.C22681Pd) r2
            java.lang.Object r1 = r3.A01
            X.1mX r1 = (X.C30491mX) r1
            java.lang.Object r0 = r3.A02
            android.content.Context r0 = (android.content.Context) r0
            X.C22681Pd.A00(r0, r2, r1)
            return
        L_0x03f8:
            java.lang.Object r2 = r3.A00
            X.4my r2 = (X.C92614my) r2
            java.lang.Object r1 = r3.A01
            X.1RL r1 = (X.AnonymousClass1RL) r1
            java.lang.Object r0 = r3.A02
            android.content.Intent r0 = (android.content.Intent) r0
            X.C92614my.setupShareToMyStatusButton$lambda$3(r2, r1, r0, r6)
            return
        L_0x0408:
            java.lang.Object r2 = r3.A00
            X.1mO r2 = (X.C30401mO) r2
            java.lang.Object r1 = r3.A01
            X.1Pe r1 = (X.C22691Pe) r1
            java.lang.Object r0 = r3.A02
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            X.C22691Pe.A01(r2, r1, r0)
            return
        L_0x0418:
            java.lang.Object r5 = r3.A00
            X.4fR r5 = (X.C89884fR) r5
            java.lang.Object r4 = r3.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r2 = r3.A02
            android.os.Bundle r2 = (android.os.Bundle) r2
            X.3ZH r0 = r5.A0L
            X.4uZ r1 = r0.A0H
            boolean r0 = r5.A0R
            r0 = r0 ^ 1
            android.content.Intent r0 = X.C627736r.A0f(r4, r1, r0)
            X.AnonymousClass0RN.A00(r4, r0, r2)
            return
        L_0x0434:
            java.lang.Object r2 = r3.A00
            X.4mB r2 = (X.C92154mB) r2
            java.lang.Object r1 = r3.A01
            X.03q r1 = (X.C003203q) r1
            java.lang.Object r0 = r3.A02
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            com.whatsapp.jid.Jid r5 = X.AnonymousClass3ZH.A04(r0)
            X.1fJ r5 = (X.C27991fJ) r5
            if (r5 != 0) goto L_0x044e
            java.lang.String r0 = "GroupConversationTitle/null parent switch"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x044e:
            X.67D r4 = r2.A0E
            X.0df r3 = r1.getSupportFragmentManager()
            com.whatsapp.community.CommunitySubgroupsBottomSheet r2 = new com.whatsapp.community.CommunitySubgroupsBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "extra_community_jid"
            X.C86604Kt.A18(r1, r2, r5, r0)
            r1 = 12
            X.91H r0 = new X.91H
            r0.<init>(r2, r1)
            r4.BpH(r3, r5, r0)
            return
        L_0x046d:
            java.lang.Object r0 = r3.A00
            X.1ip r0 = (X.C29441ip) r0
            java.lang.Object r1 = r3.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r3 = r3.A02
            X.3Wi r3 = (X.C69263Wi) r3
            r2 = 0
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0626
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r2 = r1.getPackageName()
            goto L_0x061d
        L_0x048a:
            java.lang.Object r5 = r3.A00
            X.4eX r5 = (X.C89634eX) r5
            java.lang.Object r4 = r3.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            java.lang.Object r2 = r3.A02
            X.5QN r2 = (X.AnonymousClass5QN) r2
            boolean r0 = r5.A7b(r4)
            if (r0 == 0) goto L_0x04a4
            boolean r0 = r4.A0y
            if (r0 != 0) goto L_0x04a4
            r5.A7Q(r4)
            return
        L_0x04a4:
            boolean r0 = r5.A7b(r4)
            if (r0 == 0) goto L_0x04b9
            boolean r0 = r4.A0y
            if (r0 == 0) goto L_0x04b9
            r0 = 2131894311(0x7f122027, float:1.9423423E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 1
            r2.A00(r1, r0)
        L_0x04b9:
            r5.Ayk(r4)
            return
        L_0x04bd:
            java.lang.Object r2 = r3.A00
            X.4lo r2 = (X.C91924lo) r2
            java.lang.Object r1 = r3.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r0 = r3.A02
            X.6hC r0 = (X.C133346hC) r0
            com.whatsapp.contact.picker.ContactPickerFragment r2 = r2.A05
            java.lang.String r1 = r1.A0J()
            java.util.List r0 = r0.A00
            r2.A1y(r1, r0)
            return
        L_0x04d5:
            java.lang.Object r2 = r3.A00
            com.whatsapp.companiondevice.SetDeviceNicknameFragment r2 = (com.whatsapp.companiondevice.SetDeviceNicknameFragment) r2
            java.lang.Object r5 = r3.A01
            java.lang.Object r1 = r3.A02
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            X.66R r0 = r2.A06
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel r4 = (com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel) r4
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L_0x04f7
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L_0x04f9
        L_0x04f7:
            java.lang.String r3 = ""
        L_0x04f9:
            X.4FS r2 = r4.A02
            r0 = 30
            X.5sN r1 = new X.5sN
            r1.<init>(r4, r5, r3, r0)
        L_0x0502:
            r2.BkM(r1)
            return
        L_0x0506:
            java.lang.Object r0 = r3.A00
            X.4Yr r0 = (X.C88424Yr) r0
            java.lang.Object r5 = r3.A01
            X.3ZF r5 = (X.AnonymousClass3ZF) r5
            java.lang.Object r4 = r3.A02
            X.5jk r4 = (X.C112445jk) r4
            X.7D5 r0 = r0.A06
            goto L_0x0543
        L_0x0515:
            java.lang.Object r0 = r3.A00
            X.4Yi r0 = (X.C88334Yi) r0
            java.lang.Object r5 = r3.A01
            X.3ZF r5 = (X.AnonymousClass3ZF) r5
            java.lang.Object r4 = r3.A02
            X.5jk r4 = (X.C112445jk) r4
            X.7D5 r0 = r0.A04
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r6 = r0.A00
            X.03q r3 = r6.A0Q()
            if (r3 == 0) goto L_0x056d
            int r1 = r5.A0H
            r0 = 2
            boolean r2 = X.AnonymousClass000.A1U(r1, r0)
            X.66r r1 = r6.A0H
            goto L_0x055f
        L_0x0535:
            java.lang.Object r0 = r3.A00
            X.4Yi r0 = (X.C88334Yi) r0
            java.lang.Object r5 = r3.A01
            X.3ZF r5 = (X.AnonymousClass3ZF) r5
            java.lang.Object r4 = r3.A02
            X.5jk r4 = (X.C112445jk) r4
            X.7D5 r0 = r0.A04
        L_0x0543:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r6 = r0.A00
            X.03q r3 = r6.A0Q()
            if (r3 == 0) goto L_0x056d
            int r1 = r5.A0H
            r2 = 1
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.66r r1 = r6.A0H
            if (r0 == 0) goto L_0x056b
            X.1VX r0 = r6.A0Y
            boolean r0 = X.C627436k.A0J(r0)
            if (r0 != 0) goto L_0x056b
        L_0x055f:
            r0 = 3
            r1.BJS(r3, r5, r0, r2)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r6.A0G
            boolean r0 = r5.A0L
            r1.A0K(r4, r0)
            return
        L_0x056b:
            r2 = 0
            goto L_0x055f
        L_0x056d:
            java.lang.String r0 = "voip/CallsFragment no activity registered to join ongoing call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0573:
            java.lang.Object r0 = r3.A00
            X.4Yl r0 = (X.C88364Yl) r0
            java.lang.Object r4 = r3.A01
            X.8FY r4 = (X.AnonymousClass8FY) r4
            java.lang.Object r2 = r3.A02
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            X.5MP r1 = r0.A04
            r0 = 1
            goto L_0x0592
        L_0x0583:
            java.lang.Object r0 = r3.A00
            X.4Yl r0 = (X.C88364Yl) r0
            java.lang.Object r4 = r3.A01
            X.8FY r4 = (X.AnonymousClass8FY) r4
            java.lang.Object r2 = r3.A02
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            X.5MP r1 = r0.A04
            r0 = 0
        L_0x0592:
            r1.A00(r4, r2, r0)
            return
        L_0x0596:
            java.lang.Object r2 = r3.A00
            X.2sp r2 = (X.C56952sp) r2
            java.lang.Object r1 = r3.A01
            X.8qC r1 = (X.C183538qC) r1
            java.lang.Object r3 = r3.A02
            android.view.View r3 = (android.view.View) r3
            r0 = 3
            X.C162457s7.A0J(r6, r0)
            r0 = 5370(0x14fa, float:7.525E-42)
            int r0 = r2.A0N(r0)
            if (r0 <= 0) goto L_0x05c3
            r0 = 5757(0x167d, float:8.067E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x05c3
            java.lang.Object r2 = r1.get()
            X.32x r2 = (X.C619532x) r2
            X.3dI r1 = r2.A02
            r0 = 18
            X.C86624Kv.A1K(r1, r2, r0)
        L_0x05c3:
            android.content.Context r2 = r3.getContext()
            android.content.Context r1 = r6.getContext()
            r0 = 16
            android.content.Intent r0 = X.C86624Kv.A07(r1, r0)
            r2.startActivity(r0)
            return
        L_0x05d5:
            java.lang.Object r0 = r3.A00
            X.4Yf r0 = (X.C88304Yf) r0
            java.lang.Object r4 = r3.A01
            X.8FX r4 = (X.AnonymousClass8FX) r4
            java.lang.Object r2 = r3.A02
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            r1 = 1
            goto L_0x05f0
        L_0x05e3:
            java.lang.Object r0 = r3.A00
            X.4Yf r0 = (X.C88304Yf) r0
            java.lang.Object r4 = r3.A01
            X.8FX r4 = (X.AnonymousClass8FX) r4
            java.lang.Object r2 = r3.A02
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            r1 = 0
        L_0x05f0:
            X.5MP r0 = r0.A00
            r0.A00(r4, r2, r1)
            return
        L_0x05f6:
            java.lang.Object r4 = r3.A00
            X.1ip r4 = (X.C29441ip) r4
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r3.A02
            X.3Wi r3 = (X.C69263Wi) r3
            r2 = 0
            r0 = 3
            X.C162457s7.A0J(r6, r0)
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x0626
            android.content.Context r1 = r1.getContext()
            android.content.Context r0 = r6.getContext()
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r2 = r0.getPackageName()
        L_0x061d:
            java.lang.String r0 = "com.whatsapp.calling.calllink.view.CallLinkActivity"
            r3.setClassName(r2, r0)
            r1.startActivity(r3)
            return
        L_0x0626:
            r0 = 2131887259(0x7f12049b, float:1.940912E38)
            r3.A0H(r0, r2)
            return
        L_0x062d:
            java.lang.Object r4 = r3.A00
            X.4XB r4 = (X.AnonymousClass4XB) r4
            java.lang.Object r1 = r3.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r0 = r3.A02
            X.4Ya r0 = (X.C88254Ya) r0
            r2 = 0
            X.4uZ r1 = X.AnonymousClass3ZH.A01(r1)
            android.widget.ImageView r0 = r0.A02
            X.5XB r1 = X.AnonymousClass5XB.A00(r0, r1, r2)
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = r4.A01
            r1.A02(r0)
            return
        L_0x064a:
            java.lang.Object r4 = r3.A01
            X.5dh r4 = (X.C108875dh) r4
            java.lang.Object r3 = r3.A02
            X.4GQ r3 = (X.AnonymousClass4GQ) r3
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            X.5dL r1 = r4.A04
            boolean r0 = r1 instanceof X.C90854iV
            if (r0 == 0) goto L_0x0670
            X.4iV r1 = (X.C90854iV) r1
            X.5QC r0 = r1.A00
            X.4vz r0 = r0.A00
            X.5NA r0 = r0.A04
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass5NA.A00(r0)
            java.lang.String r1 = "nux_seen_count"
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.C18270x1.A0h(r2, r1, r0)
        L_0x0670:
            r3.invoke(r4)
            return
        L_0x0674:
            java.lang.Object r5 = r3.A00
            X.1go r5 = (X.C28401go) r5
            java.lang.Object r4 = r3.A01
            X.2et r4 = (X.C48432et) r4
            java.lang.Object r2 = r3.A02
            androidx.appcompat.widget.AppCompatCheckBox r1 = r5.A00
            boolean r0 = r1.isChecked()
            r4.A00 = r0
            boolean r1 = r1.isChecked()
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = r5.A01
            X.103 r0 = r0.A03
            java.util.Set r0 = r0.A03
            if (r1 == 0) goto L_0x0696
            r0.add(r2)
            return
        L_0x0696:
            r0.remove(r2)
            return
        L_0x069a:
            java.lang.Object r2 = r3.A00
            X.5cT r2 = (X.C108135cT) r2
            java.lang.Object r0 = r3.A01
            X.8nf r0 = (X.C181978nf) r0
            java.lang.Object r3 = r3.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            r0.BVn()
            r1 = 1
            r2.A0D = r1
            X.4w0 r0 = r2.A0J
            r0.A02(r1)
        L_0x06b1:
            r3.dismiss()
            return
        L_0x06b5:
            java.lang.Object r7 = r3.A00
            X.5UV r7 = (X.AnonymousClass5UV) r7
            java.lang.Object r6 = r3.A01
            X.4wK r6 = (X.C96414wK) r6
            java.lang.Object r5 = r3.A02
            android.view.View r5 = (android.view.View) r5
            X.5e1 r4 = r6.A0B
            X.8nm r3 = r6.A09
            X.8vB r2 = r6.A0A
            X.5U9 r1 = r7.A0P
            java.lang.String r0 = r4.A0F
            r1.A02(r5, r3, r2, r0)
            X.8rU r5 = r6.A08
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0717
            boolean r1 = r4.A0P
            boolean r0 = r4.A0R
            if (r1 == 0) goto L_0x06df
            r1 = 0
            if (r0 == 0) goto L_0x0703
            r1 = 5
            goto L_0x0703
        L_0x06df:
            if (r0 == 0) goto L_0x0717
            r1 = 4
            goto L_0x0703
        L_0x06e3:
            java.lang.Object r7 = r3.A00
            X.5UV r7 = (X.AnonymousClass5UV) r7
            java.lang.Object r6 = r3.A01
            X.4wK r6 = (X.C96414wK) r6
            java.lang.Object r4 = r3.A02
            android.view.View r4 = (android.view.View) r4
            X.5e1 r0 = r6.A0B
            X.8nm r3 = r6.A09
            X.8vB r2 = r6.A0A
            X.5U9 r1 = r7.A0P
            java.lang.String r0 = r0.A0F
            r1.A02(r4, r3, r2, r0)
            X.8rU r5 = r6.A08
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0717
            r1 = 2
        L_0x0703:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x0707:
            java.lang.Integer r2 = r7.A01(r6)
            java.lang.Integer r1 = r7.A03(r6)
            java.lang.Integer r0 = r7.A02(r6)
            r5.BYw(r3, r2, r1, r0)
            return
        L_0x0717:
            r3 = 0
            goto L_0x0707
        L_0x0719:
            java.lang.Object r4 = r3.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r0 = r3.A01
            X.2i5 r0 = (X.C50382i5) r0
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r3.queryIntentActivities(r1, r0)
            if (r0 == 0) goto L_0x0741
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0741
            r4.startActivity(r1)
        L_0x0741:
            r4.finish()
            return
        L_0x0745:
            java.lang.Object r5 = r3.A00
            X.84O r5 = (X.AnonymousClass84O) r5
            java.lang.Object r4 = r3.A01
            X.48t r4 = (X.C835248t) r4
            java.lang.Object r2 = r3.A02
            X.7bI r2 = (X.C153427bI) r2
            X.7Xj r1 = new X.7Xj
            r1.<init>()
            r0 = 0
            r1.A05(r5, r0)
            X.7jD r0 = r1.A03()
            X.C159377lj.A01(r2, r5, r0, r4)
            return
        L_0x0762:
            java.lang.Object r4 = r3.A00
            X.3CP r4 = (X.AnonymousClass3CP) r4
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = r3.A02
            android.net.Uri r2 = (android.net.Uri) r2
            android.content.Context r1 = X.C18290x4.A0F(r0)
            r0 = 2
            r4.A01(r0)
            r4.A00()
            android.content.Intent r0 = X.C18310x6.A0D(r2)     // Catch:{ all -> 0x0781 }
            r1.startActivity(r0)     // Catch:{ all -> 0x0781 }
            return
        L_0x0781:
            r0 = move-exception
            X.C57682u2.A00(r0)
            return
        L_0x0786:
            java.lang.Object r4 = r3.A00
            X.5hl r4 = (X.C111235hl) r4
            java.lang.Object r2 = r3.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r3.A02
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 2
            r4.A00(r0)
            r2.startActivity(r1)
            X.33p r0 = r4.A04
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "should_show_smb_enforcement_banner"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x07a6:
            java.lang.Object r4 = r3.A00
            X.5ZF r4 = (X.AnonymousClass5ZF) r4
            java.lang.Object r0 = r3.A01
            X.33j r0 = (X.C620733j) r0
            java.lang.Object r3 = r3.A02
            X.5X5 r3 = (X.AnonymousClass5X5) r3
            boolean r0 = X.C620733j.A04(r0)
            r2 = 1
            if (r0 == 0) goto L_0x07c1
            int r1 = r3.A02
        L_0x07bb:
            androidx.viewpager.widget.ViewPager r0 = r4.A0K
            r0.A0F(r1, r2)
            return
        L_0x07c1:
            X.4OW[] r0 = r4.A0T
            int r1 = r0.length
            int r1 = r1 - r2
            int r0 = r3.A02
            int r1 = r1 - r0
            goto L_0x07bb
        L_0x07c9:
            java.lang.Object r5 = r3.A00
            X.5ZF r5 = (X.AnonymousClass5ZF) r5
            java.lang.Object r1 = r3.A01
            int[] r1 = (int[]) r1
            java.lang.Object r4 = r3.A02
            X.4NX r4 = (X.AnonymousClass4NX) r4
            r5.A04(r1)
            X.2y5 r0 = r5.A0R
            X.C107005aX.A03(r0, r1)
            r4.setEmoji(r1)
            X.4qr r0 = new X.4qr
            r0.<init>(r1)
            long r10 = X.C86664Kz.A0N(r0)
            X.5Y0 r6 = r5.A0P
            android.content.Context r0 = r5.A09
            android.content.res.Resources r7 = r0.getResources()
            X.4qr r8 = new X.4qr
            r8.<init>(r1)
            r9 = 1061158912(0x3f400000, float:0.75)
            android.graphics.drawable.Drawable r3 = r6.A04(r7, r8, r9, r10)
            long r1 = r4.A01
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0807
            r4.A03 = r3
            r4.invalidate()
        L_0x0807:
            android.view.View r1 = r5.A0D
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x080f:
            java.lang.Object r5 = r3.A01
            X.84O r5 = (X.AnonymousClass84O) r5
            java.lang.Object r4 = r3.A02
            X.48t r4 = (X.C835248t) r4
            X.7Xj r2 = new X.7Xj
            r2.<init>()
            r0 = 0
            r2.A05(r5, r0)
            r0 = 1
            java.lang.Object r1 = r3.A00
            X.7bI r1 = (X.C153427bI) r1
            r2.A05(r1, r0)
            X.7jD r0 = r2.A03()
            X.C159377lj.A01(r1, r5, r0, r4)
            return
        L_0x0830:
            boolean r0 = X.C107425bI.A03(r3)
            if (r0 == 0) goto L_0x08d8
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r7)
            java.lang.String r2 = "skin_emoji_tip"
            int r1 = X.C18280x3.A02(r0, r2)
            r0 = 1
            if (r1 >= r0) goto L_0x08bd
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r7)
            X.C18270x1.A0h(r0, r2, r1)
            int[] r9 = r6.A07
            android.view.View r8 = r5.A0D
            r0 = 2131427695(0x7f0b016f, float:1.8477014E38)
            android.view.ViewGroup r14 = X.C86644Kx.A0J(r8, r0)
            r14.removeAllViews()
            android.content.Context r10 = r5.A09
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166390(0x7f0704b6, float:1.7947024E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166388(0x7f0704b4, float:1.794702E38)
            int r0 = X.C86664Kz.A09(r1, r0, r13)
            int r12 = r0 / 2
            int[][] r11 = X.C107425bI.A0A(r9)
            int r7 = r11.length
            r4 = 0
            r3 = 0
        L_0x087b:
            if (r3 >= r7) goto L_0x08a1
            r2 = r11[r3]
            android.widget.ImageView r1 = X.C86614Ku.A0H(r8)
            r1.setPadding(r12, r12, r12, r12)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            X.C86624Kv.A0t(r1, r13)
            X.5Y0 r15 = r5.A0P
            android.content.res.Resources r0 = r10.getResources()
            X.AnonymousClass5Y0.A00(r0, r1, r15, r2)
            r0 = 1
            A00(r1, r5, r2, r6, r0)
            r14.addView(r1)
            int r3 = r3 + 1
            goto L_0x087b
        L_0x08a1:
            r0 = 2131433208(0x7f0b16f8, float:1.8488195E38)
            android.widget.ImageView r2 = X.AnonymousClass0x9.A0F(r8, r0)
            r2.setPadding(r12, r12, r12, r12)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r0)
            X.5Y0 r1 = r5.A0P
            android.content.res.Resources r0 = r10.getResources()
            X.AnonymousClass5Y0.A00(r0, r2, r1, r9)
            r8.setVisibility(r4)
            return
        L_0x08bd:
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r4.A03(r0)
            java.lang.String r0 = X.C107005aX.A01(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x08d1
            r5.A03(r6)
            return
        L_0x08d1:
            X.C107005aX.A03(r4, r3)
            goto L_0x08d8
        L_0x08d5:
            X.C107005aX.A02(r4, r3)
        L_0x08d8:
            r5.A04(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109725f5.onClick(android.view.View):void");
    }

    public C109725f5(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
