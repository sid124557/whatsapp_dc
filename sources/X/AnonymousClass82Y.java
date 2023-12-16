package X;

/* renamed from: X.82Y  reason: invalid class name */
public class AnonymousClass82Y implements C180378kw {
    public final float A00;
    public final int A01;
    public final C177658gE A02;
    public final C186458vL A03;
    public final C152587Zl A04;
    public final AnonymousClass7FL A05;

    public C166637z1 Bl9(AnonymousClass7FJ r9, C166637z1[] r10) {
        long j;
        long j2;
        int length = r10.length;
        if (length == 0) {
            return null;
        }
        C160307nP r3 = ((C1674981h) this.A02).A02;
        synchronized (r3) {
            j = r3.A02;
        }
        float f = this.A00;
        if (j == -1) {
            j2 = (long) this.A01;
        } else {
            j2 = (long) (((float) j) * f);
        }
        int i = 0;
        do {
            C166637z1 r5 = r10[i];
            if (((long) r5.A04) <= j2) {
                return r5;
            }
            i++;
        } while (i < length);
        int i2 = 0;
        C166637z1 r4 = r10[0];
        do {
            C166637z1 r2 = r10[i2];
            if (r2.A04 < r4.A04) {
                r4 = r2;
            }
            i2++;
        } while (i2 < length);
        return r4;
    }

    public AnonymousClass82Y(C177658gE r2, C186458vL r3, C152587Zl r4, AnonymousClass7FL r5, AnonymousClass8L1 r6) {
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A01 = r6.audioMaxInitialBitrate;
        this.A00 = r6.audioPrefetchBandwidthFraction;
    }
}
