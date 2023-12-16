package X;

/* renamed from: X.2A2  reason: invalid class name */
public final class AnonymousClass2A2 {
    public static void A01(boolean z) {
        A00("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0], z);
    }

    public static void A00(String str, Object[] objArr, boolean z) {
        if (!z) {
            throw AnonymousClass001.A0e(String.format(str, objArr));
        }
    }
}
