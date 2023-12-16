package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0IV;
import X.AnonymousClass0O1;
import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass49P;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass4VK;
import X.AnonymousClass58I;
import X.AnonymousClass58J;
import X.AnonymousClass5TU;
import X.AnonymousClass660;
import X.AnonymousClass66R;
import X.C05880Vi;
import X.C06270Wx;
import X.C06800Zg;
import X.C102995Lb;
import X.C106645Zu;
import X.C107385bE;
import X.C112515jr;
import X.C116655qe;
import X.C119095wQ;
import X.C1223063w;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C54292oU;
import X.C56972sr;
import X.C616131n;
import X.C73853gB;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import X.C97074xa;
import X.C97174xk;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.concurrent.CancellationException;

public final class ScreenShareViewModel extends AnonymousClass4VK implements AnonymousClass660, C1223063w {
    public Intent A00;
    public MediaProjection A01;
    public AnonymousClass0O1 A02;
    public AnonymousClass58I A03 = AnonymousClass58I.STOPPED;
    public C85474Gj A04;
    public boolean A05;
    public final C56972sr A06;
    public final AnonymousClass49P A07;
    public final C97174xk A08;
    public final AnonymousClass5TU A09;
    public final C112515jr A0A;
    public final C97074xa A0B;
    public final C116655qe A0C;
    public final C54292oU A0D;
    public final AnonymousClass1VX A0E;
    public final AnonymousClass107 A0F = AnonymousClass4L0.A0O(Boolean.FALSE);
    public final AnonymousClass4UC A0G = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0H = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0I = AnonymousClass0x9.A0b();
    public final VoipCameraManager A0J;
    public final AnonymousClass66R A0K = C154517dI.A01(new C119095wQ(this));
    public final C73853gB A0L;

    public static final void A05(C06800Zg r4, ScreenShareViewModel screenShareViewModel) {
        int i = r4.A00;
        if (i == -1) {
            screenShareViewModel.A09.A0I = true;
            if (C107385bE.A0B()) {
                screenShareViewModel.A00 = r4.A01;
                screenShareViewModel.A0B.A06(screenShareViewModel);
                Bundle A082 = AnonymousClass002.A08();
                A082.putBoolean("is_media_projection", true);
                screenShareViewModel.A0A.A00(new C106645Zu("refresh_notification", A082));
                C85474Gj r0 = screenShareViewModel.A04;
                if (r0 != null) {
                    r0.AyX((CancellationException) null);
                }
                screenShareViewModel.A04 = C616131n.A02((C85494Gl) null, new ScreenShareViewModel$tryStartScreenSharingAndroid14$1(screenShareViewModel, (C84814Du) null), AnonymousClass0IV.A00(screenShareViewModel), (AnonymousClass20D) null, 3);
            } else if (!C107385bE.A07() || screenShareViewModel.A0A.A03.get()) {
                screenShareViewModel.A0K(r4.A01);
            } else {
                Log.i("ScreenShareViewModel Foreground service not running, unable to start screen sharing");
                C06270Wx.A03(screenShareViewModel.A0G, 31);
                Log.d("ScreenShareViewModel Fg service not running");
                screenShareViewModel.A0J();
            }
            screenShareViewModel.A05 = false;
            return;
        }
        C18260x0.A0x("ScreenShareViewModel MediaProjection permission not granted: ", AnonymousClass001.A0o(), i);
        C616131n.A02((C85494Gl) null, new ScreenShareViewModel$registerForActivityResult$1$1(screenShareViewModel, (C84814Du) null), AnonymousClass0IV.A00(screenShareViewModel), (AnonymousClass20D) null, 3);
    }

