package X;

/* renamed from: X.7iy  reason: invalid class name and case insensitive filesystem */
public abstract class C157837iy {
    public abstract C157837iy add(Object obj);

    public static int expandedCapacity(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 >= i2) {
            return i3;
        }
        int highestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        if (highestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return highestOneBit;
    }

    public C157837iy addAll(Iterable iterable) {
        for (Object add : iterable) {
            add(add);
        }
        return this;
    }
}
