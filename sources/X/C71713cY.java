package X;

import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.3cY  reason: invalid class name and case insensitive filesystem */
public class C71713cY implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C71713cY(AnonymousClass4DV r2, C55942rA r3, int i) {
        this.A03 = i;
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = 4;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, int i, int i2) {
        r1.BkM(new C71713cY(obj, obj2, i, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028d, code lost:
        if (r0 == false) goto L_0x028f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r8 = r16
            int r0 = r8.A03
            switch(r0) {
                case 0: goto L_0x0695;
                case 1: goto L_0x067b;
                case 2: goto L_0x066d;
                case 3: goto L_0x065f;
                case 4: goto L_0x05e4;
                case 5: goto L_0x0594;
                case 6: goto L_0x0501;
                case 7: goto L_0x04e9;
                case 8: goto L_0x0481;
                case 9: goto L_0x0465;
                case 10: goto L_0x044f;
                case 11: goto L_0x0439;
                case 12: goto L_0x041b;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x03e9;
                case 16: goto L_0x03b4;
                case 17: goto L_0x03a4;
                case 18: goto L_0x0369;
                case 19: goto L_0x0354;
                case 20: goto L_0x0345;
                case 21: goto L_0x02fc;
                case 22: goto L_0x02c1;
                case 23: goto L_0x026e;
                case 24: goto L_0x022f;
                case 25: goto L_0x00a0;
                case 26: goto L_0x007d;
                case 27: goto L_0x006f;
                case 28: goto L_0x004d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r8.A01
            X.1gM r4 = (X.AnonymousClass1gM) r4
            java.lang.Object r3 = r8.A02
            X.39T r3 = (X.AnonymousClass39T) r3
            int r2 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "prekey count running low; remainingPreKeys="
            X.C18260x0.A0y(r0, r1, r2)
            java.lang.String r0 = "appending additional prekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.30x r0 = r4.A05
            X.3fe r2 = r0.A03()
            X.33n r1 = r4.A03     // Catch:{ all -> 0x0041 }
            boolean r0 = r1.A0Y()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "no unsent prekeys; generating some new ones"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0041 }
            r1.A0J()     // Catch:{ all -> 0x0041 }
        L_0x0037:
            X.1i9 r0 = r4.A00     // Catch:{ all -> 0x0041 }
            r0.A0C()     // Catch:{ all -> 0x0041 }
            r4.A03(r3)     // Catch:{ all -> 0x0041 }
            goto L_0x0659
        L_0x0041:
            r1 = move-exception
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ all -> 0x0048 }
            throw r1
        L_0x0048:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x004c:
            throw r1
        L_0x004d:
            java.lang.Object r1 = r8.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r1 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r1
            int r0 = r8.A00
            java.lang.Object r4 = r8.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            r3 = 0
            X.C162457s7.A0J(r1, r3)
            X.4xg r2 = r1.A00
            if (r2 == 0) goto L_0x0068
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2.A08(r0, r1, r4, r3)
            return
        L_0x0068:
            java.lang.String r0 = "accountLinkingResultObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x006f:
            java.lang.Object r2 = r8.A01
            X.6bK r2 = (X.C130066bK) r2
            java.lang.Object r1 = r8.A02
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            int r0 = r8.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera.lambda$syncRunOnCameraThread$1(r2, r1, r0)
            return
        L_0x007d:
            java.lang.Object r1 = r8.A01
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            int r2 = r8.A00
            java.lang.Object r0 = r8.A02
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            X.C18260x0.A0P(r1, r0)
            java.lang.Object r1 = r1.get()
            X.0Qg r1 = (X.C04690Qg) r1
            if (r1 == 0) goto L_0x065e
            r1.A00 = r2
            java.lang.Object r0 = r0.get()
            X.0Xs r0 = (X.C06440Xs) r0
            if (r0 == 0) goto L_0x065e
            r0.A0x(r1)
            return
        L_0x00a0:
            java.lang.Object r4 = r8.A01
            X.2oJ r4 = (X.C54182oJ) r4
            java.lang.Object r7 = r8.A02
            X.34x r7 = (X.C624134x) r7
            int r10 = r8.A00
            X.1bB r3 = new X.1bB
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3.A06 = r0
            X.2z0 r2 = X.C624134x.A07(r7)
            X.4uZ r9 = r2.A00
            boolean r12 = X.C627336j.A0K(r9)
            if (r12 == 0) goto L_0x0220
            r1 = 2
        L_0x00c2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A08 = r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.2sH r0 = r4.A07
            long r5 = r0.A0H()
            long r0 = r7.A0I
            long r5 = r5 - r0
            java.lang.Long r0 = X.C18320x8.A0Y(r8, r5)
            r3.A0D = r0
            byte r5 = r7.A1I
            r0 = 11
            r1 = 1
            if (r5 == r0) goto L_0x00e6
            r0 = 31
            r1 = 0
            if (r5 != r0) goto L_0x00e6
            r1 = 2
        L_0x00e6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A09 = r0
            X.36E r5 = r4.A03
            int r0 = X.AnonymousClass36M.A06(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
            X.36Y r6 = r4.A0B
            X.2hp r1 = r4.A0G
            X.2Yl r0 = r4.A0H
            int r0 = X.AnonymousClass29K.A01(r6, r7, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            r8 = 1
            if (r10 != r8) goto L_0x011e
            boolean r0 = r7 instanceof X.C30931nS
            if (r0 == 0) goto L_0x011e
            r0 = r7
            X.1nS r0 = (X.C30931nS) r0
            int r0 = r0.A00
            switch(r0) {
                case 1: goto L_0x021d;
                case 2: goto L_0x021a;
                case 3: goto L_0x0217;
                case 4: goto L_0x0214;
                case 5: goto L_0x0211;
                case 6: goto L_0x020e;
                case 7: goto L_0x020b;
                case 8: goto L_0x0207;
                case 9: goto L_0x0203;
                case 10: goto L_0x01ff;
                case 11: goto L_0x01fb;
                case 12: goto L_0x01f7;
                case 13: goto L_0x01f3;
                default: goto L_0x0117;
            }
        L_0x0117:
            r0 = 0
        L_0x0118:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A07 = r0
        L_0x011e:
            X.2sj r0 = r4.A0A
            java.util.Set r1 = r0.A04(r9)
            java.lang.Integer r0 = r3.A04
            boolean r0 = r5.A0T(r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            X.2ss r0 = r4.A09
            X.C162457s7.A0J(r0, r8)
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r0, r9)
            r3.A0A = r0
            X.2qk r0 = r4.A01
            int r0 = X.C627336j.A00(r0, r1)
            int r6 = r1.size()
            if (r0 <= 0) goto L_0x0156
            long r0 = (long) r0
            r10 = 32
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0150
            r0 = 32
        L_0x0150:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0C = r0
        L_0x0156:
            if (r6 <= 0) goto L_0x0171
            long r0 = (long) r6
            r10 = 32
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0161
            r0 = 32
        L_0x0161:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0B = r0
            int r0 = X.AnonymousClass36M.A00(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
        L_0x0171:
            if (r9 == 0) goto L_0x01ab
            if (r12 != 0) goto L_0x01ee
            boolean r0 = r9 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x01ee
            r6 = 0
        L_0x017a:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            X.C18280x3.A0u(r9, r5)
            java.lang.String r1 = "_"
            r5.append(r1)
            X.AnonymousClass2z0.A09(r2, r1, r5)
            boolean r0 = r2.A02
            r5.append(r0)
            r5.append(r1)
            if (r6 == 0) goto L_0x01eb
            java.lang.String r0 = r6.getRawString()
        L_0x0197:
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r5)
            X.30N r1 = r4.A0E
            java.util.Random r0 = X.AnonymousClass0x9.A1C()
            byte[] r0 = r1.A06(r0)
            java.lang.String r0 = X.AnonymousClass30N.A01(r0, r2)
            r3.A0E = r0
        L_0x01ab:
            X.33p r0 = r4.A08
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "registration_initialized_time"
            long r5 = X.AnonymousClass0x2.A0B(r1, r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01c5
            long r1 = r7.A0K
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01c5
            r8 = 0
        L_0x01c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r3.A01 = r0
            com.whatsapp.jid.DeviceJid r1 = r7.A1R
            if (r1 != 0) goto L_0x01dd
            X.2yY r0 = r7.A10()
            if (r0 == 0) goto L_0x01e5
            X.2yY r0 = r7.A10()
            com.whatsapp.jid.DeviceJid r1 = r0.A00
            if (r1 == 0) goto L_0x01e5
        L_0x01dd:
            X.2sr r0 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass368.A05(r0, r1)
            r3.A03 = r0
        L_0x01e5:
            X.4FV r0 = r4.A0D
            r0.BhA(r3)
            return
        L_0x01eb:
            java.lang.String r0 = "0"
            goto L_0x0197
        L_0x01ee:
            X.4uZ r6 = r7.A0n()
            goto L_0x017a
        L_0x01f3:
            r0 = 13
            goto L_0x0118
        L_0x01f7:
            r0 = 12
            goto L_0x0118
        L_0x01fb:
            r0 = 11
            goto L_0x0118
        L_0x01ff:
            r0 = 10
            goto L_0x0118
        L_0x0203:
            r0 = 9
            goto L_0x0118
        L_0x0207:
            r0 = 8
            goto L_0x0118
        L_0x020b:
            r0 = 3
            goto L_0x0118
        L_0x020e:
            r0 = 7
            goto L_0x0118
        L_0x0211:
            r0 = 2
            goto L_0x0118
        L_0x0214:
            r0 = 6
            goto L_0x0118
        L_0x0217:
            r0 = 5
            goto L_0x0118
        L_0x021a:
            r0 = 4
            goto L_0x0118
        L_0x021d:
            r0 = 1
            goto L_0x0118
        L_0x0220:
            boolean r0 = r9 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0227
            r1 = 3
            goto L_0x00c2
        L_0x0227:
            boolean r0 = r9 instanceof X.AnonymousClass1fI
            r1 = 1
            if (r0 == 0) goto L_0x00c2
            r1 = 4
            goto L_0x00c2
        L_0x022f:
            java.lang.Object r6 = r8.A01
            X.30V r6 = (X.AnonymousClass30V) r6
            int r5 = r8.A00
            java.lang.Object r4 = r8.A02
            X.4uZ r4 = (X.C95814uZ) r4
            X.1bD r3 = new X.1bD
            r3.<init>()
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A05 = r0
            X.8qC r0 = r6.A06
            java.util.Iterator r2 = X.C18270x1.A0Y(r0)
        L_0x0252:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0268
            java.lang.Object r1 = r2.next()
            X.4Df r1 = (X.C84664Df) r1
            boolean r0 = r1.BoJ(r4)
            if (r0 == 0) goto L_0x0252
            r1.AwZ(r3, r4)
            goto L_0x0252
        L_0x0268:
            r6.A01(r3)
            r6.A00 = r5
            return
        L_0x026e:
            java.lang.Object r0 = r8.A01
            X.4Jb r0 = (X.C86164Jb) r0
            int r4 = r8.A00
            java.lang.Object r3 = r8.A02
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r0.A00
            X.51v r2 = (X.AnonymousClass51v) r2
            X.34x r1 = r2.A06
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x028f
            X.1mV r1 = (X.C30471mV) r1
            boolean r0 = X.C383227b.A00(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0290
        L_0x028f:
            r1 = 0
        L_0x0290:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x02b4
            if (r1 != 0) goto L_0x02b4
            r2.A0P()
        L_0x0299:
            int r1 = r3.A0D
            r0 = 4
            int r0 = X.AnonymousClass358.A00(r1, r0)
            if (r0 <= 0) goto L_0x065e
            X.54T r0 = r2.A00
            X.C18290x4.A1L(r0)
            X.54T r1 = new X.54T
            r1.<init>(r2)
            r2.A00 = r1
            X.4FS r0 = r2.A0a
            X.AnonymousClass0x7.A1B(r1, r0)
            return
        L_0x02b4:
            r2.A0G()
            r0 = 3
            if (r0 != r4) goto L_0x0299
            r2.A0E()
            r2.A0D()
            goto L_0x0299
        L_0x02c1:
            java.lang.Object r4 = r8.A01
            X.5m8 r4 = (X.C113875m8) r4
            int r3 = r8.A00
            java.lang.Object r2 = r8.A02
            X.34x r2 = (X.C624134x) r2
            X.51u r1 = r4.A01
            r1.A0G()
            r0 = 3
            if (r0 != r3) goto L_0x02de
            r1.A0E()
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x065e
            r1.A0D()
            return
        L_0x02de:
            r0 = 12
            if (r3 != r0) goto L_0x065e
            r1.A0E()
            boolean r0 = r2 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x065e
            X.1mV r2 = (X.C30471mV) r2
            boolean r0 = X.C627636p.A0x(r2)
            if (r0 == 0) goto L_0x065e
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x02f8
            r1.A0D()
        L_0x02f8:
            r0 = 1
            r4.A00 = r0
            return
        L_0x02fc:
            java.lang.Object r5 = r8.A01
            X.6Bf r5 = (X.C124166Bf) r5
            java.lang.Object r0 = r8.A02
            java.util.Collection r0 = (java.util.Collection) r0
            int r4 = r8.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x030a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0320
            X.34x r2 = X.C18300x5.A0T(r3)
            java.lang.Object r0 = r5.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r0
            X.0Qw r1 = r0.A0u
            X.2z0 r0 = r2.A1J
            r1.A05(r0)
            goto L_0x030a
        L_0x0320:
            java.lang.Object r3 = r5.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r3
            java.util.List r0 = r3.A0o
            int r0 = r0.size()
            if (r4 < r0) goto L_0x0332
            r1 = 4
            r0 = 6
            r3.A1a(r1, r0)
            return
        L_0x0332:
            r3.A1V()
            r0 = -1
            r3.A00 = r0
            r3.A1W(r4)
            X.5Uh r2 = r3.A1Q()
            r1 = 4
            r0 = 6
            r3.A1Z(r2, r1, r0)
            return
        L_0x0345:
            java.lang.Object r3 = r8.A01
            X.5On r3 = (X.C103815On) r3
            java.lang.Object r2 = r8.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r8.A00
            r0 = 0
            r3.A00(r2, r0, r1)
            return
        L_0x0354:
            java.lang.Object r3 = r8.A01
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r8.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r3.setLayoutParams(r0)
            r2.run()
            return
        L_0x0369:
            java.lang.Object r6 = r8.A01
            com.whatsapp.ptv.PushToVideoRecordingCountdown r6 = (com.whatsapp.ptv.PushToVideoRecordingCountdown) r6
            int r5 = r6.A00
            r0 = 1
            int r5 = r5 - r0
            if (r5 <= 0) goto L_0x038c
            android.content.Context r4 = r6.getContext()
            X.33i r3 = r6.A03
            android.content.Context r2 = r6.getContext()
            r1 = 2131886082(0x7f120002, float:1.9406733E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.C18270x1.A1Q(r0, r5)
            java.lang.String r0 = r2.getString(r1, r0)
            X.C107295b4.A00(r4, r3, r0)
        L_0x038c:
            r6.A02(r5)
            android.os.Handler r3 = r6.A08
            if (r5 != 0) goto L_0x039d
            java.lang.Object r2 = r8.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            long r0 = r6.A01
            r3.postDelayed(r2, r0)
            return
        L_0x039d:
            int r0 = r8.A00
            long r0 = (long) r0
            r3.postDelayed(r8, r0)
            return
        L_0x03a4:
            java.lang.Object r0 = r8.A01
            X.1gP r0 = (X.AnonymousClass1gP) r0
            int r2 = r8.A00
            java.lang.Object r1 = r8.A02
            X.48d r1 = (X.C833748d) r1
            X.2cN r0 = r0.A0I
            r0.A00(r1, r2)
            return
        L_0x03b4:
            java.lang.Object r5 = r8.A01
            X.2rA r5 = (X.C55942rA) r5
            java.lang.Object r3 = r8.A02
            X.4DV r3 = (X.AnonymousClass4DV) r3
            r2 = 4
            X.2Yk r1 = r5.A0C
            r0 = r3
            X.34x r0 = (X.C624134x) r0
            X.1ak r4 = r1.A00(r0, r2)
            java.lang.String r3 = r5.A01(r3)     // Catch:{ JSONException -> 0x03e6 }
            r2 = 0
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x03e6 }
            java.lang.String r0 = "order_details"
            X.C55942rA.A00(r5, r0, r3, r1)     // Catch:{ JSONException -> 0x03e6 }
            java.lang.String r0 = "is_cta_available"
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x03e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x03e6 }
            r4.A07 = r0     // Catch:{ JSONException -> 0x03e6 }
            X.4FV r0 = r5.A06     // Catch:{ JSONException -> 0x03e6 }
            r0.BhA(r4)     // Catch:{ JSONException -> 0x03e6 }
            return
        L_0x03e6:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetails failed to construct message class attributes"
            goto L_0x0417
        L_0x03e9:
            java.lang.Object r5 = r8.A01
            X.2rA r5 = (X.C55942rA) r5
            java.lang.Object r4 = r8.A02
            X.4DV r4 = (X.AnonymousClass4DV) r4
            r2 = 4
            X.2Yk r1 = r5.A0C
            r0 = r4
            X.34x r0 = (X.C624134x) r0
            X.1ak r3 = r1.A00(r0, r2)
            java.lang.String r2 = r5.A01(r4)     // Catch:{ JSONException -> 0x0415 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0415 }
            java.lang.String r0 = "order_status"
            X.C55942rA.A00(r5, r0, r2, r1)     // Catch:{ JSONException -> 0x0415 }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x0415 }
            r3.A07 = r0     // Catch:{ JSONException -> 0x0415 }
            X.4FV r0 = r5.A06     // Catch:{ JSONException -> 0x0415 }
            r0.BhA(r3)     // Catch:{ JSONException -> 0x0415 }
            return
        L_0x0415:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetailsUpdate failed to construct message class attributes"
        L_0x0417:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x041b:
            java.lang.Object r0 = r8.A01
            X.2s0 r0 = (X.C56452s0) r0
            java.lang.Object r1 = r8.A02
            java.util.Set r1 = (java.util.Set) r1
            int r3 = r8.A00
            X.2gy r2 = r0.A04
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            com.whatsapp.jobqueue.job.SyncProfilePictureJob r0 = new com.whatsapp.jobqueue.job.SyncProfilePictureJob
            r0.<init>(r1, r3)
            r2.A02(r0)
            return
        L_0x0439:
            java.lang.Object r0 = r8.A01
            X.2Lg r0 = (X.C41702Lg) r0
            int r3 = r8.A00
            java.lang.Object r2 = r8.A02
            X.2QO r2 = (X.AnonymousClass2QO) r2
            X.2pA r1 = r0.A01
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            r1.A02(r2, r3, r0)
            return
        L_0x044f:
            java.lang.Object r0 = r8.A01
            X.2Lg r0 = (X.C41702Lg) r0
            int r3 = r8.A00
            java.lang.Object r2 = r8.A02
            X.2QO r2 = (X.AnonymousClass2QO) r2
            X.2pA r1 = r0.A01
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            r1.A01(r2, r3, r0)
            return
        L_0x0465:
            java.lang.Object r0 = r8.A01
            X.2Ld r0 = (X.C41672Ld) r0
            int r1 = r8.A00
            java.lang.Object r3 = r8.A02
            java.util.List r3 = (java.util.List) r3
            X.2Wq r0 = r0.A00
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r2 = X.C18290x4.A0j(r0, r1)
            X.66Y r2 = (X.AnonymousClass66Y) r2
            if (r2 == 0) goto L_0x065e
            r1 = 1
            r0 = 0
            r2.BEx(r3, r1, r0)
            return
        L_0x0481:
            java.lang.Object r6 = r8.A01
            com.whatsapp.pnh.RequestPhoneNumberViewModel r6 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r6
            java.lang.Object r5 = r8.A02
            X.1fH r5 = (X.C27981fH) r5
            int r7 = r8.A00
            X.33m r8 = r6.A02
            X.35J r0 = r8.A1X
            X.2z0 r4 = X.AnonymousClass35J.A01(r5, r0)
            X.2sH r0 = r8.A0V
            long r2 = r0.A0H()
            X.1mL r1 = new X.1mL
            r1.<init>(r4, r2)
            X.3Lv r0 = r8.A0l
            r0.A0V(r1)
            X.311 r8 = r6.A04
            monitor-enter(r8)
            X.34p r0 = r8.A02     // Catch:{ all -> 0x04e6 }
            long r3 = r0.A05(r5)     // Catch:{ all -> 0x04e6 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x04da
            long r9 = r8.A00(r5)     // Catch:{ all -> 0x04d8 }
            long r0 = X.AnonymousClass311.A08     // Catch:{ all -> 0x04d8 }
            long r9 = r9 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04d8 }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            if (r0 != 0) goto L_0x04da
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04e6 }
            X.2zg r0 = r8.A03     // Catch:{ all -> 0x04e6 }
            boolean r0 = r0.A03(r3, r1)     // Catch:{ all -> 0x04e6 }
            if (r0 == 0) goto L_0x04da
            r8.A02(r3, r1)     // Catch:{ all -> 0x04e6 }
            r8.A06(r5, r3)     // Catch:{ all -> 0x04e6 }
            goto L_0x04da
        L_0x04d8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04e6 }
        L_0x04da:
            monitor-exit(r8)
            X.5N2 r2 = r6.A05
            r1 = 3
            r0 = 1
            r2.A00(r5, r1, r7, r0)
            r6.A0E(r5)
            return
        L_0x04e6:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x04e9:
            java.lang.Object r0 = r8.A01
            X.30o r0 = (X.C614030o) r0
            java.lang.Object r1 = r8.A02
            X.34x r1 = (X.C624134x) r1
            int r7 = r8.A00
            X.2ph r0 = r0.A06
            r6 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r3 = 0
            r5 = r3
            r4 = r3
            r0.A02(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0501:
            java.lang.Object r6 = r8.A01
            X.2T6 r6 = (X.AnonymousClass2T6) r6
            java.lang.Object r7 = r8.A02
            X.2z0 r7 = (X.AnonymousClass2z0) r7
            int r5 = r8.A00
            r0 = 1
            X.C162457s7.A0J(r7, r0)
            X.4uZ r3 = r7.A00
            boolean r0 = r3 instanceof X.C95804uY
            if (r0 == 0) goto L_0x058d
            r8 = r3
            X.4uY r8 = (X.C95804uY) r8
            if (r8 == 0) goto L_0x058d
            X.2qf r1 = r6.A02
            X.2qz r0 = r1.A0C
            X.34x r4 = r0.A05(r7)
            if (r4 != 0) goto L_0x0538
            X.33f r0 = r1.A08
            X.1mH r4 = r0.A07(r7)
            if (r4 != 0) goto L_0x0538
            X.2qz r2 = r6.A05
            r1 = 0
            java.lang.String r0 = r7.A01
            X.34x r4 = X.C55832qz.A01(r3, r2, r0, r1)
            if (r4 != 0) goto L_0x0538
            return
        L_0x0538:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterMessageManager/nack received key="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " error="
            X.C18260x0.A0w(r0, r1, r5)
            r0 = 21
            r4.A1G(r0)
            boolean r0 = r4 instanceof X.C30331mH
            if (r0 == 0) goto L_0x057f
            X.33f r5 = r6.A00
            r3 = r4
            X.1mH r3 = (X.C30331mH) r3
            X.3Ll r2 = r5.A0P
            X.2z0 r0 = r3.A1J
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 7
            r2.A09(r1, r0)
            r5.A0E(r3)
        L_0x0566:
            boolean r0 = r4 instanceof X.C30441mS
            if (r0 == 0) goto L_0x0587
            r14 = 0
            X.4JX r9 = new X.4JX
            r9.<init>(r4, r14, r6)
            X.2nm r7 = r6.A03
            r12 = 1
            long r0 = r4.A1M
            java.lang.Long r10 = X.AnonymousClass0x9.A0n(r0, r12)
            r11 = 0
            r7.A00(r8, r9, r10, r11, r12, r14)
            return
        L_0x057f:
            X.2qz r1 = r6.A05
            r0 = 23
            r1.A07(r4, r0)
            goto L_0x0566
        L_0x0587:
            X.2Zx r0 = r6.A04
            r0.A00(r4)
            return
        L_0x058d:
            java.lang.String r0 = "NewsletterJid expected"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x0594:
            java.lang.Object r2 = r8.A01
            X.30H r2 = (X.AnonymousClass30H) r2
            java.lang.Object r0 = r8.A02
            java.util.List r0 = (java.util.List) r0
            r6 = 4
            java.util.Iterator r3 = r0.iterator()
        L_0x05a1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x065e
            java.lang.Object r1 = r3.next()
            X.2z0 r1 = (X.AnonymousClass2z0) r1
            X.2qz r0 = r2.A0s
            X.34x r5 = r0.A05(r1)
            if (r5 != 0) goto L_0x05bd
            X.33f r0 = r2.A0U
            X.1mH r5 = r0.A07(r1)
            if (r5 == 0) goto L_0x05a1
        L_0x05bd:
            X.2qB r1 = r2.A0T
            X.2z0 r0 = r5.A1J
            java.util.Set r1 = r1.A01(r0)
            boolean r0 = r5 instanceof X.C30331mH
            if (r0 == 0) goto L_0x05db
            r7 = 1
        L_0x05ca:
            X.36E r4 = r2.A08
            X.2qk r0 = r2.A04
            int r8 = X.C627336j.A00(r0, r1)
            int r9 = r1.size()
            r10 = 0
            r4.A0L(r5, r6, r7, r8, r9, r10)
            goto L_0x05a1
        L_0x05db:
            X.3Lv r0 = r2.A0Q
            X.2wf r0 = r0.A1S
            int r7 = r0.A01(r5)
            goto L_0x05ca
        L_0x05e4:
            java.lang.Object r7 = r8.A01
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r7 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r7
            java.lang.Object r8 = r8.A02
            java.util.Map r8 = (java.util.Map) r8
            r6 = 0
            r5 = 1
            java.util.SortedMap r0 = r7.A04
            java.util.Iterator r9 = X.AnonymousClass000.A0q(r0)
        L_0x05f4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x065e
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r2 = r0.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r0 = r0.getValue()
            X.7YH r0 = (X.AnonymousClass7YH) r0
            int r0 = r0.A00
            java.lang.Object r3 = X.AnonymousClass001.A0i(r8, r0)
            X.2lc r3 = (X.C52522lc) r3
            if (r3 == 0) goto L_0x05f4
            android.view.View r1 = r7.A0B
            if (r1 == 0) goto L_0x05f4
            X.C162457s7.A0H(r2)
            int r0 = r2.intValue()
            android.view.View r4 = r1.findViewById(r0)
            com.whatsapp.radio.RadioButtonWithSubtitle r4 = (com.whatsapp.radio.RadioButtonWithSubtitle) r4
            if (r4 == 0) goto L_0x05f4
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            int r0 = r3.A01
            X.AnonymousClass000.A1P(r2, r0, r6)
            int r0 = r3.A00
            X.AnonymousClass000.A1P(r2, r0, r5)
            r1 = 2131890643(0x7f1211d3, float:1.9415984E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r3 = r0.getString(r1, r2)
            java.lang.CharSequence r2 = r4.A00
            if (r3 == 0) goto L_0x0655
            if (r2 == 0) goto L_0x0654
            r1 = 2131890640(0x7f1211d0, float:1.9415978E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r3, r6)
            java.lang.String r0 = X.AnonymousClass0x7.A0n(r7, r2, r0, r5, r1)
            if (r0 == 0) goto L_0x0654
            r3 = r0
        L_0x0654:
            r2 = r3
        L_0x0655:
            r4.setSubTitle(r2)
            goto L_0x05f4
        L_0x0659:
            if (r2 == 0) goto L_0x065e
            r2.close()
        L_0x065e:
            return
        L_0x065f:
            java.lang.Object r2 = r8.A01
            X.2iO r2 = (X.C50572iO) r2
            java.lang.Object r1 = r8.A02
            X.34x r1 = (X.C624134x) r1
            int r0 = r8.A00
            r2.A00(r1, r0)
            return
        L_0x066d:
            java.lang.Object r2 = r8.A01
            X.1io r2 = (X.C29431io) r2
            java.lang.Object r1 = r8.A02
            X.34x r1 = (X.C624134x) r1
            int r0 = r8.A00
            r2.A0C(r1, r0)
            return
        L_0x067b:
            java.lang.Object r4 = r8.A01
            X.2cv r4 = (X.C47232cv) r4
            java.lang.Object r3 = r8.A02
            X.3QO r3 = (X.AnonymousClass3QO) r3
            int r2 = r8.A00
            X.33c r1 = r4.A06
            r0 = 0
            r1.A0E(r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r0 = r4.A00
            r0.put(r1, r3)
            return
        L_0x0695:
            java.lang.Object r1 = r8.A01
            X.3Mm r1 = (X.C66713Mm) r1
            java.lang.Object r6 = r8.A02
            X.3ZG r6 = (X.AnonymousClass3ZG) r6
            int r5 = r8.A00
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x06b2
            X.2O6 r0 = r1.A07
            X.3dI r0 = r0.A01
            r0.A01()
            X.3Mj r0 = r1.A06
            r0.A00()
            r0 = 1
            r1.A00 = r0
        L_0x06b2:
            X.8qC r0 = r1.A08
            java.lang.Object r4 = r0.get()
            com.whatsapp.wamsys.JniBridge r4 = (com.whatsapp.wamsys.JniBridge) r4
            int r3 = r6.code
            int r1 = r6.psId
            int r2 = r6.bufferChannel
            r0 = 0
            if (r2 == 0) goto L_0x06d4
            r0 = 1
            if (r2 == r0) goto L_0x06d4
            r0 = 2
            if (r2 == r0) goto L_0x06d4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported channel type: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r1
        L_0x06d4:
            java.util.Map r15 = r6.getFieldsMap()
            long r6 = (long) r3
            long r8 = (long) r5
            long r10 = (long) r1
            long r12 = (long) r0
            java.lang.Object r14 = X.AnonymousClass0x9.A0r(r4)
            com.whatsapp.wamsys.JniBridge.jvidispatchIIIIIOO(r6, r8, r10, r12, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71713cY.run():void");
    }

    public C71713cY(AnonymousClass1gP r2, C833748d r3) {
        this.A03 = 17;
        this.A01 = r2;
        this.A00 = 11231;
        this.A02 = r3;
    }

    public C71713cY(ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment, Map map) {
        this.A03 = 4;
        this.A01 = imageQualitySettingsBottomSheetFragment;
        this.A02 = map;
        this.A00 = R.string.f11nameremoved;
    }

    public C71713cY(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    public C71713cY(LinearLayout linearLayout, Runnable runnable) {
        this.A03 = 19;
        this.A01 = linearLayout;
        this.A00 = -1;
        this.A02 = runnable;
    }

    public C71713cY(AnonymousClass30H r2, List list) {
        this.A03 = 5;
        this.A01 = r2;
        this.A02 = list;
        this.A00 = 4;
    }
}
