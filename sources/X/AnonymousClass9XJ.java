package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.9XJ  reason: invalid class name */
public class AnonymousClass9XJ implements DisplayManager.DisplayListener {
    public final /* synthetic */ DisplayManager A00;
    public final /* synthetic */ AnonymousClass9VH A01;

    public AnonymousClass9XJ(DisplayManager displayManager, AnonymousClass9VH r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public void onDisplayAdded(int i) {
        AnonymousClass9VH r2 = this.A01;
        if (r2.A02()) {
            C202449m2 r0 = r2.A01;
            if (r0 != null) {
                r0.Baq();
            }
            this.A00.unregisterDisplayListener(r2.A00);
        }
    }

    public void onDisplayChanged(int i) {
    }

    public void onDisplayRemoved(int i) {
    }
}
