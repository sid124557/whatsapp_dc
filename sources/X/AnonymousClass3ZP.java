package X;

/* renamed from: X.3ZP  reason: invalid class name */
public abstract class AnonymousClass3ZP implements Comparable {
    public static final long A00 = ((4611686018427387903L << 1) + 1);
    public static final long A01 = ((-4611686018427387903L << 1) + 1);

    public static final long A00(long j) {
        C373321v r0;
        int i = ((int) j) & 1;
        if (i == 1 && j != A00 && j != A01) {
            return j >> 1;
        }
        C373321v r3 = C373321v.MILLISECONDS;
        if (j == A00) {
            return Long.MAX_VALUE;
        }
        if (j == A01) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if (i == 0) {
            r0 = C373321v.NANOSECONDS;
        } else {
            r0 = r3;
        }
        C162457s7.A0J(r0, 1);
        return r3.timeUnit.convert(j2, r0.timeUnit);
    }
}
