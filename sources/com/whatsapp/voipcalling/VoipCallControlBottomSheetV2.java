package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0KN;
import X.AnonymousClass0R6;
import X.AnonymousClass0UY;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YI;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass33T;
import X.AnonymousClass36T;
import X.AnonymousClass49P;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4WF;
import X.AnonymousClass5U0;
import X.AnonymousClass5UY;
import X.AnonymousClass5XJ;
import X.AnonymousClass5Yj;
import X.AnonymousClass6BC;
import X.AnonymousClass93U;
import X.C003203q;
import X.C06560Yg;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C103325Ml;
import X.C103775Oj;
import X.C105315Uk;
import X.C107295b4;
import X.C107385bE;
import X.C109695f2;
import X.C147487Em;
import X.C158527k7;
import X.C15940sD;
import X.C170968Ff;
import X.C179808jk;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C18330xA;
import X.C186288v3;
import X.C187958y5;
import X.C47702dg;
import X.C56422rx;
import X.C620433g;
import X.C620633i;
import X.C626936e;
import X.C627436k;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel;
import com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.views.DialpadButton;
import com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator;
import com.whatsapp.calling.views.VoipCallFooter;
import com.whatsapp.util.Log;

public class VoipCallControlBottomSheetV2 extends Hilt_VoipCallControlBottomSheetV2 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public FrameLayout A0C;
    public Space A0D;
    public TextView A0E;
    public NestedScrollView A0F;
    public RecyclerView A0G;
    public MaterialButton A0H;
    public MaterialButton A0I;
    public C69263Wi A0J;
    public C620433g A0K;
    public AnonymousClass49P A0L;
    public CallScreenViewModel A0M;
    public C105315Uk A0N;
    public AnonymousClass4WF A0O;
    public BottomSheetViewModel A0P;
    public CallControlButtonsViewModel A0Q;
    public ParticipantsListViewModel A0R;
    public C186288v3 A0S;
    public AnonymousClass5U0 A0T;
    public VoipCallControlBottomSheetDragIndicator A0U;
    public VoipCallFooter A0V;
    public C56422rx A0W;
    public C620633i A0X;
    public AnonymousClass33T A0Y;
    public AnonymousClass1VX A0Z;
    public C187958y5 A0a;
    public AnonymousClass5UY A0b;
    public AnonymousClass5UY A0c;
    public AnonymousClass5UY A0d;
    public AnonymousClass5UY A0e;
    public AnonymousClass4FS A0f;
    public C103325Ml A0g;
    public StringBuilder A0h = C18330xA.A0A("");
    public boolean A0i;
    public DialpadButton[] A0j;
    public final int[] A0k = {R.id.zero, R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine, R.id.star, R.id.pound};

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r5 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(android.content.DialogInterface r12, com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r13) {
        /*
            r11 = r13
            X.5Ml r0 = r13.A0g
            if (r0 == 0) goto L_0x0024
            com.whatsapp.voipcalling.VoipActivityV2 r5 = r0.A00
            com.whatsapp.voipcalling.CallInfo r4 = r5.A7D()
            if (r4 == 0) goto L_0x0024
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0024
            com.whatsapp.jid.UserJid r3 = X.C86644Kx.A0X(r4)
            boolean r2 = r4.videoEnabled
            boolean r1 = r4.isPeerRequestingUpgrade()
            r0 = -1
            if (r1 == 0) goto L_0x0021
            r0 = 2
        L_0x0021:
            r5.A85(r3, r0, r2)
        L_0x0024:
            android.view.View r0 = r13.A0B
            X.C626936e.A04(r0)
            r2 = 0
            r0.setVisibility(r2)
            android.app.Dialog r12 = (android.app.Dialog) r12
            r0 = 2131429423(0x7f0b082f, float:1.8480518E38)
            android.view.View r4 = X.AnonymousClass0HG.A00(r12, r0)
            r13.A08 = r4
            X.1VX r7 = r13.A0Z
            android.view.View r5 = r13.A0A
            X.5UY r9 = r13.A0e
            android.widget.TextView r6 = r13.A0E
            X.5UY r10 = r13.A0b
            X.8y5 r8 = r13.A0a
            X.5Uk r3 = new X.5Uk
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A0N = r3
            com.whatsapp.voipcalling.CallInfo r3 = r13.A1T()
            android.os.Bundle r1 = r13.A06
            if (r1 == 0) goto L_0x0170
            java.lang.String r0 = "is_incoming_capi_call"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0170
            X.1VX r0 = r13.A0Z
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "Disable dragging for bottom sheet for incoming call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Uk r0 = r13.A0N
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0I
            r0.A0b(r2)
        L_0x006f:
            X.8v3 r1 = r13.A0S
            android.view.View r0 = r13.A08
            r1.Blr(r0)
            X.8v3 r0 = r13.A0S
            X.0Wx r4 = r0.B56()
            r1 = 2
            X.5CT r0 = new X.5CT
            r0.<init>(r13, r1)
            r4.A0B(r13, r0)
            android.view.View r0 = r13.A08
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            X.8v3 r1 = r13.A0S
            java.util.Objects.requireNonNull(r1)
            r0 = 19
            X.C86614Ku.A1J(r4, r1, r0)
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r0 = r13.A0R
            X.08M r1 = r0.A01
            r0 = 370(0x172, float:5.18E-43)
            X.C86604Kt.A1M(r13, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r13.A0P
            X.08M r1 = r0.A06
            r0 = 371(0x173, float:5.2E-43)
            X.C86604Kt.A1M(r13, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r13.A0P
            X.107 r4 = r0.A0A
            r1 = 3
            X.5CT r0 = new X.5CT
            r0.<init>(r13, r1)
            r4.A0B(r13, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r13.A0P
            X.107 r1 = r0.A0B
            r0 = 388(0x184, float:5.44E-43)
            X.AnonymousClass6C6.A01(r13, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r13.A0P
            X.08M r1 = r0.A03
            r0 = 389(0x185, float:5.45E-43)
            X.AnonymousClass6C6.A01(r13, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r13.A0P
            X.107 r1 = r0.A09
            r0 = 390(0x186, float:5.47E-43)
            X.AnonymousClass6C6.A01(r13, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r13.A0P
            X.08M r1 = r0.A05
            r0 = 368(0x170, float:5.16E-43)
            X.C86604Kt.A1M(r13, r1, r0)
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r13.A0P
            X.08M r4 = r0.A04
            X.5Uk r1 = r13.A0N
            java.util.Objects.requireNonNull(r1)
            r0 = 369(0x171, float:5.17E-43)
            X.C86604Kt.A1N(r13, r4, r1, r0)
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r0 = r13.A0Q
            X.08M r1 = r0.A01
            X.5CT r0 = new X.5CT
            r0.<init>(r13, r2)
            r1.A0B(r13, r0)
            r4 = 1
            if (r3 == 0) goto L_0x016e
            android.os.Bundle r1 = r13.A06
            if (r1 == 0) goto L_0x0165
            java.lang.String r0 = "is_incoming_capi_call"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0165
        L_0x0101:
            X.1VX r0 = r13.A0Z
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x016e
        L_0x0109:
            com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel r0 = r13.A0M
            if (r0 == 0) goto L_0x0119
            if (r2 == 0) goto L_0x0119
            X.107 r1 = r0.A06
            X.5CT r0 = new X.5CT
            r0.<init>(r13, r4)
            r1.A0B(r13, r0)
        L_0x0119:
            r0 = 2131434389(0x7f0b1b95, float:1.849059E38)
            android.view.View r1 = X.AnonymousClass0HG.A00(r12, r0)
            X.5fJ r0 = new X.5fJ
            r0.<init>(r13)
            r1.setOnTouchListener(r0)
            android.view.View r0 = r13.A08
            if (r0 == 0) goto L_0x0152
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0152
            android.view.View r2 = r13.A08
            android.content.res.Resources r1 = X.C18290x4.A0G(r2)
            r0 = 2131165528(0x7f070158, float:1.7945276E38)
            float r0 = r1.getDimension(r0)
            r2.setElevation(r0)
            android.view.View r0 = r13.A08
            r0.setClipToOutline(r4)
            android.view.View r2 = r13.A08
            r1 = 4
            X.8zP r0 = new X.8zP
            r0.<init>(r13, r1)
            r2.setOutlineProvider(r0)
        L_0x0152:
            X.5Ml r0 = r13.A0g
            if (r0 == 0) goto L_0x0159
            r0.A00(r4)
        L_0x0159:
            if (r3 == 0) goto L_0x0164
            X.5U0 r2 = r13.A0T
            java.lang.String r1 = r3.callId
            java.lang.String r0 = "voip_call_control_bottom_sheet_onshown"
            r2.A02(r1, r0)
        L_0x0164:
            return
        L_0x0165:
            X.2rx r0 = r13.A0W
            boolean r0 = X.AnonymousClass36T.A08(r0, r3)
            if (r0 == 0) goto L_0x016e
            goto L_0x0101
        L_0x016e:
            r2 = 1
            goto L_0x0109
        L_0x0170:
            X.2rx r0 = r13.A0W
            boolean r0 = X.AnonymousClass36T.A08(r0, r3)
            if (r0 == 0) goto L_0x006f
            X.1VX r0 = r13.A0Z
            boolean r0 = X.C627436k.A0E(r0)
            if (r0 == 0) goto L_0x006f
            X.4FS r1 = r13.A0f
            r0 = 18
            X.C86624Kv.A1N(r1, r13, r3, r0)
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A01(android.content.DialogInterface, com.whatsapp.voipcalling.VoipCallControlBottomSheetV2):void");
    }

    public final int A1S() {
        C003203q A0Q2;
        if (Build.VERSION.SDK_INT >= 24 && (A0Q2 = A0Q()) != null && A0Q2.isInMultiWindowMode()) {
            return 0;
        }
        int identifier = C08310eF.A09(this).getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return C08310eF.A09(this).getDimensionPixelSize(identifier);
        }
        return 25;
    }

    public static VoipCallControlBottomSheetV2 A00(boolean z, boolean z2) {
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = new VoipCallControlBottomSheetV2();
        Bundle A082 = AnonymousClass002.A08();
        A082.putBoolean("is_video_call", z);
        A082.putBoolean("is_incoming_capi_call", z2);
        voipCallControlBottomSheetV2.A0u(A082);
        return voipCallControlBottomSheetV2;
    }

    public void A1O(C08270df r4, String str) {
        C103325Ml r0 = this.A0g;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            if (!(!voipActivityV2.A2I && voipActivityV2.A1P == null && voipActivityV2.A0s.A0H.A07() == null)) {
                Log.i("voip/VoipCallControlBottomSheetV2 bottom sheet action is disabled");
                return;
            }
        }
        if (this.A0i) {
            Log.i("voip/VoipCallControlBottomSheetV2 show after attached");
            C105315Uk r02 = this.A0N;
            if (r02 != null && r02.A00() == 5) {
                A1V();
                this.A0N.A03(4);
                C105315Uk r1 = this.A0N;
                if (r1.A07 && !r1.A0B) {
                    r1.A0D.setTranslationY(-(((float) r1.A0I.A0L()) * 0.07f));
                    return;
                }
                return;
            }
            return;
        }
        this.A0i = true;
        Log.i("voip/VoipCallControlBottomSheetV2 attaching bottom sheet");
        C08310eF A0D2 = r4.A0D(str);
        C08240dc r03 = new C08240dc(r4);
        if (A0D2 != null) {
            r03.A07(A0D2);
        }
        r03.A0C(this, str);
        r03.A04();
    }

    public final CallInfo A1T() {
        C103325Ml r0 = this.A0g;
        if (r0 != null) {
            return r0.A00.A7D();
        }
        return null;
    }

    public final void A1U() {
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            Window window = this.A03.getWindow();
            if (!C107385bE.A08() || !this.A0Z.A0X(4848)) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256 | 4);
                return;
            }
            new AnonymousClass0KN(window.getDecorView(), window).A00.A01(1);
        }
    }

    public final void A1V() {
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            Window window = this.A03.getWindow();
            if (!C107385bE.A08() || !this.A0Z.A0X(4848)) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                return;
            }
            new AnonymousClass0KN(window.getDecorView(), window).A00.A02(1);
        }
    }

    public final void A1W() {
        C105315Uk r1;
        int i;
        boolean z;
        C105315Uk r3 = this.A0N;
        if (r3 != null) {
            if (r3.A08()) {
                z = false;
            } else if (!r3.A0I.A0d) {
                return;
            } else {
                if (r3.A00() == 5) {
                    A1V();
                    r3 = this.A0N;
                    z = true;
                } else {
                    A1U();
                    r1 = this.A0N;
                    if (r1.A0I.A0d) {
                        i = 5;
                        r1.A03(i);
                    }
                    return;
                }
            }
            if (r3.A07 && !r3.A0B) {
                float A0L2 = ((float) r3.A0I.A0L()) * 0.07f;
                View view = r3.A0D;
                if (z) {
                    A0L2 = -A0L2;
                }
                view.setTranslationY(A0L2);
            }
            r1 = this.A0N;
            i = 4;
            r1.A03(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1X(float r6) {
        /*
            r5 = this;
            X.5Uk r1 = r5.A0N
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A07
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            android.app.Dialog r0 = r5.A03
            if (r0 == 0) goto L_0x0049
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0049
            if (r1 == 0) goto L_0x004d
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0P
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x004d
        L_0x0027:
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r4 == 0) goto L_0x0046
            boolean r0 = r5.A1d()
            if (r0 == 0) goto L_0x004a
            float r1 = r5.A01
        L_0x003f:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r3 = X.AnonymousClass001.A07(r1, r6)
        L_0x0046:
            r2.setAlpha(r3)
        L_0x0049:
            return
        L_0x004a:
            float r1 = r5.A00
            goto L_0x003f
        L_0x004d:
            r4 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A1X(float):void");
    }

    public final void A1Y(float f) {
        Dialog dialog;
        Window window;
        BottomSheetViewModel bottomSheetViewModel = this.A0P;
        if (bottomSheetViewModel != null && bottomSheetViewModel.A02 && (dialog = this.A03) != null && (window = dialog.getWindow()) != null) {
            window.setNavigationBarColor(AnonymousClass0YI.A06(this.A07, (int) (f * 255.0f)));
        }
    }

    public void A1a(int i, float f) {
        C103325Ml r1 = this.A0g;
        if (r1 != null) {
            float f2 = 0.0f;
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            VoipActivityV2 voipActivityV2 = r1.A00;
            if (i2 <= 0) {
                f2 = C86664Kz.A02(voipActivityV2.A0P) * f;
                if (voipActivityV2.A00 == 3) {
                    C103775Oj r0 = voipActivityV2.A0q;
                    r0.A01 = f;
                    r0.A00();
                }
                VoipInCallNotifBanner voipInCallNotifBanner = voipActivityV2.A0r;
                ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(voipInCallNotifBanner);
                C18260x0.A0y("VoipCallNewParticipantBanner/moveBannerYPosition yOffset: ", AnonymousClass001.A0o(), i);
                A0T2.bottomMargin -= i;
                voipInCallNotifBanner.setLayoutParams(A0T2);
            }
            voipActivityV2.A0P.setTranslationY(f2);
            AnonymousClass5XJ r4 = voipActivityV2.A18;
            if (r4 != null && r4.A03) {
                C158527k7 r02 = (C158527k7) C86634Kw.A0v(r4.A0A);
                r4.A00(new C158527k7(f, r02.A01, r02.A02, r02.A03));
            }
        }
        A1Y(Math.min(1.0f, Math.max(0.0f, (f + 1.0f) / 0.7f)));
    }

    public void A1b(boolean z) {
        AnonymousClass5UY r1 = this.A0d;
        if (r1 != null) {
            if (z) {
                r1.A06(0);
            } else {
                r1.A06(8);
                StringBuilder A0A2 = C18330xA.A0A("");
                this.A0h = A0A2;
                TextView textView = this.A0E;
                if (textView != null) {
                    textView.setText(A0A2);
                    this.A0E.setVisibility(8);
                }
            }
            C105315Uk r0 = this.A0N;
            if (r0 != null) {
                r0.A08 = z;
                r0.A01();
                r0.A02();
            }
        }
    }

    public boolean A1c() {
        C105315Uk r0;
        if (!this.A0i || (r0 = this.A0N) == null || !r0.A08()) {
            return false;
        }
        return true;
    }

    public boolean A1d() {
        BottomSheetViewModel bottomSheetViewModel = this.A0P;
        if (bottomSheetViewModel == null || !C86604Kt.A1Z(bottomSheetViewModel.A0A)) {
            return false;
        }
        return true;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int A042;
        Resources.Theme theme = A1I().getContext().getTheme();
        TypedValue A0B2 = AnonymousClass4L0.A0B();
        theme.resolveAttribute(R.attr.f3nameremoved, A0B2, true);
        this.A06 = A0B2.data;
        TypedValue A0B3 = AnonymousClass4L0.A0B();
        theme.resolveAttribute(R.attr.f3nameremoved, A0B3, true);
        this.A05 = A0B3.data;
        TypedValue A0B4 = AnonymousClass4L0.A0B();
        theme.resolveAttribute(R.attr.f3nameremoved, A0B4, true);
        this.A01 = A0B4.getFloat();
        TypedValue A0B5 = AnonymousClass4L0.A0B();
        theme.resolveAttribute(R.attr.f3nameremoved, A0B5, true);
        this.A04 = A0B5.data;
        TypedValue A0B6 = AnonymousClass4L0.A0B();
        theme.resolveAttribute(R.attr.f3nameremoved, A0B6, true);
        this.A00 = A0B6.getFloat();
        this.A07 = AnonymousClass5Yj.A03(A1I().getContext(), A1I().getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C626936e.A04(inflate);
        this.A0B = inflate;
        this.A0A = C06560Yg.A02(inflate, R.id.call_upgrade_row);
        this.A0b = AnonymousClass0x2.A0M(this.A0B, R.id.call_controls_header_stub);
        if (this.A0Z.A0X(4229) && this.A0Z.A0N(4067) >= 2) {
            AnonymousClass5UY A0X2 = C18290x4.A0X(this.A0B, R.id.voip_dialpad_stub);
            this.A0d = A0X2;
            this.A0e = C18290x4.A0X(A0X2.A04(), R.id.voip_dialpad);
            this.A0E = AnonymousClass002.A09(this.A0d.A04(), R.id.keypad_display);
            int[] iArr = this.A0k;
            int length = iArr.length;
            this.A0j = new DialpadButton[length];
            for (int i = 0; i < length; i++) {
                this.A0j[i] = this.A0d.A04().findViewById(iArr[i]);
                DialpadButton dialpadButton = this.A0j[i];
                if (dialpadButton != null) {
                    C109695f2.A00(dialpadButton, this, i, 22);
                }
            }
        }
        Dialog dialog = this.A03;
        C626936e.A06(dialog);
        dialog.setOnShowListener(new AnonymousClass93U(this, 2));
        this.A03.setOnKeyListener(new AnonymousClass6BC(this, 4));
        Window window = this.A03.getWindow();
        if (window != null) {
            window.addFlags(524288);
            window.setDimAmount(0.0f);
            if (C107295b4.A09(this.A0X)) {
                window.addFlags(8);
            }
            CallInfo A1T = A1T();
            C86634Kw.A13(this.A03.getContext(), window, R.color.f5nameremoved);
            if (A1T == null || !A1T.videoEnabled) {
                A042 = AnonymousClass0Y8.A04(this.A03.getContext(), R.color.f5nameremoved);
            } else {
                A042 = this.A07;
            }
            window.setNavigationBarColor(A042);
        }
        this.A0G = C86654Ky.A0P(this.A0B, R.id.participant_list);
        this.A0F = (NestedScrollView) C06560Yg.A02(this.A0B, R.id.participant_list_nested_scroll_view);
        AnonymousClass0YY.A06(this.A0G, 2);
        RecyclerView recyclerView = this.A0G;
        A1D();
        C18320x8.A19(recyclerView, 1);
        Log.i("voip/VoipCallControlBottomSheetV2 Setting adapter");
        this.A0G.setAdapter(this.A0O);
        C86614Ku.A1J(this.A0G.getViewTreeObserver(), this, 18);
        View.OnClickListener onClickListener = null;
        this.A0G.setItemAnimator((AnonymousClass0UY) null);
        this.A0D = (Space) C06560Yg.A02(this.A0B, R.id.call_controls_sheet_drag_indicator_space);
        VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = (VoipCallControlBottomSheetDragIndicator) C06560Yg.A02(this.A0B, R.id.call_controls_sheet_drag_indicator);
        this.A0U = voipCallControlBottomSheetDragIndicator;
        voipCallControlBottomSheetDragIndicator.setOnClickListener(new C170968Ff(this));
        CallInfo A1T2 = A1T();
        Bundle bundle2 = this.A06;
        if (bundle2 != null && bundle2.getBoolean("is_incoming_capi_call", false) && C627436k.A0E(this.A0Z)) {
            this.A0U.setVisibility(8);
        } else if (AnonymousClass36T.A08(this.A0W, A1T2) && C627436k.A0E(this.A0Z)) {
            C86624Kv.A1N(this.A0f, this, A1T2, 19);
        }
        View A022 = C06560Yg.A02(this.A0A, R.id.upgrade_cancel);
        C103325Ml r0 = this.A0g;
        if (r0 != null) {
            onClickListener = r0.A00.A0G;
        }
        A022.setOnClickListener(onClickListener);
        C86654Ky.A1A(A022, C08310eF.A09(this).getString(R.string.f11nameremoved), C08310eF.A09(this).getString(R.string.f11nameremoved), false);
        this.A0C = C86654Ky.A0L(this.A0B, R.id.call_controls_btns_container);
        this.A09 = C06560Yg.A02(this.A0B, R.id.call_control_buttons_guideline);
        this.A0C.setFocusable(true);
        this.A0C.setTag(0);
        this.A0B.setVisibility(8);
        this.A0c = AnonymousClass0x2.A0M(this.A0B, R.id.call_details_additional_info_stub);
        return this.A0B;
    }

    public void A0d() {
        super.A0d();
        Log.i("voip/VoipCallControlBottomSheetV2 onDetach");
        this.A0i = false;
        if (this.A0G != null) {
            Log.i("voip/VoipCallControlBottomSheetV2 Setting adapter to null");
            this.A0G.setAdapter((AnonymousClass0R6) null);
        }
        this.A0N = null;
        this.A08 = null;
        this.A0g = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle bundle2 = this.A06;
        C626936e.A0D(AnonymousClass000.A1W(bundle2), "Arguments must not be null");
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("is_video_call", false);
            int i = R.style.f12nameremoved;
            if (z) {
                i = R.style.f12nameremoved;
            }
            A1M(0, i);
        }
    }

    public void A1G(Context context) {
        super.A1G(context);
        Log.i("voip/VoipCallControlBottomSheetV2 onAttach");
        try {
            this.A02 = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) ((C179808jk) context);
            C103325Ml r0 = voipActivityV2.A1s;
            if (r0 == null) {
                r0 = new C103325Ml(voipActivityV2);
                voipActivityV2.A1s = r0;
            }
            this.A0g = r0;
            C15940sD r2 = (C15940sD) context;
            ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) AnonymousClass0x9.A0H(r2).A01(ParticipantsListViewModel.class);
            this.A0R = participantsListViewModel;
            participantsListViewModel.A00 = this.A0g;
            this.A0P = (BottomSheetViewModel) AnonymousClass0x9.A0H(r2).A01(BottomSheetViewModel.class);
            this.A0Q = (CallControlButtonsViewModel) AnonymousClass0x9.A0H(r2).A01(CallControlButtonsViewModel.class);
            if (this.A0Z.A0X(4848)) {
                this.A0M = (CallScreenViewModel) AnonymousClass0x9.A0H(r2).A01(CallScreenViewModel.class);
            }
            AnonymousClass4WF r1 = this.A0O;
            r1.A0A = new C147487Em(this);
            r1.A02 = this.A0R;
            CallInfo A1T = A1T();
            if (A1T != null) {
                this.A0T.A02(A1T.callId, "voip_call_control_bottom_sheet_onattach");
            }
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass000.A0X(" must implement VoipCallControlBottomSheet$HostProvider", C18290x4.A0v(context)));
        }
    }

    public final void A1Z(int i) {
        NetworkInfo networkInfo;
        CallInfo A1T = A1T();
        if (A1T == null || this.A0g == null || A1D() == null) {
            Log.w("voip/VoipCallControlBottomSheetV2/failed to get call info when build call action intent");
            return;
        }
        boolean A1V = C18280x3.A1V(this.A0g.A00.getIntent(), "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN");
        Intent intent = null;
        if (i != 0) {
            if (i != 1) {
                Context A1D = A1D();
                intent = C18320x8.A07();
                String packageName = A1D.getPackageName();
                if (i != 2) {
                    intent.setClassName(packageName, "com.whatsapp.voipcalling.VoipActivityV2");
                    intent.setAction("com.whatsapp.intent.action.START_CALL");
                } else {
                    intent.setClassName(packageName, "com.whatsapp.voipcalling.VoipActivityV2");
                    intent.setAction("com.whatsapp.intent.action.JOIN_CALL_LINK");
                    intent.putExtra("isTaskRoot", false);
                }
            } else {
                Context A1D2 = A1D();
                String str = A1T.callId;
                intent = C18320x8.A07();
                intent.setClassName(A1D2.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
                intent.setAction("com.whatsapp.intent.action.REJECT_CALL_FROM_VOIP_UI");
                intent.putExtra("pendingCall", A1V);
                intent.putExtra("call_id", str);
            }
            intent.setFlags(268435456);
        } else {
            ConnectivityManager A0H2 = this.A0X.A0H();
            if (A0H2 != null) {
                networkInfo = A0H2.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (A1T.isCallFull()) {
                VoipErrorDialogFragment A012 = VoipErrorDialogFragment.A01(new C47702dg(), 7);
                C003203q A0Q2 = A0Q();
                if (A0Q2 != null) {
                    C86644Kx.A1D(A012, A0Q2);
                }
            } else if (networkInfo == null) {
                VoipErrorDialogFragment A013 = VoipErrorDialogFragment.A01(new C47702dg(), 3);
                C003203q A0Q3 = A0Q();
                if (A0Q3 != null) {
                    C86644Kx.A1D(A013, A0Q3);
                }
            } else {
                int i2 = 3;
                if (A1V) {
                    i2 = 10;
                }
                intent = C86664Kz.A1B().A1S(A1D(), A1T.callId, i2, true);
            }
        }
        this.A0Y.A06(27, A1T.callId, "joinable call");
        C003203q A0Q4 = A0Q();
        if (A0Q4 != null && intent != null) {
            A0Q4.startActivity(intent);
        }
    }

    public boolean A1e() {
        int A1H = A1H();
        if (A1H != 0) {
            if (A1H == R.style.f12nameremoved) {
                return true;
            }
            return false;
        } else if (this.A06.getBoolean("is_video_call", false)) {
            return true;
        } else {
            return false;
        }
    }
}
