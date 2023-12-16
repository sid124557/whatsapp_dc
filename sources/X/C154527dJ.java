package X;

/* renamed from: X.7dJ  reason: invalid class name and case insensitive filesystem */
public final class C154527dJ {
    public static final int A00(int i, int i2) {
        return C162457s7.A00(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final String A01(long j) {
        if (j >= 0) {
            C154557dM.A00(10);
            String l = Long.toString(j, 10);
            C162457s7.A0D(l);
            return l;
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C154557dM.A00(10);
        String l2 = Long.toString(j3, 10);
        C162457s7.A0D(l2);
        A0o.append(l2);
        C154557dM.A00(10);
        String l3 = Long.toString(j4, 10);
        C162457s7.A0D(l3);
        return AnonymousClass000.A0X(l3, A0o);
    }
}
