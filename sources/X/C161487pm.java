package X;

/* renamed from: X.7pm  reason: invalid class name and case insensitive filesystem */
public final class C161487pm {
    public static void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw AnonymousClass6CA.A0O();
        }
    }

    public static void A02(Object obj, boolean z) {
        if (!z) {
            throw AnonymousClass001.A0e(String.valueOf(obj));
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw AnonymousClass6CA.A0N();
        }
    }

    public static void A04(boolean z) {
        if (!z) {
            throw AnonymousClass6CA.A0O();
        }
    }
}
