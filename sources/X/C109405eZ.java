package X;

import android.view.View;

/* renamed from: X.5eZ  reason: invalid class name and case insensitive filesystem */
public class C109405eZ implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109405eZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x040c, code lost:
        r3.A7R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x040f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r1.Avu(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0177, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d4, code lost:
        r0 = r2.A0k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d6, code lost:
        if (r0 == null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d8, code lost:
        r0.A03(r2.A0R(), r2, r0.A04, "status_fragment", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ea, code lost:
        throw X.C18270x1.A0S("statusSharingManager");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x04a0;
                case 1: goto L_0x0488;
                case 2: goto L_0x045f;
                case 3: goto L_0x0448;
                case 4: goto L_0x043f;
                case 5: goto L_0x0410;
                case 6: goto L_0x03fc;
                case 7: goto L_0x032b;
                case 8: goto L_0x0298;
                case 9: goto L_0x027c;
                case 10: goto L_0x0226;
                case 11: goto L_0x021e;
                case 12: goto L_0x0215;
                case 13: goto L_0x01fc;
                case 14: goto L_0x01f3;
                case 15: goto L_0x01eb;
                case 16: goto L_0x01b8;
                case 17: goto L_0x01b0;
                case 18: goto L_0x01b0;
                case 19: goto L_0x01a8;
                case 20: goto L_0x019f;
                case 21: goto L_0x0197;
                case 22: goto L_0x018f;
                case 23: goto L_0x0182;
                case 24: goto L_0x0161;
                case 25: goto L_0x012c;
                case 26: goto L_0x011c;
                case 27: goto L_0x00f9;
                case 28: goto L_0x00b9;
                case 29: goto L_0x0005;
                case 30: goto L_0x0005;
                case 31: goto L_0x00a2;
                case 32: goto L_0x0092;
                case 33: goto L_0x0084;
                case 34: goto L_0x007a;
                case 35: goto L_0x006f;
                case 36: goto L_0x0065;
                case 37: goto L_0x005d;
                case 38: goto L_0x004a;
                case 39: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r8.A00
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r4 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r4
            java.lang.String r3 = r4.A09
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "event_name"
            r2.putExtra(r0, r3)
            r0 = 11
            r4.BpY(r2, r0)
            X.5hc r1 = r4.A03
            if (r1 != 0) goto L_0x04ac
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002d:
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r1 = "action"
            java.lang.String r0 = "FORGOT_UPI_PIN"
            r3.putString(r1, r0)
            java.lang.Object r0 = r8.A00
            X.6Fq r0 = (X.C125126Fq) r0
            android.content.Context r2 = r0.A03
            android.os.ResultReceiver r1 = X.AnonymousClass7Q1.A0B
            r0 = 3
            r1.send(r0, r3)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.finish()
            return
        L_0x004a:
            java.lang.Object r1 = r8.A00
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r1 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r1
            int r0 = X.C86624Kv.A03(r1)
            r1.setSelection(r0)
            android.view.View$OnClickListener r0 = r1.A0F
            if (r0 == 0) goto L_0x04b1
            r0.onClick(r9)
            return
        L_0x005d:
            java.lang.Object r0 = r8.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0065:
            java.lang.Object r1 = r8.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.SETTINGS"
            X.C86654Ky.A0v(r1, r0)
            return
        L_0x006f:
            java.lang.Object r0 = r8.A00
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.65t r1 = r0.A04
            if (r1 == 0) goto L_0x04b1
            r0 = 66
            goto L_0x008e
        L_0x007a:
            java.lang.Object r0 = r8.A00
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.65t r1 = r0.A04
            if (r1 == 0) goto L_0x04b1
            r0 = 7
            goto L_0x008e
        L_0x0084:
            java.lang.Object r0 = r8.A00
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.65t r1 = r0.A04
            if (r1 == 0) goto L_0x04b1
            r0 = 67
        L_0x008e:
            r1.Avu(r9, r0)
            return
        L_0x0092:
            java.lang.Object r1 = r8.A00
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            android.view.View r0 = r1.A04
            boolean r0 = X.C86604Kt.A1Y(r0)
            r0 = r0 ^ 1
            org.npci.upi.security.pinactivitycomponent.GetCredential.A0L(r1, r0)
            return
        L_0x00a2:
            java.lang.Object r3 = r8.A00
            android.app.Activity r3 = (android.app.Activity) r3
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r1 = "error"
            java.lang.String r0 = "USER_ABORTED"
            r2.putString(r1, r0)
            android.os.ResultReceiver r1 = X.AnonymousClass7Q1.A0B
            r0 = 0
            r1.send(r0, r2)
            goto L_0x0177
        L_0x00b9:
            java.lang.Object r4 = r8.A00
            X.5Qr r4 = (X.C104365Qr) r4
            X.57S r1 = r4.A04
            java.lang.String r0 = "TAP_BANNER_DISMISS"
            r1.A04(r0)
            X.66R r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.5qp r0 = (X.C116765qp) r0
            X.66R r0 = r0.A02
            android.content.SharedPreferences r0 = X.C18310x6.A0F(r0)
            X.C162457s7.A0D(r0)
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.C162457s7.A0D(r3)
            java.lang.String r2 = "ts"
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)
            X.C162457s7.A0D(r0)
            java.lang.String r1 = "shown"
            r0 = 3
            r3.putInt(r1, r0)
            r3.apply()
            X.5Tr r1 = r4.A03
            r0 = 1
            r1.A02(r0)
            return
        L_0x00f9:
            java.lang.Object r0 = r8.A00
            X.5Kp r0 = (X.C102875Kp) r0
            X.65r r1 = r0.A01
            if (r1 == 0) goto L_0x04b1
            X.8qC r0 = r0.A07
            java.util.ArrayList r5 = X.C113925mD.A00(r0)
            X.5AR r1 = (X.AnonymousClass5AR) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0113
            java.lang.Object r2 = r1.A00
            com.whatsapp.updates.ui.UpdatesFragment r2 = (com.whatsapp.updates.ui.UpdatesFragment) r2
            goto L_0x01d4
        L_0x0113:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A1U(r5, r0)
            return
        L_0x011c:
            java.lang.Object r0 = r8.A00
            X.5Kp r0 = (X.C102875Kp) r0
            X.8qC r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.5Tr r0 = (X.C105125Tr) r0
            r0.A00()
            return
        L_0x012c:
            java.lang.Object r3 = r8.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            X.5hb r1 = r3.A74()
            java.lang.String r0 = "TAP_NATIVE_AUTH_AGREE"
            r1.A05(r0)
            X.2rK r1 = r3.A06
            if (r1 == 0) goto L_0x015a
            X.21S r0 = X.AnonymousClass21S.A02
            r1.A02(r0)
            X.3Wi r0 = r3.A05
            X.C162457s7.A0C(r0)
            X.2fU r2 = new X.2fU
            r2.<init>(r0)
            r0 = 2131886292(0x7f1200d4, float:1.9407159E38)
            r2.A01(r0)
            X.4FS r1 = r3.A04
            r0 = 47
            X.C86624Kv.A1N(r1, r3, r2, r0)
            return
        L_0x015a:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0161:
            java.lang.Object r3 = r8.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            X.5hb r1 = r3.A74()
            java.lang.String r0 = "EXIT_NATIVE_AUTH"
            r1.A05(r0)
            r2 = 0
            r1 = 0
            X.4xg r0 = r3.A03
            if (r0 == 0) goto L_0x017b
            r0.A08(r2, r2, r2, r1)
        L_0x0177:
            r3.finish()
            return
        L_0x017b:
            java.lang.String r0 = "accountLinkingResultObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0182:
            java.lang.Object r1 = r8.A00
            X.4ea r1 = (X.C89654ea) r1
            com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet r0 = new com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet
            r0.<init>()
            r1.Boo(r0)
            return
        L_0x018f:
            java.lang.Object r0 = r8.A00
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r0 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r0
            r0.onBackPressed()
            return
        L_0x0197:
            java.lang.Object r0 = r8.A00
            com.whatsapp.wds.components.search.WDSSearchView r0 = (com.whatsapp.wds.components.search.WDSSearchView) r0
            com.whatsapp.wds.components.search.WDSSearchView.setUpTrailingButtonIcon$lambda$4$lambda$3(r0, r9)
            return
        L_0x019f:
            java.lang.Object r1 = r8.A00
            com.whatsapp.wds.components.search.WDSSearchBar r1 = (com.whatsapp.wds.components.search.WDSSearchBar) r1
            r0 = 1
            r1.A02(r0)
            return
        L_0x01a8:
            java.lang.Object r0 = r8.A00
            com.whatsapp.wds.components.search.WDSConversationSearchView r0 = (com.whatsapp.wds.components.search.WDSConversationSearchView) r0
            com.whatsapp.wds.components.search.WDSConversationSearchView.setUpClearButton$lambda$5(r0, r9)
            return
        L_0x01b0:
            java.lang.Object r0 = r8.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x01b8:
            java.lang.Object r0 = r8.A00
            X.5X4 r0 = (X.AnonymousClass5X4) r0
            X.5Gv r1 = r0.A01
            if (r1 == 0) goto L_0x04b1
            X.8qC r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.5mC r0 = (X.C113915mC) r0
            java.util.LinkedHashMap r0 = r0.A02
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r5 = X.AnonymousClass002.A0J(r0)
            com.whatsapp.updates.ui.UpdatesFragment r2 = r1.A00
        L_0x01d4:
            X.5Tp r0 = r2.A0k
            if (r0 == 0) goto L_0x01e4
            X.03q r1 = r2.A0R()
            java.lang.String r4 = "status_fragment"
            X.5pL r3 = r0.A04
            r0.A03(r1, r2, r3, r4, r5)
            return
        L_0x01e4:
            java.lang.String r0 = "statusSharingManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01eb:
            java.lang.Object r0 = r8.A00
            X.4Bm r0 = (X.C84214Bm) r0
            r0.BNE()
            return
        L_0x01f3:
            java.lang.Object r1 = r8.A00
            X.3XK r1 = (X.AnonymousClass3XK) r1
            r0 = 0
            r1.BgG(r0)
            return
        L_0x01fc:
            java.lang.Object r0 = r8.A00
            com.whatsapp.wabai.SystemMessage3PBottomSheet r0 = (com.whatsapp.wabai.SystemMessage3PBottomSheet) r0
            X.2nM r2 = r0.A00
            if (r2 == 0) goto L_0x020e
            java.lang.String r1 = "third-party-bots-help-article"
            X.03q r0 = r0.A0R()
            r2.A01(r0, r1)
            return
        L_0x020e:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0215:
            java.lang.Object r1 = r8.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r1
            r0 = 1
            r1.A1Z(r0)
            return
        L_0x021e:
            java.lang.Object r0 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.voipcalling.VoipActivityV2.A0X(r0)
            return
        L_0x0226:
            java.lang.Object r3 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r0 = "voip end call button pressed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x0240
            java.lang.String r0 = "voip end call button pressed in NONE state"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x023c:
            r3.finish()
            return
        L_0x0240:
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r1)
            if (r0 == 0) goto L_0x024b
            r0 = 2
            r3.Bik(r0)
            return
        L_0x024b:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 != r0) goto L_0x0278
            com.whatsapp.voipcalling.CallInfo r0 = X.C627436k.A02()
            X.C626936e.A06(r0)
            int r1 = r0.callLinkState
            r0 = 1
            if (r1 == r0) goto L_0x0262
            r0 = 2
            if (r1 == r0) goto L_0x0262
            r3.A7M()
            goto L_0x023c
        L_0x0262:
            X.5b3 r1 = r3.A16
            if (r1 == 0) goto L_0x023c
            java.lang.String r2 = "default"
            java.lang.String r0 = "voip/call/reject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.A13
            X.8Ly r0 = new X.8Ly
            r0.<init>(r2)
            r1.execute(r0)
            goto L_0x023c
        L_0x0278:
            r3.A7M()
            return
        L_0x027c:
            java.lang.Object r3 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            X.5b3 r0 = r3.A16
            if (r0 == 0) goto L_0x040c
            X.5pi r2 = r0.A1m
            int r1 = r2.A00
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            r1 = r0 ^ 1
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2.A0B(r0, r1)
            goto L_0x040c
        L_0x0298:
            java.lang.Object r3 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x04b1
            com.whatsapp.voipcalling.CallInfo r2 = r3.A7D()
            if (r2 == 0) goto L_0x04b1
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x04b1
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x031e
            X.5Lb r0 = r2.self
            int r1 = r0.A06
            r0 = 6
            if (r1 == r0) goto L_0x040c
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r3.A1u
            boolean r4 = r0.isFrontCamera()
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r2 = r3.A0n
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CallAvatarViewModel/shouldShowDialogForSwitchingToBackCamera isUsingFrontCamera="
            X.C18260x0.A1D(r0, r1, r4)
            if (r4 == 0) goto L_0x02ef
            X.107 r0 = r2.A0K
            java.lang.Object r0 = r0.A07()
            boolean r0 = r0 instanceof X.C91144iz
            if (r0 == 0) goto L_0x02ef
            r4 = 1
            com.whatsapp.voipcalling.VoipActivityV2$SwitchCameraForPersonalizedAvatarDialogFragment r2 = new com.whatsapp.voipcalling.VoipActivityV2$SwitchCameraForPersonalizedAvatarDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "use_case"
            r1.putInt(r0, r4)
            r2.A0u(r1)
            java.lang.String r0 = "SwitchCameraForPersonalizedAvatarDialogFragment"
            r3.A7A(r2, r0)
            goto L_0x040c
        L_0x02ef:
            android.os.Handler r1 = r3.A0D
            r0 = 3
            r1.removeMessages(r0)
            com.whatsapp.voipcalling.Voip.switchCamera()
            X.5qe r0 = r3.A1C
            r0.A02()
            if (r4 != 0) goto L_0x040c
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r2 = r3.A0n
            java.lang.String r0 = "voip/CallAvatarViewModel/onSwitchedToFrontCamera"
            java.lang.Object r1 = X.AnonymousClass4VK.A00(r2, r0)
            X.5AG r1 = (X.AnonymousClass5AG) r1
            boolean r0 = r1 instanceof X.C91104iv
            if (r0 == 0) goto L_0x040c
            X.4iv r1 = (X.C91104iv) r1
            X.5AF r0 = r1.A00
            boolean r0 = r0 instanceof X.C91074is
            if (r0 == 0) goto L_0x040c
            java.lang.String r0 = X.C86604Kt.A0k()
            X.AnonymousClass4VK.A01(r2, r0)
            goto L_0x040c
        L_0x031e:
            X.5b3 r0 = r3.A16
            if (r0 == 0) goto L_0x040c
            X.5pi r1 = r0.A1m
            r0 = 43
            X.C116085pi.A01(r1, r0)
            goto L_0x040c
        L_0x032b:
            java.lang.Object r3 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x04b1
            r5 = 0
            r3.A2N = r5
            com.whatsapp.voipcalling.CallInfo r6 = r3.A7D()
            if (r6 == 0) goto L_0x04b1
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0348
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x04b1
        L_0x0348:
            boolean r0 = r6.callEnding
            if (r0 != 0) goto L_0x04b1
            X.5b3 r0 = r3.A16
            if (r0 == 0) goto L_0x04b1
            java.lang.String r0 = "voip/VoipActivityV2/toggleVideoBtn/clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Lb r4 = r6.self
            X.5Lb r7 = r6.getDefaultPeerInfo()
            r2 = 1
            if (r7 == 0) goto L_0x0385
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x0385
            com.whatsapp.jid.UserJid r4 = r7.A08
            X.5ZU r1 = r3.A1M
            X.3Ex r0 = r3.A1I
            X.3ZH r0 = r0.A0A(r4)
            java.lang.String r6 = X.C18300x5.A0h(r1, r0)
            boolean r4 = r7.A0A
            X.3Wi r1 = r3.A05
            r0 = 2131895390(0x7f12245e, float:1.9425612E38)
            if (r4 == 0) goto L_0x037c
            r0 = 2131895389(0x7f12245d, float:1.942561E38)
        L_0x037c:
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r3, r6, r2, r0)
        L_0x0380:
            r1.A0P(r0, r5)
            goto L_0x040c
        L_0x0385:
            int r1 = r4.A06
            r0 = 6
            if (r1 != r0) goto L_0x039c
            r9.setSelected(r5)
            X.5qe r0 = r3.A1C
            r0.A02()
            X.5b3 r0 = r3.A16
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A13
            r0 = 10
            X.C86624Kv.A1S(r1, r0)
            goto L_0x040c
        L_0x039c:
            if (r1 != 0) goto L_0x03d7
            boolean r0 = r6.isGroupCall
            if (r0 == 0) goto L_0x03ac
            X.3Wi r1 = r3.A05
            r0 = 2131895391(0x7f12245f, float:1.9425614E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0380
        L_0x03ac:
            com.whatsapp.jid.UserJid r4 = X.C86644Kx.A0X(r6)
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r3)
            java.lang.String r0 = "switch_to_video_call_confirmation_dialog_count"
            int r1 = r1.getInt(r0, r5)
            r0 = 5
            if (r1 >= r0) goto L_0x03c8
            com.whatsapp.voipcalling.VoipActivityV2$SwitchConfirmationFragment r1 = new com.whatsapp.voipcalling.VoipActivityV2$SwitchConfirmationFragment
            r1.<init>()
            java.lang.String r0 = "SwitchConfirmationFragment"
            r3.A7A(r1, r0)
            goto L_0x040c
        L_0x03c8:
            boolean r0 = r3.A85(r4, r2, r2)
            if (r0 == 0) goto L_0x040c
            X.5b3 r0 = r3.A16
            X.C626936e.A06(r0)
            r0.A0H()
            goto L_0x040c
        L_0x03d7:
            if (r1 != r2) goto L_0x03ec
            X.5qe r1 = r3.A1C
            com.whatsapp.jid.UserJid r0 = r4.A08
            r1.A04(r0)
            X.5b3 r0 = r3.A16
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A13
            r0 = 6
            X.C86624Kv.A1S(r1, r0)
            r9.setSelected(r2)
            goto L_0x040c
        L_0x03ec:
            r0 = 3
            if (r1 != r0) goto L_0x040c
            X.5b3 r0 = r3.A16
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A13
            X.8M9 r0 = new X.8M9
            r0.<init>(r5, r2)
            r1.execute(r0)
            goto L_0x040c
        L_0x03fc:
            java.lang.Object r3 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            X.5b3 r1 = r3.A16
            if (r1 == 0) goto L_0x040c
            X.5sL r0 = new X.5sL
            r0.<init>(r1)
            X.C86644Kx.A1G(r0, r1)
        L_0x040c:
            r3.A7R()
            return
        L_0x0410:
            java.lang.Object r3 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            r0 = 1
            r3.A2E = r0
            boolean r0 = r3.A80()
            if (r0 == 0) goto L_0x0427
            com.whatsapp.voipcalling.CallInfo r0 = r3.A7D()
            boolean r0 = r3.A86(r0)
            if (r0 != 0) goto L_0x04b1
        L_0x0427:
            r3.finish()
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r1 = "isTaskRoot"
            r0 = 1
            boolean r0 = r2.getBooleanExtra(r1, r0)
            if (r0 == 0) goto L_0x04b1
            android.content.Intent r0 = X.C627736r.A02(r3)
            r3.startActivity(r0)
            return
        L_0x043f:
            java.lang.Object r1 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            r0 = 1
            r1.A7w(r0)
            return
        L_0x0448:
            java.lang.Object r1 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            X.5b3 r0 = r1.A16
            if (r0 == 0) goto L_0x04b1
            java.lang.String r0 = "voip/VoipActivityV2/centerScreenCallStatusButton/resumeWhatsAppCallListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5b3 r1 = r1.A16
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            r1.A0l(r0)
            return
        L_0x045f:
            java.lang.Object r2 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            com.whatsapp.voipcalling.CallInfo r0 = r2.A7D()
            if (r0 == 0) goto L_0x04b1
            X.5Lb r0 = r0.self
            int r1 = r0.A06
            r0 = 3
            if (r1 != r0) goto L_0x04b1
            X.5b3 r0 = r2.A16
            if (r0 == 0) goto L_0x04b1
            java.lang.String r0 = "voip/VoipActivityV2/centerScreenCallStatusButton/cancelSwitchToVideoCallListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5b3 r0 = r2.A16
            r3 = 0
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r0.A13
            r1 = 1
            X.8M9 r0 = new X.8M9
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        L_0x0488:
            java.lang.Object r2 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.String r0 = "VoipActivityV2 vm cancel onClick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7Ta r1 = r2.A1H
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A02 = r0
            r1.A00()
            r2.finish()
            return
        L_0x04a0:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.A03
            if (r0 == 0) goto L_0x04b1
            r0.dismiss()
            return
        L_0x04ac:
            java.lang.String r0 = "TAP_NEW_GROUP"
            r1.A05(r0)
        L_0x04b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109405eZ.onClick(android.view.View):void");
    }
}
