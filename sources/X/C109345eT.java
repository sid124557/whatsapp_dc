package X;

import android.view.View;

/* renamed from: X.5eT  reason: invalid class name and case insensitive filesystem */
public class C109345eT implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109345eT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C109345eT(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.4mG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.4mF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.1PN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.4mG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.4mG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.4mG} */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0553, code lost:
        r0 = true;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0570, code lost:
        r4.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0573, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0588, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x058b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r59) {
        /*
            r58 = this;
            r1 = r58
            int r0 = r1.A01
            r5 = r59
            switch(r0) {
                case 3: goto L_0x0574;
                case 4: goto L_0x055d;
                case 5: goto L_0x0555;
                case 6: goto L_0x053e;
                case 7: goto L_0x0521;
                case 8: goto L_0x0505;
                case 9: goto L_0x0470;
                case 10: goto L_0x0273;
                case 11: goto L_0x0181;
                case 12: goto L_0x0464;
                case 13: goto L_0x045b;
                case 14: goto L_0x0159;
                case 15: goto L_0x0453;
                case 16: goto L_0x044b;
                case 17: goto L_0x0432;
                case 18: goto L_0x0132;
                case 19: goto L_0x042a;
                case 20: goto L_0x0419;
                case 21: goto L_0x0407;
                case 22: goto L_0x010f;
                case 23: goto L_0x03e8;
                case 24: goto L_0x03d5;
                case 25: goto L_0x03ba;
                case 26: goto L_0x00ce;
                case 27: goto L_0x0393;
                case 28: goto L_0x0378;
                case 29: goto L_0x0370;
                case 30: goto L_0x035f;
                case 31: goto L_0x0355;
                case 32: goto L_0x00b2;
                case 33: goto L_0x00a3;
                case 34: goto L_0x0053;
                case 35: goto L_0x0011;
                case 36: goto L_0x0333;
                case 37: goto L_0x032b;
                case 38: goto L_0x031d;
                case 39: goto L_0x0584;
                case 40: goto L_0x0584;
                case 41: goto L_0x0315;
                case 42: goto L_0x0305;
                case 43: goto L_0x0315;
                case 44: goto L_0x02fd;
                case 45: goto L_0x02db;
                case 46: goto L_0x02bc;
                case 47: goto L_0x02b4;
                case 48: goto L_0x02aa;
                case 49: goto L_0x029a;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            r0.invoke(r5)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r7 = r1.A00
            X.4oB r7 = (X.C93234oB) r7
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r7.A0C
            boolean r0 = r0.isClickable()
            if (r0 == 0) goto L_0x0010
            X.5NZ r1 = r7.A0A
            X.34x r0 = r7.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.1mu r0 = (X.C30721mu) r0
            r1.A00(r0)
            X.5mA r0 = r7.A09
            X.1mu r1 = r0.A02()
            X.34x r6 = r7.A0S
            X.1mV r6 = (X.C30471mV) r6
            X.1mu r6 = (X.C30721mu) r6
            X.677 r5 = r7.A0m
            boolean r0 = r5 instanceof X.C185928uT
            if (r0 == 0) goto L_0x0010
            if (r1 == 0) goto L_0x0010
            long r3 = r1.A1L
            long r1 = r6.A1L
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            X.8uT r5 = (X.C185928uT) r5
            X.3Mh r1 = r7.A0b
            X.1Ek r0 = X.C66663Mh.A1p
            int r0 = r1.A03(r0)
            long r0 = (long) r0
            r5.Bk1(r6, r0)
            return
        L_0x0053:
            java.lang.Object r5 = r1.A00
            X.4ni r5 = (X.C93004ni) r5
            com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView r4 = r5.A04
            java.lang.Runnable r2 = r5.A03
            r4.removeCallbacks(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
            int r0 = r5.A00
            int r1 = r0 + 1
            r5.A00 = r1
            r0 = 3
            if (r1 != r0) goto L_0x0010
            android.graphics.drawable.Drawable r3 = r5.getPopupDrawable()
            X.677 r2 = r5.A0m
            if (r2 == 0) goto L_0x0010
            if (r3 == 0) goto L_0x0010
            android.widget.ImageView r0 = r5.A01
            if (r0 != 0) goto L_0x009d
            android.widget.ImageView r0 = X.C86614Ku.A0H(r5)
            r5.A01 = r0
            android.widget.FrameLayout$LayoutParams r1 = X.C86664Kz.A0p()
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r5.A01
            r0.setLayoutParams(r1)
            android.widget.ImageView r1 = r5.A01
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r5.A01
            r0.setImageDrawable(r3)
            android.widget.ImageView r0 = r5.A01
            r4.addView(r0)
        L_0x009d:
            android.widget.ImageView r0 = r5.A01
            r2.Awx(r3, r0)
            return
        L_0x00a3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts r0 = (com.whatsapp.conversation.conversationrow.ConversationRowViewInstagramPosts) r0
            X.4Uk r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            X.08M r1 = r0.A01
            r0 = 0
            r1.A0G(r0)
            return
        L_0x00b2:
            java.lang.Object r3 = r1.A00
            X.5TP r3 = (X.AnonymousClass5TP) r3
            X.4oH r0 = r3.A0D
            X.677 r2 = r0.A0m
            if (r2 == 0) goto L_0x0010
            boolean r0 = r2.BFW()
            if (r0 == 0) goto L_0x0010
            android.view.View r1 = r3.A02
            X.1mV r0 = r3.A07
            boolean r0 = r2.Bqw(r0)
            r1.setSelected(r0)
            return
        L_0x00ce:
            java.lang.Object r5 = r1.A00
            X.4nw r5 = (X.C93124nw) r5
            X.3ZH r4 = r5.A09
            X.4uZ r0 = r4.A0H
            if (r0 == 0) goto L_0x0010
            r1 = 0
            r0 = 3
            r5.A27(r0, r1)
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A05(r4, r0)
            java.lang.String r1 = "argSenderJid"
            java.lang.String r0 = X.C627336j.A07(r0)
            r3.putString(r1, r0)
            java.lang.String r2 = "argContactId"
            long r0 = r4.A0F()
            r3.putLong(r2, r0)
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r2 = new com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment
            r2.<init>()
            r2.A0u(r3)
            X.4eZ r0 = r5.A0C
            X.0df r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = X.AnonymousClass000.A0O(r2)
            r2.A1O(r1, r0)
            return
        L_0x010f:
            java.lang.Object r1 = r1.A00
            X.1PZ r1 = (X.AnonymousClass1PZ) r1
            android.app.Activity r4 = X.C86614Ku.A0A(r1)
            X.4ea r4 = (X.C89654ea) r4
            if (r4 == 0) goto L_0x0010
            X.34x r0 = r1.A0S
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A04(r0)
            X.2gf r2 = r1.A01
            X.2ss r0 = r1.A0N
            int r1 = r0.A04(r3)
            r0 = 2
            r2.A00(r4, r3, r1, r0)
            return
        L_0x0132:
            java.lang.Object r3 = r1.A00
            X.4n6 r3 = (X.C92694n6) r3
            X.3ZH r0 = r3.A09
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass3ZH.A07(r0)
            if (r5 == 0) goto L_0x0010
            X.2Xt r2 = r3.A0C
            X.2m8 r1 = r3.A26()
            r0 = 2
            r2.A00(r1, r5, r0)
            r4 = 0
            X.4eZ r3 = r3.A08
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0l(r3, r5, r2, r0, r1)
            X.AnonymousClass0RN.A00(r3, r0, r4)
            return
        L_0x0159:
            java.lang.Object r1 = r1.A00
            X.4oJ r1 = (X.C93314oJ) r1
            java.lang.Runnable r0 = r1.A2J
            if (r0 != 0) goto L_0x0588
            X.34x r3 = r1.getFMessage()
            android.content.Context r0 = r1.getContext()
            android.app.Activity r0 = X.C621633u.A00(r0)
            if (r0 == 0) goto L_0x0010
            X.677 r2 = r1.A0m
            if (r2 == 0) goto L_0x0010
            X.3Mh r1 = r1.A0b
            X.1Ei r0 = X.C66663Mh.A0q
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0010
            r2.Bkv(r3)
            return
        L_0x0181:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r0 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r0
            X.66R r1 = r0.A0c
            java.lang.Object r12 = r1.getValue()
            android.app.Activity r12 = (android.app.Activity) r12
            X.2sH r1 = r0.A0E
            r27 = r1
            if (r1 == 0) goto L_0x0624
            X.1VX r1 = r0.A0N
            r26 = r1
            if (r1 == 0) goto L_0x061f
            X.3Wi r1 = r0.A01
            r25 = r1
            if (r1 == 0) goto L_0x0618
            X.4FS r1 = r0.A0Z
            r24 = r1
            if (r1 == 0) goto L_0x0611
            X.4FV r1 = r0.A0O
            r23 = r1
            if (r1 == 0) goto L_0x060a
            X.5Y0 r1 = r0.A0M
            r22 = r1
            if (r1 == 0) goto L_0x0603
            X.33m r1 = r0.A07
            r21 = r1
            if (r1 == 0) goto L_0x05fc
            X.3Ex r11 = r0.A09
            if (r11 == 0) goto L_0x05f5
            X.36Y r1 = r0.A0L
            r20 = r1
            if (r1 == 0) goto L_0x05ee
            X.5ZU r10 = r0.A0B
            if (r10 == 0) goto L_0x05e7
            X.33j r1 = r0.A0G
            r19 = r1
            if (r1 == 0) goto L_0x05e0
            X.2fk r1 = r0.A0C
            r18 = r1
            if (r1 == 0) goto L_0x05d9
            X.2lX r1 = r0.A0Q
            r17 = r1
            if (r1 == 0) goto L_0x05d2
            X.2mi r1 = r0.A0R
            r16 = r1
            if (r1 == 0) goto L_0x05cb
            X.30N r15 = r0.A0P
            if (r15 == 0) goto L_0x05c4
            X.2rx r14 = r0.A0A
            if (r14 == 0) goto L_0x05bd
            X.33p r9 = r0.A0F
            if (r9 == 0) goto L_0x05b6
            X.5rC r8 = r0.A00
            if (r8 == 0) goto L_0x05af
            X.2sj r7 = r0.A0I
            if (r7 == 0) goto L_0x05a8
            X.2cd r6 = r0.A0T
            if (r6 == 0) goto L_0x05a1
            X.34x r1 = r0.A0V
            java.lang.String r2 = "message"
            if (r1 != 0) goto L_0x0200
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0200:
            java.util.List r1 = X.C18290x4.A12(r1)
            java.util.HashSet r5 = X.AnonymousClass0x9.A15(r1)
            X.34x r1 = r0.A0V
            if (r1 != 0) goto L_0x0211
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0211:
            X.4uZ r13 = r1.A0n()
            X.8E0 r4 = new X.8E0
            r4.<init>(r0)
            r31 = 0
            X.2hp r3 = r0.A0W
            if (r3 == 0) goto L_0x059a
            X.2Yl r2 = r0.A0X
            if (r2 == 0) goto L_0x0593
            X.2ss r1 = r0.A0H
            if (r1 == 0) goto L_0x058c
            r57 = 1
            X.5hq r0 = new X.5hq
            r0.<init>(r12)
            java.lang.String r55 = X.AnonymousClass5ZW.A01(r12, r11, r10, r13, r5)
            r41 = r19
            r42 = r1
            r43 = r7
            r44 = r20
            r45 = r22
            r46 = r26
            r47 = r23
            r48 = r15
            r49 = r17
            r50 = r16
            r51 = r6
            r52 = r3
            r53 = r2
            r54 = r24
            r56 = r5
            r28 = r12
            r29 = r8
            r30 = r0
            r32 = r4
            r33 = r25
            r34 = r21
            r35 = r11
            r36 = r14
            r37 = r10
            r38 = r18
            r39 = r27
            r40 = r9
            android.app.Dialog r0 = X.AnonymousClass5ZW.A00(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            if (r0 == 0) goto L_0x0010
            r0.show()
            return
        L_0x0273:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r4 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r4
            X.34x r0 = r4.A0V
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = "message"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0282:
            X.2z0 r0 = r0.A1J
            X.4uZ r3 = r0.A00
            if (r3 == 0) goto L_0x0010
            X.1iB r0 = r4.A0K
            if (r0 == 0) goto L_0x062b
            X.3XA r2 = r0.A08()
            r1 = 0
            X.6Bq r0 = new X.6Bq
            r0.<init>(r3, r1, r4)
            r2.A03(r0)
            return
        L_0x029a:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            X.2nM r2 = r0.A2Y
            java.lang.String r1 = "newsletter-geosuspend"
            X.4eZ r0 = X.C113245l7.A09(r0)
            r2.A01(r0, r1)
            return
        L_0x02aa:
            java.lang.Object r1 = r1.A00
            X.5l7 r1 = (X.C113245l7) r1
            X.5dt r0 = r1.A2P
            r1.A1l(r0)
            return
        L_0x02b4:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x02bc:
            java.lang.Object r4 = r1.A00
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            android.content.Context r3 = r5.getContext()
            android.content.Context r2 = r5.getContext()
            r0 = 22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0l(r2, r4, r1, r0, r0)
            r3.startActivity(r0)
            return
        L_0x02db:
            java.lang.Object r4 = r1.A00
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            android.content.Context r3 = r5.getContext()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.reporttoadminreporterslist.ReportToAdminReportersActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "reporters_user_jid"
            r2.putParcelableArrayListExtra(r0, r4)
            r3.startActivity(r2)
            return
        L_0x02fd:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity r0 = (com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity) r0
            r0.A74()
            return
        L_0x0305:
            java.lang.Object r0 = r1.A00
            X.4pj r0 = (X.C94024pj) r0
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r0.A0G
            r0 = 2
            r1.A0D(r0)
            X.33i r0 = r1.A05
            X.C106755a7.A04(r0)
            return
        L_0x0315:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x031d:
            java.lang.Object r0 = r1.A00
            X.5Pb r0 = (X.C103955Pb) r0
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            X.5R6 r0 = r0.A09
            X.8o7 r0 = r0.A03
            r0.BL7(r5)
            return
        L_0x032b:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x0333:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r3 = (com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet) r3
            java.lang.String r0 = "https://www.whatsapp.com/security"
            android.content.Intent r2 = X.C18300x5.A08(r0)
            X.5hX r1 = r3.A01
            android.content.Context r0 = r3.A1D()
            r1.A0A(r0, r2)
            int r2 = r3.A00
            r0 = -1
            if (r2 == r0) goto L_0x0351
            X.5WX r1 = r3.A03
            r0 = 2
            r1.A00(r2, r0)
        L_0x0351:
            r3.A1L()
            return
        L_0x0355:
            java.lang.Object r0 = r1.A00
            X.4nZ r0 = (X.C92914nZ) r0
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r0.A0U
            r0.A03()
            return
        L_0x035f:
            java.lang.Object r3 = r1.A00
            X.4nY r3 = (X.C92904nY) r3
            X.34x r2 = r3.A0S
            X.1mV r2 = (X.C30471mV) r2
            X.1mz r2 = (X.C30771mz) r2
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r3.A0I
            r0 = 0
            r3.A1W(r1, r2, r0)
            return
        L_0x0370:
            java.lang.Object r0 = r1.A00
            X.4mv r0 = (X.C92584mv) r0
            X.C92584mv.A00(r0)
            return
        L_0x0378:
            java.lang.Object r0 = r1.A00
            android.content.Context r0 = (android.content.Context) r0
            X.0zH r1 = X.AnonymousClass5V0.A00(r0)
            r0 = 2131890520(0x7f121158, float:1.9415734E38)
            r1.A0T(r0)
            r0 = 2131890521(0x7f121159, float:1.9415736E38)
            r1.A0U(r0)
            X.C19340zH.A06(r1)
            r1.A0S()
            return
        L_0x0393:
            java.lang.Object r1 = r1.A00
            X.4o0 r1 = (X.C93164o0) r1
            X.4eZ r0 = r1.getBaseActivity()
            X.0df r2 = r0.getSupportFragmentManager()
            X.4eZ r3 = r1.getBaseActivity()
            X.1fJ r4 = r1.A04
            X.2so r0 = r1.getCommunityChatManager()
            X.1fJ r5 = r0.A01(r4)
            r11 = 0
            X.3d3 r6 = X.C72023d3.A00
            r9 = 1
            X.8XS r7 = X.AnonymousClass8XS.A00
            X.63g r8 = X.C1221463g.A00
            r10 = 6
            X.AnonymousClass27C.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x03ba:
            java.lang.Object r2 = r1.A00
            X.4nw r2 = (X.C93124nw) r2
            r1 = 0
            r0 = 1
            r2.A27(r0, r1)
            X.3ZH r1 = r2.A09
            X.2sr r0 = r2.A0Z
            boolean r0 = X.C56972sr.A08(r0, r1)
            com.whatsapp.dialogs.CreateOrAddToContactsDialog r1 = com.whatsapp.dialogs.CreateOrAddToContactsDialog.A00(r1, r0)
            X.4eZ r0 = r2.A0C
            X.C86644Kx.A1D(r1, r0)
            return
        L_0x03d5:
            java.lang.Object r4 = r1.A00
            X.4nw r4 = (X.C93124nw) r4
            r0 = 0
            r3 = 0
            r4.A27(r3, r0)
            X.5Qj r2 = r4.A0D
            X.4eZ r1 = r4.A0C
            X.3ZH r0 = r4.A09
            r2.A00(r1, r0, r3)
            return
        L_0x03e8:
            java.lang.Object r1 = r1.A00
            X.4nw r1 = (X.C93124nw) r1
            r5 = 0
            r0 = 5
            r1.A27(r0, r5)
            X.3ZH r0 = r1.A09
            com.whatsapp.jid.UserJid r4 = X.C86604Kt.A0d(r0)
            X.4eZ r3 = r1.A0C
            java.lang.Integer r2 = X.C18280x3.A0S()
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0l(r3, r4, r2, r0, r1)
            X.AnonymousClass0RN.A00(r3, r0, r5)
            return
        L_0x0407:
            java.lang.Object r0 = r1.A00
            X.4oJ r0 = (X.C93314oJ) r0
            X.2nM r2 = r0.A0x
            android.app.Activity r1 = X.C111095hX.A04(r0)
            X.03q r1 = (X.C003203q) r1
            java.lang.String r0 = "about-disappearing-messages"
            r2.A01(r1, r0)
            return
        L_0x0419:
            java.lang.Object r0 = r1.A00
            X.1PX r0 = (X.AnonymousClass1PX) r0
            X.0df r2 = r0.A02
            X.34x r0 = r0.A0S
            X.2z0 r0 = r0.A1J
            X.4uZ r1 = r0.A00
            r0 = 3
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A01(r2, r1, r0)
            return
        L_0x042a:
            java.lang.Object r0 = r1.A00
            X.1PT r0 = (X.AnonymousClass1PT) r0
            X.AnonymousClass1PT.A02(r0)
            return
        L_0x0432:
            java.lang.Object r3 = r1.A00
            X.4mx r3 = (X.C92604mx) r3
            X.2Z2 r2 = r3.A0I
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            r0 = 2
            r2.A00(r1, r0, r0)
            r1 = 26
            X.54F r0 = new X.54F
            r0.<init>(r3, r1)
            r0.onClick(r5)
            return
        L_0x044b:
            java.lang.Object r0 = r1.A00
            X.4oJ r0 = (X.C93314oJ) r0
            r0.A1N()
            return
        L_0x0453:
            java.lang.Object r0 = r1.A00
            X.4oJ r0 = (X.C93314oJ) r0
            r0.A1K()
            return
        L_0x045b:
            java.lang.Object r1 = r1.A00
            X.4oJ r1 = (X.C93314oJ) r1
            r0 = 0
            r1.A1U(r0)
            return
        L_0x0464:
            java.lang.Object r1 = r1.A00
            X.4oJ r1 = (X.C93314oJ) r1
            X.34x r0 = r1.getFMessage()
            r1.A1m(r0)
            return
        L_0x0470:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r2 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r2
            X.34x r0 = r2.A0V
            if (r0 != 0) goto L_0x047f
            java.lang.String r0 = "message"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x047f:
            java.util.List r13 = X.C18290x4.A12(r0)
            X.66R r0 = r2.A0c
            java.lang.Object r3 = r0.getValue()
            android.content.Context r3 = (android.content.Context) r3
            X.3Wi r4 = r2.A01
            if (r4 == 0) goto L_0x04fe
            X.5Xz r10 = r2.A0S
            if (r10 == 0) goto L_0x04f7
            X.2sr r5 = r2.A06
            if (r5 == 0) goto L_0x04f0
            X.3Ex r6 = r2.A09
            if (r6 == 0) goto L_0x04e9
            X.33j r9 = r2.A0G
            if (r9 == 0) goto L_0x04e2
            X.33i r8 = r2.A0D
            if (r8 == 0) goto L_0x04db
            X.5ZU r7 = r2.A0B
            if (r7 == 0) goto L_0x04d4
            X.2y5 r11 = r2.A0U
            if (r11 == 0) goto L_0x04cd
            X.2hp r12 = r2.A0W
            if (r12 == 0) goto L_0x04c6
            X.C107315b6.A07(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.4FS r1 = r2.A0Z
            if (r1 == 0) goto L_0x04bf
            r0 = 23
            X.C117085rM.A01(r1, r2, r0)
            r2.A1K()
            return
        L_0x04bf:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04c6:
            java.lang.String r0 = "interactiveMessageCustomizerFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04cd:
            java.lang.String r0 = "sharedPreferencesFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04d4:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04db:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04e2:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04e9:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04f0:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04f7:
            java.lang.String r0 = "mentions"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04fe:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0505:
            java.lang.Object r4 = r1.A00
            X.1PN r4 = (X.AnonymousClass1PN) r4
            X.2mj r2 = r4.A01
            if (r2 == 0) goto L_0x0513
            X.2zl r1 = r4.A07
            r0 = 3
            r1.A02(r2, r0)
        L_0x0513:
            X.48d r3 = r4.A02
            if (r3 == 0) goto L_0x0553
            X.2aP r2 = r4.A0B
            X.21s r1 = X.C373021s.DISMISS_ACTION
            r0 = 11389(0x2c7d, float:1.596E-41)
            r2.A00(r1, r3, r0)
            goto L_0x0553
        L_0x0521:
            java.lang.Object r1 = r1.A00
            X.4mF r1 = (X.C92194mF) r1
            r0 = 0
            r1.A05(r0)
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl r3 = r1.A06
            android.content.Context r2 = X.C18290x4.A0F(r5)
            X.3ZH r0 = r1.A04
            X.4uZ r1 = r0.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C162457s7.A0K(r1, r0)
            X.4uY r1 = (X.C95804uY) r1
            r3.A01(r2, r1)
            return
        L_0x053e:
            java.lang.Object r4 = r1.A00
            X.4mF r4 = (X.C92194mF) r4
            r3 = 0
            X.2sL r2 = r4.A03
            X.3ZH r0 = r4.A04
            X.4uZ r1 = r0.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C162457s7.A0K(r1, r0)
            X.4uY r1 = (X.C95804uY) r1
            r2.A02(r1, r3)
        L_0x0553:
            r0 = 1
            goto L_0x0570
        L_0x0555:
            java.lang.Object r0 = r1.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x055d:
            java.lang.Object r4 = r1.A00
            X.4mG r4 = (X.C92204mG) r4
            X.4uZ r0 = r4.A06
            X.1fJ r2 = X.AnonymousClass34R.A03(r0)
            if (r2 == 0) goto L_0x056f
            X.4FS r1 = r4.A07
            r0 = 4
            X.C71333bw.A00(r1, r4, r2, r0)
        L_0x056f:
            r0 = 0
        L_0x0570:
            r4.A05(r0)
            return
        L_0x0574:
            java.lang.Object r0 = r1.A00
            X.5rH r0 = (X.C117035rH) r0
            X.67A r0 = r0.A01
            X.4eZ r1 = r0.getActivity()
            r0 = 30
            X.C621433s.A01(r1, r0)
            return
        L_0x0584:
            java.lang.Object r0 = r1.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
        L_0x0588:
            r0.run()
            return
        L_0x058c:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0593:
            java.lang.String r0 = "interactiveResponseMessageCustomizerFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x059a:
            java.lang.String r0 = "interactiveMessageCustomizerFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05a1:
            java.lang.String r0 = "messageRevokeWamEventLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05a8:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05af:
            java.lang.String r0 = "bonsaiUtilOptional"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05b6:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05bd:
            java.lang.String r0 = "verifiedNameManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05c4:
            java.lang.String r0 = "wamThreadIdManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05cb:
            java.lang.String r0 = "supportGatingUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05d2:
            java.lang.String r0 = "suspensionManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05d9:
            java.lang.String r0 = "businessCoexUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05e0:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05e7:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05ee:
            java.lang.String r0 = "deepLinkHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05f5:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05fc:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0603:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x060a:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0611:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0618:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x061f:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0624:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x062b:
            java.lang.String r0 = "companionDeviceManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109345eT.onClick(android.view.View):void");
    }
}
