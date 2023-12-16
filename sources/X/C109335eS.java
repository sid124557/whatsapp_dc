package X;

import android.view.View;

/* renamed from: X.5eS  reason: invalid class name and case insensitive filesystem */
public class C109335eS implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109335eS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.whatsapp.contact.picker.PhoneContactsSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.4eX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: com.whatsapp.contact.picker.VoipContactPickerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: com.whatsapp.contact.picker.PhoneContactsSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: com.whatsapp.contact.picker.PhoneContactsSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0326, code lost:
        r1 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04a6, code lost:
        r1.A01(r2, java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04e0, code lost:
        r3.A19.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e4, code lost:
        r4 = X.C86604Kt.A0d(r2.A0L);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x014d;
                case 1: goto L_0x0157;
                case 2: goto L_0x0163;
                case 3: goto L_0x0189;
                case 4: goto L_0x0191;
                case 5: goto L_0x01d2;
                case 6: goto L_0x01f9;
                case 7: goto L_0x0207;
                case 8: goto L_0x0224;
                case 9: goto L_0x023e;
                case 10: goto L_0x02a7;
                case 11: goto L_0x02a7;
                case 12: goto L_0x0263;
                case 13: goto L_0x0281;
                case 14: goto L_0x029f;
                case 15: goto L_0x02a7;
                case 16: goto L_0x000d;
                case 17: goto L_0x02af;
                case 18: goto L_0x02b7;
                case 19: goto L_0x02ce;
                case 20: goto L_0x0041;
                case 21: goto L_0x0316;
                case 22: goto L_0x033a;
                case 23: goto L_0x0342;
                case 24: goto L_0x0072;
                case 25: goto L_0x034a;
                case 26: goto L_0x02a7;
                case 27: goto L_0x03f6;
                case 28: goto L_0x041b;
                case 29: goto L_0x0425;
                case 30: goto L_0x0088;
                case 31: goto L_0x043d;
                case 32: goto L_0x0450;
                case 33: goto L_0x0462;
                case 34: goto L_0x0477;
                case 35: goto L_0x0489;
                case 36: goto L_0x0495;
                case 37: goto L_0x049e;
                case 38: goto L_0x04ae;
                case 39: goto L_0x04b6;
                case 40: goto L_0x04e6;
                case 41: goto L_0x00af;
                case 42: goto L_0x04ff;
                case 43: goto L_0x00dc;
                case 44: goto L_0x010e;
                case 45: goto L_0x0509;
                case 46: goto L_0x0511;
                case 47: goto L_0x0519;
                case 48: goto L_0x011d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            r0.invoke(r9)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r5 = r8.A00
            com.whatsapp.components.GroupHistoryBottomSheet r5 = (com.whatsapp.components.GroupHistoryBottomSheet) r5
            android.content.Context r4 = r5.A1D()
            if (r4 == 0) goto L_0x000c
            X.3Lk r0 = r5.A01
            if (r0 == 0) goto L_0x0530
            java.lang.String r1 = "330159992681779"
            android.net.Uri r3 = r0.A03(r1)
            X.C162457s7.A0D(r3)
            X.3Lk r0 = r5.A01
            if (r0 == 0) goto L_0x0529
            android.net.Uri r0 = r0.A03(r1)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "intent: "
            X.C18260x0.A1R(r1, r0, r3)
            X.5hX r0 = r5.A00
            if (r0 == 0) goto L_0x0522
            r0.A0A(r4, r2)
            return
        L_0x0041:
            java.lang.Object r5 = r8.A00
            X.2Ts r5 = (X.C43852Ts) r5
            android.accounts.Account[] r0 = r5.A01
            if (r0 == 0) goto L_0x000c
            android.content.Context r4 = r5.A02
            r1 = 2132083979(0x7f15050b, float:1.9808116E38)
            X.00m r0 = new X.00m
            r0.<init>((android.content.Context) r4, (int) r1)
            X.0zH r3 = X.AnonymousClass5V0.A00(r0)
            r0 = 2131888135(0x7f120807, float:1.9410897E38)
            java.lang.String r0 = r4.getString(r0)
            r3.setTitle(r0)
            android.accounts.Account[] r7 = r5.A01
            int r2 = r7.length
            java.lang.String[] r6 = new java.lang.String[r2]
            r1 = 0
        L_0x0067:
            if (r1 >= r2) goto L_0x0537
            r0 = r7[r1]
            java.lang.String r0 = r0.name
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0072:
            java.lang.Object r2 = r8.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r2 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r2
            X.66R r0 = r2.A0N
            java.lang.Object r1 = r0.getValue()
            X.4uZ r1 = (X.C95814uZ) r1
            if (r1 == 0) goto L_0x000c
            X.5R0 r0 = r2.A0C
            if (r0 == 0) goto L_0x056d
            r0.A00(r2, r1)
            return
        L_0x0088:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            X.2WP r0 = r3.A24
            r2 = 3
            r0.A00(r2)
            X.03q r1 = r3.A0Q()
            r0 = 0
            android.content.Intent r0 = X.C627736r.A1A(r1, r0, r2)
            r1.startActivity(r0)
            X.C111355hx.A01(r3)
            X.5Tc r0 = r3.A1Q
            boolean r0 = X.C104985Tc.A00(r0)
            if (r0 == 0) goto L_0x000c
            X.5Tc r0 = r3.A1Q
            r0.A01()
            return
        L_0x00af:
            java.lang.Object r1 = r8.A00
            X.4mI r1 = (X.C92224mI) r1
            r0 = 1
            r1.A05(r0)
            X.2h6 r4 = r1.A08
            X.3ZH r1 = r1.A01
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            X.4uZ r1 = X.AnonymousClass3ZH.A02(r1, r0)
            X.2ss r0 = r4.A02
            X.31A r3 = X.C56982ss.A00(r0, r1)
            if (r3 == 0) goto L_0x000c
            r0 = -1
            r3.A0C = r0
            X.2m9 r2 = r4.A00
            r0 = 11
            X.3Zw r1 = new X.3Zw
            r1.<init>(r4, r0, r3)
            r0 = 19
            r2.A01(r1, r0)
            return
        L_0x00dc:
            java.lang.Object r2 = r8.A00
            X.4mA r2 = (X.C92144mA) r2
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r2.A05
            if (r0 == 0) goto L_0x000c
            X.3ZH r0 = r2.A0L
            com.whatsapp.jid.UserJid r4 = X.C86604Kt.A0d(r0)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r2.A05
            X.5OF r0 = r0.A0D(r4)
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x000c
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = r2.A05
            java.lang.Integer r0 = X.C18300x5.A0Z()
            r3 = 0
            r1.A0G(r4, r0, r3)
            X.07r r2 = r2.A0U
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.C627736r.A0S(r2, r4, r1, r0, r0)
            X.AnonymousClass0RN.A00(r2, r0, r3)
            return
        L_0x010e:
            java.lang.Object r0 = r8.A00
            com.whatsapp.conversation.ConversationSearchFragment r0 = (com.whatsapp.conversation.ConversationSearchFragment) r0
            com.whatsapp.conversation.viewmodel.ConversationSearchViewModel r0 = r0.A02
            if (r0 == 0) goto L_0x000c
            X.4UC r1 = r0.A01
            r0 = 0
            r1.A0H(r0)
            return
        L_0x011d:
            java.lang.Object r6 = r8.A00
            X.4mH r6 = (X.C92214mH) r6
            X.1fJ r0 = r6.A02
            if (r0 == 0) goto L_0x000c
            X.5hX r5 = r6.A05
            X.67A r0 = r6.A01
            X.4eZ r4 = r0.getActivity()
            X.4eZ r0 = r0.getActivity()
            X.1fJ r3 = r6.A02
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPendingParticipantsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            r5.A0A(r4, r2)
            r0 = 0
            r6.A05(r0)
            return
        L_0x014d:
            java.lang.Object r0 = r8.A00
            X.2jm r0 = (X.C51412jm) r0
            X.4GP r0 = r0.A01
            r0.invoke()
            return
        L_0x0157:
            java.lang.Object r0 = r8.A00
            X.5SR r0 = (X.AnonymousClass5SR) r0
            X.4GQ r1 = r0.A03
            X.1fJ r0 = r0.A02
            r1.invoke(r0)
            return
        L_0x0163:
            java.lang.Object r1 = r8.A00
            com.whatsapp.companiondevice.CompanionHelloConfirmationActivity r1 = (com.whatsapp.companiondevice.CompanionHelloConfirmationActivity) r1
            X.5rC r0 = r1.A00
            if (r0 == 0) goto L_0x0182
            X.2R8 r0 = r1.A02
            if (r0 == 0) goto L_0x017b
            r0 = 5
            android.content.Intent r0 = X.C57112t6.A01(r1, r0)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x017b:
            java.lang.String r0 = "smbMDExtensionUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0182:
            java.lang.String r0 = "smbActivities"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0189:
            java.lang.Object r0 = r8.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0191:
            java.lang.Object r4 = r8.A00
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r4 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LinkedDeviceEditDeviceActivity log out button clicked for "
            r1.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r4.A05
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = "deviceJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a9:
            X.C18260x0.A0m(r0, r1)
            X.0zH r3 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131890439(0x7f121107, float:1.941557E38)
            r3.A0T(r0)
            r1 = 2131890556(0x7f12117c, float:1.9415807E38)
            r0 = 153(0x99, float:2.14E-43)
            X.6C6 r0 = X.AnonymousClass6C6.A00(r4, r0)
            r3.A0d(r4, r0, r1)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 0
            X.5BX r0 = new X.5BX
            r0.<init>(r1)
            r3.A0c(r4, r0, r2)
            r3.A0S()
            return
        L_0x01d2:
            java.lang.Object r0 = r8.A00
            X.2FN r0 = (X.AnonymousClass2FN) r0
            r5 = 0
            com.whatsapp.companiondevice.LinkedDevicesActivity r1 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r4 = r1.A08
            X.2iG r0 = r1.A09
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r0.A0A
            boolean r3 = r0.A01()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r1.A0A
            int r2 = r0.A0D()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r1.A0A
            X.3Mg r0 = r0.A05
            X.3Mh r1 = r0.A00
            X.1Ek r0 = X.C66663Mh.A1H
            int r0 = r1.A03(r0)
            r4.A0F(r2, r0, r5, r3)
            return
        L_0x01f9:
            java.lang.Object r1 = r8.A00
            X.122 r1 = (X.AnonymousClass122) r1
            r0 = 1
            r1.A04 = r0
            r1.A0K()
            r1.A05()
            return
        L_0x0207:
            java.lang.Object r2 = r8.A00
            X.122 r2 = (X.AnonymousClass122) r2
            r0 = 1
            r2.A04 = r0
            X.30l r0 = r2.A08
            android.content.SharedPreferences r0 = r0.A02()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_fatal_error_time"
            X.C18270x1.A0g(r1, r0)
            r2.A0K()
            r2.A05()
            return
        L_0x0224:
            java.lang.Object r2 = r8.A00
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r2 = (com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment) r2
            java.lang.String r0 = "LinkedDevicesDetailDialogFragment/onLogOutDevice"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r2.A04
            X.33G r0 = r2.A07
            com.whatsapp.jid.DeviceJid r0 = r0.A07
            java.lang.String r0 = r0.getRawString()
            r1.A0G(r0)
            r2.A1K()
            return
        L_0x023e:
            java.lang.Object r4 = r8.A00
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r4 = (com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment) r4
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r3 = r4.A04
            X.2QC r0 = r4.A0A
            java.lang.String r2 = r0.A03
            X.5rC r1 = r3.A06
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0259
            java.lang.Object r0 = r1.A04()
            X.2ax r0 = (X.C46022ax) r0
            r0.A00(r2)
        L_0x0259:
            X.4UC r1 = r3.A0W
            r0 = 0
            r1.A0H(r0)
            r4.A1K()
            return
        L_0x0263:
            java.lang.Object r0 = r8.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r0 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r0
            X.4Uq r1 = r0.A05
            java.lang.String r0 = "OptInWebBeta/OptIn_Button_Clicked"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x027d
            X.4UC r1 = r1.A06
            X.5AZ r0 = new X.5AZ
            r0.<init>()
            r1.A0H(r0)
            return
        L_0x027d:
            r1.A0D()
            return
        L_0x0281:
            java.lang.Object r0 = r8.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionActivity r0 = (com.whatsapp.companionmode.registration.RegisterAsCompanionActivity) r0
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r3 = r0.A07
            r2 = 0
            X.08M r1 = r3.A03
            X.4l2 r0 = new X.4l2
            r0.<init>(r2)
            r1.A0G(r0)
            X.4FS r2 = r3.A08
            r1 = 35
            X.3Zi r0 = new X.3Zi
            r0.<init>(r3, r1)
            r2.BkP(r0)
            return
        L_0x029f:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            return
        L_0x02a7:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x02af:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x02b7:
            java.lang.Object r0 = r8.A00
            X.5kQ r0 = (X.C112815kQ) r0
            X.5Qa r1 = r0.A07
            java.lang.String r4 = r0.A02
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.2nh r3 = r1.A05
            android.content.Context r2 = r1.A02
            java.lang.String r1 = "sms:"
            r0 = 0
            r3.A01(r2, r0, r4, r1)
            return
        L_0x02ce:
            java.lang.Object r4 = r8.A00
            X.5K9 r4 = (X.AnonymousClass5K9) r4
            X.64t r0 = r4.A03
            r0.BM7()
            java.lang.String r0 = "android.intent.action.INSERT"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "vnd.android.cursor.dir/contact"
            r2.setType(r0)
            X.5XZ r0 = r4.A04
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = "name"
            r2.putExtra(r0, r1)
            X.5Ud r0 = r4.A05
            java.lang.String r1 = r0.A02()
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "phone"
            r2.putExtra(r0, r1)
            android.app.Activity r1 = r4.A00     // Catch:{ ActivityNotFoundException -> 0x0302 }
            r0 = 1
            r1.startActivityForResult(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0302 }
            return
        L_0x0302:
            r3 = move-exception
            X.3Wi r2 = r4.A02
            r1 = 2131894595(0x7f122143, float:1.9424E38)
            r0 = 0
            r2.A0H(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "showNativeContactForm: Failed to start activity for result, message: "
            X.C18260x0.A16(r0, r1, r3)
            return
        L_0x0316:
            java.lang.Object r0 = r8.A00
            X.5Ud r0 = (X.C105245Ud) r0
            X.64u r3 = r0.A0B
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0336
            java.lang.String r1 = r0.toString()
            r0 = 32
            int r0 = r1.indexOf(r0)
            if (r0 <= 0) goto L_0x0336
            java.lang.String r2 = X.AnonymousClass0x7.A0r(r1, r0)
        L_0x0336:
            r3.BQK(r2)
            return
        L_0x033a:
            java.lang.Object r0 = r8.A00
            X.2qh r0 = (X.C55652qh) r0
            r0.A02()
            return
        L_0x0342:
            java.lang.Object r0 = r8.A00
            X.2ch r0 = (X.C47092ch) r0
            r0.A00()
            return
        L_0x034a:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment r3 = (com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment) r3
            int r2 = r3.A00
            r1 = 1
            X.4Wf r0 = r3.A2J()
            java.util.List r0 = r0.A00
            if (r2 != r1) goto L_0x0368
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0379
            X.3Wi r2 = r3.A0a
            java.lang.String r1 = "You need to select at least one contact"
        L_0x0363:
            r0 = 1
            r2.A0W(r1, r0)
            return
        L_0x0368:
            int r1 = r0.size()
            java.util.List r0 = r3.A31
            int r0 = r0.size()
            if (r1 != r0) goto L_0x03b2
            X.3Wi r2 = r3.A0a
            java.lang.String r1 = "You cannot exclude all contacts"
            goto L_0x0363
        L_0x0379:
            X.4Wf r0 = r3.A2J()
            java.util.List r0 = r0.A00
            r0.size()
            X.5de r0 = r3.A1o
            java.util.List r0 = r0.A01
            r0.clear()
            X.4Wf r0 = r3.A2J()
            java.util.List r0 = r0.A00
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0397:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03a5
            X.4uZ r0 = X.C86604Kt.A0b(r1)
            r2.add(r0)
            goto L_0x0397
        L_0x03a5:
            java.util.List r0 = X.C73723fy.A0F(r2)
            java.util.List r1 = X.C73723fy.A0C(r0)
            X.5de r0 = r3.A1o
            java.util.List r0 = r0.A01
            goto L_0x03e1
        L_0x03b2:
            X.5de r0 = r3.A1o
            java.util.List r0 = r0.A02
            r0.clear()
            X.4Wf r0 = r3.A2J()
            java.util.List r0 = r0.A00
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x03c7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03d5
            X.4uZ r0 = X.C86604Kt.A0b(r1)
            r2.add(r0)
            goto L_0x03c7
        L_0x03d5:
            java.util.List r0 = X.C73723fy.A0F(r2)
            java.util.List r1 = X.C73723fy.A0C(r0)
            X.5de r0 = r3.A1o
            java.util.List r0 = r0.A02
        L_0x03e1:
            r0.addAll(r1)
            android.content.Intent r2 = X.C18320x8.A07()
            X.5TZ r1 = r3.A2M
            X.5de r0 = r3.A1o
            r1.A01(r2, r0)
            X.5hx r0 = r3.A19
            r0.A03(r2)
            goto L_0x04e0
        L_0x03f6:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.ContactPicker r3 = (com.whatsapp.contact.picker.ContactPicker) r3
            r2 = 2131892358(0x7f121886, float:1.9419462E38)
            r1 = 2131892359(0x7f121887, float:1.9419464E38)
            r0 = 0
            com.whatsapp.RequestPermissionActivity.A0d(r3, r2, r1, r0)
            java.lang.Integer r0 = X.C18280x3.A0S()
            X.1X9 r1 = new X.1X9
            r1.<init>()
            r1.A00 = r0
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A01 = r0
            X.4FV r0 = r3.A0A
            r0.BhD(r1)
            return
        L_0x041b:
            java.lang.Object r0 = r8.A00
            X.4lo r0 = (X.C91924lo) r0
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            r0.A1Z()
            return
        L_0x0425:
            java.lang.Object r0 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.2fa r3 = r0.A0f
            X.03q r2 = r0.A0Q()
            boolean r1 = r0.A3Q
            r0 = 3
            if (r1 == 0) goto L_0x0435
            r0 = 6
        L_0x0435:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01(r2, r0)
            return
        L_0x043d:
            java.lang.Object r2 = r8.A00
            X.0eF r2 = (X.C08310eF) r2
            X.03q r1 = r2.A0Q()
            r0 = 16
            android.content.Intent r1 = X.C86624Kv.A07(r1, r0)
            r0 = 2
            r2.startActivityForResult(r1, r0)
            return
        L_0x0450:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            X.03q r2 = r3.A0R()
            X.67D r1 = r3.A0r
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.Bph(r2, r0, r0)
            goto L_0x04e0
        L_0x0462:
            java.lang.Object r3 = r8.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.LockedConversationsActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0477:
            java.lang.Object r2 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.5Oq r1 = r2.A1A
            X.08M r0 = r2.A3h
            java.lang.Object r0 = r0.A07()
            java.lang.String r0 = (java.lang.String) r0
            r1.A00(r2, r0)
            return
        L_0x0489:
            java.lang.Object r0 = r8.A00
            X.5PD r0 = (X.AnonymousClass5PD) r0
            X.107 r1 = r0.A0J
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
            return
        L_0x0495:
            java.lang.Object r2 = r8.A00
            X.4eX r2 = (X.C89634eX) r2
            X.2fa r1 = r2.A06
            r0 = 9
            goto L_0x04a6
        L_0x049e:
            java.lang.Object r2 = r8.A00
            com.whatsapp.contact.picker.PhoneContactsSelector r2 = (com.whatsapp.contact.picker.PhoneContactsSelector) r2
            X.2fa r1 = r2.A0A
            r0 = 10
        L_0x04a6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r2, r0)
            return
        L_0x04ae:
            java.lang.Object r0 = r8.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A01(r0)
            return
        L_0x04b6:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.VoipContactPickerFragment r3 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r3
            java.util.Map r0 = r3.A3n
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            android.content.Intent r1 = X.C18320x8.A07()
            X.C627336j.A0H(r0, r2)
            java.lang.String r0 = "jids"
            r1.putStringArrayListExtra(r0, r2)
            X.5hx r0 = r3.A19
            r0.A03(r1)
            X.32x r2 = r3.A2N()
            X.3dI r1 = r2.A02
            r0 = 22
            X.C86624Kv.A1K(r1, r2, r0)
        L_0x04e0:
            X.5hx r0 = r3.A19
            r0.A02()
            return
        L_0x04e6:
            java.lang.Object r3 = r8.A00
            X.4fR r3 = (X.C89884fR) r3
            X.2hn r2 = r3.A0k
            if (r2 == 0) goto L_0x04f9
            X.4uZ r0 = r3.A0r
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            r0 = 10
            r2.A01(r1, r0)
        L_0x04f9:
            X.07r r0 = r3.A0U
            r0.onBackPressed()
            return
        L_0x04ff:
            java.lang.Object r1 = r8.A00
            X.4mA r1 = (X.C92144mA) r1
            X.07r r0 = r1.A0U
            r1.A0G(r0)
            return
        L_0x0509:
            java.lang.Object r0 = r8.A00
            com.whatsapp.conversation.ConversationSearchFragment r0 = (com.whatsapp.conversation.ConversationSearchFragment) r0
            r0.A1J()
            return
        L_0x0511:
            java.lang.Object r0 = r8.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.onBackPressed()
            return
        L_0x0519:
            java.lang.Object r1 = r8.A00
            X.5rH r1 = (X.C117035rH) r1
            r0 = 1
            r1.A05(r0)
            return
        L_0x0522:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0529:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0530:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0537:
            java.util.List r1 = java.util.Arrays.asList(r6)
            android.accounts.Account r0 = r5.A00
            java.lang.String r0 = r0.name
            int r2 = r1.indexOf(r0)
            r1 = 47
            X.4Hr r0 = new X.4Hr
            r0.<init>(r5, r1)
            r3.A0K(r0, r6, r2)
            r0 = 2131893273(0x7f121c19, float:1.9421318E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 48
            X.4Hr r0 = new X.4Hr
            r0.<init>(r5, r1)
            r3.A0I(r0, r2)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            r3.A0G(r0, r1)
            X.C18280x3.A0q(r3)
            return
        L_0x056d:
            java.lang.String r0 = "groupInviteClickUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109335eS.onClick(android.view.View):void");
    }
}
