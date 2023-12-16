package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import X.AnonymousClass9PA;
import X.C192429Jr;
import X.C192439Jt;
import X.C201939l6;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.Executors;

public class AnalyticsLoggerImpl extends AnalyticsLogger {
    public AndroidAsyncExecutorFactory mAsyncExecutorFactory;
    public AnonymousClass9PA mCameraARAnalyticsLogger;
    public final CameraARCrashMetadataLogger mCrashMetadataLogger = new CameraARCrashMetadataLogger();
    public C192439Jt mEffectStartIntent = C192439Jt.NONE;
    public final C192429Jr mOptimizedPerfLoggerOption;
    public String mProductName;

    public native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, int i);

    public String getEffectStartIntentString() {
        int ordinal = this.mEffectStartIntent.ordinal();
        if (ordinal == 1) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        if (ordinal != 2) {
            return "unknown";
        }
        return "system";
    }

    public XAnalyticsHolder getXAnalytics() {
        AnonymousClass9PA r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public void logSessionEvent(boolean z) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null && !z) {
            cameraARCrashMetadataLogger.cleanupBreakpadData();
        }
    }

    public void setBreakpadData(String str, String str2) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null) {
            cameraARCrashMetadataLogger.setBreakpadData(str, str2);
        }
    }

    public AnalyticsLoggerImpl(AnonymousClass9PA r3, C201939l6 r4, C192429Jr r5) {
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = new AndroidAsyncExecutorFactory(Executors.newScheduledThreadPool(1));
        this.mAsyncExecutorFactory = androidAsyncExecutorFactory;
        this.mCameraARAnalyticsLogger = r3;
        this.mProductName = r3.A00;
        this.mOptimizedPerfLoggerOption = r5;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory, r5.mCppValue);
    }

    public void logForBugReport(String str, String str2) {
    }

    public void logRawEvent(String str, String str2) {
    }

    public String getProductName() {
        return this.mProductName;
    }
}
