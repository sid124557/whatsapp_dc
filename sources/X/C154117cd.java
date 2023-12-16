package X;

/* renamed from: X.7cd  reason: invalid class name and case insensitive filesystem */
public final class C154117cd {
    public static final float A00(AnonymousClass84O r4, int i) {
        String str = (String) AnonymousClass84O.A05(r4, i);
        if (str != null) {
            try {
                return C162407s0.A01(str);
            } catch (AnonymousClass6u2 unused) {
                C159737mN.A01("BloksModelUtils", AnonymousClass000.A0V("Error parsing pixel value ", str, AnonymousClass001.A0o()));
            }
        }
        return 0.0f;
    }

    public static final C153287az A01(AnonymousClass84O r6) {
        return new C153287az((int) A00(r6, 42), (int) A00(r6, 40), (int) A00(r6, 41), (int) A00(r6, 35), (int) A00(r6, 36), (int) A00(r6, 38));
    }
}
