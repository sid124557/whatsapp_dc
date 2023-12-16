package X;

import android.view.View;

/* renamed from: X.5eR  reason: invalid class name and case insensitive filesystem */
public class C109325eR implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109325eR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.4aS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.0zH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: com.whatsapp.chatlock.ChatLockSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: X.4aS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: X.4aS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0376, code lost:
        r4.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0379, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0496, code lost:
        r2.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0499, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04f2, code lost:
        r3.startActivityForResult(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f6, code lost:
        X.C86604Kt.A18(X.AnonymousClass002.A08(), r2, r3, "EXTRA_PARENT_GROUP_JID");
        r4.Boo(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0202, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x008a;
                case 1: goto L_0x048a;
                case 2: goto L_0x047e;
                case 3: goto L_0x006a;
                case 4: goto L_0x0476;
                case 5: goto L_0x0415;
                case 6: goto L_0x0396;
                case 7: goto L_0x032d;
                case 8: goto L_0x0005;
                case 9: goto L_0x0325;
                case 10: goto L_0x031d;
                case 11: goto L_0x0005;
                case 12: goto L_0x04d6;
                case 13: goto L_0x02f2;
                case 14: goto L_0x0005;
                case 15: goto L_0x04bd;
                case 16: goto L_0x04a4;
                case 17: goto L_0x04a4;
                case 18: goto L_0x02ce;
                case 19: goto L_0x003c;
                case 20: goto L_0x0297;
                case 21: goto L_0x028f;
                case 22: goto L_0x000e;
                case 23: goto L_0x0285;
                case 24: goto L_0x0279;
                case 25: goto L_0x0241;
                case 26: goto L_0x0239;
                case 27: goto L_0x022c;
                case 28: goto L_0x0203;
                case 29: goto L_0x028f;
                case 30: goto L_0x01e1;
                case 31: goto L_0x01cb;
                case 32: goto L_0x028f;
                case 33: goto L_0x01c1;
                case 34: goto L_0x01b5;
                case 35: goto L_0x0190;
                case 36: goto L_0x0168;
                case 37: goto L_0x0155;
                case 38: goto L_0x014d;
                case 39: goto L_0x0123;
                case 40: goto L_0x0114;
                case 41: goto L_0x010c;
                case 42: goto L_0x0104;
                case 43: goto L_0x00fc;
                case 44: goto L_0x00f2;
                case 45: goto L_0x00ea;
                case 46: goto L_0x00de;
                case 47: goto L_0x00d7;
                case 48: goto L_0x00ca;
                case 49: goto L_0x00a7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A00
            X.7l7 r1 = (X.C159097l7) r1
            r0 = 3
            r1.A08(r0)
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r3 = r10.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            boolean r0 = r3.A12
            if (r0 != 0) goto L_0x000d
            X.2sj r1 = r3.A0f
            X.1fJ r0 = r3.A0p
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x049a
            android.content.Context r0 = r11.getContext()
            X.1fJ r2 = r3.A0p
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.EditCommunityActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "extra_community_jid"
            X.C627336j.A0D(r4, r2, r0)
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x04f2
        L_0x003c:
            java.lang.Object r7 = r10.A00
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r7 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r7
            X.5J5 r1 = r7.A02
            if (r1 == 0) goto L_0x000d
            java.lang.String r6 = r7.A05
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.3XA r5 = new X.3XA
            r5.<init>()
            X.5k2 r4 = r1.A03
            X.8qC r0 = r4.A04
            java.lang.Object r3 = r0.get()
            X.5To r3 = (X.C105095To) r3
            X.64p r2 = r1.A02
            X.4eZ r1 = r1.A01
            X.63N r0 = new X.63N
            r0.<init>(r1, r5, r2, r4)
            r3.A01(r6, r0)
            r0 = 1
            X.C124266Bp.A00(r5, r7, r0)
            return
        L_0x006a:
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            com.whatsapp.pnh.RequestPhoneNumberViewModel r0 = r1.A0a
            if (r0 == 0) goto L_0x000d
            X.2nX r2 = r1.A0Z
            if (r2 == 0) goto L_0x000d
            X.3ZH r0 = r1.A0S
            if (r0 == 0) goto L_0x000d
            X.4uZ r1 = r0.A0H
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x000d
            X.1fH r1 = (X.C27981fH) r1
            java.lang.Integer r0 = X.C18280x3.A0S()
            r2.A00(r1, r0)
            return
        L_0x008a:
            java.lang.Object r1 = r10.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            X.9Sp r2 = r1.A0W
            if (r2 == 0) goto L_0x000d
            X.3ZH r0 = r1.A0S
            if (r0 == 0) goto L_0x000d
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A03(r0)
            r4 = 0
            int r7 = r1.A00
            java.lang.String r6 = "contact_card"
            r8 = 1
            r5 = r4
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x00a7:
            java.lang.Object r0 = r10.A00
            X.4R9 r0 = (X.AnonymousClass4R9) r0
            X.5hX r3 = r0.getActivityUtils$community_consumerBeta()
            android.content.Context r2 = r0.getContext()
            android.content.Context r1 = r0.getContext()
            X.1fJ r0 = r0.A02
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "parentJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00c2:
            android.content.Intent r0 = X.C627736r.A0h(r1, r0)
            r3.A0A(r2, r0)
            return
        L_0x00ca:
            java.lang.Object r0 = r10.A00
            X.4Rd r0 = (X.AnonymousClass4Rd) r0
            X.4VM r0 = r0.A0K
            X.4UC r1 = r0.A03
            r0 = 1
            X.C06270Wx.A04(r1, r0)
            return
        L_0x00d7:
            java.lang.Object r0 = r10.A00
            X.5Re r0 = (X.C104495Re) r0
            X.4GP r0 = r0.A01
            goto L_0x00f8
        L_0x00de:
            java.lang.Object r0 = r10.A00
            X.5St r0 = (X.C104895St) r0
            X.4GQ r1 = r0.A02
            com.whatsapp.jid.GroupJid r0 = r0.A01
            r1.invoke(r0)
            return
        L_0x00ea:
            java.lang.Object r0 = r10.A00
            X.12k r0 = (X.C197512k) r0
            r0.A07()
            return
        L_0x00f2:
            java.lang.Object r0 = r10.A00
            X.5Rf r0 = (X.C104505Rf) r0
            X.4GP r0 = r0.A00
        L_0x00f8:
            r0.invoke()
            return
        L_0x00fc:
            java.lang.Object r0 = r10.A00
            X.2n2 r0 = (X.C53402n2) r0
            X.C19390zT.setupButtons$lambda$9(r0, r11)
            return
        L_0x0104:
            java.lang.Object r0 = r10.A00
            X.2n2 r0 = (X.C53402n2) r0
            X.C19390zT.setupButtons$lambda$8(r0, r11)
            return
        L_0x010c:
            java.lang.Object r0 = r10.A00
            X.2n2 r0 = (X.C53402n2) r0
            X.C19390zT.setupButtons$lambda$7(r0, r11)
            return
        L_0x0114:
            java.lang.Object r0 = r10.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r2 = r0.A74()
            X.20r r1 = X.C370320r.APPROVE
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x0123:
            java.lang.Object r3 = r10.A00
            X.00M r3 = (X.AnonymousClass00M) r3
            X.0zH r4 = X.AnonymousClass5V0.A00(r3)
            r0 = 2131893001(0x7f121b09, float:1.9420766E38)
            r4.A0U(r0)
            r0 = 2131893000(0x7f121b08, float:1.9420764E38)
            r4.A0T(r0)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 0
            r4.A0c(r3, r0, r1)
            r2 = 2131890655(0x7f1211df, float:1.9416008E38)
            r1 = 49
            X.4K2 r0 = new X.4K2
            r0.<init>(r3, r1)
            r4.A0d(r3, r0, r2)
            goto L_0x0376
        L_0x014d:
            java.lang.Object r0 = r10.A00
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = (com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r0
            r0.A74()
            return
        L_0x0155:
            java.lang.Object r0 = r10.A00
            X.4cI r0 = (X.C89334cI) r0
            X.5QY r0 = r0.A01
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = "mediaVisibilityInfoUpdateHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0164:
            r0.A00()
            return
        L_0x0168:
            java.lang.Object r1 = r10.A00
            X.1Np r1 = (X.AnonymousClass1Np) r1
            X.3ZH r2 = r1.A74()
            com.whatsapp.WaEditText r0 = r1.A08
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r2.A0P = r0
        L_0x0182:
            X.1m3 r0 = r1.A0F
            r6 = 1
            r3 = 64206(0xface, float:8.9972E-41)
            r4 = 2
            r7 = 0
            r5 = -1
            r8 = r7
            r0.A08(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0190:
            java.lang.Object r0 = r10.A00
            com.whatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.whatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.4UI r3 = r0.A01
            X.2so r2 = r3.A02
            X.1fJ r1 = r3.A00
            r0 = 1
            r2.A0B(r1, r0)
            r1 = 3
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "dialogAction"
            r2.putInt(r0, r1)
            java.lang.String r1 = "parentGroupJid"
            X.1fJ r0 = r3.A00
            r2.putParcelable(r1, r0)
            X.08M r0 = r3.A01
            r0.A0G(r2)
            return
        L_0x01b5:
            java.lang.Object r0 = r10.A00
            com.whatsapp.community.NewCommunityActivity r0 = (com.whatsapp.community.NewCommunityActivity) r0
            X.4FS r1 = r0.A04
            java.lang.Runnable r0 = r0.A0P
            r1.BkM(r0)
            return
        L_0x01c1:
            java.lang.Object r0 = r10.A00
            X.4kg r0 = (X.C91664kg) r0
            java.lang.Runnable r0 = r0.A00
            r0.run()
            return
        L_0x01cb:
            java.lang.Object r4 = r10.A00
            com.whatsapp.community.CommunitySettingsActivity r4 = (com.whatsapp.community.CommunitySettingsActivity) r4
            X.66R r0 = r4.A0M
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r2 = new com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet
            r2.<init>()
            goto L_0x01f6
        L_0x01e1:
            java.lang.Object r4 = r10.A00
            com.whatsapp.community.CommunitySettingsActivity r4 = (com.whatsapp.community.CommunitySettingsActivity) r4
            X.66R r0 = r4.A0M
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r2 = new com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet
            r2.<init>()
        L_0x01f6:
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "EXTRA_PARENT_GROUP_JID"
            X.C86604Kt.A18(r1, r2, r3, r0)
            r4.Boo(r2)
            return
        L_0x0203:
            java.lang.Object r1 = r10.A00
            com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet r1 = (com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet) r1
            X.3Ej r3 = r1.A06
            if (r3 == 0) goto L_0x0225
            android.content.Context r0 = r1.A1D()
            android.app.Activity r2 = X.C111095hX.A00(r0)
            X.07r r2 = (X.C009707r) r2
            X.66R r0 = r1.A0O
            java.lang.Object r1 = r0.getValue()
            X.1fJ r1 = (X.C27991fJ) r1
            java.lang.Integer r0 = X.AnonymousClass0x7.A0h()
            r3.A03(r2, r1, r0)
            return
        L_0x0225:
            java.lang.String r0 = "communityNavigator"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x022c:
            java.lang.Object r3 = r10.A00
            com.whatsapp.community.CommunityNavigationActivity r3 = (com.whatsapp.community.CommunityNavigationActivity) r3
            X.3Ej r2 = r3.A0B
            X.1fJ r1 = r3.A0b
            r0 = 0
            r2.A03(r3, r1, r0)
            return
        L_0x0239:
            java.lang.Object r0 = r10.A00
            com.whatsapp.community.CommunityNUXActivity r0 = (com.whatsapp.community.CommunityNUXActivity) r0
            com.whatsapp.community.CommunityNUXActivity.A0C(r0)
            return
        L_0x0241:
            java.lang.Object r3 = r10.A00
            com.whatsapp.community.CommunityNUXActivity r3 = (com.whatsapp.community.CommunityNUXActivity) r3
            X.2bU r0 = r3.A01
            java.lang.String r9 = r0.A00()
            X.2bU r0 = r3.A01
            java.lang.Integer r7 = r0.A02
            X.33U r4 = r3.A02
            java.lang.Integer r5 = X.C18280x3.A0S()
            java.lang.Integer r6 = X.C18290x4.A0a()
            r8 = 0
            r4.A08(r5, r6, r7, r8, r9)
            boolean r1 = X.AnonymousClass000.A1W(r7)
            java.lang.String r0 = "Creation Entrypoint should not be null"
            X.C626936e.A0D(r1, r0)
            X.3Ej r2 = r3.A00
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "CommunityNUXActivity_group_to_be_added"
            X.1fJ r0 = X.C86634Kw.A0k(r1, r0)
            r2.Bpi(r3, r0, r6, r7)
            r3.finish()
            return
        L_0x0279:
            java.lang.Object r2 = r10.A00
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.2nM r1 = r2.A03
            java.lang.String r0 = "community-examples-article"
            r1.A01(r2, r0)
            return
        L_0x0285:
            java.lang.Object r0 = r10.A00
            X.4Ys r0 = (X.C88434Ys) r0
            android.view.ViewGroup r0 = r0.A00
            r0.showContextMenu()
            return
        L_0x028f:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x0297:
            java.lang.Object r6 = r10.A00
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r6 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r6
            X.5J5 r0 = r6.A02
            if (r0 == 0) goto L_0x02c3
            X.5k2 r5 = r0.A03
            X.4eZ r4 = r0.A01
            int r3 = r0.A00
            X.3Eb r2 = new X.3Eb
            r2.<init>(r4, r5, r3)
            r0 = 1
            X.4Hu r1 = new X.4Hu
            r1.<init>(r2, r4, r5, r0)
            com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog r0 = new com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog
            r0.<init>(r1, r3)
            r4.Boo(r0)
            r5.Aya()
            X.5UK r2 = r5.A02
            r1 = 0
            r0 = 15
            r2.A04(r1, r1, r1, r0)
        L_0x02c3:
            X.5UK r2 = r6.A06
            java.lang.Integer r1 = X.C18280x3.A0S()
            r0 = 0
            r2.A05(r0, r1)
            return
        L_0x02ce:
            java.lang.Object r5 = r10.A00
            com.whatsapp.chatlock.dialogs.ChatLockQuickAddHelperBottomSheet r5 = (com.whatsapp.chatlock.dialogs.ChatLockQuickAddHelperBottomSheet) r5
            r0 = 1
            r5.A08 = r0
            X.5UK r4 = r5.A03
            if (r4 == 0) goto L_0x02eb
            X.4uZ r3 = r5.A05
            int r0 = r5.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 12
            r4.A04(r3, r2, r1, r0)
            r5.A1K()
            return
        L_0x02eb:
            java.lang.String r0 = "chatLockLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02f2:
            java.lang.Object r5 = r10.A00
            com.whatsapp.chatlock.ChatLockSettingsActivity r5 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r5
            r4 = 0
            r3 = 1
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r3)
            r5.startActivityForResult(r2, r4)
            X.5UK r1 = r5.A05
            if (r1 == 0) goto L_0x0316
            r0 = 3
            r1.A00(r0)
            return
        L_0x0316:
            java.lang.String r0 = "chatLockLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x031d:
            java.lang.Object r0 = r10.A00
            com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity r0 = (com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity) r0
            r0.A74()
            return
        L_0x0325:
            java.lang.Object r0 = r10.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x032d:
            java.lang.Object r3 = r10.A00
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r3 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r3
            X.5UK r2 = r3.A03
            if (r2 == 0) goto L_0x038f
            java.lang.Integer r1 = X.C18290x4.A0b()
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r2.A05(r1, r0)
            X.5aW r0 = r3.A01
            if (r0 == 0) goto L_0x0388
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x037a
            r0 = 2132084201(0x7f1505e9, float:1.9808566E38)
            X.4aS r4 = new X.4aS
            r4.<init>(r3, r0)
            r0 = 2131893398(0x7f121c96, float:1.9421571E38)
            r4.A0V(r0)
            r0 = 2131893399(0x7f121c97, float:1.9421573E38)
            r4.A0U(r0)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 2
            X.69A r0 = new X.69A
            r0.<init>(r1)
            r4.A0W(r0, r2)
            r1 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r0 = 19
            X.68t r0 = X.C1235268t.A00(r3, r0)
            r4.A0X(r0, r1)
        L_0x0376:
            r4.A0S()
            return
        L_0x037a:
            r2 = 0
            X.5To r1 = r3.A75()
            X.62q r0 = new X.62q
            r0.<init>(r3, r2)
            r1.A02(r0)
            return
        L_0x0388:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x038f:
            java.lang.String r0 = "chatLockLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0396:
            java.lang.Object r4 = r10.A00
            X.4d8 r4 = (X.C89524d8) r4
            r3 = 0
            X.5To r1 = r4.A75()
            java.lang.String r0 = r4.A77()
            X.5AU r1 = r1.A00(r0)
            boolean r0 = r1 instanceof X.C91634kb
            if (r0 == 0) goto L_0x03e3
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r7 = "entrypoint"
            r2 = 0
            int r1 = r0.getIntExtra(r7, r3)
            r0 = 2
            r6 = 1
            if (r1 != r0) goto L_0x03bb
            r2 = 1
        L_0x03bb:
            java.lang.String r5 = r4.A77()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_secret_code"
            r2.putExtra(r0, r5)
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x03df
            r0 = 2
            r2.putExtra(r7, r0)
        L_0x03df:
            r4.startActivityForResult(r2, r6)
            return
        L_0x03e3:
            boolean r0 = r1 instanceof X.C91614kZ
            if (r0 == 0) goto L_0x0406
            com.google.android.material.textfield.TextInputLayout r3 = r4.A74()
            X.4kZ r1 = (X.C91614kZ) r1
            int r2 = r1.A00
            r0 = 5
            r1 = 2131888359(0x7f1208e7, float:1.9411351E38)
            if (r2 == r0) goto L_0x03fe
            r0 = 6
            r1 = 2131888358(0x7f1208e6, float:1.941135E38)
            if (r2 == r0) goto L_0x03fe
            r1 = 2131888357(0x7f1208e5, float:1.9411347E38)
        L_0x03fe:
            java.lang.String r0 = r4.getString(r1)
            r3.setError(r0)
            return
        L_0x0406:
            com.google.android.material.textfield.TextInputLayout r1 = r4.A74()
            r0 = 2131888357(0x7f1208e5, float:1.9411347E38)
            java.lang.String r0 = r4.getString(r0)
            r1.setError(r0)
            return
        L_0x0415:
            java.lang.Object r2 = r10.A00
            com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity r2 = (com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity) r2
            java.lang.String r0 = r2.A03
            java.lang.String r1 = "correctSecretCode"
            if (r0 != 0) goto L_0x0424
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0424:
            int r0 = r0.length()
            X.5To r7 = r2.A75()
            if (r0 <= 0) goto L_0x0469
            java.lang.String r6 = r2.A03
            if (r6 != 0) goto L_0x0437
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0437:
            java.lang.String r1 = r2.A77()
            X.60Z r5 = new X.60Z
            r5.<init>(r2)
            java.lang.String r0 = "ChatLockPasscodeManager/setPasscode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x045a
            java.lang.String r0 = "ChatLockPasscodeManager/setPasscode: Passcodes don't match"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 3
            X.4kZ r0 = new X.4kZ
            r0.<init>(r1)
            r5.invoke(r0)
            return
        L_0x045a:
            X.4C6 r4 = r7.A07
            X.3gB r3 = r7.A06
            r2 = 0
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1 r1 = new com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1
            r1.<init>(r7, r6, r2, r5)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x0469:
            java.lang.String r1 = r2.A77()
            X.60Z r0 = new X.60Z
            r0.<init>(r2)
            r7.A01(r1, r0)
            return
        L_0x0476:
            java.lang.Object r0 = r10.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.onBackPressed()
            return
        L_0x047e:
            java.lang.Object r2 = r10.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.2on r1 = r2.A0b
            r0 = 7
            r1.A01(r0)
            r0 = 1
            goto L_0x0496
        L_0x048a:
            java.lang.Object r2 = r10.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.2on r1 = r2.A0b
            r0 = 8
            r1.A01(r0)
            r0 = 0
        L_0x0496:
            r2.A04(r0)
            return
        L_0x049a:
            X.3Wi r2 = r3.A05
            r1 = 2131889322(0x7f120caa, float:1.9413304E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x04a4:
            java.lang.Object r3 = r10.A00
            X.4el r3 = (X.C89704el) r3
            r2 = 2
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r4.putExtra(r0, r2)
            r0 = 0
            goto L_0x04f2
        L_0x04bd:
            java.lang.Object r3 = r10.A00
            X.4el r3 = (X.C89704el) r3
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity"
            r4.setClassName(r1, r0)
            java.lang.String r1 = "entrypoint"
            r0 = 2
            r4.putExtra(r1, r0)
            r0 = 1
            goto L_0x04f2
        L_0x04d6:
            java.lang.Object r3 = r10.A00
            com.whatsapp.chatlock.ChatLockSettingsActivity r3 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r3
            X.5aW r0 = r3.A74()
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x04f6
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.HideLockedChatsActivity"
            r4.setClassName(r1, r0)
            r0 = 2
        L_0x04f2:
            r3.startActivityForResult(r4, r0)
            return
        L_0x04f6:
            r0 = 2132084201(0x7f1505e9, float:1.9808566E38)
            X.4aS r4 = new X.4aS
            r4.<init>(r3, r0)
            r0 = 2131894494(0x7f1220de, float:1.9423794E38)
            r4.A0V(r0)
            r0 = 2131894493(0x7f1220dd, float:1.9423792E38)
            r4.A0U(r0)
            r2 = 2131894492(0x7f1220dc, float:1.942379E38)
            r1 = 36
            X.4Hr r0 = new X.4Hr
            r0.<init>(r3, r1)
            r4.A0X(r0, r2)
            r2 = 2131887658(0x7f12062a, float:1.940993E38)
            r1 = 3
            X.69A r0 = new X.69A
            r0.<init>(r1)
            r4.A0W(r0, r2)
            X.C18280x3.A0q(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109325eR.onClick(android.view.View):void");
    }
}
