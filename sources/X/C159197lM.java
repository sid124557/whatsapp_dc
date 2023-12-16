package X;

/* renamed from: X.7lM  reason: invalid class name and case insensitive filesystem */
public final class C159197lM {
    public static void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1P(A1X, i, 0);
            AnonymousClass6C7.A1U(A1X, 0, i2);
            throw new IndexOutOfBoundsException(String.format("Index: %d. Start: %d. Limit: %d", A1X));
        }
    }

    public static void A01(boolean z) {
        if (!z) {
            throw AnonymousClass6CA.A0N();
        }
    }

    public static void A02(boolean z) {
        if (!z) {
            throw AnonymousClass6CA.A0O();
        }
    }
}
