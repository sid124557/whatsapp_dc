package X;

import android.media.AudioTrack;

/* renamed from: X.7Tz  reason: invalid class name and case insensitive filesystem */
public final class C151247Tz {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final AnonymousClass7NP A05;

    public final void A00(int i) {
        this.A00 = i;
        long j = 5000;
        if (i == 0) {
            this.A03 = 0;
            this.A01 = -1;
            this.A02 = C18290x4.A0B(System.nanoTime());
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        }
        this.A04 = j;
    }

    public C151247Tz(AudioTrack audioTrack) {
        this.A05 = new AnonymousClass7NP(audioTrack);
        A00(0);
    }
}
