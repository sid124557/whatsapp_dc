package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.4VK  reason: invalid class name */
public class AnonymousClass4VK extends C05550Ty {
    public static void A03(CallGridViewModel callGridViewModel) {
        callGridViewModel.A0T(callGridViewModel.A0R.A08(), false);
    }

    public static void A01(CallAvatarViewModel callAvatarViewModel, String str) {
        callAvatarViewModel.A08.A04(2, callAvatarViewModel.A0G(), str, callAvatarViewModel.A05.A00);
        callAvatarViewModel.A0I(str, true);
    }

    public static void A04(InCallBannerViewModel inCallBannerViewModel, C103925Oy r3, int i, int i2) {
        C114035mO r1 = new C114035mO(i, i2);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        r3.A01 = r1;
        r3.A00 = scaleType;
        inCallBannerViewModel.A0J(r3.A00());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01af, code lost:
        if (r0 != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x034a, code lost:
        if (r3 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ee, code lost:
        if (r3 == 3) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass5XK r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C91444jd
            if (r0 == 0) goto L_0x0010
            r1 = r11
            X.4jd r1 = (X.C91444jd) r1
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            X.5Lb r0 = r12.A03
            r1.A00 = r0
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r11 instanceof com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel
            if (r0 == 0) goto L_0x002a
            r2 = r11
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r2 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r2
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            boolean r0 = r12.A0C
            if (r0 != 0) goto L_0x032f
            X.08M r1 = r2.A0E
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
            r2.A0G()
            return
        L_0x002a:
            boolean r0 = r11 instanceof com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel
            if (r0 == 0) goto L_0x0042
            r2 = r11
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r2 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel) r2
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            X.4FS r4 = r2.A0N
            r0 = 18
            X.3a5 r1 = new X.3a5
            r1.<init>(r2, r0, r12)
        L_0x003e:
            r4.BkP(r1)
            return
        L_0x0042:
            boolean r0 = r11 instanceof com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel
            if (r0 == 0) goto L_0x0062
            r3 = r11
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r3 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r3
            boolean r2 = X.AnonymousClass745.A00(r12)
            X.107 r1 = r3.A0E
            boolean r0 = r12.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0I(r0)
            X.4FS r4 = r3.A0G
            r0 = 10
            X.5sI r1 = new X.5sI
            r1.<init>(r3, r12, r0, r2)
            goto L_0x003e
        L_0x0062:
            boolean r0 = r11 instanceof com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel
            if (r0 == 0) goto L_0x00d5
            r4 = r11
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r4 = (com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel) r4
            com.whatsapp.voipcalling.CallState r1 = r12.A07
            boolean r2 = com.whatsapp.voipcalling.Voip.A08(r1)
            boolean r0 = r12.A0G
            if (r0 == 0) goto L_0x0095
            if (r2 == 0) goto L_0x0095
            int r6 = r4.A00
            boolean r0 = r12.A0E
            X.7VH r3 = new X.7VH
            r3.<init>(r0)
            r2 = 1
        L_0x007f:
            r0 = 0
            X.7Wh r5 = new X.7Wh
            r5.<init>(r0, r3, r2, r6)
        L_0x0085:
            X.08M r1 = r4.A01
            java.lang.Object r0 = r1.A07()
            boolean r0 = X.AnonymousClass75J.A00(r0, r5)
            if (r0 != 0) goto L_0x000f
            r1.A0H(r5)
            return
        L_0x0095:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 != r0) goto L_0x00a7
            r1 = 4
        L_0x009a:
            r2 = 3
            r0 = 0
            int r6 = r4.A00
            X.7VH r3 = new X.7VH
            if (r1 == r2) goto L_0x00be
            r3.<init>(r0)
            r2 = 4
            goto L_0x007f
        L_0x00a7:
            int r1 = r12.A00
            r0 = 1
            if (r1 == r0) goto L_0x00bc
            r0 = 2
            if (r1 == r0) goto L_0x00bc
            if (r2 == 0) goto L_0x00c2
            r0 = 3
            if (r1 == r0) goto L_0x00c2
            r1 = 0
            r0 = 0
            X.7Wh r5 = new X.7Wh
            r5.<init>(r0, r0, r1, r1)
            goto L_0x0085
        L_0x00bc:
            r1 = 3
            goto L_0x009a
        L_0x00be:
            r3.<init>(r0)
            goto L_0x007f
        L_0x00c2:
            int r3 = r4.A00
            boolean r1 = r12.A0K
            com.whatsapp.jid.UserJid r0 = r12.A06
            X.7Vs r2 = new X.7Vs
            r2.<init>(r0, r1)
            r1 = 2
            r0 = 0
            X.7Wh r5 = new X.7Wh
            r5.<init>(r2, r0, r1, r3)
            goto L_0x0085
        L_0x00d5:
            boolean r0 = r11 instanceof com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel
            if (r0 == 0) goto L_0x016c
            r4 = r11
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r4 = (com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel) r4
            boolean r5 = r12.A0K
            r4.A02 = r5
            int r3 = r12.A00
            r1 = 1
            if (r3 == r1) goto L_0x00e9
            r0 = 2
            if (r3 == r0) goto L_0x00e9
            r1 = 0
        L_0x00e9:
            r2 = 0
            if (r1 != 0) goto L_0x00f0
            r0 = 3
            r1 = 0
            if (r3 != r0) goto L_0x00f1
        L_0x00f0:
            r1 = 1
        L_0x00f1:
            r4.A01 = r1
            boolean r0 = r12.A0F
            if (r0 != 0) goto L_0x00fa
            if (r1 != 0) goto L_0x00fa
            r2 = 1
        L_0x00fa:
            X.08M r0 = r4.A05
            X.C86624Kv.A1C(r0, r2)
            boolean r1 = X.AnonymousClass745.A00(r12)
            X.107 r2 = r4.A0A
            java.lang.Object r0 = r2.A07()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0116
            r2.A0H(r1)
        L_0x0116:
            X.107 r3 = r4.A0B
            java.lang.Object r0 = r3.A07()
            boolean r2 = r12.A0J
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012b
            r3.A0H(r1)
        L_0x012b:
            r1 = 1
            boolean r0 = X.AnonymousClass745.A00(r12)
            if (r0 != 0) goto L_0x016a
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x016a
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x016a
            if (r5 == 0) goto L_0x016a
            if (r2 != 0) goto L_0x016a
            X.33i r0 = r4.A08
            boolean r0 = X.C107295b4.A09(r0)
            if (r0 != 0) goto L_0x016a
        L_0x0146:
            X.08M r0 = r4.A06
            X.C86624Kv.A1C(r0, r1)
            X.08M r3 = r4.A04
            java.lang.Object r2 = r3.A07()
            boolean r0 = r12.A0G
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass75J.A00(r2, r1)
            if (r0 != 0) goto L_0x0160
            r3.A0H(r1)
        L_0x0160:
            boolean r1 = r4.A0G(r12)
            X.08M r0 = r4.A03
            X.C86624Kv.A1C(r0, r1)
            return
        L_0x016a:
            r1 = 0
            goto L_0x0146
        L_0x016c:
            boolean r0 = r11 instanceof com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel
            if (r0 == 0) goto L_0x0229
            r7 = r11
            com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel r7 = (com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel) r7
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            X.1VX r9 = r7.A03
            r0 = 4848(0x12f0, float:6.793E-42)
            boolean r0 = r9.A0X(r0)
            if (r0 == 0) goto L_0x000f
            com.whatsapp.voipcalling.CallState r8 = r12.A07
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r8 == r0) goto L_0x0193
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r8 == r0) goto L_0x0193
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 == r0) goto L_0x0193
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 != r0) goto L_0x0381
        L_0x0193:
            boolean r0 = r12.A0F
            if (r0 != 0) goto L_0x0381
            X.1fJ r4 = r12.A04
            if (r4 == 0) goto L_0x01dc
            boolean r5 = r12.A0C
            X.3Ex r3 = r7.A01
            X.5ZU r2 = r7.A02
            X.2sD r1 = r7.A05
            X.3Lq r0 = r7.A04
            X.3ZH r0 = X.AnonymousClass36T.A01(r3, r0, r4, r1, r5)
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = X.C18300x5.A0h(r2, r0)
            if (r0 == 0) goto L_0x01dc
        L_0x01b1:
            X.6pU r6 = new X.6pU
            r6.<init>(r0)
        L_0x01b6:
            r5 = 0
            if (r4 == 0) goto L_0x0383
            boolean r0 = X.AnonymousClass745.A00(r12)
            if (r0 != 0) goto L_0x037d
            X.8OQ r0 = r12.A02
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x01ca:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0374
            X.5Lb r0 = X.C86664Kz.A13(r3)
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x01ca
            int r2 = r2 + 1
            goto L_0x01ca
        L_0x01dc:
            boolean r0 = r12.A0G
            r1 = 0
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x01ef
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 2131895253(0x7f1223d5, float:1.9425334E38)
            X.6pW r6 = X.AnonymousClass4L0.A0N(r1, r0)
            goto L_0x01b6
        L_0x01ef:
            X.8OQ r0 = r12.A02
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r5 = X.C18300x5.A0t(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x01fd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0213
            X.5Lb r1 = X.C86664Kz.A13(r2)
            boolean r0 = r1.A0J
            if (r0 != 0) goto L_0x01fd
            com.whatsapp.jid.UserJid r0 = r1.A08
            if (r0 == 0) goto L_0x01fd
            r5.add(r0)
            goto L_0x01fd
        L_0x0213:
            X.3Ex r3 = r7.A01
            X.5ZU r2 = r7.A02
            int r0 = r5.size()
            boolean r1 = X.C18310x6.A1W(r0)
            r0 = 2
            X.7Qw r6 = X.C107305b5.A04(r3, r2, r5, r0, r1)
            if (r6 != 0) goto L_0x01b6
            java.lang.String r0 = ""
            goto L_0x01b1
        L_0x0229:
            boolean r0 = r11 instanceof com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel
            if (r0 == 0) goto L_0x02ee
            r7 = r11
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r7 = (com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r7
            com.whatsapp.voipcalling.CallState r1 = r12.A07
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            r6 = 1
            r5 = 0
            if (r1 != r0) goto L_0x027a
            com.whatsapp.jid.UserJid r2 = r12.A05
            if (r2 == 0) goto L_0x0274
            X.2sr r1 = r7.A03
            boolean r0 = r1.A0a(r2)
            if (r0 == 0) goto L_0x026b
            X.2og r0 = r1.A0D
            java.lang.String r0 = r0.A03()
        L_0x024a:
            if (r0 == 0) goto L_0x0274
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            r0 = 2131887253(0x7f120495, float:1.9409108E38)
        L_0x0253:
            X.6pW r3 = X.AnonymousClass4L0.A0N(r1, r0)
            X.08M r2 = r7.A01
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131887254(0x7f120496, float:1.940911E38)
            X.6pW r1 = X.AnonymousClass4L0.A0N(r1, r0)
            X.7Y8 r0 = new X.7Y8
            r0.<init>(r1, r3)
            r2.A0H(r0)
            return
        L_0x026b:
            X.5ZU r1 = r7.A06
            X.3Ex r0 = r7.A05
            java.lang.String r0 = X.AnonymousClass5ZU.A01(r0, r1, r2)
            goto L_0x024a
        L_0x0274:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131887252(0x7f120494, float:1.9409106E38)
            goto L_0x0253
        L_0x027a:
            java.lang.String r2 = r12.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x000f
            X.1fJ r10 = r12.A04
            if (r10 == 0) goto L_0x000f
            X.2i6 r1 = r7.A00
            if (r1 == 0) goto L_0x02e3
            java.lang.String r0 = r1.A07
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02e3
            long r0 = r1.A03
            X.33j r8 = r7.A07
            java.util.Locale r2 = X.C620733j.A02(r8)
            java.util.Calendar r3 = java.util.Calendar.getInstance(r2)
            r3.setTimeInMillis(r0)
            r2 = 7
            int r2 = r3.get(r2)
            java.lang.String r9 = X.C107505bQ.A01(r8, r2)
            java.lang.String r4 = X.C107505bQ.A02(r8, r0)
            java.lang.String r8 = X.C107145am.A00(r8, r0)
            X.08M r3 = r7.A01
            X.5ZU r1 = r7.A06
            X.3Ex r0 = r7.A05
            X.3ZH r0 = r0.A0A(r10)
            java.lang.String r0 = X.C18300x5.A0h(r1, r0)
            X.6pU r2 = new X.6pU
            r2.<init>(r0)
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.2i6 r0 = r7.A00
            java.lang.String r0 = r0.A06
            r1[r5] = r0
            r1[r6] = r9
            X.AnonymousClass001.A1H(r4, r8, r1)
            r0 = 2131887280(0x7f1204b0, float:1.9409163E38)
            X.6pW r1 = X.AnonymousClass4L0.A0N(r1, r0)
            X.7Y8 r0 = new X.7Y8
            r0.<init>(r2, r1)
            r3.A0H(r0)
            return
        L_0x02e3:
            X.4FS r4 = r7.A09
            r0 = 11
            X.3a5 r1 = new X.3a5
            r1.<init>(r7, r0, r12)
            goto L_0x003e
        L_0x02ee:
            boolean r0 = r11 instanceof com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x02fa
            r1 = r11
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            r0 = 0
            r1.A0T(r12, r0)
            return
        L_0x02fa:
            boolean r0 = r11 instanceof com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel
            if (r0 == 0) goto L_0x000f
            r4 = r11
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r4 = (com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel) r4
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            boolean r3 = r4.A03
            com.whatsapp.voipcalling.CallState r1 = r12.A07
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            r2 = 0
            if (r1 != r0) goto L_0x031b
            boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x031b
            X.5Lb r0 = r12.A03
            r1 = 1
            if (r0 == 0) goto L_0x032d
            boolean r0 = r0.A0C
            if (r0 != r1) goto L_0x032d
        L_0x031b:
            r4.A03 = r2
            if (r2 == 0) goto L_0x000f
            if (r3 != 0) goto L_0x000f
            boolean r0 = r4.A0K()
            if (r0 != 0) goto L_0x03e1
            java.lang.String r0 = "voip/CallAvatarViewModel/maybeShowUpsellBanner Criteria for showing banner is not met"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x032d:
            r2 = 1
            goto L_0x031b
        L_0x032f:
            boolean r4 = r2.A0A
            com.whatsapp.voipcalling.CallState r3 = r12.A07
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r3 == r0) goto L_0x034c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r3 == r0) goto L_0x034c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 == r0) goto L_0x034c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r3 == r0) goto L_0x034c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 == r0) goto L_0x034c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r1 = 0
            if (r3 != r0) goto L_0x034d
        L_0x034c:
            r1 = 1
        L_0x034d:
            r2.A0A = r1
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 != r0) goto L_0x0359
            r0 = 0
            r2.A09 = r0
            r0 = 0
            r2.A06 = r0
        L_0x0359:
            java.lang.String r0 = r12.A08
            if (r1 != 0) goto L_0x035e
            r0 = 0
        L_0x035e:
            r2.A05 = r0
            if (r4 == r1) goto L_0x036c
            if (r1 == 0) goto L_0x0370
            X.5jr r0 = r2.A0J
            android.os.Handler r1 = r0.A00
            r0 = 4
            X.C18290x4.A1C(r1, r2, r0)
        L_0x036c:
            r2.A0H(r12)
            return
        L_0x0370:
            r2.A0G()
            goto L_0x036c
        L_0x0374:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 8
            if (r2 <= r0) goto L_0x037d
            r5 = r1
        L_0x037d:
            r4 = 2131234188(0x7f080d8c, float:1.8084535E38)
            goto L_0x0386
        L_0x0381:
            r2 = 0
            goto L_0x03a7
        L_0x0383:
            r4 = 2131232856(0x7f080858, float:1.8081833E38)
        L_0x0386:
            int r1 = r8.ordinal()
            r8 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            r0 = 6
            r2 = 0
            if (r1 == r0) goto L_0x03db
            r0 = 10
            if (r1 == r0) goto L_0x03db
            if (r1 == r3) goto L_0x03b2
            r0 = 2
            if (r1 == r0) goto L_0x03b2
        L_0x039a:
            r3 = 8
            r0 = 0
            X.7ZF r1 = new X.7ZF
            r1.<init>(r0, r4, r3, r2)
        L_0x03a2:
            X.7Yl r2 = new X.7Yl
            r2.<init>(r1, r6, r5)
        L_0x03a7:
            X.107 r1 = r7.A06
            X.7jk r0 = new X.7jk
            r0.<init>(r2)
            r1.A0H(r0)
            return
        L_0x03b2:
            r0 = 5088(0x13e0, float:7.13E-42)
            boolean r0 = r9.A0X(r0)
            if (r0 == 0) goto L_0x039a
            boolean r0 = r12.A0G
            if (r0 != 0) goto L_0x03db
            java.lang.String r1 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r1)
            if (r0 == 0) goto L_0x03d2
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A00(r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x03db
        L_0x03d2:
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            X.7ZF r1 = new X.7ZF
            r1.<init>(r0, r4, r2, r2)
            goto L_0x03a2
        L_0x03db:
            X.7ZF r1 = new X.7ZF
            r1.<init>(r8, r4, r2, r3)
            goto L_0x03a2
        L_0x03e1:
            X.4Gj r0 = r4.A02
            r3 = 0
            if (r0 == 0) goto L_0x03e9
            r0.AyX(r3)
        L_0x03e9:
            X.4C6 r2 = X.AnonymousClass0IV.A00(r4)
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$maybeShowUpsellBanner$1 r1 = new com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$maybeShowUpsellBanner$1
            r1.<init>(r4, r3)
            r0 = 3
            X.4Gj r0 = X.C616131n.A02(r3, r1, r2, r3, r0)
            r4.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VK.A0D(X.5XK):void");
    }

    public void A0F(UserJid userJid, boolean z, boolean z2) {
        if (this instanceof ScreenShareViewModel) {
            ScreenShareViewModel screenShareViewModel = (ScreenShareViewModel) this;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ScreenShareViewModel onScreenShareStateChanged -- jid: ");
            A0o.append(userJid);
            A0o.append(", isStarted: ");
            A0o.append(z);
            C18260x0.A1E(", supportsGroupCallSharing: ", A0o, z2);
            if (screenShareViewModel.A06.A0a(userJid)) {
                if (z) {
                    screenShareViewModel.A0L(AnonymousClass58I.STARTED);
                } else {
                    screenShareViewModel.A0I();
                    C85474Gj r1 = screenShareViewModel.A09.A0G;
                    if (r1 != null) {
                        r1.AyX((CancellationException) null);
                    }
                }
                screenShareViewModel.A09.A0H = z;
            }
        } else if (this instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) this;
            if (!userJid.equals(C56972sr.A04(inCallBannerViewModel.A01))) {
                String A0H = inCallBannerViewModel.A06.A0H(inCallBannerViewModel.A05.A0A(userJid));
                if (A0H == null) {
                    Log.e("InCallBannerViewModel/onScreenShareStateChanged contact name is null");
                    return;
                }
                int i = 10;
                if (z) {
                    i = 9;
                }
                C137926pU r3 = new C137926pU(A0H);
                int i2 = R.string.f11nameremoved;
                if (z) {
                    i2 = R.string.f11nameremoved;
                }
                C103925Oy r2 = new C103925Oy(r3, AnonymousClass4L0.A0N(AnonymousClass4L0.A0U(), i2), i, R.color.f5nameremoved);
                List singletonList = Collections.singletonList(userJid);
                r2.A05 = true;
                r2.A03.addAll(singletonList);
                inCallBannerViewModel.A0J(r2.A00());
            }
        }
    }

    public static Object A00(CallAvatarViewModel callAvatarViewModel, String str) {
        Log.i(str);
        Object A07 = callAvatarViewModel.A0K.A07();
        C162457s7.A0D(A07);
        return A07;
    }

    public static void A02(C97174xk r0, AnonymousClass4VK r1) {
        r1.A0D(r0.A08());
    }

    public void A0E(UserJid userJid) {
    }
}
