package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.conversation.conversationrow.MediaProgressRing;
import com.whatsapp.conversation.conversationrow.MediaTimeDisplay;
import com.whatsapp.ptv.PushToVideoRecordingCountdown;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: X.5a4  reason: invalid class name and case insensitive filesystem */
public class C106735a4 {
    public int A00 = 0;
    public long A01 = -1;
    public C109235eI A02;
    public LiteCameraView A03;
    public AnonymousClass5OK A04;
    public AnonymousClass5LH A05;
    public C102695Jx A06;
    public C102835Kl A07;
    public File A08;
    public Boolean A09;
    public Runnable A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final int A0I;
    public final int A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final View A0O;
    public final View A0P;
    public final C55682qk A0Q;
    public final AnonymousClass5D9 A0R;
    public final AnonymousClass5DA A0S;
    public final C89654ea A0T;
    public final C64393Dh A0U;
    public final C69263Wi A0V;
    public final AnonymousClass5Ul A0W;
    public final AnonymousClass5TW A0X;
    public final C185028sw A0Y;
    public final MediaProgressRing A0Z;
    public final MediaTimeDisplay A0a;
    public final MediaTimeDisplay A0b;
    public final MediaTimeDisplay A0c;
    public final C85014Ep A0d = new AnonymousClass93N(this, 1);
    public final C56512s6 A0e;
    public final C620633i A0f;
    public final C56612sH A0g;
    public final C54292oU A0h;
    public final AnonymousClass5ZR A0i;
    public final C620733j A0j;
    public final C61072zf A0k;
    public final C106965aS A0l;
    public final AnonymousClass1VX A0m;
    public final AnonymousClass4FV A0n;
    public final C60152y5 A0o;
    public final C624134x A0p;
    public final PushToVideoRecordingCountdown A0q;
    public final C105235Uc A0r;
    public final AnonymousClass107 A0s;
    public final AnonymousClass107 A0t = AnonymousClass4L0.A0O(1);
    public final AnonymousClass107 A0u;
    public final AnonymousClass4FS A0v;
    public final C185958uW A0w = new AnonymousClass91D(this, 1);
    public final C97094xc A0x;
    public final List A0y;
    public final boolean A0z;
    public final boolean A10;

    public static /* synthetic */ void A01(C106735a4 r4, Runnable runnable) {
        r4.A0Q.A0A("ptvcameraui/stopVideoCaptureAsyncTimeout", false, (String) null);
        r4.A03.BqD();
        r4.A03.pause();
        runnable.run();
    }

    public static /* synthetic */ void A02(C106735a4 r1, Runnable runnable, Runnable runnable2) {
        r1.A0v.BjN(runnable);
        runnable2.run();
        r1.A03.pause();
        Log.d("ptvcameraui/stopVideoCaptureAsync end release camera resources");
    }

