package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5X3  reason: invalid class name */
public class AnonymousClass5X3 {
    public static final C157467iL A03 = new C157467iL(0.0d, 0.0d, 1.0d, 1.0d);
    public final AnonymousClass7PK A00 = new AnonymousClass7PK(A03, 0);
    public final C157467iL A01 = new C157467iL();
    public final double[] A02 = new double[2];

    public final void A00(AnonymousClass7PK r23, C157467iL r24, Collection collection) {
        C157467iL r13 = r24;
        double d = r13.A01;
        double d2 = r13.A02;
        AnonymousClass7PK r14 = r23;
        Collection collection2 = collection;
        if (d > d2) {
            C157467iL r2 = this.A01;
            r2.A03 = r13.A03;
            r2.A00 = r13.A00;
            r2.A01 = d;
            r2.A02 = d2;
            r2.A02 = 1.0d;
            A00(r14, r2, collection2);
            r2.A03 = r13.A03;
            r2.A00 = r13.A00;
            r2.A01 = r13.A01;
            r2.A02 = r13.A02;
            r2.A01 = 0.0d;
            A00(r14, r2, collection2);
            return;
        }
        C157467iL r15 = r14.A06;
        double d3 = r15.A01;
        double d4 = d3;
        if (d3 <= d2) {
            double d5 = r15.A02;
            double d6 = d5;
            if (d <= d5) {
                double d7 = r15.A03;
                double d8 = r13.A00;
                if (d7 <= d8) {
                    double d9 = r13.A03;
                    double d10 = r15.A00;
                    if (d9 > d10) {
                        return;
                    }
                    if (!r14.A04) {
                        A00(r14.A01, r13, collection2);
                        A00(r14.A00, r13, collection2);
                        A00(r14.A03, r13, collection2);
                        A00(r14.A02, r13, collection2);
                        return;
                    }
                    boolean z = false;
                    if (d <= d2 && d9 <= d8 && d <= d4 && d4 <= d2 && d <= d6 && d6 <= d2 && d9 <= d10 && d10 <= d8 && d9 <= d7 && d7 <= d8) {
                        z = true;
                    }
                    ArrayList arrayList = r14.A07;
                    if (z) {
                        collection2.addAll(arrayList);
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass8Le r9 = (AnonymousClass8Le) it.next();
                        double[] dArr = this.A02;
                        r9.A00(dArr);
                        double d11 = dArr[0];
                        double d12 = dArr[1];
                        double d13 = r13.A01;
                        double d14 = r13.A02;
                        if (d13 <= d14) {
                            double d15 = r13.A03;
                            double d16 = r13.A00;
                            if (d15 <= d16 && d13 <= d11 && d11 <= d14 && d15 <= d12 && d12 <= d16) {
                                collection2.add(r9);
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean A01(AnonymousClass8Le r32, AnonymousClass7PK r33) {
        int i;
        double[] dArr = this.A02;
        AnonymousClass8Le r11 = r32;
        r11.A00(dArr);
        AnonymousClass7PK r10 = r33;
        C157467iL r8 = r10.A06;
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = r8.A01;
        double d4 = r8.A02;
        if (d3 <= d4) {
            double d5 = r8.A03;
            double d6 = r8.A00;
            if (d5 <= d6 && d3 <= d && d <= d4 && d5 <= d2 && d2 <= d6) {
                if (r10.A04) {
                    ArrayList arrayList = r10.A07;
                    if (arrayList.size() < 40 || (i = r10.A05) > 20) {
                        arrayList.add(r11);
                        return true;
                    }
                    double d7 = r8.A01;
                    double d8 = r8.A02;
                    double d9 = (d7 + d8) * 0.5d;
                    double d10 = r8.A03;
                    double d11 = (d10 + r8.A00) * 0.5d;
                    double d12 = d10;
                    int i2 = i + 1;
                    r10.A00 = new AnonymousClass7PK(new C157467iL(d9, d12, d8, d11), i2);
                    r10.A03 = new AnonymousClass7PK(new C157467iL(r8.A01, d11, d9, r8.A00), i2);
                    r10.A01 = new AnonymousClass7PK(new C157467iL(r8.A01, r8.A03, d9, d11), i2);
                    r10.A02 = new AnonymousClass7PK(new C157467iL(d9, d11, r8.A02, r8.A00), i2);
                    r10.A04 = false;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        AnonymousClass8Le r1 = (AnonymousClass8Le) arrayList.get(i3);
                        if (!A01(r1, r10.A01) && !A01(r1, r10.A00) && !A01(r1, r10.A03)) {
                            A01(r1, r10.A02);
                        }
                    }
                    arrayList.clear();
                }
                if (!A01(r11, r10.A01) && !A01(r11, r10.A00) && !A01(r11, r10.A03)) {
                    if (!A01(r11, r10.A02)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
