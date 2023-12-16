package X;

import android.os.Handler;

/* renamed from: X.2Yr  reason: invalid class name and case insensitive filesystem */
public final class C45102Yr {
    public Handler A00;
    public Runnable A01;

    public final synchronized void A00() {
        Runnable runnable;
        Handler handler = this.A00;
        if (!(handler == null || (runnable = this.A01) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.A00 = null;
        this.A01 = null;
    }
}
