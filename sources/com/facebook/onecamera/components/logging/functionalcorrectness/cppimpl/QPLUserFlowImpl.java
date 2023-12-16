package com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass76W;
import X.AnonymousClass84B;
import X.C1454776a;
import X.C162477s9;
import X.C177868ga;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.jni.HybridData;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.soloader.SoLoader;

public class QPLUserFlowImpl {
    public static final String TAG = "QPLUserFlowImpl";
    public final HybridData mHybridData;

    private native void annotateInternal(long j, String str, String str2, boolean z, String str3);

    private native void endCancelInternal(long j, String str, String str2);

    private native void endFailInternal(long j, String str, int i, String str2, String str3);

    private native void endSuccessInternal(long j, String str);

    public static native HybridData initHybrid();

    private native long instanceIdWithStringInternal(int i, String str);

    private native void markPointInternal(long j, int i, String str);

    private native long startInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public void annotate(long j, String str, String str2) {
        annotateInternal(j, str, str2, false, "");
    }

    public void annotateWithCrucialData(long j, String str, String str2) {
        annotateInternal(j, str, str2, true, "");
    }

    public native long generateNewInstanceId(int i);

    public native void startWithFlowInstanceIdInternal(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public long start(int i, C177868ga r3, long j) {
        throw AnonymousClass002.A0E("Not yet implemented");
    }

    public void startWithFlowInstanceId(long j, C177868ga r4, long j2) {
        throw AnonymousClass002.A0E("Not yet implemented");
    }

    public QPLUserFlowImpl() {
        HybridData hybridData;
        synchronized (AnonymousClass76W.class) {
            if (!UserFlowJNIProvider.isInitialized()) {
                UserFlowLogger userFlowLogger = AnonymousClass76W.A00;
                if (userFlowLogger == null) {
                    QuickPerformanceLogger A00 = C1454776a.A00();
                    if (A00 != null) {
                        userFlowLogger = new AnonymousClass84B(A00, true);
                        AnonymousClass76W.A00 = userFlowLogger;
                    } else {
                        throw AnonymousClass001.A0e("Required value was null.");
                    }
                }
                UserFlowJNIProvider.setUserFlowLogger(userFlowLogger);
            }
        }
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            loadSoLibrary();
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
    }

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static void loadSoLibrary() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        SoLoader.A06("spark-qpluserflow-native");
        C162477s9.A04(Float.valueOf(((float) (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos)) / 1000000.0f), TAG, "QPLUserFlow load .so spark-qpluserflow-native time = %f ms");
    }

    public void endSuccess(long j, String str) {
        endSuccessInternal(j, str);
    }

    public long getInstanceIdWithString(int i, String str) {
        return instanceIdWithStringInternal(i, str);
    }

    public void endCancel(long j, String str, String str2) {
        endCancelInternal(j, str, str2);
    }

    public void markPoint(long j, int i, String str) {
        markPointInternal(j, i, str);
    }

    public void endFail(long j, String str, int i, String str2, String str3) {
        endFailInternal(j, str, i, str2, str3);
    }

    public void annotate(long j, String str, String str2, String str3) {
        annotateInternal(j, str, str2, false, str3);
    }

    public void annotateWithCrucialData(long j, String str, String str2, String str3) {
        annotateInternal(j, str, str2, true, str3);
    }

    public void endCancel(long j, String str) {
        endCancelInternal(j, str, "");
    }

    public void endFail(long j, String str, int i, String str2) {
        endFailInternal(j, str, i, str2, "");
    }

    public void endSuccess(long j) {
        endSuccessInternal(j, "");
    }

    public void markPoint(long j, int i) {
        markPointInternal(j, i, "");
    }

    public long start(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return startInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    public void startWithFlowInstanceId(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        startWithFlowInstanceIdInternal(j, str, str2, str3, str4, str5, str6, str7);
    }
}
