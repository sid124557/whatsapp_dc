package X;

/* renamed from: X.7nV  reason: invalid class name and case insensitive filesystem */
public final class C160357nV {
    public static final int[][] A02 = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final byte A00;
    public final AnonymousClass21X A01;

    public static C160357nV A00(int i, int i2) {
        int bitCount;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : A02) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C160357nV(iArr[1]);
            }
            int bitCount2 = Integer.bitCount(i ^ i5);
            if (bitCount2 < i3) {
                i4 = iArr[1];
                i3 = bitCount2;
            }
            if (i != i2 && (bitCount = Integer.bitCount(i2 ^ i5)) < i3) {
                i4 = iArr[1];
                i3 = bitCount;
            }
        }
        if (i3 <= 3) {
            return new C160357nV(i4);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C160357nV) {
            C160357nV r4 = (C160357nV) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.ordinal() << 3) | this.A00;
    }

    public C160357nV(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 >= 0) {
            AnonymousClass21X[] r1 = AnonymousClass21X.A00;
            if (i2 < r1.length) {
                this.A01 = r1[i2];
                this.A00 = (byte) (i & 7);
                return;
            }
        }
        throw AnonymousClass6CA.A0N();
    }
}
