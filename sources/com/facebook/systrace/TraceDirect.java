package com.facebook.systrace;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C159587m8;
import X.C159907mf;
import X.C183798qf;
import X.C86604Kt;
import android.util.Log;
import com.facebook.common.util.TriState;

public class TraceDirect {
    public static final boolean sForceJavaImpl = "true".equals(C159907mf.A01("debug.fbsystrace.force_java"));
    public static volatile TriState sNativeAvailable = TriState.UNSET;
    public static volatile int sPrevSoLoaderSourcesVersion = -1;
    public static final boolean sTraceLoad = "true".equals(C159907mf.A01("debug.fbsystrace.trace_load"));

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);

    public static boolean checkNative() {
        boolean A1W;
        int i;
        Exception exc;
        C183798qf r0;
        if (sNativeAvailable == TriState.UNSET) {
            if (sForceJavaImpl) {
                Log.i("TraceDirect", "Forcing java implementation.");
                sNativeAvailable = TriState.NO;
            } else {
                Class<C159587m8> cls = C159587m8.class;
                synchronized (cls) {
                    A1W = AnonymousClass000.A1W(C159587m8.A00);
                }
                if (A1W) {
                    synchronized (cls) {
                        r0 = C159587m8.A00;
                        if (r0 == null) {
                            throw AnonymousClass001.A0e("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    i = r0.BD9();
                } else {
                    i = -1;
                }
                if (i != sPrevSoLoaderSourcesVersion) {
                    sPrevSoLoaderSourcesVersion = i;
                    Object[] A0M = AnonymousClass002.A0M();
                    C86604Kt.A1X(A0M, sPrevSoLoaderSourcesVersion, 0, i, 1);
                    String format = String.format("Attempting to load fbsystrace.so [%d|%d].", A0M);
                    if (sTraceLoad) {
                        exc = new Exception();
                    } else {
                        exc = null;
                    }
                    Log.d("TraceDirect", format, exc);
                    try {
                        C159587m8.A01("fbsystrace");
                        nativeSetEnabledTags(C159907mf.A00("debug.fbsystrace.tags"));
                        nativeBeginSection("fbsystrace.so loaded");
                        nativeEndSection();
                        sNativeAvailable = TriState.YES;
                        Log.i("TraceDirect", "fbsystrace.so loaded.");
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                    }
                }
            }
        }
        if (sNativeAvailable != TriState.YES) {
            return false;
        }
        return true;
    }
}
