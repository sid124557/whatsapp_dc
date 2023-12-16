package X;

/* renamed from: X.34y  reason: invalid class name and case insensitive filesystem */
public class C624234y {
    public static boolean A00(AnonymousClass1VX r2, C52532ld r3, C624134x r4) {
        AnonymousClass33C r0;
        if (((r4 instanceof C31971pB) || (r4 instanceof C31961pA)) && (r0 = ((C30471mV) r4).A01) != null && r3.A02(r0)) {
            return C56952sp.A0K(r2, 3934, false);
        }
        return false;
    }

    public static boolean A01(AnonymousClass1VX r4, C624134x r5) {
        if (!(r5 instanceof AnonymousClass1n2)) {
            return false;
        }
        C30471mV r2 = (C30471mV) r5;
        if (!AnonymousClass2z0.A0B(r5) || !r4.A0Y(C58422vE.A02, 252)) {
            return false;
        }
        C613030d A1v = r2.A1v();
        C626936e.A06(A1v);
        if (A1v.A04()) {
            return true;
        }
        return false;
    }

    public static boolean A02(AnonymousClass1VX r2, C624134x r3) {
        int i;
        if (r3 instanceof AnonymousClass1nF) {
            i = 253;
        } else if ((!(r3 instanceof AnonymousClass1n2) && !(r3 instanceof C31981pC)) || !AnonymousClass2z0.A0B(r3)) {
            return true;
        } else {
            i = 252;
        }
        return C56952sp.A0J(r2, i);
    }

    public static boolean A03(AnonymousClass1VX r3, C624134x r4, boolean z) {
        if (r4 instanceof C30471mV) {
            if ((r4 instanceof AnonymousClass1nF) && r3.A0Y(C58422vE.A02, 247)) {
                return true;
            }
            if (!r3.A0Y(C58422vE.A02, 246) || (!(r4 instanceof AnonymousClass1nB) && !(r4 instanceof AnonymousClass1n2))) {
                return false;
            }
            return z;
        }
        return false;
    }

    public static boolean A04(C624134x r2) {
        C613030d A1v;
        if (!(r2 instanceof AnonymousClass1n2) || (A1v = ((C30471mV) r2).A1v()) == null || !A1v.A04()) {
            return false;
        }
        return true;
    }
}
