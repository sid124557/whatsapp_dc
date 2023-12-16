package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatRawEventLogger;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper;
import com.facebook.hybridlogsink.HybridLogSink;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Zk  reason: invalid class name and case insensitive filesystem */
public class C195759Zk implements C185808uH, C202919mp, C203709oB {
    public static final C203689o9 A0f = new C1904296e();
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public AnonymousClass9TS A03;
    public XplatSparsLogger A04;
    public C202309ll A05;
    public C194779Ul A06;
    public C195809Zp A07;
    public C195819Zq A08;
    public C195829Zr A09;
    public C195839Zs A0A;
    public String A0B = null;
    public String A0C = null;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H;
    public boolean A0I = true;
    public boolean A0J = false;
    public final AnonymousClass9MF A0K;
    public final AnonymousClass9QV A0L;
    public final AnonymousClass9PB A0M;
    public final AnonymousClass9LB A0N;
    public final AnonymousClass9PW A0O;
    public final C193419Oo A0P;
    public final C194499Tc A0Q;
    public final AnonymousClass9PC A0R = new AnonymousClass9PC();
    public final QPLUserFlowImpl A0S;
    public final C203669o7 A0T;
    public final AnonymousClass9O2 A0U = new AnonymousClass9O2();
    public final Object A0V = AnonymousClass002.A0D();
    public final Executor A0W;
    public final boolean[] A0X;
    public volatile AnonymousClass9V9 A0Y = null;
    public volatile AnonymousClass7XK A0Z = null;
    public volatile C203689o9 A0a;
    public volatile C156147g6 A0b = null;
    public volatile boolean A0c = false;
    public volatile boolean A0d = true;
    public volatile boolean A0e = false;

    public C195759Zk(Context context, AnonymousClass9MF r5, AnonymousClass9QV r6, AnonymousClass9LB r7, C194499Tc r8, QPLUserFlowImpl qPLUserFlowImpl, Executor executor) {
        this.A0L = r6;
        this.A0N = r7;
        this.A0K = r5;
        this.A0T = r5.A00;
        this.A0W = executor;
        this.A0Q = r8;
        this.A0P = new C193419Oo(r8);
        this.A0M = new AnonymousClass9PB(context, new C192919Mg(r6));
        this.A0O = new AnonymousClass9PW(r7, r8);
        this.A0X = new boolean[C192499Jz.values().length];
        this.A0S = qPLUserFlowImpl;
        C162477s9.A04(Integer.valueOf(hashCode()), "FbMsqrdRenderer", "FbMsqrdRenderer %s - ctor");
    }

    public final synchronized void A04() {
        C195809Zp r1;
        C195819Zq r0;
        C195829Zr r8;
        int i;
        if (this.A0c && this.A03 != null) {
            AnonymousClass9PC r4 = this.A0R;
            if (!(!r4.A03 || (r1 = r4.A00) == null || (r0 = r4.A01) == null || (r8 = r4.A02) == null)) {
                int i2 = 0;
                r4.A03 = false;
                C193419Oo r7 = this.A0P;
                int i3 = r0.A01;
                int i4 = r0.A00;
                AnonymousClass20J r6 = r1.A00;
                AnonymousClass20J r3 = AnonymousClass20J.FRONT;
                boolean A1Y = AnonymousClass000.A1Y(r6, r3);
                int i5 = r8.A00 * 90;
                int i6 = r8.A01;
                if (A1Y) {
                    i = 360 - ((i6 + i5) % 360);
                } else {
                    i = (i6 - i5) + 360;
                }
                int i7 = i % 360;
                boolean A1Y2 = AnonymousClass000.A1Y(r6, r3);
                r7.A00 = i7;
                r7.A01 = A1Y2;
                r7.A02.A01().setupImageSourceFacet(i3, i4, i3, i7, A1Y2);
                C194499Tc r12 = this.A0Q;
                if (r4.A00.A00 != r3) {
                    i2 = 1;
                }
                r12.A01().setCameraFacing(i2);
            }
        }
    }

    public static void A00(long j, String str) {
        C162477s9.A04(Long.valueOf(SystemClock.elapsedRealtime() - j), "FbMsqrdRenderer", str);
    }

    public final C203689o9 A01() {
        C203689o9 r0 = this.A0a;
        if (r0 != null) {
            return r0;
        }
        if (C162477s9.A01.BI0(6)) {
            C162477s9.A01.B2F("FbMsqrdRenderer", "====== No proper logger !!!!!!!!!! ======");
        }
        if (!AnonymousClass702.isDebugBuild()) {
            QuickPerformanceLogger A002 = C1454776a.A00();
            if (A002 != null) {
                A002.markerGenerate(11282540, 4, 1, TimeUnit.MILLISECONDS);
            }
            return A0f;
        }
        throw AnonymousClass002.A0E("FbMsqrdRenderer has null logger. Report to camera_platform_android oncall");
    }

    public final void A02() {
        if (!this.A0G) {
            C194499Tc r2 = this.A0Q;
            synchronized (r2) {
                r2.A01().setupServiceHost(r2.A00());
                AREngineController A012 = r2.A01();
                if (A012.renderSessionInit(false, false, 0, (C177788gS) null, (HybridLogSink) null, false)) {
                    A012.updatePerSessionDebugConfiguration(0, false, false, false);
                }
            }
            this.A0G = true;
        }
    }

    public final void A03() {
        C202309ll r1 = this.A05;
        if (r1 != null) {
            C195809Zp r0 = this.A07;
            if (r0 != null) {
                r1.Blv(r0.A00);
                this.A07 = null;
            }
            C195839Zs r12 = this.A0A;
            if (r12 != null) {
                C202309ll r02 = this.A05;
                int i = r12.A02;
                int i2 = r12.A01;
                float f = r12.A00;
                CaptureEventInputWrapper captureEventInputWrapper = ((AnonymousClass9Yq) r02).A00;
                if (captureEventInputWrapper != null) {
                    captureEventInputWrapper.setPreviewViewInfo(i, i2, f);
                }
                this.A0A = null;
            }
            C195819Zq r13 = this.A08;
            if (r13 != null) {
                C202309ll r03 = this.A05;
                int i3 = r13.A01;
                int i4 = r13.A00;
                CaptureEventInputWrapper captureEventInputWrapper2 = ((AnonymousClass9Yq) r03).A00;
                if (captureEventInputWrapper2 != null) {
                    captureEventInputWrapper2.setCaptureDeviceSize(i3, i4);
                }
                this.A08 = null;
            }
            C195829Zr r14 = this.A09;
            if (r14 != null) {
                C202309ll r04 = this.A05;
                int i5 = r14.A00;
                CaptureEventInputWrapper captureEventInputWrapper3 = ((AnonymousClass9Yq) r04).A00;
                if (captureEventInputWrapper3 != null) {
                    captureEventInputWrapper3.setRotation(i5);
                }
                this.A09 = null;
            }
        }
    }

