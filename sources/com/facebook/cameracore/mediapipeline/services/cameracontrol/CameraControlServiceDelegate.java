package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.AnonymousClass9JH;
import X.AnonymousClass9JI;

public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(AnonymousClass9JH r1);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(AnonymousClass9JI r1);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(AnonymousClass9JH r1);

    void updateFocusMode(AnonymousClass9JI r1);
}
