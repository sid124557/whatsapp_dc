package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5WO  reason: invalid class name */
public final class AnonymousClass5WO {
    public static final AnonymousClass5WO A00 = new AnonymousClass5WO();

    public final void A00(C110885hC r17, List list, boolean z) {
        double d;
        double d2;
        C110885hC r11 = r17;
        C106725a3 r6 = r11.A0S;
        C108995du r7 = r6.A06().A04;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (r7.A02((C108975ds) next)) {
                A0s.add(next);
            }
        }
        if (A0s.size() != list.size()) {
            C108975ds A002 = r7.A00();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r7 = r7.A01((C108975ds) it.next());
            }
            C162457s7.A0H(A002);
            C108975ds r0 = r7.A00;
            C108975ds r9 = r7.A01;
            double d3 = A002.A00;
            double abs = Math.abs(d3 - r0.A00);
            double abs2 = Math.abs(r9.A00 - d3);
            if (abs > abs2) {
                d = d3 - abs;
            } else {
                d = d3 + abs2;
            }
            double d4 = A002.A01;
            C108995du A01 = r7.A01(C108975ds.A00(d, d4));
            C162457s7.A0H(A01);
            C108975ds r2 = A01.A00;
            C108975ds r14 = A01.A01;
            double abs3 = Math.abs(d4 - r2.A01);
            double abs4 = Math.abs(r14.A01 - d4);
            if (abs3 > abs4) {
                d2 = d4 - abs3;
            } else {
                d2 = d4 + abs4;
            }
            C108995du A012 = A01.A01(C108975ds.A00(d3, d2));
            C162457s7.A0H(A012);
            C108975ds r22 = A012.A00;
            C108975ds r10 = A012.A01;
            float A02 = (float) AnonymousClass5YI.A02(r11.A0P);
            float f = r11.A02().A02;
            double d5 = (double) (A02 / (((float) ((1 << ((int) f)) * r6.A00.A0O)) * ((f % 1.0f) + 1.0f)));
            double A013 = C106725a3.A01(r22.A01);
            double A003 = C106725a3.A00(r22.A00);
            C108995du A014 = A012.A01(C108975ds.A00(C106725a3.A02(C106725a3.A00(r10.A00) + d5), ((C106725a3.A01(r10.A01) - d5) * 360.0d) - 180.0d)).A01(C108975ds.A00(C106725a3.A02(A003 - d5), ((A013 + d5) * 360.0d) - 180.0d));
            AnonymousClass7UM r23 = new AnonymousClass7UM();
            r23.A07 = A014;
            r23.A06 = A002;
            if (z) {
                r11.A0B(r23, (C183698qT) null, 150);
            } else {
                r11.A0A(r23);
            }
        }
    }
}
