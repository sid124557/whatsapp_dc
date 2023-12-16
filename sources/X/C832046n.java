package X;

/* renamed from: X.46n  reason: invalid class name and case insensitive filesystem */
public final class C832046n extends C832146o implements C85564Gt {
    public /* bridge */ /* synthetic */ Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(AnonymousClass001.A0K(A00(this)));
        }
        return valueOf;
    }

    public static Object A00(C832146o r7) {
        Object[] objArr = r7.A04;
        C162457s7.A0H(objArr);
        long j = r7.A03;
        return objArr[(objArr.length - 1) & ((int) ((j + ((long) ((int) ((Math.min(r7.A02, j) + ((long) r7.A00)) - j)))) - 1))];
    }

    public C832046n(int i) {
        super(C369720l.DROP_OLDEST, 1, Integer.MAX_VALUE);
        BrA(Integer.valueOf(i));
    }
}
