package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7iq  reason: invalid class name and case insensitive filesystem */
public class C157767iq {
    public C177658gE A00;
    public AnonymousClass82Z A01;
    public AnonymousClass7FL A02;
    public final Context A03;
    public final AnonymousClass71C A04;
    public final AnonymousClass0Xd A05;
    public final C146537Aq A06;
    public final C177918gf A07;
    public final C161397pY A08;
    public final ServiceEventCallbackImpl A09;
    public final C150047Oy A0A;
    public final AnonymousClass8LG A0B;
    public final C1445071v A0C;
    public final C177928gg A0D;
    public final Map A0E;
    public final AtomicBoolean A0F;
    public final AtomicBoolean A0G;
    public final AtomicReference A0H;
    public final AtomicReference A0I;

    public static C152587Zl A00(C152777a6 r3) {
        C152587Zl r2 = new C152587Zl();
        C166577yv r1 = r3.A0F;
        r2.A00(AnonymousClass6C9.A1L(r1.A0O ? 1 : 0));
        synchronized (r2) {
        }
        synchronized (r2) {
        }
        boolean z = r1.A0P;
        synchronized (r2) {
            r2.A05 = z;
        }
        String str = r1.A0B;
        synchronized (r2) {
            r2.A00 = str;
        }
        String str2 = r1.A0C;
        synchronized (r2) {
            r2.A01 = str2;
        }
        synchronized (r2) {
        }
        synchronized (r2) {
            r2.A06 = false;
        }
        Uri uri = r1.A05;
        if (uri != null) {
            uri.getHost();
            synchronized (r2) {
            }
        }
        synchronized (r2) {
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        if (java.lang.Integer.parseInt(X.C18310x6.A0o("dash.use_play_when_ready_for_load_control", r9)) == 0) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C186328v7 A01(X.C152777a6 r25, X.AnonymousClass8L8 r26, java.util.concurrent.atomic.AtomicBoolean r27, java.util.concurrent.atomic.AtomicBoolean r28) {
        /*
            r24 = this;
            r7 = r25
            X.7yv r3 = r7.A0F
            r5 = r24
            X.8LG r2 = r5.A0B
            boolean r0 = r2.useWAPlayerPoolLoadControl
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x005a
            r0 = 32768(0x8000, float:4.5918E-41)
            X.7ZV r3 = new X.7ZV
            r3.<init>(r0)
            X.7X2 r5 = new X.7X2
            r5.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            r1 = 100
            r0 = 700(0x2bc, float:9.81E-43)
            r5.A00(r0, r2, r1, r1)
            boolean r0 = r5.A06
            r0 = r0 ^ 1
            X.C159197lM.A02(r0)
            r5.A05 = r3
        L_0x0033:
            boolean r0 = r5.A06
            r1 = 1
            r0 = r0 ^ 1
            X.C159197lM.A02(r0)
            r5.A06 = r1
            X.7ZV r6 = r5.A05
            if (r6 != 0) goto L_0x004a
            r0 = 65536(0x10000, float:9.18355E-41)
            X.7ZV r6 = new X.7ZV
            r6.<init>(r0)
            r5.A05 = r6
        L_0x004a:
            int r7 = r5.A03
            int r8 = r5.A02
            int r9 = r5.A01
            int r10 = r5.A00
            int r11 = r5.A04
            X.80n r5 = new X.80n
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x005a:
            int r8 = android.os.Build.VERSION.SDK_INT
            int r0 = r2.sdkVersionToUseDefaultLoadControl
            if (r8 >= r0) goto L_0x00ae
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x00a8
            int r0 = r2.sdkVersionToUseConservativeLoadControl
            if (r8 >= r0) goto L_0x00a8
            int r0 = r2.sdKVersionToUseCustomizedBuffering
            if (r8 > r0) goto L_0x009c
            int r5 = r2.customizedWAIndividualAllocationSize
            int r6 = r2.minCustomizedWABufferMs
            int r4 = r2.maxCustomizedWABufferMs
            int r1 = r2.customizedWABufferForPlaybackMs
            int r0 = r2.customizedWARebufferMs
        L_0x0076:
            X.7ZV r3 = new X.7ZV
            r3.<init>(r5)
            X.7X2 r5 = new X.7X2
            r5.<init>()
            r5.A00(r6, r4, r1, r0)
            boolean r0 = r5.A06
            r1 = r0 ^ 1
            X.C159197lM.A02(r1)
            r5.A05 = r3
            int r0 = r2.sdKVersionToUseTargetBufferOverwrite
            if (r0 <= 0) goto L_0x0033
            if (r8 > r0) goto L_0x0033
            int r0 = r2.targetBytesForOverwrite
            if (r0 <= 0) goto L_0x0033
            X.C159197lM.A02(r1)
            r5.A04 = r0
            goto L_0x0033
        L_0x009c:
            r6 = 1000(0x3e8, float:1.401E-42)
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = 2000(0x7d0, float:2.803E-42)
            r0 = 1000(0x3e8, float:1.401E-42)
            r1 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0076
        L_0x00a8:
            X.80n r5 = new X.80n
            r5.<init>()
            return r5
        L_0x00ae:
            X.7Ue r1 = new X.7Ue
            r1.<init>()
            r0 = r26
            int r4 = r0.minBufferMs
            int r0 = r0.minRebufferMs
            r1.A02 = r4
            r1.A01 = r0
            int r12 = r7.A02
            r4 = 1
            if (r12 > 0) goto L_0x00d7
            java.util.Map r9 = r5.A0E
            java.lang.String r6 = "dash.use_play_when_ready_for_load_control"
            boolean r0 = r9.containsKey(r6)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = X.C18310x6.A0o(r6, r9)
            int r6 = java.lang.Integer.parseInt(r0)
            r0 = 1
            if (r6 != 0) goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            r1.A0H = r0
            r23 = r27
            r0 = r23
            r1.A0B = r0
            r17 = r28
            r0 = r17
            r1.A0A = r0
            X.71C r0 = r5.A04
            r1.A06 = r0
            X.7pY r14 = r5.A08
            r1.A09 = r14
            X.7Aq r0 = r5.A06
            r1.A08 = r0
            r6 = 0
            X.8L5 r0 = r2.intentBasedBufferingConfig
            r16 = r0
            int r15 = r2.playerWarmUpWatermarkMs
            int r13 = r2.dashLowWatermarkMs
            int r10 = r2.dashHighWatermarkMs
            X.6x3 r9 = r7.A05
            boolean r0 = r2.useCellMaxWaterMarkMsConfig
            X.7il r11 = new X.7il
            r18 = r15
            r19 = r12
            r20 = r13
            r21 = r10
            r22 = r0
            r15 = r16
            r16 = r23
            r12 = r11
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            android.net.Uri r0 = r3.A05
            boolean r0 = X.AnonymousClass71F.A00(r0)
            if (r0 != 0) goto L_0x012f
            X.6vz r9 = r3.A07
            X.6vz r0 = X.C141696vz.DASH_LIVE
            boolean r0 = X.C18300x5.A1W(r9, r0)
            X.C159197lM.A01(r0)
            java.lang.String r0 = r3.A0A
            if (r0 == 0) goto L_0x012f
            r1.A07 = r11
        L_0x012f:
            int r0 = r2.sdKVersionToUseCustomizedBuffering
            boolean r10 = X.AnonymousClass6C8.A1P(r8, r0)
            boolean r9 = r7.A0G
            if (r9 == 0) goto L_0x0246
            if (r10 == 0) goto L_0x0241
            int r7 = r2.customizedWAIndividualAllocationSize
        L_0x013d:
            X.7ZV r0 = new X.7ZV
            r0.<init>(r7)
            r1.A05 = r0
            X.6vz r0 = r3.A07
            X.6vz r7 = X.C141696vz.PROGRESSIVE
            if (r0 != r7) goto L_0x0158
            boolean r0 = r2.useWatermarkEvaluatorForProgressive
            if (r0 == 0) goto L_0x0150
            r1.A07 = r11
        L_0x0150:
            boolean r0 = r2.useMaxBufferForProgressive
            if (r0 != 0) goto L_0x0158
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1.A03 = r0
        L_0x0158:
            if (r9 == 0) goto L_0x018f
            int r0 = r2.sdkVersionToUseConservativeLoadControl
            if (r8 >= r0) goto L_0x018f
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r10 == 0) goto L_0x023b
            int r9 = r2.customizedWABufferForPlaybackMs
            int r0 = r2.customizedWARebufferMs
        L_0x0166:
            r1.A02 = r9
            r1.A01 = r0
            if (r10 == 0) goto L_0x0237
            int r8 = r2.minCustomizedWABufferMs
            int r0 = r2.maxCustomizedWABufferMs
        L_0x0170:
            r11 = 0
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean
            r13.<init>(r6)
            java.util.concurrent.atomic.AtomicBoolean r14 = new java.util.concurrent.atomic.AtomicBoolean
            r14.<init>(r6)
            r16 = -1
            X.6x3 r10 = X.C142346x3.DEFAULT
            r15 = 1000(0x3e8, float:1.401E-42)
            X.7il r9 = new X.7il
            r12 = r11
            r18 = r0
            r19 = r6
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.A07 = r9
        L_0x018f:
            boolean r0 = r2.disableCapBufferSizeLocalProgressive
            if (r0 == 0) goto L_0x0231
            X.6vz r0 = r3.A07
            if (r0 == r7) goto L_0x019f
            android.net.Uri r0 = r3.A05
            boolean r0 = X.AnonymousClass71F.A00(r0)
            if (r0 == 0) goto L_0x0231
        L_0x019f:
            r1.A0F = r4
        L_0x01a1:
            int r10 = r2.videoBufferSize
            int r9 = r2.audioBufferSize
            boolean r0 = r2.enableMemoryAwareBufferSizeUsingRed
            if (r0 == 0) goto L_0x01c2
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0I
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r7 = r0.get()
            X.6y3 r0 = X.C142936y3.RED
            if (r7 == r0) goto L_0x01c1
        L_0x01b5:
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0H
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r7 = r0.get()
            X.6y3 r0 = X.C142936y3.RED
            if (r7 != r0) goto L_0x01c2
        L_0x01c1:
            r6 = 1
        L_0x01c2:
            boolean r0 = r2.enableMemoryAwareBufferSizeUsingYellow
            if (r0 == 0) goto L_0x022f
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0I
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r7 = r0.get()
            X.6y3 r0 = X.C142936y3.YELLOW
            if (r7 == r0) goto L_0x01de
        L_0x01d2:
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0H
            if (r0 == 0) goto L_0x022f
            java.lang.Object r5 = r0.get()
            X.6y3 r0 = X.C142936y3.YELLOW
            if (r5 != r0) goto L_0x022f
        L_0x01de:
            r0 = 1
        L_0x01df:
            if (r6 != 0) goto L_0x01e3
            if (r0 == 0) goto L_0x01eb
        L_0x01e3:
            double r5 = (double) r10
            double r7 = r2.redMemoryBufferSizeMultiplier
            double r5 = r5 * r7
            int r10 = (int) r5
            double r5 = (double) r9
            double r5 = r5 * r7
            int r9 = (int) r5
        L_0x01eb:
            boolean r0 = r2.useHeroBufferSize
            r1.A0J = r0
            r1.A04 = r10
            r1.A00 = r9
            java.lang.String r5 = r3.A0B
            java.lang.String r0 = "fb_stories"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0203
            boolean r0 = r2.disableStoriesCustomizedUnstallBuffer
            if (r0 != 0) goto L_0x0203
            r1.A0E = r4
        L_0x0203:
            boolean r0 = r2.updateUnstallBufferDuringPlayback
            r1.A0I = r0
            boolean r0 = r2.reportUnexpectedStopLoading
            r1.A0G = r0
            boolean r0 = r2.forceMinWatermarkGreaterThanMinRebuffer
            r1.A0D = r0
            boolean r0 = r2.bypassGreaterThanMinRebufferWhenBeforePlay
            r1.A0C = r0
            boolean r0 = r2.useMaxOfLowWatermarkOrPrevHighWaterMarkWhenForced
            r1.A0K = r0
            java.lang.String r0 = r3.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x024a
            boolean r0 = r2.useAdAwareLoadControl
            if (r0 == 0) goto L_0x024a
            X.80m r2 = r1.A00()
            X.7fe r1 = X.C155867fe.A01
            X.80l r0 = new X.80l
            r0.<init>(r2, r3, r1)
            return r0
        L_0x022f:
            r0 = 0
            goto L_0x01df
        L_0x0231:
            boolean r0 = r2.prioritizeTimeOverSizeThresholds
            r1.A0F = r0
            goto L_0x01a1
        L_0x0237:
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L_0x0170
        L_0x023b:
            r9 = 1000(0x3e8, float:1.401E-42)
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0166
        L_0x0241:
            r7 = 32768(0x8000, float:4.5918E-41)
            goto L_0x013d
        L_0x0246:
            r7 = 65536(0x10000, float:9.18355E-41)
            goto L_0x013d
        L_0x024a:
            X.80m r0 = r1.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157767iq.A01(X.7a6, X.8L8, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean):X.8v7");
    }

    public C157767iq(Context context, AnonymousClass0Xd r10, C177918gf r11, C150157Pl r12, ServiceEventCallbackImpl serviceEventCallbackImpl, C177928gg r14, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A03 = context;
        this.A0E = map;
        AnonymousClass8LG r6 = r12.A05;
        this.A0B = r6;
        C161397pY r4 = (C161397pY) r12.A08.get();
        this.A08 = r4;
        this.A09 = serviceEventCallbackImpl;
        C1445071v r7 = r12.A06;
        this.A0C = r7;
        this.A0D = r14;
        AnonymousClass0Xd r2 = r10;
        this.A0A = new C150047Oy(context, r2, new AnonymousClass85D(), r4, serviceEventCallbackImpl, r6, r7);
        this.A04 = r12.A02;
        this.A05 = r10;
        this.A0G = atomicBoolean;
        this.A0F = atomicBoolean2;
        this.A06 = (C146537Aq) r12.A07.get();
        this.A07 = r11;
        this.A0I = r12.A01;
        this.A0H = r12.A00;
    }
}
