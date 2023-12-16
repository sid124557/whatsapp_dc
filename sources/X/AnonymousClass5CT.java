package X;

import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.5CT  reason: invalid class name */
public class AnonymousClass5CT implements C15930sC {
    public Object A00;
    public final int A01;

    public AnonymousClass5CT(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, int i) {
        this.A01 = i;
        this.A00 = voipCallControlBottomSheetV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03be, code lost:
        if (r1 == null) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0405, code lost:
        if (r2 != 2) goto L_0x0407;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0276  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BOf(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x02fd;
                case 2: goto L_0x03cc;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r5
            boolean r3 = X.AnonymousClass001.A1Z(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 isInLobbyChanged "
            X.C18260x0.A1E(r0, r1, r3)
            android.app.Dialog r0 = r5.A03
            if (r0 == 0) goto L_0x0035
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0035
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            android.view.View r1 = r0.getDecorView()
            if (r3 == 0) goto L_0x00aa
            int r0 = r5.A05
        L_0x002e:
            r1.setBackgroundColor(r0)
            r0 = 0
            r5.A1X(r0)
        L_0x0035:
            X.5Uk r2 = r5.A0N
            if (r2 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController onIsInLobbyChanged "
            X.C18260x0.A1D(r0, r1, r3)
            r2.A0B = r3
            if (r3 == 0) goto L_0x00a8
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x004e
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x00a8
        L_0x004e:
            r0 = 3
        L_0x004f:
            r2.A03(r0)
        L_0x0052:
            androidx.core.widget.NestedScrollView r1 = r5.A0F
            if (r1 == 0) goto L_0x005a
            r0 = 0
            r1.scrollTo(r0, r0)
        L_0x005a:
            if (r3 != 0) goto L_0x0072
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r4 = r5.A0U
            if (r4 == 0) goto L_0x0072
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0P
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0072
            r0 = 32
            X.5rO r2 = new X.5rO
            r2.<init>(r5, r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r4.postDelayed(r2, r0)
        L_0x0072:
            X.5Ml r1 = r5.A0g
            if (r1 == 0) goto L_0x00a7
            r0 = 1
            r1.A00(r0)
            X.5Ml r4 = r5.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/VoipActivityV2/onIsInLobbyChanged/isInLobby "
            X.C18260x0.A1E(r0, r1, r3)
            com.whatsapp.voipcalling.VoipActivityV2 r2 = r4.A00
            com.whatsapp.voipcalling.CallInfo r1 = r2.A7D()
            if (r1 == 0) goto L_0x00a7
            boolean r0 = r1.videoEnabled
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r1.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x00a7
            if (r3 != 0) goto L_0x00a7
            android.view.View r3 = r2.A0M
            r0 = 29
            X.5rO r2 = new X.5rO
            r2.<init>(r4, r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
        L_0x00a7:
            return
        L_0x00a8:
            r0 = 4
            goto L_0x004f
        L_0x00aa:
            int r0 = r5.A04
            goto L_0x002e
        L_0x00ad:
            java.lang.Object r2 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            X.7Wh r12 = (X.C151787Wh) r12
            X.03q r0 = r2.A0Q()
            if (r0 == 0) goto L_0x00c0
            boolean r0 = X.C621433s.A03(r0)
            if (r0 == 0) goto L_0x00c0
            return
        L_0x00c0:
            android.widget.FrameLayout r0 = r2.A0C
            if (r0 == 0) goto L_0x00a7
            X.5Ml r0 = r2.A0g
            if (r0 == 0) goto L_0x00a7
            android.view.View r0 = r2.A0B
            if (r0 == 0) goto L_0x00a7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 setCallControlButtons "
            r1.append(r0)
            int r10 = r12.A01
            X.C18260x0.A1G(r1, r10)
            android.widget.FrameLayout r0 = r2.A0C
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r2.A0C
            java.lang.Object r0 = r0.getTag()
            int r5 = r12.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.AnonymousClass75J.A00(r0, r3)
            r4 = 0
            r9 = 1
            if (r0 != 0) goto L_0x015d
            android.widget.FrameLayout r0 = r2.A0C
            r0.setFocusable(r4)
            android.widget.FrameLayout r1 = r2.A0C
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r2.A0C
            android.view.ViewParent r0 = r0.getParent()
            r0.requestLayout()
            boolean r6 = X.AnonymousClass000.A1U(r5, r9)
            android.view.View r1 = r2.A0B
            r0 = 2131428393(0x7f0b0429, float:1.847843E38)
            if (r6 == 0) goto L_0x0116
            r0 = 2131428394(0x7f0b042a, float:1.8478431E38)
        L_0x0116:
            android.widget.FrameLayout r0 = X.C86654Ky.A0L(r1, r0)
            r2.A0C = r0
            android.view.View r1 = r2.A0B
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            android.view.View r5 = X.C06560Yg.A02(r1, r0)
            android.view.View r0 = r2.A09
            X.C626936e.A04(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.02c r1 = (X.C001702c) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0136
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0136:
            r1.A01 = r0
            android.view.View r0 = r2.A09
            r0.setLayoutParams(r1)
            android.widget.FrameLayout r0 = r2.A0C
            r0.setTag(r3)
            android.widget.FrameLayout r0 = r2.A0C
            r0.setFocusable(r9)
            android.widget.FrameLayout r0 = r2.A0C
            r0.setVisibility(r4)
            X.C626936e.A04(r5)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            X.02c r3 = (X.C001702c) r3
            if (r6 == 0) goto L_0x0169
            r0 = 0
        L_0x0158:
            r3.A0Y = r0
            r5.setLayoutParams(r3)
        L_0x015d:
            r8 = 4
            r7 = 3
            r5 = 2
            if (r10 == r9) goto L_0x0179
            if (r10 == r5) goto L_0x0175
            if (r10 == r7) goto L_0x017d
            if (r10 == r8) goto L_0x0179
            return
        L_0x0169:
            android.content.res.Resources r1 = X.C08310eF.A09(r2)
            r0 = 2131168608(0x7f070d60, float:1.7951523E38)
            int r0 = X.AnonymousClass4L0.A01(r1, r0)
            goto L_0x0158
        L_0x0175:
            r3 = 2131626301(0x7f0e093d, float:1.8879834E38)
            goto L_0x0180
        L_0x0179:
            r3 = 2131626302(0x7f0e093e, float:1.8879836E38)
            goto L_0x0180
        L_0x017d:
            r3 = 2131624285(0x7f0e015d, float:1.8875745E38)
        L_0x0180:
            android.view.LayoutInflater r1 = r2.A0I()
            android.widget.FrameLayout r0 = r2.A0C
            android.view.View r1 = r1.inflate(r3, r0, r4)
            r1.setTag(r12)
            r6 = 17
            r0 = -1
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r0, r0, r6)
            android.widget.FrameLayout r0 = r2.A0C
            r0.addView(r1, r3)
            if (r10 == r9) goto L_0x022f
            if (r10 == r8) goto L_0x022f
            if (r10 == r7) goto L_0x022f
            r0 = 0
            r2.A0I = r0
            r2.A0H = r0
            X.7Vs r6 = r12.A02
            X.C626936e.A06(r6)
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r5 = X.C06560Yg.A02(r1, r0)
            com.whatsapp.calling.views.VoipCallFooter r5 = (com.whatsapp.calling.views.VoipCallFooter) r5
            r2.A0V = r5
            X.03q r3 = r2.A0Q()
            boolean r0 = r3 instanceof X.C187938y3
            if (r0 == 0) goto L_0x0226
            X.8y3 r3 = (X.C187938y3) r3
            r1 = 6
            X.5eZ r0 = new X.5eZ
            r0.<init>(r3, r1)
            r5.setMuteButtonClickListener(r0)
            r1 = 7
            X.5eZ r0 = new X.5eZ
            r0.<init>(r3, r1)
            r5.setToggleVideoButtonClickListener(r0)
            r1 = 8
            X.5eZ r0 = new X.5eZ
            r0.<init>(r3, r1)
            r5.setSpeakerButtonClickListener(r0)
            r1 = 9
            X.5eZ r0 = new X.5eZ
            r0.<init>(r3, r1)
            r5.setBluetoothButtonClickListener(r0)
            r1 = 10
            X.5eZ r0 = new X.5eZ
            r0.<init>(r3, r1)
            r5.setEndCallButtonClickListener(r0)
            r1 = 11
            X.5eZ r0 = new X.5eZ
            r0.<init>(r3, r1)
            r5.A01 = r0
            r1 = 30
            X.5ei r0 = new X.5ei
            r0.<init>(r3, r1, r5)
            r5.A00 = r0
            boolean r1 = r6.A01
            com.whatsapp.calling.views.VoipCallFooter r0 = r2.A0V
            if (r1 == 0) goto L_0x0222
            r0.A01()
        L_0x020a:
            com.whatsapp.calling.views.VoipCallFooter r0 = r2.A0V
            android.view.View r0 = r0.A0H
            r0.setVisibility(r4)
            com.whatsapp.voipcalling.CallInfo r0 = r2.A1T()
            if (r0 == 0) goto L_0x021a
            r3.Bri(r0)
        L_0x021a:
            com.whatsapp.calling.views.VoipCallFooter r1 = r2.A0V
            int r0 = r2.A03
            r1.A02(r0)
            return
        L_0x0222:
            r0.A00()
            goto L_0x020a
        L_0x0226:
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2/failed to get voip activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2.A1L()
            goto L_0x021a
        L_0x022f:
            r0 = 2131431679(0x7f0b10ff, float:1.8485094E38)
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.A0H = r0
            r0 = 2131432578(0x7f0b1482, float:1.8486917E38)
            android.view.View r0 = r1.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.A0I = r0
            r3 = 13
            r1 = 16
            X.AnonymousClass0Y9.A07(r0, r3, r1, r9, r5)
            com.google.android.material.button.MaterialButton r0 = r2.A0H
            X.AnonymousClass0Y9.A07(r0, r3, r1, r9, r5)
            X.7VH r0 = r12.A03
            X.C626936e.A06(r0)
            boolean r3 = r0.A00
            X.5Ml r0 = r2.A0g
            java.lang.String r1 = "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            android.content.Intent r0 = r0.getIntent()
            boolean r6 = X.C18280x3.A1V(r0, r1)
            r0 = 3
            r7 = 1
            if (r10 == r0) goto L_0x026e
            r7 = 0
            if (r10 != r8) goto L_0x026e
            r4 = 1
        L_0x026e:
            com.google.android.material.button.MaterialButton r0 = r2.A0I
            if (r0 == 0) goto L_0x00a7
            com.google.android.material.button.MaterialButton r1 = r2.A0H
            if (r1 == 0) goto L_0x00a7
            r0 = 2131895328(0x7f122420, float:1.9425486E38)
            if (r7 == 0) goto L_0x027e
            r0 = 2131887250(0x7f120492, float:1.9409102E38)
        L_0x027e:
            r1.setText(r0)
            com.google.android.material.button.MaterialButton r1 = r2.A0H
            r0 = 12
            X.C18320x8.A14(r1, r2, r0)
            com.google.android.material.button.MaterialButton r1 = r2.A0I
            r0 = 0
            r1.setIcon(r0)
            com.google.android.material.button.MaterialButton r0 = r2.A0I
            r0.setMaxLines(r5)
            com.google.android.material.button.MaterialButton r1 = r2.A0I
            if (r3 == 0) goto L_0x02a8
            r0 = 2131895307(0x7f12240b, float:1.9425443E38)
        L_0x029a:
            r1.setText(r0)
        L_0x029d:
            com.google.android.material.button.MaterialButton r1 = r2.A0I
            X.7zG r0 = new X.7zG
            r0.<init>(r2, r4, r7)
            r1.setOnClickListener(r0)
            return
        L_0x02a8:
            if (r6 == 0) goto L_0x02ae
            r0 = 2131895327(0x7f12241f, float:1.9425484E38)
            goto L_0x029a
        L_0x02ae:
            r1.setMaxLines(r9)
            com.google.android.material.button.MaterialButton r6 = r2.A0I
            r1 = 2131896425(0x7f122869, float:1.942771E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r2)
            java.lang.String r5 = r0.getString(r1)
            r1 = 2130971027(0x7f040993, float:1.755078E38)
            android.app.Dialog r8 = r2.A03
            if (r8 == 0) goto L_0x029d
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L_0x029d
            android.util.TypedValue r3 = X.AnonymousClass4L0.A0B()
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r0.resolveAttribute(r1, r3, r9)
            android.content.Context r1 = r8.getContext()
            int r0 = r3.resourceId
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r1, r0)
            android.graphics.drawable.Drawable r3 = X.C06130Wj.A01(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            X.AnonymousClass0YG.A06(r3, r0)
            r6.setText(r5)
            r6.setIcon(r3)
            goto L_0x029d
        L_0x02fd:
            java.lang.Object r5 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r5
            X.7jk r12 = (X.C158297jk) r12
            if (r12 == 0) goto L_0x00a7
            X.7Yl r7 = r12.A00
            r4 = 0
            r3 = 8
            if (r7 == 0) goto L_0x030d
            r3 = 0
        L_0x030d:
            X.5UY r0 = r5.A0b
            int r0 = r0.A03()
            boolean r8 = X.AnonymousClass001.A1X(r3, r0)
            X.5UY r0 = r5.A0b
            r0.A06(r3)
            if (r3 != 0) goto L_0x03c9
            X.5UY r0 = r5.A0b
            android.view.View r6 = r0.A04()
            com.whatsapp.calling.controls.view.CallControlHeader r6 = (com.whatsapp.calling.controls.view.CallControlHeader) r6
            X.C162457s7.A0J(r7, r4)
            android.widget.TextView r2 = r6.A04
            X.7Qw r1 = r7.A01
            android.content.Context r0 = r6.getContext()
            java.lang.CharSequence r0 = r1.A00(r0)
            java.lang.String r0 = X.C106815aD.A02(r0)
            r2.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r6.A06
            X.7ZF r1 = r7.A00
            int r0 = r1.A02
            r2.setVisibility(r0)
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x035a
            int r0 = r1.A01
            r2.setIcon((int) r0)
            float r0 = r1.A00
            r2.setAlpha(r0)
            boolean r0 = r1.A03
            r2.setClickable(r0)
        L_0x035a:
            java.lang.Integer r2 = r7.A02
            if (r2 != 0) goto L_0x03a8
            X.5UY r1 = r6.A05
            r0 = 8
            r1.A06(r0)
        L_0x0365:
            if (r8 == 0) goto L_0x00a7
            X.5UY r0 = r5.A0b
            android.view.View r6 = r0.A04()
            com.whatsapp.calling.controls.view.CallControlHeader r6 = (com.whatsapp.calling.controls.view.CallControlHeader) r6
            X.7En r2 = new X.7En
            r2.<init>(r5)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A06
            r0 = 48
            X.C18300x5.A18(r1, r2, r0)
            android.view.View r1 = r6.A03
            r0 = 49
            X.C18300x5.A18(r1, r2, r0)
        L_0x0382:
            X.5Uk r0 = r5.A0N
            if (r0 == 0) goto L_0x038c
            r0.A01()
            r0.A02()
        L_0x038c:
            X.5Ml r0 = r5.A0g
            if (r0 == 0) goto L_0x00a7
            if (r3 != 0) goto L_0x0393
            r4 = 1
        L_0x0393:
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            r1.A2A = r4
            boolean r0 = r1.A2G
            if (r0 == 0) goto L_0x00a7
            com.whatsapp.voipcalling.CallInfo r0 = r1.A7D()
            if (r0 == 0) goto L_0x00a7
            r1.A7l(r0)
            r1.A7o(r0)
            return
        L_0x03a8:
            X.5UY r0 = r6.A05
            r0.A06(r4)
            android.widget.TextView r1 = r6.A00
            if (r1 != 0) goto L_0x03c1
            android.view.View r1 = r0.A04()
            r0 = 2131432067(0x7f0b1283, float:1.848588E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r1, r0)
            r6.A00 = r1
            if (r1 != 0) goto L_0x03c1
            goto L_0x0365
        L_0x03c1:
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
            goto L_0x0365
        L_0x03c9:
            if (r8 == 0) goto L_0x00a7
            goto L_0x0382
        L_0x03cc:
            java.lang.Object r4 = r11.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r4
            X.7k5 r12 = (X.C158507k5) r12
            X.5Uk r3 = r4.A0N
            if (r3 == 0) goto L_0x03e4
            int r1 = r12.A00
            r0 = 2
            r5 = 1
            boolean r6 = X.AnonymousClass000.A1U(r1, r0)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0414
            if (r6 != 0) goto L_0x0414
        L_0x03e4:
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r2 = r4.A0P
            r2.A00 = r12
            X.4xk r0 = r2.A07
            X.5XK r0 = r0.A08()
            boolean r1 = r2.A0G(r0)
            X.08M r0 = r2.A03
            X.C86624Kv.A1C(r0, r1)
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r3 = r4.A0Q
            android.content.res.Configuration r0 = X.C86604Kt.A0A(r4)
            int r2 = r0.orientation
            int r1 = r12.A00
            r0 = 2
            if (r1 != r0) goto L_0x0407
            r1 = 1
            if (r2 == r0) goto L_0x0408
        L_0x0407:
            r1 = 0
        L_0x0408:
            int r0 = r3.A00
            if (r0 == r1) goto L_0x00a7
            r3.A00 = r1
            X.4xk r0 = r3.A02
            X.AnonymousClass4VK.A02(r0, r3)
            return
        L_0x0414:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController setFlexState "
            X.C18260x0.A1P(r1, r0, r12)
            android.animation.ValueAnimator r0 = r3.A04
            r1 = 0
            if (r0 == 0) goto L_0x0427
            r0.cancel()
            r3.A04 = r1
        L_0x0427:
            android.animation.ValueAnimator r0 = r3.A03
            if (r0 == 0) goto L_0x0430
            r0.cancel()
            r3.A03 = r1
        L_0x0430:
            android.view.View r2 = r3.A0D
            r2.clearAnimation()
            boolean r0 = r3.A07
            if (r6 == 0) goto L_0x048d
            if (r0 == 0) goto L_0x043e
            r3.A06(r1)
        L_0x043e:
            android.graphics.Rect r0 = r12.A02
            X.C626936e.A06(r0)
            int r6 = r0.bottom
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165529(0x7f070159, float:1.7945278E38)
            int r1 = X.C86654Ky.A02(r1, r0, r6)
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            int r0 = r0 - r1
            X.02f r1 = X.AnonymousClass001.A0W(r2)
            r1.height = r0
            r0 = 80
            r1.A02 = r0
            r2.setLayoutParams(r1)
            r0 = 0
            r2.setTranslationY(r0)
            r2.requestLayout()
            r3.A07(r5)
        L_0x0472:
            android.view.View r5 = r3.A0F
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r5)
            boolean r1 = r3.A07
            r0 = -2
            if (r1 != 0) goto L_0x047e
            r0 = -1
        L_0x047e:
            r2.height = r0
            r5.setLayoutParams(r2)
            r5.requestLayout()
            r0 = 200(0xc8, double:9.9E-322)
            r3.A04(r0)
            goto L_0x03e4
        L_0x048d:
            if (r0 != 0) goto L_0x0494
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0I
            r3.A06(r0)
        L_0x0494:
            r3.A01()
            r3.A02()
            r0 = 0
            r2.setVisibility(r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r3.A0M
            X.5Ml r0 = r1.A0g
            if (r0 == 0) goto L_0x04a7
            r0.A00(r5)
        L_0x04a7:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A1Y(r0)
            r2.setAlpha(r0)
            int r2 = r3.A02
            if (r2 == 0) goto L_0x0472
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController restorePendingState "
            X.C18260x0.A0y(r0, r1, r2)
            int r1 = r3.A02
            r0 = 5
            if (r1 != r0) goto L_0x04c5
            r0 = 4
            r3.A02 = r0
            r1 = 4
        L_0x04c5:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0I
            r0.A0S(r1)
            r0 = 0
            r3.A02 = r0
            goto L_0x0472
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5CT.BOf(java.lang.Object):void");
    }
}
