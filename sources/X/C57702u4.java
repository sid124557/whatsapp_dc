package X;

/* renamed from: X.2u4  reason: invalid class name and case insensitive filesystem */
public class C57702u4 {
    public static final C84814Du A00(Object obj, C84814Du r3, AnonymousClass4GR r4) {
        C162457s7.A0J(r4, 0);
        if (r4 instanceof AnonymousClass8P9) {
            return ((AnonymousClass8P9) r4).A0A(obj, r3);
        }
        C85494Gl B5w = r3.B5w();
        if (B5w == C72553du.A00) {
            return new C74723ha(obj, r3, r4);
        }
        return new C74003gQ(obj, r3, B5w, r4);
    }

    public static final C84814Du A01(C84814Du r3) {
        C75013pU r2;
        C162457s7.A0J(r3, 0);
        if ((r3 instanceof C75013pU) && (r2 = (C75013pU) r3) != null && (r3 = r2.A00) == null) {
            AnonymousClass4GY r0 = (AnonymousClass4GY) r2.B5w().get(AnonymousClass4GY.A00);
            if (r0 != null) {
                r3 = new AnonymousClass46F(r2, (C73853gB) r0);
            } else {
                r3 = r2;
            }
            r2.A00 = r3;
        }
        return r3;
    }

    public static AnonymousClass46G A04(C84814Du r3) {
        AnonymousClass46G r0 = new AnonymousClass46G(A01(r3), 1);
        r0.A0A();
        return r0;
    }

    public static C72463dl A02(C84814Du r1) {
        return new C72463dl(A01(r1));
    }

    public static AnonymousClass46G A03(C84814Du r2) {
        AnonymousClass46G r0 = new AnonymousClass46G(A01(r2), 1);
        r0.A0A();
        return r0;
    }
}
