package X;

/* renamed from: X.347  reason: invalid class name */
public final class AnonymousClass347 {
    public static final int A00(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 <= 0) {
            return i3;
        }
        if (i2 > 2147483639) {
            return Integer.MAX_VALUE;
        }
        return 2147483639;
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("index: ");
            A0o.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", size: ", A0o, i2));
        }
    }

    public static final void A02(int i, int i2) {
        if (i < 0 || i > i2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("index: ");
            A0o.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", size: ", A0o, i2));
        }
    }

    public static final void A03(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder A0W = C18270x1.A0W(i, "fromIndex: ");
            A0W.append(", toIndex: ");
            A0W.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", size: ", A0W, i3));
        } else if (i > i2) {
            throw AnonymousClass000.A0G(" > toIndex: ", C18270x1.A0W(i, "fromIndex: "), i2);
        }
    }
}
