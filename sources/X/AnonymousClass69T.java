package X;

import android.content.DialogInterface;

/* renamed from: X.69T  reason: invalid class name */
public class AnonymousClass69T implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass69T(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r4.BkM(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0235, code lost:
        r3.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0238, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02a3, code lost:
        X.C06270Wx.A03(r1, r0);
        r8.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02a9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x02aa;
                case 2: goto L_0x0290;
                case 3: goto L_0x0277;
                case 4: goto L_0x0267;
                case 5: goto L_0x0239;
                case 6: goto L_0x0045;
                case 7: goto L_0x0022;
                case 8: goto L_0x0228;
                case 9: goto L_0x0211;
                case 10: goto L_0x01e9;
                case 11: goto L_0x01dd;
                case 12: goto L_0x01d1;
                case 13: goto L_0x01c5;
                case 14: goto L_0x01b9;
                case 15: goto L_0x01a2;
                case 16: goto L_0x0172;
                case 17: goto L_0x0032;
                case 18: goto L_0x0166;
                case 19: goto L_0x015a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r7.A00
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            java.lang.Object r0 = r7.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.2sq r1 = r2.A0O
            com.whatsapp.jid.UserJid r0 = X.C86604Kt.A0d(r0)
            r1.A0G(r2, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A00(r2, r0)
            com.whatsapp.mentions.MentionableEntry r1 = r2.A0t
            r0 = 1
            r1.A07(r0)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r2 = r7.A00
            X.5Qi r2 = (X.C104275Qi) r2
            java.lang.Object r1 = r7.A01
            X.4FS r4 = r2.A06
            r0 = 20
            X.5rT r3 = new X.5rT
            r3.<init>(r1, r0, r2)
            goto L_0x0056
        L_0x0032:
            java.lang.Object r2 = r7.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r7.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 124(0x7c, float:1.74E-43)
            X.C621433s.A00(r2, r0)
            if (r1 == 0) goto L_0x0021
            r1.run()
            return
        L_0x0045:
            java.lang.Object r2 = r7.A00
            java.lang.Object r1 = r7.A01
            X.1QL r1 = (X.AnonymousClass1QL) r1
            if (r2 == 0) goto L_0x0021
            X.4FS r4 = r1.A0F
            r0 = 45
            X.3bw r3 = new X.3bw
            r3.<init>(r1, r0, r2)
        L_0x0056:
            r4.BkM(r3)
            return
        L_0x005a:
            java.lang.Object r2 = r7.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r2.get(r9)
            X.5Mr r0 = (X.C103385Mr) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x00c1
            java.lang.Object r4 = r7.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r4 = (com.whatsapp.PhoneHyperLinkDialogFragment) r4
            X.2Xs r3 = r4.A07
            boolean r0 = r4.A0C
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r4.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 6
            r3.A00(r2, r1, r0)
            X.3Ex r1 = r4.A05
            com.whatsapp.jid.UserJid r0 = r4.A08
            X.3ZH r2 = X.C64773Ex.A00(r1, r0)
            X.36r r1 = X.C86664Kz.A1B()
            android.content.Context r0 = r4.A0G()
            android.content.Intent r3 = r1.A1L(r0, r2)
            java.lang.String r1 = "args_conversation_screen_entry_point"
            r0 = 7
            r3.putExtra(r1, r0)
            boolean r1 = r4.A0E
            java.lang.String r0 = "isWAAccount"
            r3.putExtra(r0, r1)
            boolean r1 = r4.A0C
            java.lang.String r0 = "isPhoneNumberOwner"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "entry_point_conversion_source"
            java.lang.String r0 = "phone_number_hyperlink"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = "whatsapp"
            r3.putExtra(r1, r0)
            X.5hX r2 = r4.A00
            android.content.Context r1 = r4.A0G()
            java.lang.String r0 = com.whatsapp.PhoneHyperLinkDialogFragment.A0F
            r2.A0C(r1, r3, r0)
            return
        L_0x00c1:
            java.lang.Object r0 = r2.get(r9)
            X.5Mr r0 = (X.C103385Mr) r0
            int r0 = r0.A00
            r3 = 0
            r4 = 4
            if (r0 != r4) goto L_0x00f8
            java.lang.Object r5 = r7.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r5 = (com.whatsapp.PhoneHyperLinkDialogFragment) r5
            X.2Xs r4 = r5.A07
            boolean r0 = r5.A0C
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r5.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 10
            r4.A00(r2, r1, r0)
            X.3Ex r1 = r5.A05
            com.whatsapp.jid.UserJid r0 = r5.A08
            X.3ZH r4 = X.C64773Ex.A00(r1, r0)
            X.66r r2 = r5.A04
            android.content.Context r1 = r5.A0G()
            r0 = 33
            r2.Bpk(r1, r4, r0, r3)
            return
        L_0x00f8:
            java.lang.Object r0 = r2.get(r9)
            X.5Mr r0 = (X.C103385Mr) r0
            int r1 = r0.A00
            r0 = 2
            r6 = 0
            if (r1 != r0) goto L_0x0129
            java.lang.Object r3 = r7.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r3 = (com.whatsapp.PhoneHyperLinkDialogFragment) r3
            X.2Xs r2 = r3.A07
            boolean r0 = r3.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A0E
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00(r1, r0, r4)
            X.4Fm r2 = r3.A02
            android.content.Context r1 = r3.A0G()
            java.lang.String r0 = r3.A0B
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.BkW(r1, r0, r6)
            return
        L_0x0129:
            java.lang.Object r0 = r2.get(r9)
            X.5Mr r0 = (X.C103385Mr) r0
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0021
            java.lang.Object r5 = r7.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r5 = (com.whatsapp.PhoneHyperLinkDialogFragment) r5
            X.2Xs r4 = r5.A07
            boolean r0 = r5.A0C
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r5.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 5
            r4.A00(r2, r1, r0)
            X.5Xw r1 = r5.A09
            java.lang.String r0 = r5.A0A
            r2 = 1
            android.content.Intent r1 = r1.A03(r0, r6, r2, r3)
            java.lang.String r0 = "finishActivityOnSaveCompleted"
            r1.putExtra(r0, r2)
            goto L_0x02bc
        L_0x015a:
            java.lang.Object r1 = r7.A00
            X.55s r1 = (X.C994355s) r1
            java.lang.Object r0 = r7.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C994355s.A01(r0, r1)
            return
        L_0x0166:
            java.lang.Object r1 = r7.A00
            X.55s r1 = (X.C994355s) r1
            java.lang.Object r0 = r7.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C994355s.A02(r0, r1)
            return
        L_0x0172:
            java.lang.Object r0 = r7.A00
            X.5N9 r0 = (X.AnonymousClass5N9) r0
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            X.2i5 r0 = r0.A00
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = X.C18310x6.A0D(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r2.queryIntentActivities(r1, r0)
            X.C162457s7.A0D(r0)
            boolean r0 = X.C18310x6.A1X(r0)
            if (r0 == 0) goto L_0x019a
            r3.startActivity(r1)
        L_0x019a:
            android.app.Activity r0 = X.C111095hX.A02(r3)
            r0.finish()
            return
        L_0x01a2:
            java.lang.Object r2 = r7.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r7.A01
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            java.lang.String r0 = "disable wifi radio"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 == 0) goto L_0x01b5
            r0 = 0
            r1.setWifiEnabled(r0)
        L_0x01b5:
            r2.finish()
            return
        L_0x01b9:
            java.lang.Object r1 = r7.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r7.A01
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog r0 = (com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog) r0
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog.A01(r1, r0)
            return
        L_0x01c5:
            java.lang.Object r1 = r7.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r7.A01
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog r0 = (com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog) r0
            com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog.A00(r1, r0)
            return
        L_0x01d1:
            java.lang.Object r1 = r7.A00
            com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment r1 = (com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment) r1
            java.lang.Object r0 = r7.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment.A01(r0, r1)
            return
        L_0x01dd:
            java.lang.Object r1 = r7.A00
            com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment r1 = (com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment) r1
            java.lang.Object r0 = r7.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.whatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment.A00(r0, r1)
            return
        L_0x01e9:
            java.lang.Object r6 = r7.A00
            com.whatsapp.dialogs.CreateOrAddToContactsDialog r6 = (com.whatsapp.dialogs.CreateOrAddToContactsDialog) r6
            java.lang.Object r1 = r7.A01
            java.util.List r1 = (java.util.List) r1
            X.8ra r0 = r6.A01
            X.C626936e.A06(r0)
            java.lang.Object r0 = r1.get(r9)
            X.7SJ r0 = (X.AnonymousClass7SJ) r0
            int r5 = r0.A00
            r4 = 2131431407(0x7f0b0fef, float:1.8484542E38)
            X.8ra r3 = r6.A01
            long r1 = r6.A00
            boolean r0 = r6.A02
            if (r5 != r4) goto L_0x020d
            r3.BQP(r1, r0)
            return
        L_0x020d:
            r3.BMB(r1, r0)
            return
        L_0x0211:
            java.lang.Object r3 = r7.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.Object r1 = r7.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.21R r0 = X.AnonymousClass21R.LEAVE_GROUPS
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.C57402ta.A01(r0, r1)
            X.0df r1 = r3.A0U()
            r0 = 0
            r2.A1O(r1, r0)
            goto L_0x0235
        L_0x0228:
            java.lang.Object r3 = r7.A00
            com.whatsapp.conversationslist.LeaveGroupsDialogFragment r3 = (com.whatsapp.conversationslist.LeaveGroupsDialogFragment) r3
            java.lang.Object r2 = r7.A01
            X.4FS r1 = r3.A0F
            r0 = 35
            X.C117155rT.A00(r1, r3, r2, r0)
        L_0x0235:
            r3.A1K()
            return
        L_0x0239:
            java.lang.Object r3 = r7.A00
            X.54F r3 = (X.AnonymousClass54F) r3
            java.lang.Object r2 = r7.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A00
            X.4mx r1 = (X.C92604mx) r1
            java.util.ArrayList r0 = r1.A0c
            int r0 = r0.size()
            java.lang.String r4 = X.AnonymousClass001.A0n(r2, r9)
            if (r9 >= r0) goto L_0x0263
            X.2nh r3 = r1.A07
            android.content.Context r2 = r1.getContext()
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r3.A01(r2, r1, r4, r0)
            return
        L_0x0263:
            r3.A09(r4)
            return
        L_0x0267:
            java.lang.Object r1 = r7.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r7.A01
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            android.content.Intent r0 = X.C627736r.A0T(r1, r0)
            r1.startActivity(r0)
            return
        L_0x0277:
            java.lang.Object r0 = r7.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.4U2 r2 = r0.A0N
            if (r2 != 0) goto L_0x0284
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0284:
            X.08M r1 = r2.A0N
            r0 = 1
            X.C06270Wx.A03(r1, r0)
            r2.A0M = r0
            X.08M r1 = r2.A0P
            r0 = 3
            goto L_0x02a3
        L_0x0290:
            java.lang.Object r0 = r7.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.4U2 r0 = r0.A0N
            if (r0 != 0) goto L_0x029d
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x029d:
            r0.A0J()
            X.08M r1 = r0.A0N
            r0 = 1
        L_0x02a3:
            X.C06270Wx.A03(r1, r0)
            r8.dismiss()
            return
        L_0x02aa:
            java.lang.Object r2 = r7.A00
            X.30z r2 = (X.C614930z) r2
            java.lang.Object r1 = r7.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)
            r2.A09(r1, r0)
            return
        L_0x02bc:
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x02c2 }
            goto L_0x02cb
        L_0x02c2:
            X.3Wi r1 = r5.A01
            r0 = 2131886316(0x7f1200ec, float:1.9407207E38)
            r1.A0H(r0, r3)
            return
        L_0x02cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69T.onClick(android.content.DialogInterface, int):void");
    }
}
