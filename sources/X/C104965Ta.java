package X;

import android.os.SystemClock;

/* renamed from: X.5Ta  reason: invalid class name and case insensitive filesystem */
public class C104965Ta {
    public long A00;
    public long A01;
    public boolean A02;

    public void A00() {
        if (this.A02) {
            this.A00 += SystemClock.elapsedRealtime() - this.A01;
            this.A01 = 0;
            this.A02 = false;
        }
    }

    public void A01() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = false;
    }

    public String toString() {
        return String.valueOf(this.A00);
    }

    public void A02() {
        this.A01 = SystemClock.elapsedRealtime();
        this.A02 = true;
    }
}
