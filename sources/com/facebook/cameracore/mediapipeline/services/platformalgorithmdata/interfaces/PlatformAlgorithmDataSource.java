package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces;

import X.C201959l8;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

public interface PlatformAlgorithmDataSource {
    void closeSession();

    void registerListener(C201959l8 r1);

    void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);
}
