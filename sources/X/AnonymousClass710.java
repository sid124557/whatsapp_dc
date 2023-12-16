package X;

/* renamed from: X.710  reason: invalid class name */
public final class AnonymousClass710 {
    public static boolean A00(C161457ph r4, int i, boolean z) {
        int i2 = r4.A00 - r4.A01;
        if (i2 < 7) {
            if (!z) {
                throw C140626uD.A00(AnonymousClass000.A0Y("too short header: ", AnonymousClass001.A0o(), i2));
            }
        } else if (r4.A04() != i) {
            if (!z) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1G("expected header type ", A0o, i);
                throw C140626uD.A00(A0o.toString());
            }
        } else if (r4.A04() == 118 && r4.A04() == 111 && r4.A04() == 114 && r4.A04() == 98 && r4.A04() == 105 && r4.A04() == 115) {
            return true;
        } else {
            if (!z) {
                throw C140626uD.A00("expected characters 'vorbis'");
            }
        }
        return false;
    }
}
