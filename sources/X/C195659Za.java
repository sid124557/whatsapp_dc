package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.9Za  reason: invalid class name and case insensitive filesystem */
public class C195659Za implements C202389lw {
    public TotalCaptureResult A00;

    public Object B3w(CaptureResult.Key key) {
        TotalCaptureResult totalCaptureResult = this.A00;
        if (totalCaptureResult != null) {
            return totalCaptureResult.get(key);
        }
        return null;
    }
}
