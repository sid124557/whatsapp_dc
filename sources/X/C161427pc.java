package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import exoplayer2.av1.src.Dav1dScalingMode;
import exoplayer2.av1.src.LibDav1dVideoRenderer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7pc  reason: invalid class name and case insensitive filesystem */
public class C161427pc {
    public C185208tG A00;
    public String A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final AnonymousClass7QT A05;
    public final C146587Av A06;
    public final C162987t5 A07;
    public final C155717fO A08;
    public final ServiceEventCallbackImpl A09;
    public final AnonymousClass81X A0A;
    public final C157767iq A0B;
    public final AnonymousClass8LG A0C;
    public final Map A0D;

    public static boolean A02(HashMap hashMap) {
        try {
            for (C160577nt r1 : C162317rh.A03("video/av01", false)) {
                if (!r1.A08 && r1.A04) {
                    String str = r1.A02;
                    if (hashMap != null && !hashMap.isEmpty()) {
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        if (hashMap.containsKey(lowerCase)) {
                            int A0D2 = AnonymousClass6C8.A0D(lowerCase, hashMap);
                            if (A0D2 == -1) {
                                continue;
                            } else if (Build.VERSION.SDK_INT < A0D2) {
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (C143126yN e) {
            Object[] objArr = new Object[1];
            AnonymousClass6C9.A1C(e, objArr, 0);
            AnonymousClass6C8.A1B("Failed to query AV1 decoders on device with exception %s. AV1 Hardware decoder will not be picked.", "HeroExo2InitHelper", objArr);
            return false;
        }
    }

    public static C152767a5 A00(C152777a6 r5, AnonymousClass8LG r6) {
        C166577yv r52 = r5.A0F;
        C152767a5 A012 = C153957cL.A01(r52.A05, new C177548g3(r52.A0H, r6.dashManifestPoolSize, r6.parseManifestIdentifier, r6.enableDashManifestPool), r52.A0A);
        if (A012 != null) {
            return A012;
        }
        throw AnonymousClass002.A0C("Missing manifest");
    }

    public static void A01(AnonymousClass7QU r1, AnonymousClass8LG r2) {
        r1.A0F = r2.enableVodDrmPrefetch;
        r1.A0E = r2.enableCustomizedXHEAACConfig;
        r1.A06 = r2.xHEAACTargetReferenceLvl;
        r1.A05 = r2.xHEAACCEffectType;
        r1.A09 = r2.enableAsynchronousBufferQueueing;
        r1.A0N = r2.enableSynchronizeCodecInteractionsWithQueueing;
        r1.A0M = r2.enableSeamlessAudioCodecAdaptation;
        r1.A0C = r2.enableCustomizedDRCEffect;
        r1.A0D = r2.enableCustomizedDRCForHeadset;
        r1.A01 = r2.lateNightHourUpperThreshold;
        r1.A00 = r2.lateNightHourLowerThreshold;
        r1.A0G = r2.enableLowLatencyDecoding;
    }

    public final C1673180p A03() {
        Dav1dScalingMode dav1dScalingMode = Dav1dScalingMode.ASPECT_FIT;
        AnonymousClass8LG r0 = this.A0C;
        long j = r0.rendererAllowedJoiningTimeMs;
        int i = r0.dav1dThreads;
        int i2 = r0.dav1dMaxFrameDelay;
        boolean z = r0.dav1dApplyGrain;
        boolean z2 = r0.av1ThrowExceptionOnPictureError;
        boolean z3 = r0.av1Dav1dEnableVpsLogging;
        boolean z4 = r0.av1Dav1dUseSurfaceViewSetFix;
        boolean z5 = r0.av1SetBuffersDataspace;
        boolean z6 = r0.av1UseMemoryCleanupFixes;
        boolean z7 = r0.av1UseDav1dSynchronizationFixes;
        boolean z8 = r0.av1FlushDav1dProperly;
        boolean z9 = z2;
        boolean z10 = z4;
        return new LibDav1dVideoRenderer(dav1dScalingMode, j, 0, i, i2, z, z9, z3, z10, z5, z6, z7, z8, this.A09, this.A04, r0.enableDav1dOpenGLRendering, this.A0A, true, r0.useForceSurfaceChange, r0.enableDav1dOpenGLIncorrectSurfaceSizeFix, false, r0.maxWidthForAV1SRShader, false, r0.saturationFactor, r0.enableOpenGLSurfaceSizeUpdateFix, r0.enableDav1dOpenGLRenderingHandleAspectRatio);
    }

    public final C1673180p A04(C187008wI r34, C152777a6 r35) {
        Context context = this.A03;
        AnonymousClass7QT r15 = this.A05;
        C155717fO r1 = this.A08;
        AnonymousClass8LG r12 = this.A0C;
        C147717Fj r11 = new C147717Fj(r1, r12.appendReconfigurationDataForDrmContentFix);
        long j = r12.rendererAllowedJoiningTimeMs;
        C185208tG r14 = this.A00;
        Handler handler = this.A04;
        AnonymousClass81X r9 = this.A0A;
        boolean z = r12.useDummySurfaceExo2;
        boolean z2 = r12.isExo2AggresiveMicrostallFixEnabled;
        boolean z3 = r12.ignoreEmptyProfileLevels;
        int i = r12.decoderInitializationRetryTimeMs;
        int i2 = r12.decoderDequeueRetryTimeMs;
        int i3 = r12.renderRetryTimeMs;
        boolean z4 = r12.useOutputSurfaceWorkaround;
        boolean z5 = false;
        String str = r35.A0F.A0C;
        if (!TextUtils.isEmpty(str) && r12.originAllowlistForAlternateCodec.contains(str)) {
            z5 = true;
        }
        AnonymousClass7QT r18 = r15;
        C185208tG r152 = r14;
        return new C125856Jt(context, handler, r152, r34, r11, r18, r9, (Object) null, i, i2, i3, j, z, z2, z3, z4, false, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r56 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1673180p A05(X.C187008wI r55, boolean r56) {
        /*
            r54 = this;
            exoplayer2.av1.src.Dav1dScalingMode r17 = exoplayer2.av1.src.Dav1dScalingMode.ASPECT_FIT
            r7 = r54
            X.8LG r6 = r7.A0C
            long r13 = r6.rendererAllowedJoiningTimeMs
            int r0 = r6.dav1dThreads
            r21 = r0
            int r0 = r6.dav1dMaxFrameDelay
            r22 = r0
            boolean r0 = r6.dav1dApplyGrain
            r23 = r0
            boolean r0 = r6.av1ThrowExceptionOnPictureError
            r24 = r0
            boolean r0 = r6.av1Dav1dEnableVpsLogging
            r25 = r0
            boolean r15 = r6.av1Dav1dUseSurfaceViewSetFix
            boolean r0 = r6.enableDav1dOpenGLRendering
            if (r0 != 0) goto L_0x0026
            r27 = 0
            if (r56 == 0) goto L_0x0028
        L_0x0026:
            r27 = 1
        L_0x0028:
            boolean r12 = r6.av1SetBuffersDataspace
            boolean r11 = r6.av1UseMemoryCleanupFixes
            boolean r10 = r6.av1UseDav1dSynchronizationFixes
            boolean r9 = r6.av1FlushDav1dProperly
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r8 = r7.A09
            boolean r5 = r6.useForceSurfaceChange
            boolean r4 = r6.enableDav1dOpenGLIncorrectSurfaceSizeFix
            r20 = 0
            int r3 = r6.maxWidthForAV1SRShader
            float r2 = r6.saturationFactor
            boolean r1 = r6.enableOpenGLSurfaceSizeUpdateFix
            boolean r0 = r6.enableDav1dOpenGLRenderingHandleAspectRatio
            r33 = 1
            exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting r16 = new exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting
            r38 = r20
            r28 = r12
            r29 = r11
            r30 = r10
            r31 = r9
            r32 = r8
            r34 = r5
            r35 = r4
            r36 = r20
            r37 = r3
            r39 = r2
            r40 = r1
            r41 = r0
            r18 = r13
            r26 = r15
            r16.<init>(r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            android.content.Context r14 = r7.A03
            X.7QT r13 = r7.A05
            X.7fO r1 = r7.A08
            boolean r0 = r6.appendReconfigurationDataForDrmContentFix
            X.7Fj r10 = new X.7Fj
            r10.<init>(r1, r0)
            long r0 = r6.rendererAllowedJoiningTimeMs
            X.8tG r12 = r7.A00
            android.os.Handler r9 = r7.A04
            X.81X r11 = r7.A0A
            boolean r8 = r6.useDummySurfaceExo2
            boolean r7 = r6.isExo2AggresiveMicrostallFixEnabled
            boolean r5 = r6.ignoreEmptyProfileLevels
            int r4 = r6.decoderInitializationRetryTimeMs
            int r3 = r6.decoderDequeueRetryTimeMs
            int r2 = r6.renderRetryTimeMs
            boolean r6 = r6.useOutputSurfaceWorkaround
            X.6Jt r34 = new X.6Jt
            r38 = r55
            r35 = r14
            r36 = r9
            r37 = r12
            r39 = r10
            r40 = r13
            r41 = r11
            r42 = r16
            r43 = r4
            r44 = r3
            r45 = r2
            r46 = r0
            r48 = r8
            r49 = r7
            r50 = r5
            r51 = r6
            r52 = r33
            r53 = r20
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53)
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161427pc.A05(X.8wI, boolean):X.80p");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e3, code lost:
        if (r0 == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0100, code lost:
        if (r12.A0D == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        if (A02(r8.blockListedHardwareDecoderMap) == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012f, code lost:
        r1 = A04(r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016a A[ExcHandler: Exception | NoClassDefFoundError (e java.lang.Throwable), Splitter:B:40:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018d A[SYNTHETIC, Splitter:B:92:0x018d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C187398x9[] A07(X.C152767a5 r22, X.C152777a6 r23) {
        /*
            r21 = this;
            r11 = r23
            X.7yv r10 = r11.A0F
            boolean r0 = r10.A01()
            r9 = r21
            X.8LG r8 = r9.A0C
            if (r0 == 0) goto L_0x0028
            boolean r1 = r8.prioritizeAv1HardwareDecoder
            java.lang.String r0 = "video/av01"
            if (r1 == 0) goto L_0x0031
            java.util.HashMap r0 = r8.blockListedHardwareDecoderMap
            X.81J r7 = new X.81J
            r7.<init>(r9, r0)
        L_0x001b:
            boolean r0 = r8.isExo2DrmEnabled
            r12 = r22
            if (r0 == 0) goto L_0x00c8
            java.lang.String r3 = "; Exception: "
            java.lang.String r14 = "Device: "
            if (r22 == 0) goto L_0x0056
            goto L_0x003a
        L_0x0028:
            boolean r0 = r8.allowRequestForSoftwareDecoder
            if (r0 == 0) goto L_0x0037
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0037
            r0 = 0
        L_0x0031:
            X.81I r7 = new X.81I
            r7.<init>(r9, r0)
            goto L_0x001b
        L_0x0037:
            X.8wI r7 = X.C187008wI.A00
            goto L_0x001b
        L_0x003a:
            java.lang.String r5 = r10.A0H     // Catch:{ 6zR -> 0x0095 }
            X.7Av r4 = r9.A06     // Catch:{ 6zR -> 0x0095 }
            boolean r2 = r8.proxyDrmProvisioningRequests     // Catch:{ 6zR -> 0x0095 }
            boolean r1 = r8.enableDrmProvisioningRetry     // Catch:{ 6zR -> 0x0095 }
            boolean r0 = r8.removeGifPrefixForDRMKeyRequest     // Catch:{ 6zR -> 0x0095 }
            r15 = r12
            r16 = r4
            r17 = r5
            r18 = r2
            r19 = r1
            r20 = r0
            X.8tG r0 = X.C161047ou.A00(r15, r16, r17, r18, r19, r20)     // Catch:{ 6zR -> 0x0095 }
            r9.A00 = r0     // Catch:{ 6zR -> 0x0095 }
            goto L_0x00b7
        L_0x0056:
            boolean r0 = r11.A00()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r5 = r10.A0H     // Catch:{ 6zR -> 0x008b }
            X.7Av r4 = r9.A06     // Catch:{ 6zR -> 0x008b }
            boolean r2 = r8.proxyDrmProvisioningRequests     // Catch:{ 6zR -> 0x008b }
            boolean r1 = r8.enableDrmProvisioningRetry     // Catch:{ 6zR -> 0x008b }
            boolean r0 = r8.removeGifPrefixForDRMKeyRequest     // Catch:{ 6zR -> 0x008b }
            X.7NZ r15 = new X.7NZ     // Catch:{ 6zR -> 0x008b }
            r19 = r1
            r20 = r0
            r16 = r4
            r17 = r5
            r18 = r2
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ 6zR -> 0x008b }
            java.util.UUID r4 = X.C155567f7.A04     // Catch:{ 6zR -> 0x008b }
            X.7oK r2 = X.C160797oK.A00(r4)     // Catch:{ 6zR -> 0x008b }
            r0 = 0
            int[] r0 = new int[r0]     // Catch:{ 6zR -> 0x008b }
            X.80z r1 = new X.80z     // Catch:{ 6zR -> 0x008b }
            r1.<init>(r2, r15, r4, r0)     // Catch:{ 6zR -> 0x008b }
            X.7oK r0 = r1.A03     // Catch:{ 6zR -> 0x008b }
            r0.A06()     // Catch:{ 6zR -> 0x008b }
            r9.A00 = r1     // Catch:{ 6zR -> 0x008b }
            goto L_0x00b7
        L_0x008b:
            r13 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r6 = r9.A09
            java.lang.String r5 = r10.A0H
            java.lang.String r4 = "DRM"
            X.6xw r0 = X.C142876xw.A04
            goto L_0x009e
        L_0x0095:
            r13 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r6 = r9.A09
            java.lang.String r5 = r10.A0H
            java.lang.String r4 = "DRM"
            X.6xw r0 = X.C142876xw.A03
        L_0x009e:
            java.lang.String r2 = r0.name()
            java.lang.StringBuilder r1 = X.C18330xA.A0A(r14)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0a(r3, r1, r13)
            X.6Nr r0 = new X.6Nr
            r0.<init>(r5, r4, r2, r1)
            r6.AyO(r0)
        L_0x00b7:
            X.8tG r1 = r9.A00
            if (r1 == 0) goto L_0x00c8
            boolean r0 = r8.enableActiveDrmSessionStoreRelease
            if (r0 == 0) goto L_0x00c8
            X.7Ay r0 = new X.7Ay
            r0.<init>(r9)
            X.80z r1 = (X.C1674180z) r1
            r1.A01 = r0
        L_0x00c8:
            r13 = 0
            r9.A02 = r13
            boolean r1 = r10.A01()
            r6 = 2
            java.lang.String r5 = "HeroExo2InitHelper"
            r4 = 1
            r0 = 0
            if (r1 == 0) goto L_0x01d0
            r1 = 4
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r1 = r10.A0H
            r3[r13] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r3[r4] = r1
            r3[r6] = r1
            boolean r1 = r10.A0P
            boolean r1 = X.AnonymousClass000.A1S(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r1 = 3
            r3[r1] = r2
            java.lang.String r1 = "VideoId: %s, NeedCentering: %b, ShouldCropToFit: %b, isSponsored: %b"
            X.C161157p6.A01(r5, r1, r3)
            boolean r1 = r8.enableMixedCodecManifestSupport
            if (r1 == 0) goto L_0x0102
            if (r22 == 0) goto L_0x0102
            boolean r1 = r12.A0D
            r2 = 1
            if (r1 != 0) goto L_0x0103
        L_0x0102:
            r2 = 0
        L_0x0103:
            boolean r1 = r8.prioritizeAv1HardwareDecoder     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            if (r1 == 0) goto L_0x0134
            java.lang.String r1 = "video/av01"
            java.util.List r1 = X.C162317rh.A03(r1, r13)     // Catch:{ 6yN -> 0x0134, Exception | NoClassDefFoundError -> 0x016a }
            if (r1 == 0) goto L_0x0134
            java.util.Iterator r14 = r1.iterator()     // Catch:{ 6yN -> 0x0134, Exception | NoClassDefFoundError -> 0x016a }
        L_0x0113:
            boolean r1 = r14.hasNext()     // Catch:{ 6yN -> 0x0134, Exception | NoClassDefFoundError -> 0x016a }
            if (r1 == 0) goto L_0x0134
            java.lang.Object r3 = r14.next()     // Catch:{ 6yN -> 0x0134, Exception | NoClassDefFoundError -> 0x016a }
            X.7nt r3 = (X.C160577nt) r3     // Catch:{ 6yN -> 0x0134, Exception | NoClassDefFoundError -> 0x016a }
            boolean r1 = r3.A08     // Catch:{ 6yN -> 0x0134, Exception | NoClassDefFoundError -> 0x016a }
            if (r1 != 0) goto L_0x0113
            boolean r1 = r3.A04     // Catch:{ 6yN -> 0x0134, Exception | NoClassDefFoundError -> 0x016a }
            if (r1 == 0) goto L_0x0113
            java.util.HashMap r1 = r8.blockListedHardwareDecoderMap     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            boolean r1 = A02(r1)     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            if (r1 == 0) goto L_0x0134
            X.80p r1 = r9.A04(r7, r11)     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            goto L_0x0167
        L_0x0134:
            boolean r1 = r8.prioritizeAv1Dav1dOverLibgav1     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            if (r1 != 0) goto L_0x014d
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            r1 = 30
            if (r3 < r1) goto L_0x014d
            boolean r1 = r8.enableDav1dAsMediaCodecAdapter     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            if (r1 != 0) goto L_0x014d
            boolean r1 = r8.enableDav1dOpenGLRendering     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            if (r1 != 0) goto L_0x014d
            if (r2 != 0) goto L_0x014d
            X.80p r1 = r9.A04(r7, r11)     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            goto L_0x0167
        L_0x014d:
            boolean r1 = r8.enableDav1dAsMediaCodecAdapter     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            if (r1 != 0) goto L_0x015f
            if (r2 != 0) goto L_0x015f
            java.lang.String r2 = "Build AV1 renderer attempt with Dav1d start"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            X.C161157p6.A01(r5, r2, r1)     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            X.80p r1 = r9.A03()     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            goto L_0x0165
        L_0x015f:
            X.80p r1 = r9.A05(r7, r2)     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
            r9.A02 = r4     // Catch:{ Exception | NoClassDefFoundError -> 0x016c }
        L_0x0165:
            r9.A02 = r4     // Catch:{ Exception | NoClassDefFoundError -> 0x016c }
        L_0x0167:
            r3 = r0
            r0 = r1
            goto L_0x016e
        L_0x016a:
            r3 = move-exception
            goto L_0x016e
        L_0x016c:
            r3 = move-exception
            r0 = r1
        L_0x016e:
            java.lang.String r14 = "video/av01"
            java.lang.String r1 = "N/A"
            r9.A01 = r1
            boolean r1 = r9.A02
            if (r1 == 0) goto L_0x018d
            java.lang.String r1 = "LibDav1dDecoder"
            r9.A01 = r1
        L_0x017c:
            boolean r1 = r8.av1ThrowExceptionOnNonDav1dDecoder
            if (r1 == 0) goto L_0x02ae
            boolean r1 = r8.prioritizeAv1HardwareDecoder
            if (r1 != 0) goto L_0x02ae
            boolean r1 = r0 instanceof exoplayer2.av1.src.LibDav1dVideoRenderer
            if (r1 != 0) goto L_0x02ae
            java.lang.String r3 = "Expected Dav1d decoder but observing %s"
            java.lang.String r2 = ""
            goto L_0x01ad
        L_0x018d:
            java.util.List r2 = r7.B6o(r14, r13, r13)     // Catch:{ 6yN -> 0x017c }
            if (r2 == 0) goto L_0x017c
            boolean r1 = r2.isEmpty()     // Catch:{ 6yN -> 0x017c }
            if (r1 != 0) goto L_0x017c
            java.lang.Object r1 = r2.get(r13)     // Catch:{ 6yN -> 0x017c }
            X.7nt r1 = (X.C160577nt) r1     // Catch:{ 6yN -> 0x017c }
            if (r1 != 0) goto L_0x01a8
            java.lang.String r1 = "name"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0g(r1)     // Catch:{ 6yN -> 0x017c }
            throw r1     // Catch:{ 6yN -> 0x017c }
        L_0x01a8:
            java.lang.String r1 = r1.A02     // Catch:{ 6yN -> 0x017c }
            r9.A01 = r1     // Catch:{ 6yN -> 0x017c }
            goto L_0x017c
        L_0x01ad:
            java.util.List r1 = X.C162317rh.A03(r14, r13)     // Catch:{ 6yN -> 0x01c6 }
            if (r1 == 0) goto L_0x01c6
            boolean r0 = r1.isEmpty()     // Catch:{ 6yN -> 0x01c6 }
            if (r0 != 0) goto L_0x01c6
            java.lang.Object r0 = r1.get(r13)     // Catch:{ 6yN -> 0x01c6 }
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r0.toString()     // Catch:{ 6yN -> 0x01c6 }
            if (r0 == 0) goto L_0x01c6
            r2 = r0
        L_0x01c6:
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r3, (java.lang.Object) r2)
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            throw r1
        L_0x01d0:
            r3 = r0
        L_0x01d1:
            java.lang.String r1 = r10.A0G
            if (r1 == 0) goto L_0x0247
            java.lang.String r0 = "vp9"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x01e5
            java.lang.String r0 = "vp09"
            boolean r0 = r1.startsWith(r0)
        L_0x01e3:
            if (r0 == 0) goto L_0x0252
        L_0x01e5:
            java.lang.String r1 = "libvpx"
            java.lang.String r0 = r8.vp9PlaybackDecoderName
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0252
            java.lang.String r0 = "com.facebook.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r19 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x036f }
            r1 = 7
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x036f }
            java.lang.Class r16 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x036f }
            r2[r13] = r16     // Catch:{ Exception -> 0x036f }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x036f }
            r2[r4] = r0     // Catch:{ Exception -> 0x036f }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r2[r6] = r0     // Catch:{ Exception -> 0x036f }
            java.lang.Class<X.81X> r0 = X.AnonymousClass81X.class
            r18 = 3
            r2[r18] = r0     // Catch:{ Exception -> 0x036f }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x036f }
            r17 = 4
            r2[r17] = r0     // Catch:{ Exception -> 0x036f }
            r15 = 5
            r2[r15] = r16     // Catch:{ Exception -> 0x036f }
            r14 = 6
            r2[r14] = r16     // Catch:{ Exception -> 0x036f }
            r0 = r19
            java.lang.reflect.Constructor r16 = r0.getConstructor(r2)     // Catch:{ Exception -> 0x036f }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x036f }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x036f }
            r2[r13] = r0     // Catch:{ Exception -> 0x036f }
            long r0 = r8.rendererAllowedJoiningTimeMs     // Catch:{ Exception -> 0x036f }
            X.AnonymousClass000.A1Q(r2, r4, r0)     // Catch:{ Exception -> 0x036f }
            android.os.Handler r0 = r9.A04     // Catch:{ Exception -> 0x036f }
            r2[r6] = r0     // Catch:{ Exception -> 0x036f }
            X.81X r0 = r9.A0A     // Catch:{ Exception -> 0x036f }
            r2[r18] = r0     // Catch:{ Exception -> 0x036f }
            r0 = r17
            X.AnonymousClass000.A1P(r2, r13, r0)     // Catch:{ Exception -> 0x036f }
            boolean r0 = r8.exo2Vp9UseSurfaceRenderer     // Catch:{ Exception -> 0x036f }
            X.AnonymousClass6C7.A1V(r2, r15, r0)     // Catch:{ Exception -> 0x036f }
            boolean r0 = r8.vp9BlockingReleaseSurface     // Catch:{ Exception -> 0x036f }
            X.AnonymousClass6C7.A1V(r2, r14, r0)     // Catch:{ Exception -> 0x036f }
            r0 = r16
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ Exception -> 0x036f }
            X.80p r0 = (X.C1673180p) r0     // Catch:{ Exception -> 0x036f }
            goto L_0x0256
        L_0x0247:
            java.lang.String r1 = r10.A0A
            if (r1 == 0) goto L_0x0252
            java.lang.String r0 = "codecs=\"vp"
            boolean r0 = r1.contains(r0)
            goto L_0x01e3
        L_0x0252:
            X.80p r0 = r9.A04(r7, r11)
        L_0x0256:
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r1 = r9.A09
            r17 = r1
            java.lang.String r15 = ""
            if (r3 == 0) goto L_0x028d
            java.lang.String r1 = r10.A0H
            if (r1 == 0) goto L_0x0263
            r15 = r1
        L_0x0263:
            java.lang.String r14 = "AV1_INSTANTIATION"
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r16 = X.C18310x6.A0n(r3)
            r2[r13] = r16
            X.AnonymousClass6C9.A1C(r3, r2, r4)
            java.lang.String r1 = "%s: %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            X.6Nr r2 = new X.6Nr
            r2.<init>(r15, r14, r14, r1)
            r1 = r17
            r1.AyO(r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r13] = r16
            X.AnonymousClass6C9.A1C(r3, r2, r4)
            java.lang.String r1 = "Build AV1 renderer attempt with Dav1d failed with %s: %s"
            X.C161157p6.A01(r5, r1, r2)
            goto L_0x02b9
        L_0x028d:
            boolean r1 = r10.A01()
            if (r1 == 0) goto L_0x02b9
            java.lang.String r1 = r10.A0H
            if (r1 == 0) goto L_0x0298
            r15 = r1
        L_0x0298:
            java.lang.String r3 = "AV1_INSTANTIATION"
            java.lang.String r1 = "Dav1d Voltron module is not available for AV1 video"
            X.6Nr r2 = new X.6Nr
            r2.<init>(r15, r3, r3, r1)
            r1 = r17
            r1.AyO(r2)
            java.lang.String r2 = "Build AV1 renderer attempt with Dav1d failed with voltron module unavailable"
            java.lang.Object[] r1 = new java.lang.Object[r13]
            X.C161157p6.A01(r5, r2, r1)
            goto L_0x02b9
        L_0x02ae:
            if (r0 == 0) goto L_0x01d1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r13] = r0
            java.lang.String r1 = "Build AV1 renderer attempt with success, impl %s"
            X.C161157p6.A01(r5, r1, r2)
        L_0x02b9:
            X.6uz r1 = X.C141076uz.AUDIO_ONLY
            int r2 = r1.mValue
            int r1 = r11.A01
            if (r2 != r1) goto L_0x02cd
            X.6JR r10 = new X.6JR
            r10.<init>()
        L_0x02c6:
            r1 = 2
            X.8x9[] r1 = new X.C187398x9[r1]
            X.AnonymousClass000.A16(r0, r10, r1)
            return r1
        L_0x02cd:
            boolean r1 = r8.enableSpatialOpusRendererExo2
            if (r1 == 0) goto L_0x0329
            boolean r1 = r10.A0O
            if (r1 == 0) goto L_0x0329
            if (r22 == 0) goto L_0x0329
            java.util.List r2 = r12.A0A
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0329
            java.lang.Object r1 = r2.get(r13)
            X.7Se r1 = (X.C150777Se) r1
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x0329
            java.lang.Object r1 = r2.get(r13)
            X.7Se r1 = (X.C150777Se) r1
            java.util.List r1 = r1.A01
            int r1 = r1.size()
            if (r1 <= r4) goto L_0x0329
            java.lang.Object r1 = r2.get(r13)
            X.7Se r1 = (X.C150777Se) r1
            X.7PZ r1 = X.C150777Se.A00(r1, r4)
            java.util.List r1 = r1.A05
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0329
            java.lang.Object r1 = r2.get(r13)
            X.7Se r1 = (X.C150777Se) r1
            X.7PZ r1 = X.C150777Se.A00(r1, r4)
            java.util.List r1 = r1.A05
            java.lang.Object r1 = r1.get(r13)
            X.7aP r1 = (X.C152937aP) r1
            X.7z1 r1 = r1.A00
            java.lang.String r2 = r1.A0P
            java.lang.String r1 = "audio/webm"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0329
            r10 = 0
            goto L_0x02c6
        L_0x0329:
            android.content.Context r11 = r9.A03
            X.7QT r4 = r9.A05
            X.7fO r2 = r9.A08
            boolean r1 = r8.appendReconfigurationDataForDrmContentFix
            X.7Fj r3 = new X.7Fj
            r3.<init>(r2, r1)
            X.8tG r13 = r9.A00
            boolean r5 = r10.A0K
            boolean r2 = r8.isAudioDataSummaryEnabled
            android.os.Handler r12 = r9.A04
            X.81X r6 = r9.A0A
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            boolean r1 = r8.enablePCMBufferListener
            if (r1 == 0) goto L_0x0350
            X.6Jf r1 = new X.6Jf
            r1.<init>(r6)
            r9.add(r1)
        L_0x0350:
            int r1 = r9.size()
            X.8wM[] r1 = new X.C187048wM[r1]
            java.lang.Object[] r1 = r9.toArray(r1)
            X.8wM[] r1 = (X.C187048wM[]) r1
            X.6Ju r10 = new X.6Ju
            r14 = r7
            r15 = r3
            r16 = r4
            r17 = r6
            r18 = r1
            r19 = r5
            r20 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x02c6
        L_0x036f:
            r0 = move-exception
            java.lang.RuntimeException r1 = X.C18330xA.A09(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161427pc.A07(X.7a5, X.7a6):X.8x9[]");
    }

    public C161427pc(Context context, Handler handler, C150157Pl r10, C162987t5 r11, ServiceEventCallbackImpl serviceEventCallbackImpl, C157767iq r13, Map map) {
        AnonymousClass7QU r1;
        this.A03 = context;
        this.A0D = map;
        AnonymousClass8LG r2 = r10.A05;
        this.A0C = r2;
        this.A06 = r10.A04;
        this.A04 = handler;
        this.A09 = serviceEventCallbackImpl;
        this.A08 = new C155717fO(serviceEventCallbackImpl);
        this.A07 = r11;
        C159847mZ.A01 = r2.enableSystrace;
        this.A0A = new AnonymousClass81X(r11, r2, r2.disableTextRendererOn404LoadError, r2.disableTextRendererOn404InitSegmentLoadError, r2.disableTextRendererOn500LoadError, r2.disableTextRendererOn500InitSegmentLoadError);
        if (r2.isExo2MediaCodecReuseEnabled) {
            r1.A0L = r2.enableMediaCodecPoolingForVodVideo;
            r1.A0K = r2.enableMediaCodecPoolingForVodAudio;
            r1.A02 = r2.maxMediaCodecInstancesPerCodecName;
            r1.A03 = r2.maxMediaCodecInstancesTotal;
            r1.A0P = r2.skipMediaCodecStopOnRelease;
            r1.A0O = r2.skipAudioMediaCodecStopOnRelease;
            r1.A0B = r2.enableCodecDeadlockFix;
            r1.A0I = r2.enableMediaCodecReuseOptimizeLock;
            r1.A0J = r2.enableMediaCodecReuseOptimizeRelease;
            r1.A07 = r2.useMediaCodecPoolingForCodecByName;
            r1.A0R = r2.useVersion2_18Workarounds;
            r1.A0Q = r2.useCodecNeedsEosBufferTimestampWorkaround;
            r1.A04 = r2.releaseThreadInterval;
            A01(r1, r2);
            r1.A08 = r2.disablePoolingForDav1dMediaCodec;
        } else {
            r1 = new AnonymousClass7QU();
            r1.A0P = r2.skipMediaCodecStopOnRelease;
            r1.A0O = r2.skipAudioMediaCodecStopOnRelease;
            r1.A0B = r2.enableCodecDeadlockFix;
            A01(r1, r2);
            r1.A07 = r2.useMediaCodecPoolingForCodecByName;
            r1.A0R = r2.useVersion2_18Workarounds;
            r1.A0Q = r2.useCodecNeedsEosBufferTimestampWorkaround;
        }
        r1.A0A = r2.enableAudioTrackRetry;
        this.A05 = new AnonymousClass7QT(r1);
        this.A0B = r13;
    }

    public void A06(C166577yv r11) {
        ServiceEventCallbackImpl serviceEventCallbackImpl;
        String str;
        if (r11.A01()) {
            AnonymousClass8LG r1 = this.A0C;
            String str2 = "null";
            if (r1.prioritizeAv1HardwareDecoder && A02(r1.blockListedHardwareDecoderMap)) {
                serviceEventCallbackImpl = this.A09;
                str = "Hardware Decoder";
            } else if (this.A02) {
                serviceEventCallbackImpl = this.A09;
                str = "Dav1d";
            } else if (Build.VERSION.SDK_INT >= 30) {
                serviceEventCallbackImpl = this.A09;
                str = "LibGav1";
            } else {
                return;
            }
            String str3 = r11.A0H;
            if (str3 != null) {
                str2 = str3;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AV1 decoding using ");
            A0o.append(str);
            A0o.append(";");
            String str4 = this.A01;
            if (str4 == null) {
                str4 = "N/A";
            }
            serviceEventCallbackImpl.AyO(new C126386Nr(str2, "AV1_INSTANTIATION", "AV1_INSTANTIATION", AnonymousClass000.A0X(str4, A0o)));
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass001.A1K("AV1 decoding using ", str, ";", A0o2);
            String str5 = this.A01;
            if (str5 == null) {
                str5 = "N/A";
            }
            C161157p6.A01("HeroExo2InitHelper", AnonymousClass000.A0X(str5, A0o2), new Object[0]);
        }
    }
}
