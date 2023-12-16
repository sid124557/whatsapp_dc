package X;

import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper;

/* renamed from: X.9Yq  reason: invalid class name */
public class AnonymousClass9Yq implements C202309ll {
    public CaptureEventInputWrapper A00;

    public void Blv(AnonymousClass20J r4) {
        CaptureEventInputWrapper captureEventInputWrapper = this.A00;
        if (captureEventInputWrapper != null) {
            int i = 2;
            if (r4 == AnonymousClass20J.FRONT) {
                i = 1;
            }
            captureEventInputWrapper.setCaptureDevicePosition(i);
        }
    }
}
