package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass9JG;
import X.AnonymousClass9L0;
import X.AnonymousClass9V9;
import X.C100675Bv;
import X.C193409Oj;
import X.C193669Pn;
import X.C194269Sf;
import X.C194379Sq;
import X.C195619Yu;
import X.C195629Yv;
import X.C201569kM;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EffectServiceHost {
    public final C100675Bv mArExperimentUtil;
    public EffectAttribution mAttribution;
    public final Context mContext;
    public EffectManifest mEffectManifest;
    public final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    public String mProductSessionId;
    public final AnonymousClass9L0 mServiceConfigurationHybridBuilder;
    public List mServiceConfigurations = AnonymousClass001.A0s();
    public final List mServiceModules;
    public AnonymousClass9V9 mServicesHostConfiguration;

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, AnonymousClass9L0 r5, Collection collection, String str, C100675Bv r8) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
        this.mServiceConfigurationHybridBuilder = r5;
        this.mServiceModules = AnonymousClass002.A0J(collection);
        this.mProductSessionId = null;
        this.mArExperimentUtil = r8;
    }

    private native int nativeGetFrameFormat();

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    public native void cleanupServices();

    public abstract TouchService createTouchService();

    public abstract void destroyTouchService();

    public native boolean isFrameDataNeeded();

    public native boolean isHorizontalTrackableDetectionNeeded();

    public native boolean isMultipleOutputsSupported();

    public native boolean isPlatformAlgorithmDataNeeded();

    public native boolean isRealScaleEstimationNeeded();

    public native boolean isSLAMNeeded();

    public native boolean isVerticalTrackableDetectionNeeded();

    public native void resetServices();

    public native void stopEffect();

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new C201569kM(str));
    }

    public void destroy() {
        this.mHybridData.resetNative();
        for (ServiceConfiguration destroy : this.mServiceConfigurations) {
            destroy.destroy();
        }
        this.mServiceConfigurations.clear();
        for (ServiceModule serviceModule : this.mServiceModules) {
            serviceModule.mHybridData.resetNative();
        }
        this.mServiceModules.clear();
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
        TouchService touchService = ((WhatsAppEffectServiceHost) this).touchService;
        if (touchService != null) {
            C193669Pn r1 = new C193669Pn(effectManifest.supportsTapGesture, effectManifest.supportsPanGesture, effectManifest.supportsPinchGesture, effectManifest.supportsRotateGesture, effectManifest.supportsLongPressGesture, effectManifest.supportsRawTouchGesture);
            C194379Sq r2 = ((TouchServiceImpl) touchService).mGestureProcessor;
            if (r2 != null) {
                r2.A02 = r1;
                Set set = r2.A0F;
                set.clear();
                if (r2.A02.A05) {
                    set.add(Gesture.GestureType.TAP);
                }
                if (r2.A02.A01) {
                    set.add(Gesture.GestureType.PAN);
                }
                if (r2.A02.A02) {
                    set.add(Gesture.GestureType.PINCH);
                }
                if (r2.A02.A04) {
                    set.add(Gesture.GestureType.ROTATE);
                }
                if (r2.A02.A00) {
                    set.add(Gesture.GestureType.LONG_PRESS);
                }
                if (r2.A02.A03) {
                    set.add(Gesture.GestureType.RAW_TOUCH);
                }
            }
        }
    }

    public void updateFrame(C195629Yv r39, int i, boolean z) {
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        C195629Yv r10 = r39;
        C194269Sf r1 = (C194269Sf) r10.get();
        int i6 = r1.A03;
        int i7 = r1.A01;
        C193409Oj[] r4 = r1.A05;
        if (r4 != null && (length = r4.length) > 0) {
            C193409Oj r12 = r4[0];
            int i8 = r12.A01;
            if (i8 == 0) {
                i8 = i6;
            }
            int i9 = r12.A00;
            if (length > 1) {
                C193409Oj r0 = r4[1];
                i2 = r0.A01;
                if (i2 == 0) {
                    i2 = i6;
                }
                i3 = r0.A00;
                if (length > 2) {
                    C193409Oj r02 = r4[2];
                    i4 = r02.A01;
                    if (i4 == 0) {
                        i4 = i6;
                    }
                    i5 = r02.A00;
                }
                i4 = i6;
                i5 = 0;
            } else {
                i2 = i6;
                i3 = 0;
                i4 = i6;
                i5 = 0;
            }
            int i10 = r1.A02;
            ByteBuffer byteBuffer3 = r12.A02;
            if (length > 1) {
                byteBuffer = r4[1].A02;
                if (length > 2) {
                    byteBuffer2 = r4[2].A02;
                }
                byteBuffer2 = null;
            } else {
                byteBuffer = null;
                byteBuffer2 = null;
            }
            long j = r1.A04;
            double d = (double) 0;
            int i11 = 0;
            do {
                AtomicInteger atomicInteger = r10.A02;
                int i12 = atomicInteger.get();
                if (i12 == 0) {
                    throw AnonymousClass001.A0e("Trying to lock already released reference.");
                } else if (atomicInteger.compareAndSet(i12, i12 + 1)) {
                    int i13 = i8;
                    int i14 = i9;
                    int i15 = i2;
                    int i16 = i3;
                    int i17 = i4;
                    int i18 = i5;
                    int i19 = i6;
                    int i20 = i7;
                    nativeUpdateFrame(i19, i20, i13, i14, i15, i16, i17, i18, i, z, i10, byteBuffer3, byteBuffer, byteBuffer2, j, false, (float[]) null, (float[]) null, 0.0f, d, d, new C195619Yu(r10));
                    return;
                } else {
                    i11++;
                }
            } while (i11 < 10);
            throw AnonymousClass002.A0E("WTF: Could not lock the reference after multiple tries.");
        }
    }

    public AnonymousClass9JG getFrameFormatForPostProcessing() {
        int nativeGetFrameFormat = nativeGetFrameFormat();
        if (nativeGetFrameFormat == 0) {
            return AnonymousClass9JG.NONE;
        }
        if (nativeGetFrameFormat == 1) {
            return AnonymousClass9JG.YUV;
        }
        if (nativeGetFrameFormat == 2) {
            return AnonymousClass9JG.Y;
        }
        throw AnonymousClass000.A0G("Received incorrect value: ", AnonymousClass001.A0o(), nativeGetFrameFormat);
    }

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }
}
