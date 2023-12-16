package X;

/* renamed from: X.8DO  reason: invalid class name */
public class AnonymousClass8DO implements C181478mp {
    public boolean B2l(C159187lJ r4, C159187lJ r5, AnonymousClass7MS r6) {
        boolean z;
        if (!(r4 instanceof C131446db) || !(r5 instanceof C131446db)) {
            if (r4 instanceof C131476de) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C159187lJ A00 = C131476de.A00(r4);
                if (!(A00 instanceof C131406dX)) {
                    return A00.A06().A00.contains(r5);
                }
            }
            return false;
        }
        C131446db A05 = r4.A05();
        return A05.A01.contains(r5.A05().A01);
    }
}
