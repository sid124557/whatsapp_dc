package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5jR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112255jR implements C181948nc {
    public final /* synthetic */ AnonymousClass5HK A00;
    public final /* synthetic */ C108965dr A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ AnonymousClass4GR A04;

    public final void BZM() {
        C108965dr r11 = this.A01;
        List list = this.A02;
        Map map = this.A03;
        AnonymousClass4GR r5 = this.A04;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (true) {
            int i = 0;
            if (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                Iterator A0q2 = AnonymousClass000.A0q((Map) A0w.getValue());
                while (true) {
                    if (A0q2.hasNext()) {
                        List list2 = (List) AnonymousClass0x2.A0W(A0q2);
                        Iterator it = ((C108825dc) A0w.getKey()).A04.iterator();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i4 = i2 + 1;
                                if (i2 < 0) {
                                    throw C18280x3.A0X();
                                }
                                C165987xx r2 = (C165987xx) next;
                                if (i3 < list2.size()) {
                                    ArrayList arrayList = r11.A03;
                                    float A05 = AnonymousClass001.A05(C86654Ky.A0j(arrayList, r2.A00));
                                    float A052 = AnonymousClass001.A05(C86654Ky.A0j(arrayList, AnonymousClass001.A0C(i2, ((C108825dc) A0w.getKey()).A02, 0)));
                                    C175698Zj A022 = C175708Zk.A02(i3, C86654Ky.A06(list2, r2.A01));
                                    int i5 = A022.A00;
                                    int i6 = A022.A01;
                                    if (i5 <= i6) {
                                        while (true) {
                                            A0s.add(new C109075e2((C109055e0) list2.get(i5), A05, A052, false));
                                            if (i5 == i6) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    i3 = A022.A01 + 1;
                                }
                                i2 = i4;
                            }
                        }
                    }
                }
            } else {
                List A0q3 = C86654Ky.A0q(A0s, 20);
                for (Object next2 : A0q3) {
                    int i7 = i + 1;
                    if (i < 0) {
                        throw C18280x3.A0X();
                    }
                    ((C109075e2) next2).A0B.A01 = i7;
                    i = i7;
                }
                r5.invoke(A0q3, list);
                return;
            }
        }
    }

    public /* synthetic */ C112255jR(AnonymousClass5HK r1, C108965dr r2, List list, Map map, AnonymousClass4GR r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
        this.A03 = map;
        this.A04 = r5;
    }
}
