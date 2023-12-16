package X;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5ZH  reason: invalid class name */
public class AnonymousClass5ZH {
    public final float A00;
    public final Context A01;
    public final C110885hC A02;
    public final AnonymousClass5X3 A03;
    public final List A04 = AnonymousClass001.A0s();
    public final Map A05;
    public final Set A06 = AnonymousClass002.A0K();
    public final double[] A07 = new double[2];

    public static final boolean A01(C157467iL r5, C157467iL r6) {
        if (r6 == null || r5.A01 >= r6.A02 || r6.A01 >= r5.A02 || r5.A03 >= r6.A00 || r6.A03 >= r5.A00) {
            return false;
        }
        return true;
    }

    public double A02(float f) {
        C110885hC r0 = this.A02;
        C106725a3 r1 = r0.A0S;
        float f2 = r0.A02().A02;
        return (double) (f / (((float) ((1 << ((int) f2)) * r1.A00.A0O)) * ((f2 % 1.0f) + 1.0f)));
    }

    public C157467iL A03(C108995du r15, int i) {
        double A022 = A02(AnonymousClass5YI.A01(this.A01, (float) i));
        C108975ds r3 = r15.A01;
        C108975ds r2 = r15.A00;
        return new C157467iL(C106725a3.A01(r3.A01) - A022, C106725a3.A00(r2.A00) - A022, C106725a3.A01(r2.A01) + A022, C106725a3.A00(r3.A00) + A022);
    }

    public final C157467iL A04(C109075e2 r18) {
        C109075e2 r4 = r18;
        double[] A08 = A08(r4.BBX());
        Context context = this.A01;
        float A012 = AnonymousClass5YI.A01(context, 20.0f);
        C162457s7.A0J(context, 0);
        float A013 = r4.A03 + r4.A00 + AnonymousClass5YI.A01(context, 3.0f);
        float f = r4.A07;
        if (f == -1.0f) {
            f = AnonymousClass5YI.A00(context);
            r4.A07 = f;
        }
        float A002 = r4.A00(context);
        double A022 = A02(A013 / 2.0f);
        float f2 = A012 / 2.0f;
        return new C157467iL(A08[0] - A02((float) ((int) ((A002 + f2) + f))), A08[1] - A022, A08[0] - A02(f2), A08[1] + A022);
    }

    public final C157467iL A05(C109075e2 r20) {
        C109075e2 r3 = r20;
        double[] A08 = A08(r3.BBX());
        Context context = this.A01;
        C162457s7.A0J(context, 0);
        float A012 = r3.A03 + r3.A00 + AnonymousClass5YI.A01(context, 3.0f);
        float f = r3.A07;
        if (f == -1.0f) {
            f = AnonymousClass5YI.A00(context);
            r3.A07 = f;
        }
        float A002 = r3.A00(context);
        float A013 = AnonymousClass5YI.A01(context, 20.0f);
        double A022 = A02(A012 / 2.0f);
        float f2 = A013 / 2.0f;
        return new C157467iL(A08[0] + A02(f2), A08[1] - A022, A02(f2 + A002 + f) + A08[0], A08[1] + A022);
    }

    public final double[] A08(C108975ds r5) {
        double[] dArr = this.A07;
        dArr[0] = C106725a3.A01(r5.A01);
        dArr[1] = C106725a3.A00(r5.A00);
        return dArr;
    }

    public AnonymousClass5ZH(C110885hC r3) {
        this.A02 = r3;
        this.A03 = new AnonymousClass5X3();
        Context context = r3.A0P;
        this.A01 = context;
        this.A05 = AnonymousClass001.A0t();
        this.A00 = AnonymousClass5YI.A01(context, 80.0f);
    }

    public static final void A00(List list, Set set) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (set.contains(listIterator.next())) {
                listIterator.remove();
            }
        }
    }

    public final C157467iL A06(C109075e2 r13, double d) {
        double[] A08 = A08(r13.BBX());
        double A022 = A02(AnonymousClass5YI.A01(this.A01, 20.0f) / 2.0f);
        double d2 = A08[0];
        double d3 = A08[1];
        return new C157467iL((d2 - A022) - d, (d3 - A022) - d, d2 + A022 + d, d3 + A022 + d);
    }

    public final Set A07(C157467iL r11, C109075e2 r12, Set set) {
        HashSet A0K = AnonymousClass002.A0K();
        Double d = r12.A0B.A05;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass8Le r3 = (AnonymousClass8Le) it.next();
            C109075e2 r6 = (C109075e2) r3.A03;
            Double d2 = r6.A0B.A05;
            if (!this.A06.contains(r6) || d == null || d2 == null || d2.doubleValue() > d.doubleValue()) {
                C157467iL A062 = A06(r6, 0.0d);
                C157467iL r1 = null;
                if (r6.A0A) {
                    if (r6.A08 == 2) {
                        r1 = A05(r6);
                    } else {
                        r1 = A04(r6);
                    }
                }
                if (A01(r11, A062) || A01(r11, r1)) {
                    A0K.add(r3);
                }
            }
        }
        return A0K;
    }
}
