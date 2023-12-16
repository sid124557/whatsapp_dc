package X;

/* renamed from: X.72B  reason: invalid class name */
public final class AnonymousClass72B {
    public static long A00(C161467pi r8, int i, int i2) {
        r8.A0S(i);
        int i3 = r8.A00;
        if (i3 - r8.A01 >= 5) {
            int A07 = r8.A07();
            if ((8388608 & A07) == 0 && ((2096896 & A07) >> 8) == i2 && (A07 & 32) != 0 && r8.A0C() >= 7 && i3 - r8.A01 >= 7 && (r8.A0C() & 16) == 16) {
                byte[] bArr = new byte[6];
                r8.A0V(bArr, 0, 6);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
