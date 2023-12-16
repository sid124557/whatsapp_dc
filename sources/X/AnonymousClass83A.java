package X;

/* renamed from: X.83A  reason: invalid class name */
public final class AnonymousClass83A implements C180388kx {
    public int BA4(int i) {
        int i2 = i % 10;
        if (i2 == 0) {
            return 0;
        }
        int i3 = i % 100;
        if (i3 >= 11 && i3 <= 19) {
            return 0;
        }
        if (i2 != 1 || i3 == 11) {
            return 5;
        }
        return 1;
    }
}
