package X;

/* renamed from: X.7hp  reason: invalid class name and case insensitive filesystem */
public class C157157hp {
    public final C131266dJ A00;

    public static void A01(C131266dJ r3, C835248t r4, Object obj, Object obj2) {
        A00(r3, new C157967jD(AnonymousClass8UF.A0o(obj, obj2.toString())), r4);
    }

    public static Object A00(C131266dJ r4, C157967jD r5, C835248t r6) {
        C160817oM A02;
        C159567m6.A01("LispyEvaluation");
        AnonymousClass79U.A04.incrementAndGet();
        C153427bI r3 = r4.A00;
        if (!(r3 == null || (A02 = C162377rs.A02(r3)) == null || !C161827qc.A04())) {
            A02.A00++;
        }
        try {
            Object A002 = C154167ci.A00(r5, r6, r4);
            C159567m6.A00();
            if (r3 == null) {
                return A002;
            }
            C162377rs.A09(r3);
            return A002;
        } catch (C143296ye e) {
            C159737mN.A00(r3, "BloksInterpreter", "Exception while evaluating Lispy Script", e);
            C159567m6.A00();
            if (r3 != null) {
                C162377rs.A09(r3);
            }
            return null;
        } catch (Throwable th) {
            C159567m6.A00();
            if (r3 != null) {
                C162377rs.A09(r3);
            }
            throw th;
        }
    }

    public void A02(C157967jD r2, C835248t r3) {
        A00(this.A00, r2, r3);
    }

    public C157157hp(C131266dJ r1) {
        this.A00 = r1;
    }
}
