package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass08M;
import X.AnonymousClass0O1;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass2F7;
import X.AnonymousClass30V;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass36T;
import X.AnonymousClass3XI;
import X.AnonymousClass3Z6;
import X.AnonymousClass3ZH;
import X.AnonymousClass49P;
import X.AnonymousClass49Q;
import X.AnonymousClass4C1;
import X.AnonymousClass4FV;
import X.AnonymousClass4I8;
import X.AnonymousClass4KG;
import X.AnonymousClass4SG;
import X.AnonymousClass4VK;
import X.AnonymousClass58J;
import X.AnonymousClass5AJ;
import X.AnonymousClass5AK;
import X.AnonymousClass5IO;
import X.AnonymousClass5IP;
import X.AnonymousClass5TU;
import X.AnonymousClass5TW;
import X.AnonymousClass5U0;
import X.AnonymousClass5UY;
import X.AnonymousClass5V0;
import X.AnonymousClass5VR;
import X.AnonymousClass5WX;
import X.AnonymousClass5XJ;
import X.AnonymousClass5Z0;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass661;
import X.AnonymousClass69W;
import X.AnonymousClass75J;
import X.AnonymousClass7HF;
import X.AnonymousClass7HU;
import X.AnonymousClass8GN;
import X.AnonymousClass8M9;
import X.AnonymousClass91D;
import X.C003403v;
import X.C08240dc;
import X.C08310eF;
import X.C102995Lb;
import X.C103325Ml;
import X.C103775Oj;
import X.C104965Ta;
import X.C105055Tk;
import X.C105315Uk;
import X.C106155Xv;
import X.C106165Xw;
import X.C106645Zu;
import X.C107215at;
import X.C107285b3;
import X.C107295b4;
import X.C107305b5;
import X.C107335b8;
import X.C107555bV;
import X.C107595bZ;
import X.C107695bk;
import X.C109405eZ;
import X.C109495ei;
import X.C111095hX;
import X.C111355hx;
import X.C112455jl;
import X.C112515jr;
import X.C113905mB;
import X.C114015mM;
import X.C116655qe;
import X.C117105rO;
import X.C117665sI;
import X.C1224364j;
import X.C1230066r;
import X.C1235268t;
import X.C138486qS;
import X.C141356vR;
import X.C142136wh;
import X.C149827Ob;
import X.C150997Ta;
import X.C158397ju;
import X.C15930sC;
import X.C162457s7;
import X.C166087y7;
import X.C170918Fa;
import X.C172598Ly;
import X.C179808jk;
import X.C182138nv;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C185958uW;
import X.C186288v3;
import X.C187938y3;
import X.C187958y5;
import X.C187968y6;
import X.C189078zx;
import X.C19340zH;
import X.C29171iO;
import X.C29421in;
import X.C33391sv;
import X.C379724t;
import X.C47702dg;
import X.C52412lR;
import X.C54292oU;
import X.C55422qK;
import X.C56322rn;
import X.C56422rx;
import X.C56572sD;
import X.C56602sG;
import X.C56762sW;
import X.C56892sj;
import X.C56962sq;
import X.C57162tC;
import X.C58152un;
import X.C59852xb;
import X.C618932r;
import X.C619532x;
import X.C620433g;
import X.C620633i;
import X.C623834u;
import X.C626936e;
import X.C627436k;
import X.C627736r;
import X.C64223Cq;
import X.C64333Db;
import X.C64773Ex;
import X.C66433Lk;
import X.C66493Lq;
import X.C72333dY;
import X.C72343dZ;
import X.C73153f1;
import X.C73813g7;
import X.C84154Bf;
import X.C85804Hr;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C89434cw;
import X.C91094iu;
import X.C91114iw;
import X.C91124ix;
import X.C91134iy;
import X.C91154j0;
import X.C91444jd;
import X.C91894lM;
import X.C94514rT;
import X.C95814uZ;
import X.C97094xc;
import X.C998258i;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Pair;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.CallDetailsLayout;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel;
import com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.calling.views.AppSettingsWarningDialogFragment;
import com.whatsapp.calling.views.VoipCallFooter;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class VoipActivityV2 extends C89434cw implements AnonymousClass661, ViewTreeObserver.OnGlobalLayoutListener, C1224364j, C182138nv, C187938y3, C84154Bf, C179808jk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public PictureInPictureParams.Builder A09;
    public Drawable A0A;
    public Drawable A0B;
    public Drawable A0C;
    public Handler A0D;
    public View.OnClickListener A0E;
    public View.OnClickListener A0F;
    public View.OnClickListener A0G;
    public View.OnClickListener A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public ViewGroup A0Q;
    public ViewGroup A0R;
    public ImageButton A0S;
    public ImageView A0T;
    public ImageView A0U;
    public ImageView A0V;
    public TextView A0W;
    public TextView A0X;
    public TextView A0Y;
    public AnonymousClass0O1 A0Z;
    public DialogFragment A0a;
    public DialogFragment A0b;
    public DialogFragment A0c;
    public DialogFragment A0d;
    public C29171iO A0e;
    public WaImageView A0f;
    public WaTextView A0g;
    public C620433g A0h;
    public C56962sq A0i;
    public CallDetailsLayout A0j;
    public AnonymousClass2F7 A0k;
    public AnonymousClass49P A0l;
    public C106155Xv A0m;
    public CallAvatarViewModel A0n;
    public AnonymousClass8GN A0o;
    public CallGrid A0p;
    public C103775Oj A0q;
    public VoipInCallNotifBanner A0r;
    public CallGridViewModel A0s;
    public InCallBannerViewModel A0t;
    public MenuBottomSheetViewModel A0u;
    public OrientationViewModel A0v;
    public CallHeaderViewModel A0w;
    public C33391sv A0x;
    public CallScreenViewModel A0y;
    public C1230066r A0z;
    public C186288v3 A10;
    public AnonymousClass5AK A11;
    public C149827Ob A12;
    public AnonymousClass5U0 A13;
    public AnonymousClass5TU A14;
    public ScreenShareViewModel A15;
    public C107285b3 A16;
    public C112515jr A17;
    public AnonymousClass5XJ A18;
    public AnonymousClass5Z0 A19;
    public C91444jd A1A;
    public AnonymousClass5IO A1B;
    public C116655qe A1C;
    public AppSettingsWarningDialogFragment A1D;
    public C187968y6 A1E;
    public AnonymousClass5IP A1F;
    public AnonymousClass5TW A1G;
    public C150997Ta A1H;
    public C64773Ex A1I;
    public C56602sG A1J;
    public C29421in A1K;
    public C56422rx A1L;
    public AnonymousClass5ZU A1M;
    public C114015mM A1N;
    public C111355hx A1O;
    public ContactPickerFragment A1P;
    public C619532x A1Q;
    public CallSuggestionsViewModel A1R;
    public C64223Cq A1S;
    public C113905mB A1T;
    public C54292oU A1U;
    public C57162tC A1V;
    public AnonymousClass33T A1W;
    public AnonymousClass5ZR A1X;
    public C56762sW A1Y;
    public C56892sj A1Z;
    public C56322rn A1a;
    public C55422qK A1b;
    public C52412lR A1c;
    public AnonymousClass4FV A1d;
    public C66493Lq A1e;
    public UserJid A1f;
    public AnonymousClass3XI A1g;
    public AnonymousClass5WX A1h;
    public C623834u A1i;
    public C56572sD A1j;
    public AnonymousClass30V A1k;
    public C105055Tk A1l;
    public C106165Xw A1m;
    public C187958y5 A1n;
    public AnonymousClass5UY A1o;
    public AnonymousClass5UY A1p;
    public C138486qS A1q;
    public C97094xc A1r;
    public C103325Ml A1s;
    public VoipCallControlBottomSheetV2 A1t;
    public VoipCameraManager A1u;
    public C183538qC A1v;
    public C183538qC A1w;
    public String A1x;
    public String A1y;
    public AnonymousClass4C1 A1z;
    public AnonymousClass4C1 A20;
    public AnonymousClass4C1 A21;
    public boolean A22;
    public boolean A23;
    public boolean A24;
    public boolean A25;
    public boolean A26;
    public boolean A27;
    public boolean A28;
    public boolean A29;
    public boolean A2A;
    public boolean A2B;
    public boolean A2C;
    public boolean A2D;
    public boolean A2E;
    public boolean A2F;
    public boolean A2G;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;
    public boolean A2K;
    public boolean A2L;
    public boolean A2M;
    public boolean A2N;
    public final View.OnClickListener A2O;
    public final AnonymousClass49Q A2P;
    public final C185958uW A2Q;

    public class NonActivityDismissDialogFragment extends Hilt_VoipActivityV2_NonActivityDismissDialogFragment {
        public static DialogFragment A00(String str, boolean z) {
            NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("text", str);
            A08.putBoolean("dismiss", z);
            nonActivityDismissDialogFragment.A0u(A08);
            return nonActivityDismissDialogFragment;
        }

        public Dialog A1J(Bundle bundle) {
            Bundle A0H = A0H();
            C19340zH A0K = C18280x3.A0K(this);
            A0K.A0g(A0H.getString("text"));
            A0K.A0i(true);
            if (A0H.getBoolean("dismiss", false)) {
                C85804Hr.A01(A0K, this, 113, R.string.f11nameremoved);
            }
            return A0K.create();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r7 != 10) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r0.A3M == 7) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A7G(com.whatsapp.jid.UserJid r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            r1 = 2131895262(0x7f1223de, float:1.9425352E38)
            if (r7 == r0) goto L_0x0031
            r0 = 17
            if (r7 == r0) goto L_0x002e
            r0 = 25
            if (r7 == r0) goto L_0x0021
            r0 = 4
            r1 = 2131895284(0x7f1223f4, float:1.9425397E38)
            if (r7 == r0) goto L_0x0031
            r0 = 5
            if (r7 == r0) goto L_0x0036
            r0 = 9
            r2 = 0
            if (r7 == r0) goto L_0x0025
            r0 = 10
            if (r7 == r0) goto L_0x0021
        L_0x0020:
            return r2
        L_0x0021:
            r1 = 2131895250(0x7f1223d2, float:1.9425328E38)
            goto L_0x0031
        L_0x0025:
            X.5b3 r0 = r5.A16
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A3M
            r0 = 7
            if (r1 != r0) goto L_0x0020
        L_0x002e:
            r1 = 2131895419(0x7f12247b, float:1.942567E38)
        L_0x0031:
            java.lang.String r0 = r5.getString(r1)
            return r0
        L_0x0036:
            r4 = 2131892300(0x7f12184c, float:1.9419344E38)
            java.lang.Object[] r3 = X.AnonymousClass002.A0L()
            r2 = 0
            X.5ZU r1 = r5.A1M
            X.3Ex r0 = r5.A1I
            X.3ZH r0 = r0.A0A(r6)
            X.C18300x5.A1E(r1, r0, r3, r2)
            java.lang.String r0 = r5.getString(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7G(com.whatsapp.jid.UserJid, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7b(int r6) {
        /*
            r5 = this;
            r4 = 1
            r5.A2M = r4
            com.whatsapp.calling.views.AppSettingsWarningDialogFragment r3 = r5.A1D
            java.lang.String r2 = "AppSettingsWarningDialogFragment"
            if (r3 == 0) goto L_0x0013
            int r0 = r3.A00
            if (r6 == r0) goto L_0x0026
            r5.A7C(r2)
            r0 = 0
            r5.A1D = r0
        L_0x0013:
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "reason"
            r1.putInt(r0, r6)
            com.whatsapp.calling.views.AppSettingsWarningDialogFragment r3 = new com.whatsapp.calling.views.AppSettingsWarningDialogFragment
            r3.<init>()
            r3.A0u(r1)
            r5.A1D = r3
        L_0x0026:
            boolean r0 = r5.A2C
            if (r0 != 0) goto L_0x003b
            X.7IX r0 = new X.7IX
            r0.<init>()
            r0.A01 = r4
            boolean r1 = r0.A00
            X.7ju r0 = new X.7ju
            r0.<init>(r4, r1)
            r5.A79(r3, r0, r2)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7b(int):void");
    }

    public void A7s(CharSequence charSequence) {
        this.A0W.setText(charSequence);
        this.A0L.setVisibility(0);
        this.A0W.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        AnonymousClass0YY.A04((Drawable) null, this.A0L);
        this.A0K.setVisibility(8);
        this.A0g.setVisibility(8);
    }

    public final boolean A88(CallInfo callInfo) {
        CallState callState = callInfo.callState;
        return callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY || callState == CallState.LINK || callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.PRECALLING || this.A23;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r1.A0G(r14.callId) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (X.C86604Kt.A1Z(r0.A0F) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bri(com.whatsapp.voipcalling.CallInfo r14) {
        /*
            r13 = this;
            r7 = r14
            com.whatsapp.voipcalling.CallState r1 = r13.A7F(r14)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x008d
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r1)
            if (r0 != 0) goto L_0x008d
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r13.A1t
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x004b
            com.whatsapp.calling.views.VoipCallFooter r6 = r0.A0V
            if (r6 == 0) goto L_0x004b
            X.5b3 r0 = r13.A16
            if (r0 == 0) goto L_0x0093
            java.lang.String r8 = r0.A11
            X.5pi r1 = r0.A1m
            int r9 = r1.A00
            java.lang.String r0 = r14.callId
            boolean r0 = r1.A0G(r0)
            r10 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r10 = 0
        L_0x002d:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r13.A0n
            boolean r11 = r0.A0J()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r13.A15
            if (r0 == 0) goto L_0x0040
            X.107 r0 = r0.A0F
            boolean r0 = X.C86604Kt.A1Z(r0)
            r12 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r12 = 0
        L_0x0041:
            r6.A03(r7, r8, r9, r10, r11, r12)
            X.5XJ r0 = r13.A18
            if (r0 == 0) goto L_0x004b
            r0.A01(r14)
        L_0x004b:
            android.view.ViewGroup r0 = r13.A0R
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0074
            android.view.ViewGroup r6 = r13.A0R
            com.whatsapp.jid.GroupJid r0 = r14.groupJid
            if (r0 != 0) goto L_0x0071
            X.1VX r5 = r13.A0D
            com.whatsapp.voipcalling.CallState r2 = r14.callState
            boolean r1 = r14.isGroupCall
            java.lang.String r0 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            boolean r0 = X.C627436k.A0M(r5, r2, r0, r1)
            if (r0 == 0) goto L_0x0091
            boolean r0 = r14.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x0091
        L_0x0071:
            X.C107215at.A05(r6, r4)
        L_0x0074:
            android.widget.ImageButton r2 = r13.A0S
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0084
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0084
            boolean r0 = r13.A23
            if (r0 == 0) goto L_0x008e
        L_0x0084:
            X.5Lb r0 = r14.self
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x008e
        L_0x008a:
            r2.setVisibility(r3)
        L_0x008d:
            return
        L_0x008e:
            r3 = 8
            goto L_0x008a
        L_0x0091:
            r4 = 0
            goto L_0x0071
        L_0x0093:
            r8 = 0
            r9 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.Bri(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void onResume() {
        C107285b3 r0;
        boolean A0X2 = this.A0D.A0X(1807);
        if (A0X2) {
            try {
                this.A02.A07("VoipActivityV2_onResume");
            } catch (Throwable th) {
                if (A0X2) {
                    this.A02.A06("VoipActivityV2_onResume");
                }
                throw th;
            }
        }
        super.onResume();
        this.A2E = false;
        if (this.A0N != null) {
            this.A2D = true;
            this.A2F = true;
            CallInfo A7D = A7D();
            if (!(A7D == null || A7D.callState == CallState.NONE)) {
                A7O();
                this.A0D.sendEmptyMessageDelayed(1, 500);
                if (A7D.videoEnabled) {
                    if (A7D.self.A06 != 6) {
                        UserJid peerJid = A7D.getPeerJid();
                        if (!A7D.isCallLinkLobbyOrJoiningState()) {
                            C626936e.A06(peerJid);
                            C102995Lb infoByJid = A7D.getInfoByJid(peerJid);
                            if (infoByJid != null && infoByJid.A0O) {
                                videoRenderStarted(peerJid);
                            }
                        }
                        A7p(A7D);
                    } else if (this.A2N && (r0 = this.A16) != null) {
                        C86624Kv.A1S(r0.A13, 10);
                    }
                }
                this.A0p.A0A(this, this.A0s, this.A0u, (AudioChatBottomSheetViewModel) null, this.A15);
                if (this.A2N) {
                    this.A2N = false;
                }
                if (A80() && isInPictureInPictureMode()) {
                    onPictureInPictureModeChanged(true, AnonymousClass001.A0M(this));
                } else if (A80() && this.A09 == null) {
                    this.A09 = new PictureInPictureParams.Builder();
                    Rational rational = (Rational) this.A0s.A0L.A07();
                    if (rational != null) {
                        A7g(rational);
                    }
                }
                if (this.A00 == 2) {
                    A7c(3);
                    if (!C18280x3.A1V(getIntent(), "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN")) {
                        A7U();
                    }
                }
                C141356vR r7 = C141356vR.A02;
                Iterator A0q2 = AnonymousClass000.A0q(C73813g7.A0D(this.A00));
                while (A0q2.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                    String A0q3 = C18310x6.A0q(A0w2);
                    AnonymousClass3Z6 r02 = (AnonymousClass3Z6) A0w2.getValue();
                    DialogFragment dialogFragment = (DialogFragment) r02.first;
                    C158397ju r1 = (C158397ju) r02.second;
                    if (r7.ordinal() != 0) {
                        throw C73153f1.A00();
                    } else if (r1.A01) {
                        A6V(dialogFragment, A0q3);
                    }
                }
                if (this.A2M && !C627436k.A0D(this.A08)) {
                    this.A2M = false;
                    if (this.A1n.BIC()) {
                        C106645Zu.A00(this.A17, "refresh_app_background_restrictions");
                    }
                }
            }
        }
        if (A0X2) {
            this.A02.A06("VoipActivityV2_onResume");
        }
    }

    public void onUserInteraction() {
        this.A2F = true;
    }

    public class EndCallConfirmationDialogFragment extends Hilt_VoipActivityV2_EndCallConfirmationDialogFragment {
        public Dialog A1J(Bundle bundle) {
            String string = A0H().getString("message");
            C19340zH A0K = C18280x3.A0K(this);
            A0K.A0g(string);
            A0K.A0i(true);
            C19340zH.A08(A0K, this, 110, R.string.f11nameremoved);
            C19340zH.A07(A0K, this, 111, R.string.f11nameremoved);
            return A0K.create();
        }
    }

    public class MessageDialogFragment extends Hilt_VoipActivityV2_MessageDialogFragment {
        public AnonymousClass5TW A00;

        public Dialog A1J(Bundle bundle) {
            C19340zH A002 = C19340zH.A00(A0G(), A0H().getString("message"));
            A002.A0i(true);
            C19340zH.A08(A002, this, 112, R.string.f11nameremoved);
            return A002.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (A0Q() != null && !this.A00.A01()) {
                A0Q().finish();
            }
        }
    }

    public class RemoveUserConfirmationDialogFragment extends Hilt_VoipActivityV2_RemoveUserConfirmationDialogFragment {
        public C107285b3 A00;
        public C64773Ex A01;
        public AnonymousClass5ZU A02;

        public RemoveUserConfirmationDialogFragment(C107285b3 r1) {
            this.A00 = r1;
        }

        public Dialog A1J(Bundle bundle) {
            Context A0G = A0G();
            C95814uZ r5 = (C95814uZ) A0H().getParcelable("user_jid");
            C626936e.A06(r5);
            String A0h = C18300x5.A0h(this.A02, this.A01.A0A(r5));
            C626936e.A06(A0h);
            C19340zH A002 = AnonymousClass5V0.A00(A0G);
            A002.A0h(AnonymousClass0x7.A0m(this, A0h, new Object[1], R.string.f11nameremoved));
            A002.A0g(C08310eF.A09(this).getString(R.string.f11nameremoved));
            A002.A0i(true);
            C19340zH.A09(A002, r5, this, 23, R.string.f11nameremoved);
            A002.A0W(new AnonymousClass4I8(r5, 24, this), R.string.f11nameremoved);
            A002.A0X(new C85804Hr(this, 114), R.string.f11nameremoved);
            return A002.create();
        }
    }

    public class SwitchCameraForPersonalizedAvatarDialogFragment extends Hilt_VoipActivityV2_SwitchCameraForPersonalizedAvatarDialogFragment {
        public Dialog A1J(Bundle bundle) {
            int i = A0H().getInt("use_case");
            C19340zH A0K = C18280x3.A0K(this);
            int i2 = R.string.f11nameremoved;
            if (i == 0) {
                i2 = R.string.f11nameremoved;
            }
            A0K.A0U(i2);
            int i3 = R.string.f11nameremoved;
            if (i == 0) {
                i3 = R.string.f11nameremoved;
            }
            A0K.A0T(i3);
            C19340zH.A07(A0K, this, 115, R.string.f11nameremoved);
            A0K.A0Y(new AnonymousClass69W(this, i, 4), R.string.f11nameremoved);
            return A0K.create();
        }
    }

    public class SwitchConfirmationFragment extends Hilt_VoipActivityV2_SwitchConfirmationFragment {
        public AnonymousClass33p A00;

        public Dialog A1J(Bundle bundle) {
            C19340zH A0K = C18280x3.A0K(this);
            A0K.A0A(R.string.f11nameremoved);
            AnonymousClass0x2.A0t(new C1235268t(this, 137), A0K, R.string.f11nameremoved);
            AnonymousClass043 create = A0K.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        }
    }

    public class E2EEInfoDialogFragment extends Hilt_VoipActivityV2_E2EEInfoDialogFragment {
        public int A00 = 11;
        public C111095hX A01;
        public AnonymousClass4FV A02;
        public AnonymousClass5WX A03;
        public C66433Lk A04;

        public Dialog A1J(Bundle bundle) {
            int i;
            C19340zH A0K = C18280x3.A0K(this);
            Bundle bundle2 = this.A06;
            if (!(bundle2 == null || (i = bundle2.getInt("entry_point", -1)) == -1)) {
                this.A00 = i;
                this.A03.A00(i, 1);
            }
            A0K.A0A(R.string.f11nameremoved);
            C1235268t.A01(A0K, this, 135, R.string.f11nameremoved);
            A0K.A0X(C1235268t.A00(this, 136), R.string.f11nameremoved);
            return A0K.create();
        }
    }

    public static /* synthetic */ void A0C(Pair pair, VoipActivityV2 voipActivityV2) {
        AnonymousClass5Z0 r2;
        C94514rT r1;
        if (pair != null) {
            AnonymousClass7HF r22 = (AnonymousClass7HF) pair.first;
            int A032 = C18290x4.A03(pair);
            voipActivityV2.A7C("MenuBottomSheet");
            if (A032 == 6) {
                String str = r22.A00;
                boolean z = r22.A01;
                C166087y7 A033 = C107215at.A03(voipActivityV2, str, z);
                if (A033 != null) {
                    voipActivityV2.startActivity(C627736r.A0r(voipActivityV2, A033.A01));
                }
                r2 = voipActivityV2.A19;
                r1 = C107305b5.A02((String) null, 3, 5, z);
            } else if (A032 == 7) {
                String str2 = r22.A00;
                boolean z2 = r22.A01;
                AnonymousClass5VR.A01(voipActivityV2.A05, voipActivityV2.A08, C107305b5.A05(str2, z2));
                r2 = voipActivityV2.A19;
                r1 = C107305b5.A02((String) null, 1, 5, z2);
            } else if (A032 == 8) {
                String str3 = r22.A00;
                boolean z3 = r22.A01;
                C166087y7 A034 = C107215at.A03(voipActivityV2, str3, z3);
                if (Build.VERSION.SDK_INT < 22) {
                    AnonymousClass5Z0 r23 = voipActivityV2.A19;
                    r23.A01.BhD(C107305b5.A02((String) null, 2, 5, z3));
                }
                if (A034 != null) {
                    voipActivityV2.startActivity(C107305b5.A00(voipActivityV2, A034.A01, A034.A00, 5, z3));
                    return;
                }
                return;
            } else {
                return;
            }
            r2.A01.BhD(r1);
        }
    }

    public static void A0L(View view) {
        C18260x0.A0y("calling/VoipUiUtils/animateButtonIn delay:", AnonymousClass001.A0o(), 100);
        ScaleAnimation A0Q2 = C86634Kw.A0Q(0.0f, 1.0f);
        C86644Kx.A19(A0Q2, new OvershootInterpolator(1.0f));
        A0Q2.setStartOffset((long) 100);
        view.startAnimation(A0Q2);
    }

    public static /* synthetic */ void A0X(VoipActivityV2 voipActivityV2) {
        ScreenShareViewModel screenShareViewModel = voipActivityV2.A15;
        if (screenShareViewModel != null) {
            if (!C86604Kt.A1Z(screenShareViewModel.A0F)) {
                voipActivityV2.A14.A09++;
            }
            if (C627436k.A0D(voipActivityV2.A08)) {
                voipActivityV2.A7b(1);
                return;
            }
            if (!C86604Kt.A1Z(voipActivityV2.A15.A0F) && !voipActivityV2.isFinishing()) {
                C106155Xv r4 = voipActivityV2.A0m;
                int A0N2 = r4.A01.A0N(4536);
                boolean z = false;
                if (A0N2 != 0 && A0N2 > r4.A03().getInt("ss_permission_dialog_show_count", 0)) {
                    z = true;
                }
                if (z) {
                    ScreenSharePermissionDialogFragment screenSharePermissionDialogFragment = new ScreenSharePermissionDialogFragment();
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putInt("BodyTextId", R.string.f11nameremoved);
                    A082.putBoolean("CancelEnabled", true);
                    screenSharePermissionDialogFragment.A0u(A082);
                    voipActivityV2.A7A(screenSharePermissionDialogFragment, "ScreenSharePermissionDialogFragment");
                    C106155Xv r3 = voipActivityV2.A0m;
                    C18270x1.A0h(C106155Xv.A00(r3), "ss_permission_dialog_show_count", C86664Kz.A08(r3.A03(), "ss_permission_dialog_show_count", 0));
                    if (r3.A03.BHB()) {
                        C86604Kt.A15(r3.A03(), "as_permission_dialog_show_count", C86664Kz.A08(r3.A03(), "as_permission_dialog_show_count", 0));
                        return;
                    }
                    return;
                }
                C106155Xv r2 = voipActivityV2.A0m;
                if (r2.A01.A0N(4536) != 0 && r2.A03.BHB() && r2.A03().getInt("as_permission_dialog_show_count", 0) < 1) {
                    ScreenSharePermissionDialogFragment screenSharePermissionDialogFragment2 = new ScreenSharePermissionDialogFragment();
                    Bundle A083 = AnonymousClass002.A08();
                    A083.putInt("BodyTextId", R.string.f11nameremoved);
                    A083.putBoolean("CancelEnabled", false);
                    screenSharePermissionDialogFragment2.A0u(A083);
                    voipActivityV2.A7A(screenSharePermissionDialogFragment2, "ScreenSharePermissionDialogFragment");
                    C106155Xv r22 = voipActivityV2.A0m;
                    int A084 = C86664Kz.A08(r22.A03(), "as_permission_dialog_show_count", 0);
                    C86604Kt.A15(r22.A03(), "as_permission_dialog_show_count", A084);
                    voipActivityV2.A14.A00 = A084;
                    return;
                }
            }
            if (voipActivityV2.A0D.A0X(5102)) {
                voipActivityV2.A7t(new C117105rO(voipActivityV2, 24));
                return;
            }
            KeyguardManager A092 = voipActivityV2.A08.A09();
            if (A092 == null || (!A092.isKeyguardLocked() && !A092.inKeyguardRestrictedInputMode())) {
                voipActivityV2.A15.A0M(AnonymousClass58J.BOTTOM_SHEET);
            } else {
                voipActivityV2.A7x(false);
            }
        }
    }

    public static /* synthetic */ void A0Y(VoipActivityV2 voipActivityV2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            Rect A0N2 = AnonymousClass001.A0N();
            voipActivityV2.A0p.getGlobalVisibleRect(A0N2);
            if (voipActivityV2.A80() && voipActivityV2.A00 == 3) {
                C626936e.A07(voipActivityV2.A09, "PiP Params Builder is null");
                voipActivityV2.A09.setSourceRectHint(A0N2);
                voipActivityV2.setPictureInPictureParams(voipActivityV2.A09.build());
            }
            CallGridViewModel callGridViewModel = voipActivityV2.A0s;
            boolean A1W2 = C86624Kv.A1W(A0N2.width(), A0N2.height());
            AnonymousClass107 r1 = callGridViewModel.A0l;
            if (C86604Kt.A1Z(r1) != A1W2) {
                C18320x8.A18(r1, A1W2);
                callGridViewModel.A0K();
                callGridViewModel.A0T(callGridViewModel.A0R.A08(), true);
            }
        }
    }

    public void A5r() {
        if (!this.A29) {
            this.A29 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            C379724t.A00(this, r1.ALf());
            this.A1U = C64333Db.A2q(r2);
            this.A0l = r2.Ai2();
            this.A1d = C64333Db.A4H(r2);
            this.A1j = (C56572sD) r2.AWF.get();
            this.A1c = r2.AkL();
            this.A0z = C86644Kx.A0Q(r2);
            this.A13 = (AnonymousClass5U0) r2.Aa4.get();
            this.A1r = (C97094xc) r1.A29.get();
            this.A1N = C64333Db.A29(r2);
            this.A1G = (AnonymousClass5TW) r2.ASQ.get();
            this.A0o = (AnonymousClass8GN) r1.A9V.get();
            this.A1I = C64333Db.A26(r2);
            this.A1n = C86614Ku.A0o(r2);
            this.A1M = C64333Db.A28(r2);
            this.A1A = (C91444jd) r1.AAS.get();
            this.A0i = C86654Ky.A0T(r2);
            this.A1K = C86614Ku.A0S(r2);
            this.A1e = C64333Db.A5A(r2);
            this.A1B = (AnonymousClass5IO) r1.ABv.get();
            this.A1C = (C116655qe) r1.ABw.get();
            this.A1i = (C623834u) r1.AC9.get();
            this.A1l = C86614Ku.A0k(r2);
            this.A1m = C86614Ku.A0l(r2);
            this.A1Y = (C56762sW) r2.A4R.get();
            this.A1T = C86644Kx.A0T(r2);
            this.A1u = (VoipCameraManager) r2.Aa0.get();
            this.A1S = C86604Kt.A0T(r2);
            this.A10 = A2X.ABk();
            this.A12 = (C149827Ob) r1.A6q.get();
            this.A1w = C72343dZ.A00(r2.ATf);
            this.A1b = (C55422qK) r2.AUG.get();
            this.A1L = C86614Ku.A0T(r2);
            this.A17 = r2.Ai5();
            this.A1X = C64333Db.A2r(r2);
            this.A1a = (C56322rn) r2.AIT.get();
            this.A1H = new C150997Ta(C86604Kt.A0Z(r2));
            this.A0k = (AnonymousClass2F7) r1.A24.get();
            this.A19 = r1.AJu();
            this.A0m = (C106155Xv) r2.Aa5.get();
            this.A1W = (AnonymousClass33T) r2.Aaf.get();
            this.A0h = C86624Kv.A0K(r2);
            this.A1g = (AnonymousClass3XI) r1.A7g.get();
            this.A1Z = C64333Db.A3G(r2);
            this.A14 = (AnonymousClass5TU) r1.AAL.get();
            this.A0e = (C29171iO) r2.A0s.get();
            this.A1Q = (C619532x) r1.AAR.get();
            this.A1E = (C187968y6) r1.A9U.get();
            this.A1h = (AnonymousClass5WX) r1.A9K.get();
            this.A1v = C72343dZ.A00(r2.A82);
            this.A1F = (AnonymousClass5IP) r1.A6l.get();
            this.A1V = C86624Kv.A0R(r2);
            this.A1k = C86604Kt.A0f(r2);
            this.A1z = r1.A9g;
            this.A20 = r1.A9h;
            this.A21 = r1.A9i;
            this.A11 = new AnonymousClass5AK();
        }
    }

    public void A65() {
        Log.d("VoipActivityV2/onActivityCreateAsync");
        CallInfo A7D = A7D();
        if (A7D != null) {
            int i = 10;
            if (A7D.videoEnabled) {
                i = 11;
            }
            this.A1h.A00(i, 0);
        }
    }

    public void A66() {
        this.A1k.A03((C95814uZ) null, 16);
        super.A66();
    }

    public boolean A6B() {
        return true;
    }

    public void A6O(int i) {
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1h(i);
        }
    }

    public boolean A70() {
        return false;
    }

    public C183538qC A74() {
        C183538qC r2 = this.A1w;
        Objects.requireNonNull(r2);
        return C72333dY.A06(new AnonymousClass4KG(r2, 0));
    }

    public void A75() {
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1V();
        }
    }

    public void A77(C59852xb r2) {
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1W();
            ContactPickerFragment.A3q = false;
        }
    }

    public final CallInfo A7E(CallInfo callInfo) {
        String str = this.A1y;
        if (str != null) {
            if (str.equals(callInfo.callWaitingInfo.A04)) {
                return CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
            }
            String str2 = callInfo.callId;
            if (!str.equals(str2)) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("VoipActivityV2/getCallInfoForDisplay CallIdToShow ");
                A0o2.append(str);
                C18260x0.A0q(" does not match current call's id ", str2, A0o2);
            }
        }
        return callInfo;
    }

    public final CallState A7F(CallInfo callInfo) {
        CallState callState = callInfo.callState;
        if (Voip.A08(callState) && this.A23) {
            return CallState.ACCEPT_SENT;
        }
        if (!callInfo.hasOutgoingParticipantInActiveOneToOneCall()) {
            return callState;
        }
        C102995Lb defaultPeerInfo = callInfo.getDefaultPeerInfo();
        C626936e.A06(defaultPeerInfo);
        if (defaultPeerInfo.A02 == 2) {
            return CallState.CALLING;
        }
        if (callInfo.getDefaultPeerInfo().A02 == 3) {
            return CallState.PRE_ACCEPT_RECEIVED;
        }
        return callState;
    }

    public void A7H() {
        if (this.A0c != null) {
            A7C("MessageDialogFragment");
            this.A0c = null;
            this.A1x = null;
        }
        A7C("VoipErrorDialogFragment");
    }

    public final void A7J() {
        C08310eF A0D2;
        Log.i("voip/VoipCallControlBottomSheetV2 detaching bottom sheet");
        if (this.A1t == null) {
            return;
        }
        if (!this.A0D.A0X(4848)) {
            A6c("CallControlSheet");
        } else if (!BHW() && (A0D2 = getSupportFragmentManager().A0D("CallControlSheet")) != null) {
            C08240dc A0J2 = AnonymousClass0x2.A0J(this);
            A0J2.A07(A0D2);
            A0J2.A04();
        }
    }

    public final void A7K() {
        C626936e.A0D(AnonymousClass000.A1W(this.A1P), "contact picker fragment should not be null");
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment != null) {
            if (C86604Kt.A1Y(contactPickerFragment.A2g.A07)) {
                contactPickerFragment.A2g.A02(false);
            }
            this.A1P = null;
            A7O();
            A7C("VoipContactPickerDialogFragment");
            if (this.A2J) {
                A7T();
                this.A2J = false;
            }
        }
    }

    public final void A7M() {
        Log.i("voip/VoipActivityV2/call/end");
        C107285b3 r2 = this.A16;
        if (r2 != null) {
            r2.A0e((CallInfo) null, (String) null, 1);
        }
        this.A25 = true;
    }

    public final void A7N() {
        Log.i("voip/VoipActivityV2/hideInCallControls");
        this.A2K = false;
        this.A0P.setVisibility(8);
        this.A0P.setTranslationY(0.0f);
        this.A0L.setVisibility(8);
        A7J();
        AnonymousClass5UY r0 = this.A1o;
        if (r0 != null) {
            r0.A06(8);
        }
    }

    public final void A7O() {
        if (this.A2D) {
            ContactPickerFragment contactPickerFragment = this.A1P;
            if (contactPickerFragment == null || contactPickerFragment.A0i) {
                this.A0B.A02(this.A0N);
            }
        }
    }

    public final void A7P() {
        if (this.A1P != null) {
            Log.i("contact picker is already shown, ignore new events");
        } else if (A7D() != null) {
            C117105rO r3 = new C117105rO(this, 27);
            if (this.A0D.A0X(5102)) {
                A7t(r3);
                return;
            }
            KeyguardManager A092 = this.A08.A09();
            if (A092 != null && (A092.isKeyguardLocked() || A092.inKeyguardRestrictedInputMode())) {
                A7x(false);
            }
            r3.run();
        }
    }

    public final void A7Q() {
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1t;
        if (voipCallControlBottomSheetV2 != null && voipCallControlBottomSheetV2.A16()) {
            voipCallControlBottomSheetV2.A1L();
        }
        this.A1t = null;
        AnonymousClass5XJ r0 = this.A18;
        if (r0 != null) {
            r0.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (X.C627436k.A0E(r4.A0D) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7S() {
        /*
            r4 = this;
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1t
            if (r0 != 0) goto L_0x005b
            com.whatsapp.voipcalling.CallInfo r3 = r4.A7D()
            boolean r0 = r4.A81()
            r2 = 1
            if (r0 == 0) goto L_0x0018
            X.1VX r0 = r4.A0D
            boolean r0 = X.C627436k.A0E(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r3 == 0) goto L_0x005c
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x005c
        L_0x001f:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A00(r2, r1)
            r4.A1t = r0
            android.view.View r1 = r4.A0P
            r0 = 0
            r1.setTranslationY(r0)
            if (r3 == 0) goto L_0x005b
            boolean r0 = r3.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x005b
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x003f
            com.whatsapp.voipcalling.CallState r0 = r3.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 != 0) goto L_0x005b
        L_0x003f:
            r4.A7T()
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r2 = r4.A0r
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass001.A0T(r2)
            java.lang.String r0 = "VoipCallNewParticipantBanner/resetBannerYPosition"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r2.A02
            r1.bottomMargin = r0
            r2.setLayoutParams(r1)
            X.6qS r0 = r4.A1q
            if (r0 == 0) goto L_0x005b
            r0.A01()
        L_0x005b:
            return
        L_0x005c:
            r2 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7S():void");
    }

    public final void A7T() {
        if (this.A1t != null && !isFinishing()) {
            if (this.A1P != null) {
                this.A2J = true;
                return;
            }
            this.A1t.A1O(getSupportFragmentManager(), "CallControlSheet");
            AnonymousClass5XJ r1 = this.A18;
            if (r1 != null) {
                r1.A00 = this.A1t.A0B;
            }
        }
    }

    public final void A7U() {
        Log.i("voip/VoipActivityV2/showInCallControls");
        this.A2K = true;
        if (this.A1t != null) {
            A7T();
            this.A0q.A00();
            VoipInCallNotifBanner voipInCallNotifBanner = this.A0r;
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(voipInCallNotifBanner);
            Log.i("VoipCallNewParticipantBanner/resetBannerYPosition");
            A0T2.bottomMargin = voipInCallNotifBanner.A02;
            voipInCallNotifBanner.setLayoutParams(A0T2);
        }
        this.A0P.setVisibility(0);
        this.A0P.setTranslationY(0.0f);
        if (this.A0W.length() > 0) {
            this.A0L.setVisibility(0);
        }
        AnonymousClass5UY r0 = this.A1o;
        if (r0 != null) {
            r0.A06(0);
        }
    }

    public final void A7V() {
        Log.i("VoipActivityV2 vm unbindService");
        try {
            C18290x4.A1C(this.A17.A00, this, 5);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
        }
        C107285b3 r2 = this.A16;
        if (r2 != null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "voip/service/resetVoipUiIfEquals ", r2);
            if (r2.A0X == this) {
                r2.A0X = null;
            }
            this.A16 = null;
        }
    }

    public final void A7Z() {
        ScreenShareViewModel screenShareViewModel = this.A15;
        if (screenShareViewModel == null || !C86604Kt.A1Z(screenShareViewModel.A0F)) {
            if (!this.A24) {
                AnonymousClass107 r1 = this.A0n.A0K;
                if (!(r1.A07() instanceof C91134iy) && !(r1.A07() instanceof C91094iu) && !(r1.A07() instanceof C91154j0)) {
                    AnonymousClass107 r12 = this.A0n.A0K;
                    if ((r12.A07() instanceof C91114iw) || (r12.A07() instanceof C91124ix)) {
                        this.A1C.A02();
                        return;
                    } else {
                        Voip.startVideoCaptureStream();
                        return;
                    }
                }
            }
            Voip.stopVideoCaptureStream();
            return;
        }
        Log.i("Screen sharing active, skip capture pause");
    }

    public final void A7a(int i) {
        int i2;
        Log.i("voip/VoipActivityV2/call/accept");
        CallInfo A7D = A7D();
        if (A7D != null && A7D.callState != CallState.NONE) {
            if (!this.A23) {
                C138486qS r0 = this.A1q;
                if (r0 != null) {
                    r0.A01();
                }
                A7T();
            } else {
                Log.w("callAccepted is true when calling acceptCall()");
            }
            this.A23 = true;
            if (this.A16 != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    boolean A0D2 = true ^ this.A1X.A0D();
                    boolean A082 = C107305b5.A08(this.A1X, A7D.videoEnabled);
                    if (A0D2 || A082) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("voip/service/accept noRecordPermission = ");
                        A0o2.append(A0D2);
                        Log.w(AnonymousClass000.A0b(", noCameraPermission = ", A0o2, A082));
                        if (A082) {
                            i2 = R.string.f11nameremoved;
                            if (A0D2) {
                                i2 = R.string.f11nameremoved;
                            }
                        } else {
                            i2 = R.string.f11nameremoved;
                        }
                        this.A16.A0P(30, getString(i2));
                        return;
                    }
                }
                this.A16.A27.A03();
                UserJid A0X2 = C86644Kx.A0X(A7D);
                boolean z = A7D.videoEnabled;
                int i3 = -1;
                if (A7D.isPeerRequestingUpgrade()) {
                    i3 = 2;
                }
                if (!A85(A0X2, i3, z)) {
                    return;
                }
                if (Voip.A08(A7D.callState)) {
                    this.A16.A0Q(i, this.A1y, false);
                } else if (A7D.isPeerRequestingUpgrade()) {
                    C107285b3 r02 = this.A16;
                    C106155Xv.A02(r02);
                    C86624Kv.A1S(r02.A13, 7);
                }
            } else {
                Log.e("voip/VoipActivityV2/call/accept voiceService is null");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7c(int r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 == r7) goto L_0x0091
            r6.A00 = r7
            X.8v3 r0 = r6.A10
            r0.BY5()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r6.A0s
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CallGridViewModel/onPictureInPictureModeChanged: "
            X.C18260x0.A0w(r0, r1, r7)
            r5 = 1
            boolean r0 = X.AnonymousClass000.A1U(r7, r5)
            r4.A0B = r0
            X.08M r3 = r4.A0N
            java.lang.Object r2 = r3.A07()
            X.C626936e.A06(r2)
            X.7Pi r2 = (X.AnonymousClass7Pi) r2
            boolean r1 = r4.A0B
            r2.A06 = r1
            r0 = 1046898278(0x3e666666, float:0.225)
            if (r1 == 0) goto L_0x0034
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
        L_0x0034:
            r2.A00 = r0
            r3.A0H(r2)
            r4.A0K()
            r4.A0M()
            if (r7 != 0) goto L_0x00a0
            X.107 r1 = r4.A0n
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0045:
            r1.A0H(r0)
        L_0x0048:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0061
            boolean r3 = r4.A0B
            X.5TU r2 = r4.A0V
            X.2sr r1 = r4.A0P
            com.whatsapp.jid.UserJid r0 = r4.A06
            boolean r0 = r1.A0a(r0)
            if (r3 == 0) goto L_0x0095
            if (r0 == 0) goto L_0x0092
            X.5Ta r0 = r2.A0N
        L_0x005e:
            r0.A02()
        L_0x0061:
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r6.A0t
            r2 = 3
            boolean r1 = X.AnonymousClass001.A1X(r7, r2)
            r0.A00 = r1
            X.4UC r0 = r0.A09
            X.C18320x8.A18(r0, r1)
            X.5XJ r5 = r6.A18
            if (r5 == 0) goto L_0x0091
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0091
            X.107 r0 = r5.A0A
            java.lang.Object r0 = X.C86634Kw.A0v(r0)
            X.7k7 r0 = (X.C158527k7) r0
            boolean r4 = X.AnonymousClass001.A1X(r7, r2)
            int r3 = r0.A01
            float r2 = r0.A00
            boolean r1 = r0.A03
            X.7k7 r0 = new X.7k7
            r0.<init>(r2, r3, r4, r1)
            r5.A00(r0)
        L_0x0091:
            return
        L_0x0092:
            X.5Ta r0 = r2.A0K
            goto L_0x005e
        L_0x0095:
            if (r0 == 0) goto L_0x009d
            X.5Ta r0 = r2.A0N
        L_0x0099:
            r0.A00()
            goto L_0x0061
        L_0x009d:
            X.5Ta r0 = r2.A0K
            goto L_0x0099
        L_0x00a0:
            r0 = 2
            X.107 r1 = r4.A0n
            if (r7 != r0) goto L_0x00a8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0045
        L_0x00a8:
            boolean r0 = r4.A0B
            r5 = r5 ^ r0
            X.C18320x8.A18(r1, r5)
            android.graphics.Rect r1 = r4.A01
            if (r1 == 0) goto L_0x00b7
            X.107 r0 = r4.A0t
            r0.A0H(r1)
        L_0x00b7:
            X.AnonymousClass4VK.A03(r4)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7c(int):void");
    }

    public final void A7d(int i, int i2) {
        C102995Lb r0;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1t;
        if (voipCallControlBottomSheetV2 != null) {
            voipCallControlBottomSheetV2.A03 = i2;
            VoipCallFooter voipCallFooter = voipCallControlBottomSheetV2.A0V;
            if (voipCallFooter != null) {
                voipCallFooter.A02(i2);
            }
        }
        float f = (float) i2;
        this.A0R.setRotation(f);
        if (!C86614Ku.A1a(this.A20)) {
            this.A0S.setRotation(f);
            AnonymousClass5UY r1 = this.A1p;
            if (r1.A01 != null) {
                r1.A04().setRotation(f);
            }
        }
        this.A0L.setRotation(f);
        CallGridViewModel callGridViewModel = this.A0s;
        callGridViewModel.A00 = i;
        if (!(callGridViewModel.A07 == null || (r0 = (C102995Lb) callGridViewModel.A0R.A08().A02.get(callGridViewModel.A07)) == null)) {
            callGridViewModel.A0Q(r0);
        }
        if (callGridViewModel.A0D && !callGridViewModel.A0P.A0a(callGridViewModel.A06)) {
            AnonymousClass5TU r3 = callGridViewModel.A0V;
            int i3 = callGridViewModel.A00;
            boolean z = true;
            if (!(i3 == 1 || i3 == 3)) {
                z = false;
            }
            C104965Ta r12 = r3.A0J;
            if (!z) {
                r12.A00();
            } else if (!r12.A02) {
                r12.A02();
            }
        }
        callGridViewModel.A0T(callGridViewModel.A0R.A08(), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r1.A04.equals(r3) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7e(android.content.Intent r5, com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r4 = this;
            java.lang.String r0 = "com.whatsapp.intent.action.ACCEPT_CALL"
            boolean r1 = X.C18280x3.A1V(r5, r0)
            java.lang.String r0 = "should only be called if intent action is ACTION_ACCEPT_INCOMING_CALL"
            X.C626936e.A0D(r1, r0)
            java.lang.String r0 = "call_id"
            java.lang.String r3 = r5.getStringExtra(r0)
            boolean r0 = X.C627436k.A0O(r6)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r6.callId
            boolean r0 = r0.equals(r3)
            r2 = 1
            if (r0 != 0) goto L_0x002e
            X.7Ps r1 = r6.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r2) goto L_0x003d
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003d
        L_0x002e:
            r4.A23 = r2
            X.5b3 r0 = r4.A16
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "call_ui_action"
            int r0 = X.C18320x8.A01(r5, r0)
            r4.A7a(r0)
        L_0x003d:
            com.whatsapp.jid.GroupJid r2 = r6.groupJid
            if (r2 != 0) goto L_0x0047
            com.whatsapp.jid.UserJid r2 = r6.getCreatorJid()
            if (r2 == 0) goto L_0x004d
        L_0x0047:
            X.5mB r1 = r4.A1T
            r0 = 5
            r1.A06(r2, r0)
        L_0x004d:
            return
        L_0x004e:
            r4.A22 = r2
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7e(android.content.Intent, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A7f(Intent intent, CallInfo callInfo) {
        C626936e.A0D(C18280x3.A1V(intent, "com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL"), "should only be called if intent action is ACTION_SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL");
        if (callInfo.callState == CallState.ACTIVE) {
            A7A(NonActivityDismissDialogFragment.A00(intent.getStringExtra("alertMessage"), false), "NonActivityDismissDialogFragment");
            return;
        }
        Log.i("voip/VoipActivityV2/new-intent call is gone, ignore the request to show alert message");
        finish();
    }

    public final void A7h(C15930sC r6, boolean z) {
        String string;
        C18270x1.A0l(C106155Xv.A00(this.A0m), "screen_sharing_backward_compat_shown", true);
        C19340zH A002 = AnonymousClass5V0.A00(this);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        A002.A0U(i);
        if (z) {
            string = getString(R.string.f11nameremoved);
        } else {
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, this.A0D.A0N(3694));
            string = getString(R.string.f11nameremoved, objArr);
        }
        A002.A0g(string);
        A002.A0d(this, r6, R.string.f11nameremoved);
        A002.A0c(this, (C15930sC) null, R.string.f11nameremoved);
        AnonymousClass043 create = A002.create();
        C162457s7.A0J(create, 0);
        A79(new VoipDialogManagerActivity$DialogWrapperFragment(create), new C158397ju(false, true), "ScreenSharingBackwardCompatDialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r9.A00 != 2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r9.A00 != 2) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r9.A00 == 3) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r0 = r8.A0v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r0 == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (r0.A05.A07() == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r4 = X.C86604Kt.A05(r8.A0v.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        if (r2 == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        r2 = 0;
        com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r4 * 90, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (com.whatsapp.voipcalling.Voip.setEnableFixedVideoOrientation(r6) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r4 * 90, r2 * 90, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b6, code lost:
        r2 = ((android.hardware.display.DisplayManager) getSystemService("display")).getDisplay(0).getRotation();
        r1 = X.AnonymousClass001.A0o();
        r1.append("getDisplayOrientation: update_video_scale_type deviceOrientation: ");
        r1.append(r4);
        X.C18260x0.A0w(" display rotation ", r1, r2);
        r2 = (r4 + r2) % 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        if (r9.A00 == 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.C86604Kt.A1Z(r3.A0p) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7i(X.C158507k5 r9) {
        /*
            r8 = this;
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r8.A0s
            if (r9 == 0) goto L_0x0025
            X.107 r2 = r3.A0q
            X.2lR r0 = r3.A0e
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x001c
            int r1 = r9.A00
            r0 = 3
            if (r1 == r0) goto L_0x001c
            X.107 r0 = r3.A0p
            boolean r1 = X.C86604Kt.A1Z(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            X.C18320x8.A18(r2, r0)
            X.107 r0 = r3.A0k
            r0.A0H(r9)
        L_0x0025:
            r4 = 2
            r3 = 1
            r5 = 0
            if (r9 == 0) goto L_0x002f
            int r1 = r9.A00
            r0 = 1
            if (r1 == r4) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r8.A2B = r0
            X.5Oj r1 = r8.A0q
            if (r1 == 0) goto L_0x003a
            r0 = r0 ^ 1
            r1.A03 = r0
        L_0x003a:
            if (r9 == 0) goto L_0x00ab
            android.view.View r0 = r8.A0J
            if (r0 == 0) goto L_0x006c
            android.view.ViewParent r7 = r0.getParent()
            android.view.View r7 = (android.view.View) r7
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165529(0x7f070159, float:1.7945278E38)
            int r6 = r1.getDimensionPixelSize(r0)
            android.view.View r0 = r8.A0J
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r0)
            boolean r0 = r8.A2B
            if (r0 == 0) goto L_0x00e5
            int r1 = r7.getHeight()
            android.graphics.Rect r0 = r9.A02
            int r0 = r0.top
            int r1 = r1 - r0
            int r1 = r1 + r6
        L_0x0065:
            r2.bottomMargin = r1
            android.view.View r0 = r8.A0J
            r0.setLayoutParams(r2)
        L_0x006c:
            X.2lR r0 = r8.A1c
            boolean r1 = r0.A00()
            if (r1 == 0) goto L_0x0079
            int r0 = r9.A00
            r2 = 1
            if (r0 == r4) goto L_0x00de
        L_0x0079:
            r2 = 0
            if (r1 != 0) goto L_0x00de
            int r1 = r9.A00
            r0 = 3
            if (r1 != r0) goto L_0x00e3
        L_0x0081:
            r6 = 0
        L_0x0082:
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r8.A0v
            if (r0 == 0) goto L_0x00dc
            X.08M r0 = r0.A05
            java.lang.Object r0 = r0.A07()
            if (r0 == 0) goto L_0x00dc
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r8.A0v
            X.08M r0 = r0.A05
            int r4 = X.C86604Kt.A05(r0)
        L_0x0096:
            if (r2 == 0) goto L_0x00b6
            r2 = 0
            int r0 = r4 * 90
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r0, r5, r3)
        L_0x009e:
            boolean r0 = com.whatsapp.voipcalling.Voip.setEnableFixedVideoOrientation(r6)
            if (r0 == 0) goto L_0x00ab
            int r1 = r4 * 90
            int r0 = r2 * 90
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r1, r0, r3)
        L_0x00ab:
            com.whatsapp.voipcalling.CallInfo r0 = r8.A7D()
            r8.A7W()
            r8.A7n(r0)
            return
        L_0x00b6:
            java.lang.String r0 = "display"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r0 = r0.getDisplay(r5)
            int r2 = r0.getRotation()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getDisplayOrientation: update_video_scale_type deviceOrientation: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " display rotation "
            X.C18260x0.A0w(r0, r1, r2)
            int r0 = r4 + r2
            int r2 = r0 % 4
            goto L_0x009e
        L_0x00dc:
            r4 = 0
            goto L_0x0096
        L_0x00de:
            int r0 = r9.A00
            if (r0 != 0) goto L_0x00e3
            goto L_0x0081
        L_0x00e3:
            r6 = 1
            goto L_0x0082
        L_0x00e5:
            r1 = 0
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7i(X.7k5):void");
    }

    public final void A7j(CallInfo callInfo) {
        C107285b3 r1;
        C102995Lb r0;
        if (!this.A2C && (r1 = this.A16) != null && r1.A0u(callInfo.callId) && callInfo.callState == CallState.ACTIVE && (r0 = callInfo.self) != null && r0.A0C) {
            Log.i("voip/VoipActivityV2/checkToShowResumeCallButton");
            String string = getString(R.string.f11nameremoved);
            String string2 = getString(R.string.f11nameremoved);
            View.OnClickListener onClickListener = this.A0H;
            this.A0W.setText(string);
            this.A0L.setVisibility(0);
            this.A0W.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            if (string2 == null) {
                AnonymousClass0YY.A04((Drawable) null, this.A0L);
                this.A0K.setVisibility(8);
                this.A0g.setVisibility(8);
                return;
            }
            C626936e.A0D(AnonymousClass000.A1W(onClickListener), "buttonOnClickListener must be set together with buttonText");
            AnonymousClass0YY.A04(this.A0A, this.A0L);
            this.A0K.setVisibility(0);
            this.A0g.setVisibility(0);
            this.A0g.setText(string2);
            C109495ei.A00(this.A0g, this, onClickListener, 31);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r9.A2A != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7l(com.whatsapp.voipcalling.CallInfo r10) {
        /*
            r9 = this;
            android.view.View r0 = r9.A0P
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            com.whatsapp.jid.GroupJid r0 = r10.groupJid
            r7 = 1
            r3 = 0
            boolean r2 = X.AnonymousClass000.A1W(r0)
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x0019
            boolean r0 = r9.A2A
            r8 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166854(0x7f070686, float:1.7947965E38)
            if (r8 == 0) goto L_0x0026
            r0 = 2131165598(0x7f07019e, float:1.7945418E38)
        L_0x0026:
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r9.A04
            int r1 = r1 + r0
            r4.height = r1
            android.view.View r0 = r9.A0P
            r0.setLayoutParams(r4)
            android.view.View r6 = r9.A0P
            int r5 = r6.getPaddingLeft()
            int r4 = r9.A04
            android.view.View r0 = r9.A0P
            int r1 = r0.getPaddingRight()
            android.view.View r0 = r9.A0P
            X.C86634Kw.A1B(r0, r6, r5, r4, r1)
            android.widget.ImageButton r4 = r9.A0S
            X.33j r0 = r9.A00
            boolean r1 = X.C620733j.A04(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x0055
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0055:
            r4.setScaleX(r0)
            X.2rx r0 = r9.A1L
            boolean r1 = X.AnonymousClass36T.A08(r0, r10)
            boolean r0 = r9.A81()
            if (r0 == 0) goto L_0x019b
            X.1VX r0 = r9.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x019b
            android.widget.TextView r1 = r9.A0X
            r0 = 2131887458(0x7f120562, float:1.9409524E38)
            r1.setText(r0)
            r9.A7Y()
        L_0x0077:
            android.view.View r1 = r9.A0J
            r0 = 2131434351(0x7f0b1b6f, float:1.8490513E38)
            android.view.View r5 = X.C06560Yg.A02(r1, r0)
            boolean r0 = r10.videoEnabled
            r6 = 255(0xff, float:3.57E-43)
            r4 = 8
            if (r0 == 0) goto L_0x016a
            r0 = 2131099858(0x7f0600d2, float:1.7812081E38)
            if (r8 == 0) goto L_0x0090
            r0 = 2131099864(0x7f0600d8, float:1.7812093E38)
        L_0x0090:
            int r1 = X.AnonymousClass0Y8.A04(r9, r0)
            boolean r0 = r9.A2A
            if (r0 == 0) goto L_0x0147
            X.5UY r1 = r9.A1p
            android.view.View r0 = r1.A01
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.A06(r3)
            if (r0 != 0) goto L_0x00c7
            X.5UY r0 = r9.A1p
            android.view.View r1 = r0.A04()
            android.view.View$OnClickListener r0 = r9.A2O
            r1.setOnClickListener(r0)
            X.5UY r0 = r9.A1p
            android.view.View r8 = r0.A04()
            r0 = 2131895339(0x7f12242b, float:1.9425508E38)
            java.lang.String r1 = r9.getString(r0)
            r0 = 2131895338(0x7f12242a, float:1.9425506E38)
            java.lang.String r0 = r9.getString(r0)
            X.C86654Ky.A1A(r8, r1, r0, r7)
        L_0x00c7:
            r5.setVisibility(r4)
            android.view.View r1 = r9.A0P
            r0 = 0
            r1.setBackground(r0)
        L_0x00d0:
            android.widget.ImageView r0 = r9.A0T
            r0.setImageAlpha(r6)
            android.widget.TextView r1 = r9.A0X
            r0 = 2131103222(0x7f060df6, float:1.7818904E38)
            X.AnonymousClass0x2.A0q(r9, r1, r0)
        L_0x00dd:
            java.util.Map r0 = r10.participants
            int r1 = X.AnonymousClass5AJ.A00(r0)
            r0 = 8
            if (r1 <= r0) goto L_0x013b
            r5 = 1
            r1 = 2131234235(0x7f080dbb, float:1.808463E38)
        L_0x00eb:
            android.widget.ImageView r0 = r9.A0V
            r0.setImageResource(r1)
            r4 = 8
            android.widget.TextView r1 = r9.A0Y
            if (r5 == 0) goto L_0x0137
            java.util.Map r0 = r10.participants
            int r0 = X.AnonymousClass5AJ.A00(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            android.widget.TextView r0 = r9.A0Y
            r0.setVisibility(r3)
        L_0x0108:
            boolean r0 = r9.A81()
            if (r0 == 0) goto L_0x011f
            X.1VX r0 = r9.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x011f
            android.view.ViewGroup r0 = r9.A0R
            r0.setVisibility(r4)
        L_0x011b:
            r9.A7z(r2)
            return
        L_0x011f:
            X.2rx r0 = r9.A1L
            boolean r0 = X.AnonymousClass36T.A08(r0, r10)
            if (r0 == 0) goto L_0x011b
            X.1VX r0 = r9.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x011b
            X.4FS r1 = r9.A04
            r0 = 11
            X.C86624Kv.A1N(r1, r9, r10, r0)
            goto L_0x011b
        L_0x0137:
            r1.setVisibility(r4)
            goto L_0x0108
        L_0x013b:
            r5 = 0
            com.whatsapp.jid.GroupJid r0 = r10.groupJid
            r1 = 2131231201(0x7f0801e1, float:1.8078476E38)
            if (r0 == 0) goto L_0x00eb
            r1 = 2131234239(0x7f080dbf, float:1.8084638E38)
            goto L_0x00eb
        L_0x0147:
            r5.setVisibility(r3)
            X.5UY r0 = r9.A1p
            r0.A06(r4)
            android.view.View r5 = r9.A0P
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r1 = X.C86664Kz.A1a(r1)
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            int r0 = X.AnonymousClass0Y8.A04(r9, r0)
            r1[r7] = r0
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r4, r1)
            r5.setBackground(r0)
            goto L_0x00d0
        L_0x016a:
            X.1VX r1 = r9.A0D
            r0 = 1540(0x604, float:2.158E-42)
            boolean r0 = r1.A0X(r0)
            android.widget.ImageView r1 = r9.A0T
            if (r0 == 0) goto L_0x0190
            r1.setImageAlpha(r6)
            android.widget.TextView r1 = r9.A0X
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
        L_0x017e:
            X.AnonymousClass0x2.A0q(r9, r1, r0)
            r5.setVisibility(r3)
            X.5UY r0 = r9.A1p
            r0.A06(r4)
            android.view.View r0 = r9.A0P
            r0.setVisibility(r3)
            goto L_0x00dd
        L_0x0190:
            r0 = 153(0x99, float:2.14E-43)
            r1.setImageAlpha(r0)
            android.widget.TextView r1 = r9.A0X
            r0 = 2131103214(0x7f060dee, float:1.7818888E38)
            goto L_0x017e
        L_0x019b:
            if (r1 == 0) goto L_0x0077
            X.1VX r0 = r9.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x0077
            X.4FS r1 = r9.A04
            r0 = 15
            X.C86624Kv.A1N(r1, r9, r10, r0)
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7l(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7m(com.whatsapp.voipcalling.CallInfo r13) {
        /*
            r12 = this;
            com.whatsapp.voipcalling.CallState r1 = r13.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 != r0) goto L_0x000c
            boolean r0 = r13.isInLonelyState()
            if (r0 != 0) goto L_0x0067
        L_0x000c:
            com.whatsapp.calling.CallDetailsLayout r6 = r12.A0j
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Map r0 = r13.participants
            java.util.Iterator r4 = X.AnonymousClass001.A0v(r0)
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0039
            X.5Lb r3 = X.C86664Kz.A13(r4)
            boolean r0 = r3.A0J
            if (r0 != 0) goto L_0x001c
            int r2 = r3.A02
            r1 = 1
            com.whatsapp.jid.UserJid r0 = r3.A08
            if (r2 != r1) goto L_0x0035
            r7.add(r0)
            goto L_0x001c
        L_0x0035:
            r5.add(r0)
            goto L_0x001c
        L_0x0039:
            java.util.ArrayList r8 = X.AnonymousClass002.A0J(r7)
            r8.addAll(r5)
            r6.setCallDetailsDescription(r8, r13)
            boolean r3 = r13.isAudioChat()
            com.whatsapp.jid.GroupJid r2 = r13.groupJid
            X.3Ex r7 = r6.A0A
            X.5ZU r5 = r6.A0B
            X.2sD r1 = r6.A0J
            X.3Lq r0 = r6.A0I
            X.3ZH r0 = X.AnonymousClass36T.A01(r7, r0, r2, r1, r3)
            if (r0 == 0) goto L_0x015b
            java.lang.String r9 = X.C18300x5.A0h(r5, r0)
        L_0x005b:
            int r10 = r8.size()
            boolean r0 = r13.isInLonelyState()
            if (r0 != 0) goto L_0x0068
            if (r10 != 0) goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            com.whatsapp.jid.UserJid r0 = r13.getInitialPeerJid()
            X.C626936e.A06(r0)
            boolean r0 = r13.isInLonelyState()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x014a
            com.whatsapp.voipcalling.CallState r1 = r13.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0085
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x0085
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x014a
        L_0x0085:
            r11 = 1
        L_0x0086:
            X.1VX r2 = r6.A0H
            r0 = 4095(0xfff, float:5.738E-42)
            boolean r0 = X.C56952sp.A0J(r2, r0)
            if (r0 == 0) goto L_0x0099
            X.5YB r0 = r6.A07
            android.graphics.Typeface r1 = r6.A02
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            r0.setTypeface(r1, r3)
        L_0x0099:
            if (r10 != r4) goto L_0x011c
            com.whatsapp.jid.UserJid r0 = r13.getInitialPeerJid()
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0115
            com.whatsapp.jid.UserJid r0 = r13.getInitialPeerJid()
        L_0x00a9:
            X.3ZH r8 = r7.A0A(r0)
            X.5YB r0 = r6.A07
            r0.A08(r8)
        L_0x00b2:
            android.widget.FrameLayout r7 = r6.A03
            int r0 = r7.getChildCount()
            if (r0 <= r4) goto L_0x0108
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallDetailsLayout/updatePushNameViews: Too many children("
            r1.append(r0)
            int r0 = r7.getChildCount()
            r1.append(r0)
            java.lang.String r0 = ")"
            X.C18260x0.A1K(r1, r0)
            r7.removeAllViews()
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            if (r8 == 0) goto L_0x014d
            X.2k5 r1 = r8.A0F
            if (r1 != 0) goto L_0x014d
            boolean r1 = r13.isCaller
            if (r1 != 0) goto L_0x014d
            r1 = 4095(0xfff, float:5.738E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x014d
            java.lang.String r2 = X.AnonymousClass5ZU.A03(r5, r8)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x014d
            if (r0 != 0) goto L_0x0101
            android.content.Context r1 = r6.getContext()
            r0 = 2131624276(0x7f0e0154, float:1.8875727E38)
            android.view.View r0 = X.C86654Ky.A0G(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.addView(r0)
        L_0x0101:
            r0.setVisibility(r3)
            r0.setText(r2)
            return
        L_0x0108:
            int r0 = r7.getChildCount()
            if (r0 != r4) goto L_0x00d2
            android.view.View r0 = r7.getChildAt(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00d3
        L_0x0115:
            java.lang.Object r0 = r8.get(r3)
            X.4uZ r0 = (X.C95814uZ) r0
            goto L_0x00a9
        L_0x011c:
            if (r9 != 0) goto L_0x012f
            boolean r0 = r13.videoEnabled
            if (r0 != 0) goto L_0x0138
            if (r11 == 0) goto L_0x0138
            android.content.Context r1 = r6.getContext()
            r0 = 2131890053(0x7f120f85, float:1.9414787E38)
            java.lang.String r9 = r1.getString(r0)
        L_0x012f:
            X.5YB r1 = r6.A07
            r0 = 0
            r1.A0B(r0, r9)
            r8 = 0
            goto L_0x00b2
        L_0x0138:
            android.content.Context r1 = r6.getContext()
            r0 = 3
            X.7Qw r0 = X.C107305b5.A04(r7, r5, r8, r0, r3)
            if (r0 != 0) goto L_0x0145
            r9 = 0
            goto L_0x012f
        L_0x0145:
            java.lang.String r9 = X.C86634Kw.A0y(r1, r0)
            goto L_0x012f
        L_0x014a:
            r11 = 0
            goto L_0x0086
        L_0x014d:
            if (r0 == 0) goto L_0x0067
            int r2 = r0.getVisibility()
            r1 = 8
            if (r2 == r1) goto L_0x0067
            r0.setVisibility(r1)
            return
        L_0x015b:
            r9 = 0
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7m(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r4.A0D.A0X(4773) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7n(com.whatsapp.voipcalling.CallInfo r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0066
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r4.A15
            r2 = 1
            if (r0 == 0) goto L_0x001a
            X.107 r0 = r0.A0F
            boolean r0 = X.C86604Kt.A1Z(r0)
            if (r0 == 0) goto L_0x001a
            X.1VX r1 = r4.A0D
            r0 = 4773(0x12a5, float:6.688E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x0067
            if (r1 != 0) goto L_0x0067
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r3 = r4.A0v
            if (r3 == 0) goto L_0x0066
            X.4NC r1 = r3.A01
            if (r1 != 0) goto L_0x0030
            X.4NC r1 = new X.4NC
            r1.<init>(r4, r3)
            r3.A01 = r1
        L_0x0030:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0046
            boolean r0 = r1.canDetectOrientation()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "voip/OrientationViewModel/enableOrientationListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4NC r0 = r3.A01
            r0.enable()
            r3.A02 = r2
        L_0x0046:
            android.hardware.display.DisplayManager$DisplayListener r0 = r3.A00
            if (r0 != 0) goto L_0x0066
            X.5cS r0 = new X.5cS
            r0.<init>(r3)
            r3.A00 = r0
            X.2oU r0 = r3.A06
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "display"
            java.lang.Object r2 = r1.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            android.hardware.display.DisplayManager$DisplayListener r1 = r3.A00
            android.os.Handler r0 = X.AnonymousClass000.A0A()
            r2.registerDisplayListener(r1, r0)
        L_0x0066:
            return
        L_0x0067:
            r4.A7v(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7n(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A7q(CallInfo callInfo, String str) {
        C626936e.A0D("com.whatsapp.intent.action.START_CALL".equals(str), "should only be called if intent action is ACTION_START_CALL");
        CallInfo callInfo2 = callInfo;
        if (callInfo2.callState == CallState.PRECALLING && callInfo2.groupJid != null) {
            Log.i("voip/VoipActivityV2/startCall");
            AnonymousClass3ZH A0A2 = this.A1I.A0A(callInfo2.groupJid);
            List A032 = AnonymousClass36T.A03(this.A01, this.A1I, this.A1Z, A0A2);
            if (!A032.isEmpty()) {
                C1230066r r5 = this.A0z;
                C112455jl r52 = (C112455jl) r5;
                r52.A03(this, callInfo2.groupJid, (Integer) null, callInfo2.callId, callInfo2.scheduledId, A032, 4, 0, callInfo2.videoEnabled, false, false, false);
            }
        }
    }

    public final void A7r(CallInfo callInfo, boolean z) {
        C47702dg r1;
        int i;
        if (this.A16 != null && this.A0D.A0X(5311)) {
            this.A04.BkP(new C117665sI(this, callInfo, 40, z));
        }
        if (this.A1t == null || (callInfo.groupJid == null && (!z || AnonymousClass5AJ.A00(callInfo.participants) <= 8))) {
            if (64 == callInfo.participants.size()) {
                r1 = new C47702dg();
                i = 4;
            } else if (callInfo.isCallFull()) {
                r1 = new C189078zx(this, 1);
                i = 5;
            } else {
                A7P();
                return;
            }
            A7A(VoipErrorDialogFragment.A01(r1, i), "VoipErrorDialogFragment");
            return;
        }
        C105315Uk r12 = this.A1t.A0N;
        if (r12 != null) {
            r12.A03(3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7t(java.lang.Runnable r5) {
        /*
            r4 = this;
            X.33i r0 = r4.A08
            android.app.KeyguardManager r3 = r0.A09()
            r2 = 0
            if (r3 == 0) goto L_0x002d
            boolean r1 = X.C107385bE.A06()
            boolean r0 = r3.isKeyguardLocked()
            if (r1 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x001b
            boolean r0 = r3.inKeyguardRestrictedInputMode()
        L_0x0019:
            if (r0 == 0) goto L_0x002d
        L_0x001b:
            boolean r0 = X.C107385bE.A04()
            if (r0 == 0) goto L_0x002a
            X.6CQ r0 = new X.6CQ
            r0.<init>(r4, r5)
            r3.requestDismissKeyguard(r4, r0)
            return
        L_0x002a:
            r4.A7x(r2)
        L_0x002d:
            r5.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7t(java.lang.Runnable):void");
    }

    public final void A7u(String str) {
        this.A0D.removeMessages(7);
        this.A0D.removeMessages(8);
        DialogFragment dialogFragment = this.A0a;
        if (dialogFragment != null && dialogFragment.A16()) {
            A7C("NonActivityDismissDialogFragment");
            this.A0a = null;
        }
        this.A0a = NonActivityDismissDialogFragment.A00(str, true);
        this.A0D.sendEmptyMessage(8);
        this.A0D.sendEmptyMessageDelayed(7, 6000);
    }

    public final void A7v(boolean z) {
        boolean z2;
        OrientationViewModel orientationViewModel = this.A0v;
        if (orientationViewModel != null) {
            if (!orientationViewModel.A02 || orientationViewModel.A01 == null) {
                z2 = false;
            } else {
                z2 = true;
                Log.i("voip/OrientationViewModel/disableOrientationListener");
                orientationViewModel.A01.disable();
                orientationViewModel.A02 = false;
            }
            if (orientationViewModel.A00 != null) {
                ((DisplayManager) orientationViewModel.A06.A00.getSystemService("display")).unregisterDisplayListener(orientationViewModel.A00);
                orientationViewModel.A00 = null;
            }
            if (z2 && z) {
                A7d(0, 0);
            }
        }
    }

    public final void A7x(boolean z) {
        Dialog dialog;
        Window window = getWindow();
        if (z) {
            window.addFlags(524288);
        } else {
            window.clearFlags(524288);
        }
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1t;
        if (voipCallControlBottomSheetV2 != null && (dialog = voipCallControlBottomSheetV2.A03) != null && dialog.getWindow() != null) {
            Window window2 = voipCallControlBottomSheetV2.A03.getWindow();
            if (z) {
                window2.addFlags(524288);
            } else {
                window2.clearFlags(524288);
            }
        }
    }

    public final void A7y(boolean z) {
        this.A03 = this.A04;
        this.A02 = 0;
        int A092 = C86664Kz.A09(getResources(), R.dimen.f6nameremoved, this.A01) - (getResources().getDimensionPixelSize(R.dimen.f6nameremoved) / 2);
        if (!z) {
            this.A03 += this.A05;
        } else if (!C107295b4.A09(this.A08)) {
            return;
        }
        this.A02 += A092;
    }

    public final void A7z(boolean z) {
        String string;
        int i;
        ViewGroup viewGroup = this.A0R;
        if (z) {
            string = getString(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        } else {
            string = getString(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        }
        C86654Ky.A1A(viewGroup, string, getString(i), true);
    }

    public final boolean A80() {
        if (Build.VERSION.SDK_INT < 26 || !C86654Ky.A1X(this.A08, "android.software.picture_in_picture") || !A82()) {
            return false;
        }
        return true;
    }

    public final boolean A81() {
        C107285b3 r0 = this.A16;
        if (r0 == null || !"capi".equals(r0.A11)) {
            return false;
        }
        return true;
    }

    public final boolean A82() {
        C620633i r2 = this.A08;
        AppOpsManager appOpsManager = r2.A01;
        if (appOpsManager == null) {
            appOpsManager = (AppOpsManager) r2.A0S("appops", true);
            r2.A01 = appOpsManager;
        }
        C626936e.A06(appOpsManager);
        try {
            if (appOpsManager.checkOp("android:picture_in_picture", Process.myUid(), getPackageName()) != 0) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            C18260x0.A1S(AnonymousClass001.A0o(), "voip/VoipActivityV2/isPictureInPictureAllowed", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r4.videoEnabled == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A86(com.whatsapp.voipcalling.CallInfo r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0007
            boolean r1 = r4.videoEnabled
            r0 = 1
            if (r1 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r2 = 0
            if (r0 == 0) goto L_0x004c
            int r0 = r3.A00
            if (r0 == 0) goto L_0x004c
            com.whatsapp.voipcalling.CallState r1 = r3.A7F(r4)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x001d
            boolean r0 = r4.isInLonelyState()
            if (r0 == 0) goto L_0x0023
        L_0x001d:
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x004c
        L_0x0023:
            boolean r0 = r4.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x004c
            android.app.PictureInPictureParams$Builder r1 = r3.A09
            java.lang.String r0 = "PiP Params Builder is null"
            X.C626936e.A07(r1, r0)
            android.app.PictureInPictureParams$Builder r0 = r3.A09
            android.app.PictureInPictureParams r0 = r0.build()
            boolean r0 = r3.enterPictureInPictureMode(r0)     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0047
            r3.A7c(r2)
            r0 = 1
            return r0
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipActivityV2/minimize exception trying to enter PIP mode"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0047:
            java.lang.String r0 = "voip/VoipActivityV2/minimize failed to enter PIP mode"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A86(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public final boolean A87(CallInfo callInfo) {
        if (!(!C18280x3.A1W(this.A0m.A03(), "screen_sharing_backward_compat_shown")) || !this.A0s.A0D || AnonymousClass5AJ.A00(callInfo.participants) != this.A0D.A0N(3694)) {
            return false;
        }
        return true;
    }

    public final boolean A89(String str, String str2) {
        String str3 = this.A1y;
        if (str.equals(str3)) {
            return false;
        }
        StringBuilder A0l2 = AnonymousClass000.A0l(str2);
        A0l2.append(" Ignoring update because callId = ");
        A0l2.append(str);
        C18260x0.A0q(" callIdToShow = ", str3, A0l2);
        return true;
    }

    public C111355hx B8B() {
        C111355hx r0 = this.A1O;
        if (r0 != null) {
            return r0;
        }
        C91894lM r02 = new C91894lM(this, this);
        this.A1O = r02;
        return r02;
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A01;
    }

    public void BbL(C107285b3 r9) {
        AnonymousClass3ZH A072;
        AnonymousClass7HU A0D2;
        Log.i("voip/VoipActivityV2/onServiceConnected");
        this.A16 = r9;
        r9.A0T(this);
        this.A16.A1P = false;
        CallInfo A7D = A7D();
        if (A7D != null) {
            this.A13.A02(A7D.callId, "voice_service_connected");
            this.A13.A03(A7D.callId, 2);
            if (A81() && this.A0D.A0N(4067) >= 2 && this.A0D.A0X(4455)) {
                UserJid peerJid = A7D.getPeerJid();
                AnonymousClass5ZU r6 = this.A1M;
                if (!(peerJid == null || (A072 = ((C64773Ex) r6.A08.get()).A07(peerJid)) == null || (A0D2 = r6.A0D(A072, -1, true, true)) == null || !A0D2.A00.equals(C998258i.PHONE_NUMBER))) {
                    Log.d("fetchVerifiedNameDetails");
                    C86624Kv.A1N(this.A04, this, peerJid, 12);
                }
            }
            if (!A80() && A7D.self.A06 == 2) {
                C86624Kv.A1S(this.A16.A13, 10);
            }
        }
        callStateChanged(CallState.NONE, A7D);
        C107285b3 r2 = this.A16;
        Log.i("voip/restoreProximitySensor");
        if (r2.A18) {
            r2.A18 = false;
            r2.A0H.removeMessages(14);
            r2.A0H.sendEmptyMessage(14);
        }
        C107285b3 r1 = this.A16;
        if (r1.A19) {
            r1.A0L();
        } else {
            r1.A0K();
        }
        if (!this.A22 || getIntent() == null) {
            if (A7D == null) {
                return;
            }
        } else if (A7D == null) {
            return;
        } else {
            if (Voip.A08(A7D.callState)) {
                A7a(getIntent().getIntExtra("call_ui_action", 0));
                this.A22 = false;
            }
        }
        CallState callState = A7D.callState;
        if ((callState == CallState.REJOINING || callState == CallState.RECEIVED_CALL || callState == CallState.LINK) && !A7D.isCaller && A7D.isGroupCall) {
            C107285b3 r62 = this.A16;
            if (r62.A09 == 0) {
                r62.A09 = System.currentTimeMillis();
            }
            if (callState != CallState.LINK) {
                int intExtra = getIntent().getIntExtra("lobbyEntryPoint", -1);
                if (intExtra != -1) {
                    this.A16.A0O(intExtra);
                }
                if (A7D.callState == CallState.RECEIVED_CALL) {
                    HashSet A0K2 = AnonymousClass002.A0K();
                    Iterator A0v2 = AnonymousClass001.A0v(A7D.participants);
                    while (A0v2.hasNext()) {
                        C102995Lb A132 = C86664Kz.A13(A0v2);
                        if (!A132.A0J && A132.A02 == 1) {
                            A0K2.add(C618932r.A00(A132.A08));
                        }
                    }
                    this.A16.A0n(A0K2);
                }
            }
        }
    }

    public void Bik(int i) {
        Log.i("voip/VoipActivityV2/call/reject");
        CallInfo A7D = A7D();
        if (A7D != null && A7D.callState != CallState.NONE) {
            C138486qS r0 = this.A1q;
            if (r0 != null) {
                r0.A01();
            }
            C107285b3 r2 = this.A16;
            if (r2 == null) {
                return;
            }
            if (Voip.A08(A7D.callState)) {
                r2.A0m(A7D.callId, (String) null, i);
            } else if (A7D.isPeerRequestingUpgrade()) {
                this.A16.A13.execute(new AnonymousClass8M9(0, 3));
            }
        }
    }

    public void BsG(CallInfo callInfo) {
        if (!A89(callInfo.callId, "voipActivityV2/videoStateChanged")) {
            this.A28 = false;
            this.A0D.removeMessages(10);
            if (callInfo.callState != CallState.NONE && !callInfo.callEnding) {
                this.A0j.clearAnimation();
                if (callInfo.isEitherSideRequestingUpgrade()) {
                    this.A23 = false;
                }
                A7n(callInfo);
                if (!callInfo.isGroupCall || !this.A0D.A0X(2269)) {
                    A7p(callInfo);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029a, code lost:
        if (r7 == 2) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
        if (r2 != 1) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0136, code lost:
        if (r7 == 1) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014c, code lost:
        if (r1 != com.whatsapp.voipcalling.CallState.REJOINING) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callStateChanged(com.whatsapp.voipcalling.CallState r20, com.whatsapp.voipcalling.CallInfo r21) {
        /*
            r19 = this;
            r4 = r19
            r5 = r21
            if (r21 != 0) goto L_0x000f
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged info == NULL finishing current activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000b:
            r4.finish()
        L_0x000e:
            return
        L_0x000f:
            com.whatsapp.voipcalling.CallState r12 = r4.A7F(r5)
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.LINK
            r1 = r20
            if (r1 != r3) goto L_0x0025
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r12 == r0) goto L_0x0021
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r12 != r0) goto L_0x0025
        L_0x0021:
            java.lang.String r0 = r5.callId
            r4.A1y = r0
        L_0x0025:
            java.lang.String r2 = r5.callId
            java.lang.String r0 = "VoipActivityV2/callStateChanged "
            boolean r0 = r4.A89(r2, r0)
            if (r0 != 0) goto L_0x000e
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged from "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " to "
            X.C18260x0.A1R(r2, r0, r12)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x0047
            r4.A7H()
        L_0x0047:
            if (r12 != r0) goto L_0x0341
            androidx.fragment.app.DialogFragment r0 = r4.A0b
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "EndCallConfirmationDialogFragment"
            r4.A7C(r0)
            r0 = 0
            r4.A0b = r0
        L_0x0055:
            android.view.Window r2 = r4.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r2.clearFlags(r0)
            int r2 = r5.callResult
            java.lang.String r7 = r4.A1x
            r6 = 0
            r3 = 1
            if (r7 == 0) goto L_0x00d1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE showing text: "
            X.C18260x0.A0s(r0, r7, r1)
            boolean r0 = r4.A2D
            if (r0 == 0) goto L_0x008a
            r4.A7I()
        L_0x0076:
            X.7Ps r1 = r5.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r3) goto L_0x0087
            java.lang.String r1 = r1.A04
            r4.A1y = r1
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r4.A0s
            X.4xk r0 = r0.A0R
            r0.A0G(r1)
        L_0x0087:
            r4.A23 = r6
            return
        L_0x008a:
            X.1iO r0 = r4.A0e
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x009c
            X.3Wi r1 = r4.A05
            X.4FU r0 = r1.A00
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r4.A1x
            r1.A0W(r0, r3)
            goto L_0x0076
        L_0x009c:
            X.5b3 r7 = r4.A16
            if (r7 == 0) goto L_0x00cb
            java.lang.String r2 = r4.A1x
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/showCallFailedMessage "
            X.C18260x0.A0s(r0, r2, r1)
            X.1iO r0 = r7.A1a
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            android.content.Context r7 = r7.A1W
            r9 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            r12 = r9
            r11 = r9
            android.content.Intent r1 = X.C627736r.A0o(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "showCallFailedMessage"
            r1.putExtra(r0, r2)
            r7.startActivity(r1)
            goto L_0x0076
        L_0x00cb:
            java.lang.String r0 = "can not show call failed message because voice service is null."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0076
        L_0x00d1:
            com.whatsapp.voipcalling.CallState r11 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r9 = 10
            if (r1 != r11) goto L_0x0102
            if (r2 == r9) goto L_0x00dd
            r0 = 25
            if (r2 != r0) goto L_0x0102
        L_0x00dd:
            X.5b3 r0 = r4.A16
            if (r0 == 0) goto L_0x0102
            int r7 = r0.A3M
            r0 = 26
            if (r7 != r0) goto L_0x0102
            r7 = 7
        L_0x00e8:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "finish"
            r2.putBoolean(r0, r3)
            r1 = 2
            X.8zx r0 = new X.8zx
            r0.<init>(r4, r1)
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r2, r0, r7)
            java.lang.String r0 = "VoipErrorDialogFragment"
            r4.A7A(r1, r0)
            goto L_0x0076
        L_0x0102:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0116
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x0116
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x0116
            if (r1 == r11) goto L_0x0116
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x01c1
            if (r2 == r3) goto L_0x01d3
        L_0x0116:
            boolean r0 = r4.A25
            if (r0 != 0) goto L_0x01c1
            X.5b3 r0 = r4.A16
            if (r0 == 0) goto L_0x01c1
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE showing call failed screen, result="
            X.C18260x0.A0y(r0, r7, r2)
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x013c
            com.whatsapp.calling.CallDetailsLayout r10 = r4.A0j
            boolean r8 = r10.A05(r5)
            int r7 = r4.A00
            if (r7 == 0) goto L_0x0138
            r0 = 0
            if (r7 != r3) goto L_0x0139
        L_0x0138:
            r0 = 1
        L_0x0139:
            r10.A03(r12, r8, r0)
        L_0x013c:
            r8 = 17
            r7 = 2
            if (r2 == r7) goto L_0x0164
            if (r2 == r8) goto L_0x0164
            r0 = 4
            if (r2 != r0) goto L_0x0160
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x0164
        L_0x014a:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x015b
        L_0x014e:
            com.whatsapp.jid.UserJid r8 = X.C86644Kx.A0X(r5)
            boolean r9 = r5.videoEnabled
            if (r8 != 0) goto L_0x01e3
            java.lang.String r0 = "VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null jid"
        L_0x0158:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x015b:
            r4.finish()
            goto L_0x0076
        L_0x0160:
            if (r2 != r9) goto L_0x014a
            if (r1 != r11) goto L_0x014a
        L_0x0164:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 != r0) goto L_0x01ac
            boolean r0 = r5.isEndedByMe
            if (r0 != 0) goto L_0x000b
            r0 = 2131895305(0x7f122409, float:1.942544E38)
        L_0x016f:
            java.lang.String r1 = r4.getString(r0)
        L_0x0173:
            X.33i r0 = r4.A08
            X.C107295b4.A00(r4, r0, r1)
            android.view.View r0 = r4.A0L
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01a6
            r4.A7s(r1)
        L_0x0183:
            X.33i r0 = r4.A08
            android.os.Vibrator r7 = r0.A0K()
            X.C626936e.A06(r7)
            r0 = 500(0x1f4, double:2.47E-321)
            r7.vibrate(r0)
            android.os.Handler r0 = r4.A0D
            r7 = 9
            r0.removeMessages(r7)
            if (r2 == r8) goto L_0x014e
            r0 = 2
            if (r2 == r0) goto L_0x014e
            android.os.Handler r2 = r4.A0D
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.sendEmptyMessageDelayed(r7, r0)
            goto L_0x0076
        L_0x01a6:
            com.whatsapp.calling.CallDetailsLayout r0 = r4.A0j
            r0.A04(r1, r1)
            goto L_0x0183
        L_0x01ac:
            if (r2 != r8) goto L_0x01b2
            r0 = 2131895419(0x7f12247b, float:1.942567E38)
            goto L_0x016f
        L_0x01b2:
            if (r2 != r7) goto L_0x01b8
            r0 = 2131895262(0x7f1223de, float:1.9425352E38)
            goto L_0x016f
        L_0x01b8:
            com.whatsapp.jid.UserJid r0 = X.C86644Kx.A0X(r5)
            java.lang.String r1 = r4.A7G(r0, r2)
            goto L_0x0173
        L_0x01c1:
            if (r1 != r11) goto L_0x01d3
            boolean r0 = r5.isGroupCall
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r5.isEndedByMe
            if (r0 != 0) goto L_0x01d3
            int r0 = r5.callResult
            if (r0 != r9) goto L_0x01d3
            r7 = 8
            goto L_0x00e8
        L_0x01d3:
            boolean r0 = r4.A2C
            if (r0 == 0) goto L_0x01df
            X.3Wi r1 = r4.A05
            r0 = 2131895236(0x7f1223c4, float:1.94253E38)
            r1.A0H(r0, r3)
        L_0x01df:
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE finishing current activity"
            goto L_0x0158
        L_0x01e3:
            r4.A7V()
            X.6wh r0 = X.C142136wh.CALL_FAILED_SCREEN
            r4.A7B(r0)
            java.lang.String r1 = r4.A7G(r8, r2)
            com.whatsapp.calling.CallDetailsLayout r0 = r4.A0j
            r0.A04(r1, r1)
            if (r1 == 0) goto L_0x01fb
            X.33i r0 = r4.A08
            X.C107295b4.A00(r4, r0, r1)
        L_0x01fb:
            r4.A7J()
            android.view.ViewGroup r0 = r4.A0Q
            if (r0 != 0) goto L_0x021a
            r0 = 2131428410(0x7f0b043a, float:1.8478464E38)
            android.view.ViewStub r7 = X.C86664Kz.A0o(r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/VoipActivityV2/showCallFailedScreen found callFailedButtonsStub:"
            X.C18260x0.A1R(r1, r0, r7)
            android.view.View r0 = r7.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.A0Q = r0
        L_0x021a:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r4.A0s
            X.107 r7 = r0.A0i
            java.lang.Object r0 = r7.A07()
            X.7Y7 r0 = (X.AnonymousClass7Y7) r0
            android.graphics.Bitmap r1 = r0.A01
            X.7Y7 r0 = new X.7Y7
            r0.<init>(r6, r1)
            r7.A0H(r0)
            java.lang.String r0 = "VoipActivityV2 vm showing call failed screen from coordinator"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 29
            X.5ei r0 = new X.5ei
            r0.<init>(r4, r1, r8)
            android.view.ViewGroup r8 = r4.A0Q
            X.C626936e.A04(r8)
            android.view.View$OnClickListener r14 = r4.A0F
            android.view.View$OnClickListener r15 = r4.A0E
            X.7Zb r13 = new X.7Zb
            r18 = r9
            r17 = r2
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            X.C162457s7.A0J(r8, r6)
            java.lang.String r0 = "CallFailedScreenCoordinator show"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r8.setVisibility(r6)
            r0 = 2131428512(0x7f0b04a0, float:1.847867E38)
            android.view.View r11 = X.C18290x4.A0M(r8, r0)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int r10 = r11.getChildCount()
            r7 = 0
        L_0x0267:
            if (r7 >= r10) goto L_0x0278
            android.view.View r1 = r11.getChildAt(r7)
            X.C162457s7.A0D(r1)
            android.view.View$OnClickListener r0 = r13.A01
            r1.setOnClickListener(r0)
            int r7 = r7 + 1
            goto L_0x0267
        L_0x0278:
            r0 = 2131428513(0x7f0b04a1, float:1.8478673E38)
            android.widget.ImageView r1 = X.AnonymousClass0x9.A0F(r8, r0)
            r0 = 2131233813(0x7f080c15, float:1.8083774E38)
            r1.setImageResource(r0)
            A0L(r1)
            r0 = 2131428385(0x7f0b0421, float:1.8478413E38)
            android.view.View r10 = r8.findViewById(r0)
            r12 = r10
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r7 = r13.A00
            r0 = 17
            if (r7 == r0) goto L_0x029c
            r1 = 2
            r0 = 0
            if (r7 != r1) goto L_0x029d
        L_0x029c:
            r0 = 1
        L_0x029d:
            r1 = r0 ^ 1
            X.C162457s7.A0H(r12)
            r11 = 0
            int r0 = X.AnonymousClass001.A08(r1)
            r12.setVisibility(r0)
            if (r1 == 0) goto L_0x02e6
            X.C162457s7.A0D(r10)
            r0 = 2131428386(0x7f0b0422, float:1.8478415E38)
            android.view.View r10 = X.C18290x4.A0M(r8, r0)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 2131233506(0x7f080ae2, float:1.8083151E38)
            r10.setBackgroundResource(r0)
            boolean r1 = r13.A04
            r0 = 2131233787(0x7f080bfb, float:1.8083721E38)
            if (r1 == 0) goto L_0x02c8
            r0 = 2131233785(0x7f080bf9, float:1.8083717E38)
        L_0x02c8:
            r8.setBackgroundColor(r6)
            r10.setImageResource(r0)
            int r7 = r12.getChildCount()
        L_0x02d2:
            if (r11 >= r7) goto L_0x02e3
            android.view.View r1 = r12.getChildAt(r11)
            X.C162457s7.A0D(r1)
            android.view.View$OnClickListener r0 = r13.A03
            r1.setOnClickListener(r0)
            int r11 = r11 + 1
            goto L_0x02d2
        L_0x02e3:
            A0L(r10)
        L_0x02e6:
            r0 = 2131431506(0x7f0b1052, float:1.8484743E38)
            X.5UY r0 = X.C18290x4.A0X(r8, r0)
            r11 = 0
            android.view.View r10 = X.AnonymousClass5UY.A00(r0, r6)
            X.C162457s7.A0D(r10)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r7 = r10.getChildCount()
        L_0x02fb:
            if (r11 >= r7) goto L_0x030c
            android.view.View r1 = r10.getChildAt(r11)
            X.C162457s7.A0D(r1)
            android.view.View$OnClickListener r0 = r13.A02
            r1.setOnClickListener(r0)
            int r11 = r11 + 1
            goto L_0x02fb
        L_0x030c:
            r0 = 2131431512(0x7f0b1058, float:1.8484755E38)
            android.view.View r0 = r8.findViewById(r0)
            A0L(r0)
            r0 = 17
            if (r2 == r0) goto L_0x031d
            r0 = 2
            if (r2 != r0) goto L_0x0326
        L_0x031d:
            android.os.Handler r8 = r4.A0D
            r7 = 9
            r0 = 15000(0x3a98, double:7.411E-320)
            r8.sendEmptyMessageDelayed(r7, r0)
        L_0x0326:
            X.7Ta r1 = r4.A1H
            java.lang.String r0 = "UnansweredCallLogger/onCallFailedScreenVisible"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
            goto L_0x0076
        L_0x0341:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r12 != r0) goto L_0x038e
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x0354
            boolean r0 = r4.A2L
            if (r0 != 0) goto L_0x034f
            if (r1 != r3) goto L_0x0354
        L_0x034f:
            X.5qe r0 = r4.A1C
            r0.A02()
        L_0x0354:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x0377
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r6 = r4.A0n
            java.lang.String r0 = "voip/CallAvatarViewModel/onNewCallActive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.107 r0 = r6.A0K
            java.lang.Object r0 = r0.A07()
            boolean r0 = r0 instanceof X.C91164j1
            if (r0 != 0) goto L_0x0377
            X.4C6 r3 = X.AnonymousClass0IV.A00(r6)
            r2 = 0
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onNewCallActive$1 r1 = new com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onNewCallActive$1
            r1.<init>(r6, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
        L_0x0377:
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0384;
                case 1: goto L_0x0387;
                case 2: goto L_0x0387;
                case 3: goto L_0x0389;
                case 4: goto L_0x0387;
                case 5: goto L_0x0387;
                case 6: goto L_0x0387;
                case 7: goto L_0x0380;
                case 8: goto L_0x0380;
                case 9: goto L_0x0380;
                case 10: goto L_0x0387;
                default: goto L_0x0380;
            }
        L_0x0380:
            r4.A7p(r5)
            return
        L_0x0384:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x038a
        L_0x0387:
            r0 = 0
            goto L_0x038a
        L_0x0389:
            r0 = 2
        L_0x038a:
            r4.setVolumeControlStream(r0)
            goto L_0x0380
        L_0x038e:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r12 != r0) goto L_0x0377
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x0377
            X.5qe r0 = r4.A1C
            r0.A02()
            goto L_0x0377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.callStateChanged(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void finish() {
        Log.i("voip/VoipActivityV2/finish");
        super.finish();
        C150997Ta r1 = this.A1H;
        if (r1.A02 != null || r1.A00 != null || r1.A01 != null) {
            r1.A00();
        }
    }

    public Window getWindow() {
        Window A6E;
        if (this.A1P == null || (A6E = A6E("VoipContactPickerDialogFragment")) == null) {
            return super.getWindow();
        }
        return A6E;
    }

    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment == null) {
            CallGridViewModel callGridViewModel = this.A0s;
            AnonymousClass08M r1 = callGridViewModel.A0H;
            if (r1.A07() != null) {
                callGridViewModel.A0U((UserJid) r1.A07());
            } else if (!A80() || !A86(A7D())) {
                this.A1H.A02 = C18290x4.A0Z();
                super.onBackPressed();
            }
        } else if (!contactPickerFragment.A28()) {
            A7K();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03b3, code lost:
        if (r7.equalsIgnoreCase("davinciin") == false) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x032b, code lost:
        if (r8.equalsIgnoreCase("OP4A57") == false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0399, code lost:
        if (r8.startsWith("PD1818") == false) goto L_0x039b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0417 A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0462 A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0473 A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x04ad A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x04c0 A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04ca A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04e3 A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x05bd A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x063c A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x066b A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x069e A[Catch:{ IllegalStateException -> 0x0264, all -> 0x07f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r15 = r23
            r0 = r24
            super.onCreate(r0)
            X.1VX r1 = r15.A0D
            r0 = 1807(0x70f, float:2.532E-42)
            boolean r12 = r1.A0X(r0)
            java.lang.String r10 = "VoipActivityV2"
            java.lang.String r2 = "VoipActivityV2_onCreate"
            if (r12 == 0) goto L_0x001f
            X.2sF r0 = r15.A02     // Catch:{ all -> 0x07f3 }
            r0.A08(r10)     // Catch:{ all -> 0x07f3 }
            X.2sF r0 = r15.A02     // Catch:{ all -> 0x07f3 }
            r0.A07(r2)     // Catch:{ all -> 0x07f3 }
        L_0x001f:
            r0 = 2131895235(0x7f1223c3, float:1.9425297E38)
            r15.setTitle(r0)     // Catch:{ all -> 0x07f3 }
            X.2F7 r0 = r15.A0k     // Catch:{ all -> 0x07f3 }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x07f3 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x07f3 }
        L_0x002d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07f3 }
            X.49O r0 = (X.AnonymousClass49O) r0     // Catch:{ all -> 0x07f3 }
            r0.B3K()     // Catch:{ all -> 0x07f3 }
            goto L_0x002d
        L_0x003d:
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "call_id"
            java.lang.String r0 = r1.getStringExtra(r0)     // Catch:{ all -> 0x07f3 }
            r15.A1y = r0     // Catch:{ all -> 0x07f3 }
            com.whatsapp.voipcalling.CallInfo r5 = r15.A7D()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r15.A1y     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x0057
            if (r5 == 0) goto L_0x0057
            java.lang.String r0 = r5.callId     // Catch:{ all -> 0x07f3 }
            r15.A1y = r0     // Catch:{ all -> 0x07f3 }
        L_0x0057:
            r11 = 0
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L_0x06d3
            com.whatsapp.voipcalling.CallState r1 = r5.callState     // Catch:{ all -> 0x07f3 }
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE     // Catch:{ all -> 0x07f3 }
            if (r1 == r0) goto L_0x06d3
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "lobbyEntryPoint"
            int r7 = X.C86664Kz.A07(r1, r0)     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "com.whatsapp.intent.action.ACCEPT_CALL"
            android.content.Intent r0 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            boolean r0 = X.C18280x3.A1V(r0, r6)     // Catch:{ all -> 0x07f3 }
            r1 = 2
            if (r0 != 0) goto L_0x0081
            r0 = 7
            if (r7 == r0) goto L_0x0081
            if (r7 == r1) goto L_0x0081
            if (r7 == r4) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            X.5U0 r7 = r15.A13     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r15.A1y     // Catch:{ all -> 0x07f3 }
            r7.A00(r0)     // Catch:{ all -> 0x07f3 }
            goto L_0x0092
        L_0x0089:
            X.5U0 r8 = r15.A13     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = r15.A1y     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "voipactivity_oncreate_start"
            r8.A02(r7, r0)     // Catch:{ all -> 0x07f3 }
        L_0x0092:
            r15.A0D = r3     // Catch:{ all -> 0x07f3 }
            r15.A7x(r4)     // Catch:{ all -> 0x07f3 }
            android.view.Window r7 = r15.getWindow()     // Catch:{ all -> 0x07f3 }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r7.addFlags(r0)     // Catch:{ all -> 0x07f3 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07f3 }
            r0 = 27
            if (r7 < r0) goto L_0x00a9
            r15.setTurnScreenOn(r4)     // Catch:{ all -> 0x07f3 }
        L_0x00a9:
            r0 = 2131626299(0x7f0e093b, float:1.887983E38)
            r15.setContentView((int) r0)     // Catch:{ all -> 0x07f3 }
            r0 = 2131428451(0x7f0b0463, float:1.8478547E38)
            android.view.View r0 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            r15.A0J = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131428449(0x7f0b0461, float:1.8478543E38)
            android.view.View r0 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            r15.A0I = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131428387(0x7f0b0423, float:1.8478417E38)
            android.view.View r0 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0     // Catch:{ all -> 0x07f3 }
            r15.A0f = r0     // Catch:{ all -> 0x07f3 }
            X.5eZ r0 = new X.5eZ     // Catch:{ all -> 0x07f3 }
            r0.<init>(r15, r4)     // Catch:{ all -> 0x07f3 }
            r15.A0F = r0     // Catch:{ all -> 0x07f3 }
            android.view.Window r0 = r15.getWindow()     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r0.getDecorView()     // Catch:{ all -> 0x07f3 }
            int r0 = r7.getSystemUiVisibility()     // Catch:{ all -> 0x07f3 }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r7.setSystemUiVisibility(r0)     // Catch:{ all -> 0x07f3 }
            android.content.res.Resources r9 = r15.getResources()     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = "dimen"
            java.lang.String r7 = "android"
            java.lang.String r0 = "status_bar_height"
            int r0 = r9.getIdentifier(r0, r8, r7)     // Catch:{ all -> 0x07f3 }
            if (r0 <= 0) goto L_0x0122
            int r0 = X.C18320x8.A00(r15, r0)     // Catch:{ all -> 0x07f3 }
        L_0x00f8:
            r15.A04 = r0     // Catch:{ all -> 0x07f3 }
            android.content.res.Resources r7 = r15.getResources()     // Catch:{ all -> 0x07f3 }
            r0 = 2131166854(0x7f070686, float:1.7947965E38)
            int r0 = r7.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07f3 }
            r15.A05 = r0     // Catch:{ all -> 0x07f3 }
            android.content.res.Resources r7 = r15.getResources()     // Catch:{ all -> 0x07f3 }
            r0 = 2131165519(0x7f07014f, float:1.7945257E38)
            int r8 = r7.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07f3 }
            android.content.res.Resources r7 = r15.getResources()     // Catch:{ all -> 0x07f3 }
            r0 = 2131165526(0x7f070156, float:1.7945272E38)
            int r0 = X.C86654Ky.A02(r7, r0, r8)     // Catch:{ all -> 0x07f3 }
            r15.A01 = r0     // Catch:{ all -> 0x07f3 }
            boolean r0 = r5.videoEnabled     // Catch:{ all -> 0x07f3 }
            goto L_0x0125
        L_0x0122:
            r0 = 25
            goto L_0x00f8
        L_0x0125:
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r15.A7y(r0)     // Catch:{ all -> 0x07f3 }
            boolean r0 = r15.A80()     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x0139
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder     // Catch:{ all -> 0x07f3 }
            r0.<init>()     // Catch:{ all -> 0x07f3 }
            r15.A09 = r0     // Catch:{ all -> 0x07f3 }
        L_0x0139:
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel.class
            X.0Ty r0 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A0u = r0     // Catch:{ all -> 0x07f3 }
            X.08M r7 = r0.A04     // Catch:{ all -> 0x07f3 }
            r0 = 357(0x165, float:5.0E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = r15.A0u     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0E     // Catch:{ all -> 0x07f3 }
            r0 = 377(0x179, float:5.28E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = r15.A0u     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 360(0x168, float:5.04E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel.class
            X.0Ty r0 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A0v = r0     // Catch:{ all -> 0x07f3 }
            X.08M r7 = r0.A05     // Catch:{ all -> 0x07f3 }
            r0 = 378(0x17a, float:5.3E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131428413(0x7f0b043d, float:1.847847E38)
            android.view.View r0 = X.C06560Yg.A02(r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0     // Catch:{ all -> 0x07f3 }
            r15.A0p = r0     // Catch:{ all -> 0x07f3 }
            X.08A r7 = r15.A06     // Catch:{ all -> 0x07f3 }
            X.0vG r0 = r0.A0b     // Catch:{ all -> 0x07f3 }
            r7.A00(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.view.CallGrid r8 = r15.A0p     // Catch:{ all -> 0x07f3 }
            r7 = 7
            X.90g r0 = new X.90g     // Catch:{ all -> 0x07f3 }
            r0.<init>((java.lang.Object) r15, (int) r7)     // Catch:{ all -> 0x07f3 }
            r8.addOnLayoutChangeListener(r0)     // Catch:{ all -> 0x07f3 }
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.class
            X.0Ty r0 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A0s = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = r15.A1y     // Catch:{ all -> 0x07f3 }
            X.4xk r0 = r0.A0R     // Catch:{ all -> 0x07f3 }
            r0.A0G(r7)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r9 = r15.A0s     // Catch:{ all -> 0x07f3 }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r15)     // Catch:{ all -> 0x07f3 }
            int r8 = r0.widthPixels     // Catch:{ all -> 0x07f3 }
            int r7 = r0.heightPixels     // Catch:{ all -> 0x07f3 }
            android.util.Rational r0 = new android.util.Rational     // Catch:{ all -> 0x07f3 }
            r0.<init>(r8, r7)     // Catch:{ all -> 0x07f3 }
            r9.A0O(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.08M r7 = r0.A0H     // Catch:{ all -> 0x07f3 }
            r0 = 379(0x17b, float:5.31E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.08M r7 = r0.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 380(0x17c, float:5.32E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0y     // Catch:{ all -> 0x07f3 }
            r0 = 381(0x17d, float:5.34E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.107 r7 = r0.A0p     // Catch:{ all -> 0x07f3 }
            r0 = 361(0x169, float:5.06E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0x     // Catch:{ all -> 0x07f3 }
            r0 = 359(0x167, float:5.03E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.08M r7 = r0.A0I     // Catch:{ all -> 0x07f3 }
            r0 = 362(0x16a, float:5.07E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0w     // Catch:{ all -> 0x07f3 }
            r0 = 201(0xc9, float:2.82E-43)
            X.C86654Ky.A1G(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r15.A0s     // Catch:{ all -> 0x07f3 }
            X.08M r7 = r0.A0L     // Catch:{ all -> 0x07f3 }
            r0 = 363(0x16b, float:5.09E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel> r0 = com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel.class
            X.0Ty r0 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = (com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A0n = r0     // Catch:{ all -> 0x07f3 }
            X.107 r7 = r0.A0K     // Catch:{ all -> 0x07f3 }
            r0 = 384(0x180, float:5.38E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r15.A0n     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0L     // Catch:{ all -> 0x07f3 }
            r0 = 386(0x182, float:5.41E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.view.CallGrid r7 = r15.A0p     // Catch:{ all -> 0x07f3 }
            X.8FS r0 = new X.8FS     // Catch:{ all -> 0x07f3 }
            r0.<init>(r15)     // Catch:{ all -> 0x07f3 }
            r7.A06 = r0     // Catch:{ all -> 0x07f3 }
            X.8v3 r0 = r15.A10     // Catch:{ all -> 0x07f3 }
            X.0Wx r7 = r0.B57()     // Catch:{ all -> 0x07f3 }
            r0 = 367(0x16f, float:5.14E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            X.8y5 r0 = r15.A1n     // Catch:{ all -> 0x07f3 }
            boolean r0 = r0.BIC()     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x0285
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.screenshare.ScreenShareViewModel> r0 = com.whatsapp.calling.screenshare.ScreenShareViewModel.class
            X.0Ty r13 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r13 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r13     // Catch:{ all -> 0x07f3 }
            r15.A15 = r13     // Catch:{ all -> 0x07f3 }
            X.0US r14 = r15.A04     // Catch:{ all -> 0x07f3 }
            X.C162457s7.A0J(r14, r4)     // Catch:{ all -> 0x07f3 }
            java.lang.String r9 = "screen_sharing_req"
            X.03v r8 = new X.03v     // Catch:{ IllegalStateException -> 0x0264 }
            r8.<init>()     // Catch:{ IllegalStateException -> 0x0264 }
            r7 = 3
            X.5bZ r0 = new X.5bZ     // Catch:{ IllegalStateException -> 0x0264 }
            r0.<init>(r13, r7)     // Catch:{ IllegalStateException -> 0x0264 }
            X.0O1 r0 = r14.A00(r0, r8, r15, r9)     // Catch:{ IllegalStateException -> 0x0264 }
            r13.A02 = r0     // Catch:{ IllegalStateException -> 0x0264 }
            goto L_0x026a
        L_0x0264:
            r7 = move-exception
            java.lang.String r0 = "registerForActivityResult must be called before Activity is in STARTED state"
            X.C626936e.A08(r0, r7)     // Catch:{ all -> 0x07f3 }
        L_0x026a:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r15.A15     // Catch:{ all -> 0x07f3 }
            X.107 r7 = r0.A0F     // Catch:{ all -> 0x07f3 }
            r0 = 387(0x183, float:5.42E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r15.A15     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0G     // Catch:{ all -> 0x07f3 }
            r0 = 374(0x176, float:5.24E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r15.A15     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0H     // Catch:{ all -> 0x07f3 }
            r0 = 375(0x177, float:5.25E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
        L_0x0285:
            X.1VX r7 = r15.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 4848(0x12f0, float:6.793E-42)
            boolean r0 = r7.A0X(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x0297
            r0 = 5923(0x1723, float:8.3E-42)
            boolean r0 = r7.A0X(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x02c1
        L_0x0297:
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel> r0 = com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel.class
            X.0Ty r0 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel r0 = (com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A0y = r0     // Catch:{ all -> 0x07f3 }
            X.1VX r7 = r15.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 4848(0x12f0, float:6.793E-42)
            boolean r0 = r7.A0X(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x02c1
            com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel r0 = r15.A0y     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A07     // Catch:{ all -> 0x07f3 }
            r0 = 366(0x16e, float:5.13E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel r0 = r15.A0y     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A08     // Catch:{ all -> 0x07f3 }
            r0 = 385(0x181, float:5.4E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
        L_0x02c1:
            X.1VX r7 = r15.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 4833(0x12e1, float:6.772E-42)
            int r0 = r7.A0N(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 < r4) goto L_0x02d9
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel> r0 = com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel.class
            X.0Ty r0 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel r0 = (com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A1R = r0     // Catch:{ all -> 0x07f3 }
        L_0x02d9:
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131434349(0x7f0b1b6d, float:1.849051E38)
            X.5UY r0 = X.AnonymousClass0x2.A0M(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A1p = r0     // Catch:{ all -> 0x07f3 }
            android.view.Window r0 = r15.getWindow()     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r0.getDecorView()     // Catch:{ all -> 0x07f3 }
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()     // Catch:{ all -> 0x07f3 }
            r7.getWindowVisibleDisplayFrame(r0)     // Catch:{ all -> 0x07f3 }
            boolean r0 = r5.isCaller     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b7
            java.lang.String r7 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "asus"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x030b
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "ASUS_I01WD"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
        L_0x030b:
            java.lang.String r0 = "oppo"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x032d
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "OP4863"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "OP4B65L1"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "OP4A57"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
        L_0x032d:
            java.lang.String r0 = "Realme"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x033f
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "RMX1901"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
        L_0x033f:
            java.lang.String r0 = "samsung"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x0351
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "r1q"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
        L_0x0351:
            java.lang.String r0 = "vivo"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x039b
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "1805"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "PD1805"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "1909"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "1910"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "1910N"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "1819"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "1818"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "PD1818"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
        L_0x039b:
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x03b7
            java.lang.String r7 = android.os.Build.DEVICE     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "raphaelin"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "davinciin"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x03b7
        L_0x03b5:
            r0 = 1
            goto L_0x03b8
        L_0x03b7:
            r0 = 0
        L_0x03b8:
            r15.A2L = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131428640(0x7f0b0520, float:1.847893E38)
            android.view.View r7 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            r15.A0L = r7     // Catch:{ all -> 0x07f3 }
            r0 = 2131428641(0x7f0b0521, float:1.8478932E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0W = r0     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r15.A0L     // Catch:{ all -> 0x07f3 }
            r0 = 2131428639(0x7f0b051f, float:1.8478928E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            r15.A0K = r0     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r15.A0L     // Catch:{ all -> 0x07f3 }
            r0 = 2131428638(0x7f0b051e, float:1.8478926E38)
            com.whatsapp.WaTextView r0 = X.C86644Kx.A0O(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0g = r0     // Catch:{ all -> 0x07f3 }
            X.C106905aM.A04(r0)     // Catch:{ all -> 0x07f3 }
            r0 = 2131234310(0x7f080e06, float:1.8084782E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r15, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0A = r0     // Catch:{ all -> 0x07f3 }
            X.5eZ r0 = new X.5eZ     // Catch:{ all -> 0x07f3 }
            r0.<init>(r15, r1)     // Catch:{ all -> 0x07f3 }
            r15.A0G = r0     // Catch:{ all -> 0x07f3 }
            r7 = 3
            X.5eZ r0 = new X.5eZ     // Catch:{ all -> 0x07f3 }
            r0.<init>(r15, r7)     // Catch:{ all -> 0x07f3 }
            r15.A0H = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131428405(0x7f0b0435, float:1.8478454E38)
            android.view.View r7 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.CallDetailsLayout r7 = (com.whatsapp.calling.CallDetailsLayout) r7     // Catch:{ all -> 0x07f3 }
            r15.A0j = r7     // Catch:{ all -> 0x07f3 }
            int r0 = r15.A04     // Catch:{ all -> 0x07f3 }
            r7.setPadding(r3, r0, r3, r3)     // Catch:{ all -> 0x07f3 }
            X.1VX r7 = r15.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 3321(0xcf9, float:4.654E-42)
            boolean r0 = r7.A0X(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x0431
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131428217(0x7f0b0379, float:1.8478072E38)
            X.5UY r0 = X.AnonymousClass0x2.A0M(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A1o = r0     // Catch:{ all -> 0x07f3 }
            r0.A06(r3)     // Catch:{ all -> 0x07f3 }
            X.5UY r8 = r15.A1o     // Catch:{ all -> 0x07f3 }
            r7 = 41
            X.53y r0 = new X.53y     // Catch:{ all -> 0x07f3 }
            r0.<init>(r15, r7)     // Catch:{ all -> 0x07f3 }
            r8.A07(r0)     // Catch:{ all -> 0x07f3 }
        L_0x0431:
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131434350(0x7f0b1b6e, float:1.8490511E38)
            android.view.View r0 = X.C06560Yg.A02(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0P = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131429639(0x7f0b0907, float:1.8480956E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r15, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0X = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131429641(0x7f0b0909, float:1.848096E38)
            android.widget.ImageView r0 = X.C86654Ky.A0M(r15, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0T = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131429635(0x7f0b0903, float:1.8480948E38)
            android.view.View r7 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            r15.A0M = r7     // Catch:{ all -> 0x07f3 }
            r0 = 28
            X.C109495ei.A00(r7, r15, r5, r0)     // Catch:{ all -> 0x07f3 }
            android.view.View r9 = r15.A0M     // Catch:{ all -> 0x07f3 }
            boolean r0 = r5.videoEnabled     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x04c0
            r0 = 2131895286(0x7f1223f6, float:1.94254E38)
            java.lang.String r8 = r15.getString(r0)     // Catch:{ all -> 0x07f3 }
        L_0x0469:
            X.1VX r7 = r15.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 2541(0x9ed, float:3.56E-42)
            boolean r0 = r7.A0X(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x047a
            r0 = 2131895285(0x7f1223f5, float:1.9425399E38)
            java.lang.String r11 = r15.getString(r0)     // Catch:{ all -> 0x07f3 }
        L_0x047a:
            X.C86654Ky.A1A(r9, r8, r11, r4)     // Catch:{ all -> 0x07f3 }
            r0 = 2131434358(0x7f0b1b76, float:1.8490528E38)
            android.view.View r0 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0     // Catch:{ all -> 0x07f3 }
            r15.A0S = r0     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131434348(0x7f0b1b6c, float:1.8490507E38)
            android.view.ViewGroup r0 = X.C86644Kx.A0I(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0R = r0     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131427584(0x7f0b0100, float:1.8476788E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0V = r0     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131427583(0x7f0b00ff, float:1.8476786E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0Y = r0     // Catch:{ all -> 0x07f3 }
            boolean r0 = X.C1001059l.A04     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x04c8
            X.2oU r0 = r15.A1U     // Catch:{ all -> 0x07f3 }
            android.content.res.Resources r7 = X.C54292oU.A00(r0)     // Catch:{ all -> 0x07f3 }
            r0 = 2131168873(0x7f070e69, float:1.795206E38)
            int r7 = r7.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07f3 }
            android.widget.ImageView r0 = r15.A0V     // Catch:{ all -> 0x07f3 }
            r0.setPadding(r7, r7, r7, r7)     // Catch:{ all -> 0x07f3 }
            goto L_0x04c8
        L_0x04c0:
            r0 = 2131895288(0x7f1223f8, float:1.9425405E38)
            java.lang.String r8 = r15.getString(r0)     // Catch:{ all -> 0x07f3 }
            goto L_0x0469
        L_0x04c8:
            if (r12 == 0) goto L_0x04d9
            X.2sF r9 = r15.A02     // Catch:{ all -> 0x07f3 }
            android.view.View r8 = r15.A0P     // Catch:{ all -> 0x07f3 }
            r0 = 22
            X.5rO r7 = new X.5rO     // Catch:{ all -> 0x07f3 }
            r7.<init>(r15, r0)     // Catch:{ all -> 0x07f3 }
            r0 = 4
            r9.A03(r8, r7, r10, r0)     // Catch:{ all -> 0x07f3 }
        L_0x04d9:
            X.1VX r7 = r15.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 6530(0x1982, float:9.15E-42)
            boolean r0 = r7.A0X(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x04f4
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131433750(0x7f0b1916, float:1.8489295E38)
            android.view.View r7 = X.C06560Yg.A02(r7, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0O = r7     // Catch:{ all -> 0x07f3 }
            r0 = 2131433749(0x7f0b1915, float:1.8489292E38)
            X.C06560Yg.A02(r7, r0)     // Catch:{ all -> 0x07f3 }
        L_0x04f4:
            X.0XL r7 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel.class
            X.0Ty r0 = r7.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A0t = r0     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0E     // Catch:{ all -> 0x07f3 }
            r0 = 382(0x17e, float:5.35E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r15.A0t     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0C     // Catch:{ all -> 0x07f3 }
            r0 = 364(0x16c, float:5.1E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r15.A0t     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0A     // Catch:{ all -> 0x07f3 }
            r0 = 383(0x17f, float:5.37E-43)
            X.AnonymousClass6C6.A01(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r15.A0t     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r0.A0B     // Catch:{ all -> 0x07f3 }
            r0 = 365(0x16d, float:5.11E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            android.view.View r7 = r15.A0J     // Catch:{ all -> 0x07f3 }
            r0 = 2131430695(0x7f0b0d27, float:1.8483098E38)
            android.view.View r9 = X.C06560Yg.A02(r7, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r9 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r9     // Catch:{ all -> 0x07f3 }
            r15.A0r = r9     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r8 = r15.A0t     // Catch:{ all -> 0x07f3 }
            r9.A05 = r8     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r8.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 143(0x8f, float:2.0E-43)
            X.C86604Kt.A1N(r15, r7, r9, r0)     // Catch:{ all -> 0x07f3 }
            X.4UC r7 = r8.A09     // Catch:{ all -> 0x07f3 }
            r0 = 144(0x90, float:2.02E-43)
            X.C86604Kt.A1N(r15, r7, r9, r0)     // Catch:{ all -> 0x07f3 }
            X.107 r7 = r8.A08     // Catch:{ all -> 0x07f3 }
            r0 = 145(0x91, float:2.03E-43)
            X.C86604Kt.A1N(r15, r7, r9, r0)     // Catch:{ all -> 0x07f3 }
            r15.A7Q()     // Catch:{ all -> 0x07f3 }
            r15.A7S()     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r10 = r15.A0s     // Catch:{ all -> 0x07f3 }
            int r9 = r15.A04     // Catch:{ all -> 0x07f3 }
            int r8 = r15.A01     // Catch:{ all -> 0x07f3 }
            int r7 = r15.A05     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = r15.A0r     // Catch:{ all -> 0x07f3 }
            int r21 = r0.getBannerHeight()     // Catch:{ all -> 0x07f3 }
            boolean r0 = r15.A2B     // Catch:{ all -> 0x07f3 }
            boolean r22 = X.AnonymousClass000.A1T(r0)
            X.5Oj r0 = new X.5Oj     // Catch:{ all -> 0x07f3 }
            r16 = r0
            r17 = r10
            r18 = r9
            r19 = r8
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x07f3 }
            r15.A0q = r0     // Catch:{ all -> 0x07f3 }
            android.widget.ImageButton r7 = r15.A0S     // Catch:{ all -> 0x07f3 }
            android.view.View$OnClickListener r0 = r15.A2O     // Catch:{ all -> 0x07f3 }
            r7.setOnClickListener(r0)     // Catch:{ all -> 0x07f3 }
            android.widget.ImageButton r8 = r15.A0S     // Catch:{ all -> 0x07f3 }
            r0 = 2131895339(0x7f12242b, float:1.9425508E38)
            java.lang.String r7 = r15.getString(r0)     // Catch:{ all -> 0x07f3 }
            r0 = 2131895338(0x7f12242a, float:1.9425506E38)
            java.lang.String r0 = r15.getString(r0)     // Catch:{ all -> 0x07f3 }
            X.C86654Ky.A1A(r8, r7, r0, r4)     // Catch:{ all -> 0x07f3 }
            android.view.ViewGroup r7 = r15.A0R     // Catch:{ all -> 0x07f3 }
            r0 = 4
            X.C18320x8.A14(r7, r15, r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.jid.GroupJid r0 = r5.groupJid     // Catch:{ all -> 0x07f3 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r15.A7z(r0)     // Catch:{ all -> 0x07f3 }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r15.findViewById(r0)     // Catch:{ all -> 0x07f3 }
            r15.A0N = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131434671(0x7f0b1caf, float:1.8491163E38)
            android.widget.ImageView r0 = X.C86654Ky.A0M(r15, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0U = r0     // Catch:{ all -> 0x07f3 }
            r15.A7X()     // Catch:{ all -> 0x07f3 }
            X.1VX r7 = r15.A0D     // Catch:{ all -> 0x07f3 }
            r0 = 5341(0x14dd, float:7.484E-42)
            boolean r0 = r7.A0X(r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x05ed
            X.33i r11 = r15.A08     // Catch:{ all -> 0x07f3 }
            X.33j r10 = r15.A00     // Catch:{ all -> 0x07f3 }
            X.2sH r9 = r15.A06     // Catch:{ all -> 0x07f3 }
            X.1VX r8 = r15.A0D     // Catch:{ all -> 0x07f3 }
            X.8y5 r7 = r15.A1n     // Catch:{ all -> 0x07f3 }
            X.5Xv r0 = r15.A0m     // Catch:{ all -> 0x07f3 }
            X.0ni r22 = X.AnonymousClass0IT.A00(r15)     // Catch:{ all -> 0x07f3 }
            X.5XJ r14 = new X.5XJ     // Catch:{ all -> 0x07f3 }
            r16 = r0
            r17 = r11
            r18 = r9
            r19 = r10
            r20 = r8
            r21 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x07f3 }
            r15.A18 = r14     // Catch:{ all -> 0x07f3 }
            X.08M r7 = r14.A04     // Catch:{ all -> 0x07f3 }
            r0 = 358(0x166, float:5.02E-43)
            X.C86604Kt.A1M(r15, r7, r0)     // Catch:{ all -> 0x07f3 }
            X.5XJ r7 = r15.A18     // Catch:{ all -> 0x07f3 }
            android.view.View r0 = r15.A0N     // Catch:{ all -> 0x07f3 }
            r7.A01 = r0     // Catch:{ all -> 0x07f3 }
        L_0x05ed:
            android.content.Intent r7 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            r15.setIntent(r7)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "callAccepted"
            boolean r0 = r7.getBooleanExtra(r0, r3)     // Catch:{ all -> 0x07f3 }
            r15.A23 = r0     // Catch:{ all -> 0x07f3 }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "voip/VoipActivityV2/create intent: "
            r8.append(r0)     // Catch:{ all -> 0x07f3 }
            r8.append(r7)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = ", call info: "
            X.C18260x0.A1R(r8, r0, r5)     // Catch:{ all -> 0x07f3 }
            r0 = 46
            X.681 r8 = X.AnonymousClass681.A00(r15, r0)     // Catch:{ all -> 0x07f3 }
            r15.A1J = r8     // Catch:{ all -> 0x07f3 }
            X.1in r0 = r15.A1K     // Catch:{ all -> 0x07f3 }
            r0.A06(r8)     // Catch:{ all -> 0x07f3 }
            r0 = 8
            X.69w r8 = new X.69w     // Catch:{ all -> 0x07f3 }
            r8.<init>(r15, r0)     // Catch:{ all -> 0x07f3 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x07f3 }
            r0.<init>(r8)     // Catch:{ all -> 0x07f3 }
            r15.A0D = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131234309(0x7f080e05, float:1.808478E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r15, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0B = r0     // Catch:{ all -> 0x07f3 }
            r0 = 2131234314(0x7f080e0a, float:1.808479E38)
            android.graphics.drawable.Drawable r10 = X.AnonymousClass0RP.A00(r15, r0)     // Catch:{ all -> 0x07f3 }
            r15.A0C = r10     // Catch:{ all -> 0x07f3 }
            if (r10 == 0) goto L_0x0658
            int r0 = r10.getIntrinsicWidth()     // Catch:{ all -> 0x07f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x07f3 }
            r9 = 1063256064(0x3f600000, float:0.875)
            float r0 = r0 * r9
            int r8 = (int) r0     // Catch:{ all -> 0x07f3 }
            android.graphics.drawable.Drawable r0 = r15.A0C     // Catch:{ all -> 0x07f3 }
            int r0 = r0.getIntrinsicHeight()     // Catch:{ all -> 0x07f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x07f3 }
            float r0 = r0 * r9
            int r0 = (int) r0     // Catch:{ all -> 0x07f3 }
            r10.setBounds(r3, r3, r8, r0)     // Catch:{ all -> 0x07f3 }
            android.graphics.drawable.Drawable r3 = r15.A0C     // Catch:{ all -> 0x07f3 }
            r0 = 230(0xe6, float:3.22E-43)
            r3.setAlpha(r0)     // Catch:{ all -> 0x07f3 }
        L_0x0658:
            android.view.Window r0 = r15.getWindow()     // Catch:{ all -> 0x07f3 }
            X.C111095hX.A08(r0)     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = r7.getAction()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "com.whatsapp.intent.action.START_CALL"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x069e
            java.lang.String r0 = r7.getAction()     // Catch:{ all -> 0x07f3 }
            r15.A7q(r5, r0)     // Catch:{ all -> 0x07f3 }
        L_0x0672:
            X.4xc r3 = r15.A1r     // Catch:{ all -> 0x07f3 }
            X.8uW r0 = r15.A2Q     // Catch:{ all -> 0x07f3 }
            r3.A06(r0)     // Catch:{ all -> 0x07f3 }
            X.5U0 r4 = r15.A13     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = r15.A1y     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "voipactivity_oncreate_done"
            r4.A02(r3, r0)     // Catch:{ all -> 0x07f3 }
            X.0XL r3 = X.AnonymousClass0x9.A0H(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel> r0 = com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel.class
            X.0Ty r0 = r3.A01(r0)     // Catch:{ all -> 0x07f3 }
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r0 = (com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r0     // Catch:{ all -> 0x07f3 }
            r15.A0w = r0     // Catch:{ all -> 0x07f3 }
            X.08M r3 = r0.A01     // Catch:{ all -> 0x07f3 }
            r0 = 376(0x178, float:5.27E-43)
            X.AnonymousClass6C6.A01(r15, r3, r0)     // Catch:{ all -> 0x07f3 }
            X.4C1 r0 = r15.A1z     // Catch:{ all -> 0x07f3 }
            boolean r0 = X.C86614Ku.A1a(r0)     // Catch:{ all -> 0x07f3 }
            goto L_0x06c2
        L_0x069e:
            boolean r0 = r6.equals(r3)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x06a8
            r15.A7e(r7, r5)     // Catch:{ all -> 0x07f3 }
            goto L_0x0672
        L_0x06a8:
            java.lang.String r0 = "com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x06b4
            r15.A7f(r7, r5)     // Catch:{ all -> 0x07f3 }
            goto L_0x0672
        L_0x06b4:
            java.lang.String r0 = "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x0672
            r15.A24 = r4     // Catch:{ all -> 0x07f3 }
            r15.A7Z()     // Catch:{ all -> 0x07f3 }
            goto L_0x0672
        L_0x06c2:
            if (r0 == 0) goto L_0x07eb
            int r0 = X.C86604Kt.A02(r15)     // Catch:{ all -> 0x07f3 }
            if (r0 != r1) goto L_0x07eb
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r15)     // Catch:{ all -> 0x07f3 }
            r15.onConfigurationChanged(r0)     // Catch:{ all -> 0x07f3 }
            goto L_0x07eb
        L_0x06d3:
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "joinable"
            boolean r0 = r1.getBooleanExtra(r0, r3)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x0702
            java.lang.String r0 = r15.A1y     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x06e8
            r15.finish()     // Catch:{ all -> 0x07f3 }
            goto L_0x07eb
        L_0x06e8:
            X.49Q r5 = r15.A2P     // Catch:{ all -> 0x07f3 }
            X.2sW r1 = r15.A1Y     // Catch:{ all -> 0x07f3 }
            X.5IP r0 = r15.A1F     // Catch:{ all -> 0x07f3 }
            X.1sv r6 = new X.1sv     // Catch:{ all -> 0x07f3 }
            r6.<init>(r5, r0, r1)     // Catch:{ all -> 0x07f3 }
            r15.A0x = r6     // Catch:{ all -> 0x07f3 }
            X.4FS r5 = r15.A04     // Catch:{ all -> 0x07f3 }
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r15.A1y     // Catch:{ all -> 0x07f3 }
            r1[r3] = r0     // Catch:{ all -> 0x07f3 }
            r5.BkL(r6, r1)     // Catch:{ all -> 0x07f3 }
            goto L_0x07eb
        L_0x0702:
            r15.finish()     // Catch:{ all -> 0x07f3 }
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "fromCallNotification"
            boolean r0 = r1.getBooleanExtra(r0, r3)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x076b
            java.lang.String r0 = "voip/VoipActivityV2/create/redirect_to_voice_service"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x07f3 }
            X.3XI r0 = r15.A1g     // Catch:{ all -> 0x07f3 }
            r0.A02()     // Catch:{ all -> 0x07f3 }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "jid"
            java.util.List r0 = X.C86634Kw.A12(r1, r5, r0)     // Catch:{ all -> 0x07f3 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x07f3 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x07f3 }
        L_0x072f:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x073f
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r6)     // Catch:{ all -> 0x07f3 }
            X.3Ex r0 = r15.A1I     // Catch:{ all -> 0x07f3 }
            X.C86614Ku.A1P(r0, r1, r5)     // Catch:{ all -> 0x07f3 }
            goto L_0x072f
        L_0x073f:
            int r0 = r5.size()     // Catch:{ all -> 0x07f3 }
            if (r0 <= 0) goto L_0x0759
            int r0 = X.AnonymousClass0x9.A03(r5, r4)     // Catch:{ all -> 0x07f3 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x07f3 }
            X.3ZH r0 = (X.AnonymousClass3ZH) r0     // Catch:{ all -> 0x07f3 }
            X.4uZ r4 = r0.A0H     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x0759
            X.5mB r1 = r15.A1T     // Catch:{ all -> 0x07f3 }
            r0 = 3
            r1.A06(r4, r0)     // Catch:{ all -> 0x07f3 }
        L_0x0759:
            X.66r r4 = r15.A0z     // Catch:{ all -> 0x07f3 }
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "video_call"
            boolean r1 = r1.getBooleanExtra(r0, r3)     // Catch:{ all -> 0x07f3 }
            r0 = 5
            r4.Bpl(r15, r5, r0, r1)     // Catch:{ all -> 0x07f3 }
            goto L_0x07eb
        L_0x076b:
            android.content.Intent r0 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r1 = r0.getAction()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "com.whatsapp.intent.action.OPEN_PRECALL_LOBBY"
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x07ac
            android.content.Intent r4 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = "scheduled_call_row_id"
            r0 = -1
            long r18 = r4.getLongExtra(r3, r0)     // Catch:{ all -> 0x07f3 }
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "group_jid"
            java.lang.String r1 = r1.getStringExtra(r0)     // Catch:{ all -> 0x07f3 }
            X.32V r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x07f3 }
            com.whatsapp.jid.GroupJid r16 = r0.A03(r1)     // Catch:{ all -> 0x07f3 }
            r3 = 0
            int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x07eb
            if (r16 == 0) goto L_0x07eb
            X.4FS r0 = r15.A04     // Catch:{ all -> 0x07f3 }
            r17 = 16
            X.3aF r14 = new X.3aF     // Catch:{ all -> 0x07f3 }
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x07f3 }
            r0.BkP(r14)     // Catch:{ all -> 0x07f3 }
            goto L_0x07eb
        L_0x07ac:
            java.lang.String r0 = "voip/VoipActivityV2/create/call_not_active"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07f3 }
            android.content.Intent r1 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "fgservice_start_failed"
            boolean r0 = r1.getBooleanExtra(r0, r3)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x07eb
            X.1X4 r3 = new X.1X4     // Catch:{ all -> 0x07f3 }
            r3.<init>()     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "voip_call_lobby_open_fail_fgservice_restriction"
            r3.A00 = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r1 = "com.whatsapp.intent.action.ACCEPT_CALL"
            android.content.Intent r0 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            boolean r0 = X.C18280x3.A1V(r0, r1)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x07e8
            java.lang.String r1 = "join_call"
            android.content.Intent r0 = r15.getIntent()     // Catch:{ all -> 0x07f3 }
            boolean r0 = X.C18280x3.A1V(r0, r1)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x07e8
            java.lang.String r0 = "false"
        L_0x07e0:
            r3.A01 = r0     // Catch:{ all -> 0x07f3 }
            X.4FV r0 = r15.A1d     // Catch:{ all -> 0x07f3 }
            r0.BhD(r3)     // Catch:{ all -> 0x07f3 }
            goto L_0x07eb
        L_0x07e8:
            java.lang.String r0 = "true"
            goto L_0x07e0
        L_0x07eb:
            if (r12 == 0) goto L_0x07f2
            X.2sF r0 = r15.A02
            r0.A06(r2)
        L_0x07f2:
            return
        L_0x07f3:
            r1 = move-exception
            if (r12 == 0) goto L_0x07fb
            X.2sF r0 = r15.A02
            r0.A06(r2)
        L_0x07fb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        Dialog A1J2;
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment == null || (A1J2 = contactPickerFragment.A1J(i)) == null) {
            return super.onCreateDialog(i);
        }
        return A1J2;
    }

    public void onGlobalLayout() {
        if (this.A0N.getWidth() != this.A07 || this.A0N.getHeight() != this.A06) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("voip/VoipActivityV2/onGlobalLayout size: ");
            A0o2.append(this.A0N.getWidth());
            A0o2.append("x");
            A0o2.append(this.A0N.getHeight());
            A0o2.append(", orientation: ");
            C18260x0.A1G(A0o2, C86604Kt.A02(this));
            this.A07 = this.A0N.getWidth();
            this.A06 = this.A0N.getHeight();
            this.A10.onGlobalLayout();
            CallInfo A7D = A7D();
            A7p(A7D);
            if (!this.A2G || A7D == null || !A7D.videoEnabled) {
                CallGrid callGrid = this.A0p;
                callGrid.A07.A05();
                callGrid.A08.A05();
            } else {
                this.A1u.updateCameraPreviewOrientation();
            }
            Log.i("voip/VoipActivityV2/onGlobalLayout/end");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A1P == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A1P.A20(true);
        A7K();
        return true;
    }

    public void onRestart() {
        if (this.A0D.A0X(1807)) {
            this.A02.A04(this.A0P, new C117105rO(this, 25), "VoipActivityV2", 4);
        }
        super.onRestart();
    }

    public void onSaveInstanceState(Bundle bundle) {
        A7B(C142136wh.SAVE_INSTANCE_STATE);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1X();
        return true;
    }

    public void onUserLeaveHint() {
        ScreenShareViewModel screenShareViewModel;
        Log.i("voip/VoipActivityV2/onUserLeaveHint");
        if (this.A1P != null || (((screenShareViewModel = this.A15) != null && screenShareViewModel.A05) || !A80() || !A86(A7D()))) {
            this.A2F = false;
            CallInfo A7D = A7D();
            if (A7D != null && A7D.callState == CallState.PRECALLING) {
                A7M();
            }
        }
    }

    public void recreate() {
        if (this.A00 == 3) {
            super.recreate();
        }
    }

    public VoipActivityV2(int i) {
        this.A29 = false;
        C86604Kt.A1K(this, 107);
    }

    public final CallInfo A7D() {
        if (Voip.A07()) {
            CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
            if (callLinkInfo != null) {
                return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
            }
            return null;
        }
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            return A7E(callInfo);
        }
        return null;
    }

    public void A7I() {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/VoipActivityV2/showCallFailedMessage");
        C18260x0.A1L(A0o2, this.A1x);
        if (this.A1x != null) {
            A7H();
            String str = this.A1x;
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putString("message", str);
            messageDialogFragment.A0u(A082);
            this.A0c = messageDialogFragment;
            A7A(messageDialogFragment, "MessageDialogFragment");
            return;
        }
        C626936e.A0D(false, "call failed message not defined");
    }

    public final void A7L() {
        C08310eF A0D2 = getSupportFragmentManager().A0D("permission_request");
        if (A0D2 != null) {
            Log.d("VoipActivityV2/dismissPermissionsDialogFragment Dismissing Fragment");
            C08240dc A0J2 = AnonymousClass0x2.A0J(this);
            A0J2.A07(A0D2);
            A0J2.A04();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7R() {
        /*
            r4 = this;
            com.whatsapp.voipcalling.CallInfo r2 = r4.A7D()
            if (r2 == 0) goto L_0x0042
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0042
            boolean r0 = r4.A2K
            if (r0 == 0) goto L_0x0042
            boolean r0 = r4.A2G
            if (r0 == 0) goto L_0x0042
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0042
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x0042
            java.util.Map r0 = r2.participants
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            X.5Lb r1 = X.C86664Kz.A13(r2)
            boolean r0 = r1.A0O
            if (r0 != 0) goto L_0x0035
            int r1 = r1.A06
            r0 = 6
            if (r1 != r0) goto L_0x0022
        L_0x0035:
            android.os.Handler r0 = r4.A0D
            r3 = 3
            r0.removeMessages(r3)
            android.os.Handler r2 = r4.A0D
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.sendEmptyMessageDelayed(r3, r0)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7R():void");
    }

    public final void A7W() {
        Rect rect;
        AnonymousClass107 r0;
        int i;
        CallInfo A7D = A7D();
        if (A7D != null) {
            if (this.A2C || (!this.A2B && A7D.videoEnabled && AnonymousClass5AJ.A00(A7D.participants) <= 2)) {
                CallGridViewModel callGridViewModel = this.A0s;
                rect = new Rect(0, 0, 0, 0);
                if (!AnonymousClass75J.A00(callGridViewModel.A01, rect)) {
                    callGridViewModel.A01 = rect;
                    r0 = callGridViewModel.A0t;
                } else {
                    return;
                }
            } else {
                if (this.A2B) {
                    i = 0;
                } else {
                    i = this.A02;
                }
                CallGridViewModel callGridViewModel2 = this.A0s;
                rect = new Rect(0, this.A03, 0, i);
                if (!AnonymousClass75J.A00(callGridViewModel2.A01, rect)) {
                    callGridViewModel2.A01 = rect;
                    r0 = callGridViewModel2.A0t;
                } else {
                    return;
                }
            }
            r0.A0H(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r1 == 1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (com.whatsapp.voipcalling.Voip.A08(r4.callState) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r9.A23 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7X() {
        /*
            r9 = this;
            X.C626936e.A01()
            com.whatsapp.voipcalling.CallInfo r4 = r9.A7D()
            if (r4 == 0) goto L_0x00d5
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00d5
            com.whatsapp.voipcalling.CallState r6 = r9.A7F(r4)
            boolean r0 = r4.isEitherSideRequestingUpgrade()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r9.A23
            r8 = 1
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r8 = 0
        L_0x0021:
            boolean r0 = r4.videoEnabled
            r5 = 8
            if (r0 == 0) goto L_0x00de
            r0 = 2131895420(0x7f12247c, float:1.9425673E38)
            r9.setTitle(r0)
            java.lang.String r1 = r9.getString(r0)
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription
            r0.<init>(r1)
            r9.setTaskDescription(r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A1P
            if (r0 != 0) goto L_0x0055
            android.view.Window r1 = r9.getWindow()
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            X.C86634Kw.A13(r9, r1, r0)
            android.view.Window r1 = r9.getWindow()
            r0 = 2131099845(0x7f0600c5, float:1.7812055E38)
            int r0 = X.AnonymousClass0Y8.A04(r9, r0)
            r1.setNavigationBarColor(r0)
        L_0x0055:
            android.view.View r0 = r9.A0J
            r0.setBackgroundResource(r2)
            com.whatsapp.WaImageView r0 = r9.A0f
            if (r0 == 0) goto L_0x0061
            r0.setVisibility(r5)
        L_0x0061:
            r9.A7l(r4)
            com.whatsapp.calling.CallDetailsLayout r7 = r9.A0j
            boolean r5 = r7.A05(r4)
            int r1 = r9.A00
            if (r1 == 0) goto L_0x0071
            r0 = 0
            if (r1 != r3) goto L_0x0072
        L_0x0071:
            r0 = 1
        L_0x0072:
            r7.A03(r6, r5, r0)
            r0 = 2131434665(0x7f0b1ca9, float:1.849115E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r8 != 0) goto L_0x008a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 != r0) goto L_0x008a
            boolean r0 = r4.isInLonelyState()
            if (r0 != 0) goto L_0x008a
            r2 = 8
        L_0x008a:
            r1.setVisibility(r2)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A1t
            if (r0 == 0) goto L_0x0098
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0V
            if (r0 == 0) goto L_0x0098
            r0.A01()
        L_0x0098:
            boolean r0 = r4.isCaller
            if (r0 != 0) goto L_0x00a5
            com.whatsapp.voipcalling.CallState r0 = r4.callState
            boolean r1 = com.whatsapp.voipcalling.Voip.A08(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00c2
            boolean r0 = X.C627436k.A0O(r4)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x00c2
            boolean r0 = X.C107535bT.A09()
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L_0x00d6
        L_0x00c2:
            android.view.Window r0 = r9.getWindow()
            r0.addFlags(r1)
        L_0x00c9:
            X.4C1 r0 = r9.A1z
            boolean r0 = X.C86614Ku.A1a(r0)
            if (r0 == 0) goto L_0x00d2
            r3 = 2
        L_0x00d2:
            r9.setRequestedOrientation(r3)
        L_0x00d5:
            return
        L_0x00d6:
            android.view.Window r0 = r9.getWindow()
            r0.clearFlags(r1)
            goto L_0x00c9
        L_0x00de:
            r0 = 2131895235(0x7f1223c3, float:1.9425297E38)
            r9.setTitle(r0)
            java.lang.String r1 = r9.getString(r0)
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription
            r0.<init>(r1)
            r9.setTaskDescription(r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A1P
            if (r0 != 0) goto L_0x010c
            android.view.Window r1 = r9.getWindow()
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            X.C86634Kw.A13(r9, r1, r0)
            android.view.Window r1 = r9.getWindow()
            r0 = 2131102668(0x7f060bcc, float:1.781778E38)
            int r0 = X.AnonymousClass0Y8.A04(r9, r0)
            r1.setNavigationBarColor(r0)
        L_0x010c:
            r9.A7l(r4)
            android.widget.TextView r0 = r9.A0W
            X.C86634Kw.A1I(r0)
            android.view.View r0 = r9.A0L
            r0.setVisibility(r5)
            com.whatsapp.calling.CallDetailsLayout r1 = r9.A0j
            boolean r0 = r1.A05(r4)
            r1.A02(r6, r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 == r0) goto L_0x019e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 == r0) goto L_0x019e
            int r0 = r1.A01
            r1.setBackgroundColor(r0)
            r1.setVisibility(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.5YB r0 = r1.A07
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.A04
            r0.setVisibility(r2)
        L_0x0143:
            r0 = 2131434665(0x7f0b1ca9, float:1.849115E38)
            X.C18280x3.A0r(r9, r0, r5)
            android.widget.ImageView r0 = r9.A0U
            r0.setVisibility(r5)
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r9.A0p
            X.C626936e.A04(r0)
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r9.A0p
            r0.setVisibility(r2)
            android.view.View r1 = r9.A0P
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            r1.setBackgroundResource(r0)
            android.view.View r1 = r9.A0J
            r0 = 2131102669(0x7f060bcd, float:1.7817782E38)
            r1.setBackgroundResource(r0)
            com.whatsapp.WaImageView r0 = r9.A0f
            if (r0 == 0) goto L_0x016f
            r0.setVisibility(r2)
        L_0x016f:
            r9.A2K = r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A1t
            if (r0 == 0) goto L_0x0098
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0V
            if (r0 == 0) goto L_0x0098
            r0.A00()
            boolean r0 = r9.A81()
            if (r0 == 0) goto L_0x0098
            X.1VX r0 = r9.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x0098
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r9.A1t
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r1.A0U
            if (r0 == 0) goto L_0x0193
            r0.setVisibility(r5)
        L_0x0193:
            X.5Uk r0 = r1.A0N
            if (r0 == 0) goto L_0x0098
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0I
            r0.A0b(r2)
            goto L_0x0098
        L_0x019e:
            r1.setVisibility(r5)
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7X():void");
    }

    public final void A7Y() {
        this.A0T.setImageDrawable(C107335b8.A09(getResources(), C18310x6.A0G(this, R.drawable.ic_provider_info), R.color.f5nameremoved));
        C107555bV.A03(this.A0T, 0, 10);
    }

    public final void A7g(Rational rational) {
        if (A80()) {
            C626936e.A07(this.A09, "PiP Params Builder is null");
            this.A09.setAspectRatio(rational);
            if (this.A2C) {
                setPictureInPictureParams(this.A09.build());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ae, code lost:
        if (r0 != false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c6, code lost:
        if (X.AnonymousClass5AJ.A00(r11.participants) == 2) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0226, code lost:
        r3 = new java.lang.Object[1];
        X.C18300x5.A1E(r10.A1M, r10.A1I.A0A(X.C86644Kx.A0X(r11)), r3, 0);
        r9 = getString(com.whatsapp.R.string.f11nameremoved, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0244, code lost:
        if (r0 != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0246, code lost:
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0251, code lost:
        r1 = null;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r0 = r10.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r0.A04(r4, r1);
        r10.A0j.A0K.A06(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016a, code lost:
        if (r9 == null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0183, code lost:
        if (r7.A0F != false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019c, code lost:
        if (r0 != false) goto L_0x019e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7k(com.whatsapp.voipcalling.CallInfo r11) {
        /*
            r10 = this;
            X.C626936e.A01()
            int r0 = r10.A07
            if (r0 == 0) goto L_0x0255
            int r0 = r10.A06
            if (r0 == 0) goto L_0x0255
            boolean r0 = r10.A28
            if (r0 != 0) goto L_0x0255
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0j
            int r0 = r0.A00
            r5 = 1
            if (r0 == r5) goto L_0x0255
            if (r11 == 0) goto L_0x0255
            boolean r0 = r11.callEnding
            if (r0 != 0) goto L_0x0255
            com.whatsapp.voipcalling.CallState r1 = r11.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0255
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0255
            boolean r0 = r11.isInLonelyState()
            if (r0 != 0) goto L_0x0255
            X.5Lb r0 = r11.self
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = r11.scheduledId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005d
            com.whatsapp.voipcalling.CallState r0 = r10.A7F(r11)
            int r0 = r0.ordinal()
            r4 = 0
            r6 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x021e;
                case 2: goto L_0x0212;
                case 3: goto L_0x0061;
                case 4: goto L_0x024a;
                case 5: goto L_0x024a;
                case 6: goto L_0x00af;
                case 7: goto L_0x0060;
                case 8: goto L_0x0061;
                case 9: goto L_0x0046;
                case 10: goto L_0x0246;
                case 11: goto L_0x0061;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r0 = "voip/VoipActivityV2/updateCallStatusBar/unknownCallState"
            X.C626936e.A0D(r6, r0)
            r1 = r4
        L_0x004c:
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0j
            if (r1 != 0) goto L_0x0051
            r1 = r4
        L_0x0051:
            r0.A04(r4, r1)
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0j
            X.5UY r1 = r0.A0K
            r0 = 8
            r1.A06(r0)
        L_0x005d:
            r10.A7j(r11)
        L_0x0060:
            return
        L_0x0061:
            boolean r7 = r11.isAudioChat()
            com.whatsapp.jid.GroupJid r3 = r11.groupJid
            X.3Ex r2 = r10.A1I
            X.2sD r1 = r10.A1j
            X.3Lq r0 = r10.A1e
            X.3ZH r0 = X.AnonymousClass36T.A01(r2, r0, r3, r1, r7)
            if (r0 == 0) goto L_0x0095
            X.3Ex r1 = r10.A1I
            com.whatsapp.jid.UserJid r0 = r11.getPeerJid()
            X.3ZH r3 = X.C64773Ex.A00(r1, r0)
            boolean r0 = r11.videoEnabled
            r2 = 2131889333(0x7f120cb5, float:1.9413327E38)
            if (r0 != 0) goto L_0x0087
            r2 = 2131889334(0x7f120cb6, float:1.9413329E38)
        L_0x0087:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.5ZU r0 = r10.A1M
            java.lang.String r0 = X.C18300x5.A0h(r0, r3)
            java.lang.String r9 = X.AnonymousClass002.A0F(r10, r0, r1, r6, r2)
            goto L_0x0251
        L_0x0095:
            boolean r1 = r11.isGroupCall
            boolean r0 = r11.videoEnabled
            if (r1 == 0) goto L_0x00a5
            r1 = 2131890051(0x7f120f83, float:1.9414783E38)
            if (r0 != 0) goto L_0x024d
            r1 = 2131890052(0x7f120f84, float:1.9414785E38)
            goto L_0x024d
        L_0x00a5:
            r1 = 2131895020(0x7f1222ec, float:1.9424861E38)
            if (r0 != 0) goto L_0x024d
            r1 = 2131895253(0x7f1223d5, float:1.9425334E38)
            goto L_0x024d
        L_0x00af:
            boolean r0 = r11.isInLonelyState()
            if (r0 != 0) goto L_0x0246
            boolean r0 = r11.videoEnabled
            if (r0 == 0) goto L_0x00f0
            android.widget.TextView r0 = r10.A0W
            X.C86634Kw.A1I(r0)
            android.view.View r1 = r10.A0L
            r0 = 8
            r1.setVisibility(r0)
            r10.A7j(r11)
            boolean r0 = r10.A26
            if (r0 != 0) goto L_0x0060
            long r3 = r10.A08
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0060
            long r3 = X.C18310x6.A0A(r3)
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            r10.A26 = r5
            return
        L_0x00e1:
            boolean r0 = r10.A2C
            if (r0 != 0) goto L_0x0060
            r0 = 2131895238(0x7f1223c6, float:1.9425303E38)
            java.lang.String r0 = r10.getString(r0)
            r10.A7s(r0)
            return
        L_0x00f0:
            boolean r0 = r11.isCallOnHold()
            if (r0 == 0) goto L_0x0135
            r0 = 2131895395(0x7f122463, float:1.9425622E38)
        L_0x00f9:
            java.lang.String r9 = r10.getString(r0)
        L_0x00fd:
            boolean r0 = r10.A26
            if (r0 != 0) goto L_0x0115
            long r5 = r10.A08
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0115
            long r7 = X.C18310x6.A0A(r5)
            r5 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            r10.A26 = r2
        L_0x0115:
            if (r9 != 0) goto L_0x0251
            X.33j r2 = r10.A00
            long r0 = r11.callDuration
            long r0 = X.C18290x4.A0B(r0)
            java.lang.String r4 = X.C107565bW.A0A(r2, r0)
            X.33j r2 = r10.A00
            long r0 = r11.callDuration
            java.lang.String r1 = X.C107565bW.A0B(r2, r0)
            goto L_0x004c
        L_0x012d:
            r0 = 2131895238(0x7f1223c6, float:1.9425303E38)
            java.lang.String r9 = r10.getString(r0)
            goto L_0x0115
        L_0x0135:
            boolean r0 = r11.isGroupCall
            if (r0 != 0) goto L_0x020f
            X.5Lb r7 = r11.getDefaultPeerInfo()
            X.C626936e.A06(r7)
            int r8 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A05(r7)
            if (r8 != 0) goto L_0x016c
            com.whatsapp.jid.UserJid r3 = r7.A08
            X.5ZU r1 = r10.A1M
            X.3Ex r0 = r10.A1I
            X.3ZH r0 = r0.A0A(r3)
            java.lang.String r3 = X.C18300x5.A0h(r1, r0)
            boolean r0 = r7.A0J
            if (r0 != 0) goto L_0x016c
            com.whatsapp.voipcalling.CallState r1 = r11.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x016c
            int r1 = r7.A06
            r6 = 3
            if (r1 != r6) goto L_0x01c9
            r0 = 2131895411(0x7f122473, float:1.9425654E38)
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r10, r3, r5, r0)
        L_0x016a:
            if (r9 != 0) goto L_0x00fd
        L_0x016c:
            r9 = 0
            if (r8 != 0) goto L_0x00fd
            com.whatsapp.jid.UserJid r3 = r7.A08
            X.5ZU r1 = r10.A1M
            X.3Ex r0 = r10.A1I
            X.3ZH r0 = r0.A0A(r3)
            java.lang.String r3 = X.C18300x5.A0h(r1, r0)
            boolean r0 = r11.videoEnabled
            if (r0 != 0) goto L_0x018e
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x00fd
        L_0x0185:
            r1 = 2131895397(0x7f122465, float:1.9425626E38)
        L_0x0188:
            java.lang.String r9 = X.AnonymousClass0x2.A0X(r10, r3, r5, r1)
            goto L_0x00fd
        L_0x018e:
            int r6 = r7.A06
            r0 = 6
            if (r6 != r0) goto L_0x01a2
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x019e
            boolean r0 = r11.isGroupCall
            r1 = 2131895398(0x7f122466, float:1.9425628E38)
            if (r0 == 0) goto L_0x0188
        L_0x019e:
            r1 = 2131895403(0x7f12246b, float:1.9425638E38)
            goto L_0x0188
        L_0x01a2:
            r1 = 2
            if (r6 != r1) goto L_0x01b4
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r11.isGroupCall
            r1 = 2131895399(0x7f122467, float:1.942563E38)
            if (r0 == 0) goto L_0x0188
        L_0x01b0:
            r1 = 2131895402(0x7f12246a, float:1.9425636E38)
            goto L_0x0188
        L_0x01b4:
            boolean r0 = r7.A0M
            if (r0 != 0) goto L_0x020a
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x020a
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x00fd
            java.util.Map r0 = r11.participants
            int r0 = X.AnonymousClass5AJ.A00(r0)
            if (r0 != r1) goto L_0x00fd
            goto L_0x0185
        L_0x01c9:
            boolean r0 = r11.isGroupCall
            if (r0 == 0) goto L_0x01e0
            int r3 = r7.A02
            r0 = 2
            if (r3 != r0) goto L_0x01da
            r0 = 2131887398(0x7f120526, float:1.9409402E38)
        L_0x01d5:
            java.lang.String r9 = r10.getString(r0)
            goto L_0x016a
        L_0x01da:
            if (r3 != r6) goto L_0x01e0
            r0 = 2131893262(0x7f121c0e, float:1.9421296E38)
            goto L_0x01d5
        L_0x01e0:
            X.5Lb r0 = r11.self
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x01ec
        L_0x01e8:
            r0 = 2131895395(0x7f122463, float:1.9425622E38)
            goto L_0x01d5
        L_0x01ec:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x01f8
            r0 = 2131895409(0x7f122471, float:1.942565E38)
            goto L_0x01d5
        L_0x01f8:
            boolean r0 = r11.videoEnabled
            if (r0 == 0) goto L_0x016c
            r0 = 6
            if (r1 == r0) goto L_0x016c
            boolean r0 = r7.A0O
            if (r0 != 0) goto L_0x016c
            r0 = 2
            if (r1 == r0) goto L_0x016c
            r0 = 2131895260(0x7f1223dc, float:1.9425348E38)
            goto L_0x01d5
        L_0x020a:
            r0 = 2131895022(0x7f1222ee, float:1.9424865E38)
            goto L_0x00f9
        L_0x020f:
            r9 = r4
            goto L_0x00fd
        L_0x0212:
            X.5b3 r0 = r10.A16
            if (r0 == 0) goto L_0x021a
            boolean r0 = r0.A1L
            if (r0 != 0) goto L_0x0226
        L_0x021a:
            r1 = 2131895255(0x7f1223d7, float:1.9425338E38)
            goto L_0x024d
        L_0x021e:
            X.5b3 r0 = r10.A16
            if (r0 == 0) goto L_0x023f
            boolean r0 = r0.A1L
            if (r0 == 0) goto L_0x023f
        L_0x0226:
            r7 = 2131892300(0x7f12184c, float:1.9419344E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.whatsapp.jid.UserJid r2 = X.C86644Kx.A0X(r11)
            X.5ZU r1 = r10.A1M
            X.3Ex r0 = r10.A1I
            X.3ZH r0 = r0.A0A(r2)
            X.C18300x5.A1E(r1, r0, r3, r6)
            java.lang.String r9 = r10.getString(r7, r3)
            goto L_0x0251
        L_0x023f:
            boolean r0 = r11.isJoinableGroupCall
            r1 = 2131895254(0x7f1223d6, float:1.9425336E38)
            if (r0 == 0) goto L_0x024d
        L_0x0246:
            r1 = 2131895368(0x7f122448, float:1.9425567E38)
            goto L_0x024d
        L_0x024a:
            r1 = 2131895260(0x7f1223dc, float:1.9425348E38)
        L_0x024d:
            java.lang.String r9 = r10.getString(r1)
        L_0x0251:
            r1 = r4
            r4 = r9
            goto L_0x004c
        L_0x0255:
            java.lang.String r0 = "voip/VoipActivityV2/updateCallStatusBar skipped"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7k(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r10.A2A != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7o(com.whatsapp.voipcalling.CallInfo r11) {
        /*
            r10 = this;
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Map r0 = r11.participants
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)
        L_0x000a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            X.5Lb r1 = X.C86664Kz.A13(r2)
            boolean r0 = r1.A0J
            if (r0 != 0) goto L_0x000a
            com.whatsapp.jid.UserJid r0 = r1.A08
            r8.add(r0)
            goto L_0x000a
        L_0x001e:
            boolean r0 = r10.A2A
            if (r0 == 0) goto L_0x011f
            r2 = 0
        L_0x0023:
            android.view.View r1 = r10.A0M
            r7 = 0
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x005a
            boolean r0 = r11.isGroupCall
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r11.isInLonelyState()
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r11.videoEnabled
            if (r0 != 0) goto L_0x00b4
            android.view.View r1 = r10.A0M
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0j
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00ac
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0j
            java.lang.String r0 = r0.getNameViewContentDescription()
            if (r0 == 0) goto L_0x00ac
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0j
            java.lang.String r0 = r0.getNameViewContentDescription()
        L_0x0057:
            X.C86654Ky.A1A(r1, r0, r4, r3)
        L_0x005a:
            X.1VX r3 = r10.A0D
            com.whatsapp.voipcalling.CallState r2 = r11.callState
            boolean r1 = r11.isGroupCall
            java.lang.String r0 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            boolean r0 = X.C627436k.A0M(r3, r2, r0, r1)
            r3 = 0
            if (r0 != 0) goto L_0x0071
            boolean r0 = r10.A23
            if (r0 == 0) goto L_0x007a
        L_0x0071:
            boolean r0 = r11.isGroupCallEnabled
            if (r0 == 0) goto L_0x007a
            boolean r0 = r10.A2A
            r2 = 1
            if (r0 == 0) goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            boolean r0 = r10.A81()
            if (r0 == 0) goto L_0x0094
            X.1VX r0 = r10.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x0094
            r2 = 0
        L_0x008a:
            android.view.ViewGroup r0 = r10.A0R
            if (r2 != 0) goto L_0x0090
            r3 = 8
        L_0x0090:
            r0.setVisibility(r3)
            return
        L_0x0094:
            X.2rx r0 = r10.A1L
            boolean r0 = X.AnonymousClass36T.A08(r0, r11)
            if (r0 == 0) goto L_0x008a
            X.1VX r0 = r10.A0D
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x008a
            X.4FS r1 = r10.A04
            r0 = 14
            X.C86624Kv.A1N(r1, r10, r11, r0)
            goto L_0x008a
        L_0x00ac:
            r0 = 2131896424(0x7f122868, float:1.9427709E38)
            java.lang.String r0 = r10.getString(r0)
            goto L_0x0057
        L_0x00b4:
            boolean r9 = r11.isAudioChat()
            com.whatsapp.jid.GroupJid r6 = r11.groupJid
            X.3Ex r5 = r10.A1I
            X.5ZU r2 = r10.A1M
            X.2sD r1 = r10.A1j
            X.3Lq r0 = r10.A1e
            X.3ZH r0 = X.AnonymousClass36T.A01(r5, r0, r6, r1, r9)
            if (r0 == 0) goto L_0x010d
            java.lang.String r2 = X.C18300x5.A0h(r2, r0)
            if (r2 == 0) goto L_0x010d
        L_0x00ce:
            android.view.View r5 = r10.A0M
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0j
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00fe
            if (r2 == 0) goto L_0x00fe
            boolean r1 = r11.videoEnabled
            r0 = 2131895289(0x7f1223f9, float:1.9425407E38)
            if (r1 == 0) goto L_0x00e4
            r0 = 2131895287(0x7f1223f7, float:1.9425403E38)
        L_0x00e4:
            java.lang.String r2 = X.AnonymousClass0x2.A0X(r10, r2, r3, r0)
        L_0x00e8:
            X.1VX r1 = r10.A0D
            r0 = 2541(0x9ed, float:3.56E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00f9
            r0 = 2131895285(0x7f1223f5, float:1.9425399E38)
            java.lang.String r4 = r10.getString(r0)
        L_0x00f9:
            X.C86654Ky.A1A(r5, r2, r4, r3)
            goto L_0x005a
        L_0x00fe:
            boolean r1 = r11.videoEnabled
            r0 = 2131895288(0x7f1223f8, float:1.9425405E38)
            if (r1 == 0) goto L_0x0108
            r0 = 2131895286(0x7f1223f6, float:1.94254E38)
        L_0x0108:
            java.lang.String r2 = r10.getString(r0)
            goto L_0x00e8
        L_0x010d:
            X.3Ex r2 = r10.A1I
            X.5ZU r1 = r10.A1M
            r0 = 3
            X.7Qw r0 = X.C107305b5.A04(r2, r1, r8, r0, r7)
            if (r0 != 0) goto L_0x011a
            r2 = 0
            goto L_0x00ce
        L_0x011a:
            java.lang.String r2 = X.C86634Kw.A0y(r10, r0)
            goto L_0x00ce
        L_0x011f:
            boolean r2 = r10.A88(r11)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7o(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c9, code lost:
        if (r6.A1t != null) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022d, code lost:
        if (r7.isEitherSideRequestingUpgrade() == false) goto L_0x022f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x024d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7p(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            boolean r0 = r6.isFinishing()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState finishing do not update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000b:
            return
        L_0x000c:
            if (r7 == 0) goto L_0x000b
            com.whatsapp.voipcalling.CallState r1 = r7.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x000b
            boolean r0 = r6.A2C
            r2 = 1
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
            android.content.Intent r0 = r6.getIntent()
            boolean r0 = X.C18280x3.A1V(r0, r1)
            if (r0 != 0) goto L_0x003a
            boolean r0 = r7.videoEnabled
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState leave PIP mode due to voice call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Wi r1 = r6.A05
            r0 = 2131895237(0x7f1223c5, float:1.9425301E38)
            r1.A0H(r0, r2)
            r6.finish()
            return
        L_0x003a:
            boolean r0 = r7.hasOutgoingParticipantInActiveOneToOneCall()
            if (r0 != 0) goto L_0x004c
            boolean r0 = r7.isInLonelyState()
            if (r0 == 0) goto L_0x0056
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0056
            if (r0 == r2) goto L_0x0056
        L_0x004c:
            boolean r0 = r6.A2K
            if (r0 != 0) goto L_0x0056
            boolean r0 = r7.videoEnabled
            if (r0 == 0) goto L_0x0056
            r6.A2K = r2
        L_0x0056:
            r6.A7X()
            r6.A7m(r7)
            r6.A7k(r7)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r6.A1t
            if (r2 == 0) goto L_0x00a3
            boolean r0 = r2.A16()
            if (r0 == 0) goto L_0x00a3
            boolean r1 = r7.videoEnabled
            boolean r0 = r2.A1e()
            if (r1 == r0) goto L_0x00a3
            r6.A7Q()
            X.6wh r0 = X.C142136wh.AV_SWITCH
            r6.A7B(r0)
            android.view.View r1 = r6.A0P
            r0 = 0
            r1.setTranslationY(r0)
            r6.A7S()
            boolean r0 = r7.videoEnabled
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r3 = r6.A0n
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = "voip/CallAvatarViewModel/onCallAvSwitchToVideoCall"
            java.lang.Object r1 = X.AnonymousClass4VK.A00(r3, r0)
            X.5AG r1 = (X.AnonymousClass5AG) r1
            boolean r0 = r1 instanceof X.C91104iv
            if (r0 == 0) goto L_0x00a3
            X.4iv r1 = (X.C91104iv) r1
            X.5AF r0 = r1.A00
            boolean r0 = r0 instanceof X.C91064ir
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = X.C86604Kt.A0k()
            X.AnonymousClass4VK.A01(r3, r0)
        L_0x00a3:
            com.whatsapp.voipcalling.CallState r3 = r7.callState
            android.view.ViewGroup r1 = r6.A0Q
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = "CallFailedScreenCoordinator hide"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x00b3:
            boolean r0 = r6.A2K
            r2 = 8
            if (r0 != 0) goto L_0x01b4
            X.6qS r0 = r6.A1q
            if (r0 == 0) goto L_0x00c0
            r0.setVisibility(r2)
        L_0x00c0:
            r6.A7o(r7)
            r6.Bri(r7)
            boolean r0 = r7.videoEnabled
            if (r0 != 0) goto L_0x0115
            com.whatsapp.WaImageView r0 = r6.A0f
            if (r0 == 0) goto L_0x0115
            X.1VX r1 = r6.A0D
            r0 = 1540(0x604, float:2.158E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x018a
            boolean r0 = r7.isGroupCall
            if (r0 == 0) goto L_0x018a
            com.whatsapp.jid.GroupJid r3 = r7.groupJid
            if (r3 == 0) goto L_0x018a
            com.whatsapp.WaImageView r0 = r6.A0f
            if (r0 == 0) goto L_0x0115
            boolean r0 = X.C86664Kz.A1U(r0, r3)
            if (r0 != 0) goto L_0x0115
            X.34u r0 = r6.A1i
            X.5QL r2 = r0.A08(r6, r3)
            java.lang.String r1 = r2.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1770733785: goto L_0x0174;
                case 175331287: goto L_0x0171;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            r0 = 2131234364(0x7f080e3c, float:1.8084892E38)
            android.graphics.drawable.Drawable r2 = X.C18310x6.A0G(r6, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131102670(0x7f060bce, float:1.7817784E38)
            android.graphics.drawable.Drawable r1 = X.C107335b8.A09(r1, r2, r0)
        L_0x010b:
            com.whatsapp.WaImageView r0 = r6.A0f
            r0.setImageDrawable(r1)
            com.whatsapp.WaImageView r0 = r6.A0f
            r0.setTag(r3)
        L_0x0115:
            X.8v3 r0 = r6.A10
            X.0Wx r0 = r0.B57()
            java.lang.Object r0 = r0.A07()
            X.7k5 r0 = (X.C158507k5) r0
            r6.A7i(r0)
            X.5Lb r0 = r7.self
            int r1 = r0.A06
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            boolean r0 = r7.videoEnabled
            if (r0 == 0) goto L_0x0158
            if (r1 != 0) goto L_0x0158
            boolean r0 = r7.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x0158
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r6.A0n
            X.107 r1 = r0.A0K
            java.lang.Object r0 = r1.A07()
            boolean r0 = r0 instanceof X.C91134iy
            if (r0 != 0) goto L_0x0155
            java.lang.Object r0 = r1.A07()
            boolean r0 = r0 instanceof X.C91094iu
            if (r0 != 0) goto L_0x0155
            java.lang.Object r0 = r1.A07()
            boolean r0 = r0 instanceof X.C91154j0
            if (r0 == 0) goto L_0x0158
        L_0x0155:
            r6.A7Z()
        L_0x0158:
            com.whatsapp.calling.CallDetailsLayout r0 = r6.A0j
            r0.A01(r7)
            com.whatsapp.voipcalling.CallState r1 = r7.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0167
            android.view.View$OnClickListener r0 = r6.A0E
            if (r0 != 0) goto L_0x000b
        L_0x0167:
            r1 = 32
            X.5ei r0 = new X.5ei
            r0.<init>(r6, r1, r7)
            r6.A0E = r0
            return
        L_0x0171:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x0176
        L_0x0174:
            java.lang.String r0 = "DOWNLOADED"
        L_0x0176:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f9
            X.34u r0 = r6.A1i
            android.graphics.drawable.Drawable r1 = r0.A04(r2)
            if (r1 == 0) goto L_0x00f9
            r0 = 25
            X.AnonymousClass366.A05(r6, r1, r0)
            goto L_0x010b
        L_0x018a:
            r1 = 2131234364(0x7f080e3c, float:1.8084892E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            com.whatsapp.WaImageView r0 = r6.A0f
            boolean r0 = X.C86664Kz.A1U(r0, r4)
            if (r0 != 0) goto L_0x0115
            com.whatsapp.WaImageView r3 = r6.A0f
            android.graphics.drawable.Drawable r2 = X.C18310x6.A0G(r6, r1)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131102670(0x7f060bce, float:1.7817784E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A09(r1, r2, r0)
            r3.setImageDrawable(r0)
            com.whatsapp.WaImageView r0 = r6.A0f
            r0.setTag(r4)
            goto L_0x0115
        L_0x01b4:
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r3)
            if (r0 == 0) goto L_0x01d0
            boolean r0 = r6.A23
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible RECEIVED_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r7.isGroupCall
            if (r0 == 0) goto L_0x01e6
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r6.A1t
            if (r0 == 0) goto L_0x01e6
        L_0x01cb:
            r6.A7T()
            goto L_0x00c0
        L_0x01d0:
            boolean r0 = r7.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x0257
            X.5Lb r0 = r7.self
            int r1 = r0.A06
            r0 = 3
            if (r1 == r0) goto L_0x0257
            boolean r0 = r6.A23
            if (r0 != 0) goto L_0x0257
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible kVideoStateUpgradeRequest"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01e6:
            java.lang.String r0 = "voip/VoipActivityV2/showAnswerCallView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6qS r2 = r6.A1q
            if (r2 != 0) goto L_0x0210
            r0 = 2131427721(0x7f0b0189, float:1.8477066E38)
            android.view.ViewStub r2 = X.C86664Kz.A0o(r6, r0)
            android.view.View r0 = r2.inflate()
            X.6qS r0 = (X.C138486qS) r0
            r6.A1q = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/showAnswerCallView found answerCallViewStub:"
            X.C18260x0.A1R(r1, r0, r2)
            X.6qS r2 = r6.A1q
            X.8KA r0 = new X.8KA
            r0.<init>(r6)
            r2.A01 = r0
        L_0x0210:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = r0.getAction()
            X.33i r0 = r6.A08
            boolean r0 = X.C107295b4.A09(r0)
            r2.A02(r7, r1, r0)
            com.whatsapp.calling.CallDetailsLayout r5 = r6.A0j
            boolean r0 = r7.videoEnabled
            r4 = 0
            if (r0 == 0) goto L_0x022f
            boolean r0 = r7.isEitherSideRequestingUpgrade()
            r3 = 0
            if (r0 != 0) goto L_0x0230
        L_0x022f:
            r3 = 1
        L_0x0230:
            com.whatsapp.components.button.ThumbnailButton r2 = r5.A08
            r1 = 8
            int r0 = X.C86614Ku.A09(r3)
            r2.setVisibility(r0)
            X.5YB r0 = r5.A07
            if (r3 == 0) goto L_0x0240
            r1 = 0
        L_0x0240:
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            r0.setVisibility(r1)
            r5.A00 = r4
            boolean r0 = r7.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x0252
            X.6wh r0 = X.C142136wh.INCOMING_CALL
            r6.A7B(r0)
        L_0x0252:
            r6.A7J()
            goto L_0x00c0
        L_0x0257:
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6qS r0 = r6.A1q
            if (r0 == 0) goto L_0x01cb
            r0.setVisibility(r2)
            goto L_0x01cb
        L_0x0265:
            java.lang.String r0 = "voip/CallAvatarViewModel/onCallAvSwitchToAudioCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.107 r2 = r3.A0K
            java.lang.Object r1 = X.C86634Kw.A0v(r2)
            X.5AG r1 = (X.AnonymousClass5AG) r1
            boolean r0 = r1 instanceof X.C91144iz
            if (r0 != 0) goto L_0x0285
            boolean r0 = r1 instanceof X.C91104iv
            if (r0 == 0) goto L_0x00a3
            r0 = r1
            X.4iv r0 = (X.C91104iv) r0
            X.5AF r0 = r0.A00
            boolean r0 = r0 instanceof X.C91074is
            if (r0 != 0) goto L_0x0285
            goto L_0x00a3
        L_0x0285:
            boolean r0 = r1 instanceof X.C91104iv
            if (r0 != 0) goto L_0x028f
            X.5ZG r1 = r3.A08
            r0 = 4
            r1.A02(r0)
        L_0x028f:
            X.4ir r1 = X.C91064ir.A00
            X.4iv r0 = new X.4iv
            r0.<init>(r1)
            r2.A0H(r0)
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7p(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r1.A08 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7w(boolean r5) {
        /*
            r4 = this;
            com.whatsapp.voipcalling.CallInfo r3 = r4.A7D()
            if (r3 == 0) goto L_0x0031
            X.5Xv r0 = r4.A0m
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "screen_sharing_backward_compat_shown"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0025
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r4.A0s
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x0025
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0025
            boolean r0 = r1.A08
            r2 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            boolean r0 = r4.A87(r3)
            if (r2 != 0) goto L_0x0032
            if (r0 != 0) goto L_0x0035
            r4.A7r(r3, r5)
        L_0x0031:
            return
        L_0x0032:
            r1 = 0
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            java.lang.String r0 = "voipactivityv2/onAddParticipantButtonClicked/ backward compat conditions should be exclusive"
            X.C626936e.A0D(r1, r0)
            X.80J r0 = new X.80J
            r0.<init>(r3, r4, r5)
            r4.A7h(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A7w(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0095, code lost:
        if (r9.getRepeatCount() == 0) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A83(int r8, android.view.KeyEvent r9) {
        /*
            r7 = this;
            com.whatsapp.voipcalling.CallInfo r6 = r7.A7D()
            X.5b3 r2 = r7.A16
            r5 = 0
            if (r2 == 0) goto L_0x003c
            if (r6 == 0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r3 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r4 = 1
            if (r3 != r0) goto L_0x003d
            r0 = 24
            if (r8 == r0) goto L_0x00b4
            r0 = 25
            if (r8 == r0) goto L_0x00b4
            r0 = 91
            if (r8 == r0) goto L_0x00b4
            r0 = 164(0xa4, float:2.3E-43)
            if (r8 == r0) goto L_0x00b4
            r0 = 5
            if (r8 == r0) goto L_0x00a9
            r0 = 126(0x7e, float:1.77E-43)
            if (r8 == r0) goto L_0x00a9
            r0 = 79
            if (r8 == r0) goto L_0x00a9
            r0 = 85
            if (r8 == r0) goto L_0x00a9
            r0 = 6
            if (r8 == r0) goto L_0x009e
            r0 = 86
            if (r8 == r0) goto L_0x009e
        L_0x003c:
            return r5
        L_0x003d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            java.lang.String r1 = "voip/VoipActivityV2/handleKeyActon end call from remote control"
            if (r3 != r0) goto L_0x005a
            r0 = 5
            if (r8 == r0) goto L_0x00ba
            r0 = 126(0x7e, float:1.77E-43)
            if (r8 == r0) goto L_0x00ba
            r0 = 79
            if (r8 == r0) goto L_0x00ba
            r0 = 85
            if (r8 == r0) goto L_0x00ba
            r0 = 6
            if (r8 == r0) goto L_0x0097
            r0 = 86
            if (r8 == r0) goto L_0x0097
            return r5
        L_0x005a:
            r0 = 6
            if (r8 == r0) goto L_0x0097
            r0 = 86
            if (r8 == r0) goto L_0x0097
            r0 = 79
            if (r8 == r0) goto L_0x0091
            r0 = 85
            if (r8 == r0) goto L_0x0091
            r0 = 24
            if (r8 == r0) goto L_0x00c5
            r0 = 25
            if (r8 == r0) goto L_0x00c6
            r0 = 131(0x83, float:1.84E-43)
            if (r8 != r0) goto L_0x0085
            java.lang.String r0 = "Should be used for automation only"
            X.C626936e.A0D(r5, r0)
            java.lang.String r0 = "VoipActivityV2/actionAutomationBringToFront Start"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r0 = "it can only be used in smoke or automation"
            X.C626936e.A0D(r5, r0)
            return r5
        L_0x0085:
            r0 = 4
            if (r8 != r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 != r0) goto L_0x003c
            r0 = 2
            r7.Bik(r0)
            return r5
        L_0x0091:
            int r0 = r9.getRepeatCount()
            if (r0 != 0) goto L_0x003c
        L_0x0097:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r7.A7M()
            return r4
        L_0x009e:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon reject call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 9
            r7.Bik(r0)
            return r4
        L_0x00a9:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon accept call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 8
            r7.A7a(r0)
            return r4
        L_0x00b4:
            X.5ZK r0 = r2.A27
            r0.A03()
            return r4
        L_0x00ba:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon start call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.intent.action.START_CALL"
            r7.A7q(r6, r0)
            return r4
        L_0x00c5:
            r5 = 1
        L_0x00c6:
            r1 = 0
            X.33i r0 = r2.A2W     // Catch:{ all -> 0x012f }
            android.media.AudioManager r0 = r0.A0G()     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0133
            int r4 = r0.getStreamMaxVolume(r1)     // Catch:{ all -> 0x012f }
            int r3 = r0.getStreamVolume(r1)     // Catch:{ all -> 0x012f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "voip/audio_route/adjustVoipStackAudioLevel direction "
            r1.append(r0)     // Catch:{ all -> 0x012f }
            if (r5 == 0) goto L_0x00e3
            goto L_0x00e6
        L_0x00e3:
            java.lang.String r0 = "DOWN"
            goto L_0x00e8
        L_0x00e6:
            java.lang.String r0 = " UP"
        L_0x00e8:
            r1.append(r0)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = ", volume "
            r1.append(r0)     // Catch:{ all -> 0x012f }
            r1.append(r3)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = ", max volume "
            X.C18260x0.A0y(r0, r1, r4)     // Catch:{ all -> 0x012f }
            if (r5 == 0) goto L_0x0119
            if (r3 != r4) goto L_0x0133
            short r1 = r2.A14     // Catch:{ all -> 0x012f }
            int r0 = r2.A07     // Catch:{ all -> 0x012f }
            int r0 = r0 + 192
            if (r1 < r0) goto L_0x010a
            java.lang.String r0 = "voip/audio_route/adjustVoipStackAudioLevel no-op, auido level is 192"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x010a:
            int r0 = r1 + 32
            short r0 = (short) r0     // Catch:{ all -> 0x012f }
            r2.A14 = r0     // Catch:{ all -> 0x012f }
            r0 = 35
            X.5sL r0 = X.C117695sL.A00(r2, r0)     // Catch:{ all -> 0x012f }
            X.C86644Kx.A1G(r0, r2)     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x0119:
            short r1 = r2.A14     // Catch:{ all -> 0x012f }
            int r0 = r2.A07     // Catch:{ all -> 0x012f }
            if (r1 <= r0) goto L_0x0133
            int r0 = r1 + -32
            short r0 = (short) r0     // Catch:{ all -> 0x012f }
            r2.A14 = r0     // Catch:{ all -> 0x012f }
            r0 = 35
            X.5sL r0 = X.C117695sL.A00(r2, r0)     // Catch:{ all -> 0x012f }
            X.C86644Kx.A1G(r0, r2)     // Catch:{ all -> 0x012f }
            r0 = 1
            return r0
        L_0x012f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A83(int, android.view.KeyEvent):boolean");
    }

    public final boolean A84(UserJid userJid) {
        Object obj;
        CallInfo A7D = A7D();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/VoipActivityV2/shouldShowBatteryLowNotif: batteryState: voiceService: ");
        A0o2.append(this.A16);
        A0o2.append(" callInfo: ");
        A0o2.append(A7D);
        A0o2.append(" callState = ");
        Object obj2 = "";
        if (A7D != null) {
            obj = A7D.callState;
        } else {
            obj = obj2;
        }
        A0o2.append(obj);
        A0o2.append(" isGroupCall = ");
        if (A7D != null) {
            obj2 = Boolean.valueOf(A7D.isGroupCall);
        }
        A0o2.append(obj2);
        C18260x0.A1P(A0o2, " jid: ", userJid);
        if (this.A16 == null || A7D == null || A7D.callState != CallState.ACTIVE || A7D.isGroupCall || !this.A2D) {
            return false;
        }
        if (userJid == null || A7D.participants.containsKey(userJid)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r2 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A85(com.whatsapp.jid.UserJid r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.A7L()
            X.5ZR r0 = r5.A1X
            boolean r0 = r0.A0D()
            r4 = 1
            if (r0 == 0) goto L_0x000d
            r4 = 0
        L_0x000d:
            X.5ZR r0 = r5.A1X
            boolean r2 = X.C107305b5.A08(r0, r8)
            X.5ZR r0 = r5.A1X
            boolean r1 = r0.A0G()
            if (r2 != 0) goto L_0x0021
            if (r4 != 0) goto L_0x0021
            if (r1 != 0) goto L_0x0021
            r0 = 1
            return r0
        L_0x0021:
            r0 = -1
            r3 = 0
            if (r7 != r0) goto L_0x002b
            if (r4 != 0) goto L_0x002a
            r7 = 3
            if (r2 == 0) goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            com.whatsapp.calling.views.PermissionDialogFragment r2 = com.whatsapp.calling.views.PermissionDialogFragment.A00(r6, r7, r4, r2, r1)
            X.0dc r1 = X.AnonymousClass0x2.A0J(r5)
            java.lang.String r0 = "permission_request"
            r1.A0C(r2, r0)
            r1.A04()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A85(com.whatsapp.jid.UserJid, int, boolean):boolean");
    }

    public void BY2(int i) {
        C107285b3 r2;
        String str;
        A7L();
        if (this.A16 != null) {
            int intExtra = getIntent().getIntExtra("call_ui_action", 0);
            if (i == 0) {
                r2 = this.A16;
                str = this.A1y;
            } else if (i == 1) {
                return;
            } else {
                if (i == 2) {
                    this.A16.A13.execute(new AnonymousClass8M9(0, 3));
                    return;
                } else if (i != 3) {
                    C626936e.A0D(false, "Unknown request code");
                    return;
                } else {
                    r2 = this.A16;
                    str = this.A1y;
                    r2.A1H = true;
                }
            }
            r2.A0m(str, (String) null, intExtra);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BY3(java.lang.String[] r9, int r10) {
        /*
            r8 = this;
            r8.A7L()
            com.whatsapp.voipcalling.CallInfo r5 = r8.A7D()
            boolean r0 = X.C627436k.A0O(r5)
            if (r0 == 0) goto L_0x003c
            X.5b3 r0 = r8.A16
            if (r0 == 0) goto L_0x003c
            int r6 = r9.length
            r4 = 0
            r2 = 0
        L_0x0014:
            r3 = 1
            if (r2 >= r6) goto L_0x00aa
            r1 = r9[r2]
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a6
            r2 = 1
        L_0x0022:
            boolean r0 = X.C107385bE.A0B()
            if (r0 == 0) goto L_0x0074
            if (r10 == 0) goto L_0x006d
            if (r10 == r3) goto L_0x006d
            r0 = 2
            if (r10 == r0) goto L_0x006d
        L_0x002f:
            if (r10 == r3) goto L_0x00df
            r0 = 2
            if (r10 == r0) goto L_0x00ba
            r0 = 3
            if (r10 == r0) goto L_0x003d
            java.lang.String r0 = "Unknown request code"
            X.C626936e.A0D(r4, r0)
        L_0x003c:
            return
        L_0x003d:
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "voip/VoipActivityV2/onPermissionsGranted phone permission granted"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5b3 r7 = r8.A16
            java.lang.String r6 = r8.A1y
            boolean r0 = r7.A0u(r6)
            if (r0 != 0) goto L_0x00b6
            android.telephony.TelephonyManager r5 = r7.A1X
            X.5ZR r0 = r7.A2a
            int r2 = X.AnonymousClass36T.A00(r5, r0)
            if (r2 == 0) goto L_0x00ad
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/acceptCall/cellularCallInProgress "
            X.C18260x0.A0z(r0, r1, r2)
            java.lang.String r0 = "busy"
            r7.A0m(r6, r0, r3)
            return
        L_0x006d:
            X.5jr r1 = r8.A17
            java.lang.String r0 = "refresh_notification"
            X.C106645Zu.A00(r1, r0)
        L_0x0074:
            if (r10 != 0) goto L_0x002f
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x0084
            if (r2 == 0) goto L_0x0084
            com.whatsapp.voipcalling.Voip.refreshVideoDevice()
            X.5qe r0 = r8.A1C
            r0.A02()
        L_0x0084:
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r0)
            if (r0 == 0) goto L_0x003c
            com.whatsapp.jid.UserJid r2 = X.C86644Kx.A0X(r5)
            boolean r1 = r5.videoEnabled
            r0 = -1
            boolean r0 = r8.A85(r2, r0, r1)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "voip/VoipActivityV2/onPermissionsGranted starting call"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5b3 r1 = r8.A16
            java.lang.String r0 = r8.A1y
            r1.A0Q(r3, r0, r4)
            return
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x00aa:
            r2 = 0
            goto L_0x0022
        L_0x00ad:
            if (r5 == 0) goto L_0x00b6
            android.telephony.PhoneStateListener r1 = r7.A0N
            r0 = 32
            r5.listen(r1, r0)
        L_0x00b6:
            r7.A0Q(r3, r6, r4)
            return
        L_0x00ba:
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "voip/VoipActivityV2/onRequestPermissionsResult granted, accept video upgrade"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.voipcalling.Voip.refreshVideoDevice()
            X.5qe r0 = r8.A1C
            r0.A02()
            X.5b3 r0 = r8.A16
            X.C106155Xv.A02(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A13
            r0 = 7
            X.C86624Kv.A1S(r1, r0)
            return
        L_0x00d9:
            java.lang.String r0 = "voip/VoipActivityV2/onRequestPermissionsResult granted, but the upgrade request was already cancelled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x00df:
            java.lang.String r0 = "voip/VoipActivityV2/onPermissionsGranted switching to video call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5b3 r0 = r8.A16
            r0.A0H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.BY3(java.lang.String[], int):void");
    }

    public void BZ7(boolean z) {
        C626936e.A01();
        Window window = getWindow();
        View childAt = C86644Kx.A0J(window.getDecorView(), 16908290).getChildAt(0);
        if (childAt == null) {
            Log.w("voip/voipactivity/ear-near - failed to get view.");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            Log.i("voip/voipactivity/ear-near. changing visibility of the window.");
            if (childAt.getVisibility() == 0) {
                attributes.flags |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                attributes.screenBrightness = 0.1f;
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                childAt.setVisibility(4);
                window.setAttributes(attributes);
            }
            this.A0D.removeMessages(2);
            this.A0D.sendEmptyMessageDelayed(2, 3000);
            return;
        }
        Log.i("voip/voipactivity/ear-far. changing visibility of the window.");
        if (childAt.getVisibility() == 4) {
            attributes.flags &= -1025;
            attributes.screenBrightness = -1.0f;
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
            childAt.setVisibility(0);
            window.setAttributes(attributes);
        }
        this.A0D.removeMessages(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (X.C86604Kt.A1Z(r0.A0F) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bra(com.whatsapp.voipcalling.CallInfo r9, int r10, boolean r11) {
        /*
            r8 = this;
            X.C626936e.A01()
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r8.A1t
            if (r0 == 0) goto L_0x0032
            com.whatsapp.calling.views.VoipCallFooter r1 = r0.A0V
            if (r1 == 0) goto L_0x0032
            X.5b3 r0 = r8.A16
            if (r0 == 0) goto L_0x0033
            java.lang.String r3 = r0.A11
        L_0x0011:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r8.A0n
            boolean r6 = r0.A0J()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r8.A15
            if (r0 == 0) goto L_0x0024
            X.107 r0 = r0.A0F
            boolean r0 = X.C86604Kt.A1Z(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            r2 = r9
            r4 = r10
            r5 = r11
            r1.A03(r2, r3, r4, r5, r6, r7)
            X.5XJ r0 = r8.A18
            if (r0 == 0) goto L_0x0032
            r0.A01(r9)
        L_0x0032:
            return
        L_0x0033:
            r3 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.Bra(com.whatsapp.voipcalling.CallInfo, int, boolean):void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CallGridViewModel callGridViewModel = this.A0s;
        if (callGridViewModel == null) {
            return;
        }
        if (C86614Ku.A1a(callGridViewModel.A13) || C86614Ku.A1a(callGridViewModel.A15)) {
            boolean A1U2 = AnonymousClass000.A1U(configuration.orientation, 2);
            AnonymousClass107 r1 = callGridViewModel.A0m;
            if (C86604Kt.A1Z(r1) != A1U2) {
                C18320x8.A18(r1, A1U2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CallGrid callGrid = this.A0p;
        if (callGrid != null) {
            this.A06.A01(callGrid.A0b);
        }
        Handler handler = this.A0D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        CallDetailsLayout callDetailsLayout = this.A0j;
        if (callDetailsLayout != null) {
            callDetailsLayout.A0D.A00();
        }
        C56602sG r1 = this.A1J;
        if (r1 != null) {
            this.A1K.A07(r1);
        }
        C107285b3 r2 = this.A16;
        if (r2 != null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "voip/service/resetVoipUiIfEquals ", r2);
            if (r2.A0X == this) {
                r2.A0X = null;
            }
        }
        A7v(false);
        Set<VideoPort> set = this.A1B.A02;
        for (VideoPort videoPort : set) {
            if (videoPort != null) {
                videoPort.release();
            }
        }
        set.clear();
        A7Q();
        VoipInCallNotifBanner voipInCallNotifBanner = this.A0r;
        if (voipInCallNotifBanner != null) {
            voipInCallNotifBanner.A01();
            this.A0r.A0M.A00();
        }
        this.A1r.A07(this.A2Q);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C18260x0.A1R(AnonymousClass001.A0o(), "voip/VoipActivityV2/onKeyDown ", keyEvent);
        boolean A83 = A83(i, keyEvent);
        this.A2H = true;
        if (A83 || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/VoipActivityV2/onKeyUp ");
        A0o2.append(keyEvent);
        A0o2.append(", keyDownPressed: ");
        C18260x0.A1V(A0o2, this.A2H);
        if (this.A2H) {
            this.A2H = false;
            return super.onKeyUp(i, keyEvent);
        } else if (A83(i, keyEvent) || super.onKeyUp(i, keyEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void onNewIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/VoipActivityV2/onNewIntent ");
        A0o2.append(intent);
        A0o2.append(", action ");
        A0o2.append(action);
        A0o2.append(", is finishing ");
        C18260x0.A1V(A0o2, isFinishing());
        super.onNewIntent(intent);
        setIntent(intent);
        this.A28 = false;
        this.A22 = false;
        this.A1y = intent.getStringExtra("call_id");
        CallInfo A7D = A7D();
        if (A7D != null) {
            String str2 = this.A1y;
            if (str2 == null) {
                str2 = A7D.callId;
                this.A1y = str2;
            }
            CallGridViewModel callGridViewModel = this.A0s;
            if (callGridViewModel != null) {
                callGridViewModel.A0R.A0G(str2);
            }
            if (this.A16 == null) {
                C18290x4.A1C(this.A17.A00, this, 4);
            }
            ViewGroup viewGroup = this.A0Q;
            boolean z = false;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                z = true;
            }
            if (z) {
                this.A0D.removeMessages(9);
                if (A7D.videoEnabled) {
                    this.A1C.A02();
                }
            }
            A7n(A7D);
            if ("com.whatsapp.intent.action.ACCEPT_CALL".equals(action)) {
                A7e(intent, A7D);
            } else if ("com.whatsapp.intent.action.START_CALL".equals(action)) {
                A7q(A7D, action);
            } else if ("com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN".equals(action) || "join_call".equals(action)) {
                this.A13.A00(A7D.callId);
                this.A23 = false;
                this.A2K = true;
                if (this.A1P != null) {
                    A7K();
                }
                A7Q();
                A7S();
                ScreenShareViewModel screenShareViewModel = this.A15;
                if (screenShareViewModel != null && C86604Kt.A1Z(screenShareViewModel.A0F)) {
                    this.A15.A0M(AnonymousClass58J.PENDING_CALL_SCREEN);
                }
                A7p(A7D);
                C106645Zu.A00(this.A17, "refresh_notification");
            } else if ("com.whatsapp.intent.action.SHOW_END_CALL_CONFIRMATION".equals(action)) {
                String stringExtra = intent.getStringExtra("confirmationString");
                if (this.A0b == null && this.A1G.A01()) {
                    Log.w("voip/VoipActivityV2/showEndCallConfirmationDialog.");
                    EndCallConfirmationDialogFragment endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment();
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putString("message", stringExtra);
                    endCallConfirmationDialogFragment.A0u(A082);
                    this.A0b = endCallConfirmationDialogFragment;
                    A7A(endCallConfirmationDialogFragment, "EndCallConfirmationDialogFragment");
                }
            } else {
                int i = 2;
                if ("com.whatsapp.intent.action.END_CALL_AFTER_CONFIRMATION".equals(action)) {
                    C107285b3 r1 = this.A16;
                    if (r1 != null) {
                        r1.A0e((CallInfo) null, (String) null, 2);
                    }
                } else if ("com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL".equals(action)) {
                    A7f(intent, A7D);
                } else if ("ACTION_AUTOMATION_BRING_TO_FRONT".equals(action)) {
                    Log.d("VoipActivityV2/actionAutomationBringToFront Start");
                    C626936e.A0D(false, "it can only be used in smoke or automation");
                } else if ("com.whatsapp.intent.action.CALL_BACK".equals(action) && this.A1G.A01()) {
                    this.A05.A0H(R.string.f11nameremoved, 1);
                } else if ("com.whatsapp.intent.action.REJECT_CALL_FROM_VOIP_UI".equals(action)) {
                    if (A7D.callState == CallState.PRECALLING) {
                        A7M();
                    }
                    if (A7D.isCallLinkLobbyOrJoiningState()) {
                        C107285b3 r12 = this.A16;
                        if (r12 != null) {
                            String str3 = A7D.callId;
                            Log.i("voip/call/reject");
                            r12.A13.execute(new C172598Ly(str3));
                        }
                        finish();
                    } else {
                        if (intent.getBooleanExtra("pendingCall", false)) {
                            i = 7;
                        }
                        Bik(i);
                    }
                } else if ("com.whatsapp.intent.action.JOIN_CALL_LINK".equals(action)) {
                    C107285b3 r13 = this.A16;
                    if (r13 != null) {
                        Log.i("voip/call/join call link");
                        if (!r13.A2N.A0F()) {
                            r13.A1d.A0F(R.string.f11nameremoved, 0);
                        } else {
                            C86624Kv.A1S(r13.A13, 8);
                        }
                    }
                } else {
                    if (isFinishing()) {
                        str = "voip/VoipActivityV2/new-intent activity is finishing, do nothing";
                    } else if (C627436k.A0O(A7D)) {
                        str = "voip/VoipActivityV2/new-intent the WhatsApp call is active, do nothing";
                    } else {
                        if (this.A00 != 3) {
                            A7c(3);
                        }
                        A7p(A7D);
                        if (intent.getBooleanExtra("newCall", false)) {
                            Log.i("voip/VoipActivityV2/onNewIntent/NewCall clearing states");
                            this.A23 = intent.getBooleanExtra("callAccepted", false);
                            this.A0D.removeMessages(9);
                            A7H();
                        }
                    }
                    Log.e(str);
                    return;
                }
            }
            this.A1W.A05(7, "VoipActivity1");
        }
    }

    public void onPause() {
        super.onPause();
        this.A2D = false;
        this.A25 = false;
        if (this.A00 == 0) {
            A7N();
        }
        AppSettingsWarningDialogFragment appSettingsWarningDialogFragment = this.A1D;
        if (appSettingsWarningDialogFragment != null && (!appSettingsWarningDialogFragment.A16() || appSettingsWarningDialogFragment.A00 == 1)) {
            A7C("AppSettingsWarningDialogFragment");
            this.A1D = null;
        }
        A7B(C142136wh.ACTIVITY_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        C626936e.A07(this.A09, "PiP params builder is null");
        boolean z2 = false;
        int i = 1;
        if (z) {
            this.A2C = true;
            CallGridViewModel callGridViewModel = this.A0s;
            AnonymousClass08M r1 = callGridViewModel.A0H;
            if (r1.A07() != null) {
                callGridViewModel.A0U((UserJid) r1.A07());
            }
            A7N();
            A7B(C142136wh.PICTURE_IN_PICTURE);
            C107285b3 r2 = this.A16;
            if (r2 != null) {
                Log.i("VoiceService:onEnterPictureInPicture");
                r2.A0A = System.currentTimeMillis();
            }
            if (this.A2E && getIntent().getBooleanExtra("isTaskRoot", true)) {
                startActivity(C627736r.A02(this));
            }
        } else {
            this.A2C = false;
            A7U();
            C107285b3 r0 = this.A16;
            if (r0 != null) {
                r0.A0F();
            }
            this.A2E = false;
            i = 2;
        }
        A7c(i);
        AnonymousClass1VX r02 = this.A0D;
        CallInfo A7D = A7D();
        if (C86664Kz.A0J(r02) >= 4 && A7D != null && A7D.videoEnabled && A7D.self.A0K) {
            C149827Ob r12 = this.A12;
            if (((DisplayManager) getSystemService("display")).getDisplay(0).getRotation() == 0) {
                z2 = true;
            }
            if (!z || z2) {
                r12.A05.A00();
            } else {
                C104965Ta r13 = r12.A05;
                if (!r13.A02) {
                    r13.A02();
                }
            }
        }
        CallInfo A7D2 = A7D();
        if (A7D2 != null && A7D2.videoEnabled) {
            A7W();
            C103775Oj r14 = this.A0q;
            r14.A01 = 0.0f;
            r14.A00();
            Voip.processPipModeChange(z);
        }
    }

    public void onStart() {
        super.onStart();
        View view = this.A0N;
        if (view != null) {
            this.A2G = true;
            C86644Kx.A12(view, this);
            C107285b3 r0 = this.A16;
            if (r0 != null) {
                r0.A1P = false;
            }
            this.A10.Bc7(this.A0J);
            CallInfo A7D = A7D();
            if (A7D != null && A7D.callState != CallState.NONE) {
                if (A7D.isPeerRequestingUpgrade()) {
                    this.A23 = false;
                }
                A7n(A7D);
                A7p(A7D);
                AnonymousClass4VK.A03(this.A0s);
                if (this.A27 || ("join_call".equals(getIntent().getAction()) && Voip.A09(A7D.callState))) {
                    C106645Zu.A00(this.A17, "refresh_notification");
                    this.A27 = false;
                }
                if (A7D.videoEnabled) {
                    if (!"com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN".equals(getIntent().getAction()) && A7D.self.A06 != 6) {
                        this.A24 = false;
                        A7Z();
                    }
                    C107285b3 r2 = this.A16;
                    if (r2 != null && this.A2C) {
                        Log.i("VoiceService:onEnterPictureInPicture");
                        r2.A0A = System.currentTimeMillis();
                    }
                }
                Log.i("voip/VoipActivityV2/bindService");
                C18290x4.A1C(this.A17.A00, this, 4);
            } else if (getIntent().hasExtra("showCallFailedMessage")) {
                A7I();
            } else {
                finish();
                Log.e("voip/VoipActivityV2/onStart call_not_active, finishing");
            }
        }
    }

    public void onStop() {
        CallState callState;
        super.onStop();
        boolean A1a2 = C86644Kx.A1a(this.A0x);
        this.A10.Bcl();
        if (!getIntent().getBooleanExtra("joinable", false)) {
            A7v(false);
            this.A2G = false;
            View view = this.A0N;
            if (view != null) {
                C86604Kt.A1G(view, this);
            }
            Handler handler = this.A0D;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            CallInfo A7D = A7D();
            if (!(A7D == null || (callState = A7D.callState) == CallState.NONE)) {
                if (callState == CallState.RECEIVED_CALL && !this.A0A.A09() && !this.A23) {
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putInt("notification_type", A1a2 ? 1 : 0);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("voip/VoipActivityV2/onStop post ");
                    C18260x0.A1L(A0o2, "NOTIFICATION_HEADS_UP");
                    this.A17.A00(new C106645Zu("refresh_notification", A082));
                    this.A27 = A1a2;
                }
                C107285b3 r1 = this.A16;
                if (r1 != null && this.A2C) {
                    r1.A0F();
                }
                if (A7D.videoEnabled) {
                    this.A24 = A1a2;
                    A7Z();
                }
                if (this.A16 != null && !this.A0e.A00) {
                    Log.i("voip/VoipActivityV2/onStop. App is put to background, mark to show VoipActivity again when foregrounded.");
                    this.A16.A1P = A1a2;
                }
            }
            A7V();
        }
    }

    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        try {
            super.setPictureInPictureParams(pictureInPictureParams);
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.e("voip/VoipActivityV2/setPictureInPictureParams", e);
        }
    }

    public void videoRenderStarted(UserJid userJid) {
        C18260x0.A1R(C86654Ky.A0o(), "voip/VoipActivityV2/videoRenderStarted ", userJid);
        CallInfo A7D = A7D();
        if (A7D != null && (!A7D.isGroupCall || !this.A0D.A0X(2269))) {
            A7p(A7D);
        }
        A7R();
    }

    public VoipActivityV2() {
        this(0);
        this.A2N = false;
        this.A1f = null;
        this.A0Z = Bid(new C107595bZ(this, 9), new C003403v());
        this.A2O = new C109405eZ(this, 5);
        this.A2Q = new AnonymousClass91D(this, 2);
        this.A2K = true;
        this.A00 = 3;
        this.A2P = new C170918Fa(this);
        this.A1J = null;
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A1P;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1X();
        return true;
    }
}
