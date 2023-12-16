package X;

import android.hardware.camera2.CaptureFailure;

/* renamed from: X.9ZY  reason: invalid class name */
public class AnonymousClass9ZY implements C202379lv {
    public CaptureFailure A00;

    public int BBx() {
        CaptureFailure captureFailure = this.A00;
        if (captureFailure != null) {
            return captureFailure.getReason();
        }
        return -1;
    }
}
