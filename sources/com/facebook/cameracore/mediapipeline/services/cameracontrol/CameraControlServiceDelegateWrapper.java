package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.AnonymousClass9JH;
import X.AnonymousClass9JI;

public class CameraControlServiceDelegateWrapper {
    public final CameraControlServiceDelegate mDelegate;

    public boolean canUpdateCaptureDevicePosition(int i) {
        AnonymousClass9JH r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= AnonymousClass9JH.values().length) {
            r0 = AnonymousClass9JH.Back;
        } else {
            r0 = AnonymousClass9JH.values()[i];
        }
        return cameraControlServiceDelegate.canUpdateCaptureDevicePosition(r0);
    }

    public long getExposureTime() {
        return this.mDelegate.getExposureTime();
    }

    public int getIso() {
        return this.mDelegate.getIso();
    }

    public long getMaxExposureTime() {
        return this.mDelegate.getMaxExposureTime();
    }

    public int getMaxIso() {
        return this.mDelegate.getMaxIso();
    }

    public long getMinExposureTime() {
        return this.mDelegate.getMinExposureTime();
    }

    public int getMinIso() {
        return this.mDelegate.getMinIso();
    }

    public boolean isFocusModeSupported(int i) {
        AnonymousClass9JI r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= AnonymousClass9JI.values().length) {
            r0 = AnonymousClass9JI.AutoFocus;
        } else {
            r0 = AnonymousClass9JI.values()[i];
        }
        return cameraControlServiceDelegate.isFocusModeSupported(r0);
    }

    public boolean isLockExposureAndFocusSupported() {
        return this.mDelegate.isLockExposureAndFocusSupported();
    }

    public void lockExposureAndFocus(long j, int i) {
        this.mDelegate.lockExposureAndFocus(j, i);
    }

    public void unlockExposureAndFocus() {
        this.mDelegate.unlockExposureAndFocus();
    }

    public void updateCaptureDevicePosition(int i) {
        AnonymousClass9JH r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= AnonymousClass9JH.values().length) {
            r0 = AnonymousClass9JH.Back;
        } else {
            r0 = AnonymousClass9JH.values()[i];
        }
        cameraControlServiceDelegate.updateCaptureDevicePosition(r0);
    }

    public void updateFocusMode(int i) {
        AnonymousClass9JI r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= AnonymousClass9JI.values().length) {
            r0 = AnonymousClass9JI.AutoFocus;
        } else {
            r0 = AnonymousClass9JI.values()[i];
        }
        cameraControlServiceDelegate.updateFocusMode(r0);
    }
}
