package X;

import android.content.DialogInterface;

/* renamed from: X.4I8  reason: invalid class name */
public class AnonymousClass4I8 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4I8(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0152, code lost:
        r4.BkM(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0186, code lost:
        r4.A13.execute(new X.C117665sI(r4, r5, 13, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0192, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02de, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r6 = r16
            int r0 = r6.A02
            r3 = r18
            switch(r0) {
                case 0: goto L_0x0193;
                case 1: goto L_0x003a;
                case 2: goto L_0x01b0;
                case 3: goto L_0x01d6;
                case 4: goto L_0x0200;
                case 5: goto L_0x004a;
                case 6: goto L_0x020e;
                case 7: goto L_0x0227;
                case 8: goto L_0x005c;
                case 9: goto L_0x0238;
                case 10: goto L_0x0029;
                case 11: goto L_0x00e9;
                case 12: goto L_0x0261;
                case 13: goto L_0x0294;
                case 14: goto L_0x02a7;
                case 15: goto L_0x02b9;
                case 16: goto L_0x02d2;
                case 17: goto L_0x0124;
                case 18: goto L_0x02e2;
                case 19: goto L_0x0137;
                case 20: goto L_0x030d;
                case 21: goto L_0x0319;
                case 22: goto L_0x0325;
                case 23: goto L_0x016f;
                case 24: goto L_0x017b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r6.A00
            X.30E r4 = (X.AnonymousClass30E) r4
            java.lang.Object r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            com.whatsapp.bridge.wfal.WfalManager r0 = r4.A01
            X.30u r2 = r0.A02
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r0 = "e2ee_popup_fb_auto_crossposting"
            r2.A06(r0, r1)
            java.lang.String r0 = "e2ee_popup_ig_auto_crossposting"
            r2.A06(r0, r1)
            X.5Q7 r1 = r4.A03
            X.21T r0 = X.AnonymousClass21T.A02
            r1.A00(r3, r0)
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r2 = r6.A00
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r2 = (com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r2
            java.lang.Object r1 = r6.A01
            X.4FS r4 = r2.A06
            r0 = 30
            X.3bw r3 = new X.3bw
            r3.<init>(r2, r0, r1)
            goto L_0x0152
        L_0x003a:
            java.lang.Object r0 = r6.A00
            com.whatsapp.blocklist.UnblockDialogFragment r0 = (com.whatsapp.blocklist.UnblockDialogFragment) r0
            java.lang.Object r1 = r6.A01
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0028
            r1.finish()
            return
        L_0x004a:
            java.lang.Object r0 = r6.A00
            X.0eF r0 = (X.C08310eF) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.0eF r0 = r0.A0E
            if (r0 == 0) goto L_0x0028
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1u(r1)
            return
        L_0x005c:
            java.lang.Object r5 = r6.A00
            X.1Pd r5 = (X.C22681Pd) r5
            java.lang.Object r8 = r6.A01
            X.34x r8 = (X.C624134x) r8
            java.lang.String r0 = "scheduled-call/sendCancellationMessage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1VX r2 = r5.A0O
            r1 = 4164(0x1044, float:5.835E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00a0
            X.2z0 r3 = r8.A1J
            com.whatsapp.jid.UserJid r0 = r8.A0o()
            X.2kn r9 = new X.2kn
            r9.<init>(r0, r3)
            long r12 = r8.A1L
            X.4uZ r2 = X.AnonymousClass2z0.A01(r3)
            X.35J r1 = r5.A06
            boolean r0 = r3.A02
            X.2z0 r8 = r1.A04(r2, r0)
            X.2sH r0 = r5.A1E
            long r10 = r0.A0H()
            X.1mg r7 = new X.1mg
            r7.<init>(r8, r9, r10, r12)
            X.2iN r0 = r5.A05
            r0.A00(r7)
            return
        L_0x00a0:
            X.8qC r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.2Yi r1 = (X.C45012Yi) r1
            X.2sr r3 = r1.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r3)
            if (r0 == 0) goto L_0x0028
            X.35J r2 = r1.A01
            X.2z0 r7 = r8.A1J
            X.4uZ r1 = r7.A00
            boolean r0 = r7.A02
            X.2z0 r6 = r2.A04(r1, r0)
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r3)
            r3 = 1
            long r0 = r8.A0K
            X.1nX r2 = new X.1nX
            r2.<init>((X.AnonymousClass2z0) r6, (long) r0)
            boolean r1 = r6.A02
            r0 = 8
            if (r1 == 0) goto L_0x00cf
            r0 = 7
        L_0x00cf:
            r2.A01 = r0
            r2.A1J(r4)
            r2.A00 = r3
            java.lang.String r0 = r7.A01
            r2.A02 = r0
            if (r1 != 0) goto L_0x00e0
            X.4uZ r4 = r8.A0n()
        L_0x00e0:
            r2.A01 = r4
            X.30G r1 = r5.A02
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x00e9:
            java.lang.Object r4 = r6.A00
            X.1QH r4 = (X.AnonymousClass1QH) r4
            java.lang.Object r3 = r6.A01
            X.2z0 r3 = (X.AnonymousClass2z0) r3
            X.3Lv r0 = r4.A03
            X.34x r5 = X.C55832qz.A00(r0, r3)
            X.2Vt r2 = r4.A00
            java.lang.String r1 = "cta_cancel_reminder"
            java.lang.String r0 = "cta_reminder"
            r2.A00(r5, r1, r0)
            X.4uZ r2 = r3.A00
            X.4FS r1 = r4.A07
            r0 = 31
            X.C70333aK.A00(r1, r2, r4, r5, r0)
            X.2lH r4 = r4.A01
            if (r5 == 0) goto L_0x0028
            long r6 = r5.A1L
            X.33i r0 = r4.A01
            android.app.AlarmManager r1 = r0.A07()
            if (r1 == 0) goto L_0x0028
            r8 = 0
            android.app.PendingIntent r0 = r4.A00(r5, r6, r8)
            r1.cancel(r0)
            r0.cancel()
            return
        L_0x0124:
            java.lang.Object r2 = r6.A00
            com.whatsapp.invites.RevokeInviteDialogFragment r2 = (com.whatsapp.invites.RevokeInviteDialogFragment) r2
            java.lang.Object r1 = r6.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = -1
            if (r3 != r0) goto L_0x0028
            X.4Ac r0 = r2.A02
            if (r0 == 0) goto L_0x0028
            r0.Bad(r1)
            return
        L_0x0137:
            java.lang.Object r5 = r6.A00
            com.whatsapp.settings.SettingsUserProxyActivity r5 = (com.whatsapp.settings.SettingsUserProxyActivity) r5
            java.lang.Object r2 = r6.A01
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r0 = r2.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.4FS r4 = r5.A04
            if (r0 == 0) goto L_0x0156
            r0 = 18
            X.3bs r3 = new X.3bs
            r3.<init>((java.lang.Object) r5, (int) r0)
        L_0x0152:
            r4.BkM(r3)
            return
        L_0x0156:
            r1 = 38
            X.3a1 r0 = new X.3a1
            r0.<init>(r5, r1, r2)
            r4.BkM(r0)
            androidx.appcompat.widget.SwitchCompat r0 = r5.A05
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0028
            androidx.appcompat.widget.SwitchCompat r1 = r5.A05
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x016f:
            java.lang.Object r0 = r6.A00
            com.whatsapp.voipcalling.VoipActivityV2$RemoveUserConfirmationDialogFragment r0 = (com.whatsapp.voipcalling.VoipActivityV2.RemoveUserConfirmationDialogFragment) r0
            java.lang.Object r5 = r6.A01
            X.5b3 r4 = r0.A00
            if (r4 == 0) goto L_0x0028
            r3 = 0
            goto L_0x0186
        L_0x017b:
            java.lang.Object r0 = r6.A00
            com.whatsapp.voipcalling.VoipActivityV2$RemoveUserConfirmationDialogFragment r0 = (com.whatsapp.voipcalling.VoipActivityV2.RemoveUserConfirmationDialogFragment) r0
            java.lang.Object r5 = r6.A01
            X.5b3 r4 = r0.A00
            if (r4 == 0) goto L_0x0028
            r3 = 1
        L_0x0186:
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r4.A13
            r1 = 13
            X.5sI r0 = new X.5sI
            r0.<init>(r4, r5, r1, r3)
            r2.execute(r0)
            return
        L_0x0193:
            java.lang.Object r3 = r6.A00
            com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment r3 = (com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment) r3
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            X.3Lk r1 = r3.A01
            java.lang.String r0 = "30035737"
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            android.content.Intent r1 = X.C18310x6.A0D(r0)
            X.5hX r0 = r3.A00
            r0.A0A(r2, r1)
            r3.A1K()
            return
        L_0x01b0:
            java.lang.Object r4 = r6.A00
            X.0eF r4 = (X.C08310eF) r4
            java.lang.Object r1 = r6.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            android.content.Context r0 = r4.A0G()
            java.lang.String r3 = X.AnonymousClass3ZH.A08(r1)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.identity.IdentityVerificationActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r3)
            r4.A0m(r2)
            return
        L_0x01d6:
            java.lang.Object r4 = r6.A00
            com.whatsapp.community.CommunityDeleteDialogFragment r4 = (com.whatsapp.community.CommunityDeleteDialogFragment) r4
            java.lang.Object r6 = r6.A01
            java.util.List r6 = (java.util.List) r6
            X.03q r3 = r4.A0R()
            X.4ea r3 = (X.C89654ea) r3
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.Bp9(r0)
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.ref.WeakReference r5 = X.AnonymousClass0x9.A14(r3)
            X.4FS r1 = r4.A07
            X.1t7 r2 = new X.1t7
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.BkL(r2, r0)
            return
        L_0x0200:
            java.lang.Object r0 = r6.A00
            com.whatsapp.communitysuspend.CommunitySuspendDialogFragment r0 = (com.whatsapp.communitysuspend.CommunitySuspendDialogFragment) r0
            java.lang.Object r2 = r6.A01
            X.03q r2 = (X.C003203q) r2
            X.2nM r1 = r0.A00
            java.lang.String r0 = "community-no-longer-available"
            goto L_0x02de
        L_0x020e:
            java.lang.Object r3 = r6.A00
            X.0eF r3 = (X.C08310eF) r3
            java.lang.Object r2 = r6.A01
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            X.36r r1 = new X.36r
            r1.<init>()
            X.03q r0 = r3.A0Q()
            android.content.Intent r0 = r1.A1L(r0, r2)
            X.C57052sz.A00(r0, r3)
            return
        L_0x0227:
            java.lang.Object r3 = r6.A00
            X.33m r3 = (X.C621033m) r3
            java.lang.Object r2 = r6.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Integer r1 = X.C18290x4.A0a()
            r0 = 1
            r3.A0H(r2, r1, r0)
            return
        L_0x0238:
            java.lang.Object r3 = r6.A00
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = (com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r3
            java.lang.Object r2 = r6.A01
            android.net.Uri r2 = (android.net.Uri) r2
            r0 = 2
            X.1Yz r1 = r3.A0A
            if (r1 == 0) goto L_0x0250
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.4FV r0 = r3.A09
            r0.BhD(r1)
        L_0x0250:
            android.content.Intent r2 = X.C18310x6.A0D(r2)
            X.5hX r1 = r3.A00
            android.content.Context r0 = r3.A1D()
            r1.A0A(r0, r2)
            r3.A1L()
            return
        L_0x0261:
            java.lang.Object r1 = r6.A00
            X.1QL r1 = (X.AnonymousClass1QL) r1
            java.lang.Object r3 = r6.A01
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r0 = X.C107385bE.A0A()
            if (r0 == 0) goto L_0x0286
            X.33p r2 = r1.A09
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = r2.A2O(r1)
            if (r0 != 0) goto L_0x0286
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0 = 100
            com.whatsapp.RequestPermissionActivity.A0l(r2, r1)
            X.C005205m.A02(r3, r1, r0)
            return
        L_0x0286:
            boolean r0 = X.C107385bE.A04()
            if (r0 == 0) goto L_0x0290
            X.C107395bF.A06(r3)
            return
        L_0x0290:
            X.C107395bF.A05(r3)
            return
        L_0x0294:
            java.lang.Object r2 = r6.A00
            X.2zZ r2 = (X.C61022zZ) r2
            java.lang.Object r1 = r6.A01
            X.4ea r1 = (X.C89654ea) r1
            r0 = 2131887991(0x7f120777, float:1.9410605E38)
            r1.Bp9(r0)
            r0 = 0
            r2.A03(r0)
            return
        L_0x02a7:
            java.lang.Object r0 = r6.A00
            X.2zZ r0 = (X.C61022zZ) r0
            java.lang.Object r1 = r6.A01
            android.content.Context r1 = (android.content.Context) r1
            X.1fJ r0 = r0.A07
            android.content.Intent r0 = X.C627736r.A0T(r1, r0)
            r1.startActivity(r0)
            return
        L_0x02b9:
            java.lang.Object r3 = r6.A00
            com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog r3 = (com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog) r3
            java.lang.Object r2 = r6.A01
            X.03q r2 = (X.C003203q) r2
            X.2Zg r0 = r3.A00
            X.2nM r1 = r0.A01
            java.lang.String r0 = "group-no-longer-available"
            r1.A01(r2, r0)
            android.app.Dialog r0 = r3.A1I()
            r0.dismiss()
            return
        L_0x02d2:
            java.lang.Object r0 = r6.A00
            com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment r0 = (com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment) r0
            java.lang.Object r2 = r6.A01
            X.03q r2 = (X.C003203q) r2
            X.2nM r1 = r0.A00
            java.lang.String r0 = "invite-via-link-unavailable"
        L_0x02de:
            r1.A01(r2, r0)
            return
        L_0x02e2:
            java.lang.Object r0 = r6.A00
            com.whatsapp.phonematching.ConnectionUnavailableDialogFragment r0 = (com.whatsapp.phonematching.ConnectionUnavailableDialogFragment) r0
            java.lang.Object r4 = r6.A01
            X.4ea r4 = (X.C89654ea) r4
            r0.A1K()
            X.4FS r1 = r0.A06
            X.5WY r5 = r0.A00
            X.33i r7 = r0.A02
            X.2mi r10 = r0.A04
            X.5ZR r8 = r0.A03
            X.2sl r11 = r0.A05
            X.1ip r6 = r0.A01
            r13 = 1
            r15 = 0
            java.lang.String r12 = ""
            r3 = 0
            X.1tq r2 = new X.1tq
            r9 = r3
            r14 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String[] r0 = new java.lang.String[r15]
            r1.BkL(r2, r0)
            return
        L_0x030d:
            java.lang.Object r1 = r6.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = (com.whatsapp.status.StatusConfirmMuteDialogFragment) r0
            com.whatsapp.status.StatusConfirmMuteDialogFragment.A00(r1, r0)
            return
        L_0x0319:
            java.lang.Object r1 = r6.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = (com.whatsapp.status.StatusConfirmUnmuteDialogFragment) r0
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment.A00(r1, r0)
            return
        L_0x0325:
            java.lang.Object r7 = r6.A00
            com.whatsapp.voipcalling.ReplyWithMessageDialogFragment r7 = (com.whatsapp.voipcalling.ReplyWithMessageDialogFragment) r7
            java.lang.Object r1 = r6.A01
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.03q r5 = r7.A0R()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.C162457s7.A0K(r5, r0)
            X.4eZ r5 = (X.C89644eZ) r5
            int r0 = r1.length
            int r0 = r0 + -1
            if (r3 == r0) goto L_0x038e
            r2 = r1[r18]
        L_0x0340:
            X.36r r1 = new X.36r
            r1.<init>()
            com.whatsapp.jid.UserJid r0 = r7.A02
            r4 = 0
            android.content.Intent r3 = r1.A1O(r5, r0, r4)
            r1 = 1
            if (r2 == 0) goto L_0x0387
            java.lang.String r0 = "wa_type"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "share_msg"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "has_share"
            r3.putExtra(r0, r1)
            android.content.Context r0 = r7.A0G()
            X.C57352tV.A00(r0, r3)
        L_0x0367:
            X.7SF r2 = r7.A00
            if (r2 == 0) goto L_0x0398
            java.lang.String r1 = r7.A03
            X.C162457s7.A0J(r1, r4)
            r0 = 3
            r2.A00(r1, r0, r0)
            java.lang.String r1 = "ReplyWithMessageDialogFragment"
            X.2sH r0 = r7.A01
            if (r0 == 0) goto L_0x0390
            X.AnonymousClass5VI.A00(r3, r1)
            r5.startActivity(r3)
            X.4Bf r5 = (X.C84154Bf) r5
            r0 = 2
            r5.Bik(r0)
            return
        L_0x0387:
            java.lang.String r0 = "show_keyboard"
            r3.putExtra(r0, r1)
            goto L_0x0367
        L_0x038e:
            r2 = 0
            goto L_0x0340
        L_0x0390:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0398:
            java.lang.String r0 = "incomingCallLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4I8.onClick(android.content.DialogInterface, int):void");
    }
}
