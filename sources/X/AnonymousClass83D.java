package X;

/* renamed from: X.83D  reason: invalid class name */
public final class AnonymousClass83D implements C180388kx {
    public int BA4(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            if (i % 100 != 11) {
                return 1;
            }
            return 5;
        } else if (i2 < 2 || i2 > 4) {
            return 5;
        } else {
            int i3 = i % 100;
            if (i3 < 12 || i3 > 14) {
                return 3;
            }
            return 5;
        }
    }
}