    public final void A0J() {
        this.A00 = null;
        this.A09.A01(-13);
        C06270Wx.A03(this.A0G, 31);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(android.content.Intent r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x002e
            X.66R r0 = r4.A0K     // Catch:{ SecurityException -> 0x0013 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ SecurityException -> 0x0013 }
            android.media.projection.MediaProjectionManager r1 = (android.media.projection.MediaProjectionManager) r1     // Catch:{ SecurityException -> 0x0013 }
            if (r1 == 0) goto L_0x001c
            r0 = -1
            android.media.projection.MediaProjection r0 = r1.getMediaProjection(r0, r5)     // Catch:{ SecurityException -> 0x0013 }
            goto L_0x001d
        L_0x0013:
            r1 = move-exception
            java.lang.String r0 = "SecurityException thrown while FGService running"
            com.whatsapp.util.Log.w(r0, r1)
            r4.A0J()
        L_0x001c:
            r0 = r3
        L_0x001d:
            r4.A01 = r0
            if (r0 == 0) goto L_0x002e
            X.4C6 r2 = X.AnonymousClass0IV.A00(r4)
            com.whatsapp.calling.screenshare.ScreenShareViewModel$getMediaProjectionAndStartSharing$1$1$1 r1 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$getMediaProjectionAndStartSharing$1$1$1
            r1.<init>(r4, r3)
            r0 = 3
            X.C616131n.A02(r3, r1, r2, r3, r0)
        L_0x002e:
            r4.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A0K(android.content.Intent):void");
    }

    public final void A0M(AnonymousClass58J r5) {
        AnonymousClass0O1 r2;
        StringBuilder A0g = C18280x3.A0g(r5, 0);
        A0g.append("ScreenShareViewModel toggleScreenSharing -- currentState: ");
        C18260x0.A0o(this.A03, A0g);
        AnonymousClass58I r22 = this.A03;
        int ordinal = r22.ordinal();
        if (ordinal == 0) {
            Log.i("ScreenShareViewModel tryStartScreenSharing");
            if (!C107385bE.A07() || this.A0A.A03.get()) {
                MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) this.A0K.getValue();
                if (mediaProjectionManager != null && (r2 = this.A02) != null) {
                    Log.i("ScreenShareViewModel Requesting screen share permission");
                    r2.A00((C05880Vi) null, mediaProjectionManager.createScreenCaptureIntent());
                    this.A05 = true;
                    return;
                }
                return;
            }
            Log.i("ScreenShareViewModel Foreground service not running, unable to start screen sharing");
            C06270Wx.A03(this.A0G, 31);
        } else if (ordinal != 3) {
            C18260x0.A1P(AnonymousClass001.A0o(), "ScreenShareViewModel Invalid state: ", r22);
        } else {
            this.A09.A07++;
            C616131n.A02((C85494Gl) null, new ScreenShareViewModel$toggleScreenSharing$1(r5, this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
        }
    }

    public void A0C() {
        Log.d("ScreenShareViewModel onCleared, cleaning up");
        this.A0J.setMediaProjectionProvider((C1223063w) null);
        this.A08.A07(this);
        this.A0B.A07(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0G(X.AnonymousClass59E r9, X.C84814Du r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C118675tv
            if (r0 == 0) goto L_0x008c
            r5 = r10
            X.5tv r5 = (X.C118675tv) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r3) goto L_0x0092
            java.lang.Object r9 = r5.L$1
            X.59E r9 = (X.AnonymousClass59E) r9
            java.lang.Object r7 = r5.L$0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r7 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r7
            X.C57682u2.A01(r1)
        L_0x0028:
            int r6 = X.AnonymousClass001.A0K(r1)
            X.5TU r5 = r7.A09
            if (r6 == 0) goto L_0x0031
            r3 = 0
        L_0x0031:
            X.5Ta r4 = r5.A0M
            r4.A00()
            if (r3 == 0) goto L_0x0042
            long r2 = r5.A0D
            long r0 = r4.A00
            long r0 = java.lang.Math.max(r2, r0)
            r5.A0D = r0
        L_0x0042:
            r4.A01()
            if (r6 == 0) goto L_0x0056
            r5.A01(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ScreenShareViewModel Failed to stop screen sharing: "
            X.C18260x0.A0x(r0, r1, r6)
            r7.A0I()
        L_0x0056:
            X.AnonymousClass59E.A00(r9, r5)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x005c:
            X.C57682u2.A01(r1)
            X.5TU r1 = r8.A09
            X.5Ta r0 = r1.A0M
            r0.A01()
            r0.A02()
            X.4Gj r1 = r1.A0G
            if (r1 == 0) goto L_0x0071
            r0 = 0
            r1.AyX(r0)
        L_0x0071:
            X.58I r0 = X.AnonymousClass58I.STOPPING
            r8.A03 = r0
            X.3gB r2 = r8.A0L
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1
            r0.<init>(r8, r1)
            r5.L$0 = r8
            r5.L$1 = r9
            r5.label = r3
            java.lang.Object r1 = X.C616131n.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x008a
            return r4
        L_0x008a:
            r7 = r8
            goto L_0x0028
        L_0x008c:
            X.5tv r5 = new X.5tv
            r5.<init>(r8, r10)
            goto L_0x0012
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A0G(X.59E, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0H(X.C84814Du r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C118585tm
            if (r0 == 0) goto L_0x0098
            r5 = r7
            X.5tm r5 = (X.C118585tm) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0098
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0063
            if (r0 != r3) goto L_0x009f
            java.lang.Object r5 = r5.L$0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r5 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r5
            X.C57682u2.A01(r1)
        L_0x0024:
            int r4 = X.AnonymousClass001.A0K(r1)
            if (r4 == 0) goto L_0x0047
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ScreenShareViewModel Failed to start screen sharing: "
            X.C18260x0.A0x(r0, r1, r4)
            X.5TU r0 = r5.A09
            r0.A01(r4)
            X.4UC r2 = r5.A0G
            r1 = 31
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r2.A0H(r0)
            r5.A0I()
        L_0x0047:
            X.5TU r5 = r5.A09
            if (r4 == 0) goto L_0x004c
            r3 = 0
        L_0x004c:
            X.5Ta r4 = r5.A0L
            r4.A00()
            if (r3 == 0) goto L_0x005d
            long r2 = r5.A0C
            long r0 = r4.A00
            long r0 = java.lang.Math.max(r2, r0)
            r5.A0C = r0
        L_0x005d:
            r4.A01()
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0063:
            X.C57682u2.A01(r1)
            X.5TU r1 = r6.A09
            int r0 = r1.A06
            int r0 = r0 + 1
            r1.A06 = r0
            X.5Ta r0 = r1.A0L
            r0.A01()
            r0.A02()
            X.5Ta r0 = r1.A0O
            r0.A01()
            r0.A02()
            X.58I r0 = X.AnonymousClass58I.STARTING
            r6.A0L(r0)
            X.3gB r2 = r6.A0L
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1
            r0.<init>(r6, r1)
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r1 = X.C616131n.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0096
            return r4
        L_0x0096:
            r5 = r6
            goto L_0x0024
        L_0x0098:
            X.5tm r5 = new X.5tm
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A0H(X.4Du):java.lang.Object");
    }

    public final void A0L(AnonymousClass58I r4) {
        boolean z;
        this.A03 = r4;
        if (r4 == AnonymousClass58I.STARTED || r4 == AnonymousClass58I.STARTING) {
            z = true;
        } else if (r4 == AnonymousClass58I.STOPPED) {
            z = false;
        } else {
            return;
        }
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass107 r1 = this.A0F;
        if (!C162457s7.A0P(valueOf, r1.A07())) {
            r1.A0H(valueOf);
        }
    }

    public void Bcs() {
        Log.d("ScreenShareViewModel onStopped");
    }

    public ScreenShareViewModel(C56972sr r2, AnonymousClass49P r3, C97174xk r4, AnonymousClass5TU r5, C112515jr r6, C97074xa r7, C116655qe r8, C54292oU r9, AnonymousClass1VX r10, VoipCameraManager voipCameraManager, C73853gB r12) {
        C18260x0.A0f(r10, r2, r9, r3, r4);
        C162457s7.A0J(r8, 6);
        C18260x0.A0X(voipCameraManager, r6, r7);
        C162457s7.A0J(r5, 11);
        this.A0E = r10;
        this.A06 = r2;
        this.A0D = r9;
        this.A07 = r3;
        this.A08 = r4;
        this.A0C = r8;
        this.A0L = r12;
        this.A0J = voipCameraManager;
        this.A0A = r6;
        this.A0B = r7;
        this.A09 = r5;
        voipCameraManager.setMediaProjectionProvider(this);
        r4.A06(this);
        C102995Lb r0 = r4.A08().A03;
        if (r0 != null && r0.A0I) {
            A0L(AnonymousClass58I.STARTED);
        }
    }

    public final void A0I() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScreenShareViewModel Cleanup -- hasMediaProjection ? ");
        C18260x0.A1U(A0o, AnonymousClass000.A1W(this.A01));
        MediaProjection mediaProjection = this.A01;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        this.A01 = null;
        this.A0C.A02();
        A0L(AnonymousClass58I.STOPPED);
    }

    public void BcH(boolean z) {
        C18260x0.A1D("ScreenShareViewModel onStarted, hasMediaProjection=", AnonymousClass001.A0o(), z);
        if (z) {
            A0K(this.A00);
        } else {
            A0J();
        }
        this.A0B.A07(this);
        C85474Gj r1 = this.A04;
        if (r1 != null) {
            r1.AyX((CancellationException) null);
        }
        this.A04 = null;
    }
}