    public final void A05(AnonymousClass9TS r2) {
        if (r2 != null) {
            r2.A02(this, AnonymousClass22N.INPUT_PREVIEW_SIZE);
            r2.A02(this, AnonymousClass22N.INPUT_FACING);
            r2.A02(this, AnonymousClass22N.INPUT_ROTATION);
            r2.A02(this, AnonymousClass22N.TOUCH_INPUT_CONFIG);
            r2.A02(this, AnonymousClass22N.A0P);
            r2.A02(this, AnonymousClass22N.A0R);
            r2.A02(this, AnonymousClass22N.A0I);
            r2.A02(this, AnonymousClass22N.A0Q);
            r2.A02(this, AnonymousClass22N.PREVIEW_VIEW_SIZE);
            r2.A02(this, AnonymousClass22N.A0C);
            r2.A02(this, AnonymousClass22N.INPUT_CAPTURE_CONTEXT);
            r2.A02(this, AnonymousClass22N.A0W);
        }
    }

    public final void A06(AnonymousClass9TS r2) {
        if (r2 != null) {
            r2.A03(this, AnonymousClass22N.INPUT_PREVIEW_SIZE);
            r2.A03(this, AnonymousClass22N.INPUT_FACING);
            r2.A03(this, AnonymousClass22N.INPUT_ROTATION);
            r2.A03(this, AnonymousClass22N.INPUT_PREVIEW);
            r2.A03(this, AnonymousClass22N.A0L);
            r2.A03(this, AnonymousClass22N.TOUCH_INPUT_CONFIG);
            r2.A03(this, AnonymousClass22N.A0P);
            r2.A03(this, AnonymousClass22N.A0R);
            r2.A03(this, AnonymousClass22N.A0I);
            r2.A03(this, AnonymousClass22N.A0Q);
            r2.A03(this, AnonymousClass22N.PREVIEW_VIEW_SIZE);
            r2.A03(this, AnonymousClass22N.A0C);
            r2.A03(this, AnonymousClass22N.INPUT_CAPTURE_CONTEXT);
            r2.A03(this, AnonymousClass22N.EXTERNAL_WORLD_TRACKING_EVENT);
            r2.A03(this, AnonymousClass22N.PLATFORM_ALGORITHM_DATA_EVENT);
            r2.A03(this, AnonymousClass22N.A0W);
        }
    }

