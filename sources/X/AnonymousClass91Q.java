package X;

import java.util.Comparator;

/* renamed from: X.91Q  reason: invalid class name */
public class AnonymousClass91Q implements Comparator {
    public double A00;
    public double A01;
    public final int A02;

    public AnonymousClass91Q(double d, double d2, int i) {
        this.A02 = i;
        this.A00 = d;
        this.A01 = d2;
    }

    public final int compare(Object obj, Object obj2) {
        if (this.A02 != 0) {
            double d = this.A00;
            double d2 = this.A01;
            return Double.compare(A00((C105345Uo) obj, d, d2), A00((C105345Uo) obj2, d, d2));
        }
        double d3 = this.A00;
        double d4 = this.A01;
        C108975ds r6 = ((C88534Zc) obj).A0J;
        double d5 = r6.A00 - d3;
        double d6 = r6.A01 - d4;
        double d7 = (d5 * d5) + (d6 * d6);
        C108975ds r8 = ((C88534Zc) obj2).A0J;
        double d8 = r8.A00 - d3;
        double d9 = r8.A01 - d4;
        return Double.compare(d7, (d8 * d8) + (d9 * d9));
    }

    public static double A00(C105345Uo r6, double d, double d2) {
        return ((r6.A00().A00 - d) * (r6.A00().A00 - d)) + ((r6.A00().A01 - d2) * (r6.A00().A01 - d2));
    }
}
