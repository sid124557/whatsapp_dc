package X;

import android.os.SystemClock;

/* renamed from: X.3Ep  reason: invalid class name and case insensitive filesystem */
public class C64703Ep implements C84414Cg {
    public long A00 = 0;
    public boolean A01 = false;
    public final C29401il A02;
    public final C56612sH A03;

    public synchronized boolean isValid() {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.A00 < 5000) {
            z = this.A01;
        } else {
            this.A00 = uptimeMillis;
            try {
                AnonymousClass30O r3 = this.A02.A00;
                int i = r3.A00;
                if (i != 1 || r3.A01 > 0 || r3.A03 > 0 || r3.A02 != Integer.MIN_VALUE) {
                    if (!r3.A02() || i != 2) {
                        z = false;
                        this.A01 = z;
                    }
                }
                z = true;
                this.A01 = z;
            } catch (Exception unused) {
                z = false;
                this.A01 = false;
            }
        }
        return z;
    }

    public C64703Ep(C29401il r3, C56612sH r4) {
        this.A03 = r4;
        this.A02 = r3;
    }

    public Integer B1a() {
        return AnonymousClass001.A0f();
    }
}
