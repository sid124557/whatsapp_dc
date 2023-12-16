package X;

/* renamed from: X.7cQ  reason: invalid class name and case insensitive filesystem */
public final class C154007cQ {
    public static boolean A00(C161467pi r4, int i, boolean z) {
        int A00 = C161467pi.A00(r4);
        if (A00 < 7) {
            if (!z) {
                throw AnonymousClass6u7.A02("too short header: ", AnonymousClass001.A0o(), A00);
            }
        } else if (r4.A0C() != i) {
            if (!z) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1G("expected header type ", A0o, i);
                throw AnonymousClass6u7.A00(A0o);
            }
        } else if (r4.A0C() == 118 && r4.A0C() == 111 && r4.A0C() == 114 && r4.A0C() == 98 && r4.A0C() == 105 && r4.A0C() == 115) {
            return true;
        } else {
            if (!z) {
                throw AnonymousClass6u7.A01("expected characters 'vorbis'");
            }
        }
        return false;
    }
}
