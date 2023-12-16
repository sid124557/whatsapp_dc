package X;

/* renamed from: X.72Z  reason: invalid class name */
public abstract class AnonymousClass72Z {
    public static int A04(int i) {
        return C128856Xs.A00(i << 3);
    }

    public static int A05(int i, int i2) {
        return i2 + C128856Xs.A00((i >> 31) ^ (i << 1));
    }

    public static void A07(C128856Xs r1, int i) {
        r1.A05((i << 3) | 2);
    }

    public static void A08(Object obj, int i, int i2) {
        C128856Xs r1 = ((AnonymousClass8B0) obj).A00;
        r1.A05((i << 3) | 5);
        r1.A06(i2);
    }

    public static void A09(Object obj, long j, int i) {
        C128856Xs r1 = ((AnonymousClass8B0) obj).A00;
        r1.A05((i << 3) | 1);
        r1.A0A(j);
    }

    public static void A0A(Object obj, long j, int i) {
        C128856Xs r1 = ((AnonymousClass8B0) obj).A00;
        r1.A05(i << 3);
        r1.A09(j);
    }

    public static int A06(int i, long j) {
        return i + C128856Xs.A02(j);
    }
}
