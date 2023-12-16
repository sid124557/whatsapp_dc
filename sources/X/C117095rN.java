package X;

import android.os.Handler;

/* renamed from: X.5rN  reason: invalid class name and case insensitive filesystem */
public class C117095rN implements Runnable {
    public Object A00;
    public final int A01;

    public C117095rN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new C117095rN(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fd, code lost:
        com.whatsapp.util.Log.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0300, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03a2, code lost:
        r3.postDelayed(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r0 = "ExoPlayerVideoPlayer/player is null when preparing";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07d5, code lost:
        r0.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07d8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r72 = this;
            r4 = r72
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0354;
                case 1: goto L_0x0376;
                case 2: goto L_0x0068;
                case 3: goto L_0x03a9;
                case 4: goto L_0x03c5;
                case 5: goto L_0x03f0;
                case 6: goto L_0x0463;
                case 7: goto L_0x0463;
                case 8: goto L_0x0478;
                case 9: goto L_0x0090;
                case 10: goto L_0x0482;
                case 11: goto L_0x0597;
                case 12: goto L_0x05b0;
                case 13: goto L_0x05cd;
                case 14: goto L_0x05d6;
                case 15: goto L_0x065e;
                case 16: goto L_0x0676;
                case 17: goto L_0x00ad;
                case 18: goto L_0x00c8;
                case 19: goto L_0x00e2;
                case 20: goto L_0x00f3;
                case 21: goto L_0x067f;
                case 22: goto L_0x0687;
                case 23: goto L_0x0101;
                case 24: goto L_0x068f;
                case 25: goto L_0x069c;
                case 26: goto L_0x06a6;
                case 27: goto L_0x06d7;
                case 28: goto L_0x06e5;
                case 29: goto L_0x06ee;
                case 30: goto L_0x06f6;
                case 31: goto L_0x0700;
                case 32: goto L_0x07ba;
                case 33: goto L_0x0110;
                case 34: goto L_0x0008;
                case 35: goto L_0x07c2;
                case 36: goto L_0x07c2;
                case 37: goto L_0x07cc;
                case 38: goto L_0x012d;
                case 39: goto L_0x07d9;
                case 40: goto L_0x07e1;
                case 41: goto L_0x0141;
                case 42: goto L_0x02cb;
                case 43: goto L_0x01b3;
                case 44: goto L_0x083f;
                case 45: goto L_0x002d;
                case 46: goto L_0x0327;
                case 47: goto L_0x0851;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r3 = r4.A00
            X.6qG r3 = (X.C138386qG) r3
            java.lang.String r0 = "ExoPlayerVideoPlayer/preparePlayer"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.6OD r0 = r3.A05
            if (r0 == 0) goto L_0x0064
            X.7bE r0 = r3.A08
            if (r0 == 0) goto L_0x001c
            r0.A00()
        L_0x001c:
            X.6OD r2 = r3.A05
            X.8vI r1 = r3.A0f()
            boolean r0 = r3.A0E
            r0 = r0 ^ 1
            r2.A08(r1, r0)
            r3.A0E()
            return
        L_0x002d:
            java.lang.Object r4 = r4.A00
            X.567 r4 = (X.AnonymousClass567) r4
            java.lang.String r0 = "ExoPlayerVideoPlayer/preparePlayer"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7t6 r3 = r4.A05
            if (r3 == 0) goto L_0x0064
            X.7bE r0 = r4.A0B
            if (r0 == 0) goto L_0x0041
            r0.A00()
        L_0x0041:
            boolean r0 = r4.A0E
            r0 = r0 ^ 1
            android.os.Handler r2 = r3.A0C
            r1 = 47
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.os.Message r0 = r2.obtainMessage(r1, r0)
            r2.sendMessage(r0)
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x005d
            boolean r0 = r4.A0C
            r3.A0K(r0)
        L_0x005d:
            r3.A07()
            r4.A0E()
            return
        L_0x0064:
            java.lang.String r0 = "ExoPlayerVideoPlayer/player is null when preparing"
            goto L_0x02fd
        L_0x0068:
            java.lang.Object r0 = r4.A00
            X.4Me r0 = (X.C86874Me) r0
            java.lang.ref.WeakReference r0 = r0.A0D
            java.lang.Object r2 = r0.get()
            X.5pp r2 = (X.C116155pp) r2
            if (r2 == 0) goto L_0x0007
            X.4FU r1 = r2.A0F
            r0 = 2131889123(0x7f120be3, float:1.94129E38)
            r1.Bot(r0)
            X.8jd r0 = r2.A06
            if (r0 == 0) goto L_0x008b
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.5po r0 = r0.A0k
            if (r0 == 0) goto L_0x008b
            r0.A00()
        L_0x008b:
            r0 = 1
            r2.A05(r0)
            return
        L_0x0090:
            java.lang.Object r0 = r4.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r2 = X.C61102zi.A03(r0)
        L_0x0098:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r2.next()
            X.5Vn r0 = (X.C105575Vn) r0
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r0.A00
            X.08M r1 = r0.A01
            r0 = 0
            r1.A0H(r0)
            goto L_0x0098
        L_0x00ad:
            java.lang.Object r0 = r4.A00
            X.30e r0 = (X.C613130e) r0
            r2 = -1
            java.util.List r0 = r0.A0D
            java.util.Iterator r1 = r0.iterator()
        L_0x00b8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r1.next()
            X.4Dg r0 = (X.C84674Dg) r0
            r0.Bel(r2)
            goto L_0x00b8
        L_0x00c8:
            java.lang.Object r0 = r4.A00
            X.30e r0 = (X.C613130e) r0
            java.util.List r0 = r0.A0D
            java.util.Iterator r1 = r0.iterator()
        L_0x00d2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r1.next()
            X.4Dg r0 = (X.C84674Dg) r0
            r0.Bem()
            goto L_0x00d2
        L_0x00e2:
            java.lang.Object r0 = r4.A00
            X.5Kn r0 = (X.C102855Kn) r0
            X.5S9 r1 = r0.A04
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0007
            r0 = 1
            r1.A01(r0)
            return
        L_0x00f3:
            java.lang.Object r1 = r4.A00
            com.whatsapp.updates.ui.UpdatesFragment r1 = (com.whatsapp.updates.ui.UpdatesFragment) r1
            boolean r0 = r1.A16()
            if (r0 == 0) goto L_0x0007
            r1.A1P()
            return
        L_0x0101:
            java.lang.Object r1 = r4.A00
            X.2yL r1 = (X.C60312yL) r1
            X.5ZQ r0 = r1.A01
            if (r0 == 0) goto L_0x0007
            r0.A06()
            r0 = 0
            r1.A01 = r0
            return
        L_0x0110:
            java.lang.Object r0 = r4.A00
            X.4TO r0 = (X.AnonymousClass4TO) r0
            X.560 r2 = r0.A00
            android.view.View r1 = r2.A0H
            if (r1 == 0) goto L_0x0007
            android.view.View r0 = r2.A0F
            if (r0 != r1) goto L_0x0007
            X.8jg r1 = r2.A0K
            if (r1 == 0) goto L_0x0007
            r0 = 0
            r2.A0H = r0
            X.8Jx r1 = (X.C172178Jx) r1
            X.5qO r0 = r1.A00
            r0.Az5()
            return
        L_0x012d:
            java.lang.Object r1 = r4.A00
            X.7IV r1 = (X.AnonymousClass7IV) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0007
            X.563 r1 = r1.A01
            r0 = 1
            r1.A0S = r0
            android.os.Handler r1 = r1.A0W
            r0 = 0
            r1.sendEmptyMessage(r0)
            return
        L_0x0141:
            java.lang.Object r0 = r4.A00
            X.5TM r0 = (X.AnonymousClass5TM) r0
            X.7Ei r3 = r0.A05
            if (r3 == 0) goto L_0x0007
            int r7 = r0.A09
            java.lang.String r6 = r0.A07
            if (r6 != 0) goto L_0x0151
            java.lang.String r6 = ""
        L_0x0151:
            X.7n4 r2 = r0.A03
            if (r2 != 0) goto L_0x015a
            X.7n4 r2 = new X.7n4
            r2.<init>()
        L_0x015a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "CompositeHeroPlayer - onPlaybackError() - "
            r1.append(r5)
            r1.append(r7)
            java.lang.String r4 = ", videoId: "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r0 = ", playbackError: "
            X.C18260x0.A1P(r1, r0, r2)
            X.5Xn r3 = r3.A00
            int r0 = r3.A00
            int r0 = r0 % 2
            if (r7 != r0) goto L_0x018e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.C18270x1.A19(r5, r4, r1, r7)
            r1.append(r6)
            java.lang.String r0 = " - switchToNextPlayer()"
            X.C18260x0.A1J(r1, r0)
            X.C106075Xn.A00(r3)
            return
        L_0x018e:
            java.util.concurrent.ConcurrentLinkedQueue r2 = r3.A0E
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0007
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.C18270x1.A19(r5, r4, r1, r7)
            r1.append(r6)
            java.lang.String r0 = " - prepareNextPlayer()"
            X.C18260x0.A1J(r1, r0)
            java.lang.Object r1 = r2.poll()
            X.7a6 r1 = (X.C152777a6) r1
            X.C162457s7.A0H(r1)
            r0 = 0
            r3.A04(r1, r0)
            return
        L_0x01b3:
            java.lang.Object r0 = r4.A00
            X.5TM r0 = (X.AnonymousClass5TM) r0
            X.7Ei r4 = r0.A05
            if (r4 == 0) goto L_0x0007
            int r3 = r0.A09
            java.lang.String r2 = r0.A07
            boolean r6 = r0.A08
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompositeHeroPlayer - onPrepared() - "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", videoId: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", shouldPlayWhenReady: "
            X.C18260x0.A1D(r0, r1, r6)
            X.5Xn r4 = r4.A00
            r4.A05 = r2
            int r1 = r4.A00
            int r0 = r1 % 2
            if (r3 != r0) goto L_0x0219
            java.util.Set r5 = r4.A0D
            java.util.Iterator r3 = r5.iterator()
        L_0x01ea:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x024d
            r3.next()
            java.util.Iterator r2 = r5.iterator()
        L_0x01f7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r0 = r2.next()
            X.7RZ r0 = (X.AnonymousClass7RZ) r0
            X.5KS r0 = r0.A00
            X.7kH r0 = r0.A01
            if (r0 == 0) goto L_0x01f7
            java.util.Set r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x020f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01f7
            r1.next()
            goto L_0x020f
        L_0x0219:
            int r0 = r1 + 1
            int r0 = r0 % 2
            if (r3 != r0) goto L_0x024d
            java.util.Set r0 = r4.A0D
            java.util.Iterator r5 = r0.iterator()
        L_0x0225:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r5.next()
            X.7RZ r0 = (X.AnonymousClass7RZ) r0
            X.5KS r0 = r0.A00
            X.7kH r2 = r0.A01
            if (r2 == 0) goto L_0x0225
            java.util.concurrent.ConcurrentLinkedQueue r1 = r2.A04
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0225
            java.lang.Object r3 = r1.poll()
            X.5KS r2 = r2.A07
            X.4FS r1 = r2.A05
            r0 = 37
            X.C18290x4.A1M(r1, r2, r3, r0)
            goto L_0x0225
        L_0x024d:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0253
            if (r6 == 0) goto L_0x0007
        L_0x0253:
            r0 = 0
            r4.A09 = r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompositeHeroPlayer - transitionToNextPlayer "
            r2.append(r0)
            int r1 = r4.A00
            int r0 = r1 % 2
            r2.append(r0)
            java.lang.String r0 = " -> "
            r2.append(r0)
            int r0 = r1 + 1
            int r0 = r0 % 2
            X.C18260x0.A1F(r2, r0)
            r0 = 1
            r4.A06 = r0
            int r0 = r4.A00
            int r0 = r0 + 1
            int r0 = r0 % 2
            X.5TM[] r3 = r4.A0G
            r2 = r3[r0]
            r4.A02(r0)
            r2.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "TransitionHeroPlayer - bringToFront() - playerId: "
            r1.append(r0)
            int r0 = r2.A09
            X.C18260x0.A1F(r1, r0)
            android.view.TextureView r1 = r2.A0A
            r1.bringToFront()
            r0 = 0
            r1.setAlpha(r0)
            int r0 = r4.A00
            int r0 = r0 % 2
            r3 = r3[r0]
            r1.clearAnimation()
            android.view.TextureView r0 = r3.A0A
            r0.clearAnimation()
            android.view.ViewPropertyAnimator r2 = r1.animate()
            X.C162457s7.A0D(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r1 = 2
            X.3a2 r0 = new X.3a2
            r0.<init>(r3, r1, r4)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            r0.start()
            return
        L_0x02cb:
            java.lang.Object r0 = r4.A00
            X.5TM r0 = (X.AnonymousClass5TM) r0
            X.7Ei r1 = r0.A05
            if (r1 == 0) goto L_0x0007
            int r4 = r0.A09
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "CompositeHeroPlayer - onPlaybackAboutToFinish() - "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r0 = ", currentPlayerId: "
            r3.append(r0)
            X.5Xn r1 = r1.A00
            int r0 = r1.A00
            int r0 = r0 % 2
            X.C18260x0.A1F(r3, r0)
            int r0 = r1.A01
            if (r4 != r0) goto L_0x0301
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r4, r2)
            java.lang.String r0 = " ignored"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x02fd:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0301:
            r1.A01 = r4
            int r0 = r1.A00
            int r0 = r0 % 2
            if (r4 != r0) goto L_0x0007
            java.util.Set r0 = r1.A0D
            java.util.Iterator r3 = r0.iterator()
        L_0x030f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r3.next()
            X.7RZ r0 = (X.AnonymousClass7RZ) r0
            X.5KS r0 = r0.A00
            X.7kH r2 = r0.A01
            if (r2 == 0) goto L_0x030f
            r1 = 6
            r0 = 0
            r2.A02(r0, r0, r0, r1)
            goto L_0x030f
        L_0x0327:
            java.lang.Object r3 = r4.A00
            X.567 r3 = (X.AnonymousClass567) r3
            X.8pt r2 = r3.A0A
            if (r2 == 0) goto L_0x0334
            r1 = 0
            r0 = 1
            r2.BYM(r1, r0)
        L_0x0334:
            X.6qM r2 = r3.A0U
            X.2ms r0 = r2.A01
            if (r0 == 0) goto L_0x033d
            r0.A00()
        L_0x033d:
            r1 = 0
            r2.A03 = r1
            X.561 r0 = r3.A0D
            if (r0 == 0) goto L_0x0007
            r0.setPlayer(r1)
            X.561 r1 = r3.A0D
            java.lang.Runnable r0 = r1.A0M
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.A0N
            r1.removeCallbacks(r0)
            return
        L_0x0354:
            java.lang.Object r5 = r4.A00
            X.4Me r5 = (X.C86874Me) r5
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A02
            long r3 = r3 - r0
            android.os.Handler r2 = r5.A06
            r1 = 24
            X.3Zv r0 = new X.3Zv
            r0.<init>(r5, r3, r1)
            r2.post(r0)
            android.os.Handler r3 = r5.A03
            r0 = 0
            X.5rN r2 = new X.5rN
            r2.<init>(r5, r0)
            r0 = 150(0x96, double:7.4E-322)
            goto L_0x03a2
        L_0x0376:
            java.lang.Object r4 = r4.A00
            X.4Me r4 = (X.C86874Me) r4
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x03a6
            float r2 = r4.A00
            float r0 = (float) r0
            float r2 = r2 / r0
        L_0x0382:
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0398
            android.os.Handler r1 = r4.A06
            X.5rR r0 = new X.5rR
            r0.<init>(r4, r2)
            r1.post(r0)
        L_0x0398:
            android.os.Handler r3 = r4.A03
            r0 = 1
            X.5rN r2 = new X.5rN
            r2.<init>(r4, r0)
            long r0 = r4.A05
        L_0x03a2:
            r3.postDelayed(r2, r0)
            return
        L_0x03a6:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0382
        L_0x03a9:
            java.lang.Object r5 = r4.A00
            X.4Me r5 = (X.C86874Me) r5
            X.5TQ r0 = r5.A04
            r4 = 0
            if (r0 == 0) goto L_0x03c3
            java.io.File r3 = r0.A09
            java.io.File r4 = r0.A08
        L_0x03b6:
            android.os.Handler r2 = r5.A06
            r1 = 21
            X.3aN r0 = new X.3aN
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
            return
        L_0x03c3:
            r3 = r4
            goto L_0x03b6
        L_0x03c5:
            java.lang.Object r3 = r4.A00
            X.5pr r3 = (X.C116175pr) r3
            X.5ZQ r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x03ee
            int r1 = r0.A03()
        L_0x03d2:
            X.5ZQ r0 = r3.A02
            if (r0 == 0) goto L_0x03da
            int r2 = r0.A02()
        L_0x03da:
            if (r1 <= 0) goto L_0x03e6
            X.08M r0 = r3.A07
            X.C06270Wx.A03(r0, r2)
            X.08M r0 = r3.A06
            X.C06270Wx.A03(r0, r1)
        L_0x03e6:
            android.os.Handler r2 = r3.A04
            r0 = 16
            r2.postDelayed(r4, r0)
            return
        L_0x03ee:
            r1 = 0
            goto L_0x03d2
        L_0x03f0:
            java.lang.Object r3 = r4.A00
            X.4Uy r3 = (X.C87694Uy) r3
            com.whatsapp.jid.UserJid r6 = r3.A00
            if (r6 != 0) goto L_0x03fa
            com.whatsapp.jid.UserJid r6 = r3.A01
        L_0x03fa:
            X.5Sc r2 = r3.A04
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0453
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0453
            X.5Jf r7 = r3.A03
            r1 = 0
            if (r6 == 0) goto L_0x0419
            X.8qC r0 = r7.A04
            java.lang.Object r0 = r0.get()
            X.2ff r0 = (X.C48902ff) r0
            X.2o1 r0 = r0.A00(r6)
            if (r0 == 0) goto L_0x0419
            java.util.List r1 = r0.A09
        L_0x0419:
            r8 = 0
            if (r1 == 0) goto L_0x0451
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r1)
            java.util.List r0 = X.C73723fy.A0E(r0)
        L_0x0424:
            r3.A02 = r0
            X.107 r5 = r3.A05
            r5.A07()
            int r4 = r2.A01
            float r3 = r2.A00
            if (r6 == 0) goto L_0x044f
            X.2oU r0 = r7.A03
            android.content.Context r2 = r0.A00
            X.C162457s7.A0D(r2)
            X.3Ex r0 = r7.A01
            X.3ZH r1 = r0.A07(r6)
            if (r1 == 0) goto L_0x044f
            X.30g r0 = r7.A02
            android.graphics.Bitmap r1 = r0.A01(r2, r1, r3, r4)
        L_0x0446:
            X.5XT r0 = new X.5XT
            r0.<init>(r1, r6, r8)
            r5.A0G(r0)
            return
        L_0x044f:
            r1 = r8
            goto L_0x0446
        L_0x0451:
            r0 = r8
            goto L_0x0424
        L_0x0453:
            X.5Jf r7 = r3.A03
            r1 = 0
            if (r6 == 0) goto L_0x0419
            X.33g r0 = r7.A00
            X.5dt r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x0419
            java.util.List r1 = r0.A0P
            goto L_0x0419
        L_0x0463:
            java.lang.Object r2 = r4.A00
            X.30V r2 = (X.AnonymousClass30V) r2
            r1 = 8
            boolean r0 = r2.A04(r1)
            if (r0 == 0) goto L_0x0473
            r2.A00()
            return
        L_0x0473:
            r0 = 0
            r2.A03(r0, r1)
            return
        L_0x0478:
            java.lang.Object r2 = r4.A00
            X.2oC r2 = (X.C54112oC) r2
            r0 = 64
            r2.A02(r0)
            return
        L_0x0482:
            java.lang.Object r5 = r4.A00
            X.3Wa r5 = (X.C69183Wa) r5
            X.1VX r2 = r5.A05
            r0 = 908(0x38c, float:1.272E-42)
            int r4 = r2.A0N(r0)
            X.2km r8 = r5.A08
            X.66R r7 = r8.A01
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r7)
            java.lang.String r0 = "tos_fetch_iteration"
            int r0 = X.C18280x3.A02(r1, r0)
            boolean r3 = X.C86624Kv.A1W(r4, r0)
            r0 = 877(0x36d, float:1.229E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 != 0) goto L_0x04b8
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
        L_0x04ac:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x051a
            X.2zM r0 = r5.A09
            r0.A02()
            return
        L_0x04b8:
            if (r3 == 0) goto L_0x04bd
            java.util.List r6 = r5.A0D
            goto L_0x04ac
        L_0x04bd:
            long r16 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r6 = X.C18310x6.A0F(r7)
            java.lang.String r2 = "request_refresh_rate_seconds"
            r0 = 864000000(0x337f9800, double:4.26872718E-315)
            long r14 = r6.getLong(r2, r0)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.List r0 = r5.A0D
            java.util.Iterator r13 = r0.iterator()
        L_0x04d8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x04ac
            java.lang.String r10 = X.AnonymousClass001.A0m(r13)
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            android.content.SharedPreferences r9 = X.C18310x6.A0F(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tos_last_refresh_timestamp_"
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r10, r1)
            r0 = -1
            long r11 = r9.getLong(r2, r0)
            r9 = 1
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0513
            long r1 = r16 - r11
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x04d8
            X.2sr r0 = r5.A02
            boolean r1 = r0.A0Y()
            int r0 = r8.A00(r10)
            if (r1 == 0) goto L_0x0517
            if (r0 == r9) goto L_0x04d8
        L_0x0513:
            r6.add(r10)
            goto L_0x04d8
        L_0x0517:
            if (r0 != 0) goto L_0x04d8
            goto L_0x0513
        L_0x051a:
            X.31C r2 = r5.A06
            X.1ip r1 = r5.A03
            X.2bC r0 = new X.2bC
            r0.<init>(r5, r6, r4, r3)
            X.3Sx r9 = new X.3Sx
            r9.<init>(r1, r2, r0, r6)
            X.1ip r0 = r9.A00
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0537
            X.2bC r1 = r9.A02
            r0 = -1
            r1.A00(r0)
            return
        L_0x0537:
            X.31C r8 = r9.A01
            java.lang.String r11 = r8.A03()
            r12 = 282(0x11a, float:3.95E-43)
            java.util.List r0 = r9.A03
            java.util.ArrayList r7 = X.C73783g4.A0c(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0549:
            boolean r0 = r3.hasNext()
            java.lang.String r6 = "id"
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0567
            java.lang.String r0 = X.AnonymousClass001.A0m(r3)
            X.39V[] r2 = new X.AnonymousClass39V[r5]
            X.AnonymousClass39V.A0B(r6, r0, r2, r4)
            java.lang.String r1 = "notice"
            X.36K r0 = new X.36K
            r0.<init>(r1, r2)
            r7.add(r0)
            goto L_0x0549
        L_0x0567:
            X.36K[] r2 = X.C18280x3.A1a(r7, r4)
            java.lang.String r1 = "request"
            r0 = 0
            X.36K r3 = new X.36K
            r3.<init>((java.lang.String) r1, (X.AnonymousClass39V[]) r0, (X.AnonymousClass36K[]) r2)
            r0 = 4
            X.39V[] r2 = new X.AnonymousClass39V[r0]
            X.39V r0 = X.AnonymousClass39V.A00()
            r2[r4] = r0
            X.AnonymousClass39V.A0B(r6, r11, r2, r5)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "tos"
            X.AnonymousClass39V.A06(r1, r0, r2)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass39V.A07(r1, r0, r2)
            X.36K r10 = X.AnonymousClass36K.A0G(r3, r2)
            r13 = 32000(0x7d00, double:1.581E-319)
            r8.A0E(r9, r10, r11, r12, r13)
            return
        L_0x0597:
            java.lang.Object r3 = r4.A00
            com.whatsapp.twofactor.SetEmailFragment r3 = (com.whatsapp.twofactor.SetEmailFragment) r3
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r3.A07
            com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog r1 = new com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog
            r1.<init>()
            r0 = -1
            r1.A10(r3, r0)
            java.lang.Class<com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog> r0 = com.whatsapp.twofactor.SetEmailFragment.ConfirmSkipEmailDialog.class
            java.lang.String r0 = r0.getName()
            r2.Bon(r1, r0)
            return
        L_0x05b0:
            java.lang.Object r4 = r4.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            X.30e r0 = r4.A0A
            java.lang.String r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            X.3Wi r2 = r4.A05
            r1 = 15
            X.3bz r0 = new X.3bz
            r0.<init>(r1, r4, r3)
            r2.A0S(r0)
            return
        L_0x05cd:
            java.lang.Object r1 = r4.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r1 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r1
            r0 = -1
            r1.Bel(r0)
            return
        L_0x05d6:
            java.lang.Object r3 = r4.A00
            com.whatsapp.twofactor.TwoFactorAuthActivity r3 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r3
            r3.BjL()
            int[] r1 = r3.A08
            int r0 = r1.length
            r4 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0622
            r1 = r1[r4]
            if (r1 == r2) goto L_0x061c
            r0 = 2
            if (r1 != r0) goto L_0x05f3
            X.3Wi r1 = r3.A05
            r0 = 2131894509(0x7f1220ed, float:1.9423825E38)
        L_0x05f0:
            r1.A0H(r0, r2)
        L_0x05f3:
            X.30e r0 = r3.A01
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0618
            int[] r0 = r3.A08
            r0 = r0[r4]
            if (r0 != r2) goto L_0x0618
            java.lang.String r0 = "TwoFactorAuthActivity/workflowComplete/start twoFactorAddEmailActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.30e r0 = r3.A01
            r0.A01 = r4
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.AddEmailActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
        L_0x0618:
            r3.finish()
            return
        L_0x061c:
            X.3Wi r1 = r3.A05
            r0 = 2131894500(0x7f1220e4, float:1.9423807E38)
            goto L_0x05f0
        L_0x0622:
            X.0df r1 = r3.getSupportFragmentManager()
        L_0x0626:
            int r0 = r1.A07()
            if (r0 <= 0) goto L_0x0630
            r1.A0N()
            goto L_0x0626
        L_0x0630:
            android.view.View r1 = r3.getCurrentFocus()
            if (r1 == 0) goto L_0x063b
            X.5Wv r0 = r3.A0B
            r0.A02(r1)
        L_0x063b:
            X.0R8 r0 = r3.A00
            if (r0 == 0) goto L_0x0647
            r0.A0N(r4)
            X.0R8 r0 = r3.A00
            r0.A0P(r4)
        L_0x0647:
            java.lang.String r2 = r3.A06
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "primaryCTA"
            r1.putString(r0, r2)
            com.whatsapp.twofactor.DoneFragment r0 = new com.whatsapp.twofactor.DoneFragment
            r0.<init>()
            r0.A0u(r1)
            r3.A75(r0, r4)
            return
        L_0x065e:
            java.lang.Object r3 = r4.A00
            com.whatsapp.twofactor.TwoFactorAuthActivity r3 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r3
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x066e
            X.30e r0 = r3.A01
            java.lang.String r2 = r0.A01()
            r3.A02 = r2
        L_0x066e:
            X.30e r1 = r3.A01
            java.lang.String r0 = r3.A04
            r1.A04(r2, r0)
            return
        L_0x0676:
            java.lang.Object r1 = r4.A00
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r1
            r0 = -1
            r1.Bel(r0)
            return
        L_0x067f:
            java.lang.Object r1 = r4.A00
            com.whatsapp.updates.ui.UpdatesFragment r1 = (com.whatsapp.updates.ui.UpdatesFragment) r1
            r0 = 0
            r1.A0Z = r0
            return
        L_0x0687:
            java.lang.Object r0 = r4.A00
            com.whatsapp.updates.ui.UpdatesFragment r0 = (com.whatsapp.updates.ui.UpdatesFragment) r0
            r0.A1O()
            return
        L_0x068f:
            java.lang.Object r0 = r4.A00
            X.53p r0 = (X.C988853p) r0
            android.media.MediaPlayer r0 = r0.A01
            r0.reset()
            r0.release()
            return
        L_0x069c:
            java.lang.Object r0 = r4.A00
            X.5KL r0 = (X.AnonymousClass5KL) r0
            X.4GP r0 = r0.A01
            r0.invoke()
            return
        L_0x06a6:
            java.lang.Object r3 = r4.A00
            com.whatsapp.util.FloatingChildLayout r3 = (com.whatsapp.util.FloatingChildLayout) r3
            android.animation.ValueAnimator r0 = r3.A06
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x06b8
            android.animation.ValueAnimator r0 = r3.A06
            r0.reverse()
            return
        L_0x06b8:
            int[] r0 = X.C86664Kz.A1Z()
            r0 = {0, 127} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r0)
            r3.A06 = r1
            r0 = 32
            X.C86604Kt.A0w(r1, r3, r0)
            android.animation.ValueAnimator r2 = r3.A06
            int r0 = r3.A01
            long r0 = (long) r0
            android.animation.ValueAnimator r0 = r2.setDuration(r0)
            r0.start()
            return
        L_0x06d7:
            java.lang.Object r2 = r4.A00
            X.5g6 r2 = (X.C110355g6) r2
            android.widget.TextView r1 = r2.A02
            r0 = 1
            r1.setSelected(r0)
            r0 = 0
            r2.A00 = r0
            return
        L_0x06e5:
            java.lang.Object r1 = r4.A00
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            r0 = 3
            r1.A0S(r0)
            return
        L_0x06ee:
            java.lang.Object r0 = r4.A00
            X.1sV r0 = (X.C33141sV) r0
            r0.A07()
            return
        L_0x06f6:
            java.lang.Object r0 = r4.A00
            X.7O7 r0 = (X.AnonymousClass7O7) r0
            X.8tp r0 = r0.A02
            r0.BTR()
            return
        L_0x0700:
            java.lang.Object r10 = r4.A00
            X.2zy r10 = (X.C61262zy) r10
            monitor-enter(r10)
            java.util.Map r0 = r10.A0B     // Catch:{ all -> 0x07b7 }
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x07b7 }
        L_0x070b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x07b7 }
            if (r0 == 0) goto L_0x0746
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r4)     // Catch:{ all -> 0x07b7 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x07b7 }
            X.3cK r0 = (X.C71573cK) r0     // Catch:{ all -> 0x07b7 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x07b7 }
            android.os.Handler r0 = (android.os.Handler) r0     // Catch:{ all -> 0x07b7 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x07b7 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x07b7 }
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x07b7 }
            java.util.Map r1 = r10.A0C     // Catch:{ all -> 0x07b7 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x07b7 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x07b7 }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ all -> 0x07b7 }
            if (r0 == 0) goto L_0x0740
            r10.A02(r2)     // Catch:{ all -> 0x07b7 }
        L_0x073e:
            monitor-exit(r10)     // Catch:{ all -> 0x07b7 }
            goto L_0x07b6
        L_0x0740:
            java.util.Map r0 = r10.A0D     // Catch:{ all -> 0x07b7 }
            r0.remove(r2)     // Catch:{ all -> 0x07b7 }
            goto L_0x070b
        L_0x0746:
            java.util.List r0 = r10.A0A     // Catch:{ all -> 0x07b7 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x07b7 }
        L_0x074c:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x07b7 }
            if (r0 == 0) goto L_0x07b2
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x07b7 }
            X.2Qd r11 = (X.C42942Qd) r11     // Catch:{ all -> 0x07b7 }
            java.util.concurrent.ThreadPoolExecutor r0 = r11.A03     // Catch:{ all -> 0x07b7 }
            long r4 = r0.getTaskCount()     // Catch:{ all -> 0x07b7 }
            long r2 = r0.getCompletedTaskCount()     // Catch:{ all -> 0x07b7 }
            long r8 = r11.A01     // Catch:{ all -> 0x07b7 }
            long r6 = r11.A00     // Catch:{ all -> 0x07b7 }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0773
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0773
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0773
            goto L_0x077c
        L_0x0773:
            r13 = 0
            java.util.Map r1 = r10.A0D     // Catch:{ all -> 0x07b7 }
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x07b7 }
            r1.remove(r0)     // Catch:{ all -> 0x07b7 }
            goto L_0x07ab
        L_0x077c:
            r13 = 1
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07b7 }
            java.lang.String r0 = "Thread pool stuck, name:"
            r12.append(r0)     // Catch:{ all -> 0x07b7 }
            java.lang.String r1 = r11.A02     // Catch:{ all -> 0x07b7 }
            r12.append(r1)     // Catch:{ all -> 0x07b7 }
            java.lang.String r0 = " lastTaskCount:"
            r12.append(r0)     // Catch:{ all -> 0x07b7 }
            r12.append(r8)     // Catch:{ all -> 0x07b7 }
            java.lang.String r0 = " lastCompleted:"
            r12.append(r0)     // Catch:{ all -> 0x07b7 }
            r12.append(r6)     // Catch:{ all -> 0x07b7 }
            java.lang.String r0 = " currentTaskCount:"
            r12.append(r0)     // Catch:{ all -> 0x07b7 }
            r12.append(r4)     // Catch:{ all -> 0x07b7 }
            java.lang.String r0 = " currentCompleted:"
            X.C18270x1.A1B(r0, r12, r2)     // Catch:{ all -> 0x07b7 }
            r10.A02(r1)     // Catch:{ all -> 0x07b7 }
        L_0x07ab:
            r11.A00 = r2     // Catch:{ all -> 0x07b7 }
            r11.A01 = r4     // Catch:{ all -> 0x07b7 }
            if (r13 == 0) goto L_0x074c
            goto L_0x073e
        L_0x07b2:
            r10.A00()     // Catch:{ all -> 0x07b7 }
            goto L_0x073e
        L_0x07b6:
            return
        L_0x07b7:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x07b7 }
            throw r0
        L_0x07ba:
            java.lang.Object r0 = r4.A00
            X.0QU r0 = (X.AnonymousClass0QU) r0
            r0.A01()
            return
        L_0x07c2:
            java.lang.Object r0 = r4.A00
            X.5f9 r0 = (X.C109765f9) r0
            com.whatsapp.videoplayback.HeroPlaybackControlView r0 = r0.A01
            r0.A09()
            goto L_0x07d5
        L_0x07cc:
            java.lang.Object r0 = r4.A00
            X.5f9 r0 = (X.C109765f9) r0
            com.whatsapp.videoplayback.HeroPlaybackControlView r0 = r0.A01
            r0.A0A()
        L_0x07d5:
            r0.A0B()
            return
        L_0x07d9:
            java.lang.Object r0 = r4.A00
            X.4P1 r0 = (X.AnonymousClass4P1) r0
            r0.A02()
            return
        L_0x07e1:
            java.lang.Object r5 = r4.A00
            X.2pR r5 = (X.C54882pR) r5
            monitor-enter(r5)
            X.2YQ r0 = r5.A05     // Catch:{ all -> 0x083c }
            X.7aI r4 = r0.A01     // Catch:{ all -> 0x083c }
            X.33B r6 = r4.A00()     // Catch:{ all -> 0x083c }
            r8 = 0
            long r2 = r6.A07     // Catch:{ all -> 0x083c }
            r0 = 1
            long r2 = r2 + r0
            r7 = -2097153(0xffffffffffdfffff, float:NaN)
            r12 = r8
            r14 = r8
            r16 = r8
            r18 = r8
            r20 = r8
            r22 = r8
            r24 = r8
            r26 = r8
            r28 = r8
            r30 = r8
            r32 = r8
            r34 = r8
            r36 = r8
            r38 = r8
            r40 = r8
            r42 = r8
            r44 = r8
            r46 = r8
            r48 = r8
            r52 = r8
            r54 = r8
            r56 = r8
            r58 = r8
            r60 = r8
            r62 = r8
            r64 = r8
            r66 = r8
            r68 = r8
            r70 = r8
            r10 = r8
            r50 = r2
            X.33B r0 = X.AnonymousClass33B.A00(r6, r7, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70)     // Catch:{ all -> 0x083c }
            r4.A02(r0)     // Catch:{ all -> 0x083c }
            monitor-exit(r5)
            return
        L_0x083c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x083f:
            java.lang.Object r0 = r4.A00
            X.7d0 r0 = (X.C154337d0) r0
            java.lang.Object r0 = r0.A00
            X.6qC r0 = (X.C138346qC) r0
            android.media.MediaPlayer$OnErrorListener r3 = r0.A07
            android.media.MediaPlayer r2 = r0.A09
            r1 = 1
            r0 = 0
            r3.onError(r2, r1, r0)
            return
        L_0x0851:
            java.lang.Object r0 = r4.A00
            X.567 r0 = (X.AnonymousClass567) r0
            X.C117095rN.super.A0E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117095rN.run():void");
    }
}
