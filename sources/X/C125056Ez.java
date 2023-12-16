package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.qrcode.QrScannerOverlay;

/* renamed from: X.6Ez  reason: invalid class name and case insensitive filesystem */
public class C125056Ez extends Animation {
    public final /* synthetic */ QrScannerOverlay A00;

    public C125056Ez(QrScannerOverlay qrScannerOverlay) {
        this.A00 = qrScannerOverlay;
    }

    public void applyTransformation(float f, Transformation transformation) {
        QrScannerOverlay qrScannerOverlay = this.A00;
        int width = qrScannerOverlay.getWidth();
        int height = qrScannerOverlay.getHeight();
        int min = (Math.min(width, height) * 3) / 4;
        int i = (width - min) / 2;
        int i2 = (height - min) / 2;
        qrScannerOverlay.invalidate(i, i2, i + min, min + i2);
    }
}
