package X;

import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.5PT  reason: invalid class name */
public class AnonymousClass5PT {
    public float A00 = -1.0f;

    public void A00(Window window) {
        window.clearFlags(128);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.A00;
        window.setAttributes(attributes);
    }

    public void A01(Window window, C620633i r4) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.A00 = attributes.screenBrightness;
        PowerManager A0J = r4.A0J();
        if (A0J != null && !A0J.isPowerSaveMode()) {
            window.addFlags(128);
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
    }
}
