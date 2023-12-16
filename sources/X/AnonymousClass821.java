package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.821  reason: invalid class name */
public final class AnonymousClass821 implements C184788sW {
    public long A00;
    public long A01;
    public C158167jX A02 = C158167jX.A05;
    public boolean A03;
    public final C186588vc A04;

    public synchronized void A00() {
        if (this.A03) {
            A01(BBa());
            this.A03 = false;
        }
    }

    public synchronized void A01(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = SystemClock.elapsedRealtime();
        }
    }

    public synchronized long BBa() {
        long j;
        long j2;
        j = this.A01;
        if (this.A03) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
            C158167jX r4 = this.A02;
            if (r4.A01 == 1.0f) {
                j2 = Util.A04(elapsedRealtime);
            } else {
                j2 = elapsedRealtime * ((long) r4.A02);
            }
            j += j2;
        }
        return j;
    }

    public synchronized C158167jX Bmx(C158167jX r3) {
        if (this.A03) {
            A01(BBa());
        }
        this.A02 = r3;
        return r3;
    }

    public C158167jX BBQ() {
        return this.A02;
    }

    public AnonymousClass821(C186588vc r2) {
        this.A04 = r2;
    }
}