    public final void A07(AnonymousClass9TS r9, EffectServiceHost effectServiceHost) {
        EffectServiceHost effectServiceHost2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        EffectServiceHost effectServiceHost3;
        int ordinal;
        AnonymousClass22N r0;
        if (r9 != null) {
            this.A0D = effectServiceHost.isPlatformAlgorithmDataNeeded();
            if (!effectServiceHost.isFrameDataNeeded()) {
                r9.A03(this, AnonymousClass22N.EXTERNAL_WORLD_TRACKING_EVENT);
                r9.A03(this, AnonymousClass22N.PLATFORM_ALGORITHM_DATA_EVENT);
                r9.A03(this, AnonymousClass22N.A0L);
                r9.A03(this, AnonymousClass22N.INPUT_PREVIEW);
                return;
            }
            if (!effectServiceHost.isSLAMNeeded()) {
                r9.A03(this, AnonymousClass22N.EXTERNAL_WORLD_TRACKING_EVENT);
                r0 = AnonymousClass22N.A0L;
            } else {
                C194499Tc r2 = this.A0Q;
                if (!(r2.A0B == null || r2.A00() == null)) {
                    if (r2.A0B != null) {
                        effectServiceHost2 = r2.A00();
                    } else {
                        effectServiceHost2 = null;
                    }
                    if (effectServiceHost2.mArExperimentUtil != null) {
                        int ordinal2 = AnonymousClass9JP.A02.ordinal();
                        if (ordinal2 == 2 || ordinal2 == 120) {
                            C195779Zm r3 = new C195779Zm();
                            HashMap hashMap = r3.A00;
                            if (r2.A00().mEffectManifest != null) {
                                z = r2.A00().mEffectManifest.usesWorldTrackingEnvironmentLight;
                            } else {
                                z = false;
                            }
                            hashMap.put("enableARCoreLightEstimation", Boolean.valueOf(z));
                            if (r2.A00() != null) {
                                z2 = r2.A00().isHorizontalTrackableDetectionNeeded();
                            } else {
                                z2 = false;
                            }
                            hashMap.put("enableARCoreHorizontalPlanes", Boolean.valueOf(z2));
                            if (r2.A00() != null) {
                                z3 = r2.A00().isVerticalTrackableDetectionNeeded();
                            } else {
                                z3 = false;
                            }
                            hashMap.put("enableARCoreVerticalPlanes", Boolean.valueOf(z3));
                            EffectManifest effectManifest = r2.A00().mEffectManifest;
                            boolean z5 = false;
                            if (effectManifest != null) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("getEffectServiceHost().getManifest() usesSceneDepth: ");
                                C162477s9.A06("FbMsqrdRenderer", C18300x5.A0m(A0o, effectManifest.usesSceneDepth));
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("getEffectServiceHost().getManifest() usesMultiplane: ");
                                C162477s9.A06("FbMsqrdRenderer", C18300x5.A0m(A0o2, effectManifest.usesMultiplane));
                                if (!(r2.A0B == null || r2.A00() == null)) {
                                    if (r2.A0B != null) {
                                        effectServiceHost3 = r2.A00();
                                    } else {
                                        effectServiceHost3 = null;
                                    }
                                    if (effectServiceHost3.mArExperimentUtil != null && ((ordinal = AnonymousClass9JP.A03.ordinal()) == 2 || ordinal == 120)) {
                                        z4 = true;
                                        C162477s9.A06("FbMsqrdRenderer", AnonymousClass000.A0b("WorldTracker_EnableHitTestWithDepth: ", AnonymousClass001.A0o(), z4));
                                        if (effectManifest.usesSceneDepth || (effectManifest.usesMultiplane && z4)) {
                                            z5 = true;
                                        }
                                    }
                                }
                                z4 = false;
                                C162477s9.A06("FbMsqrdRenderer", AnonymousClass000.A0b("WorldTracker_EnableHitTestWithDepth: ", AnonymousClass001.A0o(), z4));
                                z5 = true;
                            }
                            hashMap.put("enableARCoreDepth", Boolean.valueOf(z5));
                            r9.A01(r3, (C202919mp) null);
                            r9.A02(this, AnonymousClass22N.EXTERNAL_WORLD_TRACKING_EVENT);
                            if (this.A0D) {
                                r9.A02(this, AnonymousClass22N.PLATFORM_ALGORITHM_DATA_EVENT);
                            }
                        } else {
                            r9.A03(this, AnonymousClass22N.EXTERNAL_WORLD_TRACKING_EVENT);
                            r0 = AnonymousClass22N.PLATFORM_ALGORITHM_DATA_EVENT;
                        }
                    }
                }
                r9.A02(this, AnonymousClass22N.INPUT_PREVIEW);
            }
            r9.A03(this, r0);
            r9.A02(this, AnonymousClass22N.INPUT_PREVIEW);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass7XK r37, X.C156147g6 r38) {
        /*
            r36 = this;
            r5 = r36
            r5.A04()
            X.9Tc r0 = r5.A0Q
            r35 = r0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r4 = r35.A00()
            r6 = r37
            java.lang.String r0 = r6.A04
            if (r0 == 0) goto L_0x0015
            r4.mProductSessionId = r0
        L_0x0015:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r35.A00()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r0 = r0.mEffectServiceHostConfig     // Catch:{ EffectsFrameworkException -> 0x0303 }
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig r0 = r0.mFaceTrackerDataProviderConfig     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Js r13 = X.AnonymousClass9Js.DEFAULT     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 == 0) goto L_0x0027
            int r0 = r0.executionMode     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 == 0) goto L_0x0027
            X.9Js r13 = X.AnonymousClass9Js.STILL_IMAGE     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x0027:
            X.9PB r7 = r5.A0M     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r2 = 0
            X.9V9 r0 = r6.A02     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 == 0) goto L_0x005e
            X.9VR r3 = new X.9VR     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r3.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x0033:
            r7.A00 = r3     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.util.HashMap r9 = r6.A0B     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r11 = 0
            if (r9 == 0) goto L_0x0085
            java.util.Set r1 = r9.keySet()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.Object[] r8 = r1.toArray(r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ EffectsFrameworkException -> 0x0303 }
            int r0 = r9.size()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r1 = 0
        L_0x004d:
            int r0 = r9.size()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r1 >= r0) goto L_0x006d
            r0 = r8[r1]     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r3[r1] = r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
            int r1 = r1 + 1
            goto L_0x004d
        L_0x005e:
            android.content.Context r1 = r7.A01     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9VR r3 = new X.9VR     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r3.<init>()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Nx r0 = new X.9Nx     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.<init>(r1)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r3.A02 = r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
            goto L_0x0033
        L_0x006d:
            java.lang.String r1 = r6.A07     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9VR r0 = r7.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Jq r15 = X.C192419Jq.A01     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Yp r14 = new X.9Yp     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r14.<init>(r7, r6)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Pm r12 = new X.9Pm     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r16 = r1
            r17 = r8
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.A00 = r12     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x0085:
            java.util.Map r3 = r6.A0C     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r3 == 0) goto L_0x00b9
            java.util.Set r1 = r3.keySet()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.Object[] r9 = r1.toArray(r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ EffectsFrameworkException -> 0x0303 }
            int r0 = r3.size()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r1 = 0
        L_0x009c:
            int r0 = r3.size()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r1 >= r0) goto L_0x00ad
            r0 = r9[r1]     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r8[r1] = r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00ad:
            X.9VR r3 = r7.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9U7 r1 = X.AnonymousClass96E.A02     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.96E r0 = new X.96E     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.<init>(r9, r8)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r3.A01(r1, r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x00b9:
            X.9VR r0 = r7.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9V9 r10 = new X.9V9     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r10.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9U7 r1 = X.AnonymousClass96C.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.util.HashMap r9 = r10.A05     // Catch:{ EffectsFrameworkException -> 0x0303 }
            boolean r0 = r9.containsKey(r1)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 == 0) goto L_0x00d4
            r10.A01(r1)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String r0 = "getDataSource"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            throw r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x00d4:
            r5.A0Y = r10     // Catch:{ EffectsFrameworkException -> 0x0303 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r35.A00()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost r0 = (com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost) r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
            com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger r0 = r0.analyticsLogger     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r35.A00()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 == 0) goto L_0x0103
            java.lang.String r7 = r6.A03     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r7 != 0) goto L_0x00e9
            java.lang.String r7 = ""
        L_0x00e9:
            java.lang.String r3 = r6.A01     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r3 != 0) goto L_0x00ef
            java.lang.String r3 = ""
        L_0x00ef:
            X.9Jt r1 = r6.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r0 = (com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl) r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.mProductName = r7     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.mEffectStartIntent = r1     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9PA r0 = r0.mCameraARAnalyticsLogger     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 == 0) goto L_0x0103
            r0.A00 = r7     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Zw r0 = r0.A01     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.A01 = r3     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.A00 = r1     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x0103:
            X.9Jt r1 = r6.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Jt r0 = X.C192439Jt.USER_INTERACTION     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r1 != r0) goto L_0x010d
            X.9Jt r0 = X.C192439Jt.SYSTEM     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r6.A00 = r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x010d:
            r6.A01 = r2     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Nx r2 = r10.A03     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r2 == 0) goto L_0x011e
            X.9o9 r1 = r5.A01()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Mf r0 = new X.9Mf     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.<init>(r1)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r2.A00 = r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x011e:
            java.lang.String r8 = "Time to setEffect: %d"
            java.lang.String r0 = r6.A06     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r19 = r0
            r7 = r0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r35.A00()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            java.lang.String r0 = r0.mProductSessionId     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r18 = r0
            java.lang.String r0 = r6.A01     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r17 = r0
            X.9Jt r13 = r6.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r2 = 1
            r5.A0E = r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r5.A0F = r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2 = 0
            r5.A02 = r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r5.A0H = r11     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r14 = r35.A00()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.List r2 = r14.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x014c:
            boolean r2 = r3.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x015c
            java.lang.Object r2 = r3.next()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration r2 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration) r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.destroy()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            goto L_0x014c
        L_0x015c:
            java.util.List r2 = r14.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.clear()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r14.mServicesHostConfiguration = r10     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2 = 4
            X.9U7[] r15 = new X.AnonymousClass9U7[r2]     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.9U7 r3 = X.AnonymousClass96I.A01     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r15[r11] = r3     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r11 = 1
            X.9U7 r2 = X.AnonymousClass96A.A00     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r15[r11] = r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r11 = 2
            X.9U7 r2 = com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration.A00     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r15[r11] = r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r11 = 3
            X.9U7 r2 = X.AnonymousClass96G.A04     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r15[r11] = r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.List r2 = X.AnonymousClass8UF.A0o(r15)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x0189:
            boolean r2 = r16.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x01d4
            java.lang.Object r11 = r16.next()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            boolean r2 = r9.containsKey(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x0189
            java.lang.Object r11 = r9.get(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.9SF r11 = (X.AnonymousClass9SF) r11     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            boolean r2 = r11 instanceof X.AnonymousClass96F     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x01ae
            X.96F r11 = (X.AnonymousClass96F) r11     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x01aa:
            r15.add(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            goto L_0x0189
        L_0x01ae:
            boolean r2 = r11 instanceof com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x01ba
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration r11 = (com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration) r11     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            goto L_0x01aa
        L_0x01ba:
            boolean r2 = r11 instanceof X.AnonymousClass96I     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x01c6
            X.96I r11 = (X.AnonymousClass96I) r11     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            goto L_0x01aa
        L_0x01c6:
            boolean r2 = r11 instanceof X.AnonymousClass96G     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x01d2
            X.96G r11 = (X.AnonymousClass96G) r11     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            goto L_0x01aa
        L_0x01d2:
            r2 = 0
            goto L_0x01aa
        L_0x01d4:
            r12.addAll(r15)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.9Pm r11 = r10.A01     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r11 == 0) goto L_0x01e3
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r12.add(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x01e3:
            X.9U7 r11 = X.AnonymousClass969.A00     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            boolean r2 = r9.containsKey(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x01fb
            r10.A01(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r3 = 0
            com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r3)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.lang.String r2 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r2 = X.AnonymousClass002.A0E(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x01fa:
            throw r2     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x01fb:
            X.9U7 r11 = X.AnonymousClass968.A00     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            boolean r2 = r9.containsKey(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x0213
            r10.A01(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r3 = 0
            com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r3)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.lang.String r2 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r2 = X.AnonymousClass002.A0E(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            goto L_0x01fa
        L_0x0213:
            X.9U7 r11 = X.AnonymousClass96E.A02     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            boolean r2 = r9.containsKey(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x0229
            X.9SF r11 = r10.A01(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.96E r11 = (X.AnonymousClass96E) r11     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid r2 = new com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.<init>(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r12.add(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x0229:
            r14.mServiceConfigurations = r12     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.List r2 = r14.mServiceModules     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.util.Iterator r12 = r2.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
        L_0x0231:
            boolean r2 = r12.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x0251
            r12.next()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.9U7 r11 = X.AnonymousClass96B.A00     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            boolean r2 = r9.containsKey(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            if (r2 == 0) goto L_0x0231
            r10.A01(r11)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r3 = 0
            r2 = 1
            X.C162457s7.A0J(r3, r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.lang.String r2 = "getUserScopeDelegate"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0g(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            goto L_0x01fa
        L_0x0251:
            java.util.List r2 = r14.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r30 = r2
            java.lang.String r11 = r6.A08     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.lang.String r2 = r6.A09     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r16 = r2
            r33 = 0
            r2 = 0
            com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher r32 = new com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r24 = r33
            r20 = r32
            r21 = r11
            r22 = r16
            r23 = r33
            r25 = r2
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            java.lang.String r21 = "0"
            java.lang.String r11 = ""
            if (r19 != 0) goto L_0x0277
            r19 = r11
        L_0x0277:
            if (r18 != 0) goto L_0x027b
            r18 = r11
        L_0x027b:
            if (r17 != 0) goto L_0x027f
            r17 = r11
        L_0x027f:
            java.lang.String r15 = r6.A05     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r15.getClass()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig r14 = r10.A02     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.9O2 r11 = r5.A0U     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r12 = 1
            java.util.List r29 = r32.getAsyncAssets()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r20 = r35.A01()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            int r13 = r13.mCppValue     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.9Jz r11 = r11.A01     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            int r11 = r11.mOrder     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r23 = r19
            r24 = r18
            r25 = r17
            r26 = r13
            r27 = r15
            r28 = r12
            r31 = r14
            r34 = r11
            r20.setEffect(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r11 = r35.A01()     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r11.updatePerEffectDebugConfiguration(r2, r2, r2, r2)     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            X.9PW r2 = r5.A0O     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            r2.A01 = r12     // Catch:{ UnsatisfiedLinkError -> 0x02f3 }
            A00(r0, r8)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            boolean r0 = r9.containsKey(r3)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 == 0) goto L_0x02cb
            X.9SF r0 = r10.A01(r3)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.96I r0 = (X.AnonymousClass96I) r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9ll r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r5.A05 = r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r5.A03()     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x02cb:
            X.9Ul r0 = r5.A06     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r0 != 0) goto L_0x02db
            X.9Me r1 = new X.9Me     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r1.<init>(r5)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9Ul r0 = new X.9Ul     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0.<init>(r1)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r5.A06 = r0     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x02db:
            r4.getFrameFormatForPostProcessing()     // Catch:{ EffectsFrameworkException -> 0x0303 }
            X.9TS r0 = r5.A03     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r5.A07(r0, r4)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            if (r7 == 0) goto L_0x0367
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r3 = r5.A0S     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r1 = r3.getInstanceIdWithString(r0, r7)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            r0 = 3
            r3.markPoint(r1, r0, r7)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            goto L_0x0367
        L_0x02f3:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x02fe }
            com.facebook.cameracore.common.exception.EffectsFrameworkException r2 = new com.facebook.cameracore.common.exception.EffectsFrameworkException     // Catch:{ all -> 0x02fe }
            r2.<init>(r3)     // Catch:{ all -> 0x02fe }
            throw r2     // Catch:{ all -> 0x02fe }
        L_0x02fe:
            r2 = move-exception
            A00(r0, r8)     // Catch:{ EffectsFrameworkException -> 0x0303 }
            throw r2     // Catch:{ EffectsFrameworkException -> 0x0303 }
        L_0x0303:
            r4 = move-exception
            X.7XK r1 = r5.A0Z
            X.9TS r0 = r5.A03
            r5.A06(r0)
            r0 = 1
            r5.A09(r1, r4, r0)
            r1 = 0
            r5.A0b = r1
            r0 = 0
            r5.A0c = r0
            r5.A0Y = r1
            r5.A0Z = r1
            java.lang.String r3 = r6.A05
            X.9QV r2 = r5.A0L
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "setEffectToEngine failed, file exist: "
            r1.append(r0)
            if (r3 == 0) goto L_0x036d
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r0 = r0.exists()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0335:
            java.lang.String r1 = X.AnonymousClass000.A0R(r0, r1)
            java.lang.String r0 = "FbMsqrdRenderer"
            r2.A00(r0, r1, r4)
            r2 = r38
            if (r38 == 0) goto L_0x0367
            X.8Ja r0 = r2.A01
            X.2Yr r1 = r0.A0B
            java.lang.String r0 = "SparkRetryHandler/onResponseFromSpark Spark responded, cleaning up"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A00()
            X.646 r1 = r2.A00
            if (r1 == 0) goto L_0x0364
            X.5pE r1 = (X.C115785pE) r1
            java.lang.String r0 = "voip/InitializeAvatarEffectUseCase/onEffectRenderingFailed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4GW r1 = r1.A04
            X.4ii r0 = X.C90984ii.A00
            java.lang.Object r0 = X.C57682u2.A00(r0)
            r1.BkD(r0)
        L_0x0364:
            r0 = 0
            r2.A00 = r0
        L_0x0367:
            X.9PW r1 = r5.A0O
            r0 = 1
            r1.A01 = r0
            return
        L_0x036d:
            java.lang.String r0 = "null path"
            goto L_0x0335
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195759Zk.A08(X.7XK, X.7g6):void");
    }

    public final void A09(AnonymousClass7XK r10, Exception exc, boolean z) {
        String message;
        String str;
        AnalyticsLogger analyticsLogger;
        String str2;
        if (!(r10 == null || (str2 = r10.A06) == null)) {
            QPLUserFlowImpl qPLUserFlowImpl = this.A0S;
            qPLUserFlowImpl.markPoint(qPLUserFlowImpl.getInstanceIdWithString(16321564, str2), 7, str2);
        }
        boolean z2 = this.A0E;
        C194499Tc r4 = this.A0Q;
        synchronized (r4) {
            if (z2) {
                if (r4.A0B != null) {
                    r4.A0B.stopEffect();
                    r4.A0B.cleanupServices();
                }
                AREngineController aREngineController = r4.A05;
                if (aREngineController != null) {
                    aREngineController.onEffectStopped();
                }
            } else if (r4.A0B != null) {
                r4.A0B.cleanupServices();
            }
        }
        AnonymousClass9V9 r0 = this.A0Y;
        if (r0 != null) {
            Iterator A10 = C18290x4.A10(r0.A05);
            while (A10.hasNext()) {
                AnonymousClass9SF r1 = (AnonymousClass9SF) A10.next();
                if (r1 instanceof AnonymousClass96I) {
                    ((AnonymousClass9Yq) ((AnonymousClass96I) r1).A00).A00 = null;
                }
            }
        }
        this.A09 = null;
        this.A08 = null;
        this.A07 = null;
        this.A0A = null;
        this.A05 = null;
        this.A0E = false;
        if (exc == null) {
            if (z && r10 != null && (str = r10.A06) != null) {
                XplatSparsLogger xplatSparsLogger = this.A04;
                if (xplatSparsLogger == null) {
                    if (r4.A0B != null && (analyticsLogger = ((WhatsAppEffectServiceHost) r4.A00()).analyticsLogger) != null) {
                        xplatSparsLogger = new XplatSparsLogger(new XplatRawEventLogger(new AnonymousClass9Yo(analyticsLogger)));
                        this.A04 = xplatSparsLogger;
                    } else {
                        return;
                    }
                }
                xplatSparsLogger.logSessionClosureNative(str, false);
                QPLUserFlowImpl qPLUserFlowImpl2 = this.A0S;
                qPLUserFlowImpl2.endSuccess(qPLUserFlowImpl2.getInstanceIdWithString(16321564, str), str);
            }
        } else if (r10 != null) {
            QPLUserFlowImpl qPLUserFlowImpl3 = this.A0S;
            String str3 = r10.A06;
            long instanceIdWithString = qPLUserFlowImpl3.getInstanceIdWithString(16321564, str3);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Loading effect error: ");
            if (exc.getMessage() == null) {
                message = "";
            } else {
                message = exc.getMessage();
            }
            String A0X2 = AnonymousClass000.A0X(message, A0o);
            if (str3 == null) {
                str3 = "";
            }
            qPLUserFlowImpl3.endFail(instanceIdWithString, "renderer", 1, A0X2, str3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c6, code lost:
        if (r9.A00().isMultipleOutputsSupported() == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013e, code lost:
        if (r5.A00 != r4) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BRf(X.C157607ia r37, long r38) {
        /*
            r36 = this;
            java.lang.String r0 = "FbMsqrdRenderer.onDrawFrameInternal"
            android.os.Trace.beginSection(r0)
            r7 = r36
            boolean r0 = r7.A0e
            r11 = 0
            if (r0 != 0) goto L_0x0050
            monitor-enter(r7)
            java.lang.Object r3 = r7.A0V     // Catch:{ all -> 0x004d }
            monitor-enter(r3)     // Catch:{ all -> 0x004d }
            boolean r0 = r7.A0e     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x003f
            boolean r0 = r7.A0c     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003f
            r7.A02()     // Catch:{ all -> 0x004a }
            r0 = 1
            r7.A0e = r0     // Catch:{ all -> 0x004a }
            boolean r0 = r7.A0J     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0031
            X.9Tc r0 = r7.A0Q     // Catch:{ all -> 0x004a }
            int r2 = r7.A01     // Catch:{ all -> 0x004a }
            int r1 = r7.A00     // Catch:{ all -> 0x004a }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = r0.A01()     // Catch:{ all -> 0x004a }
            r0.resize(r2, r1)     // Catch:{ all -> 0x004a }
            r7.A0J = r11     // Catch:{ all -> 0x004a }
        L_0x0031:
            X.7XK r1 = r7.A0Z     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003f
            X.9TS r0 = r7.A03     // Catch:{ all -> 0x004a }
            r7.A05(r0)     // Catch:{ all -> 0x004a }
            X.7g6 r0 = r7.A0b     // Catch:{ all -> 0x004a }
            r7.A08(r1, r0)     // Catch:{ all -> 0x004a }
        L_0x003f:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            boolean r0 = r7.A0e
            if (r0 != 0) goto L_0x0050
            android.os.Trace.endSection()
            r12 = 0
            return r12
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0050:
            X.7XK r10 = r7.A0Z
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x005f
            X.7g6 r0 = r7.A0b
            if (r0 == 0) goto L_0x005f
            X.9Tc r0 = r7.A0Q
            r0.A00()
        L_0x005f:
            r3 = r37
            X.7Wm r0 = r3.A01
            if (r0 == 0) goto L_0x0257
            X.9Tc r9 = r7.A0Q
            int r4 = r0.A00
            int r2 = r0.A01
            X.7J8 r0 = r0.A02
            int r1 = r0.A01
            int r0 = r0.A00
            r9.A00 = r4
            r9.A02 = r2
            r9.A03 = r1
            r9.A01 = r0
            boolean r2 = r7.A0F
            r0 = 0
            if (r2 == 0) goto L_0x00e1
            long r18 = android.os.SystemClock.elapsedRealtime()
        L_0x0083:
            if (r10 != 0) goto L_0x00de
            r5 = 0
        L_0x0086:
            if (r2 == 0) goto L_0x009d
            if (r5 == 0) goto L_0x0093
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r1 = r7.A0S
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r0 = r1.getInstanceIdWithString(r0, r5)
        L_0x0093:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r4 = r7.A0S
            if (r5 != 0) goto L_0x0099
            java.lang.String r5 = "null_config_session"
        L_0x0099:
            r2 = 4
            r4.markPoint(r0, r2, r5)
        L_0x009d:
            boolean r2 = r7.A0c
            r6 = 1
            if (r2 == 0) goto L_0x011a
            boolean r2 = r7.A0I
            if (r2 != 0) goto L_0x00c8
            boolean[] r4 = r7.A0X
            X.9O2 r2 = r7.A0U
            X.9Jz r2 = r2.A01
            int r2 = r2.ordinal()
            boolean r2 = r4[r2]
            if (r2 == 0) goto L_0x00c8
            boolean r2 = r7.A0E
            if (r2 == 0) goto L_0x00c8
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r9.A0B
            if (r2 == 0) goto L_0x00c8
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r9.A00()
            boolean r2 = r2.isMultipleOutputsSupported()
            r34 = 0
            if (r2 != 0) goto L_0x00ca
        L_0x00c8:
            r34 = 1
        L_0x00ca:
            float[] r2 = r3.A04
            r25 = r2
            float[] r2 = r3.A05
            r23 = r2
            float[] r2 = r3.A03
            r22 = r2
            long r3 = r3.A00
            X.9O2 r8 = r7.A0U
            X.9JF r2 = X.AnonymousClass9JF.FILL_TO_PREVIEW
            monitor-enter(r9)
            goto L_0x00e4
        L_0x00de:
            java.lang.String r5 = r10.A06
            goto L_0x0086
        L_0x00e1:
            r18 = 0
            goto L_0x0083
        L_0x00e4:
            com.facebook.cameracore.mediapipeline.engine.AREngineController r20 = r9.A01()     // Catch:{ all -> 0x0117 }
            int r5 = r9.A00     // Catch:{ all -> 0x0117 }
            r21 = r5
            int r15 = r9.A02     // Catch:{ all -> 0x0117 }
            int r14 = r9.A03     // Catch:{ all -> 0x0117 }
            int r13 = r9.A01     // Catch:{ all -> 0x0117 }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r28 = r38 * r16
            X.9Jz r5 = r8.A01     // Catch:{ all -> 0x0117 }
            int r12 = r5.mOrder     // Catch:{ all -> 0x0117 }
            X.9Jy r5 = r8.A00     // Catch:{ all -> 0x0117 }
            int r5 = r5.mOrder     // Catch:{ all -> 0x0117 }
            int r2 = r2.mCppValue     // Catch:{ all -> 0x0117 }
            r24 = r13
            r26 = r23
            r27 = r22
            r30 = r3
            r32 = r12
            r33 = r5
            r35 = r2
            r22 = r15
            r23 = r14
            boolean r12 = r20.doFrame(r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33, r34, r35)     // Catch:{ all -> 0x0117 }
            goto L_0x011c
        L_0x0117:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x011a:
            r12 = 0
            goto L_0x012b
        L_0x011c:
            monitor-exit(r9)
            if (r12 == 0) goto L_0x012b
            r7.A0I = r11
            boolean[] r3 = r7.A0X
            X.9Jz r2 = r8.A01
            int r2 = r2.ordinal()
            r3[r2] = r6
        L_0x012b:
            X.9PW r5 = r7.A0O
            X.9Tc r2 = r5.A03     // Catch:{ all -> 0x0255 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r2 = r2.A01()     // Catch:{ all -> 0x0255 }
            int r4 = r2.getFacesCount()     // Catch:{ all -> 0x0255 }
            boolean r2 = r5.A01     // Catch:{ all -> 0x0255 }
            if (r2 != 0) goto L_0x0140
            int r3 = r5.A00     // Catch:{ all -> 0x0255 }
            r2 = 0
            if (r3 == r4) goto L_0x0141
        L_0x0140:
            r2 = 1
        L_0x0141:
            r5.A01 = r2     // Catch:{ all -> 0x0255 }
            r5.A00 = r4     // Catch:{ all -> 0x0255 }
            java.util.Set r3 = r5.A04     // Catch:{ all -> 0x0255 }
            monitor-enter(r3)     // Catch:{ all -> 0x0255 }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x015f }
            if (r2 != 0) goto L_0x015a
            boolean r2 = r5.A01     // Catch:{ all -> 0x015f }
            if (r2 == 0) goto L_0x015a
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r3)     // Catch:{ all -> 0x015f }
            r5.A01 = r11     // Catch:{ all -> 0x015f }
        L_0x0158:
            monitor-exit(r3)     // Catch:{ all -> 0x015f }
            goto L_0x015c
        L_0x015a:
            r2 = 0
            goto L_0x0158
        L_0x015c:
            if (r2 == 0) goto L_0x0176
            goto L_0x0162
        L_0x015f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x015f }
            goto L_0x0175
        L_0x0162:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0255 }
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x0255 }
            if (r2 == 0) goto L_0x0176
            r3.next()     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = "onFacesCountChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x0255 }
        L_0x0175:
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0176:
            boolean r2 = r7.A0F
            if (r2 == 0) goto L_0x01ac
            r7.A0F = r11
            java.lang.String r5 = "null_config_session"
            if (r12 == 0) goto L_0x023d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r18
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            long r2 = android.os.Debug.getNativeHeapAllocatedSize()
            float r4 = (float) r2
            r2 = 1149239296(0x44800000, float:1024.0)
            float r4 = r4 / r2
            float r4 = r4 / r2
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.String r3 = "FbMsqrdRenderer"
            java.lang.String r2 = "Time to render first frame: %d, current native memory allocation: %.2fMB"
            X.C162477s9.A03(r8, r4, r3, r2)
            if (r10 == 0) goto L_0x01a6
            java.lang.String r5 = r10.A06
            if (r5 != 0) goto L_0x01a6
            java.lang.String r5 = ""
        L_0x01a6:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r3 = r7.A0S
            r2 = 5
            r3.markPoint(r0, r2, r5)
        L_0x01ac:
            long r3 = r7.A02
            r0 = 1
            long r3 = r3 + r0
            r7.A02 = r3
            r1 = 10
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01cb
            r1 = 30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01cb
            r1 = 150(0x96, double:7.4E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01cb
            r1 = 600(0x258, double:2.964E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ce
        L_0x01cb:
            r7.A01()
        L_0x01ce:
            if (r12 == 0) goto L_0x0235
            X.7g6 r0 = r7.A0b
            if (r0 == 0) goto L_0x0235
            X.7XK r0 = r7.A0Z
            if (r0 == 0) goto L_0x0235
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x0209
            r7.A0H = r6
            X.7g6 r2 = r7.A0b
            X.8Ja r0 = r2.A01
            X.2Yr r1 = r0.A0B
            java.lang.String r0 = "SparkRetryHandler/onResponseFromSpark Spark responded, cleaning up"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A00()
            X.646 r1 = r2.A00
            if (r1 == 0) goto L_0x0209
            X.5pE r1 = (X.C115785pE) r1
            java.lang.String r0 = "voip/InitializeAvatarEffectUseCase/onEffectRenderingStarted"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5HR r3 = r1.A03
            if (r3 == 0) goto L_0x0209
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r0 = r1.A02
            X.3Wi r2 = r0.A00
            r1 = 48
            X.5rQ r0 = new X.5rQ
            r0.<init>(r3, r1)
            r2.A0S(r0)
        L_0x0209:
            X.7g6 r4 = r7.A0b
            X.646 r3 = r4.A00
            r2 = 0
            if (r3 == 0) goto L_0x023b
            X.5pE r3 = (X.C115785pE) r3
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0239
            int r0 = r3.A00
            int r1 = r0 + 1
            r3.A00 = r1
            r0 = 2
            if (r1 <= r0) goto L_0x0239
            X.4GW r1 = r3.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.BkD(r0)
            r0 = 0
        L_0x0227:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x022b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0235
            r4.A00 = r2
        L_0x0235:
            android.os.Trace.endSection()
            return r12
        L_0x0239:
            r0 = 1
            goto L_0x0227
        L_0x023b:
            r1 = r2
            goto L_0x022b
        L_0x023d:
            if (r10 == 0) goto L_0x0245
            java.lang.String r5 = r10.A06
            if (r5 != 0) goto L_0x0245
            java.lang.String r5 = ""
        L_0x0245:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r13 = r7.A0S
            java.lang.String r16 = "renderer"
            r17 = 2
            java.lang.String r18 = "Render first frame failed"
            r14 = r0
            r19 = r5
            r13.endFail(r14, r16, r17, r18, r19)
            goto L_0x01ac
        L_0x0255:
            r0 = move-exception
            throw r0
        L_0x0257:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195759Zk.BRf(X.7ia, long):boolean");
    }

    public void Bdj(int i, int i2) {
        boolean z;
        this.A01 = i;
        this.A00 = i2;
        if (this.A0e) {
            this.A0Q.A01().resize(i, i2);
            z = false;
        } else {
            z = true;
        }
        this.A0J = z;
    }

    public void Bdk(C152827aC r3) {
        this.A0R.A03 = true;
    }

    public void Bdl() {
        Arrays.fill(this.A0X, false);
        A06(this.A03);
        if (this.A0e || this.A0G) {
            synchronized (this.A0V) {
                A09(this.A0Z, (Exception) null, true);
                this.A0e = false;
                C194499Tc r1 = this.A0Q;
                synchronized (r1) {
                    r1.A01().releaseGl();
                    r1.A02();
                }
                this.A0G = false;
                this.A04 = null;
            }
        }
        this.A0b = null;
        this.A0c = false;
        this.A0Y = null;
        C162477s9.A04(Integer.valueOf(hashCode()), "FbMsqrdRenderer", "FbMsqrdRenderer %s - released");
    }

    public void BnA(AnonymousClass9TS r3) {
        AnonymousClass9TS r1 = this.A03;
        if (r3 != r1) {
            if (r1 != null) {
                r1.A03(this, AnonymousClass22N.A0V);
                r1.A03(this, AnonymousClass22N.A0h);
                r1.A03(this, AnonymousClass22N.A0N);
                r1.A03(this, AnonymousClass22N.A0i);
            }
            if (r3 != null) {
                r3.A02(this, AnonymousClass22N.A0V);
                r3.A02(this, AnonymousClass22N.A0h);
                r3.A02(this, AnonymousClass22N.A0N);
                r3.A02(this, AnonymousClass22N.A0i);
            }
            if (this.A0c) {
                A06(this.A03);
                A05(r3);
                if (this.A0e) {
                    A07(r3, this.A0Q.A00());
                }
            }
            this.A03 = r3;
        }
    }

    public boolean isEnabled() {
        if (!this.A0d || !this.A0c) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00be, code lost:
        A03();
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c9, code lost:
        A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZu(X.C183818qi r12) {
        /*
            r11 = this;
            X.22N r0 = r12.BDx()
            int r0 = r0.ordinal()
            switch(r0) {
                case 3: goto L_0x0044;
                case 5: goto L_0x0093;
                case 6: goto L_0x00a9;
                case 7: goto L_0x007d;
                case 8: goto L_0x000c;
                case 9: goto L_0x001a;
                case 10: goto L_0x0028;
                case 11: goto L_0x0036;
                case 13: goto L_0x00c9;
                case 14: goto L_0x00c5;
                case 17: goto L_0x00cd;
                case 18: goto L_0x01e7;
                case 26: goto L_0x0210;
                case 27: goto L_0x0217;
                case 30: goto L_0x021b;
                case 31: goto L_0x0220;
                case 43: goto L_0x022b;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            X.9ll r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.9Yq r0 = (X.AnonymousClass9Yq) r0
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            r0.startRecording()
            return
        L_0x001a:
            X.9ll r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.9Yq r0 = (X.AnonymousClass9Yq) r0
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            r0.stopRecording()
            return
        L_0x0028:
            X.9ll r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.9Yq r0 = (X.AnonymousClass9Yq) r0
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            r0.capturePhoto()
            return
        L_0x0036:
            X.9ll r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.9Yq r0 = (X.AnonymousClass9Yq) r0
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            r0.finishCapturePhoto()
            return
        L_0x0044:
            X.9Zn r12 = (X.C195789Zn) r12
            java.lang.Object r6 = r11.A0V
            monitor-enter(r6)
            boolean r0 = r11.A0c     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0078
            X.9Oo r5 = r11.A0P     // Catch:{ all -> 0x007a }
            X.9Yv r4 = r12.A00     // Catch:{ all -> 0x007a }
            X.9Tc r3 = r5.A02     // Catch:{ all -> 0x007a }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r3.A00()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0078
            boolean r0 = r0.isFrameDataNeeded()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x007a }
            X.9Sf r0 = (X.C194269Sf) r0     // Catch:{ all -> 0x007a }
            int r2 = r5.A00     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x006f
            int r1 = r0.A00     // Catch:{ all -> 0x007a }
            r0 = -1
            if (r1 == r0) goto L_0x006f
            r2 = r1
        L_0x006f:
            boolean r1 = r5.A01     // Catch:{ all -> 0x007a }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r3.A00()     // Catch:{ all -> 0x007a }
            r0.updateFrame(r4, r2, r1)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r6)     // Catch:{ all -> 0x007a }
            return
        L_0x007a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007a }
            throw r0
        L_0x007d:
            X.9Zr r12 = (X.C195829Zr) r12
            X.9PC r1 = r11.A0R
            if (r12 == 0) goto L_0x0090
            X.9Zr r0 = r1.A02
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0090
            r1.A02 = r12
            r0 = 1
            r1.A03 = r0
        L_0x0090:
            r11.A09 = r12
            goto L_0x00be
        L_0x0093:
            X.9Zq r12 = (X.C195819Zq) r12
            X.9PC r1 = r11.A0R
            if (r12 == 0) goto L_0x00a6
            X.9Zq r0 = r1.A01
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00a6
            r1.A01 = r12
            r0 = 1
            r1.A03 = r0
        L_0x00a6:
            r11.A08 = r12
            goto L_0x00be
        L_0x00a9:
            X.9Zp r12 = (X.C195809Zp) r12
            X.9PC r1 = r11.A0R
            if (r12 == 0) goto L_0x00bc
            X.9Zp r0 = r1.A00
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00bc
            r1.A00 = r12
            r0 = 1
            r1.A03 = r0
        L_0x00bc:
            r11.A07 = r12
        L_0x00be:
            r11.A03()
            r11.A04()
            return
        L_0x00c5:
            X.9Zs r12 = (X.C195839Zs) r12
            r11.A0A = r12
        L_0x00c9:
            r11.A03()
            return
        L_0x00cd:
            X.85S r12 = (X.AnonymousClass85S) r12
            java.lang.Object r1 = r11.A0V
            monitor-enter(r1)
            X.7XK r2 = r12.A00     // Catch:{ all -> 0x01e4 }
            X.7g6 r4 = r12.A01     // Catch:{ all -> 0x01e4 }
            int r0 = r11.hashCode()     // Catch:{ all -> 0x01e4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e4 }
            java.lang.String r5 = "FbMsqrdRenderer"
            java.lang.String r0 = "FbMsqrdRenderer %s - setMsqrdConfig %s"
            X.C162477s9.A03(r3, r2, r5, r0)     // Catch:{ all -> 0x01e4 }
            X.7XK r9 = r11.A0Z     // Catch:{ all -> 0x01e4 }
            r10 = 0
            if (r9 == 0) goto L_0x0150
            if (r2 == 0) goto L_0x0150
            r6 = 0
            int r3 = (int) r6     // Catch:{ all -> 0x01e4 }
            r0 = 1
            if (r3 == r0) goto L_0x011e
            r0 = 2
            if (r3 == r0) goto L_0x012d
            r0 = 3
            if (r3 == r0) goto L_0x0119
            r0 = 4
            if (r3 != r0) goto L_0x0150
            r10 = 1
            if (r9 == r2) goto L_0x0150
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x01e4 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x01e4 }
            if (r3 != r0) goto L_0x014f
            boolean r0 = r9.A00(r2)     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x014f
            java.lang.String r3 = r9.A01     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x01e4 }
            boolean r0 = java.util.Objects.equals(r3, r0)     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x014f
            goto L_0x0150
        L_0x0119:
            boolean r10 = r9.A00(r2)     // Catch:{ all -> 0x01e4 }
            goto L_0x0150
        L_0x011e:
            java.lang.String r3 = r9.A08     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x01e4 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x0150
            java.lang.String r6 = r9.A09     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x01e4 }
            goto L_0x0147
        L_0x012d:
            java.lang.String r6 = r9.A06     // Catch:{ all -> 0x01e4 }
            if (r6 == 0) goto L_0x0150
            java.lang.String r3 = r9.A08     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x01e4 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x0150
            java.lang.String r3 = r9.A09     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x01e4 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x01e4 }
        L_0x0147:
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x0150
            r10 = 1
            goto L_0x0150
        L_0x014f:
            r10 = 0
        L_0x0150:
            r8 = 0
            r3 = 1
            if (r10 == 0) goto L_0x0155
            goto L_0x01cf
        L_0x0155:
            r7 = 0
            if (r2 == 0) goto L_0x01bc
            java.lang.String r0 = r2.A05     // Catch:{ all -> 0x01e4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01e4 }
            if (r0 != 0) goto L_0x01bc
            X.7XK r6 = r11.A0Z     // Catch:{ all -> 0x01e4 }
            if (r6 == 0) goto L_0x016c
            java.lang.String r5 = r6.A06     // Catch:{ all -> 0x01e4 }
            if (r5 != 0) goto L_0x01b2
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x01e4 }
            if (r0 != 0) goto L_0x01ba
        L_0x016c:
            r11.A09(r6, r7, r8)     // Catch:{ all -> 0x01e4 }
            java.lang.String r10 = r2.A06     // Catch:{ all -> 0x01e4 }
            if (r10 == 0) goto L_0x0192
            com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger.debugExpectSessionOpen(r10)     // Catch:{ all -> 0x01e4 }
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r5 = r11.A0S     // Catch:{ all -> 0x01e4 }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r6 = r5.getInstanceIdWithString(r0, r10)     // Catch:{ all -> 0x01e4 }
            r0 = 2
            r5.markPoint(r6, r0, r10)     // Catch:{ all -> 0x01e4 }
            java.lang.String r8 = "is_fbcameralogger_dummy"
            X.9o9 r0 = r11.A01()     // Catch:{ all -> 0x01e4 }
            boolean r0 = r0 instanceof X.C1904296e     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r9 = "true"
        L_0x018f:
            r5.annotate(r6, r8, r9, r10)     // Catch:{ all -> 0x01e4 }
        L_0x0192:
            r11.A0Z = r2     // Catch:{ all -> 0x01e4 }
            r11.A0b = r4     // Catch:{ all -> 0x01e4 }
            r11.A0c = r3     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x01e4 }
            r11.A0B = r0     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x01e4 }
            r11.A0C = r0     // Catch:{ all -> 0x01e4 }
            boolean r0 = r11.A0e     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x01dc
            X.9TS r0 = r11.A03     // Catch:{ all -> 0x01e4 }
            r11.A05(r0)     // Catch:{ all -> 0x01e4 }
            X.7g6 r0 = r11.A0b     // Catch:{ all -> 0x01e4 }
            r11.A08(r2, r0)     // Catch:{ all -> 0x01e4 }
            goto L_0x01dc
        L_0x01af:
            java.lang.String r9 = "false"
            goto L_0x018f
        L_0x01b2:
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x01e4 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x01e4 }
            if (r0 != 0) goto L_0x016c
        L_0x01ba:
            r8 = 1
            goto L_0x016c
        L_0x01bc:
            X.7XK r2 = r11.A0Z     // Catch:{ all -> 0x01e4 }
            X.9TS r0 = r11.A03     // Catch:{ all -> 0x01e4 }
            r11.A06(r0)     // Catch:{ all -> 0x01e4 }
            r11.A09(r2, r7, r3)     // Catch:{ all -> 0x01e4 }
            r11.A0b = r7     // Catch:{ all -> 0x01e4 }
            r11.A0c = r8     // Catch:{ all -> 0x01e4 }
            r11.A0Y = r7     // Catch:{ all -> 0x01e4 }
            r11.A0Z = r7     // Catch:{ all -> 0x01e4 }
            goto L_0x01dc
        L_0x01cf:
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x01e4 }
            if (r9 != 0) goto L_0x01de
            java.lang.String r0 = "null"
        L_0x01d5:
            r2[r8] = r0     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = "Effect already set, current=%s"
            X.C162477s9.A0E(r5, r0, r2)     // Catch:{ all -> 0x01e4 }
        L_0x01dc:
            monitor-exit(r1)     // Catch:{ all -> 0x01e4 }
            goto L_0x01e3
        L_0x01de:
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x01e4 }
            goto L_0x01d5
        L_0x01e3:
            return
        L_0x01e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01e4 }
            throw r0
        L_0x01e7:
            java.lang.Object r6 = r11.A0V
            monitor-enter(r6)
            java.lang.String r5 = "Time to reset effect: %d"
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x020d }
            r0 = 1
            r11.A0F = r0     // Catch:{ all -> 0x0208 }
            r3 = 0
            r11.A02 = r3     // Catch:{ all -> 0x0208 }
            r0 = 0
            r11.A0H = r0     // Catch:{ all -> 0x0208 }
            X.9Tc r0 = r11.A0Q     // Catch:{ all -> 0x0208 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = r0.A01()     // Catch:{ all -> 0x0208 }
            r0.resetCurrentEffect()     // Catch:{ all -> 0x0208 }
            A00(r1, r5)     // Catch:{ all -> 0x020d }
            monitor-exit(r6)     // Catch:{ all -> 0x020d }
            return
        L_0x0208:
            r0 = move-exception
            A00(r1, r5)     // Catch:{ all -> 0x020d }
            throw r0     // Catch:{ all -> 0x020d }
        L_0x020d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x020d }
            throw r0
        L_0x0210:
            java.lang.String r0 = "getConfig"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0217:
            r0 = 1
            r11.A0I = r0
            return
        L_0x021b:
            r0 = 0
            r0.getClass()
            return
        L_0x0220:
            r0 = 0
            r0.getClass()
            java.lang.String r0 = "mMap"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x022b:
            java.lang.Object r1 = r11.A0V
            monitor-enter(r1)
            r11.A02()     // Catch:{ all -> 0x0233 }
            monitor-exit(r1)     // Catch:{ all -> 0x0233 }
            return
        L_0x0233:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0233 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195759Zk.BZu(X.8qi):void");
    }

    public void Blh(AnonymousClass7B5 r1) {
    }
}
