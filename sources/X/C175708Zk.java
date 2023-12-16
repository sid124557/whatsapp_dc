package X;

/* renamed from: X.8Zk  reason: invalid class name and case insensitive filesystem */
public final class C175708Zk extends AnonymousClass70U {
    public static final int A00(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Cannot coerce value to an empty range: maximum ");
            A0o.append(i3);
            A0o.append(" is less than minimum ");
            A0o.append(i2);
            A0o.append('.');
            throw C18310x6.A0d(A0o);
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static final long A01(long j, long j2, long j3) {
        if (j2 > j3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Cannot coerce value to an empty range: maximum ");
            A0o.append(j3);
            A0o.append(" is less than minimum ");
            A0o.append(j2);
            A0o.append('.');
            throw C18310x6.A0d(A0o);
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    public static final C175698Zj A02(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C175698Zj.A00;
        }
        return new C175698Zj(i, i2 - 1);
    }
}
