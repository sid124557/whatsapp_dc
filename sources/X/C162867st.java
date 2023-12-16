package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.7st  reason: invalid class name and case insensitive filesystem */
public final class C162867st implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C158657kL A01;

    public C162867st(DisplayManager displayManager, C158657kL r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public void onDisplayAdded(int i) {
    }

    public void onDisplayChanged(int i) {
        if (i == 0) {
            this.A01.A01();
        }
    }

    public void onDisplayRemoved(int i) {
    }
}
