package X;

/* renamed from: X.348  reason: invalid class name */
public final class AnonymousClass348 {
    public static final C85494Gl A00(C85494Gl r4, C85494Gl r5, boolean z) {
        Boolean bool = Boolean.FALSE;
        C828145a r1 = C828145a.A00;
        boolean A1Z = AnonymousClass001.A1Z(r4.fold(bool, r1));
        boolean A1Z2 = AnonymousClass001.A1Z(r5.fold(bool, r1));
        if (A1Z || A1Z2) {
            C69903Yy r3 = new C69903Yy();
            r3.element = r5;
            C72553du r2 = C72553du.A00;
            r4 = (C85494Gl) r4.fold(r2, new AnonymousClass45T(r3, z));
            if (A1Z2) {
                r3.element = ((C85494Gl) r3.element).fold(r2, AnonymousClass45Z.A00);
            }
            r5 = (C85494Gl) r3.element;
        }
        return r4.plus(r5);
    }

    public static final AnonymousClass476 A02(Object obj, C84814Du r3, C85494Gl r4) {
        AnonymousClass476 r1 = null;
        if ((r3 instanceof AnonymousClass4C3) && r4.get(C72483dn.A00) != null) {
            AnonymousClass4C3 r32 = (AnonymousClass4C3) r3;
            while (true) {
                if ((r32 instanceof AnonymousClass477) || (r32 = r32.B5B()) == null) {
                    break;
                } else if (r32 instanceof AnonymousClass476) {
                    AnonymousClass476 r33 = (AnonymousClass476) r32;
                    r1 = r33;
                    if (r33 != null) {
                        r33.A12(obj, r4);
                    }
                }
            }
        }
        return r1;
    }

    public static final C85494Gl A01(C85494Gl r2, AnonymousClass4C6 r3) {
        C85494Gl A00 = A00(r3.B61(), r2, true);
        C73853gB r1 = AnonymousClass34M.A00;
        if (A00 == r1 || A00.get(AnonymousClass4GY.A00) != null) {
            return A00;
        }
        return A00.plus(r1);
    }
}
