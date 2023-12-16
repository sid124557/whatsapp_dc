package X;

import android.os.SystemClock;

/* renamed from: X.88s  reason: invalid class name and case insensitive filesystem */
public final class C1692888s implements C184928sm {
    public long A00;
    public long A01;
    public C158477k2 A02 = C158477k2.A03;
    public boolean A03;
    public final C186668vk A04;

    public void A00(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = SystemClock.elapsedRealtime();
        }
    }

    public C158477k2 BBR() {
        return this.A02;
    }

    public long BBa() {
        long j;
        long j2 = this.A01;
        if (!this.A03) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        C158477k2 r4 = this.A02;
        if (r4.A01 == 1.0f) {
            j = C161207pD.A00(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) r4.A02);
        }
        return j2 + j;
    }

    public void Bmy(C158477k2 r3) {
        if (this.A03) {
            A00(BBa());
        }
        this.A02 = r3;
    }

    public C1692888s(C186668vk r2) {
        this.A04 = r2;
    }
}
