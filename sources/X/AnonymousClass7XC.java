package X;

import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.7XC  reason: invalid class name */
public final class AnonymousClass7XC {
    public int A00;
    public Looper A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C178008go A06;
    public final C180618lM A07;
    public final Timeline A08;
    public final C186668vk A09;

    public synchronized void A01(boolean z) {
        this.A03 = z | this.A03;
        this.A04 = true;
        notifyAll();
    }

    public void A00() {
        C161487pm.A04(!this.A05);
        this.A05 = true;
        C1689687l r2 = (C1689687l) this.A06;
        synchronized (r2) {
            if (r2.A0F || !r2.A0K.isAlive()) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                A01(false);
            } else {
                C18290x4.A1C(((C1692188l) r2.A0Y).A00, this, 14);
            }
        }
    }

    public AnonymousClass7XC(Looper looper, C178008go r2, C180618lM r3, Timeline timeline, C186668vk r5) {
        this.A06 = r2;
        this.A07 = r3;
        this.A08 = timeline;
        this.A01 = looper;
        this.A09 = r5;
    }
}
