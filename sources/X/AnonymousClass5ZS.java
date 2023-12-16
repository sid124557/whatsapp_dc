package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.5ZS  reason: invalid class name */
public class AnonymousClass5ZS {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public SoundPool A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public C89654ea A0A;
    public C109235eI A0B;
    public AnonymousClass678 A0C;
    public AnonymousClass4NB A0D;
    public AnonymousClass5Y6 A0E;
    public AnonymousClass5UD A0F;
    public AnonymousClass5MR A0G;
    public AnonymousClass5OK A0H;
    public AnonymousClass5TA A0I;
    public C27991fJ A0J;
    public File A0K;
    public File A0L;
    public Integer A0M;
    public String A0N;
    public List A0O = Collections.emptyList();
    public List A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T = true;
    public boolean A0U;
    public boolean A0V = false;
    public boolean A0W;
    public boolean A0X;
    public final long A0Y;
    public final C08310eF A0Z;
    public final C64393Dh A0a;
    public final C69263Wi A0b;
    public final AnonymousClass54I A0c;
    public final AnonymousClass30B A0d;
    public final AnonymousClass5TW A0e;
    public final AnonymousClass7HL A0f;
    public final AnonymousClass7HM A0g;
    public final AnonymousClass5O5 A0h;
    public final C104405Qv A0i;
    public final C105995Xf A0j;
    public final AnonymousClass5UM A0k;
    public final AnonymousClass5U6 A0l;
    public final C620633i A0m;
    public final C56612sH A0n;
    public final C54292oU A0o;
    public final AnonymousClass33p A0p;
    public final C620733j A0q;
    public final AnonymousClass1VX A0r;
    public final AnonymousClass5O9 A0s;
    public final C60152y5 A0t;
    public final AnonymousClass33I A0u;
    public final AnonymousClass4FS A0v;
    public final C185958uW A0w = new AnonymousClass91D(this, 0);
    public final C97094xc A0x;
    public final Runnable A0y = new C117695sL(this, 46);
    public final boolean A0z;
    public final boolean A10;
    public final /* synthetic */ C185028sw A11;
    public final /* synthetic */ C102985La A12;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0095, code lost:
        if (r2 == 5) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.graphics.Bitmap r19, X.C08310eF r20, X.C186058ug r21, java.util.Collection r22, java.util.List r23, int r24, boolean r25) {
        /*
            r18 = this;
            r0 = 4
            r11 = 0
            r10 = r18
            r13 = r22
            r12 = r24
            r5 = r25
            if (r12 != r0) goto L_0x0105
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.5Xf r2 = r10.A0j
            int r0 = r13.size()
            r2.A03(r5, r0)
        L_0x0017:
            X.5Qv r9 = r10.A0i
            boolean r8 = r9.A01(r13)
            int r2 = r10.A02
            int r0 = r13.size()
            int r2 = r2 - r0
            r7 = 1
            if (r2 != 0) goto L_0x0041
            boolean r0 = r10.A0V
            if (r0 != 0) goto L_0x0041
            X.1VX r5 = r10.A0r
            r4 = 2693(0xa85, float:3.774E-42)
            int r3 = r5.A0N(r4)
            int r0 = X.C86664Kz.A0I(r5)
            int r3 = r3 - r0
            int r2 = r2 + r3
            int r0 = r5.A0N(r4)
            r10.A02 = r0
            r10.A0V = r7
        L_0x0041:
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r13)
            X.4ea r0 = r10.A04()
            X.5PE r5 = new X.5PE
            r5.<init>(r0)
            r5.A0G = r6
            java.util.List r0 = r10.A0O
            java.util.ArrayList r0 = X.C627336j.A0A(r0)
            r5.A0F = r0
            java.util.Set r0 = r9.A0A
            int r0 = r0.size()
            int r2 = r2 - r0
            r5.A01 = r2
            boolean r0 = r10.A0V
            r5.A0N = r0
            X.8sw r4 = r10.A11
            int r0 = r4.BAC()
            int r0 = X.C154277cu.A00(r1, r0, r8)
            r5.A02 = r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r10.A0Y
            long r2 = r2 - r0
            r5.A04 = r2
            long r0 = r10.A03
            r5.A06 = r0
            X.1fJ r0 = r10.A0J
            java.lang.String r0 = X.C627336j.A07(r0)
            r5.A0D = r0
            boolean r0 = r10.A0S
            r5.A0H = r0
            r5.A0I = r8
            int r2 = r4.BAC()
            r0 = 4
            if (r2 == r0) goto L_0x0097
            r1 = 5
            r0 = 1
            if (r2 != r1) goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            r5.A0J = r0
            r0 = 2
            if (r12 != r0) goto L_0x00be
            X.4ea r0 = r10.A04()
            boolean r0 = r0 instanceof com.whatsapp.camera.CameraActivity
            if (r0 == 0) goto L_0x00fe
            r1 = 2131428504(0x7f0b0498, float:1.8478654E38)
            android.view.View r0 = r10.A09
            android.view.View r1 = X.C06560Yg.A02(r0, r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            int r0 = r0.topMargin
            r5.A03 = r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            int r0 = r0.bottomMargin
            r5.A00 = r0
        L_0x00be:
            r4.BAC()
            r2 = 0
            r4.BAC()
            int r1 = r4.BAC()
            r0 = 14
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            r5.A0K = r0
            boolean r0 = r10.A0Q
            if (r0 != 0) goto L_0x016b
            java.lang.Object r3 = r6.get(r2)
            android.net.Uri r3 = (android.net.Uri) r3
            java.util.List r6 = r10.A0P
            java.lang.String r4 = r10.A0N
            X.5Xq r0 = r9.A03
            java.util.Map r0 = r0.A00
            java.util.ArrayList r0 = X.C18300x5.A0v(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00eb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r1.next()
            X.5YF r0 = (X.AnonymousClass5YF) r0
            r0.A0G(r11)
            r0.A0I(r11)
            goto L_0x00eb
        L_0x00fe:
            int r0 = r10.A01
            r5.A03 = r0
            r5.A00 = r0
            goto L_0x00be
        L_0x0105:
            r0 = 3
            if (r12 != r0) goto L_0x0147
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.5Xf r3 = r10.A0j
            int r4 = r13.size()
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "CameraCaptureFlowLogger/logGalleryStripUsed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4sj r2 = new X.4sj
            r2.<init>()
            X.2M9 r0 = r3.A02
            java.lang.Long r0 = r0.A00
            r2.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A03 = r0
            java.lang.Integer r0 = X.C18290x4.A0a()
            r2.A09 = r0
            int r0 = X.C18280x3.A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r4)
            r2.A0F = r0
            X.4FV r0 = r3.A01
            r0.BhA(r2)
            goto L_0x0017
        L_0x0147:
            r1 = r11
            goto L_0x0017
        L_0x014a:
            X.5Xq r0 = r9.A03
            X.5YF r3 = r0.A00(r3)
            if (r6 == 0) goto L_0x0162
            X.2fI r1 = r9.A08
            java.lang.String r0 = r3.A0C()
            r1.A01(r0, r6)
            java.lang.String r0 = r3.A0C()
            r3.A0I(r0)
        L_0x0162:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x016b
            r3.A0G(r4)
        L_0x016b:
            java.lang.Integer r0 = r10.A0M
            r5.A0A = r0
            X.5Xq r0 = r9.A03
            X.AnonymousClass5PE.A00(r0, r5)
            boolean r0 = X.C107275b2.A00
            if (r0 == 0) goto L_0x01c4
            int r0 = r13.size()
            if (r0 != r7) goto L_0x01c4
            r4 = r23
            if (r23 == 0) goto L_0x01c4
            r6 = r19
            if (r19 == 0) goto L_0x01c4
            if (r21 == 0) goto L_0x01c4
            long r16 = r21.getContentLength()
            r14 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x01c4
            java.util.Iterator r0 = r13.iterator()
            android.net.Uri r1 = X.C86664Kz.A0c(r0)
            r5.A07 = r1
            X.30B r0 = r10.A0d
            X.1sU r3 = r0.A02()
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r1)
            java.lang.String r0 = "-gallery_thumb"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r3.A09(r0, r6)
            X.4ea r1 = r10.A04()
            X.0PJ[] r0 = new X.AnonymousClass0PJ[r2]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.0PJ[] r0 = (X.AnonymousClass0PJ[]) r0
            X.0Vi r0 = X.C05880Vi.A01(r1, r0)
            android.os.Bundle r11 = r0.A02()
        L_0x01c4:
            android.content.Intent r1 = r5.A01()
            r0 = 101(0x65, float:1.42E-43)
            r3 = r20
            r3.A0n(r1, r0, r11)
            if (r8 == 0) goto L_0x01e1
            int r0 = r13.size()
            if (r0 != r7) goto L_0x01e1
            X.4ea r1 = r10.A04()
            r0 = 2130772017(0x7f010031, float:1.714714E38)
            r1.overridePendingTransition(r0, r2)
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZS.A0I(android.graphics.Bitmap, X.0eF, X.8ug, java.util.Collection, java.util.List, int, boolean):void");
    }

    public AnonymousClass5ZS(C08310eF r4, C64393Dh r5, C69263Wi r6, AnonymousClass54I r7, AnonymousClass30B r8, AnonymousClass5TW r9, C185028sw r10, AnonymousClass5O5 r11, C104405Qv r12, C102985La r13, C105995Xf r14, AnonymousClass5UM r15, AnonymousClass5U6 r16, C620633i r17, C56612sH r18, C54292oU r19, AnonymousClass33p r20, C620733j r21, AnonymousClass1VX r22, AnonymousClass5O9 r23, C60152y5 r24, AnonymousClass33I r25, AnonymousClass4FS r26, C97094xc r27, boolean z) {
        this.A12 = r13;
        this.A11 = r10;
        this.A0o = r19;
        this.A0n = r18;
        this.A0d = r8;
        AnonymousClass1VX r2 = r22;
        this.A0r = r2;
        this.A0b = r6;
        this.A0v = r26;
        this.A0a = r5;
        this.A0s = r23;
        this.A0x = r27;
        this.A0e = r9;
        this.A0m = r17;
        this.A0q = r21;
        this.A0c = r7;
        this.A0i = r12;
        this.A0Z = r4;
        this.A0p = r20;
        this.A0j = r14;
        this.A0k = r15;
        this.A0h = r11;
        this.A0t = r24;
        this.A0l = r16;
        this.A0u = r25;
        this.A0z = r2.A0X(125);
        this.A02 = C86664Kz.A0I(r2);
        this.A0Y = System.currentTimeMillis();
        this.A10 = z;
        this.A0f = new AnonymousClass7HL(this.A11.BAC());
        this.A0g = new AnonymousClass7HM(r2, this.A11.BAC());
    }

    public static void A01(AnonymousClass5ZS r0) {
        AnonymousClass4X4 r02;
        AnonymousClass5UD r03 = r0.A0F;
        if (r03 != null && (r02 = r03.A04) != null) {
            r02.A05();
        }
    }

    public static /* synthetic */ void A02(AnonymousClass5ZS r9) {
        int i;
        DisplayCutout displayCutout;
        C89654ea r0 = r9.A0A;
        if (r0 == null || AnonymousClass001.A0M(r0).screenWidthDp < 600) {
            View A022 = C06560Yg.A02(r9.A09, R.id.camera_mode_tab_layout);
            View A023 = C06560Yg.A02(r9.A09, R.id.camera_view_holder);
            Rect A0N2 = AnonymousClass001.A0N();
            Rect A0N3 = AnonymousClass001.A0N();
            A023.getLocalVisibleRect(A0N2);
            A023.getGlobalVisibleRect(A0N2);
            r9.A09.getLocalVisibleRect(A0N3);
            r9.A09.getGlobalVisibleRect(A0N3);
            int measuredHeight = A022.getMeasuredHeight();
            int A052 = AnonymousClass4L0.A05(A023, r9.A09.getMeasuredHeight()) - measuredHeight;
            int i2 = 0;
            if (!(r9.A04() instanceof CameraActivity)) {
                if (!AnonymousClass000.A1U(C86604Kt.A02(r9.A0o.A00), 2)) {
                    i2 = A0N2.top;
                }
                r9.A01 = A0N2.top;
                A00(A022, -1, i2);
                int i3 = i2 + measuredHeight;
                r9.A0E(i3);
                r9.A0G(i3);
            } else if (A052 >= 0) {
                if (A052 > measuredHeight) {
                    i2 = A052 / 2;
                }
                int i4 = A0N2.top;
                int i5 = (i4 - (measuredHeight - i4)) - i2;
                if (!C107385bE.A06() || (displayCutout = r9.A09.getRootWindowInsets().getDisplayCutout()) == null || displayCutout.getSafeInsetTop() <= i5) {
                    i = i5;
                } else {
                    i = displayCutout.getSafeInsetTop();
                }
                int i6 = measuredHeight + i2;
                A00(A022, R.id.camera_actions, i2);
                r9.A0F(i);
                r9.A0E(i6);
                ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(A023);
                A0T2.setMargins(0, i5, 0, i6);
                A023.setLayoutParams(A0T2);
                r9.A0G(i6);
            } else {
                int i7 = A0N3.bottom - A0N2.bottom;
                A00(A022, -1, i7);
                r9.A0F(A0N2.top);
                int i8 = i7 + measuredHeight;
                r9.A0E(i8);
                r9.A0G(i8);
            }
        }
    }

    public final int A03() {
        int i = 0;
        if (!this.A0z && this.A0D != null && Settings.System.getInt(C620633i.A02(this.A0m).A00, "accelerometer_rotation", 0) == 0 && this.A0D.A00 != -1) {
            i = ((this.A0D.A00 - ((4 - C86664Kz.A0f(A04()).getRotation()) % 4)) * 90) % 360;
            while (i < 0) {
                i += 360;
            }
        }
        return i;
    }

    public final C89654ea A04() {
        C89654ea r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0g("Host activity is NULL");
    }

    public void A06() {
        Log.i("cameraui/restoreui");
        A0N(true);
        if (this.A08.getVisibility() != 0) {
            this.A08.setVisibility(0);
        }
        boolean BHi = this.A0C.BHi();
        if (!BHi) {
            this.A08.requestLayout();
            C86614Ku.A1J(this.A08.getViewTreeObserver(), this, 4);
        }
        this.A0I.A01(AnonymousClass000.A1U(this.A0i.A00, 2), A0Q(), false);
        AnonymousClass5Y6 r4 = this.A0E;
        C86604Kt.A02(this.A0o.A00);
        WaImageView waImageView = r4.A0I;
        waImageView.setVisibility(0);
        waImageView.setEnabled(BHi);
        CircularProgressBar circularProgressBar = r4.A05;
        if (circularProgressBar != null) {
            circularProgressBar.setVisibility(0);
        }
        WaImageView waImageView2 = r4.A0J;
        waImageView2.setEnabled(BHi);
        boolean A1T = AnonymousClass000.A1T(waImageView2.getVisibility());
        waImageView2.setVisibility(AnonymousClass001.A08(r4.A0L ? 1 : 0));
        boolean A1Y = C86604Kt.A1Y(waImageView2);
        if (!A1T && A1Y) {
            waImageView2.startAnimation(r4.A03);
        }
        WaImageView waImageView3 = r4.A0G;
        waImageView3.setEnabled(BHi);
        boolean A1T2 = AnonymousClass000.A1T(waImageView3.getVisibility());
        r4.A01();
        boolean A1U = C86654Ky.A1U(waImageView3);
        if (!A1T2 && A1U) {
            waImageView3.startAnimation(r4.A03);
        }
        r4.A0H.setVisibility(r4.A06.A00);
        WaImageView waImageView4 = r4.A0F;
        if (waImageView4 != null) {
            waImageView4.setVisibility(0);
        }
        AnonymousClass5UD r0 = this.A0F;
        if (r0 != null && r0.A0B.A0O != 3) {
            this.A0G.A00.setVisibility(0);
        }
    }

    public void A07() {
        int i;
        View view;
        AnonymousClass5UM r2 = this.A0k;
        C185028sw r5 = this.A11;
        r2.A04("warm", C154277cu.A01(r5.BAC()));
        r2.A02(554251647, "showCamera");
        C89654ea r4 = this.A0A;
        if (r4 != null) {
            C107405bG.A09(r4, AnonymousClass5Yj.A02(r4, R.attr.f3nameremoved, R.color.f5nameremoved), 2);
            if (!C107535bT.A03() || !this.A0e.A04()) {
                this.A0R = true;
                AnonymousClass4NB r0 = this.A0D;
                if (r0 != null) {
                    r0.enable();
                }
                r2.A02 = SystemClock.elapsedRealtime();
                C105995Xf r1 = this.A0j;
                switch (r5.BAC()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 9:
                        i = 10;
                        break;
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    case 12:
                        i = 13;
                        break;
                    case 13:
                        i = 14;
                        break;
                    default:
                        i = 1;
                        break;
                }
                r1.A01(i);
                this.A0C.Bk9();
                this.A08.removeCallbacks(this.A0y);
                int i2 = 0;
                this.A06.setVisibility(0);
                this.A0G.A00.setVisibility(0);
                if (this.A08.getVisibility() == 0) {
                    view = this.A07;
                    i2 = 8;
                } else {
                    view = this.A08;
                }
                view.setVisibility(i2);
                A0N(true);
                this.A0Z.A15(true);
                r2.A01(554251647, "showCamera");
                return;
            }
            this.A0b.A0H(R.string.f11nameremoved, 1);
            r5.BOE();
            r2.A01(554251647, "showCamera");
            r2.A05(4);
            return;
        }
        r2.A01(554251647, "showCamera");
        r2.A05(87);
        throw AnonymousClass001.A0e("need to call onCreate first");
    }

    public final void A08() {
        C89654ea r8 = this.A0A;
        if (r8 != null) {
            C620633i r7 = this.A0m;
            C620733j r6 = this.A0q;
            Set set = this.A0i.A0A;
            long size = (long) set.size();
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L2, set.size());
            C107295b4.A00(r8, r7, r6.A0L(A0L2, R.plurals.f9nameremoved, size));
        }
    }

    public final void A09() {
        AnonymousClass5UD r0;
        C104405Qv r2 = this.A0i;
        if (r2.A01 == 1 && (r0 = this.A0F) != null) {
            AnimatorSet animatorSet = r0.A00;
            if (animatorSet == null || !animatorSet.isStarted()) {
                r2.A01 = 2;
                A0D();
                this.A0F.A02(false);
            }
        }
    }

    public final void A0A() {
        AnonymousClass4NB r0;
        if (this.A0h.A01.A0D()) {
            Log.i("cameraui/startvideocapture");
            C104405Qv r4 = this.A0i;
            Set set = r4.A0A;
            if (set.size() >= this.A02) {
                this.A02 = this.A0r.A0N(2693);
            }
            int size = set.size();
            int i = this.A02;
            boolean z = true;
            if (size >= i) {
                C69263Wi r42 = this.A0b;
                C54292oU r02 = this.A0o;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, i, 0);
                r42.A0P(C54292oU.A00(r02).getString(R.string.f11nameremoved, objArr), 0);
            } else if (this.A0e.A04()) {
                this.A0b.A0H(R.string.f11nameremoved, 1);
                this.A11.BOE();
            } else {
                AnonymousClass5UM r5 = this.A0k;
                if (r5.A0B) {
                    r5.A09.markerStart(554249147);
                    r5.A02(554249147, "start_video_capture");
                }
                C64393Dh r9 = this.A0a;
                C60152y5 r8 = this.A0t;
                C633138t r7 = C633138t.A0g;
                int i2 = 1;
                if (this.A0r.A0X(401)) {
                    i2 = 4;
                }
                this.A0L = C106275Yh.A00(r9, r8, r7, ".mp4", i2);
                if (!this.A10 && (r0 = this.A0D) != null) {
                    r0.disable();
                }
                int A032 = A03();
                if (this.A0C.BLO() && this.A0A != null) {
                    AnonymousClass5Y6 r1 = this.A0E;
                    Window window = A04().getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    View view = r1.A0B;
                    view.setVisibility(0);
                    view.setBackgroundColor(-855638017);
                    attributes.screenBrightness = 1.0f;
                    window.setAttributes(attributes);
                }
                boolean A1U = AnonymousClass000.A1U(r4.A00, 2);
                AnonymousClass5Y6 r82 = this.A0E;
                if (A1U) {
                    r82.A02(1.0f, 1.25f);
                } else {
                    r82.A03(1.0f, 0.6f, true);
                    r82.A02(1.0f, 2.0f);
                    this.A0E.A0I.setPressed(false);
                }
                this.A08.setKeepScreenOn(true);
                r5.A05 = SystemClock.elapsedRealtime();
                AnonymousClass678 r52 = this.A0C;
                File file = this.A0L;
                if (r52.BHe()) {
                    A032 = 360 - A032;
                }
                r52.Bq4(file, A032);
                AnonymousClass5TA r72 = this.A0I;
                boolean A1U2 = AnonymousClass000.A1U(r4.A00, 2);
                r72.A00 = System.currentTimeMillis();
                r72.A04.sendEmptyMessage(0);
                r72.A01(true, true, !A1U2);
                AnonymousClass5Y6 r12 = this.A0E;
                if (r4.A00 != 2 || !this.A0z) {
                    z = false;
                }
                r12.A05(z);
                this.A0G.A00.setVisibility(4);
                A0N(false);
                C106755a7.A03(this.A0m);
            }
        } else {
            this.A0E.A00();
            C89654ea A042 = A04();
            AnonymousClass5UF r13 = new AnonymousClass5UF(A04());
            r13.A01 = R.drawable.permission_mic;
            r13.A02 = R.string.f11nameremoved;
            r13.A0B = null;
            r13.A03 = R.string.f11nameremoved;
            r13.A09 = null;
            r13.A0D = new String[]{"android.permission.RECORD_AUDIO"};
            A042.startActivity(r13.A02());
        }
    }

    public final void A0C() {
        Log.i("cameraui/takepicture");
        if (this.A0X && this.A04 != null) {
            if (this.A0r.A0X(4959)) {
                this.A0c.A05(this.A04, 1.0f, 1.0f, this.A00);
            } else {
                this.A04.play(this.A00, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
        Set set = this.A0i.A0A;
        if (set.size() >= this.A02) {
            this.A02 = this.A0r.A0N(2693);
        }
        int size = set.size();
        int i = this.A02;
        if (size >= i) {
            C69263Wi r3 = this.A0b;
            C54292oU r0 = this.A0o;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, i, 0);
            r3.A0P(C54292oU.A00(r0).getString(R.string.f11nameremoved, objArr), 0);
            return;
        }
        AnonymousClass5UM r32 = this.A0k;
        r32.A00 = SystemClock.elapsedRealtime();
        if (r32.A0B) {
            r32.A09.markerStart(554240366);
        }
        AnonymousClass5Y6 r1 = this.A0E;
        r1.A0I.setEnabled(false);
        r1.A0J.setEnabled(false);
        r1.A0G.setEnabled(false);
        if (this.A0F != null && !(!set.isEmpty())) {
            this.A0F.A01();
            this.A0E.A05(false);
            this.A0G.A00.setVisibility(4);
        }
        if (this.A0C.BLO()) {
            if (this.A0A != null) {
                AnonymousClass5Y6 r12 = this.A0E;
                Window window = A04().getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                View view = r12.A0B;
                view.setVisibility(0);
                view.setBackgroundColor(-3886);
                attributes.screenBrightness = 1.0f;
                window.setAttributes(attributes);
            }
            this.A08.postDelayed(new C117695sL(this, 45), 300);
            return;
        }
        this.A0C.Bqa(new AnonymousClass5PM(this), AnonymousClass001.A1W(set.size()));
    }

    public final void A0D() {
        int i;
        int i2;
        int A042;
        AnonymousClass5UD r2 = this.A0F;
        if (r2 != null) {
            AnonymousClass5Y6 r5 = this.A0E;
            boolean A1T = AnonymousClass001.A1T(this.A0i.A01);
            View view = r2.A02;
            if (view != null) {
                i = view.getMeasuredHeight();
            } else {
                i = 0;
            }
            if (!r5.A06.A01) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) r5.A0C.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) r5.A0J.getLayoutParams();
                int i3 = layoutParams.bottomMargin;
                if (A1T) {
                    A042 = i + i3;
                    i2 = AnonymousClass5YI.A04(r5.A09, 8.0f);
                } else {
                    i2 = layoutParams2.bottomMargin + layoutParams.height;
                    A042 = AnonymousClass5YI.A04(r5.A09, 8.0f);
                }
                ValueAnimator A062 = C86604Kt.A06(i3, A042 + i2);
                C86644Kx.A0i(A062);
                A062.addUpdateListener(new C100255Ae(layoutParams, 0, r5));
                A062.setDuration(150);
                A062.start();
            }
        }
    }

    public final void A0E(int i) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(this.A05);
        A0T2.setMargins(0, A0T2.topMargin, 0, i);
        this.A05.setLayoutParams(A0T2);
    }

    public final void A0F(int i) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(this.A05);
        A0T2.setMargins(0, i, 0, A0T2.bottomMargin);
        this.A05.setLayoutParams(A0T2);
        View A022 = C06560Yg.A02(this.A09, R.id.gallery_container);
        C86604Kt.A1D(A022, A022.getPaddingLeft(), i);
    }

    public final void A0G(int i) {
        AnonymousClass5UD r3 = this.A0F;
        if (r3 != null) {
            r3.A0B.A0U(AnonymousClass4L0.A04(r3.A0A, C86654Ky.A02(C54292oU.A00(this.A0o), R.dimen.f6nameremoved, i)), false);
        }
    }

    public void A0H(int i, int i2, Intent intent) {
        if (i != 90 && i != 101) {
            return;
        }
        if (i2 == -1) {
            C185028sw r5 = this.A11;
            r5.BAC();
            r5.BAC();
            if (r5.BAC() == 14) {
                A04().setResult(-1, intent);
                A04().finish();
                return;
            }
            C104405Qv r8 = this.A0i;
            List<C188018yB> list = r8.A09;
            for (C188018yB r3 : list) {
                Set set = r8.A0A;
                if (!(!set.isEmpty()) || set.contains(r3.B3d())) {
                    C107655bf.A0Y(A04(), r3.B3d());
                } else {
                    File B7c = r3.B7c();
                    if (!B7c.delete()) {
                        C18260x0.A1S(AnonymousClass001.A0o(), "cameraui/cannot-delete-file ", B7c);
                    }
                }
            }
            r8.A0A.clear();
            r8.A03 = new C106105Xq();
            list.clear();
            A01(this);
            List A122 = C86634Kw.A12(intent, C95814uZ.class, "jids");
            if (A122.size() == 1 && !A122.equals(this.A0O)) {
                Context context = this.A0o.A00;
                Intent A1O = C86664Kz.A1B().A1O(context, (C95814uZ) A122.get(0), 0);
                AnonymousClass5VI.A00(A1O, "CameraUi");
                context.startActivity(A1O);
            }
            r5.BbC();
        } else if (i2 == 1) {
            this.A0i.A03.A02(intent.getExtras());
            this.A0M = Integer.valueOf(intent.getIntExtra("media_quality_selection", 0));
            this.A0O = C86634Kw.A12(intent, C95814uZ.class, "jids");
            A0M(intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
        } else if (i2 == 0) {
            C104405Qv r1 = this.A0i;
            if (!(!r1.A0A.isEmpty()) && !r1.A09.isEmpty()) {
                r1.A00();
                A01(this);
            }
            A06();
        }
    }

    public final void A0J(C186058ug r8) {
        int i;
        if (r8 != null) {
            C104405Qv r5 = this.A0i;
            r5.A05 = C627336j.A0N(this.A0O);
            Uri B3d = r8.B3d();
            AnonymousClass1VX r4 = this.A0r;
            Set set = r5.A0A;
            if (set.contains(B3d)) {
                set.remove(B3d);
                r5.A03.A00.remove(B3d);
            } else {
                int A0I2 = C86664Kz.A0I(r4);
                if (set.size() >= A0I2) {
                    A0I2 = r4.A0N(2693);
                }
                if ((!r5.A05 || set.size() < 1 || r4.A0X(5643)) && set.size() < A0I2) {
                    set.add(B3d);
                    if (set.size() > 1) {
                        r5.A04 = true;
                    }
                    r5.A03.A04(new AnonymousClass5YF(B3d));
                } else {
                    if (!r5.A05 || r4.A0X(5643)) {
                        i = this.A02;
                    } else {
                        i = 1;
                    }
                    C69263Wi r42 = this.A0b;
                    Resources A002 = C54292oU.A00(this.A0o);
                    Object[] A0L2 = AnonymousClass002.A0L();
                    r42.A0P(A002.getQuantityString(R.plurals.f9nameremoved, i, A0L2), C18300x5.A1Y(A0L2, i) ? 1 : 0);
                }
            }
            if (!set.isEmpty()) {
                A08();
            }
            C86654Ky.A1L(this.A0E, set);
            A01(this);
        }
    }

    public final void A0K(C186058ug r6, C95294tG r7, boolean z) {
        if (r6 == null) {
            Log.i("cameraui/showpreview/media-is-null");
            return;
        }
        Uri B3d = r6.B3d();
        C18260x0.A1R(AnonymousClass001.A0o(), "cameraui/showpreview ", B3d);
        C89654ea r0 = this.A0A;
        if (r0 != null && !r0.BHW()) {
            if (z) {
                this.A0i.A09.add(0, r6);
            }
            C104405Qv r4 = this.A0i;
            r4.A03.A04(new AnonymousClass5YF(B3d));
            Set set = r4.A0A;
            if (set.size() > 0) {
                set.add(B3d);
                if (set.size() > 1) {
                    r4.A04 = true;
                }
                A01(this);
                this.A0E.A07(true, set.size());
                A08();
                this.A0C.Bk6();
                A0N(true);
                return;
            }
            A0L(r7, Collections.singletonList(B3d));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        if (r1.A0A.size() != 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C95294tG r11, java.util.Collection r12) {
        /*
            r10 = this;
            boolean r0 = X.C107275b2.A00
            r2 = r10
            if (r0 == 0) goto L_0x0077
            if (r11 == 0) goto L_0x0077
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r11)
            X.AnonymousClass0x2.A1G(r11, r0, r7)
            r1 = 2131430562(0x7f0b0ca2, float:1.8482828E38)
            android.view.View r0 = r10.A09
            android.view.View r1 = X.C06560Yg.A02(r0, r1)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r1)
            X.AnonymousClass0x2.A1G(r1, r0, r7)
            r1 = 2131430218(0x7f0b0b4a, float:1.848213E38)
            android.view.View r0 = r10.A09
            android.view.View r1 = X.C06560Yg.A02(r0, r1)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r1)
            X.AnonymousClass0x2.A1G(r1, r0, r7)
            r1 = 2131430136(0x7f0b0af8, float:1.8481964E38)
            android.view.View r0 = r10.A09
            android.view.View r1 = X.C06560Yg.A02(r0, r1)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r1)
            X.AnonymousClass0x2.A1G(r1, r0, r7)
            r1 = 2131433503(0x7f0b181f, float:1.8488794E38)
            android.view.View r0 = r10.A09
            android.view.View r1 = X.C06560Yg.A02(r0, r1)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r1)
            X.AnonymousClass0x2.A1G(r1, r0, r7)
            android.graphics.Bitmap r3 = r11.A06
            X.8ug r5 = r11.A0A
        L_0x0056:
            X.5Qv r1 = r10.A0i
            r6 = r12
            boolean r0 = r1.A01(r12)
            if (r0 == 0) goto L_0x0068
            java.util.Set r0 = r1.A0A
            int r0 = r0.size()
            r8 = 2
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r8 = 3
        L_0x0069:
            X.0eF r4 = r10.A0Z
            java.util.Set r0 = r1.A0A
            boolean r0 = r0.isEmpty()
            r9 = r0 ^ 1
            r2.A0I(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0077:
            r7 = 0
            r3 = r7
            r5 = r7
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZS.A0L(X.4tG, java.util.Collection):void");
    }

    public final void A0M(ArrayList arrayList) {
        C104405Qv r3 = this.A0i;
        r3.A04 = true;
        Set set = r3.A0A;
        set.clear();
        if (arrayList != null) {
            set.addAll(arrayList);
        }
        this.A0Q = true;
        C86654Ky.A1L(this.A0E, set);
        if (r3.A01 != 1) {
            A0D();
        }
        A01(this);
        A06();
        this.A0j.A01(9);
    }

    public final void A0N(boolean z) {
        AnonymousClass5UD r0 = this.A0F;
        if (r0 != null) {
            r0.A03(z);
            AnonymousClass5Y6 r2 = this.A0E;
            Set set = this.A0i.A0A;
            r2.A07(z & (!set.isEmpty()), set.size());
        }
    }

    public final void A0O(boolean z) {
        StringBuilder A0o2;
        C106755a7.A03(this.A0m);
        AnonymousClass5UM r4 = this.A0k;
        r4.A01(554249147, "video_record");
        C18260x0.A1E("cameraui/stopvideocapture ", AnonymousClass001.A0o(), z);
        this.A08.setKeepScreenOn(false);
        r4.A06 = SystemClock.elapsedRealtime();
        r4.A02(554249147, "stop_video_recording");
        this.A0C.BqD();
        C105995Xf r12 = this.A0j;
        AnonymousClass678 r0 = this.A0C;
        boolean BHe = r0.BHe();
        int zoomLevel = r0.getZoomLevel();
        String flashMode = this.A0C.getFlashMode();
        boolean A1U = AnonymousClass000.A1U(C86604Kt.A02(this.A0o.A00), 2);
        Log.d("CameraCaptureFlowLogger/logVideoCaptureCompleted");
        r12.A02(flashMode, zoomLevel, 2, SystemClock.elapsedRealtime() - r4.A05, BHe, A1U);
        AnonymousClass678 r1 = this.A0C;
        Integer valueOf = Integer.valueOf(r1.getCameraApi());
        int cameraType = r1.getCameraType();
        boolean z2 = !r1.BHe();
        String l = Long.toString(r1.getVideoResolution());
        long elapsedRealtime = SystemClock.elapsedRealtime() - r4.A06;
        long j = r4.A04;
        AnonymousClass4s1 r7 = new AnonymousClass4s1();
        r7.A02 = Integer.valueOf(cameraType);
        r7.A00 = valueOf;
        r7.A01 = Integer.valueOf(z2 ? 1 : 0);
        r7.A05 = l;
        r7.A03 = Long.valueOf(j);
        r7.A04 = Long.valueOf(elapsedRealtime);
        if (r4.A0A) {
            r4.A08.BhD(r7);
        }
        boolean z3 = r4.A0B;
        if (z3) {
            r4.A01(554249147, "stop_video_recording");
            r4.A03(valueOf, 554249147, cameraType);
            r4.A00(554249147, z2);
        }
        if (this.A0A != null) {
            AnonymousClass5Y6 r13 = this.A0E;
            Window window = A04().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            r13.A0B.setVisibility(4);
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
            if (!z) {
                this.A0E.A00();
                this.A0I.A01(AnonymousClass000.A1U(this.A0i.A00, 2), false, false);
                AnonymousClass5TA r2 = this.A0I;
                Handler handler = r2.A04;
                handler.removeMessages(0);
                handler.removeMessages(1);
                r2.A01(false, false, false);
                AnonymousClass4NB r02 = this.A0D;
                if (r02 != null) {
                    r02.enable();
                }
            }
        }
        if (!z || this.A0L == null) {
            File file = this.A0L;
            if (file == null || !file.exists()) {
                A0o2 = AnonymousClass001.A0o();
                A0o2.append("cameraui/video file doesn't exist: ");
                A0o2.append(this.A0L);
            } else {
                if (!this.A0L.delete()) {
                    A0o2 = AnonymousClass001.A0o();
                    A0o2.append("cameraui/failed to delete video ");
                    A0o2.append(this.A0L.getAbsolutePath());
                }
                this.A0L = null;
                A06();
            }
            C18280x3.A13(A0o2);
            this.A0L = null;
            A06();
        } else {
            r4.A02(554249147, "show_media_preview");
            A0K(new C114185md(this.A0L), (C95294tG) null, true);
            r4.A01(554249147, "show_media_preview");
        }
        if (z3) {
            r4.A09.markerEnd(554249147, 2);
        }
    }

    public final void A0P(boolean z) {
        AnonymousClass5Y6 r3 = this.A0E;
        float f = 2.0f;
        if (r3.A08) {
            f = 1.25f;
        }
        r3.A02(f, 1.0f);
        this.A08.postDelayed(new C71703cX(15, (Object) this, z), 220);
    }

    public boolean A0Q() {
        AnonymousClass678 r0 = this.A0C;
        if (r0 != null && r0.BIf()) {
            return true;
        }
        AnonymousClass5TA r02 = this.A0I;
        if (r02 == null) {
            return false;
        }
        Handler handler = r02.A04;
        if (handler.hasMessages(0) || handler.hasMessages(1)) {
            return true;
        }
        return false;
    }

    public static final void A00(View view, int i, int i2) {
        C001702c r1 = (C001702c) view.getLayoutParams();
        r1.A0o = i;
        r1.A0B = 0;
        r1.setMargins(0, 0, 0, i2);
        view.setLayoutParams(r1);
    }

    public void A05() {
        boolean A0Q2 = A0Q();
        boolean A1U = AnonymousClass000.A1U(this.A0i.A00, 2);
        if (A0Q2) {
            if (A1U) {
                A0P(this.A0I.A02());
            }
        } else if (A1U) {
            A0A();
        } else {
            A0C();
        }
    }

    public final void A0B() {
        String str;
        if (!A0Q() || (this.A0i.A00 == 2 && this.A0z)) {
            if (C86604Kt.A1Y(this.A0H.A03)) {
                this.A0H.A00(false, true);
            }
            if (!this.A0U) {
                this.A0U = true;
                AnonymousClass5UM r2 = this.A0k;
                boolean BHe = this.A0C.BHe();
                r2.A03 = SystemClock.elapsedRealtime();
                if (r2.A0B) {
                    C186568vZ r3 = r2.A09;
                    r3.markerStart(554250848);
                    if (BHe) {
                        str = "front";
                    } else {
                        str = "back";
                    }
                    r3.markerAnnotate(554250848, "origin", str);
                }
                this.A0C.BLW();
                AnonymousClass5Y6 r5 = this.A0E;
                boolean BHe2 = this.A0C.BHe();
                int i = r5.A00;
                int i2 = i - 180;
                if (BHe2) {
                    i2 = i + 180;
                }
                RotateAnimation rotateAnimation = new RotateAnimation((float) i, (float) i2, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(100);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(AnonymousClass5Y6.A0M);
                rotateAnimation.setDuration(200);
                rotateAnimation.setStartOffset(100);
                rotateAnimation.setAnimationListener(new C131646dv(r5, BHe2));
                r5.A0J.startAnimation(rotateAnimation);
            }
        }
    }
}
