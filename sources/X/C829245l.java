package X;

/* renamed from: X.45l  reason: invalid class name and case insensitive filesystem */
public final class C829245l extends AnonymousClass3ZY {
    public boolean equals(Object obj) {
        if (!(obj instanceof C829245l)) {
            return false;
        }
        long j = this.A00;
        long j2 = this.A01;
        if (j > j2) {
            AnonymousClass3ZY r0 = (AnonymousClass3ZY) obj;
            if (r0.A00 > r0.A01) {
                return true;
            }
        }
        AnonymousClass3ZY r10 = (AnonymousClass3ZY) obj;
        if (j == r10.A00 && j2 == r10.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        if (j <= j2) {
            return (int) ((((long) 31) * (j ^ (j >>> 32))) + (j2 ^ (j2 >>> 32)));
        }
        return -1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append("..");
        return AnonymousClass001.A0k(A0o, this.A01);
    }

    public C829245l(long j, long j2) {
        super(j, j2);
    }
}
