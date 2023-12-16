package X;

/* renamed from: X.8DQ  reason: invalid class name */
public class AnonymousClass8DQ implements C181478mp {
    public boolean B2l(C159187lJ r4, C159187lJ r5, AnonymousClass7MS r6) {
        if (!(r4 instanceof C131476de) || !(r5 instanceof C131476de)) {
            return r4.equals(r5);
        }
        C131476de A02 = r4.A02();
        C131476de A022 = r5.A02();
        if (A02 == A022) {
            return true;
        }
        Object obj = A02.A00;
        if (obj != null) {
            if (!obj.equals(A022.A07())) {
                return false;
            }
            return true;
        } else if (A022.A00 == null) {
            return true;
        }
        return false;
    }
}
