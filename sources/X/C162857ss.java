package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.7ss  reason: invalid class name and case insensitive filesystem */
public final class C162857ss implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C157727im A01;

    public C162857ss(DisplayManager displayManager, C157727im r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public void onDisplayAdded(int i) {
    }

    public void onDisplayChanged(int i) {
        if (i == 0) {
            this.A01.A00();
        }
    }

    public void onDisplayRemoved(int i) {
    }
}
