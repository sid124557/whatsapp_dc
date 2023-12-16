package X;

/* renamed from: X.6Bp  reason: invalid class name and case insensitive filesystem */
public class C124266Bp implements C84134Bd {
    public Object A00;
    public final int A01;

    public C124266Bp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass3XA r1, Object obj, int i) {
        r1.A03(new C124266Bp(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ea, code lost:
        if (r5.A0O.A0C(r4) == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f5, code lost:
        r5.Boo(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0260, code lost:
        X.C18260x0.A1P(r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0263, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x0039;
                case 2: goto L_0x020d;
                case 3: goto L_0x0057;
                case 4: goto L_0x0078;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00e6;
                case 7: goto L_0x0230;
                case 8: goto L_0x00f4;
                case 9: goto L_0x01b3;
                case 10: goto L_0x023c;
                case 11: goto L_0x024f;
                case 12: goto L_0x0258;
                case 13: goto L_0x0264;
                case 14: goto L_0x0270;
                case 15: goto L_0x0286;
                case 16: goto L_0x0290;
                case 17: goto L_0x030e;
                case 18: goto L_0x01f9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r9.A00
            com.whatsapp.settings.SettingsUserProxyViewModel r1 = (com.whatsapp.settings.SettingsUserProxyViewModel) r1
            int r0 = X.AnonymousClass001.A0K(r10)
            r1.A01 = r0
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r0 = r9.A00
            X.54D r0 = (X.AnonymousClass54D) r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r5 = r0.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            boolean r0 = r5.BHW()
            if (r0 != 0) goto L_0x000f
            X.1VX r4 = r5.A0D
            X.3ZH r0 = r5.A1K
            com.whatsapp.jid.UserJid r3 = X.C86604Kt.A0d(r0)
            java.lang.String r2 = "account_info_report"
            boolean r1 = r10.booleanValue()
            X.5XI r0 = new X.5XI
            r0.<init>(r4, r3, r2, r1)
            androidx.fragment.app.DialogFragment r0 = r0.A00()
            goto L_0x01f5
        L_0x0039:
            java.lang.Object r1 = r9.A00
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r1 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r1
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            X.4kb r0 = X.C91634kb.A00
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x000f
            com.google.android.material.textfield.TextInputEditText r0 = r1.A00
            if (r0 == 0) goto L_0x000f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x000f
            r0.clear()
            return
        L_0x0057:
            java.lang.Object r5 = r9.A00
            X.4Pe r5 = (X.AnonymousClass4Pe) r5
            boolean r4 = X.AnonymousClass001.A1Z(r10)
            X.4ea r0 = r5.getActivity()
            boolean r0 = r0.BHW()
            if (r0 != 0) goto L_0x000f
            X.1VX r3 = r5.getAbProps$community_consumerBeta()
            X.1fJ r2 = r5.A03
            if (r2 != 0) goto L_0x0316
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0078:
            java.lang.Object r6 = r9.A00
            X.4fT r6 = (X.C89904fT) r6
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            X.4FU r3 = r6.A05
            boolean r0 = r3.BHW()
            if (r0 != 0) goto L_0x000f
            X.1VX r5 = r6.A0R
            X.4uZ r4 = r6.A0V
            java.lang.String r1 = "overflow_menu_report"
            boolean r0 = r10.booleanValue()
            X.5XI r2 = new X.5XI
            r2.<init>(r5, r4, r1, r0)
            X.3ZH r0 = r6.A00
            X.4uZ r1 = r0.A0H
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00ab
            X.2ss r0 = r6.A0O
            X.31A r0 = X.C56982ss.A00(r0, r1)
            X.C626936e.A06(r0)
            X.1RL r0 = (X.AnonymousClass1RL) r0
            r2.A01(r0)
        L_0x00ab:
            X.2ss r1 = r6.A0O
            X.3ZH r0 = r6.A00
            X.4uZ r0 = r0.A0H
            boolean r0 = r1.A0N(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 0
            r2.A07 = r0
        L_0x00ba:
            androidx.fragment.app.DialogFragment r0 = r2.A00()
            r3.Boo(r0)
            return
        L_0x00c2:
            java.lang.Object r3 = r9.A00
            X.4mr r3 = (X.C92544mr) r3
            X.7O9 r10 = (X.AnonymousClass7O9) r10
            X.34x r0 = r10.A01
            X.2z0 r1 = r0.A1J
            android.widget.TextView r0 = r3.A04
            boolean r0 = X.C86664Kz.A1U(r0, r1)
            if (r0 == 0) goto L_0x000f
            int r2 = r10.A00
            X.5a1 r0 = r10.A04
            if (r0 != 0) goto L_0x00e1
            r1 = 0
        L_0x00db:
            java.util.List r0 = r10.A03
            r3.A23(r0, r2, r1)
            return
        L_0x00e1:
            java.lang.String r1 = r0.A03()
            goto L_0x00db
        L_0x00e6:
            java.lang.Object r1 = r9.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            boolean r0 = X.AnonymousClass001.A1Z(r10)
            if (r0 == 0) goto L_0x000f
            r1.run()
            return
        L_0x00f4:
            java.lang.Object r2 = r9.A00
            com.whatsapp.conversationslist.LockedConversationsFragment r2 = (com.whatsapp.conversationslist.LockedConversationsFragment) r2
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x032c
            X.5aW r0 = X.C86624Kv.A0O(r2)
            X.66R r0 = r0.A0I
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r0)
            java.lang.String r3 = "shouldWarnLeakyCompanionIfAdded"
            r1 = 0
            boolean r0 = r0.getBoolean(r3, r1)
            if (r0 == 0) goto L_0x032c
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x000f
            X.5aW r0 = X.C86624Kv.A0O(r2)
            r8 = 0
            X.66R r0 = r0.A0I
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A04(r0)
            X.C18270x1.A0l(r0, r3, r1)
            X.1VX r0 = r2.A24
            boolean r0 = X.C106545Zk.A02(r0)
            if (r0 == 0) goto L_0x018f
            r0 = 2131624352(0x7f0e01a0, float:1.8875881E38)
            android.view.View r3 = r2.A1t(r0)
            r0 = 2131427897(0x7f0b0239, float:1.8477423E38)
            android.view.View r6 = r3.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBanner r6 = (com.whatsapp.wds.components.banners.WDSBanner) r6
            if (r6 == 0) goto L_0x0188
            X.5OR r7 = new X.5OR
            r7.<init>()
            X.56a r0 = X.C995156a.A00
            r7.A02 = r0
            android.content.Context r5 = X.C18290x4.A0F(r6)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 2131888026(0x7f12079a, float:1.9410676E38)
            r4 = 2131888027(0x7f12079b, float:1.9410678E38)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            java.lang.String r1 = r5.getString(r1, r0)
            X.C162457s7.A0H(r1)
            java.lang.String r0 = X.C18290x4.A0l(r5, r4)
            android.text.Spanned r0 = X.AnonymousClass5VU.A01(r5, r1, r0)
            r7.A03 = r0
            X.5KM r0 = r7.A00()
            r6.setState(r0)
            X.5xD r0 = new X.5xD
            r0.<init>(r2)
            r6.setOnDismissListener((X.AnonymousClass4GP) r0)
            r0 = 31
            X.C18290x4.A1G(r6, r2, r0)
            boolean r0 = X.C1001059l.A03
            if (r0 != 0) goto L_0x018b
            r6.A06()
        L_0x0188:
            r2.A00 = r3
            return
        L_0x018b:
            r6.A05()
            goto L_0x0188
        L_0x018f:
            r0 = 2131624351(0x7f0e019f, float:1.887588E38)
            android.view.View r3 = r2.A1t(r0)
            r0 = 2131428798(0x7f0b05be, float:1.847925E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x01a4
            r0 = 32
            X.C18290x4.A1G(r1, r2, r0)
        L_0x01a4:
            r0 = 2131430948(0x7f0b0e24, float:1.8483611E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x0188
            r0 = 33
            X.C18290x4.A1G(r1, r2, r0)
            goto L_0x0188
        L_0x01b3:
            java.lang.Object r0 = r9.A00
            X.53w r0 = (X.C989553w) r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r5 = r0.A00
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            boolean r0 = r5.BHW()
            if (r0 != 0) goto L_0x000f
            X.3ZH r0 = r5.A19
            com.whatsapp.jid.Jid r4 = X.AnonymousClass3ZH.A04(r0)
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            X.1VX r3 = r5.A0D
            X.C626936e.A06(r4)
            java.lang.String r1 = "group_info_report"
            boolean r0 = r10.booleanValue()
            X.5XI r2 = new X.5XI
            r2.<init>(r3, r4, r1, r0)
            X.2ss r0 = r5.A0L
            boolean r0 = r0.A0N(r4)
            if (r0 == 0) goto L_0x01ec
            X.2sj r0 = r5.A0O
            boolean r1 = r0.A0C(r4)
            r0 = 1
            if (r1 != 0) goto L_0x01ed
        L_0x01ec:
            r0 = 0
        L_0x01ed:
            r0 = r0 ^ 1
            r2.A07 = r0
            androidx.fragment.app.DialogFragment r0 = r2.A00()
        L_0x01f5:
            r5.Boo(r0)
            return
        L_0x01f9:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsUserProxyViewModel r2 = (com.whatsapp.settings.SettingsUserProxyViewModel) r2
            int r1 = X.AnonymousClass001.A0K(r10)
            r0 = 2
            if (r1 != r0) goto L_0x0208
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x000f
        L_0x0208:
            r0 = 0
            r2.A0G(r1, r0)
            return
        L_0x020d:
            java.lang.Object r5 = r9.A00
            X.4VR r5 = (X.AnonymousClass4VR) r5
            X.08M r1 = r5.A0a
            r0 = 2
            X.C06270Wx.A04(r1, r0)
            X.08M r4 = r5.A0b
            java.lang.Object[] r3 = X.AnonymousClass4L0.A0U()
            r2 = 2131886394(0x7f12013a, float:1.9407366E38)
            r1 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.7KY r0 = new X.7KY
            r0.<init>(r3, r1, r2)
            r4.A0G(r0)
            r0 = 1
            r5.A0I(r0)
            return
        L_0x0230:
            java.lang.Object r1 = r9.A00
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r1 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r1
            boolean r0 = X.AnonymousClass001.A1Z(r10)
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity.A0C(r1, r0)
            return
        L_0x023c:
            java.lang.Object r2 = r9.A00
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/optimistic/uuid = "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; job="
            goto L_0x0260
        L_0x024f:
            java.lang.Object r2 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/optimistic/transcode finished; job="
            goto L_0x0260
        L_0x0258:
            java.lang.Object r2 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/optimistic/upload finished; job="
        L_0x0260:
            X.C18260x0.A1P(r1, r0, r2)
            return
        L_0x0264:
            java.lang.Object r1 = r9.A00
            X.4EV r1 = (X.AnonymousClass4EV) r1
            boolean r0 = X.AnonymousClass001.A1Z(r10)
            r1.BRW(r0)
            return
        L_0x0270:
            java.lang.Object r2 = r9.A00
            X.4EV r2 = (X.AnonymousClass4EV) r2
            android.util.Pair r10 = (android.util.Pair) r10
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            java.lang.Object r1 = r10.first
            X.35m r1 = (X.C625435m) r1
            java.lang.Object r0 = r10.second
            X.2sk r0 = (X.C56902sk) r0
            r2.BRX(r1, r0)
            return
        L_0x0286:
            java.lang.Object r0 = r9.A00
            X.1I5 r0 = (X.AnonymousClass1I5) r0
            java.lang.Integer r10 = (java.lang.Integer) r10
            r0.A0D(r10)
            return
        L_0x0290:
            java.lang.Object r3 = r9.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            android.net.Uri r10 = (android.net.Uri) r10
            X.3Wi r0 = r3.A0L
            r0.A0D()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "video/*"
            r2.setDataAndType(r10, r0)
            r0 = 1
            r2.setFlags(r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Sony"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02fd
            X.03q r0 = r3.A0R()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r0 = 0
            java.util.List r0 = r1.queryIntentActivities(r2, r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x02c5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02fd
            java.lang.Object r5 = r6.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaViewFragment/launchExternalVideoPlayer/share"
            r4.append(r0)
            android.content.pm.ActivityInfo r1 = r5.activityInfo
            java.lang.String r0 = r1.packageName
            r4.append(r0)
            java.lang.String r0 = " | "
            r4.append(r0)
            java.lang.String r0 = r1.name
            X.C18260x0.A1L(r4, r0)
            android.content.pm.ActivityInfo r0 = r5.activityInfo
            java.lang.String r0 = r0.name
            java.lang.String r1 = "com.sonyericsson.gallery.MovieView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02c5
            java.lang.String r0 = "com.sonyericsson.gallery"
            r2.setClassName(r0, r1)
            goto L_0x02c5
        L_0x02fd:
            android.content.Context r1 = r3.A0G()
            X.66p r0 = r3.A1E
            if (r0 == 0) goto L_0x0308
            r0.BWs()
        L_0x0308:
            X.5hX r0 = r3.A0H
            r0.A0A(r1, r2)
            return
        L_0x030e:
            java.lang.Object r0 = r9.A00
            X.0Wx r0 = (X.C06270Wx) r0
            r0.A0H(r10)
            return
        L_0x0316:
            java.lang.String r0 = "group_info_report"
            X.5XI r1 = new X.5XI
            r1.<init>(r3, r2, r0, r4)
            r0 = 0
            r1.A07 = r0
            androidx.fragment.app.DialogFragment r1 = r1.A00()
            X.4ea r0 = r5.getActivity()
            r0.Boo(r1)
            return
        L_0x032c:
            android.view.View r0 = r2.A00
            X.C18270x1.A0p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124266Bp.AwB(java.lang.Object):void");
    }
}
