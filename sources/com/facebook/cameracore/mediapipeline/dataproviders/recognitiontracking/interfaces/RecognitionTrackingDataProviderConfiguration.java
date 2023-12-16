package com.facebook.cameracore.mediapipeline.dataproviders.recognitiontracking.interfaces;

import X.AnonymousClass9SF;
import X.C129586aY;
import java.util.Collection;
import java.util.List;

public class RecognitionTrackingDataProviderConfiguration extends AnonymousClass9SF {
    public List mRecognizerCreators;
    public int mThreadPriority;
    public List mTrackerCreators;

    public C129586aY getRecognizerCreators() {
        return C129586aY.copyOf((Collection) this.mRecognizerCreators);
    }

    public C129586aY getTrackerCreators() {
        return C129586aY.copyOf((Collection) this.mTrackerCreators);
    }

    public void updateTargetRecognizerNetPath(String str, String str2) {
        for (IRecognizerCreator iRecognizerCreator : this.mRecognizerCreators) {
            TargetRecognizerCreator targetRecognizerCreator = (TargetRecognizerCreator) iRecognizerCreator;
            targetRecognizerCreator.mExecNetPath = str;
            targetRecognizerCreator.mDetectionExecNetPath = str2;
        }
    }

    public RecognitionTrackingDataProviderConfiguration(List list, List list2, int i) {
        this.mRecognizerCreators = list;
        this.mTrackerCreators = list2;
        this.mThreadPriority = i;
    }

    public int getThreadPriority() {
        return this.mThreadPriority;
    }
}
