package X;

/* renamed from: X.83L  reason: invalid class name */
public final class AnonymousClass83L implements C180388kx {
    public int BA4(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 0) {
            return 3;
        }
        int i2 = i % 100;
        if (i2 >= 2) {
            if (i2 <= 10) {
                return 3;
            }
            if (i2 > 19) {
                return 5;
            }
            return 4;
        }
        return 5;
    }
}
