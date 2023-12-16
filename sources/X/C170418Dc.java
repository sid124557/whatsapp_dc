package X;

/* renamed from: X.8Dc  reason: invalid class name and case insensitive filesystem */
public class C170418Dc implements C181478mp {
    public boolean B2l(C159187lJ r5, C159187lJ r6, AnonymousClass7MS r7) {
        boolean z;
        if (r6 instanceof C131476de) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r6 = C131476de.A00(r6);
            if (r6 instanceof C131406dX) {
                return false;
            }
        }
        C131496dg A06 = r6.A06();
        if (r5 instanceof C131476de) {
            r5 = C131476de.A00(r5);
            if (r5 instanceof C131406dX) {
                return false;
            }
        }
        for (Object contains : r5.A06().A00) {
            if (!A06.A00.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
