package X;

import java.util.Arrays;

/* renamed from: X.2ty  reason: invalid class name and case insensitive filesystem */
public class C57642ty {
    public static boolean A01(AnonymousClass3ZC r4, AnonymousClass3ZC r5) {
        int A00;
        if (r5 == null) {
            return false;
        }
        if (r4 == null) {
            A00 = 1;
        } else {
            A00 = AnonymousClass28B.A00(r4.hostStorage, r4.actualActors);
        }
        if (A00 == AnonymousClass28B.A00(r5.hostStorage, r5.actualActors)) {
            return false;
        }
        Arrays.toString(Thread.currentThread().getStackTrace());
        return true;
    }

    public static boolean A00(C64773Ex r3, C56662sM r4, AnonymousClass1VX r5, AnonymousClass3LP r6, C95814uZ r7) {
        if (!C627336j.A0K(r7) && !C57362tW.A00(r6, r7) && !C616831v.A00(r5, r7) && (!(r7 instanceof C27981fH) || C56662sM.A00(r4, r7) != null)) {
            AnonymousClass3ZH A07 = r3.A07(r7);
            if (A07 != null) {
                if (A07.A0F == null && A07.A0G == null) {
                    if (A07.A0R()) {
                        C55502qS r0 = A07.A0E;
                        if (r0 == null || !r0.A02()) {
                            return C56952sp.A0K(r5, 5263, false);
                        }
                    }
                }
            }
            return r5.A0Y(C58422vE.A02, 3962);
        }
        return false;
    }
}
