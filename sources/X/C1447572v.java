package X;

import java.math.RoundingMode;

/* renamed from: X.72v  reason: invalid class name and case insensitive filesystem */
public final class C1447572v {
    public static int A00(RoundingMode roundingMode, int i, int i2) {
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (AnonymousClass6CA.A04(roundingMode, AnonymousClass778.A00)) {
                case 1:
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0 || abs2 <= 0) {
                        return i3;
                    }
                default:
                    throw new AssertionError();
            }
            return i3 + i5;
        }
        throw new ArithmeticException("/ by zero");
    }
}