    public void A03() {
        AnonymousClass5LH r3 = this.A05;
        r3.A01.setVisibility(0);
        r3.A04.setVisibility(0);
        r3.A07.setVisibility(AnonymousClass001.A08(r3.A0B ? 1 : 0));
        r3.A05.setVisibility(0);
        this.A0O.setVisibility(8);
        this.A0N.setVisibility(0);
        this.A0r.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r3.A0E() != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r17 = this;
            r0 = r17
            X.5ZR r3 = r0.A0i
            java.lang.String r1 = "android.permission.CAMERA"
            int r1 = r3.A02(r1)
            r6 = 1
            r2 = 0
            boolean r8 = X.AnonymousClass000.A1S(r1)
            boolean r1 = r3.A0D()
            r7 = r1 ^ 1
            boolean r1 = X.C107385bE.A08()
            if (r1 != 0) goto L_0x0023
            boolean r1 = r3.A0E()
            r5 = 1
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            if (r8 != 0) goto L_0x0279
            if (r7 != 0) goto L_0x0279
            if (r5 != 0) goto L_0x0279
            X.5TW r1 = r0.A0X
            boolean r1 = r1.A01()
            if (r1 != 0) goto L_0x026b
            X.4ea r5 = r0.A0T
            X.2s6 r3 = r0.A0e
            X.4Ep r1 = r0.A0d
            boolean r1 = r3.A08(r1)
            if (r1 == 0) goto L_0x0056
            X.2zf r1 = r0.A0k
            long r7 = r1.A02()
            X.1VX r15 = r0.A0m
            r1 = 3658(0xe4a, float:5.126E-42)
            long r3 = X.C86624Kv.A05(r15, r1)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0057
            X.4FV r1 = r0.A0n
            r0 = 5
            X.AnonymousClass35X.A05(r5, r5, r1, r0)
        L_0x0056:
            return
        L_0x0057:
            android.view.View r1 = r0.A0P
            r1.setVisibility(r2)
            android.content.Context r4 = r1.getContext()
            r3 = 2131102249(0x7f060a29, float:1.781693E38)
            X.C86604Kt.A0z(r4, r1, r3)
            boolean r3 = r0.A10
            if (r3 == 0) goto L_0x008b
            android.view.ViewPropertyAnimator r7 = X.C86624Kv.A0B(r1)
            r3 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r4 = r7.setDuration(r3)
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            android.view.ViewPropertyAnimator r7 = r4.setInterpolator(r3)
            r4 = 28
            X.3bq r3 = new X.3bq
            r3.<init>((java.lang.Object) r0, (int) r4)
            android.view.ViewPropertyAnimator r3 = r7.withStartAction(r3)
            r3.start()
        L_0x008b:
            X.0R8 r3 = r5.getSupportActionBar()
            if (r3 == 0) goto L_0x0094
            r3.A06()
        L_0x0094:
            X.4xc r4 = r0.A0x
            X.8uW r3 = r0.A0w
            r4.A06(r3)
            X.33i r4 = r0.A0f
            X.AnonymousClass29U.A00(r4)
            X.2y5 r3 = r0.A0o
            int r4 = X.AnonymousClass34G.A02(r4, r3)
            java.lang.String r3 = "createCenterCropView"
            X.678 r3 = X.C154287cv.A00(r5, r3, r4)
            X.C626936e.A06(r3)
            com.whatsapp.camera.litecamera.LiteCameraView r3 = (com.whatsapp.camera.litecamera.LiteCameraView) r3
            r0.A03 = r3
            r3.setQrScanningEnabled(r2)
            r3 = 2131428503(0x7f0b0497, float:1.8478652E38)
            android.view.View r8 = X.C06560Yg.A02(r1, r3)
            X.5DA r4 = r0.A0S
            r3 = 2131428484(0x7f0b0484, float:1.8478614E38)
            android.view.View r9 = X.C06560Yg.A02(r1, r3)
            com.whatsapp.camera.litecamera.LiteCameraView r10 = r0.A03
            r3 = 2131428504(0x7f0b0498, float:1.8478654E38)
            android.widget.FrameLayout r12 = X.C86654Ky.A0L(r1, r3)
            r3 = 2131428502(0x7f0b0496, float:1.847865E38)
            android.view.View r11 = X.C06560Yg.A02(r1, r3)
            X.5sx r3 = r4.A00
            X.3Db r3 = r3.A03
            X.1VX r14 = X.C64333Db.A4B(r3)
            X.2oU r13 = X.C64333Db.A2q(r3)
            X.5Jx r7 = new X.5Jx
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.A06 = r7
            X.5D9 r4 = r0.A0R
            r3 = 2131432610(0x7f0b14a2, float:1.8486982E38)
            android.widget.FrameLayout r8 = X.C86654Ky.A0L(r1, r3)
            r3 = 2131432477(0x7f0b141d, float:1.8486713E38)
            X.5UY r13 = X.AnonymousClass0x2.A0M(r1, r3)
            X.7EQ r12 = new X.7EQ
            r12.<init>(r0)
            X.5sx r3 = r4.A00
            X.4as r4 = r3.A01
            X.3Db r3 = r3.A03
            X.1VX r11 = X.C64333Db.A4B(r3)
            X.3Wi r9 = X.C64333Db.A04(r3)
            X.33i r10 = X.C64333Db.A2o(r3)
            X.5Kl r7 = new X.5Kl
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.3Db r3 = r4.A4Z
            X.2oU r3 = X.C86614Ku.A0U(r3)
            r7.A00 = r3
            r0.A07 = r7
            r3 = 2131428483(0x7f0b0483, float:1.8478612E38)
            android.view.View r12 = X.C06560Yg.A02(r1, r3)
            X.33j r14 = r0.A0j
            com.whatsapp.camera.litecamera.LiteCameraView r13 = r0.A03
            int r7 = r0.A0I
            X.5LH r11 = new X.5LH
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r0.A05 = r11
            com.whatsapp.WaImageView r4 = r11.A07
            r3 = 42
            X.C633939b.A00(r4, r0, r3)
            com.whatsapp.WaImageButton r4 = r11.A05
            r3 = 43
            X.C633939b.A00(r4, r0, r3)
            com.whatsapp.WaImageButton r4 = r11.A06
            r3 = 44
            X.C633939b.A00(r4, r0, r3)
            android.view.View r4 = r11.A04
            r3 = 45
            X.C633939b.A00(r4, r0, r3)
            android.view.View r4 = r11.A03
            r3 = 46
            X.C633939b.A00(r4, r0, r3)
            X.107 r3 = r0.A0s
            X.0Wx r9 = X.C05110Rz.A01(r3)
            r3 = 4
            X.923 r4 = new X.923
            r4.<init>(r3)
            X.08J r8 = X.AnonymousClass4L0.A0E()
            X.5Br r3 = new X.5Br
            r3.<init>(r4, r8)
            r8.A0J(r9, r3)
            r3 = 321(0x141, float:4.5E-43)
            X.92m r4 = X.AnonymousClass4L0.A0G(r0, r3)
            java.lang.Runnable r3 = r0.A0A
            if (r3 == 0) goto L_0x017d
            r3.run()
        L_0x017d:
            X.3aN r3 = new X.3aN
            r3.<init>(r0, r8, r4, r6)
            r0.A0A = r3
            r8.A0B(r5, r4)
            X.5kk r4 = new X.5kk
            r4.<init>(r0)
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r3 = r0.A0b
            r3.A03(r5, r4)
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r3 = r0.A0c
            r3.A03(r5, r4)
            com.whatsapp.camera.litecamera.LiteCameraView r8 = r0.A03
            r3 = 2131428500(0x7f0b0494, float:1.8478646E38)
            android.view.ViewGroup r4 = X.C86644Kx.A0I(r1, r3)
            X.5OK r3 = new X.5OK
            r3.<init>(r4, r8, r2)
            r0.A04 = r3
            X.5Uc r8 = r0.A0r
            X.8JO r3 = new X.8JO
            r3.<init>(r0)
            r8.A04 = r3
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r4 = r0.A0a
            X.8Fz r3 = new X.8Fz
            r3.<init>(r0)
            r4.A03(r5, r3)
            X.8Fh r4 = new X.8Fh
            r4.<init>(r0)
            X.5eI r3 = new X.5eI
            r3.<init>(r5, r4, r2)
            r0.A02 = r3
            X.5Jx r9 = r0.A06
            r3 = 12
            X.7mH r4 = new X.7mH
            r4.<init>(r0, r3)
            android.view.View r3 = r9.A03
            r3.setOnTouchListener(r4)
            com.whatsapp.camera.litecamera.LiteCameraView r4 = r0.A03
            X.68l r3 = new X.68l
            r3.<init>(r0, r6)
            r4.setCameraCallback(r3)
            com.whatsapp.conversation.conversationrow.MediaProgressRing r4 = r0.A0Z
            X.90P r3 = new X.90P
            r3.<init>(r0, r2)
            r4.A01(r5, r3)
            X.AnonymousClass5CI.A00(r5)
            X.5LH r4 = r0.A05
            android.view.View r3 = r4.A01
            r5 = 4
            r3.setVisibility(r5)
            com.whatsapp.WaImageButton r3 = r4.A05
            r3.setVisibility(r5)
            android.view.View r4 = r0.A0O
            r3 = 0
            if (r7 != r6) goto L_0x01fe
            r3 = 8
        L_0x01fe:
            r4.setVisibility(r3)
            android.view.View r4 = r0.A0N
            r3 = 4
            if (r7 != r6) goto L_0x0207
            r3 = 0
        L_0x0207:
            r4.setVisibility(r3)
            android.view.View r3 = r0.A0K
            r3.setVisibility(r5)
            r8.A02()
            long r3 = android.os.SystemClock.elapsedRealtime()
            r8.A04(r3)
            android.view.View r3 = r0.A0L
            r3.setVisibility(r5)
            r1.setVisibility(r2)
            com.whatsapp.camera.litecamera.LiteCameraView r1 = r0.A03
            boolean r4 = r1.BHe()
            r0.A0D = r2
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PushToVideoCameraUI/init defaultCamera isFrontCamera="
            X.C18260x0.A1D(r1, r3, r4)
            if (r4 != 0) goto L_0x0240
            X.3Wi r4 = r0.A0V
            r3 = 29
            X.3bq r1 = new X.3bq
            r1.<init>((java.lang.Object) r0, (int) r3)
            r4.A0S(r1)
        L_0x0240:
            r0.A0C = r6
            X.8sw r1 = r0.A0Y
            X.5ju r1 = (X.C112545ju) r1
            X.5l7 r1 = r1.A00
            X.C113245l7.A0P(r1, r2)
            com.whatsapp.camera.litecamera.LiteCameraView r1 = r0.A03
            r1.Bk9()
            X.5Jx r4 = r0.A06
            android.view.View r3 = r4.A03
            int r1 = r3.getVisibility()
            if (r1 != 0) goto L_0x0267
            android.view.View r2 = r4.A01
            r1 = 8
            r2.setVisibility(r1)
        L_0x0261:
            r0.A0F = r6
            r0.A05()
            return
        L_0x0267:
            r3.setVisibility(r2)
            goto L_0x0261
        L_0x026b:
            X.4ea r2 = r0.A0T
            r1 = 2131889131(0x7f120beb, float:1.9412917E38)
            r2.Bot(r1)
            X.8sw r0 = r0.A0Y
            r0.BOE()
            return
        L_0x0279:
            boolean r1 = r0.A0E()
            if (r1 == 0) goto L_0x028a
            com.whatsapp.ptv.PushToVideoRecordingCountdown r4 = r0.A0q
            android.os.Handler r3 = r4.A08
            r1 = 0
            r3.removeCallbacksAndMessages(r1)
            r4.A02(r2)
        L_0x028a:
            X.4ea r1 = r0.A0T
            X.3Wi r0 = r0.A0V
            com.whatsapp.RequestPermissionActivity.A0f(r1, r0, r8, r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106735a4.A04():void");
    }

    public final void A05() {
        int A0N2;
        if (this.A0F && this.A0B) {
            this.A0F = false;
            if (A0E()) {
                PushToVideoRecordingCountdown pushToVideoRecordingCountdown = this.A0q;
                C71273bq r4 = new C71273bq((Object) this, 26);
                Handler handler = pushToVideoRecordingCountdown.A08;
                handler.removeCallbacksAndMessages((Object) null);
                pushToVideoRecordingCountdown.A02(0);
                if (C86644Kx.A1X(pushToVideoRecordingCountdown)) {
                    A0N2 = 1000;
                } else {
                    A0N2 = pushToVideoRecordingCountdown.A05.A0N(5412);
                }
                pushToVideoRecordingCountdown.A02(3);
                handler.postDelayed(new C71713cY(pushToVideoRecordingCountdown, r4, A0N2, 18), (long) A0N2);
                return;
            }
            A08();
        }
    }

    public final void A06() {
        if (C86604Kt.A1Y(this.A04.A03)) {
            this.A04.A00(false, true);
        }
        if (!this.A0E) {
            this.A0E = true;
            this.A03.BLW();
        }
    }

    public final void A07() {
        File file;
        if (this.A0H && (file = this.A08) != null) {
            C102835Kl r5 = this.A07;
            AnonymousClass1VX r12 = r5.A05;
            C69263Wi r9 = r5.A03;
            C620633i r10 = r5.A04;
            FrameLayout frameLayout = r5.A02;
            AnonymousClass5YG A022 = AnonymousClass5YG.A02(frameLayout.getContext(), r9, r10, r5.A00, r12, (AnonymousClass5NV) null, (AnonymousClass4FS) null, (C153387bE) null, file, false, true, false, false);
            r5.A01 = A022;
            C86654Ky.A17(A022.A09(), frameLayout, -1, 17);
            r5.A01.A09().setClickable(true);
            r5.A07.A06(0);
            C633939b.A00(r5.A01.A09(), r5, 47);
            AnonymousClass5YG r2 = r5.A01;
            r2.A07 = new AnonymousClass91B(1);
            r2.A0V(new AnonymousClass69Q(r5, 2));
            MediaProgressRing mediaProgressRing = this.A0Z;
            C89654ea r22 = this.A0T;
            mediaProgressRing.A01(r22, new AnonymousClass90P(this, 1));
            this.A0b.A03(r22, new C171158Fz(this));
        }
    }

    public final void A08() {
        Log.i("ptvcameraui/startvideocapture");
        if (!this.A0X.A01()) {
            this.A0l.A03("PTVRecording", "Resume");
            this.A08 = C106275Yh.A00(this.A0U, this.A0o, C633138t.A0g, ".mp4", 1);
            this.A0H = true;
            this.A06.A03.setKeepScreenOn(true);
            this.A03.Bq4(this.A08, 360);
            C86654Ky.A1H(this.A0s);
            A09();
            C106755a7.A03(this.A0f);
            return;
        }
        this.A0T.Bot(R.string.f11nameremoved);
        this.A0Y.BOE();
    }

    public final void A09() {
        C89654ea r1;
        int i;
        boolean z = true;
        if (this.A0I != 1 || !C86604Kt.A1Z(this.A0s)) {
            z = false;
        }
        Drawable drawable = null;
        if (z) {
            drawable = C02680He.A00((Resources.Theme) null, C54292oU.A00(this.A0h), R.drawable.recording_timestamp_background);
            r1 = this.A0T;
            i = R.color.f5nameremoved;
        } else {
            r1 = this.A0T;
            i = R.color.f5nameremoved;
        }
        int A042 = AnonymousClass0Y8.A04(r1, i);
        MediaTimeDisplay mediaTimeDisplay = this.A0b;
        mediaTimeDisplay.setBackground(drawable);
        mediaTimeDisplay.setTextColor(A042);
    }

    public boolean A0C() {
        return AnonymousClass000.A1W(this.A03);
    }

    public boolean A0D() {
        LiteCameraView liteCameraView = this.A03;
        if ((liteCameraView == null || !liteCameraView.BIf()) && !C86604Kt.A1Z(this.A0s)) {
            return false;
        }
        return true;
    }

    public final boolean A0E() {
        Boolean bool = this.A09;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass001.A1W(this.A0m.A0N(5412)));
            this.A09 = bool;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r8.A0G != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.Runnable r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0E()
            if (r0 == 0) goto L_0x0016
            com.whatsapp.ptv.PushToVideoRecordingCountdown r2 = r8.A0q
            android.os.Handler r1 = r2.A08
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            r0 = 0
            r2.A02(r0)
            r0 = 0
            r2.A01 = r0
        L_0x0016:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x00b9
            X.5Jx r0 = r8.A06
            r3 = 0
            android.view.View r0 = r0.A03
            r0.setKeepScreenOn(r3)
            X.5Jx r0 = r8.A06
            android.view.View r1 = r0.A03
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0031
            r0 = 8
            r1.setVisibility(r0)
        L_0x0031:
            boolean r0 = r8.A0z
            if (r0 == 0) goto L_0x003e
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x003e
            boolean r0 = r8.A0G
            r7 = 1
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x00d2
            if (r7 == 0) goto L_0x00bd
            java.lang.String r0 = "ptvcameraui/stopVideoCaptureAsync start release camera resources"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r5 = r8.A0v
            r0 = 34
            X.3a0 r4 = new X.3a0
            r4.<init>(r8, r0, r9)
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r0 = "unexpectedly long camera stop video capture"
            java.lang.Runnable r4 = r5.Bkn(r4, r0, r1)
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r8.A03
            r1 = 2
            X.3aN r0 = new X.3aN
            r0.<init>(r8, r4, r9, r1)
            r2.A03(r0)
        L_0x0066:
            r6 = 1
            r8.A0G = r6
            X.107 r1 = r8.A0s
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
            X.4ea r4 = r8.A0T
            android.view.Window r2 = r4.getWindow()
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.screenBrightness = r0
            r2.setAttributes(r1)
            X.5LH r5 = r8.A05
            android.view.View r0 = r5.A04
            r2 = 4
            r0.setVisibility(r2)
            com.whatsapp.WaImageView r1 = r5.A07
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0091
            r2 = 8
        L_0x0091:
            r1.setVisibility(r2)
            int r0 = r5.A00
            if (r0 == r6) goto L_0x009d
            android.view.View r0 = r5.A02
            r0.setVisibility(r3)
        L_0x009d:
            r8.A09()
            android.view.View r1 = r8.A0N
            int r0 = r8.A0I
            if (r0 == r6) goto L_0x00a7
            r3 = 4
        L_0x00a7:
            r1.setVisibility(r3)
            X.5aS r2 = r8.A0l
            java.lang.String r1 = "PTVRecording"
            java.lang.String r0 = "End"
            r2.A03(r1, r0)
            r0 = -1
            r4.setRequestedOrientation(r0)
            if (r7 != 0) goto L_0x00bc
        L_0x00b9:
            r9.run()
        L_0x00bc:
            return
        L_0x00bd:
            java.lang.String r0 = "ptvcameraui/stopVideoCapture start release camera resources"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r8.A03
            r0.BqD()
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r8.A03
            r0.pause()
            java.lang.String r0 = "ptvcameraui/stopVideoCapture end release camera resources"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0066
        L_0x00d2:
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r8.A03
            r0.pause()
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106735a4.A0A(java.lang.Runnable):void");
    }

