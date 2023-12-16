package X;

import android.os.SystemClock;

/* renamed from: X.5ha  reason: invalid class name and case insensitive filesystem */
public final class C111125ha implements AnonymousClass4CD {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public final C56612sH A06;

    public C111125ha(C56612sH r2) {
        C162457s7.A0J(r2, 1);
        this.A06 = r2;
    }

    public void BMV() {
        this.A05 = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        long max = Math.max(this.A02, this.A00);
        if (max != 0) {
            this.A03 += uptimeMillis - max;
        }
        this.A00 = uptimeMillis;
    }

    public void onAppBackgrounded() {
        this.A05 = false;
        long uptimeMillis = SystemClock.uptimeMillis();
        long max = Math.max(this.A02, this.A00);
        if (max != 0) {
            this.A04 += uptimeMillis - max;
        }
        this.A00 = uptimeMillis;
    }

    public void A00() {
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = SystemClock.uptimeMillis();
    }
}
