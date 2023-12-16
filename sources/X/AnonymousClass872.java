package X;

/* renamed from: X.872  reason: invalid class name */
public final class AnonymousClass872 implements C184888si {
    public long A00 = -1;
    public long A01 = -1;
    public C147827Fw A02;
    public C161727qK A03;

    public C184868sg B12() {
        long j = this.A00;
        C161487pm.A04(AnonymousClass000.A1S((j > -1 ? 1 : (j == -1 ? 0 : -1))));
        return new C1686886j(this.A03, j);
    }

    public long BiG(C187648xa r9) {
        long j = this.A01;
        if (j < 0) {
            return -1;
        }
        long j2 = -(j + 2);
        this.A01 = -1;
        return j2;
    }

    public void Bpw(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[C162387ry.A04(jArr, j, true)];
    }

    public AnonymousClass872(C147827Fw r3, C161727qK r4) {
        this.A03 = r4;
        this.A02 = r3;
    }
}
