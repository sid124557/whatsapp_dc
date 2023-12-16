package X;

/* renamed from: X.7lg  reason: invalid class name and case insensitive filesystem */
public final class C159347lg {
    public static int closedTableSize(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 <= 0) {
            return 1073741824;
        }
        return i2;
    }

    public static int smear(int i) {
        return AnonymousClass6C8.A06(i);
    }

    public static int smearedHash(Object obj) {
        return smear(AnonymousClass000.A07(obj));
    }
}
