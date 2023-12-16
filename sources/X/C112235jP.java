package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5jP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112235jP implements C181948nc {
    public final /* synthetic */ AnonymousClass5TI A00;
    public final /* synthetic */ C112305jW A01;

    public final void BZM() {
        int i;
        C112305jW r4 = this.A01;
        AnonymousClass5TI r3 = this.A00;
        C158367jr r2 = r3.A00;
        AnonymousClass5HK r26 = r4.A07;
        AnonymousClass5ZO BCV = r4.A0D.BCV();
        C626936e.A06(BCV);
        String str = r3.A02;
        C108965dr r24 = r2.A00;
        C626936e.A06(r24);
        List list = r2.A01;
        C118175t7 r0 = new C118175t7(r2, r4);
        C18260x0.A0P(BCV, r24);
        Double d = BCV.A04;
        C626936e.A06(d);
        C162457s7.A0D(d);
        double doubleValue = d.doubleValue();
        Double d2 = BCV.A05;
        C626936e.A06(d2);
        C162457s7.A0D(d2);
        C108975ds A002 = C108975ds.A00(doubleValue, d2.doubleValue());
        ArrayList A0s = AnonymousClass001.A0s();
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw C18280x3.A0X();
            }
            C109055e0 r22 = (C109055e0) next;
            if (i2 < r24.A02 && r22.A00 <= r24.A00) {
                A0s.add(next);
            }
            i2 = i3;
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C109055e0 r23 = (C109055e0) it.next();
            r23.A05 = r23.A04;
        }
        list.clear();
        ArrayList arrayList = r24.A04;
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C86624Kv.A1R(it2.next(), A0r);
        }
        Iterator it3 = A0s.iterator();
        while (it3.hasNext()) {
            C109055e0 r7 = (C109055e0) it3.next();
            Iterator it4 = arrayList.iterator();
            int i4 = 0;
            while (true) {
                if (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        throw C18280x3.A0X();
                    }
                    C108825dc r8 = (C108825dc) next2;
                    C162457s7.A0J(r7, 0);
                    double d3 = r7.A00;
                    if (d3 >= ((double) r8.A01) && d3 < ((double) r8.A00)) {
                        r7.A02 = i4;
                        List list2 = (List) A0r.get(r8);
                        if (list2 != null) {
                            list2.add(r7);
                        }
                    }
                    i4 = i5;
                }
            }
        }
        ArrayList A0c = C73783g4.A0c(arrayList);
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            List list3 = (List) A0r.get(it5.next());
            if (list3 != null) {
                i = list3.size();
            } else {
                i = 0;
            }
            C18270x1.A1K(A0c, i);
        }
        C157107hk r12 = C157107hk.A00;
        double d4 = r24.A00;
        double d5 = d4 * -1.0d;
        double d6 = A002.A00;
        double d7 = (double) 111132;
        double d8 = A002.A01;
        C108975ds A003 = r12.A00(C108975ds.A00(d6 + (d5 / d7), d8), d5);
        C108975ds A004 = r12.A00(C108975ds.A00(d6 + (d4 / d7), d8), d4);
        double d9 = A003.A00;
        double d10 = A003.A01;
        double d11 = A004.A00;
        double d12 = A004.A01;
        ArrayList A0I = AnonymousClass002.A0I(A0r.size());
        Iterator A0q = AnonymousClass000.A0q(A0r);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            C108825dc r19 = (C108825dc) A0w.getKey();
            LinkedHashMap A0r2 = C18320x8.A0r();
            for (C109055e0 r10 : (Iterable) A0w.getValue()) {
                C108975ds A005 = C108975ds.A00(r10.A07, r10.A08);
                int i6 = r19.A03;
                double d13 = A005.A00;
                if (d9 <= d13 && d13 < d11) {
                    double d14 = A005.A01;
                    if (d10 <= d14 && d14 < d12) {
                        double d15 = (double) i6;
                        double floor = d15 * Math.floor((d13 - d9) / ((d11 - d9) / d15));
                        Integer valueOf = Integer.valueOf((int) (floor + Math.floor((d14 - d10) / ((d12 - d10) / d15))));
                        if (valueOf != null) {
                            if (A0r2.get(valueOf) == null) {
                                C86624Kv.A1R(valueOf, A0r2);
                            }
                            List list4 = (List) A0r2.get(valueOf);
                            if (list4 != null) {
                                list4.add(r10);
                            }
                        }
                    }
                }
            }
            AnonymousClass3Z6.A03(r19, A0r2, A0I);
        }
        Map A0B = C73813g7.A0B(A0I);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator A0q2 = AnonymousClass000.A0q(A0B);
        while (A0q2.hasNext()) {
            Iterator A0q3 = AnonymousClass000.A0q((Map) AnonymousClass0x2.A0W(A0q2));
            while (A0q3.hasNext()) {
                A0s2.add(AnonymousClass0x2.A0W(A0q3));
            }
        }
        AnonymousClass5HK r02 = r26;
        C105705Wb r32 = r02.A01;
        AnonymousClass5TO r03 = r02.A00;
        AnonymousClass5ZO r25 = r03.A00;
        if (r25 == null) {
            r25 = r03.A01();
        }
        AnonymousClass5ZO r6 = r25;
        r32.A00(new AnonymousClass5T3(r6, new C112255jR(r26, r24, A0c, A0B, r0), Double.valueOf(0.0d), str, A0s2, 2));
    }

    public /* synthetic */ C112235jP(AnonymousClass5TI r1, C112305jW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
