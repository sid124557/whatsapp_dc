package X;

/* renamed from: X.83Y  reason: invalid class name */
public final class AnonymousClass83Y implements C180388kx {
    public int BA4(int i) {
        if (i == 1) {
            return 1;
        }
        int i2 = i % 10;
        if (i2 < 2 || i2 > 4) {
            return 4;
        }
        int i3 = i % 100;
        if (i3 < 12 || i3 > 14) {
            return 3;
        }
        return 4;
    }
}
