package X;

/* renamed from: X.5BT  reason: invalid class name */
public class AnonymousClass5BT {
    public static boolean A00(AnonymousClass1VX r4, C624134x r5, C30721mu r6, boolean z) {
        boolean A1T;
        boolean A1T2;
        AnonymousClass33C r0;
        if (!(r5 instanceof C30721mu)) {
            return false;
        }
        C30721mu r2 = (C30721mu) r5;
        if (r4.A0X(1040)) {
            A1T = r6.A25();
            A1T2 = r2.A25();
        } else {
            A1T = AnonymousClass001.A1T(r6.A09);
            A1T2 = AnonymousClass001.A1T(r2.A09);
        }
        if (!A1T || !A1T2) {
            return false;
        }
        if ((z || !r5.A1J.A02 || r6.A1J.A02) && (r0 = r2.A01) != null && r0.A0F != null && C627636p.A10(r2)) {
            return true;
        }
        return false;
    }
}
