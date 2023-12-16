package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5jV  reason: invalid class name and case insensitive filesystem */
public class C112295jV implements C184178rN {
    public final /* synthetic */ C112305jW A00;

    public C112295jV(C112305jW r1) {
        this.A00 = r1;
    }

    public void BNq(List list, int i) {
        C112305jW r6 = this.A00;
        AnonymousClass5TI r5 = r6.A0B.A05;
        if (r5 != null) {
            AnonymousClass5WC r4 = r6.A0G;
            int i2 = 0;
            while (true) {
                List list2 = r4.A04;
                if (i2 < list2.size()) {
                    C109065e1 r1 = (C109065e1) list2.get(i2);
                    if (list.contains(r1.A0E)) {
                        C109065e1 A01 = C109065e1.A01(r1);
                        A01.A01 = 2;
                        list2.set(i2, A01);
                    }
                    i2++;
                } else {
                    List list3 = r5.A09;
                    list3.clear();
                    list3.addAll(list2);
                    r6.A0A();
                    return;
                }
            }
        }
    }

    public void BNr(Map map) {
        C112305jW r5 = this.A00;
        C162457s7.A0J(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass8UG.A0I(map.size()));
        Iterator A16 = AnonymousClass0x9.A16(map);
        while (A16.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A16);
            Object key = A0w.getKey();
            String str = ((C109065e1) A0w.getValue()).A0F;
            C162457s7.A0C(str);
            List list = ((C109065e1) A0w.getValue()).A05;
            if (list == null) {
                list = C72023d3.A00;
            }
            List list2 = ((C109065e1) A0w.getValue()).A06;
            if (list2 == null) {
                list2 = C72023d3.A00;
            }
            linkedHashMap.put(key, new AnonymousClass7ZB(str, ((C109065e1) A0w.getValue()).A04, list, list2));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AnonymousClass8UG.A0I(linkedHashMap.size()));
        Iterator A162 = AnonymousClass0x9.A16(linkedHashMap);
        while (A162.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A162);
            linkedHashMap2.put(((AnonymousClass7ZB) A0w2.getValue()).A00, A0w2.getValue());
        }
        r5.BME(linkedHashMap2);
    }
}
