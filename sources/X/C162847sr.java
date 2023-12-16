package X;

import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.7sr  reason: invalid class name and case insensitive filesystem */
public final class C162847sr implements DisplayManager.DisplayListener {
    public final /* synthetic */ AnonymousClass7PU A00;

    public C162847sr(AnonymousClass7PU r1) {
        this.A00 = r1;
    }

    public void onDisplayAdded(int i) {
    }

    public void onDisplayChanged(int i) {
        AnonymousClass7PU r4 = this.A00;
        DisplayManager displayManager = r4.A02;
        if (displayManager != null) {
            Display display = displayManager.getDisplay(0);
            Point point = new Point();
            display.getRealSize(point);
            boolean A1X = AnonymousClass001.A1X(r4.A00, display.getRotation());
            boolean z = !C162457s7.A0P(r4.A01, point);
            if (A1X || z) {
                r4.A00 = display.getRotation();
                if (A1X || r4.A01 != null) {
                    C147507Eo r0 = r4.A03;
                    if (r0 != null) {
                        r0.A00.lambda$registerDisplayListener$0();
                    }
                    if (A1X && r4.A07.A0X(4773)) {
                        int i2 = r4.A00;
                        Voip.videoDeviceAndDisplayOrientationChanged(i2, i2, false);
                    }
                }
                r4.A01 = point;
            }
        }
    }

    public void onDisplayRemoved(int i) {
    }
}
