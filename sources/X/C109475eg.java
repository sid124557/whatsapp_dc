package X;

import android.view.View;

/* renamed from: X.5eg  reason: invalid class name and case insensitive filesystem */
public class C109475eg implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C109475eg(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C109475eg(obj, i, obj2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v227, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v230, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v231, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v232, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0327, code lost:
        r0.BPA(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x032a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x049d, code lost:
        X.C86614Ku.A14(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05aa, code lost:
        if (r2 != 3) goto L_0x05ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05f6, code lost:
        r4.onClick(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06d8, code lost:
        r2.BkM(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1.A00(r0.getContext(), r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x0698;
                case 1: goto L_0x063c;
                case 2: goto L_0x01ff;
                case 3: goto L_0x061a;
                case 4: goto L_0x0606;
                case 5: goto L_0x05fa;
                case 6: goto L_0x05fa;
                case 7: goto L_0x01ca;
                case 8: goto L_0x01ca;
                case 9: goto L_0x05e3;
                case 10: goto L_0x05cf;
                case 11: goto L_0x0594;
                case 12: goto L_0x057c;
                case 13: goto L_0x01a7;
                case 14: goto L_0x0518;
                case 15: goto L_0x050c;
                case 16: goto L_0x0500;
                case 17: goto L_0x04f4;
                case 18: goto L_0x04e8;
                case 19: goto L_0x04a1;
                case 20: goto L_0x046b;
                case 21: goto L_0x042f;
                case 22: goto L_0x0403;
                case 23: goto L_0x0173;
                case 24: goto L_0x0152;
                case 25: goto L_0x03f7;
                case 26: goto L_0x03dd;
                case 27: goto L_0x03d1;
                case 28: goto L_0x0146;
                case 29: goto L_0x0005;
                case 30: goto L_0x0005;
                case 31: goto L_0x03c3;
                case 32: goto L_0x03a9;
                case 33: goto L_0x010d;
                case 34: goto L_0x00f2;
                case 35: goto L_0x00c6;
                case 36: goto L_0x0398;
                case 37: goto L_0x038f;
                case 38: goto L_0x0386;
                case 39: goto L_0x037d;
                case 40: goto L_0x033c;
                case 41: goto L_0x032b;
                case 42: goto L_0x031d;
                case 43: goto L_0x00a2;
                case 44: goto L_0x0312;
                case 45: goto L_0x02df;
                case 46: goto L_0x007d;
                case 47: goto L_0x02cf;
                case 48: goto L_0x004a;
                case 49: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = (com.whatsapp.conversation.conversationrow.InteractiveMessageView) r0
            java.lang.Object r2 = r11.A01
            X.34x r2 = (X.C624134x) r2
            X.5PN r1 = r0.A0B
        L_0x000f:
            android.content.Context r0 = r0.getContext()
            r1.A00(r0, r2)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r11.A00
            X.8iv r0 = (X.C179298iv) r0
            java.lang.Object r3 = r11.A01
            X.6hj r3 = (X.C133656hj) r3
            X.8GI r0 = (X.AnonymousClass8GI) r0
            X.5RH r2 = r0.A00
            X.4UA r0 = r2.A0N
            X.3Ls r1 = r0.A01
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1 instanceof X.AnonymousClass1Hk
            if (r0 == 0) goto L_0x0016
            X.1Hk r1 = (X.AnonymousClass1Hk) r1
            X.5MV r0 = r2.A07
            X.2ez r3 = r3.A00
            r0.A00(r1, r3)
            X.4uZ r0 = r2.A0A
            if (r0 == 0) goto L_0x0016
            X.5Py r2 = r2.A0P
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r3.A01
            boolean r0 = X.C18320x8.A1U(r0)
            r2.A01(r1, r0)
            return
        L_0x004a:
            java.lang.Object r3 = r11.A00
            X.5RH r3 = (X.AnonymousClass5RH) r3
            java.lang.Object r7 = r11.A01
            X.2TX r7 = (X.AnonymousClass2TX) r7
            X.4uZ r0 = r3.A0A
            if (r0 == 0) goto L_0x0016
            X.5Py r5 = r3.A0P
            java.lang.String r2 = r0.getRawString()
            r1 = 2
            r0 = 1
            r5.A00(r1, r2, r0)
            X.2Fm r6 = new X.2Fm
            r6.<init>(r3)
            android.app.Activity r1 = r3.A0I
            X.4uZ r8 = r3.A0A
            X.5Zz r9 = r3.A0S
            X.2s4 r2 = r3.A0L
            X.2rN r10 = r3.A0T
            X.5Wq r4 = r3.A0O
            X.2e0 r3 = r3.A0M
            X.15W r0 = new X.15W
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.show()
            return
        L_0x007d:
            java.lang.Object r5 = r11.A00
            X.5g7 r5 = (X.C110365g7) r5
            java.lang.Object r0 = r11.A01
            java.util.Iterator r4 = X.C18320x8.A0q(r0)
        L_0x0087:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            X.4uZ r3 = X.C18300x5.A0P(r4)
            boolean r0 = r3 instanceof X.C28001fK
            if (r0 != 0) goto L_0x0087
            com.whatsapp.conversationslist.ConversationsFragment r0 = r5.A0N
            X.2sA r2 = r0.A1n
            java.lang.Integer r1 = X.C18290x4.A0Z()
            r0 = 1
            r2.A06(r3, r1, r0)
            goto L_0x0087
        L_0x00a2:
            java.lang.Object r4 = r11.A00
            X.4px r4 = (X.C94134px) r4
            java.lang.Object r3 = r11.A01
            X.4uZ r3 = (X.C95814uZ) r3
            X.66t r2 = r4.A0E
            com.whatsapp.conversationslist.ViewHolder r1 = r4.A08
            int r0 = r4.A05
            r2.BP6(r1, r3, r0)
            android.view.View r3 = r1.A07
            java.lang.Runnable r2 = r4.A0T
            r3.removeCallbacks(r2)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0016
            r0 = 20
            r3.postDelayed(r2, r0)
            return
        L_0x00c6:
            java.lang.Object r0 = r11.A00
            X.5IT r0 = (X.AnonymousClass5IT) r0
            java.lang.Object r1 = r11.A01
            X.7Dl r1 = (X.C147267Dl) r1
            java.lang.ref.WeakReference r0 = r0.A02
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0016
            X.5l7 r4 = r1.A00
            X.4uZ r3 = r4.A4J
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            com.whatsapp.dialogs.DeleteOrArchiveChatDialog r2 = new com.whatsapp.dialogs.DeleteOrArchiveChatDialog
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "arg_chat_jid"
            X.C86604Kt.A18(r1, r2, r3, r0)
            X.676 r0 = r4.A2z
            r0.Boo(r2)
            return
        L_0x00f2:
            java.lang.Object r1 = r11.A00
            X.5IT r1 = (X.AnonymousClass5IT) r1
            java.lang.Object r4 = r11.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            r3 = 0
            java.lang.ref.WeakReference r0 = r1.A02
            java.lang.Object r2 = r0.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0016
            X.2sq r1 = r1.A01
            java.lang.String r0 = "chat"
            r1.A0F(r2, r4, r0, r3)
            return
        L_0x010d:
            java.lang.Object r8 = r11.A00
            X.34x r8 = (X.C624134x) r8
            java.lang.Object r7 = r11.A01
            X.573 r7 = (X.AnonymousClass573) r7
            r6 = 1
            r0 = r8
            X.1p0 r0 = (X.C31881p0) r0
            r5 = 2
            com.whatsapp.jid.GroupJid r4 = r0.A1x(r5)
            com.whatsapp.jid.GroupJid r3 = r0.A1x(r6)
            X.1fJ r2 = X.AnonymousClass34R.A01(r3)
            if (r2 == 0) goto L_0x0131
            X.4FS r1 = r7.getWaWorkers()
            r0 = 27
            X.C70333aK.A00(r1, r7, r8, r2, r0)
        L_0x0131:
            if (r3 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x0016
            android.app.Activity r2 = X.C86614Ku.A0A(r7)
            X.4ea r2 = (X.C89654ea) r2
            if (r2 == 0) goto L_0x0016
            com.whatsapp.community.JoinGroupBottomSheetFragment r1 = com.whatsapp.community.JoinGroupBottomSheetFragment.A00(r3, r4, r6, r5)
            r0 = 0
            r2.Bon(r1, r0)
            return
        L_0x0146:
            java.lang.Object r0 = r11.A00
            com.whatsapp.conversation.conversationrow.InteractiveMessageButton r0 = (com.whatsapp.conversation.conversationrow.InteractiveMessageButton) r0
            java.lang.Object r2 = r11.A01
            X.34x r2 = (X.C624134x) r2
            X.5PN r1 = r0.A03
            goto L_0x000f
        L_0x0152:
            java.lang.Object r5 = r11.A00
            X.4oJ r5 = (X.C93314oJ) r5
            java.lang.Object r4 = r11.A01
            X.34x r4 = (X.C624134x) r4
            X.2z0 r0 = r4.A1J
            X.4uZ r0 = r0.A00
            if (r0 == 0) goto L_0x0016
            X.1fJ r3 = X.AnonymousClass34R.A01(r0)
            if (r3 == 0) goto L_0x0016
            X.4FS r2 = r5.A25
            r1 = 19
            X.3aK r0 = new X.3aK
            r0.<init>(r5, r4, r3, r1)
            r2.BkP(r0)
            return
        L_0x0173:
            java.lang.Object r2 = r11.A00
            X.4mv r2 = (X.C92584mv) r2
            java.lang.Object r4 = r11.A01
            android.content.Context r4 = (android.content.Context) r4
            X.1VX r1 = r2.A0O
            r0 = 1948(0x79c, float:2.73E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0016
            com.whatsapp.WaTextView r0 = r2.A0A
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0016
            X.34x r3 = r2.getFMessage()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.polls.PollResultsActivity"
            r2.setClassName(r1, r0)
            X.2z0 r0 = r3.A1J
            X.C107395bF.A00(r2, r0)
            r4.startActivity(r2)
            return
        L_0x01a7:
            java.lang.Object r3 = r11.A00
            X.4oJ r3 = (X.C93314oJ) r3
            java.lang.Object r1 = r11.A01
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0016
            r1.size()
            X.5rC r1 = r3.A0U
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x06a4
            r1.A04()
            java.lang.String r0 = "logEntryPointTap"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x01ca:
            java.lang.Object r6 = r11.A00
            X.4oK r6 = (X.C93324oK) r6
            java.lang.Object r0 = r11.A01
            X.34x r0 = (X.C624134x) r0
            X.2kg r0 = r0.A0s()
            if (r0 == 0) goto L_0x0016
            com.whatsapp.jid.UserJid r5 = r0.A01
            X.1VX r1 = r6.A0O
            r0 = 5431(0x1537, float:7.61E-42)
            boolean r0 = r1.A0X(r0)
            r4 = 0
            if (r0 == 0) goto L_0x01fd
            r0 = 25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x01eb:
            android.content.Context r2 = r6.getContext()
            r1 = 0
            r0 = 1
            android.content.Intent r1 = X.C627736r.A0l(r2, r5, r3, r0, r1)
            android.content.Context r0 = r6.getContext()
            X.AnonymousClass0RN.A00(r0, r1, r4)
            return
        L_0x01fd:
            r3 = r4
            goto L_0x01eb
        L_0x01ff:
            java.lang.Object r3 = r11.A00
            X.4mJ r3 = (X.C92234mJ) r3
            java.lang.Object r4 = r11.A01
            X.34x r4 = (X.C624134x) r4
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r5 = r3.A07
            java.util.LinkedHashMap r8 = r5.A07
            int r9 = r8.size()
            X.36Y r2 = r3.A05
            X.2hp r1 = r3.A0B
            X.2Yl r0 = r3.A0C
            int r7 = X.AnonymousClass29K.A01(r2, r4, r1, r0)
            X.5W5 r3 = r3.A08
            X.4sD r2 = new X.4sD
            r2.<init>()
            java.lang.Integer r6 = X.AnonymousClass001.A0f()
            r2.A04 = r6
            X.2z0 r0 = r4.A1J
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x026a
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x02ca
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A00 = r0
            X.2sj r4 = r3.A00
            java.util.Set r0 = r4.A04(r1)
            int r0 = r0.size()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A05 = r0
            X.1fJ r1 = X.AnonymousClass34R.A01(r1)
            if (r1 == 0) goto L_0x026a
            X.2rN r0 = r3.A02
            int r0 = r0.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            boolean r0 = r4.A0C(r1)
            if (r0 == 0) goto L_0x026a
            boolean r0 = r4.A0D(r1)
            if (r0 != 0) goto L_0x0268
            java.lang.Integer r6 = X.C18280x3.A0S()
        L_0x0268:
            r2.A01 = r6
        L_0x026a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A03 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r9)
            r2.A06 = r0
            X.4FV r1 = r3.A01
            X.5ZC r0 = X.AnonymousClass5W5.A03
            r1.BhC(r2, r0)
            X.107 r6 = r5.A05
            java.lang.Object r0 = r6.A07()
            X.5Rr r0 = (X.C104615Rr) r0
            int r7 = r0.A01
            java.lang.Object r0 = r6.A07()
            X.5Rr r0 = (X.C104615Rr) r0
            int r2 = r0.A00
            X.08M r3 = r5.A01
            java.lang.Object r1 = r3.A07()
            if (r1 == 0) goto L_0x029c
            X.4UC r0 = r5.A06
            r0.A0H(r1)
        L_0x029c:
            r0 = 1
            if (r7 <= r0) goto L_0x0016
            int r1 = r2 + 1
            int r1 = r1 % r7
            X.5Rr r4 = new X.5Rr
            r4.<init>(r7, r1)
            java.util.List r0 = X.C73793g5.A06(r8)
            java.lang.Object r0 = X.C73723fy.A06(r0, r1)
            X.3Z6 r0 = (X.AnonymousClass3Z6) r0
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r2 = r0.second
        L_0x02b5:
            java.lang.Runnable r1 = r5.A00
            if (r1 == 0) goto L_0x06dc
            X.3Wi r0 = r5.A02
            r0.A0R(r1)
            r0 = 0
            r5.A00 = r0
            r6.A0I(r4)
            X.AnonymousClass5YS.A00(r3, r2)
            return
        L_0x02c8:
            r2 = 0
            goto L_0x02b5
        L_0x02ca:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A00 = r0
            goto L_0x026a
        L_0x02cf:
            java.lang.Object r0 = r11.A00
            X.4pv r0 = (X.C94114pv) r0
            java.lang.Object r2 = r11.A01
            X.34x r2 = (X.C624134x) r2
            X.66t r1 = r0.A04
            com.whatsapp.conversationslist.ViewHolder r0 = r0.A08
            r1.BP8(r0, r2)
            return
        L_0x02df:
            java.lang.Object r1 = r11.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            java.lang.Object r4 = r11.A01
            android.content.Context r4 = (android.content.Context) r4
            X.2h3 r0 = r1.A1G
            r3 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.A00(r2)
            X.2sr r0 = r1.A0j
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0308
            X.5hX r1 = r1.A0c
            android.content.Context r0 = r12.getContext()
            android.content.Intent r0 = X.C86654Ky.A0C(r0, r3)
            r1.A0B(r4, r0)
            return
        L_0x0308:
            X.2fa r1 = r1.A0l
            android.content.Context r0 = r12.getContext()
            r1.A01(r0, r2)
            return
        L_0x0312:
            java.lang.Object r0 = r11.A00
            X.4px r0 = (X.C94134px) r0
            java.lang.Object r1 = r11.A01
            X.1fK r1 = (X.C28001fK) r1
            X.66t r0 = r0.A0E
            goto L_0x0327
        L_0x031d:
            java.lang.Object r0 = r11.A00
            X.4pw r0 = (X.C94124pw) r0
            java.lang.Object r1 = r11.A01
            X.1fK r1 = (X.C28001fK) r1
            X.66t r0 = r0.A03
        L_0x0327:
            r0.BPA(r1)
            return
        L_0x032b:
            java.lang.Object r0 = r11.A00
            X.4pw r0 = (X.C94124pw) r0
            java.lang.Object r3 = r11.A01
            X.4uZ r3 = (X.C95814uZ) r3
            X.66t r2 = r0.A03
            com.whatsapp.conversationslist.ViewHolder r1 = r0.A08
            r0 = -1
            r2.BP6(r1, r3, r0)
            return
        L_0x033c:
            java.lang.Object r4 = r11.A00
            com.whatsapp.conversation.selectlist.SelectListBottomSheet r4 = (com.whatsapp.conversation.selectlist.SelectListBottomSheet) r4
            java.lang.Object r5 = r11.A01
            X.4Wk r5 = (X.C87864Wk) r5
            X.8oE r0 = r4.A00
            if (r0 == 0) goto L_0x0377
            int r1 = r5.A00
            r0 = -1
            if (r1 == r0) goto L_0x0377
            java.util.List r3 = r5.A02
            int r0 = r3.size()
            if (r1 > r0) goto L_0x0377
            int r0 = r5.A00
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0377
            X.8oE r2 = r4.A00
            int r1 = r5.A00
            r0 = -1
            if (r1 == r0) goto L_0x037b
            int r0 = r3.size()
            if (r1 > r0) goto L_0x037b
            int r0 = r5.A00
            java.lang.Object r0 = r3.get(r0)
            X.7gb r0 = (X.C156427gb) r0
        L_0x0372:
            X.5dY r0 = r0.A00
            r2.BUt(r0)
        L_0x0377:
            r4.A1K()
            return
        L_0x037b:
            r0 = 0
            goto L_0x0372
        L_0x037d:
            java.lang.Object r1 = r11.A01
            X.5UU r1 = (X.AnonymousClass5UU) r1
            r0 = 0
            r1.A04(r0)
            return
        L_0x0386:
            java.lang.Object r1 = r11.A01
            X.5UU r1 = (X.AnonymousClass5UU) r1
            r0 = 0
            r1.A03(r0)
            return
        L_0x038f:
            java.lang.Object r1 = r11.A01
            X.5UU r1 = (X.AnonymousClass5UU) r1
            r0 = 0
            r1.A05(r0)
            return
        L_0x0398:
            java.lang.Object r2 = r11.A00
            X.5JE r2 = (X.AnonymousClass5JE) r2
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r2.A00 = r0
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03a9:
            java.lang.Object r0 = r11.A00
            X.4oW r0 = (X.C93414oW) r0
            java.lang.Object r3 = r11.A01
            X.1mW r3 = (X.C30481mW) r3
            X.4Fm r2 = r0.getLinkLauncher()
            android.content.Context r1 = X.C18290x4.A0F(r0)
            java.lang.String r0 = r3.A07
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.BkW(r1, r0, r3)
            return
        L_0x03c3:
            java.lang.Object r2 = r11.A00
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
            java.lang.Object r1 = r11.A01
            X.0df r1 = (X.C08270df) r1
            java.lang.String r0 = "TemplateButtonListBottomSheet"
            r2.A1O(r1, r0)
            return
        L_0x03d1:
            java.lang.Object r1 = r11.A00
            X.1Pb r1 = (X.C22661Pb) r1
            java.lang.Object r0 = r11.A01
            X.1QS r0 = (X.AnonymousClass1QS) r0
            X.C22661Pb.A00(r1, r0)
            return
        L_0x03dd:
            java.lang.Object r0 = r11.A00
            X.1Pb r0 = (X.C22661Pb) r0
            java.lang.Object r4 = r11.A01
            X.4uZ r4 = (X.C95814uZ) r4
            r3 = 0
            X.4ea r2 = r0.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Integer r1 = X.C18320x8.A0W()
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0l(r2, r4, r1, r0, r0)
            X.AnonymousClass0RN.A00(r2, r0, r3)
            return
        L_0x03f7:
            java.lang.Object r1 = r11.A00
            X.1Pd r1 = (X.C22681Pd) r1
            java.lang.Object r0 = r11.A01
            X.34x r0 = (X.C624134x) r0
            r1.A23(r0)
            return
        L_0x0403:
            java.lang.Object r6 = r11.A00
            X.1Pa r6 = (X.C22651Pa) r6
            java.lang.Object r5 = r11.A01
            X.34w r5 = (X.C624034w) r5
            android.content.Context r1 = r6.getContext()
            X.9U4 r0 = r6.A01
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BBC()
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r1, r0)
            X.4uZ r3 = r5.A0C
            boolean r2 = r5.A0Q
            java.lang.String r1 = r5.A0L
            X.2z0 r0 = new X.2z0
            r0.<init>(r3, r1, r2)
            X.C107395bF.A00(r4, r0)
            X.C86614Ku.A14(r4, r6)
            return
        L_0x042f:
            java.lang.Object r3 = r11.A00
            X.4oF r3 = (X.C93274oF) r3
            java.lang.Object r2 = r11.A01
            X.34x r2 = (X.C624134x) r2
            android.content.Context r1 = r3.getContext()
            X.9U4 r0 = r3.A02
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BCl()
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r1, r0)
            X.4uZ r0 = r2.A0n()
            java.lang.String r1 = X.C627336j.A07(r0)
            java.lang.String r0 = "extra_jid"
            r4.putExtra(r0, r1)
            X.4uZ r0 = r2.A0n()
            java.lang.String r1 = X.C627336j.A07(r0)
            java.lang.String r0 = "extra_inviter_jid"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_referral_screen"
            java.lang.String r0 = "chat"
            r4.putExtra(r1, r0)
            goto L_0x049d
        L_0x046b:
            java.lang.Object r3 = r11.A00
            X.4oF r3 = (X.C93274oF) r3
            java.lang.Object r2 = r11.A01
            X.34x r2 = (X.C624134x) r2
            android.content.Context r1 = r3.getContext()
            X.9U4 r0 = r3.A02
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.B44()
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r1 = "extra_setup_mode"
            r0 = 1
            r4.putExtra(r1, r0)
            X.4uZ r0 = r2.A0n()
            java.lang.String r1 = X.C627336j.A07(r0)
            java.lang.String r0 = "extra_jid"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "acceptInvite"
            X.AnonymousClass5VI.A00(r4, r0)
        L_0x049d:
            X.C86614Ku.A14(r4, r3)
            return
        L_0x04a1:
            java.lang.Object r4 = r11.A00
            X.4oF r4 = (X.C93274oF) r4
            java.lang.Object r5 = r11.A01
            X.34x r5 = (X.C624134x) r5
            android.content.Context r1 = r4.getContext()
            X.9U4 r0 = r4.A02
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.B44()
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_payments_entry_type"
            r2 = 2
            r3.putExtra(r0, r2)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_setup_mode"
            r3.putExtra(r0, r2)
            X.4uZ r0 = r5.A0n()
            java.lang.String r1 = X.C627336j.A07(r0)
            java.lang.String r0 = "extra_jid"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "acceptInvite"
            X.AnonymousClass5VI.A00(r3, r0)
            X.C86614Ku.A14(r3, r4)
            return
        L_0x04e8:
            java.lang.Object r1 = r11.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r11.A01
            android.content.Intent r0 = (android.content.Intent) r0
            X.C86614Ku.A14(r0, r1)
            return
        L_0x04f4:
            java.lang.Object r1 = r11.A00
            X.4my r1 = (X.C92614my) r1
            java.lang.Object r0 = r11.A01
            android.content.Intent r0 = (android.content.Intent) r0
            X.C92614my.setupShareNewsletterLinkButton$lambda$2(r1, r0, r12)
            return
        L_0x0500:
            java.lang.Object r1 = r11.A00
            X.4my r1 = (X.C92614my) r1
            java.lang.Object r0 = r11.A01
            X.1RL r0 = (X.AnonymousClass1RL) r0
            X.C92614my.setupNewsletterIcon$lambda$0(r1, r0, r12)
            return
        L_0x050c:
            java.lang.Object r1 = r11.A00
            X.4my r1 = (X.C92614my) r1
            java.lang.Object r0 = r11.A01
            android.content.Intent r0 = (android.content.Intent) r0
            X.C92614my.setupAddNewsletterDescriptionButton$lambda$1(r1, r0, r12)
            return
        L_0x0518:
            java.lang.Object r2 = r11.A00
            X.4n4 r2 = (X.C92674n4) r2
            java.lang.Object r4 = r11.A01
            X.1mr r4 = (X.C30691mr) r4
            java.util.List r1 = r4.A1w()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0538
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "call logs are empty, message.key="
            X.2z0 r0 = X.C624134x.A08(r4, r0, r1)
            X.C18260x0.A0n(r0, r1)
            return
        L_0x0538:
            java.lang.Object r9 = X.C18290x4.A0k(r1)
            java.lang.String r0 = "null call log"
            X.C626936e.A07(r9, r0)
            X.3ZF r9 = (X.AnonymousClass3ZF) r9
            android.content.Context r0 = r2.getContext()
            android.app.Activity r5 = X.C621633u.A00(r0)
            boolean r0 = r5 instanceof X.C003203q
            if (r0 == 0) goto L_0x0563
            boolean r0 = r9.A0L()
            if (r0 == 0) goto L_0x0563
            X.1VX r8 = r2.A0O
            X.2sr r6 = r2.A0Z
            X.3Ex r7 = r2.A0t
            X.03q r5 = (X.C003203q) r5
            r10 = 39
            X.C107305b5.A06(r5, r6, r7, r8, r9, r10)
            return
        L_0x0563:
            r4.A20()
            X.66r r3 = r2.A00
            X.3Ex r1 = r2.A0t
            X.2z0 r0 = r4.A1J
            X.4uZ r0 = r0.A00
            X.3ZH r2 = X.C64773Ex.A00(r1, r0)
            r1 = 39
            boolean r0 = r4.A20()
            r3.Bpk(r5, r2, r1, r0)
            return
        L_0x057c:
            java.lang.Object r4 = r11.A00
            X.4oJ r4 = (X.C93314oJ) r4
            java.lang.Object r3 = r11.A01
            X.5rC r1 = r4.A0U
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x06cf
            r1.A04()
            java.lang.String r0 = "logEntryPointTap"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0594:
            java.lang.Object r4 = r11.A00
            X.4nz r4 = (X.C93154nz) r4
            java.lang.Object r3 = r11.A01
            X.1pA r3 = (X.C31961pA) r3
            X.566 r1 = r4.A0D
            X.5Xh r0 = r1.A00
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x05ac
            int r2 = r1.A07()
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L_0x05ad
        L_0x05ac:
            r1 = 0
        L_0x05ad:
            X.5XQ r0 = r4.A0C
            if (r0 == 0) goto L_0x05c9
            if (r1 != 0) goto L_0x05c9
            X.34x r0 = r4.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = X.C30471mV.A00(r0)
            boolean r0 = X.C93154nz.A01(r0)
            if (r0 != 0) goto L_0x05c5
            r4.A28()
            return
        L_0x05c5:
            r4.A2C(r3)
            return
        L_0x05c9:
            X.5ez r0 = r4.A0B
            r0.onClick(r12)
            return
        L_0x05cf:
            java.lang.Object r0 = r11.A00
            X.4mx r0 = (X.C92604mx) r0
            java.lang.Object r4 = r11.A01
            X.5ez r4 = (X.C109665ez) r4
            X.2Z2 r3 = r0.A0I
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            r1 = 3
            r0 = 2
            r3.A00(r2, r1, r0)
            goto L_0x05f6
        L_0x05e3:
            java.lang.Object r0 = r11.A00
            X.4mx r0 = (X.C92604mx) r0
            java.lang.Object r4 = r11.A01
            X.5ez r4 = (X.C109665ez) r4
            X.2Z2 r3 = r0.A0I
            r2 = 2
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A00(r0, r1, r2)
        L_0x05f6:
            r4.onClick(r12)
            return
        L_0x05fa:
            java.lang.Object r1 = r11.A00
            X.4oJ r1 = (X.C93314oJ) r1
            java.lang.Object r0 = r11.A01
            X.34x r0 = (X.C624134x) r0
            r1.A1o(r0)
            return
        L_0x0606:
            java.lang.Object r2 = r11.A00
            X.0eF r2 = (X.C08310eF) r2
            java.lang.Object r1 = r11.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            android.content.Context r0 = r2.A1D()
            android.content.Intent r0 = X.C627736r.A0j(r0, r1)
            r2.A0m(r0)
            return
        L_0x061a:
            java.lang.Object r5 = r11.A00
            X.1PN r5 = (X.AnonymousClass1PN) r5
            java.lang.Object r3 = r11.A01
            X.2mj r3 = (X.C53212mj) r3
            r4 = 1
            X.2Zm r2 = r5.A06
            X.67A r1 = r5.A04
            r0 = 3
            r2.A00(r1, r3, r0)
            X.48d r3 = r5.A02
            if (r3 == 0) goto L_0x0638
            X.2aP r2 = r5.A0B
            X.21s r1 = X.C373021s.PRIMARY_ACTION
            r0 = 11389(0x2c7d, float:1.596E-41)
            r2.A00(r1, r3, r0)
        L_0x0638:
            r5.A05(r4)
            return
        L_0x063c:
            java.lang.Object r5 = r11.A00
            X.4mC r5 = (X.C92164mC) r5
            java.lang.Object r4 = r11.A01
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r2 = r4.getIntent()
            r1 = 0
            if (r2 == 0) goto L_0x066c
            java.lang.String r0 = "mat_entry_point"
            int r6 = r2.getIntExtra(r0, r1)
        L_0x0651:
            android.content.Intent r2 = r4.getIntent()
            r1 = -1
            if (r2 == 0) goto L_0x066a
            java.lang.String r0 = "extra_forwarded_message_thread_type"
            int r2 = r2.getIntExtra(r0, r1)
        L_0x065e:
            X.1RL r0 = r5.A00
            r3 = 0
            if (r0 != 0) goto L_0x066e
            java.lang.String r0 = "newsletterInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x066a:
            r2 = -1
            goto L_0x065e
        L_0x066c:
            r6 = 0
            goto L_0x0651
        L_0x066e:
            X.4uZ r1 = r0.A05()
            boolean r0 = r5.A0R
            r0 = r0 ^ 1
            android.content.Intent r2 = X.C627736r.A0b(r4, r1, r6, r2, r0)
            r1 = 2131434443(0x7f0b1bcb, float:1.84907E38)
            X.07r r0 = r5.A0U
            android.view.View r1 = r0.findViewById(r1)
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x068d
            X.5MG r0 = r5.A0Z
            android.os.Bundle r3 = X.AnonymousClass5MG.A00(r4, r1, r0)
        L_0x068d:
            java.lang.String r0 = X.C18310x6.A0n(r4)
            X.AnonymousClass5VI.A00(r2, r0)
            X.AnonymousClass0RN.A00(r4, r2, r3)
            return
        L_0x0698:
            java.lang.Object r1 = r11.A00
            X.4fT r1 = (X.C89904fT) r1
            java.lang.Object r0 = r11.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.BXQ(r0)
            return
        L_0x06a4:
            android.content.Context r1 = r3.getContext()
            r0 = 2131890537(0x7f121169, float:1.9415769E38)
            java.lang.String r2 = r1.getString(r0)
            android.app.ProgressDialog r1 = r3.A05
            if (r1 != 0) goto L_0x06be
            android.content.Context r0 = r3.getContext()
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r0)
            r3.A05 = r1
        L_0x06be:
            r1.setTitle(r2)
            android.app.ProgressDialog r0 = r3.A05
            r0.show()
            X.4FS r2 = r3.A25
            r0 = 39
            X.5rM r0 = X.C117085rM.A00(r3, r0)
            goto L_0x06d8
        L_0x06cf:
            X.4FS r2 = r4.A25
            r1 = 17
            X.3bw r0 = new X.3bw
            r0.<init>(r4, r1, r3)
        L_0x06d8:
            r2.BkM(r0)
            return
        L_0x06dc:
            r0 = 33
            X.3aM r3 = new X.3aM
            r3.<init>(r5, r4, r2, r0)
            X.3Wi r2 = r5.A02
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0T(r3, r0)
            r5.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109475eg.onClick(android.view.View):void");
    }
}
