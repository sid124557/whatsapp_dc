package X;

/* renamed from: X.7at  reason: invalid class name and case insensitive filesystem */
public abstract class C153227at {
    public final int A00;
    public final C175698Zj A01;

    public static int A00(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A01(long j) {
        if (this instanceof AnonymousClass6NH) {
            return A00(j);
        }
        if (!(this instanceof AnonymousClass6NG)) {
            return A00(j);
        }
        int i = ((int) j) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A02(long j) {
        if (this instanceof AnonymousClass6NH) {
            return A00(j >>> 32);
        }
        if (!(this instanceof AnonymousClass6NG)) {
            return A00(j >>> 32);
        }
        int A06 = C86664Kz.A06(j) & 1073741823 & 262143;
        int i = A06 - 1;
        if (A06 == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public int A03(long j) {
        if (this instanceof AnonymousClass6NH) {
            return 0;
        }
        if (!(this instanceof AnonymousClass6NG)) {
            return A00(j);
        }
        int i = (((int) j) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A04(long j) {
        if (this instanceof AnonymousClass6NH) {
            return 0;
        }
        if (!(this instanceof AnonymousClass6NG)) {
            return A00(j >>> 32);
        }
        int A06 = (C86664Kz.A06(j) & Integer.MAX_VALUE) >>> 18;
        int i = A06 - 1;
        if (A06 == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public long A05(int i, int i2) {
        if (this instanceof AnonymousClass6NH) {
            int i3 = i2 + 1;
            if (i2 == Integer.MAX_VALUE) {
                i3 = 0;
            }
            return AnonymousClass6C8.A0M((i3 & 1073741823) | (this.A00 << 30));
        } else if (this instanceof AnonymousClass6NG) {
            int i4 = 0;
            int i5 = i + 1;
            if (i == Integer.MAX_VALUE) {
                i5 = 0;
            }
            if (i2 != Integer.MAX_VALUE) {
                i4 = i2 + 1;
            }
            return AnonymousClass6C8.A0M(((i5 & 8191) << 18) | (this.A00 << 30) | (262143 & i4));
        } else {
            int i6 = i2 + 1;
            if (i2 == Integer.MAX_VALUE) {
                i6 = 0;
            }
            return AnonymousClass6C8.A0M((i6 & 1073741823) | (this.A00 << 30));
        }
    }

    public C153227at(C175698Zj r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
