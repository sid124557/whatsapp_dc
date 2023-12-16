package X;

/* renamed from: X.8Zl  reason: invalid class name and case insensitive filesystem */
public final class C175718Zl extends C172558Lr {
    public boolean equals(Object obj) {
        if (!(obj instanceof C175718Zl)) {
            return false;
        }
        long j = this.A00;
        long j2 = this.A01;
        if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
            C172558Lr r0 = (C172558Lr) obj;
            if (Long.compare(r0.A00 ^ Long.MIN_VALUE, r0.A01 ^ Long.MIN_VALUE) > 0) {
                return true;
            }
        }
        C172558Lr r9 = (C172558Lr) obj;
        if (j == r9.A00 && j2 == r9.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
            return -1;
        }
        return ((int) (j2 ^ (j2 >>> 32))) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public C175718Zl(long j, long j2) {
        super(j, j2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C154527dJ.A01(this.A00));
        A0o.append("..");
        return AnonymousClass000.A0R(C154527dJ.A01(this.A01), A0o);
    }
}
