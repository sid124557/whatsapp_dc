package X;

/* renamed from: X.7Wx  reason: invalid class name and case insensitive filesystem */
public final class C151947Wx {
    public int A00 = 5000;
    public int A01 = 2500;
    public int A02 = 50000;
    public int A03 = 50000;
    public AnonymousClass88T A04;
    public boolean A05;

    public C1685185s A00() {
        C161487pm.A04(!this.A05);
        this.A05 = true;
        AnonymousClass88T r1 = this.A04;
        if (r1 == null) {
            r1 = new AnonymousClass88T(65536);
            this.A04 = r1;
        }
        return new C1685185s(r1, this.A03, this.A02, this.A01, this.A00);
    }

    public void A01(int i, int i2, int i3, int i4) {
        C161487pm.A04(!this.A05);
        C1685185s.A00(i3, 0, "bufferForPlaybackMs", "0");
        C1685185s.A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        C1685185s.A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        C1685185s.A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        C1685185s.A00(i2, i, "maxBufferMs", "minBufferMs");
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
