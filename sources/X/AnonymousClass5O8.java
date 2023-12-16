package X;

/* renamed from: X.5O8  reason: invalid class name */
public final class AnonymousClass5O8 {
    public long A00 = -1;
    public long A01 = -1;
    public final C56612sH A02;
    public final C54702p9 A03;
    public final AnonymousClass4FS A04;

    public final void A00(C624134x r13, int i) {
        if (i == 0) {
            if (this.A01 == -1 && this.A00 == -1) {
                this.A01 = System.currentTimeMillis();
            }
        } else if (i == 8) {
            long j = this.A01;
            if (j != -1 && this.A00 == -1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.A00 = currentTimeMillis;
                this.A04.BkM(new C70283aF(this, r13, 3, currentTimeMillis - j));
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public AnonymousClass5O8(C56612sH r3, C54702p9 r4, AnonymousClass4FS r5) {
        C18260x0.A0V(r3, r5, r4);
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
