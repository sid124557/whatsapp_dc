package X;

import java.util.Comparator;

/* renamed from: X.8Le  reason: invalid class name */
public final class AnonymousClass8Le implements Comparable {
    public double A00;
    public double A01;
    public C108975ds A02;
    public final C180238ki A03;
    public final Comparator A04;

    public void A00(double[] dArr) {
        int i;
        C108975ds BBX = this.A03.BBX();
        if (!BBX.equals(this.A02)) {
            this.A02 = BBX;
            double A012 = C106725a3.A01(BBX.A01);
            if (A012 < 0.0d) {
                i = 1;
            } else {
                i = 0;
                if (A012 > 1.0d) {
                    i = -1;
                }
            }
            this.A00 = A012 + ((double) i);
            this.A01 = C106725a3.A00(BBX.A00);
        }
        dArr[0] = this.A00;
        dArr[1] = this.A01;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A04.compare(this.A03, ((AnonymousClass8Le) obj).A03);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass8Le)) {
            return false;
        }
        return this.A03.equals(((AnonymousClass8Le) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public AnonymousClass8Le(C180238ki r1, Comparator comparator) {
        this.A03 = r1;
        this.A04 = comparator;
    }
}
