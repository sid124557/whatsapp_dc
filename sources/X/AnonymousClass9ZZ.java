package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.9ZZ  reason: invalid class name */
public class AnonymousClass9ZZ implements C202389lw {
    public TotalCaptureResult A00;

    public Object B3w(CaptureResult.Key key) {
        try {
            TotalCaptureResult totalCaptureResult = this.A00;
            if (totalCaptureResult != null) {
                return totalCaptureResult.get(key);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
