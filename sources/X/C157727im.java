package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.7im  reason: invalid class name and case insensitive filesystem */
public final class C157727im {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C162857ss A0A;
    public final C163017t8 A0B;

    public final void A00() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.A06 = refreshRate;
            this.A07 = (refreshRate * 80) / 100;
        }
    }

    public C157727im(Context context) {
        C162857ss r0;
        if (context != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            this.A09 = windowManager;
            if (windowManager != null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager == null) {
                    r0 = null;
                } else {
                    r0 = new C162857ss(displayManager, this);
                }
                this.A0A = r0;
                this.A0B = C163017t8.A05;
            }
            this.A0A = null;
            this.A0B = null;
        } else {
            this.A09 = null;
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public C157727im() {
        this((Context) null);
    }
}
