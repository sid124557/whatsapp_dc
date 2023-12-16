package X;

/* renamed from: X.7aa  reason: invalid class name and case insensitive filesystem */
public final class C153047aa {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass6PS A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C153047aa.class != obj.getClass()) {
                return false;
            }
            C153047aa r7 = (C153047aa) obj;
            if (!(this.A03 == r7.A03 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A06 == r7.A06 && this.A07 == r7.A07 && this.A05 == r7.A05 && C162387ry.A0D(this.A04, r7.A04))) {
                return false;
            }
        }
        return true;
    }

    public C153047aa A00(long j) {
        long j2 = j;
        if (j == this.A02) {
            return this;
        }
        return new C153047aa(this.A04, this.A03, j2, this.A01, this.A00, this.A06, this.A07, this.A05);
    }

    public C153047aa A01(long j) {
        long j2 = j;
        if (j == this.A03) {
            return this;
        }
        return new C153047aa(this.A04, j2, this.A02, this.A01, this.A00, this.A06, this.A07, this.A05);
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass6C8.A04(this.A04.hashCode()) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + ((int) this.A00)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }

    public C153047aa(AnonymousClass6PS r1, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.A04 = r1;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = z3;
    }
}
