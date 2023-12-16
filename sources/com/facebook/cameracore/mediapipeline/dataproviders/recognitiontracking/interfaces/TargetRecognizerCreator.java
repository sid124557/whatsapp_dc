package com.facebook.cameracore.mediapipeline.dataproviders.recognitiontracking.interfaces;

import X.AnonymousClass9JB;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionServiceDataSource;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TargetRecognizerCreator extends IRecognizerCreator {
    public String mDetectionExecNetPath;
    public String mDomain;
    public String mExecNetPath;
    public final ScheduledExecutorService mScheduledExecutorService = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
    public boolean mShouldDownsampleFrames;
    public final TargetRecognitionServiceDataSource mTargetRecognitionServiceDataSource;

    public TargetRecognizerCreator(String str, String str2, boolean z, String str3, TargetRecognitionServiceDataSource targetRecognitionServiceDataSource) {
        this.mExecNetPath = str;
        this.mDetectionExecNetPath = str2;
        this.mTargetRecognitionServiceDataSource = targetRecognitionServiceDataSource;
        this.mShouldDownsampleFrames = z;
        this.mDomain = str3;
    }

    public TargetRecognitionServiceDataSource getDataSource() {
        return this.mTargetRecognitionServiceDataSource;
    }

    public String getDetectionExecNetPath() {
        return this.mDetectionExecNetPath;
    }

    public String getDomain() {
        return this.mDomain;
    }

    public String getExecNetPath() {
        return this.mExecNetPath;
    }

    public AnonymousClass9JB getRecognizerCreatorType() {
        return AnonymousClass9JB.A00;
    }

    public ScheduledExecutorService getScheduledExecutorService() {
        return this.mScheduledExecutorService;
    }

    public boolean getShouldDownsampleFrames() {
        return this.mShouldDownsampleFrames;
    }

    public void setDetectionExecNetPath(String str) {
        this.mDetectionExecNetPath = str;
    }

    public void setExecNetPath(String str) {
        this.mExecNetPath = str;
    }

    public void setShouldDownsampleFrames(boolean z) {
        this.mShouldDownsampleFrames = z;
    }
}
