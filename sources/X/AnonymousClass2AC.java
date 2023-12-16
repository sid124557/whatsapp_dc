package X;

/* renamed from: X.2AC  reason: invalid class name */
public final class AnonymousClass2AC {
    public static final long A00(C373321v r9, int i) {
        long j = (long) i;
        if (r9.compareTo(C373321v.SECONDS) <= 0) {
            return C373321v.NANOSECONDS.timeUnit.convert(j, r9.timeUnit) << 1;
        }
        C373321v r8 = C373321v.NANOSECONDS;
        long convert = r9.timeUnit.convert(4611686018426999999L, r8.timeUnit);
        C829245l r1 = new C829245l(-convert, convert);
        if (r1.A00 > j || j > r1.A01) {
            return (C175708Zk.A01(C373321v.MILLISECONDS.timeUnit.convert(j, r9.timeUnit), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        }
        return r8.timeUnit.convert(j, r9.timeUnit) << 1;
    }
}
