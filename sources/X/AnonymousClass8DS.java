package X;

/* renamed from: X.8DS  reason: invalid class name */
public class AnonymousClass8DS implements C181478mp {
    public boolean B2l(C159187lJ r4, C159187lJ r5, AnonymousClass7MS r6) {
        boolean z;
        int compareTo;
        if (r4 instanceof C131486df) {
            z = true;
        } else {
            z = false;
        }
        if (z && (r5 instanceof C131486df)) {
            compareTo = C131486df.A00(r4, r5);
        } else if ((r4 instanceof C131446db) && (r5 instanceof C131446db)) {
            compareTo = C131446db.A00(r4, r5);
        } else if (!(r4 instanceof C131456dc) || !(r5 instanceof C131456dc)) {
            return false;
        } else {
            compareTo = r4.A04().A07().compareTo(r5.A04().A07());
        }
        if (compareTo < 0) {
            return false;
        }
        return true;
    }
}
