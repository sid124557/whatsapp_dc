package X;

/* renamed from: X.7Tl  reason: invalid class name and case insensitive filesystem */
public final class C151107Tl {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public boolean A03 = false;
    public boolean A04 = false;

    public C126316Nj A00() {
        long j = this.A00;
        if (j == 0 && this.A01 == 0 && this.A02 == 0) {
            throw AnonymousClass001.A0c("Should set at least some max size limit");
        }
        long j2 = this.A01;
        if (j2 == 0) {
            this.A01 = j;
            j2 = j;
        }
        long j3 = this.A02;
        if (j3 == 0) {
            this.A02 = j2;
            j3 = j2;
        }
        return new C126316Nj(j, j2, j3, this.A03, this.A04);
    }
}
