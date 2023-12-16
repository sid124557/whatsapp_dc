package X;

/* renamed from: X.7Qg  reason: invalid class name and case insensitive filesystem */
public abstract class C150347Qg {
    public static int A02(int i) {
        return C128346Vs.A00(i << 3);
    }

    public static int A03(int i, int i2) {
        return i2 + C128346Vs.A00((i >> 31) ^ (i << 1));
    }

    public static void A05(C128346Vs r1, int i) {
        r1.A03((i << 3) | 2);
    }

    public static void A06(C128346Vs r2, int i, int i2) {
        r2.A03(i2 << 3);
        r2.A03((i >> 31) ^ (i << 1));
    }

    public static void A07(C128346Vs r1, int i, long j) {
        r1.A03(i << 3);
        r1.A09(j);
    }

    public static int A04(int i, int i2) {
        return i2 + C128346Vs.A00(i) + i;
    }
}
