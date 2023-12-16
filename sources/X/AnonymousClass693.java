package X;

import android.widget.CompoundButton;

/* renamed from: X.693  reason: invalid class name */
public class AnonymousClass693 implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass693(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(CompoundButton compoundButton, Object obj, int i) {
        compoundButton.setOnCheckedChangeListener(new AnonymousClass693(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [X.4kJ, X.10p] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c7, code lost:
        r2.A03 = new X.C108845de(r5, r6, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        r3 = new X.C71553cI((java.lang.Object) r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r4.BkM(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0139, code lost:
        if (r12 == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016c, code lost:
        if (r12 == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ae, code lost:
        if (X.C162457s7.A0P(java.lang.Boolean.valueOf(r12), r1) == false) goto L_0x01b0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r11, boolean r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            r8 = r12
            switch(r0) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0021;
                case 2: goto L_0x00ac;
                case 3: goto L_0x0041;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00f5;
                case 6: goto L_0x011a;
                case 7: goto L_0x0070;
                case 8: goto L_0x0128;
                case 9: goto L_0x015b;
                case 10: goto L_0x0195;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r10.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r2 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r2
            X.8qC r0 = r2.A05
            if (r0 == 0) goto L_0x0109
            X.2rK r1 = X.C86654Ky.A0g(r0)
            X.21S r0 = com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity.A06
            r1.A04(r0, r12)
            X.5hb r1 = r2.A74()
            java.lang.String r0 = "TAP_AUTO_CROSSPOST_TOGGLE"
            r1.A05(r0)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r2 = r10.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            if (r12 == 0) goto L_0x003a
            X.3ZH r0 = r2.A1K
            com.whatsapp.jid.UserJid r1 = X.C86604Kt.A0d(r0)
            X.C626936e.A06(r1)
            X.21R r0 = X.AnonymousClass21R.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r0 = X.C57402ta.A00(r1, r0)
            X.C18270x1.A0t(r0, r2)
            return
        L_0x003a:
            X.4kJ r1 = r2.A0x
            X.4FS r4 = r1.A0H
            r0 = 20
            goto L_0x00ba
        L_0x0041:
            java.lang.Object r2 = r10.A00
            X.4cM r2 = (X.C89354cM) r2
            X.4sb r1 = r2.A05
            if (r1 != 0) goto L_0x0050
            java.lang.String r0 = "wamGroupInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0050:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A07 = r0
            if (r12 == 0) goto L_0x0064
            X.4ea r3 = r2.A0B
            X.1fJ r2 = r2.A06
            r1 = 0
            if (r2 != 0) goto L_0x0110
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0064:
            X.4FS r4 = r2.getWaWorkers$community_consumerBeta()
            r0 = 21
            X.3bu r3 = new X.3bu
            r3.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x00bf
        L_0x0070:
            java.lang.Object r1 = r10.A00
            X.4el r1 = (X.C89704el) r1
            X.4FS r4 = r1.A04
            r0 = 11
            X.3bz r3 = new X.3bz
            r3.<init>(r0, r1, r12)
            goto L_0x00bf
        L_0x007e:
            java.lang.Object r3 = r10.A00
            com.whatsapp.bonsai.chatinfo.BotChatInfoViewModel r3 = (com.whatsapp.bonsai.chatinfo.BotChatInfoViewModel) r3
            X.1RK r4 = r3.A00
            if (r4 == 0) goto L_0x0020
            X.08M r2 = r3.A02
            java.lang.Object r0 = r2.A07()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 != 0) goto L_0x0020
            r2.A0H(r1)
            r4.A00 = r12
            X.3GN r3 = r3.A04
            X.4FS r2 = r3.A05
            r0 = 27
            X.5rV r1 = new X.5rV
            r1.<init>(r3, r0, r4)
            java.lang.String r0 = "BotChatManagerImpl"
            r2.BkV(r1, r0)
            return
        L_0x00ac:
            java.lang.Object r4 = r10.A00
            com.whatsapp.chatlock.ChatLockAuthActivity r4 = (com.whatsapp.chatlock.ChatLockAuthActivity) r4
            if (r12 == 0) goto L_0x00c3
            com.whatsapp.chatlock.ChatLockAuthViewModel r1 = X.AnonymousClass4SG.A2g(r4)
            X.4FS r4 = r1.A08
            r0 = 21
        L_0x00ba:
            X.3cI r3 = new X.3cI
            r3.<init>((java.lang.Object) r1, (int) r0)
        L_0x00bf:
            r4.BkM(r3)
            return
        L_0x00c3:
            com.whatsapp.chatlock.ChatLockAuthViewModel r0 = X.AnonymousClass4SG.A2g(r4)
            X.31A r0 = r0.A00
            if (r0 == 0) goto L_0x0020
            X.4uZ r0 = r0.A05()
            if (r0 == 0) goto L_0x0020
            X.5aW r3 = r4.A02
            if (r3 == 0) goto L_0x01d6
            X.4kL r2 = new X.4kL
            r2.<init>(r0)
            X.5az r1 = r4.A08
            r0 = 0
            r3.A08(r4, r2, r1, r0)
            return
        L_0x00e1:
            java.lang.Object r2 = r10.A00
            com.whatsapp.contact.contactform.ContactFormActivity r2 = (com.whatsapp.contact.contactform.ContactFormActivity) r2
            if (r12 == 0) goto L_0x0020
            X.5ZR r1 = r2.A0L
            X.2Xk r0 = r2.A06
            boolean r0 = X.C106785aA.A04(r0, r1)
            if (r0 != 0) goto L_0x0020
            r2.requestPermission()
            return
        L_0x00f5:
            java.lang.Object r2 = r10.A00
            com.whatsapp.contact.contactform.ContactFormBottomSheetFragment r2 = (com.whatsapp.contact.contactform.ContactFormBottomSheetFragment) r2
            if (r12 == 0) goto L_0x0020
            X.5ZR r1 = r2.A0L
            X.2Xk r0 = r2.A07
            boolean r0 = X.C106785aA.A04(r0, r1)
            if (r0 != 0) goto L_0x0020
            r2.requestPermission()
            return
        L_0x0109:
            java.lang.String r0 = "fbAccountManagerLazy"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0110:
            X.21R r0 = X.AnonymousClass21R.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r0 = X.C57402ta.A00(r2, r0)
            r3.Bon(r0, r1)
            return
        L_0x011a:
            java.lang.Object r0 = r10.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r0 = (com.whatsapp.newsletter.NewsletterInfoActivity) r0
            if (r12 == 0) goto L_0x0124
            r0.A7P()
            return
        L_0x0124:
            r0.A7T()
            return
        L_0x0128:
            java.lang.Object r2 = r10.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            com.whatsapp.bridge.wfal.WfalManager r0 = r2.A00
            if (r0 == 0) goto L_0x0154
            X.2ye r0 = r0.A00()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x013b
            r0 = 1
            if (r12 != 0) goto L_0x013c
        L_0x013b:
            r0 = 0
        L_0x013c:
            r2.A0G = r0
            r2.A0H = r0
            X.5de r1 = r2.A03
            java.lang.String r0 = "statusDistributionInfo"
            if (r1 != 0) goto L_0x014b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x014b:
            int r7 = r1.A00
            java.util.List r5 = r1.A01
            java.util.List r6 = r1.A02
            boolean r9 = r1.A04
            goto L_0x01c7
        L_0x0154:
            java.lang.String r0 = "wfalManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x015b:
            java.lang.Object r2 = r10.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            com.whatsapp.bridge.wfal.WfalManager r0 = r2.A00
            if (r0 == 0) goto L_0x018e
            X.2ye r0 = r0.A00()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x016e
            r0 = 1
            if (r12 != 0) goto L_0x016f
        L_0x016e:
            r0 = 0
        L_0x016f:
            r2.A0G = r0
            r2.A0H = r0
            X.5de r1 = r2.A03
            java.lang.String r0 = "statusDistributionInfo"
            if (r1 != 0) goto L_0x017e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x017e:
            int r6 = r1.A00
            java.util.List r4 = r1.A01
            java.util.List r5 = r1.A02
            boolean r7 = r1.A03
            X.5de r3 = new X.5de
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A03 = r3
            return
        L_0x018e:
            java.lang.String r0 = "wfalManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0195:
            java.lang.Object r2 = r10.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            X.2rK r1 = r2.A0C
            if (r1 == 0) goto L_0x01cf
            X.21S r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0K
            java.lang.Boolean r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x01b0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            boolean r1 = X.C162457s7.A0P(r0, r1)
            r0 = 0
            if (r1 != 0) goto L_0x01b1
        L_0x01b0:
            r0 = 1
        L_0x01b1:
            r2.A0G = r0
            r2.A0H = r0
            X.5de r1 = r2.A03
            java.lang.String r0 = "statusDistributionInfo"
            if (r1 != 0) goto L_0x01c0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01c0:
            int r7 = r1.A00
            java.util.List r5 = r1.A01
            java.util.List r6 = r1.A02
            r9 = 0
        L_0x01c7:
            X.5de r4 = new X.5de
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A03 = r4
            return
        L_0x01cf:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01d6:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass693.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
