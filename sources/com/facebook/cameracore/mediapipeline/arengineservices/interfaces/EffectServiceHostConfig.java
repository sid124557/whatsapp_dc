package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.AnonymousClass9MS;
import X.C202299lk;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.handtracking.interfaces.HandTrackingDataProviderConfig;
import com.facebook.cameracore.mediapipeline.sessionrecording.interfaces.SessionRecordingConfig;
import com.facebook.cameracore.mediapipeline.sessionreplay.interfaces.SessionReplayConfig;

public class EffectServiceHostConfig {
    public final FaceTrackerDataProviderConfig mFaceTrackerDataProviderConfig;

    public EffectServiceHostConfig(AnonymousClass9MS r2) {
        this.mFaceTrackerDataProviderConfig = r2.A00;
    }

    public int getConfigType() {
        return 0;
    }

    public FaceTrackerDataProviderConfig getFaceTrackerDataProviderConfig() {
        return this.mFaceTrackerDataProviderConfig;
    }

    public FrameBrightnessDataProviderConfig getFrameBrightnessDataProviderConfig() {
        return null;
    }

    public HandTrackingDataProviderConfig getHandTrackingDataProviderConfig() {
        return null;
    }

    public SessionRecordingConfig getSessionRecordingConfig() {
        return null;
    }

    public SessionReplayConfig getSessionReplayConfig() {
        return null;
    }

    public C202299lk getSlamLibraryProvider() {
        return null;
    }

    public WorldTrackerDataProviderConfigWithSlam getWorldTrackerDataProviderConfigWithSlam() {
        return null;
    }

    public boolean isGalleryPickerEnabled() {
        return false;
    }
}
