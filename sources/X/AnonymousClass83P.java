package X;

/* renamed from: X.83P  reason: invalid class name */
public final class AnonymousClass83P implements C180388kx {
    public int BA4(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        int i2 = i % 100;
        if (i2 >= 3) {
            if (i2 <= 10) {
                return 3;
            }
            if (i2 > 99) {
                return 5;
            }
            return 4;
        }
        return 5;
    }
}