    public final void A0B(boolean z, boolean z2) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("ptvcameraui/stopVideoCaptureAndCloseCameraUI send=");
        A0o2.append(z);
        A0o2.append(" cameraShown=");
        C18260x0.A1U(A0o2, this.A0C);
        if (this.A0C) {
            AnonymousClass29U.A00(this.A0f);
            A0A(new C71363bz(5, this, z));
            C89654ea r1 = this.A0T;
            r1.setRequestedOrientation(-1);
            AnonymousClass0R8 supportActionBar = r1.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A07();
            }
            this.A0D = true;
            this.A0K.setVisibility(0);
            this.A0L.setVisibility(0);
            C102835Kl r12 = this.A07;
            AnonymousClass5YG r0 = r12.A01;
            if (r0 != null) {
                r0.A0G();
            }
            r12.A01 = null;
            r12.A02.removeAllViews();
            r12.A07.A06(8);
            C105235Uc r3 = this.A0r;
            r3.A0D.removeCallbacks(r3.A0S);
            r3.A03();
            r3.A06(z2);
            boolean z3 = this.A10;
            View view = this.A0P;
            if (z3) {
                C86624Kv.A0A(view).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new C71273bq((Object) this, 32)).start();
            } else {
                view.setVisibility(8);
            }
            C113245l7 r32 = ((C112545ju) this.A0Y).A00;
            C113245l7.A0P(r32, true);
            this.A0x.A07(this.A0w);
            Runnable runnable = this.A0A;
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.A0Z.A05;
            if (runnable2 != null) {
                runnable2.run();
            }
            Runnable runnable3 = this.A0b.A06;
            if (runnable3 != null) {
                runnable3.run();
            }
            Runnable runnable4 = this.A0c.A06;
            if (runnable4 != null) {
                runnable4.run();
            }
            Runnable runnable5 = this.A0a.A06;
            if (runnable5 != null) {
                runnable5.run();
            }
            this.A0F = false;
            r32.A51 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r3 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getAction()
            r2 = 0
            if (r3 == 0) goto L_0x002b
            r1 = 1
            if (r3 == r1) goto L_0x0021
            r0 = 2
            if (r3 == r0) goto L_0x0011
            r0 = 3
            if (r3 == r0) goto L_0x0021
        L_0x0010:
            return r2
        L_0x0011:
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x0010
            X.5Uc r1 = r4.A0r
            android.view.View r0 = r4.A0M
            int r0 = r0.getWidth()
            r1.A05(r5, r0, r2)
            return r2
        L_0x0021:
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x0010
            X.5Uc r0 = r4.A0r
            r0.A07(r1, r2, r2)
            return r2
        L_0x002b:
            X.5Uc r1 = r4.A0r
            float r0 = r5.getX()
            r1.A00 = r0
            float r0 = r5.getY()
            r1.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106735a4.A0F(android.view.MotionEvent):boolean");
    }

    public C106735a4(View view, View view2, View view3, ViewGroup viewGroup, C55682qk r36, AnonymousClass5D9 r37, AnonymousClass5DA r38, C89654ea r39, C64393Dh r40, C69263Wi r41, AnonymousClass5Ul r42, AnonymousClass5TW r43, C185028sw r44, C56512s6 r45, C620633i r46, C56612sH r47, C54292oU r48, AnonymousClass5ZR r49, AnonymousClass33p r50, C620733j r51, C61072zf r52, C106965aS r53, AnonymousClass1VX r54, AnonymousClass4FV r55, C60152y5 r56, C624134x r57, AnonymousClass4FS r58, C97094xc r59, List list, int i) {
        int i2;
        Boolean bool = Boolean.FALSE;
        this.A0s = AnonymousClass4L0.A0O(bool);
        this.A0u = AnonymousClass4L0.A0O(bool);
        this.A0l = r53;
        Log.d("ptvcameraui/constructor");
        C54292oU r9 = r48;
        this.A0h = r9;
        C56612sH r10 = r47;
        this.A0g = r10;
        AnonymousClass1VX r3 = r54;
        this.A0m = r3;
        this.A0V = r41;
        this.A0Q = r36;
        this.A0W = r42;
        this.A0v = r58;
        this.A0n = r55;
        this.A0U = r40;
        this.A0k = r52;
        this.A0x = r59;
        this.A0X = r43;
        this.A0f = r46;
        C620733j r8 = r51;
        this.A0j = r8;
        this.A0e = r45;
        this.A0i = r49;
        this.A0o = r56;
        this.A0R = r37;
        this.A0S = r38;
        this.A0Y = r44;
        this.A0J = r3.A0N(3356) * 1000;
        C89654ea r12 = r39;
        this.A0T = r12;
        this.A0y = list;
        this.A0K = view;
        this.A0M = view2;
        this.A0L = view3;
        int i3 = i;
        this.A0I = i3;
        ViewGroup viewGroup2 = viewGroup;
        this.A0P = viewGroup2;
        this.A0Z = (MediaProgressRing) C06560Yg.A02(viewGroup2, R.id.recording_progress_ring);
        View view4 = this.A0P;
        MediaTimeDisplay mediaTimeDisplay = (MediaTimeDisplay) C06560Yg.A02(view4, R.id.recording_time_display_locked);
        mediaTimeDisplay.setVisibility(8);
        MediaTimeDisplay mediaTimeDisplay2 = (MediaTimeDisplay) C06560Yg.A02(view4, R.id.camera_entry_point_recording_time_display_locked);
        if (this.A0I != 1) {
            mediaTimeDisplay2.setVisibility(8);
            mediaTimeDisplay2 = mediaTimeDisplay;
        }
        this.A0b = mediaTimeDisplay2;
        mediaTimeDisplay2.setVisibility(0);
        View view5 = this.A0P;
        View A022 = C06560Yg.A02(view5, R.id.recording_time_display_locked_container);
        A022.setVisibility(8);
        View A023 = C06560Yg.A02(view5, R.id.camera_entry_point_recording_time_display_locked_container);
        A023.setVisibility(8);
        A022 = this.A0I == 1 ? A023 : A022;
        this.A0N = A022;
        A022.setVisibility(0);
        this.A0O = C06560Yg.A02(this.A0P, R.id.recording_time_display_unlocked_container);
        this.A0c = (MediaTimeDisplay) C06560Yg.A02(this.A0P, R.id.recording_time_display_unlocked);
        this.A0p = r57;
        this.A0q = (PushToVideoRecordingCountdown) C06560Yg.A02(this.A0P, R.id.recording_countdown);
        this.A0a = (MediaTimeDisplay) C06560Yg.A02(this.A0P, R.id.playback_time_display);
        ImageView A0E2 = AnonymousClass0x9.A0E(this.A0P, R.id.voice_note_btn_slider);
        if (i3 == 1) {
            i2 = R.drawable.camera_entry_point_input_camera_white;
        } else {
            boolean z = C1001059l.A04;
            i2 = R.drawable.input_camera_white_large;
            if (z) {
                i2 = R.drawable.input_camera_white_large_filled_wds;
            }
        }
        A0E2.setImageResource(i2);
        ImageView imageView = A0E2;
        this.A0r = new C105235Uc(r12, C06560Yg.A02(this.A0P, R.id.voice_note_slide_to_cancel_scroller), C06560Yg.A02(this.A0P, R.id.voice_note_slide_to_cancel_layout), C06560Yg.A02(this.A0P, R.id.voice_note_slide_to_cancel_animation), C06560Yg.A02(this.A0P, R.id.voice_cancel_trashcan), C06560Yg.A02(this.A0P, R.id.voice_cancel_animation), C06560Yg.A02(this.A0P, R.id.voice_cancel_trashcan_lid), C06560Yg.A02(this.A0P, R.id.voice_note_layout), C86644Kx.A0I(this.A0P, R.id.voice_note_lock_container), imageView, C18300x5.A0G(this.A0P, R.id.voice_note_slide_to_cancel), r10, r9, r50, r8, new AnonymousClass93L(this, 0), r12.getResources().getDimension(R.dimen.f6nameremoved), i3, true);
        this.A10 = r3.A0X(6847);
        this.A0z = r3.A0X(6885);
    }
}
